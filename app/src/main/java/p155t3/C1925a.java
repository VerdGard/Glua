package p155t3;

import android.content.res.ColorStateList;
import androidx.activity.C0143v;
import androidx.appcompat.widget.C0265t;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import p066i0.C1308b;

/* renamed from: t3.a */
/* loaded from: classes.dex */
public final class C1925a extends C0265t {

    /* renamed from: y1 */
    public static final int f8690y1 = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: z1 */
    public static final int[][] f8691z1 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: w1 */
    public ColorStateList f8692w1;

    /* renamed from: x1 */
    public boolean f8693x1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1925a(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R$attr.radioButtonStyle
            int r4 = p155t3.C1925a.f8690y1
            android.content.Context r8 = p038e4.C1138a.m3322a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.f3743q
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = p131q3.C1762r.m4235d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R$styleable.MaterialRadioButton_buttonTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L29
            android.content.res.ColorStateList r8 = p163u3.C1972c.m4585a(r8, r9, r0)
            p066i0.C1308b.a.m3630c(r7, r8)
        L29:
            int r8 = com.google.android.material.R$styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f8693x1 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155t3.C1925a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8692w1 == null) {
            int m400B = C0143v.m400B(this, R$attr.colorControlActivated);
            int m400B2 = C0143v.m400B(this, R$attr.colorOnSurface);
            int m400B3 = C0143v.m400B(this, R$attr.colorSurface);
            this.f8692w1 = new ColorStateList(f8691z1, new int[]{C0143v.m417O(1.0f, m400B3, m400B), C0143v.m417O(0.54f, m400B3, m400B2), C0143v.m417O(0.38f, m400B3, m400B2), C0143v.m417O(0.38f, m400B3, m400B2)});
        }
        return this.f8692w1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8693x1 && C1308b.a.m3628a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f8693x1 = z6;
        C1308b.a.m3630c(this, z6 ? getMaterialThemeColorsTintList() : null);
    }
}
