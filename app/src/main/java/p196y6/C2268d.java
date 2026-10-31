package p196y6;

import p196y6.C2269e;

/* renamed from: y6.d */
/* loaded from: classes.dex */
public final class C2268d {

    /* renamed from: a */
    public final C2267c f10359a;

    /* renamed from: b */
    public final int f10360b;

    /* renamed from: c */
    public int f10361c;

    /* renamed from: d */
    public C2269e[] f10362d;

    /* renamed from: e */
    public boolean f10363e;

    public C2268d(C2267c c2267c) {
        this.f10359a = c2267c;
        this.f10360b = 0;
        this.f10361c = 1;
        this.f10362d = new C2269e[]{new C2269e.a(0)};
        this.f10363e = false;
    }

    /* renamed from: a */
    public final void m5499a(C2269e c2269e) {
        C2267c c2267c = this.f10359a;
        int length = c2267c.f10354e.length;
        for (int i7 = 0; i7 < length; i7++) {
            C2265a c2265a = c2267c.f10354e[i7];
            C2269e[][] c2269eArr = c2267c.f10356g;
            int i8 = this.f10360b;
            C2269e[] c2269eArr2 = c2269eArr[i8];
            int i9 = c2265a.f10279a;
            if (c2269eArr2[i9] == c2269e) {
                C2265a[] c2265aArr = c2265a.f10281c;
                int length2 = c2265aArr != null ? c2265aArr.length : 0;
                for (int i10 = 0; i10 < length2; i10++) {
                    C2269e c2269e2 = c2267c.f10356g[i8][c2265a.f10281c[i10].f10280b];
                    if (c2269e2 != c2269e) {
                        m5500b(c2269e2);
                    }
                }
            } else {
                while (true) {
                    i9++;
                    if (i9 <= c2265a.f10280b) {
                        C2269e[] c2269eArr3 = c2267c.f10356g[i8];
                        if (c2269eArr3[i9] == c2269e) {
                            m5500b(c2269eArr3[i9 - 1]);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m5500b(C2269e c2269e) {
        int i7;
        if (c2269e == null || c2269e == C2269e.f10364f) {
            return false;
        }
        boolean z6 = true;
        if (c2269e.f10367c == this) {
            return true;
        }
        c2269e.f10367c = this;
        int i8 = this.f10361c;
        if (i8 == 0) {
            this.f10362d = new C2269e[1];
        } else {
            int i9 = i8 + 1;
            C2269e[] c2269eArr = this.f10362d;
            if (i9 >= c2269eArr.length) {
                C2269e[] c2269eArr2 = new C2269e[(i8 * 2) + 1];
                this.f10362d = c2269eArr2;
                System.arraycopy(c2269eArr, 0, c2269eArr2, 0, i8);
            }
        }
        C2269e[] c2269eArr3 = this.f10362d;
        int i10 = this.f10361c;
        this.f10361c = i10 + 1;
        c2269eArr3[i10] = c2269e;
        C2267c c2267c = this.f10359a;
        int i11 = c2269e.f10366b;
        if (i11 < 0 || ((i7 = (c2267c.f10351b.f9144b[i11] >> 0) & 63) != 32 && i7 != 35)) {
            z6 = false;
        }
        if (z6) {
            return false;
        }
        int length = c2267c.f10354e.length;
        boolean z7 = false;
        for (int i12 = 0; i12 < length; i12++) {
            C2265a c2265a = c2267c.f10354e[i12];
            C2269e[][] c2269eArr4 = c2267c.f10356g;
            int i13 = this.f10360b;
            C2269e[] c2269eArr5 = c2269eArr4[i13];
            int i14 = c2265a.f10280b;
            if (c2269eArr5[i14] == c2269e) {
                C2265a[] c2265aArr = c2265a.f10282d;
                int length2 = c2265aArr != null ? c2265aArr.length : 0;
                for (int i15 = 0; i15 < length2; i15++) {
                    C2269e c2269e2 = c2269eArr4[i13][c2265a.f10282d[i15].f10279a];
                    if (c2269e2 != c2269e) {
                        z7 |= m5500b(c2269e2);
                        c2269e2.getClass();
                        if (c2269e2 instanceof C2269e.b) {
                            m5499a(c2269e2);
                        }
                    }
                }
            } else {
                while (true) {
                    i14--;
                    if (i14 >= c2265a.f10279a) {
                        C2269e[] c2269eArr6 = c2269eArr4[i13];
                        if (c2269eArr6[i14] == c2269e) {
                            z7 |= m5500b(c2269eArr6[i14 + 1]);
                            break;
                        }
                    }
                }
            }
        }
        if (z7) {
            m5499a(c2269e);
        }
        return z7;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10359a.f10350a);
        int i7 = 0;
        while (i7 < this.f10361c) {
            stringBuffer.append(i7 > 0 ? "," : " ");
            stringBuffer.append(String.valueOf(this.f10362d[i7]));
            i7++;
        }
        if (this.f10363e) {
            stringBuffer.append("(rw)");
        }
        return stringBuffer.toString();
    }

    public C2268d(C2267c c2267c, int i7, int i8) {
        int i9;
        int i10;
        this.f10359a = c2267c;
        this.f10360b = i8;
        this.f10361c = 0;
        this.f10362d = null;
        m5500b(c2267c.f10356g[i8][i7]);
        int i11 = 0;
        while (true) {
            i9 = this.f10361c;
            boolean z6 = true;
            if (i11 >= i9) {
                break;
            }
            C2269e c2269e = this.f10362d[i11];
            int i12 = c2269e.f10366b;
            if (i12 >= 0) {
                C2267c c2267c2 = this.f10359a;
                C2265a c2265a = c2267c2.f10353d[i12];
                int i13 = c2265a.f10279a;
                int i14 = this.f10360b;
                C2269e[][] c2269eArr = c2267c2.f10356g;
                if (i12 > i13) {
                    if (c2269eArr[i14][i12 - 1].f10367c != this) {
                    }
                    z6 = false;
                } else {
                    C2265a[] c2265aArr = c2265a.f10281c;
                    if (c2265aArr == null) {
                        C2269e c2269e2 = c2267c2.f10355f[i14];
                        if (c2269e2 != null && c2269e2.f10367c != this) {
                        }
                        z6 = false;
                    } else {
                        int length = c2265aArr.length;
                        while (i10 < length) {
                            C2269e c2269e3 = c2269eArr[i14][c2265a.f10281c[i10].f10280b];
                            i10 = (c2269e3 == null || c2269e3.f10367c == this) ? i10 + 1 : 0;
                        }
                        z6 = false;
                    }
                }
            }
            c2269e.f10368d = z6;
            i11++;
        }
        this.f10363e = i9 > 1;
    }
}
