package p104m6;

import java.io.DataOutputStream;

/* renamed from: m6.n0 */
/* loaded from: classes.dex */
public final class C1596n0 extends AbstractC1598o {
    public C1596n0() {
        super((short) 167);
    }

    @Override // p104m6.AbstractC1598o, p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        this.f7386m = m3983f();
        if (this.f7437e == 167) {
            super.mo3965c(dataOutputStream);
            return;
        }
        this.f7386m = m3983f();
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeInt(this.f7386m);
    }

    @Override // p104m6.AbstractC1598o
    /* renamed from: h */
    public final int mo3974h(int i7, int i8) {
        int m3983f = m3983f();
        this.f7385X += i7;
        if (Math.abs(m3983f) < 32767 - i8) {
            return 0;
        }
        this.f7437e = (short) 200;
        this.f7436c = (short) 5;
        return 2;
    }
}
