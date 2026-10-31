package p173w;

import android.graphics.Color;
import androidx.lifecycle.C0391d0;
import p181x.C2152a;

/* renamed from: w.a */
/* loaded from: classes.dex */
public final class C2039a {

    /* renamed from: a */
    public final float f9302a;

    /* renamed from: b */
    public final float f9303b;

    /* renamed from: c */
    public final float f9304c;

    /* renamed from: d */
    public final float f9305d;

    /* renamed from: e */
    public final float f9306e;

    /* renamed from: f */
    public final float f9307f;

    public C2039a(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f9302a = f7;
        this.f9303b = f8;
        this.f9304c = f9;
        this.f9305d = f10;
        this.f9306e = f11;
        this.f9307f = f12;
    }

    /* renamed from: a */
    public static C2039a m5053a(int i7) {
        C2048j c2048j = C2048j.f9341k;
        float m1365l = C0391d0.m1365l(Color.red(i7));
        float m1365l2 = C0391d0.m1365l(Color.green(i7));
        float m1365l3 = C0391d0.m1365l(Color.blue(i7));
        float[][] fArr = C0391d0.f1978n;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * m1365l3) + (fArr2[1] * m1365l2) + (fArr2[0] * m1365l);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * m1365l3) + (fArr3[1] * m1365l2) + (fArr3[0] * m1365l);
        float[] fArr4 = fArr[2];
        float f9 = (m1365l3 * fArr4[2]) + (m1365l2 * fArr4[1]) + (m1365l * fArr4[0]);
        float[][] fArr5 = C0391d0.f1975k;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = c2048j.f9348g;
        float f13 = fArr9[0] * f10;
        float f14 = fArr9[1] * f11;
        float f15 = fArr9[2] * f12;
        float abs = Math.abs(f13);
        float f16 = c2048j.f9349h;
        float pow = (float) Math.pow((abs * f16) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f15) * f16) / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum3;
        float f17 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d7)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float f24 = f21 * c2048j.f9343b;
        float f25 = c2048j.f9342a;
        double d8 = f24 / f25;
        float f26 = c2048j.f9351j;
        float f27 = c2048j.f9345d;
        float pow4 = ((float) Math.pow(d8, f26 * f27)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f25 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c2048j.f9347f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f22) < 20.14d ? 360.0f + f22 : f22) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c2048j.f9346e) * c2048j.f9344c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f29 = c2048j.f9350i * pow5;
        Math.sqrt((r3 * f27) / f28);
        float f30 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f29 * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f23;
        return new C2039a(f22, pow5, pow4, f30, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    /* renamed from: b */
    public static C2039a m5054b(float f7, float f8, float f9) {
        C2048j c2048j = C2048j.f9341k;
        float f10 = c2048j.f9345d;
        Math.sqrt(f7 / 100.0d);
        float f11 = c2048j.f9342a + 4.0f;
        float f12 = c2048j.f9350i * f8;
        Math.sqrt(((f8 / ((float) Math.sqrt(r1))) * c2048j.f9345d) / f11);
        float f13 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((f12 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f9) / 180.0f;
        return new C2039a(f9, f8, f7, f13, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    /* renamed from: c */
    public final int m5055c(C2048j c2048j) {
        float f7;
        float f8 = this.f9303b;
        double d7 = f8;
        float f9 = this.f9304c;
        if (d7 != 0.0d) {
            double d8 = f9;
            if (d8 != 0.0d) {
                f7 = f8 / ((float) Math.sqrt(d8 / 100.0d));
                float pow = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, c2048j.f9347f), 0.73d), 1.1111111111111112d);
                double d9 = (this.f9302a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
                float pow2 = c2048j.f9342a * ((float) Math.pow(f9 / 100.0d, (1.0d / c2048j.f9345d) / c2048j.f9351j));
                float f10 = cos * 3846.1538f * c2048j.f9346e * c2048j.f9344c;
                float f11 = pow2 / c2048j.f9343b;
                float sin = (float) Math.sin(d9);
                float cos2 = (float) Math.cos(d9);
                float f12 = (((0.305f + f11) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f10 * 23.0f)));
                float f13 = cos2 * f12;
                float f14 = f12 * sin;
                float f15 = f11 * 460.0f;
                float f16 = ((288.0f * f14) + ((451.0f * f13) + f15)) / 1403.0f;
                float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
                float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16)));
                float signum = Math.signum(f16);
                float f19 = 100.0f / c2048j.f9349h;
                float pow3 = signum * f19 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f17) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum3 = Math.signum(f18) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float[] fArr = c2048j.f9348g;
                float f20 = pow3 / fArr[0];
                float f21 = signum2 / fArr[1];
                float f22 = signum3 / fArr[2];
                float[][] fArr2 = C0391d0.f1976l;
                float[] fArr3 = fArr2[0];
                float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
                float[] fArr4 = fArr2[1];
                float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr2[2];
                return C2152a.m5262a(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
            }
        }
        f7 = 0.0f;
        float pow4 = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, c2048j.f9347f), 0.73d), 1.1111111111111112d);
        double d92 = (this.f9302a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d92) + 3.8d)) * 0.25f;
        float pow22 = c2048j.f9342a * ((float) Math.pow(f9 / 100.0d, (1.0d / c2048j.f9345d) / c2048j.f9351j));
        float f102 = cos3 * 3846.1538f * c2048j.f9346e * c2048j.f9344c;
        float f112 = pow22 / c2048j.f9343b;
        float sin2 = (float) Math.sin(d92);
        float cos22 = (float) Math.cos(d92);
        float f122 = (((0.305f + f112) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f102 * 23.0f)));
        float f132 = cos22 * f122;
        float f142 = f122 * sin2;
        float f152 = f112 * 460.0f;
        float f162 = ((288.0f * f142) + ((451.0f * f132) + f152)) / 1403.0f;
        float f172 = ((f152 - (891.0f * f132)) - (261.0f * f142)) / 1403.0f;
        float f182 = ((f152 - (f132 * 220.0f)) - (f142 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162)));
        float signum4 = Math.signum(f162);
        float f192 = 100.0f / c2048j.f9349h;
        float pow32 = signum4 * f192 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f172) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum32 = Math.signum(f182) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float[] fArr6 = c2048j.f9348g;
        float f202 = pow32 / fArr6[0];
        float f212 = signum22 / fArr6[1];
        float f222 = signum32 / fArr6[2];
        float[][] fArr22 = C0391d0.f1976l;
        float[] fArr32 = fArr22[0];
        float f232 = (fArr32[2] * f222) + (fArr32[1] * f212) + (fArr32[0] * f202);
        float[] fArr42 = fArr22[1];
        float f242 = (fArr42[2] * f222) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr22[2];
        return C2152a.m5262a(f232, f242, (f222 * fArr52[2]) + (f212 * fArr52[1]) + (f202 * fArr52[0]));
    }
}
