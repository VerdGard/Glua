package p140r4;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Build;
import java.util.Arrays;
import p002a1.C0017d;
import p022c5.C0642f;

/* renamed from: r4.d */
/* loaded from: classes.dex */
public final class C1836d extends Paint {

    /* renamed from: a */
    public float f8296a = measureText(" ");

    /* renamed from: b */
    public float f8297b = measureText("\t");

    /* renamed from: c */
    public boolean f8298c;

    /* renamed from: d */
    public C1837e f8299d;

    public C1836d(boolean z6) {
        this.f8298c = z6;
    }

    /* renamed from: a */
    public final int m4321a(C0642f c0642f, int i7, int i8, float f7) {
        return Build.VERSION.SDK_INT >= 23 ? getOffsetForAdvance(c0642f.f3159c, i7, i8, i7, i8, false, f7) : breakText(c0642f.f3159c, i7, i8 - i7, f7, null) + i7;
    }

    /* renamed from: b */
    public final int m4322b(C0642f c0642f, int i7, int i8, float f7, boolean z6) {
        float m4325a;
        int i9;
        float f8 = 0.0f;
        if (!z6) {
            int i10 = i7;
            if (!this.f8298c) {
                return m4321a(c0642f, i7, i8, f7);
            }
            char[] cArr = c0642f.f3159c;
            int i11 = i10;
            float f9 = 0.0f;
            while (i11 < i8) {
                char c7 = cArr[i11];
                if (C0017d.m65D(c7)) {
                    int m4321a = i10 == i11 ? i11 : m4321a(c0642f, i10, i11, f7 - f9);
                    if (m4321a < i11) {
                        return m4321a;
                    }
                    int i12 = i11 - i10;
                    float measureText = measureText(C0017d.m101z(c7)) + f9 + m4323c(cArr, i10, i12, i10, i12, false, null, 0, false);
                    if (measureText >= f7) {
                        return i11;
                    }
                    f9 = measureText;
                    i10 = i11 + 1;
                }
                i11++;
            }
            return i10 < i8 ? m4321a(c0642f, i10, i8, f7 - f9) : i8;
        }
        if (this.f8299d == null) {
            this.f8299d = new C1837e(1);
        }
        char[] cArr2 = c0642f.f3159c;
        int i13 = i7;
        while (i13 < i8) {
            char c8 = cArr2[i13];
            if (Character.isHighSurrogate(c8) && (i9 = i13 + 1) < i8 && Character.isLowSurrogate(cArr2[i9])) {
                m4325a = this.f8299d.m4326b(Character.toCodePoint(c8, cArr2[i9]), this);
            } else {
                if (this.f8298c && C0017d.m65D(c8)) {
                    C1837e c1837e = this.f8299d;
                    String m101z = C0017d.m101z(c8);
                    c1837e.getClass();
                    m4325a = c1837e.m4327c(m101z, 0, m101z.length(), this);
                } else {
                    m4325a = c8 == '\t' ? this.f8297b : this.f8299d.m4325a(c8, this);
                }
                i9 = i13;
            }
            f8 += m4325a;
            if (f8 > f7) {
                return Math.max(i7, i13 - 1);
            }
            i13 = i9 + 1;
        }
        return i8;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final float m4323c(char[] cArr, int i7, int i8, int i9, int i10, boolean z6, float[] fArr, int i11, boolean z7) {
        float measureText;
        float m4325a;
        int i12;
        if (!z7) {
            float textRunAdvances = getTextRunAdvances(cArr, i7, i8, i9, i10, z6, fArr, i11);
            if (this.f8298c) {
                for (int i13 = 0; i13 < i8; i13++) {
                    char c7 = cArr[i7 + i13];
                    if (C0017d.m65D(c7)) {
                        float measureText2 = measureText(C0017d.m101z(c7));
                        if (fArr != null) {
                            int i14 = i11 + i13;
                            measureText = textRunAdvances - fArr[i14];
                            fArr[i14] = measureText2;
                        } else {
                            measureText = textRunAdvances - measureText(Character.toString(c7));
                        }
                        textRunAdvances = measureText + measureText2;
                    }
                }
            }
            return textRunAdvances;
        }
        if (this.f8299d == null) {
            this.f8299d = new C1837e(1);
        }
        int i15 = 0;
        float f7 = 0.0f;
        while (i15 < i8) {
            int i16 = i15 + i7;
            char c8 = cArr[i16];
            if (Character.isHighSurrogate(c8) && (i12 = i15 + 1) < i8) {
                int i17 = i16 + 1;
                if (Character.isLowSurrogate(cArr[i17])) {
                    m4325a = this.f8299d.m4326b(Character.toCodePoint(c8, cArr[i17]), this);
                    if (fArr != null) {
                        int i18 = i15 + i11;
                        fArr[i18] = m4325a;
                        fArr[i18 + 1] = 0.0f;
                    }
                    i15 = i12;
                    f7 += m4325a;
                    i15++;
                }
            }
            if (this.f8298c && C0017d.m65D(c8)) {
                C1837e c1837e = this.f8299d;
                String m101z = C0017d.m101z(c8);
                c1837e.getClass();
                m4325a = c1837e.m4327c(m101z, 0, m101z.length(), this);
                if (fArr != null) {
                    fArr[i11 + i15] = m4325a;
                }
            } else {
                m4325a = c8 == '\t' ? this.f8297b : this.f8299d.m4325a(c8, this);
                if (fArr != null) {
                    fArr[i11 + i15] = m4325a;
                }
            }
            f7 += m4325a;
            i15++;
        }
        return f7;
    }

    /* renamed from: d */
    public final void m4324d() {
        this.f8296a = measureText(" ");
        this.f8297b = measureText("\t");
        C1837e c1837e = this.f8299d;
        if (c1837e != null) {
            Arrays.fill(c1837e.f8303d, 0.0f);
            c1837e.f8301b.clear();
        }
    }

    @Override // android.graphics.Paint
    public final void setLetterSpacing(float f7) {
        super.setLetterSpacing(f7);
        m4324d();
    }
}
