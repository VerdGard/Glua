package p022c5;

import android.ext.C0090b;
import android.text.GetChars;
import p002a1.C0017d;
import p031d5.InterfaceC0890a;

/* renamed from: c5.f */
/* loaded from: classes.dex */
public final class C0642f implements CharSequence, GetChars, InterfaceC0890a, Cloneable {

    /* renamed from: c */
    public char[] f3159c;

    /* renamed from: e */
    public int f3160e;

    /* renamed from: m */
    public int f3161m;

    /* renamed from: s */
    public EnumC0649m f3162s;

    public C0642f() {
        this(true);
    }

    public C0642f(int i7) {
        this.f3160e = 0;
        this.f3159c = new char[i7];
    }

    public C0642f(C0642f c0642f) {
        this(c0642f.f3160e + 16);
        int i7 = c0642f.f3160e;
        this.f3160e = i7;
        this.f3161m = c0642f.f3161m;
        this.f3162s = c0642f.f3162s;
        System.arraycopy(c0642f.f3159c, 0, this.f3159c, 0, i7);
    }

    public C0642f(boolean z6) {
        if (z6) {
            this.f3160e = 0;
            this.f3159c = new char[32];
        }
    }

    @Override // p031d5.InterfaceC0890a
    /* renamed from: a */
    public final boolean mo2157a() {
        return this.f3161m > 0;
    }

    /* renamed from: b */
    public final void m2158b(int i7) {
        if (i7 < 0 || i7 > this.f3160e) {
            StringBuilder m221g = C0090b.m221g("index = ", i7, ", length = ");
            m221g.append(this.f3160e);
            throw new StringIndexOutOfBoundsException(m221g.toString());
        }
    }

    /* renamed from: c */
    public final void m2159c(int i7, int i8) {
        if (i7 < 0) {
            throw new StringIndexOutOfBoundsException(i7);
        }
        int i9 = this.f3160e;
        if (i8 > i9) {
            i8 = i9;
        }
        if (i7 > i8) {
            throw new StringIndexOutOfBoundsException();
        }
        int i10 = i8 - i7;
        if (i10 > 0) {
            for (int i11 = i7; i11 < i8; i11++) {
                if (C0017d.m93r(this.f3159c[i11])) {
                    this.f3161m--;
                }
            }
            char[] cArr = this.f3159c;
            System.arraycopy(cArr, i7 + i10, cArr, i7, this.f3160e - i8);
            this.f3160e -= i10;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        if (i7 < this.f3160e) {
            return this.f3159c[i7];
        }
        if (m2160d().f3182e > 0) {
            return m2160d().f3181c.charAt(i7 - this.f3160e);
        }
        return '\n';
    }

    /* renamed from: d */
    public final EnumC0649m m2160d() {
        EnumC0649m enumC0649m = this.f3162s;
        return enumC0649m == null ? EnumC0649m.NONE : enumC0649m;
    }

    /* renamed from: e */
    public final void m2161e(int i7, int i8, int i9, CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i7 < 0 || i7 > this.f3160e) {
            throw new IndexOutOfBoundsException(C0090b.m219e("dstOffset ", i7));
        }
        if (i8 < 0 || i9 < 0 || i8 > i9 || i9 > charSequence.length()) {
            throw new IndexOutOfBoundsException("start " + i8 + ", end " + i9 + ", s.length() " + charSequence.length());
        }
        int i10 = i9 - i8;
        int i11 = this.f3160e;
        int i12 = i11 + i10;
        char[] cArr = this.f3159c;
        if (cArr.length < i12) {
            char[] cArr2 = new char[cArr.length * 2 < i12 ? i12 + 2 : cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i11);
            this.f3159c = cArr2;
        }
        char[] cArr3 = this.f3159c;
        System.arraycopy(cArr3, i7, cArr3, i7 + i10, this.f3160e - i7);
        while (i8 < i9) {
            char charAt = charSequence.charAt(i8);
            int i13 = i7 + 1;
            this.f3159c[i7] = charAt;
            if (C0017d.m93r(charAt)) {
                this.f3161m++;
            }
            i8++;
            i7 = i13;
        }
        this.f3160e += i10;
    }

    @Override // java.lang.CharSequence
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0642f subSequence(int i7, int i8) {
        m2158b(i7);
        m2158b(i8);
        if (i8 < i7) {
            throw new StringIndexOutOfBoundsException("start is greater than end");
        }
        int i9 = i8 - i7;
        char[] cArr = new char[i9 + 16];
        System.arraycopy(this.f3159c, i7, cArr, 0, i9);
        C0642f c0642f = new C0642f(false);
        c0642f.f3159c = cArr;
        c0642f.f3160e = i9;
        if (this.f3161m > 0) {
            for (int i10 = 0; i10 < c0642f.f3160e; i10++) {
                if (C0017d.m93r(cArr[i10])) {
                    c0642f.f3161m++;
                }
            }
        }
        return c0642f;
    }

    @Override // android.text.GetChars
    public final void getChars(int i7, int i8, char[] cArr, int i9) {
        if (i7 < 0) {
            throw new StringIndexOutOfBoundsException(i7);
        }
        if (i8 < 0 || i8 > this.f3160e) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        if (i7 > i8) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f3159c, i7, cArr, i9, i8 - i7);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3160e;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f3159c, 0, this.f3160e);
    }
}
