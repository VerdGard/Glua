package p091l1;

import com.so.revelation.lua.DemoActivity;

/* renamed from: l1.d */
/* loaded from: classes.dex */
public final class RunnableC1490d implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ DemoActivity f7099c;

    public RunnableC1490d(DemoActivity demoActivity) {
        this.f7099c = demoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DemoActivity demoActivity = this.f7099c;
        demoActivity.f3274W1.setText("正在爬取...");
        demoActivity.f3273V1.m2214c(true);
    }
}
