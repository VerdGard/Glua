package p036e2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.activity.result.AbstractC0136c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.u */
/* loaded from: classes.dex */
public final class C1096u {

    /* renamed from: f */
    public static final C1096u f5460f = new C1096u();

    /* renamed from: a */
    public boolean f5461a = false;

    /* renamed from: b */
    public int f5462b = 1;

    /* renamed from: c */
    public int f5463c = 1;

    /* renamed from: d */
    public Timer f5464d;

    /* renamed from: e */
    public final Handler f5465e;

    /* renamed from: e2.u$a */
    public class a extends TimerTask {

        /* renamed from: c */
        public final /* synthetic */ Context f5466c;

        public a(Context context) {
            this.f5466c = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C1096u c1096u = C1096u.this;
            boolean z6 = c1096u.f5461a;
            Context context = this.f5466c;
            if (!z6 || C0968b4.m2980n(context)) {
                c1096u.f5465e.post(new RunnableC1103v(c1096u, context));
            }
        }
    }

    /* renamed from: e2.u$b */
    public class b implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f5468a;

        public b(String str) {
            this.f5468a = str;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(this.f5468a);
        }
    }

    /* renamed from: e2.u$c */
    public class c implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public C1096u() {
        HandlerThread handlerThread = new HandlerThread("LogSenderThread");
        handlerThread.start();
        this.f5465e = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static ArrayList m3226a(Context context, String str) {
        File filesDir;
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        if (context != null && (filesDir = context.getFilesDir()) != null && filesDir.exists()) {
            try {
                strArr = filesDir.list(new b(str));
            } catch (Exception unused) {
                strArr = null;
            }
            if (strArr != null && strArr.length != 0) {
                try {
                    Arrays.sort(strArr, new c());
                } catch (Exception unused2) {
                }
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m3227b(C1096u c1096u, Context context, String str, boolean z6) {
        String concat;
        C1023j3 c1023j3 = C1023j3.f5170m;
        if (!z6) {
            c1096u.getClass();
            c1023j3.m382g(3, "Start send log \n".concat(str));
        }
        boolean z7 = false;
        if (!c1096u.f5461a || C0968b4.m2980n(context)) {
            try {
                m3228c(context, z6 ? "https://hmma.baidu.com/auto.gif" : "https://hmma.baidu.com/app.gif", str);
                z7 = true;
            } catch (Exception e7) {
                c1023j3.m382g(6, AbstractC0136c.m379p(e7));
            }
            if (!z6) {
                concat = "Send log ".concat(z7 ? "success" : "failed");
            }
            return z7;
        }
        concat = "[WARNING] wifi not available, log will be cached, next time will try to resend";
        c1023j3.m382g(3, concat);
        return z7;
    }

    /* renamed from: c */
    public static void m3228c(Context context, String str, String str2) {
        HttpURLConnection m3290c;
        if (!str.startsWith("https://")) {
            m3290c = C1121x3.m3290c(context, str);
            m3290c.setDoOutput(true);
            m3290c.setInstanceFollowRedirects(false);
            m3290c.setUseCaches(false);
            m3290c.setRequestProperty("Content-Type", "gzip");
            byte[] m3243g = C1109v5.m3243g();
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            m3290c.setRequestProperty("key", C1109v5.m3248l(m3243g));
            m3290c.setRequestProperty("iv", C1109v5.m3248l(bArr));
            byte[] m3245i = C1109v5.m3245i(m3243g, bArr, str2.getBytes("utf-8"));
            m3290c.connect();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(m3290c.getOutputStream());
                gZIPOutputStream.write(m3245i);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m3290c.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                }
                int contentLength = m3290c.getContentLength();
                if (m3290c.getResponseCode() == 200 && contentLength == 0) {
                    return;
                }
                throw new IOException("http code = " + m3290c.getResponseCode() + "; contentResponse = " + ((Object) sb));
            } finally {
            }
        }
        m3290c = C1121x3.m3290c(context, str);
        m3290c.setDoOutput(true);
        m3290c.setInstanceFollowRedirects(false);
        m3290c.setUseCaches(false);
        m3290c.setRequestProperty("Content-Type", "gzip");
        try {
            JSONObject jSONObject = new JSONObject(str2).getJSONObject("he");
            m3290c.setRequestProperty("mtj_appkey", jSONObject.getString("k"));
            m3290c.setRequestProperty("mtj_appversion", jSONObject.getString("n"));
            m3290c.setRequestProperty("mtj_os", jSONObject.getString("o"));
            m3290c.setRequestProperty("mtj_pn", jSONObject.getString("pn"));
            m3290c.setRequestProperty("mtj_tg", jSONObject.getString("tg"));
            m3290c.setRequestProperty("mtj_ii", jSONObject.getString("ii"));
            m3290c.setRequestProperty("from", jSONObject.getString("from"));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        m3290c.connect();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(m3290c.getOutputStream())));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(m3290c.getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 == null) {
                    break;
                } else {
                    sb2.append(readLine2);
                }
            }
            int contentLength2 = m3290c.getContentLength();
            if (m3290c.getResponseCode() == 200 && contentLength2 == 0) {
                return;
            }
            throw new IOException("http code = " + m3290c.getResponseCode() + "; contentResponse = " + ((Object) sb2));
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r3 == null) goto L22;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3229d(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = p036e2.C1047n.f5252a
            if (r9 == 0) goto L6
            r1 = r0
            goto L8
        L6:
            java.lang.String r1 = p036e2.C1047n.f5253b
        L8:
            java.lang.StringBuilder r1 = p120p.C1686g.m4107b(r1)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p036e2.C1121x3.m3289b(r7, r1, r8)
            if (r9 == 0) goto L6a
            java.util.ArrayList r8 = m3226a(r7, r0)
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r0 = 0
            r1 = 0
            r3 = r0
        L2a:
            if (r9 < 0) goto L59
            java.lang.Object r4 = r8.get(r9)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L3f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L3f
            java.io.FileInputStream r3 = r7.openFileInput(r4)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L3f
            int r4 = r3.available()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L3f
            long r4 = (long) r4
            long r1 = r1 + r4
            goto L48
        L3d:
            goto L46
        L3f:
            r7 = move-exception
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.lang.Exception -> L45
        L45:
            throw r7
        L46:
            if (r3 == 0) goto L4e
        L48:
            r3.close()     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
        L4d:
            r3 = r0
        L4e:
            r4 = 10485760(0xa00000, double:5.180654E-317)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L56
            goto L59
        L56:
            int r9 = r9 + (-1)
            goto L2a
        L59:
            r0 = 0
        L5a:
            if (r0 > r9) goto L6a
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.net.Proxy r2 = p036e2.C1121x3.f5592a
            r7.deleteFile(r1)
            int r0 = r0 + 1
            goto L5a
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1096u.m3229d(android.content.Context, java.lang.String, boolean):void");
    }

    /* renamed from: e */
    public final void m3230e(Context context) {
        Context applicationContext = context.getApplicationContext();
        long j7 = this.f5462b * 3600000;
        try {
            Timer timer = new Timer();
            this.f5464d = timer;
            timer.schedule(new a(applicationContext), j7, j7);
        } catch (Exception unused) {
        }
    }
}
