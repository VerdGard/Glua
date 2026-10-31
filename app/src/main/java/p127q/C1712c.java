package p127q;

import java.util.HashSet;
import java.util.Iterator;
import p120p.C1687h;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C1712c {

    /* renamed from: b */
    public final C1713d f7735b;

    /* renamed from: c */
    public final a f7736c;

    /* renamed from: d */
    public C1712c f7737d;

    /* renamed from: g */
    public C1687h f7740g;

    /* renamed from: a */
    public HashSet<C1712c> f7734a = null;

    /* renamed from: e */
    public int f7738e = 0;

    /* renamed from: f */
    public int f7739f = -1;

    /* renamed from: q.c$a */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        EF0,
        f7744c,
        f7745e,
        f7746m,
        f7747s,
        f7741X,
        f7742Y,
        f7743Z,
        f7748w1;

        a() {
        }
    }

    public C1712c(C1713d c1713d, a aVar) {
        this.f7735b = c1713d;
        this.f7736c = aVar;
    }

    /* renamed from: a */
    public final void m4147a(C1712c c1712c, int i7) {
        m4148b(c1712c, i7, -1, false);
    }

    /* renamed from: b */
    public final boolean m4148b(C1712c c1712c, int i7, int i8, boolean z6) {
        if (c1712c == null) {
            m4154h();
            return true;
        }
        if (!z6 && !m4153g(c1712c)) {
            return false;
        }
        this.f7737d = c1712c;
        if (c1712c.f7734a == null) {
            c1712c.f7734a = new HashSet<>();
        }
        this.f7737d.f7734a.add(this);
        if (i7 > 0) {
            this.f7738e = i7;
        } else {
            this.f7738e = 0;
        }
        this.f7739f = i8;
        return true;
    }

    /* renamed from: c */
    public final int m4149c() {
        C1712c c1712c;
        if (this.f7735b.f7773X == 8) {
            return 0;
        }
        int i7 = this.f7739f;
        return (i7 <= -1 || (c1712c = this.f7737d) == null || c1712c.f7735b.f7773X != 8) ? this.f7738e : i7;
    }

    /* renamed from: d */
    public final C1712c m4150d() {
        a aVar = this.f7736c;
        int ordinal = aVar.ordinal();
        C1713d c1713d = this.f7735b;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1713d.f7750A;
            case 2:
                return c1713d.f7751B;
            case 3:
                return c1713d.f7804y;
            case 4:
                return c1713d.f7805z;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* renamed from: e */
    public final boolean m4151e() {
        HashSet<C1712c> hashSet = this.f7734a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C1712c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m4150d().m4152f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4152f() {
        return this.f7737d != null;
    }

    /* renamed from: g */
    public final boolean m4153g(C1712c c1712c) {
        if (c1712c == null) {
            return false;
        }
        a aVar = a.f7741X;
        a aVar2 = this.f7736c;
        C1713d c1713d = c1712c.f7735b;
        a aVar3 = c1712c.f7736c;
        if (aVar3 == aVar2) {
            return aVar2 != aVar || (c1713d.f7802w && this.f7735b.f7802w);
        }
        int ordinal = aVar2.ordinal();
        a aVar4 = a.f7748w1;
        a aVar5 = a.f7743Z;
        switch (ordinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z6 = aVar3 == a.f7744c || aVar3 == a.f7746m;
                if (c1713d instanceof C1716g) {
                    return z6 || aVar3 == aVar5;
                }
                return z6;
            case 2:
            case 4:
                boolean z7 = aVar3 == a.f7745e || aVar3 == a.f7747s;
                if (c1713d instanceof C1716g) {
                    return z7 || aVar3 == aVar4;
                }
                return z7;
            case 6:
                return (aVar3 == aVar || aVar3 == aVar5 || aVar3 == aVar4) ? false : true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    /* renamed from: h */
    public final void m4154h() {
        HashSet<C1712c> hashSet;
        C1712c c1712c = this.f7737d;
        if (c1712c != null && (hashSet = c1712c.f7734a) != null) {
            hashSet.remove(this);
        }
        this.f7737d = null;
        this.f7738e = 0;
        this.f7739f = -1;
    }

    /* renamed from: i */
    public final void m4155i() {
        C1687h c1687h = this.f7740g;
        if (c1687h == null) {
            this.f7740g = new C1687h(1);
        } else {
            c1687h.m4112c();
        }
    }

    public final String toString() {
        return this.f7735b.f7774Y + ":" + this.f7736c.toString();
    }
}
