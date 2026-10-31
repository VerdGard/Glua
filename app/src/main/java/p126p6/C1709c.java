package p126p6;

import android.ext.C0091c;
import androidx.activity.C0143v;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p047f5.C1175f;
import p119o6.InterfaceC1674a;
import p119o6.InterfaceC1675b;
import p134q6.C1806b;
import p150s6.C1906b;
import p150s6.C1910f;

/* renamed from: p6.c */
/* loaded from: classes.dex */
public final class C1709c {

    /* renamed from: a */
    public final b f7691a = new b();

    /* renamed from: p6.c$a */
    public static abstract class a<T> {

        /* renamed from: a */
        public URL f7692a;

        /* renamed from: b */
        public int f7693b;

        /* renamed from: c */
        public final LinkedHashMap f7694c = new LinkedHashMap();

        /* renamed from: d */
        public final LinkedHashMap f7695d = new LinkedHashMap();

        /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: UnsupportedEncodingException -> 0x0090, TryCatch #0 {UnsupportedEncodingException -> 0x0090, blocks: (B:8:0x001e, B:10:0x002a, B:12:0x0032, B:15:0x003d, B:18:0x0049, B:21:0x004e, B:23:0x0051, B:27:0x0082, B:28:0x0058, B:30:0x005e, B:31:0x0072, B:43:0x0088, B:34:0x0078, B:50:0x0061, B:52:0x0067, B:53:0x006a, B:55:0x0070), top: B:7:0x001e }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0088 A[Catch: UnsupportedEncodingException -> 0x0090, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0090, blocks: (B:8:0x001e, B:10:0x002a, B:12:0x0032, B:15:0x003d, B:18:0x0049, B:21:0x004e, B:23:0x0051, B:27:0x0082, B:28:0x0058, B:30:0x005e, B:31:0x0072, B:43:0x0088, B:34:0x0078, B:50:0x0061, B:52:0x0067, B:53:0x006a, B:55:0x0070), top: B:7:0x001e }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0084 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m4137a(java.lang.String r10, java.lang.String r11) {
            /*
                r9 = this;
                androidx.activity.C0143v.m421S(r10)
                if (r11 != 0) goto L7
                java.lang.String r11 = ""
            L7:
                androidx.activity.C0143v.m421S(r10)
                java.util.List r0 = r9.m4138b(r10)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashMap r1 = r9.f7694c
                r1.put(r10, r0)
            L1e:
                java.lang.String r10 = "ISO-8859-1"
                byte[] r10 = r11.getBytes(r10)     // Catch: java.io.UnsupportedEncodingException -> L90
                int r1 = r10.length     // Catch: java.io.UnsupportedEncodingException -> L90
                r2 = 3
                r3 = 0
                r4 = 1
                if (r1 < r2) goto L4d
                r1 = r10[r3]     // Catch: java.io.UnsupportedEncodingException -> L90
                r1 = r1 & 255(0xff, float:3.57E-43)
                r5 = 239(0xef, float:3.35E-43)
                if (r1 != r5) goto L4d
                r1 = r10[r4]     // Catch: java.io.UnsupportedEncodingException -> L90
                r1 = r1 & 255(0xff, float:3.57E-43)
                r5 = 187(0xbb, float:2.62E-43)
                if (r1 != r5) goto L3c
                r1 = 1
                goto L3d
            L3c:
                r1 = 0
            L3d:
                r5 = 2
                r5 = r10[r5]     // Catch: java.io.UnsupportedEncodingException -> L90
                r5 = r5 & 255(0xff, float:3.57E-43)
                r6 = 191(0xbf, float:2.68E-43)
                if (r5 != r6) goto L48
                r5 = 1
                goto L49
            L48:
                r5 = 0
            L49:
                r1 = r1 & r5
                if (r1 == 0) goto L4d
                goto L4e
            L4d:
                r2 = 0
            L4e:
                int r1 = r10.length     // Catch: java.io.UnsupportedEncodingException -> L90
            L4f:
                if (r2 >= r1) goto L84
                r5 = r10[r2]     // Catch: java.io.UnsupportedEncodingException -> L90
                r6 = r5 & 128(0x80, float:1.794E-43)
                if (r6 != 0) goto L58
                goto L82
            L58:
                r6 = r5 & 224(0xe0, float:3.14E-43)
                r7 = 192(0xc0, float:2.69E-43)
                if (r6 != r7) goto L61
                int r5 = r2 + 1
                goto L72
            L61:
                r6 = r5 & 240(0xf0, float:3.36E-43)
                r8 = 224(0xe0, float:3.14E-43)
                if (r6 != r8) goto L6a
                int r5 = r2 + 2
                goto L72
            L6a:
                r5 = r5 & 248(0xf8, float:3.48E-43)
                r6 = 240(0xf0, float:3.36E-43)
                if (r5 != r6) goto L85
                int r5 = r2 + 3
            L72:
                int r6 = r10.length     // Catch: java.io.UnsupportedEncodingException -> L90
                if (r5 < r6) goto L76
                goto L85
            L76:
                if (r2 >= r5) goto L82
                int r2 = r2 + 1
                r6 = r10[r2]     // Catch: java.io.UnsupportedEncodingException -> L90
                r6 = r6 & r7
                r8 = 128(0x80, float:1.794E-43)
                if (r6 == r8) goto L76
                goto L85
            L82:
                int r2 = r2 + r4
                goto L4f
            L84:
                r3 = 1
            L85:
                if (r3 != 0) goto L88
                goto L90
            L88:
                java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L90
                java.lang.String r2 = "UTF-8"
                r1.<init>(r10, r2)     // Catch: java.io.UnsupportedEncodingException -> L90
                r11 = r1
            L90:
                r0.add(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p126p6.C1709c.a.m4137a(java.lang.String, java.lang.String):void");
        }

        /* renamed from: b */
        public final List<String> m4138b(String str) {
            for (Map.Entry entry : this.f7694c.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    return (List) entry.getValue();
                }
            }
            return Collections.emptyList();
        }

