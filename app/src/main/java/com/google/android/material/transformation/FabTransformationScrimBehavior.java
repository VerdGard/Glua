package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p004a3.C0041h;
import p036e2.C1109v5;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: m */
    public final C0041h f4634m;

    /* renamed from: s */
    public final C0041h f4635s;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0868a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f4636a;

        /* renamed from: b */
        public final /* synthetic */ View f4637b;

        public C0868a(boolean z6, View view) {
            this.f4636a = z6;
            this.f4637b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f4636a) {
                return;
            }
            this.f4637b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f4636a) {
                this.f4637b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f4634m = new C0041h(75L);
        this.f4635s = new C0041h(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4634m = new C0041h(75L);
        this.f4635s = new C0041h(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: f */
    public final boolean mo979f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: v */
    public final boolean mo995v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: x */
    public final AnimatorSet mo2554x(View view, View view2, boolean z6, boolean z7) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C0041h c0041h = z6 ? this.f4634m : this.f4635s;
        if (z6) {
            if (!z7) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c0041h.m131a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C1109v5.m3256t(animatorSet, arrayList);
        animatorSet.addListener(new C0868a(z6, view2));
        return animatorSet;
    }
}
