package p102m4;

import p102m4.C1551a;
import p102m4.C1552b;
import p102m4.C1553c;

/* renamed from: m4.d */
/* loaded from: classes.dex */
public final class C1554d {

    /* renamed from: a */
    public static final boolean f7221a;

    /* renamed from: b */
    public static final C1551a.a f7222b;

    /* renamed from: c */
    public static final C1552b.a f7223c;

    /* renamed from: d */
    public static final C1553c.a f7224d;

    static {
        boolean z6;
        C1553c.a aVar;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f7221a = z6;
        if (z6) {
            f7222b = C1551a.f7215b;
            f7223c = C1552b.f7217b;
            aVar = C1553c.f7219b;
        } else {
            aVar = null;
            f7222b = null;
            f7223c = null;
        }
        f7224d = aVar;
    }
}
