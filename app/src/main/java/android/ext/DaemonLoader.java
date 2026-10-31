package android.ext;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.lang.ProcessBuilder;
import android.system.ErrnoException;
import android.system.Os;
import androidx.appcompat.app.DialogInterfaceC0151d;
import com.so.revelation.lua.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p175w1.C2078b;
import p175w1.C2086f;
import p175w1.C2101m0;
import p175w1.RunnableC2082d;

/* loaded from: classes.dex */
public class DaemonLoader {
    private static final int ARCH_ARM = 103;
    private static final int ARCH_ARM_64 = 105;
    private static final int ARCH_ARM_V7A = 104;
    private static final int ARCH_UNKNOWN = 100;
    private static final int ARCH_X86 = 101;
    private static final int ARCH_X86_64 = 102;
    private static final char LIB_ARM = 'a';
    private static final char LIB_ARM64_CLIENT = 'r';
    private static final char LIB_ARM64_PATCH = 'l';
    private static final char LIB_ARM64_PIE = '5';
    private static final char LIB_ARM64_SH = '6';
    private static final char LIB_ARM64_STUB = 'g';
    private static final char LIB_ARM_CLIENT = 't';
    private static final char LIB_ARM_PATCH = 'o';
    private static final char LIB_ARM_PIE = 'b';
    private static final char LIB_ARM_SH = 'd';
    private static final char LIB_ARM_STUB = 'i';
    private static final char LIB_ARM_V7A = '7';
    private static final char LIB_ARM_V7A_CLIENT = 's';
    private static final char LIB_ARM_V7A_PATCH = 'n';
    private static final char LIB_ARM_V7A_PIE = '8';
    private static final char LIB_ARM_V7A_SH = '9';
    private static final char LIB_ARM_V7A_STUB = 'h';
    private static final char LIB_X86 = '0';
    private static final char LIB_X86_64_CLIENT = 'q';
    private static final char LIB_X86_64_PATCH = 'k';
    private static final char LIB_X86_64_PIE = '2';
    private static final char LIB_X86_64_SH = '4';
    private static final char LIB_X86_64_STUB = 'f';
    private static final char LIB_X86_CLIENT = 'p';
    private static final char LIB_X86_PATCH = 'j';
    private static final char LIB_X86_PIE = '1';
    private static final char LIB_X86_SH = '3';
    private static final char LIB_X86_STUB = 'e';
    private static final String LOADER = "0";
    private static volatile int arch = 100;
    private static volatile String dir = null;
    private static boolean fixer = false;
    private static volatile String path = null;
    private static volatile char stub32 = 'i';
    private static volatile char stub64 = 'g';
    private final String DAEMON_PATH = getDaemonPath_();
    public static StringBuilder TESTED = new StringBuilder();
    public static StringBuilder DEBUG = new StringBuilder();

    private static void addFiles(ArrayList<File> arrayList, String str, String str2, boolean z6) {
        File file = new File(str);
        if (!z6 || file.exists()) {
            arrayList.add(new File(String.valueOf(str).concat("/files"), str2));
            arrayList.add(new File(String.valueOf(str).concat("/cache"), str2));
            arrayList.add(new File(String.valueOf(str).concat("/files")));
            arrayList.add(new File(String.valueOf(str).concat("/cache")));
            arrayList.add(file);
        }
    }

    private static void extractLib(char c7) {
        extractLib(Character.toString(c7));
    }

