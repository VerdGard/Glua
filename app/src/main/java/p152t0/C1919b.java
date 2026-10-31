package p152t0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import androidx.savedstate.C0493a;
import androidx.savedstate.Recreator;
import java.util.Map;
import p032d6.C0898f;
import p073j.C1396b;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public final class C1919b {

    /* renamed from: a */
    public final InterfaceC1920c f8683a;

    /* renamed from: b */
    public final C0493a f8684b = new C0493a();

    /* renamed from: c */
    public boolean f8685c;

    public C1919b(InterfaceC1920c interfaceC1920c) {
        this.f8683a = interfaceC1920c;
    }

    /* renamed from: a */
    public final void m4532a() {
        InterfaceC1920c interfaceC1920c = this.f8683a;
        C0401l mo354m = interfaceC1920c.mo354m();
        if (!(mo354m.f1992c == AbstractC0394f.b.f1986e)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        mo354m.mo1373a(new Recreator(interfaceC1920c));
        final C0493a c0493a = this.f8684b;
        c0493a.getClass();
        if (!(!c0493a.f2504b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        mo354m.mo1373a(new InterfaceC0398i() { // from class: t0.a
            @Override // androidx.lifecycle.InterfaceC0398i
            /* renamed from: d */
            public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                C0493a c0493a2 = C0493a.this;
                C0898f.m2606e(c0493a2, "this$0");
                if (aVar == AbstractC0394f.a.ON_START || aVar == AbstractC0394f.a.ON_STOP) {
                    c0493a2.getClass();
                }
            }
        });
        c0493a.f2504b = true;
        this.f8685c = true;
    }

    /* renamed from: b */
    public final void m4533b(Bundle bundle) {
        if (!this.f8685c) {
            m4532a();
        }
        C0401l mo354m = this.f8683a.mo354m();
        if (!(!(mo354m.f1992c.compareTo(AbstractC0394f.b.f1988s) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + mo354m.f1992c).toString());
        }
        C0493a c0493a = this.f8684b;
        if (!c0493a.f2504b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c0493a.f2506d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c0493a.f2505c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0493a.f2506d = true;
    }

    /* renamed from: c */
    public final void m4534c(Bundle bundle) {
        C0898f.m2606e(bundle, "outBundle");
        C0493a c0493a = this.f8684b;
        c0493a.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c0493a.f2505c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1396b<String, C0493a.b> c1396b = c0493a.f2503a;
        c1396b.getClass();
        C1396b.d dVar = new C1396b.d();
        c1396b.f6723m.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C0493a.b) entry.getValue()).mo374a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
