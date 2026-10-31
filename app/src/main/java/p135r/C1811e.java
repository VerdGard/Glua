package p135r;

import android.ext.C0091c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p127q.C1713d;
import p127q.C1714e;
import p127q.C1716g;
import p127q.C1718i;
import p135r.C1808b;

/* renamed from: r.e */
/* loaded from: classes.dex */
public final class C1811e {

    /* renamed from: a */
    public final C1714e f8209a;

    /* renamed from: d */
    public final C1714e f8212d;

    /* renamed from: f */
    public C1808b.b f8214f;

    /* renamed from: g */
    public final C1808b.a f8215g;

    /* renamed from: h */
    public final ArrayList<C1817k> f8216h;

    /* renamed from: b */
    public boolean f8210b = true;

    /* renamed from: c */
    public boolean f8211c = true;

    /* renamed from: e */
    public final ArrayList<AbstractC1819m> f8213e = new ArrayList<>();

    public C1811e(C1714e c1714e) {
        new ArrayList();
        this.f8214f = null;
        this.f8215g = new C1808b.a();
        this.f8216h = new ArrayList<>();
        this.f8209a = c1714e;
        this.f8212d = c1714e;
    }

    /* renamed from: a */
    public final void m4275a(C1812f c1812f, int i7, int i8, ArrayList arrayList, C1817k c1817k) {
        AbstractC1819m abstractC1819m = c1812f.f8220d;
        if (abstractC1819m.f8237c == null) {
            C1714e c1714e = this.f8209a;
            if (abstractC1819m == c1714e.f7782d || abstractC1819m == c1714e.f7784e) {
                return;
            }
            if (c1817k == null) {
                c1817k = new C1817k(abstractC1819m);
                arrayList.add(c1817k);
            }
            abstractC1819m.f8237c = c1817k;
            c1817k.f8232b.add(abstractC1819m);
            C1812f c1812f2 = abstractC1819m.f8242h;
            Iterator it = c1812f2.f8227k.iterator();
            while (it.hasNext()) {
                InterfaceC1810d interfaceC1810d = (InterfaceC1810d) it.next();
                if (interfaceC1810d instanceof C1812f) {
                    m4275a((C1812f) interfaceC1810d, i7, 0, arrayList, c1817k);
                }
            }
            C1812f c1812f3 = abstractC1819m.f8243i;
            Iterator it2 = c1812f3.f8227k.iterator();
            while (it2.hasNext()) {
                InterfaceC1810d interfaceC1810d2 = (InterfaceC1810d) it2.next();
                if (interfaceC1810d2 instanceof C1812f) {
                    m4275a((C1812f) interfaceC1810d2, i7, 1, arrayList, c1817k);
                }
            }
            if (i7 == 1 && (abstractC1819m instanceof C1818l)) {
                Iterator it3 = ((C1818l) abstractC1819m).f8233k.f8227k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1810d interfaceC1810d3 = (InterfaceC1810d) it3.next();
                    if (interfaceC1810d3 instanceof C1812f) {
                        m4275a((C1812f) interfaceC1810d3, i7, 2, arrayList, c1817k);
                    }
                }
            }
            Iterator it4 = c1812f2.f8228l.iterator();
            while (it4.hasNext()) {
                m4275a((C1812f) it4.next(), i7, 0, arrayList, c1817k);
            }
            Iterator it5 = c1812f3.f8228l.iterator();
            while (it5.hasNext()) {
                m4275a((C1812f) it5.next(), i7, 1, arrayList, c1817k);
            }
            if (i7 == 1 && (abstractC1819m instanceof C1818l)) {
                Iterator it6 = ((C1818l) abstractC1819m).f8233k.f8228l.iterator();
                while (it6.hasNext()) {
                    m4275a((C1812f) it6.next(), i7, 2, arrayList, c1817k);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
    
        m4280f(r3, r6, 0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020e, code lost:
    
        r15.f8229m = r3.m4163j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if (r10 != 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018c, code lost:
    
        r2 = r11[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018f, code lost:
    
        if (r2 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r2 != 4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0194, code lost:
    
        r0 = r3.m4165l();
        r2 = (int) ((r12 * r18.m4163j()) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a8, code lost:
    
        if (r14[2].f7737d == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01aa, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01af, code lost:
    
        if (r14[3].f7737d != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b6, code lost:
    
        if (r6 != r0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b8, code lost:
    
        if (r8 != r0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bb, code lost:
    
        if (r9 == 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bd, code lost:
    
        if (r10 != 1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c1, code lost:
    
        if (r10 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c3, code lost:
    
        if (r9 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c5, code lost:
    
        r2 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c8, code lost:
    
        if (r2 == 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ca, code lost:
    
        if (r2 != 1) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cc, code lost:
    
        r2 = r11[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ce, code lost:
    
        if (r2 == 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d0, code lost:
    
        if (r2 != 1) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d2, code lost:
    
        r2 = (int) ((r12 * r18.m4163j()) + 0.5f);
        r0 = (int) ((r7 * r18.m4165l()) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01fe, code lost:
    
        m4280f(r3, 2, 0, 2, 0);
        r13.f8229m = r3.m4165l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b1, code lost:
    
        r6 = 2;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b5, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0119, code lost:
    
        r7 = (int) ((r7 * r18.m4165l()) + 0.5f);
        r9 = r3.m4163j();
        r6 = 1;
        r4 = r17;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0139, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x013f, code lost:
    
        if (r14[0].f7737d == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0145, code lost:
    
        if (r14[1].f7737d != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0149, code lost:
    
        r13 = r4;
        r15 = r8;
        r0 = 1;
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00b1, code lost:
    
        if (r5 == 2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r3.f7790k == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        if (r6 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
    
        r11 = r2.f7759J;
        r14 = r3.f7756G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
    
        if (r6 != 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        if (r5 == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bf, code lost:
    
        if (r5 != 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r9 != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        if (r5 != r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r13 = r4;
        r15 = r8;
        m4280f(r3, 2, 0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
    
        r9 = r3.m4163j();
        r7 = (int) ((r9 * r3.f7763N) + 0.5f);
        r8 = 1;
        r4 = r17;
        r5 = r3;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
    
        r4.m4280f(r5, r6, r7, r8, r9);
        r13.mo4284d(r3.m4165l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
    
        r15.mo4284d(r3.m4163j());
        r3.f7776a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
    
        r13 = r4;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        r13 = r4;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        if (r9 != 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
    
        m4280f(r3, 2, 0, r5, 0);
        r13.f8229m = r3.m4165l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0109, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010b, code lost:
    
        if (r9 != 2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010d, code lost:
    
        r4 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0111, code lost:
    
        if (r4 == 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0114, code lost:
    
        if (r4 != 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0117, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014e, code lost:
    
        if (r8 != 3) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0151, code lost:
    
        if (r6 == 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        if (r6 != r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
    
        if (r10 != 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
    
        if (r6 != 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0159, code lost:
    
        m4280f(r3, 2, 0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0163, code lost:
    
        r0 = r3.m4165l();
        r2 = r3.f7763N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016c, code lost:
    
        if (r3.f7764O != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016e, code lost:
    
        r2 = 1.0f / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0172, code lost:
    
        r2 = (int) ((r0 * r2) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01eb, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ec, code lost:
    
        r7 = r0;
        r9 = r2;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ef, code lost:
    
        m4280f(r3, r6, r7, r8, r9);
        r13.mo4284d(r3.m4165l());
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
    
        if (r10 != 1) goto L111;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4276b(p127q.C1714e r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135r.C1811e.m4276b(q.e):void");
    }

    /* renamed from: c */
    public final void m4277c() {
        AbstractC1819m c1814h;
        ArrayList<AbstractC1819m> arrayList = this.f8213e;
        arrayList.clear();
        C1714e c1714e = this.f8212d;
        c1714e.f7782d.mo4270f();
        C1818l c1818l = c1714e.f7784e;
        c1818l.mo4270f();
        arrayList.add(c1714e.f7782d);
        arrayList.add(c1818l);
        Iterator<C1713d> it = c1714e.f7881e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1713d next = it.next();
            if (next instanceof C1716g) {
                c1814h = new C1814h(next);
            } else {
                if (next.m4170q()) {
                    if (next.f7778b == null) {
                        next.f7778b = new C1809c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7778b);
                } else {
                    arrayList.add(next.f7782d);
                }
                if (next.m4171r()) {
                    if (next.f7780c == null) {
                        next.f7780c = new C1809c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7780c);
                } else {
                    arrayList.add(next.f7784e);
                }
                if (next instanceof C1718i) {
                    c1814h = new C1815i(next);
                }
            }
            arrayList.add(c1814h);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC1819m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo4270f();
        }
        Iterator<AbstractC1819m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1819m next2 = it3.next();
            if (next2.f8236b != c1714e) {
                next2.mo4268d();
            }
        }
        ArrayList<C1817k> arrayList2 = this.f8216h;
        arrayList2.clear();
        C1714e c1714e2 = this.f8209a;
        m4279e(c1714e2.f7782d, 0, arrayList2);
        m4279e(c1714e2.f7784e, 1, arrayList2);
        this.f8210b = false;
    }

    /* renamed from: d */
    public final int m4278d(C1714e c1714e, int i7) {
        long j7;
        ArrayList<C1817k> arrayList;
        int i8;
        long j8;
        long j9;
        float f7;
        C1714e c1714e2 = c1714e;
        int i9 = i7;
        ArrayList<C1817k> arrayList2 = this.f8216h;
        int size = arrayList2.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            AbstractC1819m abstractC1819m = arrayList2.get(i10).f8231a;
            if (!(abstractC1819m instanceof C1809c) ? !(i9 != 0 ? (abstractC1819m instanceof C1818l) : (abstractC1819m instanceof C1816j)) : ((C1809c) abstractC1819m).f8240f != i9) {
                C1812f c1812f = (i9 == 0 ? c1714e2.f7782d : c1714e2.f7784e).f8242h;
                C1812f c1812f2 = (i9 == 0 ? c1714e2.f7782d : c1714e2.f7784e).f8243i;
                boolean contains = abstractC1819m.f8242h.f8228l.contains(c1812f);
                C1812f c1812f3 = abstractC1819m.f8243i;
                boolean contains2 = c1812f3.f8228l.contains(c1812f2);
                long mo4271j = abstractC1819m.mo4271j();
                C1812f c1812f4 = abstractC1819m.f8242h;
                if (contains && contains2) {
                    long m4290b = C1817k.m4290b(c1812f4, 0L);
                    long m4289a = C1817k.m4289a(c1812f3, 0L);
                    long j11 = m4290b - mo4271j;
                    int i11 = c1812f3.f8222f;
                    arrayList = arrayList2;
                    i8 = size;
                    if (j11 >= (-i11)) {
                        j11 += i11;
                    }
                    long j12 = j11;
                    long j13 = (-m4289a) - mo4271j;
                    long j14 = c1812f4.f8222f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    C1713d c1713d = abstractC1819m.f8236b;
                    if (i9 == 0) {
                        f7 = c1713d.f7770U;
                    } else if (i9 == 1) {
                        f7 = c1713d.f7771V;
                    } else {
                        c1713d.getClass();
                        f7 = -1.0f;
                    }
                    float f8 = f7 > 0.0f ? (long) ((j12 / (1.0f - f7)) + (j15 / f7)) : 0L;
                    j7 = (c1812f4.f8222f + ((((long) ((f8 * f7) + 0.5f)) + mo4271j) + ((long) C0091c.m227e(1.0f, f7, f8, 0.5f)))) - c1812f3.f8222f;
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    if (contains) {
                        j9 = C1817k.m4290b(c1812f4, c1812f4.f8222f);
                        j8 = c1812f4.f8222f + mo4271j;
                    } else if (contains2) {
                        j8 = (-c1812f3.f8222f) + mo4271j;
                        j9 = -C1817k.m4289a(c1812f3, c1812f3.f8222f);
                    } else {
                        j7 = (abstractC1819m.mo4271j() + c1812f4.f8222f) - c1812f3.f8222f;
                    }
                    j7 = Math.max(j9, j8);
                }
            } else {
                j7 = 0;
                arrayList = arrayList2;
                i8 = size;
            }
            j10 = Math.max(j10, j7);
            i10++;
            c1714e2 = c1714e;
            i9 = i7;
            arrayList2 = arrayList;
            size = i8;
        }
        return (int) j10;
    }

    /* renamed from: e */
    public final void m4279e(AbstractC1819m abstractC1819m, int i7, ArrayList<C1817k> arrayList) {
        C1812f c1812f;
        C1812f c1812f2;
        C1812f c1812f3;
        Iterator it = abstractC1819m.f8242h.f8227k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1812f = abstractC1819m.f8243i;
            if (!hasNext) {
                break;
            }
            InterfaceC1810d interfaceC1810d = (InterfaceC1810d) it.next();
            if (interfaceC1810d instanceof C1812f) {
                c1812f3 = (C1812f) interfaceC1810d;
            } else if (interfaceC1810d instanceof AbstractC1819m) {
                c1812f3 = ((AbstractC1819m) interfaceC1810d).f8242h;
            }
            m4275a(c1812f3, i7, 0, arrayList, null);
        }
        Iterator it2 = c1812f.f8227k.iterator();
        while (it2.hasNext()) {
            InterfaceC1810d interfaceC1810d2 = (InterfaceC1810d) it2.next();
            if (interfaceC1810d2 instanceof C1812f) {
                c1812f2 = (C1812f) interfaceC1810d2;
            } else if (interfaceC1810d2 instanceof AbstractC1819m) {
                c1812f2 = ((AbstractC1819m) interfaceC1810d2).f8243i;
            }
            m4275a(c1812f2, i7, 1, arrayList, null);
        }
        if (i7 == 1) {
            Iterator it3 = ((C1818l) abstractC1819m).f8233k.f8227k.iterator();
            while (it3.hasNext()) {
                InterfaceC1810d interfaceC1810d3 = (InterfaceC1810d) it3.next();
                if (interfaceC1810d3 instanceof C1812f) {
                    m4275a((C1812f) interfaceC1810d3, i7, 2, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m4280f(C1713d c1713d, int i7, int i8, int i9, int i10) {
        C1808b.a aVar = this.f8215g;
        aVar.f8197a = i7;
        aVar.f8198b = i9;
        aVar.f8199c = i8;
        aVar.f8200d = i10;
        ((ConstraintLayout.C0281b) this.f8214f).m941a(c1713d, aVar);
        c1713d.m4178y(aVar.f8201e);
        c1713d.m4175v(aVar.f8202f);
        c1713d.f7802w = aVar.f8204h;
        int i11 = aVar.f8203g;
        c1713d.f7767R = i11;
        c1713d.f7802w = i11 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r10 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r2.mo4284d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r2.f8229m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r8 == 3) goto L32;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4281g() {
        /*
            r15 = this;
            q.e r0 = r15.f8209a
            java.util.ArrayList<q.d> r0 = r0.f7881e0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.next()
            q.d r1 = (p127q.C1713d) r1
            boolean r2 = r1.f7776a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f7759J
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f7789j
            int r4 = r1.f7790k
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = 1
        L38:
            r.j r12 = r1.f7782d
            r.g r4 = r12.f8239e
            boolean r5 = r4.f8226j
            r.l r13 = r1.f7784e
            r.g r6 = r13.f8239e
            boolean r7 = r6.f8226j
            r14 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f8223g
            int r7 = r6.f8223g
            r6 = 1
            r2 = r15
            r3 = r1
            r4 = r6
            r2.m4280f(r3, r4, r5, r6, r7)
            goto L8a
        L55:
            if (r5 == 0) goto L6d
            if (r3 == 0) goto L6d
            int r5 = r4.f8223g
            int r7 = r6.f8223g
            r4 = 1
            r6 = 2
            r2 = r15
            r3 = r1
            r2.m4280f(r3, r4, r5, r6, r7)
            r.g r2 = r13.f8239e
            int r3 = r1.m4163j()
            if (r10 != r11) goto L87
            goto L84
        L6d:
            if (r7 == 0) goto L8c
            if (r2 == 0) goto L8c
            int r5 = r4.f8223g
            int r7 = r6.f8223g
            r4 = 2
            r2 = r15
            r3 = r1
            r6 = r14
            r2.m4280f(r3, r4, r5, r6, r7)
            r.g r2 = r12.f8239e
            int r3 = r1.m4165l()
            if (r8 != r11) goto L87
        L84:
            r2.f8229m = r3
            goto L8c
        L87:
            r2.mo4284d(r3)
        L8a:
            r1.f7776a = r9
        L8c:
            boolean r2 = r1.f7776a
            if (r2 == 0) goto L8
            r.a r2 = r13.f8234l
            if (r2 == 0) goto L8
            int r1 = r1.f7767R
            r2.mo4284d(r1)
            goto L8
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135r.C1811e.m4281g():void");
    }
}
