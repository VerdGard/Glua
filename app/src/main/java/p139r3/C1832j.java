package p139r3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p050g0.C1191a;
import p163u3.C1971b;
import p181x.C2155d;

/* renamed from: r3.j */
/* loaded from: classes.dex */
public final class C1832j {
    /* renamed from: a */
    public static float m4310a(String[] strArr, int i7) {
        float parseFloat = Float.parseFloat(strArr[i7]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static boolean m4311b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: c */
    public static int m4312c(Context context, int i7, int i8) {
        TypedValue m4582a = C1971b.m4582a(i7, context);
        return (m4582a == null || m4582a.type != 16) ? i8 : m4582a.data;
    }

    /* renamed from: d */
    public static TimeInterpolator m4313d(Context context, int i7, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!(m4311b(valueOf, "cubic-bezier") || m4311b(valueOf, "path"))) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m4311b(valueOf, "cubic-bezier")) {
            if (m4311b(valueOf, "path")) {
                return C1191a.m3410c(C2155d.m5276d(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return C1191a.m3409b(m4310a(split, 0), m4310a(split, 1), m4310a(split, 2), m4310a(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }
}
