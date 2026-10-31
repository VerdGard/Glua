package p036e2;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;
import p036e2.C1119x1;
import p160u0.C1966c;

/* renamed from: e2.t1 */
/* loaded from: classes.dex */
public final class C1091t1 {

    /* renamed from: a */
    public final a f5440a;

    /* renamed from: b */
    public final b f5441b;

    /* renamed from: e2.t1$a */
    public interface a {
    }

    /* renamed from: e2.t1$b */
    public class b extends AbstractRunnableC1038l4 {
        public b(URI uri, Socket socket) {
            super(uri, new C1059o4());
            if (this.f5236s != null) {
                throw new IllegalStateException("socket has already been set");
            }
            this.f5236s = socket;
        }

        @Override // p036e2.AbstractRunnableC1038l4
        /* renamed from: A */
        public final void mo3106A(String str) {
            JSONObject jSONObject;
            int i7;
            if (TextUtils.isEmpty(str)) {
            }
            String str2 = null;
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return;
            }
            try {
                str2 = jSONObject.getString("type");
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (str2.equals("deploy")) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get("data");
                    a aVar = C1091t1.this.f5440a;
                    String jSONObject3 = jSONObject2.toString();
                    C1119x1 c1119x1 = C1119x1.this;
                    Message obtainMessage = c1119x1.f5563f.obtainMessage(24);
                    Bundle bundle = new Bundle();
                    bundle.putString("autoconfig.key", jSONObject3);
                    obtainMessage.setData(bundle);
                    c1119x1.f5563f.sendMessage(obtainMessage);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            }
            try {
                i7 = ((Integer) ((JSONObject) jSONObject.get("data")).get("status")).intValue();
            } catch (Exception unused4) {
                i7 = -1;
            }
            C1023j3 c1023j3 = C1023j3.f5170m;
            switch (i7) {
                case 801020:
                    c1023j3.m382g(3, "autotrace: connect established");
                    C1119x1.f5553E.m3282a(2, "");
                    break;
                case 801021:
                    c1023j3.m382g(3, "autotrace: connect failed, connect has been established");
                    C1119x1.f5553E.m3282a(5, "already connect");
                    break;
                case 801024:
                    c1023j3.m382g(3, "autotrace: connect confirm");
                    C1119x1.f5553E.m3282a(3, "");
                    a aVar2 = C1091t1.this.f5440a;
                    if (aVar2 != null) {
                        C1119x1 c1119x12 = C1119x1.this;
                        c1119x12.f5565h = true;
                        if (c1119x12.m3287f() && c1119x12.f5565h) {
                            c1119x12.f5583z.sendMessage(c1119x12.f5583z.obtainMessage(32));
                            c1119x12.f5564g.sendMessage(c1119x12.f5564g.obtainMessage(2));
                            break;
                        }
                    }
                    break;
            }
        }

        @Override // p036e2.AbstractRunnableC1038l4
        /* renamed from: B */
        public final void mo3107B() {
        }

        @Override // p036e2.AbstractRunnableC1038l4
        /* renamed from: y */
        public final void mo3111y() {
            a aVar = C1091t1.this.f5440a;
            if (aVar != null) {
                C1119x1 c1119x1 = C1119x1.this;
                if (c1119x1.f5566i) {
                    return;
                }
                c1119x1.f5563f.sendMessage(c1119x1.f5563f.obtainMessage(21));
            }
        }

        @Override // p036e2.AbstractRunnableC1038l4
        /* renamed from: z */
        public final void mo3112z(int i7, String str, boolean z6) {
            C1023j3.f5170m.m382g(3, "autotrace: connect closed, server:" + z6 + " reason:" + str);
            C1119x1.f5553E.m3282a(5, "remote:" + z6 + "|reason:" + str);
            a aVar = C1091t1.this.f5440a;
            if (aVar != null) {
                C1119x1 c1119x1 = C1119x1.this;
                c1119x1.f5565h = false;
                C1126y1.f5608c = "";
                c1119x1.f5564g.removeMessages(2);
                c1119x1.f5583z.sendMessage(c1119x1.f5583z.obtainMessage(33));
            }
        }
    }

    /* renamed from: e2.t1$c */
    public class c extends IOException {
        public c(InterruptedException interruptedException) {
            super(interruptedException.getMessage());
        }
    }

    static {
        ByteBuffer.allocate(0);
    }

    public C1091t1(URI uri, C1119x1.d dVar) {
        SSLSocketFactory sSLSocketFactory;
        this.f5440a = dVar;
        try {
            Socket socket = null;
            if (uri.toString().startsWith("wss://")) {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, null);
                    sSLSocketFactory = sSLContext.getSocketFactory();
                } catch (Exception unused) {
                    sSLSocketFactory = null;
                }
                if (sSLSocketFactory != null) {
                    try {
                        socket = sSLSocketFactory.createSocket();
                    } catch (Exception unused2) {
                    }
                }
            }
            b bVar = new b(uri, socket);
            this.f5441b = bVar;
            if (bVar.f5237w1 != null) {
                throw new IllegalStateException("WebSocketClient objects are not reuseable");
            }
            Thread thread = new Thread(bVar);
            bVar.f5237w1 = thread;
            thread.start();
            bVar.f5239y1.await();
            bVar.f5235m.getClass();
        } catch (InterruptedException e7) {
            throw new c(e7);
        }
    }

    /* renamed from: a */
    public final void m3218a(JSONObject jSONObject) {
        b bVar = this.f5441b;
        if (bVar != null) {
            byte[] bytes = jSONObject.toString().getBytes();
            C1024j4 c1024j4 = bVar.f5235m;
            c1024j4.getClass();
            ByteBuffer wrap = ByteBuffer.wrap(bytes);
            if (wrap == null) {
                throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
            }
            boolean z6 = c1024j4.f5178f == 1;
            ((C1052n4) c1024j4.f5177e).getClass();
            C1136z4 c1136z4 = new C1136z4();
            try {
                c1136z4.f5648c = wrap;
                c1136z4.f5646a = true;
                c1136z4.f5647b = 3;
                c1136z4.f5649d = z6;
                List singletonList = Collections.singletonList(c1136z4);
                if (!(c1024j4.f5176d == 3)) {
                    throw new C1101u4();
                }
                Iterator it = singletonList.iterator();
                while (it.hasNext()) {
                    c1024j4.m3063d((InterfaceC1129y4) it.next());
                }
            } catch (C1073q4 e7) {
                throw new C1966c(e7);
            }
        }
    }
}
