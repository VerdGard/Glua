package p090l0;

import android.content.Context;
import android.ext.DaemonManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p034e0.C0946x;

/* renamed from: l0.c */
/* loaded from: classes.dex */
public final class C1486c {

    /* renamed from: x */
    public static final a f7070x = new a();

    /* renamed from: a */
    public int f7071a;

    /* renamed from: b */
    public int f7072b;

    /* renamed from: d */
    public float[] f7074d;

    /* renamed from: e */
    public float[] f7075e;

    /* renamed from: f */
    public float[] f7076f;

    /* renamed from: g */
    public float[] f7077g;

    /* renamed from: h */
    public int[] f7078h;

    /* renamed from: i */
    public int[] f7079i;

    /* renamed from: j */
    public int[] f7080j;

    /* renamed from: k */
    public int f7081k;

    /* renamed from: l */
    public VelocityTracker f7082l;

    /* renamed from: m */
    public final float f7083m;

    /* renamed from: n */
    public float f7084n;

    /* renamed from: o */
    public int f7085o;

    /* renamed from: p */
    public final int f7086p;

    /* renamed from: q */
    public int f7087q;

    /* renamed from: r */
    public final OverScroller f7088r;

    /* renamed from: s */
    public final c f7089s;

    /* renamed from: t */
    public View f7090t;

    /* renamed from: u */
    public boolean f7091u;

    /* renamed from: v */
    public final ViewGroup f7092v;

    /* renamed from: c */
    public int f7073c = -1;

    /* renamed from: w */
    public final b f7093w = new b();

