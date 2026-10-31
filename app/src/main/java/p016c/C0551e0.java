package p016c;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0216c;
import androidx.appcompat.widget.InterfaceC0241k0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p016c.AbstractC0542a;
import p016c.C0551e0;
import p016c.LayoutInflaterFactory2C0560n;
import p033e.C0906d;
import p034e0.C0923h0;
import p034e0.C0946x;
import p034e0.InterfaceC0927j0;
import p049g.AbstractC1183a;
import p049g.C1188f;
import p049g.C1189g;

/* renamed from: c.e0 */
/* loaded from: classes.dex */
public final class C0551e0 extends AbstractC0542a implements ActionBarOverlayLayout.InterfaceC0171d {

    /* renamed from: a */
    public Context f2752a;

    /* renamed from: b */
    public Context f2753b;

    /* renamed from: c */
    public ActionBarOverlayLayout f2754c;

    /* renamed from: d */
    public ActionBarContainer f2755d;

    /* renamed from: e */
    public InterfaceC0241k0 f2756e;

    /* renamed from: f */
    public ActionBarContextView f2757f;

    /* renamed from: g */
    public final View f2758g;

    /* renamed from: h */
    public boolean f2759h;

    /* renamed from: i */
    public d f2760i;

    /* renamed from: j */
    public d f2761j;

    /* renamed from: k */
    public AbstractC1183a.a f2762k;

    /* renamed from: l */
    public boolean f2763l;

    /* renamed from: m */
    public final ArrayList<AbstractC0542a.b> f2764m;

    /* renamed from: n */
    public boolean f2765n;

    /* renamed from: o */
    public int f2766o;

    /* renamed from: p */
    public boolean f2767p;

    /* renamed from: q */
    public boolean f2768q;

    /* renamed from: r */
    public boolean f2769r;

    /* renamed from: s */
    public boolean f2770s;

    /* renamed from: t */
    public C1189g f2771t;

    /* renamed from: u */
    public boolean f2772u;

    /* renamed from: v */
    public boolean f2773v;

    /* renamed from: w */
    public final a f2774w;

    /* renamed from: x */
    public final b f2775x;

    /* renamed from: y */
    public final c f2776y;

    /* renamed from: z */
    public static final AccelerateInterpolator f2751z = new AccelerateInterpolator();

    /* renamed from: A */
    public static final DecelerateInterpolator f2750A = new DecelerateInterpolator();

