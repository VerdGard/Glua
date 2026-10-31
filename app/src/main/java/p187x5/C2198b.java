package p187x5;

import androidx.activity.C0143v;
import androidx.lifecycle.C0415z;
import java.io.Serializable;
import p023c6.InterfaceC0655a;
import p032d6.C0898f;

/* renamed from: x5.b */
/* loaded from: classes.dex */
public final class C2198b<T> implements Serializable {

    /* renamed from: c */
    public InterfaceC0655a<? extends T> f9969c;

    /* renamed from: e */
    public volatile Object f9970e = C0143v.f268g;

    /* renamed from: m */
    public final Object f9971m = this;

    public C2198b(C0415z.a aVar) {
        this.f9969c = aVar;
    }

    /* renamed from: a */
    public final T m5336a() {
        T t7;
        T t8 = (T) this.f9970e;
        C0143v c0143v = C0143v.f268g;
        if (t8 != c0143v) {
            return t8;
        }
        synchronized (this.f9971m) {
            t7 = (T) this.f9970e;
            if (t7 == c0143v) {
                InterfaceC0655a<? extends T> interfaceC0655a = this.f9969c;
                C0898f.m2603b(interfaceC0655a);
                t7 = interfaceC0655a.mo373a();
                this.f9970e = t7;
                this.f9969c = null;
            }
        }
        return t7;
    }

    public final String toString() {
        return this.f9970e != C0143v.f268g ? String.valueOf(m5336a()) : "Lazy value not initialized yet.";
    }
}
