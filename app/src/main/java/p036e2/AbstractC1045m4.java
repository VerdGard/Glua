package p036e2;

import android.ext.Tools;
import androidx.appcompat.widget.C0246m;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: e2.m4 */
/* loaded from: classes.dex */
public abstract class AbstractC1045m4 {

    /* renamed from: b */
    public static final byte[] f5249b = C1004g5.m3032c("<policy-file-request/>\u0000");

    /* renamed from: a */
    public int f5250a = 0;

    /* renamed from: c */
    public static String m3117c(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b7 = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b8 = byteBuffer.get();
            allocate.put(b8);
            if (b7 == 13 && b8 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b7 = b8;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = C1004g5.f5078a;
        try {
            return new String(array, 0, limit, "ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: a */
    public abstract C0969b5 mo3118a(C0969b5 c0969b5);

    /* renamed from: b */
    public abstract int mo3119b(C0969b5 c0969b5, InterfaceC0997f5 interfaceC0997f5);

    /* renamed from: d */
    public abstract List<InterfaceC1129y4> mo3120d(ByteBuffer byteBuffer);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final C0246m m3121e(ByteBuffer byteBuffer) {
        C0969b5 c0969b5;
        String m3117c;
        int i7 = this.f5250a;
        String m3117c2 = m3117c(byteBuffer);
        if (m3117c2 == null) {
            throw new C1066p4(byteBuffer.capacity() + Tools.Semaphore.f159S7);
        }
        String[] split = m3117c2.split(" ", 3);
        if (split.length != 3) {
            throw new C1087s4();
        }
        if (i7 == 1) {
            C0976c5 c0976c5 = new C0976c5();
            Short.parseShort(split[1]);
            c0976c5.f4997c = split[2];
            c0969b5 = c0976c5;
        } else {
            C0969b5 c0969b52 = new C0969b5();
            String str = split[1];
            if (str == null) {
                throw new IllegalArgumentException("http resource descriptor must not be null");
            }
            c0969b52.f4975c = str;
            c0969b5 = c0969b52;
        }
        while (true) {
            m3117c = m3117c(byteBuffer);
            if (m3117c == null || m3117c.length() <= 0) {
                break;
            }
            String[] split2 = m3117c.split(":", 2);
            if (split2.length != 2) {
                throw new C1087s4("not an http header");
            }
            c0969b5.m849d(split2[0], split2[1].replaceFirst("^ +", ""));
        }
        if (m3117c != null) {
            return c0969b5;
        }
        throw new C1066p4();
    }
}
