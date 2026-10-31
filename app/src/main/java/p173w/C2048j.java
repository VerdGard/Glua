package p173w;

import androidx.lifecycle.C0391d0;

/* renamed from: w.j */
/* loaded from: classes.dex */
public final class C2048j {

    /* renamed from: k */
    public static final C2048j f9341k;

    /* renamed from: a */
    public final float f9342a;

    /* renamed from: b */
    public final float f9343b;

    /* renamed from: c */
    public final float f9344c;

    /* renamed from: d */
    public final float f9345d;

    /* renamed from: e */
    public final float f9346e;

    /* renamed from: f */
    public final float f9347f;

    /* renamed from: g */
    public final float[] f9348g;

    /* renamed from: h */
    public final float f9349h;

    /* renamed from: i */
    public final float f9350i;

    /* renamed from: j */
    public final float f9351j;

    static {
        float f7;
        float f8;
        float[] fArr = C0391d0.f1977m;
        float m1371r = (float) ((C0391d0.m1371r() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C0391d0.f1975k;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f9 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f7 = 0.100000046f;
            f8 = 0.59f;
        } else {
            f7 = 0.12999998f;
            f8 = 0.525f;
        }
        float f17 = f7 + f8;
        float exp = (1.0f - (((float) Math.exp(((-m1371r) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * m1371r) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(m1371r * 5.0d))) + (f19 * m1371r);
        float m1371r2 = C0391d0.m1371r() / fArr[1];
        double d8 = m1371r2;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), pow2};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        f9341k = new C2048j(m1371r2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f21 * 400.0f) / (f21 + 27.13f)) * 2.0f) + ((f22 * 400.0f) / (f22 + 27.13f))) * pow, pow, pow, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C2048j(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f9347f = f7;
        this.f9342a = f8;
        this.f9343b = f9;
        this.f9344c = f10;
        this.f9345d = f11;
        this.f9346e = f12;
        this.f9348g = fArr;
        this.f9349h = f13;
        this.f9350i = f14;
        this.f9351j = f15;
    }
}
