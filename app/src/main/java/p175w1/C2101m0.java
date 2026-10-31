package p175w1;

import android.os.Handler;
import android.os.Looper;

/* renamed from: w1.m0 */
/* loaded from: classes.dex */
public final class C2101m0 {

    /* renamed from: a */
    public static final Handler[] f9540a;

    /* renamed from: b */
    public static final Looper[] f9541b;

    static {
        HandlerThreadC2104o handlerThreadC2104o = new HandlerThreadC2104o("Main");
        handlerThreadC2104o.start();
        HandlerThreadC2104o handlerThreadC2104o2 = new HandlerThreadC2104o("Log");
        handlerThreadC2104o2.start();
        HandlerThreadC2104o handlerThreadC2104o3 = new HandlerThreadC2104o("Write");
        handlerThreadC2104o3.start();
        Looper[] looperArr = {Looper.getMainLooper(), handlerThreadC2104o.getLooper(), handlerThreadC2104o2.getLooper(), handlerThreadC2104o3.getLooper()};
        Handler[] handlerArr = {new Handler(looperArr[0]), new Handler(looperArr[1]), new Handler(looperArr[2]), new Handler(looperArr[3])};
        f9541b = looperArr;
        f9540a = handlerArr;
    }

    /* renamed from: a */
    public static void m5155a(int i7, Runnable runnable) {
        Looper[] looperArr = f9541b;
        if (looperArr == null || looperArr[i7] == null) {
            return;
        }
        if (Looper.myLooper() == looperArr[i7]) {
            runnable.run();
        } else {
            f9540a[i7].post(runnable);
        }
    }
}
