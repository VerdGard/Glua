package p131q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: q3.e */
/* loaded from: classes.dex */
public class C1749e extends ViewGroup {

    /* renamed from: c */
    public int f8032c;

    /* renamed from: e */
    public int f8033e;

    /* renamed from: m */
    public boolean f8034m;

    /* renamed from: s */
    public int f8035s;

    public C1749e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8034m = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f3735i, 0, 0);
        this.f8032c = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
        this.f8033e = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo3690a() {
        return this.f8034m;
    }

    public int getItemSpacing() {
        return this.f8033e;
    }

    public int getLineSpacing() {
        return this.f8032c;
    }

    public int getRowCount() {
        return this.f8035s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (getChildCount() == 0) {
            this.f8035s = 0;
            return;
        }
        this.f8035s = 1;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z7 = C0946x.e.m2847d(this) == 1;
        int paddingRight = z7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i13 = (i9 - i7) - paddingLeft;
        int i14 = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R$id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = C0920g.m2697c(marginLayoutParams);
                    i11 = C0920g.m2696b(marginLayoutParams);
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i12;
                if (!this.f8034m && measuredWidth > i13) {
                    i15 = this.f8032c + paddingTop;
                    this.f8035s++;
                    i14 = paddingRight;
                }
                childAt.setTag(R$id.row_index_key, Integer.valueOf(this.f8035s - 1));
                int i17 = i14 + i12;
                int measuredWidth2 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z7) {
                    i17 = i13 - measuredWidth2;
                    measuredWidth2 = (i13 - i14) - i12;
                }
                childAt.layout(i17, i15, measuredWidth2, measuredHeight);
                i14 += childAt.getMeasuredWidth() + i12 + i11 + this.f8033e;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin + 0;
                    i9 = marginLayoutParams.rightMargin + 0;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i10 > paddingRight && !mo3690a()) {
                    paddingLeft = getPaddingLeft();
                    i12 = this.f8032c + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i10;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i10 + i9 + this.f8033e + paddingLeft;
                if (i14 == getChildCount() - 1) {
                    i13 += i9;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i13;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i7) {
        this.f8033e = i7;
    }

    public void setLineSpacing(int i7) {
        this.f8032c = i7;
    }

    public void setSingleLine(boolean z6) {
        this.f8034m = z6;
    }
}
