package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.FragmentC0410u;
import java.util.concurrent.atomic.AtomicBoolean;
import p032d6.C0898f;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C0397h {

    /* renamed from: a */
    public static final AtomicBoolean f1989a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.h$a */
    public static final class a extends C0388c {
        @Override // androidx.lifecycle.C0388c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            FragmentC0410u.b.m1411b(activity);
        }
    }
}
