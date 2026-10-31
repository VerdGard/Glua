package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.appcompat.widget.C0216c;
import androidx.appcompat.widget.C0256p0;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import p016c.C0545b0;
import p034e0.InterfaceC0926j;

/* loaded from: classes.dex */
public class ActionMenuView extends C0256p0 implements C0159f.b, InterfaceC0164k {

    /* renamed from: H1 */
    public C0159f f621H1;

    /* renamed from: I1 */
    public Context f622I1;

    /* renamed from: J1 */
    public int f623J1;

    /* renamed from: K1 */
    public boolean f624K1;

    /* renamed from: L1 */
    public C0216c f625L1;

    /* renamed from: M1 */
    public InterfaceC0163j.a f626M1;

    /* renamed from: N1 */
    public C0159f.a f627N1;

    /* renamed from: O1 */
    public boolean f628O1;

    /* renamed from: P1 */
    public int f629P1;

    /* renamed from: Q1 */
    public final int f630Q1;

    /* renamed from: R1 */
    public final int f631R1;

    /* renamed from: S1 */
    public InterfaceC0177e f632S1;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0173a {
        /* renamed from: a */
        boolean mo487a();

        /* renamed from: b */
        boolean mo488b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0174b implements InterfaceC0163j.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: b */
        public final void mo550b(C0159f c0159f, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: c */
        public final boolean mo551c(C0159f c0159f) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0175c extends C0256p0.a {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f633a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f634b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f635c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f636d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f637e;

        /* renamed from: f */
        public boolean f638f;

        public C0175c() {
            super(-2, -2);
            this.f633a = false;
        }

        public C0175c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0175c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0175c(C0175c c0175c) {
            super(c0175c);
            this.f633a = c0175c.f633a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0176d implements C0159f.a {
        public C0176d() {
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: a */
        public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
            boolean z6;
            boolean onMenuItemSelected;
            InterfaceC0177e interfaceC0177e = ActionMenuView.this.f632S1;
            if (interfaceC0177e == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<InterfaceC0926j> it = toolbar.f754Y1.f4800a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                if (it.next().m2724c()) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                onMenuItemSelected = true;
            } else {
                Toolbar.InterfaceC0207h interfaceC0207h = toolbar.f756a2;
                onMenuItemSelected = interfaceC0207h != null ? C0545b0.this.f2710b.onMenuItemSelected(0, menuItem) : false;
            }
            return onMenuItemSelected;
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: b */
        public final void mo549b(C0159f c0159f) {
            C0159f.a aVar = ActionMenuView.this.f627N1;
            if (aVar != null) {
                aVar.mo549b(c0159f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0177e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f630Q1 = (int) (56.0f * f7);
        this.f631R1 = (int) (f7 * 4.0f);
        this.f622I1 = context;
        this.f623J1 = 0;
    }

    /* renamed from: j */
    public static C0175c m588j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            C0175c c0175c = new C0175c();
            ((LinearLayout.LayoutParams) c0175c).gravity = 16;
            return c0175c;
        }
        C0175c c0175c2 = layoutParams instanceof C0175c ? new C0175c((C0175c) layoutParams) : new C0175c(layoutParams);
        if (((LinearLayout.LayoutParams) c0175c2).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0175c2).gravity = 16;
        }
        return c0175c2;
    }

    @Override // androidx.appcompat.view.menu.C0159f.b
    /* renamed from: a */
    public final boolean mo495a(C0161h c0161h) {
        return this.f621H1.m541q(c0161h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k
    /* renamed from: b */
    public final void mo496b(C0159f c0159f) {
        this.f621H1 = c0159f;
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0175c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.C0256p0
    /* renamed from: f */
    public final C0256p0.a generateDefaultLayoutParams() {
        C0175c c0175c = new C0175c();
        ((LinearLayout.LayoutParams) c0175c).gravity = 16;
        return c0175c;
    }

    @Override // androidx.appcompat.widget.C0256p0
    /* renamed from: g */
    public final C0256p0.a generateLayoutParams(AttributeSet attributeSet) {
        return new C0175c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0175c c0175c = new C0175c();
        ((LinearLayout.LayoutParams) c0175c).gravity = 16;
        return c0175c;
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0175c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m588j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f621H1 == null) {
            Context context = getContext();
            C0159f c0159f = new C0159f(context);
            this.f621H1 = c0159f;
            c0159f.f476e = new C0176d();
            C0216c c0216c = new C0216c(context);
            this.f625L1 = c0216c;
            c0216c.f822B1 = true;
            c0216c.f823C1 = true;
            InterfaceC0163j.a aVar = this.f626M1;
            if (aVar == null) {
                aVar = new C0174b();
            }
            c0216c.f410X = aVar;
            this.f621H1.m526b(c0216c, this.f622I1);
            C0216c c0216c2 = this.f625L1;
            c0216c2.f417w1 = this;
            this.f621H1 = c0216c2.f415m;
        }
        return this.f621H1;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0216c c0216c = this.f625L1;
        C0216c.d dVar = c0216c.f835y1;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c0216c.f821A1) {
            return c0216c.f836z1;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f623J1;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.C0256p0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0256p0.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m588j(layoutParams);
    }

    /* renamed from: k */
    public final boolean m592k(int i7) {
        boolean z6 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC0173a)) {
            z6 = false | ((InterfaceC0173a) childAt).mo487a();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC0173a)) ? z6 : z6 | ((InterfaceC0173a) childAt2).mo488b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0216c c0216c = this.f625L1;
        if (c0216c != null) {
            c0216c.mo504g();
            if (this.f625L1.m698h()) {
                this.f625L1.m697c();
                this.f625L1.m699n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0216c c0216c = this.f625L1;
        if (c0216c != null) {
            c0216c.m697c();
            C0216c.a aVar = c0216c.f830J1;
            if (aVar == null || !aVar.m561b()) {
                return;
            }
            aVar.f538j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f628O1) {
            super.onLayout(z6, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean m872a = C0257p1.m872a(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C0175c c0175c = (C0175c) childAt.getLayoutParams();
                if (c0175c.f633a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m592k(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m872a) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0175c).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0175c).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0175c).leftMargin) + ((LinearLayout.LayoutParams) c0175c).rightMargin;
                    m592k(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (m872a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C0175c c0175c2 = (C0175c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0175c2.f633a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c0175c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0175c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C0175c c0175c3 = (C0175c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0175c3.f633a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c0175c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0175c3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // androidx.appcompat.widget.C0256p0, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        ?? r42;
        int i14;
        int i15;
        int i16;
        C0159f c0159f;
        boolean z8 = this.f628O1;
        boolean z9 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f628O1 = z9;
        if (z8 != z9) {
            this.f629P1 = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f628O1 && (c0159f = this.f621H1) != null && size != this.f629P1) {
            this.f629P1 = size;
            c0159f.mo540p(true);
        }
        int childCount = getChildCount();
        if (!this.f628O1 || childCount <= 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                C0175c c0175c = (C0175c) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) c0175c).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0175c).leftMargin = 0;
            }
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.f630Q1;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = (i21 / i20) + i19;
        int childCount2 = getChildCount();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z10 = false;
        long j7 = 0;
        int i27 = 0;
        while (true) {
            i9 = this.f631R1;
            if (i26 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i26);
            int i28 = size3;
            int i29 = i18;
            if (childAt.getVisibility() == 8) {
                i14 = mode;
                i15 = paddingBottom;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i30 = i24 + 1;
                if (z11) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C0175c c0175c2 = (C0175c) childAt.getLayoutParams();
                c0175c2.f638f = false;
                c0175c2.f635c = 0;
                c0175c2.f634b = 0;
                c0175c2.f636d = false;
                ((LinearLayout.LayoutParams) c0175c2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0175c2).rightMargin = 0;
                c0175c2.f637e = z11 && ((ActionMenuItemView) childAt).m490l();
                int i31 = c0175c2.f633a ? 1 : i20;
                C0175c c0175c3 = (C0175c) childAt.getLayoutParams();
                i14 = mode;
                i15 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = actionMenuItemView != null && actionMenuItemView.m490l();
                if (i31 <= 0 || (z12 && i31 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i31 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i22;
                    if (measuredWidth % i22 != 0) {
                        i16++;
                    }
                    if (z12 && i16 < 2) {
                        i16 = 2;
                    }
                }
                c0175c3.f636d = !c0175c3.f633a && z12;
                c0175c3.f634b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i16, 1073741824), makeMeasureSpec);
                i25 = Math.max(i25, i16);
                if (c0175c2.f636d) {
                    i27++;
                }
                if (c0175c2.f633a) {
                    z10 = true;
                }
                i20 -= i16;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j7 |= 1 << i26;
                }
                i24 = i30;
            }
            i26++;
            size3 = i28;
            i18 = i29;
            paddingBottom = i15;
            mode = i14;
        }
        int i32 = mode;
        int i33 = i18;
        int i34 = size3;
        boolean z13 = z10 && i24 == 2;
        boolean z14 = false;
        while (i27 > 0 && i20 > 0) {
            int i35 = Integer.MAX_VALUE;
            int i36 = 0;
            int i37 = 0;
            long j8 = 0;
            while (i37 < childCount2) {
                C0175c c0175c4 = (C0175c) getChildAt(i37).getLayoutParams();
                boolean z15 = z14;
                if (c0175c4.f636d) {
                    int i38 = c0175c4.f634b;
                    if (i38 < i35) {
                        j8 = 1 << i37;
                        i35 = i38;
                        i36 = 1;
                    } else if (i38 == i35) {
                        j8 |= 1 << i37;
                        i36++;
                    }
                }
                i37++;
                z14 = z15;
            }
            z6 = z14;
            j7 |= j8;
            if (i36 > i20) {
                break;
            }
            int i39 = i35 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                C0175c c0175c5 = (C0175c) childAt2.getLayoutParams();
                int i41 = i23;
                int i42 = childMeasureSpec;
                int i43 = childCount2;
                long j9 = 1 << i40;
                if ((j8 & j9) != 0) {
                    if (z13 && c0175c5.f637e) {
                        r42 = 1;
                        r42 = 1;
                        if (i20 == 1) {
                            childAt2.setPadding(i9 + i22, 0, i9, 0);
                        }
                    } else {
                        r42 = 1;
                    }
                    c0175c5.f634b += r42;
                    c0175c5.f638f = r42;
                    i20--;
                } else if (c0175c5.f634b == i39) {
                    j7 |= j9;
                }
                i40++;
                childMeasureSpec = i42;
                i23 = i41;
                childCount2 = i43;
            }
            z14 = true;
        }
        z6 = z14;
        int i44 = i23;
        int i45 = childMeasureSpec;
        int i46 = childCount2;
        boolean z16 = !z10 && i24 == 1;
        if (i20 <= 0 || j7 == 0 || (i20 >= i24 - 1 && !z16 && i25 <= 1)) {
            i10 = i46;
            z7 = z6;
        } else {
            float bitCount = Long.bitCount(j7);
            if (!z16) {
                if ((j7 & 1) != 0 && !((C0175c) getChildAt(0).getLayoutParams()).f637e) {
                    bitCount -= 0.5f;
                }
                int i47 = i46 - 1;
                if ((j7 & (1 << i47)) != 0 && !((C0175c) getChildAt(i47).getLayoutParams()).f637e) {
                    bitCount -= 0.5f;
                }
            }
            int i48 = bitCount > 0.0f ? (int) ((i20 * i22) / bitCount) : 0;
            boolean z17 = z6;
            i10 = i46;
            for (int i49 = 0; i49 < i10; i49++) {
                if ((j7 & (1 << i49)) != 0) {
                    View childAt3 = getChildAt(i49);
                    C0175c c0175c6 = (C0175c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0175c6.f635c = i48;
                        c0175c6.f638f = true;
                        if (i49 == 0 && !c0175c6.f637e) {
                            ((LinearLayout.LayoutParams) c0175c6).leftMargin = (-i48) / 2;
                        }
                    } else if (c0175c6.f633a) {
                        c0175c6.f635c = i48;
                        c0175c6.f638f = true;
                        ((LinearLayout.LayoutParams) c0175c6).rightMargin = (-i48) / 2;
                    } else {
                        if (i49 != 0) {
                            ((LinearLayout.LayoutParams) c0175c6).leftMargin = i48 / 2;
                        }
                        if (i49 != i10 - 1) {
                            ((LinearLayout.LayoutParams) c0175c6).rightMargin = i48 / 2;
                        }
                    }
                    z17 = true;
                }
            }
            z7 = z17;
        }
        if (z7) {
            int i50 = 0;
            while (i50 < i10) {
                View childAt4 = getChildAt(i50);
                C0175c c0175c7 = (C0175c) childAt4.getLayoutParams();
                if (c0175c7.f638f) {
                    i13 = i45;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0175c7.f634b * i22) + c0175c7.f635c, 1073741824), i13);
                } else {
                    i13 = i45;
                }
                i50++;
                i45 = i13;
            }
        }
        if (i32 != 1073741824) {
            i12 = i33;
            i11 = i44;
        } else {
            i11 = i34;
            i12 = i33;
        }
        setMeasuredDimension(i12, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f625L1.f827G1 = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC0177e interfaceC0177e) {
        this.f632S1 = interfaceC0177e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0216c c0216c = this.f625L1;
        C0216c.d dVar = c0216c.f835y1;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c0216c.f821A1 = true;
            c0216c.f836z1 = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f624K1 = z6;
    }

    public void setPopupTheme(int i7) {
        if (this.f623J1 != i7) {
            this.f623J1 = i7;
            if (i7 == 0) {
                this.f622I1 = getContext();
            } else {
                this.f622I1 = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C0216c c0216c) {
        this.f625L1 = c0216c;
        c0216c.f417w1 = this;
        this.f621H1 = c0216c.f415m;
    }
}
