package p175w1;

import android.ext.ExceptionHandler;
import androidx.activity.C0143v;
import java.io.IOException;
import java.util.ArrayList;
import p129q1.RunnableC1731g;
import p129q1.ViewOnClickListenerC1728d;
import p165u6.C1991i;
import p183x1.C2177d;

/* renamed from: w1.e0 */
/* loaded from: classes.dex */
public final class C2085e0 extends Thread {

    /* renamed from: c */
    public final C2083d0 f9507c;

    /* renamed from: e */
    public final ViewOnClickListenerC1728d f9508e;

    public C2085e0(ViewOnClickListenerC1728d viewOnClickListenerC1728d, C2083d0 c2083d0) {
        super("Script thread");
        this.f9507c = c2083d0;
        this.f9508e = viewOnClickListenerC1728d;
        ExceptionHandler.install(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        ViewOnClickListenerC1728d viewOnClickListenerC1728d = this.f9508e;
        try {
            this.f9507c.m5144L2();
            viewOnClickListenerC1728d.m4201Q(C0143v.f267f.toString());
        } catch (IOException | C1991i e7) {
            if (e7 instanceof C2177d) {
                str = C0143v.f267f.toString() + "\n退出脚本";
            } else {
                e7.getCause();
                str = C0143v.f267f.toString() + "------------⚠️脚本运行错误⚠️------------\n" + e7.getMessage();
            }
            viewOnClickListenerC1728d.m4201Q(str);
        }
        viewOnClickListenerC1728d.getClass();
        viewOnClickListenerC1728d.f7902h2.post(new RunnableC1731g(viewOnClickListenerC1728d, new ArrayList()));
    }
}
