package p035e1;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C0950b {

    /* renamed from: a */
    public final String f4900a;

    /* renamed from: b */
    public final String f4901b;

    /* renamed from: c */
    public final double f4902c;

    /* renamed from: d */
    public final int f4903d;

    /* renamed from: e */
    public final int f4904e;

    /* renamed from: f */
    public final double f4905f;

    /* renamed from: g */
    public final double f4906g;

    /* renamed from: h */
    public final int f4907h;

    /* renamed from: i */
    public final int f4908i;

    /* renamed from: j */
    public final int f4909j;

    /* renamed from: k */
    public final boolean f4910k;

    public C0950b(String str, String str2, double d7, int i7, int i8, double d8, double d9, int i9, int i10, int i11, boolean z6) {
        this.f4900a = str;
        this.f4901b = str2;
        this.f4902c = d7;
        this.f4903d = i7;
        this.f4904e = i8;
        this.f4905f = d8;
        this.f4906g = d9;
        this.f4907h = i9;
        this.f4908i = i10;
        this.f4909j = i11;
        this.f4910k = z6;
    }

    public final int hashCode() {
        int hashCode = (((((int) (((this.f4901b.hashCode() + (this.f4900a.hashCode() * 31)) * 31) + this.f4902c)) * 31) + this.f4903d) * 31) + this.f4904e;
        long doubleToLongBits = Double.doubleToLongBits(this.f4905f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f4907h;
    }
}
