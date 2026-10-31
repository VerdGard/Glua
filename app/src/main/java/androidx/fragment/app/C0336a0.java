package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0387b0;
import androidx.lifecycle.C0389c0;
import androidx.lifecycle.C0393e0;
import java.util.HashMap;
import java.util.Iterator;
import p128q0.C1723c;

/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes.dex */
public final class C0336a0 extends AbstractC0387b0 {

    /* renamed from: i */
    public static final a f1630i = new a();

    /* renamed from: f */
    public final boolean f1634f;

    /* renamed from: c */
    public final HashMap<String, ComponentCallbacksC0361n> f1631c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C0336a0> f1632d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C0393e0> f1633e = new HashMap<>();

    /* renamed from: g */
    public boolean f1635g = false;

    /* renamed from: h */
    public boolean f1636h = false;

    /* renamed from: androidx.fragment.app.a0$a */
    public class a implements C0389c0.a {
        @Override // androidx.lifecycle.C0389c0.a
        /* renamed from: a */
        public final <T extends AbstractC0387b0> T mo1143a(Class<T> cls) {
            return new C0336a0(true);
        }

        @Override // androidx.lifecycle.C0389c0.a
        /* renamed from: b */
        public final AbstractC0387b0 mo1144b(Class cls, C1723c c1723c) {
            return mo1143a(cls);
        }
    }

    public C0336a0(boolean z6) {
        this.f1634f = z6;
    }

    @Override // androidx.lifecycle.AbstractC0387b0
    /* renamed from: a */
    public final void mo1141a() {
        if (AbstractC0378x.m1285I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1635g = true;
    }

    /* renamed from: b */
    public final void m1142b(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (this.f1636h) {
            if (AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if ((this.f1631c.remove(componentCallbacksC0361n.f1798Y) != null) && AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0361n);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0336a0.class != obj.getClass()) {
            return false;
        }
        C0336a0 c0336a0 = (C0336a0) obj;
        return this.f1631c.equals(c0336a0.f1631c) && this.f1632d.equals(c0336a0.f1632d) && this.f1633e.equals(c0336a0.f1633e);
    }

    public final int hashCode() {
        return this.f1633e.hashCode() + ((this.f1632d.hashCode() + (this.f1631c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<ComponentCallbacksC0361n> it = this.f1631c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1632d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1633e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
