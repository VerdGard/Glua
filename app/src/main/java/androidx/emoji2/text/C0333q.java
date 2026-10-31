package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: androidx.emoji2.text.q */
/* loaded from: classes.dex */
public final class C0333q extends AbstractC0328l {
    public C0333q(C0326j c0326j) {
        super(c0326j);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        C0323g.m1102a().getClass();
        C0326j c0326j = this.f1596e;
        C0331o c0331o = c0326j.f1582b;
        Typeface typeface = c0331o.f1611d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(c0331o.f1609b, c0326j.f1581a * 2, 2, f7, i10, paint);
        paint.setTypeface(typeface2);
    }
}
