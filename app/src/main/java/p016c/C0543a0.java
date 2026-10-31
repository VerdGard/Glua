package p016c;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: c.a0 */
/* loaded from: classes.dex */
public final class C0543a0 {

    /* renamed from: a */
    public static Field f2700a;

    /* renamed from: b */
    public static boolean f2701b;

    /* renamed from: c */
    public static Class<?> f2702c;

    /* renamed from: d */
    public static boolean f2703d;

    /* renamed from: e */
    public static Field f2704e;

    /* renamed from: f */
    public static boolean f2705f;

    /* renamed from: g */
    public static Field f2706g;

    /* renamed from: h */
    public static boolean f2707h;

    /* renamed from: c.a0$a */
    public static class a {
        /* renamed from: a */
        public static void m1874a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m1873a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2703d) {
            try {
                f2702c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f2703d = true;
        }
        Class<?> cls = f2702c;
        if (cls == null) {
            return;
        }
        if (!f2705f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2704e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
            }
            f2705f = true;
        }
        Field field = f2704e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.m1874a(longSparseArray);
        }
    }
}
