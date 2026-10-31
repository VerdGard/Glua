package p031d5;

import p002a1.C0017d;

/* renamed from: d5.c */
/* loaded from: classes.dex */
public final class C0892c {

    /* renamed from: a */
    public final long[] f4677a;

    /* renamed from: b */
    public int f4678b;

    public C0892c(long[] jArr, int i7) {
        this.f4677a = jArr;
        this.f4678b = i7;
    }

    /* renamed from: a */
    public final int m2597a(int i7) {
        return i7 == this.f4677a.length + (-1) ? this.f4678b : m2598b(i7 + 1);
    }

    /* renamed from: b */
    public final int m2598b(int i7) {
        return (int) (this.f4677a[i7] >> 32);
    }

    /* renamed from: c */
    public final boolean m2599c(int i7) {
        return C0017d.m62A(this.f4677a[i7]) == 1;
    }
}
