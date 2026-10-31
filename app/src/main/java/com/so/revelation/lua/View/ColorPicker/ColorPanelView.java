package com.so.revelation.lua.View.ColorPicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import com.so.revelation.lua.R$styleable;
import java.util.Locale;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p034e0.C0923h0;
import p034e0.C0946x;
import p107n1.C1636a;

/* loaded from: classes.dex */
public class ColorPanelView extends View {

    /* renamed from: A1 */
    public boolean f3397A1;

    /* renamed from: B1 */
    public int f3398B1;

    /* renamed from: C1 */
    public int f3399C1;

    /* renamed from: D1 */
    public int f3400D1;

    /* renamed from: E1 */
    public int f3401E1;

    /* renamed from: c */
    public C1636a f3402c;

    /* renamed from: e */
    public Paint f3403e;

    /* renamed from: m */
    public Paint f3404m;

    /* renamed from: s */
    public Paint f3405s;

    /* renamed from: w1 */
    public Paint f3406w1;

    /* renamed from: x1 */
    public Rect f3407x1;

    /* renamed from: y1 */
    public Rect f3408y1;

    /* renamed from: z1 */
    public RectF f3409z1;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3409z1 = new RectF();
        this.f3399C1 = -9539986;
        this.f3400D1 = -16777216;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f3392c);
        this.f3401E1 = obtainStyledAttributes.getInt(1, 1);
        boolean z6 = obtainStyledAttributes.getBoolean(2, false);
        this.f3397A1 = z6;
        if (z6 && this.f3401E1 != 1) {
            throw new IllegalStateException("Color preview is only available in circle mode");
        }
        this.f3399C1 = obtainStyledAttributes.getColor(0, -9539986);
        obtainStyledAttributes.recycle();
        if (this.f3399C1 == -9539986) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
            this.f3399C1 = obtainStyledAttributes2.getColor(0, this.f3399C1);
            obtainStyledAttributes2.recycle();
        }
        this.f3398B1 = C0017d.m95t(context, 1.0f);
        Paint paint = new Paint();
        this.f3403e = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f3404m = paint2;
        paint2.setAntiAlias(true);
        if (this.f3397A1) {
            this.f3406w1 = new Paint();
        }
        if (this.f3401E1 == 1) {
            Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(com.so.revelation.lua.R.drawable.cpv_alpha)).getBitmap();
            Paint paint3 = new Paint();
            this.f3405s = paint3;
            paint3.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f3405s.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        }
    }

    /* renamed from: a */
    public final void m2199a() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i7 = (height / 2) + iArr[1];
        int i8 = (width / 2) + iArr[0];
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.e.m2847d(this) == 0) {
            i8 = context.getResources().getDisplayMetrics().widthPixels - i8;
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append((Color.alpha(this.f3400D1) != 255 ? Integer.toHexString(this.f3400D1) : String.format("%06X", Integer.valueOf(16777215 & this.f3400D1))).toUpperCase(Locale.ENGLISH));
        Toast makeText = Toast.makeText(context, sb.toString(), 0);
        if (i7 < rect.height()) {
            makeText.setGravity(8388661, i8, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
    }

    public int getBorderColor() {
        return this.f3399C1;
    }

    public int getColor() {
        return this.f3400D1;
    }

    public int getShape() {
        return this.f3401E1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f3403e.setColor(this.f3399C1);
        this.f3404m.setColor(this.f3400D1);
        int i7 = this.f3401E1;
        if (i7 == 0) {
            if (this.f3398B1 > 0) {
                canvas.drawRect(this.f3407x1, this.f3403e);
            }
            C1636a c1636a = this.f3402c;
            if (c1636a != null) {
                c1636a.draw(canvas);
            }
            canvas.drawRect(this.f3408y1, this.f3404m);
            return;
        }
        if (i7 == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f3398B1 > 0) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.f3403e);
            }
            if (Color.alpha(this.f3400D1) < 255) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f3398B1, this.f3405s);
            }
            if (!this.f3397A1) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - this.f3398B1, this.f3404m);
            } else {
                canvas.drawArc(this.f3409z1, 90.0f, 180.0f, true, this.f3406w1);
                canvas.drawArc(this.f3409z1, 270.0f, 180.0f, true, this.f3404m);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int measuredWidth;
        int measuredWidth2;
        int i9 = this.f3401E1;
        if (i9 == 0) {
            measuredWidth = View.MeasureSpec.getSize(i7);
            measuredWidth2 = View.MeasureSpec.getSize(i8);
        } else if (i9 != 1) {
            super.onMeasure(i7, i8);
            return;
        } else {
            super.onMeasure(i7, i7);
            measuredWidth = getMeasuredWidth();
            measuredWidth2 = getMeasuredWidth();
        }
        setMeasuredDimension(measuredWidth, measuredWidth2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3400D1 = bundle.getInt("color");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("color", this.f3400D1);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f3401E1 == 0 || this.f3397A1) {
            Rect rect = new Rect();
            this.f3407x1 = rect;
            rect.left = getPaddingLeft();
            this.f3407x1.right = i7 - getPaddingRight();
            this.f3407x1.top = getPaddingTop();
            this.f3407x1.bottom = i8 - getPaddingBottom();
            if (this.f3397A1) {
                int i11 = this.f3407x1.left;
                int i12 = this.f3398B1;
                this.f3409z1 = new RectF(i11 + i12, r2.top + i12, r2.right - i12, r2.bottom - i12);
                return;
            }
            Rect rect2 = this.f3407x1;
            int i13 = rect2.left;
            int i14 = this.f3398B1;
            this.f3408y1 = new Rect(i13 + i14, rect2.top + i14, rect2.right - i14, rect2.bottom - i14);
            C1636a c1636a = new C1636a(C0017d.m95t(getContext(), 4.0f));
            this.f3402c = c1636a;
            c1636a.setBounds(Math.round(this.f3408y1.left), Math.round(this.f3408y1.top), Math.round(this.f3408y1.right), Math.round(this.f3408y1.bottom));
        }
    }

    public void setBorderColor(int i7) {
        this.f3399C1 = i7;
        invalidate();
    }

    public void setColor(int i7) {
        this.f3400D1 = i7;
        invalidate();
    }

    public void setOriginalColor(int i7) {
        Paint paint = this.f3406w1;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    public void setShape(int i7) {
        this.f3401E1 = i7;
        invalidate();
    }
}
