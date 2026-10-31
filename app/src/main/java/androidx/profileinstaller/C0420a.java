package androidx.profileinstaller;

import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public final class C0420a {
    /* renamed from: a */
    public static boolean m1416a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : listFiles) {
            z6 = m1416a(file2) && z6;
        }
        return z6;
    }
}
