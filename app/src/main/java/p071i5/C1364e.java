package p071i5;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: i5.e */
/* loaded from: classes.dex */
public final class C1364e extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), TypedValue.applyDimension(1, 4.0f, view.getContext().getResources().getDisplayMetrics()));
    }
}
