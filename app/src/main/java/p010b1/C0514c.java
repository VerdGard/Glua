package p010b1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0020g;
import p018c1.AbstractC0580a;
import p018c1.C0591l;
import p035e1.C0953e;
import p035e1.InterfaceC0954f;
import p043f1.C1161f;
import p059h1.AbstractC1284b;
import p083k1.C1449c;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public final class C0514c implements InterfaceC0515d, InterfaceC0523l, AbstractC0580a.a, InterfaceC0954f {

    /* renamed from: a */
    public final Matrix f2567a;

    /* renamed from: b */
    public final Path f2568b;

    /* renamed from: c */
    public final RectF f2569c;

    /* renamed from: d */
    public final String f2570d;

    /* renamed from: e */
    public final List<InterfaceC0513b> f2571e;

    /* renamed from: f */
    public final C0020g f2572f;

    /* renamed from: g */
    public ArrayList f2573g;

    /* renamed from: h */
    public final C0591l f2574h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0514c(p002a1.C0020g r7, p059h1.AbstractC1284b r8, p051g1.C1204m r9) {
        /*
            r6 = this;
            java.lang.String r3 = r9.f5905a
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List<g1.b> r9 = r9.f5906b
            int r0 = r9.size()
            r4.<init>(r0)
            r0 = 0
            r1 = 0
        Lf:
            int r2 = r9.size()
            if (r1 >= r2) goto L27
            java.lang.Object r2 = r9.get(r1)
            g1.b r2 = (p051g1.InterfaceC1193b) r2
            b1.b r2 = r2.mo3358a(r7, r8)
            if (r2 == 0) goto L24
            r4.add(r2)
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            int r1 = r9.size()
            if (r0 >= r1) goto L3e
            java.lang.Object r1 = r9.get(r0)
            g1.b r1 = (p051g1.InterfaceC1193b) r1
            boolean r2 = r1 instanceof p043f1.C1161f
            if (r2 == 0) goto L3b
            f1.f r1 = (p043f1.C1161f) r1
            r5 = r1
            goto L40
        L3b:
            int r0 = r0 + 1
            goto L27
        L3e:
            r9 = 0
            r5 = r9
        L40:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b1.C0514c.<init>(a1.g, h1.b, g1.m):void");
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2572f.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        C0591l c0591l = this.f2574h;
        if (c0591l != null) {
            c0591l.m2039c(t7, c1449c);
        }
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        int size = list.size();
        List<InterfaceC0513b> list3 = this.f2571e;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            InterfaceC0513b interfaceC0513b = list3.get(size2);
            interfaceC0513b.mo1828c(arrayList, list3.subList(0, size2));
            arrayList.add(interfaceC0513b);
        }
    }

    /* renamed from: d */
    public final List<InterfaceC0523l> m1832d() {
        if (this.f2573g == null) {
            this.f2573g = new ArrayList();
            int i7 = 0;
            while (true) {
                List<InterfaceC0513b> list = this.f2571e;
                if (i7 >= list.size()) {
                    break;
                }
                InterfaceC0513b interfaceC0513b = list.get(i7);
                if (interfaceC0513b instanceof InterfaceC0523l) {
                    this.f2573g.add((InterfaceC0523l) interfaceC0513b);
                }
                i7++;
            }
        }
        return this.f2573g;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        Matrix matrix2 = this.f2567a;
        matrix2.set(matrix);
        C0591l c0591l = this.f2574h;
        if (c0591l != null) {
            matrix2.preConcat(c0591l.m2040d());
            i7 = (int) ((((c0591l.f2979f.mo2030e().intValue() / 100.0f) * i7) / 255.0f) * 255.0f);
        }
        List<InterfaceC0513b> list = this.f2571e;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC0513b interfaceC0513b = list.get(size);
            if (interfaceC0513b instanceof InterfaceC0515d) {
                ((InterfaceC0515d) interfaceC0513b).mo1829e(canvas, matrix2, i7);
            }
        }
    }

    @Override // p010b1.InterfaceC0523l
    /* renamed from: f */
    public final Path mo1833f() {
        Matrix matrix = this.f2567a;
        matrix.reset();
        C0591l c0591l = this.f2574h;
        if (c0591l != null) {
            matrix.set(c0591l.m2040d());
        }
        Path path = this.f2568b;
        path.reset();
        List<InterfaceC0513b> list = this.f2571e;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC0513b interfaceC0513b = list.get(size);
            if (interfaceC0513b instanceof InterfaceC0523l) {
                path.addPath(((InterfaceC0523l) interfaceC0513b).mo1833f(), matrix);
            }
        }
        return path;
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        String str = this.f2570d;
        if (!c0953e.m2948c(i7, str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c0953e2.getClass();
            C0953e c0953e3 = new C0953e(c0953e2);
            c0953e3.f4918a.add(str);
            if (c0953e.m2946a(i7, str)) {
                C0953e c0953e4 = new C0953e(c0953e3);
                c0953e4.f4919b = this;
                arrayList.add(c0953e4);
            }
            c0953e2 = c0953e3;
        }
        if (!c0953e.m2949d(i7, str)) {
            return;
        }
        int m2947b = c0953e.m2947b(i7, str) + i7;
        int i8 = 0;
        while (true) {
            List<InterfaceC0513b> list = this.f2571e;
            if (i8 >= list.size()) {
                return;
            }
            InterfaceC0513b interfaceC0513b = list.get(i8);
            if (interfaceC0513b instanceof InterfaceC0954f) {
                ((InterfaceC0954f) interfaceC0513b).mo1830g(c0953e, m2947b, arrayList, c0953e2);
            }
            i8++;
        }
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2570d;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        Matrix matrix2 = this.f2567a;
        matrix2.set(matrix);
        C0591l c0591l = this.f2574h;
        if (c0591l != null) {
            matrix2.preConcat(c0591l.m2040d());
        }
        RectF rectF2 = this.f2569c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<InterfaceC0513b> list = this.f2571e;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC0513b interfaceC0513b = list.get(size);
            if (interfaceC0513b instanceof InterfaceC0515d) {
                ((InterfaceC0515d) interfaceC0513b).mo1831h(rectF2, matrix2);
                if (rectF.isEmpty()) {
                    rectF.set(rectF2);
                } else {
                    rectF.set(Math.min(rectF.left, rectF2.left), Math.min(rectF.top, rectF2.top), Math.max(rectF.right, rectF2.right), Math.max(rectF.bottom, rectF2.bottom));
                }
            }
        }
    }

    public C0514c(C0020g c0020g, AbstractC1284b abstractC1284b, String str, ArrayList arrayList, C1161f c1161f) {
        this.f2567a = new Matrix();
        this.f2568b = new Path();
        this.f2569c = new RectF();
        this.f2570d = str;
        this.f2572f = c0020g;
        this.f2571e = arrayList;
        if (c1161f != null) {
            C0591l c0591l = new C0591l(c1161f);
            this.f2574h = c0591l;
            c0591l.m2037a(abstractC1284b);
            c0591l.m2038b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC0513b interfaceC0513b = (InterfaceC0513b) arrayList.get(size);
            if (interfaceC0513b instanceof InterfaceC0520i) {
                arrayList2.add((InterfaceC0520i) interfaceC0513b);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((InterfaceC0520i) arrayList2.get(size2)).mo1836d(arrayList.listIterator(arrayList.size()));
            }
        }
    }
}
