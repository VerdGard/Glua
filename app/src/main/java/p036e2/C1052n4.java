package p036e2;

import android.ext.C0089a;
import android.ext.C0090b;
import androidx.lifecycle.C0391d0;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* renamed from: e2.n4 */
/* loaded from: classes.dex */
public class C1052n4 extends AbstractC1045m4 {

    /* renamed from: c */
    public ByteBuffer f5263c;

    /* renamed from: d */
    public final Random f5264d = new Random();

    /* renamed from: e2.n4$a */
    public class a extends Throwable {

        /* renamed from: c */
        public final int f5265c;

        public a(int i7) {
            this.f5265c = i7;
        }
    }

    /* renamed from: f */
    public static C1136z4 m3123f(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        C1136z4 c1136z4;
        int remaining = byteBuffer.remaining();
        if (remaining < 2) {
            throw new a(2);
        }
        byte b7 = byteBuffer.get();
        boolean z6 = (b7 >> 8) != 0;
        byte b8 = (byte) ((b7 & Byte.MAX_VALUE) >> 4);
        if (b8 != 0) {
            throw new C1080r4(C0090b.m219e("bad rsv ", b8));
        }
        byte b9 = byteBuffer.get();
        boolean z7 = (b9 & Byte.MIN_VALUE) != 0;
        int i9 = (byte) (b9 & Byte.MAX_VALUE);
        byte b10 = (byte) (b7 & 15);
        if (b10 == 0) {
            i7 = 1;
        } else if (b10 == 1) {
            i7 = 2;
        } else if (b10 != 2) {
            switch (b10) {
                case 8:
                    i7 = 6;
                    break;
                case 9:
                    i7 = 4;
                    break;
                case 10:
                    i7 = 5;
                    break;
                default:
                    throw new C1080r4("unknow optcode " + ((int) b10));
            }
        } else {
            i7 = 3;
        }
        if (!z6 && (i7 == 4 || i7 == 5 || i7 == 6)) {
            throw new C1080r4("control frames may no be fragmented");
        }
        if (i9 >= 0 && i9 <= 125) {
            i8 = 2;
        } else {
            if (i7 == 4 || i7 == 5 || i7 == 6) {
                throw new C1080r4("more than 125 octets");
            }
            if (i9 != 126) {
                i8 = 10;
                if (remaining < 10) {
                    throw new a(10);
                }
                byte[] bArr = new byte[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    bArr[i10] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                if (longValue > 2147483647L) {
                    throw new C1094t4();
                }
                i9 = (int) longValue;
            } else {
                if (remaining < 4) {
                    throw new a(4);
                }
                i9 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i8 = 4;
            }
        }
        int i11 = i8 + (z7 ? 4 : 0) + i9;
        if (remaining < i11) {
            throw new a(i11);
        }
        if (i9 < 0) {
            throw new C1073q4(1002, "Negative count");
        }
        ByteBuffer allocate = ByteBuffer.allocate(i9);
        if (z7) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i12 = 0; i12 < i9; i12++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr2[i12 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        if (i7 == 6) {
            c1136z4 = new C1115w4();
        } else {
            c1136z4 = new C1136z4();
            c1136z4.f5646a = z6;
            c1136z4.f5647b = i7;
        }
        allocate.flip();
        c1136z4.mo3269e(allocate);
        if (i7 != 2 || C1004g5.m3031b(0, c1136z4.mo3270f())) {
            return c1136z4;
        }
        throw new C1073q4(1007);
    }

    @Override // p036e2.AbstractC1045m4
    /* renamed from: a */
    public C0969b5 mo3118a(C0969b5 c0969b5) {
        String str;
        c0969b5.m849d("Upgrade", "websocket");
        c0969b5.m849d("Connection", "Upgrade");
        c0969b5.m849d("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f5264d.nextBytes(bArr);
        try {
            str = C0391d0.m1357a(16, bArr);
        } catch (IOException unused) {
            str = null;
        }
        c0969b5.m849d("Sec-WebSocket-Key", str);
        return c0969b5;
    }

    @Override // p036e2.AbstractC1045m4
    /* renamed from: b */
    public final int mo3119b(C0969b5 c0969b5, InterfaceC0997f5 interfaceC0997f5) {
        String str;
        if (!c0969b5.mo847b("Sec-WebSocket-Key") || !interfaceC0997f5.mo847b("Sec-WebSocket-Accept")) {
            return 2;
        }
        String mo848c = interfaceC0997f5.mo848c("Sec-WebSocket-Accept");
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(C0089a.m210h(c0969b5.mo848c("Sec-WebSocket-Key").trim(), "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                str = C0391d0.m1357a(digest.length, digest);
            } catch (IOException unused) {
                str = null;
            }
            return str.equals(mo848c) ? 1 : 2;
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p036e2.AbstractC1045m4
    /* renamed from: d */
    public final List<InterfaceC1129y4> mo3120d(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f5263c == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f5263c.remaining();
                if (remaining2 > remaining) {
                    this.f5263c.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f5263c.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(m3123f((ByteBuffer) this.f5263c.duplicate().position(0)));
                this.f5263c = null;
            } catch (a e7) {
                this.f5263c.limit();
                int i7 = e7.f5265c;
                if (i7 < 0) {
                    throw new C1073q4(1002, "Negative count");
                }
                ByteBuffer allocate = ByteBuffer.allocate(i7);
                this.f5263c.rewind();
                allocate.put(this.f5263c);
                this.f5263c = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m3123f(byteBuffer));
            } catch (a e8) {
                byteBuffer.reset();
                int i8 = e8.f5265c;
                if (i8 < 0) {
                    throw new C1073q4(1002, "Negative count");
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i8);
                this.f5263c = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }
}
