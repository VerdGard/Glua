package android.ext;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import p175w1.C2101m0;

/* loaded from: classes.dex */
public class Log {
    public static final String BAD_IMPLEMENTATION = "Bad implementation";
    private static final boolean DISABLE_LOG = true;
    private static final long FLUSH_LOG_EVERY_MS = 5000;
    static volatile boolean closed = false;
    private static long lastFlush;
    static volatile BufferedWriter writer;
    static final Runnable flushTask = new Runnable() { // from class: android.ext.Log.1
        @Override // java.lang.Runnable
        public void run() {
            Log.flush(Log.DISABLE_LOG);
        }
    };
    static String LOG_FILE = "/last_run.log";
    public static String lastSearchLog = "- none -";
    static StringBuilder lastSearchLogCurrent = null;

    public static class LogWrapper {
        public static final int MAX_MSG_LEN = 1023;
        public static final int MAX_TAG_LEN = 23;
        private static final boolean OFF = false;

        /* renamed from: d */
        public static int m193d(String str, String str2) {
            return log(2, str, str2, null);
        }

        /* renamed from: d */
        public static int m194d(String str, String str2, Throwable th) {
            return log(3, str, str2, th);
        }

        /* renamed from: e */
        public static int m195e(String str, String str2) {
            return log(9, str, str2, null);
        }

        /* renamed from: e */
        public static int m196e(String str, String str2, Throwable th) {
            return log(10, str, str2, th);
        }

        private static String fixTag(String str) {
            return str == null ? "null" : str.length() > 23 ? str.substring(0, 23) : str;
        }

        /* renamed from: i */
        public static int m197i(String str, String str2) {
            return log(4, str, str2, null);
        }