    private static void extractLib(String str) {
        getDaemonDir();
        File file = new File(Tools.getContext().getFilesDir(), libName(str));
        if (file.isFile()) {
            return;
        }
        android.util.Log.e("extractLib1", "Extract file " + file);
        Resources resources = Tools.getContext().getResources();
        int m204i = C0072Re.m204i("chunk" + str, R.raw.class);
        if (m204i == 0) {
            android.util.Log.e("extractLib2", "Nothing extract file " + str + ' ' + file.getAbsolutePath());
            return;
        }
        try {
            byte[] bArr = new byte[8192];
            InputStream openRawResource = resources.openRawResource(m204i);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int read = openRawResource.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    openRawResource.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e7) {
            android.util.Log.e("extractLib3", e7.getMessage());
            android.util.Log.e("extractLib5", "成功 " + str + ' ' + file.getAbsolutePath());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0017. Please report as an issue. */
    private void extractShLibs(char c7) {
        char c8;
        extractLib(c7);
        try {
            if (c7 == '5') {
                extractLib("08");
                extractLib(LIB_ARM64_SH);
                extractLib(LIB_ARM64_STUB);
                stub64 = LIB_ARM64_STUB;
                extractLib(LIB_ARM64_PATCH);
            } else if (c7 != '7' && c7 != '8') {
                if (c7 != 'a' && c7 != 'b') {
                    switch (c7) {
                        case '2':
                            extractLib("01");
                            extractLib(LIB_X86_64_SH);
                            extractLib(LIB_X86_64_STUB);
                            stub64 = LIB_X86_64_STUB;
                            extractLib(LIB_X86_64_PATCH);
                        case '0':
                        case '1':
                            extractLib(LIB_X86_SH);
                            extractLib(LIB_X86_STUB);
                            stub32 = LIB_X86_STUB;
                            c8 = LIB_X86_PATCH;
                            break;
                    }
                    Tools.extractFile(RootDetector.SH_KEY, new File(Tools.getContext().getFilesDir(), "sh.jar"));
                    return;
                }
                extractLib(LIB_ARM_SH);
                extractLib(LIB_ARM_STUB);
                stub32 = LIB_ARM_STUB;
                c8 = LIB_ARM_PATCH;
                extractLib(c8);
                Tools.extractFile(RootDetector.SH_KEY, new File(Tools.getContext().getFilesDir(), "sh.jar"));
                return;
            }
            Tools.extractFile(RootDetector.SH_KEY, new File(Tools.getContext().getFilesDir(), "sh.jar"));
            return;
        } catch (Throwable th) {
            android.util.Log.e("extractShLibs", th.getMessage());
            return;
        }
        extractLib(LIB_ARM_V7A_SH);
        extractLib(LIB_ARM_V7A_STUB);
        stub32 = LIB_ARM_V7A_STUB;
        c8 = LIB_ARM_V7A_PATCH;
        extractLib(c8);
    }

    private int getArch(String str) {
        String message;
        Tools.allowExecute(str);
        int i7 = 100;
        for (int i8 = 0; i8 < 50 && i8 < 2; i8++) {
            try {
                String[] strArr = new String[2];
                strArr[0] = Tools.getRealPath(str);
                strArr[1] = Config.vSpaceReal ? Config.vSpacePkg : "1";
                Process exec = Tools.exec(strArr);
                if (!Tools.waitForTimeout(exec, 30)) {
                    break;
                }
                i7 = exec.exitValue();
            } catch (IOException e7) {
                if (i8 == 0) {
                    try {
                        message = e7.getMessage();
                    } catch (Throwable th) {
                        DEBUG.append(th.toString());
                        android.util.Log.e("getArch", "ls: " + th.getMessage());
                    }
                    if (message != null && message.contains("denied")) {
                        Tools.chmod(str, "0755");
                        android.util.Log.e("getArch1", "ls: " + e7.getMessage());
                    }
                }
            }
        }
        if (Config.vSpace && ((Config.vSpace64 == 1 || (Config.vSpace64 == 0 && Config.vSpacePkg.contains("64"))) && !fixer && (i7 & 127) < 100)) {
            fixer = true;
            try {
                Tools.extractFile("fx", new File(Tools.getSdcardPath(), "gg_fixer.apk"));
                C2101m0.m5155a(0, new Runnable() { // from class: android.ext.DaemonLoader.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DialogInterfaceC0151d.a m5134a = C2078b.m5134a();
                        m5134a.f374a.f347g = "提示进程";
                        m5134a.m486c("确定", new DialogInterface.OnClickListener() { // from class: android.ext.DaemonLoader.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i9) {
                            }
                        });
                        m5134a.m485b("取消", null);
                        C2101m0.m5155a(0, new RunnableC2082d(m5134a));
                    }
                });
            } catch (Throwable unused) {
            }
        }
        return i7;
    }

    public static int getDaemonArch() {
        if (arch == 100) {
            new DaemonLoader();
        }
        return arch;
    }

    public static String getDaemonDir() {
        if (dir == null) {
            File internalDir = getInternalDir();
            if (internalDir == null) {
                internalDir = Tools.getFilesDirHidden();
            }
            dir = makeExecutable(internalDir.getAbsolutePath());
        }
        return dir;
    }

    public static String getDaemonPath() {
        if (path == null) {
            path = new DaemonLoader().DAEMON_PATH;
        }
        return path;
    }

