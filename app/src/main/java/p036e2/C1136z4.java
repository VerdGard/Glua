package p036e2;

import android.ext.C0089a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: e2.z4 */
/* loaded from: classes.dex */
public class C1136z4 implements InterfaceC1122x4 {

    /* renamed from: e */
    public static final byte[] f5645e = new byte[0];

    /* renamed from: a */
    public boolean f5646a;

    /* renamed from: b */
    public int f5647b;

    /* renamed from: c */
    public ByteBuffer f5648c;

    /* renamed from: d */
    public boolean f5649d;

    public C1136z4() {
    }

    public C1136z4(int i7) {
        this.f5647b = 6;
        this.f5648c = ByteBuffer.wrap(f5645e);
    }

    public C1136z4(InterfaceC1129y4 interfaceC1129y4) {
        this.f5646a = interfaceC1129y4.mo3308h();
        this.f5647b = interfaceC1129y4.mo3307g();
        this.f5648c = interfaceC1129y4.mo3270f();
        this.f5649d = interfaceC1129y4.mo3305b();
    }

    @Override // p036e2.InterfaceC1129y4
    /* renamed from: b */
    public final boolean mo3305b() {
        return this.f5649d;
    }

    @Override // p036e2.InterfaceC1129y4
    /* renamed from: c */
    public final void mo3306c(InterfaceC1129y4 interfaceC1129y4) {
        ByteBuffer mo3270f = interfaceC1129y4.mo3270f();
        if (this.f5648c == null) {
            this.f5648c = ByteBuffer.allocate(mo3270f.remaining());
            mo3270f.mark();
            this.f5648c.put(mo3270f);
        } else {
            mo3270f.mark();
            ByteBuffer byteBuffer = this.f5648c;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f5648c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (mo3270f.remaining() > this.f5648c.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f5648c.capacity() + mo3270f.remaining());
                this.f5648c.flip();
                allocate.put(this.f5648c);
                allocate.put(mo3270f);
                this.f5648c = allocate;
            } else {
                this.f5648c.put(mo3270f);
            }
            this.f5648c.rewind();
        }
        mo3270f.reset();
        this.f5646a = interfaceC1129y4.mo3308h();
    }

    @Override // p036e2.InterfaceC1122x4
    /* renamed from: e */
    public void mo3269e(ByteBuffer byteBuffer) {
        this.f5648c = byteBuffer;
    }

    @Override // p036e2.InterfaceC1129y4
    /* renamed from: f */
    public ByteBuffer mo3270f() {
        return this.f5648c;
    }

    @Override // p036e2.InterfaceC1129y4
    /* renamed from: g */
    public final int mo3307g() {
        return this.f5647b;
    }

    @Override // p036e2.InterfaceC1129y4
    /* renamed from: h */
    public final boolean mo3308h() {
        return this.f5646a;
    }

    public String toString() {
        return "Framedata{ optcode:" + C0089a.m213k(this.f5647b) + ", fin:" + this.f5646a + ", payloadlength:[pos:" + this.f5648c.position() + ", len:" + this.f5648c.remaining() + "], payload:" + Arrays.toString(C1004g5.m3032c(new String(this.f5648c.array()))) + "}";
    }
}
