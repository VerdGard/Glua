package p022c5;

import java.text.CharacterIterator;

/* renamed from: c5.c */
/* loaded from: classes.dex */
public final class C0639c implements CharacterIterator {

    /* renamed from: c */
    public final CharSequence f3143c;

    /* renamed from: e */
    public int f3144e;

    public C0639c(CharSequence charSequence) {
        this.f3143c = charSequence;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        C0639c c0639c = new C0639c(this.f3143c);
        c0639c.f3144e = this.f3144e;
        return c0639c;
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        if (this.f3144e == getEndIndex()) {
            return (char) 65535;
        }
        return this.f3143c.charAt(this.f3144e);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f3144e = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f3143c.length();
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f3144e;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int length = this.f3143c.length() - 1;
        this.f3144e = length;
        if (length < 0) {
            this.f3144e = 0;
        }
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        this.f3144e++;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f3144e - 1;
        this.f3144e = i7;
        if (i7 < 0) {
            this.f3144e = 0;
        }
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        this.f3144e = i7;
        return current();
    }
}