        /* renamed from: i */
        public static int m198i(String str, String str2, Throwable th) {
            return log(5, str, str2, th);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        
            if (r3 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        
            android.ext.Log.m177e(r6, r2, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        
            if (r3 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (r3 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            if (r3 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        
            if (r3 == r0) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int log(int r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
            /*
                java.lang.String r6 = fixTag(r6)
                if (r7 != 0) goto L8
                java.lang.String r7 = "null"
            L8:
                int r0 = r7.length()
                r1 = 0
                r2 = 0
            Le:
                int r3 = r0 - r2
                r4 = 1023(0x3ff, float:1.434E-42)
                if (r3 <= r4) goto L16
                r3 = 1023(0x3ff, float:1.434E-42)
            L16:
                int r3 = r3 + r2
                java.lang.String r2 = r7.substring(r2, r3)
                java.lang.String r4 = "OOM for Log 1"
                switch(r5) {
                    case 0: goto L43;
                    case 1: goto L40;
                    case 2: goto L3c;
                    case 3: goto L39;
                    case 4: goto L3c;
                    case 5: goto L36;
                    case 6: goto L3c;
                    case 7: goto L33;
                    case 8: goto L2a;
                    case 9: goto L3c;
                    case 10: goto L24;
                    default: goto L20;
                }
            L20:
                android.ext.Log.m176e(r6, r4)
                goto L46
            L24:
                if (r3 != r0) goto L3c
            L26:
                android.ext.Log.m177e(r6, r2, r8)     // Catch: java.lang.OutOfMemoryError -> L3c
                goto L46
            L2a:
                java.lang.String r2 = ""
                android.ext.Log.m177e(r6, r2, r8)     // Catch: java.lang.OutOfMemoryError -> L30
                goto L46
            L30:
                java.lang.String r2 = "OOM for Log 2"
                goto L3c
            L33:
                if (r3 != r0) goto L3c
                goto L26
            L36:
                if (r3 != r0) goto L3c
                goto L26
            L39:
                if (r3 != r0) goto L3c
                goto L26
            L3c:
                android.ext.Log.m176e(r6, r2)
                goto L46
            L40:
                if (r3 != r0) goto L3c
                goto L26
            L43:
                android.ext.Log.m176e(r6, r2)     // Catch: java.lang.OutOfMemoryError -> L20
            L46:
                if (r3 < r0) goto L49
                return r1
            L49:
                r2 = r3
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ext.Log.LogWrapper.log(int, java.lang.String, java.lang.String, java.lang.Throwable):int");
        }

        /* renamed from: v */
        public static int m199v(String str, String str2) {
            return log(0, str, str2, null);
        }

        /* renamed from: v */
        public static int m200v(String str, String str2, Throwable th) {
            return log(1, str, str2, th);
        }

        /* renamed from: w */
        public static int m201w(String str, String str2) {
            return log(6, str, str2, null);
        }

        /* renamed from: w */
        public static int m202w(String str, String str2, Throwable th) {
            return log(7, str, str2, th);
        }

        /* renamed from: w */
        public static int m203w(String str, Throwable th) {
            return log(8, str, null, th);
        }
    }

    public static int badImplementation(Throwable th) {
        return m191w(BAD_IMPLEMENTATION, th);
    }

    public static void close() {
        try {
            C2101m0.m5155a(2, new Runnable() { // from class: android.ext.Log.3
                @Override // java.lang.Runnable
                public void run() {
                    Log.closed = Log.DISABLE_LOG;
                    if (Log.writer != null) {
                        try {
                            Log.writer.flush();
                            Log.writer.close();
                            Log.writer = null;
                        } catch (IOException e7) {
                            LogWrapper.m194d("AndroidService", "Log close: I/O", e7);
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void crash() {
        try {
            C2101m0.m5155a(2, new Runnable() { // from class: android.ext.Log.4
                @Override // java.lang.Runnable
                public void run() {
                    Log.close();
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static int m171d(String str) {
        return m172d("AndroidService", str);
    }

    /* renamed from: d */
    public static int m172d(String str, String str2) {
        return LogWrapper.m193d(str, str2);
    }

    /* renamed from: d */
    public static int m173d(String str, String str2, Throwable th) {
        return LogWrapper.m194d(str, str2, th);
    }

    /* renamed from: d */
    public static int m174d(String str, Throwable th) {
        return m173d("AndroidService", str, th);
    }

    /* renamed from: e */
    public static int m175e(String str) {
        return m176e("AndroidService", str);
    }

    /* renamed from: e */
    public static int m176e(String str, String str2) {
        return LogWrapper.m195e(str, str2);
    }

    /* renamed from: e */
    public static int m177e(String str, String str2, Throwable th) {
        return LogWrapper.m196e(str, str2, th);
    }

    /* renamed from: e */
    public static int m178e(String str, Throwable th) {
        return m177e("AndroidService", str, th);
    }

    public static boolean flush(boolean z6) {
        if (writer == null) {
            return false;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastFlush <= FLUSH_LOG_EVERY_MS && !z6) {
                return false;
            }
            try {
                writer.flush();
            } catch (NullPointerException unused) {
            }
            lastFlush = currentTimeMillis;
            return DISABLE_LOG;
        } catch (IOException e7) {
            LogWrapper.m194d("AndroidService", "Log write: I/O", e7);
            return false;
        }
    }

    private static File getPath() {
        ArrayList arrayList = new ArrayList();
        Context context = Tools.getContext();
        try {
            arrayList.add(context.getExternalFilesDir(null));
        } catch (Throwable th) {
            m191w("Failed getExternalFilesDir", th);
        }
        try {
            arrayList.add(context.getExternalCacheDir());
        } catch (Throwable th2) {
            m191w("Failed getExternalCacheDir", th2);
        }
        arrayList.add(Tools.getFilesDir());
        arrayList.add(Tools.getCacheDir());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                try {
                    file.mkdirs();
                    File file2 = new File(file, "write.tmp");
                    file2.delete();
                    if (file2.exists()) {
                        continue;
                    } else {
                        file2.createNewFile();
                        if (file2.exists()) {
                            file2.delete();
                            return file;
                        }
                        continue;
                    }
                } catch (IOException e7) {
                    m191w("check " + file, e7);
                }
            }
        }
        throw new IOException("Failed find path");
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (OutOfMemoryError unused) {
            printWriter.write("OutOfMemoryError 1\n");
            while (th != null) {
                try {
                    printWriter.write(th.toString());
                    printWriter.write("\n");
                } catch (OutOfMemoryError unused2) {
                    printWriter.write("OutOfMemoryError 2\n");
                }
                th = th.getCause();
            }
        } catch (Throwable th3) {
            printWriter.write("Exception on printStackTrace: " + th3.getMessage());
        }
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        return stringWriter2 == null ? "" : stringWriter2;
    }

    public static void here() {
        Thread currentThread = Thread.currentThread();
        StackTraceElement stackTraceElement = currentThread.getStackTrace()[3];
        m171d("here: " + currentThread.getName() + " : " + currentThread.getId() + " : " + stackTraceElement.getFileName() + " : " + stackTraceElement.getClassName() + " : " + stackTraceElement.getMethodName() + " : " + stackTraceElement.getLineNumber());
    }

    /* renamed from: i */
    public static int m179i(String str) {
        return m180i("AndroidService", str);
    }

    /* renamed from: i */
    public static int m180i(String str, String str2) {
        return LogWrapper.m197i(str, str2);
    }

    /* renamed from: i */
    public static int m181i(String str, String str2, Throwable th) {
        return LogWrapper.m198i(str, str2, th);
    }

    /* renamed from: i */
    public static int m182i(String str, Throwable th) {
        return m181i("AndroidService", str, th);
    }

    public static int iFull(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 1003;
            m179i(str.substring(i7, i8 < length ? i8 : length));
            i7 = i8;
        }
        return 0;
    }

    public static void reopen() {
    }

    public static void runLogOnProcessErrStream(Process process, InputStream inputStream) {
    }

    /* renamed from: s */
    public static synchronized void m183s(final String str) {
        synchronized (Log.class) {
            synchronized (Log.class) {
                Handler[] handlerArr = C2101m0.f9540a;
                if (!(Looper.myLooper() == C2101m0.f9541b[2] ? DISABLE_LOG : false) && !closed) {
                    try {
                        C2101m0.m5155a(2, new Runnable() { // from class: android.ext.Log.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (Tools.getContext() != null) {
                                    if (Log.writer == null) {
                                        Log.reopen();
                                    }
                                    if (Log.writer != null) {
                                        try {
                                            Log.writer.append((CharSequence) str);
                                            Log.writer.newLine();
                                            if (Log.flush(false)) {
                                                return;
                                            }
                                            Handler handler = C2101m0.f9540a[2];
                                            Runnable runnable = Log.flushTask;
                                            handler.removeCallbacks(runnable);
                                            handler.postDelayed(runnable, Log.FLUSH_LOG_EVERY_MS);
                                        } catch (IOException e7) {
                                            LogWrapper.m194d("AndroidService", "Log write: I/O", e7);
                                            String message = e7.getMessage();
                                            if (message == null || !message.contains("EBADF")) {
                                                return;
                                            }
                                            Log.reopen();
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public static int m184v(String str) {
        return m185v("AndroidService", str);
    }

    /* renamed from: v */
    public static int m185v(String str, String str2) {
        return LogWrapper.m199v(str, str2);
    }

    /* renamed from: v */
    public static int m186v(String str, String str2, Throwable th) {
        return LogWrapper.m200v(str, str2, th);
    }

    /* renamed from: v */
    public static int m187v(String str, Throwable th) {
        return m186v("AndroidService", str, th);
    }

    /* renamed from: w */
    public static int m188w(String str) {
        return m189w("AndroidService", str);
    }

    /* renamed from: w */
    public static int m189w(String str, String str2) {
        return LogWrapper.m201w(str, str2);
    }

    /* renamed from: w */
    public static int m190w(String str, String str2, Throwable th) {
        return LogWrapper.m202w(str, str2, th);
    }

    /* renamed from: w */
    public static int m191w(String str, Throwable th) {
        return m190w("AndroidService", str, th);
    }

    /* renamed from: wt */
    public static int m192wt(String str, Throwable th) {
        return LogWrapper.m203w(str, th);
    }
}
