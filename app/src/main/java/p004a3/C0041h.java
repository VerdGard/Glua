package p004a3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: a3.h */
/* loaded from: classes.dex */
public final class C0041h {

    /* renamed from: a */
    public final long f122a;

    /* renamed from: b */
    public final long f123b;

    /* renamed from: c */
    public final TimeInterpolator f124c;

    /* renamed from: d */
    public int f125d;

    /* renamed from: e */
    public int f126e;

    public C0041h(long j7) {
        this.f122a = 0L;
        this.f123b = 300L;
        this.f124c = null;
        this.f125d = 0;
        this.f126e = 1;
        this.f122a = j7;
        this.f123b = 150L;
    }

    public C0041h(long j7, long j8, TimeInterpolator timeInterpolator) {
        this.f122a = 0L;
        this.f123b = 300L;
        this.f124c = null;
        this.f125d = 0;
        this.f126e = 1;
        this.f122a = j7;
        this.f123b = j8;
        this.f124c = timeInterpolator;
    }

    /* renamed from: a */
    public final void m131a(Animator animator) {
        animator.setStartDelay(this.f122a);
        animator.setDuration(this.f123b);
        animator.setInterpolator(m132b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f125d);
            valueAnimator.setRepeatMode(this.f126e);
        }
    }

    /* renamed from: b */
    public final TimeInterpolator m132b() {
        TimeInterpolator timeInterpolator = this.f124c;
        return timeInterpolator != null ? timeInterpolator : C0034a.f109b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0041h)) {
            return false;
        }
        C0041h c0041h = (C0041h) obj;
        if (this.f122a == c0041h.f122a && this.f123b == c0041h.f123b && this.f125d == c0041h.f125d && this.f126e == c0041h.f126e) {
            return m132b().getClass().equals(c0041h.m132b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f122a;
        long j8 = this.f123b;
        return ((((m132b().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f125d) * 31) + this.f126e;
    }

    public final String toString() {
        return "\n" + C0041h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f122a + " duration: " + this.f123b + " interpolator: " + m132b().getClass() + " repeatCount: " + this.f125d + " repeatMode: " + this.f126e + "}\n";
    }
}
