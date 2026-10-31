package p012b3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.activity.C0143v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: b3.d */
/* loaded from: classes.dex */
public abstract class AbstractC0534d<V extends View> extends C0536f<V> {

    /* renamed from: X */
    public boolean f2673X;

    /* renamed from: Y */
    public int f2674Y;

    /* renamed from: Z */
    public int f2675Z;

    /* renamed from: m */
    public a f2676m;

    /* renamed from: s */
    public OverScroller f2677s;

    /* renamed from: w1 */
    public int f2678w1;

    /* renamed from: x1 */
    public VelocityTracker f2679x1;

    /* renamed from: b3.d$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final CoordinatorLayout f2680c;

        /* renamed from: e */
        public final V f2681e;

        public a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f2680c = coordinatorLayout;
            this.f2681e = v5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0534d abstractC0534d;
            OverScroller overScroller;
            V v5 = this.f2681e;
            if (v5 == null || (overScroller = (abstractC0534d = AbstractC0534d.this).f2677s) == null) {
                return;
            }
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f2680c;
            if (!computeScrollOffset) {
                abstractC0534d.mo1841C(v5, coordinatorLayout);
                return;
            }
            abstractC0534d.m1843E(coordinatorLayout, v5, abstractC0534d.f2677s.getCurrY());
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2837m(v5, this);
        }
    }

    public AbstractC0534d() {
        this.f2674Y = -1;
        this.f2678w1 = -1;
    }

    public AbstractC0534d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2674Y = -1;
        this.f2678w1 = -1;
    }

    /* renamed from: A */
    public int mo1839A(V v5) {
        return v5.getHeight();
    }

    /* renamed from: B */
    public int mo1840B() {
        return m1850w();
    }

    /* renamed from: C */
    public void mo1841C(View view, CoordinatorLayout coordinatorLayout) {
    }

    /* renamed from: D */
    public int mo1842D(CoordinatorLayout coordinatorLayout, V v5, int i7, int i8, int i9) {
        int m460r;
        int m1850w = m1850w();
        if (i8 == 0 || m1850w < i8 || m1850w > i9 || m1850w == (m460r = C0143v.m460r(i7, i8, i9))) {
            return 0;
        }
        C0537g c0537g = this.f2687c;
        if (c0537g == null) {
            this.f2688e = m460r;
        } else if (c0537g.f2692d != m460r) {
            c0537g.f2692d = m460r;
            c0537g.m1851a();
        }
        return m1850w - m460r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m1843E(CoordinatorLayout coordinatorLayout, View view, int i7) {
        mo1842D(coordinatorLayout, view, i7, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: k */
    public final boolean mo984k(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2678w1 < 0) {
            this.f2678w1 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2673X) {
            int i7 = this.f2674Y;
            if (i7 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y7 - this.f2675Z) > this.f2678w1) {
                this.f2675Z = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f2674Y = -1;
            int x7 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            boolean z6 = mo1844y(v5) && coordinatorLayout.m970l(v5, x7, y8);
            this.f2673X = z6;
            if (z6) {
                this.f2675Z = y8;
                this.f2674Y = motionEvent.getPointerId(0);
                if (this.f2679x1 == null) {
                    this.f2679x1 = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f2677s;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f2677s.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f2679x1;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo995v(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b3.AbstractC0534d.mo995v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: y */
    public boolean mo1844y(V v5) {
        return false;
    }

    /* renamed from: z */
    public int mo1845z(V v5) {
        return -v5.getHeight();
    }
}
