package p174w0;

import android.view.View;
import android.view.WindowId;

/* renamed from: w0.z */
/* loaded from: classes.dex */
public final class C2075z implements InterfaceC2050a0 {

    /* renamed from: a */
    public final WindowId f9461a;

    public C2075z(View view) {
        this.f9461a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2075z) && ((C2075z) obj).f9461a.equals(this.f9461a);
    }

    public final int hashCode() {
        return this.f9461a.hashCode();
    }
}