    /* renamed from: l0.c$a */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* renamed from: l0.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1486c.this.m3908p(0);
        }
    }

    /* renamed from: l0.c$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo1060a(View view, int i7);

        /* renamed from: b */
        public abstract int mo1061b(View view, int i7);

        /* renamed from: c */
        public int mo1062c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo2316d() {
            return 0;
        }

        /* renamed from: e */
        public void mo1063e(int i7, int i8) {
        }

        /* renamed from: f */
        public void mo1064f() {
        }

        /* renamed from: g */
        public void mo1065g(View view, int i7) {
        }

        /* renamed from: h */
        public abstract void mo1066h(int i7);

        /* renamed from: i */
        public abstract void mo1067i(View view, int i7, int i8);

        /* renamed from: j */
        public abstract void mo1068j(View view, float f7, float f8);

        /* renamed from: k */
        public abstract boolean mo1069k(View view, int i7);
    }

    public C1486c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f7092v = viewGroup;
        this.f7089s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f7086p = i7;
        this.f7085o = i7;
        this.f7072b = viewConfiguration.getScaledTouchSlop();
        this.f7083m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7084n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7088r = new OverScroller(context, f7070x);
    }

    /* renamed from: a */
    public final void m3893a() {
        this.f7073c = -1;
        float[] fArr = this.f7074d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7075e, 0.0f);
            Arrays.fill(this.f7076f, 0.0f);
            Arrays.fill(this.f7077g, 0.0f);
            Arrays.fill(this.f7078h, 0);
            Arrays.fill(this.f7079i, 0);
            Arrays.fill(this.f7080j, 0);
            this.f7081k = 0;
        }
        VelocityTracker velocityTracker = this.f7082l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7082l = null;
        }
    }

    /* renamed from: b */
    public final void m3894b(View view, int i7) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f7092v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f7090t = view;
        this.f7073c = i7;
        this.f7089s.mo1065g(view, i7);
        m3908p(1);
    }

    /* renamed from: c */
    public final boolean m3895c(float f7, float f8, int i7, int i8) {
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        if ((this.f7078h[i7] & i8) != i8 || (this.f7087q & i8) == 0 || (this.f7080j[i7] & i8) == i8 || (this.f7079i[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f7072b;
        if (abs <= i9 && abs2 <= i9) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f7089s.getClass();
        }
        return (this.f7079i[i7] & i8) == 0 && abs > ((float) this.f7072b);
    }

    /* renamed from: d */
    public final boolean m3896d(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        c cVar = this.f7089s;
        boolean z6 = cVar.mo1062c(view) > 0;
        boolean z7 = cVar.mo2316d() > 0;
        if (!z6 || !z7) {
            return z6 ? Math.abs(f7) > ((float) this.f7072b) : z7 && Math.abs(f8) > ((float) this.f7072b);
        }
        float f9 = (f8 * f8) + (f7 * f7);
        int i7 = this.f7072b;
        return f9 > ((float) (i7 * i7));
    }

    /* renamed from: e */
    public final void m3897e(int i7) {
        float[] fArr = this.f7074d;
        if (fArr != null) {
            int i8 = this.f7081k;
            int i9 = 1 << i7;
            if ((i9 & i8) != 0) {
                fArr[i7] = 0.0f;
                this.f7075e[i7] = 0.0f;
                this.f7076f[i7] = 0.0f;
                this.f7077g[i7] = 0.0f;
                this.f7078h[i7] = 0;
                this.f7079i[i7] = 0;
                this.f7080j[i7] = 0;
                this.f7081k = (~i9) & i8;
            }
        }
    }

    /* renamed from: f */
    public final int m3898f(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        float width = this.f7092v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: g */
    public final boolean m3899g() {
        if (this.f7071a == 2) {
            OverScroller overScroller = this.f7088r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7090t.getLeft();
            int top = currY - this.f7090t.getTop();
            if (left != 0) {
                C0946x.m2810k(this.f7090t, left);
            }
            if (top != 0) {
                C0946x.m2811l(this.f7090t, top);
            }
            if (left != 0 || top != 0) {
                this.f7089s.mo1067i(this.f7090t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f7092v.post(this.f7093w);
            }
        }
        return this.f7071a == 2;
    }

    /* renamed from: h */
    public final View m3900h(int i7, int i8) {
        ViewGroup viewGroup = this.f7092v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7089s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m3901i(int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int left = this.f7090t.getLeft();
        int top = this.f7090t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        OverScroller overScroller = this.f7088r;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            m3908p(0);
            return false;
        }
        View view = this.f7090t;
        int i13 = (int) this.f7084n;
        int i14 = (int) this.f7083m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int i15 = (int) this.f7084n;
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
        c cVar = this.f7089s;
        overScroller.startScroll(left, top, i11, i12, (int) ((m3898f(i12, i10, cVar.mo2316d()) * f12) + (m3898f(i11, i9, cVar.mo1062c(view)) * f11)));
        m3908p(2);
        return true;
    }

    /* renamed from: j */
    public final boolean m3902j(int i7) {
        if ((this.f7081k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: k */
    public final void m3903k(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m3893a();
        }
        if (this.f7082l == null) {
            this.f7082l = VelocityTracker.obtain();
        }
        this.f7082l.addMovement(motionEvent);
        int i8 = 0;
        c cVar = this.f7089s;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m3900h = m3900h((int) x7, (int) y7);
            m3906n(x7, y7, pointerId);
            m3912t(m3900h, pointerId);
            if ((this.f7078h[pointerId] & this.f7087q) != 0) {
                cVar.mo1064f();
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f7071a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i8 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i8);
                        if (m3902j(pointerId2)) {
                            float x8 = motionEvent.getX(i8);
                            float y8 = motionEvent.getY(i8);
                            float f7 = x8 - this.f7074d[pointerId2];
                            float f8 = y8 - this.f7075e[pointerId2];
                            m3905m(f7, f8, pointerId2);
                            if (this.f7071a != 1) {
                                View m3900h2 = m3900h((int) x8, (int) y8);
                                if (m3896d(m3900h2, f7, f8) && m3912t(m3900h2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i8++;
                    }
                } else {
                    if (!m3902j(this.f7073c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7073c);
                    float x9 = motionEvent.getX(findPointerIndex);
                    float y9 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f7076f;
                    int i9 = this.f7073c;
                    int i10 = (int) (x9 - fArr[i9]);
                    int i11 = (int) (y9 - this.f7077g[i9]);
                    int left = this.f7090t.getLeft() + i10;
                    int top = this.f7090t.getTop() + i11;
                    int left2 = this.f7090t.getLeft();
                    int top2 = this.f7090t.getTop();
                    if (i10 != 0) {
                        left = cVar.mo1060a(this.f7090t, left);
                        C0946x.m2810k(this.f7090t, left - left2);
                    }
                    if (i11 != 0) {
                        top = cVar.mo1061b(this.f7090t, top);
                        C0946x.m2811l(this.f7090t, top - top2);
                    }
                    if (i10 != 0 || i11 != 0) {
                        cVar.mo1067i(this.f7090t, left, top);
                    }
                }
                m3907o(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f7071a == 1 && pointerId3 == this.f7073c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i8 >= pointerCount2) {
                                i7 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i8);
                            if (pointerId4 != this.f7073c) {
                                View m3900h3 = m3900h((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                                View view = this.f7090t;
                                if (m3900h3 == view && m3912t(view, pointerId4)) {
                                    i7 = this.f7073c;
                                    break;
                                }
                            }
                            i8++;
                        }
                        if (i7 == -1) {
                            m3904l();
                        }
                    }
                    m3897e(pointerId3);
                    return;
                }
                int pointerId5 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                m3906n(x10, y10, pointerId5);
                if (this.f7071a == 0) {
                    m3912t(m3900h((int) x10, (int) y10), pointerId5);
                    if ((this.f7078h[pointerId5] & this.f7087q) != 0) {
                        cVar.mo1064f();
                        return;
                    }
                    return;
                }
                int i12 = (int) x10;
                int i13 = (int) y10;
                View view2 = this.f7090t;
                if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    m3912t(this.f7090t, pointerId5);
                    return;
                }
                return;
            }
            if (this.f7071a == 1) {
                this.f7091u = true;
                cVar.mo1068j(this.f7090t, 0.0f, 0.0f);
                this.f7091u = false;
                if (this.f7071a == 1) {
                    m3908p(0);
                }
            }
        } else if (this.f7071a == 1) {
            m3904l();
        }
        m3893a();
    }

    /* renamed from: l */
    public final void m3904l() {
        VelocityTracker velocityTracker = this.f7082l;
        float f7 = this.f7083m;
        velocityTracker.computeCurrentVelocity(DaemonManager.TIME_JUMP_MUL_INT, f7);
        float xVelocity = this.f7082l.getXVelocity(this.f7073c);
        float f8 = this.f7084n;
        float abs = Math.abs(xVelocity);
        float f9 = 0.0f;
        if (abs < f8) {
            xVelocity = 0.0f;
        } else if (abs > f7) {
            xVelocity = xVelocity > 0.0f ? f7 : -f7;
        }
        float yVelocity = this.f7082l.getYVelocity(this.f7073c);
        float f10 = this.f7084n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f7) {
                if (yVelocity <= 0.0f) {
                    f7 = -f7;
                }
                f9 = f7;
            } else {
                f9 = yVelocity;
            }
        }
        this.f7091u = true;
        this.f7089s.mo1068j(this.f7090t, xVelocity, f9);
        this.f7091u = false;
        if (this.f7071a == 1) {
            m3908p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [l0.c$c] */
    /* renamed from: m */
    public final void m3905m(float f7, float f8, int i7) {
        boolean m3895c = m3895c(f7, f8, i7, 1);
        boolean z6 = m3895c;
        if (m3895c(f8, f7, i7, 4)) {
            z6 = (m3895c ? 1 : 0) | 4;
        }
        boolean z7 = z6;
        if (m3895c(f7, f8, i7, 2)) {
            z7 = (z6 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (m3895c(f8, f7, i7, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f7079i;
            iArr[i7] = iArr[i7] | r02;
            this.f7089s.mo1063e(r02, i7);
        }
    }

    /* renamed from: n */
    public final void m3906n(float f7, float f8, int i7) {
        float[] fArr = this.f7074d;
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
                float[] fArr6 = this.f7075e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7076f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7077g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7078h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7079i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f7080j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7074d = fArr2;
            this.f7075e = fArr3;
            this.f7076f = fArr4;
            this.f7077g = fArr5;
            this.f7078h = iArr;
            this.f7079i = iArr2;
            this.f7080j = iArr3;
        }
        float[] fArr9 = this.f7074d;
        this.f7076f[i7] = f7;
        fArr9[i7] = f7;
        float[] fArr10 = this.f7075e;
        this.f7077g[i7] = f8;
        fArr10[i7] = f8;
        int[] iArr7 = this.f7078h;
        int i9 = (int) f7;
        int i10 = (int) f8;
        ViewGroup viewGroup = this.f7092v;
        int i11 = i9 < viewGroup.getLeft() + this.f7085o ? 1 : 0;
        if (i10 < viewGroup.getTop() + this.f7085o) {
            i11 |= 4;
        }
        if (i9 > viewGroup.getRight() - this.f7085o) {
            i11 |= 2;
        }
        if (i10 > viewGroup.getBottom() - this.f7085o) {
            i11 |= 8;
        }
        iArr7[i7] = i11;
        this.f7081k |= 1 << i7;
    }

    /* renamed from: o */
    public final void m3907o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (m3902j(pointerId)) {
                float x7 = motionEvent.getX(i7);
                float y7 = motionEvent.getY(i7);
                this.f7076f[pointerId] = x7;
                this.f7077g[pointerId] = y7;
            }
        }
    }

    /* renamed from: p */
    public final void m3908p(int i7) {
        this.f7092v.removeCallbacks(this.f7093w);
        if (this.f7071a != i7) {
            this.f7071a = i7;
            this.f7089s.mo1066h(i7);
            if (this.f7071a == 0) {
                this.f7090t = null;
            }
        }
    }

    /* renamed from: q */
    public final boolean m3909q(int i7, int i8) {
        if (this.f7091u) {
            return m3901i(i7, i8, (int) this.f7082l.getXVelocity(this.f7073c), (int) this.f7082l.getYVelocity(this.f7073c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if ((r18.f7078h[r2] & r18.f7087q) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r7.mo1064f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if ((r18.f7078h[r1] & r18.f7087q) != 0) goto L24;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3910r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p090l0.C1486c.m3910r(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public final boolean m3911s(View view, int i7, int i8) {
        this.f7090t = view;
        this.f7073c = -1;
        boolean m3901i = m3901i(i7, i8, 0, 0);
        if (!m3901i && this.f7071a == 0 && this.f7090t != null) {
            this.f7090t = null;
        }
        return m3901i;
    }

    /* renamed from: t */
    public final boolean m3912t(View view, int i7) {
        if (view == this.f7090t && this.f7073c == i7) {
            return true;
        }
        if (view == null || !this.f7089s.mo1069k(view, i7)) {
            return false;
        }
        this.f7073c = i7;
        m3894b(view, i7);
        return true;
    }
}
