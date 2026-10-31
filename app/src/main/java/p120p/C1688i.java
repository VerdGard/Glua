package p120p;

import android.ext.C0089a;
import java.util.Arrays;
import p120p.C1681b;

/* renamed from: p.i */
/* loaded from: classes.dex */
public final class C1688i implements C1681b.a {

    /* renamed from: a */
    public int f7609a = 16;

    /* renamed from: b */
    public final int[] f7610b = new int[16];

    /* renamed from: c */
    public int[] f7611c = new int[16];

    /* renamed from: d */
    public int[] f7612d = new int[16];

    /* renamed from: e */
    public float[] f7613e = new float[16];

    /* renamed from: f */
    public int[] f7614f = new int[16];

    /* renamed from: g */
    public int[] f7615g = new int[16];

    /* renamed from: h */
    public int f7616h = 0;

    /* renamed from: i */
    public int f7617i = -1;

    /* renamed from: j */
    public final C1681b f7618j;

    /* renamed from: k */
    public final C1682c f7619k;

    public C1688i(C1681b c1681b, C1682c c1682c) {
        this.f7618j = c1681b;
        this.f7619k = c1682c;
        clear();
    }

    @Override // p120p.C1681b.a
    /* renamed from: a */
    public final float mo4065a(int i7) {
        int i8 = this.f7616h;
        int i9 = this.f7617i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f7613e[i9];
            }
            i9 = this.f7615g[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p120p.C1681b.a
    /* renamed from: b */
    public final float mo4066b(C1681b c1681b, boolean z6) {
        float mo4073i = mo4073i(c1681b.f7562a);
        mo4067c(c1681b.f7562a, z6);
        C1688i c1688i = (C1688i) c1681b.f7565d;
        int i7 = c1688i.f7616h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = c1688i.f7612d[i9];
            if (i10 != -1) {
                mo4070f(((C1687h[]) this.f7619k.f7570d)[i10], c1688i.f7613e[i9] * mo4073i, z6);
                i8++;
            }
            i9++;
        }
        return mo4073i;
    }

    @Override // p120p.C1681b.a
    /* renamed from: c */
    public final float mo4067c(C1687h c1687h, boolean z6) {
        int[] iArr;
        int i7;
        int m4116n = m4116n(c1687h);
        if (m4116n == -1) {
            return 0.0f;
        }
        int i8 = c1687h.f7598b;
        int i9 = i8 % 16;
        int[] iArr2 = this.f7610b;
        int i10 = iArr2[i9];
        if (i10 != -1) {
            if (this.f7612d[i10] == i8) {
                int[] iArr3 = this.f7611c;
                iArr2[i9] = iArr3[i10];
                iArr3[i10] = -1;
            } else {
                while (true) {
                    iArr = this.f7611c;
                    i7 = iArr[i10];
                    if (i7 == -1 || this.f7612d[i7] == i8) {
                        break;
                    }
                    i10 = i7;
                }
                if (i7 != -1 && this.f7612d[i7] == i8) {
                    iArr[i10] = iArr[i7];
                    iArr[i7] = -1;
                }
            }
        }
        float f7 = this.f7613e[m4116n];
        if (this.f7617i == m4116n) {
            this.f7617i = this.f7615g[m4116n];
        }
        this.f7612d[m4116n] = -1;
        int[] iArr4 = this.f7614f;
        int i11 = iArr4[m4116n];
        if (i11 != -1) {
            int[] iArr5 = this.f7615g;
            iArr5[i11] = iArr5[m4116n];
        }
        int i12 = this.f7615g[m4116n];
        if (i12 != -1) {
            iArr4[i12] = iArr4[m4116n];
        }
        this.f7616h--;
        c1687h.f7608l--;
        if (z6) {
            c1687h.m4111b(this.f7618j);
        }
        return f7;
    }

    @Override // p120p.C1681b.a
    public final void clear() {
        int i7 = this.f7616h;
        for (int i8 = 0; i8 < i7; i8++) {
            C1687h mo4072h = mo4072h(i8);
            if (mo4072h != null) {
                mo4072h.m4111b(this.f7618j);
            }
        }
        for (int i9 = 0; i9 < this.f7609a; i9++) {
            this.f7612d[i9] = -1;
            this.f7611c[i9] = -1;
        }
        for (int i10 = 0; i10 < 16; i10++) {
            this.f7610b[i10] = -1;
        }
        this.f7616h = 0;
        this.f7617i = -1;
    }

