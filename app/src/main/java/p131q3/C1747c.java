package p131q3;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.ext.C0091c;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p017c0.C0578f;
import p034e0.C0923h0;
import p034e0.C0946x;
import p121p0.C1690b;
import p163u3.C1970a;
import p163u3.C1975f;

/* renamed from: q3.c */
/* loaded from: classes.dex */
public final class C1747c {

    /* renamed from: A */
    public CharSequence f7972A;

    /* renamed from: B */
    public CharSequence f7973B;

    /* renamed from: C */
    public boolean f7974C;

    /* renamed from: E */
    public Bitmap f7976E;

    /* renamed from: F */
    public float f7977F;

    /* renamed from: G */
    public float f7978G;

    /* renamed from: H */
    public float f7979H;

    /* renamed from: I */
    public float f7980I;

    /* renamed from: J */
    public float f7981J;

    /* renamed from: K */
    public int f7982K;

    /* renamed from: L */
    public int[] f7983L;

    /* renamed from: M */
    public boolean f7984M;

    /* renamed from: N */
    public final TextPaint f7985N;

    /* renamed from: O */
    public final TextPaint f7986O;

    /* renamed from: P */
    public TimeInterpolator f7987P;

    /* renamed from: Q */
    public TimeInterpolator f7988Q;

    /* renamed from: R */
    public float f7989R;

    /* renamed from: S */
    public float f7990S;

    /* renamed from: T */
    public float f7991T;

    /* renamed from: U */
    public ColorStateList f7992U;

    /* renamed from: V */
    public float f7993V;

    /* renamed from: W */
    public float f7994W;

    /* renamed from: X */
    public float f7995X;

    /* renamed from: Y */
    public StaticLayout f7996Y;

    /* renamed from: Z */
    public float f7997Z;

    /* renamed from: a */
    public final View f7998a;

    /* renamed from: a0 */
    public float f7999a0;

    /* renamed from: b */
    public float f8000b;

    /* renamed from: b0 */
    public float f8001b0;

    /* renamed from: c */
    public final Rect f8002c;

    /* renamed from: c0 */
    public CharSequence f8003c0;

    /* renamed from: d */
    public final Rect f8004d;

    /* renamed from: e */
    public final RectF f8006e;

    /* renamed from: j */
    public ColorStateList f8013j;

    /* renamed from: k */
    public ColorStateList f8014k;

    /* renamed from: l */
    public float f8015l;

    /* renamed from: m */
    public float f8016m;

    /* renamed from: n */
    public float f8017n;

    /* renamed from: o */
    public float f8018o;

    /* renamed from: p */
    public float f8019p;

    /* renamed from: q */
    public float f8020q;

    /* renamed from: r */
    public Typeface f8021r;

    /* renamed from: s */
    public Typeface f8022s;

    /* renamed from: t */
    public Typeface f8023t;

    /* renamed from: u */
    public Typeface f8024u;

    /* renamed from: v */
    public Typeface f8025v;

    /* renamed from: w */
    public Typeface f8026w;

    /* renamed from: x */
    public Typeface f8027x;

    /* renamed from: y */
    public C1970a f8028y;

    /* renamed from: f */
    public int f8008f = 16;

    /* renamed from: g */
    public int f8010g = 16;

    /* renamed from: h */
    public float f8011h = 15.0f;

    /* renamed from: i */
    public float f8012i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f8029z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f7975D = true;

    /* renamed from: d0 */
    public final int f8005d0 = 1;

    /* renamed from: e0 */
    public final float f8007e0 = 1.0f;

    /* renamed from: f0 */
    public final int f8009f0 = C1759o.f8096m;

