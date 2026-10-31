package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.i */
/* loaded from: classes.dex */
public final class C1523i extends AbstractC1517d {
    public C1523i() {
        throw null;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeFloat(0.0f);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(bytes = 0.0)");
        return stringBuffer.toString();
    }
}
