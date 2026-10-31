package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p040e6.AbstractC1142c;

/* renamed from: androidx.activity.result.e */
/* loaded from: classes.dex */
public abstract class AbstractC0138e {

    /* renamed from: a */
    public final HashMap f253a = new HashMap();

    /* renamed from: b */
    public final HashMap f254b = new HashMap();

    /* renamed from: c */
    public final HashMap f255c = new HashMap();

    /* renamed from: d */
    public ArrayList<String> f256d = new ArrayList<>();

    /* renamed from: e */
    public final transient HashMap f257e = new HashMap();

    /* renamed from: f */
    public final HashMap f258f = new HashMap();

    /* renamed from: g */
    public final Bundle f259g = new Bundle();

    /* renamed from: androidx.activity.result.e$a */
    public static class a<O> {

        /* renamed from: a */
        public final InterfaceC0135b<O> f260a;

        /* renamed from: b */
        public final AbstractC0136c f261b;

        public a(InterfaceC0135b<O> interfaceC0135b, AbstractC0136c abstractC0136c) {
            this.f260a = interfaceC0135b;
            this.f261b = abstractC0136c;
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    public static class b {
    }

    /* renamed from: a */
    public final boolean m396a(int i7, int i8, Intent intent) {
        InterfaceC0135b<O> interfaceC0135b;
        String str = (String) this.f253a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f257e.get(str);
        if (aVar == null || (interfaceC0135b = aVar.f260a) == 0 || !this.f256d.contains(str)) {
            this.f258f.remove(str);
            this.f259g.putParcelable(str, new C0134a(intent, i8));
            return true;
        }
        interfaceC0135b.mo378a(aVar.f261b.mo395x(intent, i8));
        this.f256d.remove(str);
        return true;
    }

    /* renamed from: b */
    public final C0137d m397b(String str, AbstractC0136c abstractC0136c, InterfaceC0135b interfaceC0135b) {
        int mo3325a;
        HashMap hashMap;
        HashMap hashMap2 = this.f254b;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                mo3325a = AbstractC1142c.f5678c.mo3325a() + 65536;
                hashMap = this.f253a;
            } while (hashMap.containsKey(Integer.valueOf(mo3325a)));
            hashMap.put(Integer.valueOf(mo3325a), str);
            hashMap2.put(str, Integer.valueOf(mo3325a));
        }
        this.f257e.put(str, new a(interfaceC0135b, abstractC0136c));
        HashMap hashMap3 = this.f258f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            interfaceC0135b.mo378a(obj);
        }
        Bundle bundle = this.f259g;
        C0134a c0134a = (C0134a) bundle.getParcelable(str);
        if (c0134a != null) {
            bundle.remove(str);
            interfaceC0135b.mo378a(abstractC0136c.mo395x(c0134a.f249e, c0134a.f248c));
        }
        return new C0137d(this, str);
    }
}
