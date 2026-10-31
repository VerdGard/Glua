package p107n1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C1636a extends Drawable {

    /* renamed from: a */
    public final int f7465a;

    /* renamed from: b */
    public final Paint f7466b = new Paint();

    /* renamed from: c */
    public final Paint f7467c;

    /* renamed from: d */
    public final Paint f7468d;

    /* renamed from: e */
    public int f7469e;

    /* renamed from: f */
    public int f7470f;

    /* renamed from: g */
    public Bitmap f7471g;

    public C1636a(int i7) {
        this.f7465a = 10;
        Paint paint = new Paint();
        this.f7467c = paint;
        Paint paint2 = new Paint();
        this.f7468d = paint2;
        this.f7465a = i7;
        paint.setColor(-1);
        paint2.setColor(-3421237);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f7471g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f7471g, (Rect) null, getBounds(), this.f7466b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int i7 = this.f7465a;
        this.f7469e = (int) Math.ceil(width / i7);
        this.f7470f = (int) Math.ceil(height / i7);
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f7471g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f7471g);
        Rect rect2 = new Rect();
        boolean z6 = true;
        for (int i8 = 0; i8 <= this.f7470f; i8++) {
            boolean z7 = z6;
            for (int i9 = 0; i9 <= this.f7469e; i9++) {
                int i10 = i8 * i7;
                rect2.top = i10;
                int i11 = i9 * i7;
                rect2.left = i11;
                rect2.bottom = i10 + i7;
                rect2.right = i11 + i7;
                canvas.drawRect(rect2, z7 ? this.f7467c : this.f7468d);
                z7 = !z7;
            }
            z6 = !z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
