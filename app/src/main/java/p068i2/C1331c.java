package p068i2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public final class C1331c {

    /* renamed from: a */
    public boolean f6531a;

    /* renamed from: b */
    public final Handler f6532b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: i2.c$a */
    public static class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC1330b) message.obj).m3689b();
            return true;
        }
    }
}
