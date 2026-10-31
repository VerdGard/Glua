package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import p025d.C0872a;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: classes.dex */
public class C0256p0 extends ViewGroup {

    /* renamed from: A1 */
    public int[] f1032A1;

    /* renamed from: B1 */
    public int[] f1033B1;

    /* renamed from: C1 */
    public Drawable f1034C1;

    /* renamed from: D1 */
    public int f1035D1;

    /* renamed from: E1 */
    public int f1036E1;

    /* renamed from: F1 */
    public int f1037F1;

    /* renamed from: G1 */
    public int f1038G1;

    /* renamed from: c */
    public boolean f1039c;

    /* renamed from: e */
    public int f1040e;

    /* renamed from: m */
    public int f1041m;

    /* renamed from: s */
    public int f1042s;

    /* renamed from: w1 */
    public int f1043w1;

    /* renamed from: x1 */
    public int f1044x1;

    /* renamed from: y1 */
    public float f1045y1;

    /* renamed from: z1 */
    public boolean f1046z1;

    /* renamed from: androidx.appcompat.widget.p0$a */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i7, int i8) {
            super(i7, i8);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0256p0(Context context) {
        this(context, null);
    }

    public C0256p0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0256p0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int resourceId;
        this.f1039c = true;
        this.f1040e = -1;
        this.f1041m = 0;
        this.f1043w1 = 8388659;
        int[] iArr = R$styleable.f287o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        C0946x.m2816q(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        int i8 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z6 = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f1045y1 = obtainStyledAttributes.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1040e = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1046z1 = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        int i10 = R$styleable.LinearLayoutCompat_divider;
        setDividerDrawable((!obtainStyledAttributes.hasValue(i10) || (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) == 0) ? obtainStyledAttributes.getDrawable(i10) : C0872a.m2561a(context, resourceId));
        this.f1037F1 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.f1038G1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: d */
    public final void m869d(Canvas canvas, int i7) {
        this.f1034C1.setBounds(getPaddingLeft() + this.f1038G1, i7, (getWidth() - getPaddingRight()) - this.f1038G1, this.f1036E1 + i7);
        this.f1034C1.draw(canvas);
    }

    /* renamed from: e */
    public final void m870e(Canvas canvas, int i7) {
        this.f1034C1.setBounds(i7, getPaddingTop() + this.f1038G1, this.f1035D1 + i7, (getHeight() - getPaddingBottom()) - this.f1038G1);
        this.f1034C1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f1042s;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f1040e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f1040e;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1040e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f1041m;
        if (this.f1042s == 1 && (i7 = this.f1043w1 & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1044x1) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1044x1;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1040e;
    }

    public Drawable getDividerDrawable() {
        return this.f1034C1;
    }

    public int getDividerPadding() {
        return this.f1038G1;
    }

    public int getDividerWidth() {
        return this.f1035D1;
    }

    public int getGravity() {
        return this.f1043w1;
    }

    public int getOrientation() {
        return this.f1042s;
    }

    public int getShowDividers() {
        return this.f1037F1;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1045y1;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: i */
    public final boolean m871i(int i7) {
        if (i7 == 0) {
            return (this.f1037F1 & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f1037F1 & 4) != 0;
        }
        if ((this.f1037F1 & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        if (this.f1034C1 == null) {
            return;
        }
        int i8 = 0;
        if (this.f1042s == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && m871i(i8)) {
                    m869d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1036E1);
                }
                i8++;
            }
            if (m871i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m869d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1036E1 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m872a = C0257p1.m872a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m871i(i8)) {
                a aVar = (a) childAt3.getLayoutParams();
                m870e(canvas, m872a ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1035D1);
            }
            i8++;
        }
        if (m871i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (m872a) {
                    left = childAt4.getLeft();
                    i7 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i7) - this.f1035D1;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (m872a) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i7 = getPaddingRight();
                right = (left - i7) - this.f1035D1;
            }
            m870e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0256p0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02af, code lost:
    
        if (r13 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0256p0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z6) {
        this.f1039c = z6;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f1040e = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1034C1) {
            return;
        }
        this.f1034C1 = drawable;
        if (drawable != null) {
            this.f1035D1 = drawable.getIntrinsicWidth();
            this.f1036E1 = drawable.getIntrinsicHeight();
        } else {
            this.f1035D1 = 0;
            this.f1036E1 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f1038G1 = i7;
    }

    public void setGravity(int i7) {
        if (this.f1043w1 != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f1043w1 = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f1043w1;
        if ((8388615 & i9) != i8) {
            this.f1043w1 = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f1046z1 = z6;
    }

    public void setOrientation(int i7) {
        if (this.f1042s != i7) {
            this.f1042s = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f1037F1) {
            requestLayout();
        }
        this.f1037F1 = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f1043w1;
        if ((i9 & 112) != i8) {
            this.f1043w1 = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f1045y1 = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
