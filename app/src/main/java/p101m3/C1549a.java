package p101m3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p189y.C2213a;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public final class C1549a {
    /* renamed from: a */
    public static Drawable m3947a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z6 = Build.VERSION.SDK_INT < 23;
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (!z6) {
                return drawable;
            }
            drawable.mutate();
            return drawable;
        }
        Drawable mutate = C2213a.m5359g(drawable).mutate();
        if (mode == null) {
            return mutate;
        }
        C2213a.b.m5373i(mutate, mode);
        return mutate;
    }
}
