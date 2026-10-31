package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0220d0;
import p025d.C0872a;
import p166v.C2009a;
import p173w.C2044f;

/* renamed from: androidx.appcompat.widget.h1 */
/* loaded from: classes.dex */
public final class C0233h1 {

    /* renamed from: a */
    public final Context f914a;

    /* renamed from: b */
    public final TypedArray f915b;

    /* renamed from: c */
    public TypedValue f916c;

    public C0233h1(Context context, TypedArray typedArray) {
        this.f914a = context;
        this.f915b = typedArray;
    }

    /* renamed from: m */
    public static C0233h1 m790m(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new C0233h1(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    /* renamed from: a */
    public final boolean m791a(int i7, boolean z6) {
        return this.f915b.getBoolean(i7, z6);
    }

    /* renamed from: b */
    public final ColorStateList m792b(int i7) {
        int resourceId;
        ColorStateList m4896c;
        TypedArray typedArray = this.f915b;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (m4896c = C2009a.m4896c(resourceId, this.f914a)) == null) ? typedArray.getColorStateList(i7) : m4896c;
    }

    /* renamed from: c */
    public final int m793c(int i7, int i8) {
        return this.f915b.getDimensionPixelOffset(i7, i8);
    }

    /* renamed from: d */
    public final int m794d(int i7, int i8) {
        return this.f915b.getDimensionPixelSize(i7, i8);
    }

    /* renamed from: e */
    public final Drawable m795e(int i7) {
        int resourceId;
        TypedArray typedArray = this.f915b;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : C0872a.m2561a(this.f914a, resourceId);
    }

    /* renamed from: f */
    public final Drawable m796f(int i7) {
        int resourceId;
        Drawable m903f;
        if (!this.f915b.hasValue(i7) || (resourceId = this.f915b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        C0240k m807a = C0240k.m807a();
        Context context = this.f914a;
        synchronized (m807a) {
            m903f = m807a.f939a.m903f(resourceId, context, true);
        }
        return m903f;
    }

    /* renamed from: g */
    public final Typeface m797g(int i7, int i8, C0220d0.a aVar) {
        int resourceId = this.f915b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f916c == null) {
            this.f916c = new TypedValue();
        }
        TypedValue typedValue = this.f916c;
        ThreadLocal<TypedValue> threadLocal = C2044f.f9325a;
        Context context = this.f914a;
        if (context.isRestricted()) {
            return null;
        }
        return C2044f.m5066c(context, resourceId, typedValue, i8, aVar, true, false);
    }

    /* renamed from: h */
    public final int m798h(int i7, int i8) {
        return this.f915b.getInt(i7, i8);
    }

    /* renamed from: i */
    public final int m799i(int i7, int i8) {
        return this.f915b.getResourceId(i7, i8);
    }

    /* renamed from: j */
    public final String m800j(int i7) {
        return this.f915b.getString(i7);
    }

    /* renamed from: k */
    public final CharSequence m801k(int i7) {
        return this.f915b.getText(i7);
    }

    /* renamed from: l */
    public final boolean m802l(int i7) {
        return this.f915b.hasValue(i7);
    }

    /* renamed from: n */
    public final void m803n() {
        this.f915b.recycle();
    }
}
