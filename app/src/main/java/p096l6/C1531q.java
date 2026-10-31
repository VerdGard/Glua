package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.q */
/* loaded from: classes.dex */
public final class C1531q extends AbstractC1517d {

    /* renamed from: m */
    public final String f7168m;

    public C1531q(String str) {
        super((byte) 1);
        if (str == null) {
            throw new IllegalArgumentException("bytes must not be null!");
        }
        this.f7168m = str;
    }

    @Override // p096l6.AbstractC1517d
    /* renamed from: a */
    public final void mo3930a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7153c);
        dataOutputStream.writeUTF(this.f7168m);
    }

    @Override // p096l6.AbstractC1517d
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("(\"");
        String str = this.f7168m;
        C1516c0 c1516c0 = AbstractC1518d0.f7154a;
        StringBuffer stringBuffer2 = new StringBuffer();
        try {
            if (str.indexOf("\n") != -1) {
                int i7 = 0;
                while (true) {
                    int indexOf = str.indexOf("\n", i7);
                    if (indexOf == -1) {
                        break;
                    }
                    stringBuffer2.append(str.substring(i7, indexOf));
                    stringBuffer2.append("\\n");
                    i7 = 1 + indexOf;
                }
                stringBuffer2.append(str.substring(i7));
                str = stringBuffer2.toString();
            }
        } catch (StringIndexOutOfBoundsException e7) {
            System.err.println(e7);
        }
        stringBuffer.append(str);
        stringBuffer.append("\")");
        return stringBuffer.toString();
    }
}
