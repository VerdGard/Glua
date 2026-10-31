package p104m6;

import p036e2.C1101u4;
import p088k6.InterfaceC1466a;

/* renamed from: m6.m */
/* loaded from: classes.dex */
public final class C1592m extends AbstractC1624w1 {
    public C1592m(byte b7) {
        super(b7, InterfaceC1466a.f6997f[b7]);
        if (b7 < 4 || b7 > 12) {
            StringBuffer stringBuffer = new StringBuffer("Invalid type: ");
            stringBuffer.append((int) b7);
            throw new C1101u4(stringBuffer.toString());
        }
    }

    @Override // p104m6.AbstractC1624w1
    public final boolean equals(Object obj) {
        return (obj instanceof C1592m) && ((C1592m) obj).f7433c == this.f7433c;
    }

    @Override // p104m6.AbstractC1624w1
    public final int hashCode() {
        return this.f7433c;
    }
}
