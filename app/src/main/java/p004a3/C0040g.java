package p004a3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p089l.C1481o;

/* renamed from: a3.g */
/* loaded from: classes.dex */
public final class C0040g {

    /* renamed from: a */
    public final C1481o<String, C0041h> f120a = new C1481o<>();

    /* renamed from: b */
    public final C1481o<String, PropertyValuesHolder[]> f121b = new C1481o<>();

    /* renamed from: a */
    public static C0040g m128a(int i7, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (loadAnimator instanceof AnimatorSet) {
                return m129b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m129b(arrayList);
        } catch (Exception e7) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i7), e7);
            return null;
        }
    }

    /* renamed from: b */
    public static C0040g m129b(ArrayList arrayList) {
        C0040g c0040g = new C0040g();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) arrayList.get(i7);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0040g.f121b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C0034a.f109b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C0034a.f110c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C0034a.f111d;
            }
            C0041h c0041h = new C0041h(startDelay, duration, interpolator);
            c0041h.f125d = objectAnimator.getRepeatCount();
            c0041h.f126e = objectAnimator.getRepeatMode();
            c0040g.f120a.put(propertyName, c0041h);
        }
        return c0040g;
    }

    /* renamed from: c */
    public final C0041h m130c(String str) {
        C1481o<String, C0041h> c1481o = this.f120a;
        if (c1481o.get(str) != null) {
            return c1481o.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0040g) {
            return this.f120a.equals(((C0040g) obj).f120a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f120a.hashCode();
    }

    public final String toString() {
        return "\n" + C0040g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f120a + "}\n";
    }
}
