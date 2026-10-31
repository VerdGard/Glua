package p070i4;

import androidx.activity.C0143v;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public final class C1335a {

    /* renamed from: a */
    public static final Type[] f6537a = new Type[0];

    /* renamed from: i4.a$a */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: c */
        public final Type f6538c;

        public a(Type type) {
            Objects.requireNonNull(type);
            this.f6538c = C1335a.m3691a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C1335a.m3693c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f6538c;
        }

        public final int hashCode() {
            return this.f6538c.hashCode();
        }

        public final String toString() {
            return C1335a.m3698h(this.f6538c) + "[]";
        }
    }

    /* renamed from: i4.a$b */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: c */
        public final Type f6539c;

        /* renamed from: e */
        public final Type f6540e;

        /* renamed from: m */
        public final Type[] f6541m;

        public b(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z6 = true;
                boolean z7 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z7) {
                    z6 = false;
                }
                C0143v.m456p(z6);
            }
            this.f6539c = type == null ? null : C1335a.m3691a(type);
            this.f6540e = C1335a.m3691a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f6541m = typeArr2;
            int length = typeArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                Objects.requireNonNull(this.f6541m[i7]);
                C1335a.m3692b(this.f6541m[i7]);
                Type[] typeArr3 = this.f6541m;
                typeArr3[i7] = C1335a.m3691a(typeArr3[i7]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C1335a.m3693c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f6541m.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f6539c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f6540e;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f6541m) ^ this.f6540e.hashCode();
            Type type = this.f6539c;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f6541m;
            int length = typeArr.length;
            Type type = this.f6540e;
            if (length == 0) {
                return C1335a.m3698h(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C1335a.m3698h(type));
            sb.append("<");
            sb.append(C1335a.m3698h(typeArr[0]));
            for (int i7 = 1; i7 < length; i7++) {
                sb.append(", ");
                sb.append(C1335a.m3698h(typeArr[i7]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: i4.a$c */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: c */
        public final Type f6542c;

        /* renamed from: e */
        public final Type f6543e;

        public c(Type[] typeArr, Type[] typeArr2) {
            C0143v.m456p(typeArr2.length <= 1);
            C0143v.m456p(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C1335a.m3692b(typeArr[0]);
                this.f6543e = null;
                this.f6542c = C1335a.m3691a(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            C1335a.m3692b(typeArr2[0]);
            C0143v.m456p(typeArr[0] == Object.class);
            this.f6543e = C1335a.m3691a(typeArr2[0]);
            this.f6542c = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C1335a.m3693c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f6543e;
            return type != null ? new Type[]{type} : C1335a.f6537a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f6542c};
        }

        public final int hashCode() {
            Type type = this.f6543e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6542c.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f6543e;
            if (type != null) {
                return "? super " + C1335a.m3698h(type);
            }
            Type type2 = this.f6542c;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C1335a.m3698h(type2);
        }
    }

    /* renamed from: a */
    public static Type m3691a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m3691a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: b */
    public static void m3692b(Type type) {
        C0143v.m456p(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: c */
    public static boolean m3693c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m3693c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: d */
    public static Type m3694d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m3694d(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m3694d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Class<?> m3695e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C0143v.m456p(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m3695e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m3695e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: f */
    public static Type m3696f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C0143v.m456p(cls2.isAssignableFrom(cls));
        return m3697g(type, cls, m3694d(type, cls, cls2), new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0142, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0144, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0147, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142 A[EDGE_INSN: B:24:0x0142->B:25:0x0142 BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [i4.a$c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [i4.a$c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type m3697g(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1335a.m3697g(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    /* renamed from: h */
    public static String m3698h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
