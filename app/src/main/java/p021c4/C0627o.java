package p021c4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.RunnableC0125j;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.C0855a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p021c4.C0627o;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p042f0.InterfaceC1148d;
import p139r3.C1832j;
import p177w3.ViewOnClickListenerC2120a;

/* renamed from: c4.o */
/* loaded from: classes.dex */
public final class C0627o extends AbstractC0628p {

    /* renamed from: e */
    public final int f3057e;

    /* renamed from: f */
    public final int f3058f;

    /* renamed from: g */
    public final TimeInterpolator f3059g;

    /* renamed from: h */
    public AutoCompleteTextView f3060h;

    /* renamed from: i */
    public final ViewOnClickListenerC2120a f3061i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0622j f3062j;

    /* renamed from: k */
    public final C0623k f3063k;

    /* renamed from: l */
    public boolean f3064l;

    /* renamed from: m */
    public boolean f3065m;

    /* renamed from: n */
    public boolean f3066n;

    /* renamed from: o */
    public long f3067o;

    /* renamed from: p */
    public AccessibilityManager f3068p;

    /* renamed from: q */
    public ValueAnimator f3069q;

    /* renamed from: r */
    public ValueAnimator f3070r;

    /* JADX WARN: Type inference failed for: r0v0, types: [w3.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [c4.j] */
    public C0627o(C0855a c0855a) {
        super(c0855a);
        this.f3061i = new View.OnClickListener() { // from class: w3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C0627o) this).m2073u();
            }
        };
        this.f3062j = new View.OnFocusChangeListener() { // from class: c4.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C0627o c0627o = C0627o.this;
                c0627o.f3064l = z6;
                c0627o.m2076q();
                if (z6) {
                    return;
                }
                c0627o.m2072t(false);
                c0627o.f3065m = false;
            }
        };
        this.f3063k = new C0623k(0, this);
        this.f3067o = Long.MAX_VALUE;
        Context context = c0855a.getContext();
        int i7 = R$attr.motionDurationShort3;
        this.f3058f = C1832j.m4312c(context, i7, 67);
        this.f3057e = C1832j.m4312c(c0855a.getContext(), i7, 50);
        this.f3059g = C1832j.m4313d(c0855a.getContext(), R$attr.motionEasingLinearInterpolator, C0034a.f108a);
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: a */
    public final void mo2051a() {
        if (this.f3068p.isTouchExplorationEnabled()) {
            if ((this.f3060h.getInputType() != 0) && !this.f3074d.hasFocus()) {
                this.f3060h.dismissDropDown();
            }
        }
        this.f3060h.post(new RunnableC0125j(3, this));
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: c */
    public final int mo2052c() {
        return R$string.exposed_dropdown_menu_content_description;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: d */
    public final int mo2053d() {
        return R$drawable.mtrl_dropdown_arrow;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo2054e() {
        return this.f3062j;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: f */
    public final View.OnClickListener mo2055f() {
        return this.f3061i;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: h */
    public final InterfaceC1148d mo2066h() {
        return this.f3063k;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: i */
    public final boolean mo2067i(int i7) {
        return i7 != 0;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: j */
    public final boolean mo2068j() {
        return this.f3064l;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: l */
    public final boolean mo2069l() {
        return this.f3066n;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: m */
    public final void mo2057m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3060h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: c4.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0627o c0627o = C0627o.this;
                c0627o.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0627o.f3067o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        c0627o.f3065m = false;
                    }
                    c0627o.m2073u();
                    c0627o.f3065m = true;
                    c0627o.f3067o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f3060h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: c4.m
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0627o c0627o = C0627o.this;
                c0627o.f3065m = true;
                c0627o.f3067o = System.currentTimeMillis();
                c0627o.m2072t(false);
            }
        });
        this.f3060h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3071a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.f3068p.isTouchExplorationEnabled()) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2843s(this.f3074d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: n */
    public final void mo2070n(C1151g c1151g) {
        boolean z6 = true;
        if (!(this.f3060h.getInputType() != 0)) {
            c1151g.m3342g(Spinner.class.getName());
        }
        int i7 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        if (i7 >= 26) {
            z6 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z6 = false;
            }
        }
        if (z6) {
            c1151g.m3344i(null);
        }
    }

    @Override // p021c4.AbstractC0628p
    @SuppressLint({"WrongConstant"})
    /* renamed from: o */
    public final void mo2071o(AccessibilityEvent accessibilityEvent) {
        if (this.f3068p.isEnabled()) {
            boolean z6 = false;
            if (this.f3060h.getInputType() != 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 32768 && this.f3066n && !this.f3060h.isPopupShowing()) {
                z6 = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z6) {
                m2073u();
                this.f3065m = true;
                this.f3067o = System.currentTimeMillis();
            }
        }
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: r */
    public final void mo2059r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3059g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3058f);
        int i7 = 1;
        ofFloat.addUpdateListener(new C0613a(this, i7));
        this.f3070r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3057e);
        ofFloat2.addUpdateListener(new C0613a(this, i7));
        this.f3069q = ofFloat2;
        ofFloat2.addListener(new C0626n(this));
        this.f3068p = (AccessibilityManager) this.f3073c.getSystemService("accessibility");
    }

    @Override // p021c4.AbstractC0628p
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: s */
    public final void mo2060s() {
        AutoCompleteTextView autoCompleteTextView = this.f3060h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3060h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m2072t(boolean z6) {
        if (this.f3066n != z6) {
            this.f3066n = z6;
            this.f3070r.cancel();
            this.f3069q.start();
        }
    }

    /* renamed from: u */
    public final void m2073u() {
        if (this.f3060h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3067o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f3065m = false;
        }
        if (this.f3065m) {
            this.f3065m = false;
            return;
        }
        m2072t(!this.f3066n);
        if (!this.f3066n) {
            this.f3060h.dismissDropDown();
        } else {
            this.f3060h.requestFocus();
            this.f3060h.showDropDown();
        }
    }
}
