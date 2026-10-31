package p006a5;

import java.util.Comparator;
import java.util.Objects;
import p006a5.C0051a;
import p009b0.C0500d;
import p171v4.C2028l;

/* renamed from: a5.a */
/* loaded from: classes.dex */
public final class C0051a {

    /* renamed from: e */
    public static final C0500d f134e = new C0500d(1);

    /* renamed from: f */
    public static final C2028l f135f = new Comparator() { // from class: v4.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C0051a c0051a = (C0051a) obj;
            C0051a c0051a2 = (C0051a) obj2;
            int compare = Integer.compare(c0051a.f136a, c0051a2.f136a);
            return compare == 0 ? Integer.compare(c0051a.f137b, c0051a2.f137b) : compare;
        }
    };

    /* renamed from: a */
    public int f136a;

    /* renamed from: b */
    public int f137b;

    /* renamed from: c */
    public int f138c;

    /* renamed from: d */
    public int f139d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0051a.class != obj.getClass()) {
            return false;
        }
        C0051a c0051a = (C0051a) obj;
        return this.f136a == c0051a.f136a && this.f137b == c0051a.f137b && this.f138c == c0051a.f138c && this.f139d == c0051a.f139d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f136a), Integer.valueOf(this.f137b), Integer.valueOf(this.f138c), Integer.valueOf(this.f139d), Boolean.FALSE);
    }

    public final String toString() {
        return "BlockLine{startLine=" + this.f136a + ", startColumn=" + this.f137b + ", endLine=" + this.f138c + ", endColumn=" + this.f139d + ", toBottomOfEndLine=false}";
    }
}
