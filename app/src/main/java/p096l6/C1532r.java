package p096l6;

import java.io.DataOutputStream;

/* renamed from: l6.r */
/* loaded from: classes.dex */
public final class C1532r extends AbstractC1511a {
    public C1532r() {
        throw null;
    }

    @Override // p096l6.AbstractC1511a
    /* renamed from: a */
    public final void mo3929a(DataOutputStream dataOutputStream) {
        super.mo3929a(dataOutputStream);
        dataOutputStream.writeShort(0);
    }

    @Override // p096l6.AbstractC1511a
    public final String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        String str;
        C1529o c1529o = this.f7140s;
        AbstractC1517d m3938c = c1529o.m3938c(0);
        byte b7 = m3938c.f7153c;
        if (b7 == 3) {
            stringBuffer = new StringBuffer("");
            stringBuffer.append(((C1524j) m3938c).f7162m);
        } else if (b7 == 4) {
            stringBuffer = new StringBuffer("");
            stringBuffer.append(0.0f);
        } else if (b7 == 5) {
            stringBuffer = new StringBuffer("");
            stringBuffer.append(0L);
        } else {
            if (b7 != 6) {
                if (b7 != 8) {
                    StringBuffer stringBuffer3 = new StringBuffer("Type of ConstValue invalid: ");
                    stringBuffer3.append(m3938c);
                    throw new IllegalStateException(stringBuffer3.toString());
                }
                AbstractC1517d m3937b = c1529o.m3937b((byte) 1, ((C1530p) m3938c).f7167m);
                stringBuffer2 = new StringBuffer("\"");
                C1516c0 c1516c0 = AbstractC1518d0.f7154a;
                char[] charArray = ((C1531q) m3937b).f7168m.toCharArray();
                StringBuffer stringBuffer4 = new StringBuffer();
                for (char c7 : charArray) {
                    if (c7 == '\n') {
                        str = "\\n";
                    } else if (c7 == '\r') {
                        str = "\\r";
                    } else if (c7 == '\"') {
                        str = "\\\"";
                    } else if (c7 == '\'') {
                        str = "\\'";
                    } else if (c7 != '\\') {
                        stringBuffer4.append(c7);
                    } else {
                        str = "\\\\";
                    }
                    stringBuffer4.append(str);
                }
                stringBuffer2.append(stringBuffer4.toString());
                stringBuffer2.append("\"");
                return stringBuffer2.toString();
            }
            stringBuffer = new StringBuffer("");
            stringBuffer.append(((C1521g) m3938c).f7161m);
        }
        stringBuffer2 = stringBuffer;
        return stringBuffer2.toString();
    }
}
