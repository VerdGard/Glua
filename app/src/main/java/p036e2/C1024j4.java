package p036e2;

import android.ext.C0089a;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: e2.j4 */
/* loaded from: classes.dex */
public final class C1024j4 {

    /* renamed from: m */
    public static final int f5172m;

    /* renamed from: a */
    public final LinkedBlockingQueue f5173a;

    /* renamed from: b */
    public final InterfaceC1031k4 f5174b;

    /* renamed from: e */
    public final AbstractC1045m4 f5177e;

    /* renamed from: f */
    public final int f5178f;

    /* renamed from: c */
    public volatile boolean f5175c = false;

    /* renamed from: d */
    public int f5176d = 1;

    /* renamed from: g */
    public InterfaceC1129y4 f5179g = null;

    /* renamed from: h */
    public ByteBuffer f5180h = ByteBuffer.allocate(0);

    /* renamed from: i */
    public C0969b5 f5181i = null;

    /* renamed from: j */
    public String f5182j = null;

    /* renamed from: k */
    public Integer f5183k = null;

    /* renamed from: l */
    public Boolean f5184l = null;

    static {
        ArrayList arrayList = new ArrayList(4);
        f5172m = 16384;
        arrayList.add(new C1059o4());
        arrayList.add(new C1052n4());
    }

    public C1024j4(InterfaceC1031k4 interfaceC1031k4, C1059o4 c1059o4) {
        this.f5177e = null;
        if (interfaceC1031k4 == null) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f5173a = new LinkedBlockingQueue();
        new LinkedBlockingQueue();
        this.f5174b = interfaceC1031k4;
        this.f5178f = 1;
        this.f5177e = new C1059o4();
    }

    /* renamed from: k */
    public static int m3059k(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = AbstractC1045m4.f5249b;
        if (limit > bArr.length) {
            return 2;
        }
        if (byteBuffer.limit() < bArr.length) {
            throw new C1066p4(bArr.length);
        }
        int i7 = 0;
        while (byteBuffer.hasRemaining()) {
            if (AbstractC1045m4.f5249b[i7] != byteBuffer.get()) {
                byteBuffer.reset();
                return 2;
            }
            i7++;
        }
        return 1;
    }

