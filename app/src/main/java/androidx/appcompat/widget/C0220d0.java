package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.ext.C0090b;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p058h0.C1276c;
import p173w.C2044f;

/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
public final class C0220d0 {

    /* renamed from: a */
    public final TextView f859a;

    /* renamed from: b */
    public C0227f1 f860b;

    /* renamed from: c */
    public C0227f1 f861c;

    /* renamed from: d */
    public C0227f1 f862d;

    /* renamed from: e */
    public C0227f1 f863e;

    /* renamed from: f */
    public C0227f1 f864f;

    /* renamed from: g */
    public C0227f1 f865g;

    /* renamed from: h */
    public C0227f1 f866h;

    /* renamed from: i */
    public final C0232h0 f867i;

    /* renamed from: j */
    public int f868j = 0;

    /* renamed from: k */
    public int f869k = -1;

    /* renamed from: l */
    public Typeface f870l;

    /* renamed from: m */
    public boolean f871m;

    /* renamed from: androidx.appcompat.widget.d0$a */
    public class a extends C2044f.e {

        /* renamed from: a */
        public final /* synthetic */ int f872a;

        /* renamed from: b */
        public final /* synthetic */ int f873b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f874c;

        public a(int i7, int i8, WeakReference weakReference) {
            this.f872a = i7;
            this.f873b = i8;
            this.f874c = weakReference;
        }

        @Override // p173w.C2044f.e
        /* renamed from: c */
        public final void mo720c(int i7) {
        }

