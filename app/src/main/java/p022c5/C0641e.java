package p022c5;

import android.ext.C0090b;
import android.ext.DaemonManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p022c5.C0653q;
import p031d5.C0891b;
import p031d5.C0892c;

/* renamed from: c5.e */
/* loaded from: classes.dex */
public final class C0641e implements CharSequence {

    /* renamed from: X */
    public int f3148X;

    /* renamed from: Y */
    public final AtomicLong f3149Y;

    /* renamed from: Z */
    public final C0637a f3150Z;

    /* renamed from: c */
    public final ArrayList f3151c;

    /* renamed from: e */
    public final ArrayList f3152e;

    /* renamed from: m */
    public final ReentrantReadWriteLock f3153m;

    /* renamed from: s */
    public int f3154s;

    /* renamed from: w1 */
    public final C0891b f3155w1;

    /* renamed from: x1 */
    public final C0653q f3156x1;

    /* renamed from: y1 */
    public C0645i f3157y1;

    /* renamed from: c5.e$a */
    public interface a {

        /* renamed from: c5.e$a$a, reason: collision with other inner class name */
        public static class C2292a {

            /* renamed from: a */
            public boolean f3158a = false;
        }

        /* renamed from: a */
        void mo2155a(int i7, C0642f c0642f, C2292a c2292a);
    }

    /* renamed from: c5.e$b */
    public interface b {
        /* renamed from: a */
        void mo2156a(int i7, C0642f c0642f, C0892c c0892c);
    }

    public C0641e() {
        this(null, true);
    }

    /* renamed from: A */
    public final C0642f m2117A(int i7) {
        C0642f c0642f = (C0642f) this.f3151c.get(i7);
        c0642f.getClass();
        return c0642f;
    }

    /* renamed from: B */
    public final void m2118B(int i7, int i8, CharSequence charSequence) {
        C0638b m2110o = ((C0637a) m2145q()).m2110o(i7);
        C0638b m2110o2 = ((C0637a) m2145q()).m2110o(i8);
        m2119C(m2110o.f3141b, m2110o.f3142c, charSequence, m2110o2.f3141b, m2110o2.f3142c);
    }

    /* renamed from: C */
    public final void m2119C(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        if (charSequence == null) {
            throw new IllegalArgumentException("text can not be null");
        }
        m2154z(true);
        this.f3149Y.getAndIncrement();
        try {
            m2139k();
            m2137i(i7, i8, i9, i10);
            m2152x(i7, i8, charSequence);
        } finally {
            m2128L(true);
        }
    }

