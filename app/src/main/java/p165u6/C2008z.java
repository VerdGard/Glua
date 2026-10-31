package p165u6;

/* renamed from: u6.z */
/* loaded from: classes.dex */
public final class C2008z {

    /* renamed from: n */
    public static final C1982b0[] f9141n = new C1982b0[0];

    /* renamed from: o */
    public static final C2008z[] f9142o = new C2008z[0];

    /* renamed from: a */
    public AbstractC2003u[] f9143a;

    /* renamed from: b */
    public int[] f9144b;

    /* renamed from: d */
    public int[] f9146d;

    /* renamed from: e */
    public C1985d[] f9147e;

    /* renamed from: g */
    public C1998p f9149g;

    /* renamed from: h */
    public int f9150h;

    /* renamed from: i */
    public int f9151i;

    /* renamed from: j */
    public int f9152j;

    /* renamed from: k */
    public int f9153k;

    /* renamed from: l */
    public int f9154l;

    /* renamed from: m */
    public String f9155m;

    /* renamed from: c */
    public C2008z[] f9145c = f9142o;

    /* renamed from: f */
    public C1982b0[] f9148f = f9141n;

    /* renamed from: a */
    public final C1998p m4892a(int i7, int i8) {
        int i9 = 0;
        while (true) {
            C1985d[] c1985dArr = this.f9147e;
            if (i9 >= c1985dArr.length) {
                return null;
            }
            C1985d c1985d = c1985dArr[i9];
            if (c1985d.f8987b > i8) {
                return null;
            }
            if (i8 < c1985d.f8988c && i7 - 1 == 0) {
                return c1985d.f8986a;
            }
            i9++;
        }
    }

    /* renamed from: b */
    public final String m4893b() {
        C1998p c1998p = this.f9149g;
        if (c1998p == null) {
            return "";
        }
        String mo4645M = c1998p.mo4645M();
        return (mo4645M.startsWith("@") || mo4645M.startsWith("=")) ? mo4645M.substring(1) : mo4645M.startsWith("\u001b") ? "binary string" : mo4645M;
    }

    public final String toString() {
        return this.f9149g + ":" + this.f9150h + "-" + this.f9151i;
    }
}
