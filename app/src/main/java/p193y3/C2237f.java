package p193y3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.activity.C0143v;
import java.util.BitSet;
import p026d0.C0874b;
import p109n3.C1643a;
import p181x.C2152a;
import p185x3.C2191a;
import p189y.InterfaceC2214b;
import p193y3.C2241j;
import p193y3.C2243l;

/* renamed from: y3.f */
/* loaded from: classes.dex */
public class C2237f extends Drawable implements InterfaceC2214b, InterfaceC2244m {

    /* renamed from: L1 */
    public static final Paint f10139L1;

    /* renamed from: A1 */
    public final Region f10140A1;

    /* renamed from: B1 */
    public C2240i f10141B1;

    /* renamed from: C1 */
    public final Paint f10142C1;

    /* renamed from: D1 */
    public final Paint f10143D1;

    /* renamed from: E1 */
    public final C2191a f10144E1;

    /* renamed from: F1 */
    public final a f10145F1;

    /* renamed from: G1 */
    public final C2241j f10146G1;

    /* renamed from: H1 */
    public PorterDuffColorFilter f10147H1;

    /* renamed from: I1 */
    public PorterDuffColorFilter f10148I1;

    /* renamed from: J1 */
    public final RectF f10149J1;

    /* renamed from: K1 */
    public final boolean f10150K1;

    /* renamed from: X */
    public boolean f10151X;

    /* renamed from: Y */
    public final Matrix f10152Y;

    /* renamed from: Z */
    public final Path f10153Z;

    /* renamed from: c */
    public b f10154c;

    /* renamed from: e */
    public final C2243l.f[] f10155e;

    /* renamed from: m */
    public final C2243l.f[] f10156m;

    /* renamed from: s */
    public final BitSet f10157s;

    /* renamed from: w1 */
    public final Path f10158w1;

    /* renamed from: x1 */
    public final RectF f10159x1;

    /* renamed from: y1 */
    public final RectF f10160y1;

    /* renamed from: z1 */
    public final Region f10161z1;

    /* renamed from: y3.f$a */
    public class a {
        public a() {
        }
    }

    /* renamed from: y3.f$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public C2240i f10163a;

        /* renamed from: b */
        public C1643a f10164b;

        /* renamed from: c */
        public ColorStateList f10165c;

        /* renamed from: d */
        public ColorStateList f10166d;

        /* renamed from: e */
        public final ColorStateList f10167e;

        /* renamed from: f */
        public ColorStateList f10168f;

        /* renamed from: g */
        public PorterDuff.Mode f10169g;

        /* renamed from: h */
        public Rect f10170h;

        /* renamed from: i */
        public final float f10171i;

        /* renamed from: j */
        public float f10172j;

        /* renamed from: k */
        public float f10173k;

        /* renamed from: l */
        public int f10174l;

        /* renamed from: m */
        public float f10175m;

        /* renamed from: n */
        public float f10176n;

        /* renamed from: o */
        public final float f10177o;

        /* renamed from: p */
        public final int f10178p;

        /* renamed from: q */
        public int f10179q;

        /* renamed from: r */
        public int f10180r;

        /* renamed from: s */
        public int f10181s;

        /* renamed from: t */
        public final boolean f10182t;

        /* renamed from: u */
        public final Paint.Style f10183u;

        public b(b bVar) {
            this.f10165c = null;
            this.f10166d = null;
            this.f10167e = null;
            this.f10168f = null;
            this.f10169g = PorterDuff.Mode.SRC_IN;
            this.f10170h = null;
            this.f10171i = 1.0f;
            this.f10172j = 1.0f;
            this.f10174l = 255;
            this.f10175m = 0.0f;
            this.f10176n = 0.0f;
            this.f10177o = 0.0f;
            this.f10178p = 0;
            this.f10179q = 0;
            this.f10180r = 0;
            this.f10181s = 0;
            this.f10182t = false;
            this.f10183u = Paint.Style.FILL_AND_STROKE;
            this.f10163a = bVar.f10163a;
            this.f10164b = bVar.f10164b;
            this.f10173k = bVar.f10173k;
            this.f10165c = bVar.f10165c;
            this.f10166d = bVar.f10166d;
            this.f10169g = bVar.f10169g;
            this.f10168f = bVar.f10168f;
            this.f10174l = bVar.f10174l;
            this.f10171i = bVar.f10171i;
            this.f10180r = bVar.f10180r;
            this.f10178p = bVar.f10178p;
            this.f10182t = bVar.f10182t;
            this.f10172j = bVar.f10172j;
            this.f10175m = bVar.f10175m;
            this.f10176n = bVar.f10176n;
            this.f10177o = bVar.f10177o;
            this.f10179q = bVar.f10179q;
            this.f10181s = bVar.f10181s;
            this.f10167e = bVar.f10167e;
            this.f10183u = bVar.f10183u;
            if (bVar.f10170h != null) {
                this.f10170h = new Rect(bVar.f10170h);
            }
        }

