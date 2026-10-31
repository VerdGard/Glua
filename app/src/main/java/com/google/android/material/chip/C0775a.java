package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p004a3.C0040g;
import p131q3.C1760p;
import p131q3.C1767w;
import p163u3.C1973d;
import p170v3.C2016b;
import p189y.C2213a;
import p189y.InterfaceC2215c;
import p193y3.C2237f;
import p193y3.C2240i;
import p193y3.C2241j;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public final class C0775a extends C2237f implements Drawable.Callback, C1760p.b {

    /* renamed from: V2 */
    public static final int[] f4039V2 = {R.attr.state_enabled};

    /* renamed from: W2 */
    public static final ShapeDrawable f4040W2 = new ShapeDrawable(new OvalShape());

    /* renamed from: A2 */
    public int f4041A2;

    /* renamed from: B2 */
    public int f4042B2;

    /* renamed from: C2 */
    public int f4043C2;

    /* renamed from: D2 */
    public int f4044D2;

    /* renamed from: E2 */
    public int f4045E2;

    /* renamed from: F2 */
    public int f4046F2;

    /* renamed from: G2 */
    public boolean f4047G2;

    /* renamed from: H2 */
    public int f4048H2;

    /* renamed from: I2 */
    public int f4049I2;

    /* renamed from: J2 */
    public ColorFilter f4050J2;

    /* renamed from: K2 */
    public PorterDuffColorFilter f4051K2;

    /* renamed from: L2 */
    public ColorStateList f4052L2;

    /* renamed from: M1 */
    public ColorStateList f4053M1;

    /* renamed from: M2 */
    public PorterDuff.Mode f4054M2;

    /* renamed from: N1 */
    public ColorStateList f4055N1;

    /* renamed from: N2 */
    public int[] f4056N2;

    /* renamed from: O1 */
    public float f4057O1;

    /* renamed from: O2 */
    public boolean f4058O2;

    /* renamed from: P1 */
    public float f4059P1;

    /* renamed from: P2 */
    public ColorStateList f4060P2;

    /* renamed from: Q1 */
    public ColorStateList f4061Q1;

    /* renamed from: Q2 */
    public WeakReference<a> f4062Q2;

    /* renamed from: R1 */
    public float f4063R1;

    /* renamed from: R2 */
    public TextUtils.TruncateAt f4064R2;

    /* renamed from: S1 */
    public ColorStateList f4065S1;

    /* renamed from: S2 */
    public boolean f4066S2;

    /* renamed from: T1 */
    public CharSequence f4067T1;

    /* renamed from: T2 */
    public int f4068T2;

    /* renamed from: U1 */
    public boolean f4069U1;

    /* renamed from: U2 */
    public boolean f4070U2;

    /* renamed from: V1 */
    public Drawable f4071V1;

    /* renamed from: W1 */
    public ColorStateList f4072W1;

    /* renamed from: X1 */
    public float f4073X1;

    /* renamed from: Y1 */
    public boolean f4074Y1;

    /* renamed from: Z1 */
    public boolean f4075Z1;

    /* renamed from: a2 */
    public Drawable f4076a2;

    /* renamed from: b2 */
    public RippleDrawable f4077b2;

    /* renamed from: c2 */
    public ColorStateList f4078c2;

    /* renamed from: d2 */
    public float f4079d2;

    /* renamed from: e2 */
    public SpannableStringBuilder f4080e2;

    /* renamed from: f2 */
    public boolean f4081f2;

    /* renamed from: g2 */
    public boolean f4082g2;

    /* renamed from: h2 */
    public Drawable f4083h2;

    /* renamed from: i2 */
    public ColorStateList f4084i2;

    /* renamed from: j2 */
    public C0040g f4085j2;

    /* renamed from: k2 */
    public C0040g f4086k2;

    /* renamed from: l2 */
    public float f4087l2;

    /* renamed from: m2 */
    public float f4088m2;

    /* renamed from: n2 */
    public float f4089n2;

    /* renamed from: o2 */
    public float f4090o2;

    /* renamed from: p2 */
    public float f4091p2;

    /* renamed from: q2 */
    public float f4092q2;

    /* renamed from: r2 */
    public float f4093r2;

    /* renamed from: s2 */
    public float f4094s2;

    /* renamed from: t2 */
    public final Context f4095t2;

    /* renamed from: u2 */
    public final Paint f4096u2;

    /* renamed from: v2 */
    public final Paint.FontMetrics f4097v2;

    /* renamed from: w2 */
    public final RectF f4098w2;

    /* renamed from: x2 */
    public final PointF f4099x2;

    /* renamed from: y2 */
    public final Path f4100y2;

    /* renamed from: z2 */
    public final C1760p f4101z2;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* renamed from: a */
        void mo2362a();
    }

    public C0775a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, Chip.f4015O1);
        this.f4059P1 = -1.0f;
        this.f4096u2 = new Paint(1);
        this.f4097v2 = new Paint.FontMetrics();
        this.f4098w2 = new RectF();
        this.f4099x2 = new PointF();
        this.f4100y2 = new Path();
        this.f4049I2 = 255;
        this.f4054M2 = PorterDuff.Mode.SRC_IN;
        this.f4062Q2 = new WeakReference<>(null);
        m5426i(context);
        this.f4095t2 = context;
        C1760p c1760p = new C1760p(this);
        this.f4101z2 = c1760p;
        this.f4067T1 = "";
        c1760p.f8112a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4039V2;
        setState(iArr);
        if (!Arrays.equals(this.f4056N2, iArr)) {
            this.f4056N2 = iArr;
            if (m2394U()) {
                m2402w(getState(), iArr);
            }
        }
        this.f4066S2 = true;
        int[] iArr2 = C2016b.f9168a;
        f4040W2.setTint(-1);
    }

    /* renamed from: V */
    public static void m2371V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: t */
    public static boolean m2372t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: u */
    public static boolean m2373u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m2374A(boolean z6) {
        if (this.f4082g2 != z6) {
            boolean m2392S = m2392S();
            this.f4082g2 = z6;
            boolean m2392S2 = m2392S();
            if (m2392S != m2392S2) {
                if (m2392S2) {
                    m2396o(this.f4083h2);
                } else {
                    m2371V(this.f4083h2);
                }
                invalidateSelf();
                m2401v();
            }
        }
    }

    @Deprecated
    /* renamed from: B */
    public final void m2375B(float f7) {
        if (this.f4059P1 != f7) {
            this.f4059P1 = f7;
            C2240i c2240i = this.f10154c.f10163a;
            c2240i.getClass();
            C2240i.a aVar = new C2240i.a(c2240i);
            aVar.m5440e(f7);
            aVar.m5441f(f7);
            aVar.m5439d(f7);
            aVar.m5438c(f7);
            setShapeAppearanceModel(new C2240i(aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final void m2376C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4071V1;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof InterfaceC2215c;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = ((InterfaceC2215c) drawable3).mo5377b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m2398q = m2398q();
            this.f4071V1 = drawable != null ? C2213a.m5359g(drawable).mutate() : null;
            float m2398q2 = m2398q();
            m2371V(drawable2);
            if (m2393T()) {
                m2396o(this.f4071V1);
            }
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: D */
    public final void m2377D(float f7) {
        if (this.f4073X1 != f7) {
            float m2398q = m2398q();
            this.f4073X1 = f7;
            float m2398q2 = m2398q();
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: E */
    public final void m2378E(ColorStateList colorStateList) {
        this.f4074Y1 = true;
        if (this.f4072W1 != colorStateList) {
            this.f4072W1 = colorStateList;
            if (m2393T()) {
                C2213a.b.m5372h(this.f4071V1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F */
    public final void m2379F(boolean z6) {
        if (this.f4069U1 != z6) {
            boolean m2393T = m2393T();
            this.f4069U1 = z6;
            boolean m2393T2 = m2393T();
            if (m2393T != m2393T2) {
                if (m2393T2) {
                    m2396o(this.f4071V1);
                } else {
                    m2371V(this.f4071V1);
                }
                invalidateSelf();
                m2401v();
            }
        }
    }

    /* renamed from: G */
    public final void m2380G(ColorStateList colorStateList) {
        if (this.f4061Q1 != colorStateList) {
            this.f4061Q1 = colorStateList;
            if (this.f4070U2) {
                C2237f.b bVar = this.f10154c;
                if (bVar.f10166d != colorStateList) {
                    bVar.f10166d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H */
    public final void m2381H(float f7) {
        if (this.f4063R1 != f7) {
            this.f4063R1 = f7;
            this.f4096u2.setStrokeWidth(f7);
            if (this.f4070U2) {
                this.f10154c.f10173k = f7;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final void m2382I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4076a2;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof InterfaceC2215c;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = ((InterfaceC2215c) drawable3).mo5377b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m2399r = m2399r();
            this.f4076a2 = drawable != null ? C2213a.m5359g(drawable).mutate() : null;
            int[] iArr = C2016b.f9168a;
            this.f4077b2 = new RippleDrawable(C2016b.m4910a(this.f4065S1), this.f4076a2, f4040W2);
            float m2399r2 = m2399r();
            m2371V(drawable2);
            if (m2394U()) {
                m2396o(this.f4076a2);
            }
            invalidateSelf();
            if (m2399r != m2399r2) {
                m2401v();
            }
        }
    }

    /* renamed from: J */
    public final void m2383J(float f7) {
        if (this.f4093r2 != f7) {
            this.f4093r2 = f7;
            invalidateSelf();
            if (m2394U()) {
                m2401v();
            }
        }
    }

    /* renamed from: K */
    public final void m2384K(float f7) {
        if (this.f4079d2 != f7) {
            this.f4079d2 = f7;
            invalidateSelf();
            if (m2394U()) {
                m2401v();
            }
        }
    }

    /* renamed from: L */
    public final void m2385L(float f7) {
        if (this.f4092q2 != f7) {
            this.f4092q2 = f7;
            invalidateSelf();
            if (m2394U()) {
                m2401v();
            }
        }
    }

    /* renamed from: M */
    public final void m2386M(ColorStateList colorStateList) {
        if (this.f4078c2 != colorStateList) {
            this.f4078c2 = colorStateList;
            if (m2394U()) {
                C2213a.b.m5372h(this.f4076a2, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public final void m2387N(boolean z6) {
        if (this.f4075Z1 != z6) {
            boolean m2394U = m2394U();
            this.f4075Z1 = z6;
            boolean m2394U2 = m2394U();
            if (m2394U != m2394U2) {
                if (m2394U2) {
                    m2396o(this.f4076a2);
                } else {
                    m2371V(this.f4076a2);
                }
                invalidateSelf();
                m2401v();
            }
        }
    }

    /* renamed from: O */
    public final void m2388O(float f7) {
        if (this.f4089n2 != f7) {
            float m2398q = m2398q();
            this.f4089n2 = f7;
            float m2398q2 = m2398q();
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: P */
    public final void m2389P(float f7) {
        if (this.f4088m2 != f7) {
            float m2398q = m2398q();
            this.f4088m2 = f7;
            float m2398q2 = m2398q();
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: Q */
    public final void m2390Q(ColorStateList colorStateList) {
        if (this.f4065S1 != colorStateList) {
            this.f4065S1 = colorStateList;
            this.f4060P2 = this.f4058O2 ? C2016b.m4910a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: R */
    public final void m2391R(C1973d c1973d) {
        C1760p c1760p = this.f4101z2;
        if (c1760p.f8117f != c1973d) {
            c1760p.f8117f = c1973d;
            if (c1973d != null) {
                TextPaint textPaint = c1760p.f8112a;
                Context context = this.f4095t2;
                C1760p.a aVar = c1760p.f8113b;
                c1973d.m4594f(context, textPaint, aVar);
                C1760p.b bVar = c1760p.f8116e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                c1973d.m4593e(context, textPaint, aVar);
                c1760p.f8115d = true;
            }
            C1760p.b bVar2 = c1760p.f8116e.get();
            if (bVar2 != null) {
                bVar2.mo2395a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: S */
    public final boolean m2392S() {
        return this.f4082g2 && this.f4083h2 != null && this.f4047G2;
    }

    /* renamed from: T */
    public final boolean m2393T() {
        return this.f4069U1 && this.f4071V1 != null;
    }

    /* renamed from: U */
    public final boolean m2394U() {
        return this.f4075Z1 && this.f4076a2 != null;
    }

    @Override // p131q3.C1760p.b
    /* renamed from: a */
    public final void mo2395a() {
        m2401v();
        invalidateSelf();
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        int i8;
        int i9;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        float f7;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i7 = this.f4049I2) == 0) {
            return;
        }
        if (i7 < 255) {
            float f8 = bounds.left;
            float f9 = bounds.top;
            float f10 = bounds.right;
            float f11 = bounds.bottom;
            i8 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f8, f9, f10, f11, i7) : canvas.saveLayerAlpha(f8, f9, f10, f11, i7, 31);
        } else {
            i8 = 0;
        }
        boolean z6 = this.f4070U2;
        Paint paint = this.f4096u2;
        RectF rectF2 = this.f4098w2;
        if (!z6) {
            paint.setColor(this.f4041A2);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, m2400s(), m2400s(), paint);
        }
        if (!this.f4070U2) {
            paint.setColor(this.f4042B2);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4050J2;
            if (colorFilter == null) {
                colorFilter = this.f4051K2;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, m2400s(), m2400s(), paint);
        }
        if (this.f4070U2) {
            super.draw(canvas);
        }
        if (this.f4063R1 > 0.0f && !this.f4070U2) {
            paint.setColor(this.f4044D2);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4070U2) {
                ColorFilter colorFilter2 = this.f4050J2;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4051K2;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f12 = bounds.left;
            float f13 = this.f4063R1 / 2.0f;
            rectF2.set(f12 + f13, bounds.top + f13, bounds.right - f13, bounds.bottom - f13);
            float f14 = this.f4059P1 - (this.f4063R1 / 2.0f);
            canvas.drawRoundRect(rectF2, f14, f14, paint);
        }
        paint.setColor(this.f4045E2);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.f4070U2) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.f4100y2;
            C2241j c2241j = this.f10146G1;
            C2237f.b bVar = this.f10154c;
            c2241j.m5442a(bVar.f10163a, bVar.f10172j, rectF3, this.f10145F1, path);
            i9 = 0;
            m5424f(canvas, paint, path, this.f10154c.f10163a, m5425h());
        } else {
            canvas.drawRoundRect(rectF2, m2400s(), m2400s(), paint);
            i9 = 0;
        }
        if (m2393T()) {
            m2397p(bounds, rectF2);
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.f4071V1.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
            this.f4071V1.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (m2392S()) {
            m2397p(bounds, rectF2);
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f4083h2.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
            this.f4083h2.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (!this.f4066S2 || this.f4067T1 == null) {
            rectF = rectF2;
            i10 = i8;
            i11 = 255;
        } else {
            PointF pointF = this.f4099x2;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4067T1;
            C1760p c1760p = this.f4101z2;
            if (charSequence != null) {
                float m2398q = m2398q() + this.f4087l2 + this.f4090o2;
                if (C2213a.m5354b(this) == 0) {
                    pointF.x = bounds.left + m2398q;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - m2398q;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = c1760p.f8112a;
                Paint.FontMetrics fontMetrics = this.f4097v2;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.f4067T1 != null) {
                float m2398q2 = m2398q() + this.f4087l2 + this.f4090o2;
                float m2399r = m2399r() + this.f4094s2 + this.f4091p2;
                if (C2213a.m5354b(this) == 0) {
                    rectF2.left = bounds.left + m2398q2;
                    f7 = bounds.right - m2399r;
                } else {
                    rectF2.left = bounds.left + m2399r;
                    f7 = bounds.right - m2398q2;
                }
                rectF2.right = f7;
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            C1973d c1973d = c1760p.f8117f;
            TextPaint textPaint2 = c1760p.f8112a;
            if (c1973d != null) {
                textPaint2.drawableState = getState();
                c1760p.f8117f.m4593e(this.f4095t2, textPaint2, c1760p.f8113b);
            }
            textPaint2.setTextAlign(align);
            boolean z7 = Math.round(c1760p.m4231a(this.f4067T1.toString())) > Math.round(rectF2.width());
            if (z7) {
                i12 = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                i12 = 0;
            }
            CharSequence charSequence2 = this.f4067T1;
            if (z7 && this.f4064R2 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.f4064R2);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f19 = pointF.x;
            float f20 = pointF.y;
            i11 = 255;
            rectF = rectF2;
            i10 = i8;
            canvas.drawText(charSequence3, 0, length, f19, f20, textPaint2);
            if (z7) {
                canvas.restoreToCount(i12);
            }
        }
        if (m2394U()) {
            rectF.setEmpty();
            if (m2394U()) {
                float f21 = this.f4094s2 + this.f4093r2;
                if (C2213a.m5354b(this) == 0) {
                    float f22 = bounds.right - f21;
                    rectF.right = f22;
                    rectF.left = f22 - this.f4079d2;
                } else {
                    float f23 = bounds.left + f21;
                    rectF.left = f23;
                    rectF.right = f23 + this.f4079d2;
                }
                float exactCenterY = bounds.exactCenterY();
                float f24 = this.f4079d2;
                float f25 = exactCenterY - (f24 / 2.0f);
                rectF.top = f25;
                rectF.bottom = f25 + f24;
            }
            float f26 = rectF.left;
            float f27 = rectF.top;
            canvas.translate(f26, f27);
            this.f4076a2.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = C2016b.f9168a;
            this.f4077b2.setBounds(this.f4076a2.getBounds());
            this.f4077b2.jumpToCurrentState();
            this.f4077b2.draw(canvas);
            canvas.translate(-f26, -f27);
        }
        if (this.f4049I2 < i11) {
            canvas.restoreToCount(i10);
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4049I2;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4050J2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4057O1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m2399r() + this.f4101z2.m4231a(this.f4067T1.toString()) + m2398q() + this.f4087l2 + this.f4090o2 + this.f4091p2 + this.f4094s2), this.f4068T2);
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f4070U2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4057O1, this.f4059P1);
        } else {
            outline.setRoundRect(bounds, this.f4059P1);
        }
        outline.setAlpha(this.f4049I2 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m2372t(this.f4053M1) || m2372t(this.f4055N1) || m2372t(this.f4061Q1)) {
            return true;
        }
        if (this.f4058O2 && m2372t(this.f4060P2)) {
            return true;
        }
        C1973d c1973d = this.f4101z2.f8117f;
        if ((c1973d == null || (colorStateList = c1973d.f8837j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f4082g2 && this.f4083h2 != null && this.f4081f2) || m2373u(this.f4071V1) || m2373u(this.f4083h2) || m2372t(this.f4052L2);
    }

    /* renamed from: o */
    public final void m2396o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C2213a.m5355c(drawable, C2213a.m5354b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4076a2) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4056N2);
            }
            C2213a.b.m5372h(drawable, this.f4078c2);
            return;
        }
        Drawable drawable2 = this.f4071V1;
        if (drawable == drawable2 && this.f4074Y1) {
            C2213a.b.m5372h(drawable2, this.f4072W1);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (m2393T()) {
            onLayoutDirectionChanged |= C2213a.m5355c(this.f4071V1, i7);
        }
        if (m2392S()) {
            onLayoutDirectionChanged |= C2213a.m5355c(this.f4083h2, i7);
        }
        if (m2394U()) {
            onLayoutDirectionChanged |= C2213a.m5355c(this.f4076a2, i7);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        boolean onLevelChange = super.onLevelChange(i7);
        if (m2393T()) {
            onLevelChange |= this.f4071V1.setLevel(i7);
        }
        if (m2392S()) {
            onLevelChange |= this.f4083h2.setLevel(i7);
        }
        if (m2394U()) {
            onLevelChange |= this.f4076a2.setLevel(i7);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable, p131q3.C1760p.b
    public final boolean onStateChange(int[] iArr) {
        if (this.f4070U2) {
            super.onStateChange(iArr);
        }
        return m2402w(iArr, this.f4056N2);
    }

    /* renamed from: p */
    public final void m2397p(Rect rect, RectF rectF) {
        float f7;
        rectF.setEmpty();
        if (m2393T() || m2392S()) {
            float f8 = this.f4087l2 + this.f4088m2;
            Drawable drawable = this.f4047G2 ? this.f4083h2 : this.f4071V1;
            float f9 = this.f4073X1;
            if (f9 <= 0.0f && drawable != null) {
                f9 = drawable.getIntrinsicWidth();
            }
            if (C2213a.m5354b(this) == 0) {
                float f10 = rect.left + f8;
                rectF.left = f10;
                rectF.right = f10 + f9;
            } else {
                float f11 = rect.right - f8;
                rectF.right = f11;
                rectF.left = f11 - f9;
            }
            Drawable drawable2 = this.f4047G2 ? this.f4083h2 : this.f4071V1;
            float f12 = this.f4073X1;
            if (f12 <= 0.0f && drawable2 != null) {
                f12 = (float) Math.ceil(C1767w.m4238a(24, this.f4095t2));
                if (drawable2.getIntrinsicHeight() <= f12) {
                    f7 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f7;
                }
            }
            f7 = f12;
            float exactCenterY2 = rect.exactCenterY() - (f7 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f7;
        }
    }

    /* renamed from: q */
    public final float m2398q() {
        if (!m2393T() && !m2392S()) {
            return 0.0f;
        }
        float f7 = this.f4088m2;
        Drawable drawable = this.f4047G2 ? this.f4083h2 : this.f4071V1;
        float f8 = this.f4073X1;
        if (f8 <= 0.0f && drawable != null) {
            f8 = drawable.getIntrinsicWidth();
        }
        return f8 + f7 + this.f4089n2;
    }

    /* renamed from: r */
    public final float m2399r() {
        if (m2394U()) {
            return this.f4092q2 + this.f4079d2 + this.f4093r2;
        }
        return 0.0f;
    }

    /* renamed from: s */
    public final float m2400s() {
        return this.f4070U2 ? this.f10154c.f10163a.f10190e.mo5418a(m5425h()) : this.f4059P1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f4049I2 != i7) {
            this.f4049I2 = i7;
            invalidateSelf();
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4050J2 != colorFilter) {
            this.f4050J2 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4052L2 != colorStateList) {
            this.f4052L2 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p193y3.C2237f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4054M2 != mode) {
            this.f4054M2 = mode;
            ColorStateList colorStateList = this.f4052L2;
            this.f4051K2 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        if (m2393T()) {
            visible |= this.f4071V1.setVisible(z6, z7);
        }
        if (m2392S()) {
            visible |= this.f4083h2.setVisible(z6, z7);
        }
        if (m2394U()) {
            visible |= this.f4076a2.setVisible(z6, z7);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final void m2401v() {
        a aVar = this.f4062Q2.get();
        if (aVar != null) {
            aVar.mo2362a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e7  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2402w(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C0775a.m2402w(int[], int[]):boolean");
    }

    /* renamed from: x */
    public final void m2403x(boolean z6) {
        if (this.f4081f2 != z6) {
            this.f4081f2 = z6;
            float m2398q = m2398q();
            if (!z6 && this.f4047G2) {
                this.f4047G2 = false;
            }
            float m2398q2 = m2398q();
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: y */
    public final void m2404y(Drawable drawable) {
        if (this.f4083h2 != drawable) {
            float m2398q = m2398q();
            this.f4083h2 = drawable;
            float m2398q2 = m2398q();
            m2371V(this.f4083h2);
            m2396o(this.f4083h2);
            invalidateSelf();
            if (m2398q != m2398q2) {
                m2401v();
            }
        }
    }

    /* renamed from: z */
    public final void m2405z(ColorStateList colorStateList) {
        if (this.f4084i2 != colorStateList) {
            this.f4084i2 = colorStateList;
            if (this.f4082g2 && this.f4083h2 != null && this.f4081f2) {
                C2213a.b.m5372h(this.f4083h2, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
