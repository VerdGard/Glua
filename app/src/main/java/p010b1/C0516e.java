package p010b1;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.AbstractC0585f;
import p035e1.C0953e;
import p051g1.C1192a;
import p059h1.AbstractC1284b;
import p075j1.C1403d;
import p083k1.C1449c;

/* renamed from: b1.e */
/* loaded from: classes.dex */
public final class C0516e implements InterfaceC0523l, AbstractC0580a.a, InterfaceC0521j {

    /* renamed from: a */
    public final Path f2575a = new Path();

    /* renamed from: b */
    public final String f2576b;

    /* renamed from: c */
    public final C0020g f2577c;

    /* renamed from: d */
    public final AbstractC0585f f2578d;

    /* renamed from: e */
    public final AbstractC0580a<?, PointF> f2579e;

    /* renamed from: f */
    public final C1192a f2580f;

    /* renamed from: g */
    public C0529r f2581g;

    /* renamed from: h */
    public boolean f2582h;

    public C0516e(C0020g c0020g, AbstractC1284b abstractC1284b, C1192a c1192a) {
        this.f2576b = c1192a.f5852a;
        this.f2577c = c0020g;
        AbstractC0580a<?, ?> mo1994a = c1192a.f5854c.mo1994a();
        this.f2578d = (AbstractC0585f) mo1994a;
        AbstractC0580a<PointF, PointF> mo1994a2 = c1192a.f5853b.mo1994a();
        this.f2579e = mo1994a2;
        this.f2580f = c1192a;
        abstractC1284b.m3597d(mo1994a);
        abstractC1284b.m3597d(mo1994a2);
        mo1994a.m2026a(this);
        mo1994a2.m2026a(this);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2582h = false;
        this.f2577c.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        AbstractC0580a abstractC0580a;
        if (t7 == InterfaceC0025l.f74g) {
            abstractC0580a = this.f2578d;
        } else if (t7 != InterfaceC0025l.f75h) {
            return;
        } else {
            abstractC0580a = this.f2579e;
        }
        abstractC0580a.m2034i(c1449c);
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
                    this.f2581g = c0529r;
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
        float f7;
        float f8;
        float f9;
        boolean z6 = this.f2582h;
        Path path = this.f2575a;
        if (z6) {
            return path;
        }
        path.reset();
        PointF pointF = (PointF) this.f2578d.mo2030e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        boolean z7 = this.f2580f.f5855d;
        float f14 = -f11;
        path.moveTo(0.0f, f14);
        if (z7) {
            float f15 = 0.0f - f12;
            float f16 = -f10;
            f7 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f7, f16, 0.0f);
            float f17 = f13 + 0.0f;
            path.cubicTo(f16, f17, f15, f11, 0.0f, f11);
            f9 = f12 + 0.0f;
            f8 = f17;
        } else {
            float f18 = f12 + 0.0f;
            f7 = 0.0f - f13;
            path.cubicTo(f18, f14, f10, f7, f10, 0.0f);
            float f19 = f13 + 0.0f;
            path.cubicTo(f10, f19, f18, f11, 0.0f, f11);
            f10 = -f10;
            f8 = f19;
            f9 = 0.0f - f12;
        }
        path.cubicTo(f9, f11, f10, f8, f10, 0.0f);
        path.cubicTo(f10, f7, f9, f14, 0.0f, f14);
        PointF mo2030e = this.f2579e.mo2030e();
        path.offset(mo2030e.x, mo2030e.y);
        path.close();
        C1403d.m3755b(path, this.f2581g);
        this.f2582h = true;
        return path;
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2576b;
    }
}