    /* renamed from: a */
    public final InetSocketAddress m3060a() {
        Socket socket = ((AbstractRunnableC1038l4) this.f5174b).f5236s;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    /* renamed from: b */
    public final void m3061b(int i7) {
        m3062c(i7, "", true);
    }

    /* renamed from: c */
    public final synchronized void m3062c(int i7, String str, boolean z6) {
        if (this.f5176d == 5) {
            return;
        }
        try {
            ((AbstractRunnableC1038l4) this.f5174b).m3108C(i7, str, z6);
        } catch (RuntimeException unused) {
            ((AbstractRunnableC1038l4) this.f5174b).mo3107B();
        }
        AbstractC1045m4 abstractC1045m4 = this.f5177e;
        if (abstractC1045m4 != null) {
            ((C1052n4) abstractC1045m4).f5263c = null;
        }
        this.f5181i = null;
        this.f5176d = 5;
        this.f5173a.clear();
    }

    /* renamed from: d */
    public final void m3063d(InterfaceC1129y4 interfaceC1129y4) {
        byte b7;
        int i7;
        C1052n4 c1052n4 = (C1052n4) this.f5177e;
        c1052n4.getClass();
        ByteBuffer mo3270f = interfaceC1129y4.mo3270f();
        int i8 = 0;
        boolean z6 = c1052n4.f5250a == 1;
        int i9 = mo3270f.remaining() <= 125 ? 1 : mo3270f.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate(mo3270f.remaining() + (i9 > 1 ? i9 + 1 : i9) + 1 + (z6 ? 4 : 0));
        int mo3307g = interfaceC1129y4.mo3307g();
        if (mo3307g == 1) {
            b7 = 0;
        } else if (mo3307g == 2) {
            b7 = 1;
        } else if (mo3307g == 3) {
            b7 = 2;
        } else if (mo3307g == 6) {
            b7 = 8;
        } else if (mo3307g == 4) {
            b7 = 9;
        } else {
            if (mo3307g != 5) {
                throw new RuntimeException("Don't know how to handle ".concat(C0089a.m211i(mo3307g)));
            }
            b7 = 10;
        }
        allocate.put((byte) (b7 | ((byte) (interfaceC1129y4.mo3308h() ? -128 : 0))));
        long remaining = mo3270f.remaining();
        byte[] bArr = new byte[i9];
        int i10 = (i9 * 8) - 8;
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) (remaining >>> (i10 - (i11 * 8)));
        }
        if (i9 == 1) {
            allocate.put((byte) (bArr[0] | (z6 ? Byte.MIN_VALUE : (byte) 0)));
        } else {
            if (i9 == 2) {
                i7 = (z6 ? -128 : 0) | 126;
            } else {
                if (i9 != 8) {
                    throw new RuntimeException("Size representation not supported/specified");
                }
                i7 = (z6 ? -128 : 0) | 127;
            }
            allocate.put((byte) i7);
            allocate.put(bArr);
        }
        if (z6) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(c1052n4.f5264d.nextInt());
            allocate.put(allocate2.array());
            while (mo3270f.hasRemaining()) {
                allocate.put((byte) (mo3270f.get() ^ allocate2.get(i8 % 4)));
                i8++;
            }
        } else {
            allocate.put(mo3270f);
        }
        allocate.flip();
        this.f5173a.add(allocate);
        this.f5174b.getClass();
    }

    /* renamed from: e */
    public final void m3064e(InterfaceC0997f5 interfaceC0997f5) {
        InterfaceC1031k4 interfaceC1031k4 = this.f5174b;
        this.f5176d = 3;
        try {
            AbstractRunnableC1038l4 abstractRunnableC1038l4 = (AbstractRunnableC1038l4) interfaceC1031k4;
            abstractRunnableC1038l4.getClass();
            abstractRunnableC1038l4.mo3111y();
            abstractRunnableC1038l4.f5239y1.countDown();
        } catch (RuntimeException unused) {
            ((AbstractRunnableC1038l4) interfaceC1031k4).mo3107B();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(1:5)(3:53|(1:55)|56)|6|(3:8|9|(4:11|12|13|(2:15|(2:17|(1:19)(1:20)))(1:22)))|33|34|(2:36|(1:38)(2:39|(4:42|43|44|(0)(0))(1:41)))|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        m3068i(r0.f5359c, r0.getMessage(), false);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3065f(java.nio.ByteBuffer r10) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1024j4.m3065f(java.nio.ByteBuffer):void");
    }

    /* renamed from: g */
    public final synchronized void m3066g(int i7, String str, boolean z6) {
        if (this.f5175c) {
            return;
        }
        this.f5183k = Integer.valueOf(i7);
        this.f5182j = str;
        this.f5184l = Boolean.valueOf(z6);
        this.f5175c = true;
        this.f5174b.getClass();
        try {
            this.f5174b.getClass();
        } catch (RuntimeException unused) {
            ((AbstractRunnableC1038l4) this.f5174b).mo3107B();
        }
        AbstractC1045m4 abstractC1045m4 = this.f5177e;
        if (abstractC1045m4 != null) {
            ((C1052n4) abstractC1045m4).f5263c = null;
        }
        this.f5181i = null;
    }

    /* renamed from: h */
    public final void m3067h() {
        int i7;
        if (this.f5176d == 1) {
            i7 = -1;
        } else if (this.f5175c) {
            m3062c(this.f5183k.intValue(), this.f5182j, this.f5184l.booleanValue());
            return;
        } else {
            this.f5177e.getClass();
            this.f5177e.getClass();
            i7 = 1006;
        }
        m3061b(i7);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final void m3068i(int i7, String str, boolean z6) {
        int i8 = this.f5176d;
        if (i8 == 4 || i8 == 5) {
            return;
        }
        if (i8 == 3) {
            if (i7 == 1006) {
                this.f5176d = 4;
                m3066g(i7, str, false);
                return;
            }
            this.f5177e.getClass();
            InterfaceC1031k4 interfaceC1031k4 = this.f5174b;
            try {
                if (!z6) {
                    try {
                        interfaceC1031k4.getClass();
                    } catch (RuntimeException unused) {
                        ((AbstractRunnableC1038l4) interfaceC1031k4).mo3107B();
                    }
                }
                m3063d(new C1115w4(i7, str));
            } catch (C1073q4 unused2) {
                ((AbstractRunnableC1038l4) interfaceC1031k4).mo3107B();
                m3066g(1006, "generated frame is invalid", false);
            }
            m3066g(i7, str, z6);
        } else if (i7 == -3) {
            m3066g(-3, str, true);
        } else {
            m3066g(-1, str, false);
        }
        if (i7 == 1002) {
            m3066g(i7, str, z6);
        }
        this.f5176d = 4;
        this.f5180h = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        r3 = r10.f5179g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        if (r3.mo3307g() != 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        r3 = java.lang.Math.max(r10.f5179g.mo3270f().limit() - 64, 0);
        r10.f5179g.mo3306c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        if (p036e2.C1004g5.m3031b(r3, r10.f5179g.mo3270f()) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        throw new p036e2.C1073q4(1007);
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3069j(java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1024j4.m3069j(java.nio.ByteBuffer):void");
    }

    public final String toString() {
        return super.toString();
    }
}
