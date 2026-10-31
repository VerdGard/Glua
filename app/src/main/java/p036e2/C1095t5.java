package p036e2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.t5 */
/* loaded from: classes.dex */
public final class C1095t5 {

    /* renamed from: b */
    public static C1095t5 f5458b;

    /* renamed from: a */
    public final Handler f5459a;

    public C1095t5() {
        HandlerThread handlerThread = new HandlerThread("LogSender");
        handlerThread.start();
        this.f5459a = new Handler(handlerThread.getLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3224a(p036e2.C1095t5 r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1095t5.m3224a(e2.t5, android.content.Context):void");
    }

    /* renamed from: b */
    public static void m3225b(Context context, String str) {
        HttpURLConnection m3290c = C1121x3.m3290c(context, "https://openrcv.baidu.com/1010/bplus.gif");
        m3290c.setDoOutput(true);
        m3290c.setInstanceFollowRedirects(false);
        m3290c.setUseCaches(false);
        m3290c.setRequestProperty("Content-Encoding", "gzip");
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("payload").getJSONObject(0).getJSONObject("he");
            m3290c.setRequestProperty("Content-Type", "gzip");
            m3290c.setRequestProperty("mtj_appversion", jSONObject.getString("n"));
            m3290c.setRequestProperty("mtj_os", "Android");
            m3290c.setRequestProperty("mtj_pn", jSONObject.getString("pn"));
            m3290c.setRequestProperty("mtj_tg", "1");
            m3290c.setRequestProperty("mtj_ii", jSONObject.getString("ii"));
            m3290c.setRequestProperty("from", jSONObject.getString("from"));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        m3290c.connect();
        try {
            OutputStream outputStream = m3290c.getOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            gZIPOutputStream.write(new byte[]{72, 77, 48, 49});
            gZIPOutputStream.write(new byte[]{0, 0, 0, 1});
            gZIPOutputStream.write(new byte[]{0, 0, 3, -14});
            gZIPOutputStream.write(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
            gZIPOutputStream.write(new byte[]{0, 2});
            gZIPOutputStream.write(new byte[]{0, 0});
            gZIPOutputStream.write(new byte[]{72, 77, 48, 49});
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
            outputStream.close();
            int responseCode = m3290c.getResponseCode();
            int contentLength = m3290c.getContentLength();
            if (responseCode == 200 && contentLength == 0) {
                while (new BufferedReader(new InputStreamReader(m3290c.getInputStream())).readLine() != null) {
                }
            } else {
                throw new IOException("Response code = " + m3290c.getResponseCode());
            }
        } catch (Exception e8) {
            C1016i3.f5129e.m386n(e8);
        } finally {
            m3290c.disconnect();
        }
    }
}
