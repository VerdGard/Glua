package p104m6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;
import p096l6.AbstractC1518d0;
import p096l6.C1539y;
import p096l6.C1540z;
import p192y2.C2231a;

/* renamed from: m6.n1 */
/* loaded from: classes.dex */
public final class C1597n1 extends AbstractC1581i0 {

    /* renamed from: E1 */
    public static final C2231a f7371E1 = new C2231a(3);

    /* renamed from: Z */
    public AbstractC1624w1[] f7376Z;

    /* renamed from: w1 */
    public int f7377w1;

    /* renamed from: x1 */
    public int f7378x1;

    /* renamed from: y1 */
    public C1567d1 f7379y1;

    /* renamed from: z1 */
    public final ArrayList f7380z1 = new ArrayList();

    /* renamed from: A1 */
    public final ArrayList f7372A1 = new ArrayList();

    /* renamed from: B1 */
    public final ArrayList f7373B1 = new ArrayList();

    /* renamed from: C1 */
    public final ArrayList f7374C1 = new ArrayList();

    /* renamed from: D1 */
    public final ArrayList f7375D1 = new ArrayList();

    /* renamed from: m6.n1$a */
    public static final class a {

        /* renamed from: a */
        public final Stack f7381a = new Stack();

        /* renamed from: b */
        public final Hashtable f7382b = new Hashtable();

        /* renamed from: a */
        public final void m3980a(C1564c1 c1564c1, int i7) {
            Hashtable hashtable = this.f7382b;
            if (hashtable.get(c1564c1) != null) {
                return;
            }
            Stack stack = this.f7381a;
            b bVar = new b(c1564c1, i7);
            hashtable.put(c1564c1, bVar);
            stack.push(bVar);
        }
    }

    /* renamed from: m6.n1$b */
    public static final class b {

        /* renamed from: a */
        public final C1564c1 f7383a;

        /* renamed from: b */
        public final int f7384b;

