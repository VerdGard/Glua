package p163u3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C0233h1;
import p025d.C0872a;
import p166v.C2009a;

/* renamed from: u3.c */
/* loaded from: classes.dex */
public final class C1972c {
    /* renamed from: a */
    public static ColorStateList m4585a(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList m4896c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (m4896c = C2009a.m4896c(resourceId, context)) == null) ? typedArray.getColorStateList(i7) : m4896c;
    }

    /* renamed from: b */
    public static ColorStateList m4586b(Context context, C0233h1 c0233h1, int i7) {
        int m799i;
        ColorStateList m4896c;
        return (!c0233h1.m802l(i7) || (m799i = c0233h1.m799i(i7, 0)) == 0 || (m4896c = C2009a.m4896c(m799i, context)) == null) ? c0233h1.m792b(i7) : m4896c;
    }

    /* renamed from: c */
    public static Drawable m4587c(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable m2561a;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (m2561a = C0872a.m2561a(context, resourceId)) == null) ? typedArray.getDrawable(i7) : m2561a;
    }

    /* renamed from: d */
    public static boolean m4588d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
