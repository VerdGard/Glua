package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0482p;
import java.util.ArrayList;
import p120p.C1684e;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C0464a implements C0482p.a {

    /* renamed from: d */
    public final a f2341d;

    /* renamed from: a */
    public final C1684e f2338a = new C1684e(30, 1);

    /* renamed from: b */
    public final ArrayList<b> f2339b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f2340c = new ArrayList<>();

    /* renamed from: f */
    public int f2343f = 0;

    /* renamed from: e */
    public final C0482p f2342e = new C0482p(this);

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class b {

        /* renamed from: a */
        public int f2344a;

        /* renamed from: b */
        public int f2345b;

        /* renamed from: c */
        public Object f2346c;

        /* renamed from: d */
        public int f2347d;

        public b(Object obj, int i7, int i8, int i9) {
            this.f2344a = i7;
            this.f2345b = i8;
            this.f2347d = i9;
            this.f2346c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f2344a;
            if (i7 != bVar.f2344a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f2347d - this.f2345b) == 1 && this.f2347d == bVar.f2345b && this.f2345b == bVar.f2347d) {
                return true;
            }
            if (this.f2347d != bVar.f2347d || this.f2345b != bVar.f2345b) {
                return false;
            }
            Object obj2 = this.f2346c;
            Object obj3 = bVar.f2346c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2344a * 31) + this.f2345b) * 31) + this.f2347d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i7 = this.f2344a;
            sb.append(i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2345b);
            sb.append("c:");
            sb.append(this.f2347d);
            sb.append(",p:");
            sb.append(this.f2346c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C0464a(C0489w c0489w) {
        this.f2341d = c0489w;
    }

    /* renamed from: a */
    public final boolean m1725a(int i7) {
        ArrayList<b> arrayList = this.f2340c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = arrayList.get(i8);
            int i9 = bVar.f2344a;
            if (i9 == 8) {
                if (m1730f(bVar.f2347d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f2345b;
                int i11 = bVar.f2347d + i10;
                while (i10 < i11) {
                    if (m1730f(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m1726b() {
        ArrayList<b> arrayList = this.f2340c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0489w) this.f2341d).m1807a(arrayList.get(i7));
        }
        m1736l(arrayList);
        this.f2343f = 0;
    }

    /* renamed from: c */
    public final void m1727c() {
        m1726b();
        ArrayList<b> arrayList = this.f2339b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = arrayList.get(i7);
            int i8 = bVar.f2344a;
            a aVar = this.f2341d;
            if (i8 == 1) {
                C0489w c0489w = (C0489w) aVar;
                c0489w.m1807a(bVar);
                c0489w.m1810d(bVar.f2345b, bVar.f2347d);
            } else if (i8 == 2) {
                C0489w c0489w2 = (C0489w) aVar;
                c0489w2.m1807a(bVar);
                int i9 = bVar.f2345b;
                int i10 = bVar.f2347d;
                RecyclerView recyclerView = c0489w2.f2496a;
                recyclerView.m1530N(i9, i10, true);
                recyclerView.f2168w2 = true;
                recyclerView.f2164t2.f2266c += i10;
            } else if (i8 == 4) {
                C0489w c0489w3 = (C0489w) aVar;
                c0489w3.m1807a(bVar);
                c0489w3.m1809c(bVar.f2345b, bVar.f2347d, bVar.f2346c);
            } else if (i8 == 8) {
                C0489w c0489w4 = (C0489w) aVar;
                c0489w4.m1807a(bVar);
                c0489w4.m1811e(bVar.f2345b, bVar.f2347d);
            }
        }
        m1736l(arrayList);
        this.f2343f = 0;
    }

    /* renamed from: d */
    public final void m1728d(b bVar) {
        int i7;
        int i8 = bVar.f2344a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m1737m = m1737m(bVar.f2345b, i8);
        int i9 = bVar.f2345b;
        int i10 = bVar.f2344a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f2347d; i12++) {
            int m1737m2 = m1737m((i7 * i12) + bVar.f2345b, bVar.f2344a);
            int i13 = bVar.f2344a;
            if (i13 == 2 ? m1737m2 == m1737m : i13 == 4 && m1737m2 == m1737m + 1) {
                i11++;
            } else {
                b m1732h = m1732h(bVar.f2346c, i13, m1737m, i11);
                m1729e(m1732h, i9);
                m1735k(m1732h);
                if (bVar.f2344a == 4) {
                    i9 += i11;
                }
                m1737m = m1737m2;
                i11 = 1;
            }
        }
        Object obj = bVar.f2346c;
        m1735k(bVar);
        if (i11 > 0) {
            b m1732h2 = m1732h(obj, bVar.f2344a, m1737m, i11);
            m1729e(m1732h2, i9);
            m1735k(m1732h2);
        }
    }

    /* renamed from: e */
    public final void m1729e(b bVar, int i7) {
        C0489w c0489w = (C0489w) this.f2341d;
        c0489w.m1807a(bVar);
        int i8 = bVar.f2344a;
        if (i8 != 2) {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0489w.m1809c(i7, bVar.f2347d, bVar.f2346c);
        } else {
            int i9 = bVar.f2347d;
            RecyclerView recyclerView = c0489w.f2496a;
            recyclerView.m1530N(i7, i9, true);
            recyclerView.f2168w2 = true;
            recyclerView.f2164t2.f2266c += i9;
        }
    }

    /* renamed from: f */
    public final int m1730f(int i7, int i8) {
        ArrayList<b> arrayList = this.f2340c;
        int size = arrayList.size();
        while (i8 < size) {
            b bVar = arrayList.get(i8);
            int i9 = bVar.f2344a;
            if (i9 == 8) {
                int i10 = bVar.f2345b;
                if (i10 == i7) {
                    i7 = bVar.f2347d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f2347d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f2345b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f2347d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f2347d;
                }
            }
            i8++;
        }
        return i7;
    }

    /* renamed from: g */
    public final boolean m1731g() {
        return this.f2339b.size() > 0;
    }

    /* renamed from: h */
    public final b m1732h(Object obj, int i7, int i8, int i9) {
        b bVar = (b) this.f2338a.mo2564a();
        if (bVar == null) {
            return new b(obj, i7, i8, i9);
        }
        bVar.f2344a = i7;
        bVar.f2345b = i8;
        bVar.f2347d = i9;
        bVar.f2346c = obj;
        return bVar;
    }

    /* renamed from: i */
    public final void m1733i(b bVar) {
        this.f2340c.add(bVar);
        int i7 = bVar.f2344a;
        a aVar = this.f2341d;
        if (i7 == 1) {
            ((C0489w) aVar).m1810d(bVar.f2345b, bVar.f2347d);
            return;
        }
        if (i7 == 2) {
            int i8 = bVar.f2345b;
            int i9 = bVar.f2347d;
            RecyclerView recyclerView = ((C0489w) aVar).f2496a;
            recyclerView.m1530N(i8, i9, false);
            recyclerView.f2168w2 = true;
            return;
        }
        if (i7 == 4) {
            ((C0489w) aVar).m1809c(bVar.f2345b, bVar.f2347d, bVar.f2346c);
        } else if (i7 == 8) {
            ((C0489w) aVar).m1811e(bVar.f2345b, bVar.f2347d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r4 > r12.f2345b) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0176, code lost:
    
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        if (r11.f2345b == r11.f2347d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        r1.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0186, code lost:
    
        if (r6 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0188, code lost:
    
        r1.add(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
    
        r1.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        r11.f2347d = r4 - r12.f2347d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016f, code lost:
    
        if (r4 >= r12.f2345b) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc A[SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1734j() {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0464a.m1734j():void");
    }

    /* renamed from: k */
    public final void m1735k(b bVar) {
        bVar.f2346c = null;
        this.f2338a.mo2565b(bVar);
    }

    /* renamed from: l */
    public final void m1736l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            m1735k((b) arrayList.get(i7));
        }
        arrayList.clear();
    }

    /* renamed from: m */
    public final int m1737m(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList<b> arrayList = this.f2340c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i15 = bVar.f2344a;
            if (i15 == 8) {
                int i16 = bVar.f2345b;
                int i17 = bVar.f2347d;
                if (i16 < i17) {
                    i11 = i16;
                    i10 = i17;
                } else {
                    i10 = i16;
                    i11 = i17;
                }
                if (i7 < i11 || i7 > i10) {
                    if (i7 < i16) {
                        if (i8 == 1) {
                            bVar.f2345b = i16 + 1;
                            i12 = i17 + 1;
                        } else if (i8 == 2) {
                            bVar.f2345b = i16 - 1;
                            i12 = i17 - 1;
                        }
                        bVar.f2347d = i12;
                    }
                } else if (i11 == i16) {
                    if (i8 == 1) {
                        i14 = i17 + 1;
                    } else {
                        if (i8 == 2) {
                            i14 = i17 - 1;
                        }
                        i7++;
                    }
                    bVar.f2347d = i14;
                    i7++;
                } else {
                    if (i8 == 1) {
                        i13 = i16 + 1;
                    } else {
                        if (i8 == 2) {
                            i13 = i16 - 1;
                        }
                        i7--;
                    }
                    bVar.f2345b = i13;
                    i7--;
                }
            } else {
                int i18 = bVar.f2345b;
                if (i18 > i7) {
                    if (i8 == 1) {
                        i9 = i18 + 1;
                    } else if (i8 == 2) {
                        i9 = i18 - 1;
                    }
                    bVar.f2345b = i9;
                } else if (i15 == 1) {
                    i7 -= bVar.f2347d;
                } else if (i15 == 2) {
                    i7 += bVar.f2347d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f2344a == 8) {
                int i19 = bVar2.f2347d;
                if (i19 != bVar2.f2345b && i19 >= 0) {
                }
                arrayList.remove(size2);
                m1735k(bVar2);
            } else {
                if (bVar2.f2347d > 0) {
                }
                arrayList.remove(size2);
                m1735k(bVar2);
            }
        }
        return i7;
    }
}
