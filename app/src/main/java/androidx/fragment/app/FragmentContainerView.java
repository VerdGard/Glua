package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0091c;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R$id;
import androidx.fragment.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import p034e0.C0935n0;
import p034e0.C0946x;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: c */
    public ArrayList<View> f1623c;

    /* renamed from: e */
    public ArrayList<View> f1624e;

    /* renamed from: m */
    public View.OnApplyWindowInsetsListener f1625m;

    /* renamed from: s */
    public boolean f1626s;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f1626s = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1621b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    /* renamed from: a */
    public final void m1132a(View view) {
        ArrayList<View> arrayList = this.f1624e;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1623c == null) {
            this.f1623c = new ArrayList<>();
        }
        this.f1623c.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC0361n ? (ComponentCallbacksC0361n) tag : null) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC0361n ? (ComponentCallbacksC0361n) tag : null) != null) {
            return super.addViewInLayout(view, i7, layoutParams, z6);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0935n0 m2749i = C0935n0.m2749i(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1625m;
        C0935n0 m2749i2 = onApplyWindowInsetsListener != null ? C0935n0.m2749i(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C0946x.m2812m(this, m2749i);
        if (!m2749i2.f4835a.mo2782m()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                C0946x.m2801b(getChildAt(i7), m2749i2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1626s && this.f1623c != null) {
            for (int i7 = 0; i7 < this.f1623c.size(); i7++) {
                super.drawChild(canvas, this.f1623c.get(i7), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        ArrayList<View> arrayList;
        if (!this.f1626s || (arrayList = this.f1623c) == null || arrayList.size() <= 0 || !this.f1623c.contains(view)) {
            return super.drawChild(canvas, view, j7);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1624e;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1623c;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1626s = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m1132a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        if (z6) {
            m1132a(view);
        }
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m1132a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        m1132a(getChildAt(i7));
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m1132a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            m1132a(getChildAt(i9));
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            m1132a(getChildAt(i9));
        }
        super.removeViewsInLayout(i7, i8);
    }

    public void setDrawDisappearingViewsLast(boolean z6) {
        this.f1626s = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1625m = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1624e == null) {
                this.f1624e = new ArrayList<>();
            }
            this.f1624e.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0378x abstractC0378x) {
        super(context, attributeSet);
        View view;
        this.f1626s = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1621b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC0361n m1292C = abstractC0378x.m1292C(id);
        if (classAttribute != null && m1292C == null) {
            if (id <= 0) {
                throw new IllegalStateException(C0091c.m228f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0373t m1295F = abstractC0378x.m1295F();
            context.getClassLoader();
            ComponentCallbacksC0361n mo1270a = m1295F.mo1270a(classAttribute);
            mo1270a.f1791S1 = true;
            AbstractC0375u<?> abstractC0375u = mo1270a.f1781I1;
            if ((abstractC0375u == null ? null : abstractC0375u.f1869e) != null) {
                mo1270a.f1791S1 = true;
            }
            C0335a c0335a = new C0335a(abstractC0378x);
            c0335a.f1700o = true;
            mo1270a.f1792T1 = this;
            c0335a.m1136e(getId(), mo1270a, string, 1);
            if (c0335a.f1692g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0335a.f1627p.m1338y(c0335a, true);
        }
        Iterator it = abstractC0378x.f1886c.m1168e().iterator();
        while (it.hasNext()) {
            C0342d0 c0342d0 = (C0342d0) it.next();
            ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
            if (componentCallbacksC0361n.f1785M1 == getId() && (view = componentCallbacksC0361n.f1793U1) != null && view.getParent() == null) {
                componentCallbacksC0361n.f1792T1 = this;
                c0342d0.m1147b();
            }
        }
    }
}
