package p096l6;

import android.ext.Tools;
import p088k6.InterfaceC1466a;
import p160u0.C1966c;

/* renamed from: l6.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC1518d0 {

    /* renamed from: a */
    public static final C1516c0 f7154a = new C1516c0(0);

    /* renamed from: b */
    public static boolean f7155b = false;

    /* renamed from: c */
    public static final int[] f7156c = new int[48];

    /* renamed from: d */
    public static final int[] f7157d = new int[Tools.Semaphore.f160S8];

    static {
        int i7 = 0;
        for (int i8 = 65; i8 <= 90; i8++) {
            f7156c[i7] = i8;
            f7157d[i8] = i7;
            i7++;
        }
        for (int i9 = 103; i9 <= 122; i9++) {
            f7156c[i7] = i9;
            f7157d[i9] = i7;
            i7++;
        }
        int[] iArr = f7156c;
        iArr[i7] = 36;
        int[] iArr2 = f7157d;
        iArr2[36] = i7;
        int i10 = i7 + 1;
        iArr[i10] = 95;
        iArr2[95] = i10;
    }

    /* renamed from: a */
    public static final String m3931a(int i7, boolean z6) {
        StringBuffer stringBuffer = new StringBuffer();
        int i8 = 0;
        int i9 = 0;
        while (i8 < 16384) {
            i8 = 1 << i9;
            if ((i7 & i8) != 0 && (!z6 || (i8 != 32 && i8 != 512))) {
                stringBuffer.append(InterfaceC1466a.f6994a[i9]);
                stringBuffer.append(" ");
            }
            i9++;
        }
        return stringBuffer.toString().trim();
    }

    /* renamed from: b */
    public static final String m3932b(String str, boolean z6) {
        String replace = str.replace('/', '.');
        return (z6 && replace.startsWith("java.lang.") && replace.substring(10).indexOf(46) == -1) ? replace.substring(10) : replace;
    }

    /* renamed from: c */
    public static final String m3933c(String str, int i7, boolean z6) {
        int length = i7 - str.length();
        if (length < 0) {
            length = 0;
        }
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = ' ';
        }
        String str2 = new String(cArr);
        return z6 ? str.concat(str2) : str2.concat(str);
    }

    /* renamed from: d */
    public static final String m3934d(String str, String str2, String str3, C1540z c1540z) {
        C1539y c1539y;
        StringBuffer stringBuffer = new StringBuffer("(");
        int i7 = str3.indexOf("static") >= 0 ? 0 : 1;
        try {
            if (str.charAt(0) != '(') {
                throw new C1966c("Invalid method signature: ".concat(str));
            }
            int i8 = 1;
            while (str.charAt(i8) != ')') {
                String m3935e = m3935e(str.substring(i8), true);
                stringBuffer.append(m3935e);
                if (c1540z != null) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= c1540z.f7201X) {
                            c1539y = null;
                            break;
                        }
                        c1539y = c1540z.f7202Y[i9];
                        if (c1539y.f7195X == i7) {
                            break;
                        }
                        i9++;
                    }
                    if (c1539y != null) {
                        stringBuffer.append(" ");
                        stringBuffer.append(((C1531q) c1539y.f7196Y.m3937b((byte) 1, c1539y.f7199m)).f7168m);
                    }
                } else {
                    stringBuffer.append(" arg");
                    stringBuffer.append(i7);
                }
                if (!"double".equals(m3935e) && !"long".equals(m3935e)) {
                    i7++;
                    stringBuffer.append(", ");
                    i8 += ((Integer) f7154a.get()).intValue();
                }
                i7 += 2;
                stringBuffer.append(", ");
                i8 += ((Integer) f7154a.get()).intValue();
            }
            String m3935e2 = m3935e(str.substring(i8 + 1), true);
            if (stringBuffer.length() > 1) {
                stringBuffer.setLength(stringBuffer.length() - 2);
            }
            stringBuffer.append(")");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str3);
            stringBuffer2.append(str3.length() > 0 ? " " : "");
            stringBuffer2.append(m3935e2);
            stringBuffer2.append(" ");
            stringBuffer2.append(str2);
            stringBuffer2.append(stringBuffer.toString());
            return stringBuffer2.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            StringBuffer stringBuffer3 = new StringBuffer("Invalid method signature: ");
            stringBuffer3.append(str);
            throw new C1966c(stringBuffer3.toString());
        }
    }

    /* renamed from: e */
    public static final String m3935e(String str, boolean z6) {
        Integer num = new Integer(1);
        C1516c0 c1516c0 = f7154a;
        c1516c0.set(num);
        int i7 = 0;
        try {
            char charAt = str.charAt(0);
            if (charAt == 'F') {
                return "float";
            }
            if (charAt == 'L') {
                int indexOf = str.indexOf(59);
                if (indexOf < 0) {
                    throw new C1966c("Invalid signature: ".concat(str));
                }
                c1516c0.set(new Integer(indexOf + 1));
                return m3932b(str.substring(1, indexOf), z6);
            }
            if (charAt == 'S') {
                return "short";
            }
            if (charAt == 'V') {
                return "void";
            }
            if (charAt == 'I') {
                return "int";
            }
            if (charAt == 'J') {
                return "long";
            }
            if (charAt == 'Z') {
                return "boolean";
            }
            if (charAt != '[') {
                switch (charAt) {
                    case 'B':
                        return "byte";
                    case 'C':
                        return "char";
                    case 'D':
                        return "double";
                    default:
                        StringBuffer stringBuffer = new StringBuffer("Invalid signature: `");
                        stringBuffer.append(str);
                        stringBuffer.append("'");
                        throw new C1966c(stringBuffer.toString());
                }
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            while (str.charAt(i7) == '[') {
                stringBuffer2.append("[]");
                i7++;
            }
            String m3935e = m3935e(str.substring(i7), z6);
            c1516c0.set(new Integer(((Integer) c1516c0.get()).intValue() + i7));
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(m3935e);
            stringBuffer3.append(stringBuffer2.toString());
            return stringBuffer3.toString();
        } catch (StringIndexOutOfBoundsException e7) {
            StringBuffer stringBuffer4 = new StringBuffer("Invalid signature: ");
            stringBuffer4.append(e7);
            stringBuffer4.append(":");
            stringBuffer4.append(str);
            throw new C1966c(stringBuffer4.toString());
        }
    }
}
