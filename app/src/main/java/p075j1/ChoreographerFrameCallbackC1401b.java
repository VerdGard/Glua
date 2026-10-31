package p075j1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import com.airbnb.lottie.C0680a;
import java.util.Iterator;
import p002a1.C0017d;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1401b extends AbstractC1400a implements Choreographer.FrameCallback {

    /* renamed from: x1 */
    public C0680a f6755x1;

    /* renamed from: m */
    public float f6752m = 1.0f;

    /* renamed from: s */
    public long f6753s = 0;

    /* renamed from: X */
    public float f6749X = 0.0f;

    /* renamed from: Y */
    public int f6750Y = 0;

    /* renamed from: Z */
    public float f6751Z = -2.14748365E9f;

    /* renamed from: w1 */
    public float f6754w1 = 2.14748365E9f;

    /* renamed from: y1 */
    public boolean f6756y1 = false;

    /* renamed from: b */
    public final float m3750b() {
        C0680a c0680a = this.f6755x1;
        if (c0680a == null) {
            return 0.0f;
        }
        float f7 = this.f6754w1;
        return f7 == 2.14748365E9f ? c0680a.f3257k : f7;
    }

    /* renamed from: c */
    public final float m3751c() {
        if (this.f6755x1 == null) {
            return 0.0f;
        }
        float f7 = this.f6751Z;
        if (f7 == -2.14748365E9f) {
            return 0.0f;
        }
        return f7;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f6748e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        this.f6756y1 = false;
    }

    /* renamed from: d */
    public final boolean m3752d() {
        return this.f6752m < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        Choreographer.getInstance().removeFrameCallback(this);
        this.f6756y1 = false;
        Choreographer.getInstance().postFrameCallback(this);
        this.f6756y1 = true;
        if (this.f6755x1 != null) {
            long nanoTime = System.nanoTime();
            long j8 = nanoTime - this.f6753s;
            C0680a c0680a = this.f6755x1;
            float abs = c0680a == null ? Float.MAX_VALUE : (1.0E9f / c0680a.f3258l) / Math.abs(this.f6752m);
            float f7 = j8 / abs;
            int i7 = (int) f7;
            if (i7 == 0) {
                return;
            }
            float f8 = this.f6749X + (m3752d() ? -i7 : i7);
            this.f6749X = f8;
            boolean z6 = !(f8 >= m3751c() && f8 <= m3750b());
            this.f6749X = C0017d.m89n(this.f6749X, m3751c(), m3750b());
            this.f6753s = (long) (nanoTime - ((f7 - i7) * abs));
            Iterator it = this.f6747c.iterator();
            while (it.hasNext()) {
                ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
            }
            if (z6) {
                if (getRepeatCount() == -1 || this.f6750Y < getRepeatCount()) {
                    Iterator it2 = this.f6748e.iterator();
                    while (it2.hasNext()) {
                        ((Animator.AnimatorListener) it2.next()).onAnimationRepeat(this);
                    }
                    this.f6750Y++;
                    if (getRepeatMode() == 2) {
                        this.f6752m = -this.f6752m;
                    } else {
                        this.f6749X = m3751c();
                    }
                    this.f6753s = nanoTime;
                } else {
                    this.f6749X = m3750b();
                    m3749a(m3752d());
                    Choreographer.getInstance().removeFrameCallback(this);
                    this.f6756y1 = false;
                }
            }
            m3753e();
        }
    }

    /* renamed from: e */
    public final void m3753e() {
        if (this.f6755x1 == null) {
            return;
        }
        float f7 = this.f6749X;
        if (f7 < this.f6751Z || f7 > this.f6754w1) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f6751Z), Float.valueOf(this.f6754w1), Float.valueOf(this.f6749X)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f7;
        float m3751c;
        if (this.f6755x1 == null) {
            return 0.0f;
        }
        if (m3752d()) {
            f7 = m3750b();
            m3751c = this.f6749X;
        } else {
            f7 = this.f6749X;
            m3751c = m3751c();
        }
        return (f7 - m3751c) / (m3750b() - m3751c());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f7;
        C0680a c0680a = this.f6755x1;
        if (c0680a == null) {
            f7 = 0.0f;
        } else {
            float f8 = this.f6749X;
            float f9 = c0680a.f3256j;
            f7 = (f8 - f9) / (c0680a.f3257k - f9);
        }
        return Float.valueOf(f7);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C0680a c0680a = this.f6755x1;
        if (c0680a == null) {
            return 0L;
        }
        return (long) c0680a.m2184b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f6756y1;
    }
}
