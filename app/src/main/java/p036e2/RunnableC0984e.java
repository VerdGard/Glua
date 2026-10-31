package p036e2;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e2.e */
/* loaded from: classes.dex */
public final class RunnableC0984e implements Runnable {

    /* renamed from: A1 */
    public final /* synthetic */ boolean f5010A1;

    /* renamed from: B1 */
    public final /* synthetic */ C0991f f5011B1;

    /* renamed from: Y */
    public final /* synthetic */ Map f5013Y;

    /* renamed from: Z */
    public final /* synthetic */ JSONArray f5014Z;

    /* renamed from: c */
    public final /* synthetic */ String f5015c;

    /* renamed from: e */
    public final /* synthetic */ Context f5016e;

    /* renamed from: m */
    public final /* synthetic */ long f5017m;

    /* renamed from: w1 */
    public final /* synthetic */ JSONArray f5019w1;

    /* renamed from: x1 */
    public final /* synthetic */ String f5020x1;

    /* renamed from: y1 */
    public final /* synthetic */ String f5021y1;

    /* renamed from: z1 */
    public final /* synthetic */ String f5022z1;

    /* renamed from: s */
    public final /* synthetic */ String f5018s = "";

    /* renamed from: X */
    public final /* synthetic */ int f5012X = 1;

    public RunnableC0984e(C0991f c0991f, String str, Context context, long j7, Map map, JSONArray jSONArray, JSONArray jSONArray2, String str2, String str3, String str4, boolean z6) {
        this.f5011B1 = c0991f;
        this.f5015c = str;
        this.f5016e = context;
        this.f5017m = j7;
        this.f5013Y = map;
        this.f5014Z = jSONArray;
        this.f5019w1 = jSONArray2;
        this.f5020x1 = str2;
        this.f5021y1 = str3;
        this.f5022z1 = str4;
        this.f5010A1 = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f5015c;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f5011B1.f5048c.m3278e(this.f5016e, this.f5017m, false);
        C1023j3.f5170m.m382g(3, "Put event" + C0991f.m3014a(this.f5011B1, this.f5018s, str, this.f5012X, 0L, this.f5013Y));
        long j7 = this.f5011B1.f5048c.f5542f.f5494a;
        C1068q c1068q = this.f5011B1.f5049d;
        Context context = this.f5016e;
        String str2 = this.f5018s;
        int i7 = this.f5012X;
        long j8 = this.f5017m;
        JSONArray jSONArray = this.f5014Z;
        JSONArray jSONArray2 = this.f5019w1;
        String str3 = this.f5020x1;
        String str4 = this.f5021y1;
        String str5 = this.f5022z1;
        Map map = this.f5013Y;
        boolean z6 = this.f5010A1;
        c1068q.getClass();
        C0961a4.m2954a().getClass();
        boolean z7 = C0961a4.f4941d;
        if (z7) {
            C0961a4.m2954a().getClass();
            if (z7) {
                JSONObject m3163d = C1068q.m3163d(j7, str2, str, i7, j8, 0L, jSONArray, jSONArray2, str3, str4, str5, 2, map, z6);
                C1061p c1061p = C1061p.f5300l;
                c1061p.m3155m(m3163d);
                c1061p.m3150g(context);
            }
        }
    }
}
