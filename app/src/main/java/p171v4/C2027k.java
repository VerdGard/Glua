package p171v4;

/* renamed from: v4.k */
/* loaded from: classes.dex */
public final class C2027k {

    /* renamed from: c */
    public static final C2027k f9209c = new C2027k();

    /* renamed from: a */
    public final boolean f9210a = false;

    /* renamed from: b */
    public final boolean f9211b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027k)) {
            return false;
        }
        C2027k c2027k = (C2027k) obj;
        return this.f9210a == c2027k.f9210a && this.f9211b == c2027k.f9211b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z6 = this.f9210a;
        int i7 = z6;
        if (z6 != 0) {
            i7 = 1;
        }
        int i8 = i7 * 31;
        boolean z7 = this.f9211b;
        return i8 + (z7 ? 1 : z7 ? 1 : 0);
    }

    public final String toString() {
        return "FuzzyScoreOptions(firstMatchCanBeWeak=" + this.f9210a + ", boostFullMatch=" + this.f9211b + ")";
    }
}
