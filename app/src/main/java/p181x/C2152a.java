package p181x;

import android.graphics.Color;

/* renamed from: x.a */
/* loaded from: classes.dex */
public final class C2152a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f9762a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m5262a(double d7, double d8, double d9) {
        double d10 = (((-0.4986d) * d9) + (((-1.5372d) * d8) + (3.2406d * d7))) / 100.0d;
        double d11 = ((0.0415d * d9) + ((1.8758d * d8) + ((-0.9689d) * d7))) / 100.0d;
        double d12 = ((1.057d * d9) + (((-0.204d) * d8) + (0.0557d * d7))) / 100.0d;
        double pow = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double pow2 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double pow3 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    /* renamed from: b */
    public static double m5263b(int i7) {
        ThreadLocal<double[]> threadLocal = f9762a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d7 = red / 255.0d;
        double pow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = green / 255.0d;
        double pow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = blue / 255.0d;
        double pow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d10 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d10;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d10 / 100.0d;
    }

    /* renamed from: c */
    public static int m5264c(int i7, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i7);
        int i9 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i9, m5265d(Color.red(i7), alpha2, Color.red(i8), alpha, i9), m5265d(Color.green(i7), alpha2, Color.green(i8), alpha, i9), m5265d(Color.blue(i7), alpha2, Color.blue(i8), alpha, i9));
    }

    /* renamed from: d */
    public static int m5265d(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i8) * (i9 * i10)) + ((i7 * 255) * i8)) / (i11 * 255);
    }

    /* renamed from: e */
    public static int m5266e(int i7, int i8) {
        if (i8 < 0 || i8 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & 16777215) | (i8 << 24);
    }
}
