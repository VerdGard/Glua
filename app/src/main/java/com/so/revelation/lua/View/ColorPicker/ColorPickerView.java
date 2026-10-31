package com.so.revelation.lua.View.ColorPicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.so.revelation.lua.R$styleable;
import p002a1.C0017d;
import p107n1.C1636a;

/* loaded from: classes.dex */
public class ColorPickerView extends View {

    /* renamed from: A1 */
    public Paint f3410A1;

    /* renamed from: B1 */
    public Paint f3411B1;

    /* renamed from: C1 */
    public Paint f3412C1;

    /* renamed from: D1 */
    public Paint f3413D1;

    /* renamed from: E1 */
    public LinearGradient f3414E1;

    /* renamed from: F1 */
    public LinearGradient f3415F1;

    /* renamed from: G1 */
    public C0695a f3416G1;

    /* renamed from: H1 */
    public C0695a f3417H1;

    /* renamed from: I1 */
    public int f3418I1;

    /* renamed from: J1 */
    public float f3419J1;

    /* renamed from: K1 */
    public float f3420K1;

    /* renamed from: L1 */
    public float f3421L1;

    /* renamed from: M1 */
    public boolean f3422M1;

    /* renamed from: N1 */
    public String f3423N1;

    /* renamed from: O1 */
    public int f3424O1;

    /* renamed from: P1 */
    public int f3425P1;

    /* renamed from: Q1 */
    public int f3426Q1;

    /* renamed from: R1 */
    public Rect f3427R1;

    /* renamed from: S1 */
    public Rect f3428S1;

    /* renamed from: T1 */
    public Rect f3429T1;

    /* renamed from: U1 */
    public Rect f3430U1;

    /* renamed from: V1 */
    public Point f3431V1;

    /* renamed from: W1 */
    public C1636a f3432W1;

    /* renamed from: X1 */
    public InterfaceC0696b f3433X1;

    /* renamed from: c */
    public int f3434c;

    /* renamed from: e */
    public int f3435e;

    /* renamed from: m */
    public int f3436m;

    /* renamed from: s */
    public int f3437s;

    /* renamed from: w1 */
    public int f3438w1;

    /* renamed from: x1 */
    public int f3439x1;

    /* renamed from: y1 */
    public Paint f3440y1;

    /* renamed from: z1 */
    public Paint f3441z1;

    /* renamed from: com.so.revelation.lua.View.ColorPicker.ColorPickerView$a */
    public class C0695a {

        /* renamed from: a */
        public Canvas f3442a;

        /* renamed from: b */
        public Bitmap f3443b;

        /* renamed from: c */
        public float f3444c;
    }

