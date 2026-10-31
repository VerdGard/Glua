package p103m5;

import androidx.activity.C0143v;
import androidx.lifecycle.C0391d0;
import p002a1.C0017d;
import p021c4.C0623k;
import p032d6.C0898f;
import p055g5.C1245b;
import p055g5.C1253j;
import p067i1.C1321c;
import p072i6.C1390a;
import p111n5.C1645a;
import p111n5.C1646b;
import p132q4.C1775d;
import p132q4.C1796y;
import p132q4.C1797z;
import p178w4.C2124d;

/* renamed from: m5.a */
/* loaded from: classes.dex */
public final class C1555a {

    /* renamed from: d */
    public static final C1390a f7225d = new C1390a();

    /* renamed from: a */
    public final C1245b f7226a;

    /* renamed from: b */
    public int f7227b;

    /* renamed from: c */
    public int f7228c;

    public C1555a(C1245b c1245b) {
        C0898f.m2606e(c1245b, "editor");
        this.f7226a = c1245b;
        C0017d c0017d = new C0017d();
        this.f7227b = -1;
        this.f7228c = -1;
        C1646b c1646b = new C1646b();
        c1245b.getClipboardManager();
        c1646b.m4007a(new C1645a());
        c1646b.m4007a(new C0143v());
        c1646b.m4007a(new C0391d0());
        c1646b.m4007a(new C1321c());
        c1646b.m4007a(c0017d);
        c1245b.m3508q0(C1796y.class, new C1253j(2, this));
        c1245b.m3508q0(C1775d.class, new C0623k(5, this));
    }

    /* renamed from: a */
    public final boolean m3948a(int i7) {
        C2124d m3949b = m3949b();
        C0898f.m2603b(m3949b);
        return i7 >= m3949b.f9599c && i7 <= m3949b.f9600e;
    }

    /* renamed from: b */
    public final C2124d m3949b() {
        if (this.f7227b == -1) {
            return null;
        }
        C0898f.m2603b(null);
        throw null;
    }

    /* renamed from: c */
    public final boolean m3950c() {
        return (this.f7227b == -1 || this.f7228c == -1) ? false : true;
    }

    /* renamed from: d */
    public final void m3951d() {
        if (m3950c()) {
            this.f7227b = -1;
            this.f7228c = -1;
            C1245b c1245b = this.f7226a;
            c1245b.f5988B1.m4244a(new C1797z(c1245b));
            c1245b.invalidate();
        }
    }
}
