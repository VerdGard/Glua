package androidx.lifecycle;

import androidx.lifecycle.AbstractC0394f;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0398i {

    /* renamed from: a */
    public final C0415z f1950a;

    public SavedStateHandleAttacher(C0415z c0415z) {
        this.f1950a = c0415z;
    }

    @Override // androidx.lifecycle.InterfaceC0398i
    /* renamed from: d */
    public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
        if (!(aVar == AbstractC0394f.a.ON_CREATE)) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
        interfaceC0400k.mo354m().mo1374b(this);
        C0415z c0415z = this.f1950a;
        if (c0415z.f2026b) {
            return;
        }
        c0415z.f2027c = c0415z.f2025a.m1819a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        c0415z.f2026b = true;
    }
}
