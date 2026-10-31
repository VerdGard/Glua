package p038e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import p049g.C1185c;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public final class C1138a {

    /* renamed from: a */
    public static final int[] f5672a = {R.attr.theme, R$attr.theme};

    /* renamed from: b */
    public static final int[] f5673b = {R$attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m3322a(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5673b, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z6 = (context instanceof C1185c) && ((C1185c) context).f5785a == resourceId;
        if (resourceId == 0 || z6) {
            return context;
        }
        C1185c c1185c = new C1185c(resourceId, context);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5672a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1185c.getTheme().applyStyle(resourceId2, true);
        }
        return c1185c;
    }
}
