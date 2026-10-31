package p194y4;

/* renamed from: y4.b */
/* loaded from: classes.dex */
public final class C2250b implements Comparable<C2250b> {

    /* renamed from: X */
    public final short f10262X = 3;

    /* renamed from: c */
    public final long f10263c = 0;

    /* renamed from: e */
    public final C2249a f10264e;

    /* renamed from: m */
    public int f10265m;

    /* renamed from: s */
    public int f10266s;

    public C2250b(int i7, int i8, C2249a c2249a) {
        this.f10265m = i7;
        this.f10266s = i8;
        this.f10264e = c2249a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2250b c2250b) {
        C2250b c2250b2 = c2250b;
        int compare = Integer.compare(this.f10265m, c2250b2.f10265m);
        if (compare == 0) {
            compare = Integer.compare(this.f10266s, c2250b2.f10266s);
        }
        if (compare == 0) {
            compare = Short.compare(this.f10262X, c2250b2.f10262X);
        }
        return compare == 0 ? Long.compare(this.f10263c, c2250b2.f10263c) : compare;
    }
}
