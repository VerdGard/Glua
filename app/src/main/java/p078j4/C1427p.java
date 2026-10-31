package p078j4;

import android.ext.C0090b;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p054g4.AbstractC1230l;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1228j;
import p054g4.C1231m;
import p054g4.C1232n;
import p054g4.C1233o;
import p054g4.C1235q;
import p054g4.C1237s;
import p054g4.C1241w;
import p054g4.InterfaceC1243y;
import p062h4.InterfaceC1299b;
import p070i4.C1347m;
import p070i4.C1348n;
import p110n4.C1644a;
import p117o4.C1667a;
import p117o4.C1668b;
import p120p.C1686g;

/* renamed from: j4.p */
/* loaded from: classes.dex */
public final class C1427p {

    /* renamed from: A */
    public static final C1431t f6827A;

    /* renamed from: B */
    public static final u f6828B;

    /* renamed from: a */
    public static final C1428q f6829a = new C1428q(Class.class, new C1241w(new k()));

    /* renamed from: b */
    public static final C1428q f6830b = new C1428q(BitSet.class, new C1241w(new v()));

    /* renamed from: c */
    public static final x f6831c;

    /* renamed from: d */
    public static final C1429r f6832d;

    /* renamed from: e */
    public static final C1429r f6833e;

    /* renamed from: f */
    public static final C1429r f6834f;

    /* renamed from: g */
    public static final C1429r f6835g;

    /* renamed from: h */
    public static final C1428q f6836h;

    /* renamed from: i */
    public static final C1428q f6837i;

    /* renamed from: j */
    public static final C1428q f6838j;

    /* renamed from: k */
    public static final b f6839k;

    /* renamed from: l */
    public static final C1429r f6840l;

    /* renamed from: m */
    public static final g f6841m;

    /* renamed from: n */
    public static final h f6842n;

    /* renamed from: o */
    public static final i f6843o;

    /* renamed from: p */
    public static final C1428q f6844p;

    /* renamed from: q */
    public static final C1428q f6845q;

    /* renamed from: r */
    public static final C1428q f6846r;

    /* renamed from: s */
    public static final C1428q f6847s;

    /* renamed from: t */
    public static final C1428q f6848t;

    /* renamed from: u */
    public static final C1431t f6849u;

    /* renamed from: v */
    public static final C1428q f6850v;

    /* renamed from: w */
    public static final C1428q f6851w;

    /* renamed from: x */
    public static final C1430s f6852x;

    /* renamed from: y */
    public static final C1428q f6853y;

    /* renamed from: z */
    public static final t f6854z;

