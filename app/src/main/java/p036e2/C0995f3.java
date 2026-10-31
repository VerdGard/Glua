package p036e2;

import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import p036e2.WindowCallbackC1112w1;

/* renamed from: e2.f3 */
/* loaded from: classes.dex */
public final class C0995f3 implements WindowCallbackC1112w1.a {

    /* renamed from: a */
    public final /* synthetic */ C1009h3 f5066a;

    public C0995f3(C1009h3 c1009h3) {
        this.f5066a = c1009h3;
    }

    @Override // p036e2.WindowCallbackC1112w1.a
    /* renamed from: a */
    public final void mo3026a(KeyEvent keyEvent) {
        if (C0973c2.f4982d.f4983a) {
            return;
        }
        C1085s2 c1085s2 = C1085s2.f5407x;
        if (!c1085s2.m3182e() && keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            c1085s2.f5410c.post(new RunnableC0994f2(c1085s2));
        }
    }

    @Override // p036e2.WindowCallbackC1112w1.a
    /* renamed from: b */
    public final void mo3027b(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        C1058o3.f5275j = 0;
        C1009h3.f5098l = true;
        C1009h3 c1009h3 = this.f5066a;
        if (c1009h3.f5107i == null) {
            c1009h3.f5107i = new PointF();
        }
        c1009h3.f5107i.set(motionEvent.getRawX(), motionEvent.getRawY());
    }
}
