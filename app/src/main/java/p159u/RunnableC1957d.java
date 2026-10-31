package p159u;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: u.d */
/* loaded from: classes.dex */
public final class RunnableC1957d implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Object f8800c;

    /* renamed from: e */
    public final /* synthetic */ Object f8801e;

    public RunnableC1957d(Object obj, Object obj2) {
        this.f8800c = obj;
        this.f8801e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C1958e.f8805d;
            Object obj = this.f8801e;
            Object obj2 = this.f8800c;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C1958e.f8806e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e7) {
            if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                throw e7;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
