package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$styleable;
import p034e0.C0946x;
import p189y.C2213a;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public final class C0273x extends C0263s {

    /* renamed from: d */
    public final SeekBar f1107d;

    /* renamed from: e */
    public Drawable f1108e;

    /* renamed from: f */
    public ColorStateList f1109f;

    /* renamed from: g */
    public PorterDuff.Mode f1110g;

    /* renamed from: h */
    public boolean f1111h;

    /* renamed from: i */
    public boolean f1112i;

    public C0273x(SeekBar seekBar) {
        super(seekBar);
        this.f1109f = null;
        this.f1110g = null;
        this.f1111h = false;
        this.f1112i = false;
        this.f1107d = seekBar;
    }

    @Override // androidx.appcompat.widget.C0263s
    /* renamed from: a */
    public final void mo886a(AttributeSet attributeSet, int i7) {
        super.mo886a(attributeSet, i7);
        SeekBar seekBar = this.f1107d;
        Context context = seekBar.getContext();
        int[] iArr = R$styleable.f279g;
        C0233h1 m790m = C0233h1.m790m(context, attributeSet, iArr, i7);
        C0946x.m2816q(seekBar, seekBar.getContext(), iArr, attributeSet, m790m.f915b, i7);
        Drawable m796f = m790m.m796f(R$styleable.AppCompatSeekBar_android_thumb);
        if (m796f != null) {
            seekBar.setThumb(m796f);
        }
        Drawable m795e = m790m.m795e(R$styleable.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1108e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1108e = m795e;
        if (m795e != null) {
            m795e.setCallback(seekBar);
            C2213a.m5355c(m795e, C0946x.e.m2847d(seekBar));
            if (m795e.isStateful()) {
                m795e.setState(seekBar.getDrawableState());
            }
            m894c();
        }
        seekBar.invalidate();
        int i8 = R$styleable.AppCompatSeekBar_tickMarkTintMode;
        if (m790m.m802l(i8)) {
            this.f1110g = C0244l0.m844c(m790m.m798h(i8, -1), this.f1110g);
            this.f1112i = true;
        }
        int i9 = R$styleable.AppCompatSeekBar_tickMarkTint;
        if (m790m.m802l(i9)) {
            this.f1109f = m790m.m792b(i9);
            this.f1111h = true;
        }
        m790m.m803n();
        m894c();
    }

    /* renamed from: c */
    public final void m894c() {
        Drawable drawable = this.f1108e;
        if (drawable != null) {
            if (this.f1111h || this.f1112i) {
                Drawable m5359g = C2213a.m5359g(drawable.mutate());
                this.f1108e = m5359g;
                if (this.f1111h) {
                    C2213a.b.m5372h(m5359g, this.f1109f);
                }
                if (this.f1112i) {
                    C2213a.b.m5373i(this.f1108e, this.f1110g);
                }
                if (this.f1108e.isStateful()) {
                    this.f1108e.setState(this.f1107d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m895d(Canvas canvas) {
        if (this.f1108e != null) {
            int max = this.f1107d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1108e.getIntrinsicWidth();
                int intrinsicHeight = this.f1108e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1108e.setBounds(-i7, -i8, i7, i8);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f1108e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
