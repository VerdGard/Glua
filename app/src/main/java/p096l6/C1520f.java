package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.f */
/* loaded from: classes.dex */
public final class C1520f extends AbstractC1517d {

    /* renamed from: m */
    public final int f7160m;

    public C1520f(int i7) {
        super((byte) 7);
        this.f7160m = i7;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeShort(this.f7160m);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(name_index = ");
        stringBuffer.append(this.f7160m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
