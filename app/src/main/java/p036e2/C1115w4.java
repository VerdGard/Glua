package p036e2;

import java.nio.ByteBuffer;

/* renamed from: e2.w4 */
/* loaded from: classes.dex */
public final class C1115w4 extends C1136z4 implements InterfaceC1108v4 {

    /* renamed from: h */
    public static final ByteBuffer f5531h = ByteBuffer.allocate(0);

    /* renamed from: f */
    public int f5532f;

    /* renamed from: g */
    public String f5533g;

    public C1115w4() {
        super(0);
        this.f5646a = true;
    }

    @Override // p036e2.InterfaceC1108v4
    /* renamed from: a */
    public final int mo3236a() {
        return this.f5532f;
    }

    @Override // p036e2.InterfaceC1108v4
    /* renamed from: d */
    public final String mo3237d() {
        return this.f5533g;
    }

    @Override // p036e2.C1136z4, p036e2.InterfaceC1122x4
    /* renamed from: e */
    public final void mo3269e(ByteBuffer byteBuffer) {
        this.f5648c = byteBuffer;
        this.f5532f = 1005;
        byteBuffer.mark();
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            int i7 = allocate.getInt();
            this.f5532f = i7;
            if (i7 == 1006 || i7 == 1015 || i7 == 1005 || i7 > 4999 || i7 < 1000 || i7 == 1004) {
                throw new C1080r4("closecode must not be sent over the wire: " + this.f5532f);
            }
        }
        byteBuffer.reset();
        if (this.f5532f == 1005) {
            this.f5533g = C1004g5.m3030a(this.f5648c);
            return;
        }
        ByteBuffer byteBuffer2 = this.f5648c;
        int position = byteBuffer2.position();
        try {
            try {
                byteBuffer2.position(byteBuffer2.position() + 2);
                this.f5533g = C1004g5.m3030a(byteBuffer2);
            } catch (IllegalArgumentException e7) {
                throw new C1080r4(e7);
            }
        } finally {
            byteBuffer2.position(position);
        }
    }

    @Override // p036e2.C1136z4, p036e2.InterfaceC1129y4
    /* renamed from: f */
    public final ByteBuffer mo3270f() {
        return this.f5532f == 1005 ? f5531h : this.f5648c;
    }

    @Override // p036e2.C1136z4
    public final String toString() {
        return super.toString() + "code: " + this.f5532f;
    }

    public C1115w4(int i7, String str) {
        super(0);
        this.f5646a = true;
        String str2 = "";
        str = str == null ? "" : str;
        if (i7 == 1015) {
            i7 = 1005;
        } else {
            str2 = str;
        }
        if (i7 == 1005) {
            if (str2.length() > 0) {
                throw new C1073q4(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        if (i7 > 1011 && i7 < 3000 && i7 != 1015) {
            throw new C1073q4(1002, "Trying to send an illegal close code!");
        }
        byte[] m3032c = C1004g5.m3032c(str2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i7);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(m3032c.length + 2);
        allocate2.put(allocate);
        allocate2.put(m3032c);
        allocate2.rewind();
        mo3269e(allocate2);
    }
}
