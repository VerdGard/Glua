package p131q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: q3.n */
/* loaded from: classes.dex */
public final class C1758n {

    /* renamed from: a */
    public final ArrayList<b> f8092a = new ArrayList<>();

    /* renamed from: b */
    public ValueAnimator f8093b = null;

    /* renamed from: c */
    public final a f8094c = new a();

    /* renamed from: q3.n$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C1758n c1758n = C1758n.this;
            if (c1758n.f8093b == animator) {
                c1758n.f8093b = null;
            }
        }
    }

    /* renamed from: q3.n$b */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: a */
    public final void m4229a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f8094c);
        this.f8092a.add(bVar);
    }
}
