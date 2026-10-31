package p104m6;

import java.io.DataOutputStream;
import p088k6.InterfaceC1466a;

/* renamed from: m6.o1 */
/* loaded from: classes.dex */
public final class C1600o1 extends AbstractC1630z0 {
    @Override // p104m6.AbstractC1630z0
    /* renamed from: c */
    public final void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
        dataOutputStream.writeByte(0);
    }

    @Override // p104m6.AbstractC1630z0
    /* renamed from: e */
    public final String mo3973e(boolean z6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.mo3973e(z6));
        stringBuffer.append(" ");
        stringBuffer.append(InterfaceC1466a.f6996d[0]);
        return stringBuffer.toString();
    }
}
