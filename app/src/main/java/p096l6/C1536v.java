package p096l6;

import android.ext.Tools;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.StringTokenizer;
import p032d6.AbstractC0899g;
import p036e2.C1104v0;
import p112n6.C1650c;
import p112n6.C1651d;

/* renamed from: l6.v */
/* loaded from: classes.dex */
public final class C1536v extends AbstractC0899g implements Cloneable, Comparable {

    /* renamed from: F1 */
    public static final C1104v0 f7176F1 = new C1104v0(2);

    /* renamed from: A1 */
    public final int[] f7177A1;

    /* renamed from: B1 */
    public final String[] f7178B1;

    /* renamed from: C1 */
    public final C1534t[] f7179C1;

    /* renamed from: D1 */
    public final C1512a0[] f7180D1;

    /* renamed from: E1 */
    public final AbstractC1511a[] f7181E1;

    /* renamed from: X */
    public final int f7182X;

    /* renamed from: Y */
    public final int f7183Y;

    /* renamed from: Z */
    public final String f7184Z;

    /* renamed from: m */
    public final String f7185m;

    /* renamed from: s */
    public final String f7186s;

    /* renamed from: w1 */
    public final String f7187w1;

    /* renamed from: x1 */
    public final int f7188x1;

    /* renamed from: y1 */
    public final int f7189y1;

    /* renamed from: z1 */
    public final C1529o f7190z1;

