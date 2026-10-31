package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import p025d.C0872a;
import p034e0.C0946x;
import p066i0.C1310d;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public final class C0255p {

    /* renamed from: a */
    public final ImageView f1028a;

    /* renamed from: b */
    public C0227f1 f1029b;

    /* renamed from: c */
    public C0227f1 f1030c;

    /* renamed from: d */
    public int f1031d = 0;

    public C0255p(ImageView imageView) {
        this.f1028a = imageView;
    }

    /* renamed from: a */
    public final void m867a() {
        ImageView imageView = this.f1028a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0244l0.m842a(drawable);
        }
        if (drawable != null) {
            int i7 = Build.VERSION.SDK_INT;
            boolean z6 = true;
            if (i7 <= 21 && i7 == 21) {
                if (this.f1030c == null) {
                    this.f1030c = new C0227f1();
                }
                C0227f1 c0227f1 = this.f1030c;
                c0227f1.f889a = null;
                c0227f1.f892d = false;
                c0227f1.f890b = null;
                c0227f1.f891c = false;
                ColorStateList m3639a = C1310d.m3639a(imageView);
                if (m3639a != null) {
                    c0227f1.f892d = true;
                    c0227f1.f889a = m3639a;
                }
                PorterDuff.Mode m3640b = C1310d.m3640b(imageView);
                if (m3640b != null) {
                    c0227f1.f891c = true;
                    c0227f1.f890b = m3640b;
                }
                if (c0227f1.f892d || c0227f1.f891c) {
                    C0240k.m810e(drawable, c0227f1, imageView.getDrawableState());
                } else {
                    z6 = false;
                }
                if (z6) {
                    return;
                }
            }
            C0227f1 c0227f12 = this.f1029b;
            if (c0227f12 != null) {
                C0240k.m810e(drawable, c0227f12, imageView.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void m868b(AttributeSet attributeSet, int i7) {
        Drawable drawable;
        Drawable drawable2;
        int m799i;
        ImageView imageView = this.f1028a;
        Context context = imageView.getContext();
        int[] iArr = R$styleable.f278f;
        C0233h1 m790m = C0233h1.m790m(context, attributeSet, iArr, i7);
        C0946x.m2816q(imageView, imageView.getContext(), iArr, attributeSet, m790m.f915b, i7);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (m799i = m790m.m799i(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = C0872a.m2561a(imageView.getContext(), m799i)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C0244l0.m842a(drawable3);
            }
            int i8 = R$styleable.AppCompatImageView_tint;
            if (m790m.m802l(i8)) {
                ColorStateList m792b = m790m.m792b(i8);
                int i9 = Build.VERSION.SDK_INT;
                C1310d.m3641c(imageView, m792b);
                if (i9 == 21 && (drawable2 = imageView.getDrawable()) != null && C1310d.m3639a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            int i10 = R$styleable.AppCompatImageView_tintMode;
            if (m790m.m802l(i10)) {
                PorterDuff.Mode m844c = C0244l0.m844c(m790m.m798h(i10, -1), null);
                int i11 = Build.VERSION.SDK_INT;
                C1310d.m3642d(imageView, m844c);
                if (i11 == 21 && (drawable = imageView.getDrawable()) != null && C1310d.m3639a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            m790m.m803n();
        }
    }
}
