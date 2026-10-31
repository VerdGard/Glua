package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.p */
/* loaded from: classes.dex */
public final class C1530p extends AbstractC1517d {

    /* renamed from: m */
    public final int f7167m;

    public C1530p(int i7) {
        super((byte) 8);
        this.f7167m = i7;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeShort(this.f7167m);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(string_index = ");
        stringBuffer.append(this.f7167m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
