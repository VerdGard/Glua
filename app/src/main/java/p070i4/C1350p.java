package p070i4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p054g4.InterfaceC1238t;

/* renamed from: i4.p */
/* loaded from: classes.dex */
public final class C1350p {

    /* renamed from: i4.p$a */
    public static abstract class a {

        /* renamed from: a */
        public static final a f6595a;

        /* renamed from: i4.p$a$a, reason: collision with other inner class name */
        public class C2299a extends a {

            /* renamed from: b */
            public final /* synthetic */ Method f6596b;

            public C2299a(Method method) {
                this.f6596b = method;
            }

            @Override // p070i4.C1350p.a
            /* renamed from: a */
            public final boolean mo3714a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f6596b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e7) {
                    throw new RuntimeException("Failed invoking canAccess", e7);
                }
            }
        }

        /* renamed from: i4.p$a$b */
        public class b extends a {
            @Override // p070i4.C1350p.a
            /* renamed from: a */
            public final boolean mo3714a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
        static {
            /*
                int r0 = p070i4.C1346l.f6569a
                r1 = 9
                r2 = 1
                r3 = 0
                if (r0 < r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L21
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
                i4.p$a$a r1 = new i4.p$a$a     // Catch: java.lang.NoSuchMethodException -> L21
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L21
                goto L22
            L21:
                r1 = 0
            L22:
                if (r1 != 0) goto L29
                i4.p$a$b r1 = new i4.p$a$b
                r1.<init>()
            L29:
                p070i4.C1350p.a.f6595a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p070i4.C1350p.a.<clinit>():void");
        }

        /* renamed from: a */
        public abstract boolean mo3714a(Object obj, AccessibleObject accessibleObject);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<Lg4/t;>;Ljava/lang/Class<*>;)V */
    /* renamed from: a */
    public static int m3713a(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int m3455a = ((InterfaceC1238t) it.next()).m3455a();
            if (m3455a != 2) {
                return m3455a;
            }
        }
        return 1;
    }
}
