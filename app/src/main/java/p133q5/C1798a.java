package p133q5;

/* renamed from: q5.a */
/* loaded from: classes.dex */
public final class C1798a extends AbstractC1802e {

    /* renamed from: X */
    public static final /* synthetic */ int f8169X = 0;

    /* renamed from: s */
    public final double f8170s;

    public C1798a(double d7) {
        this.f8170s = d7;
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: A */
    public final String mo4251A() {
        double d7 = this.f8170s;
        long j7 = (long) d7;
        return ((double) j7) == d7 ? Long.toString(j7) : Double.isNaN(d7) ? "nan" : Double.isInfinite(d7) ? d7 < 0.0d ? "-inf" : "inf" : Double.toString(d7);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1798a) && ((C1798a) obj).f8170s == this.f8170s;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f8170s + 1.0d);
        return ((int) (doubleToLongBits >> 32)) + ((int) doubleToLongBits);
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: y */
    public final long mo4252y() {
        return (long) this.f8170s;
    }

    @Override // p133q5.AbstractC1804g
    /* renamed from: z */
    public final double mo4253z() {
        return this.f8170s;
    }
}
