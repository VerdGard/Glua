package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.widget.C0216c;
import p034e0.C0946x;
import p049g.AbstractC1183a;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0210a {

    /* renamed from: A1 */
    public CharSequence f577A1;

    /* renamed from: B1 */
    public CharSequence f578B1;

    /* renamed from: C1 */
    public View f579C1;

    /* renamed from: D1 */
    public View f580D1;

    /* renamed from: E1 */
    public View f581E1;

    /* renamed from: F1 */
    public LinearLayout f582F1;

    /* renamed from: G1 */
    public TextView f583G1;

    /* renamed from: H1 */
    public TextView f584H1;

    /* renamed from: I1 */
    public final int f585I1;

    /* renamed from: J1 */
    public final int f586J1;

    /* renamed from: K1 */
    public boolean f587K1;

    /* renamed from: L1 */
    public final int f588L1;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0167a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ AbstractC1183a f589c;

        public ViewOnClickListenerC0167a(AbstractC1183a abstractC1183a) {
            this.f589c = abstractC1183a;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f589c.mo1890c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = androidx.appcompat.R$attr.actionModeStyle
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.appcompat.R$styleable.f276d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r0 = androidx.appcompat.R$styleable.ActionMode_background
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L1f
            int r1 = r5.getResourceId(r0, r2)
            if (r1 == 0) goto L1f
            android.graphics.drawable.Drawable r4 = p025d.C0872a.m2561a(r4, r1)
            goto L23
        L1f:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L23:
            java.util.WeakHashMap<android.view.View, e0.h0> r0 = p034e0.C0946x.f4876a
            p034e0.C0946x.d.m2841q(r3, r4)
            int r4 = androidx.appcompat.R$styleable.ActionMode_titleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.f585I1 = r4
            int r4 = androidx.appcompat.R$styleable.ActionMode_subtitleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.f586J1 = r4
            int r4 = androidx.appcompat.R$styleable.ActionMode_height
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f794w1 = r4
            int r4 = androidx.appcompat.R$styleable.ActionMode_closeItemLayout
            int r0 = androidx.appcompat.R$layout.abc_action_mode_close_item_material
            int r4 = r5.getResourceId(r4, r0)
            r3.f588L1 = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m566f(p049g.AbstractC1183a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f579C1
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f588L1
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f579C1 = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r5.f579C1
        L1e:
            r5.addView(r0)
        L21:
            android.view.View r0 = r5.f579C1
            int r2 = androidx.appcompat.R$id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            r5.f580D1 = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r6 = r6.mo1892e()
            androidx.appcompat.widget.c r0 = r5.f793s
            if (r0 == 0) goto L4d
            r0.m697c()
            androidx.appcompat.widget.c$a r0 = r0.f830J1
            if (r0 == 0) goto L4d
            boolean r2 = r0.m561b()
            if (r2 == 0) goto L4d
            h.d r0 = r0.f538j
            r0.dismiss()
        L4d:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f793s = r0
            r2 = 1
            r0.f822B1 = r2
            r0.f823C1 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.c r2 = r5.f793s
            android.content.Context r3 = r5.f791e
            r6.m526b(r2, r3)
            androidx.appcompat.widget.c r6 = r5.f793s
            androidx.appcompat.view.menu.k r2 = r6.f417w1
            if (r2 != 0) goto L85
            android.view.LayoutInflater r3 = r6.f416s
            int r4 = r6.f411Y
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.InterfaceC0164k) r1
            r6.f417w1 = r1
            androidx.appcompat.view.menu.f r3 = r6.f415m
            r1.mo496b(r3)
            r6.mo504g()
        L85:
            androidx.appcompat.view.menu.k r1 = r6.f417w1
            if (r2 == r1) goto L8f
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L8f:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f792m = r1
            java.util.WeakHashMap<android.view.View, e0.h0> r6 = p034e0.C0946x.f4876a
            r6 = 0
            p034e0.C0946x.d.m2841q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f792m
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m566f(g.a):void");
    }

    /* renamed from: g */
    public final void m567g() {
        if (this.f582F1 == null) {
            LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f582F1 = linearLayout;
            this.f583G1 = (TextView) linearLayout.findViewById(R$id.action_bar_title);
            this.f584H1 = (TextView) this.f582F1.findViewById(R$id.action_bar_subtitle);
            int i7 = this.f585I1;
            if (i7 != 0) {
                this.f583G1.setTextAppearance(getContext(), i7);
            }
            int i8 = this.f586J1;
            if (i8 != 0) {
                this.f584H1.setTextAppearance(getContext(), i8);
            }
        }
        this.f583G1.setText(this.f577A1);
        this.f584H1.setText(this.f578B1);
        boolean z6 = !TextUtils.isEmpty(this.f577A1);
        boolean z7 = !TextUtils.isEmpty(this.f578B1);
        int i9 = 0;
        this.f584H1.setVisibility(z7 ? 0 : 8);
        LinearLayout linearLayout2 = this.f582F1;
        if (!z6 && !z7) {
            i9 = 8;
        }
        linearLayout2.setVisibility(i9);
        if (this.f582F1.getParent() == null) {
            addView(this.f582F1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0210a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0210a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f578B1;
    }

    public CharSequence getTitle() {
        return this.f577A1;
    }

    /* renamed from: h */
    public final void m568h() {
        removeAllViews();
        this.f581E1 = null;
        this.f792m = null;
        this.f793s = null;
        View view = this.f580D1;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0216c c0216c = this.f793s;
        if (c0216c != null) {
            c0216c.m697c();
            C0216c.a aVar = this.f793s.f830J1;
            if (aVar == null || !aVar.m561b()) {
                return;
            }
            aVar.f538j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean m872a = C0257p1.m872a(this);
        int paddingRight = m872a ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f579C1;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f579C1.getLayoutParams();
            int i11 = m872a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = m872a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = m872a ? paddingRight - i11 : paddingRight + i11;
            int m649d = AbstractC0210a.m649d(i13, paddingTop, paddingTop2, this.f579C1, m872a) + i13;
            paddingRight = m872a ? m649d - i12 : m649d + i12;
        }
        LinearLayout linearLayout = this.f582F1;
        if (linearLayout != null && this.f581E1 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0210a.m649d(paddingRight, paddingTop, paddingTop2, this.f582F1, m872a);
        }
        View view2 = this.f581E1;
        if (view2 != null) {
            AbstractC0210a.m649d(paddingRight, paddingTop, paddingTop2, view2, m872a);
        }
        int paddingLeft = m872a ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f792m;
        if (actionMenuView != null) {
            AbstractC0210a.m649d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !m872a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f794w1;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f579C1;
        if (view != null) {
            int m648c = AbstractC0210a.m648c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f579C1.getLayoutParams();
            paddingLeft = m648c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f792m;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0210a.m648c(this.f792m, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f582F1;
        if (linearLayout != null && this.f581E1 == null) {
            if (this.f587K1) {
                this.f582F1.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f582F1.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f582F1.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = AbstractC0210a.m648c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f581E1;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f581E1.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f794w1 <= 0) {
            int childCount = getChildCount();
            i9 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // androidx.appcompat.widget.AbstractC0210a
    public void setContentHeight(int i7) {
        this.f794w1 = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f581E1;
        if (view2 != null) {
            removeView(view2);
        }
        this.f581E1 = view;
        if (view != null && (linearLayout = this.f582F1) != null) {
            removeView(linearLayout);
            this.f582F1 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f578B1 = charSequence;
        m567g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f577A1 = charSequence;
        m567g();
        C0946x.m2818s(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f587K1) {
            requestLayout();
        }
        this.f587K1 = z6;
    }

    @Override // androidx.appcompat.widget.AbstractC0210a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
