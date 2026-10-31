package p191y1;

import android.ext.C0090b;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import p002a1.C0017d;
import p006a5.C0051a;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0644h;
import p036e2.C1118x0;
import p047f5.C1176g;
import p055g5.C1245b;
import p055g5.C1258o;
import p120p.C1686g;
import p144s0.RunnableC1869e;
import p156t4.AbstractC1927b;
import p156t4.C1928c;
import p156t4.InterfaceC1929d;
import p171v4.C2030n;

/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C2224c extends AbstractC1927b<C2230i, Long> {

    /* renamed from: i */
    public static int[] f10066i;

    /* renamed from: g */
    public final ThreadLocal<C2226e> f10067g;

    /* renamed from: h */
    public final C2030n.a f10068h;

    public C2224c() {
        new ThreadLocal();
        this.f10067g = new ThreadLocal<>();
        this.f10068h = new C2030n.a();
    }

    /* renamed from: n */
    public static int m5402n(int i7) {
        if (f10066i == null) {
            int[] _values = C0090b._values();
            f10066i = new int[_values.length];
            for (int i8 : _values) {
                f10066i[C1686g.m4108c(i8)] = i8;
            }
        }
        return f10066i[i7];
    }

    @Override // p057h.AbstractC1268b, p156t4.InterfaceC1926a
    /* renamed from: a */
    public final void mo3579a(C0644h c0644h, Bundle bundle) {
        super.mo3579a(c0644h, bundle);
        C2030n.a aVar = this.f10068h;
        ReentrantLock reentrantLock = aVar.f9215a;
        reentrantLock.lock();
        try {
            aVar.f9216b.clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p156t4.AbstractC1927b
    /* renamed from: i */
    public final ArrayList mo4535i(C0641e c0641e, AbstractC1927b.a aVar) {
        InterfaceC1929d interfaceC1929d;
        int i7;
        int i8;
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        C1118x0 c1118x0 = new C1118x0(2);
        Stack stack2 = new Stack();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < c0641e.m2147s() && aVar.m4539a()) {
            AbstractC1927b<S, T>.c cVar = this.f8695d;
            if (cVar != Thread.currentThread()) {
                throw new SecurityException("Can not get state from non-analytical or abandoned thread");
            }
            C1928c c1928c = (i9 < 0 || i9 >= cVar.f8707X.size()) ? null : (C1928c) cVar.f8707X.get(i9);
            int i12 = ((C2230i) c1928c.f8719a).f10131a;
            int i13 = 1;
            List<T_> list = c1928c.f8720b;
            boolean z6 = i12 == 0 || (i12 == 1 && list.size() > 1);
            if (((C2230i) c1928c.f8719a).f10132b || z6) {
                int i14 = 0;
                while (i14 < list.size()) {
                    Long l7 = (Long) list.get(i14);
                    Stack stack3 = stack2;
                    int longValue = (int) (l7.longValue() >> 32);
                    if (longValue == 58 || longValue == 12 || longValue == 9 || longValue == 10 || longValue == 20) {
                        int m62A = C0017d.m62A(l7.longValue());
                        if (stack.isEmpty()) {
                            if (i11 > i10) {
                                i10 = i11;
                            }
                            i11 = 0;
                        }
                        i11 += i13;
                        C0051a c0051a = new C0051a();
                        c0051a.f136a = i9;
                        c0051a.f137b = m62A;
                        stack.push(c0051a);
                    } else if (longValue == 8 || longValue == 59) {
                        int m62A2 = C0017d.m62A(l7.longValue());
                        if (!stack.isEmpty()) {
                            C0051a c0051a2 = (C0051a) stack.pop();
                            c0051a2.f138c = i9;
                            c0051a2.f139d = m62A2;
                            if (c0051a2.f136a != i9) {
                                arrayList.add(c0051a2);
                            }
                        }
                    }
                    int i15 = (longValue == 58 || longValue == 59) ? 3 : (longValue == 60 || longValue == 61) ? 2 : (longValue == 56 || longValue == 57) ? 1 : 0;
                    if (i15 > 0) {
                        if (longValue == 58 || longValue == 60 || longValue == 56) {
                            stack3.push(Long.valueOf(C0017d.m68G(i15, c0641e.m2141m(i9, C0017d.m62A(l7.longValue())))));
                        } else {
                            Stack stack4 = stack3;
                            if (stack4.isEmpty()) {
                                stack3 = stack4;
                            } else {
                                Long l8 = (Long) stack4.pop();
                                int i16 = i10;
                                i7 = i11;
                                if (((int) (l8.longValue() >> 32)) == i15) {
                                    stack3 = stack4;
                                    i8 = i16;
                                } else {
                                    if (i15 == 3) {
                                        while (!stack4.isEmpty()) {
                                            Long l9 = (Long) stack4.pop();
                                            stack3 = stack4;
                                            i8 = i16;
                                            if (((int) (l9.longValue() >> 32)) == 3) {
                                                l8 = l9;
                                            } else {
                                                i16 = i8;
                                                stack4 = stack3;
                                            }
                                        }
                                    }
                                    stack3 = stack4;
                                    i8 = i16;
                                    i14++;
                                    i10 = i8;
                                    i11 = i7;
                                    stack2 = stack3;
                                    i13 = 1;
                                }
                                c1118x0.m3280b(C0017d.m62A(l8.longValue()), c0641e.m2141m(i9, C0017d.m62A(l7.longValue())));
                                i14++;
                                i10 = i8;
                                i11 = i7;
                                stack2 = stack3;
                                i13 = 1;
                            }
                        }
                    }
                    i7 = i11;
                    i8 = i10;
                    i14++;
                    i10 = i8;
                    i11 = i7;
                    stack2 = stack3;
                    i13 = 1;
                }
            }
            i9++;
            stack2 = stack2;
        }
        if (aVar.m4539a() && (interfaceC1929d = (InterfaceC1929d) this.f6333a) != null) {
            C1258o c1258o = (C1258o) interfaceC1929d;
            C1245b c1245b = c1258o.f6211a.get();
            if (c1245b != null && this == c1245b.getEditorLanguage().mo4416a() && c1258o.f6213c != c1118x0) {
                c1258o.f6213c = c1118x0;
                c1258o.m3560a(new RunnableC1869e(3, c1258o));
            }
        }
        return arrayList;
    }

    @Override // p156t4.AbstractC1927b
    /* renamed from: k */
    public final void mo4537k(C2230i c2230i) {
        ArrayList arrayList = c2230i.f10133c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C2030n.a aVar = this.f10068h;
                ReentrantLock reentrantLock = aVar.f9215a;
                reentrantLock.lock();
                HashMap hashMap = aVar.f9216b;
                try {
                    C1176g c1176g = (C1176g) hashMap.get(str);
                    if (c1176g != null) {
                        int i7 = c1176g.f5761a - 1;
                        c1176g.f5761a = i7;
                        if (i7 <= 0) {
                            hashMap.remove(str);
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [v4.m] */
    @Override // p156t4.AbstractC1927b
    /* renamed from: l */
    public final void mo4538l(C2230i c2230i) {
        Object computeIfAbsent;
        ArrayList arrayList = c2230i.f10133c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C2030n.a aVar = this.f10068h;
                ReentrantLock reentrantLock = aVar.f9215a;
                reentrantLock.lock();
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    HashMap hashMap = aVar.f9216b;
                    if (i7 >= 24) {
                        computeIfAbsent = hashMap.computeIfAbsent(str, new Function() { // from class: v4.m
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new C1176g(0);
                            }
                        });
                        ((C1176g) computeIfAbsent).f5761a++;
                    } else {
                        C1176g c1176g = (C1176g) hashMap.get(str);
                        if (c1176g == null) {
                            c1176g = new C1176g(0);
                            hashMap.put(str, c1176g);
                        }
                        c1176g.f5761a++;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0055  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m5403m(p156t4.C1928c r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p191y1.C2224c.m5403m(t4.c):java.util.ArrayList");
    }

    /* renamed from: o */
    public final C1928c m5404o(C0642f c0642f, Object obj) {
        int i7;
        ArrayList arrayList = new ArrayList();
        C2230i c2230i = new C2230i();
        int i8 = ((C2230i) obj).f10131a;
        if (i8 == 0) {
            i7 = m5405p(c0642f, 0, arrayList, c2230i);
        } else if (i8 == 1) {
            char c7 = 0;
            char c8 = 0;
            int i9 = 0;
            while (true) {
                if ((c7 != ']' || c8 != ']') && i9 < c0642f.f3160e) {
                    char charAt = c0642f.charAt(i9);
                    i9++;
                    char c9 = c8;
                    c8 = charAt;
                    c7 = c9;
                }
            }
            int i10 = (c7 == ']' && c8 == ']') ? 87 : 86;
            arrayList.add(Long.valueOf(C0017d.m68G(i10, 0)));
            long m68G = C0017d.m68G(i10, i9);
            i7 = ((int) (m68G >> 32)) == 0 ? m5405p(c0642f, C0017d.m62A(m68G), arrayList, c2230i) : 1;
        } else {
            i7 = 0;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Long.valueOf(C0017d.m68G(1, 0)));
        }
        c2230i.f10131a = i7;
        return new C1928c(c2230i, arrayList);
    }

    /* renamed from: p */
    public final int m5405p(C0642f c0642f, int i7, ArrayList arrayList, C2230i c2230i) {
        C2226e c2226e;
        int m5410a;
        synchronized (this) {
            c2226e = this.f10067g.get();
            if (c2226e == null) {
                c2226e = new C2226e(new StringReader(""));
                this.f10067g.set(c2226e);
            }
        }
        c2226e.f10087a = new StringReader(c0642f.toString());
        c2226e.f10095i = false;
        c2226e.f10092f = 0;
        c2226e.f10091e = 0;
        c2226e.f10093g = 0;
        c2226e.f10094h = 0;
        c2226e.f10096j = 0;
        c2226e.f10097k = 0;
        c2226e.f10089c = 0;
        if (c2226e.f10090d.length > 16384) {
            c2226e.f10090d = new char[16384];
        }
        c2226e.f10097k = i7;
        do {
            try {
                m5410a = c2226e.m5410a();
                if (m5410a == 92) {
                    return 0;
                }
                arrayList.add(Long.valueOf(C0017d.m68G(C1686g.m4108c(m5410a), c2226e.f10097k)));
                if (m5410a == 59 || m5410a == 60) {
                    c2230i.f10132b = true;
                }
                if (m5410a == 89) {
                    char[] cArr = c2226e.f10090d;
                    int i8 = c2226e.f10093g;
                    String str = new String(cArr, i8, c2226e.f10091e - i8);
                    if (c2230i.f10133c == null) {
                        c2230i.f10133c = new ArrayList();
                    }
                    c2230i.f10133c.add(str);
                }
            } catch (IOException unused) {
                return 0;
            }
        } while (m5410a != 88);
        return 87;
    }
}
