package p078j4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p070i4.C1335a;
import p070i4.C1338d;
import p070i4.InterfaceC1349o;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.b */
/* loaded from: classes.dex */
public final class C1413b implements InterfaceC1243y {

    /* renamed from: c */
    public final C1338d f6779c;

    /* renamed from: j4.b$a */
    public static final class a<E> extends AbstractC1242x<Collection<E>> {

        /* renamed from: a */
        public final C1426o f6780a;

        /* renamed from: b */
        public final InterfaceC1349o<? extends Collection<E>> f6781b;

        public a(C1226h c1226h, Type type, AbstractC1242x<E> abstractC1242x, InterfaceC1349o<? extends Collection<E>> interfaceC1349o) {
            this.f6780a = new C1426o(c1226h, abstractC1242x, type);
            this.f6781b = interfaceC1349o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Object mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            Collection<E> mo107e = this.f6781b.mo107e();
            c1667a.mo3771a();
            while (c1667a.mo3777k()) {
                mo107e.add(this.f6780a.mo3442a(c1667a));
            }
            c1667a.mo3773e();
            return mo107e;
        }
    }

    public C1413b(C1338d c1338d) {
        this.f6779c = c1338d;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Type type = c1644a.f7480b;
        Class<? super T> cls = c1644a.f7479a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type m3696f = C1335a.m3696f(type, cls, Collection.class);
        Class cls2 = m3696f instanceof ParameterizedType ? ((ParameterizedType) m3696f).getActualTypeArguments()[0] : Object.class;
        return new a(c1226h, cls2, c1226h.m3444b(new C1644a<>(cls2)), this.f6779c.m3700b(c1644a));
    }
}
