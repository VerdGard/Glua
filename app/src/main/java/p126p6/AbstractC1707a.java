package p126p6;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: p6.a */
/* loaded from: classes.dex */
public abstract class AbstractC1707a<E> extends ArrayList<E> {
    public AbstractC1707a(int i7) {
        super(i7);
    }

    /* renamed from: a */
    public abstract void mo4132a();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i7, E e7) {
        mo4132a();
        super.add(i7, e7);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        mo4132a();
        return super.add(e7);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        mo4132a();
        return super.addAll(i7, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        mo4132a();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        mo4132a();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E remove(int i7) {
        mo4132a();
        return (E) super.remove(i7);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        mo4132a();
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        mo4132a();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        mo4132a();
        super.removeRange(i7, i8);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        mo4132a();
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E set(int i7, E e7) {
        mo4132a();
        return (E) super.set(i7, e7);
    }
}
