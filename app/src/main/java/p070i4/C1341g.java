package p070i4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import p054g4.C1231m;

/* renamed from: i4.g */
/* loaded from: classes.dex */
public final class C1341g implements InterfaceC1349o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Type f6554a;

    public C1341g(Type type) {
        this.f6554a = type;
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public final Object mo107e() {
        Type type = this.f6554a;
        if (!(type instanceof ParameterizedType)) {
            throw new C1231m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C1231m("Invalid EnumMap type: " + type.toString());
    }
}
