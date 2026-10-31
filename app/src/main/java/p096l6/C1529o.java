package p096l6;

import java.io.Serializable;
import p088k6.InterfaceC1466a;
import p160u0.C1966c;

/* renamed from: l6.o */
/* loaded from: classes.dex */
public final class C1529o implements Cloneable, Serializable {

    /* renamed from: c */
    public int f7165c;

    /* renamed from: e */
    public AbstractC1517d[] f7166e;

    public C1529o(AbstractC1517d[] abstractC1517dArr) {
        this.f7166e = abstractC1517dArr;
        this.f7165c = abstractC1517dArr == null ? 0 : abstractC1517dArr.length;
    }

    /* renamed from: a */
    public final String m3936a(byte b7, int i7) {
        StringBuffer stringBuffer;
        String str;
        int i8;
        AbstractC1517d m3937b = m3937b(b7, i7);
        byte b8 = 1;
        byte b9 = m3937b.f7153c;
        switch (b9) {
            case 1:
                return ((C1531q) m3937b).f7168m;
            case 2:
            default:
                StringBuffer stringBuffer2 = new StringBuffer("Unknown constant type ");
                stringBuffer2.append((int) b9);
                throw new RuntimeException(stringBuffer2.toString());
            case 3:
                stringBuffer = new StringBuffer("");
                stringBuffer.append(((C1524j) m3937b).f7162m);
                return stringBuffer.toString();
            case 4:
                stringBuffer = new StringBuffer("");
                stringBuffer.append(0.0f);
                return stringBuffer.toString();
            case 5:
                stringBuffer = new StringBuffer("");
                stringBuffer.append(0L);
                return stringBuffer.toString();
            case 6:
                stringBuffer = new StringBuffer("");
                stringBuffer.append(((C1521g) m3937b).f7161m);
                return stringBuffer.toString();
            case 7:
                return AbstractC1518d0.m3932b(((C1531q) m3937b((byte) 1, ((C1520f) m3937b).f7160m)).f7168m, false);
            case 8:
                AbstractC1517d m3937b2 = m3937b((byte) 1, ((C1530p) m3937b).f7167m);
                stringBuffer = new StringBuffer("\"");
                String str2 = ((C1531q) m3937b2).f7168m;
                int length = str2.length();
                StringBuffer stringBuffer3 = new StringBuffer(length + 5);
                char[] charArray = str2.toCharArray();
                for (int i9 = 0; i9 < length; i9++) {
                    char c7 = charArray[i9];
                    if (c7 == '\r') {
                        str = "\\r";
                    } else if (c7 != '\"') {
                        switch (c7) {
                            case '\b':
                                str = "\\b";
                                break;
                            case '\t':
                                str = "\\t";
                                break;
                            case '\n':
                                str = "\\n";
                                break;
                            default:
                                stringBuffer3.append(c7);
                                continue;
                        }
                    } else {
                        str = "\\\"";
                    }
                    stringBuffer3.append(str);
                }
                stringBuffer.append(stringBuffer3.toString());
                stringBuffer.append("\"");
                return stringBuffer.toString();
            case 9:
            case 10:
            case 11:
                stringBuffer = new StringBuffer();
                AbstractC1519e abstractC1519e = (AbstractC1519e) m3937b;
                stringBuffer.append(m3936a((byte) 7, abstractC1519e.f7158m));
                stringBuffer.append(".");
                b8 = 12;
                i8 = abstractC1519e.f7159s;
                stringBuffer.append(m3936a(b8, i8));
                return stringBuffer.toString();
            case 12:
                stringBuffer = new StringBuffer();
                C1528n c1528n = (C1528n) m3937b;
                stringBuffer.append(m3936a((byte) 1, c1528n.f7163m));
                stringBuffer.append(" ");
                i8 = c1528n.f7164s;
                stringBuffer.append(m3936a(b8, i8));
                return stringBuffer.toString();
        }
    }

    /* renamed from: b */
    public final AbstractC1517d m3937b(byte b7, int i7) {
        AbstractC1517d m3938c = m3938c(i7);
        if (m3938c == null) {
            StringBuffer stringBuffer = new StringBuffer("Constant pool at index ");
            stringBuffer.append(i7);
            stringBuffer.append(" is null.");
            throw new C1966c(stringBuffer.toString());
        }
        if (m3938c.f7153c == b7) {
            return m3938c;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Expected class `");
        stringBuffer2.append(InterfaceC1466a.f6995b[b7]);
        stringBuffer2.append("' at index ");
        stringBuffer2.append(i7);
        stringBuffer2.append(" and got ");
        stringBuffer2.append(m3938c);
        throw new C1966c(stringBuffer2.toString());
    }

    /* renamed from: c */
    public final AbstractC1517d m3938c(int i7) {
        AbstractC1517d[] abstractC1517dArr = this.f7166e;
        if (i7 < abstractC1517dArr.length && i7 >= 0) {
            return abstractC1517dArr[i7];
        }
        StringBuffer stringBuffer = new StringBuffer("Invalid constant pool reference: ");
        stringBuffer.append(i7);
        stringBuffer.append(". Constant pool size is: ");
        stringBuffer.append(this.f7166e.length);
        throw new C1966c(stringBuffer.toString());
    }

    /* renamed from: d */
    public final String m3939d(int i7) {
        return ((C1531q) m3937b((byte) 1, ((C1520f) m3937b((byte) 7, i7)).f7160m)).f7168m;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 1; i7 < this.f7165c; i7++) {
            stringBuffer.append(i7);
            stringBuffer.append(")");
            stringBuffer.append(this.f7166e[i7]);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
