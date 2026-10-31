package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.C0143v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p004a3.C0034a;
import p012b3.AbstractC0534d;
import p012b3.AbstractC0535e;
import p012b3.C0537g;
import p012b3.C0538h;
import p025d.C0872a;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;
import p034e0.InterfaceC0928k;
import p042f0.C1151g;
import p082k0.AbstractC1446a;
import p189y.C2213a;
import p193y3.C2237f;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0288b {

    /* renamed from: P1 */
    public static final int f3753P1 = R$style.Widget_Design_AppBarLayout;

    /* renamed from: A1 */
    public boolean f3754A1;

    /* renamed from: B1 */
    public boolean f3755B1;

    /* renamed from: C1 */
    public boolean f3756C1;

    /* renamed from: D1 */
    public int f3757D1;

    /* renamed from: E1 */
    public WeakReference<View> f3758E1;

    /* renamed from: F1 */
    public final ColorStateList f3759F1;

    /* renamed from: G1 */
    public ValueAnimator f3760G1;

    /* renamed from: H1 */
    public ValueAnimator.AnimatorUpdateListener f3761H1;

    /* renamed from: I1 */
    public final ArrayList f3762I1;

    /* renamed from: J1 */
    public final long f3763J1;

    /* renamed from: K1 */
    public final TimeInterpolator f3764K1;

    /* renamed from: L1 */
    public int[] f3765L1;

    /* renamed from: M1 */
    public Drawable f3766M1;

    /* renamed from: N1 */
    public final float f3767N1;

    /* renamed from: O1 */
    public Behavior f3768O1;

    /* renamed from: c */
    public int f3769c;

    /* renamed from: e */
    public int f3770e;

    /* renamed from: m */
    public int f3771m;

    /* renamed from: s */
    public int f3772s;

    /* renamed from: w1 */
    public boolean f3773w1;

    /* renamed from: x1 */
    public int f3774x1;

    /* renamed from: y1 */
    public C0935n0 f3775y1;

    /* renamed from: z1 */
    public boolean f3776z1;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0534d<T> {

        /* renamed from: A1 */
        public ValueAnimator f3777A1;

        /* renamed from: B1 */
        public C0736b f3778B1;

        /* renamed from: C1 */
        public WeakReference<View> f3779C1;

        /* renamed from: D1 */
        public boolean f3780D1;

        /* renamed from: y1 */
        public int f3781y1;

        /* renamed from: z1 */
        public int f3782z1;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C0735a extends C0908a {
            public C0735a() {
            }

            @Override // p034e0.C0908a
            /* renamed from: d */
            public final void mo134d(View view, C1151g c1151g) {
                this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
                c1151g.m3345j(BaseBehavior.this.f3780D1);
                c1151g.m3342g(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static class C0736b extends AbstractC1446a {
            public static final Parcelable.Creator<C0736b> CREATOR = new a();

            /* renamed from: X */
            public int f3784X;

            /* renamed from: Y */
            public float f3785Y;

            /* renamed from: Z */
            public boolean f3786Z;

            /* renamed from: m */
            public boolean f3787m;

            /* renamed from: s */
            public boolean f3788s;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b$a */
            public class a implements Parcelable.ClassLoaderCreator<C0736b> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new C0736b(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i7) {
                    return new C0736b[i7];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final C0736b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0736b(parcel, classLoader);
                }
            }

            public C0736b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f3787m = parcel.readByte() != 0;
                this.f3788s = parcel.readByte() != 0;
                this.f3784X = parcel.readInt();
                this.f3785Y = parcel.readFloat();
                this.f3786Z = parcel.readByte() != 0;
            }

            public C0736b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p082k0.AbstractC1446a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i7) {
                parcel.writeParcelable(this.f6946c, i7);
                parcel.writeByte(this.f3787m ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f3788s ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f3784X);
                parcel.writeFloat(this.f3785Y);
                parcel.writeByte(this.f3786Z ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: G */
        public static View m2269G(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt instanceof InterfaceC0928k) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void m2270L(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$d r1 = (com.google.android.material.appbar.AppBarLayout.C0740d) r1
                int r1 = r1.f3791a
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                java.util.WeakHashMap<android.view.View, e0.h0> r3 = p034e0.C0946x.f4876a
                int r3 = p034e0.C0946x.d.m2828d(r4)
                if (r9 <= 0) goto L4a
                r9 = r1 & 12
                if (r9 == 0) goto L4a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
                goto L5b
            L4a:
                r9 = r1 & 2
                if (r9 == 0) goto L5d
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
            L5b:
                r8 = 1
                goto L5e
            L5d:
                r8 = 0
            L5e:
                boolean r9 = r7.f3756C1
                if (r9 == 0) goto L6a
                android.view.View r8 = m2269G(r6)
                boolean r8 = r7.m2267e(r8)
            L6a:
                boolean r8 = r7.m2266d(r8)
                if (r10 != 0) goto Lae
                if (r8 == 0) goto Ldb
                p.c r8 = r6.f1410e
                java.lang.Object r8 = r8.f7568b
                l.o r8 = (p089l.C1481o) r8
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.f1412s
                r6.clear()
                if (r8 == 0) goto L88
                r6.addAll(r8)
            L88:
                int r8 = r6.size()
                r9 = 0
            L8d:
                if (r9 >= r8) goto Lac
                java.lang.Object r10 = r6.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f1419a
                boolean r1 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto La9
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r6 = r10.f2684Y
                if (r6 == 0) goto Lac
                r2 = 1
                goto Lac
            La9:
                int r9 = r9 + 1
                goto L8d
            Lac:
                if (r2 == 0) goto Ldb
            Lae:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lbb
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lbb:
                int r6 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r6 < r8) goto Lce
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lce
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lce:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Ldb
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Ldb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m2270L(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // p012b3.AbstractC0534d
        /* renamed from: A */
        public final int mo1839A(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // p012b3.AbstractC0534d
        /* renamed from: B */
        public final int mo1840B() {
            return m1850w() + this.f3781y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p012b3.AbstractC0534d
        /* renamed from: C */
        public final void mo1841C(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m2274J(coordinatorLayout, appBarLayout);
            if (appBarLayout.f3756C1) {
                appBarLayout.m2266d(appBarLayout.m2267e(m2269G(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
        @Override // p012b3.AbstractC0534d
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int mo1842D(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1842D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: F */
        public final void m2271F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            int abs = Math.abs(mo1840B() - i7);
            float abs2 = Math.abs(0.0f);
            float f7 = abs;
            int round = abs2 > 0.0f ? Math.round((f7 / abs2) * 1000.0f) * 3 : (int) (((f7 / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int mo1840B = mo1840B();
            if (mo1840B == i7) {
                ValueAnimator valueAnimator = this.f3777A1;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f3777A1.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f3777A1;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f3777A1 = valueAnimator3;
                valueAnimator3.setInterpolator(C0034a.f112e);
                this.f3777A1.addUpdateListener(new C0742a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f3777A1.setDuration(Math.min(round, 600));
            this.f3777A1.setIntValues(mo1840B, i7);
            this.f3777A1.start();
        }

        /* renamed from: H */
        public final void m2272H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int[] iArr) {
            int i8;
            int i9;
            if (i7 != 0) {
                if (i7 < 0) {
                    int i10 = -appBarLayout.getTotalScrollRange();
                    i8 = i10;
                    i9 = appBarLayout.getDownNestedPreScrollRange() + i10;
                } else {
                    i8 = -appBarLayout.getUpNestedPreScrollRange();
                    i9 = 0;
                }
                if (i8 != i9) {
                    iArr[1] = mo1842D(coordinatorLayout, appBarLayout, mo1840B() - i7, i8, i9);
                }
            }
            if (appBarLayout.f3756C1) {
                appBarLayout.m2266d(appBarLayout.m2267e(view));
            }
        }

        /* renamed from: I */
        public final C0736b m2273I(Parcelable parcelable, T t7) {
            int m1850w = m1850w();
            int childCount = t7.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = t7.getChildAt(i7);
                int bottom = childAt.getBottom() + m1850w;
                if (childAt.getTop() + m1850w <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC1446a.f6945e;
                    }
                    C0736b c0736b = new C0736b(parcelable);
                    boolean z6 = m1850w == 0;
                    c0736b.f3788s = z6;
                    c0736b.f3787m = !z6 && (-m1850w) >= t7.getTotalScrollRange();
                    c0736b.f3784X = i7;
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    c0736b.f3786Z = bottom == t7.getTopInset() + C0946x.d.m2828d(childAt);
                    c0736b.f3785Y = bottom / childAt.getHeight();
                    return c0736b;
                }
            }
            return null;
        }

        /* renamed from: J */
        public final void m2274J(CoordinatorLayout coordinatorLayout, T t7) {
            int paddingTop = t7.getPaddingTop() + t7.getTopInset();
            int mo1840B = mo1840B() - paddingTop;
            int childCount = t7.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    i7 = -1;
                    break;
                }
                View childAt = t7.getChildAt(i7);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0740d c0740d = (C0740d) childAt.getLayoutParams();
                if ((c0740d.f3791a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c0740d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c0740d).bottomMargin;
                }
                int i8 = -mo1840B;
                if (top <= i8 && bottom >= i8) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 >= 0) {
                View childAt2 = t7.getChildAt(i7);
                C0740d c0740d2 = (C0740d) childAt2.getLayoutParams();
                int i9 = c0740d2.f3791a;
                if ((i9 & 17) == 17) {
                    int i10 = -childAt2.getTop();
                    int i11 = -childAt2.getBottom();
                    if (i7 == 0) {
                        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                        if (C0946x.d.m2826b(t7) && C0946x.d.m2826b(childAt2)) {
                            i10 -= t7.getTopInset();
                        }
                    }
                    if ((i9 & 2) == 2) {
                        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                        i11 += C0946x.d.m2828d(childAt2);
                    } else {
                        if ((i9 & 5) == 5) {
                            WeakHashMap<View, C0923h0> weakHashMap3 = C0946x.f4876a;
                            int m2828d = C0946x.d.m2828d(childAt2) + i11;
                            if (mo1840B < m2828d) {
                                i10 = m2828d;
                            } else {
                                i11 = m2828d;
                            }
                        }
                    }
                    if ((i9 & 32) == 32) {
                        i10 += ((LinearLayout.LayoutParams) c0740d2).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) c0740d2).bottomMargin;
                    }
                    if (mo1840B < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    m2271F(coordinatorLayout, t7, C0143v.m460r(i10 + paddingTop, -t7.getTotalScrollRange(), 0));
                }
            }
        }

        /* renamed from: K */
        public final void m2275K(CoordinatorLayout coordinatorLayout, T t7) {
            View view;
            boolean z6;
            boolean z7;
            C0946x.m2814o(coordinatorLayout, C1151g.a.f5691h.m3347a());
            boolean z8 = false;
            C0946x.m2809j(coordinatorLayout, 0);
            C0946x.m2814o(coordinatorLayout, C1151g.a.f5692i.m3347a());
            C0946x.m2809j(coordinatorLayout, 0);
            if (t7.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    view = null;
                    break;
                }
                view = coordinatorLayout.getChildAt(i7);
                if (((CoordinatorLayout.C0292f) view.getLayoutParams()).f1419a instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i7++;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t7.getChildCount();
            int i8 = 0;
            while (true) {
                z6 = true;
                if (i8 >= childCount2) {
                    z7 = false;
                    break;
                } else {
                    if (((C0740d) t7.getChildAt(i8).getLayoutParams()).f3791a != 0) {
                        z7 = true;
                        break;
                    }
                    i8++;
                }
            }
            if (z7) {
                if (!(C0946x.m2803d(coordinatorLayout) != null)) {
                    C0946x.m2817r(coordinatorLayout, new C0735a());
                }
                if (mo1840B() != (-t7.getTotalScrollRange())) {
                    C0946x.m2815p(coordinatorLayout, C1151g.a.f5691h, new C0744c(t7, false));
                    z8 = true;
                }
                if (mo1840B() != 0) {
                    if (view2.canScrollVertically(-1)) {
                        int i9 = -t7.getDownNestedPreScrollRange();
                        if (i9 != 0) {
                            C0946x.m2815p(coordinatorLayout, C1151g.a.f5692i, new C0743b(this, coordinatorLayout, t7, view2, i9));
                        }
                    } else {
                        C0946x.m2815p(coordinatorLayout, C1151g.a.f5692i, new C0744c(t7, true));
                    }
                    this.f3780D1 = z6;
                }
                z6 = z8;
                this.f3780D1 = z6;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p012b3.C0536f, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: l */
        public final boolean mo985l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            int i8;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo985l(coordinatorLayout, appBarLayout, i7);
            int pendingAction = appBarLayout.getPendingAction();
            C0736b c0736b = this.f3778B1;
            if (c0736b == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i8 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            m2271F(coordinatorLayout, appBarLayout, i8);
                        }
                        m1843E(coordinatorLayout, appBarLayout, i8);
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            m2271F(coordinatorLayout, appBarLayout, 0);
                        }
                        m1843E(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (c0736b.f3787m) {
                i8 = -appBarLayout.getTotalScrollRange();
                m1843E(coordinatorLayout, appBarLayout, i8);
            } else {
                if (!c0736b.f3788s) {
                    View childAt = appBarLayout.getChildAt(c0736b.f3784X);
                    int i9 = -childAt.getBottom();
                    m1843E(coordinatorLayout, appBarLayout, this.f3778B1.f3786Z ? appBarLayout.getTopInset() + C0946x.d.m2828d(childAt) + i9 : Math.round(childAt.getHeight() * this.f3778B1.f3785Y) + i9);
                }
                m1843E(coordinatorLayout, appBarLayout, 0);
            }
            appBarLayout.f3774x1 = 0;
            this.f3778B1 = null;
            int m460r = C0143v.m460r(m1850w(), -appBarLayout.getTotalScrollRange(), 0);
            C0537g c0537g = this.f2687c;
            if (c0537g == null) {
                this.f2688e = m460r;
            } else if (c0537g.f2692d != m460r) {
                c0537g.f2692d = m460r;
                c0537g.m1851a();
            }
            m2270L(coordinatorLayout, appBarLayout, m1850w(), 0, true);
            appBarLayout.f3769c = m1850w();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2835k(appBarLayout);
            }
            m2275K(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: m */
        public final boolean mo986m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0292f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m973r(appBarLayout, i7, i8, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ void mo988o(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
            m2272H(coordinatorLayout, (AppBarLayout) view, view2, i8, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: p */
        public final void mo989p(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i9 < 0) {
                iArr[1] = mo1842D(coordinatorLayout, appBarLayout, mo1840B() - i9, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i9 == 0) {
                m2275K(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: r */
        public final void mo991r(View view, Parcelable parcelable) {
            if (!(parcelable instanceof C0736b)) {
                this.f3778B1 = null;
            } else {
                C0736b c0736b = this.f3778B1;
                this.f3778B1 = (C0736b) parcelable;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: s */
        public final Parcelable mo992s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            C0736b m2273I = m2273I(absSavedState, (AppBarLayout) view);
            return m2273I == null ? absSavedState : m2273I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L16;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo993t(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f3756C1
                r0 = 1
                if (r5 != 0) goto L2b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
            L2b:
                r6 = 1
            L2c:
                if (r6 == 0) goto L35
                android.animation.ValueAnimator r2 = r1.f3777A1
                if (r2 == 0) goto L35
                r2.cancel()
            L35:
                r2 = 0
                r1.f3779C1 = r2
                r1.f3782z1 = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo993t(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: u */
        public final void mo994u(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f3782z1 == 0 || i7 == 1) {
                m2274J(coordinatorLayout, appBarLayout);
                if (appBarLayout.f3756C1) {
                    appBarLayout.m2266d(appBarLayout.m2267e(view2));
                }
            }
            this.f3779C1 = new WeakReference<>(view2);
        }

        @Override // p012b3.AbstractC0534d
        /* renamed from: y */
        public final boolean mo1844y(View view) {
            View view2;
            WeakReference<View> weakReference = this.f3779C1;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // p012b3.AbstractC0534d
        /* renamed from: z */
        public final int mo1845z(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC0535e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3751y);
            this.f2684Y = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // p012b3.AbstractC0535e
        /* renamed from: A */
        public final int mo1846A(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: f */
        public final boolean mo979f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: h */
        public boolean mo981h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int m460r;
            CoordinatorLayout.AbstractC0289c abstractC0289c = ((CoordinatorLayout.C0292f) view2.getLayoutParams()).f1419a;
            if (abstractC0289c instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0289c).f3781y1 + this.f2683X;
                if (this.f2684Y == 0) {
                    m460r = 0;
                } else {
                    float mo1849z = mo1849z(view2);
                    int i7 = this.f2684Y;
                    m460r = C0143v.m460r((int) (mo1849z * i7), 0, i7);
                }
                C0946x.m2811l(view, bottom - m460r);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f3756C1) {
                    appBarLayout.m2266d(appBarLayout.m2267e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: i */
        public final void mo982i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                C0946x.m2814o(coordinatorLayout, C1151g.a.f5691h.m3347a());
                C0946x.m2809j(coordinatorLayout, 0);
                C0946x.m2814o(coordinatorLayout, C1151g.a.f5692i.m3347a());
                C0946x.m2809j(coordinatorLayout, 0);
                C0946x.m2817r(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: q */
        public final boolean mo990q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            AppBarLayout appBarLayout;
            ArrayList m967d = coordinatorLayout.m967d(view);
            int size = m967d.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) m967d.get(i7);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i7++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f2685m;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.m2265c(false, !z6, true);
                    return true;
                }
            }
            return false;
        }

        @Override // p012b3.AbstractC0535e
        /* renamed from: y */
        public final AppBarLayout mo1848y(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) arrayList.get(i7);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p012b3.AbstractC0535e
        /* renamed from: z */
        public final float mo1849z(View view) {
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC0289c abstractC0289c = ((CoordinatorLayout.C0292f) appBarLayout.getLayoutParams()).f1419a;
                int mo1840B = abstractC0289c instanceof BaseBehavior ? ((BaseBehavior) abstractC0289c).mo1840B() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + mo1840B > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (mo1840B / i7) + 1.0f;
                }
            }
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static abstract class AbstractC0737a {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static class C0738b extends AbstractC0737a {

        /* renamed from: a */
        public final Rect f3789a = new Rect();

        /* renamed from: b */
        public final Rect f3790b = new Rect();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C0739c {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static ColorStateList m2277b(Drawable drawable) {
            ColorStateList colorStateList;
            if (!(drawable instanceof ColorStateListDrawable)) {
                return null;
            }
            colorStateList = ((ColorStateListDrawable) drawable).getColorStateList();
            return colorStateList;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C0740d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f3791a;

        /* renamed from: b */
        public C0738b f3792b;

        /* renamed from: c */
        public final Interpolator f3793c;

        public C0740d() {
            super(-1, -2);
            this.f3791a = 1;
        }

        public C0740d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3791a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3728b);
            this.f3791a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f3792b = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new C0738b();
            int i7 = R$styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.f3793c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i7, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0740d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3791a = 1;
        }

        public C0740d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3791a = 1;
        }

        public C0740d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3791a = 1;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface InterfaceC0741e {
        /* renamed from: a */
        void m2278a();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public static C0740d m2263a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C0740d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0740d((ViewGroup.MarginLayoutParams) layoutParams) : new C0740d(layoutParams);
    }

    private ColorStateList getBackgroundCSL() {
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) background).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return C0739c.m2277b(background);
        }
        return null;
    }

    /* renamed from: b */
    public final void m2264b() {
        Behavior behavior = this.f3768O1;
        BaseBehavior.C0736b m2273I = (behavior == null || this.f3770e == -1 || this.f3774x1 != 0) ? null : behavior.m2273I(AbstractC1446a.f6945e, this);
        this.f3770e = -1;
        this.f3771m = -1;
        this.f3772s = -1;
        if (m2273I != null) {
            Behavior behavior2 = this.f3768O1;
            if (behavior2.f3778B1 != null) {
                return;
            }
            behavior2.f3778B1 = m2273I;
        }
    }

    /* renamed from: c */
    public final void m2265c(boolean z6, boolean z7, boolean z8) {
        this.f3774x1 = (z6 ? 1 : 2) | (z7 ? 4 : 0) | (z8 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0740d;
    }

    /* renamed from: d */
    public final boolean m2266d(boolean z6) {
        float f7;
        if (!(!this.f3776z1) || this.f3755B1 == z6) {
            return false;
        }
        this.f3755B1 = z6;
        refreshDrawableState();
        if (!this.f3756C1 || !(getBackground() instanceof C2237f)) {
            return true;
        }
        float f8 = 0.0f;
        if (this.f3759F1 != null) {
            f7 = z6 ? 0.0f : 255.0f;
            if (z6) {
                f8 = 255.0f;
            }
        } else {
            float f9 = this.f3767N1;
            f7 = z6 ? 0.0f : f9;
            if (z6) {
                f8 = f9;
            }
        }
        ValueAnimator valueAnimator = this.f3760G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f8);
        this.f3760G1 = ofFloat;
        ofFloat.setDuration(this.f3763J1);
        this.f3760G1.setInterpolator(this.f3764K1);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f3761H1;
        if (animatorUpdateListener != null) {
            this.f3760G1.addUpdateListener(animatorUpdateListener);
        }
        this.f3760G1.start();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3766M1 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f3769c);
            this.f3766M1.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3766M1;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final boolean m2267e(View view) {
        int i7;
        if (this.f3758E1 == null && (i7 = this.f3757D1) != -1) {
            View findViewById = view != null ? view.findViewById(i7) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f3757D1);
            }
            if (findViewById != null) {
                this.f3758E1 = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f3758E1;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: f */
    public final boolean m2268f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return !C0946x.d.m2826b(childAt);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0740d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0740d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2263a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2263a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0288b
    public CoordinatorLayout.AbstractC0289c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f3768O1 = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f3771m
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$d r4 = (com.google.android.material.appbar.AppBarLayout.C0740d) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3791a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, e0.h0> r4 = p034e0.C0946x.f4876a
            int r4 = p034e0.C0946x.d.m2828d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, e0.h0> r4 = p034e0.C0946x.f4876a
            int r4 = p034e0.C0946x.d.m2828d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap<android.view.View, e0.h0> r6 = p034e0.C0946x.f4876a
            boolean r3 = p034e0.C0946x.d.m2826b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f3771m = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i7 = this.f3772s;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0740d c0740d = (C0740d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c0740d).topMargin + ((LinearLayout.LayoutParams) c0740d).bottomMargin + childAt.getMeasuredHeight();
                int i10 = c0740d.f3791a;
                if ((i10 & 1) == 0) {
                    break;
                }
                i9 += measuredHeight;
                if ((i10 & 2) != 0) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    i9 -= C0946x.d.m2828d(childAt);
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.f3772s = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f3757D1;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int m2828d = C0946x.d.m2828d(this);
        if (m2828d == 0) {
            int childCount = getChildCount();
            m2828d = childCount >= 1 ? C0946x.d.m2828d(getChildAt(childCount - 1)) : 0;
            if (m2828d == 0) {
                return getHeight() / 3;
            }
        }
        return (m2828d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f3774x1;
    }

    public Drawable getStatusBarForeground() {
        return this.f3766M1;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C0935n0 c0935n0 = this.f3775y1;
        if (c0935n0 != null) {
            return c0935n0.m2754e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.f3770e;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0740d c0740d = (C0740d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = c0740d.f3791a;
                if ((i10 & 1) == 0) {
                    break;
                }
                int i11 = measuredHeight + ((LinearLayout.LayoutParams) c0740d).topMargin + ((LinearLayout.LayoutParams) c0740d).bottomMargin + i9;
                if (i8 == 0) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    if (C0946x.d.m2826b(childAt)) {
                        i11 -= getTopInset();
                    }
                }
                i9 = i11;
                if ((i10 & 2) != 0) {
                    WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                    i9 -= C0946x.d.m2828d(childAt);
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.f3770e = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m77Q(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        if (this.f3765L1 == null) {
            this.f3765L1 = new int[4];
        }
        int[] iArr = this.f3765L1;
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z6 = this.f3754A1;
        int i8 = R$attr.state_liftable;
        if (!z6) {
            i8 = -i8;
        }
        iArr[0] = i8;
        iArr[1] = (z6 && this.f3755B1) ? R$attr.state_lifted : -R$attr.state_lifted;
        int i9 = R$attr.state_collapsible;
        if (!z6) {
            i9 = -i9;
        }
        iArr[2] = i9;
        iArr[3] = (z6 && this.f3755B1) ? R$attr.state_collapsed : -R$attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f3758E1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3758E1 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean z7;
        super.onLayout(z6, i7, i8, i9, i10);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z8 = true;
        if (C0946x.d.m2826b(this) && m2268f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0946x.m2811l(getChildAt(childCount), topInset);
            }
        }
        m2264b();
        this.f3773w1 = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            }
            if (((C0740d) getChildAt(i11).getLayoutParams()).f3793c != null) {
                this.f3773w1 = true;
                break;
            }
            i11++;
        }
        Drawable drawable = this.f3766M1;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f3776z1) {
            return;
        }
        if (!this.f3756C1) {
            int childCount3 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount3) {
                    z7 = false;
                    break;
                }
                int i13 = ((C0740d) getChildAt(i12).getLayoutParams()).f3791a;
                if ((i13 & 1) == 1 && (i13 & 10) != 0) {
                    z7 = true;
                    break;
                }
                i12++;
            }
            if (!z7) {
                z8 = false;
            }
        }
        if (this.f3754A1 != z8) {
            this.f3754A1 = z8;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.d.m2826b(this) && m2268f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C0143v.m460r(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i8));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m2264b();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        Drawable background = getBackground();
        if (background instanceof C2237f) {
            ((C2237f) background).m5427j(f7);
        }
    }

    public void setExpanded(boolean z6) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        m2265c(z6, C0946x.g.m2860c(this), true);
    }

    public void setLiftOnScroll(boolean z6) {
        this.f3756C1 = z6;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f3757D1 = -1;
        if (view != null) {
            this.f3758E1 = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f3758E1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3758E1 = null;
    }

    public void setLiftOnScrollTargetViewId(int i7) {
        this.f3757D1 = i7;
        WeakReference<View> weakReference = this.f3758E1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3758E1 = null;
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.f3776z1 = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f3766M1;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3766M1 = mutate;
            boolean z6 = false;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3766M1.setState(getDrawableState());
                }
                Drawable drawable3 = this.f3766M1;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C2213a.m5355c(drawable3, C0946x.e.m2847d(this));
                this.f3766M1.setVisible(getVisibility() == 0, false);
                this.f3766M1.setCallback(this);
            }
            if (this.f3766M1 != null && getTopInset() > 0) {
                z6 = true;
            }
            setWillNotDraw(!z6);
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    public void setStatusBarForegroundColor(int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(int i7) {
        setStatusBarForeground(C0872a.m2561a(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f7) {
        C0538h.m1852a(this, f7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f3766M1;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3766M1;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C0740d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0740d(getContext(), attributeSet);
    }
}
