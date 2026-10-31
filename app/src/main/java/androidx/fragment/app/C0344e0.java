package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p060h2.EnumC1292a;
import p060h2.InterfaceC1295d;
import p076j2.InterfaceC1404a;
import p130q2.AbstractC1741b;

/* renamed from: androidx.fragment.app.e0 */
/* loaded from: classes.dex */
public final class C0344e0 implements InterfaceC1295d {

    /* renamed from: a */
    public final Object f1679a;

    /* renamed from: b */
    public final Object f1680b;

    /* renamed from: c */
    public Object f1681c;

    public /* synthetic */ C0344e0() {
        this.f1679a = new ArrayList();
        this.f1680b = new HashMap();
    }

    public /* synthetic */ C0344e0(InterfaceC1404a interfaceC1404a, EnumC1292a enumC1292a) {
        this.f1679a = AbstractC1741b.f7950a;
        this.f1680b = interfaceC1404a;
        this.f1681c = enumC1292a;
    }

    /* renamed from: a */
    public final void m1164a(ComponentCallbacksC0361n componentCallbacksC0361n) {
        if (((ArrayList) this.f1679a).contains(componentCallbacksC0361n)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0361n);
        }
        synchronized (((ArrayList) this.f1679a)) {
            ((ArrayList) this.f1679a).add(componentCallbacksC0361n);
        }
        componentCallbacksC0361n.f1773A1 = true;
    }

    /* renamed from: b */
    public final void m1165b() {
        ((HashMap) this.f1680b).values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public final ComponentCallbacksC0361n m1166c(String str) {
        C0342d0 c0342d0 = (C0342d0) ((HashMap) this.f1680b).get(str);
        if (c0342d0 != null) {
            return c0342d0.f1674c;
        }
        return null;
    }

    /* renamed from: d */
    public final ComponentCallbacksC0361n m1167d(String str) {
        for (C0342d0 c0342d0 : ((HashMap) this.f1680b).values()) {
            if (c0342d0 != null) {
                ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
                if (!str.equals(componentCallbacksC0361n.f1798Y)) {
                    componentCallbacksC0361n = componentCallbacksC0361n.f1782J1.f1886c.m1167d(str);
                }
                if (componentCallbacksC0361n != null) {
                    return componentCallbacksC0361n;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final ArrayList m1168e() {
        ArrayList arrayList = new ArrayList();
        for (C0342d0 c0342d0 : ((HashMap) this.f1680b).values()) {
            if (c0342d0 != null) {
                arrayList.add(c0342d0);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final ArrayList m1169f() {
        ArrayList arrayList = new ArrayList();
        for (C0342d0 c0342d0 : ((HashMap) this.f1680b).values()) {
            arrayList.add(c0342d0 != null ? c0342d0.f1674c : null);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C0342d0 m1170g(String str) {
        return (C0342d0) ((HashMap) this.f1680b).get(str);
    }

    /* renamed from: h */
    public final List m1171h() {
        ArrayList arrayList;
        if (((ArrayList) this.f1679a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1679a)) {
            arrayList = new ArrayList((ArrayList) this.f1679a);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m1172i(C0342d0 c0342d0) {
        ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
        String str = componentCallbacksC0361n.f1798Y;
        Object obj = this.f1680b;
        if (((HashMap) obj).get(str) != null) {
            return;
        }
        ((HashMap) obj).put(componentCallbacksC0361n.f1798Y, c0342d0);
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0361n);
        }
    }

    /* renamed from: j */
    public final void m1173j(C0342d0 c0342d0) {
        ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
        if (componentCallbacksC0361n.f1789Q1) {
            ((C0336a0) this.f1681c).m1142b(componentCallbacksC0361n);
        }
        if (((C0342d0) ((HashMap) this.f1680b).put(componentCallbacksC0361n.f1798Y, null)) != null && AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0361n);
        }
    }
}
