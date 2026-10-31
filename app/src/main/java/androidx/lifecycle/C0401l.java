package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.ext.C0091c;
import androidx.lifecycle.AbstractC0394f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p032d6.C0898f;
import p065i.C1305a;
import p073j.C1395a;
import p073j.C1396b;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class C0401l extends AbstractC0394f {

    /* renamed from: a */
    public final boolean f1990a;

    /* renamed from: b */
    public C1395a<InterfaceC0399j, a> f1991b;

    /* renamed from: c */
    public AbstractC0394f.b f1992c;

    /* renamed from: d */
    public final WeakReference<InterfaceC0400k> f1993d;

    /* renamed from: e */
    public int f1994e;

    /* renamed from: f */
    public boolean f1995f;

    /* renamed from: g */
    public boolean f1996g;

    /* renamed from: h */
    public final ArrayList<AbstractC0394f.b> f1997h;

    /* renamed from: androidx.lifecycle.l$a */
    public static final class a {

        /* renamed from: a */
        public AbstractC0394f.b f1998a;

        /* renamed from: b */
        public final InterfaceC0398i f1999b;

        public a(InterfaceC0399j interfaceC0399j, AbstractC0394f.b bVar) {
            InterfaceC0398i reflectiveGenericLifecycleObserver;
            C0898f.m2603b(interfaceC0399j);
            HashMap hashMap = C0403n.f2000a;
            boolean z6 = interfaceC0399j instanceof InterfaceC0398i;
            boolean z7 = interfaceC0399j instanceof InterfaceC0386b;
            if (z6 && z7) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0386b) interfaceC0399j, (InterfaceC0398i) interfaceC0399j);
            } else if (z7) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0386b) interfaceC0399j, null);
            } else if (z6) {
                reflectiveGenericLifecycleObserver = (InterfaceC0398i) interfaceC0399j;
            } else {
                Class<?> cls = interfaceC0399j.getClass();
                if (C0403n.m1387c(cls) == 2) {
                    Object obj = C0403n.f2001b.get(cls);
                    C0898f.m2603b(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C0403n.m1385a((Constructor) list.get(0), interfaceC0399j));
                    } else {
                        int size = list.size();
                        InterfaceC0390d[] interfaceC0390dArr = new InterfaceC0390d[size];
                        for (int i7 = 0; i7 < size; i7++) {
                            interfaceC0390dArr[i7] = C0403n.m1385a((Constructor) list.get(i7), interfaceC0399j);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0390dArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0399j);
                }
            }
            this.f1999b = reflectiveGenericLifecycleObserver;
            this.f1998a = bVar;
        }

        /* renamed from: a */
        public final void m1383a(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
            AbstractC0394f.b m1375a = aVar.m1375a();
            AbstractC0394f.b bVar = this.f1998a;
            C0898f.m2606e(bVar, "state1");
            if (m1375a.compareTo(bVar) < 0) {
                bVar = m1375a;
            }
            this.f1998a = bVar;
            this.f1999b.mo357d(interfaceC0400k, aVar);
            this.f1998a = m1375a;
        }
    }

    public C0401l(InterfaceC0400k interfaceC0400k) {
        C0898f.m2606e(interfaceC0400k, "provider");
        this.f1990a = true;
        this.f1991b = new C1395a<>();
        this.f1992c = AbstractC0394f.b.f1986e;
        this.f1997h = new ArrayList<>();
        this.f1993d = new WeakReference<>(interfaceC0400k);
    }

    @Override // androidx.lifecycle.AbstractC0394f
    /* renamed from: a */
    public final void mo1373a(InterfaceC0399j interfaceC0399j) {
        InterfaceC0400k interfaceC0400k;
        C0898f.m2606e(interfaceC0399j, "observer");
        m1378d("addObserver");
        AbstractC0394f.b bVar = this.f1992c;
        AbstractC0394f.b bVar2 = AbstractC0394f.b.f1985c;
        if (bVar != bVar2) {
            bVar2 = AbstractC0394f.b.f1986e;
        }
        a aVar = new a(interfaceC0399j, bVar2);
        if (this.f1991b.m3745c(interfaceC0399j, aVar) == null && (interfaceC0400k = this.f1993d.get()) != null) {
            boolean z6 = this.f1994e != 0 || this.f1995f;
            AbstractC0394f.b m1377c = m1377c(interfaceC0399j);
            this.f1994e++;
            while (aVar.f1998a.compareTo(m1377c) < 0 && this.f1991b.f6720X.containsKey(interfaceC0399j)) {
                AbstractC0394f.b bVar3 = aVar.f1998a;
                ArrayList<AbstractC0394f.b> arrayList = this.f1997h;
                arrayList.add(bVar3);
                AbstractC0394f.a.C2290a c2290a = AbstractC0394f.a.Companion;
                AbstractC0394f.b bVar4 = aVar.f1998a;
                c2290a.getClass();
                AbstractC0394f.a m1376a = AbstractC0394f.a.C2290a.m1376a(bVar4);
                if (m1376a == null) {
                    throw new IllegalStateException("no event up from " + aVar.f1998a);
                }
                aVar.m1383a(interfaceC0400k, m1376a);
                arrayList.remove(arrayList.size() - 1);
                m1377c = m1377c(interfaceC0399j);
            }
            if (!z6) {
                m1382h();
            }
            this.f1994e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0394f
    /* renamed from: b */
    public final void mo1374b(InterfaceC0399j interfaceC0399j) {
        C0898f.m2606e(interfaceC0399j, "observer");
        m1378d("removeObserver");
        this.f1991b.mo3744b(interfaceC0399j);
    }

    /* renamed from: c */
    public final AbstractC0394f.b m1377c(InterfaceC0399j interfaceC0399j) {
        a aVar;
        C1395a<InterfaceC0399j, a> c1395a = this.f1991b;
        C1396b.c<InterfaceC0399j, a> cVar = c1395a.f6720X.containsKey(interfaceC0399j) ? c1395a.f6720X.get(interfaceC0399j).f6728s : null;
        AbstractC0394f.b bVar = (cVar == null || (aVar = cVar.f6726e) == null) ? null : aVar.f1998a;
        ArrayList<AbstractC0394f.b> arrayList = this.f1997h;
        AbstractC0394f.b bVar2 = arrayList.isEmpty() ^ true ? arrayList.get(arrayList.size() - 1) : null;
        AbstractC0394f.b bVar3 = this.f1992c;
        C0898f.m2606e(bVar3, "state1");
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public final void m1378d(String str) {
        if (this.f1990a && !C1305a.m3618y().m3619z()) {
            throw new IllegalStateException(C0091c.m228f("Method ", str, " must be called on the main thread").toString());
        }
    }

    /* renamed from: e */
    public final void m1379e(AbstractC0394f.a aVar) {
        C0898f.m2606e(aVar, "event");
        m1378d("handleLifecycleEvent");
        m1380f(aVar.m1375a());
    }

    /* renamed from: f */
    public final void m1380f(AbstractC0394f.b bVar) {
        AbstractC0394f.b bVar2 = this.f1992c;
        if (bVar2 == bVar) {
            return;
        }
        AbstractC0394f.b bVar3 = AbstractC0394f.b.f1986e;
        AbstractC0394f.b bVar4 = AbstractC0394f.b.f1985c;
        if (!((bVar2 == bVar3 && bVar == bVar4) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f1992c + " in component " + this.f1993d.get()).toString());
        }
        this.f1992c = bVar;
        if (this.f1995f || this.f1994e != 0) {
            this.f1996g = true;
            return;
        }
        this.f1995f = true;
        m1382h();
        this.f1995f = false;
        if (this.f1992c == bVar4) {
            this.f1991b = new C1395a<>();
        }
    }

    /* renamed from: g */
    public final void m1381g() {
        AbstractC0394f.b bVar = AbstractC0394f.b.f1987m;
        m1378d("setCurrentState");
        m1380f(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1382h() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0401l.m1382h():void");
    }
}
