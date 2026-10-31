package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0240k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C0819d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004a3.C0040g;
import p013b4.C0539a;
import p020c3.C0608b;
import p020c3.C0611e;
import p034e0.C0923h0;
import p034e0.C0946x;
import p089l.C1481o;
import p116o3.InterfaceC1666a;
import p123p3.C1702c;
import p123p3.ViewTreeObserverOnPreDrawListenerC1701b;
import p131q3.C1748d;
import p131q3.C1768x;
import p185x3.InterfaceC2192b;
import p189y.C2213a;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* loaded from: classes.dex */
public final class FloatingActionButton extends C1768x implements InterfaceC1666a, InterfaceC2244m, CoordinatorLayout.InterfaceC0288b {

    /* renamed from: A1 */
    public int f4241A1;

    /* renamed from: B1 */
    public boolean f4242B1;

    /* renamed from: C1 */
    public C1702c f4243C1;

    /* renamed from: e */
    public ColorStateList f4244e;

    /* renamed from: m */
    public PorterDuff.Mode f4245m;

    /* renamed from: s */
    public ColorStateList f4246s;

    /* renamed from: w1 */
    public PorterDuff.Mode f4247w1;

    /* renamed from: x1 */
    public ColorStateList f4248x1;

    /* renamed from: y1 */
    public int f4249y1;

