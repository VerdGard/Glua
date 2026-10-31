package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.s */
/* loaded from: classes.dex */
public final class C1533s extends AbstractC1511a {

    /* renamed from: X */
    public int f7169X;

    /* renamed from: Y */
    public int[] f7170Y;

    public C1533s(int i7, int i8, int[] iArr, C1529o c1529o) {
        super((byte) 3, i7, i8, c1529o);
        this.f7170Y = iArr;
        this.f7169X = iArr.length;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(this.f7169X);
        for (int i7 = 0; i7 < this.f7169X; i7++) {
            dataOutputStream.writeShort(this.f7170Y[i7]);
        }
    }

    @Override // p096l6.AbstractC1511a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i7 = 0; i7 < this.f7169X; i7++) {
            stringBuffer.append(AbstractC1518d0.m3932b(this.f7140s.m3939d(this.f7170Y[i7]), false));
            if (i7 < this.f7169X - 1) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }
}
