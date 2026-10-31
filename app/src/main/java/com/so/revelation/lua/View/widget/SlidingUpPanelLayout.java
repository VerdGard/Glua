package com.so.revelation.lua.View.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.so.revelation.lua.View.widget.C0719b;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p034e0.C0923h0;
import p034e0.C0946x;
import p114o1.C1662c;

/* loaded from: classes.dex */
public class SlidingUpPanelLayout extends ViewGroup {

    /* renamed from: a2 */
    public static final int[] f3524a2 = {android.R.attr.gravity};

    /* renamed from: A1 */
    public boolean f3525A1;

    /* renamed from: B1 */
    public boolean f3526B1;

    /* renamed from: C1 */
    public View f3527C1;

    /* renamed from: D1 */
    public int f3528D1;

    /* renamed from: E1 */
    public View f3529E1;

    /* renamed from: F1 */
    public final int f3530F1;

    /* renamed from: G1 */
    public C1662c f3531G1;

    /* renamed from: H1 */
    public View f3532H1;

    /* renamed from: I1 */
    public View f3533I1;

    /* renamed from: J1 */
    public EnumC0710e f3534J1;

    /* renamed from: K1 */
    public EnumC0710e f3535K1;

    /* renamed from: L1 */
    public float f3536L1;

    /* renamed from: M1 */
    public int f3537M1;

    /* renamed from: N1 */
    public float f3538N1;

    /* renamed from: O1 */
    public boolean f3539O1;

    /* renamed from: P1 */
    public boolean f3540P1;

    /* renamed from: Q1 */
    public float f3541Q1;

    /* renamed from: R1 */
    public float f3542R1;

    /* renamed from: S1 */
    public float f3543S1;

    /* renamed from: T1 */
    public float f3544T1;

    /* renamed from: U1 */
    public boolean f3545U1;

    /* renamed from: V1 */
    public final CopyOnWriteArrayList f3546V1;

    /* renamed from: W1 */
    public View.OnClickListener f3547W1;

    /* renamed from: X1 */
    public final C0719b f3548X1;

    /* renamed from: Y1 */
    public boolean f3549Y1;

    /* renamed from: Z1 */
    public final Rect f3550Z1;

    /* renamed from: c */
    public int f3551c;

    /* renamed from: e */
    public int f3552e;

    /* renamed from: m */
    public final Paint f3553m;

    /* renamed from: s */
    public final Drawable f3554s;

    /* renamed from: w1 */
    public int f3555w1;

    /* renamed from: x1 */
    public int f3556x1;

    /* renamed from: y1 */
    public int f3557y1;

    /* renamed from: z1 */
    public boolean f3558z1;

    /* renamed from: com.so.revelation.lua.View.widget.SlidingUpPanelLayout$a */
    public class ViewOnClickListenerC0706a implements View.OnClickListener {
        public ViewOnClickListenerC0706a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EnumC0710e enumC0710e;
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            if (slidingUpPanelLayout.isEnabled() && slidingUpPanelLayout.m2222f()) {
                EnumC0710e enumC0710e2 = slidingUpPanelLayout.f3534J1;
                EnumC0710e enumC0710e3 = EnumC0710e.f3565c;
                if (enumC0710e2 == enumC0710e3 || enumC0710e2 == (enumC0710e = EnumC0710e.f3567m)) {
                    slidingUpPanelLayout.setPanelState(EnumC0710e.f3566e);
                } else if (slidingUpPanelLayout.f3538N1 < 1.0f) {
                    slidingUpPanelLayout.setPanelState(enumC0710e);
                } else {
                    slidingUpPanelLayout.setPanelState(enumC0710e3);
                }
            }
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SlidingUpPanelLayout$b */
    public class C0707b extends C0719b.c {
        public C0707b() {
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SlidingUpPanelLayout$c */
    public static class C0708c extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        public static final int[] f3561b = {R.attr.layout_weight};

        /* renamed from: a */
        public final float f3562a;

        public C0708c() {
            super(-1, -1);
            this.f3562a = 0.0f;
        }

        public C0708c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3562a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3561b);
            if (obtainStyledAttributes != null) {
                this.f3562a = obtainStyledAttributes.getFloat(0, 0.0f);
                obtainStyledAttributes.recycle();
            }
        }

