package p104m6;

import java.io.DataOutputStream;
import java.util.HashSet;

/* renamed from: m6.u1 */
/* loaded from: classes.dex */
public abstract class AbstractC1618u1 extends AbstractC1598o {

    /* renamed from: Y */
    public int[] f7416Y;

    /* renamed from: Z */
    public int[] f7417Z;

    /* renamed from: w1 */
    public C1564c1[] f7418w1;

    /* renamed from: x1 */
    public int f7419x1 = 0;

    @Override // p104m6.AbstractC1598o, p104m6.AbstractC1630z0
    /* renamed from: b */
    public final void mo3982b() {
        super.mo3982b();
        int i7 = 0;
        while (true) {
            C1564c1[] c1564c1Arr = this.f7418w1;
            if (i7 >= c1564c1Arr.length) {
                return;
            }
            HashSet hashSet = c1564c1Arr[i7].f7341X;
            if (hashSet != null) {
                hashSet.remove(this);
            }
            i7++;
        }
    }

    @Override // p104m6.AbstractC1598o, p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        for (int i7 = 0; i7 < this.f7419x1; i7++) {
            dataOutputStream.writeByte(0);
        }
        int m3983f = m3983f();
        this.f7386m = m3983f;
        dataOutputStream.writeInt(m3983f);
    }

    public final Object clone() {
        AbstractC1618u1 abstractC1618u1 = (AbstractC1618u1) super.clone();
        abstractC1618u1.f7416Y = (int[]) this.f7416Y.clone();
        abstractC1618u1.f7417Z = (int[]) this.f7417Z.clone();
        abstractC1618u1.f7418w1 = (C1564c1[]) this.f7418w1.clone();
        return abstractC1618u1;
    }

    @Override // p104m6.AbstractC1598o, p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        StringBuffer stringBuffer = new StringBuffer(super.mo3973e(z6));
        if (!z6) {
            stringBuffer.append(" ...");
        }
        return stringBuffer.toString();
    }

    @Override // p104m6.AbstractC1598o
    /* renamed from: h */
    public final int mo3974h(int i7, int i8) {
        int i9 = this.f7385X + i7;
        this.f7385X = i9;
        short s7 = this.f7436c;
        int i10 = (4 - ((i9 + 1) % 4)) % 4;
        this.f7419x1 = i10;
        short s8 = (short) (i10 + 0);
        this.f7436c = s8;
        return s8 - s7;
    }
}
