package p021c4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p131q3.C1767w;
import p170v3.C2016b;
import p189y.C2213a;

/* renamed from: c4.q */
/* loaded from: classes.dex */
public final class C0629q {
    /* renamed from: a */
    public static void m2077a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C2213a.m5359g(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C2213a.b.m5372h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                C2213a.b.m5372h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C2213a.b.m5373i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static ImageView.ScaleType m2078b(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: c */
    public static void m2079c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = C2213a.m5359g(drawable).mutate();
        C2213a.b.m5372h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: d */
    public static void m2080d(CheckableImageButton checkableImageButton) {
        Drawable m4913b;
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int m4238a = (int) C1767w.m4238a(4, checkableImageButton.getContext());
            int[] iArr = C2016b.f9168a;
            m4913b = C2016b.a.m4913b(context, m4238a);
            checkableImageButton.setBackground(m4913b);
        }
    }

    /* renamed from: e */
    public static void m2081e(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean m2824a = C0946x.c.m2824a(checkableImageButton);
        boolean z6 = onLongClickListener != null;
        boolean z7 = m2824a || z6;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(m2824a);
        checkableImageButton.setPressable(m2824a);
        checkableImageButton.setLongClickable(z6);
        C0946x.d.m2843s(checkableImageButton, z7 ? 1 : 2);
    }
}
