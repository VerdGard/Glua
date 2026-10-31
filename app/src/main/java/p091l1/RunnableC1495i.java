package p091l1;

import com.so.revelation.lua.DemoActivity;
import p122p1.C1699g;

/* renamed from: l1.i */
/* loaded from: classes.dex */
public final class RunnableC1495i implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ DemoActivity f7107c;

    public RunnableC1495i(DemoActivity demoActivity) {
        this.f7107c = demoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DemoActivity demoActivity = this.f7107c;
        demoActivity.f3272U1 = new C1699g(demoActivity, demoActivity.f3265N1, demoActivity.f3267P1, demoActivity.f3266O1, demoActivity.f3268Q1, demoActivity.f3269R1, demoActivity.f3270S1, demoActivity.f3271T1);
        demoActivity.f3264M1.setAdapter(demoActivity.f3272U1);
    }
}
