package p066i0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C1313g {

    /* renamed from: a */
    public static Method f6506a;

    /* renamed from: b */
    public static boolean f6507b;

    /* renamed from: c */
    public static Field f6508c;

    /* renamed from: d */
    public static boolean f6509d;

    /* renamed from: i0.g$a */
    public static class a {
        /* renamed from: a */
        public static void m3647a(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
            popupWindow.showAsDropDown(view, i7, i8, i9);
        }
    }

    /* renamed from: i0.g$b */
    public static class b {
        /* renamed from: a */
        public static boolean m3648a(PopupWindow popupWindow) {
            boolean overlapAnchor;
            overlapAnchor = popupWindow.getOverlapAnchor();
            return overlapAnchor;
        }

        /* renamed from: b */
        public static int m3649b(PopupWindow popupWindow) {
            int windowLayoutType;
            windowLayoutType = popupWindow.getWindowLayoutType();
            return windowLayoutType;
        }

        /* renamed from: c */
        public static void m3650c(PopupWindow popupWindow, boolean z6) {
            popupWindow.setOverlapAnchor(z6);
        }

        /* renamed from: d */
        public static void m3651d(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    /* renamed from: a */
    public static void m3645a(PopupWindow popupWindow, boolean z6) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m3650c(popupWindow, z6);
            return;
        }
        if (!f6509d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f6508c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e7);
            }
            f6509d = true;
        }
        Field field = f6508c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z6));
            } catch (IllegalAccessException e8) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e8);
            }
        }
    }

    /* renamed from: b */
    public static void m3646b(PopupWindow popupWindow, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m3651d(popupWindow, i7);
            return;
        }
        if (!f6507b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f6506a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f6507b = true;
        }
        Method method = f6506a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i7));
            } catch (Exception unused2) {
            }
        }
    }
}
