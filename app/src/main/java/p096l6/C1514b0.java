package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.b0 */
/* loaded from: classes.dex */
public final class C1514b0 extends AbstractC1511a {

    /* renamed from: X */
    public final int f7150X;

    public C1514b0(int i7, int i8, C1529o c1529o) {
        super((byte) 0, i7, 2, c1529o);
        this.f7150X = i8;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(this.f7150X);
    }

    @Override // p096l6.AbstractC1511a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("SourceFile(");
        stringBuffer.append(((C1531q) this.f7140s.m3937b((byte) 1, this.f7150X)).f7168m);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
