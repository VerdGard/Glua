package p120p;

import java.util.Arrays;

/* renamed from: p.h */
/* loaded from: classes.dex */
public final class C1687h {

    /* renamed from: a */
    public boolean f7597a;

    /* renamed from: e */
    public float f7601e;

    /* renamed from: i */
    public int f7605i;

    /* renamed from: b */
    public int f7598b = -1;

    /* renamed from: c */
    public int f7599c = -1;

    /* renamed from: d */
    public int f7600d = 0;

    /* renamed from: f */
    public boolean f7602f = false;

    /* renamed from: g */
    public final float[] f7603g = new float[9];

    /* renamed from: h */
    public final float[] f7604h = new float[9];

    /* renamed from: j */
    public C1681b[] f7606j = new C1681b[16];

    /* renamed from: k */
    public int f7607k = 0;

    /* renamed from: l */
    public int f7608l = 0;

    public C1687h(int i7) {
        this.f7605i = i7;
    }

    /* renamed from: a */
    public final void m4110a(C1681b c1681b) {
        int i7 = 0;
        while (true) {
            int i8 = this.f7607k;
            if (i7 >= i8) {
                C1681b[] c1681bArr = this.f7606j;
                if (i8 >= c1681bArr.length) {
                    this.f7606j = (C1681b[]) Arrays.copyOf(c1681bArr, c1681bArr.length * 2);
                }
                C1681b[] c1681bArr2 = this.f7606j;
                int i9 = this.f7607k;
                c1681bArr2[i9] = c1681b;
                this.f7607k = i9 + 1;
                return;
            }
            if (this.f7606j[i7] == c1681b) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* renamed from: b */
    public final void m4111b(C1681b c1681b) {
        int i7 = this.f7607k;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f7606j[i8] == c1681b) {
                while (i8 < i7 - 1) {
                    C1681b[] c1681bArr = this.f7606j;
                    int i9 = i8 + 1;
                    c1681bArr[i8] = c1681bArr[i9];
                    i8 = i9;
                }
                this.f7607k--;
                return;
            }
            i8++;
        }
    }

    /* renamed from: c */
    public final void m4112c() {
        this.f7605i = 5;
        this.f7600d = 0;
        this.f7598b = -1;
        this.f7599c = -1;
        this.f7601e = 0.0f;
        this.f7602f = false;
        int i7 = this.f7607k;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f7606j[i8] = null;
        }
        this.f7607k = 0;
        this.f7608l = 0;
        this.f7597a = false;
        Arrays.fill(this.f7604h, 0.0f);
    }

    /* renamed from: d */
    public final void m4113d(C1681b c1681b) {
        int i7 = this.f7607k;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f7606j[i8].mo4084i(c1681b, false);
        }
        this.f7607k = 0;
    }

    public final String toString() {
        return "" + this.f7598b;
    }
}
