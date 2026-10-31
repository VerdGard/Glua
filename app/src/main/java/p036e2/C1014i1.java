package p036e2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.system.Os;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import p002a1.C0017d;

/* renamed from: e2.i1 */
/* loaded from: classes.dex */
public final class C1014i1 {

    /* renamed from: a */
    public final Context f5124a;

    /* renamed from: b */
    public final C0979d1 f5125b;

    public C1014i1(Context context, C0979d1 c0979d1) {
        this.f5124a = context;
        this.f5125b = c0979d1;
    }

    /* renamed from: e */
    public static C0993f1 m3038e() {
        String str;
        String[] split;
        String str2 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] m3231a = C1097u0.m3231a();
            byte[] m83h = C0017d.m83h(sb.toString().getBytes());
            C1076r0 c1076r0 = new C1076r0();
            c1076r0.m3171b(2, m3231a, m3231a);
            split = new String(c1076r0.m3170a(m83h)).split("=");
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        if (split != null && split.length == 2) {
            str = split[0];
            try {
                str2 = split[1];
            } catch (FileNotFoundException | IOException | Exception unused2) {
            }
            return C0993f1.m3021a(str2, str);
        }
        str = "";
        return C0993f1.m3021a(str2, str);
    }

    /* renamed from: a */
    public final void m3039a(String str, String str2) {
        try {
            Settings.System.putString(this.f5124a.getContentResolver(), str, str2);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final void m3040b(String str) {
        Context context = this.f5124a;
        int i7 = Build.VERSION.SDK_INT >= 24 ? 0 : 1;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput("libcuid.so", i7);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (Exception unused) {
            }
            if (i7 == 0) {
                try {
                    Os.chmod(new File(context.getFilesDir(), "libcuid.so").getAbsolutePath(), 436);
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused4) {
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean m3041c(String str) {
        return this.f5124a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: d */
    public final String m3042d(String str) {
        try {
            return Settings.System.getString(this.f5124a.getContentResolver(), str);
        } catch (Exception unused) {
            return null;
        }
    }
}
