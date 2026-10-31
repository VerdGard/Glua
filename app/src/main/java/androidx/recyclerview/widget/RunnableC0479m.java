package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p001a0.C0013l;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public final class RunnableC0479m implements Runnable {

    /* renamed from: X */
    public static final ThreadLocal<RunnableC0479m> f2456X = new ThreadLocal<>();

    /* renamed from: Y */
    public static final a f2457Y = new a();

    /* renamed from: e */
    public long f2459e;

    /* renamed from: m */
    public long f2460m;

    /* renamed from: c */
    public final ArrayList<RecyclerView> f2458c = new ArrayList<>();

    /* renamed from: s */
    public final ArrayList<c> f2461s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.m$a */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        
            if (r0 != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L18;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.RunnableC0479m.c r7, androidx.recyclerview.widget.RunnableC0479m.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.RunnableC0479m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.RunnableC0479m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2469d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2469d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.f2466a
                boolean r3 = r8.f2466a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f2467b
                int r1 = r7.f2467b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f2468c
                int r8 = r8.f2468c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RunnableC0479m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.m$b */
    public static class b implements RecyclerView.AbstractC0444m.c {

        /* renamed from: a */
        public int f2462a;

        /* renamed from: b */
        public int f2463b;

        /* renamed from: c */
        public int[] f2464c;

        /* renamed from: d */
        public int f2465d;

        /* renamed from: a */
        public final void m1780a(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i9 = this.f2465d * 2;
            int[] iArr = this.f2464c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2464c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i9 >= iArr.length) {
                int[] iArr3 = new int[i9 * 2];
                this.f2464c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2464c;
            iArr4[i9] = i7;
            iArr4[i9 + 1] = i8;
            this.f2465d++;
        }

        /* renamed from: b */
        public final void m1781b(RecyclerView recyclerView, boolean z6) {
            this.f2465d = 0;
            int[] iArr = this.f2464c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0444m abstractC0444m = recyclerView.f2114E1;
            if (recyclerView.f2112D1 == null || abstractC0444m == null || !abstractC0444m.f2216i) {
                return;
            }
            if (!z6) {
                if (!(!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g())) {
                    abstractC0444m.mo1499i(this.f2462a, this.f2463b, recyclerView.f2164t2, this);
                }
            } else if (!recyclerView.f2162s.m1731g()) {
                abstractC0444m.mo1500j(recyclerView.f2112D1.mo1583a(), this);
            }
            int i7 = this.f2465d;
            if (i7 > abstractC0444m.f2217j) {
                abstractC0444m.f2217j = i7;
                abstractC0444m.f2218k = z6;
                recyclerView.f2146e.m1671l();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    public static class c {

        /* renamed from: a */
        public boolean f2466a;

        /* renamed from: b */
        public int f2467b;

        /* renamed from: c */
        public int f2468c;

        /* renamed from: d */
        public RecyclerView f2469d;

        /* renamed from: e */
        public int f2470e;
    }

    /* renamed from: c */
    public static RecyclerView.AbstractC0432a0 m1777c(RecyclerView recyclerView, int i7, long j7) {
        boolean z6;
        int m1747h = recyclerView.f2167w1.m1747h();
        int i8 = 0;
        while (true) {
            if (i8 >= m1747h) {
                z6 = false;
                break;
            }
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(recyclerView.f2167w1.m1746g(i8));
            if (m1513I.f2179c == i7 && !m1513I.m1573g()) {
                z6 = true;
                break;
            }
            i8++;
        }
        if (z6) {
            return null;
        }
        RecyclerView.C0450s c0450s = recyclerView.f2146e;
        try {
            recyclerView.m1531O();
            RecyclerView.AbstractC0432a0 m1669j = c0450s.m1669j(i7, j7);
            if (m1669j != null) {
                if (!m1669j.m1572f() || m1669j.m1573g()) {
                    c0450s.m1660a(m1669j, false);
                } else {
                    c0450s.m1666g(m1669j.f2177a);
                }
            }
            return m1669j;
        } finally {
            recyclerView.m1532P(false);
        }
    }

    /* renamed from: a */
    public final void m1778a(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f2459e == 0) {
            this.f2459e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f2163s2;
        bVar.f2462a = i7;
        bVar.f2463b = i8;
    }

    /* renamed from: b */
    public final void m1779b(long j7) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f2458c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView3 = arrayList.get(i8);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f2163s2;
                bVar.m1781b(recyclerView3, false);
                i7 += bVar.f2465d;
            }
        }
        ArrayList<c> arrayList2 = this.f2461s;
        arrayList2.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView4 = arrayList.get(i10);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f2163s2;
                int abs = Math.abs(bVar2.f2463b) + Math.abs(bVar2.f2462a);
                for (int i11 = 0; i11 < bVar2.f2465d * 2; i11 += 2) {
                    if (i9 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i9);
                    }
                    int[] iArr = bVar2.f2464c;
                    int i12 = iArr[i11 + 1];
                    cVar2.f2466a = i12 <= abs;
                    cVar2.f2467b = abs;
                    cVar2.f2468c = i12;
                    cVar2.f2469d = recyclerView4;
                    cVar2.f2470e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(arrayList2, f2457Y);
        for (int i13 = 0; i13 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i13)).f2469d) != null; i13++) {
            RecyclerView.AbstractC0432a0 m1777c = m1777c(recyclerView, cVar.f2470e, cVar.f2466a ? Long.MAX_VALUE : j7);
            if (m1777c != null && m1777c.f2178b != null && m1777c.m1572f() && !m1777c.m1573g() && (recyclerView2 = m1777c.f2178b.get()) != null) {
                if (recyclerView2.f2133S1 && recyclerView2.f2167w1.m1747h() != 0) {
                    RecyclerView.AbstractC0441j abstractC0441j = recyclerView2.f2142b2;
                    if (abstractC0441j != null) {
                        abstractC0441j.mo1601e();
                    }
                    RecyclerView.AbstractC0444m abstractC0444m = recyclerView2.f2114E1;
                    RecyclerView.C0450s c0450s = recyclerView2.f2146e;
                    if (abstractC0444m != null) {
                        abstractC0444m.m1630h0(c0450s);
                        recyclerView2.f2114E1.m1631i0(c0450s);
                    }
                    c0450s.f2239a.clear();
                    c0450s.m1664e();
                }
                b bVar3 = recyclerView2.f2163s2;
                bVar3.m1781b(recyclerView2, true);
                if (bVar3.f2465d != 0) {
                    try {
                        int i14 = C0013l.f12a;
                        C0013l.a.m60a("RV Nested Prefetch");
                        RecyclerView.C0455x c0455x = recyclerView2.f2164t2;
                        RecyclerView.AbstractC0436e abstractC0436e = recyclerView2.f2112D1;
                        c0455x.f2267d = 1;
                        c0455x.f2268e = abstractC0436e.mo1583a();
                        c0455x.f2270g = false;
                        c0455x.f2271h = false;
                        c0455x.f2272i = false;
                        for (int i15 = 0; i15 < bVar3.f2465d * 2; i15 += 2) {
                            m1777c(recyclerView2, bVar3.f2464c[i15], j7);
                        }
                        C0013l.a.m61b();
                        cVar.f2466a = false;
                        cVar.f2467b = 0;
                        cVar.f2468c = 0;
                        cVar.f2469d = null;
                        cVar.f2470e = 0;
                    } catch (Throwable th) {
                        int i16 = C0013l.f12a;
                        C0013l.a.m61b();
                        throw th;
                    }
                }
            }
            cVar.f2466a = false;
            cVar.f2467b = 0;
            cVar.f2468c = 0;
            cVar.f2469d = null;
            cVar.f2470e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = C0013l.f12a;
            C0013l.a.m60a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f2458c;
            if (arrayList.isEmpty()) {
                this.f2459e = 0L;
                C0013l.a.m61b();
                return;
            }
            int size = arrayList.size();
            long j7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    j7 = Math.max(recyclerView.getDrawingTime(), j7);
                }
            }
            if (j7 == 0) {
                this.f2459e = 0L;
                C0013l.a.m61b();
            } else {
                m1779b(TimeUnit.MILLISECONDS.toNanos(j7) + this.f2460m);
                this.f2459e = 0L;
                C0013l.a.m61b();
            }
        } catch (Throwable th) {
            this.f2459e = 0L;
            int i9 = C0013l.f12a;
            C0013l.a.m61b();
            throw th;
        }
    }
}
