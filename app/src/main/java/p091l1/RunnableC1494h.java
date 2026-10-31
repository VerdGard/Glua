package p091l1;

import com.so.revelation.lua.DemoActivity;

/* renamed from: l1.h */
/* loaded from: classes.dex */
public final class RunnableC1494h implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f7103c;

    /* renamed from: e */
    public final /* synthetic */ int f7104e;

    /* renamed from: m */
    public final /* synthetic */ int f7105m;

    /* renamed from: s */
    public final /* synthetic */ DemoActivity f7106s;

    public RunnableC1494h(DemoActivity demoActivity, int i7, int i8, int i9) {
        this.f7106s = demoActivity;
        this.f7103c = i7;
        this.f7104e = i8;
        this.f7105m = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DemoActivity demoActivity = this.f7106s;
        demoActivity.f3273V1.m2214c(true);
        demoActivity.f3274W1.setText("正在加载:：[" + this.f7103c + "/68]----" + this.f7104e + "/" + this.f7105m);
    }
}
