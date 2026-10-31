package p010b1;

import android.ext.C0091c;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p035e1.C0953e;
import p051g1.C1199h;
import p059h1.AbstractC1284b;
import p075j1.C1403d;
import p083k1.C1449c;
import p120p.C1686g;

/* renamed from: b1.m */
/* loaded from: classes.dex */
public final class C0524m implements InterfaceC0523l, AbstractC0580a.a, InterfaceC0521j {

    /* renamed from: a */
    public final Path f2621a = new Path();

    /* renamed from: b */
    public final String f2622b;

    /* renamed from: c */
    public final C0020g f2623c;

    /* renamed from: d */
    public final int f2624d;

    /* renamed from: e */
    public final C0582c f2625e;

    /* renamed from: f */
    public final AbstractC0580a<?, PointF> f2626f;

    /* renamed from: g */
    public final C0582c f2627g;

    /* renamed from: h */
    public final C0582c f2628h;

    /* renamed from: i */
    public final C0582c f2629i;

    /* renamed from: j */
    public final C0582c f2630j;

    /* renamed from: k */
    public final C0582c f2631k;

    /* renamed from: l */
    public C0529r f2632l;

    /* renamed from: m */
    public boolean f2633m;

    public C0524m(C0020g c0020g, AbstractC1284b abstractC1284b, C1199h c1199h) {
        AbstractC0580a<Float, Float> abstractC0580a;
        this.f2623c = c0020g;
        this.f2622b = c1199h.f5880a;
        int i7 = c1199h.f5881b;
        this.f2624d = i7;
        AbstractC0580a<?, ?> mo1994a = c1199h.f5882c.mo1994a();
        this.f2625e = (C0582c) mo1994a;
        AbstractC0580a<PointF, PointF> mo1994a2 = c1199h.f5883d.mo1994a();
        this.f2626f = mo1994a2;
        AbstractC0580a<?, ?> mo1994a3 = c1199h.f5884e.mo1994a();
        this.f2627g = (C0582c) mo1994a3;
        AbstractC0580a<?, ?> mo1994a4 = c1199h.f5886g.mo1994a();
        this.f2629i = (C0582c) mo1994a4;
        AbstractC0580a<?, ?> mo1994a5 = c1199h.f5888i.mo1994a();
        this.f2631k = (C0582c) mo1994a5;
        if (i7 == 1) {
            this.f2628h = (C0582c) c1199h.f5885f.mo1994a();
            abstractC0580a = c1199h.f5887h.mo1994a();
        } else {
            abstractC0580a = null;
            this.f2628h = null;
        }
        C0582c c0582c = (C0582c) abstractC0580a;
        this.f2630j = c0582c;
        abstractC1284b.m3597d(mo1994a);
        abstractC1284b.m3597d(mo1994a2);
        abstractC1284b.m3597d(mo1994a3);
        abstractC1284b.m3597d(mo1994a4);
        abstractC1284b.m3597d(mo1994a5);
        if (i7 == 1) {
            abstractC1284b.m3597d(this.f2628h);
            abstractC1284b.m3597d(c0582c);
        }
        mo1994a.m2026a(this);
        mo1994a2.m2026a(this);
        mo1994a3.m2026a(this);
        mo1994a4.m2026a(this);
        mo1994a5.m2026a(this);
        if (i7 == 1) {
            mo1994a4.m2026a(this);
            mo1994a5.m2026a(this);
        }
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2633m = false;
        this.f2623c.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        AbstractC0580a abstractC0580a;
        C0582c c0582c;
        if (t7 == InterfaceC0025l.f82o) {
            abstractC0580a = this.f2625e;
        } else if (t7 == InterfaceC0025l.f83p) {
            abstractC0580a = this.f2627g;
        } else {
            if (t7 != InterfaceC0025l.f75h) {
                if (t7 != InterfaceC0025l.f84q || (c0582c = this.f2628h) == null) {
                    if (t7 == InterfaceC0025l.f85r) {
                        abstractC0580a = this.f2629i;
                    } else if (t7 != InterfaceC0025l.f86s || (c0582c = this.f2630j) == null) {
                        if (t7 != InterfaceC0025l.f87t) {
                            return;
                        } else {
                            abstractC0580a = this.f2631k;
                        }
                    }
                }
                c0582c.m2034i(c1449c);
                return;
            }
            abstractC0580a = this.f2626f;
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
                    this.f2632l = c0529r;
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
        float cos;
        float f8;
        double d7;
        float f9;
        C0524m c0524m;
        Path path;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Path path2;
        float f15;
        float f16;
        float f17;
        int i7;
        AbstractC0580a<?, PointF> abstractC0580a;
        double d8;
        double d9;
        float f18;
        double d10;
        boolean z6 = this.f2633m;
        Path path3 = this.f2621a;
        if (z6) {
            return path3;
        }
        path3.reset();
        int m4108c = C1686g.m4108c(this.f2624d);
        AbstractC0580a<?, PointF> abstractC0580a2 = this.f2626f;
        C0582c c0582c = this.f2631k;
        C0582c c0582c2 = this.f2629i;
        C0582c c0582c3 = this.f2627g;
        C0582c c0582c4 = this.f2625e;
        if (m4108c != 0) {
            if (m4108c == 1) {
                int floor = (int) Math.floor(((Float) c0582c4.mo2030e()).floatValue());
                double radians = Math.toRadians((c0582c3 == null ? 0.0d : ((Float) c0582c3.mo2030e()).floatValue()) - 90.0d);
                double d11 = floor;
                float floatValue = ((Float) c0582c.mo2030e()).floatValue() / 100.0f;
                float floatValue2 = ((Float) c0582c2.mo2030e()).floatValue();
                double d12 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d12);
                float sin = (float) (Math.sin(radians) * d12);
                path3.moveTo(cos2, sin);
                double d13 = (float) (6.283185307179586d / d11);
                double d14 = radians + d13;
                double ceil = Math.ceil(d11);
                int i8 = 0;
                double d15 = d13;
                while (i8 < ceil) {
                    float cos3 = (float) (Math.cos(d14) * d12);
                    float sin2 = (float) (Math.sin(d14) * d12);
                    if (floatValue != 0.0f) {
                        double d16 = d12;
                        i7 = i8;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        abstractC0580a = abstractC0580a2;
                        d8 = d14;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f19 = floatValue2 * floatValue * 0.25f;
                        d9 = d15;
                        f18 = sin2;
                        d10 = d16;
                        path3.cubicTo(cos2 - (cos4 * f19), sin - (sin3 * f19), (((float) Math.cos(atan22)) * f19) + cos3, (f19 * ((float) Math.sin(atan22))) + sin2, cos3, f18);
                    } else {
                        i7 = i8;
                        abstractC0580a = abstractC0580a2;
                        d8 = d14;
                        d9 = d15;
                        f18 = sin2;
                        d10 = d12;
                        path3.lineTo(cos3, f18);
                    }
                    double d17 = d8 + d9;
                    sin = f18;
                    d12 = d10;
                    d15 = d9;
                    abstractC0580a2 = abstractC0580a;
                    d14 = d17;
                    cos2 = cos3;
                    i8 = i7 + 1;
                }
                PointF mo2030e = abstractC0580a2.mo2030e();
                path3.offset(mo2030e.x, mo2030e.y);
                path3.close();
            }
            c0524m = this;
            path = path3;
        } else {
            AbstractC0580a<?, PointF> abstractC0580a3 = abstractC0580a2;
            float floatValue3 = ((Float) c0582c4.mo2030e()).floatValue();
            double radians2 = Math.toRadians((c0582c3 == null ? 0.0d : ((Float) c0582c3.mo2030e()).floatValue()) - 90.0d);
            double d18 = floatValue3;
            float f20 = (float) (6.283185307179586d / d18);
            float f21 = f20 / 2.0f;
            float f22 = floatValue3 - ((int) floatValue3);
            if (f22 != 0.0f) {
                radians2 += (1.0f - f22) * f21;
            }
            float floatValue4 = ((Float) c0582c2.mo2030e()).floatValue();
            float floatValue5 = ((Float) this.f2628h.mo2030e()).floatValue();
            C0582c c0582c5 = this.f2630j;
            float floatValue6 = c0582c5 != null ? ((Float) c0582c5.mo2030e()).floatValue() / 100.0f : 0.0f;
            float floatValue7 = c0582c != null ? ((Float) c0582c.mo2030e()).floatValue() / 100.0f : 0.0f;
            if (f22 != 0.0f) {
                float m227e = C0091c.m227e(floatValue4, floatValue5, f22, floatValue5);
                double d19 = m227e;
                f7 = floatValue5;
                cos = (float) (Math.cos(radians2) * d19);
                float sin4 = (float) (d19 * Math.sin(radians2));
                path3.moveTo(cos, sin4);
                f8 = sin4;
                d7 = radians2 + ((f20 * f22) / 2.0f);
                f9 = m227e;
            } else {
                f7 = floatValue5;
                double d20 = floatValue4;
                cos = (float) (Math.cos(radians2) * d20);
                float sin5 = (float) (d20 * Math.sin(radians2));
                path3.moveTo(cos, sin5);
                f8 = sin5;
                d7 = radians2 + f21;
                f9 = 0.0f;
            }
            double ceil2 = Math.ceil(d18) * 2.0d;
            double d21 = 2.0d;
            int i9 = 0;
            double d22 = d7;
            boolean z7 = false;
            while (true) {
                double d23 = i9;
                if (d23 >= ceil2) {
                    break;
                }
                float f23 = z7 ? floatValue4 : f7;
                if (f9 == 0.0f || d23 != ceil2 - d21) {
                    f10 = f9;
                    f11 = f21;
                } else {
                    f10 = f9;
                    f11 = (f20 * f22) / 2.0f;
                }
                if (f9 == 0.0f || d23 != ceil2 - 1.0d) {
                    f12 = f20;
                    f13 = f21;
                } else {
                    f12 = f20;
                    f13 = f21;
                    f23 = f10;
                }
                double d24 = f23;
                AbstractC0580a<?, PointF> abstractC0580a4 = abstractC0580a3;
                float cos5 = (float) (Math.cos(d22) * d24);
                float sin6 = (float) (d24 * Math.sin(d22));
                if (floatValue6 == 0.0f && floatValue7 == 0.0f) {
                    path3.lineTo(cos5, sin6);
                    path2 = path3;
                    f17 = f11;
                    f14 = sin6;
                    f15 = f7;
                    f16 = floatValue4;
                } else {
                    float f24 = floatValue4;
                    float f25 = f8;
                    double atan23 = (float) (Math.atan2(f8, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f26 = f11;
                    f14 = sin6;
                    path2 = path3;
                    double atan24 = (float) (Math.atan2(sin6, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin8 = (float) Math.sin(atan24);
                    float f27 = z7 ? floatValue6 : floatValue7;
                    float f28 = z7 ? floatValue7 : floatValue6;
                    float f29 = (z7 ? f7 : f24) * f27 * 0.47829f;
                    float f30 = cos6 * f29;
                    float f31 = f29 * sin7;
                    float f32 = (z7 ? f24 : f7) * f28 * 0.47829f;
                    float f33 = cos7 * f32;
                    float f34 = f32 * sin8;
                    if (f22 != 0.0f) {
                        if (i9 == 0) {
                            f30 *= f22;
                            f31 *= f22;
                        } else if (d23 == ceil2 - 1.0d) {
                            f33 *= f22;
                            f34 *= f22;
                        }
                    }
                    f15 = f7;
                    f16 = f24;
                    path2.cubicTo(cos - f30, f25 - f31, cos5 + f33, f14 + f34, cos5, f14);
                    f17 = f26;
                }
                d22 += f17;
                z7 = !z7;
                i9++;
                d21 = 2.0d;
                cos = cos5;
                f7 = f15;
                floatValue4 = f16;
                f9 = f10;
                f20 = f12;
                f21 = f13;
                abstractC0580a3 = abstractC0580a4;
                f8 = f14;
                path3 = path2;
            }
            c0524m = this;
            PointF mo2030e2 = abstractC0580a3.mo2030e();
            path = path3;
            path.offset(mo2030e2.x, mo2030e2.y);
            path.close();
        }
        path.close();
        C1403d.m3755b(path, c0524m.f2632l);
        c0524m.f2633m = true;
        return path;
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f2622b;
    }
}
