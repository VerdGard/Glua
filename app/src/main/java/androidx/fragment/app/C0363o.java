package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0394f;
import androidx.savedstate.C0493a;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public final class C0363o implements C0493a.b {

    /* renamed from: a */
    public final /* synthetic */ ActivityC0367q f1833a;

    public C0363o(ActivityC0367q activityC0367q) {
        this.f1833a = activityC0367q;
    }

    @Override // androidx.savedstate.C0493a.b
    /* renamed from: a */
    public final Bundle mo374a() {
        ActivityC0367q activityC0367q;
        Bundle bundle = new Bundle();
        do {
            activityC0367q = this.f1833a;
        } while (ActivityC0367q.m1248q(activityC0367q.f1839G1.f1866a.f1868X));
        activityC0367q.f1840H1.m1379e(AbstractC0394f.a.ON_STOP);
        C0380z m1305T = activityC0367q.f1839G1.f1866a.f1868X.m1305T();
        if (m1305T != null) {
            bundle.putParcelable("android:support:fragments", m1305T);
        }
        return bundle;
    }
}
