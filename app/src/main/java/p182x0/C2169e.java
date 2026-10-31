package p182x0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class C2169e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C2168d f9815a;

    public C2169e(C2168d c2168d) {
        this.f9815a = c2168d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2168d c2168d = this.f9815a;
        ArrayList arrayList = new ArrayList(c2168d.f9804X);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2167c) arrayList.get(i7)).mo3610a(c2168d);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C2168d c2168d = this.f9815a;
        ArrayList arrayList = new ArrayList(c2168d.f9804X);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2167c) arrayList.get(i7)).mo3611b(c2168d);
        }
    }
}
