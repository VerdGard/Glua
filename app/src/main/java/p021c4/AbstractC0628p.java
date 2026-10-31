package p021c4;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C0855a;
import com.google.android.material.textfield.TextInputLayout;
import p042f0.C1151g;
import p042f0.InterfaceC1148d;

/* renamed from: c4.p */
/* loaded from: classes.dex */
public abstract class AbstractC0628p {

    /* renamed from: a */
    public final TextInputLayout f3071a;

    /* renamed from: b */
    public final C0855a f3072b;

    /* renamed from: c */
    public final Context f3073c;

    /* renamed from: d */
    public final CheckableImageButton f3074d;

    public AbstractC0628p(C0855a c0855a) {
        this.f3071a = c0855a.f4560c;
        this.f3072b = c0855a;
        this.f3073c = c0855a.getContext();
        this.f3074d = c0855a.f4566y1;
    }

    /* renamed from: a */
    public void mo2051a() {
    }

    /* renamed from: b */
    public void mo2074b() {
    }

    /* renamed from: c */
    public int mo2052c() {
        return 0;
    }

    /* renamed from: d */
    public int mo2053d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo2054e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo2055f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo2056g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC1148d mo2066h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo2067i(int i7) {
        return true;
    }

    /* renamed from: j */
    public boolean mo2068j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo2075k() {
        return this instanceof C0627o;
    }

    /* renamed from: l */
    public boolean mo2069l() {
        return false;
    }

    /* renamed from: m */
    public void mo2057m(EditText editText) {
    }

    /* renamed from: n */
    public void mo2070n(C1151g c1151g) {
    }

    /* renamed from: o */
    public void mo2071o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo2058p(boolean z6) {
    }

    /* renamed from: q */
    public final void m2076q() {
        this.f3072b.m2537f(false);
    }

    /* renamed from: r */
    public void mo2059r() {
    }

    /* renamed from: s */
    public void mo2060s() {
    }
}
