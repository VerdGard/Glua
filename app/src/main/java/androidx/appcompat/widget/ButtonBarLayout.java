package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c */
    public boolean f653c;

    /* renamed from: e */
    public boolean f654e;

    /* renamed from: m */
    public int f655m;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f655m = -1;
        int[] iArr = R$styleable.f283k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0946x.m2816q(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f653c = obtainStyledAttributes.getBoolean(R$styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f653c);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f654e != z6) {
            if (!z6 || this.f653c) {
                this.f654e = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View findViewById = findViewById(R$id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z6;
        int i10;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        if (this.f653c) {
            if (size > this.f655m && this.f654e) {
                setStacked(false);
            }
            this.f655m = size;
        }
        if (this.f654e || View.MeasureSpec.getMode(i7) != 1073741824) {
            i9 = i7;
            z6 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f653c && !this.f654e) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z6 = true;
            }
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i11 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f654e) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 >= 0) {
                    paddingBottom = getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i11 += paddingBottom;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.d.m2828d(this) != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f653c != z6) {
            this.f653c = z6;
            if (!z6 && this.f654e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
