package p018c1;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p083k1.C1447a;
import p083k1.C1449c;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0580a<K, A> {

    /* renamed from: c */
    public final List<? extends C1447a<K>> f2953c;

    /* renamed from: e */
    public C1449c f2955e;

    /* renamed from: f */
    public C1447a<K> f2956f;

    /* renamed from: a */
    public final ArrayList f2951a = new ArrayList();

    /* renamed from: b */
    public boolean f2952b = false;

    /* renamed from: d */
    public float f2954d = 0.0f;

    /* renamed from: c1.a$a */
    public interface a {
        /* renamed from: a */
        void mo1826a();
    }

    public AbstractC0580a(List<? extends C1447a<K>> list) {
        this.f2953c = list;
    }

    /* renamed from: a */
    public final void m2026a(a aVar) {
        this.f2951a.add(aVar);
    }

    /* renamed from: b */
    public final C1447a<K> m2027b() {
        float f7;
        C1447a<K> c1447a = this.f2956f;
        if (c1447a != null) {
            float f8 = this.f2954d;
            if (f8 >= c1447a.m3831b() && f8 < c1447a.m3830a()) {
                return this.f2956f;
            }
        }
        List<? extends C1447a<K>> list = this.f2953c;
        C1447a<K> c1447a2 = list.get(list.size() - 1);
        if (this.f2954d < c1447a2.m3831b()) {
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                c1447a2 = list.get(size);
                f7 = this.f2954d;
            } while (!(f7 >= c1447a2.m3831b() && f7 < c1447a2.m3830a()));
        }
        this.f2956f = c1447a2;
        return c1447a2;
    }

    /* renamed from: c */
    public float mo2028c() {
        List<? extends C1447a<K>> list = this.f2953c;
        if (list.isEmpty()) {
            return 1.0f;
        }
        return list.get(list.size() - 1).m3830a();
    }

    /* renamed from: d */
    public final float m2029d() {
        if (this.f2952b) {
            return 0.0f;
        }
        C1447a<K> m2027b = m2027b();
        if (m2027b.f6950d == null) {
            return 0.0f;
        }
        return (this.f2954d - m2027b.m3831b()) / (m2027b.m3830a() - m2027b.m3831b());
    }

    /* renamed from: e */
    public A mo2030e() {
        C1447a<K> m2027b = m2027b();
        Interpolator interpolator = m2027b().f6950d;
        return mo2031f(m2027b, interpolator == null ? 0.0f : interpolator.getInterpolation(m2029d()));
    }

    /* renamed from: f */
    public abstract A mo2031f(C1447a<K> c1447a, float f7);

    /* renamed from: g */
    public void mo2032g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2951a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).mo1826a();
            i7++;
        }
    }

    /* renamed from: h */
    public void mo2033h(float f7) {
        List<? extends C1447a<K>> list = this.f2953c;
        if (f7 < (list.isEmpty() ? 0.0f : list.get(0).m3831b())) {
            f7 = list.isEmpty() ? 0.0f : list.get(0).m3831b();
        } else if (f7 > mo2028c()) {
            f7 = mo2028c();
        }
        if (f7 == this.f2954d) {
            return;
        }
        this.f2954d = f7;
        mo2032g();
    }

    /* renamed from: i */
    public final void m2034i(C1449c c1449c) {
        C1449c c1449c2 = this.f2955e;
        if (c1449c2 != null) {
            c1449c2.f6960b = null;
        }
        this.f2955e = c1449c;
        if (c1449c != null) {
            c1449c.f6960b = this;
        }
    }
}
