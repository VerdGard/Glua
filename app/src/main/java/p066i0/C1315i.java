package p066i0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import p017c0.C0576d;
import p036e2.C1109v5;

/* renamed from: i0.i */
/* loaded from: classes.dex */
public final class C1315i {

    /* renamed from: i0.i$a */
    public static class a {
        /* renamed from: a */
        public static boolean m3659a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m3660b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m3661c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: i0.i$b */
    public static class b {
        /* renamed from: a */
        public static Drawable[] m3662a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m3663b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m3664c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m3665d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m3666e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m3667f(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
        }

        /* renamed from: g */
        public static void m3668g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m3669h(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    /* renamed from: i0.i$c */
    public static class c {
        /* renamed from: a */
        public static int m3670a(TextView textView) {
            int breakStrategy;
            breakStrategy = textView.getBreakStrategy();
            return breakStrategy;
        }

        /* renamed from: b */
        public static ColorStateList m3671b(TextView textView) {
            ColorStateList compoundDrawableTintList;
            compoundDrawableTintList = textView.getCompoundDrawableTintList();
            return compoundDrawableTintList;
        }

        /* renamed from: c */
        public static PorterDuff.Mode m3672c(TextView textView) {
            PorterDuff.Mode compoundDrawableTintMode;
            compoundDrawableTintMode = textView.getCompoundDrawableTintMode();
            return compoundDrawableTintMode;
        }

        /* renamed from: d */
        public static int m3673d(TextView textView) {
            int hyphenationFrequency;
            hyphenationFrequency = textView.getHyphenationFrequency();
            return hyphenationFrequency;
        }

        /* renamed from: e */
        public static void m3674e(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        /* renamed from: f */
        public static void m3675f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m3676g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m3677h(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    /* renamed from: i0.i$d */
    public static class d {
        /* renamed from: a */
        public static DecimalFormatSymbols m3678a(Locale locale) {
            DecimalFormatSymbols decimalFormatSymbols;
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            return decimalFormatSymbols;
        }
    }

    /* renamed from: i0.i$e */
    public static class e {
        /* renamed from: a */
        public static String[] m3679a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        /* renamed from: b */
        public static PrecomputedText.Params m3680b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        /* renamed from: c */
        public static void m3681c(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    /* renamed from: i0.i$f */
    public static class f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f6511a;

        /* renamed from: b */
        public final TextView f6512b;

        /* renamed from: c */
        public Class<?> f6513c;

        /* renamed from: d */
        public Method f6514d;

        /* renamed from: e */
        public boolean f6515e;

        /* renamed from: f */
        public boolean f6516f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f6511a = callback;
            this.f6512b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f6511a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f6511a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f6511a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
        
            if (r10 == 0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p066i0.C1315i.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r9 != 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r4 != false) goto L30;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p017c0.C0576d.a m3652a(android.widget.TextView r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            c0.d$a r0 = new c0.d$a
            android.text.PrecomputedText$Params r9 = p066i0.C1315i.e.m3680b(r9)
            r0.<init>(r9)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L24
            r3 = 1
            r7 = 1
            goto L26
        L24:
            r3 = 0
            r7 = 0
        L26:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r5) goto L32
            int r3 = p066i0.C1315i.c.m3670a(r9)
            int r7 = p066i0.C1315i.c.m3673d(r9)
        L32:
            android.text.method.TransformationMethod r5 = r9.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L3d
        L3a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L82
        L3d:
            if (r0 < r1) goto L64
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L64
            java.util.Locale r9 = p066i0.C1315i.b.m3665d(r9)
            android.icu.text.DecimalFormatSymbols r9 = p066i0.C1315i.d.m3678a(r9)
            java.lang.String[] r9 = p066i0.C1315i.e.m3679a(r9)
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r6) goto L7a
            r0 = 2
            if (r9 != r0) goto L3a
            goto L7a
        L64:
            int r0 = p066i0.C1315i.b.m3663b(r9)
            if (r0 != r6) goto L6b
            r4 = 1
        L6b:
            int r9 = p066i0.C1315i.b.m3664c(r9)
            switch(r9) {
                case 2: goto L7d;
                case 3: goto L3a;
                case 4: goto L7a;
                case 5: goto L77;
                case 6: goto L80;
                case 7: goto L74;
                default: goto L72;
            }
        L72:
            if (r4 == 0) goto L80
        L74:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L82
        L77:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L82
        L7a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L82
        L7d:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L82
        L80:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L82:
            c0.d$a r0 = new c0.d$a
            r0.<init>(r2, r9, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i0.C1315i.m3652a(android.widget.TextView):c0.d$a");
    }

    /* renamed from: b */
    public static void m3653b(TextView textView, int i7) {
        C1109v5.m3252p(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            e.m3681c(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.m3659a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m3654c(TextView textView, int i7) {
        C1109v5.m3252p(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.m3659a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    /* renamed from: d */
    public static void m3655d(TextView textView, C0576d c0576d) {
        if (Build.VERSION.SDK_INT >= 29) {
            c0576d.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        C0576d.a m3652a = m3652a(textView);
        c0576d.getClass();
        if (!m3652a.m2021a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(c0576d);
    }

    /* renamed from: e */
    public static void m3656e(TextView textView, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i7);
        } else {
            textView.setTextAppearance(textView.getContext(), i7);
        }
    }

    /* renamed from: f */
    public static ActionMode.Callback m3657f(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).f6511a;
    }

    /* renamed from: g */
    public static ActionMode.Callback m3658g(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
