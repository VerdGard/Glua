package p083k1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C0680a;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public class C1447a<T> {

    /* renamed from: a */
    public final C0680a f6947a;

    /* renamed from: b */
    public final T f6948b;

    /* renamed from: c */
    public final T f6949c;

    /* renamed from: d */
    public final Interpolator f6950d;

    /* renamed from: e */
    public final float f6951e;

    /* renamed from: f */
    public Float f6952f;

    /* renamed from: g */
    public float f6953g;

    /* renamed from: h */
    public float f6954h;

    /* renamed from: i */
    public PointF f6955i;

    /* renamed from: j */
    public PointF f6956j;

    public C1447a(C0680a c0680a, T t7, T t8, Interpolator interpolator, float f7, Float f8) {
        this.f6953g = Float.MIN_VALUE;
        this.f6954h = Float.MIN_VALUE;
        this.f6955i = null;
        this.f6956j = null;
        this.f6947a = c0680a;
        this.f6948b = t7;
        this.f6949c = t8;
        this.f6950d = interpolator;
        this.f6951e = f7;
        this.f6952f = f8;
    }

    public C1447a(T t7) {
        this.f6953g = Float.MIN_VALUE;
        this.f6954h = Float.MIN_VALUE;
        this.f6955i = null;
        this.f6956j = null;
        this.f6947a = null;
        this.f6948b = t7;
        this.f6949c = t7;
        this.f6950d = null;
        this.f6951e = Float.MIN_VALUE;
        this.f6952f = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public final float m3830a() {
        C0680a c0680a = this.f6947a;
        if (c0680a == null) {
            return 1.0f;
        }
        if (this.f6954h == Float.MIN_VALUE) {
            if (this.f6952f == null) {
                this.f6954h = 1.0f;
            } else {
                this.f6954h = ((this.f6952f.floatValue() - this.f6951e) / (c0680a.f3257k - c0680a.f3256j)) + m3831b();
            }
        }
        return this.f6954h;
    }

    /* renamed from: b */
    public final float m3831b() {
        C0680a c0680a = this.f6947a;
        if (c0680a == null) {
            return 0.0f;
        }
        if (this.f6953g == Float.MIN_VALUE) {
            float f7 = c0680a.f3256j;
            this.f6953g = (this.f6951e - f7) / (c0680a.f3257k - f7);
        }
        return this.f6953g;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f6948b + ", endValue=" + this.f6949c + ", startFrame=" + this.f6951e + ", endFrame=" + this.f6952f + ", interpolator=" + this.f6950d + '}';
    }
}
