package p066i0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1307a implements View.OnTouchListener {

    /* renamed from: F1 */
    public static final int f6476F1 = ViewConfiguration.getTapTimeout();

    /* renamed from: A1 */
    public boolean f6477A1;

    /* renamed from: B1 */
    public boolean f6478B1;

    /* renamed from: C1 */
    public boolean f6479C1;

    /* renamed from: D1 */
    public boolean f6480D1;

    /* renamed from: E1 */
    public boolean f6481E1;

    /* renamed from: X */
    public final float[] f6482X;

    /* renamed from: Y */
    public final float[] f6483Y;

    /* renamed from: Z */
    public int f6484Z;

    /* renamed from: c */
    public final a f6485c;

    /* renamed from: e */
    public final AccelerateInterpolator f6486e;

    /* renamed from: m */
    public final View f6487m;

    /* renamed from: s */
    public b f6488s;

    /* renamed from: w1 */
    public int f6489w1;

    /* renamed from: x1 */
    public final float[] f6490x1;

    /* renamed from: y1 */
    public final float[] f6491y1;

    /* renamed from: z1 */
    public final float[] f6492z1;

    /* renamed from: i0.a$a */
    public static class a {

        /* renamed from: a */
        public int f6493a;

        /* renamed from: b */
        public int f6494b;

        /* renamed from: c */
        public float f6495c;

        /* renamed from: d */
        public float f6496d;

        /* renamed from: h */
        public float f6500h;

        /* renamed from: i */
        public int f6501i;

        /* renamed from: e */
        public long f6497e = Long.MIN_VALUE;

        /* renamed from: g */
        public long f6499g = -1;

        /* renamed from: f */
        public long f6498f = 0;

        /* renamed from: a */
        public final float m3626a(long j7) {
            if (j7 < this.f6497e) {
                return 0.0f;
            }
            long j8 = this.f6499g;
            if (j8 < 0 || j7 < j8) {
                return AbstractViewOnTouchListenerC1307a.m3621b((j7 - r0) / this.f6493a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f6500h;
            return (AbstractViewOnTouchListenerC1307a.m3621b((j7 - j8) / this.f6501i, 0.0f, 1.0f) * f7) + (1.0f - f7);
        }
    }

    /* renamed from: i0.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC1307a abstractViewOnTouchListenerC1307a = AbstractViewOnTouchListenerC1307a.this;
            if (abstractViewOnTouchListenerC1307a.f6480D1) {
                boolean z6 = abstractViewOnTouchListenerC1307a.f6478B1;
                a aVar = abstractViewOnTouchListenerC1307a.f6485c;
                if (z6) {
                    abstractViewOnTouchListenerC1307a.f6478B1 = false;
                    aVar.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f6497e = currentAnimationTimeMillis;
                    aVar.f6499g = -1L;
                    aVar.f6498f = currentAnimationTimeMillis;
                    aVar.f6500h = 0.5f;
                }
                if ((aVar.f6499g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f6499g + ((long) aVar.f6501i)) || !abstractViewOnTouchListenerC1307a.m3625e()) {
                    abstractViewOnTouchListenerC1307a.f6480D1 = false;
                    return;
                }
                boolean z7 = abstractViewOnTouchListenerC1307a.f6479C1;
                View view = abstractViewOnTouchListenerC1307a.f6487m;
                if (z7) {
                    abstractViewOnTouchListenerC1307a.f6479C1 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar.f6498f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float m3626a = aVar.m3626a(currentAnimationTimeMillis2);
                long j7 = currentAnimationTimeMillis2 - aVar.f6498f;
                aVar.f6498f = currentAnimationTimeMillis2;
                C1312f.m3644b(((C1311e) abstractViewOnTouchListenerC1307a).f6505G1, (int) (j7 * ((m3626a * 4.0f) + ((-4.0f) * m3626a * m3626a)) * aVar.f6496d));
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2837m(view, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC1307a(View view) {
        a aVar = new a();
        this.f6485c = aVar;
        this.f6486e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6482X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6483Y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6490x1 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6491y1 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6492z1 = fArr5;
        this.f6487m = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f6484Z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6489w1 = f6476F1;
        aVar.f6493a = 500;
        aVar.f6494b = 500;
    }

    /* renamed from: b */
    public static float m3621b(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m3622a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6482X
            r0 = r0[r7]
            float[] r1 = r3.f6483Y
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m3621b(r0, r2, r1)
            float r1 = r3.m3623c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m3623c(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.f6486e
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2e
        L26:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r4 = r5.getInterpolation(r4)
        L2e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m3621b(r4, r5, r0)
            goto L38
        L37:
            r4 = 0
        L38:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.f6490x1
            r0 = r0[r7]
            float[] r1 = r3.f6491y1
            r1 = r1[r7]
            float[] r2 = r3.f6492z1
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L54
            float r4 = r4 * r0
            float r4 = m3621b(r4, r1, r7)
            return r4
        L54:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m3621b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i0.AbstractViewOnTouchListenerC1307a.m3622a(float, float, float, int):float");
    }

    /* renamed from: c */
    public final float m3623c(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f6484Z;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f6480D1 && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m3624d() {
        int i7 = 0;
        if (this.f6478B1) {
            this.f6480D1 = false;
            return;
        }
        a aVar = this.f6485c;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (currentAnimationTimeMillis - aVar.f6497e);
        int i9 = aVar.f6494b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        aVar.f6501i = i7;
        aVar.f6500h = aVar.m3626a(currentAnimationTimeMillis);
        aVar.f6499g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3625e() {
        /*
            r9 = this;
            i0.a$a r0 = r9.f6485c
            float r1 = r0.f6496d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f6495c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            i0.e r3 = (p066i0.C1311e) r3
            android.widget.ListView r3 = r3.f6505G1
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = 1
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i0.AbstractViewOnTouchListenerC1307a.m3625e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f6481E1
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.m3624d()
            goto L7b
        L1a:
            r7.f6479C1 = r2
            r7.f6477A1 = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f6487m
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m3622a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m3622a(r9, r8, r3, r2)
            i0.a$a r9 = r7.f6485c
            r9.f6495c = r0
            r9.f6496d = r8
            boolean r8 = r7.f6480D1
            if (r8 != 0) goto L7b
            boolean r8 = r7.m3625e()
            if (r8 == 0) goto L7b
            i0.a$b r8 = r7.f6488s
            if (r8 != 0) goto L5f
            i0.a$b r8 = new i0.a$b
            r8.<init>()
            r7.f6488s = r8
        L5f:
            r7.f6480D1 = r2
            r7.f6478B1 = r2
            boolean r8 = r7.f6477A1
            if (r8 != 0) goto L74
            int r8 = r7.f6489w1
            if (r8 <= 0) goto L74
            i0.a$b r9 = r7.f6488s
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, e0.h0> r8 = p034e0.C0946x.f4876a
            p034e0.C0946x.d.m2838n(r4, r9, r5)
            goto L79
        L74:
            i0.a$b r8 = r7.f6488s
            r8.run()
        L79:
            r7.f6477A1 = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i0.AbstractViewOnTouchListenerC1307a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
