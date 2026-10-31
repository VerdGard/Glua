package p047f5;

import android.ext.C0090b;
import android.ext.DaemonManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class C1171b {

    /* renamed from: h */
    public int f5744h;

    /* renamed from: i */
    public a f5745i;

    /* renamed from: j */
    public int f5746j;

    /* renamed from: k */
    public int f5747k;

    /* renamed from: a */
    public final ReentrantLock f5737a = new ReentrantLock();

    /* renamed from: c */
    public final ArrayList f5739c = new ArrayList();

    /* renamed from: b */
    public final int f5738b = DaemonManager.TIME_JUMP_MUL_INT;

    /* renamed from: e */
    public int f5741e = 0;

    /* renamed from: f */
    public int f5742f = 0;

    /* renamed from: g */
    public a f5743g = new a();

    /* renamed from: d */
    public final C1170a f5740d = new C1170a(10);

    /* renamed from: f5.b$a */
    public class a {

        /* renamed from: a */
        public final int[] f5748a;

        /* renamed from: b */
        public int f5749b = 0;

        /* renamed from: c */
        public int f5750c;

        /* renamed from: d */
        public a f5751d;

        public a() {
            this.f5748a = new int[C1171b.this.f5738b + 5];
        }
    }

    /* renamed from: f5.b$b */
    public class b {

        /* renamed from: a */
        public a f5753a;

        /* renamed from: b */
        public int f5754b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m3362a(int i7, int i8) {
        int i9;
        a aVar;
        if (i7 < 0 || i7 > this.f5741e) {
            StringBuilder m221g = C0090b.m221g("index = ", i7, ", length = ");
            m221g.append(this.f5741e);
            throw new ArrayIndexOutOfBoundsException(m221g.toString());
        }
        m3363b(i7);
        int i10 = 0;
        while (true) {
            C1170a c1170a = this.f5740d;
            if (i10 >= c1170a.size()) {
                break;
            }
            if (((b) c1170a.get(i10)).f5754b >= i7) {
                c1170a.remove(i10);
                i10--;
            }
            i10++;
        }
        a aVar2 = this.f5745i;
        int i11 = this.f5744h;
        while (true) {
            i9 = aVar2.f5749b;
            if (i11 <= i9 || (aVar = aVar2.f5751d) == null) {
                break;
            }
            i11 -= i9;
            aVar2 = aVar;
        }
        int[] iArr = aVar2.f5748a;
        System.arraycopy(iArr, i11, iArr, i11 + 1, i9 - i11);
        iArr[i11] = i8;
        int i12 = aVar2.f5749b + 1;
        aVar2.f5749b = i12;
        if (i8 > aVar2.f5750c) {
            aVar2.f5750c = i8;
        }
        this.f5741e++;
        if (i12 > this.f5738b) {
            a aVar3 = aVar2.f5751d;
            C1171b c1171b = C1171b.this;
            ArrayList arrayList = c1171b.f5739c;
            a aVar4 = arrayList.isEmpty() ? c1171b.new a() : (a) arrayList.remove(arrayList.size() - 1);
            int i13 = (c1171b.f5738b * 3) / 4;
            System.arraycopy(iArr, i13, aVar4.f5748a, 0, aVar2.f5749b - i13);
            aVar4.f5749b = aVar2.f5749b - i13;
            aVar2.f5749b = i13;
            aVar2.f5751d = aVar4;
            aVar4.f5751d = aVar3;
        }
        this.f5742f++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m3363b(int i7) {
        C1170a c1170a;
        a aVar;
        int i8;
        a aVar2 = this.f5743g;
        int i9 = 0;
        int i10 = i7;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            c1170a = this.f5740d;
            if (i11 >= c1170a.size()) {
                break;
            }
            b bVar = (b) c1170a.get(i11);
            int i13 = bVar.f5754b;
            if (i13 < i7 && (i8 = i7 - i13) < i10) {
                aVar2 = bVar.f5753a;
                i12 = i11;
                i10 = i8;
            }
            i11++;
        }
        if (i12 != -1) {
            Collections.swap(c1170a, 0, i12);
        }
        while (true) {
            int i14 = aVar2.f5749b;
            if (i10 < i14 || (aVar = aVar2.f5751d) == null) {
                break;
            }
            i10 -= i14;
            i9++;
            aVar2 = aVar;
        }
        if (i9 >= 30) {
            b bVar2 = new b();
            bVar2.f5754b = i7 - i10;
            bVar2.f5753a = aVar2;
            c1170a.add(bVar2);
        }
        if (c1170a.size() > 8) {
            c1170a.remove(c1170a.size() - 1);
        }
        this.f5744h = i10;
        this.f5745i = aVar2;
    }

    /* renamed from: c */
    public final int m3364c(int i7) {
        if (i7 < 0 || i7 >= this.f5741e) {
            StringBuilder m221g = C0090b.m221g("index = ", i7, ", length = ");
            m221g.append(this.f5741e);
            throw new ArrayIndexOutOfBoundsException(m221g.toString());
        }
        m3363b(i7);
        a aVar = this.f5745i;
        return aVar.f5748a[this.f5744h];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5 > r0) goto L14;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3365d(int r4, int r5) {
        /*
            r3 = this;
            if (r4 < 0) goto L3b
            int r0 = r3.f5741e
            if (r4 >= r0) goto L3b
            r3.m3363b(r4)
            f5.b$a r4 = r3.f5745i
            int r0 = r3.f5744h
            int[] r1 = r4.f5748a
            r2 = r1[r0]
            r1[r0] = r5
            int r0 = r4.f5750c
            if (r2 != r0) goto L30
            if (r5 < r2) goto L1a
            goto L32
        L1a:
            r5 = 0
            r4.f5750c = r5
        L1d:
            int r0 = r4.f5749b
            if (r5 >= r0) goto L34
            int r0 = r4.f5750c
            int[] r1 = r4.f5748a
            r1 = r1[r5]
            int r0 = java.lang.Math.max(r0, r1)
            r4.f5750c = r0
            int r5 = r5 + 1
            goto L1d
        L30:
            if (r5 <= r0) goto L34
        L32:
            r4.f5750c = r5
        L34:
            int r4 = r3.f5742f
            int r4 = r4 + 1
            r3.f5742f = r4
            return
        L3b:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = "index = "
            java.lang.String r1 = ", length = "
            java.lang.StringBuilder r4 = android.ext.C0090b.m221g(r0, r4, r1)
            int r0 = r3.f5741e
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p047f5.C1171b.m3365d(int, int):void");
    }
}