    /* renamed from: D */
    public final void m2120D(int i7, int i8, a aVar) {
        m2154z(false);
        try {
            a.C2292a c2292a = new a.C2292a();
            while (i7 <= i8) {
                if (c2292a.f3158a) {
                    break;
                }
                aVar.mo2155a(i7, (C0642f) this.f3151c.get(i7), c2292a);
                i7++;
            }
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: E */
    public final void m2121E(int i7, b bVar) {
        m2154z(false);
        for (int i8 = 0; i8 <= i7; i8++) {
            try {
                bVar.mo2156a(i8, (C0642f) this.f3151c.get(i8), this.f3155w1.m2596b(i8));
            } finally {
                m2128L(false);
            }
        }
    }

    /* renamed from: F */
    public final void m2122F(boolean z6) {
        C0653q c0653q = this.f3156x1;
        c0653q.f3196e = z6;
        if (z6) {
            return;
        }
        c0653q.m2172B();
    }

    /* renamed from: G */
    public final C0641e m2123G(int i7, int i8, int i9, int i10) {
        m2154z(false);
        try {
            return m2124H(i7, i8, i9, i10);
        } finally {
            m2128L(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[LOOP:0: B:22:0x009c->B:23:0x009e, LOOP_END] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p022c5.C0641e m2124H(int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022c5.C0641e.m2124H(int, int, int, int):c5.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[LOOP:0: B:23:0x0062->B:25:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[EDGE_INSN: B:26:0x0079->B:27:0x0079 BREAK  A[LOOP:0: B:23:0x0062->B:25:0x006b], SYNTHETIC] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StringBuilder m2125I(int r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            java.util.ArrayList r9 = r4.f3151c
            if (r5 != r7) goto L37
            java.lang.Object r7 = r9.get(r5)
            c5.f r7 = (p022c5.C0642f) r7
            int r1 = r7.f3160e
            int r1 = r1 + 1
            if (r8 != r1) goto L2d
            c5.m r1 = r7.m2160d()
            c5.m r2 = p022c5.EnumC0649m.CRLF
            if (r1 != r2) goto L2d
            if (r6 >= r8) goto L9b
            java.lang.Object r5 = r9.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r7 = r7.f3160e
            r0.append(r5, r6, r7)
        L2a:
            c5.m r5 = p022c5.EnumC0649m.CR
            goto L92
        L2d:
            java.lang.Object r5 = r9.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5, r6, r8)
            goto L9b
        L37:
            if (r5 >= r7) goto L9c
            java.lang.Object r1 = r9.get(r5)
            c5.f r1 = (p022c5.C0642f) r1
            c5.m r2 = r1.m2160d()
            c5.m r3 = p022c5.EnumC0649m.CRLF
            if (r2 != r3) goto L59
            int r2 = r1.f3160e
            if (r6 > r2) goto L4c
            goto L5b
        L4c:
            int r2 = r2 + 1
            if (r6 != r2) goto L53
            c5.m r6 = p022c5.EnumC0649m.LF
            goto L62
        L53:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
        L59:
            int r2 = r1.f3160e
        L5b:
            r0.append(r1, r6, r2)
            c5.m r6 = r1.m2160d()
        L62:
            java.lang.String r6 = r6.f3181c
            r0.append(r6)
            int r5 = r5 + 1
            if (r5 >= r7) goto L79
            java.lang.Object r6 = r9.get(r5)
            c5.f r6 = (p022c5.C0642f) r6
            r0.append(r6)
            c5.m r6 = r6.m2160d()
            goto L62
        L79:
            java.lang.Object r5 = r9.get(r7)
            c5.f r5 = (p022c5.C0642f) r5
            int r6 = r5.f3160e
            int r6 = r6 + 1
            r7 = 0
            if (r8 != r6) goto L98
            c5.m r6 = r5.m2160d()
            c5.m r9 = p022c5.EnumC0649m.CRLF
            if (r6 != r9) goto L98
            r0.append(r5, r7, r8)
            goto L2a
        L92:
            java.lang.String r5 = r5.f3181c
            r0.append(r5)
            goto L9b
        L98:
            r0.append(r5, r7, r8)
        L9b:
            return r0
        L9c:
            java.lang.StringIndexOutOfBoundsException r5 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r6 = "start > end"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p022c5.C0641e.m2125I(int, int, int, int, int):java.lang.StringBuilder");
    }

    /* renamed from: J */
    public final String m2126J(int i7, int i8) {
        if (i7 > i8) {
            throw new StringIndexOutOfBoundsException("start > end");
        }
        m2154z(false);
        try {
            C0638b m2110o = ((C0637a) m2145q()).m2110o(i7);
            C0638b m2110o2 = ((C0637a) m2145q()).m2110o(i8);
            return m2125I(m2110o.f3141b, m2110o.f3142c, m2110o2.f3141b, m2110o2.f3142c, (i8 - i7) + 1).toString();
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: K */
    public final StringBuilder m2127K() {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(sb.length() + this.f3154s);
        m2154z(false);
        try {
            int m2147s = m2147s();
            for (int i7 = 0; i7 < m2147s; i7++) {
                C0642f c0642f = (C0642f) this.f3151c.get(i7);
                sb.append(c0642f.f3159c, 0, c0642f.f3160e);
                sb.append(c0642f.m2160d().f3181c);
            }
            return sb;
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: L */
    public final void m2128L(boolean z6) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f3153m;
        if (reentrantReadWriteLock == null) {
            return;
        }
        (z6 ? reentrantReadWriteLock.writeLock() : reentrantReadWriteLock.readLock()).unlock();
    }

    /* renamed from: a */
    public final void m2129a(InterfaceC0643g interfaceC0643g) {
        if (interfaceC0643g == null) {
            throw new IllegalArgumentException("listener can not be null");
        }
        if (interfaceC0643g instanceof InterfaceC0647k) {
            throw new IllegalArgumentException("Permission denied");
        }
        ArrayList arrayList = this.f3152e;
        if (arrayList.contains(interfaceC0643g)) {
            return;
        }
        arrayList.add(interfaceC0643g);
    }

    /* renamed from: b */
    public final boolean m2130b() {
        int i7 = this.f3148X + 1;
        this.f3148X = i7;
        return i7 > 0;
    }

    /* renamed from: c */
    public final char m2131c(int i7, int i8) {
        m2154z(false);
        try {
            m2134f(i7, i8);
            return ((C0642f) this.f3151c.get(i7)).charAt(i8);
        } finally {
            m2128L(false);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        m2132d(i7);
        m2154z(false);
        try {
            C0638b m2110o = ((C0637a) m2145q()).m2110o(i7);
            return ((C0642f) this.f3151c.get(m2110o.f3141b)).charAt(m2110o.f3142c);
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: d */
    public final void m2132d(int i7) {
        if (i7 > this.f3154s || i7 < 0) {
            StringBuilder m221g = C0090b.m221g("Index ", i7, " out of bounds. length:");
            m221g.append(this.f3154s);
            throw new StringIndexOutOfBoundsException(m221g.toString());
        }
    }

    /* renamed from: e */
    public final void m2133e(int i7) {
        if (i7 >= m2147s() || i7 < 0) {
            StringBuilder m221g = C0090b.m221g("Line ", i7, " out of bounds. line count:");
            m221g.append(m2147s());
            throw new StringIndexOutOfBoundsException(m221g.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[LOOP:0: B:8:0x000f->B:22:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p022c5.C0641e
            r1 = 0
            if (r0 == 0) goto L4b
            c5.e r9 = (p022c5.C0641e) r9
            int r0 = r9.f3154s
            int r2 = r8.f3154s
            if (r0 == r2) goto Le
            return r1
        Le:
            r0 = 0
        Lf:
            int r2 = r8.m2147s()
            r3 = 1
            if (r0 >= r2) goto L4a
            java.util.ArrayList r2 = r8.f3151c
            java.lang.Object r2 = r2.get(r0)
            c5.f r2 = (p022c5.C0642f) r2
            java.util.ArrayList r4 = r9.f3151c
            java.lang.Object r4 = r4.get(r0)
            c5.f r4 = (p022c5.C0642f) r4
            int r5 = r2.f3160e
            int r6 = r4.f3160e
            if (r5 == r6) goto L2d
            goto L3f
        L2d:
            if (r2 != r4) goto L30
            goto L44
        L30:
            r5 = 0
        L31:
            int r6 = r2.f3160e
            if (r5 >= r6) goto L44
            char r6 = r2.charAt(r5)
            char r7 = r4.charAt(r5)
            if (r6 == r7) goto L41
        L3f:
            r3 = 0
            goto L44
        L41:
            int r5 = r5 + 1
            goto L31
        L44:
            if (r3 != 0) goto L47
            return r1
        L47:
            int r0 = r0 + 1
            goto Lf
        L4a:
            return r3
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p022c5.C0641e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m2134f(int i7, int i8) {
        m2133e(i7);
        C0642f c0642f = (C0642f) this.f3151c.get(i7);
        int i9 = c0642f.f3160e + c0642f.m2160d().f3182e;
        if (i8 > i9 || i8 < 0) {
            throw new StringIndexOutOfBoundsException("Column " + i8 + " out of bounds. line: " + i7 + " , column count (line separator included):" + i9);
        }
    }

    /* renamed from: g */
    public final void m2135g(int i7, int i8) {
        m2154z(true);
        m2132d(i7);
        m2132d(i8);
        this.f3149Y.getAndIncrement();
        try {
            C0638b m2110o = ((C0637a) m2145q()).m2110o(i7);
            C0638b m2110o2 = ((C0637a) m2145q()).m2110o(i8);
            if (i7 != i8) {
                m2137i(m2110o.f3141b, m2110o.f3142c, m2110o2.f3141b, m2110o2.f3142c);
            }
        } finally {
            m2128L(true);
        }
    }

    /* renamed from: h */
    public final void m2136h(int i7, int i8, int i9, int i10) {
        m2154z(true);
        this.f3149Y.getAndIncrement();
        try {
            m2137i(i7, i8, i9, i10);
        } finally {
            m2128L(true);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f3151c, Integer.valueOf(this.f3154s));
    }

    /* renamed from: i */
    public final void m2137i(int i7, int i8, int i9, int i10) {
        int i11;
        m2134f(i9, i10);
        m2134f(i7, i8);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        ArrayList arrayList = this.f3151c;
        if (i10 > ((C0642f) arrayList.get(i9)).f3160e && (i11 = i9 + 1) < m2147s()) {
            m2137i(i7, i8, i11, 0);
            return;
        }
        int i12 = ((C0642f) arrayList.get(i7)).f3160e;
        if (i8 > i12) {
            m2137i(i7, i12, i9, i10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (i7 == i9) {
            C0642f m2117A = m2117A(i7);
            int i13 = m2117A.f3160e;
            if (i8 < 0 || i10 > i13 || i8 > i10) {
                throw new StringIndexOutOfBoundsException("invalid bounds");
            }
            C0645i c0645i = this.f3157y1;
            if (c0645i != null) {
                C0637a c0637a = c0645i.f3165b;
                c0645i.f3169f = c0637a.m2111q(i7, i8).m2115a();
                c0645i.f3170g = c0637a.m2111q(i9, i10).m2115a();
            }
            m2138j();
            sb.append((CharSequence) m2117A, i8, i10);
            m2117A.m2159c(i8, i10);
            this.f3154s -= i10 - i8;
        } else {
            if (i7 >= i9) {
                throw new IllegalArgumentException("start line > end line");
            }
            C0645i c0645i2 = this.f3157y1;
            if (c0645i2 != null) {
                C0637a c0637a2 = c0645i2.f3165b;
                c0645i2.f3169f = c0637a2.m2111q(i7, i8).m2115a();
                c0645i2.f3170g = c0637a2.m2111q(i9, i10).m2115a();
            }
            m2138j();
            int i14 = i7 + 1;
            for (int i15 = i14; i15 <= i9 - 1; i15++) {
                C0642f c0642f = (C0642f) arrayList.get(i15);
                EnumC0649m m2160d = ((C0642f) arrayList.get(i15)).m2160d();
                int i16 = this.f3154s;
                int i17 = c0642f.f3160e;
                this.f3154s = i16 - (m2160d.f3182e + i17);
                sb.append(c0642f.f3159c, 0, i17);
                sb.append(m2160d.f3181c);
            }
            if (i9 > i14) {
                arrayList.subList(i14, i9).clear();
            }
            C0642f m2117A2 = m2117A(i7);
            C0642f c0642f2 = (C0642f) arrayList.get(i14);
            int i18 = this.f3154s;
            int i19 = m2117A2.f3160e;
            this.f3154s = i18 - (i19 - i8);
            sb.insert(0, m2117A2, i8, i19).insert(m2117A2.f3160e - i8, m2117A2.m2160d().f3181c);
            m2117A2.m2159c(i8, m2117A2.f3160e);
            this.f3154s -= i10;
            sb.append((CharSequence) c0642f2, 0, i10);
            this.f3154s -= m2117A2.m2160d().f3182e;
            arrayList.remove(i14);
            C0652p c0652p = new C0652p(i10, c0642f2.f3160e, c0642f2);
            m2117A2.m2161e(m2117A2.f3160e, 0, c0652p.length(), c0652p);
            m2117A2.f3162s = c0642f2.m2160d();
        }
        this.f3156x1.mo2109n(this, i7, i8, i9, i10, sb);
        C0645i c0645i3 = this.f3157y1;
        if (c0645i3 != null) {
            c0645i3.f3165b.mo2109n(c0645i3.f3164a, i7, i8, i9, i10, sb);
            int i20 = c0645i3.f3169f.f3140a;
            int i21 = c0645i3.f3170g.f3140a;
            int i22 = c0645i3.f3166c.f3140a;
            int i23 = c0645i3.f3167d.f3140a;
            if (i20 <= i23) {
                int i24 = i21 - i20;
                int max = i22 - Math.max(0, Math.min(i22 - i20, i24));
                int max2 = i23 - Math.max(0, Math.min(i23 - i20, i24));
                C0637a c0637a3 = c0645i3.f3165b;
                c0645i3.f3166c = c0637a3.m2110o(max).m2115a();
                c0645i3.f3167d = c0637a3.m2110o(max2).m2115a();
            }
        }
        C0637a c0637a4 = this.f3150Z;
        if (c0637a4 instanceof InterfaceC0643g) {
            c0637a4.mo2109n(this, i7, i8, i9, i10, sb);
        }
        Iterator it = this.f3152e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0643g) it.next()).mo2109n(this, i7, i8, i9, i10, sb);
        }
    }

    /* renamed from: j */
    public final void m2138j() {
        this.f3156x1.mo2114z(this);
        Iterator it = this.f3152e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0643g) it.next()).mo2114z(this);
        }
    }

    /* renamed from: k */
    public final void m2139k() {
        this.f3156x1.mo2102c(this);
        C0645i c0645i = this.f3157y1;
        if (c0645i != null) {
            c0645i.f3165b.getClass();
        }
        C0637a c0637a = this.f3150Z;
        if (c0637a instanceof InterfaceC0643g) {
            c0637a.mo2102c(this);
        }
        Iterator it = this.f3152e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0643g) it.next()).mo2102c(this);
        }
    }

    /* renamed from: l */
    public final boolean m2140l() {
        int i7 = this.f3148X - 1;
        this.f3148X = i7;
        if (i7 == 0) {
            C0653q c0653q = this.f3156x1;
            c0653q.f3201y1 = true;
            ArrayList arrayList = c0653q.f3195c;
            if (!arrayList.isEmpty() && (arrayList.get(arrayList.size() - 1) instanceof C0653q.e)) {
                C0653q.e eVar = (C0653q.e) arrayList.get(arrayList.size() - 1);
                if (eVar.f3216e.size() == 1) {
                    arrayList.set(arrayList.size() - 1, (C0653q.b) eVar.f3216e.get(0));
                }
            }
        }
        if (this.f3148X < 0) {
            this.f3148X = 0;
        }
        return this.f3148X > 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3154s;
    }

    /* renamed from: m */
    public final int m2141m(int i7, int i8) {
        m2154z(false);
        try {
            return ((C0637a) m2145q()).m2111q(i7, i8).f3140a;
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: n */
    public final int m2142n(int i7) {
        return m2146r(i7).f3160e;
    }

    /* renamed from: o */
    public final int m2143o(int i7) {
        return ((C0642f) this.f3151c.get(i7)).f3160e;
    }

    /* renamed from: p */
    public final C0645i m2144p() {
        if (this.f3157y1 == null) {
            this.f3157y1 = new C0645i(this);
        }
        return this.f3157y1;
    }

    /* renamed from: q */
    public final InterfaceC0647k m2145q() {
        C0645i c0645i = this.f3157y1;
        return c0645i != null ? c0645i.f3165b : this.f3150Z;
    }

    /* renamed from: r */
    public final C0642f m2146r(int i7) {
        m2154z(false);
        try {
            return (C0642f) this.f3151c.get(i7);
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: s */
    public final int m2147s() {
        return this.f3151c.size();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        if (i7 > i8) {
            throw new StringIndexOutOfBoundsException("start > end");
        }
        m2154z(false);
        try {
            C0638b m2110o = ((C0637a) m2145q()).m2110o(i7);
            C0638b m2110o2 = ((C0637a) m2145q()).m2110o(i8);
            return m2124H(m2110o.f3141b, m2110o.f3142c, m2110o2.f3141b, m2110o2.f3142c);
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: t */
    public final C0892c m2148t(int i7) {
        m2154z(false);
        try {
            return this.f3155w1.m2596b(i7);
        } finally {
            m2128L(false);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return m2127K().toString();
    }

    /* renamed from: u */
    public final EnumC0649m m2149u(int i7) {
        return ((C0642f) this.f3151c.get(i7)).m2160d();
    }

    /* renamed from: v */
    public final String m2150v(int i7) {
        m2154z(false);
        try {
            m2133e(i7);
            return ((C0642f) this.f3151c.get(i7)).toString();
        } finally {
            m2128L(false);
        }
    }

    /* renamed from: w */
    public final void m2151w(int i7, int i8, CharSequence charSequence) {
        m2154z(true);
        this.f3149Y.getAndIncrement();
        try {
            m2152x(i7, i8, charSequence);
        } finally {
            m2128L(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x018a, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown line separator type");
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2152x(int r17, int r18, java.lang.CharSequence r19) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022c5.C0641e.m2152x(int, int, java.lang.CharSequence):void");
    }

    /* renamed from: y */
    public final boolean m2153y(int i7, int i8) {
        C0892c m2148t = m2148t(i7);
        for (int i9 = 0; i9 < m2148t.f4677a.length; i9++) {
            if (i8 >= m2148t.m2598b(i9) && i8 < m2148t.m2597a(i9)) {
                return m2148t.m2599c(i9);
            }
        }
        return false;
    }

    /* renamed from: z */
    public final void m2154z(boolean z6) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f3153m;
        if (reentrantReadWriteLock == null) {
            return;
        }
        (z6 ? reentrantReadWriteLock.writeLock() : reentrantReadWriteLock.readLock()).lock();
    }

    public C0641e(CharSequence charSequence, boolean z6) {
        this.f3149Y = new AtomicLong(1L);
        charSequence = charSequence == null ? "" : charSequence;
        this.f3153m = z6 ? new ReentrantReadWriteLock() : null;
        this.f3154s = 0;
        this.f3148X = 0;
        ArrayList arrayList = new ArrayList(DaemonManager.TIME_JUMP_MUL_INT);
        this.f3151c = arrayList;
        arrayList.add(new C0642f());
        this.f3152e = new ArrayList();
        this.f3155w1 = new C0891b(this);
        C0653q c0653q = new C0653q();
        this.f3156x1 = c0653q;
        c0653q.f3197m = 500;
        c0653q.m2172B();
        this.f3150Z = new C0637a(this);
        if (charSequence.length() == 0) {
            m2122F(true);
            return;
        }
        m2122F(false);
        m2151w(0, 0, charSequence);
        m2122F(true);
    }
}
