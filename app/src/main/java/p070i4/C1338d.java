package p070i4;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import p054g4.C1231m;
import p054g4.InterfaceC1227i;
import p054g4.InterfaceC1238t;

/* renamed from: i4.d */
/* loaded from: classes.dex */
public final class C1338d {

    /* renamed from: a */
    public final Map<Type, InterfaceC1227i<?>> f6545a;

    /* renamed from: b */
    public final boolean f6546b = true;

    /* renamed from: c */
    public final List<InterfaceC1238t> f6547c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: i4.d$a */
    public class a<T> implements InterfaceC1349o<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1227i f6548a;

        public a(InterfaceC1227i interfaceC1227i, Type type) {
            this.f6548a = interfaceC1227i;
        }

        @Override // p070i4.InterfaceC1349o
        /* renamed from: e */
        public final T mo107e() {
            return (T) this.f6548a.m3446a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: i4.d$b */
    public class b<T> implements InterfaceC1349o<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1227i f6549a;

        public b(InterfaceC1227i interfaceC1227i, Type type) {
            this.f6549a = interfaceC1227i;
        }

        @Override // p070i4.InterfaceC1349o
        /* renamed from: e */
        public final T mo107e() {
            return (T) this.f6549a.m3446a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: i4.d$c */
    public class c<T> implements InterfaceC1349o<T> {

        /* renamed from: a */
        public final /* synthetic */ String f6550a;

        public c(String str) {
            this.f6550a = str;
        }

        @Override // p070i4.InterfaceC1349o
        /* renamed from: e */
        public final T mo107e() {
            throw new C1231m(this.f6550a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: i4.d$d */
    public class d<T> implements InterfaceC1349o<T> {

        /* renamed from: a */
        public final /* synthetic */ String f6551a;

        public d(String str) {
            this.f6551a = str;
        }

        @Override // p070i4.InterfaceC1349o
        /* renamed from: e */
        public final T mo107e() {
            throw new C1231m(this.f6551a);
        }
    }

    public C1338d(Map map, List list) {
        this.f6545a = map;
        this.f6547c = list;
    }

    /* renamed from: a */
    public static String m3699a(Class<?> cls) {
        String name;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            name = cls.getName();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            name = cls.getName();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        return str.concat(name);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> p070i4.InterfaceC1349o<T> m3700b(p110n4.C1644a<T> r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1338d.m3700b(n4.a):i4.o");
    }

    public final String toString() {
        return this.f6545a.toString();
    }
}
