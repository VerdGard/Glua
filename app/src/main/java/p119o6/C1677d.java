package p119o6;

import androidx.activity.C0143v;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import p126p6.C1709c;

/* renamed from: o6.d */
/* loaded from: classes.dex */
public final class C1677d {
    /* renamed from: a */
    public static C1709c m4064a() {
        String str;
        C1709c c1709c = new C1709c();
        C0143v.m422T("https://gameguardian.net/help/classgg.html", "Must supply a valid URL");
        try {
            C1709c.b bVar = c1709c.f7691a;
            try {
                URL url = new URL("https://gameguardian.net/help/classgg.html");
                try {
                    url = new URL(new URI(url.toExternalForm().replaceAll(" ", "%20")).toASCIIString());
                } catch (Exception unused) {
                }
                str = url.toExternalForm();
            } catch (Exception unused2) {
                str = "https://gameguardian.net/help/classgg.html";
            }
            URL url2 = new URL(str);
            bVar.getClass();
            bVar.f7692a = url2;
            return c1709c;
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Malformed URL: ".concat("https://gameguardian.net/help/classgg.html"), e7);
        }
    }
}
