package p163u3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.activity.result.AbstractC0136c;
import com.google.android.material.R$styleable;
import p173w.C2044f;

/* renamed from: u3.d */
/* loaded from: classes.dex */
public final class C1973d {

    /* renamed from: a */
    public final ColorStateList f8828a;

    /* renamed from: b */
    public final String f8829b;

    /* renamed from: c */
    public final int f8830c;

    /* renamed from: d */
    public final int f8831d;

    /* renamed from: e */
    public final float f8832e;

    /* renamed from: f */
    public final float f8833f;

    /* renamed from: g */
    public final float f8834g;

    /* renamed from: h */
    public final boolean f8835h;

    /* renamed from: i */
    public final float f8836i;

    /* renamed from: j */
    public ColorStateList f8837j;

    /* renamed from: k */
    public float f8838k;

    /* renamed from: l */
    public final int f8839l;

    /* renamed from: m */
    public boolean f8840m = false;

    /* renamed from: n */
    public Typeface f8841n;

    /* renamed from: u3.d$a */
    public class a extends C2044f.e {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0136c f8842a;

        public a(AbstractC0136c abstractC0136c) {
            this.f8842a = abstractC0136c;
        }

        @Override // p173w.C2044f.e
        /* renamed from: c */
        public final void mo720c(int i7) {
            C1973d.this.f8840m = true;
            this.f8842a.mo392u(i7);
        }

        @Override // p173w.C2044f.e
        /* renamed from: d */
        public final void mo721d(Typeface typeface) {
            C1973d c1973d = C1973d.this;
            c1973d.f8841n = Typeface.create(typeface, c1973d.f8830c);
            c1973d.f8840m = true;
            this.f8842a.mo393v(c1973d.f8841n, false);
        }
    }

    public C1973d(int i7, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, R$styleable.f3722C);
        this.f8838k = obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
        this.f8837j = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        C1972c.m4585a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        C1972c.m4585a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.f8830c = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.f8831d = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int i8 = R$styleable.TextAppearance_fontFamily;
        i8 = obtainStyledAttributes.hasValue(i8) ? i8 : R$styleable.TextAppearance_android_fontFamily;
        this.f8839l = obtainStyledAttributes.getResourceId(i8, 0);
        this.f8829b = obtainStyledAttributes.getString(i8);
        obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.f8828a = C1972c.m4585a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.f8832e = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f8833f = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f8834g = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i7, R$styleable.f3745s);
        int i9 = R$styleable.MaterialTextAppearance_android_letterSpacing;
        this.f8835h = obtainStyledAttributes2.hasValue(i9);
        this.f8836i = obtainStyledAttributes2.getFloat(i9, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m4589a() {
        String str;
        Typeface typeface = this.f8841n;
        int i7 = this.f8830c;
        if (typeface == null && (str = this.f8829b) != null) {
            this.f8841n = Typeface.create(str, i7);
        }
        if (this.f8841n == null) {
            int i8 = this.f8831d;
            this.f8841n = i8 != 1 ? i8 != 2 ? i8 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f8841n = Typeface.create(this.f8841n, i7);
        }
    }

    /* renamed from: b */
    public final Typeface m4590b(Context context) {
        if (this.f8840m) {
            return this.f8841n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m5065b = C2044f.m5065b(this.f8839l, context);
                this.f8841n = m5065b;
                if (m5065b != null) {
                    this.f8841n = Typeface.create(m5065b, this.f8830c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f8829b, e7);
            }
        }
        m4589a();
        this.f8840m = true;
        return this.f8841n;
    }

    /* renamed from: c */
    public final void m4591c(Context context, AbstractC0136c abstractC0136c) {
        if (m4592d(context)) {
            m4590b(context);
        } else {
            m4589a();
        }
        int i7 = this.f8839l;
        if (i7 == 0) {
            this.f8840m = true;
        }
        if (this.f8840m) {
            abstractC0136c.mo393v(this.f8841n, true);
            return;
        }
        try {
            a aVar = new a(abstractC0136c);
            ThreadLocal<TypedValue> threadLocal = C2044f.f9325a;
            if (context.isRestricted()) {
                aVar.m5071a(-4);
            } else {
                C2044f.m5066c(context, i7, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8840m = true;
            abstractC0136c.mo392u(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f8829b, e7);
            this.f8840m = true;
            abstractC0136c.mo392u(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[ORIG_RETURN, RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4592d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f8839l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = p173w.C2044f.f9325a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = p173w.C2044f.m5066c(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p163u3.C1973d.m4592d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public final void m4593e(Context context, TextPaint textPaint, AbstractC0136c abstractC0136c) {
        m4594f(context, textPaint, abstractC0136c);
        ColorStateList colorStateList = this.f8837j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f8828a;
        textPaint.setShadowLayer(this.f8834g, this.f8832e, this.f8833f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m4594f(Context context, TextPaint textPaint, AbstractC0136c abstractC0136c) {
        if (m4592d(context)) {
            m4595g(context, textPaint, m4590b(context));
            return;
        }
        m4589a();
        m4595g(context, textPaint, this.f8841n);
        m4591c(context, new C1974e(this, context, textPaint, abstractC0136c));
    }

    /* renamed from: g */
    public final void m4595g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface m4596a = C1975f.m4596a(context.getResources().getConfiguration(), typeface);
        if (m4596a != null) {
            typeface = m4596a;
        }
        textPaint.setTypeface(typeface);
        int i7 = (~typeface.getStyle()) & this.f8830c;
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8838k);
        if (this.f8835h) {
            textPaint.setLetterSpacing(this.f8836i);
        }
    }
}
