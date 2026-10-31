package p036e2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: e2.s2 */
/* loaded from: classes.dex */
public final class C1085s2 {

    /* renamed from: x */
    public static final C1085s2 f5407x = new C1085s2();

    /* renamed from: a */
    public Context f5408a;

    /* renamed from: b */
    public WeakReference<Activity> f5409b;

    /* renamed from: c */
    public final Handler f5410c;

    /* renamed from: g */
    public long f5414g;

    /* renamed from: h */
    public long f5415h;

    /* renamed from: i */
    public String f5416i;

    /* renamed from: j */
    public String f5417j;

    /* renamed from: k */
    public String f5418k;

    /* renamed from: l */
    public String f5419l;

    /* renamed from: m */
    public String f5420m;

    /* renamed from: n */
    public boolean f5421n;

    /* renamed from: o */
    public boolean f5422o;

    /* renamed from: s */
    public ViewTreeObserverOnScrollChangedListenerC1008h2 f5426s;

    /* renamed from: d */
    public boolean f5411d = true;

    /* renamed from: e */
    public final List<WeakReference<View>> f5412e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f */
    public volatile int f5413f = 1;

    /* renamed from: p */
    public ArrayList f5423p = new ArrayList();

    /* renamed from: q */
    public final HashMap<WeakReference<View>, ArrayList<C0959a2>> f5424q = new HashMap<>();

    /* renamed from: r */
    public final HashMap<WeakReference<View>, HashMap<String, ArrayList<C0966b2>>> f5425r = new HashMap<>();

    /* renamed from: t */
    public RunnableC1015i2 f5427t = null;

    /* renamed from: u */
    public float f5428u = 0.0f;

    /* renamed from: v */
    public float f5429v = 0.0f;

    /* renamed from: w */
    public final Object f5430w = new Object();

    public C1085s2() {
        HandlerThread handlerThread = new HandlerThread("feedViewCrawlerThread");
        handlerThread.start();
        this.f5410c = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static String m3178a(Activity activity, View view, View view2) {
        Object tag;
        HashMap m3203n = C1086s3.m3203n(view, true);
        String str = "";
        String str2 = (m3203n.size() <= 0 || TextUtils.isEmpty((CharSequence) m3203n.get("title"))) ? "" : (String) m3203n.get("title");
        if (view != null && (tag = view.getTag(-97004)) != null && (tag instanceof String)) {
            str = (String) tag;
        }
        return C0966b2.m2966a(str, C1086s3.m3213x(activity), C1086s3.m3198i(activity, view), str2, C1086s3.m3195f(view, C1086s3.m3201l(view2)), C1086s3.m3206q(view2, C1086s3.m3213x(activity)), C1086s3.m3188E(view2));
    }

    /* renamed from: d */
    public static boolean m3179d(String str, String str2) {
        return str == str2 || !(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2));
    }

    /* renamed from: b */
    public final void m3180b(Activity activity, View view, HashMap<View, Integer> hashMap, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (view == null || C1086s3.m3209t(activity, view)) {
            return;
        }
        boolean m3186C = C1086s3.m3186C(view);
        if (m3186C && !m3181c(view) && C1086s3.m3211v(view)) {
            arrayList.add(view);
        }
        if (m3186C) {
            arrayList2.add(view);
        }
        if (m3186C || (view instanceof WebView) || (view instanceof ScrollView)) {
            int height = view.getHeight() * view.getWidth();
            if (height != 0) {
                hashMap.put(view, Integer.valueOf(height));
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                m3180b(activity, viewGroup.getChildAt(i7), hashMap, arrayList, arrayList2);
            }
        }
    }

    /* renamed from: c */
    public final boolean m3181c(View view) {
        Object tag;
        if (this.f5413f != 1) {
            if (this.f5413f != 2) {
                return true;
            }
            if (!((view == null || (tag = view.getTag(-97002)) == null || !(tag instanceof Boolean)) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m3182e() {
        return this.f5413f == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3183f(android.app.Activity r30, long r31) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1085s2.m3183f(android.app.Activity, long):void");
    }
}
