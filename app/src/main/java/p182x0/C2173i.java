package p182x0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p089l.C1467a;
import p173w.C2041c;
import p181x.C2155d;
import p189y.C2213a;

/* renamed from: x0.i */
/* loaded from: classes.dex */
public final class C2173i extends AbstractC2172h {

    /* renamed from: y1 */
    public static final PorterDuff.Mode f9819y1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: X */
    public boolean f9820X;

    /* renamed from: Y */
    public boolean f9821Y;

    /* renamed from: Z */
    public final float[] f9822Z;

    /* renamed from: e */
    public g f9823e;

    /* renamed from: m */
    public PorterDuffColorFilter f9824m;

    /* renamed from: s */
    public ColorFilter f9825s;

    /* renamed from: w1 */
    public final Matrix f9826w1;

    /* renamed from: x1 */
    public final Rect f9827x1;

    /* renamed from: x0.i$a */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* renamed from: x0.i$b */
    public static class b extends e {

        /* renamed from: e */
        public C2041c f9828e;

        /* renamed from: f */
        public float f9829f;

        /* renamed from: g */
        public C2041c f9830g;

        /* renamed from: h */
        public float f9831h;

        /* renamed from: i */
        public float f9832i;

        /* renamed from: j */
        public float f9833j;

        /* renamed from: k */
        public float f9834k;

        /* renamed from: l */
        public float f9835l;

        /* renamed from: m */
        public Paint.Cap f9836m;

        /* renamed from: n */
        public Paint.Join f9837n;

        /* renamed from: o */
        public float f9838o;

        public b() {
            this.f9829f = 0.0f;
            this.f9831h = 1.0f;
            this.f9832i = 1.0f;
            this.f9833j = 0.0f;
            this.f9834k = 1.0f;
            this.f9835l = 0.0f;
            this.f9836m = Paint.Cap.BUTT;
            this.f9837n = Paint.Join.MITER;
            this.f9838o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f9829f = 0.0f;
            this.f9831h = 1.0f;
            this.f9832i = 1.0f;
            this.f9833j = 0.0f;
            this.f9834k = 1.0f;
            this.f9835l = 0.0f;
            this.f9836m = Paint.Cap.BUTT;
            this.f9837n = Paint.Join.MITER;
            this.f9838o = 4.0f;
            this.f9828e = bVar.f9828e;
            this.f9829f = bVar.f9829f;
            this.f9831h = bVar.f9831h;
            this.f9830g = bVar.f9830g;
            this.f9853c = bVar.f9853c;
            this.f9832i = bVar.f9832i;
            this.f9833j = bVar.f9833j;
            this.f9834k = bVar.f9834k;
            this.f9835l = bVar.f9835l;
            this.f9836m = bVar.f9836m;
            this.f9837n = bVar.f9837n;
            this.f9838o = bVar.f9838o;
        }

