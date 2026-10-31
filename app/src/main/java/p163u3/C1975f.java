package p163u3;

import android.content.res.Configuration;
import android.ext.DaemonManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.activity.C0143v;

/* renamed from: u3.f */
/* loaded from: classes.dex */
public final class C1975f {
    /* renamed from: a */
    public static Typeface m4596a(Configuration configuration, Typeface typeface) {
        int i7;
        int i8;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i7 = configuration.fontWeightAdjustment;
        if (i7 == Integer.MAX_VALUE) {
            return null;
        }
        i8 = configuration.fontWeightAdjustment;
        if (i8 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i9 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, C0143v.m460r(i9 + weight, 1, DaemonManager.TIME_JUMP_MUL_INT), typeface.isItalic());
        return create;
    }
}
