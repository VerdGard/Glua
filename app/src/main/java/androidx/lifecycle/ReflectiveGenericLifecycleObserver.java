package androidx.lifecycle;

import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0384a;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0398i {

    /* renamed from: a */
    public final Object f1948a;

    /* renamed from: b */
    public final C0384a.a f1949b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1948a = obj;
        this.f1949b = C0384a.f1952c.m1352b(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0398i
    /* renamed from: d */
    public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
        HashMap hashMap = this.f1949b.f1955a;
        List list = (List) hashMap.get(aVar);
        Object obj = this.f1948a;
        C0384a.a.m1353a(list, interfaceC0400k, aVar, obj);
        C0384a.a.m1353a((List) hashMap.get(AbstractC0394f.a.ON_ANY), interfaceC0400k, aVar, obj);
    }
}
