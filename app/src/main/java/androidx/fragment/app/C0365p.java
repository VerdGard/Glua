package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC0395f0;
import p000a.InterfaceC0001b;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C0365p implements InterfaceC0001b {

    /* renamed from: a */
    public final /* synthetic */ ActivityC0367q f1836a;

    public C0365p(ActivityC0367q activityC0367q) {
        this.f1836a = activityC0367q;
    }

    @Override // p000a.InterfaceC0001b
    /* renamed from: a */
    public final void mo0a() {
        ActivityC0367q activityC0367q = this.f1836a;
        AbstractC0375u<?> abstractC0375u = activityC0367q.f1839G1.f1866a;
        abstractC0375u.f1868X.m1315c(abstractC0375u, abstractC0375u, null);
        Bundle m1819a = activityC0367q.f173X.f8684b.m1819a("android:support:fragments");
        if (m1819a != null) {
            Parcelable parcelable = m1819a.getParcelable("android:support:fragments");
            AbstractC0375u<?> abstractC0375u2 = activityC0367q.f1839G1.f1866a;
            if (!(abstractC0375u2 instanceof InterfaceC0395f0)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            abstractC0375u2.f1868X.m1304S(parcelable);
        }
    }
}
