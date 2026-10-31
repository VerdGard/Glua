package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.j */
/* loaded from: classes.dex */
public final class C1524j extends AbstractC1517d {

    /* renamed from: m */
    public final int f7162m;

    public C1524j(int i7) {
        super((byte) 3);
        this.f7162m = i7;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeInt(this.f7162m);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(bytes = ");
        stringBuffer.append(this.f7162m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
