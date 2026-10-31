package p104m6;

/* renamed from: m6.m0 */
/* loaded from: classes.dex */
public final class C1593m0 extends AbstractC1584j0 {

    /* renamed from: X */
    public final /* synthetic */ int f7367X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593m0(int i7, int i8) {
        super((short) 178, i7, 0);
        this.f7367X = i8;
        if (i8 != 1) {
        } else {
            super((short) 181, i7, 0);
        }
    }

    @Override // p104m6.AbstractC1584j0, p104m6.AbstractC1630z0
    /* renamed from: a */
    public final int mo3969a(C1610s c1610s) {
        switch (this.f7367X) {
            case 1:
                return m3971h(c1610s) + 1;
            default:
                return super.mo3969a(c1610s);
        }
    }

    @Override // p104m6.AbstractC1584j0, p104m6.AbstractC1630z0
    /* renamed from: d */
    public final int mo3970d(C1610s c1610s) {
        switch (this.f7367X) {
            case 0:
                return m3971h(c1610s);
            default:
                return super.mo3970d(c1610s);
        }
    }
}
