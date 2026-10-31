package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.x */
/* loaded from: classes.dex */
public final class C1538x extends AbstractC1511a {

    /* renamed from: X */
    public int f7193X;

    /* renamed from: Y */
    public C1537w[] f7194Y;

    public C1538x(int i7, int i8, C1537w[] c1537wArr, C1529o c1529o) {
        super((byte) 4, i7, i8, c1529o);
        this.f7194Y = c1537wArr;
        this.f7193X = c1537wArr.length;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(this.f7193X);
        for (int i7 = 0; i7 < this.f7193X; i7++) {
            C1537w c1537w = this.f7194Y[i7];
            dataOutputStream.writeShort(c1537w.f7191c);
            dataOutputStream.writeShort(c1537w.f7192e);
        }
    }

    @Override // p096l6.AbstractC1511a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        String property = System.getProperty("line.separator", "\n");
        for (int i7 = 0; i7 < this.f7193X; i7++) {
            stringBuffer2.append(this.f7194Y[i7].toString());
            if (i7 < this.f7193X - 1) {
                stringBuffer2.append(", ");
            }
            if (stringBuffer2.length() > 72) {
                stringBuffer2.append(property);
                stringBuffer.append(stringBuffer2.toString());
                stringBuffer2.setLength(0);
            }
        }
        stringBuffer.append(stringBuffer2);
        return stringBuffer.toString();
    }
}
