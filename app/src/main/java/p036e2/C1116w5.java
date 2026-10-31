package p036e2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import p016c.C0572z;

/* renamed from: e2.w5 */
/* loaded from: classes.dex */
public final class C1116w5 {

    /* renamed from: a */
    public static volatile boolean f5534a = false;

    /* renamed from: e2.w5$a */
    public static class a extends Thread {

        /* renamed from: c */
        public final Context f5535c;

        /* renamed from: e */
        public final C0572z f5536e;

        public a(Context context, C0572z c0572z) {
            this.f5535c = context;
            this.f5536e = c0572z;
        }

        /* renamed from: b */
        public static String m3272b(Context context) {
            StringBuilder sb;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("dynamicVersion", "35"));
            String str = C0968b4.f4970a;
            arrayList.add(new Pair("packageName", context != null ? context.getPackageName() : ""));
            arrayList.add(new Pair("appVersion", C0968b4.m2973g(context)));
            arrayList.add(new Pair("cuid", C0968b4.m2967a(context)));
            arrayList.add(new Pair("platform", "Android"));
            arrayList.add(new Pair("m", Build.MODEL));
            arrayList.add(new Pair("s", Build.VERSION.SDK_INT + ""));
            arrayList.add(new Pair("o", Build.VERSION.RELEASE));
            arrayList.add(new Pair("i", "35"));
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    String encode = URLEncoder.encode(((String) pair.first).toString(), "UTF-8");
                    String encode2 = URLEncoder.encode(((String) pair.second).toString(), "UTF-8");
                    if (TextUtils.isEmpty(sb2.toString())) {
                        sb = new StringBuilder();
                        sb.append(encode);
                        sb.append("=");
                        sb.append(encode2);
                    } else {
                        sb = new StringBuilder();
                        sb.append("&");
                        sb.append(encode);
                        sb.append("=");
                        sb.append(encode2);
                    }
                    sb2.append(sb.toString());
                } catch (Exception unused) {
                }
            }
            return "https://dxp.baidu.com/upgrade?" + sb2.toString();
        }

        /* renamed from: a */
        public final synchronized void m3273a() {
            C1016i3 c1016i3 = C1016i3.f5129e;
            c1016i3.m382g(3, "start get config");
            Context context = this.f5535c;
            C0572z c0572z = this.f5536e;
            String m3272b = m3272b(context);
            c1016i3.m382g(6, "update req url is:" + m3272b);
            HttpURLConnection m3290c = C1121x3.m3290c(context, m3272b);
            try {
                m3290c.connect();
                String headerField = m3290c.getHeaderField("X-CONFIG");
                c1016i3.m382g(3, "config is: " + headerField);
                String headerField2 = m3290c.getHeaderField("X-SIGN");
                c1016i3.m382g(3, "sign is: " + headerField2);
                int responseCode = m3290c.getResponseCode();
                c1016i3.m382g(3, "update response code is: " + responseCode);
                c1016i3.m382g(3, "update response content length is: " + m3290c.getContentLength());
                if (responseCode == 200) {
                    c1016i3.m382g(3, "request  success");
                }
                if (!TextUtils.isEmpty(headerField)) {
                    c1016i3.m382g(3, "save Config " + headerField);
                    ((C1130y5) c0572z.f2925b).getClass();
                    C1123x5 m3292b = C1123x5.m3292b(context);
                    C1121x3.m3289b(m3292b.f5595a, ".config2", headerField);
                    m3292b.m3296e();
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    c1016i3.m382g(3, "save Sign " + headerField2);
                    ((C1130y5) c0572z.f2925b).getClass();
                    C1123x5 m3292b2 = C1123x5.m3292b(context);
                    C1121x3.m3289b(m3292b2.f5595a, ".sign", headerField2);
                    m3292b2.m3297f();
                }
                m3290c.disconnect();
                c1016i3.m382g(3, "finish get config");
            } catch (Throwable th) {
                m3290c.disconnect();
                throw th;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(3000);
                m3273a();
                Context context = this.f5535c;
                long currentTimeMillis = System.currentTimeMillis();
                ((C1130y5) this.f5536e.f2925b).getClass();
                C1123x5.m3292b(context).m3295c(EnumC1011h5.f5117w1, currentTimeMillis);
            } catch (Exception e7) {
                C1016i3.f5129e.m383h(e7);
            }
            C1116w5.f5534a = false;
        }
    }

    /* renamed from: a */
    public static synchronized void m3271a(Context context, C0572z c0572z) {
        synchronized (C1116w5.class) {
            if (f5534a) {
                return;
            }
            if (C0968b4.m2980n(context)) {
                ((C1130y5) c0572z.f2925b).getClass();
                if (C1130y5.m3309a(context)) {
                    new a(context, c0572z).start();
                    f5534a = true;
                }
            }
        }
    }
}
