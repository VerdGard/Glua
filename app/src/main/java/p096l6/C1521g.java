package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.g */
/* loaded from: classes.dex */
public final class C1521g extends AbstractC1517d {

    /* renamed from: m */
    public final double f7161m;

    public C1521g(double d7) {
        super((byte) 6);
        this.f7161m = d7;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeDouble(this.f7161m);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(bytes = ");
        stringBuffer.append(this.f7161m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
