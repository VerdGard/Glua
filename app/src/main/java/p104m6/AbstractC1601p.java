package p104m6;

import java.io.DataOutputStream;
import p036e2.C1101u4;

/* renamed from: m6.p */
/* loaded from: classes.dex */
public abstract class AbstractC1601p extends AbstractC1630z0 implements InterfaceC1628y0 {

    /* renamed from: m */
    public int f7389m;

    public AbstractC1601p(short s7, int i7) {
        super(s7, (short) 3);
        mo3966f(i7);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeShort(this.f7389m);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.mo3973e(z6));
        stringBuffer.append(" ");
        stringBuffer.append(this.f7389m);
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public void mo3966f(int i7) {
        if (i7 >= 0) {
            this.f7389m = i7;
        } else {
            StringBuffer stringBuffer = new StringBuffer("Negative index value: ");
            stringBuffer.append(i7);
            throw new C1101u4(stringBuffer.toString());
        }
    }

    @Override // p104m6.InterfaceC1628y0
    public final int getIndex() {
        return this.f7389m;
    }
}
