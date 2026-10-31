package p056g6;

import java.util.NoSuchElementException;
import p195y5.AbstractC2263k;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public final class C1265b extends AbstractC2263k {

    /* renamed from: c */
    public final int f6308c;

    /* renamed from: e */
    public final int f6309e;

    /* renamed from: m */
    public boolean f6310m;

    /* renamed from: s */
    public int f6311s;

    public C1265b(int i7, int i8, int i9) {
        this.f6308c = i9;
        this.f6309e = i8;
        boolean z6 = true;
        if (i9 <= 0 ? i7 < i8 : i7 > i8) {
            z6 = false;
        }
        this.f6310m = z6;
        this.f6311s = z6 ? i7 : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6310m;
    }

    @Override // p195y5.AbstractC2263k
    public final int nextInt() {
        int i7 = this.f6311s;
        if (i7 != this.f6309e) {
            this.f6311s = this.f6308c + i7;
        } else {
            if (!this.f6310m) {
                throw new NoSuchElementException();
            }
            this.f6310m = false;
        }
        return i7;
    }
}
