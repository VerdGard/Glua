package p142r6;

import androidx.activity.C0143v;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import p134q6.C1806b;
import p142r6.C1850g;
import p160u0.C1966c;

/* renamed from: r6.b */
/* loaded from: classes.dex */
public final class C1845b implements Iterable<C1844a>, Cloneable {

    /* renamed from: s */
    public static final String[] f8320s = new String[0];

    /* renamed from: c */
    public int f8321c = 0;

    /* renamed from: e */
    public String[] f8322e;

    /* renamed from: m */
    public String[] f8323m;

    /* renamed from: r6.b$a */
    public class a implements Iterator<C1844a> {

        /* renamed from: c */
        public int f8324c = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f8324c < C1845b.this.f8321c;
        }

        @Override // java.util.Iterator
        public final C1844a next() {
            C1845b c1845b = C1845b.this;
            String[] strArr = c1845b.f8322e;
            int i7 = this.f8324c;
            C1844a c1844a = new C1844a(strArr[i7], c1845b.f8323m[i7], c1845b);
            this.f8324c++;
            return c1844a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i7 = this.f8324c - 1;
            this.f8324c = i7;
            C1845b c1845b = C1845b.this;
            int i8 = c1845b.f8321c;
            if (i7 >= i8) {
                throw new IllegalArgumentException("Must be false");
            }
            int i9 = (i8 - i7) - 1;
            if (i9 > 0) {
                String[] strArr = c1845b.f8322e;
                int i10 = i7 + 1;
                System.arraycopy(strArr, i10, strArr, i7, i9);
                String[] strArr2 = c1845b.f8323m;
                System.arraycopy(strArr2, i10, strArr2, i7, i9);
            }
            int i11 = c1845b.f8321c - 1;
            c1845b.f8321c = i11;
            c1845b.f8322e[i11] = null;
            c1845b.f8323m[i11] = null;
        }
    }

    public C1845b() {
        String[] strArr = f8320s;
        this.f8322e = strArr;
        this.f8323m = strArr;
    }

    /* renamed from: a */
    public final void m4335a(C1845b c1845b) {
        int i7 = c1845b.f8321c;
        if (i7 == 0) {
            return;
        }
        m4336b(this.f8321c + i7);
        int i8 = 0;
        while (true) {
            if (!(i8 < c1845b.f8321c)) {
                return;
            }
            String str = c1845b.f8322e[i8];
            String str2 = c1845b.f8323m[i8];
            C0143v.m423U(str);
            String trim = str.trim();
            C0143v.m421S(trim);
            i8++;
            if (str2 == null) {
                str2 = "";
            }
            m4343i(trim, str2);
        }
    }

    /* renamed from: b */
    public final void m4336b(int i7) {
        C0143v.m414L(i7 >= this.f8321c);
        String[] strArr = this.f8322e;
        int length = strArr.length;
        if (length >= i7) {
            return;
        }
        int i8 = length >= 4 ? this.f8321c * 2 : 4;
        if (i7 <= i8) {
            i7 = i8;
        }
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
        this.f8322e = strArr2;
        String[] strArr3 = this.f8323m;
        String[] strArr4 = new String[i7];
        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i7));
        this.f8323m = strArr4;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1845b clone() {
        try {
            C1845b c1845b = (C1845b) super.clone();
            c1845b.f8321c = this.f8321c;
            String[] strArr = this.f8322e;
            int i7 = this.f8321c;
            String[] strArr2 = new String[i7];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i7));
            this.f8322e = strArr2;
            String[] strArr3 = this.f8323m;
            int i8 = this.f8321c;
            String[] strArr4 = new String[i8];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i8));
            this.f8323m = strArr4;
            return c1845b;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: d */
    public final String m4338d(String str) {
        String str2;
        int m4341g = m4341g(str);
        return (m4341g == -1 || (str2 = this.f8323m[m4341g]) == null) ? "" : str2;
    }

    /* renamed from: e */
    public final String m4339e(String str) {
        String str2;
        int m4342h = m4342h(str);
        return (m4342h == -1 || (str2 = this.f8323m[m4342h]) == null) ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1845b.class != obj.getClass()) {
            return false;
        }
        C1845b c1845b = (C1845b) obj;
        if (this.f8321c == c1845b.f8321c && Arrays.equals(this.f8322e, c1845b.f8322e)) {
            return Arrays.equals(this.f8323m, c1845b.f8323m);
        }
        return false;
    }

    /* renamed from: f */
    public final void m4340f(Appendable appendable, C1850g.a aVar) {
        int i7 = this.f8321c;
        for (int i8 = 0; i8 < i7; i8++) {
            String str = this.f8322e[i8];
            String str2 = this.f8323m[i8];
            appendable.append(' ').append(str);
            if (!C1844a.m4334a(str, str2, aVar)) {
                appendable.append("=\"");
                if (str2 == null) {
                    str2 = "";
                }
                C1853j.m4378b(appendable, str2, aVar, true, false);
                appendable.append('\"');
            }
        }
    }

    /* renamed from: g */
    public final int m4341g(String str) {
        C0143v.m423U(str);
        for (int i7 = 0; i7 < this.f8321c; i7++) {
            if (str.equals(this.f8322e[i7])) {
                return i7;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public final int m4342h(String str) {
        C0143v.m423U(str);
        for (int i7 = 0; i7 < this.f8321c; i7++) {
            if (str.equalsIgnoreCase(this.f8322e[i7])) {
                return i7;
            }
        }
        return -1;
    }

    public final int hashCode() {
        return (((this.f8321c * 31) + Arrays.hashCode(this.f8322e)) * 31) + Arrays.hashCode(this.f8323m);
    }

    /* renamed from: i */
    public final void m4343i(String str, String str2) {
        int m4341g = m4341g(str);
        if (m4341g != -1) {
            this.f8323m[m4341g] = str2;
            return;
        }
        m4336b(this.f8321c + 1);
        String[] strArr = this.f8322e;
        int i7 = this.f8321c;
        strArr[i7] = str;
        this.f8323m[i7] = str2;
        this.f8321c = i7 + 1;
    }

    @Override // java.lang.Iterable
    public final Iterator<C1844a> iterator() {
        return new a();
    }

    public final String toString() {
        StringBuilder m4257a = C1806b.m4257a();
        try {
            m4340f(m4257a, new C1850g("").f8326x1);
            return C1806b.m4263g(m4257a);
        } catch (IOException e7) {
            throw new C1966c(e7);
        }
    }
}
