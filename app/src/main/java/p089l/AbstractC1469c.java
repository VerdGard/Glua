package p089l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: l.c */
/* loaded from: classes.dex */
public abstract class AbstractC1469c<T> implements Iterator<T> {

    /* renamed from: c */
    public int f7020c;

    /* renamed from: e */
    public int f7021e;

    /* renamed from: m */
    public boolean f7022m;

    public AbstractC1469c(int i7) {
        this.f7020c = i7;
    }

    /* renamed from: a */
    public abstract T mo3849a(int i7);

    /* renamed from: b */
    public abstract void mo3850b(int i7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7021e < this.f7020c;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T mo3849a = mo3849a(this.f7021e);
        this.f7021e++;
        this.f7022m = true;
        return mo3849a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7022m) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f7021e - 1;
        this.f7021e = i7;
        mo3850b(i7);
        this.f7020c--;
        this.f7022m = false;
    }
}
