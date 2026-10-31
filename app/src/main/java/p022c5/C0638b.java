package p022c5;

import java.util.Objects;

/* renamed from: c5.b */
/* loaded from: classes.dex */
public final class C0638b {

    /* renamed from: a */
    public int f3140a;

    /* renamed from: b */
    public int f3141b;

    /* renamed from: c */
    public int f3142c;

    public C0638b() {
    }

    public C0638b(int i7, int i8, int i9) {
        this.f3140a = i9;
        this.f3141b = i7;
        this.f3142c = i8;
    }

    /* renamed from: a */
    public final C0638b m2115a() {
        C0638b c0638b = new C0638b();
        c0638b.f3140a = this.f3140a;
        c0638b.f3141b = this.f3141b;
        c0638b.f3142c = this.f3142c;
        return c0638b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0638b)) {
            return false;
        }
        C0638b c0638b = (C0638b) obj;
        return c0638b.f3142c == this.f3142c && c0638b.f3141b == this.f3141b && c0638b.f3140a == this.f3140a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3140a), Integer.valueOf(this.f3141b), Integer.valueOf(this.f3142c));
    }

    public final String toString() {
        return "CharPosition(line = " + this.f3141b + ",column = " + this.f3142c + ",index = " + this.f3140a + ")";
    }
}
