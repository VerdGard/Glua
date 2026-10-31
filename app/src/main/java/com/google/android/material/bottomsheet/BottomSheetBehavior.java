package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.ext.C0090b;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0117b;
import androidx.activity.C0143v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p029d3.C0885d;
import p029d3.C0887f;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p082k0.AbstractC1446a;
import p090l0.C1486c;
import p121p0.C1690b;
import p139r3.C1827e;
import p139r3.C1828f;
import p139r3.InterfaceC1824b;
import p163u3.C1972c;
import p193y3.C2237f;
import p193y3.C2240i;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0289c<V> implements InterfaceC1824b {

    /* renamed from: u2 */
    public static final int f3865u2 = R$style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A1 */
    public int f3866A1;

    /* renamed from: B1 */
    public int f3867B1;

    /* renamed from: C1 */
    public boolean f3868C1;

    /* renamed from: D1 */
    public final boolean f3869D1;

    /* renamed from: E1 */
    public final boolean f3870E1;

    /* renamed from: F1 */
    public final boolean f3871F1;

    /* renamed from: G1 */
    public final boolean f3872G1;

    /* renamed from: H1 */
    public final boolean f3873H1;

    /* renamed from: I1 */
    public final boolean f3874I1;

    /* renamed from: J1 */
    public final boolean f3875J1;

    /* renamed from: K1 */
    public int f3876K1;

    /* renamed from: L1 */
    public int f3877L1;

    /* renamed from: M1 */
    public final boolean f3878M1;

    /* renamed from: N1 */
    public final C2240i f3879N1;

    /* renamed from: O1 */
    public boolean f3880O1;

    /* renamed from: P1 */
    public final BottomSheetBehavior<V>.C0759f f3881P1;

    /* renamed from: Q1 */
    public ValueAnimator f3882Q1;

    /* renamed from: R1 */
    public int f3883R1;

    /* renamed from: S1 */
    public int f3884S1;

    /* renamed from: T1 */
    public int f3885T1;

    /* renamed from: U1 */
    public float f3886U1;

    /* renamed from: V1 */
    public int f3887V1;

    /* renamed from: W1 */
    public final float f3888W1;

    /* renamed from: X */
    public int f3889X;

    /* renamed from: X1 */
    public boolean f3890X1;

    /* renamed from: Y */
    public boolean f3891Y;

    /* renamed from: Y1 */
    public boolean f3892Y1;

    /* renamed from: Z */
    public int f3893Z;

    /* renamed from: Z1 */
    public boolean f3894Z1;

    /* renamed from: a2 */
    public int f3895a2;

    /* renamed from: b2 */
    public C1486c f3896b2;

    /* renamed from: c */
    public int f3897c;

    /* renamed from: c2 */
    public boolean f3898c2;

    /* renamed from: d2 */
    public int f3899d2;

    /* renamed from: e */
    public boolean f3900e;

    /* renamed from: e2 */
    public boolean f3901e2;

    /* renamed from: f2 */
    public final float f3902f2;

    /* renamed from: g2 */
    public int f3903g2;

    /* renamed from: h2 */
    public int f3904h2;

    /* renamed from: i2 */
    public int f3905i2;

    /* renamed from: j2 */
    public WeakReference<V> f3906j2;

    /* renamed from: k2 */
    public WeakReference<View> f3907k2;

    /* renamed from: l2 */
    public final ArrayList<AbstractC0757d> f3908l2;

    /* renamed from: m */
    public final float f3909m;

    /* renamed from: m2 */
    public VelocityTracker f3910m2;

    /* renamed from: n2 */
    public C1828f f3911n2;

    /* renamed from: o2 */
    public int f3912o2;

    /* renamed from: p2 */
    public int f3913p2;

    /* renamed from: q2 */
    public boolean f3914q2;

    /* renamed from: r2 */
    public HashMap f3915r2;

    /* renamed from: s */
    public int f3916s;

    /* renamed from: s2 */
    public final SparseIntArray f3917s2;

    /* renamed from: t2 */
    public final C0756c f3918t2;

    /* renamed from: w1 */
    public final int f3919w1;

    /* renamed from: x1 */
    public C2237f f3920x1;

    /* renamed from: y1 */
    public final ColorStateList f3921y1;

    /* renamed from: z1 */
    public int f3922z1;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC0754a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ View f3923c;

        /* renamed from: e */
        public final /* synthetic */ int f3924e;

        public RunnableC0754a(View view, int i7) {
            this.f3923c = view;
            this.f3924e = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i7 = BottomSheetBehavior.f3865u2;
            BottomSheetBehavior.this.m2303L(this.f3923c, this.f3924e, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C0755b extends AnimatorListenerAdapter {
        public C0755b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.m2301J(5);
            WeakReference<V> weakReference = bottomSheetBehavior.f3906j2;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.f3906j2.get().requestLayout();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C0756c extends C1486c.c {
        public C0756c() {
        }

        @Override // p090l0.C1486c.c
        /* renamed from: a */
        public final int mo1060a(View view, int i7) {
            return view.getLeft();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: b */
        public final int mo1061b(View view, int i7) {
            return C0143v.m460r(i7, BottomSheetBehavior.this.m2294C(), mo2316d());
        }

        @Override // p090l0.C1486c.c
        /* renamed from: d */
        public final int mo2316d() {
            int i7 = BottomSheetBehavior.f3865u2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f3890X1 ? bottomSheetBehavior.f3905i2 : bottomSheetBehavior.f3887V1;
        }

        @Override // p090l0.C1486c.c
        /* renamed from: h */
        public final void mo1066h(int i7) {
            if (i7 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f3894Z1) {
                    bottomSheetBehavior.m2301J(1);
                }
            }
        }

        @Override // p090l0.C1486c.c
        /* renamed from: i */
        public final void mo1067i(View view, int i7, int i8) {
            BottomSheetBehavior.this.m2315z(i8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        
            if (java.lang.Math.abs(r5.getTop() - r1.m2294C()) < java.lang.Math.abs(r5.getTop() - r1.f3885T1)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        
            if (java.lang.Math.abs(r6 - r1.f3885T1) < java.lang.Math.abs(r6 - r1.f3887V1)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        
            if (java.lang.Math.abs(r6 - r1.f3884S1) < java.lang.Math.abs(r6 - r1.f3887V1)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
        
            if (r6 < java.lang.Math.abs(r6 - r1.f3887V1)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r1.f3887V1)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r6 > r1.f3885T1) goto L53;
         */
        @Override // p090l0.C1486c.c
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo1068j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r2 = 0
                int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r3 >= 0) goto L1b
                boolean r6 = r1.f3900e
                if (r6 == 0) goto Le
                goto Lc4
            Le:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r1.f3885T1
                if (r6 <= r7) goto Lc4
                goto Ld5
            L1b:
                boolean r3 = r1.f3890X1
                if (r3 == 0) goto L70
                boolean r3 = r1.m2302K(r5, r7)
                if (r3 == 0) goto L70
                float r6 = java.lang.Math.abs(r6)
                float r2 = java.lang.Math.abs(r7)
                int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r6 >= 0) goto L38
                int r6 = r1.f3916s
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L4c
            L38:
                int r6 = r5.getTop()
                int r7 = r1.f3905i2
                int r2 = r1.m2294C()
                int r2 = r2 + r7
                int r2 = r2 / 2
                if (r6 <= r2) goto L49
                r6 = 1
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L4f
            L4c:
                r6 = 5
                goto Ld8
            L4f:
                boolean r6 = r1.f3900e
                if (r6 == 0) goto L55
                goto Lc4
            L55:
                int r6 = r5.getTop()
                int r7 = r1.m2294C()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r2 = r1.f3885T1
                int r7 = r7 - r2
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
                goto Lc4
            L70:
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 == 0) goto L9c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L81
                goto L9c
            L81:
                boolean r6 = r1.f3900e
                if (r6 == 0) goto L86
                goto Ld7
            L86:
                int r6 = r5.getTop()
                int r7 = r1.f3885T1
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r2 = r1.f3887V1
                int r6 = r6 - r2
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Ld5
            L9c:
                int r6 = r5.getTop()
                boolean r7 = r1.f3900e
                if (r7 == 0) goto Lb6
                int r7 = r1.f3884S1
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r2 = r1.f3887V1
                int r6 = r6 - r2
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Lc4
            Lb6:
                int r7 = r1.f3885T1
                if (r6 >= r7) goto Lc6
                int r7 = r1.f3887V1
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
            Lc4:
                r6 = 3
                goto Ld8
            Lc6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r2 = r1.f3887V1
                int r6 = r6 - r2
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
            Ld5:
                r6 = 6
                goto Ld8
            Ld7:
                r6 = 4
            Ld8:
                r1.getClass()
                r1.m2303L(r5, r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0756c.mo1068j(android.view.View, float, float):void");
        }

        @Override // p090l0.C1486c.c
        /* renamed from: k */
        public final boolean mo1069k(View view, int i7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i8 = bottomSheetBehavior.f3895a2;
            if (i8 == 1 || bottomSheetBehavior.f3914q2) {
                return false;
            }
            if (i8 == 3 && bottomSheetBehavior.f3912o2 == i7) {
                WeakReference<View> weakReference = bottomSheetBehavior.f3907k2;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f3906j2;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class AbstractC0757d {
        /* renamed from: a */
        public abstract void m2317a();

        /* renamed from: b */
        public abstract void m2318b();
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C0758e extends AbstractC1446a {
        public static final Parcelable.Creator<C0758e> CREATOR = new a();

        /* renamed from: X */
        public final boolean f3928X;

        /* renamed from: Y */
        public final boolean f3929Y;

        /* renamed from: Z */
        public final boolean f3930Z;

        /* renamed from: m */
        public final int f3931m;

        /* renamed from: s */
        public final int f3932s;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public class a implements Parcelable.ClassLoaderCreator<C0758e> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0758e(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0758e[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0758e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0758e(parcel, classLoader);
            }
        }

        public C0758e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3931m = parcel.readInt();
            this.f3932s = parcel.readInt();
            this.f3928X = parcel.readInt() == 1;
            this.f3929Y = parcel.readInt() == 1;
            this.f3930Z = parcel.readInt() == 1;
        }

        public C0758e(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f3931m = bottomSheetBehavior.f3895a2;
            this.f3932s = bottomSheetBehavior.f3889X;
            this.f3928X = bottomSheetBehavior.f3900e;
            this.f3929Y = bottomSheetBehavior.f3890X1;
            this.f3930Z = bottomSheetBehavior.f3892Y1;
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f3931m);
            parcel.writeInt(this.f3932s);
            parcel.writeInt(this.f3928X ? 1 : 0);
            parcel.writeInt(this.f3929Y ? 1 : 0);
            parcel.writeInt(this.f3930Z ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C0759f {

        /* renamed from: a */
        public int f3933a;

        /* renamed from: b */
        public boolean f3934b;

        /* renamed from: c */
        public final a f3935c = new a();

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0759f c0759f = C0759f.this;
                c0759f.f3934b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                C1486c c1486c = bottomSheetBehavior.f3896b2;
                if (c1486c != null && c1486c.m3899g()) {
                    c0759f.m2319a(c0759f.f3933a);
                } else if (bottomSheetBehavior.f3895a2 == 2) {
                    bottomSheetBehavior.m2301J(c0759f.f3933a);
                }
            }
        }

        public C0759f() {
        }

        /* renamed from: a */
        public final void m2319a(int i7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f3906j2;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f3933a = i7;
            if (this.f3934b) {
                return;
            }
            V v5 = bottomSheetBehavior.f3906j2.get();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2837m(v5, this.f3935c);
            this.f3934b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f3897c = 0;
        this.f3900e = true;
        this.f3922z1 = -1;
        this.f3866A1 = -1;
        this.f3881P1 = new C0759f();
        this.f3886U1 = 0.5f;
        this.f3888W1 = -1.0f;
        this.f3894Z1 = true;
        this.f3895a2 = 4;
        this.f3902f2 = 0.1f;
        this.f3908l2 = new ArrayList<>();
        this.f3913p2 = -1;
        this.f3917s2 = new SparseIntArray();
        this.f3918t2 = new C0756c();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i7;
        this.f3897c = 0;
        this.f3900e = true;
        this.f3922z1 = -1;
        this.f3866A1 = -1;
        this.f3881P1 = new C0759f();
        this.f3886U1 = 0.5f;
        this.f3888W1 = -1.0f;
        this.f3894Z1 = true;
        this.f3895a2 = 4;
        this.f3902f2 = 0.1f;
        this.f3908l2 = new ArrayList<>();
        this.f3913p2 = -1;
        this.f3917s2 = new SparseIntArray();
        this.f3918t2 = new C0756c();
        this.f3919w1 = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3729c);
        int i8 = R$styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.f3921y1 = C1972c.m4585a(context, obtainStyledAttributes, i8);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f3879N1 = new C2240i(C2240i.m5433b(context, attributeSet, R$attr.bottomSheetStyle, f3865u2));
        }
        C2240i c2240i = this.f3879N1;
        if (c2240i != null) {
            C2237f c2237f = new C2237f(c2240i);
            this.f3920x1 = c2237f;
            c2237f.m5426i(context);
            ColorStateList colorStateList = this.f3921y1;
            if (colorStateList != null) {
                this.f3920x1.m5428k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f3920x1.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m2313x(), 1.0f);
        this.f3882Q1 = ofFloat;
        ofFloat.setDuration(500L);
        this.f3882Q1.addUpdateListener(new C0885d(this));
        this.f3888W1 = obtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i9 = R$styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i9)) {
            this.f3922z1 = obtainStyledAttributes.getDimensionPixelSize(i9, -1);
        }
        int i10 = R$styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f3866A1 = obtainStyledAttributes.getDimensionPixelSize(i10, -1);
        }
        int i11 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i11);
        if (peekValue == null || (i7 = peekValue.data) != -1) {
            m2299H(obtainStyledAttributes.getDimensionPixelSize(i11, -1));
        } else {
            m2299H(i7);
        }
        boolean z6 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.f3890X1 != z6) {
            this.f3890X1 = z6;
            if (!z6 && this.f3895a2 == 5) {
                m2300I(4);
            }
            m2304M();
        }
        this.f3868C1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z7 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f3900e != z7) {
            this.f3900e = z7;
            if (this.f3906j2 != null) {
                m2312w();
            }
            m2301J((this.f3900e && this.f3895a2 == 6) ? 3 : this.f3895a2);
            m2305N(this.f3895a2, true);
            m2304M();
        }
        this.f3892Y1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f3894Z1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f3897c = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f7 = obtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f3886U1 = f7;
        if (this.f3906j2 != null) {
            this.f3885T1 = (int) ((1.0f - f7) * this.f3905i2);
        }
        int i12 = R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i12);
        m2298G((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i12, 0) : peekValue2.data);
        this.f3916s = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f3869D1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f3870E1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f3871F1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f3872G1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f3873H1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f3874I1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f3875J1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f3878M1 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f3909m = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: A */
    public static View m2292A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.i.m2883p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View m2292A = m2292A(viewGroup.getChildAt(i7));
                if (m2292A != null) {
                    return m2292A;
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final int m2293B(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    /* renamed from: C */
    public final int m2294C() {
        if (this.f3900e) {
            return this.f3884S1;
        }
        return Math.max(this.f3883R1, this.f3872G1 ? 0 : this.f3877L1);
    }

    /* renamed from: D */
    public final int m2295D(int i7) {
        if (i7 == 3) {
            return m2294C();
        }
        if (i7 == 4) {
            return this.f3887V1;
        }
        if (i7 == 5) {
            return this.f3905i2;
        }
        if (i7 == 6) {
            return this.f3885T1;
        }
        throw new IllegalArgumentException(C0090b.m219e("Invalid state to get top offset: ", i7));
    }

    /* renamed from: E */
    public final boolean m2296E() {
        WeakReference<V> weakReference = this.f3906j2;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f3906j2.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* renamed from: F */
    public final void m2297F(View view, C1151g.a aVar, int i7) {
        C0946x.m2815p(view, aVar, new C0887f(this, i7));
    }

    /* renamed from: G */
    public final void m2298G(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f3883R1 = i7;
        m2305N(this.f3895a2, true);
    }

    /* renamed from: H */
    public final void m2299H(int i7) {
        boolean z6 = false;
        if (i7 == -1) {
            if (!this.f3891Y) {
                this.f3891Y = true;
                z6 = true;
            }
        } else if (this.f3891Y || this.f3889X != i7) {
            this.f3891Y = false;
            this.f3889X = Math.max(0, i7);
            z6 = true;
        }
        if (z6) {
            m2307P();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (p034e0.C0946x.g.m2859b(r5) != false) goto L34;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2300I(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r1 = r4.f3890X1
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r1 = r4.f3900e
            if (r1 == 0) goto L34
            int r1 = r4.m2295D(r5)
            int r2 = r4.f3884S1
            if (r1 > r2) goto L34
            r1 = 3
            goto L35
        L34:
            r1 = r5
        L35:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r4.f3906j2
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.f3906j2
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L62
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L62
            java.util.WeakHashMap<android.view.View, e0.h0> r1 = p034e0.C0946x.f4876a
            boolean r1 = p034e0.C0946x.g.m2859b(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r2)
            goto L70
        L69:
            r2.run()
            goto L70
        L6d:
            r4.m2301J(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = android.ext.C0090b.m220f(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2300I(int):void");
    }

    /* renamed from: J */
    public final void m2301J(int i7) {
        if (this.f3895a2 == i7) {
            return;
        }
        this.f3895a2 = i7;
        WeakReference<V> weakReference = this.f3906j2;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i8 = 0;
        if (i7 == 3) {
            m2306O(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            m2306O(false);
        }
        m2305N(i7, true);
        while (true) {
            ArrayList<AbstractC0757d> arrayList = this.f3908l2;
            if (i8 >= arrayList.size()) {
                m2304M();
                return;
            } else {
                arrayList.get(i8).m2318b();
                i8++;
            }
        }
    }

    /* renamed from: K */
    public final boolean m2302K(View view, float f7) {
        if (this.f3892Y1) {
            return true;
        }
        if (view.getTop() < this.f3887V1) {
            return false;
        }
        return Math.abs(((f7 * this.f3902f2) + ((float) view.getTop())) - ((float) this.f3887V1)) / ((float) m2314y()) > 0.5f;
    }

    /* renamed from: L */
    public final void m2303L(View view, int i7, boolean z6) {
        int m2295D = m2295D(i7);
        C1486c c1486c = this.f3896b2;
        if (!(c1486c != null && (!z6 ? !c1486c.m3911s(view, view.getLeft(), m2295D) : !c1486c.m3909q(view.getLeft(), m2295D)))) {
            m2301J(i7);
            return;
        }
        m2301J(2);
        m2305N(i7, true);
        this.f3881P1.m2319a(i7);
    }

    /* renamed from: M */
    public final void m2304M() {
        V v5;
        int i7;
        C1151g.a aVar;
        int i8;
        WeakReference<V> weakReference = this.f3906j2;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        C0946x.m2814o(v5, 524288);
        C0946x.m2809j(v5, 0);
        C0946x.m2814o(v5, 262144);
        C0946x.m2809j(v5, 0);
        C0946x.m2814o(v5, 1048576);
        C0946x.m2809j(v5, 0);
        SparseIntArray sparseIntArray = this.f3917s2;
        int i9 = sparseIntArray.get(0, -1);
        if (i9 != -1) {
            C0946x.m2814o(v5, i9);
            C0946x.m2809j(v5, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3900e && this.f3895a2 != 6) {
            String string = v5.getResources().getString(R$string.bottomsheet_action_expand_halfway);
            C0887f c0887f = new C0887f(this, 6);
            ArrayList m2805f = C0946x.m2805f(v5);
            int i10 = 0;
            while (true) {
                if (i10 >= m2805f.size()) {
                    int i11 = -1;
                    int i12 = 0;
                    while (true) {
                        int[] iArr = C0946x.f4880e;
                        if (i12 >= iArr.length || i11 != -1) {
                            break;
                        }
                        int i13 = iArr[i12];
                        boolean z6 = true;
                        for (int i14 = 0; i14 < m2805f.size(); i14++) {
                            z6 &= ((C1151g.a) m2805f.get(i14)).m3347a() != i13;
                        }
                        if (z6) {
                            i11 = i13;
                        }
                        i12++;
                    }
                    i8 = i11;
                } else {
                    if (TextUtils.equals(string, ((C1151g.a) m2805f.get(i10)).m3348b())) {
                        i8 = ((C1151g.a) m2805f.get(i10)).m3347a();
                        break;
                    }
                    i10++;
                }
            }
            if (i8 != -1) {
                C1151g.a aVar2 = new C1151g.a(null, i8, string, c0887f, null);
                View.AccessibilityDelegate m2803d = C0946x.m2803d(v5);
                C0908a c0908a = m2803d == null ? null : m2803d instanceof C0908a.a ? ((C0908a.a) m2803d).f4776a : new C0908a(m2803d);
                if (c0908a == null) {
                    c0908a = new C0908a();
                }
                C0946x.m2817r(v5, c0908a);
                C0946x.m2814o(v5, aVar2.m3347a());
                C0946x.m2805f(v5).add(aVar2);
                C0946x.m2809j(v5, 0);
            }
            sparseIntArray.put(0, i8);
        }
        if (this.f3890X1 && this.f3895a2 != 5) {
            m2297F(v5, C1151g.a.f5695l, 5);
        }
        int i15 = this.f3895a2;
        if (i15 == 3) {
            i7 = this.f3900e ? 4 : 6;
            aVar = C1151g.a.f5694k;
        } else {
            if (i15 != 4) {
                if (i15 != 6) {
                    return;
                }
                m2297F(v5, C1151g.a.f5694k, 4);
                m2297F(v5, C1151g.a.f5693j, 3);
                return;
            }
            i7 = this.f3900e ? 3 : 6;
            aVar = C1151g.a.f5693j;
        }
        m2297F(v5, aVar, i7);
    }

    /* renamed from: N */
    public final void m2305N(int i7, boolean z6) {
        ValueAnimator valueAnimator;
        if (i7 == 2) {
            return;
        }
        boolean z7 = this.f3895a2 == 3 && (this.f3878M1 || m2296E());
        if (this.f3880O1 == z7 || this.f3920x1 == null) {
            return;
        }
        this.f3880O1 = z7;
        if (z6 && (valueAnimator = this.f3882Q1) != null) {
            if (valueAnimator.isRunning()) {
                this.f3882Q1.reverse();
                return;
            } else {
                this.f3882Q1.setFloatValues(this.f3920x1.f10154c.f10172j, z7 ? m2313x() : 1.0f);
                this.f3882Q1.start();
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.f3882Q1;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f3882Q1.cancel();
        }
        C2237f c2237f = this.f3920x1;
        float m2313x = this.f3880O1 ? m2313x() : 1.0f;
        C2237f.b bVar = c2237f.f10154c;
        if (bVar.f10172j != m2313x) {
            bVar.f10172j = m2313x;
            c2237f.f10151X = true;
            c2237f.invalidateSelf();
        }
    }

    /* renamed from: O */
    public final void m2306O(boolean z6) {
        WeakReference<V> weakReference = this.f3906j2;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f3915r2 != null) {
                    return;
                } else {
                    this.f3915r2 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f3906j2.get() && z6) {
                    this.f3915r2.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f3915r2 = null;
        }
    }

    /* renamed from: P */
    public final void m2307P() {
        V v5;
        if (this.f3906j2 != null) {
            m2312w();
            if (this.f3895a2 != 4 || (v5 = this.f3906j2.get()) == null) {
                return;
            }
            v5.requestLayout();
        }
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: a */
    public final void mo2308a() {
        C1828f c1828f = this.f3911n2;
        if (c1828f == null) {
            return;
        }
        C0117b c0117b = c1828f.f8261f;
        c1828f.f8261f = null;
        if (c0117b == null || Build.VERSION.SDK_INT < 34) {
            m2300I(this.f3890X1 ? 5 : 4);
            return;
        }
        boolean z6 = this.f3890X1;
        int i7 = c1828f.f8259d;
        int i8 = c1828f.f8258c;
        float f7 = c0117b.f221c;
        if (!z6) {
            AnimatorSet m4305a = c1828f.m4305a();
            m4305a.setDuration(C0034a.m127b(f7, i8, i7));
            m4305a.start();
            m2300I(4);
            return;
        }
        C0755b c0755b = new C0755b();
        V v5 = c1828f.f8257b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) View.TRANSLATION_Y, v5.getScaleY() * v5.getHeight());
        ofFloat.setInterpolator(new C1690b());
        ofFloat.setDuration(C0034a.m127b(f7, i8, i7));
        ofFloat.addListener(new C1827e(c1828f));
        ofFloat.addListener(c0755b);
        ofFloat.start();
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: b */
    public final void mo2309b(C0117b c0117b) {
        C1828f c1828f = this.f3911n2;
        if (c1828f == null) {
            return;
        }
        c1828f.f8261f = c0117b;
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: c */
    public final void mo2310c(C0117b c0117b) {
        C1828f c1828f = this.f3911n2;
        if (c1828f == null) {
            return;
        }
        if (c1828f.f8261f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0117b c0117b2 = c1828f.f8261f;
        c1828f.f8261f = c0117b;
        if (c0117b2 == null) {
            return;
        }
        c1828f.m4306b(c0117b.f221c);
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: d */
    public final void mo2311d() {
        C1828f c1828f = this.f3911n2;
        if (c1828f == null) {
            return;
        }
        if (c1828f.f8261f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0117b c0117b = c1828f.f8261f;
        c1828f.f8261f = null;
        if (c0117b == null) {
            return;
        }
        AnimatorSet m4305a = c1828f.m4305a();
        m4305a.setDuration(c1828f.f8260e);
        m4305a.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: g */
    public final void mo980g(CoordinatorLayout.C0292f c0292f) {
        this.f3906j2 = null;
        this.f3896b2 = null;
        this.f3911n2 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: j */
    public final void mo983j() {
        this.f3906j2 = null;
        this.f3896b2 = null;
        this.f3911n2 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: k */
    public final boolean mo984k(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        int i7;
        C1486c c1486c;
        if (!v5.isShown() || !this.f3894Z1) {
            this.f3898c2 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3912o2 = -1;
            this.f3913p2 = -1;
            VelocityTracker velocityTracker = this.f3910m2;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3910m2 = null;
            }
        }
        if (this.f3910m2 == null) {
            this.f3910m2 = VelocityTracker.obtain();
        }
        this.f3910m2.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            this.f3913p2 = (int) motionEvent.getY();
            if (this.f3895a2 != 2) {
                WeakReference<View> weakReference = this.f3907k2;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m970l(view, x7, this.f3913p2)) {
                    this.f3912o2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3914q2 = true;
                }
            }
            this.f3898c2 = this.f3912o2 == -1 && !coordinatorLayout.m970l(v5, x7, this.f3913p2);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3914q2 = false;
            this.f3912o2 = -1;
            if (this.f3898c2) {
                this.f3898c2 = false;
                return false;
            }
        }
        if (!this.f3898c2 && (c1486c = this.f3896b2) != null && c1486c.m3910r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f3907k2;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f3898c2 || this.f3895a2 == 1 || coordinatorLayout.m970l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3896b2 == null || (i7 = this.f3913p2) == -1 || Math.abs(((float) i7) - motionEvent.getY()) <= ((float) this.f3896b2.f7072b)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011d, code lost:
    
        if (r10 == (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        r12 = java.lang.Math.min(r12, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        r9.f3903g2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        if (r10 == (-1)) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f A[LOOP:0: B:69:0x0187->B:71:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b A[SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo985l(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, int r12) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo985l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: m */
    public final boolean mo986m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2293B(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.f3922z1, marginLayoutParams.width), m2293B(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f3866A1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: n */
    public final boolean mo987n(View view) {
        WeakReference<View> weakReference = this.f3907k2;
        return (weakReference == null || view != weakReference.get() || this.f3895a2 == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: o */
    public final void mo988o(CoordinatorLayout coordinatorLayout, V v5, View view, int i7, int i8, int[] iArr, int i9) {
        int i10;
        if (i9 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f3907k2;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v5.getTop();
        int i11 = top - i8;
        if (i8 > 0) {
            if (i11 < m2294C()) {
                int m2294C = top - m2294C();
                iArr[1] = m2294C;
                C0946x.m2811l(v5, -m2294C);
                i10 = 3;
                m2301J(i10);
            } else {
                if (!this.f3894Z1) {
                    return;
                }
                iArr[1] = i8;
                C0946x.m2811l(v5, -i8);
                m2301J(1);
            }
        } else if (i8 < 0 && !view.canScrollVertically(-1)) {
            int i12 = this.f3887V1;
            if (i11 > i12 && !this.f3890X1) {
                int i13 = top - i12;
                iArr[1] = i13;
                C0946x.m2811l(v5, -i13);
                i10 = 4;
                m2301J(i10);
            } else {
                if (!this.f3894Z1) {
                    return;
                }
                iArr[1] = i8;
                C0946x.m2811l(v5, -i8);
                m2301J(1);
            }
        }
        m2315z(v5.getTop());
        this.f3899d2 = i8;
        this.f3901e2 = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: p */
    public final void mo989p(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: r */
    public final void mo991r(View view, Parcelable parcelable) {
        C0758e c0758e = (C0758e) parcelable;
        int i7 = this.f3897c;
        if (i7 != 0) {
            if (i7 == -1 || (i7 & 1) == 1) {
                this.f3889X = c0758e.f3932s;
            }
            if (i7 == -1 || (i7 & 2) == 2) {
                this.f3900e = c0758e.f3928X;
            }
            if (i7 == -1 || (i7 & 4) == 4) {
                this.f3890X1 = c0758e.f3929Y;
            }
            if (i7 == -1 || (i7 & 8) == 8) {
                this.f3892Y1 = c0758e.f3930Z;
            }
        }
        int i8 = c0758e.f3931m;
        if (i8 == 1 || i8 == 2) {
            this.f3895a2 = 4;
        } else {
            this.f3895a2 = i8;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: s */
    public final Parcelable mo992s(View view) {
        return new C0758e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: t */
    public final boolean mo993t(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i7, int i8) {
        this.f3899d2 = 0;
        this.f3901e2 = false;
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r1.f3885T1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f3884S1) < java.lang.Math.abs(r2 - r1.f3887V1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.f3887V1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f3887V1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f3885T1) < java.lang.Math.abs(r2 - r1.f3887V1)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo994u(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m2294C()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m2301J(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f3907k2
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.f3901e2
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.f3899d2
            if (r2 <= 0) goto L33
            boolean r2 = r1.f3900e
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.f3885T1
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.f3890X1
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.f3910m2
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f3909m
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f3910m2
            int r4 = r1.f3912o2
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.m2302K(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.f3899d2
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f3900e
            if (r4 == 0) goto L72
            int r4 = r1.f3884S1
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3887V1
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.f3885T1
            if (r2 >= r4) goto L81
            int r4 = r1.f3887V1
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3887V1
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f3900e
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.f3885T1
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3887V1
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.m2303L(r3, r0, r2)
            r1.f3901e2 = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo994u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: v */
    public final boolean mo995v(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        boolean z6 = false;
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f3895a2;
        if (i7 == 1 && actionMasked == 0) {
            return true;
        }
        C1486c c1486c = this.f3896b2;
        if (c1486c != null && (this.f3894Z1 || i7 == 1)) {
            c1486c.m3903k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3912o2 = -1;
            this.f3913p2 = -1;
            VelocityTracker velocityTracker = this.f3910m2;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3910m2 = null;
            }
        }
        if (this.f3910m2 == null) {
            this.f3910m2 = VelocityTracker.obtain();
        }
        this.f3910m2.addMovement(motionEvent);
        if (this.f3896b2 != null && (this.f3894Z1 || this.f3895a2 == 1)) {
            z6 = true;
        }
        if (z6 && actionMasked == 2 && !this.f3898c2) {
            float abs = Math.abs(this.f3913p2 - motionEvent.getY());
            C1486c c1486c2 = this.f3896b2;
            if (abs > c1486c2.f7072b) {
                c1486c2.m3894b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3898c2;
    }

    /* renamed from: w */
    public final void m2312w() {
        int m2314y = m2314y();
        if (this.f3900e) {
            this.f3887V1 = Math.max(this.f3905i2 - m2314y, this.f3884S1);
        } else {
            this.f3887V1 = this.f3905i2 - m2314y;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0 = r0.getRootWindowInsets();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m2313x() {
        /*
            r5 = this;
            y3.f r0 = r5.f3920x1
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.f3906j2
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.f3906j2
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m2296E()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = android.ext.C0094f.m295h(r0)
            if (r0 == 0) goto L79
            y3.f r2 = r5.f3920x1
            y3.f$b r3 = r2.f10154c
            y3.i r3 = r3.f10163a
            y3.c r3 = r3.f10190e
            android.graphics.RectF r2 = r2.m5425h()
            float r2 = r3.mo5418a(r2)
            android.view.RoundedCorner r3 = p029d3.C0882a.m2576b(r0)
            if (r3 == 0) goto L4e
            int r3 = p029d3.C0884c.m2590c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = 0
        L4f:
            y3.f r2 = r5.f3920x1
            y3.f$b r4 = r2.f10154c
            y3.i r4 = r4.f10163a
            y3.c r4 = r4.f10191f
            android.graphics.RectF r2 = r2.m5425h()
            float r2 = r4.mo5418a(r2)
            android.view.RoundedCorner r0 = p029d3.C0883b.m2585f(r0)
            if (r0 == 0) goto L74
            int r0 = p029d3.C0884c.m2590c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2313x():float");
    }

    /* renamed from: y */
    public final int m2314y() {
        int i7;
        return this.f3891Y ? Math.min(Math.max(this.f3893Z, this.f3905i2 - ((this.f3904h2 * 9) / 16)), this.f3903g2) + this.f3876K1 : (this.f3868C1 || this.f3869D1 || (i7 = this.f3867B1) <= 0) ? this.f3889X + this.f3876K1 : Math.max(this.f3889X, i7 + this.f3919w1);
    }

    /* renamed from: z */
    public final void m2315z(int i7) {
        if (this.f3906j2.get() != null) {
            ArrayList<AbstractC0757d> arrayList = this.f3908l2;
            if (arrayList.isEmpty()) {
                return;
            }
            int i8 = this.f3887V1;
            if (i7 <= i8 && i8 != m2294C()) {
                m2294C();
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                arrayList.get(i9).m2317a();
            }
        }
    }
}
