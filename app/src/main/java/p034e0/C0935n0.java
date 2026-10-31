package p034e0;

import android.annotation.SuppressLint;
import android.ext.C0090b;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p026d0.C0874b;
import p034e0.C0914d;
import p034e0.C0946x;
import p181x.C2153b;

/* renamed from: e0.n0 */
/* loaded from: classes.dex */
public final class C0935n0 {

    /* renamed from: b */
    public static final C0935n0 f4834b;

    /* renamed from: a */
    public final k f4835a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: e0.n0$a */
    public static class a {

        /* renamed from: a */
        public static final Field f4836a;

        /* renamed from: b */
        public static final Field f4837b;

        /* renamed from: c */
        public static final Field f4838c;

        /* renamed from: d */
        public static final boolean f4839d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4836a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4837b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4838c = declaredField3;
                declaredField3.setAccessible(true);
                f4839d = true;
            } catch (ReflectiveOperationException e7) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
            }
        }
    }

    /* renamed from: e0.n0$b */
    public static class b extends e {

        /* renamed from: e */
        public static Field f4840e = null;

        /* renamed from: f */
        public static boolean f4841f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f4842g = null;

        /* renamed from: h */
        public static boolean f4843h = false;

        /* renamed from: c */
        public WindowInsets f4844c;

        /* renamed from: d */
        public C2153b f4845d;

        public b() {
            this.f4844c = m2757i();
        }

        public b(C0935n0 c0935n0) {
            super(c0935n0);
            this.f4844c = c0935n0.m2756h();
        }

        /* renamed from: i */
        private static WindowInsets m2757i() {
            if (!f4841f) {
                try {
                    f4840e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f4841f = true;
            }
            Field field = f4840e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f4843h) {
                try {
                    f4842g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f4843h = true;
            }
            Constructor<WindowInsets> constructor = f4842g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: b */
        public C0935n0 mo2758b() {
            m2765a();
            C0935n0 m2749i = C0935n0.m2749i(null, this.f4844c);
            C2153b[] c2153bArr = this.f4848b;
            k kVar = m2749i.f4835a;
            kVar.mo2775o(c2153bArr);
            kVar.mo2783q(this.f4845d);
            return m2749i;
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: e */
        public void mo2759e(C2153b c2153b) {
            this.f4845d = c2153b;
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: g */
        public void mo2760g(C2153b c2153b) {
            WindowInsets windowInsets = this.f4844c;
            if (windowInsets != null) {
                this.f4844c = windowInsets.replaceSystemWindowInsets(c2153b.f9764a, c2153b.f9765b, c2153b.f9766c, c2153b.f9767d);
            }
        }
    }

    /* renamed from: e0.n0$c */
    public static class c extends e {

        /* renamed from: c */
        public final WindowInsets.Builder f4846c;

        public c() {
            this.f4846c = new WindowInsets.Builder();
        }

        public c(C0935n0 c0935n0) {
            super(c0935n0);
            WindowInsets m2756h = c0935n0.m2756h();
            this.f4846c = m2756h != null ? new WindowInsets.Builder(m2756h) : new WindowInsets.Builder();
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: b */
        public C0935n0 mo2758b() {
            WindowInsets build;
            m2765a();
            build = this.f4846c.build();
            C0935n0 m2749i = C0935n0.m2749i(null, build);
            m2749i.f4835a.mo2775o(this.f4848b);
            return m2749i;
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: d */
        public void mo2761d(C2153b c2153b) {
            this.f4846c.setMandatorySystemGestureInsets(c2153b.m5270d());
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: e */
        public void mo2759e(C2153b c2153b) {
            this.f4846c.setStableInsets(c2153b.m5270d());
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: f */
        public void mo2762f(C2153b c2153b) {
            this.f4846c.setSystemGestureInsets(c2153b.m5270d());
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: g */
        public void mo2760g(C2153b c2153b) {
            this.f4846c.setSystemWindowInsets(c2153b.m5270d());
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: h */
        public void mo2763h(C2153b c2153b) {
            this.f4846c.setTappableElementInsets(c2153b.m5270d());
        }
    }

    /* renamed from: e0.n0$d */
    public static class d extends c {
        public d() {
        }

        public d(C0935n0 c0935n0) {
            super(c0935n0);
        }

        @Override // p034e0.C0935n0.e
        /* renamed from: c */
        public void mo2764c(int i7, C2153b c2153b) {
            this.f4846c.setInsets(m.m2790a(i7), c2153b.m5270d());
        }
    }

    /* renamed from: e0.n0$e */
    public static class e {

        /* renamed from: a */
        public final C0935n0 f4847a;

        /* renamed from: b */
        public C2153b[] f4848b;

        public e() {
            this(new C0935n0());
        }

        public e(C0935n0 c0935n0) {
            this.f4847a = c0935n0;
        }

        /* renamed from: a */
        public final void m2765a() {
            C2153b[] c2153bArr = this.f4848b;
            if (c2153bArr != null) {
                C2153b c2153b = c2153bArr[l.m2789a(1)];
                C2153b c2153b2 = this.f4848b[l.m2789a(2)];
                C0935n0 c0935n0 = this.f4847a;
                if (c2153b2 == null) {
                    c2153b2 = c0935n0.m2750a(2);
                }
                if (c2153b == null) {
                    c2153b = c0935n0.m2750a(1);
                }
                mo2760g(C2153b.m5267a(c2153b, c2153b2));
                C2153b c2153b3 = this.f4848b[l.m2789a(16)];
                if (c2153b3 != null) {
                    mo2762f(c2153b3);
                }
                C2153b c2153b4 = this.f4848b[l.m2789a(32)];
                if (c2153b4 != null) {
                    mo2761d(c2153b4);
                }
                C2153b c2153b5 = this.f4848b[l.m2789a(64)];
                if (c2153b5 != null) {
                    mo2763h(c2153b5);
                }
            }
        }

        /* renamed from: b */
        public C0935n0 mo2758b() {
            throw null;
        }

        /* renamed from: c */
        public void mo2764c(int i7, C2153b c2153b) {
            if (this.f4848b == null) {
                this.f4848b = new C2153b[9];
            }
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    this.f4848b[l.m2789a(i8)] = c2153b;
                }
            }
        }

        /* renamed from: d */
        public void mo2761d(C2153b c2153b) {
        }

        /* renamed from: e */
        public void mo2759e(C2153b c2153b) {
            throw null;
        }

        /* renamed from: f */
        public void mo2762f(C2153b c2153b) {
        }

        /* renamed from: g */
        public void mo2760g(C2153b c2153b) {
            throw null;
        }

        /* renamed from: h */
        public void mo2763h(C2153b c2153b) {
        }
    }

    /* renamed from: e0.n0$f */
    public static class f extends k {

        /* renamed from: h */
        public static boolean f4849h = false;

        /* renamed from: i */
        public static Method f4850i;

        /* renamed from: j */
        public static Class<?> f4851j;

        /* renamed from: k */
        public static Field f4852k;

        /* renamed from: l */
        public static Field f4853l;

        /* renamed from: c */
        public final WindowInsets f4854c;

        /* renamed from: d */
        public C2153b[] f4855d;

        /* renamed from: e */
        public C2153b f4856e;

        /* renamed from: f */
        public C0935n0 f4857f;

        /* renamed from: g */
        public C2153b f4858g;

        public f(C0935n0 c0935n0, WindowInsets windowInsets) {
            super(c0935n0);
            this.f4856e = null;
            this.f4854c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: r */
        private C2153b m2766r(int i7, boolean z6) {
            C2153b c2153b = C2153b.f9763e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    c2153b = C2153b.m5267a(c2153b, m2777s(i8, z6));
                }
            }
            return c2153b;
        }

        /* renamed from: t */
        private C2153b m2767t() {
            C0935n0 c0935n0 = this.f4857f;
            return c0935n0 != null ? c0935n0.f4835a.mo2781h() : C2153b.f9763e;
        }

        /* renamed from: u */
        private C2153b m2768u(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f4849h) {
                m2769v();
            }
            Method method = f4850i;
            if (method != null && f4851j != null && f4852k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f4852k.get(f4853l.get(invoke));
                    if (rect != null) {
                        return C2153b.m5268b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: v */
        private static void m2769v() {
            try {
                f4850i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4851j = cls;
                f4852k = cls.getDeclaredField("mVisibleInsets");
                f4853l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f4852k.setAccessible(true);
                f4853l.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f4849h = true;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: d */
        public void mo2770d(View view) {
            C2153b m2768u = m2768u(view);
            if (m2768u == null) {
                m2768u = C2153b.f9763e;
            }
            m2778w(m2768u);
        }

        @Override // p034e0.C0935n0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f4858g, ((f) obj).f4858g);
            }
            return false;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: f */
        public C2153b mo2771f(int i7) {
            return m2766r(i7, false);
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: j */
        public final C2153b mo2772j() {
            if (this.f4856e == null) {
                WindowInsets windowInsets = this.f4854c;
                this.f4856e = C2153b.m5268b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f4856e;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: l */
        public C0935n0 mo2773l(int i7, int i8, int i9, int i10) {
            C0935n0 m2749i = C0935n0.m2749i(null, this.f4854c);
            int i11 = Build.VERSION.SDK_INT;
            e dVar = i11 >= 30 ? new d(m2749i) : i11 >= 29 ? new c(m2749i) : new b(m2749i);
            dVar.mo2760g(C0935n0.m2748f(mo2772j(), i7, i8, i9, i10));
            dVar.mo2759e(C0935n0.m2748f(mo2781h(), i7, i8, i9, i10));
            return dVar.mo2758b();
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: n */
        public boolean mo2774n() {
            return this.f4854c.isRound();
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: o */
        public void mo2775o(C2153b[] c2153bArr) {
            this.f4855d = c2153bArr;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: p */
        public void mo2776p(C0935n0 c0935n0) {
            this.f4857f = c0935n0;
        }

        /* renamed from: s */
        public C2153b m2777s(int i7, boolean z6) {
            C2153b mo2781h;
            int i8;
            if (i7 == 1) {
                return z6 ? C2153b.m5268b(0, Math.max(m2767t().f9765b, mo2772j().f9765b), 0, 0) : C2153b.m5268b(0, mo2772j().f9765b, 0, 0);
            }
            if (i7 == 2) {
                if (z6) {
                    C2153b m2767t = m2767t();
                    C2153b mo2781h2 = mo2781h();
                    return C2153b.m5268b(Math.max(m2767t.f9764a, mo2781h2.f9764a), 0, Math.max(m2767t.f9766c, mo2781h2.f9766c), Math.max(m2767t.f9767d, mo2781h2.f9767d));
                }
                C2153b mo2772j = mo2772j();
                C0935n0 c0935n0 = this.f4857f;
                mo2781h = c0935n0 != null ? c0935n0.f4835a.mo2781h() : null;
                int i9 = mo2772j.f9767d;
                if (mo2781h != null) {
                    i9 = Math.min(i9, mo2781h.f9767d);
                }
                return C2153b.m5268b(mo2772j.f9764a, 0, mo2772j.f9766c, i9);
            }
            C2153b c2153b = C2153b.f9763e;
            if (i7 == 8) {
                C2153b[] c2153bArr = this.f4855d;
                mo2781h = c2153bArr != null ? c2153bArr[l.m2789a(8)] : null;
                if (mo2781h != null) {
                    return mo2781h;
                }
                C2153b mo2772j2 = mo2772j();
                C2153b m2767t2 = m2767t();
                int i10 = mo2772j2.f9767d;
                if (i10 > m2767t2.f9767d) {
                    return C2153b.m5268b(0, 0, 0, i10);
                }
                C2153b c2153b2 = this.f4858g;
                return (c2153b2 == null || c2153b2.equals(c2153b) || (i8 = this.f4858g.f9767d) <= m2767t2.f9767d) ? c2153b : C2153b.m5268b(0, 0, 0, i8);
            }
            if (i7 == 16) {
                return mo2787i();
            }
            if (i7 == 32) {
                return mo2786g();
            }
            if (i7 == 64) {
                return mo2788k();
            }
            if (i7 != 128) {
                return c2153b;
            }
            C0935n0 c0935n02 = this.f4857f;
            C0914d mo2785e = c0935n02 != null ? c0935n02.f4835a.mo2785e() : mo2785e();
            if (mo2785e == null) {
                return c2153b;
            }
            int i11 = Build.VERSION.SDK_INT;
            DisplayCutout displayCutout = mo2785e.f4792a;
            return C2153b.m5268b(i11 >= 28 ? C0914d.a.m2677d(displayCutout) : 0, i11 >= 28 ? C0914d.a.m2679f(displayCutout) : 0, i11 >= 28 ? C0914d.a.m2678e(displayCutout) : 0, i11 >= 28 ? C0914d.a.m2676c(displayCutout) : 0);
        }

        /* renamed from: w */
        public void m2778w(C2153b c2153b) {
            this.f4858g = c2153b;
        }
    }

    /* renamed from: e0.n0$g */
    public static class g extends f {

        /* renamed from: m */
        public C2153b f4859m;

        public g(C0935n0 c0935n0, WindowInsets windowInsets) {
            super(c0935n0, windowInsets);
            this.f4859m = null;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: b */
        public C0935n0 mo2779b() {
            return C0935n0.m2749i(null, this.f4854c.consumeStableInsets());
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: c */
        public C0935n0 mo2780c() {
            return C0935n0.m2749i(null, this.f4854c.consumeSystemWindowInsets());
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: h */
        public final C2153b mo2781h() {
            if (this.f4859m == null) {
                WindowInsets windowInsets = this.f4854c;
                this.f4859m = C2153b.m5268b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f4859m;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: m */
        public boolean mo2782m() {
            return this.f4854c.isConsumed();
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: q */
        public void mo2783q(C2153b c2153b) {
            this.f4859m = c2153b;
        }
    }

    /* renamed from: e0.n0$h */
    public static class h extends g {
        public h(C0935n0 c0935n0, WindowInsets windowInsets) {
            super(c0935n0, windowInsets);
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: a */
        public C0935n0 mo2784a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f4854c.consumeDisplayCutout();
            return C0935n0.m2749i(null, consumeDisplayCutout);
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: e */
        public C0914d mo2785e() {
            DisplayCutout displayCutout;
            displayCutout = this.f4854c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0914d(displayCutout);
        }

        @Override // p034e0.C0935n0.f, p034e0.C0935n0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f4854c, hVar.f4854c) && Objects.equals(this.f4858g, hVar.f4858g);
        }

        @Override // p034e0.C0935n0.k
        public int hashCode() {
            return this.f4854c.hashCode();
        }
    }

    /* renamed from: e0.n0$i */
    public static class i extends h {

        /* renamed from: n */
        public C2153b f4860n;

        /* renamed from: o */
        public C2153b f4861o;

        /* renamed from: p */
        public C2153b f4862p;

        public i(C0935n0 c0935n0, WindowInsets windowInsets) {
            super(c0935n0, windowInsets);
            this.f4860n = null;
            this.f4861o = null;
            this.f4862p = null;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: g */
        public C2153b mo2786g() {
            Insets mandatorySystemGestureInsets;
            if (this.f4861o == null) {
                mandatorySystemGestureInsets = this.f4854c.getMandatorySystemGestureInsets();
                this.f4861o = C2153b.m5269c(mandatorySystemGestureInsets);
            }
            return this.f4861o;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: i */
        public C2153b mo2787i() {
            Insets systemGestureInsets;
            if (this.f4860n == null) {
                systemGestureInsets = this.f4854c.getSystemGestureInsets();
                this.f4860n = C2153b.m5269c(systemGestureInsets);
            }
            return this.f4860n;
        }

        @Override // p034e0.C0935n0.k
        /* renamed from: k */
        public C2153b mo2788k() {
            Insets tappableElementInsets;
            if (this.f4862p == null) {
                tappableElementInsets = this.f4854c.getTappableElementInsets();
                this.f4862p = C2153b.m5269c(tappableElementInsets);
            }
            return this.f4862p;
        }

        @Override // p034e0.C0935n0.f, p034e0.C0935n0.k
        /* renamed from: l */
        public C0935n0 mo2773l(int i7, int i8, int i9, int i10) {
            WindowInsets inset;
            inset = this.f4854c.inset(i7, i8, i9, i10);
            return C0935n0.m2749i(null, inset);
        }

        @Override // p034e0.C0935n0.g, p034e0.C0935n0.k
        /* renamed from: q */
        public void mo2783q(C2153b c2153b) {
        }
    }

    /* renamed from: e0.n0$j */
    public static class j extends i {

        /* renamed from: q */
        public static final C0935n0 f4863q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f4863q = C0935n0.m2749i(null, windowInsets);
        }

        public j(C0935n0 c0935n0, WindowInsets windowInsets) {
            super(c0935n0, windowInsets);
        }

        @Override // p034e0.C0935n0.f, p034e0.C0935n0.k
        /* renamed from: d */
        public final void mo2770d(View view) {
        }

        @Override // p034e0.C0935n0.f, p034e0.C0935n0.k
        /* renamed from: f */
        public C2153b mo2771f(int i7) {
            Insets insets;
            insets = this.f4854c.getInsets(m.m2790a(i7));
            return C2153b.m5269c(insets);
        }
    }

    /* renamed from: e0.n0$k */
    public static class k {

        /* renamed from: b */
        public static final C0935n0 f4864b;

        /* renamed from: a */
        public final C0935n0 f4865a;

        static {
            int i7 = Build.VERSION.SDK_INT;
            f4864b = (i7 >= 30 ? new d() : i7 >= 29 ? new c() : new b()).mo2758b().f4835a.mo2784a().f4835a.mo2779b().f4835a.mo2780c();
        }

        public k(C0935n0 c0935n0) {
            this.f4865a = c0935n0;
        }

        /* renamed from: a */
        public C0935n0 mo2784a() {
            return this.f4865a;
        }

        /* renamed from: b */
        public C0935n0 mo2779b() {
            return this.f4865a;
        }

        /* renamed from: c */
        public C0935n0 mo2780c() {
            return this.f4865a;
        }

        /* renamed from: d */
        public void mo2770d(View view) {
        }

        /* renamed from: e */
        public C0914d mo2785e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return mo2774n() == kVar.mo2774n() && mo2782m() == kVar.mo2782m() && C0874b.m2562a(mo2772j(), kVar.mo2772j()) && C0874b.m2562a(mo2781h(), kVar.mo2781h()) && C0874b.m2562a(mo2785e(), kVar.mo2785e());
        }

        /* renamed from: f */
        public C2153b mo2771f(int i7) {
            return C2153b.f9763e;
        }

        /* renamed from: g */
        public C2153b mo2786g() {
            return mo2772j();
        }

        /* renamed from: h */
        public C2153b mo2781h() {
            return C2153b.f9763e;
        }

        public int hashCode() {
            return C0874b.m2563b(Boolean.valueOf(mo2774n()), Boolean.valueOf(mo2782m()), mo2772j(), mo2781h(), mo2785e());
        }

        /* renamed from: i */
        public C2153b mo2787i() {
            return mo2772j();
        }

        /* renamed from: j */
        public C2153b mo2772j() {
            return C2153b.f9763e;
        }

        /* renamed from: k */
        public C2153b mo2788k() {
            return mo2772j();
        }

        /* renamed from: l */
        public C0935n0 mo2773l(int i7, int i8, int i9, int i10) {
            return f4864b;
        }

        /* renamed from: m */
        public boolean mo2782m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo2774n() {
            return false;
        }

        /* renamed from: o */
        public void mo2775o(C2153b[] c2153bArr) {
        }

        /* renamed from: p */
        public void mo2776p(C0935n0 c0935n0) {
        }

        /* renamed from: q */
        public void mo2783q(C2153b c2153b) {
        }
    }

    /* renamed from: e0.n0$l */
    public static final class l {
        /* renamed from: a */
        public static int m2789a(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C0090b.m219e("type needs to be >= FIRST and <= LAST, type=", i7));
        }
    }

    /* renamed from: e0.n0$m */
    public static final class m {
        /* renamed from: a */
        public static int m2790a(int i7) {
            int statusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= statusBars;
                }
            }
            return i8;
        }
    }

    static {
        f4834b = Build.VERSION.SDK_INT >= 30 ? j.f4863q : k.f4864b;
    }

    public C0935n0() {
        this.f4835a = new k(this);
    }

    public C0935n0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        this.f4835a = i7 >= 30 ? new j(this, windowInsets) : i7 >= 29 ? new i(this, windowInsets) : i7 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    /* renamed from: f */
    public static C2153b m2748f(C2153b c2153b, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, c2153b.f9764a - i7);
        int max2 = Math.max(0, c2153b.f9765b - i8);
        int max3 = Math.max(0, c2153b.f9766c - i9);
        int max4 = Math.max(0, c2153b.f9767d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? c2153b : C2153b.m5268b(max, max2, max3, max4);
    }

    /* renamed from: i */
    public static C0935n0 m2749i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0935n0 c0935n0 = new C0935n0(windowInsets);
        if (view != null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.g.m2859b(view)) {
                C0935n0 m2808i = C0946x.m2808i(view);
                k kVar = c0935n0.f4835a;
                kVar.mo2776p(m2808i);
                kVar.mo2770d(view.getRootView());
            }
        }
        return c0935n0;
    }

    /* renamed from: a */
    public final C2153b m2750a(int i7) {
        return this.f4835a.mo2771f(i7);
    }

    @Deprecated
    /* renamed from: b */
    public final int m2751b() {
        return this.f4835a.mo2772j().f9767d;
    }

    @Deprecated
    /* renamed from: c */
    public final int m2752c() {
        return this.f4835a.mo2772j().f9764a;
    }

    @Deprecated
    /* renamed from: d */
    public final int m2753d() {
        return this.f4835a.mo2772j().f9766c;
    }

    @Deprecated
    /* renamed from: e */
    public final int m2754e() {
        return this.f4835a.mo2772j().f9765b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0935n0)) {
            return false;
        }
        return C0874b.m2562a(this.f4835a, ((C0935n0) obj).f4835a);
    }

    @Deprecated
    /* renamed from: g */
    public final C0935n0 m2755g(int i7, int i8, int i9, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        e dVar = i11 >= 30 ? new d(this) : i11 >= 29 ? new c(this) : new b(this);
        dVar.mo2760g(C2153b.m5268b(i7, i8, i9, i10));
        return dVar.mo2758b();
    }

    /* renamed from: h */
    public final WindowInsets m2756h() {
        k kVar = this.f4835a;
        if (kVar instanceof f) {
            return ((f) kVar).f4854c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f4835a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
