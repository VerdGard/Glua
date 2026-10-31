package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.g0 */
/* loaded from: classes.dex */
public final class C1575g0 extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final float f7350m;

    public C1575g0(float f7) {
        super((short) 11, (short) 1);
        short s7;
        double d7 = f7;
        if (d7 == 0.0d) {
            this.f7437e = (short) 11;
        } else {
            if (d7 == 1.0d) {
                s7 = 12;
            } else {
                if (d7 != 2.0d) {
                    StringBuffer stringBuffer = new StringBuffer("FCONST can be used only for 0.0, 1.0 and 2.0: ");
                    stringBuffer.append(f7);
                    throw new C1101u4(stringBuffer.toString());
                }
                s7 = 13;
            }
            this.f7437e = s7;
        }
        this.f7350m = f7;
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Float(this.f7350m);
    }
}
