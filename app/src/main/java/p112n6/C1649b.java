package p112n6;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* renamed from: n6.b */
/* loaded from: classes.dex */
public final class C1649b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        return lowerCase.endsWith(".zip") || lowerCase.endsWith(".jar");
    }
}
