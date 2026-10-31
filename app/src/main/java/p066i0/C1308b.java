package p066i0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C1308b {

    /* renamed from: a */
    public static Field f6503a;

    /* renamed from: b */
    public static boolean f6504b;

    /* renamed from: i0.b$a */
    public static class a {
        /* renamed from: a */
        public static ColorStateList m3628a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m3629b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m3630c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m3631d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: i0.b$b */
    public static class b {
        /* renamed from: a */
        public static Drawable m3632a(CompoundButton compoundButton) {
            Drawable buttonDrawable;
            buttonDrawable = compoundButton.getButtonDrawable();
            return buttonDrawable;
        }
    }

    /* renamed from: a */
    public static Drawable m3627a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m3632a(compoundButton);
        }
        if (!f6504b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f6503a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e7);
            }
            f6504b = true;
        }
        Field field = f6503a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e8) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e8);
                f6503a = null;
            }
        }
        return null;
    }
}
