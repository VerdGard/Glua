package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractC0378x;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p023c6.InterfaceC0655a;
import p023c6.InterfaceC0666l;
import p026d0.InterfaceC0873a;
import p032d6.C0898f;
import p187x5.C2199c;
import p195y5.C2254b;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f198a;

    /* renamed from: b */
    public final InterfaceC0873a<Boolean> f199b;

    /* renamed from: c */
    public final C2254b<AbstractC0127l> f200c;

    /* renamed from: d */
    public AbstractC0127l f201d;

    /* renamed from: e */
    public final OnBackInvokedCallback f202e;

    /* renamed from: f */
    public OnBackInvokedDispatcher f203f;

    /* renamed from: g */
    public boolean f204g;

    /* renamed from: h */
    public boolean f205h;

    public final class LifecycleOnBackPressedCancellable implements InterfaceC0398i, InterfaceC0118c {

        /* renamed from: a */
        public final AbstractC0394f f206a;

        /* renamed from: b */
        public final AbstractC0127l f207b;

        /* renamed from: c */
        public C0115c f208c;

        /* renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f209d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0394f abstractC0394f, AbstractC0378x.c cVar) {
            C0898f.m2606e(cVar, "onBackPressedCallback");
            this.f209d = onBackPressedDispatcher;
            this.f206a = abstractC0394f;
            this.f207b = cVar;
            abstractC0394f.mo1373a(this);
        }

        @Override // androidx.activity.InterfaceC0118c
        public final void cancel() {
            this.f206a.mo1374b(this);
            AbstractC0127l abstractC0127l = this.f207b;
            abstractC0127l.getClass();
            abstractC0127l.f240b.remove(this);
            C0115c c0115c = this.f208c;
            if (c0115c != null) {
                c0115c.cancel();
            }
            this.f208c = null;
        }

        @Override // androidx.lifecycle.InterfaceC0398i
        /* renamed from: d */
        public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
            if (aVar != AbstractC0394f.a.ON_START) {
                if (aVar != AbstractC0394f.a.ON_STOP) {
                    if (aVar == AbstractC0394f.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    C0115c c0115c = this.f208c;
                    if (c0115c != null) {
                        c0115c.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f209d;
            onBackPressedDispatcher.getClass();
            AbstractC0127l abstractC0127l = this.f207b;
            C0898f.m2606e(abstractC0127l, "onBackPressedCallback");
            onBackPressedDispatcher.f200c.addLast(abstractC0127l);
            C0115c c0115c2 = onBackPressedDispatcher.new C0115c(abstractC0127l);
            abstractC0127l.f240b.add(c0115c2);
            onBackPressedDispatcher.m363d();
            abstractC0127l.f241c = new C0141t(onBackPressedDispatcher);
            this.f208c = c0115c2;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public static final class C0113a {

        /* renamed from: a */
        public static final C0113a f210a = new C0113a();

        /* renamed from: a */
        public final OnBackInvokedCallback m364a(final InterfaceC0655a<C2199c> interfaceC0655a) {
            C0898f.m2606e(interfaceC0655a, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.r
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    InterfaceC0655a interfaceC0655a2 = InterfaceC0655a.this;
                    C0898f.m2606e(interfaceC0655a2, "$onBackInvoked");
                    interfaceC0655a2.mo373a();
                }
            };
        }

        /* renamed from: b */
        public final void m365b(Object obj, int i7, Object obj2) {
            C0898f.m2606e(obj, "dispatcher");
            C0898f.m2606e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: c */
        public final void m366c(Object obj, Object obj2) {
            C0898f.m2606e(obj, "dispatcher");
            C0898f.m2606e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    public static final class C0114b {

        /* renamed from: a */
        public static final C0114b f211a = new C0114b();

        /* renamed from: androidx.activity.OnBackPressedDispatcher$b$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0666l<C0117b, C2199c> f212a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC0666l<C0117b, C2199c> f213b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC0655a<C2199c> f214c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC0655a<C2199c> f215d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC0666l<? super C0117b, C2199c> interfaceC0666l, InterfaceC0666l<? super C0117b, C2199c> interfaceC0666l2, InterfaceC0655a<C2199c> interfaceC0655a, InterfaceC0655a<C2199c> interfaceC0655a2) {
                this.f212a = interfaceC0666l;
                this.f213b = interfaceC0666l2;
                this.f214c = interfaceC0655a;
                this.f215d = interfaceC0655a2;
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                this.f215d.mo373a();
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.f214c.mo373a();
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent backEvent) {
                C0898f.m2606e(backEvent, "backEvent");
                this.f213b.mo216c(new C0117b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent backEvent) {
                C0898f.m2606e(backEvent, "backEvent");
                this.f212a.mo216c(new C0117b(backEvent));
            }
        }

        /* renamed from: a */
        public final OnBackInvokedCallback m367a(InterfaceC0666l<? super C0117b, C2199c> interfaceC0666l, InterfaceC0666l<? super C0117b, C2199c> interfaceC0666l2, InterfaceC0655a<C2199c> interfaceC0655a, InterfaceC0655a<C2199c> interfaceC0655a2) {
            C0898f.m2606e(interfaceC0666l, "onBackStarted");
            C0898f.m2606e(interfaceC0666l2, "onBackProgressed");
            C0898f.m2606e(interfaceC0655a, "onBackInvoked");
            C0898f.m2606e(interfaceC0655a2, "onBackCancelled");
            return new a(interfaceC0666l, interfaceC0666l2, interfaceC0655a, interfaceC0655a2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$c */
    public final class C0115c implements InterfaceC0118c {

        /* renamed from: a */
        public final AbstractC0127l f216a;

        public C0115c(AbstractC0127l abstractC0127l) {
            this.f216a = abstractC0127l;
        }

        @Override // androidx.activity.InterfaceC0118c
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            C2254b<AbstractC0127l> c2254b = onBackPressedDispatcher.f200c;
            AbstractC0127l abstractC0127l = this.f216a;
            c2254b.remove(abstractC0127l);
            if (C0898f.m2602a(onBackPressedDispatcher.f201d, abstractC0127l)) {
                abstractC0127l.getClass();
                onBackPressedDispatcher.f201d = null;
            }
            abstractC0127l.getClass();
            abstractC0127l.f240b.remove(this);
            InterfaceC0655a<C2199c> interfaceC0655a = abstractC0127l.f241c;
            if (interfaceC0655a != null) {
                interfaceC0655a.mo373a();
            }
            abstractC0127l.f241c = null;
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* renamed from: a */
    public final void m360a(InterfaceC0400k interfaceC0400k, AbstractC0378x.c cVar) {
        C0898f.m2606e(cVar, "onBackPressedCallback");
        C0401l mo354m = interfaceC0400k.mo354m();
        if (mo354m.f1992c == AbstractC0394f.b.f1985c) {
            return;
        }
        cVar.f240b.add(new LifecycleOnBackPressedCancellable(this, mo354m, cVar));
        m363d();
        cVar.f241c = new C0140s(this);
    }

    /* renamed from: b */
    public final void m361b() {
        AbstractC0127l abstractC0127l;
        C2254b<AbstractC0127l> c2254b = this.f200c;
        ListIterator<AbstractC0127l> listIterator = c2254b.listIterator(c2254b.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC0127l = null;
                break;
            } else {
                abstractC0127l = listIterator.previous();
                if (abstractC0127l.f239a) {
                    break;
                }
            }
        }
        AbstractC0127l abstractC0127l2 = abstractC0127l;
        this.f201d = null;
        if (abstractC0127l2 != null) {
            abstractC0127l2.mo377a();
            return;
        }
        Runnable runnable = this.f198a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public final void m362c(boolean z6) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f203f;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f202e) == null) {
            return;
        }
        C0113a c0113a = C0113a.f210a;
        if (z6 && !this.f204g) {
            c0113a.m365b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f204g = true;
        } else {
            if (z6 || !this.f204g) {
                return;
            }
            c0113a.m366c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f204g = false;
        }
    }

    /* renamed from: d */
    public final void m363d() {
        boolean z6 = this.f205h;
        C2254b<AbstractC0127l> c2254b = this.f200c;
        boolean z7 = false;
        if (!(c2254b instanceof Collection) || !c2254b.isEmpty()) {
            Iterator<AbstractC0127l> it = c2254b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f239a) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f205h = z7;
        if (z7 != z6) {
            InterfaceC0873a<Boolean> interfaceC0873a = this.f199b;
            if (interfaceC0873a != null) {
                interfaceC0873a.accept(Boolean.valueOf(z7));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m362c(z7);
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f198a = runnable;
        this.f199b = null;
        this.f200c = new C2254b<>();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f202e = i7 >= 34 ? C0114b.f211a.m367a(new C0128m(this), new C0129n(this), new C0130o(this), new C0131p(this)) : C0113a.f210a.m364a(new C0132q(this));
        }
    }
}