    /* renamed from: c.e0$a */
    public class a extends C0017d {
        public a() {
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: a */
        public final void mo651a() {
            View view;
            C0551e0 c0551e0 = C0551e0.this;
            if (c0551e0.f2767p && (view = c0551e0.f2758g) != null) {
                view.setTranslationY(0.0f);
                c0551e0.f2755d.setTranslationY(0.0f);
            }
            c0551e0.f2755d.setVisibility(8);
            c0551e0.f2755d.setTransitioning(false);
            c0551e0.f2771t = null;
            AbstractC1183a.a aVar = c0551e0.f2762k;
            if (aVar != null) {
                aVar.mo1964d(c0551e0.f2761j);
                c0551e0.f2761j = null;
                c0551e0.f2762k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c0551e0.f2754c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.h.m2867c(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: c.e0$b */
    public class b extends C0017d {
        public b() {
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: a */
        public final void mo651a() {
            C0551e0 c0551e0 = C0551e0.this;
            c0551e0.f2771t = null;
            c0551e0.f2755d.requestLayout();
        }
    }

    /* renamed from: c.e0$c */
    public class c implements InterfaceC0927j0 {
        public c() {
        }
    }

    /* renamed from: c.e0$d */
    public class d extends AbstractC1183a implements C0159f.a {

        /* renamed from: X */
        public AbstractC1183a.a f2780X;

        /* renamed from: Y */
        public WeakReference<View> f2781Y;

        /* renamed from: m */
        public final Context f2783m;

        /* renamed from: s */
        public final C0159f f2784s;

        public d(Context context, LayoutInflaterFactory2C0560n.e eVar) {
            this.f2783m = context;
            this.f2780X = eVar;
            C0159f c0159f = new C0159f(context);
            c0159f.f483l = 1;
            this.f2784s = c0159f;
            c0159f.f476e = this;
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: a */
        public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
            AbstractC1183a.a aVar = this.f2780X;
            if (aVar != null) {
                return aVar.mo1962b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: b */
        public final void mo549b(C0159f c0159f) {
            if (this.f2780X == null) {
                return;
            }
            mo1896i();
            C0216c c0216c = C0551e0.this.f2757f.f793s;
            if (c0216c != null) {
                c0216c.m699n();
            }
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: c */
        public final void mo1890c() {
            C0551e0 c0551e0 = C0551e0.this;
            if (c0551e0.f2760i != this) {
                return;
            }
            if (!c0551e0.f2768q) {
                this.f2780X.mo1964d(this);
            } else {
                c0551e0.f2761j = this;
                c0551e0.f2762k = this.f2780X;
            }
            this.f2780X = null;
            c0551e0.m1886s(false);
            ActionBarContextView actionBarContextView = c0551e0.f2757f;
            if (actionBarContextView.f579C1 == null) {
                actionBarContextView.m568h();
            }
            c0551e0.f2754c.setHideOnContentScrollEnabled(c0551e0.f2773v);
            c0551e0.f2760i = null;
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: d */
        public final View mo1891d() {
            WeakReference<View> weakReference = this.f2781Y;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: e */
        public final C0159f mo1892e() {
            return this.f2784s;
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: f */
        public final MenuInflater mo1893f() {
            return new C1188f(this.f2783m);
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: g */
        public final CharSequence mo1894g() {
            return C0551e0.this.f2757f.getSubtitle();
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: h */
        public final CharSequence mo1895h() {
            return C0551e0.this.f2757f.getTitle();
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: i */
        public final void mo1896i() {
            if (C0551e0.this.f2760i != this) {
                return;
            }
            C0159f c0159f = this.f2784s;
            c0159f.m547w();
            try {
                this.f2780X.mo1963c(this, c0159f);
            } finally {
                c0159f.m546v();
            }
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: j */
        public final boolean mo1897j() {
            return C0551e0.this.f2757f.f587K1;
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: k */
        public final void mo1898k(View view) {
            C0551e0.this.f2757f.setCustomView(view);
            this.f2781Y = new WeakReference<>(view);
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: l */
        public final void mo1899l(int i7) {
            mo1900m(C0551e0.this.f2752a.getResources().getString(i7));
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: m */
        public final void mo1900m(CharSequence charSequence) {
            C0551e0.this.f2757f.setSubtitle(charSequence);
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: n */
        public final void mo1901n(int i7) {
            mo1902o(C0551e0.this.f2752a.getResources().getString(i7));
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: o */
        public final void mo1902o(CharSequence charSequence) {
            C0551e0.this.f2757f.setTitle(charSequence);
        }

        @Override // p049g.AbstractC1183a
        /* renamed from: p */
        public final void mo1903p(boolean z6) {
            this.f5783e = z6;
            C0551e0.this.f2757f.setTitleOptional(z6);
        }
    }

    public C0551e0(Activity activity, boolean z6) {
        new ArrayList();
        this.f2764m = new ArrayList<>();
        this.f2766o = 0;
        this.f2767p = true;
        this.f2770s = true;
        this.f2774w = new a();
        this.f2775x = new b();
        this.f2776y = new c();
        View decorView = activity.getWindow().getDecorView();
        m1887t(decorView);
        if (z6) {
            return;
        }
        this.f2758g = decorView.findViewById(android.R.id.content);
    }

    public C0551e0(Dialog dialog) {
        new ArrayList();
        this.f2764m = new ArrayList<>();
        this.f2766o = 0;
        this.f2767p = true;
        this.f2770s = true;
        this.f2774w = new a();
        this.f2775x = new b();
        this.f2776y = new c();
        m1887t(dialog.getWindow().getDecorView());
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: b */
    public final boolean mo1855b() {
        InterfaceC0241k0 interfaceC0241k0 = this.f2756e;
        if (interfaceC0241k0 == null || !interfaceC0241k0.mo828m()) {
            return false;
        }
        this.f2756e.collapseActionView();
        return true;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: c */
    public final void mo1856c(boolean z6) {
        if (z6 == this.f2763l) {
            return;
        }
        this.f2763l = z6;
        ArrayList<AbstractC0542a.b> arrayList = this.f2764m;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).m1872a();
        }
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: d */
    public final int mo1857d() {
        return this.f2756e.mo831p();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: e */
    public final Context mo1858e() {
        if (this.f2753b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2752a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f2753b = new ContextThemeWrapper(this.f2752a, i7);
            } else {
                this.f2753b = this.f2752a;
            }
        }
        return this.f2753b;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: g */
    public final void mo1860g() {
        m1888u(this.f2752a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: i */
    public final boolean mo1862i(int i7, KeyEvent keyEvent) {
        C0159f c0159f;
        d dVar = this.f2760i;
        if (dVar == null || (c0159f = dVar.f2784s) == null) {
            return false;
        }
        c0159f.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c0159f.performShortcut(i7, keyEvent, 0);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: l */
    public final void mo1865l(boolean z6) {
        if (this.f2759h) {
            return;
        }
        int i7 = z6 ? 4 : 0;
        int mo831p = this.f2756e.mo831p();
        this.f2759h = true;
        this.f2756e.mo829n((i7 & 4) | ((-5) & mo831p));
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: m */
    public final void mo1866m() {
        this.f2756e.mo829n((this.f2756e.mo831p() & (-9)) | 0);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: n */
    public final void mo1867n(int i7) {
        this.f2756e.mo833r(i7);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: o */
    public final void mo1868o(C0906d c0906d) {
        this.f2756e.mo837v(c0906d);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: p */
    public final void mo1869p(boolean z6) {
        C1189g c1189g;
        this.f2772u = z6;
        if (z6 || (c1189g = this.f2771t) == null) {
            return;
        }
        c1189g.m3402a();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: q */
    public final void mo1870q(CharSequence charSequence) {
        this.f2756e.setWindowTitle(charSequence);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: r */
    public final AbstractC1183a mo1871r(LayoutInflaterFactory2C0560n.e eVar) {
        d dVar = this.f2760i;
        if (dVar != null) {
            dVar.mo1890c();
        }
        this.f2754c.setHideOnContentScrollEnabled(false);
        this.f2757f.m568h();
        d dVar2 = new d(this.f2757f.getContext(), eVar);
        C0159f c0159f = dVar2.f2784s;
        c0159f.m547w();
        try {
            if (!dVar2.f2780X.mo1961a(dVar2, c0159f)) {
                return null;
            }
            this.f2760i = dVar2;
            dVar2.mo1896i();
            this.f2757f.m566f(dVar2);
            m1886s(true);
            return dVar2;
        } finally {
            c0159f.m546v();
        }
    }

    /* renamed from: s */
    public final void m1886s(boolean z6) {
        C0923h0 mo824i;
        C0923h0 m650e;
        if (z6) {
            if (!this.f2769r) {
                this.f2769r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2754c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m1889v(false);
            }
        } else if (this.f2769r) {
            this.f2769r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2754c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m1889v(false);
        }
        ActionBarContainer actionBarContainer = this.f2755d;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (!C0946x.g.m2860c(actionBarContainer)) {
            if (z6) {
                this.f2756e.mo825j(4);
                this.f2757f.setVisibility(0);
                return;
            } else {
                this.f2756e.mo825j(0);
                this.f2757f.setVisibility(8);
                return;
            }
        }
        if (z6) {
            m650e = this.f2756e.mo824i(100L, 4);
            mo824i = this.f2757f.m650e(200L, 0);
        } else {
            mo824i = this.f2756e.mo824i(200L, 0);
            m650e = this.f2757f.m650e(100L, 8);
        }
        C1189g c1189g = new C1189g();
        ArrayList<C0923h0> arrayList = c1189g.f5842a;
        arrayList.add(m650e);
        View view = m650e.f4801a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = mo824i.f4801a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(mo824i);
        c1189g.m3403b();
    }

    /* renamed from: t */
    public final void m1887t(View view) {
        InterfaceC0241k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.f2754c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(R$id.action_bar);
        if (findViewById instanceof InterfaceC0241k0) {
            wrapper = (InterfaceC0241k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2756e = wrapper;
        this.f2757f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.f2755d = actionBarContainer;
        InterfaceC0241k0 interfaceC0241k0 = this.f2756e;
        if (interfaceC0241k0 == null || this.f2757f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0551e0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f2752a = interfaceC0241k0.mo827l();
        if ((this.f2756e.mo831p() & 4) != 0) {
            this.f2759h = true;
        }
        Context context = this.f2752a;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f2756e.mo826k();
        m1888u(context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2752a.obtainStyledAttributes(null, R$styleable.f273a, R$attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2754c;
            if (!actionBarOverlayLayout2.f617z1) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2773v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2755d;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.i.m2886s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: u */
    public final void m1888u(boolean z6) {
        this.f2765n = z6;
        if (z6) {
            this.f2755d.setTabContainer(null);
            this.f2756e.mo830o();
        } else {
            this.f2756e.mo830o();
            this.f2755d.setTabContainer(null);
        }
        boolean z7 = false;
        boolean z8 = this.f2756e.mo834s() == 2;
        this.f2756e.mo838w(!this.f2765n && z8);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2754c;
        if (!this.f2765n && z8) {
            z7 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z7);
    }

    /* renamed from: v */
    public final void m1889v(boolean z6) {
        boolean z7 = this.f2769r || !this.f2768q;
        View view = this.f2758g;
        final c cVar = this.f2776y;
        if (!z7) {
            if (this.f2770s) {
                this.f2770s = false;
                C1189g c1189g = this.f2771t;
                if (c1189g != null) {
                    c1189g.m3402a();
                }
                int i7 = this.f2766o;
                a aVar = this.f2774w;
                if (i7 != 0 || (!this.f2772u && !z6)) {
                    aVar.mo651a();
                    return;
                }
                this.f2755d.setAlpha(1.0f);
                this.f2755d.setTransitioning(true);
                C1189g c1189g2 = new C1189g();
                float f7 = -this.f2755d.getHeight();
                if (z6) {
                    this.f2755d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r12[1];
                }
                C0923h0 m2800a = C0946x.m2800a(this.f2755d);
                m2800a.m2707e(f7);
                final View view2 = m2800a.f4801a.get();
                if (view2 != null) {
                    C0923h0.a.m2708a(view2.animate(), cVar != null ? new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: e0.f0

                        /* renamed from: a */
                        public final /* synthetic */ InterfaceC0927j0 f4797a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) C0551e0.this.f2755d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z8 = c1189g2.f5846e;
                ArrayList<C0923h0> arrayList = c1189g2.f5842a;
                if (!z8) {
                    arrayList.add(m2800a);
                }
                if (this.f2767p && view != null) {
                    C0923h0 m2800a2 = C0946x.m2800a(view);
                    m2800a2.m2707e(f7);
                    if (!c1189g2.f5846e) {
                        arrayList.add(m2800a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2751z;
                boolean z9 = c1189g2.f5846e;
                if (!z9) {
                    c1189g2.f5844c = accelerateInterpolator;
                }
                if (!z9) {
                    c1189g2.f5843b = 250L;
                }
                if (!z9) {
                    c1189g2.f5845d = aVar;
                }
                this.f2771t = c1189g2;
                c1189g2.m3403b();
                return;
            }
            return;
        }
        if (this.f2770s) {
            return;
        }
        this.f2770s = true;
        C1189g c1189g3 = this.f2771t;
        if (c1189g3 != null) {
            c1189g3.m3402a();
        }
        this.f2755d.setVisibility(0);
        int i8 = this.f2766o;
        b bVar = this.f2775x;
        if (i8 == 0 && (this.f2772u || z6)) {
            this.f2755d.setTranslationY(0.0f);
            float f8 = -this.f2755d.getHeight();
            if (z6) {
                this.f2755d.getLocationInWindow(new int[]{0, 0});
                f8 -= r12[1];
            }
            this.f2755d.setTranslationY(f8);
            C1189g c1189g4 = new C1189g();
            C0923h0 m2800a3 = C0946x.m2800a(this.f2755d);
            m2800a3.m2707e(0.0f);
            final View view3 = m2800a3.f4801a.get();
            if (view3 != null) {
                C0923h0.a.m2708a(view3.animate(), cVar != null ? new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: e0.f0

                    /* renamed from: a */
                    public final /* synthetic */ InterfaceC0927j0 f4797a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) C0551e0.this.f2755d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z10 = c1189g4.f5846e;
            ArrayList<C0923h0> arrayList2 = c1189g4.f5842a;
            if (!z10) {
                arrayList2.add(m2800a3);
            }
            if (this.f2767p && view != null) {
                view.setTranslationY(f8);
                C0923h0 m2800a4 = C0946x.m2800a(view);
                m2800a4.m2707e(0.0f);
                if (!c1189g4.f5846e) {
                    arrayList2.add(m2800a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2750A;
            boolean z11 = c1189g4.f5846e;
            if (!z11) {
                c1189g4.f5844c = decelerateInterpolator;
            }
            if (!z11) {
                c1189g4.f5843b = 250L;
            }
            if (!z11) {
                c1189g4.f5845d = bVar;
            }
            this.f2771t = c1189g4;
            c1189g4.m3403b();
        } else {
            this.f2755d.setAlpha(1.0f);
            this.f2755d.setTranslationY(0.0f);
            if (this.f2767p && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.mo651a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2754c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(actionBarOverlayLayout);
        }
    }
}
