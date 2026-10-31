package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import p189y.C2213a;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public final class C0234i {

    /* renamed from: a */
    public final CheckedTextView f917a;

    /* renamed from: b */
    public ColorStateList f918b = null;

    /* renamed from: c */
    public PorterDuff.Mode f919c = null;

    /* renamed from: d */
    public boolean f920d = false;

    /* renamed from: e */
    public boolean f921e = false;

    /* renamed from: f */
    public boolean f922f;

    public C0234i(CheckedTextView checkedTextView) {
        this.f917a = checkedTextView;
    }

    /* renamed from: a */
    public final void m804a() {
        CheckedTextView checkedTextView = this.f917a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f920d || this.f921e) {
                Drawable mutate = C2213a.m5359g(checkMarkDrawable).mutate();
                if (this.f920d) {
                    C2213a.b.m5372h(mutate, this.f918b);
                }
                if (this.f921e) {
                    C2213a.b.m5373i(mutate, this.f919c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
