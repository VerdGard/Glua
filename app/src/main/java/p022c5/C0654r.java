package p022c5;

import p043f1.AbstractC1163h;

/* renamed from: c5.r */
/* loaded from: classes.dex */
public final class C0654r {

    /* renamed from: e */
    public static final a f3219e = new a();

    /* renamed from: a */
    public CharSequence f3220a;

    /* renamed from: b */
    public int f3221b;

    /* renamed from: c */
    public int f3222c;

    /* renamed from: d */
    public int f3223d;

    /* renamed from: c5.r$a */
    public class a extends AbstractC1163h {
        public a() {
            super(3);
        }

        /* renamed from: b */
        public final void m2180b(Object obj) {
            ((C0654r) obj).f3220a = null;
        }
    }

    /* renamed from: a */
    public final void m2179a() {
        a aVar = f3219e;
        aVar.m2180b(this);
        synchronized (aVar) {
            int i7 = 0;
            while (true) {
                Object obj = aVar.f5720b;
                if (i7 >= ((Object[]) obj).length) {
                    break;
                }
                if (((Object[]) obj)[i7] == null) {
                    ((Object[]) obj)[i7] = this;
                    break;
                }
                i7++;
            }
        }
    }
}
