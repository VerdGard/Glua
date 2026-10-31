package p174w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p174w0.AbstractC2057h;

/* renamed from: w0.y */
/* loaded from: classes.dex */
public abstract class AbstractC2074y extends AbstractC2057h {

    /* renamed from: N1 */
    public static final String[] f9447N1 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: M1 */
    public int f9448M1 = 3;

    /* renamed from: w0.y$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC2057h.d {

        /* renamed from: a */
        public final View f9449a;

        /* renamed from: b */
        public final int f9450b;

        /* renamed from: c */
        public final ViewGroup f9451c;

        /* renamed from: e */
        public boolean f9453e;

        /* renamed from: f */
        public boolean f9454f = false;

        /* renamed from: d */
        public final boolean f9452d = true;

        public a(View view, int i7) {
            this.f9449a = view;
            this.f9450b = i7;
            this.f9451c = (ViewGroup) view.getParent();
            m5133f(true);
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: a */
        public final void mo5092a() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: b */
        public final void mo5086b() {
            m5133f(false);
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: c */
        public final void mo5087c() {
            m5133f(true);
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: d */
        public final void mo5088d() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            if (!this.f9454f) {
                C2067r.f9436a.mo103S(this.f9449a, this.f9450b);
                ViewGroup viewGroup = this.f9451c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5133f(false);
            abstractC2057h.mo5117v(this);
        }

        /* renamed from: f */
        public final void m5133f(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f9452d || this.f9453e == z6 || (viewGroup = this.f9451c) == null) {
                return;
            }
            this.f9453e = z6;
            C2066q.m5125a(viewGroup, z6);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f9454f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f9454f) {
                C2067r.f9436a.mo103S(this.f9449a, this.f9450b);
                ViewGroup viewGroup = this.f9451c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5133f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f9454f) {
                return;
            }
            C2067r.f9436a.mo103S(this.f9449a, this.f9450b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f9454f) {
                return;
            }
            C2067r.f9436a.mo103S(this.f9449a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: w0.y$b */
    public static class b {

        /* renamed from: a */
        public boolean f9455a;

        /* renamed from: b */
        public boolean f9456b;

        /* renamed from: c */
        public int f9457c;

        /* renamed from: d */
        public int f9458d;

        /* renamed from: e */
        public ViewGroup f9459e;

        /* renamed from: f */
        public ViewGroup f9460f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r0.f9459e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r0.f9457c == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p174w0.AbstractC2074y.b m5131I(p174w0.C2064o r8, p174w0.C2064o r9) {
        /*
            w0.y$b r0 = new w0.y$b
            r0.<init>()
            r1 = 0
            r0.f9455a = r1
            r0.f9456b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f9428a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f9457c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f9459e = r6
            goto L33
        L2f:
            r0.f9457c = r4
            r0.f9459e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f9428a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f9458d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f9460f = r2
            goto L56
        L52:
            r0.f9458d = r4
            r0.f9460f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f9457c
            int r9 = r0.f9458d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f9459e
            android.view.ViewGroup r4 = r0.f9460f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f9460f
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f9459e
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f9458d
            if (r8 != 0) goto L83
        L80:
            r0.f9456b = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f9457c
            if (r8 != 0) goto L8d
        L89:
            r0.f9456b = r1
        L8b:
            r0.f9455a = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174w0.AbstractC2074y.m5131I(w0.o, w0.o):w0.y$b");
    }

    /* renamed from: H */
    public final void m5132H(C2064o c2064o) {
        View view = c2064o.f9429b;
        int visibility = view.getVisibility();
        HashMap hashMap = c2064o.f9428a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: d */
    public final void mo5082d(C2064o c2064o) {
        m5132H(c2064o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (m5131I(m5112n(r3, false), m5113q(r3, false)).f9455a != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    @Override // p174w0.AbstractC2057h
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo5084k(android.view.ViewGroup r24, p174w0.C2064o r25, p174w0.C2064o r26) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p174w0.AbstractC2074y.mo5084k(android.view.ViewGroup, w0.o, w0.o):android.animation.Animator");
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: p */
    public final String[] mo5085p() {
        return f9447N1;
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: r */
    public final boolean mo5114r(C2064o c2064o, C2064o c2064o2) {
        if (c2064o == null && c2064o2 == null) {
            return false;
        }
        if (c2064o != null && c2064o2 != null && c2064o2.f9428a.containsKey("android:visibility:visibility") != c2064o.f9428a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b m5131I = m5131I(c2064o, c2064o2);
        if (m5131I.f9455a) {
            return m5131I.f9457c == 0 || m5131I.f9458d == 0;
        }
        return false;
    }
}
