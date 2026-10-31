package androidx.fragment.app;

import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0393e0;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0392e;
import androidx.lifecycle.InterfaceC0395f0;
import androidx.savedstate.C0493a;
import p128q0.AbstractC1721a;
import p152t0.C1919b;
import p152t0.InterfaceC1920c;

/* renamed from: androidx.fragment.app.m0 */
/* loaded from: classes.dex */
public final class C0360m0 implements InterfaceC0392e, InterfaceC1920c, InterfaceC0395f0 {

    /* renamed from: c */
    public final C0393e0 f1769c;

    /* renamed from: e */
    public C0401l f1770e = null;

    /* renamed from: m */
    public C1919b f1771m = null;

    public C0360m0(C0393e0 c0393e0) {
        this.f1769c = c0393e0;
    }

    @Override // p152t0.InterfaceC1920c
    /* renamed from: b */
    public final C0493a mo350b() {
        m1222e();
        return this.f1771m.f8684b;
    }

    /* renamed from: d */
    public final void m1221d(AbstractC0394f.a aVar) {
        this.f1770e.m1379e(aVar);
    }

    /* renamed from: e */
    public final void m1222e() {
        if (this.f1770e == null) {
            this.f1770e = new C0401l(this);
            this.f1771m = new C1919b(this);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0392e
    /* renamed from: h */
    public final AbstractC1721a mo351h() {
        return AbstractC1721a.a.f7883b;
    }

    @Override // androidx.lifecycle.InterfaceC0395f0
    /* renamed from: k */
    public final C0393e0 mo353k() {
        m1222e();
        return this.f1769c;
    }

    @Override // androidx.lifecycle.InterfaceC0400k
    /* renamed from: m */
    public final C0401l mo354m() {
        m1222e();
        return this.f1770e;
    }
}
