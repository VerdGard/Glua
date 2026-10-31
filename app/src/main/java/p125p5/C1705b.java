package p125p5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import p118o5.InterfaceC1673d;

/* renamed from: p5.b */
/* loaded from: classes.dex */
public final class C1705b extends C1704a {

    /* renamed from: e */
    public final int f7674e;

    /* renamed from: f */
    public final Paint f7675f;

    public C1705b(Context context) {
        super(context);
        this.f7674e = (int) TypedValue.applyDimension(1, 22.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.f7675f = paint;
        paint.setAntiAlias(true);
    }

    @Override // p118o5.InterfaceC1673d
    /* renamed from: a */
    public final void mo4058a(Canvas canvas, int i7, float f7, float f8, int i8, InterfaceC1673d.a aVar) {
        float f9 = this.f7674e / 2.0f;
        Paint paint = this.f7675f;
        paint.setColor(i8);
        if (i7 != 0 && i7 != -1) {
            boolean z6 = i7 == 1;
            float f10 = z6 ? f7 - f9 : f7 + f9;
            float f11 = f8 + f9;
            canvas.drawCircle(f10, f11, f9, paint);
            canvas.drawRect(z6 ? f10 : f10 - f9, f8, z6 ? f10 + f9 : f10, f11, paint);
            float f12 = f10 - f9;
            float f13 = f10 + f9;
            float f14 = (f9 * 2.0f) + f8;
            aVar.f7547b = z6 ? 1 : 2;
            aVar.f7546a.set(f12, f8, f13, f14);
            return;
        }
        int i9 = this.f7673d;
        Drawable drawable = this.f7670a;
        if (i9 != i8) {
            this.f7673d = i8;
            drawable.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_ATOP));
        }
        float f15 = (this.f7671b * 1.0f) / 2.0f;
        int i10 = (int) (f7 - f15);
        int i11 = (int) f8;
        int i12 = (int) (f15 + f7);
        int i13 = (int) ((this.f7672c * 1.0f) + f8);
        drawable.setBounds(i10, i11, i12, i13);
        drawable.setAlpha(255);
        drawable.draw(canvas);
        aVar.f7547b = 0;
        aVar.f7546a.set(i10, i11, i12, i13);
    }
}
