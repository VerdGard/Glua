package p079j5;

import android.util.SparseArray;
import androidx.activity.C0143v;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p002a1.C0017d;
import p022c5.C0637a;
import p022c5.C0641e;
import p022c5.C0642f;
import p047f5.C1171b;
import p055g5.C1245b;
import p055g5.C1253j;
import p079j5.AbstractC1432a;
import p079j5.C1435d;
import p140r4.C1836d;
import p140r4.C1837e;

/* renamed from: j5.d */
/* loaded from: classes.dex */
public final class C1435d extends AbstractC1432a {

    /* renamed from: Z */
    public static final /* synthetic */ int f6885Z = 0;

    /* renamed from: X */
    public C1171b f6886X;

    /* renamed from: Y */
    public C1837e f6887Y;

    /* renamed from: s */
    public final AtomicInteger f6888s;

    /* renamed from: j5.d$a */
    public class a extends AbstractC1432a.a<Void> {

        /* renamed from: X */
        public final /* synthetic */ C1836d f6889X;

        /* renamed from: Y */
        public final /* synthetic */ int f6890Y;

        /* renamed from: m */
        public final /* synthetic */ C1171b f6892m;

        /* renamed from: s */
        public final /* synthetic */ C1837e f6893s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1432a.b bVar, C1171b c1171b, C1837e c1837e, C1836d c1836d, int i7) {
            super(bVar);
            this.f6892m = c1171b;
            this.f6893s = c1837e;
            this.f6889X = c1836d;
            this.f6890Y = i7;
        }

        @Override // p079j5.AbstractC1432a.a
        /* renamed from: a */
        public final Void mo3802a() {
            C1435d c1435d = C1435d.this;
            final C1171b c1171b = this.f6892m;
            ReentrantLock reentrantLock = c1171b.f5737a;
            reentrantLock.lock();
            try {
                c1435d.f6872c.setLayoutBusy(true);
                C0641e c0641e = c1435d.f6873e;
                int m2147s = c0641e.m2147s() - 1;
                final C1837e c1837e = this.f6893s;
                final C1836d c1836d = this.f6889X;
                c0641e.m2120D(0, m2147s, new C0641e.a() { // from class: j5.c
                    @Override // p022c5.C0641e.a
                    /* renamed from: a */
                    public final void mo2155a(int i7, C0642f c0642f, C0641e.a.C2292a c2292a) {
                        C1435d.a aVar = C1435d.a.this;
                        aVar.getClass();
                        int m4327c = (int) c1837e.m4327c(c0642f, 0, c0642f.f3160e, c1836d);
                        if (!aVar.mo3803b()) {
                            c2292a.f3158a = true;
                        } else {
                            C1171b c1171b2 = c1171b;
                            c1171b2.m3362a(c1171b2.f5741e, m4327c);
                        }
                    }
                });
                reentrantLock.unlock();
                return null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // p079j5.AbstractC1432a.a
        /* renamed from: b */
        public final boolean mo3803b() {
            return super.mo3803b() && C1435d.this.f6888s.get() == this.f6890Y;
        }
    }

    /* renamed from: j5.d$b */
    public static class b implements InterfaceC1437f {

        /* renamed from: a */
        public final C0641e f6894a;

        /* renamed from: b */
        public final C1436e f6895b;

        /* renamed from: c */
        public final int f6896c;

        /* renamed from: d */
        public final SparseArray<C0642f> f6897d;

        /* renamed from: e */
        public int f6898e;

        public b(C0641e c0641e, int i7, SparseArray<C0642f> sparseArray) {
            this.f6898e = i7;
            this.f6896c = i7;
            C1436e c1436e = new C1436e();
            this.f6895b = c1436e;
            this.f6894a = c0641e;
            c1436e.f6900b = true;
            c1436e.f6901c = 0;
            this.f6897d = sparseArray;
        }

        @Override // p079j5.InterfaceC1437f
        public final boolean hasNext() {
            int i7 = this.f6898e;
            return i7 >= 0 && i7 < this.f6894a.m2147s();
        }

        @Override // p079j5.InterfaceC1437f
        public final C1436e next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = this.f6898e;
            C1436e c1436e = this.f6895b;
            c1436e.f6899a = i7;
            SparseArray<C0642f> sparseArray = this.f6897d;
            C0642f c0642f = sparseArray != null ? sparseArray.get(i7) : null;
            if (c0642f == null) {
                c0642f = this.f6894a.m2146r(this.f6898e);
            }
            c1436e.f6902d = c0642f.f3160e;
            this.f6898e++;
            return c1436e;
        }

        @Override // p079j5.InterfaceC1437f
        public final void reset() {
            this.f6898e = this.f6896c;
        }
    }

