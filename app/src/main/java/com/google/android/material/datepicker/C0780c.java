package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p163u3.C1971b;
import p163u3.C1972c;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0780c {

    /* renamed from: a */
    public final C0778b f4125a;

    /* renamed from: b */
    public final C0778b f4126b;

    /* renamed from: c */
    public final C0778b f4127c;

    /* renamed from: d */
    public final C0778b f4128d;

    /* renamed from: e */
    public final C0778b f4129e;

    /* renamed from: f */
    public final C0778b f4130f;

    /* renamed from: g */
    public final C0778b f4131g;

    /* renamed from: h */
    public final Paint f4132h;

    public C0780c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1971b.m4584c(R$attr.materialCalendarStyle, context, C0791i.class.getCanonicalName()).data, R$styleable.f3740n);
        this.f4125a = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0), context);
        this.f4131g = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0), context);
        this.f4126b = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0), context);
        this.f4127c = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList m4585a = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
        this.f4128d = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0), context);
        this.f4129e = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f4130f = C0778b.m2410a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.f4132h = paint;
        paint.setColor(m4585a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
