package p078j4;

import android.ext.C0090b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1237s;
import p054g4.InterfaceC1243y;
import p070i4.C1346l;
import p086k4.C1460a;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.c */
/* loaded from: classes.dex */
public final class C1414c extends AbstractC1242x<Date> {

    /* renamed from: b */
    public static final a f6782b = new a();

    /* renamed from: a */
    public final ArrayList f6783a;

    /* renamed from: j4.c$a */
    public class a implements InterfaceC1243y {
        @Override // p054g4.InterfaceC1243y
        /* renamed from: a */
        public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
            if (c1644a.f7479a == Date.class) {
                return new C1414c();
            }
            return null;
        }
    }

    public C1414c() {
        ArrayList arrayList = new ArrayList();
        this.f6783a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C1346l.f6569a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Date mo3442a(C1667a c1667a) {
        Date m3841b;
        if (c1667a.mo3785x() == 9) {
            c1667a.mo3783t();
            return null;
        }
        String mo3784v = c1667a.mo3784v();
        synchronized (this.f6783a) {
            Iterator it = this.f6783a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        m3841b = C1460a.m3841b(mo3784v, new ParsePosition(0));
                        break;
                    } catch (ParseException e7) {
                        StringBuilder m222h = C0090b.m222h("Failed parsing '", mo3784v, "' as Date; at path ");
                        m222h.append(c1667a.mo3776j());
                        throw new C1237s(m222h.toString(), e7);
                    }
                }
                try {
                    m3841b = ((DateFormat) it.next()).parse(mo3784v);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        return m3841b;
    }
}
