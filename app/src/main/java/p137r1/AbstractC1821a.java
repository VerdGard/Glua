package p137r1;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Iterator;
import p198z0.AbstractC2273a;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1821a<T> extends AbstractC2273a {

    /* renamed from: c */
    public final AbstractC1821a<T>.b<T> f8249c;

    /* renamed from: d */
    public SparseBooleanArray f8250d;

    /* renamed from: e */
    public ArrayList<AbstractC1821a<T>.a<T>> f8251e;

    /* renamed from: f */
    public final Object f8252f;

    /* renamed from: r1.a$a */
    public class a<T> {

        /* renamed from: a */
        public final long f8253a;

        /* renamed from: b */
        public final T f8254b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j7, Object obj) {
            this.f8253a = j7;
            this.f8254b = obj;
        }

        public final String toString() {
            return "IdentifiedItem{id=" + this.f8253a + ", item=" + this.f8254b + '}';
        }
    }

    /* renamed from: r1.a$b */
    public class b<T> {

        /* renamed from: a */
        public long f8255a = 0;

        public b(AbstractC1821a abstractC1821a) {
        }

        /* renamed from: a */
        public final ArrayList m4301a(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                long j7 = this.f8255a;
                this.f8255a = 1 + j7;
                arrayList2.add(new a(j7, obj));
            }
            return arrayList2;
        }
    }

    public AbstractC1821a() {
        ArrayList arrayList = new ArrayList();
        this.f8252f = new Object();
        this.f8250d = new SparseBooleanArray();
        AbstractC1821a<T>.b<T> bVar = new b<>(this);
        this.f8249c = bVar;
        this.f8251e = bVar.m4301a(arrayList);
    }

    @Override // p198z0.AbstractC2273a
    /* renamed from: c */
    public final int mo4299c() {
        return this.f8251e.size();
    }

    /* renamed from: h */
    public final ArrayList<T> m4300h() {
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<AbstractC1821a<T>.a<T>> it = this.f8251e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f8254b);
        }
        return arrayList;
    }
}