        @Override // p182x0.C2173i.d
        /* renamed from: a */
        public final boolean mo5314a() {
            return this.f9830g.m5059b() || this.f9828e.m5059b();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // p182x0.C2173i.d
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo5315b(int[] r7) {
            /*
                r6 = this;
                w.c r0 = r6.f9830g
                boolean r1 = r0.m5059b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f9310b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f9311c
                if (r1 == r4) goto L1c
                r0.f9311c = r1
                r0 = 1
                goto L1d
            L1c:
                r0 = 0
            L1d:
                w.c r1 = r6.f9828e
                boolean r4 = r1.m5059b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f9310b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f9311c
                if (r7 == r4) goto L36
                r1.f9311c = r7
                goto L37
            L36:
                r2 = 0
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p182x0.C2173i.b.mo5315b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f9832i;
        }

        public int getFillColor() {
            return this.f9830g.f9311c;
        }

        public float getStrokeAlpha() {
            return this.f9831h;
        }

        public int getStrokeColor() {
            return this.f9828e.f9311c;
        }

        public float getStrokeWidth() {
            return this.f9829f;
        }

        public float getTrimPathEnd() {
            return this.f9834k;
        }

        public float getTrimPathOffset() {
            return this.f9835l;
        }

        public float getTrimPathStart() {
            return this.f9833j;
        }

        public void setFillAlpha(float f7) {
            this.f9832i = f7;
        }

        public void setFillColor(int i7) {
            this.f9830g.f9311c = i7;
        }

        public void setStrokeAlpha(float f7) {
            this.f9831h = f7;
        }

        public void setStrokeColor(int i7) {
            this.f9828e.f9311c = i7;
        }

        public void setStrokeWidth(float f7) {
            this.f9829f = f7;
        }

        public void setTrimPathEnd(float f7) {
            this.f9834k = f7;
        }

        public void setTrimPathOffset(float f7) {
            this.f9835l = f7;
        }

        public void setTrimPathStart(float f7) {
            this.f9833j = f7;
        }
    }

    /* renamed from: x0.i$d */
    public static abstract class d {
        /* renamed from: a */
        public boolean mo5314a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5315b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: x0.i$f */
    public static class f {

        /* renamed from: p */
        public static final Matrix f9855p = new Matrix();

        /* renamed from: a */
        public final Path f9856a;

        /* renamed from: b */
        public final Path f9857b;

        /* renamed from: c */
        public final Matrix f9858c;

        /* renamed from: d */
        public Paint f9859d;

        /* renamed from: e */
        public Paint f9860e;

        /* renamed from: f */
        public PathMeasure f9861f;

        /* renamed from: g */
        public final c f9862g;

        /* renamed from: h */
        public float f9863h;

        /* renamed from: i */
        public float f9864i;

        /* renamed from: j */
        public float f9865j;

        /* renamed from: k */
        public float f9866k;

        /* renamed from: l */
        public int f9867l;

        /* renamed from: m */
        public String f9868m;

        /* renamed from: n */
        public Boolean f9869n;

        /* renamed from: o */
        public final C1467a<String, Object> f9870o;

        public f() {
            this.f9858c = new Matrix();
            this.f9863h = 0.0f;
            this.f9864i = 0.0f;
            this.f9865j = 0.0f;
            this.f9866k = 0.0f;
            this.f9867l = 255;
            this.f9868m = null;
            this.f9869n = null;
            this.f9870o = new C1467a<>();
            this.f9862g = new c();
            this.f9856a = new Path();
            this.f9857b = new Path();
        }

        public f(f fVar) {
            this.f9858c = new Matrix();
            this.f9863h = 0.0f;
            this.f9864i = 0.0f;
            this.f9865j = 0.0f;
            this.f9866k = 0.0f;
            this.f9867l = 255;
            this.f9868m = null;
            this.f9869n = null;
            C1467a<String, Object> c1467a = new C1467a<>();
            this.f9870o = c1467a;
            this.f9862g = new c(fVar.f9862g, c1467a);
            this.f9856a = new Path(fVar.f9856a);
            this.f9857b = new Path(fVar.f9857b);
            this.f9863h = fVar.f9863h;
            this.f9864i = fVar.f9864i;
            this.f9865j = fVar.f9865j;
            this.f9866k = fVar.f9866k;
            this.f9867l = fVar.f9867l;
            this.f9868m = fVar.f9868m;
            String str = fVar.f9868m;
            if (str != null) {
                c1467a.put(str, this);
            }
            this.f9869n = fVar.f9869n;
        }

        /* renamed from: a */
        public final void m5317a(c cVar, Matrix matrix, Canvas canvas, int i7, int i8) {
            int i9;
            float f7;
            boolean z6;
            cVar.f9839a.set(matrix);
            Matrix matrix2 = cVar.f9848j;
            Matrix matrix3 = cVar.f9839a;
            matrix3.preConcat(matrix2);
            canvas.save();
            char c7 = 0;
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f9840b;
                if (i10 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    m5317a((c) dVar, matrix3, canvas, i7, i8);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f8 = i7 / this.f9865j;
                    float f9 = i8 / this.f9866k;
                    float min = Math.min(f8, f9);
                    Matrix matrix4 = this.f9858c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f8, f9);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c7], fArr[1]);
                    i9 = i10;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f10 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f10) / max : 0.0f;
                    if (abs != 0.0f) {
                        eVar.getClass();
                        Path path = this.f9856a;
                        path.reset();
                        C2155d.a[] aVarArr = eVar.f9851a;
                        if (aVarArr != null) {
                            C2155d.a.m5279b(aVarArr, path);
                        }
                        Path path2 = this.f9857b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.f9853c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f11 = bVar.f9833j;
                            if (f11 != 0.0f || bVar.f9834k != 1.0f) {
                                float f12 = bVar.f9835l;
                                float f13 = (f11 + f12) % 1.0f;
                                float f14 = (bVar.f9834k + f12) % 1.0f;
                                if (this.f9861f == null) {
                                    this.f9861f = new PathMeasure();
                                }
                                this.f9861f.setPath(path, false);
                                float length = this.f9861f.getLength();
                                float f15 = f13 * length;
                                float f16 = f14 * length;
                                path.reset();
                                if (f15 > f16) {
                                    this.f9861f.getSegment(f15, length, path, true);
                                    f7 = 0.0f;
                                    this.f9861f.getSegment(0.0f, f16, path, true);
                                } else {
                                    f7 = 0.0f;
                                    this.f9861f.getSegment(f15, f16, path, true);
                                }
                                path.rLineTo(f7, f7);
                            }
                            path2.addPath(path, matrix4);
                            C2041c c2041c = bVar.f9830g;
                            if ((c2041c.f9309a != null) || c2041c.f9311c != 0) {
                                if (this.f9860e == null) {
                                    Paint paint = new Paint(1);
                                    this.f9860e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f9860e;
                                Shader shader = c2041c.f9309a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f9832i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i11 = c2041c.f9311c;
                                    float f17 = bVar.f9832i;
                                    PorterDuff.Mode mode = C2173i.f9819y1;
                                    paint2.setColor((i11 & 16777215) | (((int) (Color.alpha(i11) * f17)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.f9853c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C2041c c2041c2 = bVar.f9828e;
                            if ((c2041c2.f9309a != null) || c2041c2.f9311c != 0) {
                                if (this.f9859d == null) {
                                    z6 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f9859d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z6 = true;
                                }
                                Paint paint4 = this.f9859d;
                                Paint.Join join = bVar.f9837n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f9836m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f9838o);
                                Shader shader2 = c2041c2.f9309a;
                                if (shader2 == null) {
                                    z6 = false;
                                }
                                if (z6) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f9831h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i12 = c2041c2.f9311c;
                                    float f18 = bVar.f9831h;
                                    PorterDuff.Mode mode2 = C2173i.f9819y1;
                                    paint4.setColor((i12 & 16777215) | (((int) (Color.alpha(i12) * f18)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f9829f * abs * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i10 = i9 + 1;
                    c7 = 0;
                }
                i9 = i10;
                i10 = i9 + 1;
                c7 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f9867l;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f9867l = i7;
        }
    }

    /* renamed from: x0.i$g */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f9871a;

        /* renamed from: b */
        public f f9872b;

        /* renamed from: c */
        public ColorStateList f9873c;

        /* renamed from: d */
        public PorterDuff.Mode f9874d;

        /* renamed from: e */
        public boolean f9875e;

        /* renamed from: f */
        public Bitmap f9876f;

        /* renamed from: g */
        public ColorStateList f9877g;

        /* renamed from: h */
        public PorterDuff.Mode f9878h;

        /* renamed from: i */
        public int f9879i;

        /* renamed from: j */
        public boolean f9880j;

        /* renamed from: k */
        public boolean f9881k;

        /* renamed from: l */
        public Paint f9882l;

        public g() {
            this.f9873c = null;
            this.f9874d = C2173i.f9819y1;
            this.f9872b = new f();
        }

        public g(g gVar) {
            this.f9873c = null;
            this.f9874d = C2173i.f9819y1;
            if (gVar != null) {
                this.f9871a = gVar.f9871a;
                f fVar = new f(gVar.f9872b);
                this.f9872b = fVar;
                if (gVar.f9872b.f9860e != null) {
                    fVar.f9860e = new Paint(gVar.f9872b.f9860e);
                }
                if (gVar.f9872b.f9859d != null) {
                    this.f9872b.f9859d = new Paint(gVar.f9872b.f9859d);
                }
                this.f9873c = gVar.f9873c;
                this.f9874d = gVar.f9874d;
                this.f9875e = gVar.f9875e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9871a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C2173i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C2173i(this);
        }
    }

    /* renamed from: x0.i$h */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f9883a;

        public h(Drawable.ConstantState constantState) {
            this.f9883a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f9883a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9883a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C2173i c2173i = new C2173i();
            c2173i.f9818c = (VectorDrawable) this.f9883a.newDrawable();
            return c2173i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C2173i c2173i = new C2173i();
            c2173i.f9818c = (VectorDrawable) this.f9883a.newDrawable(resources);
            return c2173i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2173i c2173i = new C2173i();
            c2173i.f9818c = (VectorDrawable) this.f9883a.newDrawable(resources, theme);
            return c2173i;
        }
    }

    public C2173i() {
        this.f9821Y = true;
        this.f9822Z = new float[9];
        this.f9826w1 = new Matrix();
        this.f9827x1 = new Rect();
        this.f9823e = new g();
    }

    public C2173i(g gVar) {
        this.f9821Y = true;
        this.f9822Z = new float[9];
        this.f9826w1 = new Matrix();
        this.f9827x1 = new Rect();
        this.f9823e = gVar;
        this.f9824m = m5313a(gVar.f9873c, gVar.f9874d);
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m5313a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9818c;
        if (drawable == null) {
            return false;
        }
        C2213a.b.m5366b(drawable);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if ((r5 == r10.getWidth() && r6 == r9.f9876f.getHeight()) == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182x0.C2173i.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.a.m5360a(drawable) : this.f9823e.f9872b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f9823e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.b.m5367c(drawable) : this.f9825s;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9818c != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f9818c.getConstantState());
        }
        this.f9823e.f9871a = getChangingConfigurations();
        return this.f9823e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f9823e.f9872b.f9864i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f9823e.f9872b.f9863h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182x0.C2173i.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9818c;
        return drawable != null ? C2213a.a.m5363d(drawable) : this.f9823e.f9875e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f9823e;
            if (gVar != null) {
                f fVar = gVar.f9872b;
                if (fVar.f9869n == null) {
                    fVar.f9869n = Boolean.valueOf(fVar.f9862g.mo5314a());
                }
                if (fVar.f9869n.booleanValue() || ((colorStateList = this.f9823e.f9873c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f9820X && super.mutate() == this) {
            this.f9823e = new g(this.f9823e);
            this.f9820X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f9823e;
        ColorStateList colorStateList = gVar.f9873c;
        if (colorStateList == null || (mode = gVar.f9874d) == null) {
            z6 = false;
        } else {
            this.f9824m = m5313a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        f fVar = gVar.f9872b;
        if (fVar.f9869n == null) {
            fVar.f9869n = Boolean.valueOf(fVar.f9862g.mo5314a());
        }
        if (fVar.f9869n.booleanValue()) {
            boolean mo5315b = gVar.f9872b.f9862g.mo5315b(iArr);
            gVar.f9881k |= mo5315b;
            if (mo5315b) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f9823e.f9872b.getRootAlpha() != i7) {
            this.f9823e.f9872b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.a.m5364e(drawable, z6);
        } else {
            this.f9823e.f9875e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9825s = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.m5356d(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.b.m5372h(drawable, colorStateList);
            return;
        }
        g gVar = this.f9823e;
        if (gVar.f9873c != colorStateList) {
            gVar.f9873c = colorStateList;
            this.f9824m = m5313a(colorStateList, gVar.f9874d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            C2213a.b.m5373i(drawable, mode);
            return;
        }
        g gVar = this.f9823e;
        if (gVar.f9874d != mode) {
            gVar.f9874d = mode;
            this.f9824m = m5313a(gVar.f9873c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f9818c;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9818c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: x0.i$c */
    public static class c extends d {

        /* renamed from: a */
        public final Matrix f9839a;

        /* renamed from: b */
        public final ArrayList<d> f9840b;

        /* renamed from: c */
        public float f9841c;

        /* renamed from: d */
        public float f9842d;

        /* renamed from: e */
        public float f9843e;

        /* renamed from: f */
        public float f9844f;

        /* renamed from: g */
        public float f9845g;

        /* renamed from: h */
        public float f9846h;

        /* renamed from: i */
        public float f9847i;

        /* renamed from: j */
        public final Matrix f9848j;

        /* renamed from: k */
        public final int f9849k;

        /* renamed from: l */
        public String f9850l;

        public c() {
            this.f9839a = new Matrix();
            this.f9840b = new ArrayList<>();
            this.f9841c = 0.0f;
            this.f9842d = 0.0f;
            this.f9843e = 0.0f;
            this.f9844f = 1.0f;
            this.f9845g = 1.0f;
            this.f9846h = 0.0f;
            this.f9847i = 0.0f;
            this.f9848j = new Matrix();
            this.f9850l = null;
        }

        @Override // p182x0.C2173i.d
        /* renamed from: a */
        public final boolean mo5314a() {
            int i7 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f9840b;
                if (i7 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i7).mo5314a()) {
                    return true;
                }
                i7++;
            }
        }

        @Override // p182x0.C2173i.d
        /* renamed from: b */
        public final boolean mo5315b(int[] iArr) {
            int i7 = 0;
            boolean z6 = false;
            while (true) {
                ArrayList<d> arrayList = this.f9840b;
                if (i7 >= arrayList.size()) {
                    return z6;
                }
                z6 |= arrayList.get(i7).mo5315b(iArr);
                i7++;
            }
        }

        /* renamed from: c */
        public final void m5316c() {
            Matrix matrix = this.f9848j;
            matrix.reset();
            matrix.postTranslate(-this.f9842d, -this.f9843e);
            matrix.postScale(this.f9844f, this.f9845g);
            matrix.postRotate(this.f9841c, 0.0f, 0.0f);
            matrix.postTranslate(this.f9846h + this.f9842d, this.f9847i + this.f9843e);
        }

        public String getGroupName() {
            return this.f9850l;
        }

        public Matrix getLocalMatrix() {
            return this.f9848j;
        }

        public float getPivotX() {
            return this.f9842d;
        }

        public float getPivotY() {
            return this.f9843e;
        }

        public float getRotation() {
            return this.f9841c;
        }

        public float getScaleX() {
            return this.f9844f;
        }

        public float getScaleY() {
            return this.f9845g;
        }

        public float getTranslateX() {
            return this.f9846h;
        }

        public float getTranslateY() {
            return this.f9847i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f9842d) {
                this.f9842d = f7;
                m5316c();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f9843e) {
                this.f9843e = f7;
                m5316c();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f9841c) {
                this.f9841c = f7;
                m5316c();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f9844f) {
                this.f9844f = f7;
                m5316c();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f9845g) {
                this.f9845g = f7;
                m5316c();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f9846h) {
                this.f9846h = f7;
                m5316c();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f9847i) {
                this.f9847i = f7;
                m5316c();
            }
        }

        public c(c cVar, C1467a<String, Object> c1467a) {
            e aVar;
            this.f9839a = new Matrix();
            this.f9840b = new ArrayList<>();
            this.f9841c = 0.0f;
            this.f9842d = 0.0f;
            this.f9843e = 0.0f;
            this.f9844f = 1.0f;
            this.f9845g = 1.0f;
            this.f9846h = 0.0f;
            this.f9847i = 0.0f;
            Matrix matrix = new Matrix();
            this.f9848j = matrix;
            this.f9850l = null;
            this.f9841c = cVar.f9841c;
            this.f9842d = cVar.f9842d;
            this.f9843e = cVar.f9843e;
            this.f9844f = cVar.f9844f;
            this.f9845g = cVar.f9845g;
            this.f9846h = cVar.f9846h;
            this.f9847i = cVar.f9847i;
            String str = cVar.f9850l;
            this.f9850l = str;
            this.f9849k = cVar.f9849k;
            if (str != null) {
                c1467a.put(str, this);
            }
            matrix.set(cVar.f9848j);
            ArrayList<d> arrayList = cVar.f9840b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                d dVar = arrayList.get(i7);
                if (dVar instanceof c) {
                    this.f9840b.add(new c((c) dVar, c1467a));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else {
                        if (!(dVar instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) dVar);
                    }
                    this.f9840b.add(aVar);
                    String str2 = aVar.f9852b;
                    if (str2 != null) {
                        c1467a.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: x0.i$e */
    public static abstract class e extends d {

        /* renamed from: a */
        public C2155d.a[] f9851a;

        /* renamed from: b */
        public String f9852b;

        /* renamed from: c */
        public int f9853c;

        /* renamed from: d */
        public final int f9854d;

        public e() {
            this.f9851a = null;
            this.f9853c = 0;
        }

        public C2155d.a[] getPathData() {
            return this.f9851a;
        }

        public String getPathName() {
            return this.f9852b;
        }

        public void setPathData(C2155d.a[] aVarArr) {
            if (!C2155d.m5273a(this.f9851a, aVarArr)) {
                this.f9851a = C2155d.m5277e(aVarArr);
                return;
            }
            C2155d.a[] aVarArr2 = this.f9851a;
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                aVarArr2[i7].f9769a = aVarArr[i7].f9769a;
                int i8 = 0;
                while (true) {
                    float[] fArr = aVarArr[i7].f9770b;
                    if (i8 < fArr.length) {
                        aVarArr2[i7].f9770b[i8] = fArr[i8];
                        i8++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f9851a = null;
            this.f9853c = 0;
            this.f9852b = eVar.f9852b;
            this.f9854d = eVar.f9854d;
            this.f9851a = C2155d.m5277e(eVar.f9851a);
        }
    }
}
