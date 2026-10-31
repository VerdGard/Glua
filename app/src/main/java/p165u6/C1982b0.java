package p165u6;

/* renamed from: u6.b0 */
/* loaded from: classes.dex */
public final class C1982b0 {

    /* renamed from: a */
    public C1998p f8961a;

    /* renamed from: b */
    public final boolean f8962b;

    /* renamed from: c */
    public final short f8963c;

    public C1982b0(int i7, C1998p c1998p, boolean z6) {
        this.f8961a = c1998p;
        this.f8962b = z6;
        this.f8963c = (short) i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.f8963c);
        sb.append(this.f8962b ? " instack " : " closed ");
        sb.append(String.valueOf(this.f8961a));
        return sb.toString();
    }
}
