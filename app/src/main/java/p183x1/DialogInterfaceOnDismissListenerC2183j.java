package p183x1;

import android.content.DialogInterface;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1988f;
import p165u6.C1998p;
import p165u6.C1999q;
import p175w1.AbstractC2084e;
import p175w1.C2083d0;
import p175w1.C2101m0;

/* renamed from: x1.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2183j extends AbstractC2084e implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

    /* renamed from: j2 */
    public volatile byte f9905j2 = 1;

    /* renamed from: x1.j$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: K2 */
    public static C1999q m5320K2(HttpURLConnection httpURLConnection) {
        C1999q c1999q = new C1999q();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                key = "null";
            }
            List<String> value = entry.getValue();
            C1999q c1999q2 = new C1999q();
            c1999q2.mo4778L1(value.size());
            Iterator<String> it = value.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                c1999q2.mo4785S2(i7, C1998p.m4815M2(it.next()));
                i7++;
            }
            c1999q.mo4787V1(C1998p.m4815M2(key), c1999q2);
        }
        return c1999q;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        InputStream errorStream;
        String m4649x = abstractC1984c0.m4649x(1);
        C1999q mo4773F1 = abstractC1984c0.mo4623t(2).mo4773F1();
        if (mo4773F1 == null) {
            mo4773F1 = new C1999q();
        }
        C1998p mo4702E1 = abstractC1984c0.mo4623t(3).mo4702E1();
        if (this.f9905j2 == 0) {
            synchronized (this) {
                C2101m0.m5155a(0, new a());
                C2083d0.m5142N2(this);
            }
        }
        if (this.f9905j2 != 1) {
            return C1998p.m4815M2("The user did not allow access to the Internet.");
        }
        try {
            C1999q c1999q = new C1999q();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m4649x).openConnection();
            C1999q.d dVar = mo4773F1.new d(mo4773F1);
            while (dVar.m4845b()) {
                AbstractC2003u m4844a = dVar.m4844a();
                AbstractC2003u m4846c = dVar.m4846c();
                if (m4846c instanceof C1999q) {
                    String mo4742n0 = m4844a.mo4742n0();
                    C1999q mo4795t0 = m4846c.mo4795t0();
                    mo4795t0.getClass();
                    C1999q.d dVar2 = mo4795t0.new d(mo4795t0);
                    while (dVar2.m4845b()) {
                        httpURLConnection.addRequestProperty(mo4742n0, dVar2.m4846c().mo4742n0());
                    }
                } else {
                    httpURLConnection.addRequestProperty(m4844a.mo4742n0(), m4846c.mo4742n0());
                }
            }
            if (mo4702E1 != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                int i7 = mo4702E1.f9041e2;
                if (httpURLConnection.getRequestProperty("Content-Length") == null) {
                    httpURLConnection.addRequestProperty("Content-Length", Integer.toString(i7));
                }
                if (httpURLConnection.getRequestProperty("Content-Type") == null) {
                    httpURLConnection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(mo4702E1.f9039c2, mo4702E1.f9040d2, i7);
                mo4702E1 = null;
                outputStream.flush();
            } else {
                httpURLConnection.connect();
            }
            c1999q.m4875U1("url", m4649x);
            c1999q.m4875U1("requestMethod", httpURLConnection.getRequestMethod() + "");
            c1999q.m4875U1("code", httpURLConnection.getResponseCode() + "");
            c1999q.m4875U1("message", httpURLConnection.getResponseMessage() + "");
            c1999q.m4875U1("headers", m5320K2(httpURLConnection) + "");
            c1999q.m4875U1("contentEncoding", httpURLConnection.getContentEncoding() + "");
            c1999q.m4875U1("contentLength", httpURLConnection.getContentLength() + "");
            c1999q.m4875U1("contentType", httpURLConnection.getContentType() + "");
            c1999q.m4875U1("date", httpURLConnection.getDate() + "");
            c1999q.m4875U1("expiration", httpURLConnection.getExpiration() + "");
            c1999q.m4875U1("lastModified", httpURLConnection.getLastModified() + "");
            boolean usingProxy = httpURLConnection.usingProxy();
            C1988f c1988f = AbstractC2003u.f9131s;
            c1999q.mo4787V1(C1998p.m4815M2("usingProxy"), usingProxy ? c1988f : AbstractC2003u.f9122X);
            if (httpURLConnection instanceof HttpsURLConnection) {
                c1999q.m4875U1("cipherSuite", ((HttpsURLConnection) httpURLConnection).getCipherSuite());
            }
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
                c1999q.mo4787V1(C1998p.m4815M2("error"), c1988f);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    c1999q.mo4790Y1(C1998p.m4815M2("content"), C1998p.m4816N2(byteArray, 0, byteArray.length));
                    httpURLConnection.disconnect();
                    return c1999q;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            return C1998p.m4815M2(th.getMessage() + "\n" + ("makeRequest fail for '" + m4649x + "'; data = " + mo4702E1 + "; headers = " + mo4773F1));
        }
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.makeRequest(string url [, table headers = {} [, string data = nil]]) -> table || string";
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9905j2 = (byte) 1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.f9905j2 == 0) {
                this.f9905j2 = (byte) 2;
            }
            notify();
        }
    }
}
