package p096l6;

import p100m2.C1547c;

/* renamed from: l6.t */
/* loaded from: classes.dex */
public final class C1534t extends AbstractC1535u {
    static {
        new C1547c();
    }

    public C1534t(int i7, int i8, int i9, AbstractC1511a[] abstractC1511aArr, C1529o c1529o) {
        super(i7, i8, i9, abstractC1511aArr, c1529o);
    }

    public final boolean equals(Object obj) {
        C1534t c1534t = (C1534t) obj;
        return m3941e().equals(c1534t.m3941e()) && m3942f().equals(c1534t.m3942f());
    }

    public final int hashCode() {
        return m3942f().hashCode() ^ m3941e().hashCode();
    }

    @Override // p032d6.AbstractC0899g
    public final String toString() {
        C1532r c1532r;
        String m3931a = AbstractC1518d0.m3931a(this.f4690e, false);
        String concat = m3931a.equals("") ? "" : m3931a.concat(" ");
        String m3935e = AbstractC1518d0.m3935e(m3942f(), true);
        String m3941e = m3941e();
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(concat);
        stringBuffer.append(m3935e);
        stringBuffer.append(" ");
        stringBuffer.append(m3941e);
        int i7 = 0;
        while (true) {
            if (i7 >= this.f7171X) {
                c1532r = null;
                break;
            }
            AbstractC1511a abstractC1511a = this.f7172Y[i7];
            if (abstractC1511a.f7139m == 1) {
                c1532r = (C1532r) abstractC1511a;
                break;
            }
            i7++;
        }
        if (c1532r != null) {
            stringBuffer.append(" = ");
            stringBuffer.append(c1532r);
        }
        for (int i8 = 0; i8 < this.f7171X; i8++) {
            AbstractC1511a abstractC1511a2 = this.f7172Y[i8];
            if (!(abstractC1511a2 instanceof C1532r)) {
                stringBuffer.append(" [");
                stringBuffer.append(abstractC1511a2.toString());
                stringBuffer.append("]");
            }
        }
        return stringBuffer.toString();
    }
}
