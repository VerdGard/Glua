package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.C0117b;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import java.util.HashMap;
import p002a1.C0017d;
import p082k0.AbstractC1446a;
import p139r3.C1829g;
import p139r3.InterfaceC1824b;

/* loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC0288b, InterfaceC1824b {

    /* renamed from: c */
    public SearchBar f4356c;

    /* renamed from: e */
    public int f4357e;

    /* renamed from: m */
    public EnumC0829c f4358m;

    public static class Behavior extends CoordinatorLayout.AbstractC0289c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: h */
        public final boolean mo981h(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            SearchView searchView2 = searchView;
            if (!(searchView2.f4356c != null) && (view instanceof SearchBar)) {
                searchView2.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$a */
    public static class C0827a extends AbstractC1446a {
        public static final Parcelable.Creator<C0827a> CREATOR = new a();

        /* renamed from: m */
        public String f4359m;

        /* renamed from: s */
        public int f4360s;

        public C0827a() {
            throw null;
        }

        public C0827a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4359m = parcel.readString();
            this.f4360s = parcel.readInt();
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeString(this.f4359m);
            parcel.writeInt(this.f4360s);
        }

        /* renamed from: com.google.android.material.search.SearchView$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C0827a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0827a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0827a[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0827a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0827a(parcel, classLoader);
            }
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$b */
    public interface InterfaceC0828b {
        /* renamed from: a */
        void m2482a();
    }

    /* renamed from: com.google.android.material.search.SearchView$c */
    public enum EnumC0829c {
        f4361c,
        f4362e,
        /* JADX INFO: Fake field, exist only in values array */
        EF4,
        f4363m;

        EnumC0829c() {
        }
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f4356c;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R$dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z6) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f7) {
    }

    private void setUpHeaderLayout(int i7) {
        if (i7 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i7) {
        throw null;
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: a */
    public final void mo2308a() {
        if (!m2481e()) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: b */
    public final void mo2309b(C0117b c0117b) {
        if (!m2481e() && this.f4356c != null) {
            throw null;
        }
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: c */
    public final void mo2310c(C0117b c0117b) {
        if (!m2481e() && this.f4356c != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: d */
    public final void mo2311d() {
        if (!m2481e() && this.f4356c != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    /* renamed from: e */
    public final boolean m2481e() {
        return this.f4358m.equals(EnumC0829c.f4362e) || this.f4358m.equals(EnumC0829c.f4361c);
    }

    public C1829g getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0288b
    public CoordinatorLayout.AbstractC0289c<SearchView> getBehavior() {
        return new Behavior();
    }

    public EnumC0829c getCurrentTransitionState() {
        return this.f4358m;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f4357e;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m77Q(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f4357e = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0827a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0827a c0827a = (C0827a) parcelable;
        super.onRestoreInstanceState(c0827a.f6946c);
        setText(c0827a.f4359m);
        setVisible(c0827a.f4360s == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        Editable text = getText();
        if (text != null) {
            text.toString();
        }
        throw null;
    }

    public void setAnimatedNavigationIcon(boolean z6) {
    }

    public void setAutoShowKeyboard(boolean z6) {
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        setUpBackgroundViewElevationOverlay(f7);
    }

    public void setHint(int i7) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z6) {
    }

    public void setModalForAccessibility(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z6) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            if (viewGroup.getChildAt(i7) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC0207h interfaceC0207h) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z6) {
        setStatusBarSpacerEnabledInternal(z6);
    }

    public void setText(int i7) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z6) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[LOOP:0: B:8:0x0023->B:10:0x0029, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTransitionState(com.google.android.material.search.SearchView.EnumC0829c r2) {
        /*
            r1 = this;
            com.google.android.material.search.SearchView$c r0 = r1.f4358m
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            goto L33
        L9:
            com.google.android.material.search.SearchView$c r0 = com.google.android.material.search.SearchView.EnumC0829c.f4363m
            if (r2 != r0) goto Lf
            r0 = 1
            goto L14
        Lf:
            com.google.android.material.search.SearchView$c r0 = com.google.android.material.search.SearchView.EnumC0829c.f4362e
            if (r2 != r0) goto L17
            r0 = 0
        L14:
            r1.setModalForAccessibility(r0)
        L17:
            r1.f4358m = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r0 = 0
            r2.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r2.next()
            com.google.android.material.search.SearchView$b r0 = (com.google.android.material.search.SearchView.InterfaceC0828b) r0
            r0.m2482a()
            goto L23
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.setTransitionState(com.google.android.material.search.SearchView$c):void");
    }

    public void setUseWindowInsetsController(boolean z6) {
    }

    public void setVisible(boolean z6) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f4356c = searchBar;
        throw null;
    }
}
