package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p046f4.C1167a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e */
    public AnimatorSet f4622e;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: w */
    public void mo2553w(View view, View view2, boolean z6, boolean z7) {
        AnimatorSet animatorSet = this.f4622e;
        boolean z8 = animatorSet != null;
        if (z8) {
            animatorSet.cancel();
        }
        AnimatorSet mo2554x = mo2554x(view, view2, z6, z8);
        this.f4622e = mo2554x;
        mo2554x.addListener(new C1167a(this));
        this.f4622e.start();
        if (z7) {
            return;
        }
        this.f4622e.end();
    }

    /* renamed from: x */
    public abstract AnimatorSet mo2554x(View view, View view2, boolean z6, boolean z7);
}
