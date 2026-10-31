package p173w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p026d0.C0874b;
import p173w.C2044f;

/* renamed from: w.f */
/* loaded from: classes.dex */
public final class C2044f {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f9325a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<d, SparseArray<c>> f9326b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f9327c = new Object();

    /* renamed from: w.f$a */
    public static class a {
        /* renamed from: a */
        public static Drawable m5067a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        /* renamed from: b */
        public static Drawable m5068b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    /* renamed from: w.f$b */
    public static class b {
        /* renamed from: a */
        public static int m5069a(Resources resources, int i7, Resources.Theme theme) {
            int color;
            color = resources.getColor(i7, theme);
            return color;
        }

        /* renamed from: b */
        public static ColorStateList m5070b(Resources resources, int i7, Resources.Theme theme) {
            ColorStateList colorStateList;
            colorStateList = resources.getColorStateList(i7, theme);
            return colorStateList;
        }
    }

    /* renamed from: w.f$c */
    public static class c {

        /* renamed from: a */
        public final ColorStateList f9328a;

        /* renamed from: b */
        public final Configuration f9329b;

        /* renamed from: c */
        public final int f9330c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f9328a = colorStateList;
            this.f9329b = configuration;
            this.f9330c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: w.f$d */
    public static final class d {

        /* renamed from: a */
        public final Resources f9331a;

        /* renamed from: b */
        public final Resources.Theme f9332b;

        public d(Resources resources, Resources.Theme theme) {
            this.f9331a = resources;
            this.f9332b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f9331a.equals(dVar.f9331a) && C0874b.m2562a(this.f9332b, dVar.f9332b);
        }

        public final int hashCode() {
            return C0874b.m2563b(this.f9331a, this.f9332b);
        }
    }

    /* renamed from: w.f$e */
    public static abstract class e {
        /* renamed from: a */
        public final void m5071a(final int i7) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2044f.e.this.mo720c(i7);
                }
            });
        }

        /* renamed from: b */
        public final void m5072b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2045g(this, 0, typeface));
        }

        /* renamed from: c */
        public abstract void mo720c(int i7);

        /* renamed from: d */
        public abstract void mo721d(Typeface typeface);
    }

    /* renamed from: w.f$f */
    public static final class f {

        /* renamed from: w.f$f$a */
        public static class a {

            /* renamed from: a */
            public static final Object f9333a = new Object();

            /* renamed from: b */
            public static Method f9334b;

            /* renamed from: c */
            public static boolean f9335c;
        }

        /* renamed from: w.f$f$b */
        public static class b {
            /* renamed from: a */
            public static void m5074a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m5073a(Resources.Theme theme) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                b.m5074a(theme);
                return;
            }
            if (i7 >= 23) {
                synchronized (a.f9333a) {
                    if (!a.f9335c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            a.f9334b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e7) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                        }
                        a.f9335c = true;
                    }
                    Method method = a.f9334b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e8) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                            a.f9334b = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5064a(d dVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9327c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f9326b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i7, new c(colorStateList, dVar.f9331a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static Typeface m5065b(int i7, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return m5066c(context, i7, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r19 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r19 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        r19.m5071a(-3);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m5066c(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, p173w.C2044f.e r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p173w.C2044f.m5066c(android.content.Context, int, android.util.TypedValue, int, w.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
