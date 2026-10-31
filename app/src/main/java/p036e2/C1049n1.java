package p036e2;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.widget.TextView;

/* renamed from: e2.n1 */
/* loaded from: classes.dex */
public final class C1049n1 extends TextView {

    /* renamed from: c */
    public final Paint f5260c;

    /* renamed from: e */
    public final PaintFlagsDrawFilter f5261e;

    public C1049n1(Activity activity) {
        super(activity);
        Paint paint = new Paint();
        this.f5260c = paint;
        this.f5261e = new PaintFlagsDrawFilter(0, 3);
        paint.setColor(-1);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.setDrawFilter(this.f5261e);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.max(getWidth(), getHeight()) / 2, this.f5260c);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int max = Math.max(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(max, max);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        this.f5260c.setColor(i7);
    }
}
