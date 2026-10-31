package com.so.revelation.lua.View.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.so.revelation.lua.R$styleable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p114o1.AbstractC1663d;
import p114o1.C1664e;
import p122p1.C1694b;
import p129q1.C1732h;
import p137r1.AbstractC1821a;
import p198z0.AbstractC2273a;
import p198z0.C2274b;

/* loaded from: classes.dex */
public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: A1 */
    public C2274b f3569A1;

    /* renamed from: B1 */
    public C2274b.h f3570B1;

    /* renamed from: C1 */
    public InterfaceC0717g f3571C1;

    /* renamed from: D1 */
    public final ViewOnClickListenerC0711a f3572D1;

    /* renamed from: E1 */
    public boolean f3573E1;

    /* renamed from: c */
    public final C0718a f3574c;

    /* renamed from: e */
    public final int f3575e;

    /* renamed from: m */
    public final int f3576m;

    /* renamed from: s */
    public final boolean f3577s;

    /* renamed from: w1 */
    public ColorStateList f3578w1;

    /* renamed from: x1 */
    public final float f3579x1;

    /* renamed from: y1 */
    public final int f3580y1;

    /* renamed from: z1 */
    public final int f3581z1;

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$a */
    public class ViewOnClickListenerC0711a implements View.OnClickListener {
        public ViewOnClickListenerC0711a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i7 = 0;
            while (true) {
                SmartTabLayout smartTabLayout = SmartTabLayout.this;
                if (i7 >= smartTabLayout.f3574c.getChildCount()) {
                    return;
                }
                if (view == smartTabLayout.f3574c.getChildAt(i7)) {
                    smartTabLayout.getClass();
                    smartTabLayout.f3569A1.setCurrentItem(i7);
                    return;
                }
                i7++;
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$b */
    public class C0712b implements C2274b.h {

        /* renamed from: a */
        public int f3583a;

        public C0712b() {
        }

        @Override // p198z0.C2274b.h
        /* renamed from: a */
        public final void mo116a(int i7) {
            this.f3583a = i7;
            C2274b.h hVar = SmartTabLayout.this.f3570B1;
            if (hVar != null) {
                hVar.mo116a(i7);
            }
        }

        @Override // p198z0.C2274b.h
        /* renamed from: b */
        public final void mo117b(int i7) {
            int i8 = this.f3583a;
            SmartTabLayout smartTabLayout = SmartTabLayout.this;
            if (i8 == 0) {
                C0718a c0718a = smartTabLayout.f3574c;
                c0718a.f3601M1 = i7;
                c0718a.f3602N1 = 0.0f;
                if (c0718a.f3600L1 != i7) {
                    c0718a.f3600L1 = i7;
                }
                c0718a.invalidate();
                smartTabLayout.m2228a(i7, 0.0f);
            }
            int childCount = smartTabLayout.f3574c.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                smartTabLayout.f3574c.getChildAt(i9).setSelected(i7 == i9);
                i9++;
            }
            C2274b.h hVar = smartTabLayout.f3570B1;
            if (hVar != null) {
                hVar.mo117b(i7);
            }
        }

        @Override // p198z0.C2274b.h
        /* renamed from: d */
        public final void mo119d(float f7, int i7, int i8) {
            SmartTabLayout smartTabLayout = SmartTabLayout.this;
            int childCount = smartTabLayout.f3574c.getChildCount();
            if (childCount == 0 || i7 < 0 || i7 >= childCount) {
                return;
            }
            C0718a c0718a = smartTabLayout.f3574c;
            c0718a.f3601M1 = i7;
            c0718a.f3602N1 = f7;
            if (f7 == 0.0f && c0718a.f3600L1 != i7) {
                c0718a.f3600L1 = i7;
            }
            c0718a.invalidate();
            smartTabLayout.m2228a(i7, f7);
            C2274b.h hVar = smartTabLayout.f3570B1;
            if (hVar != null) {
                hVar.mo119d(f7, i7, i8);
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$c */
    public interface InterfaceC0713c {
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$d */
    public interface InterfaceC0714d {
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$e */
    public static class C0715e implements InterfaceC0717g {

        /* renamed from: a */
        public final LayoutInflater f3585a;

        /* renamed from: b */
        public final int f3586b;

        /* renamed from: c */
        public final int f3587c;

        public C0715e(Context context, int i7, int i8) {
            this.f3585a = LayoutInflater.from(context);
            this.f3586b = i7;
            this.f3587c = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
        @Override // com.so.revelation.lua.View.widget.SmartTabLayout.InterfaceC0717g
        /* renamed from: c */
        public final View mo118c(C0718a c0718a, int i7, AbstractC2273a abstractC2273a) {
            TextView textView = null;
            int i8 = this.f3586b;
            TextView inflate = i8 != -1 ? this.f3585a.inflate(i8, (ViewGroup) c0718a, false) : null;
            int i9 = this.f3587c;
            if (i9 != -1 && inflate != null) {
                textView = (TextView) inflate.findViewById(i9);
            }
            if (textView == null && TextView.class.isInstance(inflate)) {
                textView = inflate;
            }
            if (textView != null) {
                textView.setText(((C1732h) ((AbstractC1821a.a) ((C1694b) abstractC2273a).f8251e.get(i7)).f8254b).f7949e);
            }
            return inflate;
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$f */
    public interface InterfaceC0716f {
    }

    /* renamed from: com.so.revelation.lua.View.widget.SmartTabLayout$g */
    public interface InterfaceC0717g {
        /* renamed from: c */
        View mo118c(C0718a c0718a, int i7, AbstractC2273a abstractC2273a);
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f7 = displayMetrics.density;
        float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3396g, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        boolean z6 = obtainStyledAttributes.getBoolean(4, true);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        float dimension = obtainStyledAttributes.getDimension(8, applyDimension);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, (int) (16.0f * f7));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, (int) (0.0f * f7));
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, -1);
        boolean z7 = obtainStyledAttributes.getBoolean(9, false);
        boolean z8 = obtainStyledAttributes.getBoolean(0, true);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(26, (int) (f7 * 24.0f));
        obtainStyledAttributes.recycle();
        this.f3575e = layoutDimension;
        this.f3576m = resourceId;
        this.f3577s = z6;
        this.f3578w1 = colorStateList == null ? ColorStateList.valueOf(-67108864) : colorStateList;
        this.f3579x1 = dimension;
        this.f3580y1 = dimensionPixelSize;
        this.f3581z1 = dimensionPixelSize2;
        this.f3572D1 = z8 ? new ViewOnClickListenerC0711a() : null;
        this.f3573E1 = z7;
        if (resourceId2 != -1) {
            this.f3571C1 = new C0715e(getContext(), resourceId2, resourceId3);
        }
        C0718a c0718a = new C0718a(context, attributeSet);
        this.f3574c = c0718a;
        boolean z9 = c0718a.f3612z1;
        if (z7 && z9) {
            throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
        }
        setFillViewport(!z9);
        addView(c0718a, -1, -1);
    }

    /* renamed from: a */
    public final void m2228a(int i7, float f7) {
        int m2696b;
        int i8;
        int m4022c;
        int m4022c2;
        int m4023d;
        C0718a c0718a = this.f3574c;
        int childCount = c0718a.getChildCount();
        if (childCount == 0 || i7 < 0 || i7 >= childCount) {
            return;
        }
        boolean m4026g = C1664e.m4026g(this);
        View childAt = c0718a.getChildAt(i7);
        int m4024e = C1664e.m4024e(childAt);
        if (childAt == null) {
            m2696b = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            m2696b = C0920g.m2696b(marginLayoutParams) + C0920g.m2697c(marginLayoutParams);
        }
        int i9 = (int) ((m2696b + m4024e) * f7);
        if (c0718a.f3612z1) {
            if (0.0f < f7 && f7 < 1.0f) {
                View childAt2 = c0718a.getChildAt(i7 + 1);
                i9 = Math.round(f7 * (C1664e.m4022c(childAt2) + (C1664e.m4024e(childAt2) / 2) + C1664e.m4021b(childAt) + (C1664e.m4024e(childAt) / 2)));
            }
            View childAt3 = c0718a.getChildAt(0);
            int m4024e2 = C1664e.m4024e(childAt3);
            if (m4026g) {
                m4022c = C1664e.m4021b(childAt3) + m4024e2;
                m4022c2 = C1664e.m4021b(childAt) + C1664e.m4024e(childAt);
                m4023d = (C1664e.m4020a(childAt, false) - C1664e.m4021b(childAt)) - i9;
            } else {
                m4022c = C1664e.m4022c(childAt3) + m4024e2;
                m4022c2 = C1664e.m4022c(childAt) + C1664e.m4024e(childAt);
                m4023d = (C1664e.m4023d(childAt, false) - C1664e.m4022c(childAt)) + i9;
            }
            scrollTo(m4023d - ((m4022c - m4022c2) / 2), 0);
            return;
        }
        int i10 = this.f3575e;
        if (i10 == -1) {
            if (0.0f < f7 && f7 < 1.0f) {
                View childAt4 = c0718a.getChildAt(i7 + 1);
                i9 = Math.round(f7 * (C1664e.m4022c(childAt4) + (C1664e.m4024e(childAt4) / 2) + C1664e.m4021b(childAt) + (C1664e.m4024e(childAt) / 2)));
            }
            int m4025f = C1664e.m4025f(childAt);
            if (m4026g) {
                int width = (getWidth() / 2) + ((-m4025f) / 2);
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                i8 = width - C0946x.e.m2849f(this);
            } else {
                int width2 = (m4025f / 2) - (getWidth() / 2);
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                i8 = C0946x.e.m2849f(this) + width2;
            }
        } else if (m4026g) {
            if (i7 <= 0 && f7 <= 0.0f) {
                i10 = 0;
            }
            i8 = i10;
        } else {
            i8 = (i7 > 0 || f7 > 0.0f) ? -i10 : 0;
        }
        int m4023d2 = C1664e.m4023d(childAt, false);
        int m4022c3 = C1664e.m4022c(childAt);
        scrollTo(m4026g ? getPaddingRight() + getPaddingLeft() + (((m4023d2 + m4022c3) - i9) - getWidth()) + i8 : (m4023d2 - m4022c3) + i9 + i8, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        C2274b c2274b;
        super.onLayout(z6, i7, i8, i9, i10);
        if (!z6 || (c2274b = this.f3569A1) == null) {
            return;
        }
        m2228a(c2274b.getCurrentItem(), 0.0f);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        C0718a c0718a = this.f3574c;
        if (!c0718a.f3612z1 || c0718a.getChildCount() <= 0) {
            return;
        }
        View childAt = c0718a.getChildAt(0);
        View childAt2 = c0718a.getChildAt(c0718a.getChildCount() - 1);
        int measuredWidth = ((i7 - (childAt == null ? 0 : childAt.getMeasuredWidth())) / 2) - C1664e.m4022c(childAt);
        int measuredWidth2 = ((i7 - (childAt2 == null ? 0 : childAt2.getMeasuredWidth())) / 2) - C1664e.m4021b(childAt2);
        c0718a.setMinimumWidth(c0718a.getMeasuredWidth());
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.e.m2854k(this, measuredWidth, paddingTop, measuredWidth2, paddingBottom);
        setClipToPadding(false);
    }

    public void setCustomTabColorizer(InterfaceC0716f interfaceC0716f) {
        C0718a c0718a = this.f3574c;
        c0718a.f3604P1 = interfaceC0716f;
        c0718a.invalidate();
    }

    public void setCustomTabView(InterfaceC0717g interfaceC0717g) {
        this.f3571C1 = interfaceC0717g;
    }

    public void setDefaultTabTextColor(int i7) {
        this.f3578w1 = ColorStateList.valueOf(i7);
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f3578w1 = colorStateList;
    }

    public void setDistributeEvenly(boolean z6) {
        this.f3573E1 = z6;
    }

    public void setDividerColors(int... iArr) {
        C0718a c0718a = this.f3574c;
        c0718a.f3604P1 = null;
        c0718a.f3598J1.f3614b = iArr;
        c0718a.invalidate();
    }

    public void setIndicationInterpolator(AbstractC1663d abstractC1663d) {
        C0718a c0718a = this.f3574c;
        c0718a.f3603O1 = abstractC1663d;
        c0718a.invalidate();
    }

    public void setOnPageChangeListener(C2274b.h hVar) {
        this.f3570B1 = hVar;
    }

    public void setOnScrollChangeListener(InterfaceC0713c interfaceC0713c) {
    }

    public void setOnTabClickListener(InterfaceC0714d interfaceC0714d) {
    }

    public void setSelectedIndicatorColors(int... iArr) {
        C0718a c0718a = this.f3574c;
        c0718a.f3604P1 = null;
        c0718a.f3598J1.f3613a = iArr;
        c0718a.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewPager(C2274b c2274b) {
        View view;
        C0718a c0718a = this.f3574c;
        c0718a.removeAllViews();
        this.f3569A1 = c2274b;
        if (c2274b == null || c2274b.getAdapter() == null) {
            return;
        }
        C0712b c0712b = new C0712b();
        if (c2274b.f10414j2 == null) {
            c2274b.f10414j2 = new ArrayList();
        }
        c2274b.f10414j2.add(c0712b);
        AbstractC2273a adapter = this.f3569A1.getAdapter();
        for (int i7 = 0; i7 < adapter.mo4299c(); i7++) {
            InterfaceC0717g interfaceC0717g = this.f3571C1;
            if (interfaceC0717g == null) {
                String str = ((C1732h) ((AbstractC1821a.a) ((C1694b) adapter).f8251e.get(i7)).f8254b).f7949e;
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setText(str);
                textView.setTextColor(this.f3578w1);
                textView.setTextSize(0, this.f3579x1);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                int i8 = this.f3576m;
                if (i8 == -1) {
                    TypedValue typedValue = new TypedValue();
                    getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                    i8 = typedValue.resourceId;
                }
                textView.setBackgroundResource(i8);
                textView.setAllCaps(this.f3577s);
                int i9 = this.f3580y1;
                textView.setPadding(i9, 0, i9, 0);
                int i10 = this.f3581z1;
                view = textView;
                if (i10 > 0) {
                    textView.setMinWidth(i10);
                    view = textView;
                }
            } else {
                view = interfaceC0717g.mo118c(c0718a, i7, adapter);
            }
            if (view == null) {
                throw new IllegalStateException("tabView is null.");
            }
            if (this.f3573E1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            ViewOnClickListenerC0711a viewOnClickListenerC0711a = this.f3572D1;
            if (viewOnClickListenerC0711a != null) {
                view.setOnClickListener(viewOnClickListenerC0711a);
            }
            c0718a.addView(view);
            if (i7 == this.f3569A1.getCurrentItem()) {
                view.setSelected(true);
            }
        }
    }
}
