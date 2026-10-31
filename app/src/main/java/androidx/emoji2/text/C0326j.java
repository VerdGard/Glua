package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p106n0.C1633a;
import p106n0.C1634b;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C0326j {

    /* renamed from: d */
    public static final ThreadLocal<C1633a> f1580d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f1581a;

    /* renamed from: b */
    public final C0331o f1582b;

    /* renamed from: c */
    public volatile int f1583c = 0;

    public C0326j(C0331o c0331o, int i7) {
        this.f1582b = c0331o;
        this.f1581a = i7;
    }

    /* renamed from: a */
    public final int m1110a(int i7) {
        C1633a m1112c = m1112c();
        int m4005a = m1112c.m4005a(16);
        if (m4005a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = m1112c.f7462b;
        int i8 = m4005a + m1112c.f7461a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    /* renamed from: b */
    public final int m1111b() {
        C1633a m1112c = m1112c();
        int m4005a = m1112c.m4005a(16);
        if (m4005a == 0) {
            return 0;
        }
        int i7 = m4005a + m1112c.f7461a;
        return m1112c.f7462b.getInt(m1112c.f7462b.getInt(i7) + i7);
    }

    /* renamed from: c */
    public final C1633a m1112c() {
        short s7;
        ThreadLocal<C1633a> threadLocal = f1580d;
        C1633a c1633a = threadLocal.get();
        if (c1633a == null) {
            c1633a = new C1633a();
            threadLocal.set(c1633a);
        }
        C1634b c1634b = this.f1582b.f1608a;
        int m4005a = c1634b.m4005a(6);
        if (m4005a != 0) {
            int i7 = m4005a + c1634b.f7461a;
            int i8 = (this.f1581a * 4) + c1634b.f7462b.getInt(i7) + i7 + 4;
            int i9 = c1634b.f7462b.getInt(i8) + i8;
            ByteBuffer byteBuffer = c1634b.f7462b;
            c1633a.f7462b = byteBuffer;
            if (byteBuffer != null) {
                c1633a.f7461a = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c1633a.f7463c = i10;
                s7 = c1633a.f7462b.getShort(i10);
            } else {
                s7 = 0;
                c1633a.f7461a = 0;
                c1633a.f7463c = 0;
            }
            c1633a.f7464d = s7;
        }
        return c1633a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1633a m1112c = m1112c();
        int m4005a = m1112c.m4005a(4);
        sb.append(Integer.toHexString(m4005a != 0 ? m1112c.f7462b.getInt(m4005a + m1112c.f7461a) : 0));
        sb.append(", codepoints:");
        int m1111b = m1111b();
        for (int i7 = 0; i7 < m1111b; i7++) {
            sb.append(Integer.toHexString(m1110a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
