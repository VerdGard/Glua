package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p017c0.C0576d;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C0334r implements Spannable {

    /* renamed from: c */
    public boolean f1618c = false;

    /* renamed from: e */
    public Spannable f1619e;

    /* renamed from: androidx.emoji2.text.r$a */
    public static class a {
        /* renamed from: a */
        public boolean mo1131a(Spannable spannable) {
            return spannable instanceof C0576d;
        }
    }

    /* renamed from: androidx.emoji2.text.r$b */
    public static class b extends a {
        @Override // androidx.emoji2.text.C0334r.a
        /* renamed from: a */
        public final boolean mo1131a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof C0576d);
        }
    }

    public C0334r(Spannable spannable) {
        this.f1619e = spannable;
    }

    public C0334r(CharSequence charSequence) {
        this.f1619e = new SpannableString(charSequence);
    }

    /* renamed from: a */
    public final void m1130a() {
        Spannable spannable = this.f1619e;
        if (!this.f1618c) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).mo1131a(spannable)) {
                this.f1619e = new SpannableString(spannable);
            }
        }
        this.f1618c = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f1619e.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f1619e.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f1619e.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1619e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1619e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1619e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        return (T[]) this.f1619e.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1619e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f1619e.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1130a();
        this.f1619e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        m1130a();
        this.f1619e.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f1619e.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1619e.toString();
    }
}
