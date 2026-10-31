package p078j4;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p070i4.C1335a;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C1412a<E> extends AbstractC1242x<Object> {

    /* renamed from: c */
    public static final a f6776c = new a();

    /* renamed from: a */
    public final Class<E> f6777a;

    /* renamed from: b */
    public final C1426o f6778b;

    /* renamed from: j4.a$a */
    public class a implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            Type type = c1644a.f7480b;
            boolean z6 = type instanceof GenericArrayType;
            if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C1412a(c1226h, c1226h.m3444b(new C1644a<>(genericComponentType)), C1335a.m3695e(genericComponentType));
        }
    }

    public C1412a(C1226h c1226h, AbstractC1242x<E> abstractC1242x, Class<E> cls) {
        this.f6778b = new C1426o(c1226h, abstractC1242x, cls);
        this.f6777a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Object mo3442a(C1667a c1667a) {
        if (c1667a.mo3785x() == 9) {
            c1667a.mo3783t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c1667a.mo3771a();
        while (c1667a.mo3777k()) {
            arrayList.add(this.f6778b.mo3442a(c1667a));
        }
        c1667a.mo3773e();
        int size = arrayList.size();
        Class<E> cls = this.f6777a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i7 = 0; i7 < size; i7++) {
            Array.set(newInstance, i7, arrayList.get(i7));
        }
        return newInstance;
    }
}