    /* renamed from: j4.p$a */
    public class a extends AbstractC1242x<AtomicIntegerArray> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final AtomicIntegerArray mo3442a(C1667a c1667a) {
            ArrayList arrayList = new ArrayList();
            c1667a.mo3771a();
            while (c1667a.mo3777k()) {
                try {
                    arrayList.add(Integer.valueOf(c1667a.mo3780p()));
                } catch (NumberFormatException e7) {
                    throw new C1237s(e7);
                }
            }
            c1667a.mo3773e();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
            }
            return atomicIntegerArray;
        }
    }

    /* renamed from: j4.p$a0 */
    public class a0 extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            try {
                return Integer.valueOf(c1667a.mo3780p());
            } catch (NumberFormatException e7) {
                throw new C1237s(e7);
            }
        }
    }

    /* renamed from: j4.p$b */
    public class b extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            try {
                return Long.valueOf(c1667a.mo3781q());
            } catch (NumberFormatException e7) {
                throw new C1237s(e7);
            }
        }
    }

    /* renamed from: j4.p$b0 */
    public class b0 extends AbstractC1242x<AtomicInteger> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final AtomicInteger mo3442a(C1667a c1667a) {
            try {
                return new AtomicInteger(c1667a.mo3780p());
            } catch (NumberFormatException e7) {
                throw new C1237s(e7);
            }
        }
    }

    /* renamed from: j4.p$c */
    public class c extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return Float.valueOf((float) c1667a.mo3779o());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$c0 */
    public class c0 extends AbstractC1242x<AtomicBoolean> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final AtomicBoolean mo3442a(C1667a c1667a) {
            return new AtomicBoolean(c1667a.mo3778n());
        }
    }

    /* renamed from: j4.p$d */
    public class d extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return Double.valueOf(c1667a.mo3779o());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$d0 */
    public static final class d0<T extends Enum<T>> extends AbstractC1242x<T> {

        /* renamed from: a */
        public final HashMap f6855a = new HashMap();

        /* renamed from: b */
        public final HashMap f6856b = new HashMap();

        /* renamed from: c */
        public final HashMap f6857c = new HashMap();

        /* renamed from: j4.p$d0$a */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            public final /* synthetic */ Class f6858a;

            public a(Class cls) {
                this.f6858a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f6858a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    InterfaceC1299b interfaceC1299b = (InterfaceC1299b) field.getAnnotation(InterfaceC1299b.class);
                    if (interfaceC1299b != null) {
                        name = interfaceC1299b.value();
                        for (String str2 : interfaceC1299b.alternate()) {
                            this.f6855a.put(str2, r42);
                        }
                    }
                    this.f6855a.put(name, r42);
                    this.f6856b.put(str, r42);
                    this.f6857c.put(r42, name);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Object mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            String mo3784v = c1667a.mo3784v();
            Enum r02 = (Enum) this.f6855a.get(mo3784v);
            return r02 == null ? (Enum) this.f6856b.get(mo3784v) : r02;
        }
    }

    /* renamed from: j4.p$e */
    public class e extends AbstractC1242x<Character> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Character mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            String mo3784v = c1667a.mo3784v();
            if (mo3784v.length() == 1) {
                return Character.valueOf(mo3784v.charAt(0));
            }
            StringBuilder m222h = C0090b.m222h("Expecting character, got: ", mo3784v, "; at ");
            m222h.append(c1667a.mo3776j());
            throw new C1237s(m222h.toString());
        }
    }

    /* renamed from: j4.p$f */
    public class f extends AbstractC1242x<String> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final String mo3442a(C1667a c1667a) {
            int mo3785x = c1667a.mo3785x();
            if (mo3785x != 9) {
                return mo3785x == 8 ? Boolean.toString(c1667a.mo3778n()) : c1667a.mo3784v();
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$g */
    public class g extends AbstractC1242x<BigDecimal> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final BigDecimal mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            String mo3784v = c1667a.mo3784v();
            try {
                return new BigDecimal(mo3784v);
            } catch (NumberFormatException e7) {
                StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as BigDecimal; at path ");
                m222h.append(c1667a.mo3776j());
                throw new C1237s(m222h.toString(), e7);
            }
        }
    }

    /* renamed from: j4.p$h */
    public class h extends AbstractC1242x<BigInteger> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final BigInteger mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            String mo3784v = c1667a.mo3784v();
            try {
                return new BigInteger(mo3784v);
            } catch (NumberFormatException e7) {
                StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as BigInteger; at path ");
                m222h.append(c1667a.mo3776j());
                throw new C1237s(m222h.toString(), e7);
            }
        }
    }

    /* renamed from: j4.p$i */
    public class i extends AbstractC1242x<C1347m> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final C1347m mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return new C1347m(c1667a.mo3784v());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$j */
    public class j extends AbstractC1242x<StringBuilder> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final StringBuilder mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return new StringBuilder(c1667a.mo3784v());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$k */
    public class k extends AbstractC1242x<Class> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Class mo3442a(C1667a c1667a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: j4.p$l */
    public class l extends AbstractC1242x<StringBuffer> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final StringBuffer mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return new StringBuffer(c1667a.mo3784v());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$m */
    public class m extends AbstractC1242x<URL> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final URL mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
            } else {
                String mo3784v = c1667a.mo3784v();
                if (!"null".equals(mo3784v)) {
                    return new URL(mo3784v);
                }
            }
            return null;
        }
    }

    /* renamed from: j4.p$n */
    public class n extends AbstractC1242x<URI> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final URI mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
            } else {
                try {
                    String mo3784v = c1667a.mo3784v();
                    if (!"null".equals(mo3784v)) {
                        return new URI(mo3784v);
                    }
                } catch (URISyntaxException e7) {
                    throw new C1231m(e7);
                }
            }
            return null;
        }
    }

    /* renamed from: j4.p$o */
    public class o extends AbstractC1242x<InetAddress> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final InetAddress mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return InetAddress.getByName(c1667a.mo3784v());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$p */
    public class p extends AbstractC1242x<UUID> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final UUID mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            String mo3784v = c1667a.mo3784v();
            try {
                return UUID.fromString(mo3784v);
            } catch (IllegalArgumentException e7) {
                StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as UUID; at path ");
                m222h.append(c1667a.mo3776j());
                throw new C1237s(m222h.toString(), e7);
            }
        }
    }

    /* renamed from: j4.p$q */
    public class q extends AbstractC1242x<Currency> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Currency mo3442a(C1667a c1667a) {
            String mo3784v = c1667a.mo3784v();
            try {
                return Currency.getInstance(mo3784v);
            } catch (IllegalArgumentException e7) {
                StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as Currency; at path ");
                m222h.append(c1667a.mo3776j());
                throw new C1237s(m222h.toString(), e7);
            }
        }
    }

    /* renamed from: j4.p$r */
    public class r extends AbstractC1242x<Calendar> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Calendar mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            c1667a.mo3772b();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (c1667a.mo3785x() != 4) {
                String mo3782r = c1667a.mo3782r();
                int mo3780p = c1667a.mo3780p();
                if ("year".equals(mo3782r)) {
                    i7 = mo3780p;
                } else if ("month".equals(mo3782r)) {
                    i8 = mo3780p;
                } else if ("dayOfMonth".equals(mo3782r)) {
                    i9 = mo3780p;
                } else if ("hourOfDay".equals(mo3782r)) {
                    i10 = mo3780p;
                } else if ("minute".equals(mo3782r)) {
                    i11 = mo3780p;
                } else if ("second".equals(mo3782r)) {
                    i12 = mo3780p;
                }
            }
            c1667a.mo3774f();
            return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
        }
    }

    /* renamed from: j4.p$s */
    public class s extends AbstractC1242x<Locale> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Locale mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c1667a.mo3784v(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }
    }

    /* renamed from: j4.p$t */
    public class t extends AbstractC1242x<AbstractC1230l> {
        /* renamed from: b */
        public static AbstractC1230l m3797b(C1667a c1667a, int i7) {
            if (i7 == 0) {
                throw null;
            }
            int i8 = i7 - 1;
            if (i8 == 5) {
                return new C1235q(c1667a.mo3784v());
            }
            if (i8 == 6) {
                return new C1235q(new C1347m(c1667a.mo3784v()));
            }
            if (i8 == 7) {
                return new C1235q(Boolean.valueOf(c1667a.mo3778n()));
            }
            if (i8 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(C0090b.m224j(i7)));
            }
            c1667a.mo3783t();
            return C1232n.f5977c;
        }

        /* renamed from: c */
        public static AbstractC1230l m3798c(C1667a c1667a, int i7) {
            if (i7 == 0) {
                throw null;
            }
            int i8 = i7 - 1;
            if (i8 == 0) {
                c1667a.mo3771a();
                return new C1228j();
            }
            if (i8 != 2) {
                return null;
            }
            c1667a.mo3772b();
            return new C1233o();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public static void m3799e(AbstractC1230l abstractC1230l, C1668b c1668b) {
            if (abstractC1230l == null || (abstractC1230l instanceof C1232n)) {
                c1668b.m4050h();
                return;
            }
            boolean z6 = abstractC1230l instanceof C1235q;
            if (z6) {
                if (!z6) {
                    throw new IllegalStateException("Not a JSON Primitive: " + abstractC1230l);
                }
                C1235q c1235q = (C1235q) abstractC1230l;
                Serializable serializable = c1235q.f5979c;
                if (serializable instanceof Number) {
                    c1668b.m4054l(c1235q.m3454d());
                    return;
                } else if (serializable instanceof Boolean) {
                    c1668b.m4056n(c1235q.m3453c());
                    return;
                } else {
                    c1668b.m4055m(c1235q.mo3447b());
                    return;
                }
            }
            boolean z7 = abstractC1230l instanceof C1228j;
            if (z7) {
                c1668b.m4044b();
                if (!z7) {
                    throw new IllegalStateException("Not a JSON Array: " + abstractC1230l);
                }
                Iterator<AbstractC1230l> it = ((C1228j) abstractC1230l).iterator();
                while (it.hasNext()) {
                    m3799e(it.next(), c1668b);
                }
                c1668b.m4047e();
                return;
            }
            if (!(abstractC1230l instanceof C1233o)) {
                throw new IllegalArgumentException("Couldn't write " + abstractC1230l.getClass());
            }
            c1668b.m4045c();
            C1348n c1348n = C1348n.this;
            C1348n.e eVar = c1348n.f6573Y.f6592s;
            int i7 = c1348n.f6572X;
            while (true) {
                C1348n.e eVar2 = c1348n.f6573Y;
                if (!(eVar != eVar2)) {
                    c1668b.m4048f();
                    return;
                }
                if (eVar == eVar2) {
                    throw new NoSuchElementException();
                }
                if (c1348n.f6572X != i7) {
                    throw new ConcurrentModificationException();
                }
                C1348n.e eVar3 = eVar.f6592s;
                c1668b.m4049g((String) eVar.f6587Y);
                m3799e((AbstractC1230l) eVar.f6593w1, c1668b);
                eVar = eVar3;
            }
        }

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final AbstractC1230l mo3442a(C1667a c1667a) {
            AbstractC1230l abstractC1230l;
            AbstractC1230l abstractC1230l2;
            if (c1667a instanceof C1416e) {
                C1416e c1416e = (C1416e) c1667a;
                int mo3785x = c1416e.mo3785x();
                if (mo3785x != 5 && mo3785x != 2 && mo3785x != 4 && mo3785x != 10) {
                    AbstractC1230l abstractC1230l3 = (AbstractC1230l) c1416e.m3768H();
                    c1416e.mo3765D();
                    return abstractC1230l3;
                }
                throw new IllegalStateException("Unexpected " + C0090b.m224j(mo3785x) + " when reading a JsonElement.");
            }
            int mo3785x2 = c1667a.mo3785x();
            AbstractC1230l m3798c = m3798c(c1667a, mo3785x2);
            if (m3798c == null) {
                return m3797b(c1667a, mo3785x2);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (c1667a.mo3777k()) {
                    String mo3782r = m3798c instanceof C1233o ? c1667a.mo3782r() : null;
                    int mo3785x3 = c1667a.mo3785x();
                    AbstractC1230l m3798c2 = m3798c(c1667a, mo3785x3);
                    boolean z6 = m3798c2 != null;
                    if (m3798c2 == null) {
                        m3798c2 = m3797b(c1667a, mo3785x3);
                    }
                    if (m3798c instanceof C1228j) {
                        C1228j c1228j = (C1228j) m3798c;
                        if (m3798c2 == null) {
                            c1228j.getClass();
                            abstractC1230l2 = C1232n.f5977c;
                        } else {
                            abstractC1230l2 = m3798c2;
                        }
                        c1228j.f5976c.add(abstractC1230l2);
                    } else {
                        C1233o c1233o = (C1233o) m3798c;
                        if (m3798c2 == null) {
                            c1233o.getClass();
                            abstractC1230l = C1232n.f5977c;
                        } else {
                            abstractC1230l = m3798c2;
                        }
                        c1233o.f5978c.put(mo3782r, abstractC1230l);
                    }
                    if (z6) {
                        arrayDeque.addLast(m3798c);
                        m3798c = m3798c2;
                    }
                } else {
                    if (m3798c instanceof C1228j) {
                        c1667a.mo3773e();
                    } else {
                        c1667a.mo3774f();
                    }
                    if (arrayDeque.isEmpty()) {
                        return m3798c;
                    }
                    m3798c = (AbstractC1230l) arrayDeque.removeLast();
                }
            }
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ void m3800d(C1668b c1668b, Object obj) {
            m3799e((AbstractC1230l) obj, c1668b);
        }
    }

    /* renamed from: j4.p$u */
    public class u implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            Class<? super T> cls = c1644a.f7479a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new d0(cls);
        }
    }

    /* renamed from: j4.p$v */
    public class v extends AbstractC1242x<BitSet> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final BitSet mo3442a(C1667a c1667a) {
            boolean z6;
            BitSet bitSet = new BitSet();
            c1667a.mo3771a();
            int mo3785x = c1667a.mo3785x();
            int i7 = 0;
            while (mo3785x != 2) {
                int m4108c = C1686g.m4108c(mo3785x);
                if (m4108c == 5 || m4108c == 6) {
                    int mo3780p = c1667a.mo3780p();
                    if (mo3780p == 0) {
                        z6 = false;
                    } else {
                        if (mo3780p != 1) {
                            StringBuilder m221g = C0090b.m221g("Invalid bitset value ", mo3780p, ", expected 0 or 1; at path ");
                            m221g.append(c1667a.mo3776j());
                            throw new C1237s(m221g.toString());
                        }
                        z6 = true;
                    }
                } else {
                    if (m4108c != 7) {
                        throw new C1237s("Invalid bitset value type: " + C0090b.m224j(mo3785x) + "; at path " + c1667a.mo3775h());
                    }
                    z6 = c1667a.mo3778n();
                }
                if (z6) {
                    bitSet.set(i7);
                }
                i7++;
                mo3785x = c1667a.mo3785x();
            }
            c1667a.mo3773e();
            return bitSet;
        }
    }

    /* renamed from: j4.p$w */
    public class w extends AbstractC1242x<Boolean> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Boolean mo3442a(C1667a c1667a) {
            int mo3785x = c1667a.mo3785x();
            if (mo3785x != 9) {
                return Boolean.valueOf(mo3785x == 6 ? Boolean.parseBoolean(c1667a.mo3784v()) : c1667a.mo3778n());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$x */
    public class x extends AbstractC1242x<Boolean> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Boolean mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() != 9) {
                return Boolean.valueOf(c1667a.mo3784v());
            }
            c1667a.mo3783t();
            return null;
        }
    }

    /* renamed from: j4.p$y */
    public class y extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            try {
                int mo3780p = c1667a.mo3780p();
                if (mo3780p <= 255 && mo3780p >= -128) {
                    return Byte.valueOf((byte) mo3780p);
                }
                StringBuilder m221g = C0090b.m221g("Lossy conversion from ", mo3780p, " to byte; at path ");
                m221g.append(c1667a.mo3776j());
                throw new C1237s(m221g.toString());
            } catch (NumberFormatException e7) {
                throw new C1237s(e7);
            }
        }
    }

    /* renamed from: j4.p$z */
    public class z extends AbstractC1242x<Number> {
        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final Number mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            try {
                int mo3780p = c1667a.mo3780p();
                if (mo3780p <= 65535 && mo3780p >= -32768) {
                    return Short.valueOf((short) mo3780p);
                }
                StringBuilder m221g = C0090b.m221g("Lossy conversion from ", mo3780p, " to short; at path ");
                m221g.append(c1667a.mo3776j());
                throw new C1237s(m221g.toString());
            } catch (NumberFormatException e7) {
                throw new C1237s(e7);
            }
        }
    }

    static {
        w wVar = new w();
        f6831c = new x();
        f6832d = new C1429r(Boolean.TYPE, Boolean.class, wVar);
        f6833e = new C1429r(Byte.TYPE, Byte.class, new y());
        f6834f = new C1429r(Short.TYPE, Short.class, new z());
        f6835g = new C1429r(Integer.TYPE, Integer.class, new a0());
        f6836h = new C1428q(AtomicInteger.class, new C1241w(new b0()));
        f6837i = new C1428q(AtomicBoolean.class, new C1241w(new c0()));
        f6838j = new C1428q(AtomicIntegerArray.class, new C1241w(new a()));
        f6839k = new b();
        new c();
        new d();
        f6840l = new C1429r(Character.TYPE, Character.class, new e());
        f fVar = new f();
        f6841m = new g();
        f6842n = new h();
        f6843o = new i();
        f6844p = new C1428q(String.class, fVar);
        f6845q = new C1428q(StringBuilder.class, new j());
        f6846r = new C1428q(StringBuffer.class, new l());
        f6847s = new C1428q(URL.class, new m());
        f6848t = new C1428q(URI.class, new n());
        f6849u = new C1431t(InetAddress.class, new o());
        f6850v = new C1428q(UUID.class, new p());
        f6851w = new C1428q(Currency.class, new C1241w(new q()));
        f6852x = new C1430s(new r());
        f6853y = new C1428q(Locale.class, new s());
        t tVar = new t();
        f6854z = tVar;
        f6827A = new C1431t(AbstractC1230l.class, tVar);
        f6828B = new u();
    }
}
