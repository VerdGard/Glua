package p174w0;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C2051b extends AbstractC2057h {

    /* renamed from: M1 */
    public static final String[] f9352M1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: N1 */
    public static final b f9353N1;

    /* renamed from: O1 */
    public static final c f9354O1;

    /* renamed from: P1 */
    public static final d f9355P1;

    /* renamed from: Q1 */
    public static final e f9356Q1;

    /* renamed from: R1 */
    public static final f f9357R1;

    /* renamed from: w0.b$a */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public final Rect f9358a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f9358a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f9358a);
            return new PointF(r0.left, r0.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f9358a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* renamed from: w0.b$b */
    public static class b extends Property<i, PointF> {
        public b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f9361a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f9362b = round;
            int i7 = iVar2.f9366f + 1;
            iVar2.f9366f = i7;
            if (i7 == iVar2.f9367g) {
                C2067r.m5126a(iVar2.f9365e, iVar2.f9361a, round, iVar2.f9363c, iVar2.f9364d);
                iVar2.f9366f = 0;
                iVar2.f9367g = 0;
            }
        }
    }

    /* renamed from: w0.b$c */
    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f9363c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f9364d = round;
            int i7 = iVar2.f9367g + 1;
            iVar2.f9367g = i7;
            if (iVar2.f9366f == i7) {
                C2067r.m5126a(iVar2.f9365e, iVar2.f9361a, iVar2.f9362b, iVar2.f9363c, round);
                iVar2.f9366f = 0;
                iVar2.f9367g = 0;
            }
        }
    }

    /* renamed from: w0.b$d */
    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C2067r.m5126a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: w0.b$e */
    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C2067r.m5126a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: w0.b$f */
    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            C2067r.m5126a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* renamed from: w0.b$g */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: w0.b$h */
    public class h extends C2060k {

        /* renamed from: a */
        public boolean f9359a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f9360b;

        public h(ViewGroup viewGroup) {
            this.f9360b = viewGroup;
        }

        @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
        /* renamed from: b */
        public final void mo5086b() {
            C2066q.m5125a(this.f9360b, false);
        }

        @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
        /* renamed from: c */
        public final void mo5087c() {
            C2066q.m5125a(this.f9360b, true);
        }

        @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
        /* renamed from: d */
        public final void mo5088d() {
            C2066q.m5125a(this.f9360b, false);
            this.f9359a = true;
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            if (!this.f9359a) {
                C2066q.m5125a(this.f9360b, false);
            }
            abstractC2057h.mo5117v(this);
        }
    }

    /* renamed from: w0.b$i */
    public static class i {

        /* renamed from: a */
        public int f9361a;

        /* renamed from: b */
        public int f9362b;

        /* renamed from: c */
        public int f9363c;

        /* renamed from: d */
        public int f9364d;

        /* renamed from: e */
        public final View f9365e;

        /* renamed from: f */
        public int f9366f;

        /* renamed from: g */
        public int f9367g;

        public i(View view) {
            this.f9365e = view;
        }
    }

    static {
        new a();
        f9353N1 = new b();
        f9354O1 = new c();
        f9355P1 = new d();
        f9356Q1 = new e();
        f9357R1 = new f();
    }

    /* renamed from: H */
    public final void m5081H(C2064o c2064o) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        View view = c2064o.f9429b;
        if (!C0946x.g.m2860c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c2064o.f9428a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: d */
    public final void mo5082d(C2064o c2064o) {
        m5081H(c2064o);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: g */
    public final void mo5083g(C2064o c2064o) {
        m5081H(c2064o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    @Override // p174w0.AbstractC2057h
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo5084k(android.view.ViewGroup r19, p174w0.C2064o r20, p174w0.C2064o r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p174w0.C2051b.mo5084k(android.view.ViewGroup, w0.o, w0.o):android.animation.Animator");
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: p */
    public final String[] mo5085p() {
        return f9352M1;
    }
}
