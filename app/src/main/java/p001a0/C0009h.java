package p001a0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: a0.h */
/* loaded from: classes.dex */
public final class C0009h implements InterfaceC0010i {

    /* renamed from: c */
    public static final Locale[] f8c = new Locale[0];

    /* renamed from: a */
    public final Locale[] f9a;

    /* renamed from: b */
    public final String f10b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public C0009h(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f9a = f8c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < localeArr.length; i7++) {
                Locale locale = localeArr[i7];
                if (locale == null) {
                    throw new NullPointerException("list[" + i7 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append('-');
                        sb2.append(locale2.getCountry());
                    }
                    if (i7 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f9a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f10b = sb;
    }

    @Override // p001a0.InterfaceC0010i
    /* renamed from: a */
    public final String mo44a() {
        return this.f10b;
    }

    @Override // p001a0.InterfaceC0010i
    /* renamed from: b */
    public final Object mo45b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0009h)) {
            return false;
        }
        Locale[] localeArr = ((C0009h) obj).f9a;
        Locale[] localeArr2 = this.f9a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // p001a0.InterfaceC0010i
    public final Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f9a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f9a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override // p001a0.InterfaceC0010i
    public final boolean isEmpty() {
        return this.f9a.length == 0;
    }

    @Override // p001a0.InterfaceC0010i
    public final int size() {
        return this.f9a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f9a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < localeArr.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
