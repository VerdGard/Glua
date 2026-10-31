package p001a0;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: a0.k */
/* loaded from: classes.dex */
public final class C0012k implements InterfaceC0010i {

    /* renamed from: a */
    public final LocaleList f11a;

    public C0012k(Object obj) {
        this.f11a = (LocaleList) obj;
    }

    @Override // p001a0.InterfaceC0010i
    /* renamed from: a */
    public final String mo44a() {
        String languageTags;
        languageTags = this.f11a.toLanguageTags();
        return languageTags;
    }

    @Override // p001a0.InterfaceC0010i
    /* renamed from: b */
    public final Object mo45b() {
        return this.f11a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f11a.equals(((InterfaceC0010i) obj).mo45b());
        return equals;
    }

    @Override // p001a0.InterfaceC0010i
    public final Locale get(int i7) {
        Locale locale;
        locale = this.f11a.get(i7);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f11a.hashCode();
        return hashCode;
    }

    @Override // p001a0.InterfaceC0010i
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f11a.isEmpty();
        return isEmpty;
    }

    @Override // p001a0.InterfaceC0010i
    public final int size() {
        int size;
        size = this.f11a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f11a.toString();
        return localeList;
    }
}
