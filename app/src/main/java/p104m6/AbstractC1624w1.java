package p104m6;

import java.io.Serializable;
import p036e2.C1101u4;
import p096l6.AbstractC1518d0;
import p096l6.C1516c0;
import p160u0.C1966c;

/* renamed from: m6.w1 */
/* loaded from: classes.dex */
public abstract class AbstractC1624w1 implements Serializable {

    /* renamed from: A1 */
    public static final C1603p1 f7420A1;

    /* renamed from: B1 */
    public static final AbstractC1624w1[] f7421B1;

    /* renamed from: C1 */
    public static final C1621v1 f7422C1;

    /* renamed from: D1 */
    public static final C1516c0 f7423D1;

    /* renamed from: c */
    public final byte f7433c;

    /* renamed from: e */
    public String f7434e;

    /* renamed from: m */
    public static final C1592m f7427m = new C1592m((byte) 12);

    /* renamed from: s */
    public static final C1592m f7428s = new C1592m((byte) 4);

    /* renamed from: X */
    public static final C1592m f7424X = new C1592m((byte) 10);

    /* renamed from: Y */
    public static final C1592m f7425Y = new C1592m((byte) 9);

    /* renamed from: Z */
    public static final C1592m f7426Z = new C1592m((byte) 8);

    /* renamed from: w1 */
    public static final C1592m f7429w1 = new C1592m((byte) 11);

    /* renamed from: x1 */
    public static final C1592m f7430x1 = new C1592m((byte) 7);

    /* renamed from: y1 */
    public static final C1592m f7431y1 = new C1592m((byte) 6);

    /* renamed from: z1 */
    public static final C1592m f7432z1 = new C1592m((byte) 5);

    static {
        new C1603p1("java.lang.Object");
        new C1603p1("java.lang.Class");
        f7420A1 = new C1603p1("java.lang.String");
        new C1603p1("java.lang.StringBuffer");
        new C1603p1("java.lang.Throwable");
        f7421B1 = new AbstractC1624w1[0];
        f7422C1 = new C1621v1();
        f7423D1 = new C1516c0(1);
    }

    public AbstractC1624w1(byte b7, String str) {
        this.f7433c = b7;
        this.f7434e = str;
    }

    /* renamed from: a */
    public static String m3992a(AbstractC1624w1 abstractC1624w1, AbstractC1624w1[] abstractC1624w1Arr) {
        StringBuffer stringBuffer = new StringBuffer("(");
        int length = abstractC1624w1Arr == null ? 0 : abstractC1624w1Arr.length;
        for (int i7 = 0; i7 < length; i7++) {
            stringBuffer.append(abstractC1624w1Arr[i7].f7434e);
        }
        stringBuffer.append(')');
        stringBuffer.append(abstractC1624w1.f7434e);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static final AbstractC1624w1 m3993c(String str) {
        int i7;
        C1516c0 c1516c0 = AbstractC1518d0.f7154a;
        int i8 = 0;
        try {
            char charAt = str.charAt(0);
            if (charAt == 'F') {
                i7 = 6;
            } else if (charAt == 'L') {
                i7 = 14;
            } else if (charAt == 'S') {
                i7 = 9;
            } else if (charAt == 'V') {
                i7 = 12;
            } else if (charAt == 'I') {
                i7 = 10;
            } else if (charAt == 'J') {
                i7 = 11;
            } else if (charAt == 'Z') {
                i7 = 4;
            } else if (charAt != '[') {
                switch (charAt) {
                    case 'B':
                        i7 = 8;
                        break;
                    case 'C':
                        i7 = 5;
                        break;
                    case 'D':
                        i7 = 7;
                        break;
                    default:
                        throw new C1966c("Invalid method signature: ".concat(str));
                }
            } else {
                i7 = 13;
            }
            C1516c0 c1516c02 = f7423D1;
            if (i7 > 12) {
                if (i7 == 13) {
                    do {
                        i8++;
                    } while (str.charAt(i8) == '[');
                    AbstractC1624w1 m3993c = m3993c(str.substring(i8));
                    c1516c02.set(new Integer(((Integer) c1516c02.get()).intValue() + i8));
                    return new C1583j(m3993c, i8);
                }
                int indexOf = str.indexOf(59);
                if (indexOf < 0) {
                    throw new C1966c("Invalid signature: ".concat(str));
                }
                c1516c02.set(new Integer(indexOf + 1));
                return new C1603p1(str.substring(1, indexOf).replace('/', '.'));
            }
            c1516c02.set(new Integer(1));
            switch (i7) {
                case 4:
                    return f7428s;
                case 5:
                    return f7432z1;
                case 6:
                    return f7431y1;
                case 7:
                    return f7430x1;
                case 8:
                    return f7426Z;
                case 9:
                    return f7425Y;
                case 10:
                    return f7424X;
                case 11:
                    return f7429w1;
                case 12:
                    return f7427m;
                default:
                    StringBuffer stringBuffer = new StringBuffer("Invalid type: ");
                    stringBuffer.append(i7);
                    throw new C1101u4(stringBuffer.toString());
            }
        } catch (StringIndexOutOfBoundsException unused) {
            StringBuffer stringBuffer2 = new StringBuffer("Invalid method signature: ");
            stringBuffer2.append(str);
            throw new C1966c(stringBuffer2.toString());
        }
    }

    /* renamed from: b */
    public final int m3994b() {
        byte b7 = this.f7433c;
        if (b7 == 7 || b7 == 11) {
            return 2;
        }
        return b7 != 12 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1624w1)) {
            return false;
        }
        AbstractC1624w1 abstractC1624w1 = (AbstractC1624w1) obj;
        return this.f7433c == abstractC1624w1.f7433c && this.f7434e.equals(abstractC1624w1.f7434e);
    }

    public int hashCode() {
        return this.f7434e.hashCode() ^ this.f7433c;
    }

    public final String toString() {
        return (equals(f7422C1) || this.f7433c >= 15) ? this.f7434e : AbstractC1518d0.m3935e(this.f7434e, false);
    }
}
