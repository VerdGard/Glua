package p131q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0091c;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;

/* renamed from: q3.r */
/* loaded from: classes.dex */
public final class C1762r {

    /* renamed from: a */
    public static final int[] f8119a = {R$attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f8120b = {R$attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m4232a(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3725F, i7, i8);
        boolean z6 = obtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R$attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m4234c(context, f8120b, "Theme.MaterialComponents");
            }
        }
        m4234c(context, f8119a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r0.getResourceId(com.google.android.material.R$styleable.ThemeEnforcement_android_textAppearance, -1) != (-1)) goto L18;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4233b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = com.google.android.material.R$styleable.f3725F
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            int r1 = com.google.android.material.R$styleable.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L13
            r0.recycle()
            return
        L13:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L20
            int r4 = com.google.android.material.R$styleable.ThemeEnforcement_android_textAppearance
            int r4 = r0.getResourceId(r4, r3)
            if (r4 == r3) goto L3b
            goto L3a
        L20:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L37
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L34
            r4.recycle()
            goto L3b
        L34:
            int r6 = r6 + 1
            goto L26
        L37:
            r4.recycle()
        L3a:
            r2 = 1
        L3b:
            r0.recycle()
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p131q3.C1762r.m4233b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m4234c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z6 = true;
                break;
            } else {
                if (!obtainStyledAttributes.hasValue(i7)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i7++;
            }
        }
        if (!z6) {
            throw new IllegalArgumentException(C0091c.m228f("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m4235d(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        m4232a(context, attributeSet, i7, i8);
        m4233b(context, attributeSet, iArr, i7, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
    }
}
