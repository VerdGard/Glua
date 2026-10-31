package p049g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0216c;
import java.lang.ref.WeakReference;
import p049g.AbstractC1183a;

/* renamed from: g.d */
/* loaded from: classes.dex */
public final class C1186d extends AbstractC1183a implements C0159f.a {

    /* renamed from: X */
    public final AbstractC1183a.a f5790X;

    /* renamed from: Y */
    public WeakReference<View> f5791Y;

    /* renamed from: Z */
    public boolean f5792Z;

    /* renamed from: m */
    public final Context f5793m;

    /* renamed from: s */
    public final ActionBarContextView f5794s;

    /* renamed from: w1 */
    public final C0159f f5795w1;

    public C1186d(Context context, ActionBarContextView actionBarContextView, AbstractC1183a.a aVar) {
        this.f5793m = context;
        this.f5794s = actionBarContextView;
        this.f5790X = aVar;
        C0159f c0159f = new C0159f(actionBarContextView.getContext());
        c0159f.f483l = 1;
        this.f5795w1 = c0159f;
        c0159f.f476e = this;
    }

    @Override // androidx.appcompat.view.menu.C0159f.a
    /* renamed from: a */
    public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
        return this.f5790X.mo1962b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0159f.a
    /* renamed from: b */
    public final void mo549b(C0159f c0159f) {
        mo1896i();
        C0216c c0216c = this.f5794s.f793s;
        if (c0216c != null) {
            c0216c.m699n();
        }
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: c */
    public final void mo1890c() {
        if (this.f5792Z) {
            return;
        }
        this.f5792Z = true;
        this.f5790X.mo1964d(this);
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: d */
    public final View mo1891d() {
        WeakReference<View> weakReference = this.f5791Y;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: e */
    public final C0159f mo1892e() {
        return this.f5795w1;
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: f */
    public final MenuInflater mo1893f() {
        return new C1188f(this.f5794s.getContext());
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: g */
    public final CharSequence mo1894g() {
        return this.f5794s.getSubtitle();
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: h */
    public final CharSequence mo1895h() {
        return this.f5794s.getTitle();
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: i */
    public final void mo1896i() {
        this.f5790X.mo1963c(this, this.f5795w1);
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: j */
    public final boolean mo1897j() {
        return this.f5794s.f587K1;
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: k */
    public final void mo1898k(View view) {
        this.f5794s.setCustomView(view);
        this.f5791Y = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: l */
    public final void mo1899l(int i7) {
        mo1900m(this.f5793m.getString(i7));
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: m */
    public final void mo1900m(CharSequence charSequence) {
        this.f5794s.setSubtitle(charSequence);
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: n */
    public final void mo1901n(int i7) {
        mo1902o(this.f5793m.getString(i7));
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: o */
    public final void mo1902o(CharSequence charSequence) {
        this.f5794s.setTitle(charSequence);
    }

    @Override // p049g.AbstractC1183a
    /* renamed from: p */
    public final void mo1903p(boolean z6) {
        this.f5783e = z6;
        this.f5794s.setTitleOptional(z6);
    }
}
