package p096l6;

import p036e2.C1104v0;

/* renamed from: l6.a0 */
/* loaded from: classes.dex */
public final class C1512a0 extends AbstractC1535u {

    /* renamed from: w1 */
    public static final C1104v0 f7141w1 = new C1104v0(3);

    public C1512a0() {
    }

    public C1512a0(int i7, int i8, int i9, AbstractC1511a[] abstractC1511aArr, C1529o c1529o) {
        super(i7, i8, i9, abstractC1511aArr, c1529o);
    }

    public final boolean equals(Object obj) {
        return f7141w1.m3233a(this, obj);
    }

    public final int hashCode() {
        return f7141w1.m3234b(this);
    }

    @Override // p032d6.AbstractC0899g
    public final String toString() {
        C1533s c1533s;
        C1513b c1513b;
        C1540z c1540z;
        int i7 = 0;
        String m3931a = AbstractC1518d0.m3931a(this.f4690e, false);
        C1529o c1529o = this.f7173Z;
        C1531q c1531q = (C1531q) c1529o.m3937b((byte) 1, this.f7175s);
        C1531q c1531q2 = (C1531q) c1529o.m3937b((byte) 1, this.f7174m);
        int i8 = 0;
        while (true) {
            c1533s = null;
            if (i8 >= this.f7171X) {
                c1513b = null;
                break;
            }
            AbstractC1511a abstractC1511a = this.f7172Y[i8];
            if (abstractC1511a instanceof C1513b) {
                c1513b = (C1513b) abstractC1511a;
                break;
            }
            i8++;
        }
        if (c1513b != null) {
            for (int i9 = 0; i9 < c1513b.f7149z1; i9++) {
                AbstractC1511a abstractC1511a2 = c1513b.f7142A1[i9];
                if (abstractC1511a2 instanceof C1540z) {
                    c1540z = (C1540z) abstractC1511a2;
                    break;
                }
            }
        }
        c1540z = null;
        StringBuffer stringBuffer = new StringBuffer(AbstractC1518d0.m3934d(c1531q.f7168m, c1531q2.f7168m, m3931a, c1540z));
        for (int i10 = 0; i10 < this.f7171X; i10++) {
            AbstractC1511a abstractC1511a3 = this.f7172Y[i10];
            if (!(abstractC1511a3 instanceof C1513b) && !(abstractC1511a3 instanceof C1533s)) {
                stringBuffer.append(" [");
                stringBuffer.append(abstractC1511a3.toString());
                stringBuffer.append("]");
            }
        }
        while (true) {
            if (i7 >= this.f7171X) {
                break;
            }
            AbstractC1511a abstractC1511a4 = this.f7172Y[i7];
            if (abstractC1511a4 instanceof C1533s) {
                c1533s = (C1533s) abstractC1511a4;
                break;
            }
            i7++;
        }
        if (c1533s != null) {
            String c1533s2 = c1533s.toString();
            if (!c1533s2.equals("")) {
                stringBuffer.append("\n\t\tthrows ");
                stringBuffer.append(c1533s2);
            }
        }
        return stringBuffer.toString();
    }
}
