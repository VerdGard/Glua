package p078j4;

import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;

/* renamed from: j4.r */
/* loaded from: classes.dex */
public final class C1429r implements InterfaceC1243y {

    /* renamed from: c */
    public final /* synthetic */ Class f6861c;

    /* renamed from: e */
    public final /* synthetic */ Class f6862e;

    /* renamed from: m */
    public final /* synthetic */ AbstractC1242x f6863m;

    public C1429r(Class cls, Class cls2, AbstractC1242x abstractC1242x) {
        this.f6861c = cls;
        this.f6862e = cls2;
        this.f6863m = abstractC1242x;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Class<? super T> cls = c1644a.f7479a;
        if (cls == this.f6861c || cls == this.f6862e) {
            return this.f6863m;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6862e.getName() + "+" + this.f6861c.getName() + ",adapter=" + this.f6863m + "]";
    }
}
