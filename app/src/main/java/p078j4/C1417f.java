package p078j4;

import androidx.activity.result.AbstractC0136c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1237s;
import p054g4.InterfaceC1243y;
import p070i4.C1335a;
import p070i4.C1338d;
import p070i4.InterfaceC1349o;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.f */
/* loaded from: classes.dex */
public final class C1417f implements InterfaceC1243y {

    /* renamed from: c */
    public final C1338d f6790c;

    /* renamed from: j4.f$a */
    public final class a<K, V> extends AbstractC1242x<Map<K, V>> {

        /* renamed from: a */
        public final C1426o f6791a;

        /* renamed from: b */
        public final C1426o f6792b;

        /* renamed from: c */
        public final InterfaceC1349o<? extends Map<K, V>> f6793c;

        public a(C1417f c1417f, C1226h c1226h, Type type, AbstractC1242x<K> abstractC1242x, Type type2, AbstractC1242x<V> abstractC1242x2, InterfaceC1349o<? extends Map<K, V>> interfaceC1349o) {
            this.f6791a = new C1426o(c1226h, abstractC1242x, type);
            this.f6792b = new C1426o(c1226h, abstractC1242x2, type2);
            this.f6793c = interfaceC1349o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Object mo3442a(C1667a c1667a) {
            int mo3785x = c1667a.mo3785x();
            if (mo3785x == 9) {
                c1667a.mo3783t();
                return null;
            }
            Map<K, V> mo107e = this.f6793c.mo107e();
            C1426o c1426o = this.f6792b;
            C1426o c1426o2 = this.f6791a;
            if (mo3785x == 1) {
                c1667a.mo3771a();
                while (c1667a.mo3777k()) {
                    c1667a.mo3771a();
                    Object mo3442a = c1426o2.mo3442a(c1667a);
                    if (mo107e.put(mo3442a, c1426o.mo3442a(c1667a)) != null) {
                        throw new C1237s("duplicate key: " + mo3442a);
                    }
                    c1667a.mo3773e();
                }
                c1667a.mo3773e();
            } else {
                c1667a.mo3772b();
                while (c1667a.mo3777k()) {
                    AbstractC0136c.f250c.m4042y(c1667a);
                    Object mo3442a2 = c1426o2.mo3442a(c1667a);
                    if (mo107e.put(mo3442a2, c1426o.mo3442a(c1667a)) != null) {
                        throw new C1237s("duplicate key: " + mo3442a2);
                    }
                }
                c1667a.mo3774f();
            }
            return mo107e;
        }
    }

    public C1417f(C1338d c1338d) {
        this.f6790c = c1338d;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Type[] actualTypeArguments;
        Type type = c1644a.f7480b;
        Class<? super T> cls = c1644a.f7479a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type m3696f = C1335a.m3696f(type, cls, Map.class);
            actualTypeArguments = m3696f instanceof ParameterizedType ? ((ParameterizedType) m3696f).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(this, c1226h, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? C1427p.f6831c : c1226h.m3444b(new C1644a<>(type2)), actualTypeArguments[1], c1226h.m3444b(new C1644a<>(actualTypeArguments[1])), this.f6790c.m3700b(c1644a));
    }
}