    private String getDaemonPath_() {
        char[] cArr = {0, LIB_X86_64_PIE, LIB_X86_PIE, LIB_ARM64_PIE, LIB_ARM_V7A_PIE, LIB_ARM_PIE, LIB_X86, LIB_ARM_V7A, LIB_ARM};
        String absolutePath = Tools.getContext().getFilesDir().getAbsolutePath();
        int i7 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 >= cArr.length) {
                TESTED.append(';');
                String realPath = Tools.getRealPath(absolutePath);
                String[] strArr = {"ls", "-l", realPath};
                try {
                    DEBUG.append("\n\n");
                    DEBUG.append("ls -l ");
                    DEBUG.append(realPath);
                    DEBUG.append(":\n");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.exec(strArr).getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.contains("lib") && readLine.contains(".so")) {
                            android.util.Log.e("12345678", "ls: " + readLine);
                            DEBUG.append(readLine);
                            DEBUG.append('\n');
                        }
                    }
                    bufferedReader.close();
                } catch (Exception e7) {
                    android.util.Log.e("1234567899", "ls: " + e7.getMessage());
                    DEBUG.append(e7);
                    DEBUG.append('\n');
                }
                DEBUG.append('\n');
                return "no_binary_for_your_arch";
            }
            if (i7 == 0) {
                int i8 = 1;
                while (true) {
                    if (i8 >= cArr.length) {
                        break;
                    }
                    if (new File(absolutePath, libName(cArr[i8])).exists()) {
                        cArr[0] = cArr[i8];
                        break;
                    }
                    i8++;
                }
                if (cArr[0] == 0) {
                    continue;
                    i7++;
                }
            }
            DEBUG.append(cArr[i7]);
            DEBUG.append(": ");
            String str = LOADER + cArr[i7];
            File file = new File(absolutePath, libName(str));
            if (!file.isFile()) {
                extractLib(str);
            }
            if (file.isFile()) {
                TESTED.append(cArr[i7]);
                int arch2 = getArch(file.getAbsolutePath());
                android.util.Log.e("最后的日志", cArr[i7] + "  /" + arch2);
                if (isValid(cArr[i7], arch2)) {
                    if (arch2 != 105 && arch2 != 102) {
                        z6 = false;
                    }
                    InOut.setX64(z6);
                    TESTED = new StringBuilder(0);
                    DEBUG = new StringBuilder(0);
                    String absolutePath2 = new File(absolutePath, libName(cArr[i7])).getAbsolutePath();
                    android.util.Log.e("12345678", "Daemon: " + absolutePath2);
                    arch = arch2;
                    extractShLibs(cArr[i7]);
                    Tools.allowExecute(absolutePath2);
                    return absolutePath2;
                }
                android.util.Log.e("1234567", "getArch " + cArr[i7] + ' ' + arch2);
                DEBUG.append("; ");
                DEBUG.append(arch2);
                DEBUG.append('\n');
            } else {
                DEBUG.append(file);
                DEBUG.append(" NF.\n");
                android.util.Log.e("123456", "Not a file " + file + ' ' + file.getAbsolutePath());
            }
            i7++;
        }
    }

    private static File getInternalDir() {
        File filesDir = Tools.getContext().getFilesDir();
        File cacheDir = Tools.getContext().getCacheDir();
        String hiddenDir = Tools.getHiddenDir();
        ArrayList arrayList = new ArrayList(64);
        arrayList.add(Tools.getFilesDirHidden());
        arrayList.add(Tools.getCacheDirHidden());
        arrayList.add(filesDir);
        arrayList.add(cacheDir);
        arrayList.add(new File(filesDir.getParentFile(), hiddenDir));
        arrayList.add(new File(cacheDir.getParentFile(), hiddenDir));
        arrayList.add(filesDir.getParentFile());
        arrayList.add(cacheDir.getParentFile());
        String absolutePath = filesDir.getAbsolutePath();
        String m220f = absolutePath.startsWith("/data/user/") ? C0090b.m220f(new StringBuilder("/data/user/"), absolutePath.split("/", -1)[3], "/") : "/data/data/";
        if (Config.vSpaceReal) {
            StringBuilder sb = new StringBuilder("/parallel_intl/0/");
            String str = C2086f.f9509a;
            sb.append(str);
            addFiles(arrayList, sb.toString(), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/parallel_lite/0/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/virtual/data/user/0/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/gaia/data/user/0/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/com.vmos.glb/osimg/r/ot01/data/data/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/mopen/data/user/0/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/vbox/data/user/0/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/sandboxdata/", str), hiddenDir, true);
            addFiles(arrayList, C0089a.m208f("/gameplugins/", str), hiddenDir, true);
            addFiles(arrayList, "/Plugin/0/" + str + "/data/" + str, hiddenDir, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(m220f));
            sb2.append(Config.vSpacePkg);
            addFiles(arrayList, sb2.toString(), hiddenDir, false);
        } else {
            addFiles(arrayList, String.valueOf(m220f) + C2086f.f9509a, hiddenDir, false);
            arrayList.add(new File("/data/data"));
            arrayList.add(new File("/data"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    return file;
                }
                try {
                    try {
                        if ((Os.stat(file.getAbsolutePath()).st_mode & 16384) != 0) {
                            return file;
                        }
                    } catch (Exception e7) {
                        android.util.Log.e(e7 instanceof ErrnoException ? "getInternalDir1" : "getInternalDir2", e7.getMessage());
                    }
                } catch (Throwable th) {
                    android.util.Log.e("getInternalDir3", th.getMessage());
                }
            }
        }
        android.util.Log.e("getInternalDir4", "Failed get dir for fix");
        return null;
    }

    public static String getStubLib(boolean z6) {
        StringBuilder sb = new StringBuilder("/lib");
        sb.append(z6 ? stub64 : stub32);
        sb.append(".so");
        return sb.toString();
    }

    public static void initNative() {
        String message;
        String str;
        char[] cArr = {0, LIB_X86_64_CLIENT, LIB_X86_CLIENT, LIB_ARM64_CLIENT, LIB_ARM_V7A_CLIENT, LIB_ARM_CLIENT};
        String daemonDir = getDaemonDir();
        for (int i7 = 0; i7 < cArr.length; i7++) {
            if (i7 == 0) {
                int i8 = 1;
                while (true) {
                    if (i8 >= cArr.length) {
                        break;
                    }
                    if (new File(daemonDir, libName(cArr[i8])).exists()) {
                        cArr[0] = cArr[i8];
                        break;
                    }
                    i8++;
                }
                if (cArr[0] == 0) {
                    continue;
                }
            }
            File file = new File(daemonDir, libName(cArr[i7]));
            if (!file.isFile()) {
                extractLib(cArr[i7]);
            }
            if (file.isFile()) {
                String absolutePath = file.getAbsolutePath();
                android.util.Log.i("initNative", "good a file " + absolutePath);
                try {
                    System.load(absolutePath);
                    try {
                        ProcessBuilder.loaded();
                        return;
                    } catch (Throwable th) {
                        String message2 = th.getMessage();
                        Objects.requireNonNull(message2);
                        android.util.Log.e("initNative1", message2);
                    }
                } catch (Throwable th2) {
                    message = th2.getMessage();
                    Objects.requireNonNull(message);
                    str = "initNative2";
                }
            } else {
                message = "Not a file " + file + ' ' + file.getAbsolutePath();
                str = "initNative错误";
            }
            android.util.Log.e(str, message);
        }
    }

    private boolean isValid(char c7, int i7) {
        if (c7 == '5') {
            return 105 == i7;
        }
        if (c7 == '7') {
            return 104 == i7;
        }
        if (c7 == '8') {
            return 104 == i7;
        }
        if (c7 == 'a') {
            return 103 == i7;
        }
        if (c7 == 'b') {
            return 103 == i7;
        }
        switch (c7) {
            case '0':
                return 101 == i7;
            case '1':
                return 101 == i7;
            case '2':
                return 102 == i7;
            default:
                throw new RuntimeException("Unknown lib: " + c7);
        }
    }

    public static boolean isX86() {
        int daemonArch = getDaemonArch();
        return daemonArch == 101 || daemonArch == 102;
    }

    private static String libName(char c7) {
        return libName(Character.toString(c7));
    }

    private static String libName(String str) {
        return C0091c.m228f("lib", str, ".so");
    }

    private static String makeExecutable(String str) {
        char[] cArr = {LIB_X86, LIB_X86_PIE, LIB_X86_64_PIE, LIB_X86_SH, LIB_X86_64_SH, LIB_ARM64_PIE, LIB_ARM64_SH, LIB_ARM_V7A, LIB_ARM_V7A_PIE, LIB_ARM_V7A_SH, LIB_ARM, LIB_ARM_PIE, LIB_ARM_SH};
        for (int i7 = 0; i7 < 13; i7++) {
            File file = new File(str, libName(cArr[i7]));
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                if (!Tools.allowExecute(absolutePath)) {
                    android.util.Log.e("makeExecutable", "Can not execute " + absolutePath);
                }
            }
        }
        return str;
    }
}
