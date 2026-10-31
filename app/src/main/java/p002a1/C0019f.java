package p002a1;

import com.airbnb.lottie.C0680a;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: a1.f */
/* loaded from: classes.dex */
public final class C0019f implements InterfaceC0026m {

    /* renamed from: a */
    public final /* synthetic */ int f38a;

    /* renamed from: b */
    public final /* synthetic */ String f39b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f40c;

    public C0019f(LottieAnimationView lottieAnimationView, int i7, String str) {
        this.f40c = lottieAnimationView;
        this.f38a = i7;
        this.f39b = str;
    }

    @Override // p002a1.InterfaceC0026m
    /* renamed from: a */
    public final void mo109a(C0680a c0680a) {
        String str = this.f39b;
        int i7 = this.f38a;
        if (i7 == 3) {
            LottieAnimationView.f3226G1.put(str, c0680a);
        } else if (i7 == 2) {
            LottieAnimationView.f3227H1.put(str, new WeakReference(c0680a));
        }
        this.f40c.setComposition(c0680a);
    }
}
