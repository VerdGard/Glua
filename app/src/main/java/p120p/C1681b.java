package p120p;

import java.util.ArrayList;
import p120p.C1683d;

/* renamed from: p.b */
/* loaded from: classes.dex */
public class C1681b implements C1683d.a {

    /* renamed from: d */
    public a f7565d;

    /* renamed from: a */
    public C1687h f7562a = null;

    /* renamed from: b */
    public float f7563b = 0.0f;

    /* renamed from: c */
    public final ArrayList<C1687h> f7564c = new ArrayList<>();

    /* renamed from: e */
    public boolean f7566e = false;

    /* renamed from: p.b$a */
    public interface a {
        /* renamed from: a */
        float mo4065a(int i7);

        /* renamed from: b */
        float mo4066b(C1681b c1681b, boolean z6);

        /* renamed from: c */
        float mo4067c(C1687h c1687h, boolean z6);

        void clear();

        /* renamed from: d */
        void mo4068d(C1687h c1687h, float f7);

        /* renamed from: e */
        boolean mo4069e(C1687h c1687h);

        /* renamed from: f */
        void mo4070f(C1687h c1687h, float f7, boolean z6);

        /* renamed from: g */
        int mo4071g();

        /* renamed from: h */
        C1687h mo4072h(int i7);

        /* renamed from: i */
        float mo4073i(C1687h c1687h);

        /* renamed from: j */
        void mo4074j(float f7);

        /* renamed from: k */
        void mo4075k();
    }

    public C1681b() {
    }

    public C1681b(C1682c c1682c) {
        this.f7565d = new C1680a(this, c1682c);
    }

    @Override // p120p.C1683d.a
    /* renamed from: a */
    public C1687h mo4076a(boolean[] zArr) {
        return m4080e(zArr, null);
    }

    /* renamed from: b */
    public final void m4077b(C1683d c1683d, int i7) {
        this.f7565d.mo4068d(c1683d.m4096j(i7), 1.0f);
        this.f7565d.mo4068d(c1683d.m4096j(i7), -1.0f);
    }

    /* renamed from: c */
    public final void m4078c(C1687h c1687h, C1687h c1687h2, C1687h c1687h3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f7563b = i7;
        }
        if (z6) {
            this.f7565d.mo4068d(c1687h, 1.0f);
            this.f7565d.mo4068d(c1687h2, -1.0f);
            this.f7565d.mo4068d(c1687h3, -1.0f);
        } else {
            this.f7565d.mo4068d(c1687h, -1.0f);
            this.f7565d.mo4068d(c1687h2, 1.0f);
            this.f7565d.mo4068d(c1687h3, 1.0f);
        }
    }

    /* renamed from: d */
    public final void m4079d(C1687h c1687h, C1687h c1687h2, C1687h c1687h3, int i7) {
        boolean z6 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z6 = true;
            }
            this.f7563b = i7;
        }
        if (z6) {
            this.f7565d.mo4068d(c1687h, 1.0f);
            this.f7565d.mo4068d(c1687h2, -1.0f);
            this.f7565d.mo4068d(c1687h3, 1.0f);
        } else {
            this.f7565d.mo4068d(c1687h, -1.0f);
            this.f7565d.mo4068d(c1687h2, 1.0f);
            this.f7565d.mo4068d(c1687h3, -1.0f);
        }
    }

    /* renamed from: e */
    public final C1687h m4080e(boolean[] zArr, C1687h c1687h) {
        int i7;
        int mo4071g = this.f7565d.mo4071g();
        C1687h c1687h2 = null;
        float f7 = 0.0f;
        for (int i8 = 0; i8 < mo4071g; i8++) {
            float mo4065a = this.f7565d.mo4065a(i8);
            if (mo4065a < 0.0f) {
                C1687h mo4072h = this.f7565d.mo4072h(i8);
                if ((zArr == null || !zArr[mo4072h.f7598b]) && mo4072h != c1687h && (((i7 = mo4072h.f7605i) == 3 || i7 == 4) && mo4065a < f7)) {
                    f7 = mo4065a;
                    c1687h2 = mo4072h;
                }
            }
        }
        return c1687h2;
    }

    /* renamed from: f */
    public final void m4081f(C1687h c1687h) {
        C1687h c1687h2 = this.f7562a;
        if (c1687h2 != null) {
            this.f7565d.mo4068d(c1687h2, -1.0f);
            this.f7562a = null;
        }
        float mo4067c = this.f7565d.mo4067c(c1687h, true) * (-1.0f);
        this.f7562a = c1687h;
        if (mo4067c == 1.0f) {
            return;
        }
        this.f7563b /= mo4067c;
        this.f7565d.mo4074j(mo4067c);
    }

    /* renamed from: g */
    public final void m4082g() {
        this.f7562a = null;
        this.f7565d.clear();
        this.f7563b = 0.0f;
        this.f7566e = false;
    }

    /* renamed from: h */
    public final void m4083h(C1687h c1687h, boolean z6) {
        if (c1687h.f7602f) {
            float mo4073i = this.f7565d.mo4073i(c1687h);
            this.f7563b = (c1687h.f7601e * mo4073i) + this.f7563b;
            this.f7565d.mo4067c(c1687h, z6);
            if (z6) {
                c1687h.m4111b(this);
            }
        }
    }

    /* renamed from: i */
    public void mo4084i(C1681b c1681b, boolean z6) {
        float mo4066b = this.f7565d.mo4066b(c1681b, z6);
        this.f7563b = (c1681b.f7563b * mo4066b) + this.f7563b;
        if (z6) {
            c1681b.f7562a.m4111b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            p.h r0 = r8.f7562a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            p.h r1 = r8.f7562a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = android.ext.C0089a.m210h(r0, r1)
            float r1 = r8.f7563b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = p120p.C1686g.m4107b(r0)
            float r1 = r8.f7563b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            p.b$a r4 = r8.f7565d
            int r4 = r4.mo4071g()
        L3b:
            if (r2 >= r4) goto La0
            p.b$a r5 = r8.f7565d
            p.h r5 = r5.mo4072h(r2)
            if (r5 != 0) goto L46
            goto L9d
        L46:
            p.b$a r6 = r8.f7565d
            float r6 = r6.mo4065a(r2)
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L51
            goto L9d
        L51:
            java.lang.String r5 = r5.toString()
            if (r1 != 0) goto L62
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L7f
            java.lang.StringBuilder r0 = p120p.C1686g.m4107b(r0)
            java.lang.String r1 = "- "
            goto L74
        L62:
            java.lang.StringBuilder r0 = p120p.C1686g.m4107b(r0)
            if (r7 <= 0) goto L72
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7f
        L72:
            java.lang.String r1 = " - "
        L74:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r6 * r1
        L7f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L98
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L98:
            java.lang.String r0 = android.ext.C0090b.m220f(r1, r0, r5)
            r1 = 1
        L9d:
            int r2 = r2 + 1
            goto L3b
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = android.ext.C0089a.m210h(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p120p.C1681b.toString():java.lang.String");
    }
}
