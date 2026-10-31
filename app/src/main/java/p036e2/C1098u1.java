package p036e2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p036e2.C1119x1;

/* renamed from: e2.u1 */
/* loaded from: classes.dex */
public final class C1098u1 {

    /* renamed from: d */
    public static volatile boolean f5470d = true;

    /* renamed from: a */
    public final b f5471a;

    /* renamed from: b */
    public Activity f5472b;

    /* renamed from: c */
    public final a f5473c = new a(Looper.getMainLooper());

    /* renamed from: e2.u1$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            b bVar;
            if (message.what == 100 && (bVar = C1098u1.this.f5471a) != null) {
                C1119x1.this.m3286e();
            }
        }
    }

    /* renamed from: e2.u1$b */
    public interface b {
    }

    public C1098u1(C1119x1.b bVar) {
        this.f5471a = bVar;
    }
}
