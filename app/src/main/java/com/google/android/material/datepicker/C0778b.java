package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p036e2.C1109v5;
import p163u3.C1972c;
import p193y3.C2232a;
import p193y3.C2237f;
import p193y3.C2240i;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0778b {

    /* renamed from: a */
    public final Rect f4119a;

    /* renamed from: b */
    public final ColorStateList f4120b;

    /* renamed from: c */
    public final ColorStateList f4121c;

    /* renamed from: d */
    public final ColorStateList f4122d;

    /* renamed from: e */
    public final int f4123e;

    /* renamed from: f */
    public final C2240i f4124f;

    public C0778b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i7, C2240i c2240i, Rect rect) {
        C1109v5.m3252p(rect.left);
        C1109v5.m3252p(rect.top);
        C1109v5.m3252p(rect.right);
        C1109v5.m3252p(rect.bottom);
        this.f4119a = rect;
        this.f4120b = colorStateList2;
        this.f4121c = colorStateList;
        this.f4122d = colorStateList3;
        this.f4123e = i7;
        this.f4124f = c2240i;
    }

    /* renamed from: a */
    public static C0778b m2410a(int i7, Context context) {
        C1109v5.m3251o("Cannot create a CalendarItemStyle with a styleResId of 0", i7 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, R$styleable.f3741o);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m4585a = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList m4585a2 = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList m4585a3 = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        C2240i c2240i = new C2240i(C2240i.m5432a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C2232a(0)));
        obtainStyledAttributes.recycle();
        return new C0778b(m4585a, m4585a2, m4585a3, dimensionPixelSize, c2240i, rect);
    }

    /* renamed from: b */
    public final void m2411b(TextView textView) {
        C2237f c2237f = new C2237f();
        C2237f c2237f2 = new C2237f();
        C2240i c2240i = this.f4124f;
        c2237f.setShapeAppearanceModel(c2240i);
        c2237f2.setShapeAppearanceModel(c2240i);
        c2237f.m5428k(this.f4121c);
        c2237f.f10154c.f10173k = this.f4123e;
        c2237f.invalidateSelf();
        C2237f.b bVar = c2237f.f10154c;
        ColorStateList colorStateList = bVar.f10166d;
        ColorStateList colorStateList2 = this.f4122d;
        if (colorStateList != colorStateList2) {
            bVar.f10166d = colorStateList2;
            c2237f.onStateChange(c2237f.getState());
        }
        ColorStateList colorStateList3 = this.f4120b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), c2237f, c2237f2);
        Rect rect = this.f4119a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2841q(textView, insetDrawable);
    }
}
