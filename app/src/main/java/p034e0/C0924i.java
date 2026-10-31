package p034e0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: e0.i */
/* loaded from: classes.dex */
public final class C0924i {
    /* renamed from: a */
    public static int m2709a(MenuItem menuItem) {
        int alphabeticModifiers;
        alphabeticModifiers = menuItem.getAlphabeticModifiers();
        return alphabeticModifiers;
    }

    /* renamed from: b */
    public static CharSequence m2710b(MenuItem menuItem) {
        CharSequence contentDescription;
        contentDescription = menuItem.getContentDescription();
        return contentDescription;
    }

    /* renamed from: c */
    public static ColorStateList m2711c(MenuItem menuItem) {
        ColorStateList iconTintList;
        iconTintList = menuItem.getIconTintList();
        return iconTintList;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m2712d(MenuItem menuItem) {
        PorterDuff.Mode iconTintMode;
        iconTintMode = menuItem.getIconTintMode();
        return iconTintMode;
    }

    /* renamed from: e */
    public static int m2713e(MenuItem menuItem) {
        int numericModifiers;
        numericModifiers = menuItem.getNumericModifiers();
        return numericModifiers;
    }

    /* renamed from: f */
    public static CharSequence m2714f(MenuItem menuItem) {
        CharSequence tooltipText;
        tooltipText = menuItem.getTooltipText();
        return tooltipText;
    }

    /* renamed from: g */
    public static MenuItem m2715g(MenuItem menuItem, char c7, int i7) {
        MenuItem alphabeticShortcut;
        alphabeticShortcut = menuItem.setAlphabeticShortcut(c7, i7);
        return alphabeticShortcut;
    }

    /* renamed from: h */
    public static MenuItem m2716h(MenuItem menuItem, CharSequence charSequence) {
        MenuItem contentDescription;
        contentDescription = menuItem.setContentDescription(charSequence);
        return contentDescription;
    }

    /* renamed from: i */
    public static MenuItem m2717i(MenuItem menuItem, ColorStateList colorStateList) {
        MenuItem iconTintList;
        iconTintList = menuItem.setIconTintList(colorStateList);
        return iconTintList;
    }

    /* renamed from: j */
    public static MenuItem m2718j(MenuItem menuItem, PorterDuff.Mode mode) {
        MenuItem iconTintMode;
        iconTintMode = menuItem.setIconTintMode(mode);
        return iconTintMode;
    }

    /* renamed from: k */
    public static MenuItem m2719k(MenuItem menuItem, char c7, int i7) {
        MenuItem numericShortcut;
        numericShortcut = menuItem.setNumericShortcut(c7, i7);
        return numericShortcut;
    }

    /* renamed from: l */
    public static MenuItem m2720l(MenuItem menuItem, char c7, char c8, int i7, int i8) {
        MenuItem shortcut;
        shortcut = menuItem.setShortcut(c7, c8, i7, i8);
        return shortcut;
    }

    /* renamed from: m */
    public static MenuItem m2721m(MenuItem menuItem, CharSequence charSequence) {
        MenuItem tooltipText;
        tooltipText = menuItem.setTooltipText(charSequence);
        return tooltipText;
    }
}
