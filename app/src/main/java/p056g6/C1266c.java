package p056g6;

/* renamed from: g6.c */
/* loaded from: classes.dex */
public final class C1266c extends C1264a {

    /* renamed from: s */
    public static final C1266c f6312s = new C1266c(1, 0);

    public C1266c(int i7, int i8) {
        super(i7, i8, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1266c) {
            if (!isEmpty() || !((C1266c) obj).isEmpty()) {
                C1266c c1266c = (C1266c) obj;
                if (this.f6305c == c1266c.f6305c) {
                    if (this.f6306e == c1266c.f6306e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6305c * 31) + this.f6306e;
    }

    public final boolean isEmpty() {
        return this.f6305c > this.f6306e;
    }

    public final String toString() {
        return this.f6305c + ".." + this.f6306e;
    }
}
