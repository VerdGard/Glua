package p022c5;

import java.util.Objects;
import p071i5.C1374k;
import p171v4.C2019c;

/* renamed from: c5.p */
/* loaded from: classes.dex */
public class C0652p implements CharSequence {

    /* renamed from: c */
    public final CharSequence f3188c;

    /* renamed from: e */
    public final int f3189e;

    /* renamed from: m */
    public final int f3190m;

    /* renamed from: s */
    public a f3191s;

    /* renamed from: c5.p$a */
    public interface a {
    }

    public C0652p(int i7, int i8, CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.f3188c = charSequence;
        this.f3189e = i7;
        this.f3190m = i8;
        if (i7 > i8) {
            throw new IllegalArgumentException("start > end");
        }
        if (i7 < 0) {
            throw new StringIndexOutOfBoundsException(i7);
        }
        if (i8 > charSequence.length()) {
            throw new StringIndexOutOfBoundsException(i8);
        }
    }

    /* renamed from: a */
    public final void m2171a() {
        a aVar = this.f3191s;
        if (aVar != null) {
            C1374k.a aVar2 = (C1374k.a) aVar;
            if (C1374k.this.f6674D1 != aVar2.f6688X || aVar2.f6689Y) {
                throw new C2019c();
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i7) {
        if (i7 < 0 || i7 >= length()) {
            throw new StringIndexOutOfBoundsException(i7);
        }
        m2171a();
        return this.f3188c.charAt(this.f3189e + i7);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        m2171a();
        return this.f3190m - this.f3189e;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        if (i7 < 0 || i7 >= length()) {
            throw new StringIndexOutOfBoundsException(i7);
        }
        if (i8 < 0 || i8 >= length()) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        m2171a();
        int i9 = this.f3189e;
        C0652p c0652p = new C0652p(i7 + i9, i9 + i8, this.f3188c);
        c0652p.f3191s = this.f3191s;
        return c0652p;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3188c.subSequence(this.f3189e, this.f3190m).toString();
    }
}
