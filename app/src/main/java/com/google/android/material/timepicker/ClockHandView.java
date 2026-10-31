package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p131q3.C1767w;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: A1 */
    public float f4593A1;

    /* renamed from: B1 */
    public boolean f4594B1;

    /* renamed from: C1 */
    public double f4595C1;

    /* renamed from: D1 */
    public int f4596D1;

    /* renamed from: E1 */
    public int f4597E1;

    /* renamed from: c */
    public final ValueAnimator f4598c;

    /* renamed from: e */
    public boolean f4599e;

    /* renamed from: m */
    public final ArrayList f4600m;

    /* renamed from: s */
    public final int f4601s;

    /* renamed from: w1 */
    public final float f4602w1;

    /* renamed from: x1 */
    public final Paint f4603x1;

    /* renamed from: y1 */
    public final RectF f4604y1;

    /* renamed from: z1 */
    public final int f4605z1;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public interface InterfaceC0857a {
        /* renamed from: a */
        void mo2547a(float f7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = com.google.android.material.R$attr.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.f4598c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4600m = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f4603x1 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.f4604y1 = r2
            r2 = 1
            r5.f4597E1 = r2
            int[] r3 = com.google.android.material.R$styleable.f3732f
            int r4 = com.google.android.material.R$style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = com.google.android.material.R$attr.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            p139r3.C1832j.m4312c(r6, r0, r3)
            int r0 = com.google.android.material.R$attr.motionEasingEmphasizedInterpolator
            p0.b r3 = p004a3.C0034a.f109b
            p139r3.C1832j.m4313d(r6, r0, r3)
            int r0 = com.google.android.material.R$styleable.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.f4596D1 = r0
            int r0 = com.google.android.material.R$styleable.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.f4601s = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.google.android.material.R$dimen.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.f4605z1 = r4
            int r4 = com.google.android.material.R$dimen.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.f4602w1 = r0
            int r0 = com.google.android.material.R$styleable.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.m2551b(r0)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledTouchSlop()
            java.util.WeakHashMap<android.view.View, e0.h0> r6 = p034e0.C0946x.f4876a
            r6 = 2
            p034e0.C0946x.d.m2843s(r5, r6)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final int m2550a(int i7) {
        return i7 == 2 ? Math.round(this.f4596D1 * 0.66f) : this.f4596D1;
    }

    /* renamed from: b */
    public final void m2551b(float f7) {
        ValueAnimator valueAnimator = this.f4598c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m2552c(f7, false);
    }

    /* renamed from: c */
    public final void m2552c(float f7, boolean z6) {
        float f8 = f7 % 360.0f;
        this.f4593A1 = f8;
        this.f4595C1 = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m2550a = m2550a(this.f4597E1);
        float cos = (((float) Math.cos(this.f4595C1)) * m2550a) + width;
        float sin = (m2550a * ((float) Math.sin(this.f4595C1))) + height;
        float f9 = this.f4601s;
        this.f4604y1.set(cos - f9, sin - f9, cos + f9, sin + f9);
        Iterator it = this.f4600m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0857a) it.next()).mo2547a(f8);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f7 = width;
        float m2550a = m2550a(this.f4597E1);
        float cos = (((float) Math.cos(this.f4595C1)) * m2550a) + f7;
        float f8 = height;
        float sin = (m2550a * ((float) Math.sin(this.f4595C1))) + f8;
        Paint paint = this.f4603x1;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f4601s, paint);
        double sin2 = Math.sin(this.f4595C1);
        paint.setStrokeWidth(this.f4605z1);
        canvas.drawLine(f7, f8, width + ((int) (Math.cos(this.f4595C1) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f7, f8, this.f4602w1, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (this.f4598c.isRunning()) {
            return;
        }
        m2551b(this.f4593A1);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z8 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z6 = this.f4594B1;
                if (this.f4599e) {
                    this.f4597E1 = ((float) Math.hypot((double) (x7 - ((float) (getWidth() / 2))), (double) (y7 - ((float) (getHeight() / 2))))) <= ((float) m2550a(2)) + C1767w.m4238a(12, getContext()) ? 2 : 1;
                }
            } else {
                z6 = false;
            }
            z7 = false;
        } else {
            this.f4594B1 = false;
            z6 = false;
            z7 = true;
        }
        boolean z9 = this.f4594B1;
        int degrees = ((int) Math.toDegrees(Math.atan2(y7 - (getHeight() / 2), x7 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f7 = degrees;
        boolean z10 = this.f4593A1 != f7;
        if (!z7 || !z10) {
            if (z10 || z6) {
                m2551b(f7);
            }
            this.f4594B1 = z9 | z8;
            return true;
        }
        z8 = true;
        this.f4594B1 = z9 | z8;
        return true;
    }
}
