package p104m6;

import java.io.DataOutputStream;

/* renamed from: m6.h1 */
/* loaded from: classes.dex */
public final class C1579h1 extends AbstractC1601p {
    public C1579h1(int i7) {
        super((short) 19, i7);
        short s7;
        if (this.f7389m <= 255) {
            this.f7437e = (short) 18;
            s7 = 2;
        } else {
            this.f7437e = (short) 19;
            s7 = 3;
        }
        this.f7436c = s7;
    }

    @Override // p104m6.AbstractC1601p, p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        if (this.f7436c == 2) {
            dataOutputStream.writeByte(this.f7389m);
        } else {
            dataOutputStream.writeShort(this.f7389m);
        }
    }

    @Override // p104m6.AbstractC1601p
    /* renamed from: f */
    public final void mo3966f(int i7) {
        short s7;
        super.mo3966f(i7);
        if (this.f7389m <= 255) {
            this.f7437e = (short) 18;
            s7 = 2;
        } else {
            this.f7437e = (short) 19;
            s7 = 3;
        }
        this.f7436c = s7;
    }
}
