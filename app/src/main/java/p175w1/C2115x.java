package p175w1;

/* renamed from: w1.x */
/* loaded from: classes.dex */
public final class C2115x {
    /* renamed from: a */
    public static int m5163a(String str) {
        if (str.length() > 2 && str.charAt(0) == '~') {
            char charAt = str.charAt(1);
            if (charAt == 'A') {
                return 4;
            }
            if (charAt != 'T') {
                if (charAt == 'a') {
                    return 4;
                }
                if (charAt != 't') {
                }
            }
            return 2;
        }
        return 0;
    }
}
