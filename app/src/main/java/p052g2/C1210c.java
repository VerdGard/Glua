package p052g2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g2.c */
/* loaded from: classes.dex */
public final class C1210c {

    /* renamed from: a */
    public static final Charset f5951a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m3423a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m3423a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
