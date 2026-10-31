package p036e2;

import android.content.Context;
import java.util.Timer;
import p120p.C1686g;

/* renamed from: e2.t */
/* loaded from: classes.dex */
public final class RunnableC1089t implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5431c;

    /* renamed from: e */
    public final /* synthetic */ C1096u f5432e;

    /* renamed from: e2.t$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC1089t runnableC1089t = RunnableC1089t.this;
            C1096u c1096u = runnableC1089t.f5432e;
            boolean z6 = c1096u.f5461a;
            Context context = runnableC1089t.f5431c;
            if (!z6 || C0968b4.m2980n(context)) {
                c1096u.f5465e.post(new RunnableC1103v(c1096u, context));
            }
        }
    }

    public RunnableC1089t(C1096u c1096u, Context context) {
        this.f5432e = c1096u;
        this.f5431c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1096u c1096u = this.f5432e;
        Timer timer = c1096u.f5464d;
        if (timer != null) {
            timer.cancel();
            c1096u.f5464d = null;
        }
        int[] m4109d = C1686g.m4109d(3);
        Context context = this.f5431c;
        c1096u.f5463c = m4109d[context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getInt("sendLogtype", 0)];
        c1096u.f5462b = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getInt("timeinterval", 1);
        c1096u.f5461a = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getBoolean("onlywifi", false);
        if (C1686g.m4106a(c1096u.f5463c, 3) || C1686g.m4106a(c1096u.f5463c, 2)) {
            c1096u.m3230e(context);
        }
        c1096u.f5465e.postDelayed(new a(), 0);
    }
}
