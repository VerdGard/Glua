package p017c0;

import android.ext.C0089a;
import android.ext.C0090b;
import android.ext.C0091c;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p026d0.C0874b;

/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C0576d implements Spannable {

    /* renamed from: c0.d$a */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f2939a;

        /* renamed from: b */
        public final TextDirectionHeuristic f2940b;

        /* renamed from: c */
        public final int f2941c;

        /* renamed from: d */
        public final int f2942d;

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f2939a = textPaint;
            textDirection = params.getTextDirection();
            this.f2940b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f2941c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f2942d = hyphenationFrequency;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2939a = textPaint;
            this.f2940b = textDirectionHeuristic;
            this.f2941c = i7;
            this.f2942d = i8;
        }

        /* renamed from: a */
        public final boolean m2021a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                if (this.f2941c != aVar.f2941c || this.f2942d != aVar.f2942d) {
                    return false;
                }
            }
            TextPaint textPaint = this.f2939a;
            if (textPaint.getTextSize() != aVar.f2939a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f2939a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
                return false;
            }
            if (i7 >= 24) {
                textLocales = textPaint.getTextLocales();
                textLocales2 = textPaint2.getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                return false;
            }
            return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m2021a(aVar) && this.f2940b == aVar.f2940b;
        }

        public final int hashCode() {
            LocaleList textLocales;
            int i7 = Build.VERSION.SDK_INT;
            int i8 = this.f2942d;
            int i9 = this.f2941c;
            TextDirectionHeuristic textDirectionHeuristic = this.f2940b;
            TextPaint textPaint = this.f2939a;
            if (i7 < 24) {
                return C0874b.m2563b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8));
            }
            textLocales = textPaint.getTextLocales();
            return C0874b.m2563b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8));
        }

        public final String toString() {
            StringBuilder sb;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f2939a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            if (i7 >= 24) {
                sb = new StringBuilder(", textLocale=");
                textLocale = textPaint.getTextLocales();
            } else {
                sb = new StringBuilder(", textLocale=");
                textLocale = textPaint.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i7 >= 26) {
                StringBuilder sb4 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f2940b);
            sb2.append(", breakStrategy=" + this.f2941c);
            sb2.append(", hyphenationFrequency=" + this.f2942d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0089a.m209g(i7, i8, cls);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0090b.m223i(obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0091c.m230h(obj, i7, i8, i9);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
