package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.ext.C0090b;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p004a3.C0040g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p131q3.C1748d;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0288b {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0289c<T> {

        /* renamed from: c */
        public Rect f4238c;

        /* renamed from: e */
        public final boolean f4239e;

        /* renamed from: m */
        public final boolean f4240m;

        public ExtendedFloatingActionButtonBehavior() {
            this.f4239e = false;
            this.f4240m = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3733g);
            this.f4239e = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f4240m = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo978e(View view) {
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m2444w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0292f ? ((CoordinatorLayout.C0292f) layoutParams).f1419a instanceof BottomSheetBehavior : false) {
                    m2445x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: l */
        public final boolean mo985l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList m967d = coordinatorLayout.m967d(extendedFloatingActionButton);
            int size = m967d.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view2 = (View) m967d.get(i8);
                if (view2 instanceof AppBarLayout) {
                    m2444w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0292f ? ((CoordinatorLayout.C0292f) layoutParams).f1419a instanceof BottomSheetBehavior : false) {
                        m2445x(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.m972q(extendedFloatingActionButton, i7);
            return true;
        }

        /* renamed from: w */
        public final void m2444w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f4239e;
            boolean z7 = this.f4240m;
            if ((z6 || z7) && c0292f.f1424f == appBarLayout.getId()) {
                if (this.f4238c == null) {
                    this.f4238c = new Rect();
                }
                Rect rect = this.f4238c;
                C1748d.m4224a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.m2443e(extendedFloatingActionButton, z7 ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.m2443e(extendedFloatingActionButton, z7 ? 3 : 0);
                throw null;
            }
        }

        /* renamed from: x */
        public final void m2445x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f4239e;
            boolean z7 = this.f4240m;
            if ((z6 || z7) && c0292f.f1424f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0292f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.m2443e(extendedFloatingActionButton, z7 ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.m2443e(extendedFloatingActionButton, z7 ? 3 : 0);
                throw null;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C0809a extends Property<View, Float> {
        public C0809a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            View view2 = view;
            view2.getLayoutParams().width = f7.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C0810b extends Property<View, Float> {
        public C0810b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            View view2 = view;
            view2.getLayoutParams().height = f7.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C0811c extends Property<View, Float> {
        public C0811c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return Float.valueOf(C0946x.e.m2849f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            View view2 = view;
            int intValue = f7.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.e.m2854k(view2, intValue, paddingTop, C0946x.e.m2848e(view2), view2.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C0812d extends Property<View, Float> {
        public C0812d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return Float.valueOf(C0946x.e.m2848e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            View view2 = view;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.e.m2854k(view2, C0946x.e.m2849f(view2), view2.getPaddingTop(), f7.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new C0809a();
        new C0810b();
        new C0811c();
        new C0812d();
    }

    /* renamed from: e */
    public static void m2443e(ExtendedFloatingActionButton extendedFloatingActionButton, int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(C0090b.m219e("Unknown strategy type: ", i7));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0288b
    public CoordinatorLayout.AbstractC0289c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public C0040g getExtendMotionSpec() {
        throw null;
    }

    public C0040g getHideMotionSpec() {
        throw null;
    }

    public C0040g getShowMotionSpec() {
        throw null;
    }

    public C0040g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z6) {
    }

    public void setExtendMotionSpec(C0040g c0040g) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i7) {
        setExtendMotionSpec(C0040g.m128a(i7, getContext()));
    }

    public void setExtended(boolean z6) {
        if (z6) {
            throw null;
        }
    }

    public void setHideMotionSpec(C0040g c0040g) {
        throw null;
    }

    public void setHideMotionSpecResource(int i7) {
        setHideMotionSpec(C0040g.m128a(i7, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        super.setPadding(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i7, int i8, int i9, int i10) {
        super.setPaddingRelative(i7, i8, i9, i10);
    }

    public void setShowMotionSpec(C0040g c0040g) {
        throw null;
    }

    public void setShowMotionSpecResource(int i7) {
        setShowMotionSpec(C0040g.m128a(i7, getContext()));
    }

    public void setShrinkMotionSpec(C0040g c0040g) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i7) {
        setShrinkMotionSpec(C0040g.m128a(i7, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