    @Override // p120p.C1681b.a
    /* renamed from: d */
    public final void mo4068d(C1687h c1687h, float f7) {
        if (f7 > -0.001f && f7 < 0.001f) {
            mo4067c(c1687h, true);
            return;
        }
        int i7 = 0;
        if (this.f7616h == 0) {
            m4115m(0, c1687h, f7);
            m4114l(c1687h, 0);
            this.f7617i = 0;
            return;
        }
        int m4116n = m4116n(c1687h);
        if (m4116n != -1) {
            this.f7613e[m4116n] = f7;
            return;
        }
        int i8 = this.f7616h + 1;
        int i9 = this.f7609a;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            this.f7612d = Arrays.copyOf(this.f7612d, i10);
            this.f7613e = Arrays.copyOf(this.f7613e, i10);
            this.f7614f = Arrays.copyOf(this.f7614f, i10);
            this.f7615g = Arrays.copyOf(this.f7615g, i10);
            this.f7611c = Arrays.copyOf(this.f7611c, i10);
            for (int i11 = this.f7609a; i11 < i10; i11++) {
                this.f7612d[i11] = -1;
                this.f7611c[i11] = -1;
            }
            this.f7609a = i10;
        }
        int i12 = this.f7616h;
        int i13 = this.f7617i;
        int i14 = -1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = this.f7612d[i13];
            int i17 = c1687h.f7598b;
            if (i16 == i17) {
                this.f7613e[i13] = f7;
                return;
            }
            if (i16 < i17) {
                i14 = i13;
            }
            i13 = this.f7615g[i13];
            if (i13 == -1) {
                break;
            }
        }
        while (true) {
            if (i7 >= this.f7609a) {
                i7 = -1;
                break;
            } else if (this.f7612d[i7] == -1) {
                break;
            } else {
                i7++;
            }
        }
        m4115m(i7, c1687h, f7);
        int[] iArr = this.f7614f;
        if (i14 != -1) {
            iArr[i7] = i14;
            int[] iArr2 = this.f7615g;
            iArr2[i7] = iArr2[i14];
            iArr2[i14] = i7;
        } else {
            iArr[i7] = -1;
            if (this.f7616h > 0) {
                this.f7615g[i7] = this.f7617i;
                this.f7617i = i7;
            } else {
                this.f7615g[i7] = -1;
            }
        }
        int i18 = this.f7615g[i7];
        if (i18 != -1) {
            this.f7614f[i18] = i7;
        }
        m4114l(c1687h, i7);
    }

    @Override // p120p.C1681b.a
    /* renamed from: e */
    public final boolean mo4069e(C1687h c1687h) {
        return m4116n(c1687h) != -1;
    }

    @Override // p120p.C1681b.a
    /* renamed from: f */
    public final void mo4070f(C1687h c1687h, float f7, boolean z6) {
        if (f7 <= -0.001f || f7 >= 0.001f) {
            int m4116n = m4116n(c1687h);
            if (m4116n == -1) {
                mo4068d(c1687h, f7);
                return;
            }
            float[] fArr = this.f7613e;
            float f8 = fArr[m4116n] + f7;
            fArr[m4116n] = f8;
            if (f8 <= -0.001f || f8 >= 0.001f) {
                return;
            }
            fArr[m4116n] = 0.0f;
            mo4067c(c1687h, z6);
        }
    }

    @Override // p120p.C1681b.a
    /* renamed from: g */
    public final int mo4071g() {
        return this.f7616h;
    }

    @Override // p120p.C1681b.a
    /* renamed from: h */
    public final C1687h mo4072h(int i7) {
        int i8 = this.f7616h;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f7617i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return ((C1687h[]) this.f7619k.f7570d)[this.f7612d[i9]];
            }
            i9 = this.f7615g[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p120p.C1681b.a
    /* renamed from: i */
    public final float mo4073i(C1687h c1687h) {
        int m4116n = m4116n(c1687h);
        if (m4116n != -1) {
            return this.f7613e[m4116n];
        }
        return 0.0f;
    }

    @Override // p120p.C1681b.a
    /* renamed from: j */
    public final void mo4074j(float f7) {
        int i7 = this.f7616h;
        int i8 = this.f7617i;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f7613e;
            fArr[i8] = fArr[i8] / f7;
            i8 = this.f7615g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // p120p.C1681b.a
    /* renamed from: k */
    public final void mo4075k() {
        int i7 = this.f7616h;
        int i8 = this.f7617i;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f7613e;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f7615g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void m4114l(C1687h c1687h, int i7) {
        int[] iArr;
        int i8 = c1687h.f7598b % 16;
        int[] iArr2 = this.f7610b;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f7611c;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i7;
        }
        this.f7611c[i7] = -1;
    }

    /* renamed from: m */
    public final void m4115m(int i7, C1687h c1687h, float f7) {
        this.f7612d[i7] = c1687h.f7598b;
        this.f7613e[i7] = f7;
        this.f7614f[i7] = -1;
        this.f7615g[i7] = -1;
        c1687h.m4110a(this.f7618j);
        c1687h.f7608l++;
        this.f7616h++;
    }

    /* renamed from: n */
    public final int m4116n(C1687h c1687h) {
        if (this.f7616h == 0) {
            return -1;
        }
        int i7 = c1687h.f7598b;
        int i8 = this.f7610b[i7 % 16];
        if (i8 == -1) {
            return -1;
        }
        if (this.f7612d[i8] == i7) {
            return i8;
        }
        do {
            i8 = this.f7611c[i8];
            if (i8 == -1) {
                break;
            }
        } while (this.f7612d[i8] != i7);
        if (i8 != -1 && this.f7612d[i8] == i7) {
            return i8;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb;
        String m210h;
        String str = hashCode() + " { ";
        int i7 = this.f7616h;
        for (int i8 = 0; i8 < i7; i8++) {
            C1687h mo4072h = mo4072h(i8);
            if (mo4072h != null) {
                String str2 = str + mo4072h + " = " + mo4065a(i8) + " ";
                int m4116n = m4116n(mo4072h);
                String m210h2 = C0089a.m210h(str2, "[p: ");
                int i9 = this.f7614f[m4116n];
                C1682c c1682c = this.f7619k;
                if (i9 != -1) {
                    sb = C1686g.m4107b(m210h2);
                    sb.append(((C1687h[]) c1682c.f7570d)[this.f7612d[this.f7614f[m4116n]]]);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m210h2);
                    sb2.append("none");
                    sb = sb2;
                }
                String m210h3 = C0089a.m210h(sb.toString(), ", n: ");
                if (this.f7615g[m4116n] != -1) {
                    StringBuilder m4107b = C1686g.m4107b(m210h3);
                    m4107b.append(((C1687h[]) c1682c.f7570d)[this.f7612d[this.f7615g[m4116n]]]);
                    m210h = m4107b.toString();
                } else {
                    m210h = C0089a.m210h(m210h3, "none");
                }
                str = C0089a.m210h(m210h, "]");
            }
        }
        return C0089a.m210h(str, " }");
    }
}
