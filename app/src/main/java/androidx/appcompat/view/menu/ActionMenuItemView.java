package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0216c;
import androidx.appcompat.widget.C0245l1;
import p057h.InterfaceC1272f;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0164k.a, View.OnClickListener, ActionMenuView.InterfaceC0173a {

    /* renamed from: A1 */
    public CharSequence f379A1;

    /* renamed from: B1 */
    public Drawable f380B1;

    /* renamed from: C1 */
    public C0159f.b f381C1;

    /* renamed from: D1 */
    public C0152a f382D1;

    /* renamed from: E1 */
    public AbstractC0153b f383E1;

    /* renamed from: F1 */
    public boolean f384F1;

    /* renamed from: G1 */
    public boolean f385G1;

    /* renamed from: H1 */
    public final int f386H1;

    /* renamed from: I1 */
    public int f387I1;

    /* renamed from: J1 */
    public final int f388J1;

    /* renamed from: z1 */
    public C0161h f389z1;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0152a extends AbstractViewOnTouchListenerC0253o0 {
        public C0152a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
        /* renamed from: b */
        public final InterfaceC1272f mo493b() {
            C0216c.a aVar;
            AbstractC0153b abstractC0153b = ActionMenuItemView.this.f383E1;
            if (abstractC0153b == null || (aVar = C0216c.this.f830J1) == null) {
                return null;
            }
            return aVar.m560a();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
        /* renamed from: c */
        public final boolean mo494c() {
            InterfaceC1272f mo493b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0159f.b bVar = actionMenuItemView.f381C1;
            return bVar != null && bVar.mo495a(actionMenuItemView.f389z1) && (mo493b = mo493b()) != null && mo493b.mo502c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0153b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f384F1 = m491m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f275c, 0, 0);
        this.f386H1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f388J1 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f387I1 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0173a
    /* renamed from: a */
    public final boolean mo487a() {
        return m490l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0173a
    /* renamed from: b */
    public final boolean mo488b() {
        return m490l() && this.f389z1.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    /* renamed from: c */
    public final void mo489c(C0161h c0161h) {
        this.f389z1 = c0161h;
        setIcon(c0161h.getIcon());
        setTitle(c0161h.getTitleCondensed());
        setId(c0161h.f502a);
        setVisibility(c0161h.isVisible() ? 0 : 8);
        setEnabled(c0161h.isEnabled());
        if (c0161h.hasSubMenu() && this.f382D1 == null) {
            this.f382D1 = new C0152a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k.a
    public C0161h getItemData() {
        return this.f389z1;
    }

    /* renamed from: l */
    public final boolean m490l() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: m */
    public final boolean m491m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: n */
    public final void m492n() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f379A1);
        if (this.f380B1 != null) {
            if (!((this.f389z1.f526y & 4) == 4) || (!this.f384F1 && !this.f385G1)) {
                z6 = false;
            }
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f379A1 : null);
        CharSequence charSequence = this.f389z1.f518q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z8 ? null : this.f389z1.f506e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f389z1.f519r;
        if (TextUtils.isEmpty(charSequence2)) {
            C0245l1.m845a(this, z8 ? null : this.f389z1.f506e);
        } else {
            C0245l1.m845a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0159f.b bVar = this.f381C1;
        if (bVar != null) {
            bVar.mo495a(this.f389z1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f384F1 = m491m();
        m492n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean m490l = m490l();
        if (m490l && (i9 = this.f387I1) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f386H1;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (m490l || this.f380B1 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f380B1.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0152a c0152a;
        if (this.f389z1.hasSubMenu() && (c0152a = this.f382D1) != null && c0152a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f385G1 != z6) {
            this.f385G1 = z6;
            C0161h c0161h = this.f389z1;
            if (c0161h != null) {
                C0159f c0159f = c0161h.f515n;
                c0159f.f482k = true;
                c0159f.mo540p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f380B1 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f388J1;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        m492n();
    }

    public void setItemInvoker(C0159f.b bVar) {
        this.f381C1 = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f387I1 = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC0153b abstractC0153b) {
        this.f383E1 = abstractC0153b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f379A1 = charSequence;
        m492n();
    }
}
