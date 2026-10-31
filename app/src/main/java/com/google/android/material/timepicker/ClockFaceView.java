package com.google.android.material.timepicker;

import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: classes.dex */
class ClockFaceView extends C0861c implements ClockHandView.InterfaceC0857a {

    /* renamed from: L1 */
    public final ClockHandView f4578L1;

    /* renamed from: M1 */
    public final Rect f4579M1;

    /* renamed from: N1 */
    public final RectF f4580N1;

    /* renamed from: O1 */
    public final Rect f4581O1;

    /* renamed from: P1 */
    public final SparseArray<TextView> f4582P1;

    /* renamed from: Q1 */
    public final C0860b f4583Q1;

    /* renamed from: R1 */
    public final int[] f4584R1;

    /* renamed from: S1 */
    public final float[] f4585S1;

    /* renamed from: T1 */
    public final int f4586T1;

    /* renamed from: U1 */
    public final int f4587U1;

    /* renamed from: V1 */
    public final int f4588V1;

    /* renamed from: W1 */
    public final int f4589W1;

    /* renamed from: X1 */
    public String[] f4590X1;

    /* renamed from: Y1 */
    public float f4591Y1;

    /* renamed from: Z1 */
    public final ColorStateList f4592Z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClockFaceView(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC0857a
    /* renamed from: a */
    public final void mo2547a(float f7) {
        if (Math.abs(this.f4591Y1 - f7) > 0.001f) {
            this.f4591Y1 = f7;
            m2549h();
        }
    }

    @Override // com.google.android.material.timepicker.C0861c
    /* renamed from: g */
    public final void mo2548g() {
        super.mo2548g();
        int i7 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f4582P1;
            if (i7 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i7).setVisibility(0);
            i7++;
        }
    }

    /* renamed from: h */
    public final void m2549h() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f4578L1.f4604y1;
        float f7 = Float.MAX_VALUE;
        TextView textView = null;
        int i7 = 0;
        while (true) {
            sparseArray = this.f4582P1;
            int size = sparseArray.size();
            rectF = this.f4580N1;
            rect = this.f4579M1;
            if (i7 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f7) {
                    textView = textView2;
                    f7 = height;
                }
            }
            i7++;
        }
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            TextView textView3 = sparseArray.get(i8);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f4581O1);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f4584R1, this.f4585S1, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f4590X1.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        m2549h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f4589W1 / Math.max(Math.max(this.f4587U1 / displayMetrics.heightPixels, this.f4588V1 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
