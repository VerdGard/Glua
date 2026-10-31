package p192y2;

import p096l6.AbstractC1517d;
import p104m6.AbstractC1624w1;
import p104m6.C1578h0;
import p104m6.C1597n1;

/* renamed from: y2.a */
/* loaded from: classes.dex */
public final class C2231a {

    /* renamed from: a */
    public final /* synthetic */ int f10134a;

    public /* synthetic */ C2231a(int i7) {
        this.f10134a = i7;
    }

    /* renamed from: a */
    public final boolean m5416a(Object obj, Object obj2) {
        switch (this.f10134a) {
            case 1:
                return ((AbstractC1517d) obj).toString().equals(((AbstractC1517d) obj2).toString());
            case 2:
                C1578h0 c1578h0 = (C1578h0) obj;
                C1578h0 c1578h02 = (C1578h0) obj2;
                return c1578h0.f7354m.equals(c1578h02.f7354m) && c1578h0.f7355s.f7434e.equals(c1578h02.f7355s.f7434e);
            default:
                C1597n1 c1597n1 = (C1597n1) obj;
                C1597n1 c1597n12 = (C1597n1) obj2;
                return c1597n1.f7354m.equals(c1597n12.f7354m) && AbstractC1624w1.m3992a(c1597n1.f7355s, c1597n1.f7376Z).equals(AbstractC1624w1.m3992a(c1597n12.f7355s, c1597n12.f7376Z));
        }
    }

    /* renamed from: b */
    public final int m5417b(Object obj) {
        switch (this.f10134a) {
            case 1:
                return ((AbstractC1517d) obj).toString().hashCode();
            case 2:
                C1578h0 c1578h0 = (C1578h0) obj;
                return c1578h0.f7354m.hashCode() ^ c1578h0.f7355s.f7434e.hashCode();
            default:
                C1597n1 c1597n1 = (C1597n1) obj;
                return c1597n1.f7354m.hashCode() ^ AbstractC1624w1.m3992a(c1597n1.f7355s, c1597n1.f7376Z).hashCode();
        }
    }
}
