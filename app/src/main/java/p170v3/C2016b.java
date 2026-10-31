package p170v3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import p163u3.C1971b;
import p166v.C2009a;

/* renamed from: v3.b */
/* loaded from: classes.dex */
public final class C2016b {

    /* renamed from: a */
    public static final int[] f9168a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f9169b = C2016b.class.getSimpleName();

    /* renamed from: v3.b$a */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static Drawable m4913b(Context context, int i7) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i7, i7, i7, i7);
            int i8 = R$attr.colorControlHighlight;
            ColorStateList valueOf = ColorStateList.valueOf(0);
            TypedValue m4582a = C1971b.m4582a(i8, context);
            if (m4582a != null) {
                int i9 = m4582a.resourceId;
                colorStateList = i9 != 0 ? C2009a.m4896c(i9, context) : ColorStateList.valueOf(m4582a.data);
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                valueOf = colorStateList;
            }
            return new RippleDrawable(valueOf, null, insetDrawable);
        }
    }

    /* renamed from: a */
    public static ColorStateList m4910a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 22 && i7 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9168a, 0)) != 0) {
            Log.w(f9169b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m4911b(int[] iArr) {
        boolean z6 = false;
        boolean z7 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z6 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z7 = true;
            }
        }
        return z6 && z7;
    }
}
