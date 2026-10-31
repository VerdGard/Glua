package p125p5;

import android.animation.ValueAnimator;
import p055g5.C1245b;
import p079j5.AbstractC1432a;
import p118o5.InterfaceC1670a;

/* renamed from: p5.c */
/* loaded from: classes.dex */
public final class C1706c implements InterfaceC1670a, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final C1245b f7676a;

    /* renamed from: g */
    public float f7682g;

    /* renamed from: h */
    public float f7683h;

    /* renamed from: i */
    public float f7684i;

    /* renamed from: j */
    public float f7685j;

    /* renamed from: k */
    public long f7686k;

    /* renamed from: c */
    public ValueAnimator f7678c = new ValueAnimator();

    /* renamed from: d */
    public ValueAnimator f7679d = new ValueAnimator();

    /* renamed from: f */
    public ValueAnimator f7681f = new ValueAnimator();

    /* renamed from: e */
    public ValueAnimator f7680e = new ValueAnimator();

    /* renamed from: b */
    public final long f7677b = 120;

    public C1706c(C1245b c1245b) {
        this.f7676a = c1245b;
    }

    /* renamed from: a */
    public final void m4127a() {
        this.f7678c.cancel();
        this.f7679d.cancel();
        this.f7681f.cancel();
        this.f7680e.cancel();
    }

    /* renamed from: b */
    public final boolean m4128b() {
        return this.f7678c.isRunning() || this.f7679d.isRunning() || this.f7681f.isRunning() || this.f7680e.isRunning();
    }

    /* renamed from: c */
    public final void m4129c() {
        C1245b c1245b = this.f7676a;
        if (c1245b.f6067n2) {
            if (m4128b()) {
                this.f7682g = ((Float) this.f7678c.getAnimatedValue()).floatValue();
                this.f7683h = ((Float) this.f7679d.getAnimatedValue()).floatValue();
                this.f7684i = ((Float) this.f7681f.getAnimatedValue()).floatValue();
                this.f7685j = ((Float) this.f7680e.getAnimatedValue()).floatValue();
                m4127a();
            }
            if (System.currentTimeMillis() - this.f7686k < 100) {
                return;
            }
            int i7 = c1245b.getCursor().f3166c.f3141b;
            this.f7678c.removeAllUpdateListeners();
            float[] m3801b = ((AbstractC1432a) c1245b.getLayout()).m3801b(c1245b.getCursor().f3166c.f3141b, c1245b.getCursor().f3166c.f3142c);
            this.f7678c = ValueAnimator.ofFloat(this.f7682g, c1245b.m3482Y() + m3801b[1]);
            float f7 = m3801b[0];
            c1245b.getProps().getClass();
            this.f7679d = ValueAnimator.ofFloat(this.f7683h, f7 - 0.0f);
            this.f7681f = ValueAnimator.ofFloat(this.f7684i, c1245b.getRowHeight() * c1245b.getLayout().mo3817w(c1245b.getCursor().f3166c.f3141b));
            this.f7680e = ValueAnimator.ofFloat(this.f7685j, ((AbstractC1432a) c1245b.getLayout()).m3801b(i7, c1245b.getText().m2142n(i7))[0]);
            this.f7678c.addUpdateListener(this);
            ValueAnimator valueAnimator = this.f7678c;
            long j7 = this.f7677b;
            valueAnimator.setDuration(j7);
            this.f7679d.setDuration(j7);
            this.f7681f.setDuration(j7);
            this.f7680e.setDuration(j7);
        }
    }

    /* renamed from: d */
    public final void m4130d() {
        C1245b c1245b = this.f7676a;
        int i7 = c1245b.getCursor().f3166c.f3141b;
        float[] m3801b = ((AbstractC1432a) c1245b.getLayout()).m3801b(i7, c1245b.getCursor().f3166c.f3142c);
        this.f7682g = c1245b.m3482Y() + m3801b[1];
        float f7 = m3801b[0];
        c1245b.getProps().getClass();
        this.f7683h = f7 - 0.0f;
        this.f7684i = c1245b.getRowHeight() * c1245b.getLayout().mo3817w(i7);
        this.f7685j = ((AbstractC1432a) c1245b.getLayout()).m3801b(i7, c1245b.getText().m2142n(i7))[0];
    }

    /* renamed from: e */
    public final void m4131e() {
        if (this.f7676a.f6067n2 && System.currentTimeMillis() - this.f7686k >= 100) {
            this.f7678c.start();
            this.f7679d.start();
            this.f7681f.start();
            this.f7680e.start();
        }
        this.f7686k = System.currentTimeMillis();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7676a.postInvalidateOnAnimation();
    }
}
