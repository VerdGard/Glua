package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p174w0.C2055f;

/* renamed from: androidx.fragment.app.g0 */
/* loaded from: classes.dex */
public final class C0348g0 {

    /* renamed from: a */
    public static final C0352i0 f1712a = new C0352i0();

    /* renamed from: b */
    public static final AbstractC0358l0 f1713b;

    static {
        AbstractC0358l0 abstractC0358l0;
        try {
            abstractC0358l0 = (AbstractC0358l0) C2055f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0358l0 = null;
        }
        f1713b = abstractC0358l0;
    }

    /* renamed from: a */
    public static void m1175a(ComponentCallbacksC0361n componentCallbacksC0361n, ComponentCallbacksC0361n componentCallbacksC0361n2, boolean z6) {
        if (z6) {
            componentCallbacksC0361n2.getClass();
        } else {
            componentCallbacksC0361n.getClass();
        }
    }

    /* renamed from: b */
    public static void m1176b(ArrayList<View> arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i7);
        }
    }
}