    public C1747c(View view) {
        this.f7998a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f7985N = textPaint;
        this.f7986O = new TextPaint(textPaint);
        this.f8004d = new Rect();
        this.f8002c = new Rect();
        this.f8006e = new RectF();
        m4217g(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m4211a(float f7, int i7, int i8) {
        float f8 = 1.0f - f7;
        return Color.argb(Math.round((Color.alpha(i8) * f7) + (Color.alpha(i7) * f8)), Math.round((Color.red(i8) * f7) + (Color.red(i7) * f8)), Math.round((Color.green(i8) * f7) + (Color.green(i7) * f8)), Math.round((Color.blue(i8) * f7) + (Color.blue(i7) * f8)));
    }

    /* renamed from: f */
    public static float m4212f(float f7, float f8, float f9, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f9 = timeInterpolator.getInterpolation(f9);
        }
        LinearInterpolator linearInterpolator = C0034a.f108a;
        return C0091c.m227e(f8, f7, f9, f7);
    }

    /* renamed from: b */
    public final boolean m4213b(CharSequence charSequence) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z6 = C0946x.e.m2847d(this.f7998a) == 1;
        if (this.f7975D) {
            return (z6 ? C0578f.f2946d : C0578f.f2945c).m2024b(charSequence.length(), charSequence);
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        if (r12.f7974C != false) goto L85;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4214c(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131q3.C1747c.m4214c(float, boolean):void");
    }

    /* renamed from: d */
    public final float m4215d() {
        TextPaint textPaint = this.f7986O;
        textPaint.setTextSize(this.f8012i);
        textPaint.setTypeface(this.f8021r);
        textPaint.setLetterSpacing(this.f7993V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m4216e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7983L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m4217g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8023t;
            if (typeface != null) {
                this.f8022s = C1975f.m4596a(configuration, typeface);
            }
            Typeface typeface2 = this.f8026w;
            if (typeface2 != null) {
                this.f8025v = C1975f.m4596a(configuration, typeface2);
            }
            Typeface typeface3 = this.f8022s;
            if (typeface3 == null) {
                typeface3 = this.f8023t;
            }
            this.f8021r = typeface3;
            Typeface typeface4 = this.f8025v;
            if (typeface4 == null) {
                typeface4 = this.f8026w;
            }
            this.f8024u = typeface4;
            m4218h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4218h(boolean r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131q3.C1747c.m4218h(boolean):void");
    }

    /* renamed from: i */
    public final void m4219i(ColorStateList colorStateList) {
        if (this.f8014k == colorStateList && this.f8013j == colorStateList) {
            return;
        }
        this.f8014k = colorStateList;
        this.f8013j = colorStateList;
        m4218h(false);
    }

    /* renamed from: j */
    public final boolean m4220j(Typeface typeface) {
        C1970a c1970a = this.f8028y;
        if (c1970a != null) {
            c1970a.f8827s = true;
        }
        if (this.f8023t == typeface) {
            return false;
        }
        this.f8023t = typeface;
        Typeface m4596a = C1975f.m4596a(this.f7998a.getContext().getResources().getConfiguration(), typeface);
        this.f8022s = m4596a;
        if (m4596a == null) {
            m4596a = this.f8023t;
        }
        this.f8021r = m4596a;
        return true;
    }

    /* renamed from: k */
    public final void m4221k(float f7) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f7 != this.f8000b) {
            this.f8000b = f7;
            float f8 = this.f8002c.left;
            Rect rect = this.f8004d;
            float m4212f = m4212f(f8, rect.left, f7, this.f7987P);
            RectF rectF = this.f8006e;
            rectF.left = m4212f;
            rectF.top = m4212f(this.f8015l, this.f8016m, f7, this.f7987P);
            rectF.right = m4212f(r2.right, rect.right, f7, this.f7987P);
            rectF.bottom = m4212f(r2.bottom, rect.bottom, f7, this.f7987P);
            this.f8019p = m4212f(this.f8017n, this.f8018o, f7, this.f7987P);
            this.f8020q = m4212f(this.f8015l, this.f8016m, f7, this.f7987P);
            m4222l(f7);
            C1690b c1690b = C0034a.f109b;
            this.f7999a0 = 1.0f - m4212f(0.0f, 1.0f, 1.0f - f7, c1690b);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            View view = this.f7998a;
            C0946x.d.m2835k(view);
            this.f8001b0 = m4212f(1.0f, 0.0f, f7, c1690b);
            C0946x.d.m2835k(view);
            ColorStateList colorStateList = this.f8014k;
            ColorStateList colorStateList2 = this.f8013j;
            TextPaint textPaint = this.f7985N;
            textPaint.setColor(colorStateList != colorStateList2 ? m4211a(f7, m4216e(colorStateList2), m4216e(this.f8014k)) : m4216e(colorStateList));
            float f9 = this.f7993V;
            float f10 = this.f7994W;
            if (f9 != f10) {
                f9 = m4212f(f10, f9, f7, c1690b);
            }
            textPaint.setLetterSpacing(f9);
            this.f7979H = m4212f(0.0f, this.f7989R, f7, null);
            this.f7980I = m4212f(0.0f, this.f7990S, f7, null);
            this.f7981J = m4212f(0.0f, this.f7991T, f7, null);
            int m4211a = m4211a(f7, m4216e(null), m4216e(this.f7992U));
            this.f7982K = m4211a;
            textPaint.setShadowLayer(this.f7979H, this.f7980I, this.f7981J, m4211a);
            C0946x.d.m2835k(view);
        }
    }

    /* renamed from: l */
    public final void m4222l(float f7) {
        m4214c(f7, false);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2835k(this.f7998a);
    }

    /* renamed from: m */
    public final void m4223m(Typeface typeface) {
        boolean z6;
        boolean m4220j = m4220j(typeface);
        if (this.f8026w != typeface) {
            this.f8026w = typeface;
            Typeface m4596a = C1975f.m4596a(this.f7998a.getContext().getResources().getConfiguration(), typeface);
            this.f8025v = m4596a;
            if (m4596a == null) {
                m4596a = this.f8026w;
            }
            this.f8024u = m4596a;
            z6 = true;
        } else {
            z6 = false;
        }
        if (m4220j || z6) {
            m4218h(false);
        }
    }
}
