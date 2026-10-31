package p078j4;

import android.ext.C0090b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1240v;
import p070i4.C1348n;
import p117o4.C1667a;

/* renamed from: j4.j */
/* loaded from: classes.dex */
public final class C1421j extends AbstractC1242x<Object> {

    /* renamed from: b */
    public static final C1420i f6798b = new C1420i();

    /* renamed from: a */
    public final InterfaceC1240v f6799a;

    public C1421j(C1226h c1226h, InterfaceC1240v interfaceC1240v) {
        this.f6799a = interfaceC1240v;
    }

    /* renamed from: c */
    public static Serializable m3786c(C1667a c1667a, int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 0) {
            c1667a.mo3771a();
            return new ArrayList();
        }
        if (i8 != 2) {
            return null;
        }
        c1667a.mo3772b();
        return new C1348n();
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Object mo3442a(C1667a c1667a) {
        int mo3785x = c1667a.mo3785x();
        Object m3786c = m3786c(c1667a, mo3785x);
        if (m3786c == null) {
            return m3787b(c1667a, mo3785x);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c1667a.mo3777k()) {
                String mo3782r = m3786c instanceof Map ? c1667a.mo3782r() : null;
                int mo3785x2 = c1667a.mo3785x();
                Serializable m3786c2 = m3786c(c1667a, mo3785x2);
                boolean z6 = m3786c2 != null;
                Serializable m3787b = m3786c2 == null ? m3787b(c1667a, mo3785x2) : m3786c2;
                if (m3786c instanceof List) {
                    ((List) m3786c).add(m3787b);
                } else {
                    ((Map) m3786c).put(mo3782r, m3787b);
                }
                if (z6) {
                    arrayDeque.addLast(m3786c);
                    m3786c = m3787b;
                }
            } else {
                if (m3786c instanceof List) {
                    c1667a.mo3773e();
                } else {
                    c1667a.mo3774f();
                }
                if (arrayDeque.isEmpty()) {
                    return m3786c;
                }
                m3786c = arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: b */
    public final Serializable m3787b(C1667a c1667a, int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 5) {
            return c1667a.mo3784v();
        }
        if (i8 == 6) {
            return this.f6799a.mo3456a(c1667a);
        }
        if (i8 == 7) {
            return Boolean.valueOf(c1667a.mo3778n());
        }
        if (i8 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(C0090b.m224j(i7)));
        }
        c1667a.mo3783t();
        return null;
    }
}
