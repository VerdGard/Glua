package p171v4;

import java.util.Locale;
import p032d6.C0898f;
import p047f5.C1177h;

/* renamed from: v4.i */
/* loaded from: classes.dex */
public final class C2025i {

    /* renamed from: a */
    public static final int[] f9201a = new int[64];

    /* renamed from: b */
    public static final int[] f9202b = new int[64];

    /* renamed from: c */
    public static final int[][] f9203c;

    /* renamed from: d */
    public static final int[][] f9204d;

    /* renamed from: e */
    public static final int[][] f9205e;

    static {
        int[][] iArr = new int[32][];
        for (int i7 = 0; i7 < 32; i7++) {
            iArr[i7] = new int[32];
        }
        f9203c = iArr;
        int[][] iArr2 = new int[32][];
        for (int i8 = 0; i8 < 32; i8++) {
            iArr2[i8] = new int[32];
        }
        f9204d = iArr2;
        int[][] iArr3 = new int[32][];
        for (int i9 = 0; i9 < 32; i9++) {
            iArr3[i9] = new int[32];
        }
        f9205e = iArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x02be, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p171v4.C2026j m4918a(java.lang.String r34, java.lang.String r35, int r36, java.lang.String r37, java.lang.String r38, p171v4.C2027k r39) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p171v4.C2025i.m4918a(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, v4.k):v4.j");
    }

    /* renamed from: b */
    public static final C2026j m4919b(String str, String str2, int i7, String str3, String str4) {
        String str5;
        char charAt;
        char charAt2;
        C2027k c2027k = C2027k.f9209c;
        C0898f.m2606e(str2, "lowPattern");
        C0898f.m2606e(str4, "lowWord");
        C2026j m4918a = m4918a(str, str2, i7, str3, str4, c2027k);
        if (str.length() >= 3) {
            int length = str.length() - 1;
            int i8 = 7 > length ? length : 7;
            int i9 = i7 + 1;
            while (i9 < i8) {
                int i10 = i9 + 1;
                if (i10 < str.length() && (charAt = str.charAt(i9)) != (charAt2 = str.charAt(i10))) {
                    String substring = str.substring(0, i9);
                    C0898f.m2605d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String substring2 = str.substring(i9 + 2);
                    C0898f.m2605d(substring2, "this as java.lang.String).substring(startIndex)");
                    str5 = substring + charAt2 + charAt + substring2;
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase(Locale.ROOT);
                    C0898f.m2605d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    C2026j m4918a2 = m4918a(str5, lowerCase, i7, str3, str4, c2027k);
                    if (m4918a2 != null) {
                        int i11 = m4918a2.f9207a - 3;
                        m4918a2.f9207a = i11;
                        if (m4918a == null || i11 > m4918a.f9207a) {
                            m4918a = m4918a2;
                        }
                    }
                }
                i9 = i10;
            }
        }
        return m4918a;
    }

    /* renamed from: c */
    public static final boolean m4920c(int i7, String str) {
        C0898f.m2606e(str, "value");
        boolean z6 = false;
        if (i7 < 0 || i7 >= str.length()) {
            return false;
        }
        int codePointAt = str.codePointAt(i7);
        if (codePointAt == 32 || codePointAt == 34 || codePointAt == 36 || codePointAt == 58 || codePointAt == 60 || codePointAt == 62 || codePointAt == 95 || codePointAt == 123 || codePointAt == 125) {
            return true;
        }
        switch (codePointAt) {
            case 39:
            case 40:
            case 41:
                return true;
            default:
                switch (codePointAt) {
                    case 45:
                    case 46:
                    case 47:
                        return true;
                    default:
                        switch (codePointAt) {
                            case 91:
                            case 92:
                            case 93:
                                return true;
                            default:
                                int[] iArr = C1177h.f5762a;
                                if (codePointAt >= 126976 && codePointAt <= 129791) {
                                    z6 = true;
                                }
                                return z6;
                        }
                }
        }
    }

    /* renamed from: d */
    public static final boolean m4921d(String str, int i7, String str2) {
        C0898f.m2606e(str2, "wordLow");
        return str.charAt(i7) != str2.charAt(i7);
    }

    /* renamed from: e */
    public static final boolean m4922e(int i7, String str) {
        C0898f.m2606e(str, "value");
        if (i7 < 0 || i7 >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i7);
        return charAt == '\t' || charAt == ' ';
    }
}
