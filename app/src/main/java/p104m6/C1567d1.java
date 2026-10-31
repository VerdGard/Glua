package p104m6;

import java.io.Serializable;
import java.util.HashSet;

/* renamed from: m6.d1 */
/* loaded from: classes.dex */
public final class C1567d1 implements Serializable {

    /* renamed from: c */
    public C1564c1 f7346c = null;

    /* renamed from: e */
    public C1564c1 f7347e = null;

    /* renamed from: m */
    public int f7348m = 0;

    public C1567d1() {
    }

    public C1567d1(AbstractC1630z0 abstractC1630z0) {
        m3960a(abstractC1630z0);
    }

    /* renamed from: a */
    public final C1564c1 m3960a(AbstractC1630z0 abstractC1630z0) {
        C1564c1 c1564c1 = C1564c1.f7339Y;
        if (c1564c1 == null) {
            c1564c1 = new C1564c1(abstractC1630z0);
        } else {
            C1564c1.f7339Y = c1564c1.f7342c;
            c1564c1.mo3956c(abstractC1630z0);
        }
        m3962c(c1564c1);
        return c1564c1;
    }

    /* renamed from: b */
    public final C1564c1 m3961b(C1606q1 c1606q1) {
        C1567d1 c1567d1 = new C1567d1(c1606q1.f7404c);
        C1564c1 c1564c1 = c1567d1.f7346c;
        if (c1564c1 == null) {
            return null;
        }
        if (this.f7346c == null) {
            this.f7346c = c1564c1;
            this.f7347e = c1567d1.f7347e;
            this.f7348m = c1567d1.f7348m;
            c1567d1.f7347e = null;
            c1567d1.f7346c = null;
            c1567d1.f7348m = 0;
            return this.f7346c;
        }
        C1564c1 c1564c12 = this.f7347e;
        if (c1564c1 == null) {
            return c1564c12;
        }
        C1564c1 c1564c13 = c1564c12.f7342c;
        c1564c12.f7342c = c1564c1;
        c1564c1.f7343e = c1564c12;
        C1564c1 c1564c14 = c1567d1.f7347e;
        c1564c14.f7342c = c1564c13;
        if (c1564c13 != null) {
            c1564c13.f7343e = c1564c14;
        } else {
            this.f7347e = c1564c14;
        }
        this.f7348m += c1567d1.f7348m;
        c1567d1.f7347e = null;
        c1567d1.f7346c = null;
        c1567d1.f7348m = 0;
        return c1564c1;
    }

    /* renamed from: c */
    public final void m3962c(C1564c1 c1564c1) {
        if (this.f7346c == null) {
            this.f7347e = c1564c1;
            this.f7346c = c1564c1;
            c1564c1.f7343e = null;
            c1564c1.f7342c = null;
        } else {
            C1564c1 c1564c12 = this.f7347e;
            c1564c12.f7342c = c1564c1;
            c1564c1.f7343e = c1564c12;
            c1564c1.f7342c = null;
            this.f7347e = c1564c1;
        }
        this.f7348m++;
    }

    /* renamed from: d */
    public final void m3963d() {
        for (C1564c1 c1564c1 = this.f7347e; c1564c1 != null; c1564c1 = c1564c1.f7343e) {
            c1564c1.f7343e = null;
            c1564c1.f7342c = null;
            c1564c1.f7344m.mo3982b();
            c1564c1.f7344m = null;
            c1564c1.f7345s = -1;
            HashSet hashSet = c1564c1.f7341X;
            if (hashSet != null) {
                hashSet.clear();
            }
            c1564c1.mo3954a();
        }
        this.f7347e = null;
        this.f7346c = null;
        this.f7348m = 0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (C1564c1 c1564c1 = this.f7346c; c1564c1 != null; c1564c1 = c1564c1.f7342c) {
            stringBuffer.append(c1564c1.m3958e());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
