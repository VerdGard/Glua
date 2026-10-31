package p193y3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$styleable;
import p002a1.C0017d;
import p162u2.C1969a;

/* renamed from: y3.i */
/* loaded from: classes.dex */
public final class C2240i {

    /* renamed from: a */
    public final C1969a f10186a;

    /* renamed from: b */
    public final C1969a f10187b;

    /* renamed from: c */
    public final C1969a f10188c;

    /* renamed from: d */
    public final C1969a f10189d;

    /* renamed from: e */
    public final InterfaceC2234c f10190e;

    /* renamed from: f */
    public final InterfaceC2234c f10191f;

    /* renamed from: g */
    public final InterfaceC2234c f10192g;

    /* renamed from: h */
    public final InterfaceC2234c f10193h;

    /* renamed from: i */
    public final C2236e f10194i;

    /* renamed from: j */
    public final C2236e f10195j;

    /* renamed from: k */
    public final C2236e f10196k;

    /* renamed from: l */
    public final C2236e f10197l;

    public C2240i() {
        this.f10186a = new C2239h();
        this.f10187b = new C2239h();
        this.f10188c = new C2239h();
        this.f10189d = new C2239h();
        this.f10190e = new C2232a(0.0f);
        this.f10191f = new C2232a(0.0f);
        this.f10192g = new C2232a(0.0f);
        this.f10193h = new C2232a(0.0f);
        this.f10194i = new C2236e();
        this.f10195j = new C2236e();
        this.f10196k = new C2236e();
        this.f10197l = new C2236e();
    }

