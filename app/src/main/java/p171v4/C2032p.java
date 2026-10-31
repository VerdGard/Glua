package p171v4;

import p032d6.C0898f;

/* renamed from: v4.p */
/* loaded from: classes.dex */
public final class C2032p {

    /* renamed from: a */
    public final AbstractC2020d f9219a;

    /* renamed from: b */
    public C2026j f9220b;

    public C2032p(AbstractC2020d abstractC2020d, C2026j c2026j) {
        C0898f.m2606e(c2026j, "score");
        this.f9219a = abstractC2020d;
        this.f9220b = c2026j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2032p)) {
            return false;
        }
        C2032p c2032p = (C2032p) obj;
        return C0898f.m2602a(this.f9219a, c2032p.f9219a) && C0898f.m2602a(this.f9220b, c2032p.f9220b);
    }

    public final int hashCode() {
        return this.f9220b.hashCode() + (this.f9219a.hashCode() * 31);
    }

    public final String toString() {
        return "SortedCompletionItem(completionItem=" + this.f9219a + ", score=" + this.f9220b + ")";
    }
}
