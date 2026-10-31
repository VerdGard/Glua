package p055g5;

/* renamed from: g5.q */
/* loaded from: classes.dex */
public final class RunnableC1260q implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ GestureDetectorOnGestureListenerC1261r f6215c;

    public RunnableC1260q(GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r) {
        this.f6215c = gestureDetectorOnGestureListenerC1261r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        GestureDetectorOnGestureListenerC1261r gestureDetectorOnGestureListenerC1261r = this.f6215c;
        if (currentTimeMillis - gestureDetectorOnGestureListenerC1261r.f6219D1 >= 3000) {
            gestureDetectorOnGestureListenerC1261r.f6246c.invalidate();
        }
    }
}
