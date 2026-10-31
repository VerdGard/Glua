package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public final class C0267u extends RatingBar {

    /* renamed from: c */
    public final C0263s f1101c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0267u(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = androidx.appcompat.R$attr.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.C0218c1.m702a(r2, r1)
            androidx.appcompat.widget.s r2 = new androidx.appcompat.widget.s
            r2.<init>(r1)
            r1.f1101c = r2
            r2.mo886a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0267u.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmap = this.f1101c.f1090b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
