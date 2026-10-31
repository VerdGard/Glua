package p054g4;

import android.ext.C0090b;
import java.math.BigDecimal;
import p070i4.C1347m;
import p117o4.C1667a;
import p117o4.C1669c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g4.u */
/* loaded from: classes.dex */
public abstract class EnumC1239u implements InterfaceC1240v {

    /* renamed from: c */
    public static final a f5980c;

    /* renamed from: e */
    public static final b f5981e;

    /* renamed from: m */
    public static final /* synthetic */ EnumC1239u[] f5982m;

    /* renamed from: g4.u$a */
    public enum a extends EnumC1239u {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // p054g4.InterfaceC1240v
        /* renamed from: a */
        public final Number mo3456a(C1667a c1667a) {
            return Double.valueOf(c1667a.mo3779o());
        }
    }

    /* renamed from: g4.u$b */
    public enum b extends EnumC1239u {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // p054g4.InterfaceC1240v
        /* renamed from: a */
        public final Number mo3456a(C1667a c1667a) {
            return new C1347m(c1667a.mo3784v());
        }
    }

    static {
        a aVar = new a();
        f5980c = aVar;
        b bVar = new b();
        f5981e = bVar;
        f5982m = new EnumC1239u[]{aVar, bVar, new EnumC1239u() { // from class: g4.u.c
            @Override // p054g4.InterfaceC1240v
            /* renamed from: a */
            public final Number mo3456a(C1667a c1667a) {
                String mo3784v = c1667a.mo3784v();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(mo3784v));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(mo3784v);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || c1667a.f7527e) {
                            return valueOf;
                        }
                        throw new C1669c("JSON forbids NaN and infinities: " + valueOf + "; at path " + c1667a.mo3776j());
                    }
                } catch (NumberFormatException e7) {
                    StringBuilder m222h = C0090b.m222h("Cannot parse ", mo3784v, "; at path ");
                    m222h.append(c1667a.mo3776j());
                    throw new C1234p(m222h.toString(), e7);
                }
            }
        }, new EnumC1239u() { // from class: g4.u.d
            @Override // p054g4.InterfaceC1240v
            /* renamed from: a */
            public final Number mo3456a(C1667a c1667a) {
                String mo3784v = c1667a.mo3784v();
                try {
                    return new BigDecimal(mo3784v);
                } catch (NumberFormatException e7) {
                    StringBuilder m222h = C0090b.m222h("Cannot parse ", mo3784v, "; at path ");
                    m222h.append(c1667a.mo3776j());
                    throw new C1234p(m222h.toString(), e7);
                }
            }
        }};
    }

    public EnumC1239u(String str, int i7) {
    }

    public static EnumC1239u valueOf(String str) {
        return (EnumC1239u) Enum.valueOf(EnumC1239u.class, str);
    }

    public static EnumC1239u[] values() {
        return (EnumC1239u[]) f5982m.clone();
    }
}
