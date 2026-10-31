package p002a1;

import com.airbnb.lottie.C0680a;
import p002a1.C0020g;

/* renamed from: a1.j */
/* loaded from: classes.dex */
public final class C0023j implements C0020g.e {

    /* renamed from: a */
    public final /* synthetic */ int f65a;

    /* renamed from: b */
    public final /* synthetic */ C0020g f66b;

    public C0023j(C0020g c0020g, int i7) {
        this.f66b = c0020g;
        this.f65a = i7;
    }

    @Override // p002a1.C0020g.e
    public final void run() {
        C0020g c0020g = this.f66b;
        C0680a c0680a = c0020g.f46e;
        int i7 = this.f65a;
        if (c0680a == null) {
            c0020g.f42X.add(new C0023j(c0020g, i7));
        } else {
            c0020g.m113d(i7 / (c0680a.f3257k - c0680a.f3256j));
        }
    }
}
