package p104m6;

import java.util.HashMap;
import p096l6.AbstractC1517d;
import p096l6.C1521g;
import p096l6.C1524j;
import p096l6.C1530p;
import p104m6.C1610s;

/* renamed from: m6.q1 */
/* loaded from: classes.dex */
public final class C1606q1 implements InterfaceC1558a1 {

    /* renamed from: c */
    public final AbstractC1630z0 f7404c;

    public C1606q1(C1610s c1610s, double d7) {
        C1629z c1629z;
        if (d7 == 0.0d) {
            c1629z = InterfaceC1558a1.f7233C;
        } else {
            if (d7 != 1.0d) {
                c1610s.getClass();
                long doubleToLongBits = Double.doubleToLongBits(d7);
                int i7 = 1;
                while (true) {
                    if (i7 >= c1610s.f7410m) {
                        i7 = -1;
                        break;
                    }
                    AbstractC1517d abstractC1517d = c1610s.f7409e[i7];
                    if ((abstractC1517d instanceof C1521g) && Double.doubleToLongBits(((C1521g) abstractC1517d).f7161m) == doubleToLongBits) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 == -1) {
                    c1610s.m3990f();
                    i7 = c1610s.f7410m;
                    c1610s.f7409e[i7] = new C1521g(d7);
                    c1610s.f7410m = i7 + 2;
                }
                this.f7404c = new C1576g1(i7, 0);
                return;
            }
            c1629z = InterfaceC1558a1.f7235D;
        }
        this.f7404c = c1629z;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f7404c.mo3973e(true));
        stringBuffer.append(" (PUSH)");
        return stringBuffer.toString();
    }

    public C1606q1(C1610s c1610s, int i7) {
        AbstractC1630z0 c1615t1;
        if (i7 >= -1 && i7 <= 5) {
            c1615t1 = InterfaceC1558a1.f7329v1[i7 + 3];
        } else if (i7 >= -128 && i7 <= 127) {
            c1615t1 = new C1589l((byte) i7);
        } else {
            if (i7 < -32768 || i7 > 32767) {
                int i8 = 1;
                while (true) {
                    if (i8 >= c1610s.f7410m) {
                        i8 = -1;
                        break;
                    }
                    AbstractC1517d abstractC1517d = c1610s.f7409e[i8];
                    if ((abstractC1517d instanceof C1524j) && ((C1524j) abstractC1517d).f7162m == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 == -1) {
                    c1610s.m3990f();
                    i8 = c1610s.f7410m;
                    AbstractC1517d[] abstractC1517dArr = c1610s.f7409e;
                    c1610s.f7410m = i8 + 1;
                    abstractC1517dArr[i8] = new C1524j(i7);
                }
                this.f7404c = new C1579h1(i8);
                return;
            }
            c1615t1 = new C1615t1((short) i7);
        }
        this.f7404c = c1615t1;
    }

    public C1606q1(C1610s c1610s, String str) {
        if (str == null) {
            this.f7404c = InterfaceC1558a1.f7307o;
            return;
        }
        HashMap hashMap = c1610s.f7411s;
        C1610s.a aVar = (C1610s.a) hashMap.get(str);
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 == -1) {
            int m3989e = c1610s.m3989e(str);
            c1610s.m3990f();
            C1530p c1530p = new C1530p(m3989e);
            i7 = c1610s.f7410m;
            AbstractC1517d[] abstractC1517dArr = c1610s.f7409e;
            c1610s.f7410m = i7 + 1;
            abstractC1517dArr[i7] = c1530p;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new C1610s.a(i7));
            }
        }
        this.f7404c = new C1579h1(i7);
    }
}
