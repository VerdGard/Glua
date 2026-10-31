package p036e2;

import android.view.KeyEvent;
import android.view.MotionEvent;
import p036e2.WindowCallbackC1112w1;

/* renamed from: e2.v1 */
/* loaded from: classes.dex */
public final class C1105v1 implements WindowCallbackC1112w1.a {

    /* renamed from: a */
    public final /* synthetic */ C1098u1 f5483a;

    public C1105v1(C1098u1 c1098u1) {
        this.f5483a = c1098u1;
    }

    @Override // p036e2.WindowCallbackC1112w1.a
    /* renamed from: a */
    public final void mo3026a(KeyEvent keyEvent) {
    }

    @Override // p036e2.WindowCallbackC1112w1.a
    /* renamed from: b */
    public final void mo3027b(MotionEvent motionEvent) {
        C1126y1.f5609d = 0;
        C1098u1.f5470d = true;
        int actionMasked = motionEvent.getActionMasked();
        C1098u1 c1098u1 = this.f5483a;
        if (actionMasked == 5) {
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 3 && motionEvent.getEventTime() - motionEvent.getDownTime() <= 50) {
                c1098u1.f5473c.sendEmptyMessageDelayed(100, 2500L);
                return;
            } else if (pointerCount <= 3) {
                return;
            }
        } else if (actionMasked != 6 || motionEvent.getEventTime() - motionEvent.getDownTime() >= 2500) {
            return;
        }
        c1098u1.f5473c.removeMessages(100);
    }
}
