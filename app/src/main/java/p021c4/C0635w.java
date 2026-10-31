package p021c4;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.C0855a;

/* renamed from: c4.w */
/* loaded from: classes.dex */
public final class C0635w extends AbstractC0628p {

    /* renamed from: e */
    public final int f3121e;

    /* renamed from: f */
    public EditText f3122f;

    /* renamed from: g */
    public final ViewOnClickListenerC0615c f3123g;

    public C0635w(C0855a c0855a, int i7) {
        super(c0855a);
        this.f3121e = R$drawable.design_password_eye;
        this.f3123g = new ViewOnClickListenerC0615c(this, 1);
        if (i7 != 0) {
            this.f3121e = i7;
        }
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: b */
    public final void mo2074b() {
        m2076q();
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: c */
    public final int mo2052c() {
        return R$string.password_toggle_content_description;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: d */
    public final int mo2053d() {
        return this.f3121e;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: f */
    public final View.OnClickListener mo2055f() {
        return this.f3123g;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: k */
    public final boolean mo2075k() {
        return true;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: l */
    public final boolean mo2069l() {
        EditText editText = this.f3122f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: m */
    public final void mo2057m(EditText editText) {
        this.f3122f = editText;
        m2076q();
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: r */
    public final void mo2059r() {
        EditText editText = this.f3122f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f3122f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: s */
    public final void mo2060s() {
        EditText editText = this.f3122f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
