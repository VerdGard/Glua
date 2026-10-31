package p104m6;

import java.io.DataOutputStream;

/* renamed from: m6.t1 */
/* loaded from: classes.dex */
public final class C1615t1 extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final short f7415m;

    public C1615t1(short s7) {
        super((short) 17, (short) 3);
        this.f7415m = s7;
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeShort(this.f7415m);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.mo3973e(z6));
        stringBuffer.append(" ");
        stringBuffer.append((int) this.f7415m);
        return stringBuffer.toString();
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Integer(this.f7415m);
    }
}
