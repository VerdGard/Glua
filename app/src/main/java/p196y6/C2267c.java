package p196y6;

import android.ext.C0090b;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import p165u6.C2007y;
import p165u6.C2008z;

/* renamed from: y6.c */
/* loaded from: classes.dex */
public final class C2267c {

    /* renamed from: a */
    public final String f10350a;

    /* renamed from: b */
    public final C2008z f10351b;

    /* renamed from: c */
    public final C2267c[] f10352c;

    /* renamed from: d */
    public final C2265a[] f10353d;

    /* renamed from: e */
    public final C2265a[] f10354e;

    /* renamed from: f */
    public final C2269e[] f10355f;

    /* renamed from: g */
    public final C2269e[][] f10356g;

    /* renamed from: h */
    public final C2268d[] f10357h;

    /* renamed from: i */
    public final C2268d[][] f10358i;

    /* JADX WARN: Code restructure failed: missing block: B:329:0x054a, code lost:
    
        if (r11 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x054c, code lost:
    
        r11 = r11.mo4645M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0528, code lost:
    
        if (r11 != null) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2267c(p165u6.C2008z r18, java.lang.String r19, p196y6.C2268d[] r20) {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p196y6.C2267c.<init>(u6.z, java.lang.String, y6.d[]):void");
    }

    /* renamed from: a */
    public final void m5497a(StringBuffer stringBuffer, int i7) {
        for (int i8 = 0; i8 < this.f10351b.f9154l; i8++) {
            C2269e c2269e = i7 < 0 ? this.f10355f[i8] : this.f10356g[i8][i7];
            if (c2269e != null && c2269e.f10366b == i7 && c2269e.f10368d) {
                stringBuffer.append("    open: " + c2269e.f10367c + "\n");
            }
        }
    }

    /* renamed from: b */
    public final boolean m5498b(int i7, int i8) {
        C2268d c2268d;
        C2269e c2269e = i7 < 0 ? this.f10355f[i8] : this.f10356g[i8][i7];
        return c2269e != null && (c2268d = c2269e.f10367c) != null && c2268d.f10363e && c2269e.f10368d && i7 == c2269e.f10366b;
    }

    public final String toString() {
        C2008z c2008z;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("proto '" + this.f10350a + "'\n");
        C2268d[] c2268dArr = this.f10357h;
        int length = c2268dArr != null ? c2268dArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            StringBuilder m221g = C0090b.m221g(" up[", i7, "]: ");
            m221g.append(c2268dArr[i7]);
            m221g.append("\n");
            stringBuffer.append(m221g.toString());
        }
        int i8 = 0;
        while (true) {
            C2265a[] c2265aArr = this.f10354e;
            if (i8 >= c2265aArr.length) {
                break;
            }
            C2265a c2265a = c2265aArr[i8];
            int i9 = c2265a.f10279a;
            stringBuffer.append("  block " + c2265a.toString());
            m5497a(stringBuffer, -1);
            while (i9 <= c2265a.f10280b) {
                m5497a(stringBuffer, i9);
                stringBuffer.append("     ");
                int i10 = 0;
                while (true) {
                    c2008z = this.f10351b;
                    if (i10 >= c2008z.f9154l) {
                        break;
                    }
                    C2269e c2269e = this.f10356g[i10][i9];
                    if (c2269e == null) {
                        str = "";
                    } else {
                        C2268d c2268d = c2269e.f10367c;
                        str = c2268d != null ? !c2268d.f10363e ? "[C] " : (c2269e.f10368d && c2269e.f10366b == i9) ? "[*] " : "[]  " : "    ";
                    }
                    stringBuffer.append((c2269e == null ? "null   " : String.valueOf(c2269e)).concat(str));
                    i10++;
                }
                stringBuffer.append("  ");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = C2007y.f9140c;
                C2007y.f9140c = new PrintStream(byteArrayOutputStream);
                try {
                    C2007y.m4891h(c2008z, i9);
                    C2007y.f9140c.close();
                    C2007y.f9140c = printStream;
                    stringBuffer.append(byteArrayOutputStream.toString());
                    stringBuffer.append("\n");
                    i9++;
                } catch (Throwable th) {
                    C2007y.f9140c.close();
                    C2007y.f9140c = printStream;
                    throw th;
                }
            }
            i8++;
        }
        C2267c[] c2267cArr = this.f10352c;
        int length2 = c2267cArr != null ? c2267cArr.length : 0;
        for (int i11 = 0; i11 < length2; i11++) {
            stringBuffer.append(c2267cArr[i11].toString());
        }
        return stringBuffer.toString();
    }
}
