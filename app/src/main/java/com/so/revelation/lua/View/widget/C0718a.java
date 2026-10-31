package com.so.revelation.lua.View.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.so.revelation.lua.R$styleable;
import com.so.revelation.lua.View.widget.SmartTabLayout;
import p114o1.AbstractC1663d;

/* renamed from: com.so.revelation.lua.View.widget.a */
/* loaded from: classes.dex */
public final class C0718a extends LinearLayout {

    /* renamed from: A1 */
    public final boolean f3589A1;

    /* renamed from: B1 */
    public final int f3590B1;

    /* renamed from: C1 */
    public final int f3591C1;

    /* renamed from: D1 */
    public final int f3592D1;

    /* renamed from: E1 */
    public final float f3593E1;

    /* renamed from: F1 */
    public final Paint f3594F1;

    /* renamed from: G1 */
    public final int f3595G1;

    /* renamed from: H1 */
    public final Paint f3596H1;

    /* renamed from: I1 */
    public final float f3597I1;

    /* renamed from: J1 */
    public final a f3598J1;

    /* renamed from: K1 */
    public final boolean f3599K1;

    /* renamed from: L1 */
    public int f3600L1;

    /* renamed from: M1 */
    public int f3601M1;

    /* renamed from: N1 */
    public float f3602N1;

    /* renamed from: O1 */
    public AbstractC1663d f3603O1;

    /* renamed from: P1 */
    public SmartTabLayout.InterfaceC0716f f3604P1;

    /* renamed from: c */
    public final int f3605c;

    /* renamed from: e */
    public final int f3606e;

    /* renamed from: m */
    public final int f3607m;

    /* renamed from: s */
    public final int f3608s;

    /* renamed from: w1 */
    public final Paint f3609w1;

    /* renamed from: x1 */
    public final RectF f3610x1;

    /* renamed from: y1 */
    public final boolean f3611y1;

    /* renamed from: z1 */
    public final boolean f3612z1;

    /* renamed from: com.so.revelation.lua.View.widget.a$a */
    public static class a implements SmartTabLayout.InterfaceC0716f {

        /* renamed from: a */
        public int[] f3613a;

        /* renamed from: b */
        public int[] f3614b;
    }

    public C0718a(Context context, AttributeSet attributeSet) {
        super(context);
        int[] intArray;
        int i7;
        int[] intArray2;
        AbstractC1663d abstractC1663d;
        this.f3610x1 = new RectF();
        setWillNotDraw(false);
        float f7 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i8 = typedValue.data;
        float f8 = 0.0f * f7;
        int m2229b = m2229b((byte) 38, i8);
        int i9 = (int) f8;
        int m2229b2 = m2229b((byte) 38, i8);
        int m2229b3 = m2229b((byte) 32, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3396g);
        boolean z6 = obtainStyledAttributes.getBoolean(14, false);
        boolean z7 = obtainStyledAttributes.getBoolean(23, false);
        boolean z8 = obtainStyledAttributes.getBoolean(19, false);
        int i10 = obtainStyledAttributes.getInt(20, 0);
        int i11 = obtainStyledAttributes.getInt(18, 0);
        int color = obtainStyledAttributes.getColor(15, -13388315);
        int resourceId = obtainStyledAttributes.getResourceId(16, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(21, (int) (8.0f * f7));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(22, -1);
        float dimension = obtainStyledAttributes.getDimension(17, f8);
        int color2 = obtainStyledAttributes.getColor(24, m2229b);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(25, i9);
        int color3 = obtainStyledAttributes.getColor(27, m2229b2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(28, (int) (2.0f * f7));
        int color4 = obtainStyledAttributes.getColor(10, m2229b3);
        int resourceId2 = obtainStyledAttributes.getResourceId(11, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(12, (int) (f7 * 1.0f));
        boolean z9 = obtainStyledAttributes.getBoolean(13, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            i7 = 1;
            intArray = new int[]{color};
        } else {
            intArray = getResources().getIntArray(resourceId);
            i7 = 1;
        }
        if (resourceId2 == -1) {
            intArray2 = new int[i7];
            intArray2[0] = color4;
        } else {
            intArray2 = getResources().getIntArray(resourceId2);
        }
        a aVar = new a();
        this.f3598J1 = aVar;
        aVar.f3613a = intArray;
        aVar.f3614b = intArray2;
        this.f3605c = dimensionPixelSize2;
        this.f3606e = color2;
        this.f3607m = dimensionPixelSize3;
        this.f3608s = color3;
        this.f3609w1 = new Paint(1);
        this.f3612z1 = z6;
        this.f3611y1 = z7;
        this.f3589A1 = z8;
        this.f3590B1 = dimensionPixelSize;
        this.f3591C1 = layoutDimension;
        this.f3594F1 = new Paint(1);
        this.f3593E1 = dimension;
        this.f3592D1 = i11;
        this.f3597I1 = 0.5f;
        Paint paint = new Paint(1);
        this.f3596H1 = paint;
        paint.setStrokeWidth(dimensionPixelSize4);
        this.f3595G1 = dimensionPixelSize4;
        this.f3599K1 = z9;
        if (i10 == 0) {
            abstractC1663d = AbstractC1663d.f7515a;
        } else {
            if (i10 != 1) {
                AbstractC1663d.b bVar = AbstractC1663d.f7515a;
                throw new IllegalArgumentException(C0090b.m219e("Unknown id: ", i10));
            }
            abstractC1663d = AbstractC1663d.f7516b;
        }
        this.f3603O1 = abstractC1663d;
    }

    /* renamed from: b */
    public static int m2229b(byte b7, int i7) {
        return Color.argb((int) b7, Color.red(i7), Color.green(i7), Color.blue(i7));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2230a(android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.widget.C0718a.m2230a(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3599K1) {
            m2230a(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f3599K1) {
            return;
        }
        m2230a(canvas);
    }
}
