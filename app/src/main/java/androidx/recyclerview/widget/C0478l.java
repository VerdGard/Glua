package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public final class C0478l extends RecyclerView.AbstractC0443l implements RecyclerView.InterfaceC0447p {

    /* renamed from: C */
    public static final int[] f2421C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f2422D = new int[0];

    /* renamed from: A */
    public int f2423A;

    /* renamed from: B */
    public final a f2424B;

    /* renamed from: a */
    public final int f2425a;

    /* renamed from: b */
    public final int f2426b;

    /* renamed from: c */
    public final StateListDrawable f2427c;

    /* renamed from: d */
    public final Drawable f2428d;

    /* renamed from: e */
    public final int f2429e;

    /* renamed from: f */
    public final int f2430f;

    /* renamed from: g */
    public final StateListDrawable f2431g;

    /* renamed from: h */
    public final Drawable f2432h;

    /* renamed from: i */
    public final int f2433i;

    /* renamed from: j */
    public final int f2434j;

    /* renamed from: k */
    public int f2435k;

    /* renamed from: l */
    public int f2436l;

    /* renamed from: m */
    public float f2437m;

    /* renamed from: n */
    public int f2438n;

    /* renamed from: o */
    public int f2439o;

    /* renamed from: p */
    public float f2440p;

    /* renamed from: s */
    public RecyclerView f2443s;

    /* renamed from: z */
    public final ValueAnimator f2450z;

    /* renamed from: q */
    public int f2441q = 0;

    /* renamed from: r */
    public int f2442r = 0;

    /* renamed from: t */
    public boolean f2444t = false;

    /* renamed from: u */
    public boolean f2445u = false;

    /* renamed from: v */
    public int f2446v = 0;

    /* renamed from: w */
    public int f2447w = 0;

    /* renamed from: x */
    public final int[] f2448x = new int[2];

    /* renamed from: y */
    public final int[] f2449y = new int[2];

    /* renamed from: androidx.recyclerview.widget.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0478l c0478l = C0478l.this;
            int i7 = c0478l.f2423A;
            ValueAnimator valueAnimator = c0478l.f2450z;
            if (i7 == 1) {
                valueAnimator.cancel();
            } else if (i7 != 2) {
                return;
            }
            c0478l.f2423A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    public class b extends RecyclerView.AbstractC0448q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0448q
        /* renamed from: b */
        public final void mo1658b(RecyclerView recyclerView, int i7, int i8) {
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C0478l c0478l = C0478l.this;
            int computeVerticalScrollRange = c0478l.f2443s.computeVerticalScrollRange();
            int i9 = c0478l.f2442r;
            int i10 = computeVerticalScrollRange - i9;
            int i11 = c0478l.f2425a;
            c0478l.f2444t = i10 > 0 && i9 >= i11;
            int computeHorizontalScrollRange = c0478l.f2443s.computeHorizontalScrollRange();
            int i12 = c0478l.f2441q;
            boolean z6 = computeHorizontalScrollRange - i12 > 0 && i12 >= i11;
            c0478l.f2445u = z6;
            boolean z7 = c0478l.f2444t;
            if (!z7 && !z6) {
                if (c0478l.f2446v != 0) {
                    c0478l.m1775i(0);
                    return;
                }
                return;
            }
            if (z7) {
                float f7 = i9;
                c0478l.f2436l = (int) ((((f7 / 2.0f) + computeVerticalScrollOffset) * f7) / computeVerticalScrollRange);
                c0478l.f2435k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
            }
            if (c0478l.f2445u) {
                float f8 = computeHorizontalScrollOffset;
                float f9 = i12;
                c0478l.f2439o = (int) ((((f9 / 2.0f) + f8) * f9) / computeHorizontalScrollRange);
                c0478l.f2438n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
            }
            int i13 = c0478l.f2446v;
            if (i13 == 0 || i13 == 1) {
                c0478l.m1775i(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2453a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2453a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2453a) {
                this.f2453a = false;
                return;
            }
            C0478l c0478l = C0478l.this;
            if (((Float) c0478l.f2450z.getAnimatedValue()).floatValue() == 0.0f) {
                c0478l.f2423A = 0;
                c0478l.m1775i(0);
            } else {
                c0478l.f2423A = 2;
                c0478l.f2443s.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0478l c0478l = C0478l.this;
            c0478l.f2427c.setAlpha(floatValue);
            c0478l.f2428d.setAlpha(floatValue);
            c0478l.f2443s.invalidate();
        }
    }

    public C0478l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2450z = ofFloat;
        this.f2423A = 0;
        a aVar = new a();
        this.f2424B = aVar;
        b bVar = new b();
        this.f2427c = stateListDrawable;
        this.f2428d = drawable;
        this.f2431g = stateListDrawable2;
        this.f2432h = drawable2;
        this.f2429e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f2430f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f2433i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f2434j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f2425a = i8;
        this.f2426b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2443s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC0444m abstractC0444m = recyclerView2.f2114E1;
            if (abstractC0444m != null) {
                abstractC0444m.mo1491c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList<RecyclerView.AbstractC0443l> arrayList = recyclerView2.f2116F1;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1529M();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2443s;
            recyclerView3.f2118G1.remove(this);
            if (recyclerView3.f2120H1 == this) {
                recyclerView3.f2120H1 = null;
            }
            ArrayList arrayList2 = this.f2443s.f2166v2;
            if (arrayList2 != null) {
                arrayList2.remove(bVar);
            }
            this.f2443s.removeCallbacks(aVar);
        }
        this.f2443s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1548g(this);
            this.f2443s.f2118G1.add(this);
            this.f2443s.m1549h(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r9 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r5 >= 0) goto L49;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0447p
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1654a(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0478l.mo1654a(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0447p
    /* renamed from: b */
    public final boolean mo1655b(MotionEvent motionEvent) {
        int i7 = this.f2446v;
        if (i7 == 1) {
            boolean m1773g = m1773g(motionEvent.getX(), motionEvent.getY());
            boolean m1772f = m1772f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (m1773g || m1772f)) {
                if (m1772f) {
                    this.f2447w = 1;
                    this.f2440p = (int) motionEvent.getX();
                } else if (m1773g) {
                    this.f2447w = 2;
                    this.f2437m = (int) motionEvent.getY();
                }
                m1775i(2);
                return true;
            }
        } else if (i7 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0447p
    /* renamed from: c */
    public final void mo1656c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0443l
    /* renamed from: e */
    public final void mo1606e(Canvas canvas, RecyclerView recyclerView) {
        int i7;
        if (this.f2441q != this.f2443s.getWidth() || this.f2442r != this.f2443s.getHeight()) {
            this.f2441q = this.f2443s.getWidth();
            this.f2442r = this.f2443s.getHeight();
            m1775i(0);
            return;
        }
        if (this.f2423A != 0) {
            if (this.f2444t) {
                int i8 = this.f2441q;
                int i9 = this.f2429e;
                int i10 = i8 - i9;
                int i11 = this.f2436l;
                int i12 = this.f2435k;
                int i13 = i11 - (i12 / 2);
                StateListDrawable stateListDrawable = this.f2427c;
                stateListDrawable.setBounds(0, 0, i9, i12);
                int i14 = this.f2442r;
                int i15 = this.f2430f;
                Drawable drawable = this.f2428d;
                drawable.setBounds(0, 0, i15, i14);
                RecyclerView recyclerView2 = this.f2443s;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (C0946x.e.m2847d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i9, i13);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i7 = -i9;
                } else {
                    canvas.translate(i10, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i13);
                    stateListDrawable.draw(canvas);
                    i7 = -i10;
                }
                canvas.translate(i7, -i13);
            }
            if (this.f2445u) {
                int i16 = this.f2442r;
                int i17 = this.f2433i;
                int i18 = i16 - i17;
                int i19 = this.f2439o;
                int i20 = this.f2438n;
                int i21 = i19 - (i20 / 2);
                StateListDrawable stateListDrawable2 = this.f2431g;
                stateListDrawable2.setBounds(0, 0, i20, i17);
                int i22 = this.f2441q;
                int i23 = this.f2434j;
                Drawable drawable2 = this.f2432h;
                drawable2.setBounds(0, 0, i22, i23);
                canvas.translate(0.0f, i18);
                drawable2.draw(canvas);
                canvas.translate(i21, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i21, -i18);
            }
        }
    }

    /* renamed from: f */
    public final boolean m1772f(float f7, float f8) {
        if (f8 >= this.f2442r - this.f2433i) {
            int i7 = this.f2439o;
            int i8 = this.f2438n;
            if (f7 >= i7 - (i8 / 2) && f7 <= (i8 / 2) + i7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m1773g(float f7, float f8) {
        RecyclerView recyclerView = this.f2443s;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z6 = C0946x.e.m2847d(recyclerView) == 1;
        int i7 = this.f2429e;
        if (z6) {
            if (f7 > i7 / 2) {
                return false;
            }
        } else if (f7 < this.f2441q - i7) {
            return false;
        }
        int i8 = this.f2436l;
        int i9 = this.f2435k / 2;
        return f8 >= ((float) (i8 - i9)) && f8 <= ((float) (i9 + i8));
    }

    /* renamed from: h */
    public final void m1774h(int i7) {
        RecyclerView recyclerView = this.f2443s;
        a aVar = this.f2424B;
        recyclerView.removeCallbacks(aVar);
        this.f2443s.postDelayed(aVar, i7);
    }

    /* renamed from: i */
    public final void m1775i(int i7) {
        int i8;
        StateListDrawable stateListDrawable = this.f2427c;
        if (i7 == 2 && this.f2446v != 2) {
            stateListDrawable.setState(f2421C);
            this.f2443s.removeCallbacks(this.f2424B);
        }
        if (i7 == 0) {
            this.f2443s.invalidate();
        } else {
            m1776j();
        }
        if (this.f2446v != 2 || i7 == 2) {
            i8 = i7 == 1 ? 1500 : 1200;
            this.f2446v = i7;
        }
        stateListDrawable.setState(f2422D);
        m1774h(i8);
        this.f2446v = i7;
    }

    /* renamed from: j */
    public final void m1776j() {
        int i7 = this.f2423A;
        ValueAnimator valueAnimator = this.f2450z;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2423A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