    /* renamed from: a */
    public static a m5432a(Context context, int i7, int i8, C2232a c2232a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i8 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i8);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R$styleable.f3752z);
        try {
            int i9 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i10 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i9);
            int i11 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i9);
            int i12 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i9);
            int i13 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i9);
            InterfaceC2234c m5434c = m5434c(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, c2232a);
            InterfaceC2234c m5434c2 = m5434c(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, m5434c);
            InterfaceC2234c m5434c3 = m5434c(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, m5434c);
            InterfaceC2234c m5434c4 = m5434c(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, m5434c);
            InterfaceC2234c m5434c5 = m5434c(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, m5434c);
            a aVar = new a();
            C1969a m94s = C0017d.m94s(i10);
            aVar.f10198a = m94s;
            float m5436b = a.m5436b(m94s);
            if (m5436b != -1.0f) {
                aVar.m5440e(m5436b);
            }
            aVar.f10202e = m5434c2;
            C1969a m94s2 = C0017d.m94s(i11);
            aVar.f10199b = m94s2;
            float m5436b2 = a.m5436b(m94s2);
            if (m5436b2 != -1.0f) {
                aVar.m5441f(m5436b2);
            }
            aVar.f10203f = m5434c3;
            C1969a m94s3 = C0017d.m94s(i12);
            aVar.f10200c = m94s3;
            float m5436b3 = a.m5436b(m94s3);
            if (m5436b3 != -1.0f) {
                aVar.m5439d(m5436b3);
            }
            aVar.f10204g = m5434c4;
            C1969a m94s4 = C0017d.m94s(i13);
            aVar.f10201d = m94s4;
            float m5436b4 = a.m5436b(m94s4);
            if (m5436b4 != -1.0f) {
                aVar.m5438c(m5436b4);
            }
            aVar.f10205h = m5434c5;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static a m5433b(Context context, AttributeSet attributeSet, int i7, int i8) {
        C2232a c2232a = new C2232a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3744r, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m5432a(context, resourceId, resourceId2, c2232a);
    }

    /* renamed from: c */
    public static InterfaceC2234c m5434c(TypedArray typedArray, int i7, InterfaceC2234c interfaceC2234c) {
        TypedValue peekValue = typedArray.peekValue(i7);
        if (peekValue == null) {
            return interfaceC2234c;
        }
        int i8 = peekValue.type;
        return i8 == 5 ? new C2232a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i8 == 6 ? new C2238g(peekValue.getFraction(1.0f, 1.0f)) : interfaceC2234c;
    }

    /* renamed from: d */
    public final boolean m5435d(RectF rectF) {
        boolean z6 = this.f10197l.getClass().equals(C2236e.class) && this.f10195j.getClass().equals(C2236e.class) && this.f10194i.getClass().equals(C2236e.class) && this.f10196k.getClass().equals(C2236e.class);
        float mo5418a = this.f10190e.mo5418a(rectF);
        return z6 && ((this.f10191f.mo5418a(rectF) > mo5418a ? 1 : (this.f10191f.mo5418a(rectF) == mo5418a ? 0 : -1)) == 0 && (this.f10193h.mo5418a(rectF) > mo5418a ? 1 : (this.f10193h.mo5418a(rectF) == mo5418a ? 0 : -1)) == 0 && (this.f10192g.mo5418a(rectF) > mo5418a ? 1 : (this.f10192g.mo5418a(rectF) == mo5418a ? 0 : -1)) == 0) && ((this.f10187b instanceof C2239h) && (this.f10186a instanceof C2239h) && (this.f10188c instanceof C2239h) && (this.f10189d instanceof C2239h));
    }

    /* renamed from: y3.i$a */
    public static final class a {

        /* renamed from: a */
        public C1969a f10198a;

        /* renamed from: b */
        public C1969a f10199b;

        /* renamed from: c */
        public C1969a f10200c;

        /* renamed from: d */
        public C1969a f10201d;

        /* renamed from: e */
        public InterfaceC2234c f10202e;

        /* renamed from: f */
        public InterfaceC2234c f10203f;

        /* renamed from: g */
        public InterfaceC2234c f10204g;

        /* renamed from: h */
        public InterfaceC2234c f10205h;

        /* renamed from: i */
        public final C2236e f10206i;

        /* renamed from: j */
        public final C2236e f10207j;

        /* renamed from: k */
        public final C2236e f10208k;

        /* renamed from: l */
        public final C2236e f10209l;

        public a() {
            this.f10198a = new C2239h();
            this.f10199b = new C2239h();
            this.f10200c = new C2239h();
            this.f10201d = new C2239h();
            this.f10202e = new C2232a(0.0f);
            this.f10203f = new C2232a(0.0f);
            this.f10204g = new C2232a(0.0f);
            this.f10205h = new C2232a(0.0f);
            this.f10206i = new C2236e();
            this.f10207j = new C2236e();
            this.f10208k = new C2236e();
            this.f10209l = new C2236e();
        }

        /* renamed from: b */
        public static float m5436b(C1969a c1969a) {
            if (c1969a instanceof C2239h) {
                return ((C2239h) c1969a).f10185a;
            }
            if (c1969a instanceof C2235d) {
                return ((C2235d) c1969a).f10138a;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public final C2240i m5437a() {
            return new C2240i(this);
        }

        /* renamed from: c */
        public final void m5438c(float f7) {
            this.f10205h = new C2232a(f7);
        }

        /* renamed from: d */
        public final void m5439d(float f7) {
            this.f10204g = new C2232a(f7);
        }

        /* renamed from: e */
        public final void m5440e(float f7) {
            this.f10202e = new C2232a(f7);
        }

        /* renamed from: f */
        public final void m5441f(float f7) {
            this.f10203f = new C2232a(f7);
        }

        public a(C2240i c2240i) {
            this.f10198a = new C2239h();
            this.f10199b = new C2239h();
            this.f10200c = new C2239h();
            this.f10201d = new C2239h();
            this.f10202e = new C2232a(0.0f);
            this.f10203f = new C2232a(0.0f);
            this.f10204g = new C2232a(0.0f);
            this.f10205h = new C2232a(0.0f);
            this.f10206i = new C2236e();
            this.f10207j = new C2236e();
            this.f10208k = new C2236e();
            this.f10209l = new C2236e();
            this.f10198a = c2240i.f10186a;
            this.f10199b = c2240i.f10187b;
            this.f10200c = c2240i.f10188c;
            this.f10201d = c2240i.f10189d;
            this.f10202e = c2240i.f10190e;
            this.f10203f = c2240i.f10191f;
            this.f10204g = c2240i.f10192g;
            this.f10205h = c2240i.f10193h;
            this.f10206i = c2240i.f10194i;
            this.f10207j = c2240i.f10195j;
            this.f10208k = c2240i.f10196k;
            this.f10209l = c2240i.f10197l;
        }
    }

    public C2240i(a aVar) {
        this.f10186a = aVar.f10198a;
        this.f10187b = aVar.f10199b;
        this.f10188c = aVar.f10200c;
        this.f10189d = aVar.f10201d;
        this.f10190e = aVar.f10202e;
        this.f10191f = aVar.f10203f;
        this.f10192g = aVar.f10204g;
        this.f10193h = aVar.f10205h;
        this.f10194i = aVar.f10206i;
        this.f10195j = aVar.f10207j;
        this.f10196k = aVar.f10208k;
        this.f10197l = aVar.f10209l;
    }
}
