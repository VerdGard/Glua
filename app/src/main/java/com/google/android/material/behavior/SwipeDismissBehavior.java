package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C0843e;
import com.google.android.material.snackbar.C0845g;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p090l0.C1486c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0289c<V> {

    /* renamed from: c */
    public C1486c f3827c;

    /* renamed from: e */
    public InterfaceC0748b f3828e;

    /* renamed from: m */
    public boolean f3829m;

    /* renamed from: s */
    public boolean f3830s;

    /* renamed from: X */
    public int f3824X = 2;

    /* renamed from: Y */
    public final float f3825Y = 0.5f;

    /* renamed from: Z */
    public float f3826Z = 0.0f;

    /* renamed from: w1 */
    public float f3831w1 = 0.5f;

    /* renamed from: x1 */
    public final C0747a f3832x1 = new C0747a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C0747a extends C1486c.c {

        /* renamed from: a */
        public int f3833a;

        /* renamed from: b */
        public int f3834b = -1;

        public C0747a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            r0 = r3.f3833a - r4.getWidth();
            r4 = r3.f3833a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        
            if (r0 != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            r0 = r3.f3833a;
            r4 = r4.getWidth() + r0;
         */
        @Override // p090l0.C1486c.c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int mo1060a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, e0.h0> r0 = p034e0.C0946x.f4876a
                int r0 = p034e0.C0946x.e.m2847d(r4)
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f3824X
                if (r2 != 0) goto L15
                if (r0 == 0) goto L19
                goto L21
            L15:
                if (r2 != r1) goto L2b
                if (r0 == 0) goto L21
            L19:
                int r0 = r3.f3833a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L39
            L21:
                int r0 = r3.f3833a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f3833a
                goto L39
            L2b:
                int r0 = r3.f3833a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f3833a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L39:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0747a.mo1060a(android.view.View, int):int");
        }

        @Override // p090l0.C1486c.c
        /* renamed from: b */
        public final int mo1061b(View view, int i7) {
            return view.getTop();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: c */
        public final int mo1062c(View view) {
            return view.getWidth();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: g */
        public final void mo1065g(View view, int i7) {
            this.f3834b = i7;
            this.f3833a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f3830s = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f3830s = false;
            }
        }

        @Override // p090l0.C1486c.c
        /* renamed from: h */
        public final void mo1066h(int i7) {
            InterfaceC0748b interfaceC0748b = SwipeDismissBehavior.this.f3828e;
            if (interfaceC0748b != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((C0843e) interfaceC0748b).f4449a;
                if (i7 != 0) {
                    if (i7 == 1 || i7 == 2) {
                        C0845g.m2501b().m2504d(baseTransientBottomBar.f4422t);
                        return;
                    }
                    return;
                }
                C0845g m2501b = C0845g.m2501b();
                BaseTransientBottomBar.C0836c c0836c = baseTransientBottomBar.f4422t;
                synchronized (m2501b.f4452a) {
                    if (m2501b.m2503c(c0836c)) {
                        C0845g.c cVar = m2501b.f4454c;
                        if (cVar.f4459c) {
                            cVar.f4459c = false;
                            m2501b.m2506f(cVar);
                        }
                    }
                }
            }
        }

        @Override // p090l0.C1486c.c
        /* renamed from: i */
        public final void mo1067i(View view, int i7, int i8) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f7 = width * swipeDismissBehavior.f3826Z;
            float width2 = view.getWidth() * swipeDismissBehavior.f3831w1;
            float abs = Math.abs(i7 - this.f3833a);
            if (abs <= f7) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f7) / (width2 - f7))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.f3833a) >= java.lang.Math.round(r9.getWidth() * r2.f3825Y)) goto L27;
         */
        @Override // p090l0.C1486c.c
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo1068j(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f3834b = r11
                int r11 = r9.getWidth()
                r0 = 0
                r1 = 0
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3 = 1
                int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r4 == 0) goto L39
                java.util.WeakHashMap<android.view.View, e0.h0> r5 = p034e0.C0946x.f4876a
                int r5 = p034e0.C0946x.e.m2847d(r9)
                if (r5 != r3) goto L1a
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                int r6 = r2.f3824X
                r7 = 2
                if (r6 != r7) goto L21
                goto L53
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r4 >= 0) goto L55
                goto L53
            L2a:
                if (r4 <= 0) goto L55
                goto L53
            L2d:
                if (r6 != r3) goto L55
                if (r5 == 0) goto L34
                if (r4 <= 0) goto L55
                goto L53
            L34:
                int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r4 >= 0) goto L55
                goto L53
            L39:
                int r4 = r9.getLeft()
                int r5 = r8.f3833a
                int r4 = r4 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r2.f3825Y
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r4 = java.lang.Math.abs(r4)
                if (r4 < r5) goto L55
            L53:
                r4 = 1
                goto L56
            L55:
                r4 = 0
            L56:
                if (r4 == 0) goto L6c
                int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r10 < 0) goto L67
                int r10 = r9.getLeft()
                int r0 = r8.f3833a
                if (r10 >= r0) goto L65
                goto L67
            L65:
                int r0 = r0 + r11
                goto L70
            L67:
                int r10 = r8.f3833a
                int r0 = r10 - r11
                goto L70
            L6c:
                int r10 = r8.f3833a
                r0 = r10
                r3 = 0
            L70:
                l0.c r10 = r2.f3827c
                int r11 = r9.getTop()
                boolean r10 = r10.m3909q(r0, r11)
                if (r10 == 0) goto L87
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r3)
                java.util.WeakHashMap<android.view.View, e0.h0> r11 = p034e0.C0946x.f4876a
                p034e0.C0946x.d.m2837m(r9, r10)
                goto L92
            L87:
                if (r3 == 0) goto L92
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r2.f3828e
                if (r10 == 0) goto L92
                com.google.android.material.snackbar.e r10 = (com.google.android.material.snackbar.C0843e) r10
                r10.m2500a(r9)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0747a.mo1068j(android.view.View, float, float):void");
        }

        @Override // p090l0.C1486c.c
        /* renamed from: k */
        public final boolean mo1069k(View view, int i7) {
            int i8 = this.f3834b;
            return (i8 == -1 || i8 == i7) && SwipeDismissBehavior.this.mo2282w(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface InterfaceC0748b {
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class RunnableC0749c implements Runnable {

        /* renamed from: c */
        public final View f3836c;

        /* renamed from: e */
        public final boolean f3837e;

        public RunnableC0749c(View view, boolean z6) {
            this.f3836c = view;
            this.f3837e = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0748b interfaceC0748b;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            C1486c c1486c = swipeDismissBehavior.f3827c;
            View view = this.f3836c;
            if (c1486c != null && c1486c.m3899g()) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2837m(view, this);
            } else {
                if (!this.f3837e || (interfaceC0748b = swipeDismissBehavior.f3828e) == null) {
                    return;
                }
                ((C0843e) interfaceC0748b).m2500a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: k */
    public boolean mo984k(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        boolean z6 = this.f3829m;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z6 = coordinatorLayout.m970l(v5, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3829m = z6;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3829m = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f3827c == null) {
            this.f3827c = new C1486c(coordinatorLayout.getContext(), coordinatorLayout, this.f3832x1);
        }
        return !this.f3830s && this.f3827c.m3910r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    public final boolean mo985l(CoordinatorLayout coordinatorLayout, V v5, int i7) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.d.m2827c(v5) == 0) {
            C0946x.d.m2843s(v5, 1);
            C0946x.m2814o(v5, 1048576);
            C0946x.m2809j(v5, 0);
            if (mo2282w(v5)) {
                C0946x.m2815p(v5, C1151g.a.f5695l, new C0750a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: v */
    public final boolean mo995v(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        if (this.f3827c == null) {
            return false;
        }
        if (this.f3830s && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3827c.m3903k(motionEvent);
        return true;
    }

    /* renamed from: w */
    public boolean mo2282w(View view) {
        return true;
    }
}
