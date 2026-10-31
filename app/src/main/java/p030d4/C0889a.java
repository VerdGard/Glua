package p030d4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p038e4.C1138a;
import p163u3.C1971b;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C0889a extends AppCompatTextView {
    public C0889a(Context context, AttributeSet attributeSet) {
        super(C1138a.m3322a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (C1971b.m4583b(R$attr.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = R$styleable.f3746t;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int m2594m = m2594m(context2, obtainStyledAttributes, R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (m2594m != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m2595l(resourceId, theme);
            }
        }
    }

    /* renamed from: m */
    public static int m2594m(Context context, TypedArray typedArray, int... iArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < iArr.length && i7 < 0; i8++) {
            int i9 = iArr[i8];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i9, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i7 = dimensionPixelSize;
            } else {
                i7 = typedArray.getDimensionPixelSize(i9, -1);
            }
        }
        return i7;
    }

    /* renamed from: l */
    public final void m2595l(int i7, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i7, R$styleable.f3745s);
        int m2594m = m2594m(getContext(), obtainStyledAttributes, R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m2594m >= 0) {
            setLineHeight(m2594m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (C1971b.m4583b(R$attr.textAppearanceLineHeightEnabled, context, true)) {
            m2595l(i7, context.getTheme());
        }
    }
}
