package p120p;

import android.ext.C0089a;
import java.util.Arrays;
import p120p.C1681b;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C1680a implements C1681b.a {

    /* renamed from: b */
    public final C1681b f7553b;

    /* renamed from: c */
    public final C1682c f7554c;

    /* renamed from: a */
    public int f7552a = 0;

    /* renamed from: d */
    public int f7555d = 8;

    /* renamed from: e */
    public int[] f7556e = new int[8];

    /* renamed from: f */
    public int[] f7557f = new int[8];

    /* renamed from: g */
    public float[] f7558g = new float[8];

    /* renamed from: h */
    public int f7559h = -1;

    /* renamed from: i */
    public int f7560i = -1;

    /* renamed from: j */
    public boolean f7561j = false;

    public C1680a(C1681b c1681b, C1682c c1682c) {
        this.f7553b = c1681b;
        this.f7554c = c1682c;
    }

    @Override // p120p.C1681b.a
    /* renamed from: a */
    public final float mo4065a(int i7) {
        int i8 = this.f7559h;
        for (int i9 = 0; i8 != -1 && i9 < this.f7552a; i9++) {
            if (i9 == i7) {
                return this.f7558g[i8];
            }
            i8 = this.f7557f[i8];
        }
        return 0.0f;
    }

    @Override // p120p.C1681b.a
    /* renamed from: b */
    public final float mo4066b(C1681b c1681b, boolean z6) {
        float mo4073i = mo4073i(c1681b.f7562a);
        mo4067c(c1681b.f7562a, z6);
        C1681b.a aVar = c1681b.f7565d;
        int mo4071g = aVar.mo4071g();
        for (int i7 = 0; i7 < mo4071g; i7++) {
            C1687h mo4072h = aVar.mo4072h(i7);
            mo4070f(mo4072h, aVar.mo4073i(mo4072h) * mo4073i, z6);
        }
        return mo4073i;
    }

    @Override // p120p.C1681b.a
    /* renamed from: c */
    public final float mo4067c(C1687h c1687h, boolean z6) {
        int i7 = this.f7559h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f7552a) {
            if (this.f7556e[i7] == c1687h.f7598b) {
                if (i7 == this.f7559h) {
                    this.f7559h = this.f7557f[i7];
                } else {
                    int[] iArr = this.f7557f;
                    iArr[i9] = iArr[i7];
                }
                if (z6) {
                    c1687h.m4111b(this.f7553b);
                }
                c1687h.f7608l--;
                this.f7552a--;
                this.f7556e[i7] = -1;
                if (this.f7561j) {
                    this.f7560i = i7;
                }
                return this.f7558g[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f7557f[i7];
        }
        return 0.0f;
    }

    @Override // p120p.C1681b.a
    public final void clear() {
        int i7 = this.f7559h;
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            C1687h c1687h = ((C1687h[]) this.f7554c.f7570d)[this.f7556e[i7]];
            if (c1687h != null) {
                c1687h.m4111b(this.f7553b);
            }
            i7 = this.f7557f[i7];
        }
        this.f7559h = -1;
        this.f7560i = -1;
        this.f7561j = false;
        this.f7552a = 0;
    }

    @Override // p120p.C1681b.a
    /* renamed from: d */
    public final void mo4068d(C1687h c1687h, float f7) {
        if (f7 == 0.0f) {
            mo4067c(c1687h, true);
            return;
        }
        int i7 = this.f7559h;
        C1681b c1681b = this.f7553b;
        if (i7 == -1) {
            this.f7559h = 0;
            this.f7558g[0] = f7;
            this.f7556e[0] = c1687h.f7598b;
            this.f7557f[0] = -1;
            c1687h.f7608l++;
            c1687h.m4110a(c1681b);
            this.f7552a++;
            if (this.f7561j) {
                return;
            }
            int i8 = this.f7560i + 1;
            this.f7560i = i8;
            int[] iArr = this.f7556e;
            if (i8 >= iArr.length) {
                this.f7561j = true;
                this.f7560i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f7552a; i10++) {
            int i11 = this.f7556e[i7];
            int i12 = c1687h.f7598b;
            if (i11 == i12) {
                this.f7558g[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f7557f[i7];
        }
        int i13 = this.f7560i;
        int i14 = i13 + 1;
        if (this.f7561j) {
            int[] iArr2 = this.f7556e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f7556e;
        if (i13 >= iArr3.length && this.f7552a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f7556e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f7556e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f7555d * 2;
            this.f7555d = i16;
            this.f7561j = false;
            this.f7560i = i13 - 1;
            this.f7558g = Arrays.copyOf(this.f7558g, i16);
            this.f7556e = Arrays.copyOf(this.f7556e, this.f7555d);
            this.f7557f = Arrays.copyOf(this.f7557f, this.f7555d);
        }
        this.f7556e[i13] = c1687h.f7598b;
        this.f7558g[i13] = f7;
        int[] iArr6 = this.f7557f;
        if (i9 != -1) {
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            iArr6[i13] = this.f7559h;
            this.f7559h = i13;
        }
        c1687h.f7608l++;
        c1687h.m4110a(c1681b);
        int i17 = this.f7552a + 1;
        this.f7552a = i17;
        if (!this.f7561j) {
            this.f7560i++;
        }
        int[] iArr7 = this.f7556e;
        if (i17 >= iArr7.length) {
            this.f7561j = true;
        }
        if (this.f7560i >= iArr7.length) {
            this.f7561j = true;
            this.f7560i = iArr7.length - 1;
        }
    }

    @Override // p120p.C1681b.a
    /* renamed from: e */
    public final boolean mo4069e(C1687h c1687h) {
        int i7 = this.f7559h;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            if (this.f7556e[i7] == c1687h.f7598b) {
                return true;
            }
            i7 = this.f7557f[i7];
        }
        return false;
    }

    @Override // p120p.C1681b.a
    /* renamed from: f */
    public final void mo4070f(C1687h c1687h, float f7, boolean z6) {
        if (f7 <= -0.001f || f7 >= 0.001f) {
            int i7 = this.f7559h;
            C1681b c1681b = this.f7553b;
            if (i7 == -1) {
                this.f7559h = 0;
                this.f7558g[0] = f7;
                this.f7556e[0] = c1687h.f7598b;
                this.f7557f[0] = -1;
                c1687h.f7608l++;
                c1687h.m4110a(c1681b);
                this.f7552a++;
                if (this.f7561j) {
                    return;
                }
                int i8 = this.f7560i + 1;
                this.f7560i = i8;
                int[] iArr = this.f7556e;
                if (i8 >= iArr.length) {
                    this.f7561j = true;
                    this.f7560i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f7552a; i10++) {
                int i11 = this.f7556e[i7];
                int i12 = c1687h.f7598b;
                if (i11 == i12) {
                    float[] fArr = this.f7558g;
                    float f8 = fArr[i7] + f7;
                    if (f8 > -0.001f && f8 < 0.001f) {
                        f8 = 0.0f;
                    }
                    fArr[i7] = f8;
                    if (f8 == 0.0f) {
                        if (i7 == this.f7559h) {
                            this.f7559h = this.f7557f[i7];
                        } else {
                            int[] iArr2 = this.f7557f;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z6) {
                            c1687h.m4111b(c1681b);
                        }
                        if (this.f7561j) {
                            this.f7560i = i7;
                        }
                        c1687h.f7608l--;
                        this.f7552a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f7557f[i7];
            }
            int i13 = this.f7560i;
            int i14 = i13 + 1;
            if (this.f7561j) {
                int[] iArr3 = this.f7556e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f7556e;
            if (i13 >= iArr4.length && this.f7552a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f7556e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f7556e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f7555d * 2;
                this.f7555d = i16;
                this.f7561j = false;
                this.f7560i = i13 - 1;
                this.f7558g = Arrays.copyOf(this.f7558g, i16);
                this.f7556e = Arrays.copyOf(this.f7556e, this.f7555d);
                this.f7557f = Arrays.copyOf(this.f7557f, this.f7555d);
            }
            this.f7556e[i13] = c1687h.f7598b;
            this.f7558g[i13] = f7;
            int[] iArr7 = this.f7557f;
            if (i9 != -1) {
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                iArr7[i13] = this.f7559h;
                this.f7559h = i13;
            }
            c1687h.f7608l++;
            c1687h.m4110a(c1681b);
            this.f7552a++;
            if (!this.f7561j) {
                this.f7560i++;
            }
            int i17 = this.f7560i;
            int[] iArr8 = this.f7556e;
            if (i17 >= iArr8.length) {
                this.f7561j = true;
                this.f7560i = iArr8.length - 1;
            }
        }
    }

    @Override // p120p.C1681b.a
    /* renamed from: g */
    public final int mo4071g() {
        return this.f7552a;
    }

    @Override // p120p.C1681b.a
    /* renamed from: h */
    public final C1687h mo4072h(int i7) {
        int i8 = this.f7559h;
        for (int i9 = 0; i8 != -1 && i9 < this.f7552a; i9++) {
            if (i9 == i7) {
                return ((C1687h[]) this.f7554c.f7570d)[this.f7556e[i8]];
            }
            i8 = this.f7557f[i8];
        }
        return null;
    }

    @Override // p120p.C1681b.a
    /* renamed from: i */
    public final float mo4073i(C1687h c1687h) {
        int i7 = this.f7559h;
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            if (this.f7556e[i7] == c1687h.f7598b) {
                return this.f7558g[i7];
            }
            i7 = this.f7557f[i7];
        }
        return 0.0f;
    }

    @Override // p120p.C1681b.a
    /* renamed from: j */
    public final void mo4074j(float f7) {
        int i7 = this.f7559h;
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            float[] fArr = this.f7558g;
            fArr[i7] = fArr[i7] / f7;
            i7 = this.f7557f[i7];
        }
    }

    @Override // p120p.C1681b.a
    /* renamed from: k */
    public final void mo4075k() {
        int i7 = this.f7559h;
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            float[] fArr = this.f7558g;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f7557f[i7];
        }
    }

    public final String toString() {
        int i7 = this.f7559h;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f7552a; i8++) {
            StringBuilder m4107b = C1686g.m4107b(C0089a.m210h(str, " -> "));
            m4107b.append(this.f7558g[i7]);
            m4107b.append(" : ");
            StringBuilder m4107b2 = C1686g.m4107b(m4107b.toString());
            m4107b2.append(((C1687h[]) this.f7554c.f7570d)[this.f7556e[i7]]);
            str = m4107b2.toString();
            i7 = this.f7557f[i7];
        }
        return str;
    }
}
