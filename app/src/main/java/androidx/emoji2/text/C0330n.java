package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import p106n0.C1634b;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C0330n {

    /* renamed from: androidx.emoji2.text.n$a */
    public static class a {

        /* renamed from: a */
        public final ByteBuffer f1607a;

        public a(ByteBuffer byteBuffer) {
            this.f1607a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final long m1122a() {
            return this.f1607a.getInt() & 4294967295L;
        }

        /* renamed from: b */
        public final void m1123b(int i7) {
            ByteBuffer byteBuffer = this.f1607a;
            byteBuffer.position(byteBuffer.position() + i7);
        }
    }

    /* renamed from: a */
    public static C1634b m1121a(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j7;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.m1123b(4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        aVar.m1123b(6);
        int i8 = 0;
        while (true) {
            byteBuffer = aVar.f1607a;
            if (i8 >= i7) {
                j7 = -1;
                break;
            }
            int i9 = byteBuffer.getInt();
            aVar.m1123b(4);
            j7 = aVar.m1122a();
            aVar.m1123b(4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j7 != -1) {
            aVar.m1123b((int) (j7 - duplicate.position()));
            aVar.m1123b(12);
            long m1122a = aVar.m1122a();
            for (int i10 = 0; i10 < m1122a; i10++) {
                int i11 = byteBuffer.getInt();
                long m1122a2 = aVar.m1122a();
                aVar.m1122a();
                if (1164798569 == i11 || 1701669481 == i11) {
                    duplicate.position((int) (m1122a2 + j7));
                    C1634b c1634b = new C1634b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c1634b.f7462b = duplicate;
                    c1634b.f7461a = position;
                    int i12 = position - duplicate.getInt(position);
                    c1634b.f7463c = i12;
                    c1634b.f7464d = c1634b.f7462b.getShort(i12);
                    return c1634b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
