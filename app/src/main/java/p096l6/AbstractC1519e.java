package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.e */
/* loaded from: classes.dex */
public abstract class AbstractC1519e extends AbstractC1517d {

    /* renamed from: m */
    public final int f7158m;

    /* renamed from: s */
    public final int f7159s;

    public AbstractC1519e(byte b7, int i7, int i8) {
        super(b7);
        this.f7158m = i7;
        this.f7159s = i8;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeShort(this.f7158m);
        dataOutputStream.writeShort(this.f7159s);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(class_index = ");
        stringBuffer.append(this.f7158m);
        stringBuffer.append(", name_and_type_index = ");
        stringBuffer.append(this.f7159s);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