        @Override // p173w.C2044f.e
        /* renamed from: d */
        public final void mo721d(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f872a) != -1) {
                typeface = f.m732a(typeface, i7, (this.f873b & 2) != 0);
            }
            C0220d0 c0220d0 = C0220d0.this;
            if (c0220d0.f871m) {
                c0220d0.f870l = typeface;
                TextView textView = (TextView) this.f874c.get();
                if (textView != null) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    if (C0946x.g.m2859b(textView)) {
                        textView.post(new RunnableC0223e0(textView, typeface, c0220d0.f868j));
                    } else {
                        textView.setTypeface(typeface, c0220d0.f868j);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    public static class b {
        /* renamed from: a */
        public static Drawable[] m722a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m723b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m724c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$c */
    public static class c {
        /* renamed from: a */
        public static Locale m725a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$d */
    public static class d {
        /* renamed from: a */
        public static LocaleList m726a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        /* renamed from: b */
        public static void m727b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$e */
    public static class e {
        /* renamed from: a */
        public static int m728a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        /* renamed from: b */
        public static void m729b(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        /* renamed from: c */
        public static void m730c(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        /* renamed from: d */
        public static boolean m731d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$f */
    public static class f {
        /* renamed from: a */
        public static Typeface m732a(Typeface typeface, int i7, boolean z6) {
            Typeface create;
            create = Typeface.create(typeface, i7, z6);
            return create;
        }
    }

    public C0220d0(TextView textView) {
        this.f859a = textView;
        this.f867i = new C0232h0(textView);
    }

    /* renamed from: c */
    public static C0227f1 m706c(Context context, C0240k c0240k, int i7) {
        ColorStateList m905i;
        synchronized (c0240k) {
            m905i = c0240k.f939a.m905i(i7, context);
        }
        if (m905i == null) {
            return null;
        }
        C0227f1 c0227f1 = new C0227f1();
        c0227f1.f892d = true;
        c0227f1.f889a = m905i;
        return c0227f1;
    }

    /* renamed from: h */
    public static void m707h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 + 0 : i8 + 0;
        int i11 = i8 > i9 ? i8 - 0 : i9 + 0;
        int length = text.length();
        if (i10 >= 0 && i11 <= length) {
            int i12 = editorInfo.inputType & 4095;
            if (!(i12 == 129 || i12 == 225 || i12 == 18)) {
                if (length <= 2048) {
                    C1276c.m3589a(editorInfo, text, i10, i11);
                    return;
                }
                int i13 = i11 - i10;
                int i14 = i13 > 1024 ? 0 : i13;
                int i15 = 2048 - i14;
                int min = Math.min(text.length() - i11, i15 - Math.min(i10, (int) (i15 * 0.8d)));
                int min2 = Math.min(i10, i15 - min);
                int i16 = i10 - min2;
                if (Character.isLowSurrogate(text.charAt(i16))) {
                    i16++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                CharSequence concat = i14 != i13 ? TextUtils.concat(text.subSequence(i16, i16 + min2), text.subSequence(i11, min + i11)) : text.subSequence(i16, min2 + i14 + min + i16);
                int i17 = min2 + 0;
                C1276c.m3589a(editorInfo, concat, i17, i14 + i17);
                return;
            }
        }
        C1276c.m3589a(editorInfo, null, 0, 0);
    }

    /* renamed from: a */
    public final void m708a(Drawable drawable, C0227f1 c0227f1) {
        if (drawable == null || c0227f1 == null) {
            return;
        }
        C0240k.m810e(drawable, c0227f1, this.f859a.getDrawableState());
    }

    /* renamed from: b */
    public final void m709b() {
        C0227f1 c0227f1 = this.f860b;
        TextView textView = this.f859a;
        if (c0227f1 != null || this.f861c != null || this.f862d != null || this.f863e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m708a(compoundDrawables[0], this.f860b);
            m708a(compoundDrawables[1], this.f861c);
            m708a(compoundDrawables[2], this.f862d);
            m708a(compoundDrawables[3], this.f863e);
        }
        if (this.f864f == null && this.f865g == null) {
            return;
        }
        Drawable[] m722a = b.m722a(textView);
        m708a(m722a[0], this.f864f);
        m708a(m722a[2], this.f865g);
    }

    /* renamed from: d */
    public final ColorStateList m710d() {
        C0227f1 c0227f1 = this.f866h;
        if (c0227f1 != null) {
            return c0227f1.f889a;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m711e() {
        C0227f1 c0227f1 = this.f866h;
        if (c0227f1 != null) {
            return c0227f1.f890b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m712f(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0220d0.m712f(android.util.AttributeSet, int):void");
    }

    /* renamed from: g */
    public final void m713g(int i7, Context context) {
        String m800j;
        ColorStateList m792b;
        ColorStateList m792b2;
        ColorStateList m792b3;
        C0233h1 c0233h1 = new C0233h1(context, context.obtainStyledAttributes(i7, R$styleable.f296x));
        int i8 = R$styleable.TextAppearance_textAllCaps;
        boolean m802l = c0233h1.m802l(i8);
        TextView textView = this.f859a;
        if (m802l) {
            textView.setAllCaps(c0233h1.m791a(i8, false));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            int i10 = R$styleable.TextAppearance_android_textColor;
            if (c0233h1.m802l(i10) && (m792b3 = c0233h1.m792b(i10)) != null) {
                textView.setTextColor(m792b3);
            }
            int i11 = R$styleable.TextAppearance_android_textColorLink;
            if (c0233h1.m802l(i11) && (m792b2 = c0233h1.m792b(i11)) != null) {
                textView.setLinkTextColor(m792b2);
            }
            int i12 = R$styleable.TextAppearance_android_textColorHint;
            if (c0233h1.m802l(i12) && (m792b = c0233h1.m792b(i12)) != null) {
                textView.setHintTextColor(m792b);
            }
        }
        int i13 = R$styleable.TextAppearance_android_textSize;
        if (c0233h1.m802l(i13) && c0233h1.m794d(i13, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m719n(context, c0233h1);
        if (i9 >= 26) {
            int i14 = R$styleable.TextAppearance_fontVariationSettings;
            if (c0233h1.m802l(i14) && (m800j = c0233h1.m800j(i14)) != null) {
                e.m731d(textView, m800j);
            }
        }
        c0233h1.m803n();
        Typeface typeface = this.f870l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f868j);
        }
    }

    /* renamed from: i */
    public final void m714i(int i7, int i8, int i9, int i10) {
        C0232h0 c0232h0 = this.f867i;
        if (c0232h0.m782i()) {
            DisplayMetrics displayMetrics = c0232h0.f912j.getResources().getDisplayMetrics();
            c0232h0.m783j(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c0232h0.m780g()) {
                c0232h0.m777a();
            }
        }
    }

    /* renamed from: j */
    public final void m715j(int[] iArr, int i7) {
        C0232h0 c0232h0 = this.f867i;
        if (c0232h0.m782i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0232h0.f912j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                c0232h0.f908f = C0232h0.m774b(iArr2);
                if (!c0232h0.m781h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0232h0.f909g = false;
            }
            if (c0232h0.m780g()) {
                c0232h0.m777a();
            }
        }
    }

    /* renamed from: k */
    public final void m716k(int i7) {
        C0232h0 c0232h0 = this.f867i;
        if (c0232h0.m782i()) {
            if (i7 == 0) {
                c0232h0.f903a = 0;
                c0232h0.f906d = -1.0f;
                c0232h0.f907e = -1.0f;
                c0232h0.f905c = -1.0f;
                c0232h0.f908f = new int[0];
                c0232h0.f904b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(C0090b.m219e("Unknown auto-size text type: ", i7));
            }
            DisplayMetrics displayMetrics = c0232h0.f912j.getResources().getDisplayMetrics();
            c0232h0.m783j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0232h0.m780g()) {
                c0232h0.m777a();
            }
        }
    }

    /* renamed from: l */
    public final void m717l(ColorStateList colorStateList) {
        if (this.f866h == null) {
            this.f866h = new C0227f1();
        }
        C0227f1 c0227f1 = this.f866h;
        c0227f1.f889a = colorStateList;
        c0227f1.f892d = colorStateList != null;
        this.f860b = c0227f1;
        this.f861c = c0227f1;
        this.f862d = c0227f1;
        this.f863e = c0227f1;
        this.f864f = c0227f1;
        this.f865g = c0227f1;
    }

    /* renamed from: m */
    public final void m718m(PorterDuff.Mode mode) {
        if (this.f866h == null) {
            this.f866h = new C0227f1();
        }
        C0227f1 c0227f1 = this.f866h;
        c0227f1.f890b = mode;
        c0227f1.f891c = mode != null;
        this.f860b = c0227f1;
        this.f861c = c0227f1;
        this.f862d = c0227f1;
        this.f863e = c0227f1;
        this.f864f = c0227f1;
        this.f865g = c0227f1;
    }

    /* renamed from: n */
    public final void m719n(Context context, C0233h1 c0233h1) {
        String m800j;
        Typeface create;
        Typeface typeface;
        this.f868j = c0233h1.m798h(R$styleable.TextAppearance_android_textStyle, this.f868j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int m798h = c0233h1.m798h(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.f869k = m798h;
            if (m798h != -1) {
                this.f868j = (this.f868j & 2) | 0;
            }
        }
        int i8 = R$styleable.TextAppearance_android_fontFamily;
        if (!c0233h1.m802l(i8) && !c0233h1.m802l(R$styleable.TextAppearance_fontFamily)) {
            int i9 = R$styleable.TextAppearance_android_typeface;
            if (c0233h1.m802l(i9)) {
                this.f871m = false;
                int m798h2 = c0233h1.m798h(i9, 1);
                if (m798h2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m798h2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m798h2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f870l = typeface;
                return;
            }
            return;
        }
        this.f870l = null;
        int i10 = R$styleable.TextAppearance_fontFamily;
        if (c0233h1.m802l(i10)) {
            i8 = i10;
        }
        int i11 = this.f869k;
        int i12 = this.f868j;
        if (!context.isRestricted()) {
            try {
                Typeface m797g = c0233h1.m797g(i8, this.f868j, new a(i11, i12, new WeakReference(this.f859a)));
                if (m797g != null) {
                    if (i7 >= 28 && this.f869k != -1) {
                        m797g = f.m732a(Typeface.create(m797g, 0), this.f869k, (this.f868j & 2) != 0);
                    }
                    this.f870l = m797g;
                }
                this.f871m = this.f870l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f870l != null || (m800j = c0233h1.m800j(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f869k == -1) {
            create = Typeface.create(m800j, this.f868j);
        } else {
            create = f.m732a(Typeface.create(m800j, 0), this.f869k, (this.f868j & 2) != 0);
        }
        this.f870l = create;
    }
}
