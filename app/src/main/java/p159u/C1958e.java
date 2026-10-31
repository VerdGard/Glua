package p159u;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C1958e {

    /* renamed from: a */
    public static final Class<?> f8802a;

    /* renamed from: b */
    public static final Field f8803b;

    /* renamed from: c */
    public static final Field f8804c;

    /* renamed from: d */
    public static final Method f8805d;

    /* renamed from: e */
    public static final Method f8806e;

    /* renamed from: f */
    public static final Method f8807f;

    /* renamed from: g */
    public static final Handler f8808g = new Handler(Looper.getMainLooper());

    /* renamed from: u.e$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f8809a;

        /* renamed from: b */
        public Activity f8810b;

        /* renamed from: c */
        public final int f8811c;

        /* renamed from: d */
        public boolean f8812d = false;

        /* renamed from: e */
        public boolean f8813e = false;

        /* renamed from: f */
        public boolean f8814f = false;

        public a(Activity activity) {
            this.f8810b = activity;
            this.f8811c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f8810b == activity) {
                this.f8810b = null;
                this.f8813e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f8813e || this.f8814f || this.f8812d) {
                return;
            }
            Object obj = this.f8809a;
            boolean z6 = false;
            try {
                Object obj2 = C1958e.f8804c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f8811c) {
                    C1958e.f8808g.postAtFrontOfQueue(new RunnableC1957d(C1958e.f8803b.get(activity), obj2));
                    z6 = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z6) {
                this.f8814f = true;
                this.f8809a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f8810b == activity) {
                this.f8812d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            p159u.C1958e.f8808g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            p159u.C1958e.f8802a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            p159u.C1958e.f8803b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = r1
        L32:
            p159u.C1958e.f8804c = r0
            java.lang.Class<?> r0 = p159u.C1958e.f8802a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L40
            goto L55
        L40:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L54
            r8[r3] = r7     // Catch: java.lang.Throwable -> L54
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L54
            r8[r2] = r9     // Catch: java.lang.Throwable -> L54
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L54
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
        L55:
            r0 = r1
        L56:
            p159u.C1958e.f8805d = r0
            java.lang.Class<?> r0 = p159u.C1958e.f8802a
            if (r0 != 0) goto L5d
            goto L6d
        L5d:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L6d
            r8[r3] = r7     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6d
            r8[r2] = r9     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            p159u.C1958e.f8806e = r0
            java.lang.Class<?> r0 = p159u.C1958e.f8802a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L83
            r10 = 27
            if (r9 != r10) goto L81
            goto L83
        L81:
            r9 = 0
            goto L84
        L83:
            r9 = 1
        L84:
            if (r9 == 0) goto Lb3
            if (r0 != 0) goto L89
            goto Lb3
        L89:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb3
            r10[r3] = r7     // Catch: java.lang.Throwable -> Lb3
            r10[r2] = r8     // Catch: java.lang.Throwable -> Lb3
            r10[r6] = r8     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb3
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            r4 = 5
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 6
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb3
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb3
            r1 = r0
        Lb3:
            p159u.C1958e.f8807f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159u.C1958e.<clinit>():void");
    }
}
