package p047f5;

import androidx.activity.C0143v;
import java.io.Serializable;
import p134q6.C1806b;
import p165u6.AbstractC2003u;

/* renamed from: f5.f */
/* loaded from: classes.dex */
public final class C1175f {

    /* renamed from: a */
    public final /* synthetic */ int f5758a;

    /* renamed from: b */
    public int f5759b;

    /* renamed from: c */
    public Serializable f5760c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, long[]] */
    public C1175f() {
        this.f5758a = 0;
        this.f5760c = new long[64];
    }

    /* renamed from: q */
    public static String m3368q(String str) {
        StringBuilder m4257a = C1806b.m4257a();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i7 = 0;
        char c7 = 0;
        while (i7 < length) {
            char c8 = charArray[i7];
            if (c8 != '\\' || (c7 != 0 && c7 == '\\')) {
                m4257a.append(c8);
            }
            i7++;
            c7 = c8;
        }
        return C1806b.m4263g(m4257a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Serializable, java.lang.Object, long[]] */
    /* renamed from: a */
    public final void m3369a(long j7) {
        Object obj = this.f5760c;
        int i7 = this.f5759b;
        int i8 = i7 + 1;
        this.f5759b = i8;
        ((long[]) obj)[i7] = j7;
        if (((long[]) obj).length == i8) {
            ?? r52 = new long[i8 << 1];
            System.arraycopy((long[]) obj, 0, r52, 0, i8);
            this.f5760c = r52;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[EDGE_INSN: B:14:0x0078->B:15:0x0078 BREAK  A[LOOP:0: B:2:0x0007->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:2:0x0007->B:23:?, LOOP_END, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m3370b(char r10, char r11) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L7:
            boolean r7 = r9.m3378j()
            if (r7 == 0) goto Lf
            goto L78
        Lf:
            char r7 = r9.m3372d()
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            if (r1 == 0) goto L1d
            r8 = 92
            if (r1 == r8) goto L6c
        L1d:
            r8 = 39
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L34
            char r8 = r7.charValue()
            if (r8 == r10) goto L34
            if (r2 != 0) goto L34
            r3 = r3 ^ 1
            goto L4a
        L34:
            r8 = 34
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L4a
            char r8 = r7.charValue()
            if (r8 == r10) goto L4a
            if (r3 != 0) goto L4a
            r2 = r2 ^ 1
        L4a:
            if (r3 != 0) goto L76
            if (r2 == 0) goto L4f
            goto L76
        L4f:
            java.lang.Character r8 = java.lang.Character.valueOf(r10)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L60
            int r4 = r4 + 1
            if (r5 != r0) goto L6c
            int r5 = r9.f5759b
            goto L6c
        L60:
            java.lang.Character r8 = java.lang.Character.valueOf(r11)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L6c
            int r4 = r4 + (-1)
        L6c:
            if (r4 <= 0) goto L72
            if (r1 == 0) goto L72
            int r6 = r9.f5759b
        L72:
            char r1 = r7.charValue()
        L76:
            if (r4 > 0) goto L7
        L78:
            if (r6 < 0) goto L83
            java.io.Serializable r10 = r9.f5760c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r10.substring(r5, r6)
            goto L85
        L83:
            java.lang.String r10 = ""
        L85:
            if (r4 > 0) goto L88
            return r10
        L88:
            java.lang.String r11 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r10 = android.ext.C0091c.m228f(r11, r10, r0)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p047f5.C1175f.m3370b(char, char):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, u6.u[]] */
    /* renamed from: c */
    public final void m3371c() {
        AbstractC2003u[] abstractC2003uArr = (AbstractC2003u[]) this.f5760c;
        int i7 = this.f5759b;
        this.f5760c = new AbstractC2003u[]{abstractC2003uArr[i7]};
        abstractC2003uArr[i7] = null;
        this.f5759b = 0;
    }

    /* renamed from: d */
    public final char m3372d() {
        String str = (String) this.f5760c;
        int i7 = this.f5759b;
        this.f5759b = i7 + 1;
        return str.charAt(i7);
    }

    /* renamed from: e */
    public final void m3373e(String str) {
        if (!m3381m(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = ((String) this.f5760c).length();
        int i7 = this.f5759b;
        if (length > length2 - i7) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f5759b = i7 + length;
    }

    /* renamed from: f */
    public final String m3374f() {
        int i7 = this.f5759b;
        while (!m3378j()) {
            if (!m3383o()) {
                char[] cArr = {'-', '_'};
                boolean z6 = false;
                if (!m3378j()) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 2) {
                            break;
                        }
                        if (((String) this.f5760c).charAt(this.f5759b) == cArr[i8]) {
                            z6 = true;
                            break;
                        }
                        i8++;
                    }
                }
                if (!z6) {
                    break;
                }
            }
            this.f5759b++;
        }
        return ((String) this.f5760c).substring(i7, this.f5759b);
    }

    /* renamed from: g */
    public final String m3375g(String str) {
        int indexOf = ((String) this.f5760c).indexOf(str, this.f5759b);
        if (indexOf == -1) {
            return m3384p();
        }
        String substring = ((String) this.f5760c).substring(this.f5759b, indexOf);
        this.f5759b = substring.length() + this.f5759b;
        return substring;
    }

    /* renamed from: h */
    public final boolean m3376h() {
        boolean z6 = false;
        while (true) {
            if (!(!m3378j() && C1806b.m4261e(((String) this.f5760c).charAt(this.f5759b)))) {
                return z6;
            }
            this.f5759b++;
            z6 = true;
        }
    }

    /* renamed from: i */
    public final long m3377i(int i7) {
        if (i7 >= this.f5759b || i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(i7);
        }
        return ((long[]) this.f5760c)[i7];
    }

    /* renamed from: j */
    public final boolean m3378j() {
        return ((String) this.f5760c).length() - this.f5759b == 0;
    }

    /* renamed from: k */
    public final int m3379k(int i7) {
        int i8 = this.f5759b - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j7 = (int) (((long[]) this.f5760c)[i10] >> 32);
            long j8 = i7;
            if (j7 < j8) {
                i9 = i10 + 1;
            } else {
                if (j7 <= j8) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return i9;
    }

    /* renamed from: l */
    public final boolean m3380l(String str) {
        if (!m3381m(str)) {
            return false;
        }
        this.f5759b = str.length() + this.f5759b;
        return true;
    }

    /* renamed from: m */
    public final boolean m3381m(String str) {
        return ((String) this.f5760c).regionMatches(true, this.f5759b, str, 0, str.length());
    }

    /* renamed from: n */
    public final boolean m3382n(String... strArr) {
        for (String str : strArr) {
            if (m3381m(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m3383o() {
        return !m3378j() && Character.isLetterOrDigit(((String) this.f5760c).charAt(this.f5759b));
    }

    /* renamed from: p */
    public final String m3384p() {
        Serializable serializable = this.f5760c;
        String substring = ((String) serializable).substring(this.f5759b, ((String) serializable).length());
        this.f5759b = ((String) this.f5760c).length();
        return substring;
    }

    public final String toString() {
        switch (this.f5758a) {
            case 1:
                return ((String) this.f5760c).substring(this.f5759b);
            case 2:
                return this.f5759b + "/" + ((AbstractC2003u[]) this.f5760c).length + " " + ((AbstractC2003u[]) this.f5760c)[this.f5759b];
            default:
                return super.toString();
        }
    }

    public C1175f(String str) {
        this.f5758a = 1;
        this.f5759b = 0;
        C0143v.m423U(str);
        this.f5760c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1175f(AbstractC2003u[] abstractC2003uArr, int i7) {
        this.f5758a = 2;
        this.f5760c = abstractC2003uArr;
        this.f5759b = i7;
    }
}
