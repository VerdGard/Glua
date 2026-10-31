package p104m6;

import java.io.Serializable;
import p036e2.C1101u4;

/* renamed from: m6.l1 */
/* loaded from: classes.dex */
public final class C1591l1 implements InterfaceC1570e1, Cloneable, Serializable {

    /* renamed from: X */
    public C1564c1 f7362X;

    /* renamed from: c */
    public final int f7363c;

    /* renamed from: e */
    public String f7364e;

    /* renamed from: m */
    public final AbstractC1624w1 f7365m;

    /* renamed from: s */
    public C1564c1 f7366s;

    public C1591l1(int i7, String str, C1564c1 c1564c1, C1564c1 c1564c12, AbstractC1624w1 abstractC1624w1) {
        if (i7 < 0 || i7 > 65535) {
            StringBuffer stringBuffer = new StringBuffer("Invalid index index: ");
            stringBuffer.append(i7);
            throw new C1101u4(stringBuffer.toString());
        }
        this.f7364e = str;
        this.f7365m = abstractC1624w1;
        this.f7363c = i7;
        AbstractC1598o.m3981g(this.f7366s, c1564c1, this);
        this.f7366s = c1564c1;
        AbstractC1598o.m3981g(this.f7362X, c1564c12, this);
        this.f7362X = c1564c12;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e7) {
            System.err.println(e7);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1591l1)) {
            return false;
        }
        C1591l1 c1591l1 = (C1591l1) obj;
        return c1591l1.f7363c == this.f7363c && c1591l1.f7366s == this.f7366s && c1591l1.f7362X == this.f7362X;
    }

    public final int hashCode() {
        return (this.f7364e.hashCode() ^ this.f7363c) ^ this.f7365m.hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("LocalVariableGen(");
        stringBuffer.append(this.f7364e);
        stringBuffer.append(", ");
        stringBuffer.append(this.f7365m);
        stringBuffer.append(", ");
        stringBuffer.append(this.f7366s);
        stringBuffer.append(", ");
        stringBuffer.append(this.f7362X);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
