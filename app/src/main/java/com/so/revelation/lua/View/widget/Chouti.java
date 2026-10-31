package com.so.revelation.lua.View.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.so.revelation.lua.R$styleable;
import p114o1.C1660a;
import p114o1.C1661b;

/* loaded from: classes.dex */
public class Chouti extends FrameLayout {

    /* renamed from: c */
    public int f3497c;

    /* renamed from: e */
    public float f3498e;

    /* renamed from: m */
    public float f3499m;

    /* renamed from: s */
    public int f3500s;

    /* renamed from: w1 */
    public int f3501w1;

    /* renamed from: x1 */
    public Interpolator f3502x1;

    /* renamed from: y1 */
    public ValueAnimator f3503y1;

    /* renamed from: com.so.revelation.lua.View.widget.Chouti$a */
    public class C0704a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final int f3504a;

        /* renamed from: b */
        public boolean f3505b;

        public C0704a(int i7) {
            this.f3504a = i7;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3505b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f3505b) {
                return;
            }
            int i7 = this.f3504a;
            int i8 = i7 == 0 ? 0 : 3;
            Chouti chouti = Chouti.this;
            chouti.f3501w1 = i8;
            chouti.setExpansion(i7);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Chouti.this.f3501w1 = this.f3504a == 0 ? 1 : 2;
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.Chouti$b */
    public interface InterfaceC0705b {
    }

    public Chouti(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3497c = 300;
        this.f3502x1 = new C1661b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f3390a);
            this.f3497c = obtainStyledAttributes.getInt(1, 300);
            this.f3499m = obtainStyledAttributes.getBoolean(2, false) ? 1.0f : 0.0f;
            this.f3500s = obtainStyledAttributes.getInt(0, 1);
            this.f3498e = obtainStyledAttributes.getFloat(3, 1.0f);
            obtainStyledAttributes.recycle();
            this.f3501w1 = this.f3499m != 0.0f ? 3 : 0;
            setParallax(this.f3498e);
        }
    }

    /* renamed from: a */
    public final void m2212a() {
        m2214c(false);
    }

    /* renamed from: b */
    public final boolean m2213b() {
        int i7 = this.f3501w1;
        return i7 == 2 || i7 == 3;
    }

    /* renamed from: c */
    public final void m2214c(boolean z6) {
        if (z6 == m2213b()) {
            return;
        }
        ValueAnimator valueAnimator = this.f3503y1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3503y1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3499m, z6 ? 1.0f : 0.0f);
        this.f3503y1 = ofFloat;
        ofFloat.setInterpolator(this.f3502x1);
        this.f3503y1.setDuration(this.f3497c);
        this.f3503y1.addUpdateListener(new C1660a(this));
        this.f3503y1.addListener(new C0704a(z6 ? 1 : 0));
        this.f3503y1.start();
    }

    public int getDuration() {
        return this.f3497c;
    }

    public float getExpansion() {
        return this.f3499m;
    }

    public int getOrientation() {
        return this.f3500s;
    }

    public float getParallax() {
        return this.f3498e;
    }

    public int getState() {
        return this.f3501w1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f3503y1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i9 = this.f3500s == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.f3499m == 0.0f && i9 == 0) ? 8 : 0);
        int round = i9 - Math.round(i9 * this.f3499m);
        float f7 = this.f3498e;
        if (f7 > 0.0f) {
            float f8 = round * f7;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (this.f3500s == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f8);
                } else {
                    childAt.setTranslationY(-f8);
                }
            }
        }
        if (this.f3500s == 0) {
            measuredWidth -= round;
        } else {
            measuredHeight -= round;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f7 = bundle.getFloat("expansion");
        this.f3499m = f7;
        this.f3501w1 = f7 == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f7 = m2213b() ? 1.0f : 0.0f;
        this.f3499m = f7;
        bundle.putFloat("expansion", f7);
        bundle.putParcelable("super_state", onSaveInstanceState);
        return bundle;
    }

    public void setDuration(int i7) {
        this.f3497c = i7;
    }

    public void setExpanded(boolean z6) {
        m2214c(z6);
    }

    public void setExpansion(float f7) {
        int i7;
        float f8 = this.f3499m;
        if (f8 == f7) {
            return;
        }
        float f9 = f7 - f8;
        if (f7 == 0.0f) {
            this.f3501w1 = 0;
        } else {
            if (f7 == 1.0f) {
                i7 = 3;
            } else if (f9 < 0.0f) {
                i7 = 1;
            } else if (f9 > 0.0f) {
                i7 = 2;
            }
            this.f3501w1 = i7;
        }
        setVisibility(this.f3501w1 == 0 ? 8 : 0);
        this.f3499m = f7;
        requestLayout();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f3502x1 = interpolator;
    }

    public void setOnExpansionUpdateListener(InterfaceC0705b interfaceC0705b) {
    }

    public void setOrientation(int i7) {
        if (i7 < 0 || i7 > 1) {
            throw new IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)");
        }
        this.f3500s = i7;
    }

    public void setParallax(float f7) {
        this.f3498e = Math.min(1.0f, Math.max(0.0f, f7));
    }
}
