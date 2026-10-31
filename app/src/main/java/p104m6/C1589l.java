package p104m6;

import java.io.DataOutputStream;

/* renamed from: m6.l */
/* loaded from: classes.dex */
public final class C1589l extends AbstractC1630z0 implements InterfaceC1613t {

    /* renamed from: m */
    public final byte f7361m;

    public C1589l(byte b7) {
        super((short) 16, (short) 2);
        this.f7361m = b7;
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeByte(this.f7361m);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.mo3973e(z6));
        stringBuffer.append(" ");
        stringBuffer.append((int) this.f7361m);
        return stringBuffer.toString();
    }

    @Override // p104m6.InterfaceC1613t
    public final Number getValue() {
        return new Integer(this.f7361m);
    }
}