    /* renamed from: com.so.revelation.lua.View.ColorPicker.ColorPickerView$b */
    public interface InterfaceC0696b {
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3418I1 = 255;
        this.f3419J1 = 360.0f;
        this.f3420K1 = 0.0f;
        this.f3421L1 = 0.0f;
        this.f3422M1 = false;
        this.f3423N1 = null;
        this.f3424O1 = -4342339;
        this.f3425P1 = -9539986;
        this.f3431V1 = null;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f3393d);
        this.f3422M1 = obtainStyledAttributes.getBoolean(1, false);
        this.f3423N1 = obtainStyledAttributes.getString(0);
        this.f3424O1 = obtainStyledAttributes.getColor(3, -4342339);
        this.f3425P1 = obtainStyledAttributes.getColor(2, -9539986);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f3425P1 == -9539986) {
            this.f3425P1 = obtainStyledAttributes2.getColor(0, -9539986);
        }
        if (this.f3424O1 == -4342339) {
            this.f3424O1 = obtainStyledAttributes2.getColor(0, -4342339);
        }
        obtainStyledAttributes2.recycle();
        this.f3434c = C0017d.m95t(getContext(), 30.0f);
        this.f3435e = C0017d.m95t(getContext(), 20.0f);
        this.f3436m = C0017d.m95t(getContext(), 10.0f);
        this.f3437s = C0017d.m95t(getContext(), 5.0f);
        this.f3439x1 = C0017d.m95t(getContext(), 4.0f);
        this.f3438w1 = C0017d.m95t(getContext(), 2.0f);
        this.f3426Q1 = getResources().getDimensionPixelSize(com.so.revelation.lua.R.dimen.cpv_required_padding);
        this.f3440y1 = new Paint();
        this.f3441z1 = new Paint();
        this.f3412C1 = new Paint();
        this.f3410A1 = new Paint();
        this.f3411B1 = new Paint();
        this.f3413D1 = new Paint();
        this.f3441z1.setStyle(Paint.Style.STROKE);
        this.f3441z1.setStrokeWidth(C0017d.m95t(getContext(), 2.0f));
        this.f3441z1.setAntiAlias(true);
        this.f3412C1.setColor(this.f3424O1);
        this.f3412C1.setStyle(Paint.Style.STROKE);
        this.f3412C1.setStrokeWidth(C0017d.m95t(getContext(), 2.0f));
        this.f3412C1.setAntiAlias(true);
        this.f3411B1.setColor(-14935012);
        this.f3411B1.setTextSize(C0017d.m95t(getContext(), 14.0f));
        this.f3411B1.setAntiAlias(true);
        this.f3411B1.setTextAlign(Paint.Align.CENTER);
        this.f3411B1.setFakeBoldText(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private int getPreferredHeight() {
        int m95t = C0017d.m95t(getContext(), 200.0f);
        return this.f3422M1 ? m95t + this.f3436m + this.f3435e : m95t;
    }

    private int getPreferredWidth() {
        return C0017d.m95t(getContext(), 200.0f) + this.f3434c + this.f3436m;
    }

    /* renamed from: a */
    public final boolean m2200a(MotionEvent motionEvent) {
        Point point = this.f3431V1;
        if (point == null) {
            return false;
        }
        int i7 = point.x;
        int i8 = point.y;
        if (this.f3429T1.contains(i7, i8)) {
            float y7 = motionEvent.getY();
            Rect rect = this.f3429T1;
            float height = rect.height();
            float f7 = rect.top;
            this.f3419J1 = 360.0f - (((y7 >= f7 ? y7 > ((float) rect.bottom) ? height : y7 - f7 : 0.0f) * 360.0f) / height);
        } else if (this.f3428S1.contains(i7, i8)) {
            float x7 = motionEvent.getX();
            float y8 = motionEvent.getY();
            Rect rect2 = this.f3428S1;
            float width = rect2.width();
            float height2 = rect2.height();
            float f8 = rect2.left;
            float f9 = x7 < f8 ? 0.0f : x7 > ((float) rect2.right) ? width : x7 - f8;
            float f10 = rect2.top;
            float f11 = y8 >= f10 ? y8 > ((float) rect2.bottom) ? height2 : y8 - f10 : 0.0f;
            this.f3420K1 = (1.0f / width) * f9;
            this.f3421L1 = 1.0f - ((1.0f / height2) * f11);
        } else {
            Rect rect3 = this.f3430U1;
            if (rect3 == null || !rect3.contains(i7, i8)) {
                return false;
            }
            int x8 = (int) motionEvent.getX();
            Rect rect4 = this.f3430U1;
            int width2 = rect4.width();
            int i9 = rect4.left;
            this.f3418I1 = 255 - (((x8 >= i9 ? x8 > rect4.right ? width2 : x8 - i9 : 0) * 255) / width2);
        }
        return true;
    }

    /* renamed from: b */
    public final void m2201b(int i7, boolean z6) {
        InterfaceC0696b interfaceC0696b;
        int alpha = Color.alpha(i7);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i7), Color.green(i7), Color.blue(i7), fArr);
        this.f3418I1 = alpha;
        float f7 = fArr[0];
        this.f3419J1 = f7;
        float f8 = fArr[1];
        this.f3420K1 = f8;
        float f9 = fArr[2];
        this.f3421L1 = f9;
        if (z6 && (interfaceC0696b = this.f3433X1) != null) {
            ((C0700d) interfaceC0696b).m2208U(Color.HSVToColor(alpha, new float[]{f7, f8, f9}));
        }
        invalidate();
    }

    public String getAlphaSliderText() {
        return this.f3423N1;
    }

    public int getBorderColor() {
        return this.f3425P1;
    }

    public int getColor() {
        return Color.HSVToColor(this.f3418I1, new float[]{this.f3419J1, this.f3420K1, this.f3421L1});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f3426Q1);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f3426Q1);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f3426Q1);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f3426Q1);
    }

    public int getSliderTrackerColor() {
        return this.f3424O1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        if (this.f3427R1.width() <= 0 || this.f3427R1.height() <= 0) {
            return;
        }
        Rect rect2 = this.f3428S1;
        this.f3413D1.setColor(this.f3425P1);
        Rect rect3 = this.f3427R1;
        canvas.drawRect(rect3.left, rect3.top, rect2.right + 1, rect2.bottom + 1, this.f3413D1);
        if (this.f3414E1 == null) {
            float f7 = rect2.left;
            this.f3414E1 = new LinearGradient(f7, rect2.top, f7, rect2.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        C0695a c0695a = this.f3416G1;
        if (c0695a == null || c0695a.f3444c != this.f3419J1) {
            if (c0695a == null) {
                this.f3416G1 = new C0695a();
            }
            C0695a c0695a2 = this.f3416G1;
            if (c0695a2.f3443b == null) {
                c0695a2.f3443b = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            }
            C0695a c0695a3 = this.f3416G1;
            if (c0695a3.f3442a == null) {
                c0695a3.f3442a = new Canvas(this.f3416G1.f3443b);
            }
            int HSVToColor = Color.HSVToColor(new float[]{this.f3419J1, 1.0f, 1.0f});
            float f8 = rect2.left;
            float f9 = rect2.top;
            this.f3415F1 = new LinearGradient(f8, f9, rect2.right, f9, -1, HSVToColor, Shader.TileMode.CLAMP);
            this.f3440y1.setShader(new ComposeShader(this.f3414E1, this.f3415F1, PorterDuff.Mode.MULTIPLY));
            this.f3416G1.f3442a.drawRect(0.0f, 0.0f, r1.f3443b.getWidth(), this.f3416G1.f3443b.getHeight(), this.f3440y1);
            this.f3416G1.f3444c = this.f3419J1;
        }
        canvas.drawBitmap(this.f3416G1.f3443b, (Rect) null, rect2, (Paint) null);
        float f10 = this.f3420K1;
        float f11 = this.f3421L1;
        Rect rect4 = this.f3428S1;
        float height = rect4.height();
        float width = rect4.width();
        Point point = new Point();
        point.x = (int) ((f10 * width) + rect4.left);
        point.y = (int) (((1.0f - f11) * height) + rect4.top);
        this.f3441z1.setColor(-16777216);
        canvas.drawCircle(point.x, point.y, this.f3437s - C0017d.m95t(getContext(), 1.0f), this.f3441z1);
        this.f3441z1.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, this.f3437s, this.f3441z1);
        Rect rect5 = this.f3429T1;
        this.f3413D1.setColor(this.f3425P1);
        canvas.drawRect(rect5.left - 1, rect5.top - 1, rect5.right + 1, rect5.bottom + 1, this.f3413D1);
        if (this.f3417H1 == null) {
            C0695a c0695a4 = new C0695a();
            this.f3417H1 = c0695a4;
            c0695a4.f3443b = Bitmap.createBitmap(rect5.width(), rect5.height(), Bitmap.Config.ARGB_8888);
            this.f3417H1.f3442a = new Canvas(this.f3417H1.f3443b);
            int height2 = (int) (rect5.height() + 0.5f);
            int[] iArr = new int[height2];
            float f12 = 360.0f;
            for (int i7 = 0; i7 < height2; i7++) {
                iArr[i7] = Color.HSVToColor(new float[]{f12, 1.0f, 1.0f});
                f12 -= 360.0f / height2;
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i8 = 0; i8 < height2; i8++) {
                paint.setColor(iArr[i8]);
                float f13 = i8;
                this.f3417H1.f3442a.drawLine(0.0f, f13, r6.f3443b.getWidth(), f13, paint);
            }
        }
        canvas.drawBitmap(this.f3417H1.f3443b, (Rect) null, rect5, (Paint) null);
        float f14 = this.f3419J1;
        Rect rect6 = this.f3429T1;
        float height3 = rect6.height();
        Point point2 = new Point();
        point2.y = (int) ((height3 - ((f14 * height3) / 360.0f)) + rect6.top);
        point2.x = rect6.left;
        RectF rectF = new RectF();
        int i9 = rect5.left;
        int i10 = this.f3438w1;
        rectF.left = i9 - i10;
        rectF.right = rect5.right + i10;
        int i11 = point2.y;
        int i12 = this.f3439x1 / 2;
        rectF.top = i11 - i12;
        rectF.bottom = i12 + i11;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f3412C1);
        if (!this.f3422M1 || (rect = this.f3430U1) == null || this.f3432W1 == null) {
            return;
        }
        this.f3413D1.setColor(this.f3425P1);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f3413D1);
        this.f3432W1.draw(canvas);
        float[] fArr = {this.f3419J1, this.f3420K1, this.f3421L1};
        int HSVToColor2 = Color.HSVToColor(fArr);
        int HSVToColor3 = Color.HSVToColor(0, fArr);
        float f15 = rect.left;
        float f16 = rect.top;
        this.f3410A1.setShader(new LinearGradient(f15, f16, rect.right, f16, HSVToColor2, HSVToColor3, Shader.TileMode.CLAMP));
        canvas.drawRect(rect, this.f3410A1);
        String str = this.f3423N1;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f3423N1, rect.centerX(), C0017d.m95t(getContext(), 4.0f) + rect.centerY(), this.f3411B1);
        }
        int i13 = this.f3418I1;
        Rect rect7 = this.f3430U1;
        float width2 = rect7.width();
        Point point3 = new Point();
        point3.x = (int) ((width2 - ((i13 * width2) / 255.0f)) + rect7.left);
        point3.y = rect7.top;
        RectF rectF2 = new RectF();
        int i14 = point3.x;
        int i15 = this.f3439x1 / 2;
        rectF2.left = i14 - i15;
        rectF2.right = i15 + i14;
        int i16 = rect.top;
        int i17 = this.f3438w1;
        rectF2.top = i16 - i17;
        rectF2.bottom = rect.bottom + i17;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f3412C1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r1 > r6) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getPaddingLeft()
            int r6 = r6 - r2
            int r2 = r5.getPaddingRight()
            int r6 = r6 - r2
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r2 = r5.getPaddingBottom()
            int r7 = r7 - r2
            int r2 = r5.getPaddingTop()
            int r7 = r7 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L5c
            if (r1 != r2) goto L2b
            goto L5c
        L2b:
            int r0 = r5.f3436m
            int r1 = r7 + r0
            int r2 = r5.f3434c
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f3422M1
            if (r2 == 0) goto L40
            int r2 = r5.f3435e
            int r4 = r0 + r2
            int r1 = r1 - r4
            int r0 = r0 + r2
            int r3 = r3 + r0
        L40:
            r0 = 1
            r2 = 0
            if (r1 > r6) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            if (r3 > r7) goto L4a
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r4 == 0) goto L50
            if (r0 == 0) goto L50
            goto L5a
        L50:
            if (r0 != 0) goto L56
            if (r4 == 0) goto L56
        L54:
            r6 = r1
            goto L89
        L56:
            if (r4 != 0) goto L89
            if (r0 == 0) goto L89
        L5a:
            r7 = r3
            goto L89
        L5c:
            if (r0 != r2) goto L74
            if (r1 == r2) goto L74
            int r0 = r5.f3436m
            int r1 = r6 - r0
            int r2 = r5.f3434c
            int r1 = r1 - r2
            boolean r2 = r5.f3422M1
            if (r2 == 0) goto L6f
            int r2 = r5.f3435e
            int r0 = r0 + r2
            int r1 = r1 + r0
        L6f:
            if (r1 <= r7) goto L72
            goto L89
        L72:
            r7 = r1
            goto L89
        L74:
            if (r1 != r2) goto L89
            if (r0 == r2) goto L89
            int r0 = r5.f3436m
            int r1 = r7 + r0
            int r2 = r5.f3434c
            int r1 = r1 + r2
            boolean r2 = r5.f3422M1
            if (r2 == 0) goto L87
            int r2 = r5.f3435e
            int r0 = r0 + r2
            int r1 = r1 - r0
        L87:
            if (r1 <= r6) goto L54
        L89:
            int r0 = r5.getPaddingLeft()
            int r0 = r0 + r6
            int r6 = r5.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r0 = r0 + r7
            int r7 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.ColorPicker.ColorPickerView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3418I1 = bundle.getInt("alpha");
            this.f3419J1 = bundle.getFloat("hue");
            this.f3420K1 = bundle.getFloat("sat");
            this.f3421L1 = bundle.getFloat("val");
            this.f3422M1 = bundle.getBoolean("show_alpha");
            this.f3423N1 = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f3418I1);
        bundle.putFloat("hue", this.f3419J1);
        bundle.putFloat("sat", this.f3420K1);
        bundle.putFloat("val", this.f3421L1);
        bundle.putBoolean("show_alpha", this.f3422M1);
        bundle.putString("alpha_text", this.f3423N1);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        Rect rect = new Rect();
        this.f3427R1 = rect;
        rect.left = getPaddingLeft();
        this.f3427R1.right = i7 - getPaddingRight();
        this.f3427R1.top = getPaddingTop();
        this.f3427R1.bottom = i8 - getPaddingBottom();
        this.f3414E1 = null;
        this.f3415F1 = null;
        this.f3416G1 = null;
        this.f3417H1 = null;
        Rect rect2 = this.f3427R1;
        int i11 = rect2.left + 1;
        int i12 = rect2.top + 1;
        int i13 = rect2.bottom - 1;
        int i14 = rect2.right - 1;
        int i15 = this.f3436m;
        int i16 = (i14 - i15) - this.f3434c;
        if (this.f3422M1) {
            i13 -= this.f3435e + i15;
        }
        this.f3428S1 = new Rect(i11, i12, i16, i13);
        Rect rect3 = this.f3427R1;
        int i17 = rect3.right;
        this.f3429T1 = new Rect((i17 - this.f3434c) + 1, rect3.top + 1, i17 - 1, (rect3.bottom - 1) - (this.f3422M1 ? this.f3436m + this.f3435e : 0));
        if (this.f3422M1) {
            Rect rect4 = this.f3427R1;
            int i18 = rect4.left + 1;
            int i19 = rect4.bottom;
            this.f3430U1 = new Rect(i18, (i19 - this.f3435e) + 1, rect4.right - 1, i19 - 1);
            C1636a c1636a = new C1636a(C0017d.m95t(getContext(), 4.0f));
            this.f3432W1 = c1636a;
            c1636a.setBounds(Math.round(this.f3430U1.left), Math.round(this.f3430U1.top), Math.round(this.f3430U1.right), Math.round(this.f3430U1.bottom));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L11
            if (r0 == r2) goto Lf
            if (r0 == r1) goto L22
            r0 = 0
            goto L26
        Lf:
            r0 = 0
            goto L20
        L11:
            android.graphics.Point r0 = new android.graphics.Point
            float r4 = r7.getX()
            int r4 = (int) r4
            float r5 = r7.getY()
            int r5 = (int) r5
            r0.<init>(r4, r5)
        L20:
            r6.f3431V1 = r0
        L22:
            boolean r0 = r6.m2200a(r7)
        L26:
            if (r0 == 0) goto L4a
            com.so.revelation.lua.View.ColorPicker.ColorPickerView$b r7 = r6.f3433X1
            if (r7 == 0) goto L46
            int r0 = r6.f3418I1
            r4 = 3
            float[] r4 = new float[r4]
            float r5 = r6.f3419J1
            r4[r3] = r5
            float r3 = r6.f3420K1
            r4[r2] = r3
            float r3 = r6.f3421L1
            r4[r1] = r3
            int r0 = android.graphics.Color.HSVToColor(r0, r4)
            com.so.revelation.lua.View.ColorPicker.d r7 = (com.so.revelation.lua.View.ColorPicker.C0700d) r7
            r7.m2208U(r0)
        L46:
            r6.invalidate()
            return r2
        L4a:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.so.revelation.lua.View.ColorPicker.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAlphaSliderText(int i7) {
        setAlphaSliderText(getContext().getString(i7));
    }

    public void setAlphaSliderText(String str) {
        this.f3423N1 = str;
        invalidate();
    }

    public void setAlphaSliderVisible(boolean z6) {
        if (this.f3422M1 != z6) {
            this.f3422M1 = z6;
            this.f3414E1 = null;
            this.f3415F1 = null;
            this.f3417H1 = null;
            this.f3416G1 = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i7) {
        this.f3425P1 = i7;
        invalidate();
    }

    public void setColor(int i7) {
        m2201b(i7, false);
    }

    public void setOnColorChangedListener(InterfaceC0696b interfaceC0696b) {
        this.f3433X1 = interfaceC0696b;
    }

    public void setSliderTrackerColor(int i7) {
        this.f3424O1 = i7;
        this.f3412C1.setColor(i7);
        invalidate();
    }
}
