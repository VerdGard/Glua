package p104m6;

import java.io.Serializable;
import java.util.HashSet;
import p036e2.C1101u4;
import p096l6.AbstractC1518d0;
import p096l6.C1516c0;

/* renamed from: m6.c1 */
/* loaded from: classes.dex */
public class C1564c1 implements Serializable {

    /* renamed from: Y */
    public static C1564c1 f7339Y;

    /* renamed from: Z */
    public static /* synthetic */ Class f7340Z;

    /* renamed from: X */
    public HashSet f7341X;

    /* renamed from: c */
    public C1564c1 f7342c;

    /* renamed from: e */
    public C1564c1 f7343e;

    /* renamed from: m */
    public AbstractC1630z0 f7344m;

    /* renamed from: s */
    public int f7345s = -1;

    public C1564c1(AbstractC1630z0 abstractC1630z0) {
        mo3956c(abstractC1630z0);
    }

    /* renamed from: a */
    public void mo3954a() {
        this.f7342c = f7339Y;
        f7339Y = this;
    }

    /* renamed from: b */
    public int mo3955b() {
        return this.f7345s;
    }

    /* renamed from: c */
    public void mo3956c(AbstractC1630z0 abstractC1630z0) {
        if (abstractC1630z0 == null) {
            throw new C1101u4("Assigning null to handle");
        }
        Class<?> cls = getClass();
        Class<C1595n> cls2 = f7340Z;
        if (cls2 == null) {
            cls2 = C1595n.class;
            f7340Z = cls2;
        }
        if (cls != cls2 && (abstractC1630z0 instanceof AbstractC1598o)) {
            StringBuffer stringBuffer = new StringBuffer("Assigning branch instruction ");
            stringBuffer.append(abstractC1630z0);
            stringBuffer.append(" to plain handle");
            throw new C1101u4(stringBuffer.toString());
        }
        AbstractC1630z0 abstractC1630z02 = this.f7344m;
        if (abstractC1630z02 != null) {
            abstractC1630z02.mo3982b();
        }
        this.f7344m = abstractC1630z0;
    }

    /* renamed from: d */
    public void mo3957d(int i7) {
        this.f7345s = i7;
    }

    /* renamed from: e */
    public final String m3958e() {
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = this.f7345s;
        C1516c0 c1516c0 = AbstractC1518d0.f7154a;
        stringBuffer.append(AbstractC1518d0.m3933c(Integer.toString(i7), 4, false));
        stringBuffer.append(": ");
        stringBuffer.append(this.f7344m.mo3973e(true));
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public int mo3959f(int i7, int i8) {
        this.f7345s += i7;
        return 0;
    }

    public final String toString() {
        return m3958e();
    }
}
