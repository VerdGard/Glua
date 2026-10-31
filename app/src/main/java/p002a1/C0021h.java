package p002a1;

import com.airbnb.lottie.C0680a;
import p002a1.C0020g;
import p075j1.ChoreographerFrameCallbackC1401b;

/* renamed from: a1.h */
/* loaded from: classes.dex */
public final class C0021h implements C0020g.e {

    /* renamed from: a */
    public final /* synthetic */ float f61a;

    /* renamed from: b */
    public final /* synthetic */ C0020g f62b;

    public C0021h(C0020g c0020g, float f7) {
        this.f62b = c0020g;
        this.f61a = f7;
    }

    @Override // p002a1.C0020g.e
    public final void run() {
        C0020g c0020g = this.f62b;
        C0680a c0680a = c0020g.f46e;
        float f7 = this.f61a;
        if (c0680a == null) {
            c0020g.f42X.add(new C0021h(c0020g, f7));
            return;
        }
        float f8 = (int) ((c0680a.f3257k - c0680a.f3256j) * f7);
        ChoreographerFrameCallbackC1401b choreographerFrameCallbackC1401b = c0020g.f47m;
        choreographerFrameCallbackC1401b.f6751Z = f8;
        if (choreographerFrameCallbackC1401b.f6749X < f8) {
            choreographerFrameCallbackC1401b.f6749X = f8;
        }
    }
}
