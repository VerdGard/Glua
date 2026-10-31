package p002a1;

import com.airbnb.lottie.C0680a;
import p002a1.C0020g;
import p075j1.ChoreographerFrameCallbackC1401b;

/* renamed from: a1.i */
/* loaded from: classes.dex */
public final class C0022i implements C0020g.e {

    /* renamed from: a */
    public final /* synthetic */ float f63a;

    /* renamed from: b */
    public final /* synthetic */ C0020g f64b;

    public C0022i(C0020g c0020g, float f7) {
        this.f64b = c0020g;
        this.f63a = f7;
    }

    @Override // p002a1.C0020g.e
    public final void run() {
        C0020g c0020g = this.f64b;
        C0680a c0680a = c0020g.f46e;
        float f7 = this.f63a;
        if (c0680a == null) {
            c0020g.f42X.add(new C0022i(c0020g, f7));
            return;
        }
        float f8 = (int) ((c0680a.f3257k - c0680a.f3256j) * f7);
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        choreographerFrameCallbackC1401b.f6754w1 = f8;
        if (choreographerFrameCallbackC1401b.f6749X > f8) {
            choreographerFrameCallbackC1401b.f6749X = f8;
        }
    }
}
