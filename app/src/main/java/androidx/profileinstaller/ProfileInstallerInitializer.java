package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p160u0.InterfaceC1965b;
import p173w.RunnableC2045g;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1965b<C0419c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C0417a {
        /* renamed from: a */
        public static void m1414a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: s0.f
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C0418b {
        /* renamed from: a */
        public static Handler m1415a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C0419c {
    }

    @Override // p160u0.InterfaceC1965b
    /* renamed from: a */
    public final List<Class<? extends InterfaceC1965b<?>>> mo1070a() {
        return Collections.emptyList();
    }

    @Override // p160u0.InterfaceC1965b
    /* renamed from: b */
    public final C0419c mo1071b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0419c();
        }
        C0417a.m1414a(new RunnableC2045g(this, 1, context.getApplicationContext()));
        return new C0419c();
    }
}
