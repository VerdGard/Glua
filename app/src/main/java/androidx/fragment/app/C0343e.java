package androidx.fragment.app;

import android.animation.Animator;
import p001a0.C0005d;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public final class C0343e implements C0005d.a {

    /* renamed from: a */
    public final /* synthetic */ Animator f1678a;

    public C0343e(Animator animator) {
        this.f1678a = animator;
    }

    @Override // p001a0.C0005d.a
    public final void onCancel() {
        this.f1678a.end();
    }
}
