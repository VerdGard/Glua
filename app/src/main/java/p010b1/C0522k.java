package p010b1;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p018c1.C0591l;
import p051g1.C1198g;
import p120p.C1686g;

@TargetApi(19)
/* renamed from: b1.k */
/* loaded from: classes.dex */
public final class C0522k implements InterfaceC0523l, InterfaceC0520i {

    /* renamed from: a */
    public final Path f2616a = new Path();

    /* renamed from: b */
    public final Path f2617b = new Path();

    /* renamed from: c */
    public final Path f2618c = new Path();

    /* renamed from: d */
    public final ArrayList f2619d = new ArrayList();

    /* renamed from: e */
    public final C1198g f2620e;

    public C0522k(C1198g c1198g) {
        c1198g.getClass();
        this.f2620e = c1198g;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final void m1837a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f2617b;
        path.reset();
        Path path2 = this.f2616a;
        path2.reset();
        ArrayList arrayList = this.f2619d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC0523l interfaceC0523l = (InterfaceC0523l) arrayList.get(size);
            if (interfaceC0523l instanceof C0514c) {
                C0514c c0514c = (C0514c) interfaceC0523l;
                ArrayList arrayList2 = (ArrayList) c0514c.m1832d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path mo1833f = ((InterfaceC0523l) arrayList2.get(size2)).mo1833f();
                    C0591l c0591l = c0514c.f2574h;
                    if (c0591l != null) {
                        matrix2 = c0591l.m2040d();
                    } else {
                        matrix2 = c0514c.f2567a;
                        matrix2.reset();
                    }
                    mo1833f.transform(matrix2);
                    path.addPath(mo1833f);
                }
            } else {
                path.addPath(interfaceC0523l.mo1833f());
            }
        }
        int i7 = 0;
        InterfaceC0523l interfaceC0523l2 = (InterfaceC0523l) arrayList.get(0);
        if (interfaceC0523l2 instanceof C0514c) {
            C0514c c0514c2 = (C0514c) interfaceC0523l2;
            List<InterfaceC0523l> m1832d = c0514c2.m1832d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) m1832d;
                if (i7 >= arrayList3.size()) {
                    break;
                }
                Path mo1833f2 = ((InterfaceC0523l) arrayList3.get(i7)).mo1833f();
                C0591l c0591l2 = c0514c2.f2574h;
                if (c0591l2 != null) {
                    matrix = c0591l2.m2040d();
                } else {
                    matrix = c0514c2.f2567a;
                    matrix.reset();
                }
                mo1833f2.transform(matrix);
                path2.addPath(mo1833f2);
                i7++;
            }
        } else {
            path2.set(interfaceC0523l2.mo1833f());
        }
        this.f2618c.op(path2, path, op);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2619d;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((InterfaceC0523l) arrayList.get(i7)).mo1828c(list, list2);
            i7++;
        }
    }

    @Override // p010b1.InterfaceC0520i
    /* renamed from: d */
    public final void mo1836d(ListIterator<InterfaceC0513b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC0513b previous = listIterator.previous();
            if (previous instanceof InterfaceC0523l) {
                this.f2619d.add((InterfaceC0523l) previous);
                listIterator.remove();
            }
        }
    }

    @Override // p010b1.InterfaceC0523l
    /* renamed from: f */
    public final Path mo1833f() {
        Path.Op op;
        Path path = this.f2618c;
        path.reset();
        int m4108c = C1686g.m4108c(this.f2620e.f5879a);
        if (m4108c == 0) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f2619d;
                if (i7 >= arrayList.size()) {
                    break;
                }
                path.addPath(((InterfaceC0523l) arrayList.get(i7)).mo1833f());
                i7++;
            }
        } else {
            if (m4108c == 1) {
                op = Path.Op.UNION;
            } else if (m4108c == 2) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (m4108c == 3) {
                op = Path.Op.INTERSECT;
            } else if (m4108c == 4) {
                op = Path.Op.XOR;
            }
            m1837a(op);
        }
        return path;
    }
}
