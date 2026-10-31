package p037e3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.activity.C0143v;
import com.google.android.material.R$attr;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p170v3.C2015a;
import p170v3.C2016b;
import p189y.C2213a;
import p193y3.C2237f;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public final class C1137a {

    /* renamed from: u */
    public static final boolean f5650u;

    /* renamed from: v */
    public static final boolean f5651v;

    /* renamed from: a */
    public final MaterialButton f5652a;

    /* renamed from: b */
    public C2240i f5653b;

    /* renamed from: c */
    public int f5654c;

    /* renamed from: d */
    public int f5655d;

    /* renamed from: e */
    public int f5656e;

    /* renamed from: f */
    public int f5657f;

    /* renamed from: g */
    public int f5658g;

    /* renamed from: h */
    public int f5659h;

    /* renamed from: i */
    public PorterDuff.Mode f5660i;

    /* renamed from: j */
    public ColorStateList f5661j;

    /* renamed from: k */
    public ColorStateList f5662k;

    /* renamed from: l */
    public ColorStateList f5663l;

    /* renamed from: m */
    public Drawable f5664m;

    /* renamed from: q */
    public boolean f5668q;

    /* renamed from: s */
    public LayerDrawable f5670s;

    /* renamed from: t */
    public int f5671t;

    /* renamed from: n */
    public boolean f5665n = false;

    /* renamed from: o */
    public boolean f5666o = false;

    /* renamed from: p */
    public boolean f5667p = false;

    /* renamed from: r */
    public boolean f5669r = true;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f5650u = true;
        f5651v = i7 <= 22;
    }

    public C1137a(MaterialButton materialButton, C2240i c2240i) {
        this.f5652a = materialButton;
        this.f5653b = c2240i;
    }

    /* renamed from: a */
    public final InterfaceC2244m m3316a() {
        LayerDrawable layerDrawable = this.f5670s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC2244m) (this.f5670s.getNumberOfLayers() > 2 ? this.f5670s.getDrawable(2) : this.f5670s.getDrawable(1));
    }

    /* renamed from: b */
    public final C2237f m3317b(boolean z6) {
        LayerDrawable layerDrawable = this.f5670s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2237f) (f5650u ? (LayerDrawable) ((InsetDrawable) this.f5670s.getDrawable(0)).getDrawable() : this.f5670s).getDrawable(!z6 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m3318c(C2240i c2240i) {
        this.f5653b = c2240i;
        if (!f5651v || this.f5666o) {
            if (m3317b(false) != null) {
                m3317b(false).setShapeAppearanceModel(c2240i);
            }
            if (m3317b(true) != null) {
                m3317b(true).setShapeAppearanceModel(c2240i);
            }
            if (m3316a() != null) {
                m3316a().setShapeAppearanceModel(c2240i);
                return;
            }
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        MaterialButton materialButton = this.f5652a;
        int m2849f = C0946x.e.m2849f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int m2848e = C0946x.e.m2848e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        m3320e();
        C0946x.e.m2854k(materialButton, m2849f, paddingTop, m2848e, paddingBottom);
    }

    /* renamed from: d */
    public final void m3319d(int i7, int i8) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        MaterialButton materialButton = this.f5652a;
        int m2849f = C0946x.e.m2849f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int m2848e = C0946x.e.m2848e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f5656e;
        int i10 = this.f5657f;
        this.f5657f = i8;
        this.f5656e = i7;
        if (!this.f5666o) {
            m3320e();
        }
        C0946x.e.m2854k(materialButton, m2849f, (paddingTop + i7) - i9, m2848e, (paddingBottom + i8) - i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* renamed from: e */
    public final void m3320e() {
        InsetDrawable insetDrawable;
        C2237f c2237f = new C2237f(this.f5653b);
        MaterialButton materialButton = this.f5652a;
        c2237f.m5426i(materialButton.getContext());
        C2213a.b.m5372h(c2237f, this.f5661j);
        PorterDuff.Mode mode = this.f5660i;
        if (mode != null) {
            C2213a.b.m5373i(c2237f, mode);
        }
        float f7 = this.f5659h;
        ColorStateList colorStateList = this.f5662k;
        c2237f.f10154c.f10173k = f7;
        c2237f.invalidateSelf();
        C2237f.b bVar = c2237f.f10154c;
        if (bVar.f10166d != colorStateList) {
            bVar.f10166d = colorStateList;
            c2237f.onStateChange(c2237f.getState());
        }
        C2237f c2237f2 = new C2237f(this.f5653b);
        c2237f2.setTint(0);
        float f8 = this.f5659h;
        int m400B = this.f5665n ? C0143v.m400B(materialButton, R$attr.colorSurface) : 0;
        c2237f2.f10154c.f10173k = f8;
        c2237f2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(m400B);
        C2237f.b bVar2 = c2237f2.f10154c;
        if (bVar2.f10166d != valueOf) {
            bVar2.f10166d = valueOf;
            c2237f2.onStateChange(c2237f2.getState());
        }
        if (f5650u) {
            C2237f c2237f3 = new C2237f(this.f5653b);
            this.f5664m = c2237f3;
            C2213a.b.m5371g(c2237f3, -1);
            ?? rippleDrawable = new RippleDrawable(C2016b.m4910a(this.f5663l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2237f2, c2237f}), this.f5654c, this.f5656e, this.f5655d, this.f5657f), this.f5664m);
            this.f5670s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C2015a c2015a = new C2015a(new C2015a.a(new C2237f(this.f5653b)));
            this.f5664m = c2015a;
            C2213a.b.m5372h(c2015a, C2016b.m4910a(this.f5663l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2237f2, c2237f, this.f5664m});
            this.f5670s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f5654c, this.f5656e, this.f5655d, this.f5657f);
        }
        materialButton.setInternalBackground(insetDrawable);
        C2237f m3317b = m3317b(false);
        if (m3317b != null) {
            m3317b.m5427j(this.f5671t);
            m3317b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m3321f() {
        C2237f m3317b = m3317b(false);
        C2237f m3317b2 = m3317b(true);
        if (m3317b != null) {
            float f7 = this.f5659h;
            ColorStateList colorStateList = this.f5662k;
            m3317b.f10154c.f10173k = f7;
            m3317b.invalidateSelf();
            C2237f.b bVar = m3317b.f10154c;
            if (bVar.f10166d != colorStateList) {
                bVar.f10166d = colorStateList;
                m3317b.onStateChange(m3317b.getState());
            }
            if (m3317b2 != null) {
                float f8 = this.f5659h;
                int m400B = this.f5665n ? C0143v.m400B(this.f5652a, R$attr.colorSurface) : 0;
                m3317b2.f10154c.f10173k = f8;
                m3317b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m400B);
                C2237f.b bVar2 = m3317b2.f10154c;
                if (bVar2.f10166d != valueOf) {
                    bVar2.f10166d = valueOf;
                    m3317b2.onStateChange(m3317b2.getState());
                }
            }
        }
    }
}
