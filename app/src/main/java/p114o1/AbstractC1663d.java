package p114o1;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: o1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1663d {

    /* renamed from: a */
    public static final b f7515a = new b();

    /* renamed from: b */
    public static final a f7516b = new a();

    /* renamed from: o1.d$a */
    public static class a extends AbstractC1663d {
        @Override // p114o1.AbstractC1663d
        /* renamed from: a */
        public final float mo4017a(float f7) {
            return f7;
        }

        @Override // p114o1.AbstractC1663d
        /* renamed from: b */
        public final float mo4018b(float f7) {
            return f7;
        }
    }

    /* renamed from: o1.d$b */
    public static class b extends AbstractC1663d {

        /* renamed from: c */
        public final AccelerateInterpolator f7517c = new AccelerateInterpolator(3.0f);

        /* renamed from: d */
        public final DecelerateInterpolator f7518d = new DecelerateInterpolator(3.0f);

        @Override // p114o1.AbstractC1663d
        /* renamed from: a */
        public final float mo4017a(float f7) {
            return this.f7517c.getInterpolation(f7);
        }

        @Override // p114o1.AbstractC1663d
        /* renamed from: b */
        public final float mo4018b(float f7) {
            return this.f7518d.getInterpolation(f7);
        }

        @Override // p114o1.AbstractC1663d
        /* renamed from: c */
        public final float mo4019c(float f7) {
            return 1.0f / (mo4018b(f7) + (1.0f - mo4017a(f7)));
        }
    }

    /* renamed from: a */
    public abstract float mo4017a(float f7);

    /* renamed from: b */
    public abstract float mo4018b(float f7);

    /* renamed from: c */
    public float mo4019c(float f7) {
        return 1.0f;
    }
}
