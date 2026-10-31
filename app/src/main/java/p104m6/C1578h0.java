package p104m6;

import p096l6.AbstractC1518d0;
import p096l6.C1534t;
import p192y2.C2231a;

/* renamed from: m6.h0 */
/* loaded from: classes.dex */
public final class C1578h0 extends AbstractC1581i0 {

    /* renamed from: Z */
    public static final C2231a f7351Z = new C2231a(2);

    public C1578h0(int i7, AbstractC1612s1 abstractC1612s1, String str, C1610s c1610s) {
        this.f4690e = i7;
        m3968e(abstractC1612s1);
        this.f7354m = str;
        this.f7352X = c1610s;
    }

    public final boolean equals(Object obj) {
        return f7351Z.m5416a(this, obj);
    }

    /* renamed from: f */
    public final C1534t m3964f() {
        String str = this.f7355s.f7434e;
        return new C1534t(this.f4690e, this.f7352X.m3989e(this.f7354m), this.f7352X.m3989e(str), m3967d(), this.f7352X.m3991g());
    }

    public final int hashCode() {
        return f7351Z.m5417b(this);
    }

    @Override // p032d6.AbstractC0899g
    public final String toString() {
        String m3931a = AbstractC1518d0.m3931a(this.f4690e, false);
        String concat = m3931a.equals("") ? "" : m3931a.concat(" ");
        String abstractC1624w1 = this.f7355s.toString();
        String str = this.f7354m;
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append(concat);
        stringBuffer.append(abstractC1624w1);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
