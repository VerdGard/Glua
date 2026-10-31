package p077j3;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: j3.d */
/* loaded from: classes.dex */
public interface InterfaceC1411d {

    /* renamed from: j3.d$a */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b */
        public static final a f6769b = new a();

        /* renamed from: a */
        public final d f6770a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f7, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f8 = dVar3.f6773a;
            float f9 = 1.0f - f7;
            float f10 = (dVar4.f6773a * f7) + (f8 * f9);
            float f11 = dVar3.f6774b;
            float f12 = (dVar4.f6774b * f7) + (f11 * f9);
            float f13 = dVar3.f6775c;
            float f14 = (f7 * dVar4.f6775c) + (f9 * f13);
            d dVar5 = this.f6770a;
            dVar5.f6773a = f10;
            dVar5.f6774b = f12;
            dVar5.f6775c = f14;
            return dVar5;
        }
    }

    /* renamed from: j3.d$b */
    public static class b extends Property<InterfaceC1411d, d> {

        /* renamed from: a */
        public static final b f6771a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(InterfaceC1411d interfaceC1411d) {
            return interfaceC1411d.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(InterfaceC1411d interfaceC1411d, d dVar) {
            interfaceC1411d.setRevealInfo(dVar);
        }
    }

    /* renamed from: j3.d$c */
    public static class c extends Property<InterfaceC1411d, Integer> {

        /* renamed from: a */
        public static final c f6772a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(InterfaceC1411d interfaceC1411d) {
            return Integer.valueOf(interfaceC1411d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(InterfaceC1411d interfaceC1411d, Integer num) {
            interfaceC1411d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: j3.d$d */
    public static class d {

        /* renamed from: a */
        public float f6773a;

        /* renamed from: b */
        public float f6774b;

        /* renamed from: c */
        public float f6775c;

        public d() {
        }

        public d(float f7, float f8, float f9) {
            this.f6773a = f7;
            this.f6774b = f8;
            this.f6775c = f9;
        }
    }

    /* renamed from: a */
    void mo3760a();

    /* renamed from: b */
    void mo3761b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i7);

    void setRevealInfo(d dVar);
}