    static {
        Boolean.getBoolean("JavaClass.debug");
        String property = System.getProperty("file.separator");
        if (property != null) {
            try {
                property.charAt(0);
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
    }

    public C1536v(int i7, int i8, String str, int i9, int i10, int i11, C1529o c1529o, int[] iArr, C1534t[] c1534tArr, C1512a0[] c1512a0Arr, AbstractC1511a[] abstractC1511aArr) {
        String str2;
        this.f7186s = "<Unknown>";
        HashMap hashMap = C1651d.f7487c;
        C1650c c1650c = C1650c.f7484e;
        HashMap hashMap2 = C1651d.f7487c;
        if (((C1651d) hashMap2.get(c1650c)) == null) {
            hashMap2.put(c1650c, new C1651d());
        }
        abstractC1511aArr = abstractC1511aArr == null ? new AbstractC1511a[0] : abstractC1511aArr;
        c1534tArr = c1534tArr == null ? new C1534t[0] : c1534tArr;
        c1512a0Arr = c1512a0Arr == null ? new C1512a0[0] : c1512a0Arr;
        this.f7182X = i7;
        this.f7183Y = i8;
        this.f7185m = str;
        this.f7188x1 = i9;
        this.f7189y1 = i10;
        this.f4690e = i11;
        this.f7190z1 = c1529o;
        this.f7177A1 = iArr;
        this.f7179C1 = c1534tArr;
        this.f7180D1 = c1512a0Arr;
        this.f7181E1 = abstractC1511aArr;
        int i12 = 0;
        while (true) {
            if (i12 >= abstractC1511aArr.length) {
                break;
            }
            AbstractC1511a abstractC1511a = abstractC1511aArr[i12];
            if (abstractC1511a instanceof C1514b0) {
                C1514b0 c1514b0 = (C1514b0) abstractC1511a;
                this.f7186s = ((C1531q) c1514b0.f7140s.m3937b((byte) 1, c1514b0.f7150X)).f7168m;
                break;
            }
            i12++;
        }
        String m3939d = c1529o.m3939d(i7);
        this.f7184Z = m3939d;
        String m3932b = AbstractC1518d0.m3932b(m3939d, false);
        this.f7184Z = m3932b;
        int lastIndexOf = m3932b.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            m3932b.substring(0, lastIndexOf);
        }
        if (i8 > 0) {
            String m3939d2 = c1529o.m3939d(i8);
            this.f7187w1 = m3939d2;
            str2 = AbstractC1518d0.m3932b(m3939d2, false);
        } else {
            str2 = "java.lang.Object";
        }
        this.f7187w1 = str2;
        this.f7178B1 = new String[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f7178B1[i13] = AbstractC1518d0.m3932b(c1529o.m3939d(iArr[i13]), false);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7184Z.compareTo(((C1536v) obj).f7184Z);
    }

    /* renamed from: d */
    public final void m3943d(ByteArrayOutputStream byteArrayOutputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.f7189y1);
        dataOutputStream.writeShort(this.f7188x1);
        C1529o c1529o = this.f7190z1;
        dataOutputStream.writeShort(c1529o.f7165c);
        for (int i7 = 1; i7 < c1529o.f7165c; i7++) {
            AbstractC1517d abstractC1517d = c1529o.f7166e[i7];
            if (abstractC1517d != null) {
                abstractC1517d.mo3930a(dataOutputStream);
            }
        }
        dataOutputStream.writeShort(this.f4690e);
        dataOutputStream.writeShort(this.f7182X);
        dataOutputStream.writeShort(this.f7183Y);
        int[] iArr = this.f7177A1;
        dataOutputStream.writeShort(iArr.length);
        for (int i8 : iArr) {
            dataOutputStream.writeShort(i8);
        }
        C1534t[] c1534tArr = this.f7179C1;
        dataOutputStream.writeShort(c1534tArr.length);
        for (C1534t c1534t : c1534tArr) {
            c1534t.m3940d(dataOutputStream);
        }
        C1512a0[] c1512a0Arr = this.f7180D1;
        dataOutputStream.writeShort(c1512a0Arr.length);
        for (C1512a0 c1512a0 : c1512a0Arr) {
            c1512a0.m3940d(dataOutputStream);
        }
        AbstractC1511a[] abstractC1511aArr = this.f7181E1;
        if (abstractC1511aArr != null) {
            dataOutputStream.writeShort(abstractC1511aArr.length);
            for (AbstractC1511a abstractC1511a : abstractC1511aArr) {
                abstractC1511a.mo3929a(dataOutputStream);
            }
        } else {
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
    }

    public final boolean equals(Object obj) {
        return f7176F1.m3233a(this, obj);
    }

    public final int hashCode() {
        return f7176F1.m3234b(this);
    }

    @Override // p032d6.AbstractC0899g
    public final String toString() {
        String m3931a = AbstractC1518d0.m3931a(this.f4690e, true);
        String concat = m3931a.equals("") ? "" : m3931a.concat(" ");
        StringBuffer stringBuffer = new StringBuffer(Tools.Semaphore.f159S7);
        stringBuffer.append(concat);
        stringBuffer.append((this.f4690e & Tools.Semaphore.f161S9) != 0 ? "interface" : "class");
        stringBuffer.append(" ");
        stringBuffer.append(this.f7184Z);
        stringBuffer.append(" extends ");
        stringBuffer.append(AbstractC1518d0.m3932b(this.f7187w1, false));
        stringBuffer.append('\n');
        int length = this.f7177A1.length;
        if (length > 0) {
            stringBuffer.append("implements\t\t");
            for (int i7 = 0; i7 < length; i7++) {
                stringBuffer.append(this.f7178B1[i7]);
                if (i7 < length - 1) {
                    stringBuffer.append(", ");
                }
            }
            stringBuffer.append('\n');
        }
        stringBuffer.append("filename\t\t");
        stringBuffer.append(this.f7185m);
        stringBuffer.append("\ncompiled from\t\t");
        stringBuffer.append(this.f7186s);
        stringBuffer.append("\ncompiler version\t");
        stringBuffer.append(this.f7188x1);
        stringBuffer.append(".");
        stringBuffer.append(this.f7189y1);
        stringBuffer.append("\naccess flags\t\t");
        stringBuffer.append(this.f4690e);
        stringBuffer.append("\nconstant pool\t\t");
        stringBuffer.append(this.f7190z1.f7165c);
        stringBuffer.append(" entries\nACC_SUPER flag\t\t");
        stringBuffer.append((this.f4690e & 32) != 0);
        stringBuffer.append("\n");
        AbstractC1511a[] abstractC1511aArr = this.f7181E1;
        if (abstractC1511aArr.length > 0) {
            stringBuffer.append("\nAttribute(s):\n");
            for (AbstractC1511a abstractC1511a : abstractC1511aArr) {
                StringTokenizer stringTokenizer = new StringTokenizer(abstractC1511a.toString(), "\n");
                StringBuffer stringBuffer2 = new StringBuffer();
                while (stringTokenizer.hasMoreTokens()) {
                    stringBuffer2.append("\t");
                    stringBuffer2.append(stringTokenizer.nextToken());
                    stringBuffer2.append("\n");
                }
                stringBuffer.append(stringBuffer2.toString());
            }
        }
        C1534t[] c1534tArr = this.f7179C1;
        if (c1534tArr.length > 0) {
            stringBuffer.append("\n");
            stringBuffer.append(c1534tArr.length);
            stringBuffer.append(" fields:\n");
            for (C1534t c1534t : c1534tArr) {
                stringBuffer.append("\t");
                stringBuffer.append(c1534t);
                stringBuffer.append('\n');
            }
        }
        C1512a0[] c1512a0Arr = this.f7180D1;
        if (c1512a0Arr.length > 0) {
            stringBuffer.append("\n");
            stringBuffer.append(c1512a0Arr.length);
            stringBuffer.append(" methods:\n");
            for (C1512a0 c1512a0 : c1512a0Arr) {
                stringBuffer.append("\t");
                stringBuffer.append(c1512a0);
                stringBuffer.append('\n');
            }
        }
        return stringBuffer.toString();
    }
}
