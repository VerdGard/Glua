package p150s6;

import android.ext.Tools;
import androidx.activity.C0143v;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p119o6.C1678e;

/* renamed from: s6.a */
/* loaded from: classes.dex */
public final class C1905a {

    /* renamed from: a */
    public final char[] f8464a;

    /* renamed from: b */
    public final Reader f8465b;

    /* renamed from: c */
    public int f8466c;

    /* renamed from: d */
    public int f8467d;

    /* renamed from: e */
    public int f8468e;

    /* renamed from: f */
    public int f8469f;

    /* renamed from: g */
    public int f8470g = -1;

    /* renamed from: h */
    public final String[] f8471h = new String[Tools.Semaphore.f161S9];

    public C1905a(Reader reader, int i7) {
        C0143v.m414L(reader.markSupported());
        this.f8465b = reader;
        this.f8464a = new char[i7 > 32768 ? 32768 : i7];
        m4434b();
        int i8 = 0;
        for (int i9 = this.f8468e; i9 < this.f8466c; i9++) {
            if (this.f8464a[i9] == 0) {
                i8++;
            }
        }
        if (i8 >= 10) {
            throw new C1678e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m4432c(char[] r9, java.lang.String[] r10, int r11, int r12) {
        /*
            r0 = 12
            if (r12 <= r0) goto La
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r11, r12)
            return r10
        La:
            r0 = 1
            if (r12 >= r0) goto L10
            java.lang.String r9 = ""
            return r9
        L10:
            r1 = 0
            r4 = r11
            r2 = 0
            r3 = 0
        L14:
            if (r2 >= r12) goto L21
            int r3 = r3 * 31
            int r5 = r4 + 1
            char r4 = r9[r4]
            int r3 = r3 + r4
            int r2 = r2 + 1
            r4 = r5
            goto L14
        L21:
            int r2 = r10.length
            int r2 = r2 - r0
            r2 = r2 & r3
            r3 = r10[r2]
            if (r3 != 0) goto L30
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r2] = r0
            goto L59
        L30:
            int r4 = r3.length()
            if (r12 != r4) goto L4e
            r5 = r11
            r4 = r12
            r6 = 0
        L39:
            int r7 = r4 + (-1)
            if (r4 == 0) goto L4f
            int r4 = r5 + 1
            char r5 = r9[r5]
            int r8 = r6 + 1
            char r6 = r3.charAt(r6)
            if (r5 == r6) goto L4a
            goto L4e
        L4a:
            r5 = r4
            r4 = r7
            r6 = r8
            goto L39
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L52
            return r3
        L52:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r2] = r0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1905a.m4432c(char[], java.lang.String[], int, int):java.lang.String");
    }

    /* renamed from: a */
    public final void m4433a() {
        this.f8468e++;
    }

    /* renamed from: b */
    public final void m4434b() {
        Reader reader = this.f8465b;
        int i7 = this.f8468e;
        if (i7 < this.f8467d) {
            return;
        }
        try {
            reader.skip(i7);
            reader.mark(32768);
            int read = reader.read(this.f8464a);
            reader.reset();
            if (read != -1) {
                this.f8466c = read;
                this.f8469f += i7;
                this.f8468e = 0;
                this.f8470g = -1;
                if (read > 24576) {
                    read = 24576;
                }
                this.f8467d = read;
            }
        } catch (IOException e7) {
            throw new C1678e(e7);
        }
    }

    /* renamed from: d */
    public final char m4435d() {
        m4434b();
        int i7 = this.f8468e;
        char c7 = i7 >= this.f8466c ? (char) 65535 : this.f8464a[i7];
        this.f8468e = i7 + 1;
        return c7;
    }

    /* renamed from: e */
    public final String m4436e() {
        char[] cArr;
        char c7;
        m4434b();
        int i7 = this.f8468e;
        while (true) {
            int i8 = this.f8468e;
            int i9 = this.f8466c;
            cArr = this.f8464a;
            if (i8 >= i9 || (((c7 = cArr[i8]) < 'A' || c7 > 'Z') && ((c7 < 'a' || c7 > 'z') && !Character.isLetter(c7)))) {
                break;
            }
            this.f8468e++;
        }
        return m4432c(cArr, this.f8471h, i7, this.f8468e - i7);
    }

    /* renamed from: f */
    public final String m4437f(char c7) {
        char[] cArr;
        int i7;
        m4434b();
        int i8 = this.f8468e;
        while (true) {
            int i9 = this.f8466c;
            cArr = this.f8464a;
            if (i8 >= i9) {
                i7 = -1;
                break;
            }
            if (c7 == cArr[i8]) {
                i7 = i8 - this.f8468e;
                break;
            }
            i8++;
        }
        String[] strArr = this.f8471h;
        if (i7 != -1) {
            String m4432c = m4432c(cArr, strArr, this.f8468e, i7);
            this.f8468e += i7;
            return m4432c;
        }
        m4434b();
        int i10 = this.f8468e;
        String m4432c2 = m4432c(cArr, strArr, i10, this.f8466c - i10);
        this.f8468e = this.f8466c;
        return m4432c2;
    }

    /* renamed from: g */
    public final String m4438g(char... cArr) {
        char[] cArr2;
        m4434b();
        int i7 = this.f8468e;
        int i8 = this.f8466c;
        int i9 = i7;
        loop0: while (true) {
            cArr2 = this.f8464a;
            if (i9 >= i8) {
                break;
            }
            for (char c7 : cArr) {
                if (cArr2[i9] == c7) {
                    break loop0;
                }
            }
            i9++;
        }
        this.f8468e = i9;
        return i9 > i7 ? m4432c(cArr2, this.f8471h, i7, i9 - i7) : "";
    }

    /* renamed from: h */
    public final String m4439h(char... cArr) {
        char[] cArr2;
        m4434b();
        int i7 = this.f8468e;
        int i8 = this.f8466c;
        int i9 = i7;
        while (true) {
            cArr2 = this.f8464a;
            if (i9 >= i8 || Arrays.binarySearch(cArr, cArr2[i9]) >= 0) {
                break;
            }
            i9++;
        }
        this.f8468e = i9;
        return i9 > i7 ? m4432c(cArr2, this.f8471h, i7, i9 - i7) : "";
    }

    /* renamed from: i */
    public final char m4440i() {
        m4434b();
        int i7 = this.f8468e;
        if (i7 >= this.f8466c) {
            return (char) 65535;
        }
        return this.f8464a[i7];
    }

    /* renamed from: j */
    public final boolean m4441j() {
        m4434b();
        return this.f8468e >= this.f8466c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4442k(java.lang.String r8) {
        /*
            r7 = this;
            r7.m4434b()
            r7.m4434b()
            int r0 = r8.length()
            int r1 = r7.f8466c
            int r2 = r7.f8468e
            int r1 = r1 - r2
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            int r5 = r7.f8468e
            int r5 = r5 + r1
            char[] r6 = r7.f8464a
            char r5 = r6[r5]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.f8468e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f8468e = r8
            return r2
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1905a.m4442k(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4443l(java.lang.String r8) {
        /*
            r7 = this;
            r7.m4434b()
            int r0 = r8.length()
            int r1 = r7.f8466c
            int r2 = r7.f8468e
            int r1 = r1 - r2
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            int r5 = r7.f8468e
            int r5 = r5 + r1
            char[] r6 = r7.f8464a
            char r5 = r6[r5]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.f8468e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f8468e = r8
            return r2
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1905a.m4443l(java.lang.String):boolean");
    }

    /* renamed from: m */
    public final boolean m4444m(char c7) {
        return !m4441j() && this.f8464a[this.f8468e] == c7;
    }

    /* renamed from: n */
    public final boolean m4445n(char... cArr) {
        if (m4441j()) {
            return false;
        }
        m4434b();
        char c7 = this.f8464a[this.f8468e];
        for (char c8 : cArr) {
            if (c8 == c7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m4446o() {
        if (m4441j()) {
            return false;
        }
        char c7 = this.f8464a[this.f8468e];
        return (c7 >= 'A' && c7 <= 'Z') || (c7 >= 'a' && c7 <= 'z') || Character.isLetter(c7);
    }

    /* renamed from: p */
    public final int m4447p(String str) {
        m4434b();
        char charAt = str.charAt(0);
        int i7 = this.f8468e;
        while (i7 < this.f8466c) {
            char[] cArr = this.f8464a;
            if (charAt != cArr[i7]) {
                do {
                    i7++;
                    if (i7 >= this.f8466c) {
                        break;
                    }
                } while (charAt != cArr[i7]);
            }
            int i8 = i7 + 1;
            int length = (str.length() + i8) - 1;
            int i9 = this.f8466c;
            if (i7 < i9 && length <= i9) {
                int i10 = i8;
                for (int i11 = 1; i10 < length && str.charAt(i11) == cArr[i10]; i11++) {
                    i10++;
                }
                if (i10 == length) {
                    return i7 - this.f8468e;
                }
            }
            i7 = i8;
        }
        return -1;
    }

    /* renamed from: q */
    public final void m4448q() {
        int i7 = this.f8470g;
        if (i7 == -1) {
            throw new C1678e(new IOException("Mark invalid"));
        }
        this.f8468e = i7;
    }

    /* renamed from: r */
    public final void m4449r() {
        int i7 = this.f8468e;
        if (i7 < 1) {
            throw new C1678e(new IOException("No buffer left to unconsume"));
        }
        this.f8468e = i7 - 1;
    }

    public final String toString() {
        int i7 = this.f8468e;
        return new String(this.f8464a, i7, this.f8466c - i7);
    }
}
