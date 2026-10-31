package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.f1 */
/* loaded from: classes.dex */
public final class C1573f1 extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final long f7349m;

    public C1573f1(long j7) {
        super((short) 9, (short) 1);
        if (j7 == 0) {
            this.f7437e = (short) 9;
        } else {
            if (j7 != 1) {
                StringBuffer stringBuffer = new StringBuffer("LCONST can be used only for 0 and 1: ");
                stringBuffer.append(j7);
                throw new C1101u4(stringBuffer.toString());
            }
            this.f7437e = (short) 10;
        }
        this.f7349m = j7;
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Long(this.f7349m);
    }
}
