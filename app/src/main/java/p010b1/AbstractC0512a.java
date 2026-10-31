package p010b1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p018c1.C0592m;
import p035e1.C0953e;
import p043f1.C1157b;
import p043f1.C1159d;
import p059h1.AbstractC1284b;
import p075j1.C1403d;
import p083k1.C1449c;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0512a implements AbstractC0580a.a, InterfaceC0521j, InterfaceC0515d {

    /* renamed from: e */
    public final C0020g f2556e;

    /* renamed from: g */
    public final float[] f2558g;

    /* renamed from: h */
    public final Paint f2559h;

    /* renamed from: i */
    public final C0582c f2560i;

    /* renamed from: j */
    public final AbstractC0580a<?, Integer> f2561j;

    /* renamed from: k */
    public final ArrayList f2562k;

    /* renamed from: l */
    public final C0582c f2563l;

    /* renamed from: m */
    public C0592m f2564m;

    /* renamed from: a */
    public final PathMeasure f2552a = new PathMeasure();

    /* renamed from: b */
    public final Path f2553b = new Path();

    /* renamed from: c */
    public final Path f2554c = new Path();

    /* renamed from: d */
    public final RectF f2555d = new RectF();

    /* renamed from: f */
    public final ArrayList f2557f = new ArrayList();

    /* renamed from: b1.a$a */
    public static final class a {

        /* renamed from: a */
        public final ArrayList f2565a = new ArrayList();

        /* renamed from: b */
        public final C0529r f2566b;

        public a(C0529r c0529r) {
            this.f2566b = c0529r;
        }
    }

    public AbstractC0512a(C0020g c0020g, AbstractC1284b abstractC1284b, Paint.Cap cap, Paint.Join join, C1159d c1159d, C1157b c1157b, List<C1157b> list, C1157b c1157b2) {
        Paint paint = new Paint(1);
        this.f2559h = paint;
        this.f2556e = c0020g;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        this.f2561j = c1159d.mo1994a();
        this.f2560i = (C0582c) c1157b.mo1994a();
        this.f2563l = (C0582c) (c1157b2 == null ? null : c1157b2.mo1994a());
        this.f2562k = new ArrayList(list.size());
        this.f2558g = new float[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.f2562k.add(list.get(i7).mo1994a());
        }
        abstractC1284b.m3597d(this.f2561j);
        abstractC1284b.m3597d(this.f2560i);
        for (int i8 = 0; i8 < this.f2562k.size(); i8++) {
            abstractC1284b.m3597d((AbstractC0580a) this.f2562k.get(i8));
        }
        C0582c c0582c = this.f2563l;
        if (c0582c != null) {
            abstractC1284b.m3597d(c0582c);
        }
        this.f2561j.m2026a(this);
        this.f2560i.m2026a(this);
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((AbstractC0580a) this.f2562k.get(i9)).m2026a(this);
        }
        C0582c c0582c2 = this.f2563l;
        if (c0582c2 != null) {
            c0582c2.m2026a(this);
        }
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2556e.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public <T> void mo1827b(T t7, C1449c c1449c) {
        AbstractC0580a abstractC0580a;
        if (t7 == InterfaceC0025l.f71d) {
            abstractC0580a = this.f2561j;
        } else {
            if (t7 != InterfaceC0025l.f78k) {
                if (t7 == InterfaceC0025l.f91x) {
                    this.f2564m = c1449c == null ? null : new C0592m(c1449c);
                    return;
                }
                return;
            }
            abstractC0580a = this.f2560i;
        }
        abstractC0580a.m2034i(c1449c);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        C0529r c0529r = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC0513b interfaceC0513b = (InterfaceC0513b) arrayList2.get(size);
            if (interfaceC0513b instanceof C0529r) {
                C0529r c0529r2 = (C0529r) interfaceC0513b;
                if (c0529r2.f2660b == 2) {
                    c0529r = c0529r2;
                }
            }
        }
        if (c0529r != null) {
            c0529r.m1838b(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f2557f;
            if (size2 < 0) {
                break;
            }
            InterfaceC0513b interfaceC0513b2 = list2.get(size2);
            if (interfaceC0513b2 instanceof C0529r) {
                C0529r c0529r3 = (C0529r) interfaceC0513b2;
                if (c0529r3.f2660b == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(c0529r3);
                    c0529r3.m1838b(this);
                    aVar = aVar2;
                }
            }
            if (interfaceC0513b2 instanceof InterfaceC0523l) {
                if (aVar == null) {
                    aVar = new a(c0529r);
                }
                aVar.f2565a.add((InterfaceC0523l) interfaceC0513b2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0515d
    /* renamed from: e */
    public void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        float[] fArr;
        AbstractC0512a abstractC0512a = this;
        float f7 = 100.0f;
        Paint paint = abstractC0512a.f2559h;
        boolean z6 = false;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((((i7 / 255.0f) * abstractC0512a.f2561j.mo2030e().intValue()) / 100.0f) * 255.0f))));
        paint.setStrokeWidth(C1403d.m3757d(matrix) * ((Float) abstractC0512a.f2560i.mo2030e()).floatValue());
        if (paint.getStrokeWidth() <= 0.0f) {
            C0017d.m96u();
            return;
        }
        ArrayList arrayList = abstractC0512a.f2562k;
        float f8 = 1.0f;
        if (!arrayList.isEmpty()) {
            float m3757d = C1403d.m3757d(matrix);
            int i8 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = abstractC0512a.f2558g;
                if (i8 >= size) {
                    break;
                }
                float floatValue = ((Float) ((AbstractC0580a) arrayList.get(i8)).mo2030e()).floatValue();
                fArr[i8] = floatValue;
                if (i8 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i8] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i8] = 0.1f;
                }
                fArr[i8] = fArr[i8] * m3757d;
                i8++;
            }
            C0582c c0582c = abstractC0512a.f2563l;
            paint.setPathEffect(new DashPathEffect(fArr, c0582c == null ? 0.0f : ((Float) c0582c.mo2030e()).floatValue()));
        }
        C0017d.m96u();
        C0592m c0592m = abstractC0512a.f2564m;
        if (c0592m != null) {
            paint.setColorFilter((ColorFilter) c0592m.mo2030e());
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = abstractC0512a.f2557f;
            if (i9 >= arrayList2.size()) {
                C0017d.m96u();
                return;
            }
            a aVar = (a) arrayList2.get(i9);
            C0529r c0529r = aVar.f2566b;
            Path path = abstractC0512a.f2553b;
            ArrayList arrayList3 = aVar.f2565a;
            if (c0529r != null) {
                path.reset();
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        path.addPath(((InterfaceC0523l) arrayList3.get(size2)).mo1833f(), matrix);
                    }
                }
                PathMeasure pathMeasure = abstractC0512a.f2552a;
                pathMeasure.setPath(path, z6);
                float length = pathMeasure.getLength();
                while (pathMeasure.nextContour()) {
                    length += pathMeasure.getLength();
                }
                C0529r c0529r2 = aVar.f2566b;
                float floatValue2 = (((Float) c0529r2.f2663e.mo2030e()).floatValue() * length) / 360.0f;
                float floatValue3 = ((((Float) c0529r2.f2661c.mo2030e()).floatValue() * length) / f7) + floatValue2;
                float floatValue4 = ((((Float) c0529r2.f2662d.mo2030e()).floatValue() * length) / f7) + floatValue2;
                int size3 = arrayList3.size() - 1;
                float f9 = 0.0f;
                while (size3 >= 0) {
                    Path path2 = abstractC0512a.f2554c;
                    path2.set(((InterfaceC0523l) arrayList3.get(size3)).mo1833f());
                    path2.transform(matrix);
                    pathMeasure.setPath(path2, z6);
                    float length2 = pathMeasure.getLength();
                    if (floatValue4 > length) {
                        float f10 = floatValue4 - length;
                        if (f10 < f9 + length2 && f9 < f10) {
                            C1403d.m3754a(path2, floatValue3 > length ? (floatValue3 - length) / length2 : 0.0f, Math.min(f10 / length2, f8), 0.0f);
                            canvas.drawPath(path2, paint);
                            f9 += length2;
                            size3--;
                            abstractC0512a = this;
                            z6 = false;
                            f8 = 1.0f;
                        }
                    }
                    float f11 = f9 + length2;
                    if (f11 < floatValue3 || f9 > floatValue4) {
                        f9 += length2;
                        size3--;
                        abstractC0512a = this;
                        z6 = false;
                        f8 = 1.0f;
                    } else {
                        if (f11 > floatValue4 || floatValue3 >= f9) {
                            C1403d.m3754a(path2, floatValue3 < f9 ? 0.0f : (floatValue3 - f9) / length2, floatValue4 > f11 ? 1.0f : (floatValue4 - f9) / length2, 0.0f);
                            canvas.drawPath(path2, paint);
                            f9 += length2;
                            size3--;
                            abstractC0512a = this;
                            z6 = false;
                            f8 = 1.0f;
                        }
                        canvas.drawPath(path2, paint);
                        f9 += length2;
                        size3--;
                        abstractC0512a = this;
                        z6 = false;
                        f8 = 1.0f;
                    }
                }
                C0017d.m96u();
            } else {
                path.reset();
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    if (size4 < 0) {
                        break;
                    } else {
                        path.addPath(((InterfaceC0523l) arrayList3.get(size4)).mo1833f(), matrix);
                    }
                }
                C0017d.m96u();
                canvas.drawPath(path, paint);
                C0017d.m96u();
            }
            i9++;
            f7 = 100.0f;
            abstractC0512a = this;
            z6 = false;
            f8 = 1.0f;
        }
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C0017d.m74M(c0953e, i7, arrayList, c0953e2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        Path path = this.f2553b;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2557f;
            if (i7 >= arrayList.size()) {
                RectF rectF2 = this.f2555d;
                path.computeBounds(rectF2, false);
                float floatValue = ((Float) this.f2560i.mo2030e()).floatValue() / 2.0f;
                rectF2.set(rectF2.left - floatValue, rectF2.top - floatValue, rectF2.right + floatValue, rectF2.bottom + floatValue);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                C0017d.m96u();
                return;
            }
            a aVar = (a) arrayList.get(i7);
            for (int i8 = 0; i8 < aVar.f2565a.size(); i8++) {
                path.addPath(((InterfaceC0523l) aVar.f2565a.get(i8)).mo1833f(), matrix);
            }
            i7++;
        }
    }
}
