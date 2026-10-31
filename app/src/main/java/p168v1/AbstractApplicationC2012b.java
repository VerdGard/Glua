package p168v1;

import android.app.Application;
import android.text.TextUtils;
import p019c2.C0598f;
import p036e2.C0981d3;
import p036e2.C0991f;
import p036e2.C1023j3;
import p036e2.C1042m1;
import p036e2.C1054o;
import p036e2.C1085s2;
import p036e2.C1119x1;
import p036e2.C1124y;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC2012b extends Application {

    /* renamed from: c */
    public static AbstractApplicationC2012b f9161c;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        f9161c = this;
        C0598f c0598f = C0598f.f2993d;
        c0598f.getClass();
        c0598f.f2995b = getApplicationContext();
        c0598f.f2994a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c0598f);
        f9161c.getResources();
        C1023j3 c1023j3 = C1023j3.f5170m;
        c1023j3.f5171e = true;
        if (C1124y.m3299b(this, "autoTrace(...)") && !C1124y.m3298a(this)) {
            String m3131e = C1054o.m3127l().m3131e(this);
            if (TextUtils.isEmpty(m3131e)) {
                c1023j3.m382g(6, "[WARNING] AppKey is invalid, auto trace will do not take effect");
                return;
            }
            C1042m1.f5244a = true;
            C1119x1 c1119x1 = C1119x1.f5553E;
            c1119x1.f5577t = m3131e;
            c1119x1.f5578u = false;
            if (!C1124y.f5606a) {
                if (!C0981d3.f5007b.f5008a) {
                    C1085s2.f5407x.f5413f = 1;
                }
                C1124y.f5606a = true;
            }
            C0991f.m3015d().m3017c(this);
        }
    }
}
