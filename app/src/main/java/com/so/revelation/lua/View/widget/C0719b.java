package com.so.revelation.lua.View.widget;

import android.content.Context;
import android.ext.DaemonManager;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.so.revelation.lua.View.widget.SlidingUpPanelLayout;
import java.util.Arrays;
import p066i0.C1314h;

/* renamed from: com.so.revelation.lua.View.widget.b */
/* loaded from: classes.dex */
public final class C0719b {

    /* renamed from: u */
    public static final a f3615u = new a();

    /* renamed from: a */
    public int f3616a;

    /* renamed from: b */
    public int f3617b;

    /* renamed from: d */
    public float[] f3619d;

    /* renamed from: e */
    public float[] f3620e;

    /* renamed from: f */
    public float[] f3621f;

    /* renamed from: g */
    public float[] f3622g;

    /* renamed from: h */
    public int[] f3623h;

    /* renamed from: i */
    public int[] f3624i;

    /* renamed from: j */
    public int[] f3625j;

    /* renamed from: k */
    public VelocityTracker f3626k;

    /* renamed from: l */
    public final float f3627l;

    /* renamed from: m */
    public float f3628m;

    /* renamed from: n */
    public final int f3629n;

    /* renamed from: o */
    public final C1314h f3630o;

    /* renamed from: p */
    public final c f3631p;

    /* renamed from: q */
    public View f3632q;

    /* renamed from: r */
    public boolean f3633r;

    /* renamed from: s */
    public final ViewGroup f3634s;

    /* renamed from: c */
    public int f3618c = -1;

    /* renamed from: t */
    public final b f3635t = new b();

    /* renamed from: com.so.revelation.lua.View.widget.b$a */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.b$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0719b.this.m2245o(0);
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.b$c */
    public static abstract class c {
    }

