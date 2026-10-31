package p188x6;

import java.util.HashMap;
import p165u6.AbstractC2003u;
import p165u6.C1990h;
import p165u6.C1993k;
import p165u6.C1998p;

/* renamed from: x6.a */
/* loaded from: classes.dex */
public final class C2200a {

    /* renamed from: a */
    public static final HashMap f9973a;

    /* renamed from: b */
    public static final g f9974b;

    /* renamed from: c */
    public static final a f9975c;

    /* renamed from: d */
    public static final i f9976d;

    /* renamed from: x6.a$a */
    public static final class a implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return new C2202c(obj);
        }
    }

    /* renamed from: x6.a$b */
    public static final class b implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return ((Boolean) obj).booleanValue() ? AbstractC2003u.f9131s : AbstractC2003u.f9122X;
        }
    }

    /* renamed from: x6.a$c */
    public static final class c implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return C1993k.m4765C2(((Character) obj).charValue());
        }
    }

    /* renamed from: x6.a$d */
    public static final class d implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return C2203d.m5344C2((Class) obj);
        }
    }

    /* renamed from: x6.a$e */
    public interface e {
        /* renamed from: q */
        AbstractC2003u mo5338q(Object obj);
    }

    /* renamed from: x6.a$f */
    public static final class f implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return C1990h.m4698E2(((Number) obj).doubleValue());
        }
    }

    /* renamed from: x6.a$g */
    public static final class g implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return new C2205f(obj);
        }
    }

    /* renamed from: x6.a$h */
    public static final class h implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return C1993k.m4765C2(((Number) obj).intValue());
        }
    }

    /* renamed from: x6.a$i */
    public static final class i implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return (AbstractC2003u) obj;
        }
    }

    /* renamed from: x6.a$j */
    public static final class j implements e {
        @Override // p188x6.C2200a.e
        /* renamed from: q */
        public final AbstractC2003u mo5338q(Object obj) {
            return C1998p.m4815M2(obj.toString());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9973a = hashMap;
        b bVar = new b();
        h hVar = new h();
        c cVar = new c();
        f fVar = new f();
        j jVar = new j();
        d dVar = new d();
        hashMap.put(Boolean.class, bVar);
        hashMap.put(Byte.class, hVar);
        hashMap.put(Character.class, cVar);
        hashMap.put(Short.class, hVar);
        hashMap.put(Integer.class, hVar);
        hashMap.put(Long.class, fVar);
        hashMap.put(Float.class, fVar);
        hashMap.put(Double.class, fVar);
        hashMap.put(String.class, jVar);
        hashMap.put(Class.class, dVar);
        f9974b = new g();
        f9975c = new a();
        f9976d = new i();
    }

    /* renamed from: a */
    public static AbstractC2003u m5337a(Object obj) {
        if (obj == null) {
            return AbstractC2003u.f9130m;
        }
        Class<?> cls = obj.getClass();
        HashMap hashMap = f9973a;
        e eVar = (e) hashMap.get(cls);
        if (eVar == null) {
            eVar = cls.isArray() ? f9975c : obj instanceof AbstractC2003u ? f9976d : f9974b;
            hashMap.put(cls, eVar);
        }
        return eVar.mo5338q(obj);
    }
}
