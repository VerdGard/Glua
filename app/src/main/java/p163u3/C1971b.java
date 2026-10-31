package p163u3;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: u3.b */
/* loaded from: classes.dex */
public final class C1971b {
    /* renamed from: a */
    public static TypedValue m4582a(int i7, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m4583b(int i7, Context context, boolean z6) {
        TypedValue m4582a = m4582a(i7, context);
        return (m4582a == null || m4582a.type != 18) ? z6 : m4582a.data != 0;
    }

    /* renamed from: c */
    public static TypedValue m4584c(int i7, Context context, String str) {
        TypedValue m4582a = m4582a(i7, context);
        if (m4582a != null) {
            return m4582a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }
}
