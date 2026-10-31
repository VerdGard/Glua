package android.ext;

import android.annotation.TargetApi;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class SparseArray<E> extends android.util.SparseArray<E> {
    public SparseArray() {
    }

    public SparseArray(int i7) {
        super(i7);
    }

    private void fixSize() {
        try {
            Field declaredField = android.util.SparseArray.class.getDeclaredField("mKeys");
            declaredField.setAccessible(true);
            Field declaredField2 = android.util.SparseArray.class.getDeclaredField("mValues");
            declaredField2.setAccessible(true);
            Field declaredField3 = android.util.SparseArray.class.getDeclaredField("mSize");
            declaredField3.setAccessible(true);
            int i7 = declaredField3.getInt(this);
            int length = ((int[]) declaredField.get(this)).length;
            int length2 = ((Object[]) declaredField2.get(this)).length;
            if (i7 > length || i7 > length2) {
                declaredField3.setInt(this, Math.min(Math.min(i7, length), length2));
            }
        } catch (Throwable th) {
            Log.m191w("Failed fix", th);
        }
    }

    @Override // android.util.SparseArray
    public void clear() {
        try {
            super.clear();
        } catch (ArrayIndexOutOfBoundsException e7) {
            Log.badImplementation(e7);
            fixSize();
            super.clear();
        }
    }

    @Override // android.util.SparseArray
    public void delete(int i7) {
        try {
            super.delete(i7);
        } catch (ArrayIndexOutOfBoundsException e7) {
            Log.badImplementation(e7);
            fixSize();
            super.delete(i7);
        }
    }

    @Override // android.util.SparseArray
    public E get(int i7, E e7) {
        try {
            return (E) super.get(i7, e7);
        } catch (ArrayIndexOutOfBoundsException e8) {
            Log.badImplementation(e8);
            fixSize();
            return (E) super.get(i7, e7);
        }
    }

    @Override // android.util.SparseArray
    public int indexOfKey(int i7) {
        try {
            return super.indexOfKey(i7);
        } catch (ArrayIndexOutOfBoundsException e7) {
            Log.badImplementation(e7);
            fixSize();
            return super.indexOfKey(i7);
        }
    }

    @Override // android.util.SparseArray
    public void put(int i7, E e7) {
        try {
            super.put(i7, e7);
        } catch (ArrayIndexOutOfBoundsException e8) {
            Log.badImplementation(e8);
            fixSize();
            super.put(i7, e7);
        }
    }

    @Override // android.util.SparseArray
    @TargetApi(11)
    public void removeAt(int i7) {
        super.removeAt(i7);
    }

    @Override // android.util.SparseArray
    public int size() {
        try {
            return super.size();
        } catch (ArrayIndexOutOfBoundsException e7) {
            Log.badImplementation(e7);
            fixSize();
            return super.size();
        }
    }

    public synchronized E syncGet(int i7) {
        return get(i7);
    }

    public synchronized E syncGet(int i7, E e7) {
        return get(i7, e7);
    }

    public synchronized void syncPut(int i7, E e7) {
        put(i7, e7);
    }
}
