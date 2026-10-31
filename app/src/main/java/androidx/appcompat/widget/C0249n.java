package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import p113o0.C1657f;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public final class C0249n {

    /* renamed from: a */
    public final TextView f1004a;

    /* renamed from: b */
    public final C1657f f1005b;

    public C0249n(TextView textView) {
        this.f1004a = textView;
        this.f1005b = new C1657f(textView);
    }

    /* renamed from: a */
    public final void m863a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f1004a.getContext().obtainStyledAttributes(attributeSet, R$styleable.f281i, i7, 0);
        try {
            int i8 = R$styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z6 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getBoolean(i8, true) : true;
            obtainStyledAttributes.recycle();
            m865c(z6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m864b(boolean z6) {
        this.f1005b.f7502a.mo4013b(z6);
    }

    /* renamed from: c */
    public final void m865c(boolean z6) {
        this.f1005b.f7502a.mo4014c(z6);
    }
}
