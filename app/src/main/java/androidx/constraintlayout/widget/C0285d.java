package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public final class C0285d extends View {
    public C0285d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i7) {
        ConstraintLayout.C0280a c0280a = (ConstraintLayout.C0280a) getLayoutParams();
        c0280a.f1215a = i7;
        setLayoutParams(c0280a);
    }

    public void setGuidelineEnd(int i7) {
        ConstraintLayout.C0280a c0280a = (ConstraintLayout.C0280a) getLayoutParams();
        c0280a.f1217b = i7;
        setLayoutParams(c0280a);
    }

    public void setGuidelinePercent(float f7) {
        ConstraintLayout.C0280a c0280a = (ConstraintLayout.C0280a) getLayoutParams();
        c0280a.f1219c = f7;
        setLayoutParams(c0280a);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }
}
