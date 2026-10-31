package p104m6;

import java.io.Serializable;
import java.util.HashMap;
import p096l6.AbstractC1517d;
import p096l6.C1525k;
import p104m6.C1610s;

/* renamed from: m6.b1 */
/* loaded from: classes.dex */
public final class C1561b1 implements InterfaceC1558a1, Serializable {

    /* renamed from: c */
    public final C1610s f7338c;

    static {
        C1592m c1592m = AbstractC1624w1.f7427m;
        C1592m c1592m2 = AbstractC1624w1.f7427m;
        C1592m c1592m3 = AbstractC1624w1.f7427m;
        C1592m c1592m4 = AbstractC1624w1.f7427m;
        C1592m c1592m5 = AbstractC1624w1.f7427m;
        C1592m c1592m6 = AbstractC1624w1.f7427m;
        C1592m c1592m7 = AbstractC1624w1.f7427m;
        C1592m c1592m8 = AbstractC1624w1.f7427m;
        C1592m c1592m9 = AbstractC1624w1.f7427m;
    }

    public C1561b1(C1604q c1604q) {
        this.f7338c = c1604q.f7402y1;
    }

    /* renamed from: a */
    public final AbstractC1584j0 m3952a(String str, String str2, AbstractC1612s1 abstractC1612s1, short s7) {
        int m3986b = this.f7338c.m3986b(str, str2, abstractC1612s1.f7434e);
        switch (s7) {
            case 178:
                return new C1593m0(m3986b, 0);
            case 179:
                return new C1609r1(m3986b);
            case 180:
                return new C1590l0(m3986b);
            case 181:
                return new C1593m0(m3986b, 1);
            default:
                StringBuffer stringBuffer = new StringBuffer("Oops: Unknown getfield kind:");
                stringBuffer.append((int) s7);
                throw new RuntimeException(stringBuffer.toString());
        }
    }

    /* renamed from: b */
    public final AbstractC1584j0 m3953b(String str, String str2, AbstractC1624w1 abstractC1624w1, AbstractC1624w1[] abstractC1624w1Arr, short s7) {
        int m3987c;
        String m3992a = AbstractC1624w1.m3992a(abstractC1624w1, abstractC1624w1Arr);
        int i7 = 0;
        for (AbstractC1624w1 abstractC1624w12 : abstractC1624w1Arr) {
            i7 += abstractC1624w12.m3994b();
        }
        C1610s c1610s = this.f7338c;
        if (s7 == 185) {
            HashMap hashMap = c1610s.f7412w1;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append("#");
            stringBuffer.append(str2);
            stringBuffer.append("#");
            stringBuffer.append(m3992a);
            C1610s.a aVar = (C1610s.a) hashMap.get(stringBuffer.toString());
            m3987c = aVar != null ? aVar.f7413c : -1;
            if (m3987c == -1) {
                c1610s.m3990f();
                int m3985a = c1610s.m3985a(str);
                int m3988d = c1610s.m3988d(str2, m3992a);
                int i8 = c1610s.f7410m;
                AbstractC1517d[] abstractC1517dArr = c1610s.f7409e;
                c1610s.f7410m = i8 + 1;
                abstractC1517dArr[i8] = new C1525k(m3985a, m3988d);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append("#");
                stringBuffer2.append(str2);
                stringBuffer2.append("#");
                stringBuffer2.append(m3992a);
                String stringBuffer3 = stringBuffer2.toString();
                if (!hashMap.containsKey(stringBuffer3)) {
                    hashMap.put(stringBuffer3, new C1610s.a(i8));
                }
                m3987c = i8;
            }
        } else {
            m3987c = c1610s.m3987c(str, str2, m3992a);
        }
        switch (s7) {
            case 182:
                return new C1620v0(m3987c);
            case 183:
                return new C1614t0(m3987c);
            case 184:
                return new C1617u0(m3987c);
            case 185:
                return new C1611s0(m3987c, i7 + 1);
            default:
                StringBuffer stringBuffer4 = new StringBuffer("Oops: Unknown invoke kind:");
                stringBuffer4.append((int) s7);
                throw new RuntimeException(stringBuffer4.toString());
        }
    }
}
