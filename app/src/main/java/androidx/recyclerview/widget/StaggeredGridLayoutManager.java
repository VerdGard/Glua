package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0479m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0444m implements RecyclerView.AbstractC0454w.b {

    /* renamed from: B */
    public final C0461d f2286B;

    /* renamed from: C */
    public final int f2287C;

    /* renamed from: D */
    public boolean f2288D;

    /* renamed from: E */
    public boolean f2289E;

    /* renamed from: F */
    public C0462e f2290F;

    /* renamed from: G */
    public final Rect f2291G;

    /* renamed from: H */
    public final C0459b f2292H;

    /* renamed from: I */
    public final boolean f2293I;

    /* renamed from: J */
    public int[] f2294J;

    /* renamed from: K */
    public final RunnableC0458a f2295K;

    /* renamed from: p */
    public int f2296p;

    /* renamed from: q */
    public C0463f[] f2297q;

    /* renamed from: r */
    public AbstractC0485s f2298r;

    /* renamed from: s */
    public AbstractC0485s f2299s;

    /* renamed from: t */
    public int f2300t;

    /* renamed from: u */
    public int f2301u;

    /* renamed from: v */
    public final C0480n f2302v;

    /* renamed from: w */
    public boolean f2303w;

    /* renamed from: y */
    public BitSet f2305y;

    /* renamed from: x */
    public boolean f2304x = false;

    /* renamed from: z */
    public int f2306z = -1;

    /* renamed from: A */
    public int f2285A = Integer.MIN_VALUE;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0458a implements Runnable {
        public RunnableC0458a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.m1684C0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0459b {

        /* renamed from: a */
        public int f2308a;

        /* renamed from: b */
        public int f2309b;

        /* renamed from: c */
        public boolean f2310c;

        /* renamed from: d */
        public boolean f2311d;

        /* renamed from: e */
        public boolean f2312e;

        /* renamed from: f */
        public int[] f2313f;

        public C0459b() {
            m1711a();
        }

        /* renamed from: a */
        public final void m1711a() {
            this.f2308a = -1;
            this.f2309b = Integer.MIN_VALUE;
            this.f2310c = false;
            this.f2311d = false;
            this.f2312e = false;
            int[] iArr = this.f2313f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0460c extends RecyclerView.C0445n {

        /* renamed from: e */
        public C0463f f2315e;

        public C0460c(int i7, int i8) {
            super(i7, i8);
        }

        public C0460c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0460c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0460c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0461d {

        /* renamed from: a */
        public int[] f2316a;

        /* renamed from: b */
        public List<a> f2317b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C2291a();

            /* renamed from: c */
            public int f2318c;

            /* renamed from: e */
            public int f2319e;

            /* renamed from: m */
            public int[] f2320m;

            /* renamed from: s */
            public boolean f2321s;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C2291a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f2318c = parcel.readInt();
                this.f2319e = parcel.readInt();
                this.f2321s = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2320m = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2318c + ", mGapDir=" + this.f2319e + ", mHasUnwantedGapAfter=" + this.f2321s + ", mGapPerSpan=" + Arrays.toString(this.f2320m) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f2318c);
                parcel.writeInt(this.f2319e);
                parcel.writeInt(this.f2321s ? 1 : 0);
                int[] iArr = this.f2320m;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2320m);
                }
            }
        }

        /* renamed from: a */
        public final void m1712a(int i7) {
            int[] iArr = this.f2316a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f2316a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int length = iArr.length;
                while (length <= i7) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2316a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2316a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m1713b(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f2316a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2317b
                if (r0 != 0) goto Lf
                goto L5e
            Lf:
                r2 = 0
                if (r0 != 0) goto L13
                goto L2b
            L13:
                int r0 = r0.size()
                int r0 = r0 + r1
            L18:
                if (r0 < 0) goto L2b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2317b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0461d.a) r3
                int r4 = r3.f2318c
                if (r4 != r6) goto L28
                r2 = r3
                goto L2b
            L28:
                int r0 = r0 + (-1)
                goto L18
            L2b:
                if (r2 == 0) goto L32
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2317b
                r0.remove(r2)
            L32:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2317b
                int r0 = r0.size()
                r2 = 0
            L39:
                if (r2 >= r0) goto L4b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2317b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0461d.a) r3
                int r3 = r3.f2318c
                if (r3 < r6) goto L48
                goto L4c
            L48:
                int r2 = r2 + 1
                goto L39
            L4b:
                r2 = -1
            L4c:
                if (r2 == r1) goto L5e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2317b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0461d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2317b
                r3.remove(r2)
                int r0 = r0.f2318c
                goto L5f
            L5e:
                r0 = -1
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f2316a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f2316a
                int r6 = r6.length
                return r6
            L6b:
                int[] r2 = r5.f2316a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0461d.m1713b(int):int");
        }

        /* renamed from: c */
        public final void m1714c(int i7, int i8) {
            int[] iArr = this.f2316a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m1712a(i9);
            int[] iArr2 = this.f2316a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f2316a, i7, i9, -1);
            List<a> list = this.f2317b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2317b.get(size);
                int i10 = aVar.f2318c;
                if (i10 >= i7) {
                    aVar.f2318c = i10 + i8;
                }
            }
        }

        /* renamed from: d */
        public final void m1715d(int i7, int i8) {
            int[] iArr = this.f2316a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m1712a(i9);
            int[] iArr2 = this.f2316a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f2316a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            List<a> list = this.f2317b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2317b.get(size);
                int i10 = aVar.f2318c;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f2317b.remove(size);
                    } else {
                        aVar.f2318c = i10 - i8;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0462e implements Parcelable {
        public static final Parcelable.Creator<C0462e> CREATOR = new a();

        /* renamed from: X */
        public int f2322X;

        /* renamed from: Y */
        public int[] f2323Y;

        /* renamed from: Z */
        public List<C0461d.a> f2324Z;

        /* renamed from: c */
        public int f2325c;

        /* renamed from: e */
        public int f2326e;

        /* renamed from: m */
        public int f2327m;

        /* renamed from: s */
        public int[] f2328s;

        /* renamed from: w1 */
        public boolean f2329w1;

        /* renamed from: x1 */
        public boolean f2330x1;

        /* renamed from: y1 */
        public boolean f2331y1;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class a implements Parcelable.Creator<C0462e> {
            @Override // android.os.Parcelable.Creator
            public final C0462e createFromParcel(Parcel parcel) {
                return new C0462e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0462e[] newArray(int i7) {
                return new C0462e[i7];
            }
        }

        public C0462e() {
        }

        public C0462e(Parcel parcel) {
            this.f2325c = parcel.readInt();
            this.f2326e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2327m = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2328s = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2322X = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2323Y = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2329w1 = parcel.readInt() == 1;
            this.f2330x1 = parcel.readInt() == 1;
            this.f2331y1 = parcel.readInt() == 1;
            this.f2324Z = parcel.readArrayList(C0461d.a.class.getClassLoader());
        }

        public C0462e(C0462e c0462e) {
            this.f2327m = c0462e.f2327m;
            this.f2325c = c0462e.f2325c;
            this.f2326e = c0462e.f2326e;
            this.f2328s = c0462e.f2328s;
            this.f2322X = c0462e.f2322X;
            this.f2323Y = c0462e.f2323Y;
            this.f2329w1 = c0462e.f2329w1;
            this.f2330x1 = c0462e.f2330x1;
            this.f2331y1 = c0462e.f2331y1;
            this.f2324Z = c0462e.f2324Z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f2325c);
            parcel.writeInt(this.f2326e);
            parcel.writeInt(this.f2327m);
            if (this.f2327m > 0) {
                parcel.writeIntArray(this.f2328s);
            }
            parcel.writeInt(this.f2322X);
            if (this.f2322X > 0) {
                parcel.writeIntArray(this.f2323Y);
            }
            parcel.writeInt(this.f2329w1 ? 1 : 0);
            parcel.writeInt(this.f2330x1 ? 1 : 0);
            parcel.writeInt(this.f2331y1 ? 1 : 0);
            parcel.writeList(this.f2324Z);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0463f {

        /* renamed from: a */
        public final ArrayList<View> f2332a = new ArrayList<>();

        /* renamed from: b */
        public int f2333b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f2334c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f2335d = 0;

        /* renamed from: e */
        public final int f2336e;

        public C0463f(int i7) {
            this.f2336e = i7;
        }

        /* renamed from: h */
        public static C0460c m1716h(View view) {
            return (C0460c) view.getLayoutParams();
        }

        /* renamed from: a */
        public final void m1717a() {
            View view = this.f2332a.get(r0.size() - 1);
            C0460c m1716h = m1716h(view);
            this.f2334c = StaggeredGridLayoutManager.this.f2298r.mo1787b(view);
            m1716h.getClass();
        }

        /* renamed from: b */
        public final void m1718b() {
            this.f2332a.clear();
            this.f2333b = Integer.MIN_VALUE;
            this.f2334c = Integer.MIN_VALUE;
            this.f2335d = 0;
        }

        /* renamed from: c */
        public final int m1719c() {
            return StaggeredGridLayoutManager.this.f2303w ? m1721e(r1.size() - 1, -1) : m1721e(0, this.f2332a.size());
        }

        /* renamed from: d */
        public final int m1720d() {
            return StaggeredGridLayoutManager.this.f2303w ? m1721e(0, this.f2332a.size()) : m1721e(r1.size() - 1, -1);
        }

        /* renamed from: e */
        public final int m1721e(int i7, int i8) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int mo1796k = staggeredGridLayoutManager.f2298r.mo1796k();
            int mo1792g = staggeredGridLayoutManager.f2298r.mo1792g();
            int i9 = i8 > i7 ? 1 : -1;
            while (i7 != i8) {
                View view = this.f2332a.get(i7);
                int mo1790e = staggeredGridLayoutManager.f2298r.mo1790e(view);
                int mo1787b = staggeredGridLayoutManager.f2298r.mo1787b(view);
                boolean z6 = mo1790e <= mo1792g;
                boolean z7 = mo1787b >= mo1796k;
                if (z6 && z7 && (mo1790e < mo1796k || mo1787b > mo1792g)) {
                    return RecyclerView.AbstractC0444m.m1609J(view);
                }
                i7 += i9;
            }
            return -1;
        }

        /* renamed from: f */
        public final int m1722f(int i7) {
            int i8 = this.f2334c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f2332a.size() == 0) {
                return i7;
            }
            m1717a();
            return this.f2334c;
        }

        /* renamed from: g */
        public final View m1723g(int i7, int i8) {
            ArrayList<View> arrayList = this.f2332a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i8 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f2303w && RecyclerView.AbstractC0444m.m1609J(view2) >= i7) || ((!staggeredGridLayoutManager.f2303w && RecyclerView.AbstractC0444m.m1609J(view2) <= i7) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    View view3 = arrayList.get(i9);
                    if ((staggeredGridLayoutManager.f2303w && RecyclerView.AbstractC0444m.m1609J(view3) <= i7) || ((!staggeredGridLayoutManager.f2303w && RecyclerView.AbstractC0444m.m1609J(view3) >= i7) || !view3.hasFocusable())) {
                        break;
                    }
                    i9++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: i */
        public final int m1724i(int i7) {
            int i8 = this.f2333b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            ArrayList<View> arrayList = this.f2332a;
            if (arrayList.size() == 0) {
                return i7;
            }
            View view = arrayList.get(0);
            C0460c m1716h = m1716h(view);
            this.f2333b = StaggeredGridLayoutManager.this.f2298r.mo1790e(view);
            m1716h.getClass();
            return this.f2333b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f2296p = -1;
        this.f2303w = false;
        C0461d c0461d = new C0461d();
        this.f2286B = c0461d;
        this.f2287C = 2;
        this.f2291G = new Rect();
        this.f2292H = new C0459b();
        this.f2293I = true;
        this.f2295K = new RunnableC0458a();
        RecyclerView.AbstractC0444m.d m1610K = RecyclerView.AbstractC0444m.m1610K(context, attributeSet, i7, i8);
        int i9 = m1610K.f2225a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1491c(null);
        if (i9 != this.f2300t) {
            this.f2300t = i9;
            AbstractC0485s abstractC0485s = this.f2298r;
            this.f2298r = this.f2299s;
            this.f2299s = abstractC0485s;
            m1635m0();
        }
        int i10 = m1610K.f2226b;
        mo1491c(null);
        if (i10 != this.f2296p) {
            int[] iArr = c0461d.f2316a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0461d.f2317b = null;
            m1635m0();
            this.f2296p = i10;
            this.f2305y = new BitSet(this.f2296p);
            this.f2297q = new C0463f[this.f2296p];
            for (int i11 = 0; i11 < this.f2296p; i11++) {
                this.f2297q[i11] = new C0463f(i11);
            }
            m1635m0();
        }
        boolean z6 = m1610K.f2227c;
        mo1491c(null);
        C0462e c0462e = this.f2290F;
        if (c0462e != null && c0462e.f2329w1 != z6) {
            c0462e.f2329w1 = z6;
        }
        this.f2303w = z6;
        m1635m0();
        this.f2302v = new C0480n();
        this.f2298r = AbstractC0485s.m1801a(this, this.f2300t);
        this.f2299s = AbstractC0485s.m1801a(this, 1 - this.f2300t);
    }

    /* renamed from: d1 */
    public static int m1682d1(int i7, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: A0 */
    public final boolean mo1426A0() {
        return this.f2290F == null;
    }

    /* renamed from: B0 */
    public final int m1683B0(int i7) {
        if (m1643w() == 0) {
            return this.f2304x ? 1 : -1;
        }
        return (i7 < m1693L0()) != this.f2304x ? -1 : 1;
    }

    /* renamed from: C0 */
    public final boolean m1684C0() {
        int m1693L0;
        if (m1643w() != 0 && this.f2287C != 0 && this.f2214g) {
            if (this.f2304x) {
                m1693L0 = m1694M0();
                m1693L0();
            } else {
                m1693L0 = m1693L0();
                m1694M0();
            }
            if (m1693L0 == 0 && m1698Q0() != null) {
                C0461d c0461d = this.f2286B;
                int[] iArr = c0461d.f2316a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0461d.f2317b = null;
                this.f2213f = true;
                m1635m0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public final int m1685D0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        AbstractC0485s abstractC0485s = this.f2298r;
        boolean z6 = this.f2293I;
        return C0491y.m1816a(c0455x, abstractC0485s, m1690I0(!z6), m1689H0(!z6), this, this.f2293I);
    }

    /* renamed from: E0 */
    public final int m1686E0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        AbstractC0485s abstractC0485s = this.f2298r;
        boolean z6 = this.f2293I;
        return C0491y.m1817b(c0455x, abstractC0485s, m1690I0(!z6), m1689H0(!z6), this, this.f2293I, this.f2304x);
    }

    /* renamed from: F0 */
    public final int m1687F0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        AbstractC0485s abstractC0485s = this.f2298r;
        boolean z6 = this.f2293I;
        return C0491y.m1818c(c0455x, abstractC0485s, m1690I0(!z6), m1689H0(!z6), this, this.f2293I);
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* renamed from: G0 */
    public final int m1688G0(RecyclerView.C0450s c0450s, C0480n c0480n, RecyclerView.C0455x c0455x) {
        C0463f c0463f;
        ?? r8;
        int m1614x;
        int m1614x2;
        int m1724i;
        int mo1788c;
        int mo1796k;
        int mo1788c2;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        this.f2305y.set(0, this.f2296p, true);
        C0480n c0480n2 = this.f2302v;
        int i11 = c0480n2.f2479i ? c0480n.f2475e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0480n.f2475e == 1 ? c0480n.f2477g + c0480n.f2472b : c0480n.f2476f - c0480n.f2472b;
        int i12 = c0480n.f2475e;
        for (int i13 = 0; i13 < this.f2296p; i13++) {
            if (!this.f2297q[i13].f2332a.isEmpty()) {
                m1710c1(this.f2297q[i13], i12, i11);
            }
        }
        int mo1792g = this.f2304x ? this.f2298r.mo1792g() : this.f2298r.mo1796k();
        boolean z6 = false;
        while (true) {
            int i14 = c0480n.f2473c;
            if (!(i14 >= 0 && i14 < c0455x.m1679b()) || (!c0480n2.f2479i && this.f2305y.isEmpty())) {
                break;
            }
            View m1663d = c0450s.m1663d(c0480n.f2473c);
            c0480n.f2473c += c0480n.f2474d;
            C0460c c0460c = (C0460c) m1663d.getLayoutParams();
            int m1651a = c0460c.m1651a();
            C0461d c0461d = this.f2286B;
            int[] iArr = c0461d.f2316a;
            int i15 = (iArr == null || m1651a >= iArr.length) ? -1 : iArr[m1651a];
            if (i15 == -1) {
                if (m1701T0(c0480n.f2475e)) {
                    i8 = this.f2296p - i10;
                    i7 = -1;
                    i9 = -1;
                } else {
                    i7 = this.f2296p;
                    i8 = 0;
                    i9 = 1;
                }
                C0463f c0463f2 = null;
                if (c0480n.f2475e == i10) {
                    int mo1796k2 = this.f2298r.mo1796k();
                    int i16 = Integer.MAX_VALUE;
                    while (i8 != i7) {
                        C0463f c0463f3 = this.f2297q[i8];
                        int m1722f = c0463f3.m1722f(mo1796k2);
                        if (m1722f < i16) {
                            i16 = m1722f;
                            c0463f2 = c0463f3;
                        }
                        i8 += i9;
                    }
                } else {
                    int mo1792g2 = this.f2298r.mo1792g();
                    int i17 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        C0463f c0463f4 = this.f2297q[i8];
                        int m1724i2 = c0463f4.m1724i(mo1792g2);
                        if (m1724i2 > i17) {
                            c0463f2 = c0463f4;
                            i17 = m1724i2;
                        }
                        i8 += i9;
                    }
                }
                c0463f = c0463f2;
                c0461d.m1712a(m1651a);
                c0461d.f2316a[m1651a] = c0463f.f2336e;
            } else {
                c0463f = this.f2297q[i15];
            }
            c0460c.f2315e = c0463f;
            if (c0480n.f2475e == 1) {
                r8 = 0;
                m1627b(m1663d, -1, false);
            } else {
                r8 = 0;
                m1627b(m1663d, 0, false);
            }
            if (this.f2300t == 1) {
                m1614x = RecyclerView.AbstractC0444m.m1614x(r8, this.f2301u, this.f2219l, r8, ((ViewGroup.MarginLayoutParams) c0460c).width);
                m1614x2 = RecyclerView.AbstractC0444m.m1614x(true, this.f2222o, this.f2220m, m1619F() + m1622I(), ((ViewGroup.MarginLayoutParams) c0460c).height);
            } else {
                m1614x = RecyclerView.AbstractC0444m.m1614x(true, this.f2221n, this.f2219l, m1621H() + m1620G(), ((ViewGroup.MarginLayoutParams) c0460c).width);
                m1614x2 = RecyclerView.AbstractC0444m.m1614x(false, this.f2301u, this.f2220m, 0, ((ViewGroup.MarginLayoutParams) c0460c).height);
            }
            Rect rect = this.f2291G;
            m1628d(m1663d, rect);
            C0460c c0460c2 = (C0460c) m1663d.getLayoutParams();
            int m1682d1 = m1682d1(m1614x, ((ViewGroup.MarginLayoutParams) c0460c2).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0460c2).rightMargin + rect.right);
            int m1682d12 = m1682d1(m1614x2, ((ViewGroup.MarginLayoutParams) c0460c2).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0460c2).bottomMargin + rect.bottom);
            if (m1642v0(m1663d, m1682d1, m1682d12, c0460c2)) {
                m1663d.measure(m1682d1, m1682d12);
            }
            if (c0480n.f2475e == 1) {
                mo1788c = c0463f.m1722f(mo1792g);
                m1724i = this.f2298r.mo1788c(m1663d) + mo1788c;
            } else {
                m1724i = c0463f.m1724i(mo1792g);
                mo1788c = m1724i - this.f2298r.mo1788c(m1663d);
            }
            int i18 = c0480n.f2475e;
            C0463f c0463f5 = c0460c.f2315e;
            c0463f5.getClass();
            if (i18 == 1) {
                C0460c c0460c3 = (C0460c) m1663d.getLayoutParams();
                c0460c3.f2315e = c0463f5;
                ArrayList<View> arrayList = c0463f5.f2332a;
                arrayList.add(m1663d);
                c0463f5.f2334c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0463f5.f2333b = Integer.MIN_VALUE;
                }
                if (c0460c3.m1653c() || c0460c3.m1652b()) {
                    c0463f5.f2335d = StaggeredGridLayoutManager.this.f2298r.mo1788c(m1663d) + c0463f5.f2335d;
                }
            } else {
                C0460c c0460c4 = (C0460c) m1663d.getLayoutParams();
                c0460c4.f2315e = c0463f5;
                ArrayList<View> arrayList2 = c0463f5.f2332a;
                arrayList2.add(0, m1663d);
                c0463f5.f2333b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0463f5.f2334c = Integer.MIN_VALUE;
                }
                if (c0460c4.m1653c() || c0460c4.m1652b()) {
                    c0463f5.f2335d = StaggeredGridLayoutManager.this.f2298r.mo1788c(m1663d) + c0463f5.f2335d;
                }
            }
            if (m1699R0() && this.f2300t == 1) {
                mo1788c2 = this.f2299s.mo1792g() - (((this.f2296p - 1) - c0463f.f2336e) * this.f2301u);
                mo1796k = mo1788c2 - this.f2299s.mo1788c(m1663d);
            } else {
                mo1796k = this.f2299s.mo1796k() + (c0463f.f2336e * this.f2301u);
                mo1788c2 = this.f2299s.mo1788c(m1663d) + mo1796k;
            }
            if (this.f2300t == 1) {
                int i19 = mo1796k;
                mo1796k = mo1788c;
                mo1788c = i19;
                int i20 = mo1788c2;
                mo1788c2 = m1724i;
                m1724i = i20;
            }
            RecyclerView.AbstractC0444m.m1612P(m1663d, mo1788c, mo1796k, m1724i, mo1788c2);
            m1710c1(c0463f, c0480n2.f2475e, i11);
            m1703V0(c0450s, c0480n2);
            if (c0480n2.f2478h && m1663d.hasFocusable()) {
                this.f2305y.set(c0463f.f2336e, false);
            }
            i10 = 1;
            z6 = true;
        }
        if (!z6) {
            m1703V0(c0450s, c0480n2);
        }
        int mo1796k3 = c0480n2.f2475e == -1 ? this.f2298r.mo1796k() - m1696O0(this.f2298r.mo1796k()) : m1695N0(this.f2298r.mo1792g()) - this.f2298r.mo1792g();
        if (mo1796k3 > 0) {
            return Math.min(c0480n.f2472b, mo1796k3);
        }
        return 0;
    }

    /* renamed from: H0 */
    public final View m1689H0(boolean z6) {
        int mo1796k = this.f2298r.mo1796k();
        int mo1792g = this.f2298r.mo1792g();
        View view = null;
        for (int m1643w = m1643w() - 1; m1643w >= 0; m1643w--) {
            View m1641v = m1641v(m1643w);
            int mo1790e = this.f2298r.mo1790e(m1641v);
            int mo1787b = this.f2298r.mo1787b(m1641v);
            if (mo1787b > mo1796k && mo1790e < mo1792g) {
                if (mo1787b <= mo1792g || !z6) {
                    return m1641v;
                }
                if (view == null) {
                    view = m1641v;
                }
            }
        }
        return view;
    }

    /* renamed from: I0 */
    public final View m1690I0(boolean z6) {
        int mo1796k = this.f2298r.mo1796k();
        int mo1792g = this.f2298r.mo1792g();
        int m1643w = m1643w();
        View view = null;
        for (int i7 = 0; i7 < m1643w; i7++) {
            View m1641v = m1641v(i7);
            int mo1790e = this.f2298r.mo1790e(m1641v);
            if (this.f2298r.mo1787b(m1641v) > mo1796k && mo1790e < mo1792g) {
                if (mo1790e >= mo1796k || !z6) {
                    return m1641v;
                }
                if (view == null) {
                    view = m1641v;
                }
            }
        }
        return view;
    }

    /* renamed from: J0 */
    public final void m1691J0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, boolean z6) {
        int mo1792g;
        int m1695N0 = m1695N0(Integer.MIN_VALUE);
        if (m1695N0 != Integer.MIN_VALUE && (mo1792g = this.f2298r.mo1792g() - m1695N0) > 0) {
            int i7 = mo1792g - (-m1707Z0(-mo1792g, c0450s, c0455x));
            if (!z6 || i7 <= 0) {
                return;
            }
            this.f2298r.mo1800o(i7);
        }
    }

    /* renamed from: K0 */
    public final void m1692K0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, boolean z6) {
        int mo1796k;
        int m1696O0 = m1696O0(Integer.MAX_VALUE);
        if (m1696O0 != Integer.MAX_VALUE && (mo1796k = m1696O0 - this.f2298r.mo1796k()) > 0) {
            int m1707Z0 = mo1796k - m1707Z0(mo1796k, c0450s, c0455x);
            if (!z6 || m1707Z0 <= 0) {
                return;
            }
            this.f2298r.mo1800o(-m1707Z0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: L */
    public final int mo1428L(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        return this.f2300t == 0 ? this.f2296p : super.mo1428L(c0450s, c0455x);
    }

    /* renamed from: L0 */
    public final int m1693L0() {
        if (m1643w() == 0) {
            return 0;
        }
        return RecyclerView.AbstractC0444m.m1609J(m1641v(0));
    }

    /* renamed from: M0 */
    public final int m1694M0() {
        int m1643w = m1643w();
        if (m1643w == 0) {
            return 0;
        }
        return RecyclerView.AbstractC0444m.m1609J(m1641v(m1643w - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: N */
    public final boolean mo1475N() {
        return this.f2287C != 0;
    }

    /* renamed from: N0 */
    public final int m1695N0(int i7) {
        int m1722f = this.f2297q[0].m1722f(i7);
        for (int i8 = 1; i8 < this.f2296p; i8++) {
            int m1722f2 = this.f2297q[i8].m1722f(i7);
            if (m1722f2 > m1722f) {
                m1722f = m1722f2;
            }
        }
        return m1722f;
    }

    /* renamed from: O0 */
    public final int m1696O0(int i7) {
        int m1724i = this.f2297q[0].m1724i(i7);
        for (int i8 = 1; i8 < this.f2296p; i8++) {
            int m1724i2 = this.f2297q[i8].m1724i(i7);
            if (m1724i2 < m1724i) {
                m1724i = m1724i2;
            }
        }
        return m1724i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1697P0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f2304x
            if (r0 == 0) goto L9
            int r0 = r7.m1694M0()
            goto Ld
        L9:
            int r0 = r7.m1693L0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.f2286B
            r4.m1713b(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.m1715d(r8, r5)
            r4.m1714c(r9, r5)
            goto L39
        L32:
            r4.m1715d(r8, r9)
            goto L39
        L36:
            r4.m1714c(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f2304x
            if (r8 == 0) goto L45
            int r8 = r7.m1693L0()
            goto L49
        L45:
            int r8 = r7.m1694M0()
        L49:
            if (r3 > r8) goto L4e
            r7.m1635m0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1697P0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: Q */
    public final void mo1624Q(int i7) {
        super.mo1624Q(i7);
        for (int i8 = 0; i8 < this.f2296p; i8++) {
            C0463f c0463f = this.f2297q[i8];
            int i9 = c0463f.f2333b;
            if (i9 != Integer.MIN_VALUE) {
                c0463f.f2333b = i9 + i7;
            }
            int i10 = c0463f.f2334c;
            if (i10 != Integer.MIN_VALUE) {
                c0463f.f2334c = i10 + i7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m1698Q0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1698Q0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: R */
    public final void mo1625R(int i7) {
        super.mo1625R(i7);
        for (int i8 = 0; i8 < this.f2296p; i8++) {
            C0463f c0463f = this.f2297q[i8];
            int i9 = c0463f.f2333b;
            if (i9 != Integer.MIN_VALUE) {
                c0463f.f2333b = i9 + i7;
            }
            int i10 = c0463f.f2334c;
            if (i10 != Integer.MIN_VALUE) {
                c0463f.f2334c = i10 + i7;
            }
        }
    }

    /* renamed from: R0 */
    public final boolean m1699R0() {
        return m1618E() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: S */
    public final void mo1480S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2209b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2295K);
        }
        for (int i7 = 0; i7 < this.f2296p; i7++) {
            this.f2297q[i7].m1718b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x03f6, code lost:
    
        if (m1684C0() != false) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1700S0(androidx.recyclerview.widget.RecyclerView.C0450s r17, androidx.recyclerview.widget.RecyclerView.C0455x r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1700S0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x004a, code lost:
    
        if (r8.f2300t == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004f, code lost:
    
        if (r8.f2300t == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x005e, code lost:
    
        if (m1699R0() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x006a, code lost:
    
        if (m1699R0() == false) goto L54;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo1430T(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0450s r11, androidx.recyclerview.widget.RecyclerView.C0455x r12) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1430T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* renamed from: T0 */
    public final boolean m1701T0(int i7) {
        if (this.f2300t == 0) {
            return (i7 == -1) != this.f2304x;
        }
        return ((i7 == -1) == this.f2304x) == m1699R0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: U */
    public final void mo1483U(AccessibilityEvent accessibilityEvent) {
        super.mo1483U(accessibilityEvent);
        if (m1643w() > 0) {
            View m1690I0 = m1690I0(false);
            View m1689H0 = m1689H0(false);
            if (m1690I0 == null || m1689H0 == null) {
                return;
            }
            int m1609J = RecyclerView.AbstractC0444m.m1609J(m1690I0);
            int m1609J2 = RecyclerView.AbstractC0444m.m1609J(m1689H0);
            if (m1609J < m1609J2) {
                accessibilityEvent.setFromIndex(m1609J);
                accessibilityEvent.setToIndex(m1609J2);
            } else {
                accessibilityEvent.setFromIndex(m1609J2);
                accessibilityEvent.setToIndex(m1609J);
            }
        }
    }

    /* renamed from: U0 */
    public final void m1702U0(int i7, RecyclerView.C0455x c0455x) {
        int m1693L0;
        int i8;
        if (i7 > 0) {
            m1693L0 = m1694M0();
            i8 = 1;
        } else {
            m1693L0 = m1693L0();
            i8 = -1;
        }
        C0480n c0480n = this.f2302v;
        c0480n.f2471a = true;
        m1709b1(m1693L0, c0455x);
        m1708a1(i8);
        c0480n.f2473c = m1693L0 + c0480n.f2474d;
        c0480n.f2472b = Math.abs(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r6.f2475e == (-1)) goto L11;
     */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1703V0(androidx.recyclerview.widget.RecyclerView.C0450s r5, androidx.recyclerview.widget.C0480n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2471a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2479i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2472b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2475e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2477g
        L15:
            r4.m1704W0(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f2476f
        L1b:
            r4.m1705X0(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f2475e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2476f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2297q
            r1 = r1[r2]
            int r1 = r1.m1724i(r0)
        L2f:
            int r2 = r4.f2296p
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2297q
            r2 = r2[r3]
            int r2 = r2.m1724i(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2477g
            int r6 = r6.f2472b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2477g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2297q
            r1 = r1[r2]
            int r1 = r1.m1722f(r0)
        L5a:
            int r2 = r4.f2296p
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2297q
            r2 = r2[r3]
            int r2 = r2.m1722f(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2477g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2476f
            int r6 = r6.f2472b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1703V0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: W */
    public final void mo1432W(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, View view, C1151g c1151g) {
        int i7;
        int i8;
        int i9;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0460c)) {
            m1626V(view, c1151g);
            return;
        }
        C0460c c0460c = (C0460c) layoutParams;
        if (this.f2300t == 0) {
            C0463f c0463f = c0460c.f2315e;
            i8 = c0463f == null ? -1 : c0463f.f2336e;
            i9 = 1;
            i7 = -1;
            i10 = -1;
        } else {
            C0463f c0463f2 = c0460c.f2315e;
            i7 = c0463f2 == null ? -1 : c0463f2.f2336e;
            i8 = -1;
            i9 = -1;
            i10 = 1;
        }
        c1151g.m3343h(C1151g.b.m3349a(i8, i9, i7, i10, false, false));
    }

    /* renamed from: W0 */
    public final void m1704W0(int i7, RecyclerView.C0450s c0450s) {
        for (int m1643w = m1643w() - 1; m1643w >= 0; m1643w--) {
            View m1641v = m1641v(m1643w);
            if (this.f2298r.mo1790e(m1641v) < i7 || this.f2298r.mo1799n(m1641v) < i7) {
                return;
            }
            C0460c c0460c = (C0460c) m1641v.getLayoutParams();
            c0460c.getClass();
            if (c0460c.f2315e.f2332a.size() == 1) {
                return;
            }
            C0463f c0463f = c0460c.f2315e;
            ArrayList<View> arrayList = c0463f.f2332a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            C0460c m1716h = C0463f.m1716h(remove);
            m1716h.f2315e = null;
            if (m1716h.m1653c() || m1716h.m1652b()) {
                c0463f.f2335d -= StaggeredGridLayoutManager.this.f2298r.mo1788c(remove);
            }
            if (size == 1) {
                c0463f.f2333b = Integer.MIN_VALUE;
            }
            c0463f.f2334c = Integer.MIN_VALUE;
            m1632j0(m1641v, c0450s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: X */
    public final void mo1434X(int i7, int i8) {
        m1697P0(i7, i8, 1);
    }

    /* renamed from: X0 */
    public final void m1705X0(int i7, RecyclerView.C0450s c0450s) {
        while (m1643w() > 0) {
            View m1641v = m1641v(0);
            if (this.f2298r.mo1787b(m1641v) > i7 || this.f2298r.mo1798m(m1641v) > i7) {
                return;
            }
            C0460c c0460c = (C0460c) m1641v.getLayoutParams();
            c0460c.getClass();
            if (c0460c.f2315e.f2332a.size() == 1) {
                return;
            }
            C0463f c0463f = c0460c.f2315e;
            ArrayList<View> arrayList = c0463f.f2332a;
            View remove = arrayList.remove(0);
            C0460c m1716h = C0463f.m1716h(remove);
            m1716h.f2315e = null;
            if (arrayList.size() == 0) {
                c0463f.f2334c = Integer.MIN_VALUE;
            }
            if (m1716h.m1653c() || m1716h.m1652b()) {
                c0463f.f2335d -= StaggeredGridLayoutManager.this.f2298r.mo1788c(remove);
            }
            c0463f.f2333b = Integer.MIN_VALUE;
            m1632j0(m1641v, c0450s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: Y */
    public final void mo1435Y() {
        C0461d c0461d = this.f2286B;
        int[] iArr = c0461d.f2316a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0461d.f2317b = null;
        m1635m0();
    }

    /* renamed from: Y0 */
    public final void m1706Y0() {
        this.f2304x = (this.f2300t == 1 || !m1699R0()) ? this.f2303w : !this.f2303w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: Z */
    public final void mo1436Z(int i7, int i8) {
        m1697P0(i7, i8, 8);
    }

    /* renamed from: Z0 */
    public final int m1707Z0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (m1643w() == 0 || i7 == 0) {
            return 0;
        }
        m1702U0(i7, c0455x);
        C0480n c0480n = this.f2302v;
        int m1688G0 = m1688G0(c0450s, c0480n, c0455x);
        if (c0480n.f2472b >= m1688G0) {
            i7 = i7 < 0 ? -m1688G0 : m1688G0;
        }
        this.f2298r.mo1800o(-i7);
        this.f2288D = this.f2304x;
        c0480n.f2472b = 0;
        m1703V0(c0450s, c0480n);
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0454w.b
    /* renamed from: a */
    public final PointF mo1488a(int i7) {
        int m1683B0 = m1683B0(i7);
        PointF pointF = new PointF();
        if (m1683B0 == 0) {
            return null;
        }
        if (this.f2300t == 0) {
            pointF.x = m1683B0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m1683B0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: a0 */
    public final void mo1437a0(int i7, int i8) {
        m1697P0(i7, i8, 2);
    }

    /* renamed from: a1 */
    public final void m1708a1(int i7) {
        C0480n c0480n = this.f2302v;
        c0480n.f2475e = i7;
        c0480n.f2474d = this.f2304x != (i7 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: b0 */
    public final void mo1438b0(int i7, int i8) {
        m1697P0(i7, i8, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1709b1(int r5, androidx.recyclerview.widget.RecyclerView.C0455x r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.f2302v
            r1 = 0
            r0.f2472b = r1
            r0.f2473c = r5
            androidx.recyclerview.widget.RecyclerView$w r2 = r4.f2212e
            r3 = 1
            if (r2 == 0) goto L12
            boolean r2 = r2.f2253e
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L33
            int r6 = r6.f2264a
            r2 = -1
            if (r6 == r2) goto L33
            boolean r2 = r4.f2304x
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r2 != r5) goto L2a
            androidx.recyclerview.widget.s r5 = r4.f2298r
            int r5 = r5.mo1797l()
            goto L34
        L2a:
            androidx.recyclerview.widget.s r5 = r4.f2298r
            int r5 = r5.mo1797l()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f2209b
            if (r2 == 0) goto L3f
            boolean r2 = r2.f2171y1
            if (r2 == 0) goto L3f
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L55
            androidx.recyclerview.widget.s r2 = r4.f2298r
            int r2 = r2.mo1796k()
            int r2 = r2 - r6
            r0.f2476f = r2
            androidx.recyclerview.widget.s r6 = r4.f2298r
            int r6 = r6.mo1792g()
            int r6 = r6 + r5
            r0.f2477g = r6
            goto L61
        L55:
            androidx.recyclerview.widget.s r2 = r4.f2298r
            int r2 = r2.mo1791f()
            int r2 = r2 + r5
            r0.f2477g = r2
            int r5 = -r6
            r0.f2476f = r5
        L61:
            r0.f2478h = r1
            r0.f2471a = r3
            androidx.recyclerview.widget.s r5 = r4.f2298r
            int r5 = r5.mo1794i()
            if (r5 != 0) goto L76
            androidx.recyclerview.widget.s r5 = r4.f2298r
            int r5 = r5.mo1791f()
            if (r5 != 0) goto L76
            r1 = 1
        L76:
            r0.f2479i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1709b1(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c */
    public final void mo1491c(String str) {
        if (this.f2290F == null) {
            super.mo1491c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c0 */
    public final void mo1439c0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        m1700S0(c0450s, c0455x, true);
    }

    /* renamed from: c1 */
    public final void m1710c1(C0463f c0463f, int i7, int i8) {
        int i9 = c0463f.f2335d;
        if (i7 == -1) {
            int i10 = c0463f.f2333b;
            if (i10 == Integer.MIN_VALUE) {
                View view = c0463f.f2332a.get(0);
                C0460c m1716h = C0463f.m1716h(view);
                c0463f.f2333b = StaggeredGridLayoutManager.this.f2298r.mo1790e(view);
                m1716h.getClass();
                i10 = c0463f.f2333b;
            }
            if (i10 + i9 > i8) {
                return;
            }
        } else {
            int i11 = c0463f.f2334c;
            if (i11 == Integer.MIN_VALUE) {
                c0463f.m1717a();
                i11 = c0463f.f2334c;
            }
            if (i11 - i9 < i8) {
                return;
            }
        }
        this.f2305y.set(c0463f.f2336e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: d0 */
    public final void mo1441d0(RecyclerView.C0455x c0455x) {
        this.f2306z = -1;
        this.f2285A = Integer.MIN_VALUE;
        this.f2290F = null;
        this.f2292H.m1711a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: e */
    public final boolean mo1493e() {
        return this.f2300t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: e0 */
    public final void mo1494e0(Parcelable parcelable) {
        if (parcelable instanceof C0462e) {
            this.f2290F = (C0462e) parcelable;
            m1635m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: f */
    public final boolean mo1496f() {
        return this.f2300t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: f0 */
    public final Parcelable mo1497f0() {
        int m1724i;
        int mo1796k;
        int[] iArr;
        C0462e c0462e = this.f2290F;
        if (c0462e != null) {
            return new C0462e(c0462e);
        }
        C0462e c0462e2 = new C0462e();
        c0462e2.f2329w1 = this.f2303w;
        c0462e2.f2330x1 = this.f2288D;
        c0462e2.f2331y1 = this.f2289E;
        C0461d c0461d = this.f2286B;
        if (c0461d == null || (iArr = c0461d.f2316a) == null) {
            c0462e2.f2322X = 0;
        } else {
            c0462e2.f2323Y = iArr;
            c0462e2.f2322X = iArr.length;
            c0462e2.f2324Z = c0461d.f2317b;
        }
        if (m1643w() > 0) {
            c0462e2.f2325c = this.f2288D ? m1694M0() : m1693L0();
            View m1689H0 = this.f2304x ? m1689H0(true) : m1690I0(true);
            c0462e2.f2326e = m1689H0 != null ? RecyclerView.AbstractC0444m.m1609J(m1689H0) : -1;
            int i7 = this.f2296p;
            c0462e2.f2327m = i7;
            c0462e2.f2328s = new int[i7];
            for (int i8 = 0; i8 < this.f2296p; i8++) {
                if (this.f2288D) {
                    m1724i = this.f2297q[i8].m1722f(Integer.MIN_VALUE);
                    if (m1724i != Integer.MIN_VALUE) {
                        mo1796k = this.f2298r.mo1792g();
                        m1724i -= mo1796k;
                        c0462e2.f2328s[i8] = m1724i;
                    } else {
                        c0462e2.f2328s[i8] = m1724i;
                    }
                } else {
                    m1724i = this.f2297q[i8].m1724i(Integer.MIN_VALUE);
                    if (m1724i != Integer.MIN_VALUE) {
                        mo1796k = this.f2298r.mo1796k();
                        m1724i -= mo1796k;
                        c0462e2.f2328s[i8] = m1724i;
                    } else {
                        c0462e2.f2328s[i8] = m1724i;
                    }
                }
            }
        } else {
            c0462e2.f2325c = -1;
            c0462e2.f2326e = -1;
            c0462e2.f2327m = 0;
        }
        return c0462e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: g */
    public final boolean mo1442g(RecyclerView.C0445n c0445n) {
        return c0445n instanceof C0460c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: g0 */
    public final void mo1629g0(int i7) {
        if (i7 == 0) {
            m1684C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: i */
    public final void mo1499i(int i7, int i8, RecyclerView.C0455x c0455x, RecyclerView.AbstractC0444m.c cVar) {
        C0480n c0480n;
        int m1722f;
        int i9;
        if (this.f2300t != 0) {
            i7 = i8;
        }
        if (m1643w() == 0 || i7 == 0) {
            return;
        }
        m1702U0(i7, c0455x);
        int[] iArr = this.f2294J;
        if (iArr == null || iArr.length < this.f2296p) {
            this.f2294J = new int[this.f2296p];
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f2296p;
            c0480n = this.f2302v;
            if (i10 >= i12) {
                break;
            }
            if (c0480n.f2474d == -1) {
                m1722f = c0480n.f2476f;
                i9 = this.f2297q[i10].m1724i(m1722f);
            } else {
                m1722f = this.f2297q[i10].m1722f(c0480n.f2477g);
                i9 = c0480n.f2477g;
            }
            int i13 = m1722f - i9;
            if (i13 >= 0) {
                this.f2294J[i11] = i13;
                i11++;
            }
            i10++;
        }
        Arrays.sort(this.f2294J, 0, i11);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = c0480n.f2473c;
            if (!(i15 >= 0 && i15 < c0455x.m1679b())) {
                return;
            }
            ((RunnableC0479m.b) cVar).m1780a(c0480n.f2473c, this.f2294J[i14]);
            c0480n.f2473c += c0480n.f2474d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: k */
    public final int mo1501k(RecyclerView.C0455x c0455x) {
        return m1685D0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: l */
    public final int mo1448l(RecyclerView.C0455x c0455x) {
        return m1686E0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: m */
    public final int mo1450m(RecyclerView.C0455x c0455x) {
        return m1687F0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n */
    public final int mo1502n(RecyclerView.C0455x c0455x) {
        return m1685D0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n0 */
    public final int mo1452n0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        return m1707Z0(i7, c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o */
    public final int mo1454o(RecyclerView.C0455x c0455x) {
        return m1686E0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o0 */
    public final void mo1503o0(int i7) {
        C0462e c0462e = this.f2290F;
        if (c0462e != null && c0462e.f2325c != i7) {
            c0462e.f2328s = null;
            c0462e.f2327m = 0;
            c0462e.f2325c = -1;
            c0462e.f2326e = -1;
        }
        this.f2306z = i7;
        this.f2285A = Integer.MIN_VALUE;
        m1635m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p */
    public final int mo1455p(RecyclerView.C0455x c0455x) {
        return m1687F0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p0 */
    public final int mo1456p0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        return m1707Z0(i7, c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s */
    public final RecyclerView.C0445n mo1457s() {
        return this.f2300t == 0 ? new C0460c(-2, -1) : new C0460c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s0 */
    public final void mo1458s0(Rect rect, int i7, int i8) {
        int m1613h;
        int m1613h2;
        int m1621H = m1621H() + m1620G();
        int m1619F = m1619F() + m1622I();
        if (this.f2300t == 1) {
            int height = rect.height() + m1619F;
            RecyclerView recyclerView = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            m1613h2 = RecyclerView.AbstractC0444m.m1613h(i8, height, C0946x.d.m2828d(recyclerView));
            m1613h = RecyclerView.AbstractC0444m.m1613h(i7, (this.f2301u * this.f2296p) + m1621H, C0946x.d.m2829e(this.f2209b));
        } else {
            int width = rect.width() + m1621H;
            RecyclerView recyclerView2 = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            m1613h = RecyclerView.AbstractC0444m.m1613h(i7, width, C0946x.d.m2829e(recyclerView2));
            m1613h2 = RecyclerView.AbstractC0444m.m1613h(i8, (this.f2301u * this.f2296p) + m1619F, C0946x.d.m2828d(this.f2209b));
        }
        this.f2209b.setMeasuredDimension(m1613h, m1613h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: t */
    public final RecyclerView.C0445n mo1459t(Context context, AttributeSet attributeSet) {
        return new C0460c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: u */
    public final RecyclerView.C0445n mo1460u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0460c((ViewGroup.MarginLayoutParams) layoutParams) : new C0460c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: y */
    public final int mo1461y(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        return this.f2300t == 1 ? this.f2296p : super.mo1461y(c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: y0 */
    public final void mo1506y0(RecyclerView recyclerView, int i7) {
        C0481o c0481o = new C0481o(recyclerView.getContext());
        c0481o.f2249a = i7;
        m1645z0(c0481o);
    }
}
