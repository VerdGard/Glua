package p054g4;

import android.ext.C0090b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g4.j */
/* loaded from: classes.dex */
public final class C1228j extends AbstractC1230l implements Iterable<AbstractC1230l> {

    /* renamed from: c */
    public final ArrayList<AbstractC1230l> f5976c = new ArrayList<>();

    @Override // p054g4.AbstractC1230l
    /* renamed from: b */
    public final String mo3447b() {
        ArrayList<AbstractC1230l> arrayList = this.f5976c;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0).mo3447b();
        }
        throw new IllegalStateException(C0090b.m219e("Array must have size 1, but has size ", size));
    }

    /* renamed from: c */
    public final AbstractC1230l m3448c(int i7) {
        return this.f5976c.get(i7);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1228j) && ((C1228j) obj).f5976c.equals(this.f5976c));
    }

    public final int hashCode() {
        return this.f5976c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC1230l> iterator() {
        return this.f5976c.iterator();
    }
}
