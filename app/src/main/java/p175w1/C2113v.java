package p175w1;

/* renamed from: w1.v */
/* loaded from: classes.dex */
public final class C2113v {

    /* renamed from: a */
    public int f9577a = 0;

    /* renamed from: b */
    public String f9578b = "...";

    /* renamed from: c */
    public final int f9579c;

    /* renamed from: d */
    public final String f9580d;

    public C2113v(String str, int i7) {
        this.f9580d = str;
        this.f9579c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2113v) {
            C2113v c2113v = (C2113v) obj;
            if (this.f9579c == c2113v.f9579c && this.f9580d.equals(c2113v.f9580d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9577a;
        if (i7 == 0) {
            i7 = this.f9580d.hashCode();
            String str = "#$@$#" + this.f9579c;
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                i7 = (i7 * 31) + str.charAt(i8);
            }
            this.f9577a = i7;
        }
        return i7;
    }

    public final String toString() {
        return this.f9580d;
    }
}
