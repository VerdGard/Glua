package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.l */
/* loaded from: classes.dex */
public final class C1526l extends AbstractC1517d {
    public C1526l() {
        throw null;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeLong(0L);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(bytes = 0)");
        return stringBuffer.toString();
    }
}
