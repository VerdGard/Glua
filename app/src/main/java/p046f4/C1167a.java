package p046f4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public final class C1167a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f5736a;

    public C1167a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f5736a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5736a.f4622e = null;
    }
}
