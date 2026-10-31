package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.n */
/* loaded from: classes.dex */
public final class C1528n extends AbstractC1517d {

    /* renamed from: m */
    public final int f7163m;

    /* renamed from: s */
    public final int f7164s;

    public C1528n(int i7, int i8) {
        super((byte) 12);
        this.f7163m = i7;
        this.f7164s = i8;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeShort(this.f7163m);
        dataOutputStream.writeShort(this.f7164s);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(name_index = ");
        stringBuffer.append(this.f7163m);
        stringBuffer.append(", signature_index = ");
        stringBuffer.append(this.f7164s);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