        public C0708c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3562a = 0.0f;
        }

        public C0708c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3562a = 0.0f;
        }
    }

    /* renamed from: com.so.revelation.lua.View.widget.SlidingUpPanelLayout$d */
    public interface InterfaceC0709d {
        /* renamed from: a */
        void m2226a();

        /* renamed from: b */
        void m2227b();
    }

    /* renamed from: com.so.revelation.lua.View.widget.SlidingUpPanelLayout$e */
    public enum EnumC0710e {
        f3565c,
        f3566e,
        f3567m,
        f3568s,
        f3563X;

        EnumC0710e() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SlidingUpPanelLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.SlidingUpPanelLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2217a(com.so.revelation.lua.View.widget.SlidingUpPanelLayout r5, int r6) {
        /*
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$e r0 = r5.f3534J1
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$e r1 = com.so.revelation.lua.View.widget.SlidingUpPanelLayout.EnumC0710e.f3563X
            if (r0 == r1) goto L8
            r5.f3535K1 = r0
        L8:
            r5.setPanelStateInternal(r1)
            float r0 = r5.m2221e(r6)
            r5.f3536L1 = r0
            r5.m2219c()
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f3546V1
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.f3546V1     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L84
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$d r2 = (com.so.revelation.lua.View.widget.SlidingUpPanelLayout.InterfaceC0709d) r2     // Catch: java.lang.Throwable -> L84
            r2.m2227b()     // Catch: java.lang.Throwable -> L84
            goto L1d
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            android.view.View r0 = r5.f3533I1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$c r0 = (com.so.revelation.lua.View.widget.SlidingUpPanelLayout.C0708c) r0
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r5.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.f3555w1
            int r1 = r1 - r2
            float r2 = r5.f3536L1
            r3 = 0
            r4 = -1
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L74
            boolean r2 = r5.f3525A1
            if (r2 != 0) goto L74
            boolean r2 = r5.f3558z1
            if (r2 == 0) goto L5d
            int r2 = r5.getPaddingBottom()
            int r6 = r6 - r2
            goto L6f
        L5d:
            int r2 = r5.getHeight()
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            android.view.View r3 = r5.f3532H1
            int r3 = r3.getMeasuredHeight()
            int r2 = r2 - r3
            int r6 = r2 - r6
        L6f:
            r0.height = r6
            if (r6 != r1) goto L7e
            goto L7c
        L74:
            int r6 = r0.height
            if (r6 == r4) goto L83
            boolean r6 = r5.f3525A1
            if (r6 != 0) goto L83
        L7c:
            r0.height = r4
        L7e:
            android.view.View r5 = r5.f3533I1
            r5.requestLayout()
        L83:
            return
        L84:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.SlidingUpPanelLayout.m2217a(com.so.revelation.lua.View.widget.SlidingUpPanelLayout, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanelStateInternal(EnumC0710e enumC0710e) {
        if (this.f3534J1 == enumC0710e) {
            return;
        }
        this.f3534J1 = enumC0710e;
        synchronized (this.f3546V1) {
            Iterator it = this.f3546V1.iterator();
            while (it.hasNext()) {
                ((InterfaceC0709d) it.next()).m2226a();
            }
        }
        sendAccessibilityEvent(32);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final void m2219c() {
        if (this.f3557y1 > 0) {
            int currentParallaxOffset = getCurrentParallaxOffset();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            this.f3533I1.setTranslationY(currentParallaxOffset);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0708c) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r0.f3616a == 2) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r10 = this;
            com.so.revelation.lua.View.widget.b r0 = r10.f3548X1
            if (r0 == 0) goto L8e
            android.view.View r1 = r0.f3632q
            r2 = 0
            if (r1 != 0) goto Lb
            goto L7d
        Lb:
            int r1 = r0.f3616a
            r3 = 2
            if (r1 != r3) goto L78
            i0.h r1 = r0.f3630o
            android.widget.OverScroller r4 = r1.f6510a
            boolean r4 = r4.computeScrollOffset()
            android.widget.OverScroller r1 = r1.f6510a
            int r5 = r1.getCurrX()
            int r6 = r1.getCurrY()
            android.view.View r7 = r0.f3632q
            int r7 = r7.getLeft()
            int r7 = r5 - r7
            android.view.View r8 = r0.f3632q
            int r8 = r8.getTop()
            int r8 = r6 - r8
            if (r4 != 0) goto L3c
            if (r8 == 0) goto L3c
            android.view.View r1 = r0.f3632q
            r1.setTop(r2)
            goto L7c
        L3c:
            if (r7 == 0) goto L43
            android.view.View r9 = r0.f3632q
            r9.offsetLeftAndRight(r7)
        L43:
            if (r8 == 0) goto L4a
            android.view.View r9 = r0.f3632q
            r9.offsetTopAndBottom(r8)
        L4a:
            if (r7 != 0) goto L4e
            if (r8 == 0) goto L5a
        L4e:
            com.so.revelation.lua.View.widget.b$c r7 = r0.f3631p
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout$b r7 = (com.so.revelation.lua.View.widget.SlidingUpPanelLayout.C0707b) r7
            com.so.revelation.lua.View.widget.SlidingUpPanelLayout r7 = com.so.revelation.lua.View.widget.SlidingUpPanelLayout.this
            m2217a(r7, r6)
            r7.invalidate()
        L5a:
            if (r4 == 0) goto L6f
            int r7 = r1.getFinalX()
            if (r5 != r7) goto L6f
            int r5 = r1.getFinalY()
            if (r6 != r5) goto L6f
            r1.abortAnimation()
            boolean r4 = r1.isFinished()
        L6f:
            if (r4 != 0) goto L78
            com.so.revelation.lua.View.widget.b$b r1 = r0.f3635t
            android.view.ViewGroup r4 = r0.f3634s
            r4.post(r1)
        L78:
            int r1 = r0.f3616a
            if (r1 != r3) goto L7d
        L7c:
            r2 = 1
        L7d:
            if (r2 == 0) goto L8e
            boolean r1 = r10.isEnabled()
            if (r1 != 0) goto L89
            r0.m2231a()
            return
        L89:
            java.util.WeakHashMap<android.view.View, e0.h0> r0 = p034e0.C0946x.f4876a
            p034e0.C0946x.d.m2835k(r10)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.SlidingUpPanelLayout.computeScroll():void");
    }

    /* renamed from: d */
    public final int m2220d(float f7) {
        View view = this.f3532H1;
        int i7 = (int) (f7 * this.f3537M1);
        return this.f3558z1 ? ((getMeasuredHeight() - getPaddingBottom()) - this.f3555w1) - i7 : (getPaddingTop() - (view != null ? view.getMeasuredHeight() : 0)) + this.f3555w1 + i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.SlidingUpPanelLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        View view;
        int bottom;
        int bottom2;
        super.draw(canvas);
        Drawable drawable = this.f3554s;
        if (drawable == null || (view = this.f3532H1) == null) {
            return;
        }
        int right = view.getRight();
        if (this.f3558z1) {
            bottom = this.f3532H1.getTop() - this.f3556x1;
            bottom2 = this.f3532H1.getTop();
        } else {
            bottom = this.f3532H1.getBottom();
            bottom2 = this.f3532H1.getBottom() + this.f3556x1;
        }
        drawable.setBounds(this.f3532H1.getLeft(), bottom, right, bottom2);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        boolean drawChild;
        int save = canvas.save();
        View view2 = this.f3532H1;
        if (view2 == null || view2 == view) {
            drawChild = super.drawChild(canvas, view, j7);
        } else {
            Rect rect = this.f3550Z1;
            canvas.getClipBounds(rect);
            if (!this.f3525A1) {
                if (this.f3558z1) {
                    rect.bottom = Math.min(rect.bottom, this.f3532H1.getTop());
                } else {
                    rect.top = Math.max(rect.top, this.f3532H1.getBottom());
                }
            }
            if (this.f3526B1) {
                canvas.clipRect(rect);
            }
            drawChild = super.drawChild(canvas, view, j7);
            int i7 = this.f3552e;
            if (i7 != 0) {
                float f7 = this.f3536L1;
                if (f7 > 0.0f) {
                    int i8 = (i7 & 16777215) | (((int) ((((-16777216) & i7) >>> 24) * f7)) << 24);
                    Paint paint = this.f3553m;
                    paint.setColor(i8);
                    canvas.drawRect(rect, paint);
                }
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public final float m2221e(int i7) {
        int m2220d = m2220d(0.0f);
        return (this.f3558z1 ? m2220d - i7 : i7 - m2220d) / this.f3537M1;
    }

    /* renamed from: f */
    public final boolean m2222f() {
        return (!this.f3540P1 || this.f3532H1 == null || this.f3534J1 == EnumC0710e.f3568s) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2223g(View view, int i7, int i8) {
        int i9;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i10 = iArr2[0] + i7;
        int i11 = iArr2[1] + i8;
        int i12 = iArr[0];
        return i10 >= i12 && i10 < view.getWidth() + i12 && i11 >= (i9 = iArr[1]) && i11 < view.getHeight() + i9;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0708c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0708c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0708c((ViewGroup.MarginLayoutParams) layoutParams) : new C0708c(layoutParams);
    }

    public float getAnchorPoint() {
        return this.f3538N1;
    }

    public int getCoveredFadeColor() {
        return this.f3552e;
    }

    public int getCurrentParallaxOffset() {
        int max = (int) (Math.max(this.f3536L1, 0.0f) * this.f3557y1);
        return this.f3558z1 ? -max : max;
    }

    public int getMinFlingVelocity() {
        return this.f3551c;
    }

    public int getPanelHeight() {
        return this.f3555w1;
    }

    public EnumC0710e getPanelState() {
        return this.f3534J1;
    }

    public int getShadowHeight() {
        return this.f3556x1;
    }

    /* renamed from: h */
    public final void m2224h(float f7) {
        if (!isEnabled() || this.f3532H1 == null) {
            return;
        }
        int m2220d = m2220d(f7);
        View view = this.f3532H1;
        int left = view.getLeft();
        C0719b c0719b = this.f3548X1;
        c0719b.f3632q = view;
        c0719b.f3618c = -1;
        if (c0719b.m2239i(left, m2220d, 0, 0)) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    /* renamed from: i */
    public final void m2225i() {
        int i7;
        int i8;
        int i9;
        int i10;
        int max;
        if (getChildCount() == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        View view = this.f3532H1;
        int i11 = 0;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && background.getOpacity() == -1) {
                i7 = this.f3532H1.getLeft();
                i8 = this.f3532H1.getRight();
                i9 = this.f3532H1.getTop();
                i10 = this.f3532H1.getBottom();
                View childAt = getChildAt(0);
                max = Math.max(paddingLeft, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                int min = Math.min(width, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i7 && max2 >= i9 && min <= i8 && min2 <= i10) {
                    i11 = 4;
                }
                childAt.setVisibility(i11);
            }
        }
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        View childAt2 = getChildAt(0);
        max = Math.max(paddingLeft, childAt2.getLeft());
        int max22 = Math.max(paddingTop, childAt2.getTop());
        int min3 = Math.min(width, childAt2.getRight());
        int min22 = Math.min(height, childAt2.getBottom());
        if (max >= i7) {
            i11 = 4;
        }
        childAt2.setVisibility(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3549Y1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3549Y1 = true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f3528D1;
        if (i7 != -1) {
            setDragView(findViewById(i7));
        }
        int i8 = this.f3530F1;
        if (i8 != -1) {
            setScrollableView(findViewById(i8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0089, code lost:
    
        if (m2223g(r11.f3527C1, (int) r3, (int) r4) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if ((r1.f3623h[r0] & 0) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017a, code lost:
    
        r1.f3631p.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0178, code lost:
    
        if ((r1.f3623h[r12] & 0) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0040, code lost:
    
        if (r5 > r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x008b, code lost:
    
        r1.m2232b();
        r11.f3539O1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0 != 3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0183 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.SlidingUpPanelLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        float f7;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3549Y1) {
            int ordinal = this.f3534J1.ordinal();
            if (ordinal == 0) {
                f7 = 1.0f;
            } else if (ordinal == 2) {
                f7 = this.f3538N1;
            } else if (ordinal != 3) {
                this.f3536L1 = 0.0f;
            } else {
                f7 = m2221e(m2220d(0.0f) + (this.f3558z1 ? this.f3555w1 : -this.f3555w1));
            }
            this.f3536L1 = f7;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0708c c0708c = (C0708c) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i11 != 0 && !this.f3549Y1)) {
                int measuredHeight = childAt.getMeasuredHeight();
                int m2220d = childAt == this.f3532H1 ? m2220d(this.f3536L1) : paddingTop;
                if (!this.f3558z1 && childAt == this.f3533I1 && !this.f3525A1) {
                    m2220d = m2220d(this.f3536L1) + this.f3532H1.getMeasuredHeight();
                }
                int i12 = ((ViewGroup.MarginLayoutParams) c0708c).leftMargin + paddingLeft;
                childAt.layout(i12, m2220d, childAt.getMeasuredWidth() + i12, measuredHeight + m2220d);
            }
        }
        if (this.f3549Y1) {
            m2225i();
        }
        m2219c();
        this.f3549Y1 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int makeMeasureSpec;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        int childCount = getChildCount();
        if (childCount != 2) {
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        }
        this.f3533I1 = getChildAt(0);
        View childAt = getChildAt(1);
        this.f3532H1 = childAt;
        if (this.f3527C1 == null) {
            setDragView(childAt);
        }
        int visibility = this.f3532H1.getVisibility();
        EnumC0710e enumC0710e = EnumC0710e.f3568s;
        if (visibility != 0) {
            this.f3534J1 = enumC0710e;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            C0708c c0708c = (C0708c) childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8 || i11 != 0) {
                if (childAt2 == this.f3533I1) {
                    i9 = (this.f3525A1 || this.f3534J1 == enumC0710e) ? paddingTop : paddingTop - this.f3555w1;
                    i10 = paddingLeft - (((ViewGroup.MarginLayoutParams) c0708c).leftMargin + ((ViewGroup.MarginLayoutParams) c0708c).rightMargin);
                } else {
                    i9 = childAt2 == this.f3532H1 ? paddingTop - ((ViewGroup.MarginLayoutParams) c0708c).topMargin : paddingTop;
                    i10 = paddingLeft;
                }
                int i12 = ((ViewGroup.MarginLayoutParams) c0708c).width;
                int makeMeasureSpec2 = i12 == -2 ? View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE) : i12 == -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                int i13 = ((ViewGroup.MarginLayoutParams) c0708c).height;
                if (i13 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
                } else {
                    float f7 = c0708c.f3562a;
                    if (f7 > 0.0f && f7 < 1.0f) {
                        i9 = (int) (i9 * f7);
                    } else if (i13 != -1) {
                        i9 = i13;
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                }
                childAt2.measure(makeMeasureSpec2, makeMeasureSpec);
                View view = this.f3532H1;
                if (childAt2 == view) {
                    this.f3537M1 = view.getMeasuredHeight() - this.f3555w1;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            EnumC0710e enumC0710e = (EnumC0710e) bundle.getSerializable("sliding_state");
            this.f3534J1 = enumC0710e;
            if (enumC0710e == null) {
                enumC0710e = EnumC0710e.f3566e;
            }
            this.f3534J1 = enumC0710e;
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        EnumC0710e enumC0710e = this.f3534J1;
        if (enumC0710e == EnumC0710e.f3563X) {
            enumC0710e = this.f3535K1;
        }
        bundle.putSerializable("sliding_state", enumC0710e);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i8 != i10) {
            this.f3549Y1 = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !m2222f()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f3548X1.m2240j(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAnchorPoint(float f7) {
        if (f7 <= 0.0f || f7 > 1.0f) {
            return;
        }
        this.f3538N1 = f7;
        this.f3549Y1 = true;
        requestLayout();
    }

    public void setClipPanel(boolean z6) {
        this.f3526B1 = z6;
    }

    public void setCoveredFadeColor(int i7) {
        this.f3552e = i7;
        requestLayout();
    }

    public void setDragView(int i7) {
        this.f3528D1 = i7;
        setDragView(findViewById(i7));
    }

    public void setDragView(View view) {
        View view2 = this.f3527C1;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.f3527C1 = view;
        if (view != null) {
            view.setClickable(true);
            this.f3527C1.setFocusable(false);
            this.f3527C1.setFocusableInTouchMode(false);
            this.f3527C1.setOnClickListener(new ViewOnClickListenerC0706a());
        }
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.f3547W1 = onClickListener;
    }

    public void setGravity(int i7) {
        if (i7 != 48 && i7 != 80) {
            throw new IllegalArgumentException("gravity must be set to either top or bottom");
        }
        this.f3558z1 = i7 == 80;
        if (this.f3549Y1) {
            return;
        }
        requestLayout();
    }

    public void setMinFlingVelocity(int i7) {
        this.f3551c = i7;
    }

    public void setOverlayed(boolean z6) {
        this.f3525A1 = z6;
    }

    public void setPanelHeight(int i7) {
        if (getPanelHeight() == i7) {
            return;
        }
        this.f3555w1 = i7;
        if (!this.f3549Y1) {
            requestLayout();
        }
        if (getPanelState() == EnumC0710e.f3566e) {
            m2224h(0.0f);
            invalidate();
        }
    }

    public void setPanelState(EnumC0710e enumC0710e) {
        EnumC0710e enumC0710e2;
        EnumC0710e enumC0710e3;
        float f7;
        C0719b c0719b = this.f3548X1;
        if (c0719b.f3616a == 2) {
            Log.d("SlidingUpPanelLayout", "View is settling. Aborting animation.");
            c0719b.m2231a();
        }
        if (enumC0710e == null || enumC0710e == (enumC0710e2 = EnumC0710e.f3563X)) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        }
        if (isEnabled()) {
            boolean z6 = this.f3549Y1;
            if ((!z6 && this.f3532H1 == null) || enumC0710e == (enumC0710e3 = this.f3534J1) || enumC0710e3 == enumC0710e2) {
                return;
            }
            if (z6) {
                setPanelStateInternal(enumC0710e);
                return;
            }
            if (enumC0710e3 == EnumC0710e.f3568s) {
                this.f3532H1.setVisibility(0);
                requestLayout();
            }
            int ordinal = enumC0710e.ordinal();
            if (ordinal == 0) {
                f7 = 1.0f;
            } else if (ordinal == 1) {
                m2224h(0.0f);
                return;
            } else if (ordinal == 2) {
                f7 = this.f3538N1;
            } else if (ordinal != 3) {
                return;
            } else {
                f7 = m2221e(m2220d(0.0f) + (this.f3558z1 ? this.f3555w1 : -this.f3555w1));
            }
            m2224h(f7);
        }
    }

    public void setParallaxOffset(int i7) {
        this.f3557y1 = i7;
        if (this.f3549Y1) {
            return;
        }
        requestLayout();
    }

    public void setScrollableView(View view) {
        this.f3529E1 = view;
    }

    public void setScrollableViewHelper(C1662c c1662c) {
        this.f3531G1 = c1662c;
    }

    public void setShadowHeight(int i7) {
        this.f3556x1 = i7;
        if (this.f3549Y1) {
            return;
        }
        invalidate();
    }

    public void setTouchEnabled(boolean z6) {
        this.f3540P1 = z6;
    }
}
