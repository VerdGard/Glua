package p036e2;

import android.app.Activity;
import android.ext.C0091c;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.activity.result.AbstractC0136c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e2.y1 */
/* loaded from: classes.dex */
public final class C1126y1 {

    /* renamed from: c */
    public static volatile String f5608c;

    /* renamed from: d */
    public static volatile int f5609d;

    /* renamed from: b */
    public final Handler f5611b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final b f5610a = new b();

    /* renamed from: e2.y1$a */
    public static class a {

        /* renamed from: b */
        public final Paint f5613b = new Paint(2);

        /* renamed from: a */
        public Bitmap f5612a = null;
    }

    /* renamed from: e2.y1$b */
    public static class b implements Callable<List<c>> {

        /* renamed from: a */
        public Activity f5614a;

        /* renamed from: c */
        public final DisplayMetrics f5616c = new DisplayMetrics();

        /* renamed from: b */
        public final ArrayList f5615b = new ArrayList();

        /* renamed from: d */
        public final a f5617d = new a();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2 */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<p036e2.C1126y1.c> call() {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C1126y1.b.call():java.lang.Object");
        }
    }

    /* renamed from: e2.y1$c */
    public static class c {

        /* renamed from: a */
        public final View f5618a;

        /* renamed from: b */
        public a f5619b = null;

        public c(View view) {
            this.f5618a = view;
        }
    }

    /* renamed from: a */
    public static void m3303a(Activity activity, View view, JSONArray jSONArray, String str, View view2) {
        Rect m3212w;
        long j7;
        String str2;
        Object obj;
        String str3;
        if (view == null || (m3212w = C1086s3.m3212w(view)) == null) {
            return;
        }
        Object tag = view.getTag(-5000);
        if (tag != null && (tag instanceof String) && ((String) tag).equals("baidu_mtj_edit_txtview")) {
            return;
        }
        String m3185B = C1086s3.m3185B(view);
        if (TextUtils.isEmpty(m3185B) || C1086s3.m3209t(activity, view)) {
            return;
        }
        String m3205p = C1086s3.m3205p(view);
        if (TextUtils.isEmpty(m3205p)) {
            m3205p = C1086s3.m3195f(view, str);
            if (TextUtils.isEmpty(m3205p)) {
                m3205p = C1086s3.m3194e(view, view2);
            }
        }
        if (TextUtils.isEmpty(m3205p)) {
            return;
        }
        try {
            j7 = Long.valueOf(m3205p).longValue();
        } catch (Exception unused) {
            j7 = -1;
        }
        if (j7 < 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("p", m3185B);
        jSONObject2.put("i", m3205p);
        String m3201l = C1086s3.m3201l(view);
        jSONObject2.put("t", m3201l);
        jSONArray2.put(jSONObject2);
        jSONObject.put("path", jSONArray2);
        jSONObject.put("type", m3201l);
        jSONObject.put("value", C1086s3.m3193d(view));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("x", C1109v5.m3240c(activity, m3212w.left));
        jSONObject3.put("y", C1109v5.m3240c(activity, m3212w.top));
        jSONObject3.put("w", C1109v5.m3240c(activity, m3212w.width()));
        jSONObject3.put("h", C1109v5.m3240c(activity, m3212w.height()));
        jSONObject.put("frame", jSONObject3);
        jSONObject.put("alpha", (int) (view.getAlpha() * (view.getBackground() != null ? r8.getAlpha() : 0)));
        jSONObject.put("page", activity.getClass().getName());
        jSONObject.put("z", view.getZ());
        boolean z6 = view instanceof WebView;
        if (z6) {
            C1107v3.f5484e = "";
            int m3240c = C1109v5.m3240c(activity, m3212w.left);
            int m3240c2 = C1109v5.m3240c(activity, m3212w.top);
            int m3240c3 = C1109v5.m3240c(activity, m3212w.width());
            int m3240c4 = C1109v5.m3240c(activity, m3212w.height());
            WindowManager windowManager = activity.getWindowManager();
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            int m3240c5 = C1109v5.m3240c(activity, r15.widthPixels);
            WindowManager windowManager2 = activity.getWindowManager();
            windowManager2.getDefaultDisplay().getMetrics(new DisplayMetrics());
            activity.runOnUiThread(new RunnableC1100u3((WebView) view, C0091c.m228f("javascript:window._automtj.getViewportTree('android', '", "{\"x\": " + m3240c + ", \"y\": " + m3240c2 + ", \"w\": " + m3240c3 + ", \"h\": " + m3240c4 + ", \"sw\": " + m3240c5 + ", \"sh\": " + C1109v5.m3240c(activity, r10.heightPixels) + "}", "', 'window.WebViewInterface.setViewportTreeToNative')")));
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 >= 15) {
                    str2 = "";
                    break;
                }
                try {
                    Thread.sleep(20L);
                } catch (Exception unused2) {
                }
                if (!TextUtils.isEmpty(C1107v3.f5484e)) {
                    str2 = C1107v3.f5484e;
                    break;
                }
                i7 = i8;
            }
            if (TextUtils.isEmpty(str2)) {
                obj = null;
                str3 = "";
            } else {
                JSONObject jSONObject4 = new JSONObject(str2);
                str3 = jSONObject4.optString("url");
                obj = jSONObject4.optJSONArray("objects");
            }
            if (obj == null) {
                obj = new JSONArray();
            }
            jSONObject.put("child", obj);
            if (TextUtils.isEmpty(str3)) {
                jSONObject.put("url", "/");
            } else {
                jSONObject.put("url", str3);
            }
        }
        jSONObject.put("edit", C1086s3.m3204o(view, str) ? 1 : 0);
        jSONArray.put(jSONObject);
        if (z6) {
            return;
        }
        if (!(view instanceof ViewGroup)) {
            jSONObject.put("child", new JSONArray());
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        JSONArray jSONArray3 = new JSONArray();
        jSONObject.put("child", jSONArray3);
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            m3303a(activity, viewGroup.getChildAt(i9), jSONArray3, m3201l, view2);
        }
    }

    /* renamed from: b */
    public final Bitmap m3304b(Activity activity) {
        C1023j3 c1023j3 = C1023j3.f5170m;
        b bVar = this.f5610a;
        bVar.f5614a = activity;
        FutureTask futureTask = new FutureTask(bVar);
        this.f5611b.post(futureTask);
        List emptyList = Collections.emptyList();
        try {
            emptyList = (List) futureTask.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            c1023j3.m385l("autotrace: Screenshot interrupted, no screenshot will be sent.", e7);
        } catch (TimeoutException e8) {
            c1023j3.m382g(4, "autotrace: Screenshot took more than 2 second to be scheduled and executed. No screenshot will be sent.\n" + AbstractC0136c.m379p(e8));
        } catch (Exception e9) {
            c1023j3.m388q("autotrace: Exception thrown during screenshot attempt", e9);
        }
        if (emptyList.size() == 0) {
            return null;
        }
        return ((c) emptyList.get(0)).f5619b.f5612a;
    }
}
