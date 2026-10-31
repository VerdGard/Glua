package p171v4;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import p032d6.C0898f;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class C2017a extends Drawable {

    /* renamed from: a */
    public final Paint f9170a;

    /* renamed from: b */
    public final Paint f9171b;

    /* renamed from: c */
    public final EnumC2021e f9172c;

    /* renamed from: d */
    public final boolean f9173d;

    public C2017a(EnumC2021e enumC2021e, boolean z6) {
        C0898f.m2606e(enumC2021e, "kind");
        this.f9172c = enumC2021e;
        this.f9173d = z6;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor((int) enumC2021e.f9185e);
        this.f9170a = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setTextSize(Resources.getSystem().getDisplayMetrics().density * 14);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f9171b = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0898f.m2606e(canvas, "canvas");
        float f7 = getBounds().right;
        float f8 = getBounds().bottom;
        boolean z6 = this.f9173d;
        Paint paint = this.f9170a;
        if (z6) {
            float f9 = 2;
            float f10 = f7 / f9;
            canvas.drawCircle(f10, f8 / f9, f10, paint);
        } else {
            canvas.drawRect(0.0f, 0.0f, f7, f8, paint);
        }
        canvas.save();
        canvas.translate(f7 / 2.0f, f8 / 2.0f);
        Paint paint2 = this.f9171b;
        canvas.drawText(this.f9172c.f9186m, 0.0f, (-(paint2.ascent() + paint2.descent())) / 2.0f, paint2);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f9170a.setAlpha(i7);
        this.f9171b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9171b.setColorFilter(colorFilter);
    }
}
