package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0397h;
import java.util.List;
import p032d6.C0898f;
import p160u0.C1964a;
import p160u0.InterfaceC1965b;
import p195y5.C2260h;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1965b<InterfaceC0400k> {
    @Override // p160u0.InterfaceC1965b
    /* renamed from: a */
    public final List<Class<? extends InterfaceC1965b<?>>> mo1070a() {
        return C2260h.f10276c;
    }

    @Override // p160u0.InterfaceC1965b
    /* renamed from: b */
    public final InterfaceC0400k mo1071b(Context context) {
        C0898f.m2606e(context, "context");
        C1964a m4578c = C1964a.m4578c(context);
        C0898f.m2605d(m4578c, "getInstance(context)");
        if (!m4578c.f8820b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!C0397h.f1989a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C0898f.m2604c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0397h.a());
        }
        C0408s c0408s = C0408s.f2002x1;
        c0408s.getClass();
        c0408s.f2003X = new Handler();
        c0408s.f2004Y.m1379e(AbstractC0394f.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        C0898f.m2604c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0409t(c0408s));
        return c0408s;
    }
}
