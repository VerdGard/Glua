package p078j4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1243y;
import p078j4.C1427p;
import p110n4.C1644a;

/* renamed from: j4.s */
/* loaded from: classes.dex */
public final class C1430s implements InterfaceC1243y {

    /* renamed from: c */
    public final /* synthetic */ Class f6864c = Calendar.class;

    /* renamed from: e */
    public final /* synthetic */ Class f6865e = GregorianCalendar.class;

    /* renamed from: m */
    public final /* synthetic */ AbstractC1242x f6866m;

    public C1430s(C1427p.r rVar) {
        this.f6866m = rVar;
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Class<? super T> cls = c1644a.f7479a;
        if (cls == this.f6864c || cls == this.f6865e) {
            return this.f6866m;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6864c.getName() + "+" + this.f6865e.getName() + ",adapter=" + this.f6866m + "]";
    }
}
