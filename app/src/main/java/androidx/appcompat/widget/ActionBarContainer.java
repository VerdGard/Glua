package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A1 */
    public boolean f567A1;

    /* renamed from: B1 */
    public final int f568B1;

    /* renamed from: c */
    public boolean f569c;

    /* renamed from: e */
    public C0212a1 f570e;

    /* renamed from: m */
    public View f571m;

    /* renamed from: s */
    public View f572s;

    /* renamed from: w1 */
    public Drawable f573w1;

    /* renamed from: x1 */
    public Drawable f574x1;

    /* renamed from: y1 */
    public Drawable f575y1;

    /* renamed from: z1 */
    public final boolean f576z1;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0213b c0213b = new C0213b(this);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2841q(this, c0213b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f273a);
        this.f573w1 = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.f574x1 = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.f568B1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z6 = true;
        if (getId() == R$id.split_action_bar) {
            this.f576z1 = true;
            this.f575y1 = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f576z1 ? this.f573w1 != null || this.f574x1 != null : this.f575y1 != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    /* renamed from: a */
    public static int m565a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f573w1;
        if (drawable != null && drawable.isStateful()) {
            this.f573w1.setState(getDrawableState());
        }
        Drawable drawable2 = this.f574x1;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f574x1.setState(getDrawableState());
        }
        Drawable drawable3 = this.f575y1;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f575y1.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f570e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f573w1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f574x1;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f575y1;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f571m = findViewById(R$id.action_bar);
        this.f572s = findViewById(R$id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f569c || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z6, i7, i8, i9, i10);
        C0212a1 c0212a1 = this.f570e;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (c0212a1 == null || c0212a1.getVisibility() == 8) ? false : true;
        if (c0212a1 != null && c0212a1.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0212a1.getLayoutParams();
            int measuredHeight2 = measuredHeight - c0212a1.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            c0212a1.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f576z1) {
            Drawable drawable3 = this.f575y1;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f573w1 != null) {
                if (this.f571m.getVisibility() == 0) {
                    drawable2 = this.f573w1;
                    left = this.f571m.getLeft();
                    top = this.f571m.getTop();
                    right = this.f571m.getRight();
                    view = this.f571m;
                } else {
                    View view2 = this.f572s;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f573w1.setBounds(0, 0, 0, 0);
                        z8 = true;
                    } else {
                        drawable2 = this.f573w1;
                        left = this.f572s.getLeft();
                        top = this.f572s.getTop();
                        right = this.f572s.getRight();
                        view = this.f572s;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z8 = true;
            }
            this.f567A1 = z9;
            if (!z9 || (drawable = this.f574x1) == null) {
                z7 = z8;
            } else {
                drawable.setBounds(c0212a1.getLeft(), c0212a1.getTop(), c0212a1.getRight(), c0212a1.getBottom());
            }
        }
        if (z7) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f571m
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.f568B1
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f571m
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.a1 r0 = r6.f570e
            if (r0 == 0) goto L89
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L89
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L89
            android.view.View r0 = r6.f571m
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r0 = 0
            goto L4e
        L4d:
            r0 = 1
        L4e:
            if (r0 != 0) goto L53
            android.view.View r0 = r6.f571m
            goto L69
        L53:
            android.view.View r0 = r6.f572s
            if (r0 == 0) goto L65
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L65
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r3 = 0
        L65:
            if (r3 != 0) goto L6d
            android.view.View r0 = r6.f572s
        L69:
            int r4 = m565a(r0)
        L6d:
            if (r7 != r1) goto L74
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L77
        L74:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L77:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.a1 r0 = r6.f570e
            int r0 = m565a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f573w1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f573w1);
        }
        this.f573w1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f571m;
            if (view != null) {
                this.f573w1.setBounds(view.getLeft(), this.f571m.getTop(), this.f571m.getRight(), this.f571m.getBottom());
            }
        }
        boolean z6 = true;
        if (!this.f576z1 ? this.f573w1 != null || this.f574x1 != null : this.f575y1 != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f575y1;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f575y1);
        }
        this.f575y1 = drawable;
        boolean z6 = this.f576z1;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f575y1) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f573w1 != null || this.f574x1 != null) : this.f575y1 == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f574x1;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f574x1);
        }
        this.f574x1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f567A1 && (drawable2 = this.f574x1) != null) {
                drawable2.setBounds(this.f570e.getLeft(), this.f570e.getTop(), this.f570e.getRight(), this.f570e.getBottom());
            }
        }
        setWillNotDraw(!this.f576z1 ? !(this.f573w1 == null && this.f574x1 == null) : this.f575y1 != null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0212a1 c0212a1) {
        C0212a1 c0212a12 = this.f570e;
        if (c0212a12 != null) {
            removeView(c0212a12);
        }
        this.f570e = c0212a1;
        if (c0212a1 != null) {
            addView(c0212a1);
            ViewGroup.LayoutParams layoutParams = c0212a1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0212a1.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z6) {
        this.f569c = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f573w1;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f574x1;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f575y1;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f573w1;
        boolean z6 = this.f576z1;
        return (drawable == drawable2 && !z6) || (drawable == this.f574x1 && this.f567A1) || ((drawable == this.f575y1 && z6) || super.verifyDrawable(drawable));
    }
}
