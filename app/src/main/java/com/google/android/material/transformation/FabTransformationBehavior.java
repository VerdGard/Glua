package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.ext.C0091c;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p002a1.C0017d;
import p004a3.C0034a;
import p004a3.C0040g;
import p004a3.C0041h;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: X */
    public final RectF f4623X;

    /* renamed from: Y */
    public final int[] f4624Y;

    /* renamed from: Z */
    public float f4625Z;

    /* renamed from: m */
    public final Rect f4626m;

    /* renamed from: s */
    public final RectF f4627s;

    /* renamed from: w1 */
    public float f4628w1;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C0866a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f4629a;

        /* renamed from: b */
        public final /* synthetic */ View f4630b;

        /* renamed from: c */
        public final /* synthetic */ View f4631c;

        public C0866a(boolean z6, View view, View view2) {
            this.f4629a = z6;
            this.f4630b = view;
            this.f4631c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f4629a) {
                return;
            }
            this.f4630b.setVisibility(4);
            View view = this.f4631c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f4629a) {
                this.f4630b.setVisibility(0);
                View view = this.f4631c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C0867b {

        /* renamed from: a */
        public C0040g f4632a;

        /* renamed from: b */
        public C0017d f4633b;
    }

    public FabTransformationBehavior() {
        this.f4626m = new Rect();
        this.f4627s = new RectF();
        this.f4623X = new RectF();
        this.f4624Y = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4626m = new Rect();
        this.f4627s = new RectF();
        this.f4623X = new RectF();
        this.f4624Y = new int[2];
    }

    /* renamed from: B */
    public static float m2555B(C0867b c0867b, C0041h c0041h, float f7) {
        long j7 = c0041h.f122a;
        C0041h m130c = c0867b.f4632a.m130c("expansion");
        float interpolation = c0041h.m132b().getInterpolation((((m130c.f122a + m130c.f123b) + 17) - j7) / c0041h.f123b);
        LinearInterpolator linearInterpolator = C0034a.f108a;
        return C0091c.m227e(0.0f, f7, interpolation, f7);
    }

    /* renamed from: y */
    public static Pair m2556y(float f7, float f8, boolean z6, C0867b c0867b) {
        C0041h m130c;
        C0040g c0040g;
        String str;
        if (f7 == 0.0f || f8 == 0.0f) {
            m130c = c0867b.f4632a.m130c("translationXLinear");
            c0040g = c0867b.f4632a;
            str = "translationYLinear";
        } else if ((!z6 || f8 >= 0.0f) && (z6 || f8 <= 0.0f)) {
            m130c = c0867b.f4632a.m130c("translationXCurveDownwards");
            c0040g = c0867b.f4632a;
            str = "translationYCurveDownwards";
        } else {
            m130c = c0867b.f4632a.m130c("translationXCurveUpwards");
            c0040g = c0867b.f4632a;
            str = "translationYCurveUpwards";
        }
        return new Pair(m130c, c0040g.m130c(str));
    }

    /* renamed from: A */
    public final float m2557A(View view, View view2, C0017d c0017d) {
        RectF rectF = this.f4627s;
        RectF rectF2 = this.f4623X;
        m2558C(view, rectF);
        rectF.offset(this.f4625Z, this.f4628w1);
        m2558C(view2, rectF2);
        c0017d.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: C */
    public final void m2558C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f4624Y);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: D */
    public abstract C0867b mo2559D(Context context, boolean z6);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: f */
    public final boolean mo979f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: g */
    public final void mo980g(CoordinatorLayout.C0292f c0292f) {
        if (c0292f.f1426h == 0) {
            c0292f.f1426h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03ec A[LOOP:0: B:59:0x03ea->B:60:0x03ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet mo2554x(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo2554x(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: z */
    public final float m2560z(View view, View view2, C0017d c0017d) {
        RectF rectF = this.f4627s;
        RectF rectF2 = this.f4623X;
        m2558C(view, rectF);
        rectF.offset(this.f4625Z, this.f4628w1);
        m2558C(view2, rectF2);
        c0017d.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }
}
