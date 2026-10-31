package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.C0323g;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0386b;
import androidx.lifecycle.InterfaceC0400k;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a0.C0013l;
import p160u0.C1964a;
import p160u0.InterfaceC1965b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1965b<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C0314a extends C0323g.c {
        public C0314a(Context context) {
            super(new C0315b(context));
            this.f1570b = 1;
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0315b implements C0323g.g {

        /* renamed from: a */
        public final Context f1551a;

        public C0315b(Context context) {
            this.f1551a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0323g.g
        /* renamed from: a */
        public final void mo1080a(C0323g.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0317a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new RunnableC0324h(this, hVar, threadPoolExecutor, 0));
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class RunnableC0316c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i7 = C0013l.f12a;
                C0013l.a.m60a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0323g.f1557j != null) {
                    C0323g.m1102a().m1104c();
                }
                C0013l.a.m61b();
            } catch (Throwable th) {
                int i8 = C0013l.f12a;
                C0013l.a.m61b();
                throw th;
            }
        }
    }

    @Override // p160u0.InterfaceC1965b
    /* renamed from: a */
    public final List<Class<? extends InterfaceC1965b<?>>> mo1070a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p160u0.InterfaceC1965b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean mo1071b(Context context) {
        C0314a c0314a = new C0314a(context);
        if (C0323g.f1557j == null) {
            synchronized (C0323g.f1556i) {
                if (C0323g.f1557j == null) {
                    C0323g.f1557j = new C0323g(c0314a);
                }
            }
        }
        m1073d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final void m1073d(Context context) {
        Object obj;
        C1964a m4578c = C1964a.m4578c(context);
        m4578c.getClass();
        synchronized (C1964a.f8818e) {
            try {
                obj = m4578c.f8819a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m4578c.m4580b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final C0401l mo354m = ((InterfaceC0400k) obj).mo354m();
        mo354m.mo1373a(new InterfaceC0386b() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: a */
            public final void mo1074a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? C0319c.m1097a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0316c(), 500L);
                mo354m.mo1374b(this);
            }

            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: b */
            public final void mo1075b(InterfaceC0400k interfaceC0400k) {
            }

            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: c */
            public final void mo1076c(InterfaceC0400k interfaceC0400k) {
            }

            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: e */
            public final void mo1077e(InterfaceC0400k interfaceC0400k) {
            }

            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: f */
            public final void mo1078f(InterfaceC0400k interfaceC0400k) {
            }

            @Override // androidx.lifecycle.InterfaceC0386b
            /* renamed from: g */
            public final void mo1079g(InterfaceC0400k interfaceC0400k) {
            }
        });
    }
}
