package p102m4;

import android.ext.C0090b;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1237s;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: m4.b */
/* loaded from: classes.dex */
public final class C1552b extends AbstractC1242x<Time> {

    /* renamed from: b */
    public static final a f7217b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f7218a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: m4.b$a */
    public class a implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            if (c1644a.f7479a == Time.class) {
                return new C1552b();
            }
            return null;
        }
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Time mo3442a(C1667a c1667a) {
        Time time;
        if (c1667a.mo3785x() == 9) {
            c1667a.mo3783t();
            return null;
        }
        String mo3784v = c1667a.mo3784v();
        try {
            synchronized (this) {
                time = new Time(this.f7218a.parse(mo3784v).getTime());
            }
            return time;
        } catch (ParseException e7) {
            StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as SQL Time; at path ");
            m222h.append(c1667a.mo3776j());
            throw new C1237s(m222h.toString(), e7);
        }
    }
}
