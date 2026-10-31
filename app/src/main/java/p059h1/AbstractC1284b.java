package p059h1;

import android.annotation.SuppressLint;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p002a1.C0017d;
import p002a1.C0020g;
import p002a1.C0027n;
import p010b1.InterfaceC0513b;
import p010b1.InterfaceC0515d;
import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p018c1.C0586g;
import p018c1.C0591l;
import p035e1.C0953e;
import p035e1.InterfaceC0954f;
import p043f1.C1161f;
import p051g1.C1197f;
import p075j1.C1402c;
import p083k1.C1449c;
import p089l.C1468b;
import p120p.C1686g;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1284b implements InterfaceC0515d, AbstractC0580a.a, InterfaceC0954f {

    /* renamed from: a */
    public final Path f6361a = new Path();

    /* renamed from: b */
    public final Matrix f6362b = new Matrix();

    /* renamed from: c */
    public final Paint f6363c = new Paint(1);

    /* renamed from: d */
    public final Paint f6364d;

    /* renamed from: e */
    public final Paint f6365e;

    /* renamed from: f */
    public final Paint f6366f;

    /* renamed from: g */
    public final Paint f6367g;

    /* renamed from: h */
    public final RectF f6368h;

    /* renamed from: i */
    public final RectF f6369i;

    /* renamed from: j */
    public final RectF f6370j;

    /* renamed from: k */
    public final RectF f6371k;

    /* renamed from: l */
    public final Matrix f6372l;

    /* renamed from: m */
    public final C0020g f6373m;

    /* renamed from: n */
    public final C1287e f6374n;

    /* renamed from: o */
    public final C0586g f6375o;

    /* renamed from: p */
    public AbstractC1284b f6376p;

    /* renamed from: q */
    public AbstractC1284b f6377q;

    /* renamed from: r */
    public List<AbstractC1284b> f6378r;

    /* renamed from: s */
    public final ArrayList f6379s;

    /* renamed from: t */
    public final C0591l f6380t;

    /* renamed from: u */
    public boolean f6381u;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1284b(C0020g c0020g, C1287e c1287e) {
        Paint paint = new Paint(1);
        this.f6364d = paint;
        Paint paint2 = new Paint(1);
        this.f6365e = paint2;
        Paint paint3 = new Paint(1);
        this.f6366f = paint3;
        Paint paint4 = new Paint();
        this.f6367g = paint4;
        this.f6368h = new RectF();
        this.f6369i = new RectF();
        this.f6370j = new RectF();
        this.f6371k = new RectF();
        this.f6372l = new Matrix();
        this.f6379s = new ArrayList();
        this.f6381u = true;
        this.f6373m = c0020g;
        this.f6374n = c1287e;
        C0090b.m220f(new StringBuilder(), c1287e.f6392c, "#draw");
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setXfermode(c1287e.f6410u == 3 ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        C1161f c1161f = c1287e.f6398i;
        c1161f.getClass();
        C0591l c0591l = new C0591l(c1161f);
        this.f6380t = c0591l;
        c0591l.m2038b(this);
        List<C1197f> list = c1287e.f6397h;
        if (list != null && !list.isEmpty()) {
            C0586g c0586g = new C0586g(list);
            this.f6375o = c0586g;
            for (AbstractC0580a<?, ?> abstractC0580a : (List) c0586g.f2961a) {
                m3597d(abstractC0580a);
                abstractC0580a.m2026a(this);
            }
            for (AbstractC0580a<?, ?> abstractC0580a2 : (List) this.f6375o.f2962b) {
                m3597d(abstractC0580a2);
                abstractC0580a2.m2026a(this);
            }
        }
        C1287e c1287e2 = this.f6374n;
        if (c1287e2.f6409t.isEmpty()) {
            if (true != this.f6381u) {
                this.f6381u = true;
                this.f6373m.invalidateSelf();
                return;
            }
            return;
        }
        C0582c c0582c = new C0582c(0, c1287e2.f6409t);
        c0582c.f2952b = true;
        c0582c.m2026a(new C1283a(this, c0582c));
        boolean z6 = ((Float) c0582c.mo2030e()).floatValue() == 1.0f;
        if (z6 != this.f6381u) {
            this.f6381u = z6;
            this.f6373m.invalidateSelf();
        }
        m3597d(c0582c);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f6373m.invalidateSelf();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: b */
    public <T> void mo1827b(T t7, C1449c c1449c) {
        this.f6380t.m2039c(t7, c1449c);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
    }

    /* renamed from: d */
    public final void m3597d(AbstractC0580a<?, ?> abstractC0580a) {
        this.f6379s.add(abstractC0580a);
    }

    @Override // p010b1.InterfaceC0515d
    @SuppressLint({"WrongConstant"})
    /* renamed from: e */
    public final void mo1829e(Canvas canvas, Matrix matrix, int i7) {
        if (!this.f6381u) {
            C0017d.m96u();
            return;
        }
        if (this.f6378r == null) {
            if (this.f6377q == null) {
                this.f6378r = Collections.emptyList();
            } else {
                this.f6378r = new ArrayList();
                for (AbstractC1284b abstractC1284b = this.f6377q; abstractC1284b != null; abstractC1284b = abstractC1284b.f6377q) {
                    this.f6378r.add(abstractC1284b);
                }
            }
        }
        Matrix matrix2 = this.f6362b;
        matrix2.reset();
        matrix2.set(matrix);
        for (int size = this.f6378r.size() - 1; size >= 0; size--) {
            matrix2.preConcat(this.f6378r.get(size).f6380t.m2040d());
        }
        C0017d.m96u();
        C0591l c0591l = this.f6380t;
        int intValue = (int) ((((i7 / 255.0f) * c0591l.f2979f.mo2030e().intValue()) / 100.0f) * 255.0f);
        boolean z6 = false;
        if ((this.f6376p != null) || m3601l()) {
            RectF rectF = this.f6368h;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo1831h(rectF, matrix2);
            AbstractC1284b abstractC1284b2 = this.f6376p;
            if ((abstractC1284b2 != null) && this.f6374n.f6410u != 3) {
                RectF rectF2 = this.f6370j;
                abstractC1284b2.mo1831h(rectF2, matrix2);
                rectF.set(Math.max(rectF.left, rectF2.left), Math.max(rectF.top, rectF2.top), Math.min(rectF.right, rectF2.right), Math.min(rectF.bottom, rectF2.bottom));
            }
            matrix2.preConcat(c0591l.m2040d());
            RectF rectF3 = this.f6369i;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i8 = 2;
            if (m3601l()) {
                C0586g c0586g = this.f6375o;
                int size2 = ((List) c0586g.f2963c).size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        rectF.set(Math.max(rectF.left, rectF3.left), Math.max(rectF.top, rectF3.top), Math.min(rectF.right, rectF3.right), Math.min(rectF.bottom, rectF3.bottom));
                        break;
                    }
                    C1197f c1197f = (C1197f) ((List) c0586g.f2963c).get(i9);
                    Path path = (Path) ((AbstractC0580a) ((List) c0586g.f2961a).get(i9)).mo2030e();
                    Path path2 = this.f6361a;
                    path2.set(path);
                    path2.transform(matrix2);
                    int m4108c = C1686g.m4108c(c1197f.f5876a);
                    if (m4108c == 1 || m4108c == i8) {
                        break;
                    }
                    RectF rectF4 = this.f6371k;
                    path2.computeBounds(rectF4, z6);
                    if (i9 == 0) {
                        rectF3.set(rectF4);
                    } else {
                        rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                    }
                    i9++;
                    z6 = false;
                    i8 = 2;
                }
            }
            rectF.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            C0017d.m96u();
            canvas.saveLayer(rectF, this.f6363c, 31);
            C0017d.m96u();
            m3599j(canvas);
            mo3600k(canvas, matrix2, intValue);
            C0017d.m96u();
            if (m3601l()) {
                m3598i(canvas, matrix2, 1);
                m3598i(canvas, matrix2, 3);
                m3598i(canvas, matrix2, 2);
            }
            if (this.f6376p != null) {
                canvas.saveLayer(rectF, this.f6366f, 19);
                C0017d.m96u();
                m3599j(canvas);
                this.f6376p.mo1829e(canvas, matrix, intValue);
                canvas.restore();
                C0017d.m96u();
                C0017d.m96u();
            }
            canvas.restore();
        } else {
            matrix2.preConcat(c0591l.m2040d());
            mo3600k(canvas, matrix2, intValue);
        }
        C0017d.m96u();
        C0017d.m96u();
        m3602m();
    }

    @Override // p035e1.InterfaceC0954f
    /* renamed from: g */
    public final void mo1830g(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        C1287e c1287e = this.f6374n;
        if (c0953e.m2948c(i7, c1287e.f6392c)) {
            String str = c1287e.f6392c;
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
            if (c0953e.m2949d(i7, str)) {
                mo3603n(c0953e, c0953e.m2947b(i7, str) + i7, arrayList, c0953e2);
            }
        }
    }

    @Override // p010b1.InterfaceC0513b
    public final String getName() {
        return this.f6374n.f6392c;
    }

    @Override // p010b1.InterfaceC0515d
    /* renamed from: h */
    public void mo1831h(RectF rectF, Matrix matrix) {
        Matrix matrix2 = this.f6372l;
        matrix2.set(matrix);
        matrix2.preConcat(this.f6380t.m2040d());
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: i */
    public final void m3598i(Canvas canvas, Matrix matrix, int i7) {
        Paint paint;
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        boolean z6 = true;
        if (i8 != 1) {
            if (i8 == 2) {
                Log.w("LOTTIE", "Animation contains intersect masks. They are not supported but will be treated like add masks.");
            }
            paint = this.f6364d;
        } else {
            paint = this.f6365e;
        }
        C0586g c0586g = this.f6375o;
        int size = ((List) c0586g.f2963c).size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z6 = false;
                break;
            } else if (((C1197f) ((List) c0586g.f2963c).get(i9)).f5876a == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (z6) {
            canvas.saveLayer(this.f6368h, paint, 19);
            C0017d.m96u();
            m3599j(canvas);
            for (int i10 = 0; i10 < size; i10++) {
                if (((C1197f) ((List) c0586g.f2963c).get(i10)).f5876a == i7) {
                    Path path = (Path) ((AbstractC0580a) ((List) c0586g.f2961a).get(i10)).mo2030e();
                    Path path2 = this.f6361a;
                    path2.set(path);
                    path2.transform(matrix);
                    AbstractC0580a abstractC0580a = (AbstractC0580a) ((List) c0586g.f2962b).get(i10);
                    Paint paint2 = this.f6363c;
                    int alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (((Integer) abstractC0580a.mo2030e()).intValue() * 2.55f));
                    canvas.drawPath(path2, paint2);
                    paint2.setAlpha(alpha);
                }
            }
            canvas.restore();
            C0017d.m96u();
            C0017d.m96u();
        }
    }

    /* renamed from: j */
    public final void m3599j(Canvas canvas) {
        RectF rectF = this.f6368h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6367g);
        C0017d.m96u();
    }

    /* renamed from: k */
    public abstract void mo3600k(Canvas canvas, Matrix matrix, int i7);

    /* renamed from: l */
    public final boolean m3601l() {
        C0586g c0586g = this.f6375o;
        return (c0586g == null || ((List) c0586g.f2961a).isEmpty()) ? false : true;
    }

    /* renamed from: m */
    public final void m3602m() {
        C0027n c0027n = this.f6373m.f46e.f3247a;
        String str = this.f6374n.f6392c;
        if (c0027n.f92a) {
            HashMap hashMap = c0027n.f94c;
            C1402c c1402c = (C1402c) hashMap.get(str);
            if (c1402c == null) {
                c1402c = new C1402c();
                hashMap.put(str, c1402c);
            }
            int i7 = c1402c.f6757a + 1;
            c1402c.f6757a = i7;
            if (i7 == Integer.MAX_VALUE) {
                c1402c.f6757a = i7 / 2;
            }
            if (str.equals("__container")) {
                C1468b c1468b = c0027n.f93b;
                c1468b.getClass();
                C1468b.a aVar = new C1468b.a();
                while (aVar.hasNext()) {
                    ((C0027n.a) aVar.next()).m115a();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo3603n(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
    }

    /* renamed from: o */
    public void mo3604o(float f7) {
        C0591l c0591l = this.f6380t;
        c0591l.f2975b.mo2033h(f7);
        c0591l.f2976c.mo2033h(f7);
        c0591l.f2977d.mo2033h(f7);
        c0591l.f2978e.mo2033h(f7);
        c0591l.f2979f.mo2033h(f7);
        C0582c c0582c = c0591l.f2980g;
        if (c0582c != null) {
            c0582c.mo2033h(f7);
        }
        C0582c c0582c2 = c0591l.f2981h;
        if (c0582c2 != null) {
            c0582c2.mo2033h(f7);
        }
        float f8 = this.f6374n.f6402m;
        if (f8 != 0.0f) {
            f7 /= f8;
        }
        AbstractC1284b abstractC1284b = this.f6376p;
        if (abstractC1284b != null) {
            abstractC1284b.mo3604o(abstractC1284b.f6374n.f6402m * f7);
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f6379s;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((AbstractC0580a) arrayList.get(i7)).mo2033h(f7);
            i7++;
        }
    }
}
