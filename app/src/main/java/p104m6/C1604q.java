package p104m6;

import java.util.ArrayList;
import p032d6.AbstractC0899g;
import p036e2.C1104v0;
import p096l6.AbstractC1511a;
import p096l6.AbstractC1517d;
import p096l6.C1512a0;
import p096l6.C1514b0;
import p096l6.C1529o;
import p096l6.C1534t;
import p096l6.C1536v;

/* renamed from: m6.q */
/* loaded from: classes.dex */
public final class C1604q extends AbstractC0899g implements Cloneable {

    /* renamed from: D1 */
    public static final C1104v0 f7391D1 = new C1104v0(4);

    /* renamed from: A1 */
    public final ArrayList f7392A1;

    /* renamed from: B1 */
    public final ArrayList f7393B1;

    /* renamed from: C1 */
    public final ArrayList f7394C1;

    /* renamed from: X */
    public final String f7395X;

    /* renamed from: Y */
    public final int f7396Y;

    /* renamed from: Z */
    public final int f7397Z;

    /* renamed from: m */
    public final String f7398m;

    /* renamed from: s */
    public final String f7399s;

    /* renamed from: w1 */
    public final int f7400w1;

    /* renamed from: x1 */
    public final int f7401x1;

    /* renamed from: y1 */
    public final C1610s f7402y1;

    /* renamed from: z1 */
    public final ArrayList f7403z1;

    public C1604q(String str, String str2, String str3) {
        C1610s c1610s = new C1610s();
        this.f7396Y = -1;
        this.f7397Z = -1;
        this.f7400w1 = 45;
        this.f7401x1 = 3;
        this.f7403z1 = new ArrayList();
        this.f7392A1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f7393B1 = arrayList;
        this.f7394C1 = new ArrayList();
        this.f7398m = str;
        this.f7399s = str2;
        this.f7395X = str3;
        this.f4690e = 33;
        this.f7402y1 = c1610s;
        if (str3 != null) {
            arrayList.add(new C1514b0(c1610s.m3989e("SourceFile"), c1610s.m3989e(str3), c1610s.m3991g()));
        }
        this.f7396Y = c1610s.m3985a(str);
        this.f7397Z = c1610s.m3985a(str2);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e7) {
            System.err.println(e7);
            return null;
        }
    }

    /* renamed from: d */
    public final C1536v m3984d() {
        ArrayList arrayList = this.f7394C1;
        int size = arrayList.size();
        int[] iArr = new int[size];
        int i7 = 0;
        while (true) {
            C1610s c1610s = this.f7402y1;
            if (i7 >= size) {
                ArrayList arrayList2 = this.f7403z1;
                C1534t[] c1534tArr = (C1534t[]) arrayList2.toArray(new C1534t[arrayList2.size()]);
                ArrayList arrayList3 = this.f7392A1;
                C1512a0[] c1512a0Arr = (C1512a0[]) arrayList3.toArray(new C1512a0[arrayList3.size()]);
                ArrayList arrayList4 = this.f7393B1;
                AbstractC1511a[] abstractC1511aArr = (AbstractC1511a[]) arrayList4.toArray(new AbstractC1511a[arrayList4.size()]);
                int i8 = c1610s.f7410m;
                AbstractC1517d[] abstractC1517dArr = new AbstractC1517d[i8];
                System.arraycopy(c1610s.f7409e, 0, abstractC1517dArr, 0, i8);
                return new C1536v(this.f7396Y, this.f7397Z, this.f7395X, this.f7400w1, this.f7401x1, this.f4690e, new C1529o(abstractC1517dArr), iArr, c1534tArr, c1512a0Arr, abstractC1511aArr);
            }
            iArr[i7] = c1610s.m3985a((String) arrayList.get(i7));
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        return f7391D1.m3233a(this, obj);
    }

    public final int hashCode() {
        return f7391D1.m3234b(this);
    }
}
