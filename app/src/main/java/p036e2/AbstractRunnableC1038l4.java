package p036e2;

import android.ext.C0090b;
import androidx.activity.result.AbstractC0136c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: e2.l4 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1038l4 extends AbstractC0136c implements Runnable {

    /* renamed from: A1 */
    public final int f5230A1;

    /* renamed from: X */
    public InputStream f5231X;

    /* renamed from: Y */
    public OutputStream f5232Y;

    /* renamed from: e */
    public final URI f5234e;

    /* renamed from: m */
    public final C1024j4 f5235m;

    /* renamed from: w1 */
    public Thread f5237w1;

    /* renamed from: x1 */
    public final Map<String, String> f5238x1;

    /* renamed from: s */
    public Socket f5236s = null;

    /* renamed from: Z */
    public final Proxy f5233Z = Proxy.NO_PROXY;

    /* renamed from: y1 */
    public final CountDownLatch f5239y1 = new CountDownLatch(1);

    /* renamed from: z1 */
    public final CountDownLatch f5240z1 = new CountDownLatch(1);

    /* renamed from: e2.l4$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractRunnableC1038l4 abstractRunnableC1038l4 = AbstractRunnableC1038l4.this;
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) abstractRunnableC1038l4.f5235m.f5173a.take();
                    abstractRunnableC1038l4.f5232Y.write(byteBuffer.array(), 0, byteBuffer.limit());
                    abstractRunnableC1038l4.f5232Y.flush();
                } catch (IOException unused) {
                    abstractRunnableC1038l4.f5235m.m3067h();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public AbstractRunnableC1038l4(URI uri, C1059o4 c1059o4) {
        this.f5234e = null;
        this.f5235m = null;
        this.f5230A1 = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        this.f5234e = uri;
        this.f5238x1 = null;
        this.f5230A1 = 5000;
        this.f5235m = new C1024j4(this, c1059o4);
    }

    /* renamed from: A */
    public abstract void mo3106A(String str);

    /* renamed from: B */
    public abstract void mo3107B();

    /* renamed from: C */
    public final void m3108C(int i7, String str, boolean z6) {
        Thread thread = this.f5237w1;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.f5236s;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
            mo3107B();
        }
        mo3112z(i7, str, z6);
        this.f5239y1.countDown();
        this.f5240z1.countDown();
    }

    /* renamed from: D */
    public final int m3109D() {
        URI uri = this.f5234e;
        int port = uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = uri.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unknown scheme: ".concat(scheme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m3110E() {
        String mo3000a;
        URI uri = this.f5234e;
        String rawPath = uri.getRawPath();
        String rawQuery = uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + "?" + rawQuery;
        }
        int m3109D = m3109D();
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getHost());
        sb.append(m3109D != 80 ? C0090b.m219e(":", m3109D) : "");
        String sb2 = sb.toString();
        C0969b5 c0969b5 = new C0969b5();
        if (rawPath == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        c0969b5.f4975c = rawPath;
        c0969b5.m849d("Host", sb2);
        Map<String, String> map = this.f5238x1;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0969b5.m849d(entry.getKey(), entry.getValue());
            }
        }
        C1024j4 c1024j4 = this.f5235m;
        InterfaceC1031k4 interfaceC1031k4 = c1024j4.f5174b;
        c1024j4.f5181i = c1024j4.f5177e.mo3118a(c0969b5);
        try {
            interfaceC1031k4.getClass();
            C0969b5 c0969b52 = c1024j4.f5181i;
            StringBuilder sb3 = new StringBuilder(100);
            if (c0969b52 instanceof InterfaceC0962a5) {
                sb3.append("GET ");
                sb3.append(c0969b52.f4975c);
                mo3000a = " HTTP/1.1";
            } else {
                if (!(c0969b52 instanceof InterfaceC0997f5)) {
                    throw new RuntimeException("unknown role");
                }
                sb3.append("HTTP/1.1 101 ");
                mo3000a = ((InterfaceC0997f5) c0969b52).mo3000a();
            }
            sb3.append(mo3000a);
            sb3.append("\r\n");
            Iterator m850e = c0969b52.m850e();
            while (m850e.hasNext()) {
                String str = (String) m850e.next();
                String mo848c = c0969b52.mo848c(str);
                sb3.append(str);
                sb3.append(": ");
                sb3.append(mo848c);
                sb3.append("\r\n");
            }
            sb3.append("\r\n");
            String sb4 = sb3.toString();
            CodingErrorAction codingErrorAction = C1004g5.f5078a;
            try {
                byte[] bytes = sb4.getBytes("ASCII");
                byte[] bArr = (byte[]) c0969b52.f971a;
                ByteBuffer allocate = ByteBuffer.allocate((bArr == null ? 0 : bArr.length) + bytes.length);
                allocate.put(bytes);
                if (bArr != null) {
                    allocate.put(bArr);
                }
                allocate.flip();
                Iterator it = Collections.singletonList(allocate).iterator();
                while (it.hasNext()) {
                    c1024j4.f5173a.add((ByteBuffer) it.next());
                    c1024j4.f5174b.getClass();
                }
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException(e7);
            }
        } catch (C1073q4 unused) {
            throw new C1087s4("Handshake data rejected by client.");
        } catch (RuntimeException e8) {
            ((AbstractRunnableC1038l4) interfaceC1031k4).mo3107B();
            throw new C1087s4("rejected because of" + e8);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int read;
        C1024j4 c1024j4 = this.f5235m;
        try {
            Socket socket = this.f5236s;
            if (socket == null) {
                this.f5236s = new Socket(this.f5233Z);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f5236s.isBound()) {
                this.f5236s.connect(new InetSocketAddress(this.f5234e.getHost(), m3109D()), this.f5230A1);
            }
            this.f5231X = this.f5236s.getInputStream();
            this.f5232Y = this.f5236s.getOutputStream();
            m3110E();
            Thread thread = new Thread(new a());
            this.f5237w1 = thread;
            thread.start();
            byte[] bArr = new byte[C1024j4.f5172m];
            while (true) {
                try {
                    int i7 = c1024j4.f5176d;
                    boolean z6 = true;
                    if (!(i7 == 4)) {
                        if (i7 != 5) {
                            z6 = false;
                        }
                        if (z6 || (read = this.f5231X.read(bArr)) == -1) {
                            break;
                        } else {
                            c1024j4.m3065f(ByteBuffer.wrap(bArr, 0, read));
                        }
                    } else {
                        break;
                    }
                } catch (IOException unused) {
                    c1024j4.m3067h();
                    return;
                } catch (RuntimeException e7) {
                    mo3107B();
                    c1024j4.m3062c(1006, e7.getMessage(), false);
                    return;
                }
            }
            c1024j4.m3067h();
        } catch (Exception e8) {
            mo3107B();
            c1024j4.m3062c(-1, e8.getMessage(), false);
        }
    }

    /* renamed from: y */
    public abstract void mo3111y();

    /* renamed from: z */
    public abstract void mo3112z(int i7, String str, boolean z6);
}
