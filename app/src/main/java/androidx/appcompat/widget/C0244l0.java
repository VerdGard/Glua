package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public final class C0244l0 {

    /* renamed from: a */
    public static final int[] f969a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f970b = new int[0];

    static {
        new Rect();
    }

    /* renamed from: a */
    public static void m842a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (!(i7 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) && (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        m843b(drawable);
    }

    /* renamed from: b */
    public static void m843b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f969a);
        } else {
            drawable.setState(f970b);
        }
        drawable.setState(state);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m844c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
