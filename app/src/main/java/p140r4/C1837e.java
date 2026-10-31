package p140r4;

import android.util.SparseArray;
import p002a1.C0017d;

/* renamed from: r4.e */
/* loaded from: classes.dex */
public final class C1837e {

    /* renamed from: e */
    public final int f8304e;

    /* renamed from: f */
    public boolean f8305f;

    /* renamed from: d */
    public final float[] f8303d = new float[65536];

    /* renamed from: c */
    public final char[] f8302c = new char[10];

    /* renamed from: a */
    public final float[] f8300a = new float[10];

    /* renamed from: b */
    public final SparseArray<Float> f8301b = new SparseArray<>();

    public C1837e(int i7) {
        this.f8304e = i7;
    }

    /* renamed from: a */
    public final float m4325a(char c7, C1836d c1836d) {
        int i7;
        if (c7 == '\t') {
            c7 = ' ';
            i7 = this.f8304e;
        } else {
            i7 = 1;
        }
        float[] fArr = this.f8303d;
        float f7 = fArr[c7];
        if (f7 == 0.0f) {
            char[] cArr = this.f8302c;
            cArr[0] = c7;
            f7 = c1836d.measureText(cArr, 0, 1);
            fArr[c7] = f7;
        }
        return f7 * i7;
    }

    /* renamed from: b */
    public final float m4326b(int i7, C1836d c1836d) {
        if (i7 <= 65535) {
            return m4325a((char) i7, c1836d);
        }
        SparseArray<Float> sparseArray = this.f8301b;
        Float f7 = sparseArray.get(i7);
        if (f7 == null) {
            char[] cArr = this.f8302c;
            f7 = Float.valueOf(c1836d.measureText(cArr, 0, Character.toChars(i7, cArr, 0)));
            sparseArray.put(i7, f7);
        }
        return f7.floatValue();
    }

    /* renamed from: c */
    public final float m4327c(CharSequence charSequence, int i7, int i8, C1836d c1836d) {
        char[] cArr;
        float f7 = 0.0f;
        while (i7 < i8) {
            char charAt = charSequence.charAt(i7);
            if (charAt == 55356 || charAt == 55357 || charAt == 55358) {
                int i9 = i7 + 4;
                if (i9 <= i8) {
                    float[] fArr = this.f8300a;
                    c1836d.getTextWidths(charSequence, i7, i9, fArr);
                    float f8 = fArr[0];
                    if (f8 > 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f) {
                        i7 += 3;
                        f7 += f8;
                    }
                }
                int min = Math.min(i8, i7 + 2) - i7;
                int i10 = 0;
                while (true) {
                    cArr = this.f8302c;
                    if (i10 >= min) {
                        break;
                    }
                    cArr[i10] = charSequence.charAt(i7 + i10);
                    i10++;
                }
                i7 += min - 1;
                f7 = c1836d.measureText(cArr, 0, min) + f7;
            } else if (this.f8305f && C0017d.m65D(charAt)) {
                String m101z = C0017d.m101z(charAt);
                for (int i11 = 0; i11 < m101z.length(); i11++) {
                    f7 += m4325a(m101z.charAt(i11), c1836d);
                }
            } else {
                f7 = m4325a(charAt, c1836d) + f7;
            }
            i7++;
        }
        return f7;
    }

    /* renamed from: d */
    public final float m4328d(char[] cArr, int i7, C1836d c1836d) {
        int i8 = 0;
        float f7 = 0.0f;
        while (i8 < i7) {
            char c7 = cArr[i8];
            if (c7 == 55356 || c7 == 55357 || c7 == 55358) {
                if (i8 + 4 <= i7) {
                    float[] fArr = this.f8300a;
                    c1836d.getTextWidths(cArr, i8, 4, fArr);
                    float f8 = fArr[0];
                    if (f8 > 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f) {
                        i8 += 3;
                        f7 += f8;
                    }
                }
                int min = Math.min(i7, i8 + 2) - i8;
                char[] cArr2 = this.f8302c;
                if (min >= 0) {
                    System.arraycopy(cArr, i8, cArr2, 0, min);
                }
                i8 += min - 1;
                f7 = c1836d.measureText(cArr2, 0, min) + f7;
            } else if (this.f8305f && C0017d.m65D(c7)) {
                String m101z = C0017d.m101z(c7);
                for (int i9 = 0; i9 < m101z.length(); i9++) {
                    f7 += m4325a(m101z.charAt(i9), c1836d);
                }
            } else {
                f7 = m4325a(c7, c1836d) + f7;
            }
            i8++;
        }
        return f7;
    }
}
