package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p034e0.C0923h0;
import p034e0.C0946x;
import p082k0.AbstractC1446a;
import p131q3.C1763s;

/* loaded from: classes.dex */
public final class SearchBar extends Toolbar {

    /* renamed from: m2 */
    public Drawable f4351m2;

    /* renamed from: n2 */
    public int f4352n2;

    /* renamed from: o2 */
    public boolean f4353o2;

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: Z */
        public boolean f4354Z;

        public ScrollingViewBehavior() {
            this.f4354Z = false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4354Z = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: h */
        public final boolean mo981h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.mo981h(coordinatorLayout, view, view2);
            if (!this.f4354Z && (view2 instanceof AppBarLayout)) {
                this.f4354Z = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                if (Build.VERSION.SDK_INT == 21) {
                    appBarLayout.setOutlineProvider(null);
                } else {
                    appBarLayout.setTargetElevation(0.0f);
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$a */
    public static class C0826a extends AbstractC1446a {
        public static final Parcelable.Creator<C0826a> CREATOR = new a();

        /* renamed from: m */
        public String f4355m;

        public C0826a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4355m = parcel.readString();
        }

        public C0826a(Toolbar.C0208i c0208i) {
            super(c0208i);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeString(this.f4355m);
        }

        /* renamed from: com.google.android.material.search.SearchBar$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C0826a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0826a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0826a[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0826a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0826a(parcel, classLoader);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z6) {
        ImageButton m4236a = C1763s.m4236a(this);
        if (m4236a == null) {
            return;
        }
        m4236a.setClickable(!z6);
        m4236a.setFocusable(!z6);
        Drawable background = m4236a.getBackground();
        if (background != null) {
            this.f4351m2 = background;
        }
        m4236a.setBackgroundDrawable(z6 ? null : this.f4351m2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.i.m2876i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public int getDefaultMarginVerticalResource() {
        return R$dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f4352n2;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: k */
    public final void mo632k(int i7) {
        Menu menu = getMenu();
        boolean z6 = menu instanceof C0159f;
        if (z6) {
            ((C0159f) menu).m547w();
        }
        super.mo632k(i7);
        this.f4352n2 = i7;
        if (z6) {
            ((C0159f) menu).m546v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m78R(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0826a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0826a c0826a = (C0826a) parcelable;
        super.onRestoreInstanceState(c0826a.f6946c);
        setText(c0826a.f4355m);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0826a c0826a = new C0826a((Toolbar.C0208i) super.onSaveInstanceState());
        CharSequence text = getText();
        c0826a.f4355m = text == null ? null : text.toString();
        return c0826a;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z6) {
        this.f4353o2 = z6;
        if (getLayoutParams() instanceof AppBarLayout.C0740d) {
            AppBarLayout.C0740d c0740d = (AppBarLayout.C0740d) getLayoutParams();
            if (this.f4353o2) {
                if (c0740d.f3791a == 0) {
                    c0740d.f3791a = 53;
                }
            } else if (c0740d.f3791a == 53) {
                c0740d.f3791a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
    }

    public void setHint(int i7) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z6) {
        throw null;
    }

    public void setStrokeColor(int i7) {
        if (getStrokeColor() == i7) {
            return;
        }
        ColorStateList.valueOf(i7);
        throw null;
    }

    public void setStrokeWidth(float f7) {
        if (getStrokeWidth() != f7) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(int i7) {
        throw null;
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
