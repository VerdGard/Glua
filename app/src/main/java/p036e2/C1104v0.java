package p036e2;

import p060h2.InterfaceC1295d;
import p096l6.C1512a0;
import p096l6.C1536v;
import p104m6.C1604q;

/* renamed from: e2.v0 */
/* loaded from: classes.dex */
public final class C1104v0 implements InterfaceC1295d {

    /* renamed from: a */
    public final int f5482a;

    /* renamed from: a */
    public boolean m3233a(Object obj, Object obj2) {
        switch (this.f5482a) {
            case 2:
                return ((C1536v) obj).f7184Z.equals(((C1536v) obj2).f7184Z);
            case 3:
                C1512a0 c1512a0 = (C1512a0) obj;
                C1512a0 c1512a02 = (C1512a0) obj2;
                return c1512a0.m3941e().equals(c1512a02.m3941e()) && c1512a0.m3942f().equals(c1512a02.m3942f());
            default:
                return ((C1604q) obj).f7398m.equals(((C1604q) obj2).f7398m);
        }
    }

    /* renamed from: b */
    public int m3234b(Object obj) {
        switch (this.f5482a) {
            case 2:
                return ((C1536v) obj).f7184Z.hashCode();
            case 3:
                C1512a0 c1512a0 = (C1512a0) obj;
                return c1512a0.m3941e().hashCode() ^ c1512a0.m3942f().hashCode();
            default:
                return ((C1604q) obj).f7398m.hashCode();
        }
    }
}
