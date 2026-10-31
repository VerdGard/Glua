package p174w0;

import android.ext.C0089a;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: w0.o */
/* loaded from: classes.dex */
public final class C2064o {

    /* renamed from: b */
    public final View f9429b;

    /* renamed from: a */
    public final HashMap f9428a = new HashMap();

    /* renamed from: c */
    public final ArrayList<AbstractC2057h> f9430c = new ArrayList<>();

    @Deprecated
    public C2064o() {
    }

    public C2064o(View view) {
        this.f9429b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2064o)) {
            return false;
        }
        C2064o c2064o = (C2064o) obj;
        return this.f9429b == c2064o.f9429b && this.f9428a.equals(c2064o.f9428a);
    }

    public final int hashCode() {
        return this.f9428a.hashCode() + (this.f9429b.hashCode() * 31);
    }

    public final String toString() {
        String m210h = C0089a.m210h(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9429b + "\n", "    values:");
        HashMap hashMap = this.f9428a;
        for (String str : hashMap.keySet()) {
            m210h = m210h + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m210h;
    }
}
