package p002a1;

import com.airbnb.lottie.C0680a;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: a1.e */
/* loaded from: classes.dex */
public final class C0018e implements InterfaceC0026m {

    /* renamed from: a */
    public final /* synthetic */ int f35a;

    /* renamed from: b */
    public final /* synthetic */ int f36b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f37c;

    public C0018e(LottieAnimationView lottieAnimationView, int i7, int i8) {
        this.f37c = lottieAnimationView;
        this.f35a = i7;
        this.f36b = i8;
    }

    @Override // p002a1.InterfaceC0026m
    /* renamed from: a */
    public final void mo109a(C0680a c0680a) {
        int i7 = this.f36b;
        int i8 = this.f35a;
        if (i8 == 3) {
            LottieAnimationView.f3224E1.put(i7, c0680a);
        } else if (i8 == 2) {
            LottieAnimationView.f3225F1.put(i7, new WeakReference<>(c0680a));
        }
        this.f37c.setComposition(c0680a);
    }
}
