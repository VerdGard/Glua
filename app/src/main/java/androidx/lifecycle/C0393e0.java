package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes.dex */
public final class C0393e0 {

    /* renamed from: a */
    public final LinkedHashMap f1981a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1372a() {
        for (AbstractC0387b0 abstractC0387b0 : this.f1981a.values()) {
            HashMap hashMap = abstractC0387b0.f1960a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : abstractC0387b0.f1960a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0387b0.f1961b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : abstractC0387b0.f1961b) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e8) {
                                throw new RuntimeException(e8);
                            }
                        }
                    }
                }
            }
            abstractC0387b0.mo1141a();
        }
        this.f1981a.clear();
    }
}
