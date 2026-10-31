package p019c2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: c2.g */
/* loaded from: classes.dex */
public final class C0599g {
    @Deprecated
    /* renamed from: a */
    public static String m2046a(FileInputStream fileInputStream) {
        Charset forName = Charset.forName("UTF-8");
        C0606n c0606n = new C0606n();
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, forName);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return c0606n.toString();
            }
            c0606n.write(cArr, 0, read);
        }
    }
}
