package p181x;

import android.graphics.Insets;

/* renamed from: x.b */
/* loaded from: classes.dex */
public final class C2153b {

    /* renamed from: e */
    public static final C2153b f9763e = new C2153b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f9764a;

    /* renamed from: b */
    public final int f9765b;

    /* renamed from: c */
    public final int f9766c;

    /* renamed from: d */
    public final int f9767d;

    /* renamed from: x.b$a */
    public static class a {
        /* renamed from: a */
        public static Insets m5271a(int i7, int i8, int i9, int i10) {
            Insets of;
            of = Insets.of(i7, i8, i9, i10);
            return of;
        }
    }

    public C2153b(int i7, int i8, int i9, int i10) {
        this.f9764a = i7;
        this.f9765b = i8;
        this.f9766c = i9;
        this.f9767d = i10;
    }

    /* renamed from: a */
    public static C2153b m5267a(C2153b c2153b, C2153b c2153b2) {
        return m5268b(Math.max(c2153b.f9764a, c2153b2.f9764a), Math.max(c2153b.f9765b, c2153b2.f9765b), Math.max(c2153b.f9766c, c2153b2.f9766c), Math.max(c2153b.f9767d, c2153b2.f9767d));
    }

    /* renamed from: b */
    public static C2153b m5268b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f9763e : new C2153b(i7, i8, i9, i10);
    }

    /* renamed from: c */
    public static C2153b m5269c(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return m5268b(i7, i8, i9, i10);
    }

    /* renamed from: d */
    public final Insets m5270d() {
        return a.m5271a(this.f9764a, this.f9765b, this.f9766c, this.f9767d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2153b.class != obj.getClass()) {
            return false;
        }
        C2153b c2153b = (C2153b) obj;
        return this.f9767d == c2153b.f9767d && this.f9764a == c2153b.f9764a && this.f9766c == c2153b.f9766c && this.f9765b == c2153b.f9765b;
    }

    public final int hashCode() {
        return (((((this.f9764a * 31) + this.f9765b) * 31) + this.f9766c) * 31) + this.f9767d;
    }

    public final String toString() {
        return "Insets{left=" + this.f9764a + ", top=" + this.f9765b + ", right=" + this.f9766c + ", bottom=" + this.f9767d + '}';
    }
}
