package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.z */
/* loaded from: classes.dex */
public final class C1540z extends AbstractC1511a {

    /* renamed from: X */
    public int f7201X;

    /* renamed from: Y */
    public C1539y[] f7202Y;

    public C1540z(int i7, int i8, C1539y[] c1539yArr, C1529o c1529o) {
        super((byte) 5, i7, i8, c1529o);
        this.f7202Y = c1539yArr;
        this.f7201X = c1539yArr.length;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(this.f7201X);
        for (int i7 = 0; i7 < this.f7201X; i7++) {
            C1539y c1539y = this.f7202Y[i7];
            dataOutputStream.writeShort(c1539y.f7197c);
            dataOutputStream.writeShort(c1539y.f7198e);
            dataOutputStream.writeShort(c1539y.f7199m);
            dataOutputStream.writeShort(c1539y.f7200s);
            dataOutputStream.writeShort(c1539y.f7195X);
        }
    }

    @Override // p096l6.AbstractC1511a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i7 = 0; i7 < this.f7201X; i7++) {
            stringBuffer.append(this.f7202Y[i7].toString());
            if (i7 < this.f7201X - 1) {
                stringBuffer.append('\n');
            }
        }
        return stringBuffer.toString();
    }
}
