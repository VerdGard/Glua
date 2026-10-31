package p016c;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0124i;
import p016c.C0571y;
import p034e0.C0918f;

/* renamed from: c.u */
/* loaded from: classes.dex */
public class DialogC0567u extends DialogC0124i implements InterfaceC0557k {

    /* renamed from: X */
    public final C0566t f2903X;

    /* renamed from: s */
    public LayoutInflaterFactory2C0560n f2904s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [c.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC0567u(int r5, android.content.Context r6) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            int r3 = androidx.appcompat.R$attr.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r5
        L15:
            r4.<init>(r1, r6)
            c.t r1 = new c.t
            r2 = r4
            androidx.appcompat.app.d r2 = (androidx.appcompat.app.DialogInterfaceC0151d) r2
            r1.<init>()
            r4.f2903X = r1
            c.m r1 = r4.m1982e()
            if (r5 != 0) goto L38
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            int r2 = androidx.appcompat.R$attr.dialogTheme
            r6.resolveAttribute(r2, r5, r0)
            int r5 = r5.resourceId
        L38:
            r6 = r1
            c.n r6 = (p016c.LayoutInflaterFactory2C0560n) r6
            r6.f2843j2 = r5
            r1.mo1922n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.DialogC0567u.<init>(int, android.content.Context):void");
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1982e().mo1912c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m1982e().mo1923o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0918f.m2694b(this.f2903X, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public final AbstractC0559m m1982e() {
        if (this.f2904s == null) {
            C0571y.a aVar = AbstractC0559m.f2798c;
            this.f2904s = new LayoutInflaterFactory2C0560n(getContext(), getWindow(), this, this);
        }
        return this.f2904s;
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: f */
    public final void mo1904f() {
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i7) {
        return (T) m1982e().mo1914e(i7);
    }

    /* renamed from: g */
    final boolean m1983g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: i */
    public final void mo1905i() {
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m1982e().mo1920k();
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: l */
    public final void mo1906l() {
    }

    @Override // androidx.activity.DialogC0124i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1982e().mo1919j();
        super.onCreate(bundle);
        m1982e().mo1922n();
    }

    @Override // androidx.activity.DialogC0124i, android.app.Dialog
    public final void onStop() {
        super.onStop();
        m1982e().mo1926r();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        m1982e().mo1928u(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m1982e().mo1929v(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1982e().mo1930w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        m1982e().mo1933z(getContext().getString(i7));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1982e().mo1933z(charSequence);
    }
}
