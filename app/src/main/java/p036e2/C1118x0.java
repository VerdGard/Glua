package p036e2;

import android.util.SparseIntArray;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;
import p002a1.C0017d;
import p034e0.C0936o;
import p200z2.C2277a;

/* renamed from: e2.x0 */
/* loaded from: classes.dex */
public final class C1118x0 {

    /* renamed from: a */
    public final Object f5552a;

    public C1118x0(int i7) {
        if (i7 == 1) {
            this.f5552a = new C2277a();
        } else if (i7 != 2) {
            this.f5552a = new C1111w0();
        } else {
            this.f5552a = new SparseIntArray();
        }
    }

    /* renamed from: a */
    public final byte[] m3279a(byte[] bArr) {
        ((C1111w0) this.f5552a).getClass();
        if (bArr.length > 2147483635) {
            throw new GeneralSecurityException("data too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12);
        if (allocate.remaining() - 12 < bArr.length) {
            throw new IllegalArgumentException("data output is too small");
        }
        byte[] bArr2 = new byte[12];
        new Random().nextBytes(bArr2);
        allocate.put(bArr2);
        byte[] bArr3 = C1109v5.f5489a;
        if (bArr3 == null) {
            bArr3 = new BigInteger(C0017d.f16d).modPow(new BigInteger(C0017d.f17e), new BigInteger(C0017d.f20h)).toByteArray();
            C1109v5.f5489a = bArr3;
        }
        C1111w0.m3264b(bArr2, bArr3, allocate, ByteBuffer.wrap(bArr));
        return allocate.array();
    }

    /* renamed from: b */
    public final void m3280b(int i7, int i8) {
        Object obj = this.f5552a;
        int i9 = i7 + 1;
        int i10 = i8 + 1;
        ((SparseIntArray) obj).put(i9, i10);
        ((SparseIntArray) obj).put(i10, i9);
    }

    /* renamed from: c */
    public final C0936o m3281c(int i7) {
        int i8 = ((SparseIntArray) this.f5552a).get(i7 + 1) - 1;
        if (i8 <= i7) {
            i8 = i7;
            i7 = i8;
        }
        if (i7 != -1) {
            return new C0936o(i8, i7);
        }
        return null;
    }
}
