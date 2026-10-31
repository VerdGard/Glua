package p102m4;

import java.sql.Timestamp;
import java.util.Date;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C1553c extends AbstractC1242x<Timestamp> {

    /* renamed from: b */
    public static final a f7219b = new a();

    /* renamed from: a */
    public final AbstractC1242x<Date> f7220a;

    /* renamed from: m4.c$a */
    public class a implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            if (c1644a.f7479a != Timestamp.class) {
                return null;
            }
            c1226h.getClass();
            return new C1553c(c1226h.m3444b(new C1644a<>(Date.class)));
        }
    }

    public C1553c(AbstractC1242x abstractC1242x) {
        this.f7220a = abstractC1242x;
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Timestamp mo3442a(C1667a c1667a) {
        Date mo3442a = this.f7220a.mo3442a(c1667a);
        if (mo3442a != null) {
            return new Timestamp(mo3442a.getTime());
        }
        return null;
    }
}
