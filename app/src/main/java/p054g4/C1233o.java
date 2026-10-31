package p054g4;

import p070i4.C1348n;

/* renamed from: g4.o */
/* loaded from: classes.dex */
public final class C1233o extends AbstractC1230l {

    /* renamed from: c */
    public final C1348n<String, AbstractC1230l> f5978c = new C1348n<>(false);

    /* renamed from: c */
    public final AbstractC1230l m3451c(String str) {
        return this.f5978c.get(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1233o) && ((C1233o) obj).f5978c.equals(this.f5978c));
    }

    public final int hashCode() {
        return this.f5978c.hashCode();
    }
}
