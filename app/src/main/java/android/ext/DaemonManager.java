package android.ext;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0391d0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import p175w1.C2101m0;

/* loaded from: classes.dex */
public class DaemonManager {
    public static final byte CLIENT = 0;
    public static final String LABEL = "android-daemon";
    public static final int MAX_PATH_SIZE = 4000;
    public static final String ROOT_OK = "root-ok";
    private static final int SIGBUS = 7;
    private static final int SIGKILL = 9;
    private static final int SIGKILL_OOM = 137;
    private static final int SIGTERM = 15;
    public static final long TIME_JUMP_MUL = 1000000000;
    public static final int TIME_JUMP_MUL_INT = 1000;
    public static volatile boolean bypassDaemonFail = false;
    public static volatile boolean lastSearchFuzzy = false;
    static Proc sProcess = null;
    public static volatile boolean warnAboutLags = false;
    private static final List<Runnable> waitForDaemonStart = new ArrayList();
    private static boolean waitForDaemon = true;
    static volatile String lastReadError = null;
    private static volatile String lastSendError = null;
    static Exchanger<byte[]> mMemItemExchanger = new Exchanger<>();
    public static final InOut inOut = new InOut();
    public Proc mProcess = null;
    private volatile boolean needCancel = false;
    public volatile int daemonPid = -1;
    volatile int suPid = -1;
    public volatile String daemonName = "???";
    private volatile int countFuzzyEqualRun = 0;
    private volatile int countFuzzyEqualRunMax = 0;
    private volatile long fuzzyEqualMemoryFrom = 0;
    private volatile long fuzzyEqualMemoryTo = -1;
    public Thread mReaderThread = new DaemonThread("mReaderThread") { // from class: android.ext.DaemonManager.1
        private void handleMemoryItem(byte[] bArr) {
            try {
                Exchanger<byte[]> exchanger = DaemonManager.mMemItemExchanger;
                while (!Thread.interrupted()) {
                    try {
                        exchanger.exchange(bArr, 500L, TimeUnit.MILLISECONDS);
                        return;
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (Throwable th) {
                android.util.Log.e("handleMemoryItem failed", th.getMessage());
            }
        }

        private void postMessage(final byte[] bArr) {
            if (bArr[0] == 20 && bArr[1] == 0) {
                handleMemoryItem(bArr);
            } else {
                C2101m0.f9540a[0].post(new Runnable() { // from class: android.ext.DaemonManager.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            DaemonManager.this.processMessage(bArr);
                        } catch (IOException e7) {
                            android.util.Log.e("postMessage", e7.getMessage());
                        }
                    }
                });
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.util.Log.e("xc", "开始运行");
            InOut inOut2 = DaemonManager.inOut;
            while (!Thread.interrupted()) {
                try {
                    byte[] readPacket = inOut2.readPacket();
                    DaemonManager.lastReadError = null;
                    android.util.Log.e("xc", "开始运行");
                    if (readPacket != null) {
                        postMessage(readPacket);
                        android.util.Log.e("xc", "结束运行");
                    }
                } catch (Throwable th) {
                    DaemonManager.lastReadError = th.toString();
                    C2101m0.f9540a[0].post(new Runnable() { // from class: android.ext.DaemonManager.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C0391d0.m1370q("守护进程线程:" + th.getMessage(), false);
                        }
                    });
                    return;
                }
            }
        }
    };

    /* renamed from: M */
    private volatile int f147M = 1;

    /* renamed from: N */
    private volatile int f148N = 1;
    private volatile long timeJump = 0;
    private final ArrayList<Object> waitAlter = new ArrayList<>();
    long prevConfigCrc = 0;
    private Integer oldDataInRam = null;

    public static class Proc {
        public Process process;
        public InputStream stderr;
        public OutputStream stdin;
        public InputStream stdout;
    }

    private static boolean checkDaemon(Proc proc, File file) {
        String str;
        String message;
        boolean z6 = false;
        if (proc == null || proc.process == null) {
            return false;
        }
        InputStream inputStream = proc.stdout;
        if (checkInputStream(proc.stderr, "android-daemon err") && checkInputStream(inputStream, "android-daemon out")) {
            z6 = true;
        }
        if (!z6) {
            return z6;
        }
        int read = inputStream.read();
        if (read == 49 || read == 48) {
            inputStream.read();
        }
        if (read == 49) {
            try {
                OutputStream outputStream = proc.stdin;
                FileInputStream fileInputStream = new FileInputStream(new File(file, "o"));
                FileInputStream fileInputStream2 = new FileInputStream(new File(file, "e"));
                proc.stdin = new FileOutputStream(new File(file, "i"));
                proc.stdout = fileInputStream;
                proc.stderr = fileInputStream2;
                outputStream.write(89);
                outputStream.write(10);
                outputStream.flush();
                InOut.fifo = true;
                return z6;
            } catch (Throwable th) {
                str = "checkDaemon1";
                message = th.getMessage();
            }
        } else {
            if (read == 48) {
                return z6;
            }
            message = "Odd fifo: " + read;
            str = "checkDaemon2";
        }
        android.util.Log.e(str, message);
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r11 = "Fail: '" + r12 + "' " + r4 + " '" + new java.lang.String(r2, 0, r4) + '\'';
        android.ext.RootDetector.debug = java.lang.String.valueOf(android.ext.RootDetector.debug) + r11 + '\n';
        android.util.Log.e("checkInputStream3", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean checkInputStream(java.io.InputStream r11, java.lang.String r12) {
        /*
            byte[] r0 = r12.getBytes()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = "Start: "
            java.lang.String r3 = r3.concat(r12)
            java.lang.String r4 = "checkInputStream1"
            android.util.Log.e(r4, r3)
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            int r6 = r11.read()
            r7 = -1
            r8 = 10
            if (r6 != r7) goto L20
            goto L81
        L20:
            byte r6 = (byte) r6
            if (r4 < r1) goto L24
            goto L81
        L24:
            int r7 = r4 + 1
            r2[r4] = r6
            r4 = r0[r5]
            if (r6 != r4) goto L3e
            int r5 = r5 + 1
            int r4 = r0.length
            if (r5 != r4) goto L3f
            java.lang.String r11 = "Good: "
            java.lang.String r11 = r11.concat(r12)
            java.lang.String r12 = "checkInputStream2"
            android.util.Log.e(r12, r11)
            r11 = 1
            return r11
        L3e:
            r5 = 0
        L3f:
            int r4 = r11.available()
            if (r4 != 0) goto L5b
            r4 = 0
        L46:
            r6 = 30
            if (r4 >= r6) goto L5b
            r9 = 100
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L50
            goto L51
        L50:
        L51:
            int r6 = r11.available()
            if (r6 == 0) goto L58
            goto L5b
        L58:
            int r4 = r4 + 1
            goto L46
        L5b:
            int r4 = r11.available()
            if (r4 != 0) goto Lc9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = android.ext.RootDetector.debug
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.append(r0)
            java.lang.String r0 = "No more data: "
            r11.append(r0)
            r11.append(r7)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            android.ext.RootDetector.debug = r11
            r4 = r7
        L81:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r2, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fail: '"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = "' "
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = " '"
            r0.append(r12)
            r0.append(r11)
            r11 = 39
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = android.ext.RootDetector.debug
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            r12.append(r11)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            android.ext.RootDetector.debug = r12
            java.lang.String r12 = "checkInputStream3"
            android.util.Log.e(r12, r11)
            return r3
        Lc9:
            r4 = r7
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.DaemonManager.checkInputStream(java.io.InputStream, java.lang.String):boolean");
    }

    private String[] getExec(boolean z6, String str, File file) {
        String[] strArr = new String[5];
        strArr[0] = str;
        strArr[1] = Tools.getPackageName();
        strArr[2] = file.getAbsolutePath();
        strArr[3] = getNativeCheck();
        strArr[4] = Config.vSpace ? "1" : "0";
        if (z6) {
            return strArr;
        }
        StringBuilder sb = new StringBuilder("exec");
        for (int i7 = 0; i7 < 5; i7++) {
            String str2 = strArr[i7];
            sb.append(' ');
            sb.append(str2);
        }
        return new String[]{sb.toString()};
    }

    public static String getNativeCheck() {
        return Hash.hash("96", "S!H!A!-!3!8!4".replace("!", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isProcessValid() {
        Process process;
        Integer num;
        Proc proc = sProcess;
        if (proc != null && (process = proc.process) != null) {
            try {
                num = Integer.valueOf(process.exitValue());
            } catch (IllegalThreadStateException unused) {
                num = null;
            }
            if (num == null && lastSendError == null && lastReadError == null) {
                return true;
            }
        }
        return false;
    }

    public static String system(String str) {
        String str2;
        File file;
        String str3;
        String str4;
        String str5 = str;
        try {
            File file2 = new File(str5);
            String str6 = null;
            if (!file2.exists() || !file2.canExecute()) {
                return null;
            }
            String name = file2.getName();
            String str7 = "/sbin";
            String[] strArr = {"/system/bin", "/system/xbin", "/sbin/.magisk/mirror/data", "/sbin/.magisk/modules", "/sbin"};
            for (int i7 = 0; i7 < 5; i7++) {
                File file3 = new File(strArr[i7], name);
                if (file3.exists() && file3.canExecute() && file2.length() == file3.length()) {
                    return file3.getAbsolutePath();
                }
            }
            String str8 = "\n";
            String[] split = RootDetector.runCmd("exec mount", 10).split("\n");
            int length = split.length;
            String str9 = null;
            String str10 = null;
            int i8 = 0;
            while (i8 < length) {
                File file4 = file2;
                String str11 = str6;
                String str12 = str8;
                String str13 = str7;
                String str14 = str5;
                String str15 = split[i8];
                if (str15 == null || !str15.contains(" /system ")) {
                    i8++;
                } else {
                    for (String str16 : str15.trim().split(" ")) {
                        String trim = str16.trim();
                        if (!"on".equals(trim) && !"type".equals(trim) && !"/system".equals(trim)) {
                            if (str9 == null) {
                                str9 = trim;
                            } else {
                                str11 = trim;
                            }
                        }
                    }
                }
                str6 = str11;
                str7 = str13;
                file2 = file4;
                str10 = null;
                str5 = str14;
                str8 = str12;
            }
            if (str9 == null) {
                return str10;
            }
            StringBuilder sb = new StringBuilder();
            String[] strArr2 = {"rw", "ro"};
            int i9 = 0;
            while (true) {
                String str17 = "cp -f ";
                str2 = str7;
                file = file2;
                if (i9 >= 2) {
                    break;
                }
                String str18 = strArr2[i9];
                String[] strArr3 = strArr2;
                String str19 = str8;
                int i10 = i9;
                String str20 = "; chmod 0755 ";
                String[] strArr4 = {"", "/system/bin/", "/system/xbin/", "/system/sbin/"};
                int i11 = 0;
                while (i11 < 4) {
                    String str21 = strArr4[i11];
                    String[] strArr5 = strArr4;
                    String[] strArr6 = {String.valueOf(str18).concat(",remount"), C0089a.m208f("remount,", str18)};
                    int i12 = 0;
                    while (true) {
                        int i13 = 2;
                        if (i12 < 2) {
                            String str22 = str17;
                            String str23 = strArr6[i12];
                            String[] strArr7 = strArr6;
                            String[] strArr8 = new String[2];
                            strArr8[1] = str6;
                            String str24 = str6;
                            int i14 = 0;
                            while (i14 < i13) {
                                String str25 = strArr8[i14];
                                sb.append(str21);
                                String str26 = str21;
                                sb.append("mount -o ");
                                sb.append(str23);
                                if (str25 != null) {
                                    sb.append(" -t ");
                                    sb.append(str25);
                                }
                                sb.append(" ");
                                sb.append(str9);
                                sb.append(" /system; ");
                                i14++;
                                i13 = 2;
                                str21 = str26;
                            }
                            i12++;
                            str17 = str22;
                            strArr6 = strArr7;
                            str6 = str24;
                        }
                    }
                    i11++;
                    strArr4 = strArr5;
                }
                String str27 = str6;
                String str28 = str17;
                sb.append("blockdev --set");
                sb.append(str18);
                sb.append(" ");
                sb.append(str9);
                sb.append("; ");
                if (str18.equals("rw")) {
                    int i15 = 0;
                    while (i15 < 5) {
                        String str29 = strArr[i15];
                        if (str29.startsWith("/system")) {
                            File file5 = new File(str29, name);
                            str4 = str28;
                            sb.append(str4);
                            sb.append(str);
                            sb.append(" ");
                            sb.append(file5.getAbsolutePath());
                            str3 = str20;
                            sb.append(str3);
                            sb.append(file5.getAbsolutePath());
                            sb.append("; ");
                        } else {
                            str3 = str20;
                            str4 = str28;
                        }
                        i15++;
                        str28 = str4;
                        str20 = str3;
                    }
                }
                i9 = i10 + 1;
                str5 = str;
                str7 = str2;
                file2 = file;
                strArr2 = strArr3;
                str8 = str19;
                str6 = str27;
            }
            String str30 = str8;
            String str31 = str5;
            sb.append("exit");
            String sb2 = sb.toString();
            String str32 = String.valueOf(sb2) + str30 + RootDetector.runCmd(sb2, 15);
            for (int i16 = 0; i16 < 5; i16++) {
                File file6 = new File(strArr[i16], name);
                if (file6.exists() && file6.canExecute() && file.length() == file6.length()) {
                    return file6.getAbsolutePath();
                }
            }
            android.util.Log.e("sys", "Failed remount 1 " + str31 + str30 + str32);
            StringBuilder sb3 = new StringBuilder();
            int i17 = 0;
            while (i17 < 5) {
                String str33 = strArr[i17];
                String str34 = str2;
                if (str33.startsWith(str34)) {
                    File file7 = new File(str33, name);
                    sb3.append("cp -f ");
                    sb3.append(str31);
                    sb3.append(" ");
                    sb3.append(file7.getAbsolutePath());
                    sb3.append("; chmod 0755 ");
                    sb3.append(file7.getAbsolutePath());
                    sb3.append("; ");
                }
                i17++;
                str2 = str34;
            }
            String str35 = str2;
            sb3.append("exit");
            String sb4 = sb3.toString();
            String str36 = String.valueOf(sb4) + str30 + RootDetector.runCmd(sb4, 15);
            for (int i18 = 0; i18 < 5; i18++) {
                String str37 = strArr[i18];
                if (str37.startsWith(str35)) {
                    File file8 = new File(str37, name);
                    if (file8.exists() && file8.canExecute() && file.length() == file8.length()) {
                        return file8.getAbsolutePath();
                    }
                }
            }
            android.util.Log.e("system", "Failed remount 3 " + str31 + str30 + str36);
            return null;
        } catch (Throwable unused) {
            android.util.Log.e("sys0", "Failed remount 4 " + str5 + "\nnull");
            return "出错了";
        }
    }

    public void checkBinary(String str, boolean z6) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.exec(new String[]{"ls", "-l", Tools.getRealPath(str)}).getInputStream()));
                android.util.Log.e("checkBinary1", "ls for '" + str + "' got: " + bufferedReader.readLine());
                bufferedReader.close();
            } catch (Exception e7) {
                android.util.Log.e("checkBinary2", e7.getMessage());
            }
            file.canExecute();
        }
    }

    public void getAppList() {
        getAppList((byte) 0);
    }

    public void getAppList(byte b7) {
        send(b7, (byte) 57);
    }

    public int getDaemonPid() {
        return this.daemonPid;
    }

    public void getMem() {
        getMem((byte) 0);
    }

    public void getMem(byte b7) {
        send(b7, (byte) 58);
    }

    public void getMemory(final byte b7, final long j7, final int i7) {
        C2101m0.m5155a(3, new Runnable() { // from class: android.ext.DaemonManager.4
            @Override // java.lang.Runnable
            public void run() {
                InOut inOut2 = DaemonManager.inOut;
                DaemonManager.this.send(b7, (byte) 58);
                inOut2.startMessage(b7, (byte) 59, 0);
                inOut2.writeLong(j7);
                inOut2.writeInt(i7);
                DaemonManager.this.send();
            }
        });
    }

    public void getMemory(long j7, int i7) {
        getMemory((byte) 0, j7, i7);
    }

    public void getProcessList() {
        getProcessList((byte) 0);
    }

    public void getProcessList(byte b7) {
        send(b7, (byte) 56);
    }

    public void getRegionList() {
        getRegionList((byte) 0);
    }

    public void getRegionList(byte b7) {
        send(b7, (byte) 60);
    }

    public int getSuPid() {
        return this.suPid;
    }

    public void messageFailed() {
    }

    @SuppressLint({"LongLogTag"})
    public void processMessage(byte[] bArr) {
        try {
            BufferReader bufferReader = new BufferReader(bArr);
            byte readByte = bufferReader.readByte();
            bufferReader.readByte();
            switch (readByte) {
                case 16:
                    break;
                case 17:
                    bufferReader.readLong();
                    bufferReader.readLong();
                    bufferReader.readInt();
                    break;
                case 18:
                case 19:
                case 21:
                case 22:
                    break;
                case 20:
                default:
                    android.util.Log.w("Unknown message: ", ((int) readByte) + ", size: " + bArr.length);
                    break;
                case 23:
                    break;
                case 24:
                    ProcessList.loadData(bufferReader);
                    break;
                case 25:
                case 26:
                case 27:
                    break;
                case 28:
                    bufferReader.readInt();
                    int readByte2 = bufferReader.readByte();
                    int[] iArr = readByte2 > 0 ? new int[readByte2] : null;
                    for (int i7 = 0; i7 < readByte2; i7++) {
                        iArr[i7] = bufferReader.readInt();
                    }
                    break;
                case 29:
                    break;
                case 30:
                    int i8 = (bufferReader.readInt() == 1 ? 19 : 44) * 4;
                    boolean[] zArr = new boolean[i8];
                    for (int i9 = 0; i9 < i8; i9++) {
                        zArr[i9] = bufferReader.readByte() != 0;
                    }
                    break;
                case 31:
                    bufferReader.readLong();
                    break;
            }
        } catch (BufferUnderflowException e7) {
            android.util.Log.e("Failed process message: 0, size: ", bArr.length + e7.getMessage());
        }
    }

    public void send() {
        InOut inOut2 = inOut;
        if (lastSendError != null) {
            inOut2.clear();
            return;
        }
        try {
            inOut2.send();
            lastSendError = null;
        } catch (Throwable th) {
            inOut2.clear();
            lastSendError = th.toString();
            C2101m0.f9540a[0].post(new Runnable() { // from class: android.ext.DaemonManager.6
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }

    public void start() {
        new DaemonThread("DaemonLoader") { // from class: android.ext.DaemonManager.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String daemonPath = DaemonLoader.getDaemonPath();
                final DaemonManager daemonManager = DaemonManager.this;
                Proc startDaemon = daemonManager.startDaemon(daemonPath);
                daemonManager.mProcess = startDaemon;
                InOut inOut2 = DaemonManager.inOut;
                inOut2.setStreams(startDaemon.stdout, startDaemon.stdin);
                boolean z6 = true;
                inOut2.setStarted(true);
                android.util.Log.e("1212121212121", "长度" + inOut2.crc());
                try {
                    byte[] readPacket = inOut2.readPacket();
                    if (readPacket == null) {
                        android.util.Log.d("DI: null", "null");
                    } else if (readPacket.length != 7) {
                        android.util.Log.d("DI: ", "长度" + readPacket.length);
                    } else {
                        BufferReader bufferReader = new BufferReader(readPacket);
                        byte readByte = bufferReader.readByte();
                        if (readByte != 8) {
                            z6 = false;
                        }
                        InOut.setX64(z6);
                        byte readByte2 = bufferReader.readByte();
                        if (readByte2 != 4) {
                            android.util.Log.e("DI: QE ", ((int) readByte2) + "");
                        }
                        daemonManager.daemonPid = bufferReader.readInt();
                        android.util.Log.d("DI: " + ((int) readByte), " " + ((int) readByte2) + " " + daemonManager.daemonPid);
                    }
                    daemonManager.mReaderThread.start();
                } catch (IOException e7) {
                    android.util.Log.e("进程出错了", e7.getMessage());
                }
                android.util.Log.e("进程", "pid" + daemonManager.getDaemonPid() + "uid" + daemonManager.getSuPid());
                C2101m0.f9540a[0].post(new Runnable() { // from class: android.ext.DaemonManager.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0391d0.m1370q("守护进程线程:pid" + daemonManager.getDaemonPid(), true);
                    }
                });
            }
        }.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        checkBinary(r14, r5);
        java.lang.Thread.sleep(1000);
        r14 = java.lang.String.valueOf(android.ext.RootDetector.debug) + android.ext.RootDetector.getInfo(r8);
        android.ext.RootDetector.debug = r14;
        android.util.Log.e("startDaemon5", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.ext.DaemonManager.Proc startDaemon(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.DaemonManager.startDaemon(java.lang.String):android.ext.DaemonManager$Proc");
    }

    public void send(final byte b7, final byte b8) {
        C2101m0.m5155a(3, new Runnable() { // from class: android.ext.DaemonManager.5
            @Override // java.lang.Runnable
            public void run() {
                DaemonManager.inOut.startMessage(b7, b8, 0);
                DaemonManager.this.send();
            }
        });
    }
}
