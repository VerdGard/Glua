package androidx.lifecycle;

import android.ext.C0091c;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0359m;
import androidx.lifecycle.AbstractC0394f;
import java.util.Map;
import p065i.C1305a;
import p073j.C1396b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j */
    public static final Object f1934j = new Object();

    /* renamed from: a */
    public final Object f1935a = new Object();

    /* renamed from: b */
    public final C1396b<InterfaceC0405p<? super T>, LiveData<T>.AbstractC0383b> f1936b = new C1396b<>();

    /* renamed from: c */
    public int f1937c = 0;

    /* renamed from: d */
    public boolean f1938d;

    /* renamed from: e */
    public volatile Object f1939e;

    /* renamed from: f */
    public volatile Object f1940f;

    /* renamed from: g */
    public int f1941g;

    /* renamed from: h */
    public boolean f1942h;

    /* renamed from: i */
    public boolean f1943i;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0383b implements InterfaceC0398i {
        public LifecycleBoundObserver() {
            throw null;
        }

        @Override // androidx.lifecycle.InterfaceC0398i
        /* renamed from: d */
        public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0383b
        /* renamed from: i */
        public final void mo1347i() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0383b
        /* renamed from: j */
        public final boolean mo1348j() {
            throw null;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0382a extends LiveData<T>.AbstractC0383b {
        public C0382a(LiveData liveData, DialogInterfaceOnCancelListenerC0359m.d dVar) {
            super(dVar);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0383b
        /* renamed from: j */
        public final boolean mo1348j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC0383b {

        /* renamed from: a */
        public final InterfaceC0405p<? super T> f1944a;

        /* renamed from: b */
        public boolean f1945b;

        /* renamed from: c */
        public int f1946c = -1;

        public AbstractC0383b(DialogInterfaceOnCancelListenerC0359m.d dVar) {
            this.f1944a = dVar;
        }

        /* renamed from: h */
        public final void m1349h(boolean z6) {
            if (z6 == this.f1945b) {
                return;
            }
            this.f1945b = z6;
            int i7 = z6 ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i8 = liveData.f1937c;
            liveData.f1937c = i7 + i8;
            if (!liveData.f1938d) {
                liveData.f1938d = true;
                while (true) {
                    try {
                        int i9 = liveData.f1937c;
                        if (i8 == i9) {
                            break;
                        }
                        boolean z7 = i8 == 0 && i9 > 0;
                        boolean z8 = i8 > 0 && i9 == 0;
                        if (z7) {
                            liveData.mo1344e();
                        } else if (z8) {
                            liveData.mo1345f();
                        }
                        i8 = i9;
                    } finally {
                        liveData.f1938d = false;
                    }
                }
            }
            if (this.f1945b) {
                liveData.m1342c(this);
            }
        }

        /* renamed from: i */
        public void mo1347i() {
        }

        /* renamed from: j */
        public abstract boolean mo1348j();
    }

    public LiveData() {
        Object obj = f1934j;
        this.f1940f = obj;
        this.f1939e = obj;
        this.f1941g = -1;
    }

    /* renamed from: a */
    public static void m1340a(String str) {
        if (!C1305a.m3618y().m3619z()) {
            throw new IllegalStateException(C0091c.m228f("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1341b(LiveData<T>.AbstractC0383b abstractC0383b) {
        if (abstractC0383b.f1945b) {
            if (!abstractC0383b.mo1348j()) {
                abstractC0383b.m1349h(false);
                return;
            }
            int i7 = abstractC0383b.f1946c;
            int i8 = this.f1941g;
            if (i7 >= i8) {
                return;
            }
            abstractC0383b.f1946c = i8;
            InterfaceC0405p<? super T> interfaceC0405p = abstractC0383b.f1944a;
            Object obj = this.f1939e;
            DialogInterfaceOnCancelListenerC0359m.d dVar = (DialogInterfaceOnCancelListenerC0359m.d) interfaceC0405p;
            dVar.getClass();
            if (((InterfaceC0400k) obj) != null) {
                DialogInterfaceOnCancelListenerC0359m dialogInterfaceOnCancelListenerC0359m = DialogInterfaceOnCancelListenerC0359m.this;
                if (dialogInterfaceOnCancelListenerC0359m.f1754o2) {
                    View m1229J = dialogInterfaceOnCancelListenerC0359m.m1229J();
                    if (m1229J.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0359m.f1758s2 != null) {
                        if (AbstractC0378x.m1285I(3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0359m.f1758s2);
                        }
                        dialogInterfaceOnCancelListenerC0359m.f1758s2.setContentView(m1229J);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1342c(LiveData<T>.AbstractC0383b abstractC0383b) {
        if (this.f1942h) {
            this.f1943i = true;
            return;
        }
        this.f1942h = true;
        do {
            this.f1943i = false;
            if (abstractC0383b != null) {
                m1341b(abstractC0383b);
                abstractC0383b = null;
            } else {
                C1396b<InterfaceC0405p<? super T>, LiveData<T>.AbstractC0383b> c1396b = this.f1936b;
                c1396b.getClass();
                C1396b.d dVar = new C1396b.d();
                c1396b.f6723m.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    m1341b((AbstractC0383b) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1943i) {
                        break;
                    }
                }
            }
        } while (this.f1943i);
        this.f1942h = false;
    }

    /* renamed from: d */
    public final void m1343d(DialogInterfaceOnCancelListenerC0359m.d dVar) {
        LiveData<T>.AbstractC0383b abstractC0383b;
        m1340a("observeForever");
        C0382a c0382a = new C0382a(this, dVar);
        C1396b<InterfaceC0405p<? super T>, LiveData<T>.AbstractC0383b> c1396b = this.f1936b;
        C1396b.c<InterfaceC0405p<? super T>, LiveData<T>.AbstractC0383b> mo3743a = c1396b.mo3743a(dVar);
        if (mo3743a != null) {
            abstractC0383b = mo3743a.f6726e;
        } else {
            C1396b.c<K, V> cVar = new C1396b.c<>(dVar, c0382a);
            c1396b.f6724s++;
            C1396b.c<InterfaceC0405p<? super T>, LiveData<T>.AbstractC0383b> cVar2 = c1396b.f6722e;
            if (cVar2 == 0) {
                c1396b.f6721c = cVar;
            } else {
                cVar2.f6727m = cVar;
                cVar.f6728s = cVar2;
            }
            c1396b.f6722e = cVar;
            abstractC0383b = null;
        }
        LiveData<T>.AbstractC0383b abstractC0383b2 = abstractC0383b;
        if (abstractC0383b2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0383b2 != null) {
            return;
        }
        c0382a.m1349h(true);
    }

    /* renamed from: e */
    public void mo1344e() {
    }

    /* renamed from: f */
    public void mo1345f() {
    }

    /* renamed from: g */
    public void mo1346g(InterfaceC0405p<? super T> interfaceC0405p) {
        m1340a("removeObserver");
        LiveData<T>.AbstractC0383b mo3744b = this.f1936b.mo3744b(interfaceC0405p);
        if (mo3744b == null) {
            return;
        }
        mo3744b.mo1347i();
        mo3744b.m1349h(false);
    }
}
