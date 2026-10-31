package p079j5;

import android.util.SparseArray;
import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p002a1.C0017d;
import p022c5.C0637a;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p047f5.C1177h;
import p055g5.C1245b;
import p055g5.C1250g;
import p058h0.C1277d;
import p079j5.AbstractC1432a;
import p079j5.C1435d;
import p079j5.C1440i;
import p140r4.C1835c;
import p140r4.C1836d;

/* renamed from: j5.i */
/* loaded from: classes.dex */
public final class C1440i extends AbstractC1432a {

    /* renamed from: Z */
    public static final /* synthetic */ int f6911Z = 0;

    /* renamed from: X */
    public final boolean f6912X;

    /* renamed from: Y */
    public List<a> f6913Y;

    /* renamed from: s */
    public final int f6914s;

    /* renamed from: j5.i$a */
    public static class a {

        /* renamed from: a */
        public final int f6915a;

        /* renamed from: b */
        public final int f6916b;

        /* renamed from: c */
        public int f6917c;

        public a(int i7, int i8, int i9) {
            this.f6917c = i7;
            this.f6915a = i8;
            this.f6916b = i9;
        }

        public final String toString() {
            return "RowRegion{startColumn=" + this.f6915a + ", endColumn=" + this.f6916b + ", line=" + this.f6917c + '}';
        }
    }

    /* renamed from: j5.i$b */
    public class b extends AbstractC1432a.a<d> {

        /* renamed from: X */
        public final int f6918X;

        /* renamed from: Y */
        public final C1836d f6919Y;

        /* renamed from: m */
        public final int f6921m;

        /* renamed from: s */
        public final int f6922s;

        public b(AbstractC1432a.b bVar, int i7, int i8, int i9) {
            super(bVar);
            this.f6921m = i8;
            this.f6918X = i7;
            this.f6922s = i9;
            C1836d c1836d = new C1836d(C1440i.this.f6872c.f6078w2);
            this.f6919Y = c1836d;
            c1836d.set(C1440i.this.f6872c.getTextPaint());
            c1836d.m4324d();
        }

        @Override // p079j5.AbstractC1432a.a
        /* renamed from: a */
        public final d mo3802a() {
            C1440i c1440i = C1440i.this;
            c1440i.f6872c.setLayoutBusy(true);
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            c1440i.f6873e.m2120D(this.f6921m, this.f6922s, new C0641e.a() { // from class: j5.j
                @Override // p022c5.C0641e.a
                /* renamed from: a */
                public final void mo2155a(int i7, C0642f c0642f, C0641e.a.C2292a c2292a) {
                    C1440i.b bVar = C1440i.b.this;
                    C1440i c1440i2 = C1440i.this;
                    ArrayList arrayList3 = arrayList2;
                    c1440i2.m3820e(i7, c0642f, arrayList3, bVar.f6919Y);
                    int i8 = -1;
                    while (i8 < arrayList3.size()) {
                        int intValue = i8 == -1 ? 0 : ((Integer) arrayList3.get(i8)).intValue();
                        i8++;
                        arrayList.add(new C1440i.a(i7, intValue, i8 < arrayList3.size() ? ((Integer) arrayList3.get(i8)).intValue() : c0642f.f3160e));
                    }
                    if (!bVar.mo3803b()) {
                        c2292a.f3158a = true;
                    }
                    arrayList3.clear();
                }
            });
            return new d(this.f6918X, arrayList);
        }
    }

    /* renamed from: j5.i$c */
    public class c implements InterfaceC1437f {

        /* renamed from: a */
        public final C1436e f6923a = new C1436e();

        /* renamed from: b */
        public final int f6924b;

        /* renamed from: c */
        public int f6925c;

        public c(int i7) {
            this.f6925c = i7;
            this.f6924b = i7;
        }

        @Override // p079j5.InterfaceC1437f
        public final boolean hasNext() {
            int i7 = this.f6925c;
            return i7 >= 0 && i7 < C1440i.this.f6913Y.size();
        }

        @Override // p079j5.InterfaceC1437f
        public final C1436e next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C1440i c1440i = C1440i.this;
            a aVar = c1440i.f6913Y.get(this.f6925c);
            int i7 = aVar.f6917c;
            C1436e c1436e = this.f6923a;
            c1436e.f6899a = i7;
            c1436e.f6901c = aVar.f6915a;
            c1436e.f6902d = aVar.f6916b;
            int i8 = this.f6925c;
            c1436e.f6900b = i8 <= 0 || c1440i.f6913Y.get(i8 - 1).f6917c != aVar.f6917c;
            this.f6925c++;
            return c1436e;
        }

