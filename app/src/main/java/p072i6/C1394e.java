package p072i6;

import p032d6.C0898f;
import p056g6.C1265b;
import p056g6.C1266c;

/* renamed from: i6.e */
/* loaded from: classes.dex */
public class C1394e extends C1393d {
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r11;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m3740W(java.lang.CharSequence r10, int r11, boolean r12) {
        /*
            java.lang.String r6 = "."
            if (r12 != 0) goto L11
            boolean r0 = r10 instanceof java.lang.String
            if (r0 != 0) goto L9
            goto L11
        L9:
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.indexOf(r6, r11)
            goto Lab
        L11:
            int r0 = r10.length()
            g6.c r1 = new g6.c
            r7 = 0
            if (r11 >= 0) goto L1b
            r11 = 0
        L1b:
            int r2 = r10.length()
            if (r0 <= r2) goto L22
            r0 = r2
        L22:
            r1.<init>(r11, r0)
            boolean r0 = r10 instanceof java.lang.String
            int r8 = r1.f6307m
            int r9 = r1.f6306e
            if (r0 == 0) goto L52
            if (r8 <= 0) goto L31
            if (r11 <= r9) goto L35
        L31:
            if (r8 >= 0) goto Laa
            if (r9 > r11) goto Laa
        L35:
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            int r5 = r6.length()
            if (r12 != 0) goto L43
            boolean r0 = r6.regionMatches(r7, r3, r11, r5)
            goto L4b
        L43:
            r2 = 0
            r0 = r6
            r1 = r12
            r4 = r11
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
        L4b:
            if (r0 == 0) goto L4e
            goto La4
        L4e:
            if (r11 == r9) goto Laa
            int r11 = r11 + r8
            goto L35
        L52:
            if (r8 <= 0) goto L56
            if (r11 <= r9) goto L5a
        L56:
            if (r8 >= 0) goto Laa
            if (r9 > r11) goto Laa
        L5a:
            int r0 = r6.length()
            if (r11 < 0) goto La1
            int r1 = r6.length()
            int r1 = r1 - r0
            if (r1 < 0) goto La1
            int r1 = r10.length()
            int r1 = r1 - r0
            if (r11 <= r1) goto L6f
            goto La1
        L6f:
            r1 = 0
        L70:
            r2 = 1
            if (r1 >= r0) goto La2
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            int r4 = r11 + r1
            char r4 = r10.charAt(r4)
            if (r3 != r4) goto L82
            goto L9b
        L82:
            if (r12 != 0) goto L85
            goto L9a
        L85:
            char r3 = java.lang.Character.toUpperCase(r3)
            char r4 = java.lang.Character.toUpperCase(r4)
            if (r3 == r4) goto L9b
            char r3 = java.lang.Character.toLowerCase(r3)
            char r4 = java.lang.Character.toLowerCase(r4)
            if (r3 != r4) goto L9a
            goto L9b
        L9a:
            r2 = 0
        L9b:
            if (r2 != 0) goto L9e
            goto La1
        L9e:
            int r1 = r1 + 1
            goto L70
        La1:
            r2 = 0
        La2:
            if (r2 == 0) goto La6
        La4:
            r10 = r11
            goto Lab
        La6:
            if (r11 == r9) goto Laa
            int r11 = r11 + r8
            goto L5a
        Laa:
            r10 = -1
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p072i6.C1394e.m3740W(java.lang.CharSequence, int, boolean):int");
    }

    /* renamed from: X */
    public static final String m3741X(int i7, String str) {
        C0898f.m2606e(str, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length != 0) {
                if (length == 1) {
                    char charAt = str.charAt(0);
                    char[] cArr = new char[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        cArr[i8] = charAt;
                    }
                    return new String(cArr);
                }
                StringBuilder sb = new StringBuilder(str.length() * i7);
                C1266c c1266c = new C1266c(1, i7);
                C1265b c1265b = new C1265b(1, c1266c.f6306e, c1266c.f6307m);
                while (c1265b.f6310m) {
                    c1265b.nextInt();
                    sb.append((CharSequence) str);
                }
                String sb2 = sb.toString();
                C0898f.m2605d(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
        }
        return "";
    }

    /* renamed from: Y */
    public static String m3742Y(String str) {
        C0898f.m2606e(str, "<this>");
        C0898f.m2606e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        C0898f.m2605d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
