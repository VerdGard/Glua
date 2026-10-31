package p045f3;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import p025d.C0872a;
import p166v.C2009a;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public class C1166a extends CardView implements Checkable, InterfaceC2244m {

    /* renamed from: A1 */
    public static final int[] f5734A1 = {R$attr.state_dragged};

    /* renamed from: z1 */
    public boolean f5735z1;

    /* renamed from: f3.a$a */
    public interface a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C2240i getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 3);
        if (this.f5735z1) {
            View.mergeDrawableStates(onCreateDrawableState, f5734A1);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i7) {
        ColorStateList.valueOf(i7);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f7) {
        super.setCardElevation(f7);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z6) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i7) {
        throw null;
    }

    public void setCheckedIconMargin(int i7) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i7) {
        if (i7 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i7);
        throw null;
    }

    public void setCheckedIconResource(int i7) {
        C0872a.m2561a(getContext(), i7);
        throw null;
    }

    public void setCheckedIconSize(int i7) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i7) {
        if (i7 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i7);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
    }

    public void setDragged(boolean z6) {
        if (this.f5735z1 != z6) {
            this.f5735z1 = z6;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                throw null;
            }
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f7) {
        super.setMaxCardElevation(f7);
        throw null;
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z6) {
        super.setPreventCornerOverlap(z6);
        throw null;
    }

    public void setProgress(float f7) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f7) {
        super.setRadius(f7);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i7) {
        C2009a.m4896c(i7, getContext());
        throw null;
    }

    @Override // p193y3.InterfaceC2244m
    public void setShapeAppearanceModel(C2240i c2240i) {
        setClipToOutline(c2240i.m5435d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i7) {
        setStrokeColor(ColorStateList.valueOf(i7));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i7) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z6) {
        super.setUseCompatPadding(z6);
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }
}
