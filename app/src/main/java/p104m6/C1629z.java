package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.z */
/* loaded from: classes.dex */
public final class C1629z extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final double f7435m;

    public C1629z(double d7) {
        super((short) 14, (short) 1);
        if (d7 == 0.0d) {
            this.f7437e = (short) 14;
        } else {
            if (d7 != 1.0d) {
                StringBuffer stringBuffer = new StringBuffer("DCONST can be used only for 0.0 and 1.0: ");
                stringBuffer.append(d7);
                throw new C1101u4(stringBuffer.toString());
            }
            this.f7437e = (short) 15;
        }
        this.f7435m = d7;
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Double(this.f7435m);
    }
}
