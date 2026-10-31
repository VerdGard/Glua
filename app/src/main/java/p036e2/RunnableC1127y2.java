package p036e2;

import org.json.JSONObject;

/* renamed from: e2.y2 */
/* loaded from: classes.dex */
public final class RunnableC1127y2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ JSONObject f5620c;

    /* renamed from: e */
    public final /* synthetic */ C0974c3 f5621e;

    public RunnableC1127y2(C0974c3 c0974c3, JSONObject jSONObject) {
        this.f5621e = c0974c3;
        this.f5620c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = this.f5620c;
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        C0974c3 c0974c3 = this.f5621e;
        c0974c3.f4993f = C0974c3.m2991d(c0974c3.f4993f, jSONObject);
    }
}