        public b(C2240i c2240i) {
            this.f10165c = null;
            this.f10166d = null;
            this.f10167e = null;
            this.f10168f = null;
            this.f10169g = PorterDuff.Mode.SRC_IN;
            this.f10170h = null;
            this.f10171i = 1.0f;
            this.f10172j = 1.0f;
            this.f10174l = 255;
            this.f10175m = 0.0f;
            this.f10176n = 0.0f;
            this.f10177o = 0.0f;
            this.f10178p = 0;
            this.f10179q = 0;
            this.f10180r = 0;
            this.f10181s = 0;
            this.f10182t = false;
            this.f10183u = Paint.Style.FILL_AND_STROKE;
            this.f10163a = c2240i;
            this.f10164b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2237f c2237f = new C2237f(this);
            c2237f.f10151X = true;
            return c2237f;
        }
    }

    static {
        Paint paint = new Paint(1);
        f10139L1 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2237f() {
        this(new C2240i());
    }

    public C2237f(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(C2240i.m5433b(context, attributeSet, i7, i8).m5437a());
    }

    public C2237f(b bVar) {
        this.f10155e = new C2243l.f[4];
        this.f10156m = new C2243l.f[4];
        this.f10157s = new BitSet(8);
        this.f10152Y = new Matrix();
        this.f10153Z = new Path();
        this.f10158w1 = new Path();
        this.f10159x1 = new RectF();
        this.f10160y1 = new RectF();
        this.f10161z1 = new Region();
        this.f10140A1 = new Region();
        Paint paint = new Paint(1);
        this.f10142C1 = paint;
        Paint paint2 = new Paint(1);
        this.f10143D1 = paint2;
        this.f10144E1 = new C2191a();
        this.f10146G1 = Looper.getMainLooper().getThread() == Thread.currentThread() ? C2241j.a.f10222a : new C2241j();
        this.f10149J1 = new RectF();
        this.f10150K1 = true;
        this.f10154c = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m5430m();
        m5429l(getState());
        this.f10145F1 = new a();
    }

    public C2237f(C2240i c2240i) {
        this(new b(c2240i));
    }

    /* renamed from: b */
    public final void m5420b(Path path, RectF rectF) {
        C2241j c2241j = this.f10146G1;
        b bVar = this.f10154c;
        c2241j.m5442a(bVar.f10163a, bVar.f10172j, rectF, this.f10145F1, path);
        if (this.f10154c.f10171i != 1.0f) {
            Matrix matrix = this.f10152Y;
            matrix.reset();
            float f7 = this.f10154c.f10171i;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f10149J1, true);
    }

    /* renamed from: c */
    public final PorterDuffColorFilter m5421c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z6) {
        int color;
        int m5422d;
        if (colorStateList == null || mode == null) {
            return (!z6 || (m5422d = m5422d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(m5422d, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z6) {
            colorForState = m5422d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: d */
    public final int m5422d(int i7) {
        int i8;
        b bVar = this.f10154c;
        float f7 = bVar.f10176n + bVar.f10177o + bVar.f10175m;
        C1643a c1643a = bVar.f10164b;
        if (c1643a == null || !c1643a.f7474a) {
            return i7;
        }
        if (!(C2152a.m5266e(i7, 255) == c1643a.f7477d)) {
            return i7;
        }
        float min = (c1643a.f7478e <= 0.0f || f7 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f7 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i7);
        int m417O = C0143v.m417O(min, C2152a.m5266e(i7, 255), c1643a.f7475b);
        if (min > 0.0f && (i8 = c1643a.f7476c) != 0) {
            m417O = C2152a.m5264c(C2152a.m5266e(i8, C1643a.f7473f), m417O);
        }
        return C2152a.m5266e(m417O, alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        if (((r0.f10163a.m5435d(m5425h()) || r3.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p193y3.C2237f.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void m5423e(Canvas canvas) {
        if (this.f10157s.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i7 = this.f10154c.f10180r;
        Path path = this.f10153Z;
        C2191a c2191a = this.f10144E1;
        if (i7 != 0) {
            canvas.drawPath(path, c2191a.f9930a);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            C2243l.f fVar = this.f10155e[i8];
            int i9 = this.f10154c.f10179q;
            Matrix matrix = C2243l.f.f10247b;
            fVar.mo5444a(matrix, c2191a, i9, canvas);
            this.f10156m[i8].mo5444a(matrix, c2191a, this.f10154c.f10179q, canvas);
        }
        if (this.f10150K1) {
            b bVar = this.f10154c;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f10181s)) * bVar.f10180r);
            b bVar2 = this.f10154c;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f10181s)) * bVar2.f10180r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f10139L1);
            canvas.translate(sin, cos);
        }
    }

    /* renamed from: f */
    public final void m5424f(Canvas canvas, Paint paint, Path path, C2240i c2240i, RectF rectF) {
        if (!c2240i.m5435d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo5418a = c2240i.f10191f.mo5418a(rectF) * this.f10154c.f10172j;
            canvas.drawRoundRect(rectF, mo5418a, mo5418a, paint);
        }
    }

    /* renamed from: g */
    public void mo2064g(Canvas canvas) {
        Paint paint = this.f10143D1;
        Path path = this.f10158w1;
        C2240i c2240i = this.f10141B1;
        RectF rectF = this.f10160y1;
        rectF.set(m5425h());
        Paint.Style style = this.f10154c.f10183u;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m5424f(canvas, paint, path, c2240i, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10154c.f10174l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f10154c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f10154c;
        if (bVar.f10178p == 2) {
            return;
        }
        if (bVar.f10163a.m5435d(m5425h())) {
            outline.setRoundRect(getBounds(), this.f10154c.f10163a.f10190e.mo5418a(m5425h()) * this.f10154c.f10172j);
            return;
        }
        RectF m5425h = m5425h();
        Path path = this.f10153Z;
        m5420b(path, m5425h);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i7 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f10154c.f10170h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f10161z1;
        region.set(bounds);
        RectF m5425h = m5425h();
        Path path = this.f10153Z;
        m5420b(path, m5425h);
        Region region2 = this.f10140A1;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final RectF m5425h() {
        RectF rectF = this.f10159x1;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: i */
    public final void m5426i(Context context) {
        this.f10154c.f10164b = new C1643a(context);
        m5431n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f10151X = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f10154c.f10168f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f10154c.f10167e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f10154c.f10166d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f10154c.f10165c) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public final void m5427j(float f7) {
        b bVar = this.f10154c;
        if (bVar.f10176n != f7) {
            bVar.f10176n = f7;
            m5431n();
        }
    }

    /* renamed from: k */
    public final void m5428k(ColorStateList colorStateList) {
        b bVar = this.f10154c;
        if (bVar.f10165c != colorStateList) {
            bVar.f10165c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public final boolean m5429l(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f10154c.f10165c == null || color2 == (colorForState2 = this.f10154c.f10165c.getColorForState(iArr, (color2 = (paint2 = this.f10142C1).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f10154c.f10166d == null || color == (colorForState = this.f10154c.f10166d.getColorForState(iArr, (color = (paint = this.f10143D1).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: m */
    public final boolean m5430m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f10147H1;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10148I1;
        b bVar = this.f10154c;
        this.f10147H1 = m5421c(bVar.f10168f, bVar.f10169g, this.f10142C1, true);
        b bVar2 = this.f10154c;
        this.f10148I1 = m5421c(bVar2.f10167e, bVar2.f10169g, this.f10143D1, false);
        b bVar3 = this.f10154c;
        if (bVar3.f10182t) {
            this.f10144E1.m5323a(bVar3.f10168f.getColorForState(getState(), 0));
        }
        return (C0874b.m2562a(porterDuffColorFilter, this.f10147H1) && C0874b.m2562a(porterDuffColorFilter2, this.f10148I1)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10154c = new b(this.f10154c);
        return this;
    }

    /* renamed from: n */
    public final void m5431n() {
        b bVar = this.f10154c;
        float f7 = bVar.f10176n + bVar.f10177o;
        bVar.f10179q = (int) Math.ceil(0.75f * f7);
        this.f10154c.f10180r = (int) Math.ceil(f7 * 0.25f);
        m5430m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f10151X = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p131q3.C1760p.b
    public boolean onStateChange(int[] iArr) {
        boolean z6 = m5429l(iArr) || m5430m();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        b bVar = this.f10154c;
        if (bVar.f10174l != i7) {
            bVar.f10174l = i7;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10154c.getClass();
        super.invalidateSelf();
    }

    @Override // p193y3.InterfaceC2244m
    public final void setShapeAppearanceModel(C2240i c2240i) {
        this.f10154c.f10163a = c2240i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10154c.f10168f = colorStateList;
        m5430m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f10154c;
        if (bVar.f10169g != mode) {
            bVar.f10169g = mode;
            m5430m();
            super.invalidateSelf();
        }
    }
}
