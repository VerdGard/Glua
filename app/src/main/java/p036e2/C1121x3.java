package p036e2;

import android.content.Context;
import androidx.activity.C0143v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: e2.x3 */
/* loaded from: classes.dex */
public final class C1121x3 {

    /* renamed from: a */
    public static final Proxy f5592a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80));

    /* renamed from: b */
    public static final Proxy f5593b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80));

    /* renamed from: a */
    public static String m3288a(Context context, String str) {
        FileInputStream openFileInput;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            openFileInput = context.openFileInput(str);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = C0143v.m444j(openFileInput, byteArrayOutputStream) ? byteArrayOutputStream.toByteArray() : null;
            if (byteArray == null) {
                C0143v.m440h(openFileInput);
                return "";
            }
            String str2 = new String(byteArray, "utf-8");
            C0143v.m440h(openFileInput);
            return str2;
        } catch (Exception unused2) {
            fileInputStream2 = openFileInput;
            C0143v.m440h(fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = openFileInput;
            C0143v.m440h(fileInputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static void m3289b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            C0143v.m444j(new ByteArrayInputStream(str2.getBytes("utf-8")), fileOutputStream);
        } catch (Exception unused) {
        } catch (Throwable th) {
            C0143v.m440h(fileOutputStream);
            throw th;
        }
        C0143v.m440h(fileOutputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.HttpURLConnection m3290c(android.content.Context r2, java.lang.String r3) {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.lang.String r3 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r3 = 0
            android.net.NetworkInfo r3 = r2.getNetworkInfo(r3)
            r1 = 1
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r1)
            if (r2 == 0) goto L24
            boolean r2 = r2.isAvailable()
            if (r2 == 0) goto L24
            java.net.URLConnection r2 = r0.openConnection()
            goto L63
        L24:
            if (r3 == 0) goto L66
            boolean r2 = r3.isAvailable()
            if (r2 == 0) goto L66
            java.lang.String r2 = r3.getExtraInfo()
            if (r2 == 0) goto L37
            java.lang.String r2 = r2.toLowerCase()
            goto L39
        L37:
            java.lang.String r2 = ""
        L39:
            java.lang.String r3 = "cmwap"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L5d
            java.lang.String r3 = "uniwap"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L5d
            java.lang.String r3 = "3gwap"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L52
            goto L5d
        L52:
            java.lang.String r3 = "ctwap"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L66
            java.net.Proxy r2 = p036e2.C1121x3.f5593b
            goto L5f
        L5d:
            java.net.Proxy r2 = p036e2.C1121x3.f5592a
        L5f:
            java.net.URLConnection r2 = r0.openConnection(r2)
        L63:
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 != 0) goto L6f
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
        L6f:
            r3 = 50000(0xc350, float:7.0065E-41)
            r2.setConnectTimeout(r3)
            r2.setReadTimeout(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1121x3.m3290c(android.content.Context, java.lang.String):java.net.HttpURLConnection");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3291d(android.content.Context r3, java.lang.String r4) {
        /*
            int r3 = r3.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Exception -> L8
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            if (r3 != 0) goto L24
            e2.j3 r0 = p036e2.C1023j3.f5170m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[WARNING] not have permission "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", please add it in AndroidManifest.xml according our developer doc"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 5
            r0.m382g(r1, r4)
        L24:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1121x3.m3291d(android.content.Context, java.lang.String):boolean");
    }
}
