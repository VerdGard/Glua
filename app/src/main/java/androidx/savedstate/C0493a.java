package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import p032d6.C0898f;
import p073j.C1396b;
import p152t0.InterfaceC1920c;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C0493a {

    /* renamed from: a */
    public final C1396b<String, b> f2503a = new C1396b<>();

    /* renamed from: b */
    public boolean f2504b;

    /* renamed from: c */
    public Bundle f2505c;

    /* renamed from: d */
    public boolean f2506d;

    /* renamed from: androidx.savedstate.a$a */
    public interface a {
        /* renamed from: a */
        void m1821a(InterfaceC1920c interfaceC1920c);
    }

    /* renamed from: androidx.savedstate.a$b */
    public interface b {
        /* renamed from: a */
        Bundle mo374a();
    }

    /* renamed from: a */
    public final Bundle m1819a(String str) {
        if (!this.f2506d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f2505c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2505c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2505c;
        if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
            this.f2505c = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    public final void m1820b(String str, b bVar) {
        b bVar2;
        C0898f.m2606e(bVar, "provider");
        C1396b<String, b> c1396b = this.f2503a;
        C1396b.c<String, b> mo3743a = c1396b.mo3743a(str);
        if (mo3743a != null) {
            bVar2 = mo3743a.f6726e;
        } else {
            C1396b.c<K, V> cVar = new C1396b.c<>(str, bVar);
            c1396b.f6724s++;
            C1396b.c cVar2 = c1396b.f6722e;
            if (cVar2 == null) {
                c1396b.f6721c = cVar;
            } else {
                cVar2.f6727m = cVar;
                cVar.f6728s = cVar2;
            }
            c1396b.f6722e = cVar;
            bVar2 = null;
        }
        if (!(bVar2 == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }
}
