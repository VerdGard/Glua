package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public final class C0286e extends View {

    /* renamed from: c */
    public int f1388c;

    /* renamed from: e */
    public View f1389e;

    /* renamed from: m */
    public int f1390m;

    public View getContent() {
        return this.f1389e;
    }

    public int getEmptyVisibility() {
        return this.f1390m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i7) {
        View findViewById;
        if (this.f1388c == i7) {
            return;
        }
        View view = this.f1389e;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0280a) this.f1389e.getLayoutParams()).f1216a0 = false;
            this.f1389e = null;
        }
        this.f1388c = i7;
        if (i7 == -1 || (findViewById = ((View) getParent()).findViewById(i7)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i7) {
        this.f1390m = i7;
    }
}
