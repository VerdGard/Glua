package p195y5;

import java.util.Iterator;

/* renamed from: y5.k */
/* loaded from: classes.dex */
public abstract class AbstractC2263k implements Iterator<Integer> {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
