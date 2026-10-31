package p066i0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: i0.d */
/* loaded from: classes.dex */
public final class C1310d {
    /* renamed from: a */
    public static ColorStateList m3639a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m3640b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* renamed from: c */
    public static void m3641c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m3642d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
