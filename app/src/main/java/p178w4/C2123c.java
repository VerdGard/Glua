package p178w4;

import androidx.activity.C0143v;
import java.util.List;
import p032d6.C0898f;

/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class C2123c {

    /* renamed from: a */
    public final int f9592a;

    /* renamed from: b */
    public List<String> f9593b;

    /* renamed from: c */
    public final List<Object> f9594c;

    /* renamed from: d */
    public C0143v f9595d;

    public C2123c(int i7, List<String> list, List<Object> list2, C0143v c0143v) {
        C0898f.m2606e(list2, "elements");
        this.f9592a = i7;
        this.f9593b = list;
        this.f9594c = list2;
        this.f9595d = c0143v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2123c)) {
            return false;
        }
        C2123c c2123c = (C2123c) obj;
        return this.f9592a == c2123c.f9592a && C0898f.m2602a(this.f9593b, c2123c.f9593b) && C0898f.m2602a(this.f9594c, c2123c.f9594c) && C0898f.m2602a(this.f9595d, c2123c.f9595d);
    }

    public final int hashCode() {
        int i7 = this.f9592a * 31;
        List<String> list = this.f9593b;
        int hashCode = (this.f9594c.hashCode() + ((i7 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        C0143v c0143v = this.f9595d;
        return hashCode + (c0143v != null ? c0143v.hashCode() : 0);
    }

    public final String toString() {
        return "PlaceholderDefinition(id=" + this.f9592a + ", choices=" + this.f9593b + ", elements=" + this.f9594c + ", transform=" + this.f9595d + ")";
    }
}
