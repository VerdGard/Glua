package p070i4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p054g4.C1231m;

/* renamed from: i4.f */
/* loaded from: classes.dex */
public final class C1340f implements InterfaceC1349o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Type f6553a;

    public C1340f(Type type) {
        this.f6553a = type;
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public final Object mo107e() {
        Type type = this.f6553a;
        if (!(type instanceof ParameterizedType)) {
            throw new C1231m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C1231m("Invalid EnumSet type: " + type.toString());
    }
}
