package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R$styleable;
import p166v.C2009a;
import p181x.C2152a;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: classes.dex */
public final class C0218c1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f848a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f849b = {-16842910};

    /* renamed from: c */
    public static final int[] f850c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f851d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f852e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f853f = new int[0];

    /* renamed from: g */
    public static final int[] f854g = new int[1];

    /* renamed from: a */
    public static void m702a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R$styleable.f282j);
        try {
            if (!obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m703b(int i7, Context context) {
        ColorStateList m705d = m705d(i7, context);
        if (m705d != null && m705d.isStateful()) {
            return m705d.getColorForState(f849b, m705d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f848a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f7 = typedValue.getFloat();
        return C2152a.m5266e(m704c(i7, context), Math.round(Color.alpha(r4) * f7));
    }

    /* renamed from: c */
    public static int m704c(int i7, Context context) {
        int[] iArr = f854g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m705d(int i7, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f854g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C2009a.m4896c(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
