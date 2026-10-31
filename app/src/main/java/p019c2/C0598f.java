package p019c2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.ext.C0089a;
import android.ext.C0091c;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: c2.f */
/* loaded from: classes.dex */
public final class C0598f implements Thread.UncaughtExceptionHandler {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    public static final C0598f f2993d = new C0598f();

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f2994a;

    /* renamed from: b */
    public Context f2995b;

    /* renamed from: c */
    public final SimpleDateFormat f2996c = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    /* renamed from: a */
    public final void m2044a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            sb.append("\r\n");
            sb.append(format);
            sb.append("\n");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            while (true) {
                th = th.getCause();
                if (th == null) {
                    printWriter.flush();
                    printWriter.close();
                    sb.append(stringWriter.toString());
                    m2045b(sb.toString());
                    return;
                }
                th.printStackTrace(printWriter);
            }
        } catch (Exception e7) {
            Log.e("MyCrash", "an error occurred while writing file...", e7);
            sb.append("an error occurred while writing file...\r\n");
            m2045b(sb.toString());
        }
    }

    /* renamed from: b */
    public final void m2045b(String str) {
        String m228f = C0091c.m228f("crash-", this.f2996c.format(new Date()), ".txt");
        if (Environment.getExternalStorageState().equals("mounted")) {
            String str2 = this.f2995b.getExternalFilesDir("").getAbsolutePath() + "/Crash/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(C0089a.m210h(str2, m228f), true);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z6;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (th == null) {
            z6 = false;
        } else {
            try {
                new C0597e().start();
                m2044a(th);
                SystemClock.sleep(3000L);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            z6 = true;
        }
        if (!z6 && (uncaughtExceptionHandler = this.f2994a) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        SystemClock.sleep(3000L);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
