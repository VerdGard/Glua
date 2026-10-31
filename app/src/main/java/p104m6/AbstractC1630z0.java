package p104m6;

import java.io.DataOutputStream;
import java.io.Serializable;
import p088k6.InterfaceC1466a;

/* renamed from: m6.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC1630z0 implements Cloneable, Serializable {

    /* renamed from: c */
    public short f7436c;

    /* renamed from: e */
    public short f7437e;

    public AbstractC1630z0() {
        this.f7436c = (short) 1;
        this.f7437e = (short) -1;
    }

    public AbstractC1630z0(short s7, short s8) {
        this.f7436c = s8;
        this.f7437e = s7;
    }

    /* renamed from: a */
    public int mo3969a(C1610s c1610s) {
        return InterfaceC1466a.f7001j[this.f7437e];
    }

    /* renamed from: b */
    public void mo3982b() {
    }

    /* renamed from: c */
    public void mo3965c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f7437e);
    }

    /* renamed from: d */
    public int mo3970d(C1610s c1610s) {
        return InterfaceC1466a.f7002k[this.f7437e];
    }

    /* renamed from: e */
    public String mo3973e(boolean z6) {
        String[] strArr = InterfaceC1466a.f7000i;
        if (!z6) {
            return strArr[this.f7437e];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[this.f7437e]);
        stringBuffer.append("[");
        stringBuffer.append((int) this.f7437e);
        stringBuffer.append("](");
        stringBuffer.append((int) this.f7436c);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1630z0)) {
            return false;
        }
        AbstractC1630z0 abstractC1630z0 = (AbstractC1630z0) obj;
        if (this.f7437e != abstractC1630z0.f7437e) {
            return false;
        }
        if (this instanceof AbstractC1618u1) {
            C1564c1[] c1564c1Arr = ((AbstractC1618u1) this).f7418w1;
            C1564c1[] c1564c1Arr2 = ((AbstractC1618u1) abstractC1630z0).f7418w1;
            if (c1564c1Arr.length != c1564c1Arr2.length) {
                return false;
            }
            for (int i7 = 0; i7 < c1564c1Arr.length; i7++) {
                if (c1564c1Arr[i7] != c1564c1Arr2[i7]) {
                    return false;
                }
            }
        } else if (this instanceof AbstractC1598o) {
            if (((AbstractC1598o) this).f7387s != ((AbstractC1598o) abstractC1630z0).f7387s) {
                return false;
            }
        } else {
            if (this instanceof InterfaceC1613t) {
                return ((InterfaceC1613t) this).getValue().equals(((InterfaceC1613t) abstractC1630z0).getValue());
            }
            if (this instanceof InterfaceC1628y0) {
                if (((InterfaceC1628y0) this).getIndex() != ((InterfaceC1628y0) abstractC1630z0).getIndex()) {
                    return false;
                }
            } else if (this instanceof C1600o1) {
            }
        }
        return true;
    }

    public final String toString() {
        return mo3973e(true);
    }
}