    public C1435d(C1245b c1245b, C0641e c0641e) {
        super(c1245b, c0641e);
        this.f6888s = new AtomicInteger(0);
        C1837e c1837e = new C1837e(c1245b.getTabWidth());
        this.f6887Y = c1837e;
        c1837e.f8305f = c1245b.f6078w2;
        C1171b c1171b = new C1171b();
        this.f6886X = c1171b;
        m3818e(c1171b);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: A */
    public final int mo3805A() {
        C1171b c1171b = this.f6886X;
        if (c1171b.f5741e == 0) {
            return 214748364;
        }
        int i7 = c1171b.f5742f;
        if (i7 != c1171b.f5746j) {
            c1171b.f5746j = i7;
        }
        c1171b.f5747k = 0;
        for (C1171b.a aVar = c1171b.f5743g; aVar != null; aVar = aVar.f5751d) {
            c1171b.f5747k = Math.max(c1171b.f5747k, aVar.f5750c);
        }
        return c1171b.f5747k;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: a */
    public final int mo3806a() {
        return this.f6873e.m2147s();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: d */
    public final int mo3807d(int i7) {
        return ((C0637a) this.f6872c.getText().m2145q()).m2110o(i7).f3141b;
    }

    /* renamed from: e */
    public final void m3818e(C1171b c1171b) {
        if (this.f6873e == null) {
            return;
        }
        C1836d c1836d = new C1836d(this.f6872c.f6078w2);
        c1836d.set(this.f6872c.getTextPaint());
        c1836d.m4324d();
        int i7 = this.f6888s.get();
        AbstractC1432a.f6871m.submit(new a(new AbstractC1432a.b(1, new C1253j(i7, this)), c1171b, this.f6887Y, c1836d, i7));
    }

    /* renamed from: f */
    public final int m3819f(int i7) {
        C0642f m2146r = this.f6873e.m2146r(i7);
        return (int) this.f6887Y.m4327c(m2146r, 0, m2146r.f3160e, this.f6872c.getTextPaint());
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: j */
    public final void mo3808j() {
        this.f6872c = null;
        this.f6873e = null;
        this.f6886X = null;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: l */
    public final long mo3809l(float f7, float f8) {
        int min = Math.min(this.f6873e.m2147s() - 1, Math.max((int) (f8 / this.f6872c.getRowHeight()), 0));
        C1245b c1245b = this.f6872c;
        C0641e c0641e = this.f6873e;
        return C0017d.m68G(min, C0143v.m409G(c1245b, this, c0641e, min, 0, c0641e.m2142n(min), f7));
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: m */
    public final int mo3810m() {
        return this.f6872c.getRowHeight() * this.f6873e.m2147s();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        if (i7 < i9) {
            C1171b c1171b = this.f6886X;
            int i11 = i7 + 1;
            int i12 = i9 + 1;
            if (i12 > c1171b.f5741e || i11 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException();
            }
            C1171b.a aVar = c1171b.f5743g;
            C1171b.a aVar2 = null;
            while (true) {
                int i13 = aVar.f5749b;
                if (i11 < i13) {
                    break;
                }
                i11 -= i13;
                i12 -= i13;
                aVar2 = aVar;
                aVar = aVar.f5751d;
            }
            int i14 = i12 - i11;
            int i15 = i14;
            while (i15 > 0) {
                if (i11 != 0 || i15 < aVar.f5749b) {
                    int min = Math.min(aVar.f5749b, i15 + 0);
                    int i16 = aVar.f5749b - min;
                    int[] iArr = aVar.f5748a;
                    System.arraycopy(iArr, min, iArr, 0, i16);
                    int i17 = min - 0;
                    aVar.f5749b -= i17;
                    aVar.f5750c = 0;
                    for (int i18 = 0; i18 < aVar.f5749b; i18++) {
                        aVar.f5750c = Math.max(aVar.f5750c, iArr[i18]);
                    }
                    i15 -= i17;
                    aVar2 = aVar;
                    aVar = aVar.f5751d;
                    i11 = 0;
                } else {
                    if (aVar2 != null) {
                        aVar2.f5751d = aVar.f5751d;
                        c1171b.f5739c.add(aVar);
                    }
                    i15 -= aVar.f5749b;
                    aVar.f5749b = 0;
                    aVar = aVar.f5751d;
                }
            }
            c1171b.f5741e -= i14;
        }
        if (i7 != i9) {
            this.f6886X.m3365d(i7, m3819f(i7));
        } else {
            C1171b c1171b2 = this.f6886X;
            c1171b2.m3365d(i7, c1171b2.m3364c(i7) - ((int) this.f6887Y.m4327c(sb, 0, i10 - i8, this.f6872c.getTextPaint())));
        }
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: p */
    public final float[] mo3811p(int i7, int i8, float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            fArr = new float[2];
        }
        fArr[0] = this.f6872c.m3472O(i7);
        C1245b c1245b = this.f6872c;
        C0641e c0641e = this.f6873e;
        fArr[1] = C0143v.m410H(c1245b, this, c0641e, i7, 0, c0641e.m2142n(i7), i8);
        return fArr;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: r */
    public final long mo3812r(int i7, int i8) {
        int i9 = i7 - 1;
        if (i9 < 0) {
            return C0017d.m68G(0, 0);
        }
        int m2142n = this.f6873e.m2142n(i9);
        if (i8 > m2142n) {
            i8 = m2142n;
        }
        return C0017d.m68G(i9, i8);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: s */
    public final int mo3813s(int i7) {
        return Math.max(0, Math.min(i7, this.f6873e.m2147s() - 1));
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: t */
    public final InterfaceC1437f mo3814t(int i7, SparseArray<C0642f> sparseArray) {
        return new b(this.f6873e, i7, sparseArray);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: u */
    public final long mo3815u(int i7, int i8) {
        int i9 = i7 + 1;
        if (i9 >= this.f6873e.m2147s()) {
            return C0017d.m68G(i7, this.f6873e.m2142n(i7));
        }
        int m2142n = this.f6873e.m2142n(i9);
        if (i8 > m2142n) {
            i8 = m2142n;
        }
        return C0017d.m68G(i9, i8);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: v */
    public final C1436e mo3816v(int i7) {
        C1436e c1436e = new C1436e();
        c1436e.f6899a = i7;
        c1436e.f6901c = 0;
        c1436e.f6900b = true;
        c1436e.f6902d = this.f6873e.m2142n(i7);
        return c1436e;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: w */
    public final int mo3817w(int i7) {
        return 1;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        for (int i11 = i7; i11 <= i9; i11++) {
            C1171b c1171b = this.f6886X;
            if (i11 == i7) {
                c1171b.m3365d(i11, i9 == i7 ? c1171b.m3364c(i11) + ((int) this.f6887Y.m4327c(this.f6873e.m2146r(i11), i8, i10, this.f6872c.getTextPaint())) : m3819f(i11));
            } else {
                c1171b.m3362a(i11, m3819f(i11));
            }
        }
    }
}
