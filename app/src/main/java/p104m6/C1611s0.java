package p104m6;

import java.io.DataOutputStream;
import p036e2.C1101u4;

/* renamed from: m6.s0 */
/* loaded from: classes.dex */
public final class C1611s0 extends AbstractC1584j0 {

    /* renamed from: X */
    public final int f7414X;

    public C1611s0(int i7, int i8) {
        super((short) 185, i7, 1);
        this.f7436c = (short) 5;
        if (i8 >= 1) {
            this.f7414X = i8;
        } else {
            StringBuffer stringBuffer = new StringBuffer("Number of arguments must be > 0 ");
            stringBuffer.append(i8);
            throw new C1101u4(stringBuffer.toString());
        }
    }

    @Override // p104m6.AbstractC1584j0, p104m6.AbstractC1630z0
    /* renamed from: a */
    public final int mo3969a(C1610s c1610s) {
        return this.f7414X;
    }

    @Override // p104m6.AbstractC1601p, p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeShort(this.f7389m);
        dataOutputStream.writeByte(this.f7414X);
        dataOutputStream.writeByte(0);
    }
}
