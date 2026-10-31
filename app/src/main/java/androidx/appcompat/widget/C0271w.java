package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public final class C0271w extends SeekBar {

    /* renamed from: c */
    public final C0273x f1104c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0271w(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = androidx.appcompat.R$attr.seekBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.C0218c1.m702a(r2, r1)
            androidx.appcompat.widget.x r2 = new androidx.appcompat.widget.x
            r2.<init>(r1)
            r1.f1104c = r2
            r2.mo886a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0271w.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0273x c0273x = this.f1104c;
        Drawable drawable = c0273x.f1108e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c0273x.f1107d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1104c.f1108e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1104c.m895d(canvas);
    }
}
