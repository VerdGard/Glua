package p034e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.R$id;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p029d3.C0888g;
import p034e0.C0935n0;
import p181x.C2153b;

/* renamed from: e0.m0 */
/* loaded from: classes.dex */
public final class C0933m0 {

    /* renamed from: a */
    public final e f4807a;

    /* renamed from: e0.m0$a */
    public static final class a {

        /* renamed from: a */
        public final C2153b f4808a;

        /* renamed from: b */
        public final C2153b f4809b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.f4808a = C2153b.m5269c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.f4809b = C2153b.m5269c(upperBound);
        }

        public a(C2153b c2153b, C2153b c2153b2) {
            this.f4808a = c2153b;
            this.f4809b = c2153b2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f4808a + " upper=" + this.f4809b + "}";
        }
    }

    /* renamed from: e0.m0$b */
    public static abstract class b {

        /* renamed from: a */
        public WindowInsets f4810a;

        /* renamed from: b */
        public final int f4811b = 0;

        /* renamed from: a */
        public abstract C0935n0 mo2593a(C0935n0 c0935n0, List<C0933m0> list);
    }

    /* renamed from: e0.m0$c */
    public static class c extends e {

        /* renamed from: e0.m0$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final b f4812a;

            /* renamed from: b */
            public C0935n0 f4813b;

            /* renamed from: e0.m0$c$a$a, reason: collision with other inner class name */
            public class C2294a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ C0933m0 f4814a;

                /* renamed from: b */
                public final /* synthetic */ C0935n0 f4815b;

                /* renamed from: c */
                public final /* synthetic */ C0935n0 f4816c;

                /* renamed from: d */
                public final /* synthetic */ int f4817d;

                /* renamed from: e */
                public final /* synthetic */ View f4818e;

                public C2294a(C0933m0 c0933m0, C0935n0 c0935n0, C0935n0 c0935n02, int i7, View view) {
                    this.f4814a = c0933m0;
                    this.f4815b = c0935n0;
                    this.f4816c = c0935n02;
                    this.f4817d = i7;
                    this.f4818e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C2153b m2748f;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    C0933m0 c0933m0 = this.f4814a;
                    c0933m0.f4807a.mo2746d(animatedFraction);
                    float mo2744b = c0933m0.f4807a.mo2744b();
                    int i7 = Build.VERSION.SDK_INT;
                    C0935n0 c0935n0 = this.f4815b;
                    C0935n0.e dVar = i7 >= 30 ? new C0935n0.d(c0935n0) : i7 >= 29 ? new C0935n0.c(c0935n0) : new C0935n0.b(c0935n0);
                    for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                        if ((this.f4817d & i8) == 0) {
                            m2748f = c0935n0.m2750a(i8);
                        } else {
                            C2153b m2750a = c0935n0.m2750a(i8);
                            C2153b m2750a2 = this.f4816c.m2750a(i8);
                            float f7 = 1.0f - mo2744b;
                            m2748f = C0935n0.m2748f(m2750a, (int) (((m2750a.f9764a - m2750a2.f9764a) * f7) + 0.5d), (int) (((m2750a.f9765b - m2750a2.f9765b) * f7) + 0.5d), (int) (((m2750a.f9766c - m2750a2.f9766c) * f7) + 0.5d), (int) (((m2750a.f9767d - m2750a2.f9767d) * f7) + 0.5d));
                        }
                        dVar.mo2764c(i8, m2748f);
                    }
                    c.m2738g(this.f4818e, dVar.mo2758b(), Collections.singletonList(c0933m0));
                }
            }

            /* renamed from: e0.m0$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ C0933m0 f4819a;

                /* renamed from: b */
                public final /* synthetic */ View f4820b;

                public b(C0933m0 c0933m0, View view) {
                    this.f4819a = c0933m0;
                    this.f4820b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C0933m0 c0933m0 = this.f4819a;
                    c0933m0.f4807a.mo2746d(1.0f);
                    c.m2736e(this.f4820b, c0933m0);
                }
            }

            /* renamed from: e0.m0$c$a$c, reason: collision with other inner class name */
            public class RunnableC2295c implements Runnable {

                /* renamed from: c */
                public final /* synthetic */ View f4821c;

                /* renamed from: e */
                public final /* synthetic */ C0933m0 f4822e;

                /* renamed from: m */
                public final /* synthetic */ a f4823m;

                /* renamed from: s */
                public final /* synthetic */ ValueAnimator f4824s;

                public RunnableC2295c(View view, C0933m0 c0933m0, a aVar, ValueAnimator valueAnimator) {
                    this.f4821c = view;
                    this.f4822e = c0933m0;
                    this.f4823m = aVar;
                    this.f4824s = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.m2739h(this.f4821c, this.f4822e, this.f4823m);
                    this.f4824s.start();
                }
            }

            public a(View view, C0888g c0888g) {
                C0935n0 c0935n0;
                this.f4812a = c0888g;
                C0935n0 m2808i = C0946x.m2808i(view);
                if (m2808i != null) {
                    int i7 = Build.VERSION.SDK_INT;
                    c0935n0 = (i7 >= 30 ? new C0935n0.d(m2808i) : i7 >= 29 ? new C0935n0.c(m2808i) : new C0935n0.b(m2808i)).mo2758b();
                } else {
                    c0935n0 = null;
                }
                this.f4813b = c0935n0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (view.isLaidOut()) {
                    C0935n0 m2749i = C0935n0.m2749i(view, windowInsets);
                    if (this.f4813b == null) {
                        this.f4813b = C0946x.m2808i(view);
                    }
                    if (this.f4813b == null) {
                        this.f4813b = m2749i;
                    } else {
                        b m2741j = c.m2741j(view);
                        if (m2741j != null && Objects.equals(m2741j.f4810a, windowInsets)) {
                            return c.m2740i(view, windowInsets);
                        }
                        C0935n0 c0935n0 = this.f4813b;
                        int i7 = 0;
                        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                            if (!m2749i.m2750a(i8).equals(c0935n0.m2750a(i8))) {
                                i7 |= i8;
                            }
                        }
                        if (i7 == 0) {
                            return c.m2740i(view, windowInsets);
                        }
                        C0935n0 c0935n02 = this.f4813b;
                        C0933m0 c0933m0 = new C0933m0(i7, new DecelerateInterpolator(), 160L);
                        e eVar = c0933m0.f4807a;
                        eVar.mo2746d(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.mo2743a());
                        C2153b m2750a = m2749i.m2750a(i7);
                        C2153b m2750a2 = c0935n02.m2750a(i7);
                        int min = Math.min(m2750a.f9764a, m2750a2.f9764a);
                        int i9 = m2750a.f9765b;
                        int i10 = m2750a2.f9765b;
                        int min2 = Math.min(i9, i10);
                        int i11 = m2750a.f9766c;
                        int i12 = m2750a2.f9766c;
                        int min3 = Math.min(i11, i12);
                        int i13 = m2750a.f9767d;
                        int i14 = i7;
                        int i15 = m2750a2.f9767d;
                        a aVar = new a(C2153b.m5268b(min, min2, min3, Math.min(i13, i15)), C2153b.m5268b(Math.max(m2750a.f9764a, m2750a2.f9764a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i15)));
                        c.m2737f(view, c0933m0, windowInsets, false);
                        duration.addUpdateListener(new C2294a(c0933m0, m2749i, c0935n02, i14, view));
                        duration.addListener(new b(c0933m0, view));
                        ViewTreeObserverOnPreDrawListenerC0941s.m2796a(view, new RunnableC2295c(view, c0933m0, aVar, duration));
                        this.f4813b = m2749i;
                    }
                } else {
                    this.f4813b = C0935n0.m2749i(view, windowInsets);
                }
                return c.m2740i(view, windowInsets);
            }
        }

        public c(int i7, DecelerateInterpolator decelerateInterpolator, long j7) {
            super(i7, decelerateInterpolator, j7);
        }

        /* renamed from: e */
        public static void m2736e(View view, C0933m0 c0933m0) {
            b m2741j = m2741j(view);
            if (m2741j != null) {
                ((C0888g) m2741j).f4668c.setTranslationY(0.0f);
                if (m2741j.f4811b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m2736e(viewGroup.getChildAt(i7), c0933m0);
                }
            }
        }

        /* renamed from: f */
        public static void m2737f(View view, C0933m0 c0933m0, WindowInsets windowInsets, boolean z6) {
            b m2741j = m2741j(view);
            if (m2741j != null) {
                m2741j.f4810a = windowInsets;
                if (!z6) {
                    C0888g c0888g = (C0888g) m2741j;
                    View view2 = c0888g.f4668c;
                    int[] iArr = c0888g.f4671f;
                    view2.getLocationOnScreen(iArr);
                    c0888g.f4669d = iArr[1];
                    z6 = m2741j.f4811b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m2737f(viewGroup.getChildAt(i7), c0933m0, windowInsets, z6);
                }
            }
        }

        /* renamed from: g */
        public static void m2738g(View view, C0935n0 c0935n0, List<C0933m0> list) {
            b m2741j = m2741j(view);
            if (m2741j != null) {
                m2741j.mo2593a(c0935n0, list);
                if (m2741j.f4811b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m2738g(viewGroup.getChildAt(i7), c0935n0, list);
                }
            }
        }

        /* renamed from: h */
        public static void m2739h(View view, C0933m0 c0933m0, a aVar) {
            b m2741j = m2741j(view);
            if (m2741j != null) {
                C0888g c0888g = (C0888g) m2741j;
                View view2 = c0888g.f4668c;
                int[] iArr = c0888g.f4671f;
                view2.getLocationOnScreen(iArr);
                int i7 = c0888g.f4669d - iArr[1];
                c0888g.f4670e = i7;
                view2.setTranslationY(i7);
                if (m2741j.f4811b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    m2739h(viewGroup.getChildAt(i8), c0933m0, aVar);
                }
            }
        }

        /* renamed from: i */
        public static WindowInsets m2740i(View view, WindowInsets windowInsets) {
            return view.getTag(R$id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: j */
        public static b m2741j(View view) {
            Object tag = view.getTag(R$id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f4812a;
            }
            return null;
        }
    }

    /* renamed from: e0.m0$d */
    public static class d extends e {

        /* renamed from: e */
        public final WindowInsetsAnimation f4825e;

        /* renamed from: e0.m0$d$a */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final b f4826a;

            /* renamed from: b */
            public List<C0933m0> f4827b;

            /* renamed from: c */
            public ArrayList<C0933m0> f4828c;

            /* renamed from: d */
            public final HashMap<WindowInsetsAnimation, C0933m0> f4829d;

            public a(C0888g c0888g) {
                super(c0888g.f4811b);
                this.f4829d = new HashMap<>();
                this.f4826a = c0888g;
            }

            /* renamed from: a */
            public final C0933m0 m2747a(WindowInsetsAnimation windowInsetsAnimation) {
                C0933m0 c0933m0 = this.f4829d.get(windowInsetsAnimation);
                if (c0933m0 != null) {
                    return c0933m0;
                }
                C0933m0 c0933m02 = new C0933m0(windowInsetsAnimation);
                this.f4829d.put(windowInsetsAnimation, c0933m02);
                return c0933m02;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f4826a;
                m2747a(windowInsetsAnimation);
                ((C0888g) bVar).f4668c.setTranslationY(0.0f);
                this.f4829d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f4826a;
                m2747a(windowInsetsAnimation);
                C0888g c0888g = (C0888g) bVar;
                View view = c0888g.f4668c;
                int[] iArr = c0888g.f4671f;
                view.getLocationOnScreen(iArr);
                c0888g.f4669d = iArr[1];
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C0933m0> arrayList = this.f4828c;
                if (arrayList == null) {
                    ArrayList<C0933m0> arrayList2 = new ArrayList<>(list.size());
                    this.f4828c = arrayList2;
                    this.f4827b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        b bVar = this.f4826a;
                        C0935n0 m2749i = C0935n0.m2749i(null, windowInsets);
                        bVar.mo2593a(m2749i, this.f4827b);
                        return m2749i.m2756h();
                    }
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    C0933m0 m2747a = m2747a(windowInsetsAnimation);
                    fraction = windowInsetsAnimation.getFraction();
                    m2747a.f4807a.mo2746d(fraction);
                    this.f4828c.add(m2747a);
                }
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                b bVar = this.f4826a;
                m2747a(windowInsetsAnimation);
                a aVar = new a(bounds);
                C0888g c0888g = (C0888g) bVar;
                View view = c0888g.f4668c;
                int[] iArr = c0888g.f4671f;
                view.getLocationOnScreen(iArr);
                int i7 = c0888g.f4669d - iArr[1];
                c0888g.f4670e = i7;
                view.setTranslationY(i7);
                return d.m2742e(aVar);
            }
        }

        public d(int i7, DecelerateInterpolator decelerateInterpolator, long j7) {
            this(new WindowInsetsAnimation(i7, decelerateInterpolator, j7));
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f4825e = windowInsetsAnimation;
        }

        /* renamed from: e */
        public static WindowInsetsAnimation.Bounds m2742e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.f4808a.m5270d(), aVar.f4809b.m5270d());
        }

        @Override // p034e0.C0933m0.e
        /* renamed from: a */
        public final long mo2743a() {
            long durationMillis;
            durationMillis = this.f4825e.getDurationMillis();
            return durationMillis;
        }

        @Override // p034e0.C0933m0.e
        /* renamed from: b */
        public final float mo2744b() {
            float interpolatedFraction;
            interpolatedFraction = this.f4825e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // p034e0.C0933m0.e
        /* renamed from: c */
        public final int mo2745c() {
            int typeMask;
            typeMask = this.f4825e.getTypeMask();
            return typeMask;
        }

        @Override // p034e0.C0933m0.e
        /* renamed from: d */
        public final void mo2746d(float f7) {
            this.f4825e.setFraction(f7);
        }
    }

    /* renamed from: e0.m0$e */
    public static class e {

        /* renamed from: a */
        public final int f4830a;

        /* renamed from: b */
        public float f4831b;

        /* renamed from: c */
        public final Interpolator f4832c;

        /* renamed from: d */
        public final long f4833d;

        public e(int i7, DecelerateInterpolator decelerateInterpolator, long j7) {
            this.f4830a = i7;
            this.f4832c = decelerateInterpolator;
            this.f4833d = j7;
        }

        /* renamed from: a */
        public long mo2743a() {
            return this.f4833d;
        }

        /* renamed from: b */
        public float mo2744b() {
            Interpolator interpolator = this.f4832c;
            return interpolator != null ? interpolator.getInterpolation(this.f4831b) : this.f4831b;
        }

        /* renamed from: c */
        public int mo2745c() {
            return this.f4830a;
        }

        /* renamed from: d */
        public void mo2746d(float f7) {
            this.f4831b = f7;
        }
    }

    public C0933m0(int i7, DecelerateInterpolator decelerateInterpolator, long j7) {
        this.f4807a = Build.VERSION.SDK_INT >= 30 ? new d(i7, decelerateInterpolator, j7) : new c(i7, decelerateInterpolator, j7);
    }

    public C0933m0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4807a = new d(windowInsetsAnimation);
        }
    }
}
