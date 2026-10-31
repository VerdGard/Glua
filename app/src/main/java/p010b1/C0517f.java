package p010b1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.AbstractC0585f;
import p018c1.C0592m;
import p035e1.C0953e;
import p043f1.C1156a;
import p043f1.C1159d;
import p051g1.C1203l;
import p059h1.AbstractC1284b;
import p083k1.C1449c;

/* renamed from: b1.f */
/* loaded from: classes.dex */
public final class C0517f implements InterfaceC0515d, AbstractC0580a.a, InterfaceC0521j {

    /* renamed from: a */
    public final Path f2583a;

    /* renamed from: b */
    public final Paint f2584b;

    /* renamed from: c */
    public final String f2585c;

    /* renamed from: d */
    public final ArrayList f2586d;

    /* renamed from: e */
    public final AbstractC0585f f2587e;

    /* renamed from: f */
    public final AbstractC0580a<Integer, Integer> f2588f;

    /* renamed from: g */
    public C0592m f2589g;

    /* renamed from: h */
    public final C0020g f2590h;

    public C0517f(C0020g c0020g, AbstractC1284b abstractC1284b, C1203l c1203l) {
        C1159d c1159d;
        Path path = new Path();
        this.f2583a = path;
        this.f2584b = new Paint(1);
        this.f2586d = new ArrayList();
        this.f2585c = c1203l.f5902c;
        this.f2590h = c0020g;
        C1156a c1156a = c1203l.f5903d;
        if (c1156a == null || (c1159d = c1203l.f5904e) == null) {
            this.f2587e = null;
            this.f2588f = null;
            return;
        }
        path.setFillType(c1203l.f5901b);
        AbstractC0580a<?, ?> mo1994a = c1156a.mo1994a();
        this.f2587e = (AbstractC0585f) mo1994a;
        mo1994a.m2026a(this);
        abstractC1284b.m3597d(mo1994a);
        AbstractC0580a<Integer, Integer> mo1994a2 = c1159d.mo1994a();
        this.f2588f = mo1994a2;
        mo1994a2.m2026a(this);
        abstractC1284b.m3597d(mo1994a2);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2590h.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        AbstractC0580a abstractC0580a;
        if (t7 == InterfaceC0025l.f68a) {
            abstractC0580a = this.f2587e;
        } else {
            if (t7 != InterfaceC0025l.f71d) {
                if (t7 == InterfaceC0025l.f91x) {
                    this.f2589g = c1449c == null ? null : new C0592m(c1449c);
                    return;
                }
                return;
            }
            abstractC0580a = this.f2588f;
        }
        abstractC0580a.m2034i(c1449c);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            InterfaceC0513b interfaceC0513b = list2.get(i7);
            if (interfaceC0513b instanceof InterfaceC0523l) {
                this.f2586d.add((InterfaceC0523l) interfaceC0513b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0515d
    /* renamed from: e */
    public final void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        Paint paint = this.f2584b;
        paint.setColor(((Integer) this.f2587e.mo2030e()).intValue());
        int i8 = 0;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((((i7 / 255.0f) * this.f2588f.mo2030e().intValue()) / 100.0f) * 255.0f))));
        C0592m c0592m = this.f2589g;
        if (c0592m != null) {
            paint.setColorFilter((ColorFilter) c0592m.mo2030e());
        }
        Path path = this.f2583a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f2586d;
            if (i8 >= arrayList.size()) {
                canvas.drawPath(path, paint);
                C0017d.m96u();
                return;
            } else {
                path.addPath(((InterfaceC0523l) arrayList.get(i8)).mo1833f(), matrix);
                i8++;
            }
        }
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2585c;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        Path path = this.f2583a;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2586d;
            if (i7 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC0523l) arrayList.get(i7)).mo1833f(), matrix);
                i7++;
            }
        }
    }
}
