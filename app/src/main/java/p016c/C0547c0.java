package p016c;

/* renamed from: c.c0 */
/* loaded from: classes.dex */
public final class C0547c0 {

    /* renamed from: d */
    public static C0547c0 f2735d;

    /* renamed from: a */
    public long f2736a;

    /* renamed from: b */
    public long f2737b;

    /* renamed from: c */
    public int f2738c;

    /* renamed from: a */
    public final void m1885a(long j7, double d7, double d8) {
        double d9 = (0.01720197f * ((j7 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d8) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d7;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f2738c = 1;
        } else {
            if (sin3 > -1.0d) {
                double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
                this.f2736a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
                long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
                this.f2737b = round;
                if (round >= j7 || this.f2736a <= j7) {
                    this.f2738c = 1;
                    return;
                } else {
                    this.f2738c = 0;
                    return;
                }
            }
            this.f2738c = 0;
        }
        this.f2736a = -1L;
        this.f2737b = -1L;
    }
}
