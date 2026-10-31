package p188x6;

import android.ext.Tools;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2001s;
import p180w6.AbstractC2139h;
import p180w6.AbstractC2150s;

/* renamed from: x6.m */
/* loaded from: classes.dex */
public final class C2212m extends AbstractC2150s {

    /* renamed from: g2 */
    public static final String[] f10029g2 = {"bindClass", "newInstance", "new", "createProxy", "loadLib", "astable"};

    /* renamed from: x6.m$a */
    public class a extends AbstractC2150s {

        /* renamed from: g2 */
        public final /* synthetic */ AbstractC2003u f10030g2;

        public a(AbstractC2003u abstractC2003u) {
            this.f10030g2 = abstractC2003u;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            try {
                String m4649x = abstractC1984c0.m4649x(1);
                String replaceFirst = m4649x.replaceFirst(".*?[$\\.]([^$\\.]*)$", "$1");
                C2212m.this.getClass();
                C2203d m5344C2 = C2203d.m5344C2(Class.forName(m4649x));
                this.f10030g2.m4878X1(replaceFirst, m5344C2);
                return m5344C2;
            } catch (ClassNotFoundException e7) {
                e7.printStackTrace();
                throw new C1991i(e7);
            }
        }
    }

    /* renamed from: x6.m$b */
    public static final class b implements InvocationHandler {

        /* renamed from: a */
        public final AbstractC2003u f10032a;

        public b(AbstractC2003u abstractC2003u) {
            this.f10032a = abstractC2003u;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC2003u[] abstractC2003uArr;
            String name = method.getName();
            AbstractC2003u abstractC2003u = this.f10032a;
            if (!abstractC2003u.mo4763Y0()) {
                abstractC2003u = abstractC2003u.m4870K0(name);
            }
            if (abstractC2003u.mo4804d1()) {
                return null;
            }
            int i7 = 0;
            boolean z6 = (method.getModifiers() & Tools.Semaphore.f159S7) != 0;
            int length = objArr != null ? objArr.length : 0;
            if (z6) {
                int i8 = length - 1;
                Object obj2 = objArr[i8];
                int length2 = Array.getLength(obj2);
                abstractC2003uArr = new AbstractC2003u[i8 + length2];
                for (int i9 = 0; i9 < i8; i9++) {
                    abstractC2003uArr[i9] = C2200a.m5337a(objArr[i9]);
                }
                while (i7 < length2) {
                    abstractC2003uArr[i7 + i8] = C2200a.m5337a(Array.get(obj2, i7));
                    i7++;
                }
            } else {
                abstractC2003uArr = new AbstractC2003u[length];
                while (i7 < length) {
                    abstractC2003uArr[i7] = C2200a.m5337a(objArr[i7]);
                    i7++;
                }
            }
            try {
                return C2201b.m5339a(method.getReturnType(), abstractC2003u.mo4877X0(abstractC2003uArr).mo4624u());
            } catch (Exception unused) {
                return C2201b.m5339a(method.getReturnType(), AbstractC2003u.f9130m);
            }
        }
    }

    /* renamed from: I2 */
    public static AbstractC2003u m5351I2(Object obj) {
        C1999q c1999q = new C1999q();
        int i7 = 0;
        int i8 = 1;
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            while (i7 <= length - 1) {
                int i9 = i7 + 1;
                c1999q.mo4788W1(i9, m5351I2(Array.get(obj, i7)));
                i7 = i9;
            }
        } else if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c1999q.mo4788W1(i8, m5351I2(it.next()));
                i8++;
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c1999q.mo4790Y1(C2200a.m5337a(entry.getKey()), m5351I2(entry.getValue()));
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    c1999q.m4878X1(next, m5351I2(jSONObject.get(next)));
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
        } else {
            if (!(obj instanceof JSONArray)) {
                return C2200a.m5337a(obj);
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length2 = jSONArray.length();
            while (i7 < length2) {
                try {
                    c1999q.mo4788W1(i7, m5351I2(jSONArray.get(i7)));
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
                i7++;
            }
        }
        return c1999q;
    }

    /* renamed from: J2 */
    public static C2001s m5352J2(Class cls, AbstractC2003u abstractC2003u) {
        return new C2001s(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(abstractC2003u)));
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        try {
            int i7 = 0;
            switch (this.f9700e2) {
                case 0:
                    AbstractC2003u mo4623t = abstractC1984c0.mo4623t(2);
                    C1999q c1999q = new C1999q();
                    AbstractC2139h.m5232G2(c1999q, C2212m.class, f10029g2, 1);
                    mo4623t.getClass();
                    mo4623t.mo4790Y1(C1998p.m4815M2("luajava"), c1999q);
                    AbstractC2003u mo4777L0 = mo4623t.mo4777L0(C1998p.m4815M2("package"));
                    mo4777L0.getClass();
                    AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
                    mo4777L02.getClass();
                    mo4777L02.mo4790Y1(C1998p.m4815M2("luajava"), c1999q);
                    mo4623t.mo4790Y1(C1998p.m4815M2("byte"), C2203d.m5344C2(Byte.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("char"), C2203d.m5344C2(Character.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("short"), C2203d.m5344C2(Short.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("int"), C2203d.m5344C2(Integer.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("long"), C2203d.m5344C2(Long.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("float"), C2203d.m5344C2(Float.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("double"), C2203d.m5344C2(Double.TYPE));
                    mo4623t.mo4790Y1(C1998p.m4815M2("import"), new a(mo4623t));
                    return c1999q;
                case 1:
                    return C2203d.m5344C2(Class.forName(abstractC1984c0.m4649x(1)));
                case 2:
                case 3:
                    AbstractC2003u m4638C = abstractC1984c0.m4638C(1);
                    return C2203d.m5344C2(this.f9700e2 == 2 ? Class.forName(m4638C.mo4645M()) : (Class) m4638C.mo4853w0()).m5346E2(C2203d.f9993s2).mo4689W0(abstractC1984c0.mo4622L(2));
                case 4:
                    int mo4621I = abstractC1984c0.mo4621I() - 1;
                    if (mo4621I <= 0) {
                        throw new C1991i("no interfaces");
                    }
                    C1999q m4636A = abstractC1984c0.m4636A(mo4621I + 1);
                    Class[] clsArr = new Class[mo4621I];
                    while (i7 < mo4621I) {
                        int i8 = i7 + 1;
                        clsArr[i7] = Class.forName(abstractC1984c0.m4649x(i8));
                        i7 = i8;
                    }
                    return new C2001s(Proxy.newProxyInstance(C2212m.class.getClassLoader(), clsArr, new b(m4636A)));
                case 5:
                    String m4649x = abstractC1984c0.m4649x(1);
                    String m4649x2 = abstractC1984c0.m4649x(2);
                    Class<?> cls = Class.forName(m4649x);
                    Object invoke = cls.getMethod(m4649x2, new Class[0]).invoke(cls, new Object[0]);
                    return invoke instanceof AbstractC2003u ? (AbstractC2003u) invoke : AbstractC2003u.f9130m;
                case 6:
                    return m5351I2(abstractC1984c0.mo4623t(1).mo4852v0());
                default:
                    throw new C1991i("not yet supported: " + this);
            }
        } catch (InvocationTargetException e7) {
            throw new C1991i(e7.getTargetException());
        } catch (C1991i e8) {
            throw e8;
        } catch (Exception e9) {
            throw new C1991i(e9);
        }
    }
}
