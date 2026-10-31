package p055g5;

/* renamed from: g5.p */
/* loaded from: classes.dex */
public final class RunnableC1259p implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ GestureDetectorOnGestureListenerC1261r f6214c;

    public RunnableC1259p(GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r) {
        this.f6214c = gestureDetectorOnGestureListenerC1261r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6214c;
        if (currentTimeMillis - gestureDetectorOnGestureListenerC1261r.f6220E1 >= 3500) {
            gestureDetectorOnGestureListenerC1261r.f6246c.invalidate();
        }
    }
}
