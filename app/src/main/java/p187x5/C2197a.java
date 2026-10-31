package p187x5;

import java.io.Serializable;
import p032d6.C0898f;

/* renamed from: x5.a */
/* loaded from: classes.dex */
public final class C2197a<A, B> implements Serializable {

    /* renamed from: c */
    public final A f9967c;

    /* renamed from: e */
    public final B f9968e;

    public C2197a(A a7, B b7) {
        this.f9967c = a7;
        this.f9968e = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2197a)) {
            return false;
        }
        C2197a c2197a = (C2197a) obj;
        return C0898f.m2602a(this.f9967c, c2197a.f9967c) && C0898f.m2602a(this.f9968e, c2197a.f9968e);
    }

    public final int hashCode() {
        A a7 = this.f9967c;
        int hashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f9968e;
        return hashCode + (b7 != null ? b7.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9967c + ", " + this.f9968e + ')';
    }
}
