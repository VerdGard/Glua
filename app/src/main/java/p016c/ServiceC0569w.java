package p016c;

import android.app.Service;
import android.content.Intent;
import android.ext.Tools;
import android.os.IBinder;

/* renamed from: c.w */
/* loaded from: classes.dex */
public final class ServiceC0569w extends Service {

    /* renamed from: c */
    public static final /* synthetic */ int f2917c = 0;

    /* renamed from: c.w$a */
    public static class a {
        /* renamed from: a */
        public static int m1990a() {
            return Tools.Semaphore.f161S9;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
