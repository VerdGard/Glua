package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.C0143v;
import androidx.activity.result.AbstractC0136c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.C0771a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p004a3.C0034a;
import p053g3.AbstractC1216f;
import p053g3.C1213c;
import p053g3.C1214d;
import p053g3.C1215e;
import p053g3.C1218h;
import p053g3.InterfaceC1212b;
import p053g3.InterfaceC1217g;
import p181x.C2152a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC0444m implements InterfaceC1212b, RecyclerView.AbstractC0454w.b {

    /* renamed from: p */
    public int f3975p;

    /* renamed from: q */
    public int f3976q;

    /* renamed from: r */
    public int f3977r;

    /* renamed from: s */
    public final C0769b f3978s;

    /* renamed from: t */
    public AbstractC0136c f3979t;

    /* renamed from: u */
    public C0772b f3980u;

    /* renamed from: v */
    public C0771a f3981v;

    /* renamed from: w */
    public int f3982w;

    /* renamed from: x */
    public HashMap f3983x;

    /* renamed from: y */
    public AbstractC1216f f3984y;

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    public static final class C0768a {

        /* renamed from: a */
        public final View f3985a;

        /* renamed from: b */
        public final float f3986b;

        /* renamed from: c */
        public final float f3987c;

        /* renamed from: d */
        public final C0770c f3988d;

        public C0768a(View view, float f7, float f8, C0770c c0770c) {
            this.f3985a = view;
            this.f3986b = f7;
            this.f3987c = f8;
            this.f3988d = c0770c;
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    public static class C0769b extends RecyclerView.AbstractC0443l {

        /* renamed from: a */
        public final Paint f3989a;

        /* renamed from: b */
        public List<C0771a.b> f3990b;

        public C0769b() {
            Paint paint = new Paint();
            this.f3989a = paint;
            this.f3990b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0443l
        /* renamed from: e */
        public final void mo1606e(Canvas canvas, RecyclerView recyclerView) {
            float mo3429f;
            float f7;
            float mo3430g;
            float f8;
            Paint paint = this.f3989a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R$dimen.m3_carousel_debug_keyline_width));
            for (C0771a.b bVar : this.f3990b) {
                float f9 = bVar.f4006c;
                ThreadLocal<double[]> threadLocal = C2152a.f9762a;
                float f10 = 1.0f - f9;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f9) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * f9) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * f9) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * f9) + (Color.blue(-65281) * f10))));
                boolean m2343M0 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).m2343M0();
                float f11 = bVar.f4005b;
                if (m2343M0) {
                    float mo3432i = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3984y.mo3432i();
                    mo3430g = f11;
                    f7 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3984y.mo3427d();
                    f8 = mo3432i;
                    mo3429f = mo3430g;
                } else {
                    mo3429f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3984y.mo3429f();
                    f7 = f11;
                    mo3430g = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3984y.mo3430g();
                    f8 = f7;
                }
                canvas.drawLine(mo3429f, f8, mo3430g, f7, paint);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    public static class C0770c {

        /* renamed from: a */
        public final C0771a.b f3991a;

        /* renamed from: b */
        public final C0771a.b f3992b;

        public C0770c(C0771a.b bVar, C0771a.b bVar2) {
            if (!(bVar.f4004a <= bVar2.f4004a)) {
                throw new IllegalArgumentException();
            }
            this.f3991a = bVar;
            this.f3992b = bVar2;
        }
    }

    public CarouselLayoutManager() {
        C1218h c1218h = new C1218h();
        this.f3978s = new C0769b();
        this.f3982w = 0;
        this.f3979t = c1218h;
        this.f3980u = null;
        m1635m0();
        m2350T0(0);
    }

    /* renamed from: J0 */
    public static float m2332J0(float f7, C0770c c0770c) {
        C0771a.b bVar = c0770c.f3991a;
        float f8 = bVar.f4007d;
        C0771a.b bVar2 = c0770c.f3992b;
        return C0034a.m126a(f8, bVar2.f4007d, bVar.f4005b, bVar2.f4005b, f7);
    }

    /* renamed from: L0 */
    public static C0770c m2333L0(float f7, List list, boolean z6) {
        float f8 = Float.MAX_VALUE;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        float f11 = -3.4028235E38f;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C0771a.b bVar = (C0771a.b) list.get(i11);
            float f12 = z6 ? bVar.f4005b : bVar.f4004a;
            float abs = Math.abs(f12 - f7);
            if (f12 <= f7 && abs <= f8) {
                i7 = i11;
                f8 = abs;
            }
            if (f12 > f7 && abs <= f9) {
                i9 = i11;
                f9 = abs;
            }
            if (f12 <= f10) {
                i8 = i11;
                f10 = f12;
            }
            if (f12 > f11) {
                i10 = i11;
                f11 = f12;
            }
        }
        if (i7 == -1) {
            i7 = i8;
        }
        if (i9 == -1) {
            i9 = i10;
        }
        return new C0770c((C0771a.b) list.get(i7), (C0771a.b) list.get(i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: A */
    public final void mo1616A(View view, Rect rect) {
        super.mo1616A(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - m2332J0(centerX, m2333L0(centerX, this.f3981v.f3994b, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    /* renamed from: B0 */
    public final void m2334B0(View view, int i7, C0768a c0768a) {
        float f7 = this.f3981v.f3993a / 2.0f;
        m1627b(view, i7, false);
        float f8 = c0768a.f3987c;
        this.f3984y.mo3433j(view, (int) (f8 - f7), (int) (f8 + f7));
        m2351U0(view, c0768a.f3986b, c0768a.f3988d);
    }

    /* renamed from: C0 */
    public final int m2335C0(int i7, int i8) {
        return m2344N0() ? i7 - i8 : i7 + i8;
    }

    /* renamed from: D0 */
    public final void m2336D0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        int m2339G0 = m2339G0(i7);
        while (i7 < c0455x.m1679b()) {
            C0768a m2347Q0 = m2347Q0(c0450s, m2339G0, i7);
            float f7 = m2347Q0.f3987c;
            C0770c c0770c = m2347Q0.f3988d;
            if (m2345O0(f7, c0770c)) {
                return;
            }
            m2339G0 = m2335C0(m2339G0, (int) this.f3981v.f3993a);
            if (!m2346P0(f7, c0770c)) {
                m2334B0(m2347Q0.f3985a, -1, m2347Q0);
            }
            i7++;
        }
    }

    /* renamed from: E0 */
    public final void m2337E0(int i7, RecyclerView.C0450s c0450s) {
        int m2339G0 = m2339G0(i7);
        while (i7 >= 0) {
            C0768a m2347Q0 = m2347Q0(c0450s, m2339G0, i7);
            float f7 = m2347Q0.f3987c;
            C0770c c0770c = m2347Q0.f3988d;
            if (m2346P0(f7, c0770c)) {
                return;
            }
            int i8 = (int) this.f3981v.f3993a;
            m2339G0 = m2344N0() ? m2339G0 + i8 : m2339G0 - i8;
            if (!m2345O0(f7, c0770c)) {
                m2334B0(m2347Q0.f3985a, 0, m2347Q0);
            }
            i7--;
        }
    }

    /* renamed from: F0 */
    public final float m2338F0(View view, float f7, C0770c c0770c) {
        C0771a.b bVar = c0770c.f3991a;
        float f8 = bVar.f4005b;
        C0771a.b bVar2 = c0770c.f3992b;
        float m126a = C0034a.m126a(f8, bVar2.f4005b, bVar.f4004a, bVar2.f4004a, f7);
        if (bVar2 != this.f3981v.m2354b()) {
            if (c0770c.f3991a != this.f3981v.m2356d()) {
                return m126a;
            }
        }
        float mo3425b = this.f3984y.mo3425b((RecyclerView.C0445n) view.getLayoutParams()) / this.f3981v.f3993a;
        return m126a + (((1.0f - bVar2.f4006c) + mo3425b) * (f7 - bVar2.f4004a));
    }

    /* renamed from: G0 */
    public final int m2339G0(int i7) {
        return m2335C0(this.f3984y.mo3431h() - this.f3975p, (int) (this.f3981v.f3993a * i7));
    }

    /* renamed from: H0 */
    public final void m2340H0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        while (m1643w() > 0) {
            View m1641v = m1641v(0);
            Rect rect = new Rect();
            super.mo1616A(m1641v, rect);
            float centerX = rect.centerX();
            if (!m2346P0(centerX, m2333L0(centerX, this.f3981v.f3994b, true))) {
                break;
            } else {
                m1632j0(m1641v, c0450s);
            }
        }
        while (m1643w() - 1 >= 0) {
            View m1641v2 = m1641v(m1643w() - 1);
            Rect rect2 = new Rect();
            super.mo1616A(m1641v2, rect2);
            float centerX2 = rect2.centerX();
            if (!m2345O0(centerX2, m2333L0(centerX2, this.f3981v.f3994b, true))) {
                break;
            } else {
                m1632j0(m1641v2, c0450s);
            }
        }
        if (m1643w() == 0) {
            m2337E0(this.f3982w - 1, c0450s);
            m2336D0(this.f3982w, c0450s, c0455x);
        } else {
            int m1609J = RecyclerView.AbstractC0444m.m1609J(m1641v(0));
            int m1609J2 = RecyclerView.AbstractC0444m.m1609J(m1641v(m1643w() - 1));
            m2337E0(m1609J - 1, c0450s);
            m2336D0(m1609J2 + 1, c0450s, c0455x);
        }
    }

    /* renamed from: I0 */
    public final C0771a m2341I0(int i7) {
        C0771a c0771a;
        HashMap hashMap = this.f3983x;
        return (hashMap == null || (c0771a = (C0771a) hashMap.get(Integer.valueOf(C0143v.m460r(i7, 0, Math.max(0, m1617D() + (-1)))))) == null) ? this.f3980u.f4008a : c0771a;
    }

    /* renamed from: K0 */
    public final int m2342K0(int i7, C0771a c0771a) {
        if (!m2344N0()) {
            return (int) ((c0771a.f3993a / 2.0f) + ((i7 * c0771a.f3993a) - c0771a.m2353a().f4004a));
        }
        float f7 = (m2343M0() ? this.f2221n : this.f2222o) - c0771a.m2355c().f4004a;
        float f8 = c0771a.f3993a;
        return (int) ((f7 - (i7 * f8)) - (f8 / 2.0f));
    }

    /* renamed from: M0 */
    public final boolean m2343M0() {
        return this.f3984y.f5963a == 0;
    }

    /* renamed from: N0 */
    public final boolean m2344N0() {
        return m2343M0() && m1618E() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2345O0(float r2, com.google.android.material.carousel.CarouselLayoutManager.C0770c r3) {
        /*
            r1 = this;
            float r3 = m2332J0(r2, r3)
            int r2 = (int) r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            int r3 = (int) r3
            boolean r0 = r1.m2344N0()
            if (r0 == 0) goto L11
            int r2 = r2 + r3
            goto L12
        L11:
            int r2 = r2 - r3
        L12:
            boolean r3 = r1.m2344N0()
            if (r3 == 0) goto L1b
            if (r2 >= 0) goto L2a
            goto L28
        L1b:
            boolean r3 = r1.m2343M0()
            if (r3 == 0) goto L24
            int r3 = r1.f2221n
            goto L26
        L24:
            int r3 = r1.f2222o
        L26:
            if (r2 <= r3) goto L2a
        L28:
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.m2345O0(float, com.google.android.material.carousel.CarouselLayoutManager$c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2346P0(float r2, com.google.android.material.carousel.CarouselLayoutManager.C0770c r3) {
        /*
            r1 = this;
            float r3 = m2332J0(r2, r3)
            int r2 = (int) r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            int r3 = (int) r3
            int r2 = r1.m2335C0(r2, r3)
            boolean r3 = r1.m2344N0()
            if (r3 == 0) goto L21
            boolean r3 = r1.m2343M0()
            if (r3 == 0) goto L1c
            int r3 = r1.f2221n
            goto L1e
        L1c:
            int r3 = r1.f2222o
        L1e:
            if (r2 <= r3) goto L25
            goto L23
        L21:
            if (r2 >= 0) goto L25
        L23:
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.m2346P0(float, com.google.android.material.carousel.CarouselLayoutManager$c):boolean");
    }

    /* renamed from: Q0 */
    public final C0768a m2347Q0(RecyclerView.C0450s c0450s, float f7, int i7) {
        float f8 = this.f3981v.f3993a / 2.0f;
        View m1663d = c0450s.m1663d(i7);
        m2348R0(m1663d);
        float m2335C0 = m2335C0((int) f7, (int) f8);
        C0770c m2333L0 = m2333L0(m2335C0, this.f3981v.f3994b, false);
        return new C0768a(m1663d, m2335C0, m2338F0(m1663d, m2335C0, m2333L0), m2333L0);
    }

    /* renamed from: R0 */
    public final void m2348R0(View view) {
        if (!(view instanceof InterfaceC1217g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        Rect rect = new Rect();
        m1628d(view, rect);
        int i7 = rect.left + rect.right + 0;
        int i8 = rect.top + rect.bottom + 0;
        C0772b c0772b = this.f3980u;
        view.measure(RecyclerView.AbstractC0444m.m1614x(m2343M0(), this.f2221n, this.f2219l, m1621H() + m1620G() + ((ViewGroup.MarginLayoutParams) c0445n).leftMargin + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin + i7, (int) ((c0772b == null || this.f3984y.f5963a != 0) ? ((ViewGroup.MarginLayoutParams) c0445n).width : c0772b.f4008a.f3993a)), RecyclerView.AbstractC0444m.m1614x(mo1496f(), this.f2222o, this.f2220m, m1619F() + m1622I() + ((ViewGroup.MarginLayoutParams) c0445n).topMargin + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin + i8, (int) ((c0772b == null || this.f3984y.f5963a != 1) ? ((ViewGroup.MarginLayoutParams) c0445n).height : c0772b.f4008a.f3993a)));
    }

    /* renamed from: S0 */
    public final int m2349S0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (m1643w() == 0 || i7 == 0) {
            return 0;
        }
        int i8 = this.f3975p;
        int i9 = this.f3976q;
        int i10 = this.f3977r;
        int i11 = i8 + i7;
        if (i11 < i9) {
            i7 = i9 - i8;
        } else if (i11 > i10) {
            i7 = i10 - i8;
        }
        this.f3975p = i8 + i7;
        m2352V0();
        float f7 = this.f3981v.f3993a / 2.0f;
        int m2339G0 = m2339G0(RecyclerView.AbstractC0444m.m1609J(m1641v(0)));
        Rect rect = new Rect();
        for (int i12 = 0; i12 < m1643w(); i12++) {
            View m1641v = m1641v(i12);
            float m2335C0 = m2335C0(m2339G0, (int) f7);
            C0770c m2333L0 = m2333L0(m2335C0, this.f3981v.f3994b, false);
            float m2338F0 = m2338F0(m1641v, m2335C0, m2333L0);
            super.mo1616A(m1641v, rect);
            m2351U0(m1641v, m2335C0, m2333L0);
            this.f3984y.mo3435l(f7, m2338F0, rect, m1641v);
            m2339G0 = m2335C0(m2339G0, (int) this.f3981v.f3993a);
        }
        m2340H0(c0450s, c0455x);
        return i7;
    }

    /* renamed from: T0 */
    public final void m2350T0(int i7) {
        AbstractC1216f c1215e;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(C0090b.m219e("invalid orientation:", i7));
        }
        mo1491c(null);
        AbstractC1216f abstractC1216f = this.f3984y;
        if (abstractC1216f == null || i7 != abstractC1216f.f5963a) {
            if (i7 == 0) {
                c1215e = new C1215e(this);
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1215e = new C1214d(this);
            }
            this.f3984y = c1215e;
            this.f3980u = null;
            m1635m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: U */
    public final void mo1483U(AccessibilityEvent accessibilityEvent) {
        super.mo1483U(accessibilityEvent);
        if (m1643w() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.AbstractC0444m.m1609J(m1641v(0)));
            accessibilityEvent.setToIndex(RecyclerView.AbstractC0444m.m1609J(m1641v(m1643w() - 1)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U0 */
    public final void m2351U0(View view, float f7, C0770c c0770c) {
        if (view instanceof InterfaceC1217g) {
            C0771a.b bVar = c0770c.f3991a;
            float f8 = bVar.f4006c;
            C0771a.b bVar2 = c0770c.f3992b;
            float m126a = C0034a.m126a(f8, bVar2.f4006c, bVar.f4004a, bVar2.f4004a, f7);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF mo3426c = this.f3984y.mo3426c(height, width, C0034a.m126a(0.0f, height / 2.0f, 0.0f, 1.0f, m126a), C0034a.m126a(0.0f, width / 2.0f, 0.0f, 1.0f, m126a));
            float m2338F0 = m2338F0(view, f7, c0770c);
            RectF rectF = new RectF(m2338F0 - (mo3426c.width() / 2.0f), m2338F0 - (mo3426c.height() / 2.0f), (mo3426c.width() / 2.0f) + m2338F0, (mo3426c.height() / 2.0f) + m2338F0);
            RectF rectF2 = new RectF(this.f3984y.mo3429f(), this.f3984y.mo3432i(), this.f3984y.mo3430g(), this.f3984y.mo3427d());
            this.f3979t.getClass();
            this.f3984y.mo3424a(mo3426c, rectF, rectF2);
            this.f3984y.mo3434k(mo3426c, rectF, rectF2);
            ((InterfaceC1217g) view).m3436a();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* renamed from: V0 */
    public final void m2352V0() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.m2352V0():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0454w.b
    /* renamed from: a */
    public final PointF mo1488a(int i7) {
        if (this.f3980u == null) {
            return null;
        }
        int m2342K0 = m2342K0(i7, m2341I0(i7)) - this.f3975p;
        return m2343M0() ? new PointF(m2342K0, 0.0f) : new PointF(0.0f, m2342K0);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c0 */
    public final void mo1439c0(androidx.recyclerview.widget.RecyclerView.C0450s r25, androidx.recyclerview.widget.RecyclerView.C0455x r26) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo1439c0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: d0 */
    public final void mo1441d0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            this.f3982w = 0;
        } else {
            this.f3982w = RecyclerView.AbstractC0444m.m1609J(m1641v(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: e */
    public final boolean mo1493e() {
        return m2343M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: f */
    public final boolean mo1496f() {
        return !m2343M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: k */
    public final int mo1501k(RecyclerView.C0455x c0455x) {
        return (int) this.f3980u.f4008a.f3993a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: l */
    public final int mo1448l(RecyclerView.C0455x c0455x) {
        return this.f3975p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: l0 */
    public final boolean mo1634l0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
        if (this.f3980u == null) {
            return false;
        }
        int m2342K0 = m2342K0(RecyclerView.AbstractC0444m.m1609J(view), m2341I0(RecyclerView.AbstractC0444m.m1609J(view))) - this.f3975p;
        if (z7 || m2342K0 == 0) {
            return false;
        }
        recyclerView.scrollBy(m2342K0, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: m */
    public final int mo1450m(RecyclerView.C0455x c0455x) {
        return this.f3977r - this.f3976q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n */
    public final int mo1502n(RecyclerView.C0455x c0455x) {
        return (int) this.f3980u.f4008a.f3993a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n0 */
    public final int mo1452n0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (m2343M0()) {
            return m2349S0(i7, c0450s, c0455x);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o */
    public final int mo1454o(RecyclerView.C0455x c0455x) {
        return this.f3975p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o0 */
    public final void mo1503o0(int i7) {
        if (this.f3980u == null) {
            return;
        }
        this.f3975p = m2342K0(i7, m2341I0(i7));
        this.f3982w = C0143v.m460r(i7, 0, Math.max(0, m1617D() - 1));
        m2352V0();
        m1635m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p */
    public final int mo1455p(RecyclerView.C0455x c0455x) {
        return this.f3977r - this.f3976q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p0 */
    public final int mo1456p0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (mo1496f()) {
            return m2349S0(i7, c0450s, c0455x);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s */
    public final RecyclerView.C0445n mo1457s() {
        return new RecyclerView.C0445n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: y0 */
    public final void mo1506y0(RecyclerView recyclerView, int i7) {
        C1213c c1213c = new C1213c(this, recyclerView.getContext());
        c1213c.f2249a = i7;
        m1645z0(c1213c);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f3978s = new C0769b();
        this.f3982w = 0;
        m2350T0(RecyclerView.AbstractC0444m.m1610K(context, attributeSet, i7, i8).f2225a);
        this.f3979t = new C1218h();
        this.f3980u = null;
        m1635m0();
    }
}
