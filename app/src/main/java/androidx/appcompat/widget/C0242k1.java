package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.widget.C0216c;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0205f;
import p016c.LayoutInflaterFactory2C0560n;
import p025d.C0872a;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: classes.dex */
public final class C0242k1 implements InterfaceC0241k0 {

    /* renamed from: a */
    public final Toolbar f946a;

    /* renamed from: b */
    public int f947b;

    /* renamed from: c */
    public C0212a1 f948c;

    /* renamed from: d */
    public View f949d;

    /* renamed from: e */
    public Drawable f950e;

    /* renamed from: f */
    public Drawable f951f;

    /* renamed from: g */
    public Drawable f952g;

    /* renamed from: h */
    public boolean f953h;

    /* renamed from: i */
    public CharSequence f954i;

    /* renamed from: j */
    public CharSequence f955j;

    /* renamed from: k */
    public CharSequence f956k;

    /* renamed from: l */
    public Window.Callback f957l;

    /* renamed from: m */
    public boolean f958m;

    /* renamed from: n */
    public C0216c f959n;

    /* renamed from: o */
    public int f960o;

    /* renamed from: p */
    public Drawable f961p;

    public C0242k1(Toolbar toolbar, boolean z6) {
        int i7;
        Drawable drawable;
        int i8 = R$string.abc_action_bar_up_description;
        this.f960o = 0;
        this.f946a = toolbar;
        this.f954i = toolbar.getTitle();
        this.f955j = toolbar.getSubtitle();
        this.f953h = this.f954i != null;
        this.f952g = toolbar.getNavigationIcon();
        C0233h1 m790m = C0233h1.m790m(toolbar.getContext(), null, R$styleable.f273a, R$attr.actionBarStyle);
        this.f961p = m790m.m795e(R$styleable.ActionBar_homeAsUpIndicator);
        if (z6) {
            CharSequence m801k = m790m.m801k(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(m801k)) {
                this.f953h = true;
                this.f954i = m801k;
                if ((this.f947b & 8) != 0) {
                    toolbar.setTitle(m801k);
                    if (this.f953h) {
                        C0946x.m2818s(toolbar.getRootView(), m801k);
                    }
                }
            }
            CharSequence m801k2 = m790m.m801k(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m801k2)) {
                this.f955j = m801k2;
                if ((this.f947b & 8) != 0) {
                    toolbar.setSubtitle(m801k2);
                }
            }
            Drawable m795e = m790m.m795e(R$styleable.ActionBar_logo);
            if (m795e != null) {
                this.f951f = m795e;
                m839x();
            }
            Drawable m795e2 = m790m.m795e(R$styleable.ActionBar_icon);
            if (m795e2 != null) {
                setIcon(m795e2);
            }
            if (this.f952g == null && (drawable = this.f961p) != null) {
                mo837v(drawable);
            }
            mo829n(m790m.m798h(R$styleable.ActionBar_displayOptions, 0));
            int m799i = m790m.m799i(R$styleable.ActionBar_customNavigationLayout, 0);
            if (m799i != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(m799i, (ViewGroup) toolbar, false);
                View view = this.f949d;
                if (view != null && (this.f947b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f949d = inflate;
                if (inflate != null && (this.f947b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                mo829n(this.f947b | 16);
            }
            int layoutDimension = m790m.f915b.getLayoutDimension(R$styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int m793c = m790m.m793c(R$styleable.ActionBar_contentInsetStart, -1);
            int m793c2 = m790m.m793c(R$styleable.ActionBar_contentInsetEnd, -1);
            if (m793c >= 0 || m793c2 >= 0) {
                int max = Math.max(m793c, 0);
                int max2 = Math.max(m793c2, 0);
                if (toolbar.f741L1 == null) {
                    toolbar.f741L1 = new C0278z0();
                }
                toolbar.f741L1.m929a(max, max2);
            }
            int m799i2 = m790m.m799i(R$styleable.ActionBar_titleTextStyle, 0);
            if (m799i2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f733D1 = m799i2;
                AppCompatTextView appCompatTextView = toolbar.f761e;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, m799i2);
                }
            }
            int m799i3 = m790m.m799i(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (m799i3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f734E1 = m799i3;
                AppCompatTextView appCompatTextView2 = toolbar.f770m;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, m799i3);
                }
            }
            int m799i4 = m790m.m799i(R$styleable.ActionBar_popupTheme, 0);
            if (m799i4 != 0) {
                toolbar.setPopupTheme(m799i4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f961p = toolbar.getNavigationIcon();
                i7 = 15;
            } else {
                i7 = 11;
            }
            this.f947b = i7;
        }
        m790m.m803n();
        if (i8 != this.f960o) {
            this.f960o = i8;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                mo833r(this.f960o);
            }
        }
        this.f956k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0236i1(this));
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: a */
    public final void mo816a(C0159f c0159f, LayoutInflaterFactory2C0560n.d dVar) {
        C0216c c0216c = this.f959n;
        Toolbar toolbar = this.f946a;
        if (c0216c == null) {
            C0216c c0216c2 = new C0216c(toolbar.getContext());
            this.f959n = c0216c2;
            c0216c2.f418x1 = R$id.action_menu_presenter;
        }
        C0216c c0216c3 = this.f959n;
        c0216c3.f410X = dVar;
        if (c0159f == null && toolbar.f758c == null) {
            return;
        }
        toolbar.m629e();
        C0159f c0159f2 = toolbar.f758c.f621H1;
        if (c0159f2 == c0159f) {
            return;
        }
        if (c0159f2 != null) {
            c0159f2.m542r(toolbar.f760d2);
            c0159f2.m542r(toolbar.f762e2);
        }
        if (toolbar.f762e2 == null) {
            toolbar.f762e2 = toolbar.new C0205f();
        }
        c0216c3.f827G1 = true;
        if (c0159f != null) {
            c0159f.m526b(c0216c3, toolbar.f731B1);
            c0159f.m526b(toolbar.f762e2, toolbar.f731B1);
        } else {
            c0216c3.mo520e(toolbar.f731B1, null);
            toolbar.f762e2.mo520e(toolbar.f731B1, null);
            c0216c3.mo504g();
            toolbar.f762e2.mo504g();
        }
        toolbar.f758c.setPopupTheme(toolbar.f732C1);
        toolbar.f758c.setPresenter(c0216c3);
        toolbar.f760d2 = c0216c3;
        toolbar.m640s();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: b */
    public final boolean mo817b() {
        ActionMenuView actionMenuView = this.f946a.f758c;
        if (actionMenuView == null) {
            return false;
        }
        C0216c c0216c = actionMenuView.f625L1;
        return c0216c != null && c0216c.m698h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: c */
    public final void mo818c() {
        this.f958m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final void collapseActionView() {
        Toolbar.C0205f c0205f = this.f946a.f762e2;
        C0161h c0161h = c0205f == null ? null : c0205f.f781e;
        if (c0161h != null) {
            c0161h.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo819d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f946a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f758c
            r1 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.f625L1
            r2 = 1
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f831K1
            if (r3 != 0) goto L19
            boolean r0 = r0.m698h()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0242k1.mo819d():boolean");
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: e */
    public final boolean mo820e() {
        ActionMenuView actionMenuView = this.f946a.f758c;
        if (actionMenuView == null) {
            return false;
        }
        C0216c c0216c = actionMenuView.f625L1;
        return c0216c != null && c0216c.m697c();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: f */
    public final boolean mo821f() {
        ActionMenuView actionMenuView = this.f946a.f758c;
        if (actionMenuView == null) {
            return false;
        }
        C0216c c0216c = actionMenuView.f625L1;
        return c0216c != null && c0216c.m699n();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: g */
    public final boolean mo822g() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f946a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f758c) != null && actionMenuView.f624K1;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final CharSequence getTitle() {
        return this.f946a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: h */
    public final void mo823h() {
        C0216c c0216c;
        ActionMenuView actionMenuView = this.f946a.f758c;
        if (actionMenuView == null || (c0216c = actionMenuView.f625L1) == null) {
            return;
        }
        c0216c.m697c();
        C0216c.a aVar = c0216c.f830J1;
        if (aVar == null || !aVar.m561b()) {
            return;
        }
        aVar.f538j.dismiss();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: i */
    public final C0923h0 mo824i(long j7, int i7) {
        C0923h0 m2800a = C0946x.m2800a(this.f946a);
        m2800a.m2703a(i7 == 0 ? 1.0f : 0.0f);
        m2800a.m2705c(j7);
        m2800a.m2706d(new C0239j1(this, i7));
        return m2800a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: j */
    public final void mo825j(int i7) {
        this.f946a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: k */
    public final void mo826k() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: l */
    public final Context mo827l() {
        return this.f946a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: m */
    public final boolean mo828m() {
        Toolbar.C0205f c0205f = this.f946a.f762e2;
        return (c0205f == null || c0205f.f781e == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: n */
    public final void mo829n(int i7) {
        View view;
        Drawable drawable;
        int i8 = this.f947b ^ i7;
        this.f947b = i7;
        if (i8 != 0) {
            int i9 = i8 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f946a;
            if (i9 != 0) {
                if ((i7 & 4) != 0 && (i7 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f956k)) {
                        toolbar.setNavigationContentDescription(this.f960o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f956k);
                    }
                }
                if ((this.f947b & 4) != 0) {
                    drawable = this.f952g;
                    if (drawable == null) {
                        drawable = this.f961p;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i8 & 3) != 0) {
                m839x();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.f954i);
                    charSequence = this.f955j;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i8 & 16) == 0 || (view = this.f949d) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: o */
    public final void mo830o() {
        C0212a1 c0212a1 = this.f948c;
        if (c0212a1 != null) {
            ViewParent parent = c0212a1.getParent();
            Toolbar toolbar = this.f946a;
            if (parent == toolbar) {
                toolbar.removeView(this.f948c);
            }
        }
        this.f948c = null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: p */
    public final int mo831p() {
        return this.f947b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: q */
    public final void mo832q(int i7) {
        this.f951f = i7 != 0 ? C0872a.m2561a(mo827l(), i7) : null;
        m839x();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: r */
    public final void mo833r(int i7) {
        String string = i7 == 0 ? null : mo827l().getString(i7);
        this.f956k = string;
        if ((this.f947b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(string);
            Toolbar toolbar = this.f946a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f960o);
            } else {
                toolbar.setNavigationContentDescription(this.f956k);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: s */
    public final int mo834s() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final void setIcon(int i7) {
        setIcon(i7 != 0 ? C0872a.m2561a(mo827l(), i7) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final void setIcon(Drawable drawable) {
        this.f950e = drawable;
        m839x();
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final void setWindowCallback(Window.Callback callback) {
        this.f957l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f953h) {
            return;
        }
        this.f954i = charSequence;
        if ((this.f947b & 8) != 0) {
            Toolbar toolbar = this.f946a;
            toolbar.setTitle(charSequence);
            if (this.f953h) {
                C0946x.m2818s(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: t */
    public final void mo835t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: u */
    public final void mo836u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: v */
    public final void mo837v(Drawable drawable) {
        this.f952g = drawable;
        if ((this.f947b & 4) == 0) {
            drawable = null;
        } else if (drawable == null) {
            drawable = this.f961p;
        }
        this.f946a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC0241k0
    /* renamed from: w */
    public final void mo838w(boolean z6) {
        this.f946a.setCollapsible(z6);
    }

    /* renamed from: x */
    public final void m839x() {
        Drawable drawable;
        int i7 = this.f947b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f951f) == null) {
            drawable = this.f950e;
        }
        this.f946a.setLogo(drawable);
    }
}
