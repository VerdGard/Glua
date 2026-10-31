package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import p036e2.C1109v5;
import p106n0.C1633a;
import p106n0.C1634b;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C0331o {

    /* renamed from: a */
    public final C1634b f1608a;

    /* renamed from: b */
    public final char[] f1609b;

    /* renamed from: c */
    public final a f1610c = new a(1024);

    /* renamed from: d */
    public final Typeface f1611d;

    /* renamed from: androidx.emoji2.text.o$a */
    public static class a {

        /* renamed from: a */
        public final SparseArray<a> f1612a;

        /* renamed from: b */
        public C0326j f1613b;

        public a() {
            this(1);
        }

        public a(int i7) {
            this.f1612a = new SparseArray<>(i7);
        }

        /* renamed from: a */
        public final void m1124a(C0326j c0326j, int i7, int i8) {
            int m1110a = c0326j.m1110a(i7);
            SparseArray<a> sparseArray = this.f1612a;
            a aVar = sparseArray == null ? null : sparseArray.get(m1110a);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(c0326j.m1110a(i7), aVar);
            }
            if (i8 > i7) {
                aVar.m1124a(c0326j, i7 + 1, i8);
            } else {
                aVar.f1613b = c0326j;
            }
        }
    }

    public C0331o(Typeface typeface, C1634b c1634b) {
        int i7;
        int i8;
        this.f1611d = typeface;
        this.f1608a = c1634b;
        int m4005a = c1634b.m4005a(6);
        if (m4005a != 0) {
            int i9 = m4005a + c1634b.f7461a;
            i7 = c1634b.f7462b.getInt(c1634b.f7462b.getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        this.f1609b = new char[i7 * 2];
        int m4005a2 = c1634b.m4005a(6);
        if (m4005a2 != 0) {
            int i10 = m4005a2 + c1634b.f7461a;
            i8 = c1634b.f7462b.getInt(c1634b.f7462b.getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            C0326j c0326j = new C0326j(this, i11);
            C1633a m1112c = c0326j.m1112c();
            int m4005a3 = m1112c.m4005a(4);
            Character.toChars(m4005a3 != 0 ? m1112c.f7462b.getInt(m4005a3 + m1112c.f7461a) : 0, this.f1609b, i11 * 2);
            C1109v5.m3251o("invalid metadata codepoint length", c0326j.m1111b() > 0);
            this.f1610c.m1124a(c0326j, 0, c0326j.m1111b() - 1);
        }
    }
}
