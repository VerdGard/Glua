package p026d0;

import android.graphics.Rect;

/* renamed from: d0.c */
/* loaded from: classes.dex */
public final class C0875c<F, S> {

    /* renamed from: a */
    public final F f4643a;

    /* renamed from: b */
    public final S f4644b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0875c(Rect rect, Rect rect2) {
        this.f4643a = rect;
        this.f4644b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0875c)) {
            return false;
        }
        C0875c c0875c = (C0875c) obj;
        return C0874b.m2562a(c0875c.f4643a, this.f4643a) && C0874b.m2562a(c0875c.f4644b, this.f4644b);
    }

    public final int hashCode() {
        F f7 = this.f4643a;
        int hashCode = f7 == null ? 0 : f7.hashCode();
        S s7 = this.f4644b;
        return (s7 != null ? s7.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f4643a + " " + this.f4644b + "}";
    }
}
