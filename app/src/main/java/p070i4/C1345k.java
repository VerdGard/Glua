package p070i4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1219a;
import p054g4.InterfaceC1243y;
import p062h4.InterfaceC1300c;
import p062h4.InterfaceC1301d;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: i4.k */
/* loaded from: classes.dex */
public final class C1345k implements InterfaceC1243y, Cloneable {

    /* renamed from: Y */
    public static final C1345k f6558Y = new C1345k();

    /* renamed from: c */
    public final double f6560c = -1.0d;

    /* renamed from: e */
    public final int f6561e = 136;

    /* renamed from: m */
    public final boolean f6562m = true;

    /* renamed from: s */
    public final List<InterfaceC1219a> f6563s = Collections.emptyList();

    /* renamed from: X */
    public final List<InterfaceC1219a> f6559X = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: i4.k$a */
    public class a<T> extends AbstractC1242x<T> {

        /* renamed from: a */
        public AbstractC1242x<T> f6564a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6565b;

        /* renamed from: c */
        public final /* synthetic */ C1226h f6566c;

        /* renamed from: d */
        public final /* synthetic */ C1644a f6567d;

        public a(boolean z6, boolean z7, C1226h c1226h, C1644a c1644a) {
            this.f6565b = z6;
            this.f6566c = c1226h;
            this.f6567d = c1644a;
        }

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final T mo3442a(C1667a c1667a) {
            if (this.f6565b) {
                c1667a.mo3765D();
                return null;
            }
            AbstractC1242x<T> abstractC1242x = this.f6564a;
            if (abstractC1242x == null) {
                abstractC1242x = this.f6566c.m3445c(C1345k.this, this.f6567d);
                this.f6564a = abstractC1242x;
            }
            return abstractC1242x.mo3442a(c1667a);
        }
    }

    /* renamed from: d */
    public static boolean m3701d(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if ((cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Class<? super T> cls = c1644a.f7479a;
        boolean m3702b = m3702b(cls);
        boolean z6 = m3702b || m3703c(cls, true);
        boolean z7 = m3702b || m3703c(cls, false);
        if (z6 || z7) {
            return new a(z7, z6, c1226h, c1644a);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m3702b(Class<?> cls) {
        if (this.f6560c != -1.0d && !m3704e((InterfaceC1300c) cls.getAnnotation(InterfaceC1300c.class), (InterfaceC1301d) cls.getAnnotation(InterfaceC1301d.class))) {
            return true;
        }
        if (!this.f6562m) {
            boolean z6 = false;
            if (cls.isMemberClass()) {
                if (!((cls.getModifiers() & 8) != 0)) {
                    z6 = true;
                }
            }
            if (z6) {
                return true;
            }
        }
        return m3701d(cls);
    }

    /* renamed from: c */
    public final boolean m3703c(Class<?> cls, boolean z6) {
        Iterator<InterfaceC1219a> it = (z6 ? this.f6563s : this.f6559X).iterator();
        while (it.hasNext()) {
            if (it.next().m3437a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (C1345k) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    /* renamed from: e */
    public final boolean m3704e(InterfaceC1300c interfaceC1300c, InterfaceC1301d interfaceC1301d) {
        double d7 = this.f6560c;
        if (interfaceC1300c == null || d7 >= interfaceC1300c.value()) {
            return interfaceC1301d == null || (d7 > interfaceC1301d.value() ? 1 : (d7 == interfaceC1301d.value() ? 0 : -1)) < 0;
        }
        return false;
    }
}
