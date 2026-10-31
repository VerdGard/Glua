package p055g5;

import android.content.res.Resources;
import android.ext.C0090b;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import p002a1.C0017d;
import p006a5.C0056f;
import p006a5.C0057g;
import p006a5.InterfaceC0053c;
import p022c5.C0637a;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0651o;
import p022c5.InterfaceC0647k;
import p023c6.InterfaceC0673s;
import p071i5.C1371h0;
import p118o5.InterfaceC1673d;
import p132q4.AbstractC1784m;
import p132q4.C1789r;
import p132q4.C1795x;

/* renamed from: g5.r */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC1261r implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: C1 */
    public float f6218C1;

    /* renamed from: L1 */
    public final float f6227L1;

    /* renamed from: M1 */
    public int f6228M1;

    /* renamed from: N1 */
    public final int f6229N1;

    /* renamed from: O1 */
    public MotionEvent f6230O1;

    /* renamed from: P1 */
    public float f6231P1;

    /* renamed from: Q1 */
    public float f6232Q1;

    /* renamed from: R1 */
    public int f6233R1;

    /* renamed from: S1 */
    public long f6234S1;

    /* renamed from: T1 */
    public boolean f6235T1;

    /* renamed from: U1 */
    public PointF f6236U1;

    /* renamed from: V1 */
    public boolean f6237V1;

    /* renamed from: W1 */
    public boolean f6238W1;

    /* renamed from: X1 */
    public C0638b f6240X1;

    /* renamed from: Y */
    public boolean f6241Y;

    /* renamed from: Y1 */
    public long f6242Y1;

    /* renamed from: Z */
    public float f6243Z;

    /* renamed from: Z1 */
    public boolean f6244Z1;

    /* renamed from: a2 */
    public float f6245a2;

    /* renamed from: c */
    public final C1245b f6246c;

    /* renamed from: e */
    public final C1251h f6247e;

    /* renamed from: s */
    public final C1371h0 f6249s;

    /* renamed from: w1 */
    public float f6250w1;

    /* renamed from: x1 */
    public boolean f6251x1;

    /* renamed from: y1 */
    public boolean f6252y1;

    /* renamed from: X */
    public int f6239X = -1;

    /* renamed from: z1 */
    public boolean f6253z1 = false;

    /* renamed from: D1 */
    public long f6219D1 = 0;

    /* renamed from: E1 */
    public long f6220E1 = 0;

    /* renamed from: F1 */
    public boolean f6221F1 = false;

    /* renamed from: G1 */
    public boolean f6222G1 = false;

    /* renamed from: H1 */
    public float f6223H1 = 0.0f;

    /* renamed from: I1 */
    public float f6224I1 = 0.0f;

    /* renamed from: A1 */
    public final float f6216A1 = TypedValue.applyDimension(2, 26.0f, Resources.getSystem().getDisplayMetrics());

    /* renamed from: B1 */
    public final float f6217B1 = TypedValue.applyDimension(2, 8.0f, Resources.getSystem().getDisplayMetrics());

    /* renamed from: J1 */
    public b f6225J1 = new b(1);

    /* renamed from: K1 */
    public b f6226K1 = new b(2);

    /* renamed from: m */
    public final b f6248m = new b(0);

    /* renamed from: g5.r$a */
    public class a implements Runnable {

        /* renamed from: X */
        public float f6254X;

        /* renamed from: Y */
        public float f6255Y;

        /* renamed from: Z */
        public float f6256Z;

        /* renamed from: c */
        public final float f6257c;

        /* renamed from: e */
        public float f6258e;

        /* renamed from: m */
        public float f6259m;

        /* renamed from: s */
        public float f6260s;

        /* renamed from: w1 */
        public long f6261w1 = 0;

        public a(int i7) {
            float f7 = i7;
            this.f6259m = f7;
            this.f6258e = f7;
            this.f6257c = f7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f7;
            b bVar;
            GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = GestureDetectorOnGestureListenerC1261r.this;
            int i7 = gestureDetectorOnGestureListenerC1261r.f6228M1;
            float f8 = ((i7 & 1) != 0 ? -this.f6258e : 0.0f) + ((i7 & 2) != 0 ? this.f6258e : 0.0f);
            float f9 = ((i7 & 4) != 0 ? -this.f6259m : 0.0f) + ((i7 & 8) != 0 ? this.f6259m : 0.0f);
            C1245b c1245b = gestureDetectorOnGestureListenerC1261r.f6246c;
            if (f8 > 0.0f) {
                int i8 = gestureDetectorOnGestureListenerC1261r.f6239X;
                int i9 = (i8 == 0 || i8 == 1) ? c1245b.getCursor().f3166c.f3141b : c1245b.getCursor().f3167d.f3141b;
                if (gestureDetectorOnGestureListenerC1261r.f6247e.m3549b() > (c1245b.m3482Y() + c1245b.f5990C1.m3801b(i9, c1245b.getText().m2142n(i9))[1]) - (c1245b.getWidth() * 0.85f)) {
                    f8 = 0.0f;
                }
            }
            gestureDetectorOnGestureListenerC1261r.m3568g(f8, f9, false);
            C1371h0 c1371h0 = gestureDetectorOnGestureListenerC1261r.f6249s;
            if (c1371h0.f6661e.isShowing()) {
                c1371h0.m3728a();
            }
            boolean m3562a = GestureDetectorOnGestureListenerC1261r.m3562a(gestureDetectorOnGestureListenerC1261r, f8, this.f6260s);
            float f10 = this.f6257c;
            if (m3562a) {
                float f11 = this.f6255Y;
                f7 = f9;
                if (f11 < 32.0f && (this.f6261w1 & 1) == 0) {
                    this.f6255Y = f11 + 1.0f;
                    this.f6258e *= 1.06f;
                }
            } else {
                f7 = f9;
                this.f6258e = f10;
                this.f6255Y = 0.0f;
            }
            float f12 = f7;
            if (GestureDetectorOnGestureListenerC1261r.m3562a(gestureDetectorOnGestureListenerC1261r, f12, this.f6254X)) {
                float f13 = this.f6256Z;
                if (f13 < 32.0f && (this.f6261w1 & 1) == 0) {
                    this.f6256Z = f13 + 1.0f;
                    this.f6259m *= 1.06f;
                }
            } else {
                this.f6259m = f10;
                this.f6256Z = 0.0f;
            }
            this.f6260s = f8;
            this.f6254X = f12;
            MotionEvent motionEvent = gestureDetectorOnGestureListenerC1261r.f6230O1;
            if (motionEvent != null) {
                int i10 = gestureDetectorOnGestureListenerC1261r.f6239X;
                if (i10 == 0) {
                    bVar = gestureDetectorOnGestureListenerC1261r.f6248m;
                } else if (i10 == 1) {
                    bVar = gestureDetectorOnGestureListenerC1261r.f6225J1;
                } else if (i10 == 2) {
                    bVar = gestureDetectorOnGestureListenerC1261r.f6226K1;
                }
                bVar.m3571a(motionEvent);
            }
            this.f6261w1++;
            if (gestureDetectorOnGestureListenerC1261r.f6228M1 != 0) {
                c1245b.m3487d0(this, 10L);
            }
        }
    }

    /* renamed from: g5.r$b */
    public final class b {

        /* renamed from: a */
        public int f6263a;

        public b(int i7) {
            this.f6263a = i7;
        }

        /* renamed from: a */
        public final void m3571a(MotionEvent motionEvent) {
            int i7;
            int i8;
            int i9 = this.f6263a;
            GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = GestureDetectorOnGestureListenerC1261r.this;
            InterfaceC1673d.a leftHandleDescriptor = i9 == 1 ? gestureDetectorOnGestureListenerC1261r.f6246c.getLeftHandleDescriptor() : i9 == 2 ? gestureDetectorOnGestureListenerC1261r.f6246c.getRightHandleDescriptor() : gestureDetectorOnGestureListenerC1261r.f6246c.getInsertHandleDescriptor();
            InterfaceC1673d.a rightHandleDescriptor = this.f6263a == 1 ? gestureDetectorOnGestureListenerC1261r.f6246c.getRightHandleDescriptor() : gestureDetectorOnGestureListenerC1261r.f6246c.getLeftHandleDescriptor();
            C1251h c1251h = gestureDetectorOnGestureListenerC1261r.f6247e;
            C1245b c1245b = gestureDetectorOnGestureListenerC1261r.f6246c;
            float x7 = motionEvent.getX() + c1251h.m3549b();
            int i10 = leftHandleDescriptor.f7547b;
            RectF rectF = leftHandleDescriptor.f7546a;
            float width = ((i10 != 0 ? rectF.width() : 0.0f) * (leftHandleDescriptor.f7547b == 1 ? 1 : -1)) + x7;
            float y7 = (motionEvent.getY() + gestureDetectorOnGestureListenerC1261r.f6247e.m3550c()) - rectF.height();
            int m3469L = (int) (c1245b.m3469L(0.0f, y7) >> 32);
            if (m3469L < 0 || m3469L >= c1245b.getLineCount()) {
                return;
            }
            int m62A = C0017d.m62A(c1245b.m3469L(width, y7));
            int i11 = this.f6263a == 2 ? c1245b.getCursor().f3167d.f3141b : c1245b.getCursor().f3166c.f3141b;
            int i12 = this.f6263a == 2 ? c1245b.getCursor().f3167d.f3142c : c1245b.getCursor().f3166c.f3142c;
            int i13 = this.f6263a != 2 ? c1245b.getCursor().f3167d.f3141b : c1245b.getCursor().f3166c.f3141b;
            int i14 = this.f6263a != 2 ? c1245b.getCursor().f3167d.f3142c : c1245b.getCursor().f3166c.f3142c;
            if (m3469L == i11 && m62A == i12) {
                return;
            }
            int i15 = this.f6263a;
            if (i15 != 0 && m3469L == i13 && m62A == i14) {
                return;
            }
            if (i15 == 0) {
                c1245b.getClass();
                c1245b.f6011M2 = System.currentTimeMillis();
                c1245b.m3501l0(m3469L, m62A, 2, false);
                return;
            }
            if (i15 == 1) {
                if (i13 < m3469L || (i13 == m3469L && i14 < m62A)) {
                    if (!(!RectF.intersects(rectF, rightHandleDescriptor.f7546a))) {
                        return;
                    }
                    gestureDetectorOnGestureListenerC1261r.m3564c(gestureDetectorOnGestureListenerC1261r.f6239X, false);
                    gestureDetectorOnGestureListenerC1261r.f6239X = 2;
                    gestureDetectorOnGestureListenerC1261r.m3564c(2, true);
                    this.f6263a = 2;
                    b bVar = gestureDetectorOnGestureListenerC1261r.f6226K1;
                    bVar.f6263a = 1;
                    gestureDetectorOnGestureListenerC1261r.f6226K1 = gestureDetectorOnGestureListenerC1261r.f6225J1;
                    gestureDetectorOnGestureListenerC1261r.f6225J1 = bVar;
                    i8 = i13;
                    i7 = i14;
                    i14 = m62A;
                    i13 = m3469L;
                }
                i7 = m62A;
                i8 = m3469L;
            } else {
                if (i15 != 2) {
                    return;
                }
                if (i13 > m3469L || (i13 == m3469L && i14 > m62A)) {
                    if (!(!RectF.intersects(rectF, rightHandleDescriptor.f7546a))) {
                        return;
                    }
                    gestureDetectorOnGestureListenerC1261r.m3564c(gestureDetectorOnGestureListenerC1261r.f6239X, false);
                    gestureDetectorOnGestureListenerC1261r.f6239X = 1;
                    gestureDetectorOnGestureListenerC1261r.m3564c(1, true);
                    this.f6263a = 1;
                    b bVar2 = gestureDetectorOnGestureListenerC1261r.f6225J1;
                    bVar2.f6263a = 2;
                    b bVar3 = gestureDetectorOnGestureListenerC1261r.f6226K1;
                    gestureDetectorOnGestureListenerC1261r.f6226K1 = bVar2;
                    gestureDetectorOnGestureListenerC1261r.f6225J1 = bVar3;
                    i7 = m62A;
                    i8 = m3469L;
                }
                i8 = i13;
                i7 = i14;
                i14 = m62A;
                i13 = m3469L;
            }
            c1245b.m3505o0(i8, i7, i13, i14, false, 2);
        }
    }

    public GestureDetectorOnGestureListenerC1261r(C1245b c1245b) {
        this.f6246c = c1245b;
        this.f6227L1 = c1245b.getDpUnit() * 18.0f;
        this.f6247e = new C1251h(c1245b);
        this.f6249s = new C1371h0(c1245b);
        this.f6229N1 = ViewConfiguration.get(c1245b.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    public static boolean m3562a(GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r, float f7, float f8) {
        gestureDetectorOnGestureListenerC1261r.getClass();
        return ((double) Math.abs(f7)) >= 100000.0d && ((double) Math.abs(f8)) >= 100000.0d && ((f7 < 0.0f && f8 < 0.0f) || (f7 > 0.0f && f8 > 0.0f));
    }

    /* renamed from: b */
    public final int m3563b(InterfaceC0673s<C1245b, C0638b, MotionEvent, InterfaceC0053c, C0651o, AbstractC1784m> interfaceC0673s, C0638b c0638b, MotionEvent motionEvent) {
        C0651o c0651o;
        C0638b m2111q;
        C1245b c1245b = this.f6246c;
        if (c0638b == null) {
            long m3470M = c1245b.m3470M(motionEvent.getX(), motionEvent.getY());
            c0638b = ((C0637a) c1245b.getText().m2145q()).m2111q((int) (m3470M >> 32), C0017d.m62A(m3470M));
        }
        C0638b c0638b2 = c0638b;
        C0056f styles = c1245b.getStyles();
        C0641e text = c1245b.getText();
        InterfaceC0053c m169b = C0057g.m169b(styles, c0638b2, 0);
        InterfaceC0053c m169b2 = C0057g.m169b(styles, c0638b2, 1);
        if (m169b != null) {
            C0638b m2111q2 = ((C0637a) text.m2145q()).m2111q(c0638b2.f3141b, C0017d.m90o(m169b.mo166i(), text.m2142n(c0638b2.f3141b)));
            if (m169b2 != null) {
                m2111q = ((C0637a) text.m2145q()).m2111q(c0638b2.f3141b, C0017d.m90o(m169b2.mo166i(), text.m2142n(c0638b2.f3141b)));
            } else {
                InterfaceC0647k m2145q = text.m2145q();
                int i7 = c0638b2.f3141b;
                m2111q = ((C0637a) m2145q).m2111q(i7, text.m2142n(i7));
            }
            c0651o = new C0651o(m2111q2, m2111q);
        } else {
            c0651o = null;
        }
        C1245b c1245b2 = this.f6246c;
        return c1245b2.m3460C((AbstractC1784m) interfaceC0673s.mo215a(c1245b2, c0638b2, motionEvent, m169b, c0651o));
    }

    /* renamed from: c */
    public final void m3564c(int i7, boolean z6) {
        C1245b c1245b = this.f6246c;
        c1245b.f5988B1.m4244a(new C1789r(c1245b, i7, z6));
    }

    /* renamed from: d */
    public final boolean m3565d() {
        return this.f6239X != -1;
    }

    /* renamed from: e */
    public final void m3566e() {
        if (m3570i()) {
            this.f6220E1 = 0L;
            this.f6246c.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        if (java.lang.Math.sqrt(android.ext.C0091c.m227e(r13.getY(), r12.f6223H1, r13.getY() - r12.f6223H1, (r13.getX() - r12.f6224I1) * (r13.getX() - r12.f6224I1))) >= 4.0d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r0 != 3) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3567f(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.GestureDetectorOnGestureListenerC1261r.m3567f(android.view.MotionEvent):boolean");
    }

    /* renamed from: g */
    public final void m3568g(float f7, float f8, boolean z6) {
        C1251h c1251h = this.f6247e;
        int m3549b = c1251h.m3549b() + ((int) f7);
        int m3550c = c1251h.m3550c() + ((int) f8);
        int max = Math.max(m3549b, 0);
        int max2 = Math.max(m3550c, 0);
        C1245b c1245b = this.f6246c;
        int min = Math.min(max2, c1245b.getScrollMaxY());
        int min2 = Math.min(max, c1245b.getScrollMaxX());
        C1245b c1245b2 = this.f6246c;
        c1245b2.f5988B1.m4244a(new C1795x(c1245b2, c1251h.m3549b(), c1251h.m3550c(), min2, min, 1));
        OverScroller overScroller = c1251h.f6181b;
        if (z6) {
            overScroller.startScroll(c1251h.m3549b(), c1251h.m3550c(), min2 - c1251h.m3549b(), min - c1251h.m3550c());
            c1251h.m3551d();
        } else {
            c1251h.m3552e(c1251h.m3549b(), c1251h.m3550c(), min2 - c1251h.m3549b(), min - c1251h.m3550c());
            overScroller.abortAnimation();
            c1251h.m3551d();
        }
        c1245b.invalidate();
    }

    /* renamed from: h */
    public final void m3569h(MotionEvent motionEvent, float f7, float f8) {
        if (motionEvent != null) {
            f7 = motionEvent.getX();
            f8 = motionEvent.getY();
        }
        float f9 = this.f6227L1;
        int i7 = f7 < f9 ? 1 : 0;
        if (f8 < f9) {
            i7 |= 4;
        }
        C1245b c1245b = this.f6246c;
        if (f7 > c1245b.getWidth() - f9) {
            i7 |= 2;
        }
        if (f8 > c1245b.getHeight() - f9) {
            i7 |= 8;
        }
        if (i7 == 0) {
            this.f6228M1 = 0;
            return;
        }
        int i8 = this.f6228M1;
        this.f6228M1 = i7;
        this.f6230O1 = motionEvent == null ? null : MotionEvent.obtain(motionEvent);
        if (i8 == 0) {
            c1245b.m3489e0(new a((int) (c1245b.getDpUnit() * 8.0f)));
        }
    }

    /* renamed from: i */
    public final boolean m3570i() {
        if (System.currentTimeMillis() - this.f6220E1 >= 3500) {
            return this.f6239X == 0;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C1245b c1245b = this.f6246c;
        c1245b.m3477T();
        long m3470M = c1245b.m3470M(motionEvent.getX(), motionEvent.getY());
        int i7 = (int) (m3470M >> 32);
        int m62A = C0017d.m62A(m3470M);
        if ((m3563b(new C0090b(), ((C0637a) c1245b.getText().m2145q()).m2111q(i7, m62A), motionEvent) & 2) == 0 && !c1245b.getCursor().m2163a() && motionEvent.getPointerCount() == 1) {
            c1245b.m3498j0(i7, m62A);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.f6246c.isEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r20, android.view.MotionEvent r21, float r22, float r23) {
        /*
            r19 = this;
            r0 = r19
            g5.b r1 = r0.f6246c
            g5.d r2 = r1.getProps()
            boolean r2 = r2.f6107Q1
            if (r2 == 0) goto L1d
            float r2 = java.lang.Math.abs(r22)
            float r3 = java.lang.Math.abs(r23)
            r4 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1f
            r4 = r22
            r2 = 0
            goto L21
        L1d:
            r4 = r22
        L1f:
            r2 = r23
        L21:
            g5.d r3 = r1.getProps()
            boolean r3 = r3.f6120w1
            r5 = 0
            if (r3 != 0) goto L2b
            return r5
        L2b:
            g5.h r3 = r0.f6247e
            android.widget.OverScroller r6 = r3.f6181b
            r7 = 1
            r6.forceFinished(r7)
            r3.m3551d()
            int r9 = r3.m3549b()
            int r10 = r3.m3550c()
            float r6 = -r4
            int r11 = (int) r6
            float r6 = -r2
            int r12 = (int) r6
            r13 = 0
            int r14 = r1.getScrollMaxX()
            r15 = 0
            int r16 = r1.getScrollMaxY()
            g5.d r6 = r1.getProps()
            r6.getClass()
            r17 = 0
            g5.d r6 = r1.getProps()
            r6.getClass()
            r18 = 0
            android.widget.OverScroller r6 = r3.f6181b
            r8 = r6
            r8.fling(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.m3551d()
            float r7 = r1.getDpUnit()
            r8 = 1157234688(0x44fa0000, float:2000.0)
            float r7 = r7 * r8
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L7f
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L8f
        L7f:
            long r7 = java.lang.System.currentTimeMillis()
            r0.f6219D1 = r7
            g5.q r2 = new g5.q
            r2.<init>(r0)
            r7 = 3000(0xbb8, double:1.482E-320)
            r1.m3487d0(r2, r7)
        L8f:
            android.widget.EdgeEffect r2 = r1.f6027U2
            r2.onRelease()
            android.widget.EdgeEffect r2 = r1.f6025T2
            r2.onRelease()
            g5.b r2 = r0.f6246c
            q4.x r4 = new q4.x
            int r9 = r3.m3549b()
            int r10 = r3.m3550c()
            int r11 = r6.getFinalX()
            int r12 = r6.getFinalY()
            r13 = 2
            r7 = r4
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            q4.p r2 = r2.f5988B1
            r2.m4244a(r4)
            r1.postInvalidateOnAnimation()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.GestureDetectorOnGestureListenerC1261r.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C1245b c1245b = this.f6246c;
        c1245b.m3477T();
        long m3470M = c1245b.m3470M(motionEvent.getX(), motionEvent.getY());
        int i7 = (int) (m3470M >> 32);
        int m62A = C0017d.m62A(m3470M);
        if ((m3563b(new C1244a(1), ((C0637a) c1245b.getText().m2145q()).m2111q(i7, m62A), motionEvent) & 2) != 0) {
            return;
        }
        if ((c1245b.getProps().f6104N1 || !c1245b.getCursor().m2163a()) && motionEvent.getPointerCount() == 1) {
            c1245b.performHapticFeedback(0);
            c1245b.m3498j0(i7, m62A);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C1245b c1245b = this.f6246c;
        c1245b.m3477T();
        if (!c1245b.f6028V1) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() * c1245b.getTextSizePx();
        if (scaleFactor >= this.f6217B1 && scaleFactor <= this.f6216A1) {
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            int rowHeight = c1245b.getRowHeight();
            c1245b.setTextSizePxDirect(scaleFactor);
            float rowHeight2 = (c1245b.getRowHeight() * 1.0f) / rowHeight;
            C1251h c1251h = this.f6247e;
            float max = Math.max(0.0f, Math.min((scaleGestureDetector.getScaleFactor() * (c1251h.m3549b() + focusX)) - focusX, c1245b.getScrollMaxX()));
            float max2 = Math.max(0.0f, Math.min(((c1251h.m3550c() + focusY) * rowHeight2) - focusY, c1245b.getScrollMaxY()));
            C1245b c1245b2 = this.f6246c;
            int i7 = (int) max;
            int i8 = (int) max2;
            c1245b2.f5988B1.m4244a(new C1795x(c1245b2, c1251h.m3549b(), c1251h.m3550c(), i7, i8, 5));
            c1251h.m3552e(i7, i8, 0, 0);
            c1251h.f6181b.abortAnimation();
            c1251h.m3551d();
            this.f6253z1 = true;
            c1245b.invalidate();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C1251h c1251h = this.f6247e;
        c1251h.f6181b.forceFinished(true);
        c1251h.m3551d();
        C1245b c1245b = this.f6246c;
        this.f6218C1 = c1245b.getTextSizePx();
        if (c1245b.f6028V1) {
            c1245b.m3477T();
            if (!m3565d()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f6253z1 = false;
        float f7 = this.f6218C1;
        C1245b c1245b = this.f6246c;
        if (f7 == c1245b.getTextSizePx()) {
            return;
        }
        c1245b.getRenderer().f6138E = true;
        if (c1245b.f6032X1) {
            this.f6245a2 = scaleGestureDetector.getFocusY();
            this.f6242Y1 = c1245b.m3470M(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            this.f6244Z1 = true;
        } else {
            this.f6244Z1 = false;
        }
        c1245b.getRenderContext().m3845a();
        c1245b.getRenderer().m3520A();
        c1245b.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
        float f9;
        float f10;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        float distance;
        float distance2;
        C1245b c1245b = this.f6246c;
        if (!c1245b.getProps().f6108R1) {
            f9 = f7;
            f10 = f8;
        } else if (Math.abs(f7) > Math.abs(f8)) {
            f9 = f7;
            f10 = 0.0f;
        } else {
            f10 = f8;
            f9 = 0.0f;
        }
        C1251h c1251h = this.f6247e;
        int m3549b = c1251h.m3549b() + ((int) f9);
        int m3550c = c1251h.m3550c() + ((int) f10);
        int max = Math.max(m3549b, 0);
        int min = Math.min(Math.max(m3550c, 0), c1245b.getScrollMaxY());
        int min2 = Math.min(max, c1245b.getScrollMaxX());
        if (c1245b.getVerticalEdgeEffect().isFinished()) {
            i7 = min;
            z6 = true;
        } else {
            float max2 = Math.max(0.0f, Math.min(1.0f, motionEvent2.getX() / c1245b.getWidth()));
            float measuredHeight = (this.f6251x1 ? f10 : -f10) / c1245b.getMeasuredHeight();
            if (measuredHeight > 0.0f) {
                min = c1251h.m3550c();
                EdgeEffect verticalEdgeEffect = c1245b.getVerticalEdgeEffect();
                if (this.f6251x1) {
                    max2 = 1.0f - max2;
                }
                verticalEdgeEffect.onPull(measuredHeight, max2);
            } else if (Build.VERSION.SDK_INT >= 31) {
                EdgeEffect verticalEdgeEffect2 = c1245b.getVerticalEdgeEffect();
                if (this.f6251x1) {
                    max2 = 1.0f - max2;
                }
                verticalEdgeEffect2.onPullDistance(measuredHeight, max2);
                distance2 = verticalEdgeEffect2.getDistance();
                if (distance2 != 0.0f) {
                    min = c1251h.m3550c();
                }
            } else {
                c1245b.getVerticalEdgeEffect().finish();
            }
            i7 = min;
            z6 = false;
        }
        if (c1245b.getHorizontalEdgeEffect().isFinished()) {
            i8 = min2;
            z7 = true;
        } else {
            float max3 = Math.max(0.0f, Math.min(1.0f, motionEvent2.getY() / c1245b.getHeight()));
            float measuredWidth = (this.f6252y1 ? f9 : -f9) / c1245b.getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                min2 = c1251h.m3549b();
                EdgeEffect horizontalEdgeEffect = c1245b.getHorizontalEdgeEffect();
                if (!this.f6252y1) {
                    max3 = 1.0f - max3;
                }
                horizontalEdgeEffect.onPull(measuredWidth, max3);
            } else if (Build.VERSION.SDK_INT >= 31) {
                EdgeEffect horizontalEdgeEffect2 = c1245b.getHorizontalEdgeEffect();
                if (!this.f6252y1) {
                    max3 = 1.0f - max3;
                }
                horizontalEdgeEffect2.onPullDistance(measuredWidth, max3);
                distance = horizontalEdgeEffect2.getDistance();
                if (distance != 0.0f) {
                    min2 = c1251h.m3549b();
                }
            } else {
                c1245b.getHorizontalEdgeEffect().finish();
            }
            i8 = min2;
            z7 = false;
        }
        c1251h.m3552e(c1251h.m3549b(), c1251h.m3550c(), i8 - c1251h.m3549b(), i7 - c1251h.m3550c());
        if (z6 && c1251h.m3550c() + f10 < -2.0f) {
            c1245b.getVerticalEdgeEffect().onPull((-f10) / c1245b.getMeasuredHeight(), Math.max(0.0f, Math.min(1.0f, motionEvent2.getX() / c1245b.getWidth())));
            this.f6251x1 = false;
        }
        if (z6 && c1251h.m3550c() + f10 > c1245b.getScrollMaxY() + 2.0f) {
            c1245b.getVerticalEdgeEffect().onPull(f10 / c1245b.getMeasuredHeight(), Math.max(0.0f, Math.min(1.0f, motionEvent2.getX() / c1245b.getWidth())));
            this.f6251x1 = true;
        }
        if (z7 && c1251h.m3549b() + f9 < -2.0f) {
            c1245b.getHorizontalEdgeEffect().onPull((-f9) / c1245b.getMeasuredWidth(), Math.max(0.0f, Math.min(1.0f, motionEvent2.getY() / c1245b.getHeight())));
            this.f6252y1 = false;
        }
        if (z7 && c1251h.m3549b() + f9 > c1245b.getScrollMaxX() + 2.0f) {
            c1245b.getHorizontalEdgeEffect().onPull(f9 / c1245b.getMeasuredWidth(), Math.max(0.0f, Math.min(1.0f, motionEvent2.getY() / c1245b.getHeight())));
            this.f6252y1 = true;
        }
        c1245b.invalidate();
        C1245b c1245b2 = this.f6246c;
        c1245b2.f5988B1.m4244a(new C1795x(c1245b2, c1251h.m3549b(), c1251h.m3550c(), i8, i7, 1));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        if (r1 != 2) goto L36;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.GestureDetectorOnGestureListenerC1261r.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