        /* renamed from: c */
        public final boolean m4139c(String str) {
            C0143v.m421S("Content-Encoding");
            C0143v.m421S(str);
            C0143v.m421S("Content-Encoding");
            Iterator<String> it = m4138b("Content-Encoding").iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final String m4140d(String str) {
            List<String> m4138b = m4138b(str);
            if (m4138b.size() > 0) {
                return C1806b.m4262f(m4138b, ", ");
            }
            return null;
        }

        /* renamed from: e */
        public final a m4141e(String str) {
            Map.Entry entry;
            C0143v.m422T(str, "Header name must not be empty");
            String m418P = C0143v.m418P(str);
            LinkedHashMap linkedHashMap = this.f7694c;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    entry = null;
                    break;
                }
                entry = (Map.Entry) it.next();
                if (C0143v.m418P((String) entry.getKey()).equals(m418P)) {
                    break;
                }
            }
            if (entry != null) {
                linkedHashMap.remove(entry.getKey());
            }
            return this;
        }
    }

    /* renamed from: p6.c$b */
    public static class b extends a<InterfaceC1675b> implements InterfaceC1675b {

        /* renamed from: j */
        public C1910f f7701j;

        /* renamed from: i */
        public String f7700i = null;

        /* renamed from: k */
        public boolean f7702k = false;

        /* renamed from: l */
        public final String f7703l = "UTF-8";

        /* renamed from: e */
        public final int f7696e = 30000;

        /* renamed from: f */
        public final int f7697f = 1048576;

        /* renamed from: g */
        public final boolean f7698g = true;

        /* renamed from: h */
        public final ArrayList f7699h = new ArrayList();

        public b() {
            this.f7693b = 1;
            m4137a("Accept-Encoding", "gzip");
            m4137a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            this.f7701j = new C1910f(new C1906b());
        }
    }

    /* renamed from: p6.c$c */
    public static class c extends a<Object> {

        /* renamed from: n */
        public static final Pattern f7704n = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: e */
        public ByteBuffer f7705e;

        /* renamed from: f */
        public InputStream f7706f;

        /* renamed from: g */
        public HttpURLConnection f7707g;

        /* renamed from: h */
        public String f7708h;

        /* renamed from: i */
        public String f7709i;

        /* renamed from: j */
        public boolean f7710j;

        /* renamed from: k */
        public boolean f7711k;

        /* renamed from: l */
        public final int f7712l;

        /* renamed from: m */
        public InterfaceC1675b f7713m;

        public c() {
            this.f7710j = false;
            this.f7711k = false;
            this.f7712l = 0;
        }

        public c(c cVar) {
            this.f7710j = false;
            this.f7711k = false;
            this.f7712l = 0;
            if (cVar != null) {
                int i7 = cVar.f7712l + 1;
                this.f7712l = i7;
                if (i7 >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", cVar.f7692a));
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:113:0x0319, code lost:
        
            if (r2.matcher(r1).matches() == false) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x031d, code lost:
        
            if (r16.f7702k != false) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x031f, code lost:
        
            r16.f7701j = new p150s6.C1910f(new p150s6.C1916l());
            r16.f7702k = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0383 A[Catch: IOException -> 0x03b1, TryCatch #1 {IOException -> 0x03b1, blocks: (B:66:0x0225, B:68:0x022e, B:69:0x0235, B:74:0x0256, B:78:0x025e, B:79:0x0270, B:81:0x027c, B:83:0x0284, B:84:0x0288, B:88:0x02a9, B:89:0x02b5, B:91:0x02bb, B:93:0x02dd, B:101:0x02ea, B:104:0x02f0, B:106:0x02f8, B:109:0x0303, B:110:0x030e, B:112:0x0311, B:114:0x031b, B:116:0x031f, B:117:0x032d, B:119:0x033b, B:121:0x033f, B:123:0x0348, B:124:0x0351, B:126:0x035b, B:127:0x0377, B:128:0x0379, B:130:0x0383, B:131:0x038c, B:134:0x0386, B:135:0x0363, B:137:0x036b, B:138:0x034d, B:139:0x039b, B:140:0x03a5, B:141:0x03b0), top: B:65:0x0225 }] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0386 A[Catch: IOException -> 0x03b1, TryCatch #1 {IOException -> 0x03b1, blocks: (B:66:0x0225, B:68:0x022e, B:69:0x0235, B:74:0x0256, B:78:0x025e, B:79:0x0270, B:81:0x027c, B:83:0x0284, B:84:0x0288, B:88:0x02a9, B:89:0x02b5, B:91:0x02bb, B:93:0x02dd, B:101:0x02ea, B:104:0x02f0, B:106:0x02f8, B:109:0x0303, B:110:0x030e, B:112:0x0311, B:114:0x031b, B:116:0x031f, B:117:0x032d, B:119:0x033b, B:121:0x033f, B:123:0x0348, B:124:0x0351, B:126:0x035b, B:127:0x0377, B:128:0x0379, B:130:0x0383, B:131:0x038c, B:134:0x0386, B:135:0x0363, B:137:0x036b, B:138:0x034d, B:139:0x039b, B:140:0x03a5, B:141:0x03b0), top: B:65:0x0225 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x022e A[Catch: IOException -> 0x03b1, TryCatch #1 {IOException -> 0x03b1, blocks: (B:66:0x0225, B:68:0x022e, B:69:0x0235, B:74:0x0256, B:78:0x025e, B:79:0x0270, B:81:0x027c, B:83:0x0284, B:84:0x0288, B:88:0x02a9, B:89:0x02b5, B:91:0x02bb, B:93:0x02dd, B:101:0x02ea, B:104:0x02f0, B:106:0x02f8, B:109:0x0303, B:110:0x030e, B:112:0x0311, B:114:0x031b, B:116:0x031f, B:117:0x032d, B:119:0x033b, B:121:0x033f, B:123:0x0348, B:124:0x0351, B:126:0x035b, B:127:0x0377, B:128:0x0379, B:130:0x0383, B:131:0x038c, B:134:0x0386, B:135:0x0363, B:137:0x036b, B:138:0x034d, B:139:0x039b, B:140:0x03a5, B:141:0x03b0), top: B:65:0x0225 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static p126p6.C1709c.c m4142f(p126p6.C1709c.b r16, p126p6.C1709c.c r17) {
            /*
                Method dump skipped, instructions count: 950
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p126p6.C1709c.c.m4142f(p6.c$b, p6.c$c):p6.c$c");
        }

        /* renamed from: h */
        public static void m4143h(b bVar, OutputStream outputStream, String str) {
            ArrayList arrayList = bVar.f7699h;
            String str2 = bVar.f7703l;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str2));
            if (str != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC1674a interfaceC1674a = (InterfaceC1674a) it.next();
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    String m4060a = interfaceC1674a.m4060a();
                    bufferedWriter.write(m4060a == null ? null : m4060a.replaceAll("\"", "%22"));
                    bufferedWriter.write("\"");
                    if (interfaceC1674a.m4061b()) {
                        bufferedWriter.write("; filename=\"");
                        String value = interfaceC1674a.value();
                        bufferedWriter.write(value != null ? value.replaceAll("\"", "%22") : null);
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        bufferedWriter.write(interfaceC1674a.m4062c() != null ? interfaceC1674a.m4062c() : "application/octet-stream");
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        InputStream m4063d = interfaceC1674a.m4063d();
                        Pattern pattern = C1708b.f7687a;
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = m4063d.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, read);
                            }
                        }
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(interfaceC1674a.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String str3 = bVar.f7700i;
                if (str3 != null) {
                    bufferedWriter.write(str3);
                } else {
                    Iterator it2 = arrayList.iterator();
                    boolean z6 = true;
                    while (it2.hasNext()) {
                        InterfaceC1674a interfaceC1674a2 = (InterfaceC1674a) it2.next();
                        if (z6) {
                            z6 = false;
                        } else {
                            bufferedWriter.append('&');
                        }
                        bufferedWriter.write(URLEncoder.encode(interfaceC1674a2.m4060a(), str2));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(interfaceC1674a2.value(), str2));
                    }
                }
            }
            bufferedWriter.close();
        }

        /* renamed from: g */
        public final void m4144g(HttpURLConnection httpURLConnection, c cVar) {
            LinkedHashMap linkedHashMap;
            this.f7707g = httpURLConnection;
            this.f7693b = C0091c.m236n(httpURLConnection.getRequestMethod());
            this.f7692a = httpURLConnection.getURL();
            httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            this.f7709i = httpURLConnection.getContentType();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i7 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i7);
                String headerField = httpURLConnection.getHeaderField(i7);
                if (headerFieldKey == null && headerField == null) {
                    break;
                }
                i7++;
                if (headerFieldKey != null && headerField != null) {
                    if (linkedHashMap2.containsKey(headerFieldKey)) {
                        ((List) linkedHashMap2.get(headerFieldKey)).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap2.put(headerFieldKey, arrayList);
                    }
                }
            }
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = this.f7695d;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (str != null) {
                    List<String> list = (List) entry.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                C1175f c1175f = new C1175f(str2);
                                String m3375g = c1175f.m3375g("=");
                                c1175f.m3380l("=");
                                String trim = m3375g.trim();
                                String trim2 = c1175f.m3375g(";").trim();
                                if (trim.length() > 0) {
                                    C0143v.m422T(trim, "Cookie name must not be empty");
                                    C0143v.m424V(trim2, "Cookie value must not be null");
                                    linkedHashMap.put(trim, trim2);
                                }
                            }
                        }
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        m4137a(str, (String) it2.next());
                    }
                }
            }
            if (cVar != null) {
                for (Map.Entry entry2 : cVar.f7695d.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    C0143v.m422T(str3, "Cookie name must not be empty");
                    if (!linkedHashMap.containsKey(str3)) {
                        String str4 = (String) entry2.getKey();
                        String str5 = (String) entry2.getValue();
                        C0143v.m422T(str4, "Cookie name must not be empty");
                        C0143v.m424V(str5, "Cookie value must not be null");
                        linkedHashMap.put(str4, str5);
                    }
                }
                HttpURLConnection httpURLConnection2 = cVar.f7707g;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    cVar.f7707g = null;
                }
                InputStream inputStream = cVar.f7706f;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        cVar.f7706f = null;
                        throw th;
                    }
                    cVar.f7706f = null;
                }
            }
        }
    }

    public C1709c() {
        new c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b4, code lost:
    
        if (r9 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00d1, code lost:
    
        if (r11[r3] != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        if (r11[3] != (-1)) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p142r6.C1850g m4136a() {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p126p6.C1709c.m4136a():r6.g");
    }
}
