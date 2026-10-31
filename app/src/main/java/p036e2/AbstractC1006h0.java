package p036e2;

import android.content.Context;
import android.util.Base64;
import java.util.Comparator;
import p036e2.C0986e1;
import p036e2.C1021j1;

/* renamed from: e2.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1006h0 {

    /* renamed from: e */
    public static final a f5083e = new a();

    /* renamed from: a */
    public b f5084a;

    /* renamed from: b */
    public C0986e1.a f5085b;

    /* renamed from: c */
    public final String f5086c;

    /* renamed from: d */
    public final long f5087d;

    /* renamed from: e2.h0$a */
    public static class a implements Comparator<AbstractC1006h0> {
        @Override // java.util.Comparator
        public final int compare(AbstractC1006h0 abstractC1006h0, AbstractC1006h0 abstractC1006h02) {
            AbstractC1006h0 abstractC1006h03 = abstractC1006h0;
            AbstractC1006h0 abstractC1006h04 = abstractC1006h02;
            long j7 = abstractC1006h03.f5087d - abstractC1006h04.f5087d;
            return j7 != 0 ? j7 > 0 ? -1 : 1 : abstractC1006h03.f5086c.compareTo(abstractC1006h04.f5086c);
        }
    }

    /* renamed from: e2.h0$b */
    public static class b {

        /* renamed from: a */
        public Context f5088a;

        /* renamed from: b */
        public C0986e1 f5089b;
    }

    /* renamed from: e2.h0$c */
    public static abstract class c {

        /* renamed from: a */
        public final C0986e1.a f5090a;

        /* renamed from: b */
        public final String f5091b;

        /* renamed from: c */
        public boolean f5092c = true;

        public c(C0986e1.a aVar, String str) {
            this.f5090a = aVar;
            this.f5091b = "target-pkg-" + Base64.encodeToString(str.getBytes(), 3);
        }
    }

    /* renamed from: e2.h0$d */
    public static class d {
    }

    /* renamed from: e2.h0$e */
    public static class e {
    }

    /* renamed from: e2.h0$f */
    public static class f {

        /* renamed from: a */
        public boolean f5093a;
    }

    /* renamed from: e2.h0$g */
    public static class g {

        /* renamed from: a */
        public final C1021j1.a f5094a;

        /* renamed from: b */
        public final int f5095b;

        public g(int i7, C1021j1.a aVar) {
            this.f5095b = i7;
            this.f5094a = aVar;
        }
    }

    public AbstractC1006h0(String str, long j7) {
        this.f5086c = str;
        this.f5087d = j7;
    }

    /* renamed from: a */
    public abstract e mo3033a(d dVar, C1021j1.a aVar);

    /* renamed from: b */
    public abstract g mo3034b(String str, f fVar);

    /* renamed from: c */
    public abstract void mo3035c();
}
