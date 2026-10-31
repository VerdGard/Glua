package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class C0213b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f801a;

    public C0213b(ActionBarContainer actionBarContainer) {
        this.f801a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f801a;
        if (actionBarContainer.f576z1) {
            Drawable drawable = actionBarContainer.f575y1;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f573w1;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f574x1;
        if (drawable3 == null || !actionBarContainer.f567A1) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f801a;
        if (!actionBarContainer.f576z1) {
            drawable = actionBarContainer.f573w1;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f575y1 == null) {
            return;
        } else {
            drawable = actionBarContainer.f573w1;
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
