package p035e1;

import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p018c1.C0590k;
import p026d0.C0875c;
import p043f1.C1157b;
import p043f1.InterfaceC1162g;
import p060h2.InterfaceC1293b;
import p060h2.InterfaceC1295d;
import p060h2.InterfaceC1296e;

/* renamed from: e1.g */
/* loaded from: classes.dex */
public final class C0955g implements InterfaceC1162g, InterfaceC1293b, InterfaceC1295d, InterfaceC1296e {

    /* renamed from: a */
    public final /* synthetic */ int f4920a;

    /* renamed from: b */
    public Object f4921b;

    /* renamed from: c */
    public Object f4922c;

    public C0955g() {
        this.f4920a = 0;
    }

    @Override // p043f1.InterfaceC1162g
    /* renamed from: a */
    public final AbstractC0580a mo1994a() {
        return new C0590k((C0582c) ((C1157b) this.f4921b).mo1994a(), (C0582c) ((C1157b) this.f4922c).mo1994a());
    }

    public final boolean equals(Object obj) {
        switch (this.f4920a) {
            case 0:
                if (!(obj instanceof C0875c)) {
                    return false;
                }
                C0875c c0875c = (C0875c) obj;
                Object obj2 = c0875c.f4643a;
                Object obj3 = this.f4921b;
                if (!(obj2 == obj3 || (obj2 != null && obj2.equals(obj3)))) {
                    return false;
                }
                Object obj4 = this.f4922c;
                Object obj5 = c0875c.f4644b;
                return obj5 == obj4 || (obj5 != null && obj5.equals(obj4));
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f4920a) {
            case 0:
                Object obj = this.f4921b;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f4922c;
                return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f4920a) {
            case 0:
                return "Pair{" + String.valueOf(this.f4921b) + " " + String.valueOf(this.f4922c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0955g(Object obj, int i7, Object obj2) {
        this.f4920a = i7;
        this.f4921b = obj;
        this.f4922c = obj2;
    }
}
