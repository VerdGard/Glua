package p190y0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p089l.C1467a;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2219a {

    /* renamed from: a */
    public final C1467a<String, Method> f10049a;

    /* renamed from: b */
    public final C1467a<String, Method> f10050b;

    /* renamed from: c */
    public final C1467a<String, Class> f10051c;

    public AbstractC2219a(C1467a<String, Method> c1467a, C1467a<String, Method> c1467a2, C1467a<String, Class> c1467a3) {
        this.f10049a = c1467a;
        this.f10050b = c1467a2;
        this.f10051c = c1467a3;
    }

    /* renamed from: a */
    public abstract C2220b mo5380a();

    /* renamed from: b */
    public final Class m5381b(Class<? extends InterfaceC2221c> cls) {
        String name = cls.getName();
        C1467a<String, Class> c1467a = this.f10051c;
        Class cls2 = c1467a.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        c1467a.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m5382c(String str) {
        C1467a<String, Method> c1467a = this.f10049a;
        Method method = c1467a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC2219a.class.getClassLoader()).getDeclaredMethod("read", AbstractC2219a.class);
        c1467a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Method m5383d(Class cls) {
        String name = cls.getName();
        C1467a<String, Method> c1467a = this.f10050b;
        Method method = c1467a.get(name);
        if (method != null) {
            return method;
        }
        Class m5381b = m5381b(cls);
        System.currentTimeMillis();
        Method declaredMethod = m5381b.getDeclaredMethod("write", cls, AbstractC2219a.class);
        c1467a.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo5384e();

    /* renamed from: f */
    public abstract byte[] mo5385f();

    /* renamed from: g */
    public abstract CharSequence mo5386g();

    /* renamed from: h */
    public abstract boolean mo5387h(int i7);

    /* renamed from: i */
    public abstract int mo5388i();

    /* renamed from: j */
    public abstract <T extends Parcelable> T mo5389j();

    /* renamed from: k */
    public abstract String mo5390k();

    /* renamed from: l */
    public final <T extends InterfaceC2221c> T m5391l() {
        String mo5390k = mo5390k();
        if (mo5390k == null) {
            return null;
        }
        try {
            return (T) m5382c(mo5390k).invoke(null, mo5380a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    /* renamed from: m */
    public abstract void mo5392m(int i7);

    /* renamed from: n */
    public abstract void mo5393n(boolean z6);

    /* renamed from: o */
    public abstract void mo5394o(byte[] bArr);

    /* renamed from: p */
    public abstract void mo5395p(CharSequence charSequence);

    /* renamed from: q */
    public abstract void mo5396q(int i7);

    /* renamed from: r */
    public abstract void mo5397r(Parcelable parcelable);

    /* renamed from: s */
    public abstract void mo5398s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final void m5399t(InterfaceC2221c interfaceC2221c) {
        if (interfaceC2221c == null) {
            mo5398s(null);
            return;
        }
        try {
            mo5398s(m5381b(interfaceC2221c.getClass()).getName());
            C2220b mo5380a = mo5380a();
            try {
                m5383d(interfaceC2221c.getClass()).invoke(null, interfaceC2221c, mo5380a);
                mo5380a.m5400u();
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (!(e10.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
                }
                throw ((RuntimeException) e10.getCause());
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC2221c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
