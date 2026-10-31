package p133q5;

import android.ext.Tools;

/* renamed from: q5.c */
/* loaded from: classes.dex */
public final class C1800c extends AbstractC1802e {

    /* renamed from: X */
    public static final C1800c[] f8174X = new C1800c[Tools.Semaphore.f161S9];

    /* renamed from: s */
    public final int f8175s;

    static {
        for (int i7 = 0; i7 < 512; i7++) {
            f8174X[i7] = new C1800c(i7 - 256);
        }
    }

    public C1800c(int i7) {
        this.f8175s = i7;
    }

    /* renamed from: B */
    public static C1800c m4254B(int i7) {
        return (i7 > 255 || i7 < -256) ? new C1800c(i7) : f8174X[i7 + Tools.Semaphore.f160S8];
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: A */
    public final String mo4251A() {
        return Integer.toString(this.f8175s);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1800c) && ((C1800c) obj).f8175s == this.f8175s;
    }

    public final int hashCode() {
        return this.f8175s;
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: y */
    public final long mo4252y() {
        return this.f8175s;
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: z */
    public final double mo4253z() {
        return this.f8175s;
    }
}
