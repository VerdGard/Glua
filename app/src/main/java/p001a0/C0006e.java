package p001a0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import p017c0.C0574b;

/* renamed from: a0.e */
/* loaded from: classes.dex */
public final class C0006e {

    /* renamed from: b */
    public static final C0006e f5b = m7a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC0010i f6a;

    /* renamed from: a0.e$a */
    public static class a {

        /* renamed from: a */
        public static final Locale[] f7a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        public static Locale m10a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m11b(Locale locale, Locale locale2) {
            boolean z6;
            boolean z7;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f7a;
            int length = localeArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z6 = false;
                    break;
                }
                if (localeArr[i7].equals(locale)) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            if (!z6) {
                int length2 = localeArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        z7 = false;
                        break;
                    }
                    if (localeArr[i8].equals(locale2)) {
                        z7 = true;
                        break;
                    }
                    i8++;
                }
                if (!z7) {
                    String m2001a = C0574b.m2001a(locale);
                    if (!m2001a.isEmpty()) {
                        return m2001a.equals(C0574b.m2001a(locale2));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
            }
            return false;
        }
    }

    /* renamed from: a0.e$b */
    public static class b {
        /* renamed from: a */
        public static LocaleList m12a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m13b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        /* renamed from: c */
        public static LocaleList m14c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    public C0006e(InterfaceC0010i interfaceC0010i) {
        this.f6a = interfaceC0010i;
    }

    /* renamed from: a */
    public static C0006e m7a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C0006e(new C0012k(b.m12a(localeArr))) : new C0006e(new C0009h(localeArr));
    }

    /* renamed from: b */
    public static C0006e m8b(String str) {
        if (str == null || str.isEmpty()) {
            return f5b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.m10a(split[i7]);
        }
        return m7a(localeArr);
    }

    /* renamed from: c */
    public final Locale m9c(int i7) {
        return this.f6a.get(i7);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0006e) {
            if (this.f6a.equals(((C0006e) obj).f6a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6a.hashCode();
    }

    public final String toString() {
        return this.f6a.toString();
    }
}
