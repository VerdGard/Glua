package p018c1;

import android.graphics.Matrix;
import android.graphics.PointF;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p043f1.C1157b;
import p043f1.C1161f;
import p059h1.AbstractC1284b;
import p083k1.C1449c;
import p083k1.C1450d;

/* renamed from: c1.l */
/* loaded from: classes.dex */
public final class C0591l {

    /* renamed from: a */
    public final Matrix f2974a = new Matrix();

    /* renamed from: b */
    public final AbstractC0585f f2975b;

    /* renamed from: c */
    public final AbstractC0580a<?, PointF> f2976c;

    /* renamed from: d */
    public final AbstractC0585f f2977d;

    /* renamed from: e */
    public final C0582c f2978e;

    /* renamed from: f */
    public final AbstractC0580a<Integer, Integer> f2979f;

    /* renamed from: g */
    public final C0582c f2980g;

    /* renamed from: h */
    public final C0582c f2981h;

    public C0591l(C1161f c1161f) {
        this.f2975b = (AbstractC0585f) c1161f.f5712a.mo1994a();
        this.f2976c = c1161f.f5713b.mo1994a();
        this.f2977d = (AbstractC0585f) c1161f.f5714c.mo1994a();
        this.f2978e = (C0582c) c1161f.f5715d.mo1994a();
        this.f2979f = c1161f.f5716e.mo1994a();
        C1157b c1157b = c1161f.f5717f;
        if (c1157b != null) {
            this.f2980g = (C0582c) c1157b.mo1994a();
        } else {
            this.f2980g = null;
        }
        C1157b c1157b2 = c1161f.f5718g;
        if (c1157b2 != null) {
            this.f2981h = (C0582c) c1157b2.mo1994a();
        } else {
            this.f2981h = null;
        }
    }

    /* renamed from: a */
    public final void m2037a(AbstractC1284b abstractC1284b) {
        abstractC1284b.m3597d(this.f2975b);
        abstractC1284b.m3597d(this.f2976c);
        abstractC1284b.m3597d(this.f2977d);
        abstractC1284b.m3597d(this.f2978e);
        abstractC1284b.m3597d(this.f2979f);
        C0582c c0582c = this.f2980g;
        if (c0582c != null) {
            abstractC1284b.m3597d(c0582c);
        }
        C0582c c0582c2 = this.f2981h;
        if (c0582c2 != null) {
            abstractC1284b.m3597d(c0582c2);
        }
    }

    /* renamed from: b */
    public final void m2038b(AbstractC0580a.a aVar) {
        this.f2975b.m2026a(aVar);
        this.f2976c.m2026a(aVar);
        this.f2977d.m2026a(aVar);
        this.f2978e.m2026a(aVar);
        this.f2979f.m2026a(aVar);
        C0582c c0582c = this.f2980g;
        if (c0582c != null) {
            c0582c.m2026a(aVar);
        }
        C0582c c0582c2 = this.f2981h;
        if (c0582c2 != null) {
            c0582c2.m2026a(aVar);
        }
    }

    /* renamed from: c */
    public final <T> boolean m2039c(T t7, C1449c c1449c) {
        AbstractC0580a abstractC0580a;
        C0582c c0582c;
        if (t7 == InterfaceC0025l.f72e) {
            abstractC0580a = this.f2975b;
        } else if (t7 == InterfaceC0025l.f73f) {
            abstractC0580a = this.f2976c;
        } else if (t7 == InterfaceC0025l.f76i) {
            abstractC0580a = this.f2977d;
        } else if (t7 == InterfaceC0025l.f77j) {
            abstractC0580a = this.f2978e;
        } else if (t7 == InterfaceC0025l.f70c) {
            abstractC0580a = this.f2979f;
        } else {
            if (t7 == InterfaceC0025l.f88u && (c0582c = this.f2980g) != null) {
                c0582c.m2034i(c1449c);
                return true;
            }
            if (t7 != InterfaceC0025l.f89v || (abstractC0580a = this.f2981h) == null) {
                return false;
            }
        }
        abstractC0580a.m2034i(c1449c);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Matrix m2040d() {
        Matrix matrix = this.f2974a;
        matrix.reset();
        PointF mo2030e = this.f2976c.mo2030e();
        float f7 = mo2030e.x;
        if (f7 != 0.0f || mo2030e.y != 0.0f) {
            matrix.preTranslate(f7, mo2030e.y);
        }
        float floatValue = ((Float) this.f2978e.mo2030e()).floatValue();
        if (floatValue != 0.0f) {
            matrix.preRotate(floatValue);
        }
        C1450d c1450d = (C1450d) this.f2977d.mo2030e();
        float f8 = c1450d.f6962a;
        float f9 = c1450d.f6963b;
        if (f8 != 1.0f || f9 != 1.0f) {
            matrix.preScale(f8, f9);
        }
        PointF pointF = (PointF) this.f2975b.mo2030e();
        float f10 = pointF.x;
        if (f10 != 0.0f || pointF.y != 0.0f) {
            matrix.preTranslate(-f10, -pointF.y);
        }
        return matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Matrix m2041e(float f7) {
        PointF mo2030e = this.f2976c.mo2030e();
        PointF pointF = (PointF) this.f2975b.mo2030e();
        C1450d c1450d = (C1450d) this.f2977d.mo2030e();
        float floatValue = ((Float) this.f2978e.mo2030e()).floatValue();
        Matrix matrix = this.f2974a;
        matrix.reset();
        matrix.preTranslate(mo2030e.x * f7, mo2030e.y * f7);
        double d7 = f7;
        matrix.preScale((float) Math.pow(c1450d.f6962a, d7), (float) Math.pow(c1450d.f6963b, d7));
        matrix.preRotate(floatValue * f7, pointF.x, pointF.y);
        return matrix;
    }
}
