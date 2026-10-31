package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.j */
/* loaded from: classes.dex */
public final class C1583j extends AbstractC1612s1 {

    /* renamed from: E1 */
    public final int f7356E1;

    /* renamed from: F1 */
    public final AbstractC1624w1 f7357F1;

    public C1583j(AbstractC1624w1 abstractC1624w1, int i7) {
        super((byte) 13, "<dummy>");
        if (i7 < 1 || i7 > 255) {
            StringBuffer stringBuffer = new StringBuffer("Invalid number of dimensions: ");
            stringBuffer.append(i7);
            throw new C1101u4(stringBuffer.toString());
        }
        byte b7 = abstractC1624w1.f7433c;
        if (b7 == 12) {
            throw new C1101u4("Invalid type: void[]");
        }
        if (b7 != 13) {
            this.f7356E1 = i7;
        } else {
            C1583j c1583j = (C1583j) abstractC1624w1;
            this.f7356E1 = i7 + c1583j.f7356E1;
            abstractC1624w1 = c1583j.f7357F1;
        }
        this.f7357F1 = abstractC1624w1;
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i8 = 0; i8 < this.f7356E1; i8++) {
            stringBuffer2.append('[');
        }
        stringBuffer2.append(this.f7357F1.f7434e);
        this.f7434e = stringBuffer2.toString();
    }

    @Override // p104m6.AbstractC1624w1
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1583j)) {
            return false;
        }
        C1583j c1583j = (C1583j) obj;
        return c1583j.f7356E1 == this.f7356E1 && c1583j.f7357F1.equals(this.f7357F1);
    }

    @Override // p104m6.AbstractC1624w1
    public final int hashCode() {
        return this.f7357F1.hashCode() ^ this.f7356E1;
    }
}
