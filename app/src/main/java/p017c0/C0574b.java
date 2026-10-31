package p017c0;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public final class C0574b {

    /* renamed from: a */
    public static final Method f2938a;

    /* renamed from: c0.b$a */
    public static class a {
        /* renamed from: a */
        public static String m2002a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: c0.b$b */
    public static class b {
        /* renamed from: a */
        public static ULocale m2003a(Object obj) {
            ULocale addLikelySubtags;
            addLikelySubtags = ULocale.addLikelySubtags((ULocale) obj);
            return addLikelySubtags;
        }

        /* renamed from: b */
        public static ULocale m2004b(Locale locale) {
            ULocale forLocale;
            forLocale = ULocale.forLocale(locale);
            return forLocale;
        }

        /* renamed from: c */
        public static String m2005c(Object obj) {
            String script;
            script = ((ULocale) obj).getScript();
            return script;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f2938a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    /* renamed from: a */
    public static String m2001a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.m2005c(b.m2003a(b.m2004b(locale)));
        }
        try {
            return a.m2002a((Locale) f2938a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException e7) {
            Log.w("ICUCompat", e7);
            return a.m2002a(locale);
        }
    }
}
