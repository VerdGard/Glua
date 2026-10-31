package p165u6;

/* renamed from: u6.f */
/* loaded from: classes.dex */
public final class C1988f extends AbstractC2003u {

    /* renamed from: d2 */
    public static final C1988f f9003d2 = new C1988f(true);

    /* renamed from: e2 */
    public static final C1988f f9004e2 = new C1988f(false);

    /* renamed from: f2 */
    public static C1999q f9005f2;

    /* renamed from: c2 */
    public final boolean f9006c2;

    public C1988f(boolean z6) {
        this.f9006c2 = z6;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: A1 */
    public final boolean mo4680A1(boolean z6) {
        return this.f9006c2;
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return this.f9006c2 ? "true" : "false";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return f9005f2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m2 */
    public final boolean mo4682m2() {
        return this.f9006c2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 1;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "boolean";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: y1 */
    public final C1988f mo4683y1() {
        return this.f9006c2 ? AbstractC2003u.f9122X : AbstractC2003u.f9131s;
    }
}
