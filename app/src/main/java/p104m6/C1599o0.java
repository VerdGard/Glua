package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.o0 */
/* loaded from: classes.dex */
public final class C1599o0 extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final int f7388m;

    public C1599o0(int i7) {
        super((short) 3, (short) 1);
        if (i7 < -1 || i7 > 5) {
            StringBuffer stringBuffer = new StringBuffer("ICONST can be used only for value between -1 and 5: ");
            stringBuffer.append(i7);
            throw new C1101u4(stringBuffer.toString());
        }
        this.f7437e = (short) (i7 + 3);
        this.f7388m = i7;
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Integer(this.f7388m);
    }
}
