package p010b1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p018c1.AbstractC0580a;
import p018c1.AbstractC0585f;
import p018c1.C0582c;
import p035e1.C0953e;
import p051g1.C1200i;
import p059h1.AbstractC1284b;
import p075j1.C1403d;
import p083k1.C1449c;

/* renamed from: b1.n */
/* loaded from: classes.dex */
public final class C0525n implements AbstractC0580a.a, InterfaceC0521j, InterfaceC0523l {

    /* renamed from: a */
    public final Path f2634a = new Path();

    /* renamed from: b */
    public final RectF f2635b = new RectF();

    /* renamed from: c */
    public final String f2636c;

    /* renamed from: d */
    public final C0020g f2637d;

    /* renamed from: e */
    public final AbstractC0580a<?, PointF> f2638e;

    /* renamed from: f */
    public final AbstractC0585f f2639f;

    /* renamed from: g */
    public final C0582c f2640g;

    /* renamed from: h */
    public C0529r f2641h;

    /* renamed from: i */
    public boolean f2642i;

    public C0525n(C0020g c0020g, AbstractC1284b abstractC1284b, C1200i c1200i) {
        this.f2636c = c1200i.f5889a;
        this.f2637d = c0020g;
        AbstractC0580a<PointF, PointF> mo1994a = c1200i.f5890b.mo1994a();
        this.f2638e = mo1994a;
        AbstractC0580a<?, ?> mo1994a2 = c1200i.f5891c.mo1994a();
        this.f2639f = (AbstractC0585f) mo1994a2;
        AbstractC0580a<?, ?> mo1994a3 = c1200i.f5892d.mo1994a();
        this.f2640g = (C0582c) mo1994a3;
        abstractC1284b.m3597d(mo1994a);
        abstractC1284b.m3597d(mo1994a2);
        abstractC1284b.m3597d(mo1994a3);
        mo1994a.m2026a(this);
        mo1994a2.m2026a(this);
        mo1994a3.m2026a(this);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2642i = false;
        this.f2637d.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i7 >= arrayList.size()) {
                return;
            }
            InterfaceC0513b interfaceC0513b = (InterfaceC0513b) arrayList.get(i7);
            if (interfaceC0513b instanceof C0529r) {
                C0529r c0529r = (C0529r) interfaceC0513b;
                if (c0529r.f2660b == 1) {
                    this.f2641h = c0529r;
                    c0529r.m1838b(this);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0523l
    /* renamed from: f */
    public final Path mo1833f() {
        boolean z6 = this.f2642i;
        Path path = this.f2634a;
        if (z6) {
            return path;
        }
        path.reset();
        PointF pointF = (PointF) this.f2639f.mo2030e();
        float f7 = pointF.x / 2.0f;
        float f8 = pointF.y / 2.0f;
        C0582c c0582c = this.f2640g;
        float floatValue = c0582c == null ? 0.0f : ((Float) c0582c.mo2030e()).floatValue();
        float min = Math.min(f7, f8);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF mo2030e = this.f2638e.mo2030e();
        path.moveTo(mo2030e.x + f7, (mo2030e.y - f8) + floatValue);
        path.lineTo(mo2030e.x + f7, (mo2030e.y + f8) - floatValue);
        RectF rectF = this.f2635b;
        if (floatValue > 0.0f) {
            float f9 = mo2030e.x + f7;
            float f10 = floatValue * 2.0f;
            float f11 = mo2030e.y + f8;
            rectF.set(f9 - f10, f11 - f10, f9, f11);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((mo2030e.x - f7) + floatValue, mo2030e.y + f8);
        if (floatValue > 0.0f) {
            float f12 = mo2030e.x - f7;
            float f13 = mo2030e.y + f8;
            float f14 = floatValue * 2.0f;
            rectF.set(f12, f13 - f14, f14 + f12, f13);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(mo2030e.x - f7, (mo2030e.y - f8) + floatValue);
        if (floatValue > 0.0f) {
            float f15 = mo2030e.x - f7;
            float f16 = mo2030e.y - f8;
            float f17 = floatValue * 2.0f;
            rectF.set(f15, f16, f15 + f17, f17 + f16);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((mo2030e.x + f7) - floatValue, mo2030e.y - f8);
        if (floatValue > 0.0f) {
            float f18 = mo2030e.x + f7;
            float f19 = floatValue * 2.0f;
            float f20 = mo2030e.y - f8;
            rectF.set(f18 - f19, f20, f18, f19 + f20);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        C1403d.m3755b(path, this.f2641h);
        this.f2642i = true;
        return path;
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2636c;
    }
}