    /* renamed from: z1 */
    public int f4250z1;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0289c<T> {

        /* renamed from: c */
        public Rect f4251c;

        /* renamed from: e */
        public final boolean f4252e;

        public BaseBehavior() {
            this.f4252e = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3734h);
            this.f4252e = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: e */
        public final boolean mo978e(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: g */
        public final void mo980g(CoordinatorLayout.C0292f c0292f) {
            if (c0292f.f1426h == 0) {
                c0292f.f1426h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: h */
        public final boolean mo981h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m2457x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0292f ? ((CoordinatorLayout.C0292f) layoutParams).f1419a instanceof BottomSheetBehavior : false) {
                    m2458y(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: l */
        public final boolean mo985l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList m967d = coordinatorLayout.m967d(floatingActionButton);
            int size = m967d.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view2 = (View) m967d.get(i8);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0292f ? ((CoordinatorLayout.C0292f) layoutParams).f1419a instanceof BottomSheetBehavior : false) && m2458y(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m2457x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m972q(floatingActionButton, i7);
            return true;
        }

        /* renamed from: w */
        public final boolean m2456w(View view, FloatingActionButton floatingActionButton) {
            return this.f4252e && ((CoordinatorLayout.C0292f) floatingActionButton.getLayoutParams()).f1424f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: x */
        public final boolean m2457x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m2456w(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f4251c == null) {
                this.f4251c = new Rect();
            }
            Rect rect = this.f4251c;
            C1748d.m4224a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m2451g(null, false);
                return true;
            }
            floatingActionButton.m2455k(null, false);
            return true;
        }

        /* renamed from: y */
        public final boolean m2458y(View view, FloatingActionButton floatingActionButton) {
            if (!m2456w(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0292f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m2451g(null, false);
                return true;
            }
            floatingActionButton.m2455k(null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC0813a {
        /* renamed from: a */
        public void mo2049a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo2050b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C0814b implements InterfaceC2192b {
        public C0814b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C0815c<T extends FloatingActionButton> implements C0819d.f {
        public C0815c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.f
        /* renamed from: a */
        public final void mo2459a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C0819d.f
        /* renamed from: b */
        public final void mo2460b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0815c)) {
                return false;
            }
            ((C0815c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private C0819d getImpl() {
        if (this.f4243C1 == null) {
            this.f4243C1 = new C1702c(this, new C0814b());
        }
        return this.f4243C1;
    }

    @Override // p116o3.InterfaceC1666a
    /* renamed from: a */
    public final boolean mo2446a() {
        throw null;
    }

    /* renamed from: c */
    public final void m2447c() {
        C0819d impl = getImpl();
        if (impl.f4288o == null) {
            impl.f4288o = new ArrayList<>();
        }
        impl.f4288o.add(null);
    }

    /* renamed from: d */
    public final void m2448d(C0611e c0611e) {
        C0819d impl = getImpl();
        if (impl.f4287n == null) {
            impl.f4287n = new ArrayList<>();
        }
        impl.f4287n.add(c0611e);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo2469i(getDrawableState());
    }

    /* renamed from: e */
    public final void m2449e() {
        C0819d impl = getImpl();
        C0815c c0815c = new C0815c(this);
        if (impl.f4289p == null) {
            impl.f4289p = new ArrayList<>();
        }
        impl.f4289p.add(c0815c);
    }

    /* renamed from: f */
    public final int m2450f(int i7) {
        int i8 = this.f4250z1;
        if (i8 != 0) {
            return i8;
        }
        Resources resources = getResources();
        if (i7 != -1) {
            return resources.getDimensionPixelSize(i7 != 1 ? R$dimen.design_fab_size_normal : R$dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m2450f(1) : m2450f(0);
    }

    /* renamed from: g */
    public final void m2451g(C0608b c0608b, boolean z6) {
        C0819d impl = getImpl();
        C0816a c0816a = c0608b == null ? null : new C0816a(this, c0608b);
        boolean z7 = false;
        if (impl.f4290q.getVisibility() != 0 ? impl.f4286m != 2 : impl.f4286m == 1) {
            return;
        }
        Animator animator = impl.f4280g;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        FloatingActionButton floatingActionButton = impl.f4290q;
        if (C0946x.g.m2860c(floatingActionButton) && !floatingActionButton.isInEditMode()) {
            z7 = true;
        }
        if (!z7) {
            floatingActionButton.m4241b(z6 ? 8 : 4, z6);
            if (c0816a != null) {
                c0816a.f4254a.mo2049a(c0816a.f4255b);
                return;
            }
            return;
        }
        C0040g c0040g = impl.f4282i;
        AnimatorSet m2463b = c0040g != null ? impl.m2463b(c0040g, 0.0f, 0.0f, 0.0f) : impl.m2464c(0.0f, 0.4f, 0.4f, C0819d.f4263A, C0819d.f4264B);
        m2463b.addListener(new C0817b(impl, z6, c0816a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f4288o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m2463b.addListener(it.next());
            }
        }
        m2463b.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f4244e;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f4245m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0288b
    public CoordinatorLayout.AbstractC0289c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo2465e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f4278e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f4279f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f4250z1;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C0040g getHideMotionSpec() {
        return getImpl().f4282i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f4248x1;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f4248x1;
    }

    public C2240i getShapeAppearanceModel() {
        C2240i c2240i = getImpl().f4274a;
        c2240i.getClass();
        return c2240i;
    }

    public C0040g getShowMotionSpec() {
        return getImpl().f4281h;
    }

    public int getSize() {
        return this.f4249y1;
    }

    public int getSizeDimension() {
        return m2450f(this.f4249y1);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f4246s;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f4247w1;
    }

    public boolean getUseCompatPadding() {
        return this.f4242B1;
    }

    /* renamed from: h */
    public final boolean m2452h() {
        C0819d impl = getImpl();
        int visibility = impl.f4290q.getVisibility();
        int i7 = impl.f4286m;
        if (visibility == 0) {
            if (i7 == 1) {
                return true;
            }
        } else if (i7 != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m2453i() {
        C0819d impl = getImpl();
        int visibility = impl.f4290q.getVisibility();
        int i7 = impl.f4286m;
        if (visibility != 0) {
            if (i7 == 2) {
                return true;
            }
        } else if (i7 != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m2454j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f4246s;
        if (colorStateList == null) {
            C2213a.m5353a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f4247w1;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0240k.m808c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo2467g();
    }

    /* renamed from: k */
    public final void m2455k(C0608b.a aVar, boolean z6) {
        C0819d impl = getImpl();
        C0816a c0816a = aVar == null ? null : new C0816a(this, aVar);
        if (impl.f4290q.getVisibility() == 0 ? impl.f4286m != 1 : impl.f4286m == 2) {
            return;
        }
        Animator animator = impl.f4280g;
        if (animator != null) {
            animator.cancel();
        }
        boolean z7 = impl.f4281h == null;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        FloatingActionButton floatingActionButton = impl.f4290q;
        boolean z8 = C0946x.g.m2860c(floatingActionButton) && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f4295v;
        if (!z8) {
            floatingActionButton.m4241b(0, z6);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f4284k = 1.0f;
            impl.m2462a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (c0816a != null) {
                c0816a.f4254a.mo2050b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z7 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z7 ? 0.4f : 0.0f);
            float f7 = z7 ? 0.4f : 0.0f;
            impl.f4284k = f7;
            impl.m2462a(f7, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C0040g c0040g = impl.f4281h;
        AnimatorSet m2463b = c0040g != null ? impl.m2463b(c0040g, 1.0f, 1.0f, 1.0f) : impl.m2464c(1.0f, 1.0f, 1.0f, C0819d.f4272y, C0819d.f4273z);
        m2463b.addListener(new C0818c(impl, z6, c0816a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f4287n;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m2463b.addListener(it.next());
            }
        }
        m2463b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0819d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C1702c)) {
            ViewTreeObserver viewTreeObserver = impl.f4290q.getViewTreeObserver();
            if (impl.f4296w == null) {
                impl.f4296w = new ViewTreeObserverOnPreDrawListenerC1701b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f4296w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0819d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f4290q.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC1701b viewTreeObserverOnPreDrawListenerC1701b = impl.f4296w;
        if (viewTreeObserverOnPreDrawListenerC1701b != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1701b);
            impl.f4296w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int sizeDimension = (getSizeDimension() - this.f4241A1) / 2;
        getImpl().m2474n();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0539a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0539a c0539a = (C0539a) parcelable;
        super.onRestoreInstanceState(c0539a.f6946c);
        c0539a.f2694m.get("expandableWidgetHelper").getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new C1481o();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4244e != colorStateList) {
            this.f4244e = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f4245m != mode) {
            this.f4245m = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f7) {
        C0819d impl = getImpl();
        if (impl.f4277d != f7) {
            impl.f4277d = f7;
            impl.mo2470j(f7, impl.f4278e, impl.f4279f);
        }
    }

    public void setCompatElevationResource(int i7) {
        setCompatElevation(getResources().getDimension(i7));
    }

    public void setCompatHoveredFocusedTranslationZ(float f7) {
        C0819d impl = getImpl();
        if (impl.f4278e != f7) {
            impl.f4278e = f7;
            impl.mo2470j(impl.f4277d, f7, impl.f4279f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i7) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i7));
    }

    public void setCompatPressedTranslationZ(float f7) {
        C0819d impl = getImpl();
        if (impl.f4279f != f7) {
            impl.f4279f = f7;
            impl.mo2470j(impl.f4277d, impl.f4278e, f7);
        }
    }

    public void setCompatPressedTranslationZResource(int i7) {
        setCompatPressedTranslationZ(getResources().getDimension(i7));
    }

    public void setCustomSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i7 != this.f4250z1) {
            this.f4250z1 = i7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        if (z6 != getImpl().f4275b) {
            getImpl().f4275b = z6;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i7) {
        throw null;
    }

    public void setHideMotionSpec(C0040g c0040g) {
        getImpl().f4282i = c0040g;
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C0040g.m128a(i7, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C0819d impl = getImpl();
            float f7 = impl.f4284k;
            impl.f4284k = f7;
            Matrix matrix = impl.f4295v;
            impl.m2462a(f7, matrix);
            impl.f4290q.setImageMatrix(matrix);
            if (this.f4246s != null) {
                m2454j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        throw null;
    }

    public void setMaxImageSize(int i7) {
        this.f4241A1 = i7;
        C0819d impl = getImpl();
        if (impl.f4285l != i7) {
            impl.f4285l = i7;
            float f7 = impl.f4284k;
            impl.f4284k = f7;
            Matrix matrix = impl.f4295v;
            impl.m2462a(f7, matrix);
            impl.f4290q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i7) {
        setRippleColor(ColorStateList.valueOf(i7));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f4248x1 != colorStateList) {
            this.f4248x1 = colorStateList;
            getImpl().mo2472l();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        ArrayList<C0819d.f> arrayList = getImpl().f4289p;
        if (arrayList != null) {
            Iterator<C0819d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2460b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        ArrayList<C0819d.f> arrayList = getImpl().f4289p;
        if (arrayList != null) {
            Iterator<C0819d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2460b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z6) {
        C0819d impl = getImpl();
        impl.f4276c = z6;
        impl.m2474n();
        throw null;
    }

    @Override // p193y3.InterfaceC2244m
    public void setShapeAppearanceModel(C2240i c2240i) {
        getImpl().f4274a = c2240i;
    }

    public void setShowMotionSpec(C0040g c0040g) {
        getImpl().f4281h = c0040g;
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C0040g.m128a(i7, getContext()));
    }

    public void setSize(int i7) {
        this.f4250z1 = 0;
        if (i7 != this.f4249y1) {
            this.f4249y1 = i7;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f4246s != colorStateList) {
            this.f4246s = colorStateList;
            m2454j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f4247w1 != mode) {
            this.f4247w1 = mode;
            m2454j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        getImpl().m2471k();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        getImpl().m2471k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f7) {
        super.setTranslationZ(f7);
        getImpl().m2471k();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f4242B1 != z6) {
            this.f4242B1 = z6;
            getImpl().mo2468h();
        }
    }

    @Override // p131q3.C1768x, android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