        @Override // p079j5.InterfaceC1437f
        public final void reset() {
            this.f6925c = this.f6924b;
        }
    }

    /* renamed from: j5.i$d */
    public static class d implements Comparable<d> {

        /* renamed from: c */
        public final int f6927c;

        /* renamed from: e */
        public final List<a> f6928e;

        public d(int i7, ArrayList arrayList) {
            this.f6927c = i7;
            this.f6928e = arrayList;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return Integer.compare(this.f6927c, dVar.f6927c);
        }
    }

    public C1440i(C1245b c1245b, C0641e c0641e, boolean z6, List<a> list, boolean z7) {
        super(c1245b, c0641e);
        this.f6912X = z6;
        list = list == null ? new ArrayList<>() : list;
        this.f6913Y = list;
        if (z7) {
            list.clear();
        }
        this.f6914s = c1245b.getWidth() - ((int) (c1245b.getTextPaint().measureText("a") + c1245b.m3482Y()));
        int min = Math.min(8, (int) Math.ceil(this.f6873e.m2147s() / 3000.0f));
        int m2147s = this.f6873e.m2147s() / min;
        AbstractC1432a.b bVar = new AbstractC1432a.b(min, new C1277d(4, this));
        int i7 = 0;
        while (i7 < min) {
            int i8 = i7 + 1;
            AbstractC1432a.f6871m.submit(new b(bVar, i7, m2147s * i7, (i8 == min ? this.f6873e.m2147s() : m2147s * i8) - 1));
            i7 = i8;
        }
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: A */
    public final int mo3805A() {
        return 0;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: a */
    public final int mo3806a() {
        return this.f6913Y.isEmpty() ? this.f6873e.m2147s() : this.f6913Y.size();
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: c */
    public final void mo2102c(C0641e c0641e) {
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: d */
    public final int mo3807d(int i7) {
        int i8;
        C0638b m2110o = ((C0637a) this.f6872c.getText().m2145q()).m2110o(i7);
        int i9 = m2110o.f3141b;
        if (this.f6913Y.isEmpty()) {
            return i9;
        }
        int i10 = m2110o.f3142c;
        int m3822g = m3822g(i9);
        if (m3822g >= this.f6913Y.size()) {
            return 0;
        }
        a aVar = this.f6913Y.get(m3822g);
        if (aVar.f6917c != i9) {
            return 0;
        }
        while (aVar.f6915a < i10 && (i8 = m3822g + 1) < this.f6913Y.size()) {
            a aVar2 = this.f6913Y.get(i8);
            if (aVar2.f6917c != i9 || aVar2.f6915a > i10) {
                return i8 - 1;
            }
            aVar = aVar2;
            m3822g = i8;
        }
        return m3822g;
    }

    /* renamed from: e */
    public final void m3820e(int i7, C0642f c0642f, ArrayList arrayList, C1836d c1836d) {
        long m4316a;
        int i8 = c0642f.f3160e;
        char[] cArr = c0642f.f3159c;
        int i9 = 0;
        while (i9 < i8) {
            C1250g renderer = this.f6872c.getRenderer();
            float f7 = this.f6914s;
            C1836d textPaint = c1836d == null ? this.f6872c.getTextPaint() : c1836d;
            if (i9 >= i8) {
                renderer.getClass();
                m4316a = C0017d.m68G(i8, Float.floatToRawIntBits(0.0f));
            } else {
                C1835c m4315d = C1835c.m4315d(renderer.f6137D);
                m4315d.m4320f(renderer.f6135B, i7, 0, i8, C1250g.f6130F, textPaint, renderer.f6153o.getRenderContext());
                m4315d.f8292j = false;
                m4316a = m4315d.m4316a(i9, f7);
                m4315d.m4319e();
            }
            int i10 = (int) (m4316a >> 32);
            if (i10 == i9) {
                i10++;
            }
            if (this.f6912X) {
                int i11 = i10 - 1;
                if (C1177h.m3385a(cArr[i11]) && i10 < i8 && (C1177h.m3385a(cArr[i10]) || cArr[i10] == '-')) {
                    while (i11 > i9) {
                        int i12 = i11 - 1;
                        if (!C1177h.m3385a(cArr[i12])) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                    if (i11 > i9) {
                        i9 = i11;
                        arrayList.add(Integer.valueOf(i9));
                    }
                }
            }
            i9 = i10;
            arrayList.add(Integer.valueOf(i9));
        }
        if (arrayList.isEmpty() || ((Integer) arrayList.get(arrayList.size() - 1)).intValue() != c0642f.f3160e) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: f */
    public final void m3821f(int i7, int i8) {
        int i9;
        int i10 = 0;
        while (i10 < this.f6913Y.size() && this.f6913Y.get(i10).f6917c < i7) {
            i10++;
        }
        while (i10 < this.f6913Y.size() && (i9 = this.f6913Y.get(i10).f6917c) >= i7 && i9 <= i8) {
            this.f6913Y.remove(i10);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (i7 <= i8) {
            m3820e(i7, this.f6873e.m2146r(i7), arrayList, null);
            int i11 = -1;
            while (i11 < arrayList.size()) {
                int intValue = i11 == -1 ? 0 : ((Integer) arrayList.get(i11)).intValue();
                i11++;
                arrayList2.add(new a(i7, intValue, i11 < arrayList.size() ? ((Integer) arrayList.get(i11)).intValue() : this.f6873e.m2142n(i7)));
            }
            arrayList.clear();
            i7++;
        }
        this.f6913Y.addAll(i10, arrayList2);
    }

    /* renamed from: g */
    public final int m3822g(int i7) {
        int i8;
        int size = this.f6913Y.size();
        int i9 = 0;
        while (true) {
            if (i9 <= size) {
                i8 = (i9 + size) / 2;
                if (i8 >= 0 && i8 < this.f6913Y.size()) {
                    int i10 = this.f6913Y.get(i8).f6917c;
                    if (i10 >= i7) {
                        if (i10 <= i7) {
                            i9 = i8;
                            break;
                        }
                        size = i8 - 1;
                    } else {
                        i9 = i8 + 1;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        i9 = Math.max(0, Math.min(this.f6913Y.size() - 1, i8));
        while (i9 > 0 && this.f6913Y.get(i9).f6915a > 0) {
            i9--;
        }
        return i9;
    }

    /* renamed from: h */
    public final int m3823h(int i7, int i8) {
        int i9;
        int m3822g = m3822g(i7);
        while (this.f6913Y.get(m3822g).f6916b <= i8 && (i9 = m3822g + 1) < this.f6913Y.size() && this.f6913Y.get(i9).f6917c == i7) {
            m3822g = i9;
        }
        return m3822g;
    }

    /* renamed from: i */
    public final List<Integer> m3824i(int i7) {
        if (this.f6913Y.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int m3822g = m3822g(i7); m3822g < this.f6913Y.size() && this.f6913Y.get(m3822g).f6917c == i7; m3822g++) {
            int i8 = this.f6913Y.get(m3822g).f6915a;
            if (i8 != 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: j */
    public final void mo3808j() {
        this.f6872c = null;
        this.f6873e = null;
        this.f6913Y = null;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: l */
    public final long mo3809l(float f7, float f8) {
        int m409G;
        int i7;
        if (this.f6913Y.isEmpty()) {
            i7 = Math.min(this.f6873e.m2147s() - 1, Math.max((int) (f8 / this.f6872c.getRowHeight()), 0));
            C1245b c1245b = this.f6872c;
            C0641e c0641e = this.f6873e;
            m409G = C0143v.m409G(c1245b, this, c0641e, i7, 0, c0641e.m2142n(i7), f7);
        } else {
            a aVar = this.f6913Y.get(Math.max(0, Math.min((int) (f8 / this.f6872c.getRowHeight()), this.f6913Y.size() - 1)));
            m409G = C0143v.m409G(this.f6872c, this, this.f6873e, aVar.f6917c, aVar.f6915a, aVar.f6916b, f7);
            i7 = aVar.f6917c;
        }
        return C0017d.m68G(i7, m409G);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: m */
    public final int mo3810m() {
        int size;
        int rowHeight;
        if (this.f6913Y.isEmpty()) {
            size = this.f6872c.getRowHeight();
            rowHeight = this.f6873e.m2147s();
        } else {
            size = this.f6913Y.size();
            rowHeight = this.f6872c.getRowHeight();
        }
        return rowHeight * size;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: n */
    public final void mo2109n(C0641e c0641e, int i7, int i8, int i9, int i10, StringBuilder sb) {
        int i11;
        int i12 = i9 - i7;
        if (i12 != 0) {
            int m3822g = m3822g(i7);
            while (m3822g < this.f6913Y.size() && (i11 = this.f6913Y.get(m3822g).f6917c) >= i7 && i11 <= i9) {
                this.f6913Y.remove(m3822g);
            }
            for (int m3822g2 = m3822g(i9 + 1); m3822g2 < this.f6913Y.size(); m3822g2++) {
                a aVar = this.f6913Y.get(m3822g2);
                int i13 = aVar.f6917c;
                if (i13 >= i9) {
                    aVar.f6917c = i13 - i12;
                }
            }
        }
        m3821f(i7, i7);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: p */
    public final float[] mo3811p(int i7, int i8, float[] fArr) {
        int i9;
        if (fArr == null || fArr.length < 2) {
            fArr = new float[2];
        }
        if (this.f6913Y.isEmpty()) {
            fArr[0] = this.f6872c.m3472O(i7);
            C1245b c1245b = this.f6872c;
            C0641e c0641e = this.f6873e;
            fArr[1] = C0143v.m410H(c1245b, this, c0641e, i7, 0, c0641e.m2142n(i7), i8);
            return fArr;
        }
        int m3822g = m3822g(i7);
        if (m3822g < this.f6913Y.size()) {
            a aVar = this.f6913Y.get(m3822g);
            if (aVar.f6917c != i7) {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                return fArr;
            }
            while (aVar.f6915a < i8 && (i9 = m3822g + 1) < this.f6913Y.size()) {
                aVar = this.f6913Y.get(i9);
                if (aVar.f6917c != i7 || aVar.f6915a > i8) {
                    m3822g = i9 - 1;
                    aVar = this.f6913Y.get(m3822g);
                    break;
                }
                m3822g = i9;
            }
            fArr[0] = this.f6872c.m3472O(m3822g);
            fArr[1] = C0143v.m410H(this.f6872c, this, this.f6873e, aVar.f6917c, aVar.f6915a, aVar.f6916b, i8);
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        return fArr;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: r */
    public final long mo3812r(int i7, int i8) {
        boolean isEmpty = this.f6913Y.isEmpty();
        long m68G = C0017d.m68G(0, 0);
        if (isEmpty) {
            int i9 = i7 - 1;
            if (i9 < 0) {
                return m68G;
            }
            int m2142n = this.f6873e.m2142n(i9);
            if (i8 > m2142n) {
                i8 = m2142n;
            }
            return C0017d.m68G(i9, i8);
        }
        int m3823h = m3823h(i7, i8);
        if (m3823h <= 0) {
            return m68G;
        }
        int i10 = i8 - this.f6913Y.get(m3823h).f6915a;
        a aVar = this.f6913Y.get(m3823h - 1);
        int i11 = aVar.f6916b;
        int i12 = aVar.f6915a;
        return C0017d.m68G(aVar.f6917c, i12 + Math.min(i10, i11 - i12));
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: s */
    public final int mo3813s(int i7) {
        a aVar;
        if (this.f6913Y.isEmpty()) {
            return Math.max(0, Math.min(i7, this.f6873e.m2147s() - 1));
        }
        if (i7 >= this.f6913Y.size()) {
            aVar = this.f6913Y.get(r2.size() - 1);
        } else {
            aVar = this.f6913Y.get(i7);
        }
        return aVar.f6917c;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: t */
    public final InterfaceC1437f mo3814t(int i7, SparseArray<C0642f> sparseArray) {
        return this.f6913Y.isEmpty() ? new C1435d.b(this.f6873e, i7, sparseArray) : new c(i7);
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: u */
    public final long mo3815u(int i7, int i8) {
        if (this.f6913Y.isEmpty()) {
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
        int m3823h = m3823h(i7, i8);
        int i10 = m3823h + 1;
        if (i10 >= this.f6913Y.size()) {
            return C0017d.m68G(i7, this.f6873e.m2142n(i7));
        }
        int i11 = i8 - this.f6913Y.get(m3823h).f6915a;
        a aVar = this.f6913Y.get(i10);
        int i12 = aVar.f6916b;
        int i13 = aVar.f6915a;
        return C0017d.m68G(aVar.f6917c, i13 + Math.min(i11, i12 - i13));
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: v */
    public final C1436e mo3816v(int i7) {
        if (this.f6913Y.isEmpty()) {
            C1436e c1436e = new C1436e();
            c1436e.f6901c = 0;
            c1436e.f6902d = this.f6873e.m2142n(i7);
            c1436e.f6900b = true;
            c1436e.f6899a = i7;
            return c1436e;
        }
        a aVar = this.f6913Y.get(i7);
        C1436e c1436e2 = new C1436e();
        int i8 = aVar.f6915a;
        c1436e2.f6900b = i8 == 0;
        c1436e2.f6901c = i8;
        c1436e2.f6902d = aVar.f6916b;
        c1436e2.f6899a = aVar.f6917c;
        return c1436e2;
    }

    @Override // p079j5.InterfaceC1433b
    /* renamed from: w */
    public final int mo3817w(int i7) {
        if (this.f6913Y.isEmpty()) {
            return 1;
        }
        int i8 = 0;
        for (int m3822g = m3822g(i7); m3822g < this.f6913Y.size() && this.f6913Y.get(m3822g).f6917c == i7; m3822g++) {
            i8++;
        }
        return i8;
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: y */
    public final void mo2113y(C0641e c0641e, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        int i11 = i9 - i7;
        if (i11 != 0) {
            for (int m3822g = m3822g(i7 + 1); m3822g < this.f6913Y.size(); m3822g++) {
                this.f6913Y.get(m3822g).f6917c += i11;
            }
        }
        m3821f(i7, i9);
    }
}
