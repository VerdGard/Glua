package p010b1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p018c1.C0591l;
import p035e1.C0953e;
import p043f1.C1161f;
import p051g1.C1201j;
import p059h1.AbstractC1284b;
import p083k1.C1449c;

/* renamed from: b1.o */
/* loaded from: classes.dex */
public final class C0526o implements InterfaceC0515d, InterfaceC0523l, InterfaceC0520i, AbstractC0580a.a, InterfaceC0521j {

    /* renamed from: a */
    public final Matrix f2643a = new Matrix();

    /* renamed from: b */
    public final Path f2644b = new Path();

    /* renamed from: c */
    public final C0020g f2645c;

    /* renamed from: d */
    public final AbstractC1284b f2646d;

    /* renamed from: e */
    public final String f2647e;

    /* renamed from: f */
    public final C0582c f2648f;

    /* renamed from: g */
    public final C0582c f2649g;

    /* renamed from: h */
    public final C0591l f2650h;

    /* renamed from: i */
    public C0514c f2651i;

    public C0526o(C0020g c0020g, AbstractC1284b abstractC1284b, C1201j c1201j) {
        this.f2645c = c0020g;
        this.f2646d = abstractC1284b;
        this.f2647e = c1201j.f5893a;
        AbstractC0580a<Float, Float> mo1994a = c1201j.f5894b.mo1994a();
        this.f2648f = (C0582c) mo1994a;
        abstractC1284b.m3597d(mo1994a);
        mo1994a.m2026a(this);
        AbstractC0580a<Float, Float> mo1994a2 = c1201j.f5895c.mo1994a();
        this.f2649g = (C0582c) mo1994a2;
        abstractC1284b.m3597d(mo1994a2);
        mo1994a2.m2026a(this);
        C1161f c1161f = c1201j.f5896d;
        c1161f.getClass();
        C0591l c0591l = new C0591l(c1161f);
        this.f2650h = c0591l;
        c0591l.m2037a(abstractC1284b);
        c0591l.m2038b(this);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2645c.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        C0582c c0582c;
        if (this.f2650h.m2039c(t7, c1449c)) {
            return;
        }
        if (t7 == InterfaceC0025l.f80m) {
            c0582c = this.f2648f;
        } else if (t7 != InterfaceC0025l.f81n) {
            return;
        } else {
            c0582c = this.f2649g;
        }
        c0582c.m2034i(c1449c);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        this.f2651i.mo1828c(list, list2);
    }

    @Override // p010b1.InterfaceC0520i
    /* renamed from: d */
    public final void mo1836d(ListIterator<InterfaceC0513b> listIterator) {
        if (this.f2651i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f2651i = new C0514c(this.f2645c, this.f2646d, "Repeater", arrayList, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        float floatValue = ((Float) this.f2648f.mo2030e()).floatValue();
        float floatValue2 = ((Float) this.f2649g.mo2030e()).floatValue();
        C0591l c0591l = this.f2650h;
        float floatValue3 = ((Float) c0591l.f2980g.mo2030e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) c0591l.f2981h.mo2030e()).floatValue() / 100.0f;
        int i8 = (int) floatValue;
        while (true) {
            i8--;
            if (i8 < 0) {
                return;
            }
            Matrix matrix2 = this.f2643a;
            matrix2.set(matrix);
            float f7 = i8;
            matrix2.preConcat(c0591l.m2041e(f7 + floatValue2));
            this.f2651i.mo1829e(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f7 / floatValue)) + floatValue3) * i7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0523l
    /* renamed from: f */
    public final Path mo1833f() {
        Path mo1833f = this.f2651i.mo1833f();
        Path path = this.f2644b;
        path.reset();
        float floatValue = ((Float) this.f2648f.mo2030e()).floatValue();
        float floatValue2 = ((Float) this.f2649g.mo2030e()).floatValue();
        int i7 = (int) floatValue;
        while (true) {
            i7--;
            if (i7 < 0) {
                return path;
            }
            Matrix matrix = this.f2643a;
            matrix.set(this.f2650h.m2041e(i7 + floatValue2));
            path.addPath(mo1833f, matrix);
        }
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2647e;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        this.f2651i.mo1831h(rectF, matrix);
    }
}
