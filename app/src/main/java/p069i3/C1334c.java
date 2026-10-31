package p069i3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;
import p131q3.C1749e;

/* renamed from: i3.c */
/* loaded from: classes.dex */
public final class C1334c extends C1749e {

    /* renamed from: w1 */
    public int f6535w1;

    /* renamed from: x1 */
    public int f6536x1;

    /* renamed from: i3.c$a */
    public class a implements d {
    }

    /* renamed from: i3.c$b */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* renamed from: i3.c$c */
    public interface c {
    }

    /* renamed from: i3.c$d */
    public interface d {
    }

    private int getVisibleChipCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) instanceof Chip) {
                if (getChildAt(i8).getVisibility() == 0) {
                    i7++;
                }
            }
        }
        return i7;
    }

    @Override // p131q3.C1749e
    /* renamed from: a */
    public final boolean mo3690a() {
        return this.f8034m;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f6535w1;
    }

    public int getChipSpacingVertical() {
        return this.f6536x1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f8034m) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f6535w1 != i7) {
            this.f6535w1 = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f6536x1 != i7) {
            this.f6536x1 = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        setOnCheckedStateChangeListener(cVar == null ? null : new a());
    }

    public void setOnCheckedStateChangeListener(d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z6) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    @Override // p131q3.C1749e
    public void setSingleLine(boolean z6) {
        super.setSingleLine(z6);
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    public void setSingleSelection(boolean z6) {
        throw null;
    }
}
