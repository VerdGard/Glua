package p189y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: y.a */
/* loaded from: classes.dex */
public final class C2213a {

    /* renamed from: a */
    public static Method f10033a;

    /* renamed from: b */
    public static boolean f10034b;

    /* renamed from: c */
    public static Method f10035c;

    /* renamed from: d */
    public static boolean f10036d;

    /* renamed from: y.a$a */
    public static class a {
        /* renamed from: a */
        public static int m5360a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m5361b(DrawableContainer.DrawableContainerState drawableContainerState, int i7) {
            return drawableContainerState.getChild(i7);
        }

        /* renamed from: c */
        public static Drawable m5362c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m5363d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m5364e(Drawable drawable, boolean z6) {
            drawable.setAutoMirrored(z6);
        }
    }

    /* renamed from: y.a$b */
    public static class b {
        /* renamed from: a */
        public static void m5365a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m5366b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m5367c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m5368d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m5369e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        /* renamed from: f */
        public static void m5370f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        /* renamed from: g */
        public static void m5371g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        /* renamed from: h */
        public static void m5372h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m5373i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: y.a$c */
    public static class c {
        /* renamed from: a */
        public static int m5374a(Drawable drawable) {
            int layoutDirection;
            layoutDirection = drawable.getLayoutDirection();
            return layoutDirection;
        }

        /* renamed from: b */
        public static boolean m5375b(Drawable drawable, int i7) {
            boolean layoutDirection;
            layoutDirection = drawable.setLayoutDirection(i7);
            return layoutDirection;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m5353a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable mo5377b;
        int i7 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i7 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            mo5377b = a.m5362c((InsetDrawable) drawable);
        } else {
            if (!(drawable instanceof InterfaceC2215c)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    Drawable m5361b = a.m5361b(drawableContainerState, i8);
                    if (m5361b != null) {
                        m5353a(m5361b);
                    }
                }
                return;
            }
            mo5377b = ((InterfaceC2215c) drawable).mo5377b();
        }
        m5353a(mo5377b);
    }

    /* renamed from: b */
    public static int m5354b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m5374a(drawable);
        }
        if (!f10036d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f10035c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e7);
            }
            f10036d = true;
        }
        Method method = f10035c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e8) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e8);
                f10035c = null;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m5355c(Drawable drawable, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m5375b(drawable, i7);
        }
        if (!f10034b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f10033a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e7);
            }
            f10034b = true;
        }
        Method method = f10033a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i7));
                return true;
            } catch (Exception e8) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e8);
                f10033a = null;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m5356d(Drawable drawable, int i7) {
        b.m5371g(drawable, i7);
    }

    /* renamed from: e */
    public static void m5357e(Drawable drawable, ColorStateList colorStateList) {
        b.m5372h(drawable, colorStateList);
    }

    /* renamed from: f */
    public static void m5358f(Drawable drawable, PorterDuff.Mode mode) {
        b.m5373i(drawable, mode);
    }

    /* renamed from: g */
    public static Drawable m5359g(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC2214b)) ? new C2217e(drawable) : drawable;
    }
}
