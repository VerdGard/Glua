package p059h1;

import android.ext.C0091c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import com.airbnb.lottie.C0680a;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.C0592m;
import p035e1.C0953e;
import p043f1.C1157b;
import p083k1.C1449c;
import p089l.C1473g;
import p120p.C1686g;

/* renamed from: h1.c */
/* loaded from: classes.dex */
public final class C1285c extends AbstractC1284b {

    /* renamed from: v */
    public AbstractC0580a<Float, Float> f6382v;

    /* renamed from: w */
    public final ArrayList f6383w;

    /* renamed from: x */
    public final RectF f6384x;

    /* renamed from: y */
    public final RectF f6385y;

    public C1285c(C0020g c0020g, C1287e c1287e, List<C1287e> list, C0680a c0680a) {
        super(c0020g, c1287e);
        int i7;
        AbstractC1284b abstractC1284b;
        AbstractC1284b c1285c;
        this.f6383w = new ArrayList();
        this.f6384x = new RectF();
        this.f6385y = new RectF();
        C1157b c1157b = c1287e.f6408s;
        if (c1157b != null) {
            AbstractC0580a<Float, Float> mo1994a = c1157b.mo1994a();
            this.f6382v = mo1994a;
            m3597d(mo1994a);
            this.f6382v.m2026a(this);
        } else {
            this.f6382v = null;
        }
        C1473g c1473g = new C1473g(c0680a.f3254h.size());
        int size = list.size() - 1;
        AbstractC1284b abstractC1284b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C1287e c1287e2 = list.get(size);
            int m4108c = C1686g.m4108c(c1287e2.f6394e);
            if (m4108c == 0) {
                c1285c = new C1285c(c0020g, c1287e2, c0680a.f3249c.get(c1287e2.f6396g), c0680a);
            } else if (m4108c == 1) {
                c1285c = new C1290h(c0020g, c1287e2);
            } else if (m4108c == 2) {
                c1285c = new C1286d(c0020g, c1287e2);
            } else if (m4108c == 3) {
                c1285c = new C1288f(c0020g, c1287e2);
            } else if (m4108c == 4) {
                c1285c = new C1289g(c0020g, c1287e2);
            } else if (m4108c != 5) {
                Log.w("LOTTIE", "Unknown layer type ".concat(C0091c.m234l(c1287e2.f6394e)));
                c1285c = null;
            } else {
                c1285c = new C1291i(c0020g, c1287e2);
            }
            if (c1285c != null) {
                c1473g.m3859g(c1285c.f6374n.f6393d, c1285c);
                if (abstractC1284b2 != null) {
                    abstractC1284b2.f6376p = c1285c;
                    abstractC1284b2 = null;
                } else {
                    this.f6383w.add(0, c1285c);
                    int m4108c2 = C1686g.m4108c(c1287e2.f6410u);
                    if (m4108c2 == 1 || m4108c2 == 2) {
                        abstractC1284b2 = c1285c;
                    }
                }
            }
            size--;
        }
        for (i7 = 0; i7 < c1473g.m3860h(); i7++) {
            AbstractC1284b abstractC1284b3 = (AbstractC1284b) c1473g.m3856d(c1473g.m3858f(i7));
            if (abstractC1284b3 != null && (abstractC1284b = (AbstractC1284b) c1473g.m3856d(abstractC1284b3.f6374n.f6395f)) != null) {
                abstractC1284b3.f6377q = abstractC1284b;
            }
        }
    }

    @Override // p059h1.AbstractC1284b, p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        super.mo1827b(t7, c1449c);
        if (t7 == InterfaceC0025l.f90w) {
            if (c1449c == null) {
                this.f6382v = null;
                return;
            }
            C0592m c0592m = new C0592m(c1449c);
            this.f6382v = c0592m;
            m3597d(c0592m);
        }
    }

    @Override // p059h1.AbstractC1284b, p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        super.mo1831h(rectF, matrix);
        RectF rectF2 = this.f6384x;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f6383w;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((AbstractC1284b) arrayList.get(size)).mo1831h(rectF2, this.f6372l);
            if (rectF.isEmpty()) {
                rectF.set(rectF2);
            } else {
                rectF.set(Math.min(rectF.left, rectF2.left), Math.min(rectF.top, rectF2.top), Math.max(rectF.right, rectF2.right), Math.max(rectF.bottom, rectF2.bottom));
            }
        }
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: k */
    public final void mo3600k(Canvas canvas, Matrix matrix, int i7) {
        canvas.save();
        RectF rectF = this.f6385y;
        C1287e c1287e = this.f6374n;
        rectF.set(0.0f, 0.0f, c1287e.f6404o, c1287e.f6405p);
        matrix.mapRect(rectF);
        ArrayList arrayList = this.f6383w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty() ? canvas.clipRect(rectF) : true) {
                ((AbstractC1284b) arrayList.get(size)).mo1829e(canvas, matrix, i7);
            }
        }
        canvas.restore();
        C0017d.m96u();
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: n */
    public final void mo3603n(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = this.f6383w;
            if (i8 >= arrayList2.size()) {
                return;
            }
            ((AbstractC1284b) arrayList2.get(i8)).mo1830g(c0953e, i7, arrayList, c0953e2);
            i8++;
        }
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: o */
    public final void mo3604o(float f7) {
        super.mo3604o(f7);
        if (this.f6382v != null) {
            f7 = ((long) (this.f6382v.mo2030e().floatValue() * 1000.0f)) / this.f6373m.f46e.m2184b();
        }
        C1287e c1287e = this.f6374n;
        float f8 = c1287e.f6402m;
        if (f8 != 0.0f) {
            f7 /= f8;
        }
        C0680a c0680a = c1287e.f6391b;
        float f9 = f7 - (c1287e.f6403n / (c0680a.f3257k - c0680a.f3256j));
        ArrayList arrayList = this.f6383w;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC1284b) arrayList.get(size)).mo3604o(f9);
            }
        }
    }
}
