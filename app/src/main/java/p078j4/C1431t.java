package p078j4;

import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1237s;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.t */
/* loaded from: classes.dex */
public final class C1431t implements InterfaceC1243y {

    /* renamed from: c */
    public final /* synthetic */ Class f6867c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1242x f6868e;

    /* renamed from: j4.t$a */
    public class a extends AbstractC1242x<Object> {

        /* renamed from: a */
        public final /* synthetic */ Class f6869a;

        public a(Class cls) {
            this.f6869a = cls;
        }

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Object mo3442a(C1667a c1667a) {
            Object mo3442a = C1431t.this.f6868e.mo3442a(c1667a);
            if (mo3442a != null) {
                Class cls = this.f6869a;
                if (!cls.isInstance(mo3442a)) {
                    throw new C1237s("Expected a " + cls.getName() + " but was " + mo3442a.getClass().getName() + "; at path " + c1667a.mo3776j());
                }
            }
            return mo3442a;
        }
    }

    public C1431t(Class cls, AbstractC1242x abstractC1242x) {
        this.f6867c = cls;
        this.f6868e = abstractC1242x;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T2> AbstractC1242x<T2> mo3457a(C1226h c1226h, C1644a<T2> c1644a) {
        Class<? super T2> cls = c1644a.f7479a;
        if (this.f6867c.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f6867c.getName() + ",adapter=" + this.f6868e + "]";
    }
}