        public b(C1564c1 c1564c1, int i7) {
            this.f7383a = c1564c1;
            this.f7384b = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1597n1(int r3, p104m6.AbstractC1624w1 r4, p104m6.AbstractC1624w1[] r5, java.lang.String[] r6, java.lang.String r7, java.lang.String r8, p104m6.C1567d1 r9, p104m6.C1610s r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p104m6.C1597n1.<init>(int, m6.w1, m6.w1[], java.lang.String[], java.lang.String, java.lang.String, m6.d1, m6.s):void");
    }

    /* renamed from: j */
    public static final void m3975j(C1591l1[] c1591l1Arr, int i7, int i8) {
        C1591l1 c1591l1;
        int i9 = c1591l1Arr[(i7 + i8) / 2].f7363c;
        int i10 = i7;
        int i11 = i8;
        while (true) {
            if (c1591l1Arr[i10].f7363c < i9) {
                i10++;
            } else {
                while (true) {
                    c1591l1 = c1591l1Arr[i11];
                    if (i9 >= c1591l1.f7363c) {
                        break;
                    } else {
                        i11--;
                    }
                }
                if (i10 <= i11) {
                    C1591l1 c1591l12 = c1591l1Arr[i10];
                    c1591l1Arr[i10] = c1591l1;
                    c1591l1Arr[i11] = c1591l12;
                    i10++;
                    i11--;
                }
                if (i10 > i11) {
                    break;
                }
            }
        }
        if (i7 < i11) {
            m3975j(c1591l1Arr, i7, i11);
        }
        if (i10 < i8) {
            m3975j(c1591l1Arr, i10, i8);
        }
    }

    public final boolean equals(Object obj) {
        return f7371E1.m5416a(this, obj);
    }

    /* renamed from: f */
    public final C1591l1 m3976f(String str, AbstractC1624w1 abstractC1624w1, C1564c1 c1564c1, C1564c1 c1564c12) {
        int i7 = this.f7377w1;
        if (abstractC1624w1.f7433c == 16) {
            StringBuffer stringBuffer = new StringBuffer("Can not use ");
            stringBuffer.append(abstractC1624w1);
            stringBuffer.append(" as type for local variable");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int m3994b = abstractC1624w1.m3994b() + i7;
        if (m3994b > this.f7377w1) {
            this.f7377w1 = m3994b;
        }
        C1591l1 c1591l1 = new C1591l1(i7, str, c1564c1, c1564c12, abstractC1624w1);
        ArrayList arrayList = this.f7380z1;
        int indexOf = arrayList.indexOf(c1591l1);
        if (indexOf >= 0) {
            arrayList.set(indexOf, c1591l1);
        } else {
            arrayList.add(c1591l1);
        }
        return c1591l1;
    }

    /* renamed from: g */
    public final C1540z m3977g(C1610s c1610s) {
        ArrayList arrayList = this.f7380z1;
        int size = arrayList.size();
        C1591l1[] c1591l1Arr = new C1591l1[size];
        arrayList.toArray(c1591l1Arr);
        for (int i7 = 0; i7 < size; i7++) {
            C1591l1 c1591l1 = c1591l1Arr[i7];
            C1564c1 c1564c1 = c1591l1.f7366s;
            if (c1564c1 == null) {
                C1564c1 c1564c12 = this.f7379y1.f7346c;
                AbstractC1598o.m3981g(c1564c1, c1564c12, c1591l1);
                c1591l1.f7366s = c1564c12;
            }
            C1591l1 c1591l12 = c1591l1Arr[i7];
            C1564c1 c1564c13 = c1591l12.f7362X;
            if (c1564c13 == null) {
                C1564c1 c1564c14 = this.f7379y1.f7347e;
                AbstractC1598o.m3981g(c1564c13, c1564c14, c1591l12);
                c1591l12.f7362X = c1564c14;
            }
        }
        if (size > 1) {
            m3975j(c1591l1Arr, 0, size - 1);
        }
        C1539y[] c1539yArr = new C1539y[size];
        for (int i8 = 0; i8 < size; i8++) {
            C1591l1 c1591l13 = c1591l1Arr[i8];
            int mo3955b = c1591l13.f7366s.mo3955b();
            int mo3955b2 = c1591l13.f7362X.mo3955b() - mo3955b;
            if (mo3955b2 > 0) {
                mo3955b2 += c1591l13.f7362X.f7344m.f7436c;
            }
            c1539yArr[i8] = new C1539y(mo3955b, mo3955b2, c1610s.m3989e(c1591l13.f7364e), c1610s.m3989e(c1591l13.f7365m.f7434e), c1591l13.f7363c, c1610s.m3991g());
        }
        return new C1540z(c1610s.m3989e("LocalVariableTable"), (size * 10) + 2, c1539yArr, c1610s.m3991g());
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p096l6.C1512a0 m3978h() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p104m6.C1597n1.m3978h():l6.a0");
    }

    public final int hashCode() {
        return f7371E1.m5417b(this);
    }

    /* renamed from: i */
    public final void m3979i() {
        C1567d1 c1567d1 = this.f7379y1;
        if (c1567d1 == null) {
            this.f7378x1 = 0;
            return;
        }
        C1610s c1610s = this.f7352X;
        ArrayList arrayList = this.f7373B1;
        int size = arrayList.size();
        C1607r[] c1607rArr = new C1607r[size];
        arrayList.toArray(c1607rArr);
        a aVar = new a();
        for (int i7 = 0; i7 < size; i7++) {
            c1607rArr[i7].getClass();
        }
        C1564c1 c1564c1 = c1567d1.f7346c;
        int i8 = 0;
        int i9 = 0;
        while (c1564c1 != null) {
            AbstractC1630z0 abstractC1630z0 = c1564c1.f7344m;
            short s7 = abstractC1630z0.f7437e;
            i9 += abstractC1630z0.mo3970d(c1610s) - abstractC1630z0.mo3969a(c1610s);
            if (i9 > i8) {
                i8 = i9;
            }
            if (abstractC1630z0 instanceof AbstractC1598o) {
                AbstractC1598o abstractC1598o = (AbstractC1598o) abstractC1630z0;
                if (abstractC1630z0 instanceof AbstractC1618u1) {
                    for (C1564c1 c1564c12 : ((AbstractC1618u1) abstractC1598o).f7418w1) {
                        aVar.m3980a(c1564c12, i9);
                    }
                } else {
                    if (!(abstractC1598o instanceof AbstractC1626x0)) {
                        if (s7 == 168 || s7 == 201) {
                            aVar.m3980a(c1564c1.f7342c, i9 - 1);
                        }
                    }
                    aVar.m3980a(abstractC1598o.f7387s, i9);
                }
                c1564c1 = null;
                aVar.m3980a(abstractC1598o.f7387s, i9);
            } else if (s7 == 191 || s7 == 169 || (s7 >= 172 && s7 <= 177)) {
                c1564c1 = null;
            }
            if (c1564c1 != null) {
                c1564c1 = c1564c1.f7342c;
            }
            if (c1564c1 == null) {
                Stack stack = aVar.f7381a;
                b bVar = stack.empty() ? null : (b) stack.pop();
                if (bVar != null) {
                    c1564c1 = bVar.f7383a;
                    i9 = bVar.f7384b;
                }
            }
        }
        this.f7378x1 = i8;
    }

    @Override // p032d6.AbstractC0899g
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(AbstractC1518d0.m3934d(AbstractC1624w1.m3992a(this.f7355s, this.f7376Z), this.f7354m, AbstractC1518d0.m3931a(this.f4690e, false), m3977g(this.f7352X)));
        ArrayList arrayList = this.f7374C1;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("\n\t\tthrows ");
                stringBuffer.append(it.next());
            }
        }
        return stringBuffer.toString();
    }
}
