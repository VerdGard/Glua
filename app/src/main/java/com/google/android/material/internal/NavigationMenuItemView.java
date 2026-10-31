package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.appcompat.widget.C0245l1;
import androidx.appcompat.widget.C0256p0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p066i0.C1315i;
import p131q3.C1750f;
import p173w.C2044f;
import p189y.C2213a;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C1750f implements InterfaceC0164k.a {

    /* renamed from: Y1 */
    public static final int[] f4318Y1 = {R.attr.state_checked};

    /* renamed from: N1 */
    public int f4319N1;

    /* renamed from: O1 */
    public boolean f4320O1;

    /* renamed from: P1 */
    public boolean f4321P1;

    /* renamed from: Q1 */
    public boolean f4322Q1;

    /* renamed from: R1 */
    public final CheckedTextView f4323R1;

    /* renamed from: S1 */
    public FrameLayout f4324S1;

    /* renamed from: T1 */
    public C0161h f4325T1;

    /* renamed from: U1 */
    public ColorStateList f4326U1;

    /* renamed from: V1 */
    public boolean f4327V1;

    /* renamed from: W1 */
    public Drawable f4328W1;

    /* renamed from: X1 */
    public final C0821a f4329X1;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C0821a extends C0908a {
        public C0821a() {
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f4321P1);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f4322Q1 = true;
        C0821a c0821a = new C0821a();
        this.f4329X1 = c0821a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.f4323R1 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0946x.m2817r(checkedTextView, c0821a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f4324S1 == null) {
                this.f4324S1 = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.f4324S1.removeAllViews();
            this.f4324S1.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    /* renamed from: c */
    public final void mo489c(C0161h c0161h) {
        C0256p0.a aVar;
        int i7;
        StateListDrawable stateListDrawable;
        this.f4325T1 = c0161h;
        int i8 = c0161h.f502a;
        if (i8 > 0) {
            setId(i8);
        }
        setVisibility(c0161h.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f4318Y1, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2841q(this, stateListDrawable);
        }
        setCheckable(c0161h.isCheckable());
        setChecked(c0161h.isChecked());
        setEnabled(c0161h.isEnabled());
        setTitle(c0161h.f506e);
        setIcon(c0161h.getIcon());
        setActionView(c0161h.getActionView());
        setContentDescription(c0161h.f518q);
        C0245l1.m845a(this, c0161h.f519r);
        C0161h c0161h2 = this.f4325T1;
        boolean z6 = c0161h2.f506e == null && c0161h2.getIcon() == null && this.f4325T1.getActionView() != null;
        CheckedTextView checkedTextView = this.f4323R1;
        if (z6) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f4324S1;
            if (frameLayout == null) {
                return;
            }
            aVar = (C0256p0.a) frameLayout.getLayoutParams();
            i7 = -1;
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f4324S1;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (C0256p0.a) frameLayout2.getLayoutParams();
            i7 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i7;
        this.f4324S1.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    public C0161h getItemData() {
        return this.f4325T1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        C0161h c0161h = this.f4325T1;
        if (c0161h != null && c0161h.isCheckable() && this.f4325T1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4318Y1);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f4321P1 != z6) {
            this.f4321P1 = z6;
            this.f4329X1.mo1814h(this.f4323R1, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f4323R1;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.f4322Q1) ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f4327V1) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2213a.m5359g(drawable).mutate();
                C2213a.b.m5372h(drawable, this.f4326U1);
            }
            int i7 = this.f4319N1;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f4320O1) {
            if (this.f4328W1 == null) {
                Resources resources = getResources();
                int i8 = R$drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C2044f.f9325a;
                Drawable m5067a = C2044f.a.m5067a(resources, i8, theme);
                this.f4328W1 = m5067a;
                if (m5067a != null) {
                    int i9 = this.f4319N1;
                    m5067a.setBounds(0, 0, i9, i9);
                }
            }
            drawable = this.f4328W1;
        }
        C1315i.b.m3666e(this.f4323R1, drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f4323R1.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f4319N1 = i7;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f4326U1 = colorStateList;
        this.f4327V1 = colorStateList != null;
        C0161h c0161h = this.f4325T1;
        if (c0161h != null) {
            setIcon(c0161h.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f4323R1.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f4320O1 = z6;
    }

    public void setTextAppearance(int i7) {
        C1315i.m3656e(this.f4323R1, i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f4323R1.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4323R1.setText(charSequence);
    }
}
