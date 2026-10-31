package p102m4;

import android.ext.C0090b;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1237s;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public final class C1551a extends AbstractC1242x<Date> {

    /* renamed from: b */
    public static final a f7215b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f7216a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: m4.a$a */
    public class a implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            if (c1644a.f7479a == Date.class) {
                return new C1551a();
            }
            return null;
        }
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Date mo3442a(C1667a c1667a) {
        java.util.Date parse;
        if (c1667a.mo3785x() == 9) {
            c1667a.mo3783t();
            return null;
        }
        String mo3784v = c1667a.mo3784v();
        try {
            synchronized (this) {
                parse = this.f7216a.parse(mo3784v);
            }
            return new Date(parse.getTime());
        } catch (ParseException e7) {
            StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as SQL Date; at path ");
            m222h.append(c1667a.mo3776j());
            throw new C1237s(m222h.toString(), e7);
        }
    }
}