    public C0719b(Context context, ViewGroup viewGroup, Interpolator interpolator, SlidingUpPanelLayout.C0707b c0707b) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        this.f3634s = viewGroup;
        this.f3631p = c0707b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3629n = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3617b = viewConfiguration.getScaledTouchSlop();
        this.f3627l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3628m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3630o = new C1314h(context, interpolator == null ? f3615u : interpolator);
    }

    /* renamed from: a */
    public final void m2231a() {
        m2232b();
        if (this.f3616a == 2) {
            C1314h c1314h = this.f3630o;
            c1314h.f6510a.getCurrX();
            OverScroller overScroller = c1314h.f6510a;
            overScroller.getCurrY();
            overScroller.abortAnimation();
            overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            SlidingUpPanelLayout.m2217a(slidingUpPanelLayout, currY);
            slidingUpPanelLayout.invalidate();
        }
        m2245o(0);
    }

    /* renamed from: b */
    public final void m2232b() {
        this.f3618c = -1;
        float[] fArr = this.f3619d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3620e, 0.0f);
            Arrays.fill(this.f3621f, 0.0f);
            Arrays.fill(this.f3622g, 0.0f);
            Arrays.fill(this.f3623h, 0);
            Arrays.fill(this.f3624i, 0);
            Arrays.fill(this.f3625j, 0);
        }
        VelocityTracker velocityTracker = this.f3626k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3626k = null;
        }
    }

    /* renamed from: c */
    public final boolean m2233c(float f7, float f8, int i7, int i8) {
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        if ((this.f3623h[i7] & i8) != i8 || (0 & i8) == 0 || (this.f3625j[i7] & i8) == i8 || (this.f3624i[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f3617b;
        if (abs <= i9 && abs2 <= i9) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f3631p.getClass();
        }
        return (this.f3624i[i7] & i8) == 0 && abs > ((float) this.f3617b);
    }

    /* renamed from: d */
    public final boolean m2234d(View view, float f7) {
        if (view == null) {
            return false;
        }
        c cVar = this.f3631p;
        cVar.getClass();
        return (SlidingUpPanelLayout.this.f3537M1 > 0) && Math.abs(f7) > ((float) this.f3617b);
    }

    /* renamed from: e */
    public final void m2235e(int i7) {
        float[] fArr = this.f3619d;
        if (fArr == null || fArr.length <= i7) {
            return;
        }
        fArr[i7] = 0.0f;
        this.f3620e[i7] = 0.0f;
        this.f3621f[i7] = 0.0f;
        this.f3622g[i7] = 0.0f;
        this.f3623h[i7] = 0;
        this.f3624i[i7] = 0;
        this.f3625j[i7] = 0;
    }

    /* renamed from: f */
    public final int m2236f(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        float width = this.f3634s.getWidth() / 2;
        float sin = (((float) Math.sin((float) ((Math.min(1.0f, Math.abs(i7) / r0) - 0.5f) * 0.4712389167638204d))) * width) + width;
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0035, code lost:
    
        if (r4 >= r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5 <= r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        r9 = r2.m2220d(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2237g(float r9) {
        /*
            r8 = this;
            r0 = 1
            r8.f3633r = r0
            android.view.View r1 = r8.f3632q
            com.so.revelation.lua.View.widget.b$c r2 = r8.f3631p
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$b r2 = (com.so.revelation.lua.View.widget.SlidingUpPanelLayout.C0707b) r2
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout r2 = com.so.revelation.lua.View.widget.SlidingUpPanelLayout.this
            boolean r3 = r2.f3558z1
            if (r3 == 0) goto L10
            float r9 = -r9
        L10:
            r3 = 0
            int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r4 <= 0) goto L1e
            float r5 = r2.f3536L1
            float r6 = r2.f3538N1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L1e
            goto L37
        L1e:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L2b
            float r4 = r2.f3536L1
            float r6 = r2.f3538N1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L2b
            goto L54
        L2b:
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L3c
            float r4 = r2.f3536L1
            float r6 = r2.f3538N1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L3c
        L37:
            int r9 = r2.m2220d(r6)
            goto L68
        L3c:
            if (r9 >= 0) goto L47
            float r9 = r2.f3536L1
            float r4 = r2.f3538N1
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L47
            goto L64
        L47:
            float r9 = r2.f3536L1
            float r4 = r2.f3538N1
            float r6 = r4 + r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 < 0) goto L59
        L54:
            int r9 = r2.m2220d(r5)
            goto L68
        L59:
            float r5 = r4 / r7
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 < 0) goto L64
            int r9 = r2.m2220d(r4)
            goto L68
        L64:
            int r9 = r2.m2220d(r3)
        L68:
            com.so.revelation.lua.View.widget.b r3 = r2.f3548X1
            if (r3 == 0) goto L92
            int r1 = r1.getLeft()
            boolean r4 = r3.f3633r
            if (r4 == 0) goto L8a
            android.view.VelocityTracker r4 = r3.f3626k
            int r5 = r3.f3618c
            float r4 = r4.getXVelocity(r5)
            int r4 = (int) r4
            android.view.VelocityTracker r5 = r3.f3626k
            int r6 = r3.f3618c
            float r5 = r5.getYVelocity(r6)
            int r5 = (int) r5
            r3.m2239i(r1, r9, r4, r5)
            goto L92
        L8a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r9.<init>(r0)
            throw r9
        L92:
            r2.invalidate()
            r9 = 0
            r8.f3633r = r9
            int r1 = r8.f3616a
            if (r1 != r0) goto L9f
            r8.m2245o(r9)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.C0719b.m2237g(float):void");
    }

    /* renamed from: h */
    public final View m2238h(int i7, int i8) {
        ViewGroup viewGroup = this.f3634s;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3631p.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m2239i(int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int left = this.f3632q.getLeft();
        int top = this.f3632q.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        C1314h c1314h = this.f3630o;
        if (i11 == 0 && i12 == 0) {
            c1314h.f6510a.abortAnimation();
            m2245o(0);
            return false;
        }
        int i13 = (int) this.f3628m;
        int i14 = (int) this.f3627l;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int i15 = (int) this.f3628m;
        int abs2 = Math.abs(i10);
        if (abs2 < i15) {
            i10 = 0;
        } else if (abs2 > i14) {
            i10 = i10 > 0 ? i14 : -i14;
        }
        int abs3 = Math.abs(i11);
        int abs4 = Math.abs(i12);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i10);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i9 != 0) {
            f7 = abs5;
            f8 = i16;
        } else {
            f7 = abs3;
            f8 = i17;
        }
        float f11 = f7 / f8;
        if (i10 != 0) {
            f9 = abs6;
            f10 = i16;
        } else {
            f9 = abs4;
            f10 = i17;
        }
        float f12 = f9 / f10;
        this.f3631p.getClass();
        c1314h.f6510a.startScroll(left, top, i11, i12, (int) ((m2236f(i12, i10, SlidingUpPanelLayout.this.f3537M1) * f12) + (m2236f(i11, i9, 0) * f11)));
        m2245o(2);
        return true;
    }

    /* renamed from: j */
    public final void m2240j(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2232b();
        }
        if (this.f3626k == null) {
            this.f3626k = VelocityTracker.obtain();
        }
        this.f3626k.addMovement(motionEvent);
        int i8 = 0;
        c cVar = this.f3631p;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3616a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i8 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i8);
                            float x7 = motionEvent.getX(i8);
                            float y7 = motionEvent.getY(i8);
                            float f7 = x7 - this.f3619d[pointerId];
                            float f8 = y7 - this.f3620e[pointerId];
                            m2242l(f7, f8, pointerId);
                            if (this.f3616a != 1) {
                                View m2238h = m2238h((int) this.f3619d[pointerId], (int) this.f3620e[pointerId]);
                                if (m2234d(m2238h, f8) && m2246p(m2238h, pointerId)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3618c);
                        float x8 = motionEvent.getX(findPointerIndex);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f3621f;
                        int i9 = this.f3618c;
                        int i10 = (int) (x8 - fArr[i9]);
                        int i11 = (int) (y8 - this.f3622g[i9]);
                        this.f3632q.getLeft();
                        int top = this.f3632q.getTop() + i11;
                        int left = this.f3632q.getLeft();
                        int top2 = this.f3632q.getTop();
                        if (i10 != 0) {
                            cVar.getClass();
                            this.f3632q.offsetLeftAndRight(0 - left);
                        }
                        if (i11 != 0) {
                            SlidingUpPanelLayout.C0707b c0707b = (SlidingUpPanelLayout.C0707b) cVar;
                            c0707b.getClass();
                            int[] iArr = SlidingUpPanelLayout.f3524a2;
                            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                            int m2220d = slidingUpPanelLayout.m2220d(0.0f);
                            int m2220d2 = slidingUpPanelLayout.m2220d(1.0f);
                            top = slidingUpPanelLayout.f3558z1 ? Math.min(Math.max(top, m2220d2), m2220d) : Math.min(Math.max(top, m2220d), m2220d2);
                            this.f3632q.offsetTopAndBottom(top - top2);
                        }
                        if (i10 != 0 || i11 != 0) {
                            SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                            SlidingUpPanelLayout.m2217a(slidingUpPanelLayout2, top);
                            slidingUpPanelLayout2.invalidate();
                        }
                    }
                    m2244n(motionEvent);
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f3616a == 1 && pointerId2 == this.f3618c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i8 >= pointerCount2) {
                                    i7 = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i8);
                                if (pointerId3 != this.f3618c) {
                                    View m2238h2 = m2238h((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                                    View view = this.f3632q;
                                    if (m2238h2 == view && m2246p(view, pointerId3)) {
                                        i7 = this.f3618c;
                                        break;
                                    }
                                }
                                i8++;
                            }
                            if (i7 == -1) {
                                m2241k();
                            }
                        }
                        m2235e(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x9 = motionEvent.getX(actionIndex);
                    float y9 = motionEvent.getY(actionIndex);
                    m2243m(x9, y9, pointerId4);
                    if (this.f3616a != 0) {
                        int i12 = (int) x9;
                        int i13 = (int) y9;
                        View view2 = this.f3632q;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i8 = 1;
                        }
                        if (i8 != 0) {
                            m2246p(this.f3632q, pointerId4);
                            return;
                        }
                        return;
                    }
                    m2246p(m2238h((int) x9, (int) y9), pointerId4);
                    if ((this.f3623h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f3616a == 1) {
                    m2237g(0.0f);
                }
            } else if (this.f3616a == 1) {
                m2241k();
            }
            m2232b();
            return;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m2238h3 = m2238h((int) x10, (int) y10);
        m2243m(x10, y10, pointerId5);
        m2246p(m2238h3, pointerId5);
        if ((this.f3623h[pointerId5] & 0) == 0) {
            return;
        }
        cVar.getClass();
    }

    /* renamed from: k */
    public final void m2241k() {
        VelocityTracker velocityTracker = this.f3626k;
        float f7 = this.f3627l;
        velocityTracker.computeCurrentVelocity(DaemonManager.TIME_JUMP_MUL_INT, f7);
        float xVelocity = this.f3626k.getXVelocity(this.f3618c);
        float f8 = this.f3628m;
        float abs = Math.abs(xVelocity);
        if (abs >= f8) {
            int i7 = (abs > f7 ? 1 : (abs == f7 ? 0 : -1));
        }
        float yVelocity = this.f3626k.getYVelocity(this.f3618c);
        float f9 = this.f3628m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f9) {
            yVelocity = 0.0f;
        } else if (abs2 > f7) {
            if (yVelocity <= 0.0f) {
                f7 = -f7;
            }
            yVelocity = f7;
        }
        m2237g(yVelocity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: l */
    public final void m2242l(float f7, float f8, int i7) {
        boolean m2233c = m2233c(f7, f8, i7, 1);
        boolean z6 = m2233c;
        if (m2233c(f8, f7, i7, 4)) {
            z6 = (m2233c ? 1 : 0) | 4;
        }
        boolean z7 = z6;
        if (m2233c(f7, f8, i7, 2)) {
            z7 = (z6 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (m2233c(f8, f7, i7, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f3624i;
            iArr[i7] = iArr[i7] | r02;
            this.f3631p.getClass();
        }
    }

    /* renamed from: m */
    public final void m2243m(float f7, float f8, int i7) {
        float[] fArr = this.f3619d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3620e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3621f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3622g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3623h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3624i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3625j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3619d = fArr2;
            this.f3620e = fArr3;
            this.f3621f = fArr4;
            this.f3622g = fArr5;
            this.f3623h = iArr;
            this.f3624i = iArr2;
            this.f3625j = iArr3;
        }
        float[] fArr9 = this.f3619d;
        this.f3621f[i7] = f7;
        fArr9[i7] = f7;
        float[] fArr10 = this.f3620e;
        this.f3622g[i7] = f8;
        fArr10[i7] = f8;
        int[] iArr7 = this.f3623h;
        int i9 = (int) f7;
        int i10 = (int) f8;
        ViewGroup viewGroup = this.f3634s;
        int left = viewGroup.getLeft();
        int i11 = this.f3629n;
        int i12 = i9 < left + i11 ? 1 : 0;
        if (i10 < viewGroup.getTop() + i11) {
            i12 |= 4;
        }
        if (i9 > viewGroup.getRight() - i11) {
            i12 |= 2;
        }
        if (i10 > viewGroup.getBottom() - i11) {
            i12 |= 8;
        }
        iArr7[i7] = i12;
    }

    /* renamed from: n */
    public final void m2244n(MotionEvent motionEvent) {
        float[] fArr;
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            float x7 = motionEvent.getX(i7);
            float y7 = motionEvent.getY(i7);
            float[] fArr2 = this.f3621f;
            if (fArr2 != null && (fArr = this.f3622g) != null && fArr2.length > pointerId && fArr.length > pointerId) {
                fArr2[pointerId] = x7;
                fArr[pointerId] = y7;
            }
        }
    }

    /* renamed from: o */
    public final void m2245o(int i7) {
        SlidingUpPanelLayout.EnumC0710e enumC0710e;
        if (this.f3616a != i7) {
            this.f3616a = i7;
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            C0719b c0719b = slidingUpPanelLayout.f3548X1;
            if (c0719b != null && c0719b.f3616a == 0) {
                slidingUpPanelLayout.f3536L1 = slidingUpPanelLayout.m2221e(slidingUpPanelLayout.f3532H1.getTop());
                slidingUpPanelLayout.m2219c();
                float f7 = slidingUpPanelLayout.f3536L1;
                if (f7 == 1.0f) {
                    slidingUpPanelLayout.m2225i();
                    enumC0710e = SlidingUpPanelLayout.EnumC0710e.f3565c;
                } else if (f7 == 0.0f) {
                    enumC0710e = SlidingUpPanelLayout.EnumC0710e.f3566e;
                } else if (f7 < 0.0f) {
                    slidingUpPanelLayout.setPanelStateInternal(SlidingUpPanelLayout.EnumC0710e.f3568s);
                    slidingUpPanelLayout.f3532H1.setVisibility(4);
                } else {
                    slidingUpPanelLayout.m2225i();
                    enumC0710e = SlidingUpPanelLayout.EnumC0710e.f3567m;
                }
                slidingUpPanelLayout.setPanelStateInternal(enumC0710e);
            }
            if (this.f3616a == 0) {
                this.f3632q = null;
            }
        }
    }

    /* renamed from: p */
    public final boolean m2246p(View view, int i7) {
        if (view == this.f3632q && this.f3618c == i7) {
            return true;
        }
        if (view != null) {
            SlidingUpPanelLayout.C0707b c0707b = (SlidingUpPanelLayout.C0707b) this.f3631p;
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            if (!slidingUpPanelLayout.f3539O1 && view == slidingUpPanelLayout.f3532H1) {
                this.f3618c = i7;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = this.f3634s;
                if (parent != viewGroup) {
                    throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
                }
                this.f3632q = view;
                this.f3618c = i7;
                SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                int childCount = slidingUpPanelLayout2.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = slidingUpPanelLayout2.getChildAt(i8);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                m2245o(1);
                return true;
            }
        }
        return false;
    }
}
