package p078j4;

import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;

/* renamed from: j4.q */
/* loaded from: classes.dex */
public final class C1428q implements InterfaceC1243y {

    /* renamed from: c */
    public final /* synthetic */ Class f6859c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1242x f6860e;

    public C1428q(Class cls, AbstractC1242x abstractC1242x) {
        this.f6859c = cls;
        this.f6860e = abstractC1242x;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        if (c1644a.f7479a == this.f6859c) {
            return this.f6860e;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6859c.getName() + ",adapter=" + this.f6860e + "]";
    }
}
