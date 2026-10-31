package p143s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;
import p120p.C1686g;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C1861a {

    /* renamed from: a */
    public final int f8362a;

    /* renamed from: b */
    public int f8363b;

    /* renamed from: c */
    public float f8364c;

    /* renamed from: d */
    public String f8365d;

    /* renamed from: e */
    public boolean f8366e;

    /* renamed from: f */
    public int f8367f;

    public C1861a(String str, int i7, Object obj) {
        this.f8362a = i7;
        m4393b(obj);
    }

    public C1861a(C1861a c1861a, Object obj) {
        c1861a.getClass();
        this.f8362a = c1861a.f8362a;
        m4393b(obj);
    }

    /* renamed from: a */
    public static void m4392a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int integer;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.f1266d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i7 = 0;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = 1;
            if (index == R$styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R$styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                if (index == R$styleable.CustomAttribute_customColorValue) {
                    i9 = 3;
                } else if (index == R$styleable.CustomAttribute_customColorDrawableValue) {
                    i9 = 4;
                } else {
                    if (index == R$styleable.CustomAttribute_customPixelDimension) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == R$styleable.CustomAttribute_customDimension) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == R$styleable.CustomAttribute_customFloatValue) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i7 = 2;
                    } else if (index == R$styleable.CustomAttribute_customIntegerValue) {
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        obj = Integer.valueOf(integer);
                        i7 = i9;
                    } else if (index == R$styleable.CustomAttribute_customStringValue) {
                        obj = obtainStyledAttributes.getString(index);
                        i7 = 5;
                    }
                    obj = Float.valueOf(dimension);
                    i7 = 7;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(integer);
                i7 = i9;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C1861a(str, i7, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m4393b(Object obj) {
        switch (C1686g.m4108c(this.f8362a)) {
            case 0:
                this.f8363b = ((Integer) obj).intValue();
                break;
            case 1:
            case 6:
                this.f8364c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f8367f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f8365d = (String) obj;
                break;
            case 5:
                this.f8366e = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
