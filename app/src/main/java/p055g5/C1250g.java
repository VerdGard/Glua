package p055g5;

import android.annotation.SuppressLint;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p002a1.C0017d;
import p006a5.C0052b;
import p006a5.C0056f;
import p006a5.InterfaceC0053c;
import p006a5.InterfaceC0055e;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0645i;
import p031d5.C0892c;
import p047f5.C1175f;
import p047f5.C1179j;
import p079j5.AbstractC1432a;
import p079j5.C1436e;
import p079j5.C1440i;
import p079j5.InterfaceC1433b;
import p079j5.InterfaceC1437f;
import p087k5.C1461a;
import p087k5.C1463c;
import p087k5.C1464d;
import p089l.C1476j;
import p118o5.EnumC1671b;
import p118o5.InterfaceC1673d;
import p140r4.C1833a;
import p140r4.C1834b;
import p140r4.C1835c;
import p140r4.C1836d;
import p140r4.C1837e;
import p156t4.AbstractC1927b;
import p156t4.AbstractC1927b.b.c;

/* renamed from: g5.g */
/* loaded from: classes.dex */
public final class C1250g {

    /* renamed from: F */
    public static final ArrayList f6130F;

    /* renamed from: G */
    public static final int[] f6131G;

    /* renamed from: H */
    public static final int[] f6132H;

    /* renamed from: I */
    public static final int[] f6133I;

    /* renamed from: A */
    public C0642f f6134A;

    /* renamed from: B */
    public C0641e f6135B;

    /* renamed from: C */
    public volatile boolean f6136C;

    /* renamed from: D */
    public boolean f6137D;

    /* renamed from: E */
    public boolean f6138E;

    /* renamed from: a */
    public final C1834b f6139a;

    /* renamed from: b */
    public final C1836d f6140b;

    /* renamed from: c */
    public final C1836d f6141c;

    /* renamed from: d */
    public final Rect f6142d;

    /* renamed from: e */
    public final RectF f6143e;

    /* renamed from: f */
    public final Path f6144f;

    /* renamed from: g */
    public final C1836d f6145g;

    /* renamed from: h */
    public final RectF f6146h;

    /* renamed from: i */
    public final RectF f6147i;

    /* renamed from: o */
    public final C1245b f6153o;

    /* renamed from: q */
    public Paint.FontMetricsInt f6155q;

    /* renamed from: r */
    public Drawable f6156r;

    /* renamed from: s */
    public Drawable f6157s;

    /* renamed from: t */
    public Drawable f6158t;

    /* renamed from: u */
    public Drawable f6159u;

    /* renamed from: v */
    public volatile long f6160v;

    /* renamed from: w */
    public Paint.FontMetricsInt f6161w;

    /* renamed from: x */
    public Paint.FontMetricsInt f6162x;

    /* renamed from: y */
    public int f6163y;

    /* renamed from: z */
    public C0645i f6164z;

    /* renamed from: j */
    public final C1175f f6148j = new C1175f();

    /* renamed from: k */
    public final C1476j f6149k = new C1476j();

    /* renamed from: l */
    public final C1175f f6150l = new C1175f();

    /* renamed from: m */
    public final SparseArray<C0642f> f6151m = new SparseArray<>();

    /* renamed from: n */
    public final SparseArray<C0892c> f6152n = new SparseArray<>();

    /* renamed from: p */
    public final ArrayList f6154p = new ArrayList();

    /* renamed from: g5.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6165a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6166b;

        static {
            int[] iArr = new int[EnumC1671b.values().length];
            f6166b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6166b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6166b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Paint.Align.values().length];
            f6165a = iArr2;
            try {
                iArr2[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6165a[Paint.Align.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6165a[Paint.Align.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: g5.g$b */
    public class b {

        /* renamed from: a */
        public float f6167a;

        /* renamed from: b */
        public float f6168b;

        /* renamed from: c */
        public final int f6169c;

        /* renamed from: d */
        public final InterfaceC1673d.a f6170d;

        /* renamed from: e */
        public final InterfaceC1673d.a f6171e = new InterfaceC1673d.a();

        public b(float f7, float f8, int i7, InterfaceC1673d.a aVar) {
            this.f6167a = f7;
            this.f6168b = f8;
            this.f6169c = i7;
            this.f6170d = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
        
            if (r9.f6075u2 == false) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m3547a(android.graphics.Canvas r19) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.b.m3547a(android.graphics.Canvas):void");
        }
    }

    /* renamed from: g5.g$c */
    public static class c {

        /* renamed from: a */
        public int f6173a;

        /* renamed from: b */
        public int f6174b;

        /* renamed from: c */
        public int f6175c;

        /* renamed from: d */
        public int f6176d;

        /* renamed from: e */
        public int f6177e;

        /* renamed from: f */
        public float f6178f;

        /* renamed from: g */
        public float f6179g;

        public final String toString() {
            return "TextDisplayPosition{row=" + this.f6173a + ", startColumn=" + this.f6174b + ", endColumn=" + this.f6175c + ", line=" + this.f6176d + ", rowStart=" + this.f6177e + ", left=" + this.f6178f + ", right=" + this.f6179g + '}';
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f6130F = arrayList;
        arrayList.add(C0143v.m425W(C0143v.m419Q(0, true, true), 0));
        f6131G = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f6132H = new int[]{R.attr.state_enabled};
        f6133I = new int[]{0, 37, 36, 35};
    }

    public C1250g(C1245b c1245b) {
        new ArrayList();
        this.f6153o = c1245b;
        this.f6146h = new RectF();
        this.f6147i = new RectF();
        this.f6139a = new C1834b();
        C1836d c1836d = new C1836d(c1245b.f6078w2);
        this.f6140b = c1836d;
        c1836d.setAntiAlias(true);
        C1836d c1836d2 = new C1836d(false);
        this.f6141c = c1836d2;
        c1836d2.setStrokeWidth(c1245b.getDpUnit() * 1.8f);
        c1836d2.setStrokeCap(Paint.Cap.ROUND);
        c1836d2.setTypeface(Typeface.MONOSPACE);
        c1836d2.setAntiAlias(true);
        C1836d c1836d3 = new C1836d(false);
        this.f6145g = c1836d3;
        c1836d3.setAntiAlias(true);
        this.f6155q = c1836d.getFontMetricsInt();
        this.f6161w = c1836d2.getFontMetricsInt();
        this.f6142d = new Rect();
        this.f6143e = new RectF();
        this.f6144f = new Path();
        this.f6164z = c1245b.getCursor();
        this.f6135B = c1245b.getText();
    }

    /* renamed from: A */
    public final void m3520A() {
        this.f6160v = System.nanoTime();
    }

    /* renamed from: a */
    public final void m3521a(int i7, int i8, long j7, boolean z6) {
        C0641e c0641e;
        boolean z7;
        C0641e c0641e2 = this.f6135B;
        C1245b c1245b = this.f6153o;
        C1464d renderContext = c1245b.getRenderContext();
        int i9 = i7;
        while (i9 <= i8 && i9 < c0641e2.m2147s()) {
            C0642f m3539s = z6 ? m3539s(i9) : this.f6135B.m2146r(i9);
            C1461a m3843a = c1245b.getRenderContext().f6985a.m3843a(i9);
            if (m3843a.f6978c < j7) {
                C1835c m4315d = C1835c.m4315d(this.f6137D);
                float[] fArr = m3843a.f6977b;
                if (fArr == null || fArr.length < m3539s.f3160e) {
                    m3843a.f6977b = new float[Math.max(m3539s.f3160e + 8, 90)];
                    z7 = true;
                } else {
                    z7 = false;
                }
                List<InterfaceC0053c> m3474Q = c1245b.m3474Q(i9);
                c0641e = c0641e2;
                m4315d.m4320f(c0641e2, i9, 0, m3539s.f3160e, m3474Q, this.f6140b, renderContext);
                AbstractC1432a abstractC1432a = c1245b.f5990C1;
                List<Integer> m3824i = abstractC1432a instanceof C1440i ? ((C1440i) abstractC1432a).m3824i(i9) : null;
                m4315d.f8293k = m3824i;
                C1836d c1836d = this.f6140b;
                int hash = Objects.hash(m3474Q, Integer.valueOf(m3539s.f3160e), Integer.valueOf(c1245b.getTabWidth()), Boolean.valueOf(this.f6137D), m3824i, Integer.valueOf(c1836d.getFlags()), Float.valueOf(c1836d.getTextSize()), Float.valueOf(c1836d.getTextScaleX()), Float.valueOf(c1836d.getLetterSpacing()), c1836d.getFontFeatureSettings());
                C1463c c1463c = renderContext.f6985a;
                if (c1463c.f6982b.m3852a(i9) != hash || z7) {
                    C1461a m3843a2 = m4315d.f8285c.f6985a.m3843a(m4315d.f8287e);
                    float[] fArr2 = m3843a2.f6977b;
                    if (fArr2 == null || fArr2.length < m4315d.f8289g + 4) {
                        m3843a2.f6977b = new float[Math.max(90, m4315d.f8284b.f3160e + 16)];
                    }
                    m4315d.m4318c(m4315d.f8288f, m4315d.f8289g, m3843a2.f6977b);
                    float[] fArr3 = m3843a2.f6977b;
                    float f7 = fArr3[0];
                    fArr3[0] = 0.0f;
                    int i10 = 1;
                    while (i10 <= m4315d.f8289g) {
                        float f8 = fArr3[i10];
                        fArr3[i10] = fArr3[i10 - 1] + f7;
                        i10++;
                        f7 = f8;
                    }
                    c1463c.f6982b.m3867d(i9, hash);
                }
                m4315d.m4319e();
                m3843a.f6978c = j7;
            } else {
                c0641e = c0641e2;
            }
            i9++;
            c0641e2 = c0641e;
        }
    }

    /* renamed from: b */
    public final void m3522b(Canvas canvas, int i7, RectF rectF) {
        if (i7 != 0) {
            C1836d c1836d = this.f6140b;
            c1836d.setColor(i7);
            canvas.drawRect(rectF, c1836d);
        }
    }

    /* renamed from: c */
    public final void m3523c(Canvas canvas, float f7, int i7) {
        C1245b c1245b = this.f6153o;
        boolean z6 = c1245b.f6068o2 && !c1245b.f6032X1 && c1245b.getOffsetX() > 0;
        float dividerWidth = c1245b.getDividerWidth() + f7;
        if (dividerWidth < 0.0f) {
            return;
        }
        float max = Math.max(0.0f, f7);
        RectF rectF = this.f6143e;
        rectF.bottom = c1245b.getHeight();
        rectF.top = 0.0f;
        int offsetY = c1245b.getOffsetY();
        if (offsetY < 0) {
            float f8 = offsetY;
            rectF.bottom -= f8;
            rectF.top -= f8;
        }
        rectF.left = max;
        rectF.right = dividerWidth;
        C1836d c1836d = this.f6140b;
        if (z6) {
            canvas.save();
            canvas.clipRect(rectF.left, rectF.top, c1245b.getWidth(), rectF.bottom);
            c1836d.setShadowLayer(Math.min(c1245b.getDpUnit() * 8.0f, c1245b.getOffsetX()), 0.0f, 0.0f, -16777216);
        }
        m3522b(canvas, i7, rectF);
        if (z6) {
            canvas.restore();
            c1836d.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    /* renamed from: d */
    public final void m3524d(Canvas canvas, int i7, int i8, float f7, float f8, int i9) {
        char[] cArr;
        int i10;
        int i11;
        int i12;
        char[] cArr2;
        char[] cArr3;
        float f9 = f8 + f7;
        if (f9 <= 0.0f) {
            return;
        }
        C1836d c1836d = this.f6141c;
        Paint.Align textAlign = c1836d.getTextAlign();
        C1245b c1245b = this.f6153o;
        if (textAlign != c1245b.getLineNumberAlign()) {
            c1836d.setTextAlign(c1245b.getLineNumberAlign());
        }
        c1836d.setColor(i9);
        Paint.FontMetricsInt fontMetricsInt = this.f6161w;
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        float m3473P = ((((c1245b.m3473P(i8) + c1245b.m3472O(i8)) / 2.0f) - ((i13 - i14) / 2.0f)) - i14) - c1245b.getOffsetY();
        synchronized (C1179j.class) {
            cArr = C1179j.f5770a;
            C1179j.f5770a = null;
        }
        if (cArr == null || cArr.length < 20) {
            cArr = new char[20];
        }
        int i15 = i7 + 1;
        if (i15 >= 0) {
            i10 = -i15;
            i11 = 0;
        } else {
            i10 = i15;
            i11 = 1;
        }
        int i16 = -10;
        int i17 = 1;
        while (true) {
            if (i17 >= 10) {
                i12 = i11 + 10;
                break;
            } else if (i10 > i16) {
                i12 = i17 + i11;
                break;
            } else {
                i16 *= 10;
                i17++;
            }
        }
        boolean z6 = i15 < 0;
        if (!z6) {
            i15 = -i15;
        }
        int i18 = i12;
        while (true) {
            cArr2 = C0017d.f23k;
            cArr3 = C0017d.f24l;
            if (i15 > -100) {
                break;
            }
            int i19 = i15 / 100;
            int i20 = (i19 * 100) - i15;
            int i21 = i18 - 1;
            cArr[i21] = cArr3[i20];
            i18 = i21 - 1;
            cArr[i18] = cArr2[i20];
            i15 = i19;
        }
        int i22 = i18 - 1;
        int i23 = -i15;
        cArr[i22] = cArr3[i23];
        if (i15 < -9) {
            i22--;
            cArr[i22] = cArr2[i23];
        }
        if (z6) {
            cArr[i22 - 1] = '-';
        }
        int i24 = a.f6165a[c1245b.getLineNumberAlign().ordinal()];
        if (i24 == 1) {
            canvas.drawText(cArr, 0, i12, f7, m3473P, this.f6141c);
        } else if (i24 == 2) {
            canvas.drawText(cArr, 0, i12, f9, m3473P, this.f6141c);
        } else if (i24 == 3) {
            canvas.drawText(cArr, 0, i12, ((c1245b.getDividerMarginLeft() + f8) / 2.0f) + f7, m3473P, this.f6141c);
        }
        C1179j.m3391a(cArr);
    }

    /* renamed from: e */
    public final void m3525e(float f7, float f8, int i7, Canvas canvas) {
        float f9 = f8 + f7;
        if (f9 < 0.0f) {
            return;
        }
        float max = Math.max(0.0f, f7);
        RectF rectF = this.f6143e;
        C1245b c1245b = this.f6153o;
        rectF.bottom = c1245b.getHeight();
        rectF.top = 0.0f;
        int offsetY = c1245b.getOffsetY();
        if (offsetY < 0) {
            float f10 = offsetY;
            rectF.bottom -= f10;
            rectF.top -= f10;
        }
        rectF.left = max;
        rectF.right = f9;
        m3522b(canvas, i7, rectF);
    }

    /* renamed from: f */
    public final void m3526f(Canvas canvas, float f7, int i7) {
        this.f6145g.setColor(this.f6153o.getColorScheme().m3927c(31));
        canvas.drawText("↵", 0, 1, f7, (i7 == -1 ? r0.m3472O(0) : r0.m3472O(i7) - r0.getOffsetY()) - this.f6162x.descent, (Paint) this.f6145g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3527g(android.graphics.Canvas r31, float r32, float r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3527g(android.graphics.Canvas, float, float, int, int, int, int, int, int, int):void");
    }

    /* renamed from: h */
    public final void m3528h(Canvas canvas, int i7, int i8, int i9) {
        RectF rectF = this.f6143e;
        C1245b c1245b = this.f6153o;
        rectF.top = c1245b.m3473P(i8) - c1245b.getOffsetY();
        rectF.bottom = c1245b.m3472O(i8) - c1245b.getOffsetY();
        rectF.left = 0.0f;
        rectF.right = i9;
        m3522b(canvas, i7, rectF);
    }

    /* renamed from: i */
    public final void m3529i(Canvas canvas, RectF rectF) {
        C1245b c1245b = this.f6153o;
        boolean z6 = c1245b.getProps().f6099I1;
        C1836d c1836d = this.f6140b;
        if (z6) {
            canvas.drawRoundRect(rectF, c1245b.getRowHeight() * c1245b.getProps().f6101K1, c1245b.getRowHeight() * c1245b.getProps().f6101K1, c1836d);
        } else {
            canvas.drawRect(rectF, c1836d);
        }
    }

    /* renamed from: j */
    public final void m3530j(Canvas canvas, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        float m3544x;
        float m3544x2;
        float f7;
        C0892c c0892c;
        int i14 = i8;
        int i15 = i11;
        int max = Math.max(i9, i15);
        int min = Math.min(i10, i12);
        if (max < min) {
            RectF rectF = this.f6143e;
            C1245b c1245b = this.f6153o;
            c1245b.getProps().getClass();
            rectF.top = c1245b.m3473P(i7) - c1245b.getOffsetY();
            rectF.bottom = m3541u(i7) - c1245b.getOffsetY();
            C0892c m3540t = m3540t(i14);
            C0642f m3539s = m3539s(i14);
            this.f6140b.setColor(i13);
            float m3482Y = c1245b.m3482Y() - c1245b.getOffsetX();
            boolean z6 = true;
            int i16 = 0;
            while (i16 < m3540t.f4677a.length) {
                int max2 = Math.max(max, m3540t.m2598b(i16));
                int min2 = Math.min(min, m3540t.m2597a(i16));
                if (m3540t.m2598b(i16) >= min) {
                    break;
                }
                int max3 = Math.max(i15, m3540t.m2598b(i16));
                int min3 = Math.min(i12, m3540t.m2597a(i16));
                float m3544x3 = min3 <= max3 ? 0.0f : m3544x(m3539s, i14, max3, min3 - max3);
                if (max2 >= min2) {
                    m3482Y += m3544x3;
                    c0892c = m3540t;
                } else {
                    if (m3540t.m2599c(i16)) {
                        float f8 = m3482Y + m3544x3;
                        m3544x = f8 - m3544x(m3539s, i14, max3, max2 - max3);
                        m3544x2 = f8 - m3544x(m3539s, i14, max3, min2 - max3);
                    } else {
                        m3544x = m3544x(m3539s, i14, max3, max2 - max3) + m3482Y;
                        m3544x2 = m3544x(m3539s, i14, max3, min2 - max3) + m3482Y;
                    }
                    if (m3544x > m3544x2) {
                        f7 = m3544x;
                        m3544x = m3544x2;
                    } else {
                        f7 = m3544x2;
                    }
                    if (z6) {
                        rectF.left = m3544x;
                        rectF.right = f7;
                        c0892c = m3540t;
                        z6 = false;
                    } else {
                        c0892c = m3540t;
                        if (Math.abs(m3544x - rectF.right) >= 0.01d) {
                            if (Math.abs(f7 - rectF.left) < 0.01d) {
                                rectF.left = m3544x;
                            } else {
                                m3529i(canvas, rectF);
                                rectF.left = m3544x;
                            }
                        }
                        rectF.right = f7;
                    }
                    m3482Y += m3544x3;
                }
                i16++;
                i14 = i8;
                m3540t = c0892c;
                i15 = i11;
            }
            if (z6) {
                return;
            }
            m3529i(canvas, rectF);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:459:0x0ca1, code lost:
    
        r12 = r13;
        r44 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0ca5, code lost:
    
        if (r0 == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0ca8, code lost:
    
        r0.mo155a(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0cac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0cad, code lost:
    
        android.util.Log.w("EditorRenderer", "Failed to release SpanReader", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x009b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3531k(android.graphics.Canvas r61, float r62, p047f5.C1175f r63, java.util.ArrayList r64, p089l.C1476j r65, p047f5.C1176g r66) {
        /*
            Method dump skipped, instructions count: 3283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3531k(android.graphics.Canvas, float, f5.f, java.util.ArrayList, l.j, f5.g):void");
    }

    /* renamed from: l */
    public final void m3532l(Canvas canvas) {
        float f7;
        RectF rectF;
        int[] iArr;
        int[] iArr2;
        float rowHeight;
        float[] fArr;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF2 = this.f6146h;
        rectF2.setEmpty();
        RectF rectF3 = this.f6147i;
        rectF3.setEmpty();
        C1245b c1245b = this.f6153o;
        GestureDetectorOnGestureListenerC1261r eventHandler = c1245b.getEventHandler();
        eventHandler.getClass();
        if ((System.currentTimeMillis() - eventHandler.f6219D1 < 3200 || eventHandler.f6221F1 || eventHandler.f6222G1) || (c1245b.m3478U() && c1245b.getProps().f6111U1)) {
            GestureDetectorOnGestureListenerC1261r eventHandler2 = c1245b.getEventHandler();
            eventHandler2.getClass();
            if (System.currentTimeMillis() - eventHandler2.f6219D1 < 3000 || eventHandler2.f6221F1 || eventHandler2.f6222G1) {
                f7 = 0.0f;
            } else if (System.currentTimeMillis() - eventHandler2.f6219D1 < 3000 || System.currentTimeMillis() - eventHandler2.f6219D1 >= 3200) {
                f7 = 1.0f;
            } else {
                eventHandler2.f6246c.postInvalidateOnAnimation();
                f7 = (((System.currentTimeMillis() - eventHandler2.f6219D1) - 3000) * 1.0f) / 200.0f;
            }
            if (c1245b.m3478U() && c1245b.getProps().f6111U1) {
                f7 = 0.0f;
            }
            float dpUnit = c1245b.getDpUnit() * 10.0f;
            boolean isHorizontalScrollBarEnabled = c1245b.isHorizontalScrollBarEnabled();
            int[] iArr3 = f6131G;
            int[] iArr4 = f6132H;
            RectF rectF4 = this.f6143e;
            if (isHorizontalScrollBarEnabled && !c1245b.f6032X1 && c1245b.getScrollMaxX() > (c1245b.getWidth() * 3) / 4) {
                canvas.save();
                canvas.translate(0.0f, dpUnit * f7);
                if (c1245b.getEventHandler().f6222G1) {
                    rectF4.set(0.0f, c1245b.getHeight() - (c1245b.getDpUnit() * 10.0f), c1245b.getWidth(), c1245b.getHeight());
                    Drawable drawable = this.f6157s;
                    if (drawable != null) {
                        drawable.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
                        this.f6157s.draw(canvas);
                    } else {
                        m3522b(canvas, c1245b.getColorScheme().m3927c(13), rectF4);
                    }
                }
                int width = c1245b.getWidth();
                float scrollMaxX = c1245b.getScrollMaxX();
                float width2 = (width / (c1245b.getWidth() + scrollMaxX)) * c1245b.getWidth();
                float dpUnit2 = c1245b.getDpUnit() * 60.0f;
                if (width2 <= dpUnit2) {
                    width2 = dpUnit2;
                }
                float width3 = (c1245b.getWidth() - width2) * (c1245b.getOffsetX() / scrollMaxX);
                rectF4.top = c1245b.getHeight() - (c1245b.getDpUnit() * 10.0f);
                rectF4.bottom = c1245b.getHeight();
                rectF4.right = width2 + width3;
                rectF4.left = width3;
                rectF3.set(rectF4);
                Drawable drawable2 = this.f6156r;
                if (drawable2 != null) {
                    drawable2.setState(c1245b.getEventHandler().f6222G1 ? iArr3 : iArr4);
                    this.f6156r.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
                    this.f6156r.draw(canvas);
                } else {
                    m3522b(canvas, c1245b.getColorScheme().m3927c(c1245b.getEventHandler().f6222G1 ? 12 : 11), rectF4);
                }
                canvas.restore();
            }
            if (!c1245b.isVerticalScrollBarEnabled() || c1245b.getScrollMaxY() <= c1245b.getHeight() / 2) {
                return;
            }
            canvas.save();
            canvas.translate(dpUnit * f7, 0.0f);
            if (c1245b.getEventHandler().f6221F1) {
                rectF4.right = c1245b.getWidth();
                rectF4.left = c1245b.getWidth() - (c1245b.getDpUnit() * 10.0f);
                rectF4.top = 0.0f;
                float height = c1245b.getHeight();
                rectF4.bottom = height;
                Drawable drawable3 = this.f6159u;
                if (drawable3 != null) {
                    drawable3.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) height);
                    this.f6159u.draw(canvas);
                } else {
                    m3522b(canvas, c1245b.getColorScheme().m3927c(13), rectF4);
                }
            }
            int height2 = c1245b.getHeight();
            float scrollMaxY = c1245b.getScrollMaxY() + height2;
            float f14 = height2;
            float max = Math.max((f14 / scrollMaxY) * f14, c1245b.getDpUnit() * 60.0f);
            float offsetY = (f14 - max) * ((c1245b.getOffsetY() * 1.0f) / c1245b.getScrollMaxY());
            if (c1245b.getEventHandler().f6221F1 && c1245b.f6045d2) {
                int lnPanelPositionMode = c1245b.getLnPanelPositionMode();
                int lnPanelPosition = c1245b.getLnPanelPosition();
                ((C0017d) c1245b.getLineNumberTipTextProvider()).getClass();
                String m219e = C0090b.m219e("L", c1245b.getFirstVisibleLine() + 1);
                C1836d c1836d = this.f6140b;
                float textSize = c1836d.getTextSize();
                c1836d.setTextSize(c1245b.getLineInfoTextSize());
                Paint.FontMetricsInt fontMetricsInt = this.f6155q;
                this.f6155q = c1836d.getFontMetricsInt();
                float dpUnit3 = c1245b.getDpUnit() * 8.0f;
                float measureText = c1836d.measureText(m219e);
                if (lnPanelPositionMode == 0) {
                    iArr = iArr3;
                    rectF4.top = ((c1245b.getHeight() / 2.0f) - (c1245b.getRowHeight() / 2.0f)) - dpUnit3;
                    rectF4.bottom = (c1245b.getRowHeight() / 2.0f) + (c1245b.getHeight() / 2.0f) + dpUnit3;
                    float f15 = measureText / 2.0f;
                    rectF4.left = ((c1245b.getWidth() / 2.0f) - f15) - dpUnit3;
                    rectF4.right = (c1245b.getWidth() / 2.0f) + f15 + dpUnit3;
                    float f16 = dpUnit3 * 2.0f;
                    float height3 = (c1245b.getHeight() / 2.0f) + f16;
                    float dpUnit4 = c1245b.getDpUnit() * 10.0f;
                    iArr2 = iArr4;
                    if (lnPanelPosition != 15) {
                        if ((lnPanelPosition | 2) == lnPanelPosition) {
                            rectF4.top = dpUnit4;
                            rectF4.bottom = c1245b.getRowHeight() + dpUnit4 + f16;
                            height3 = c1245b.m3471N(0) + dpUnit4 + dpUnit3;
                        }
                        if ((lnPanelPosition | 8) == lnPanelPosition) {
                            rectF = rectF2;
                            rectF4.top = ((c1245b.getHeight() - dpUnit4) - f16) - c1245b.getRowHeight();
                            rectF4.bottom = c1245b.getHeight() - dpUnit4;
                            f13 = ((c1245b.m3471N(0) + (c1245b.getHeight() - c1245b.getRowHeight())) - dpUnit4) - dpUnit3;
                        } else {
                            rectF = rectF2;
                            f13 = height3;
                        }
                        if ((lnPanelPosition | 1) == lnPanelPosition) {
                            rectF4.left = dpUnit4;
                            rectF4.right = dpUnit4 + f16 + measureText;
                        }
                        if ((lnPanelPosition | 4) == lnPanelPosition) {
                            rectF4.right = c1245b.getWidth() - dpUnit4;
                            rectF4.left = ((c1245b.getWidth() - dpUnit4) - f16) - measureText;
                        }
                        f12 = f13;
                    } else {
                        rectF = rectF2;
                        f12 = height3;
                    }
                    int m3927c = c1245b.getColorScheme().m3927c(16);
                    if (m3927c != 0) {
                        c1836d.setColor(m3927c);
                        canvas.drawRoundRect(rectF4, rectF4.height() * 0.13f, rectF4.height() * 0.13f, c1836d);
                    }
                    f11 = 0.0f;
                } else {
                    rectF = rectF2;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    rectF4.right = c1245b.getWidth() - (c1245b.getDpUnit() * 30.0f);
                    float f17 = dpUnit3 * 2.0f;
                    rectF4.left = ((c1245b.getWidth() - (c1245b.getDpUnit() * 30.0f)) - f17) - measureText;
                    if (lnPanelPosition == 2) {
                        rectF4.top = offsetY;
                        rectF4.bottom = c1245b.getRowHeight() + offsetY + f17;
                        f8 = c1245b.m3471N(0) + offsetY + dpUnit3;
                        fArr = new float[8];
                        int i7 = 0;
                        for (int i8 = 8; i7 < i8; i8 = 8) {
                            if (i7 != 5) {
                                fArr[i7] = rectF4.height() * 0.5f;
                            }
                            i7++;
                        }
                    } else {
                        if (lnPanelPosition == 8) {
                            float f18 = offsetY + max;
                            rectF4.top = (f18 - c1245b.getRowHeight()) - f17;
                            rectF4.bottom = f18;
                            rowHeight = f18 - (c1245b.m3471N(0) / 2.0f);
                            fArr = new float[8];
                            int i9 = 0;
                            for (int i10 = 8; i9 < i10; i10 = 8) {
                                if (i9 != 3) {
                                    fArr[i9] = rectF4.height() * 0.5f;
                                }
                                i9++;
                            }
                        } else {
                            float f19 = (max / 2.0f) + offsetY;
                            rectF4.top = (f19 - (c1245b.getRowHeight() / 2.0f)) - dpUnit3;
                            rectF4.bottom = (c1245b.getRowHeight() / 2.0f) + f19 + dpUnit3;
                            rowHeight = (f19 - (c1245b.getRowHeight() / 2.0f)) + c1245b.m3471N(0);
                            fArr = null;
                        }
                        f8 = rowHeight;
                    }
                    Path path = this.f6144f;
                    if (fArr != null) {
                        path.reset();
                        path.addRoundRect(rectF4, fArr, Path.Direction.CW);
                        f10 = 0.0f;
                        f9 = f8;
                    } else {
                        float f20 = -dpUnit3;
                        rectF4.offset(f20, 0.0f);
                        rectF4.right += dpUnit3;
                        float f21 = f20 / 2.0f;
                        Matrix matrix = C1833a.f8278a;
                        path.reset();
                        float width4 = rectF4.width();
                        float height4 = rectF4.height() / 2.0f;
                        f9 = f8;
                        float sqrt = (float) Math.sqrt(2.0d);
                        float f22 = sqrt * height4;
                        float max2 = Math.max(height4 + f22, width4);
                        C1833a.m4314a(path, height4, height4, height4, 90.0f, 180.0f);
                        float f23 = max2 - f22;
                        C1833a.m4314a(path, f23, height4, height4, -90.0f, 45.0f);
                        float f24 = height4 / 5.0f;
                        C1833a.m4314a(path, max2 - (sqrt * f24), height4, f24, -45.0f, 90.0f);
                        C1833a.m4314a(path, f23, height4, height4, 45.0f, 45.0f);
                        path.close();
                        Matrix matrix2 = C1833a.f8278a;
                        matrix2.reset();
                        matrix2.postTranslate(rectF4.left, rectF4.top);
                        path.transform(matrix2);
                        f10 = f21;
                    }
                    c1836d.setColor(c1245b.getColorScheme().m3927c(16));
                    canvas.drawPath(path, c1836d);
                    f11 = f10;
                    f12 = f9;
                }
                float f25 = ((rectF4.left + rectF4.right) / 2.0f) + f11;
                c1836d.setColor(c1245b.getColorScheme().m3927c(17));
                c1836d.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(m219e, f25, f12, c1836d);
                c1836d.setTextAlign(Paint.Align.LEFT);
                c1836d.setTextSize(textSize);
                this.f6155q = fontMetricsInt;
            } else {
                rectF = rectF2;
                iArr = iArr3;
                iArr2 = iArr4;
            }
            rectF4.right = c1245b.getWidth();
            rectF4.left = c1245b.getWidth() - (c1245b.getDpUnit() * 10.0f);
            rectF4.top = offsetY;
            rectF4.bottom = offsetY + max;
            rectF.set(rectF4);
            Drawable drawable4 = this.f6158t;
            if (drawable4 != null) {
                drawable4.setState(c1245b.getEventHandler().f6221F1 ? iArr : iArr2);
                this.f6158t.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
                this.f6158t.draw(canvas);
            } else {
                m3522b(canvas, c1245b.getColorScheme().m3927c(c1245b.getEventHandler().f6221F1 ? 12 : 11), rectF4);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x018f, code lost:
    
        r7 = r14;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3533m(android.graphics.Canvas r28, int r29, float r30, p006a5.InterfaceC0055e.a r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3533m(android.graphics.Canvas, int, float, a5.e$a, boolean):void");
    }

    /* renamed from: n */
    public final void m3534n(Canvas canvas, C0642f c0642f, int i7, int i8, int i9, int i10, boolean z6, float f7, float f8, int i11) {
        boolean z7;
        int i12;
        int i13;
        char[] cArr;
        C1245b c1245b;
        char[] cArr2 = c0642f.f3159c;
        int min = Math.min(cArr2.length, i7 + i8);
        C1245b c1245b2 = this.f6153o;
        boolean z8 = c1245b2.f6078w2;
        int i14 = i7;
        int i15 = i14;
        float f9 = f7;
        while (i15 < min) {
            char c7 = cArr2[i15];
            if (c7 == '\t') {
                int i16 = i15 - i14;
                i12 = min;
                int i17 = i15;
                z7 = z8;
                m3535o(canvas, cArr2, i14, i16, i9, i10, f9, f8, z6);
                f9 = m3544x(c0642f, i11, i14, i16 + 1) + f9;
                i14 = i17 + 1;
                i13 = i17;
                cArr = cArr2;
                c1245b = c1245b2;
            } else {
                z7 = z8;
                C1245b c1245b3 = c1245b2;
                i12 = min;
                int i18 = i14;
                int i19 = i15;
                if (z7 && C0017d.m65D(c7)) {
                    int i20 = i19 - i18;
                    cArr = cArr2;
                    m3535o(canvas, cArr2, i18, i20, i9, i10, f9, f8, z6);
                    float m3544x = m3544x(c0642f, i11, i18, i20) + f9;
                    float m3544x2 = m3544x(c0642f, i11, i19, 1);
                    char c8 = cArr[i19];
                    Paint.Align align = Paint.Align.CENTER;
                    C1836d c1836d = this.f6145g;
                    c1836d.setTextAlign(align);
                    c1245b = c1245b3;
                    float rowHeight = c1245b.getRowHeight();
                    Paint.FontMetricsInt fontMetricsInt = this.f6162x;
                    int i21 = fontMetricsInt.descent;
                    int i22 = fontMetricsInt.ascent;
                    float m3471N = (rowHeight / 2.0f) + (f8 - c1245b.m3471N(0));
                    float f10 = (i21 - i22) / 2.0f;
                    float f11 = m3471N - f10;
                    C1836d c1836d2 = this.f6140b;
                    c1836d.setColor(c1836d2.getColor());
                    float f12 = (m3544x2 / 2.0f) + m3544x;
                    i13 = i19;
                    canvas.drawText(C0017d.m101z(c8), f12, f11 - i22, c1836d);
                    c1836d.setTextAlign(Paint.Align.LEFT);
                    float measureText = c1836d.measureText(C0017d.m101z(c8));
                    RectF rectF = this.f6143e;
                    rectF.top = f11;
                    rectF.bottom = m3471N + f10;
                    float f13 = measureText / 2.0f;
                    rectF.left = f12 - f13;
                    rectF.right = f12 + f13;
                    int color = c1836d2.getColor();
                    c1836d2.setColor(c1245b.getColorScheme().m3927c(52));
                    c1836d2.setStyle(Paint.Style.STROKE);
                    c1836d2.setStrokeWidth(c1245b.getRowHeightOfText() * 0.05f);
                    m3529i(canvas, rectF);
                    c1836d2.setStyle(Paint.Style.FILL);
                    c1836d2.setColor(color);
                    f9 = m3544x + m3544x2;
                    i14 = i13 + 1;
                } else {
                    i13 = i19;
                    cArr = cArr2;
                    c1245b = c1245b3;
                    i14 = i18;
                }
            }
            i15 = i13 + 1;
            min = i12;
            c1245b2 = c1245b;
            cArr2 = cArr;
            z8 = z7;
        }
        char[] cArr3 = cArr2;
        int i23 = min;
        int i24 = i14;
        if (i24 < i23) {
            m3535o(canvas, cArr3, i24, i23 - i24, i9, i10, f9, f8, z6);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: o */
    public final void m3535o(Canvas canvas, char[] cArr, int i7, int i8, int i9, int i10, float f7, float f8, boolean z6) {
        if (!this.f6137D) {
            canvas.drawTextRun(cArr, i7, i8, i9, i10, f7, f8, z6, this.f6140b);
            return;
        }
        float f9 = f7;
        int i11 = 0;
        while (i11 < i8) {
            int i12 = i7 + i11;
            int i13 = (Character.isHighSurrogate(cArr[i12]) && i11 + 1 < i8 && Character.isLowSurrogate(cArr[i12 + 1])) ? 2 : 1;
            int i14 = i13;
            canvas.drawText(cArr, i12, i14, f9, f8, this.f6140b);
            f9 += this.f6140b.m4323c(cArr, i12, i14, i12, i13, false, null, 0, true);
            i11 += i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04ee  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3536p(android.graphics.Canvas r47) {
        /*
            Method dump skipped, instructions count: 3091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3536p(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Type inference failed for: r5v17, types: [float[], java.io.Serializable, java.lang.Object] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3537q(android.graphics.Canvas r20, float r21, int r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3537q(android.graphics.Canvas, float, int, int, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0200, code lost:
    
        if ((r0 >= 126976 && r0 <= 129791) != false) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3538r(float r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g5.C1250g.m3538r(float, int, int, int, int, boolean):long");
    }

    /* renamed from: s */
    public final C0642f m3539s(int i7) {
        if (!this.f6136C) {
            return this.f6135B.m2146r(i7);
        }
        C0642f c0642f = this.f6151m.get(i7);
        if (c0642f != null) {
            return c0642f;
        }
        C0642f m2146r = this.f6135B.m2146r(i7);
        this.f6151m.put(i7, m2146r);
        return m2146r;
    }

    /* renamed from: t */
    public final C0892c m3540t(int i7) {
        if (!this.f6136C) {
            return this.f6135B.m2148t(i7);
        }
        C0892c c0892c = this.f6152n.get(i7);
        if (c0892c != null) {
            return c0892c;
        }
        C0892c m2148t = this.f6135B.m2148t(i7);
        this.f6152n.put(i7, m2148t);
        return m2148t;
    }

    /* renamed from: u */
    public final int m3541u(int i7) {
        C1245b c1245b = this.f6153o;
        c1245b.getProps().getClass();
        return c1245b.m3472O(i7);
    }

    /* renamed from: v */
    public final void m3542v() {
        this.f6153o.getStyles();
    }

    /* renamed from: w */
    public final boolean m3543w(int i7, int i8, int i9, int i10) {
        return (i7 != i9 || this.f6135B.m2146r(i10).f3160e == i9) && i7 >= i8 && i7 <= i9;
    }

    /* renamed from: x */
    public final float m3544x(C0642f c0642f, int i7, int i8, int i9) {
        float[] fArr;
        C1461a m3844b = this.f6153o.getRenderContext().f6985a.m3844b(i7);
        if (m3844b != null && ((m3844b.f6978c < this.f6160v && m3844b.f6977b != null) || ((fArr = m3844b.f6977b) != null && fArr.length >= i8 + i9))) {
            m3521a(i7, i7, this.f6160v, false);
        }
        C1835c m4315d = C1835c.m4315d(this.f6137D);
        C1245b c1245b = this.f6153o;
        m4315d.m4320f(this.f6135B, i7, 0, c0642f.f3160e, (m3844b == null || m3844b.f6977b == null) ? c1245b.m3474Q(i7) : c1245b.f6079x1, this.f6140b, this.f6153o.getRenderContext());
        AbstractC1432a abstractC1432a = this.f6153o.f5990C1;
        if ((abstractC1432a instanceof C1440i) && (m3844b == null || m3844b.f6977b == null)) {
            m4315d.f8293k = ((C1440i) abstractC1432a).m3824i(i7);
        }
        float m4317b = m4315d.m4317b(i8, i9 + i8);
        m4315d.m4319e();
        return m4317b;
    }

    /* renamed from: y */
    public final void m3545y() {
        C1245b c1245b = this.f6153o;
        boolean z6 = c1245b.f6078w2;
        C1836d c1836d = this.f6140b;
        c1836d.f8298c = z6;
        C1837e c1837e = c1836d.f8299d;
        if (c1837e != null) {
            Arrays.fill(c1837e.f8303d, 0.0f);
            c1837e.f8301b.clear();
        }
        this.f6162x = this.f6145g.getFontMetricsInt();
        this.f6161w = this.f6141c.getFontMetricsInt();
        this.f6155q = c1836d.getFontMetricsInt();
        c1245b.getRenderContext().m3845a();
        m3520A();
        c1245b.m3504o(true);
        c1245b.invalidate();
    }

    /* renamed from: z */
    public final void m3546z(Canvas canvas, float f7, int i7, int i8, int i9, int i10, int i11) {
        InterfaceC0055e.a aVar;
        C1836d c1836d;
        int i12;
        InterfaceC0055e.a aVar2;
        C1836d c1836d2;
        int i13;
        C1836d c1836d3;
        C1245b c1245b;
        InterfaceC0053c mo156b;
        int i14;
        int i15;
        int mo166i;
        int i16;
        c cVar;
        int i17;
        C0642f c0642f;
        int i18;
        int i19;
        int i20;
        int i21;
        C0642f c0642f2;
        int i22;
        int i23;
        C1836d c1836d4;
        C1245b c1245b2;
        Canvas canvas2 = canvas;
        int i24 = i9;
        int i25 = i10;
        C1836d c1836d5 = this.f6140b;
        c1836d5.setColor(i24);
        C1245b c1245b3 = this.f6153o;
        C1836d c1836d6 = this.f6141c;
        c1836d6.setStrokeWidth(c1245b3.getRowHeightOfText() * 0.1f);
        c1836d5.setStyle(Paint.Style.FILL_AND_STROKE);
        c1836d5.setFakeBoldText(c1245b3.getProps().f6098H1);
        InterfaceC1433b layout = c1245b3.getLayout();
        int mo3807d = layout.mo3807d(i7);
        int mo3807d2 = layout.mo3807d(i8);
        C0638b m2110o = this.f6164z.f3165b.m2110o(i7);
        C0638b m2110o2 = this.f6164z.f3165b.m2110o(i8);
        InterfaceC1437f mo3814t = layout.mo3814t(mo3807d, this.f6151m);
        ArrayList arrayList = new ArrayList();
        int i26 = mo3807d;
        while (i26 <= mo3807d2 && mo3814t.hasNext()) {
            C1436e next = mo3814t.next();
            InterfaceC1437f interfaceC1437f = mo3814t;
            int i27 = i26 == mo3807d ? m2110o.f3142c : next.f6901c;
            C0638b c0638b = m2110o;
            int i28 = i26 == mo3807d2 ? m2110o2.f3142c : next.f6902d;
            C0638b c0638b2 = m2110o2;
            c cVar2 = new c();
            arrayList.add(cVar2);
            cVar2.f6173a = i26;
            int i29 = mo3807d;
            int i30 = mo3807d2;
            C0642f m2146r = this.f6135B.m2146r(next.f6899a);
            int i31 = next.f6899a;
            int i32 = next.f6901c;
            float m3544x = m3544x(m2146r, i31, i32, i27 - i32);
            cVar2.f6178f = m3544x;
            cVar2.f6179g = m3544x(m2146r, next.f6899a, i27, i28 - i27) + m3544x;
            cVar2.f6174b = i27;
            cVar2.f6175c = i28;
            cVar2.f6176d = next.f6899a;
            cVar2.f6177e = next.f6901c;
            i26++;
            mo3814t = interfaceC1437f;
            m2110o2 = c0638b2;
            m2110o = c0638b;
            mo3807d = i29;
            mo3807d2 = i30;
            c1836d5 = c1836d5;
        }
        C1836d c1836d7 = c1836d5;
        C0056f styles = c1245b3.getStyles();
        InterfaceC0055e interfaceC0055e = styles != null ? styles.f144a : null;
        InterfaceC0055e.a cVar3 = interfaceC0055e != null ? ((AbstractC1927b.b) interfaceC0055e).new c() : C0052b.f140b;
        int firstVisibleRow = c1245b3.getFirstVisibleRow();
        int lastVisibleRow = c1245b3.getLastVisibleRow();
        Iterator it = arrayList.iterator();
        C1250g c1250g = this;
        while (it.hasNext()) {
            c cVar4 = (c) it.next();
            int i33 = cVar4.f6173a;
            if (firstVisibleRow > i33 || i33 > lastVisibleRow) {
                i12 = lastVisibleRow;
                aVar2 = cVar3;
                c1836d2 = c1836d7;
                i13 = firstVisibleRow;
                c1836d3 = c1836d6;
                c1245b = c1245b3;
            } else {
                int i34 = cVar4.f6176d;
                try {
                    cVar3.mo155a(i34);
                    int i35 = cVar4.f6174b;
                    int i36 = cVar4.f6175c;
                    int i37 = firstVisibleRow;
                    C0642f m3539s = c1250g.m3539s(i34);
                    int i38 = m3539s.f3160e;
                    canvas.save();
                    i12 = lastVisibleRow;
                    int mo157c = cVar3.mo157c();
                    float f8 = f7;
                    int i39 = 0;
                    InterfaceC0053c interfaceC0053c = null;
                    boolean z6 = true;
                    while (true) {
                        if (i39 >= mo157c) {
                            c1836d3 = c1836d6;
                            c1245b = c1245b3;
                            aVar2 = cVar3;
                            c1836d2 = c1836d7;
                            i13 = i37;
                            break;
                        }
                        if (interfaceC0053c == null) {
                            interfaceC0053c = cVar3.mo156b(i39);
                        }
                        int i40 = i39 + 1;
                        if (i40 == mo157c) {
                            i14 = i40;
                            mo156b = null;
                        } else {
                            mo156b = cVar3.mo156b(i40);
                            i14 = i40;
                        }
                        int i41 = mo157c;
                        int max = Math.max(interfaceC0053c.mo166i(), cVar4.f6177e);
                        int max2 = Math.max(i35, max);
                        if (mo156b == null) {
                            i15 = i35;
                            mo166i = i38;
                        } else {
                            i15 = i35;
                            mo166i = mo156b.mo166i();
                        }
                        int min = Math.min(i38, mo166i);
                        int i42 = i38;
                        if (min <= cVar4.f6174b) {
                            cVar = cVar4;
                            c0642f = m3539s;
                            c1836d3 = c1836d6;
                            c1245b = c1245b3;
                            aVar2 = cVar3;
                            c1836d2 = c1836d7;
                            i18 = i14;
                            i19 = i41;
                            i20 = i42;
                            i13 = i37;
                        } else {
                            if (Math.min(i36, min) - max2 > 0) {
                                if (z6) {
                                    int i43 = cVar4.f6177e;
                                    f8 = c1250g.m3544x(m3539s, i34, i43, max - i43) + f8;
                                    z6 = false;
                                }
                                if (C0143v.m413K(interfaceC0053c.mo159b())) {
                                    Path path = new Path();
                                    float m3472O = (c1245b3.m3472O(cVar4.f6173a) - (c1245b3.getLineSpacingPixels() / 2)) - c1245b3.getOffsetY();
                                    path.moveTo(f7 + cVar4.f6178f, m3472O);
                                    path.lineTo((f7 + cVar4.f6178f) - (m3472O * (-0.2f)), 0.0f);
                                    path.lineTo(c1245b3.getWidth(), 0.0f);
                                    path.lineTo(c1245b3.getWidth(), c1245b3.getHeight());
                                    path.close();
                                    canvas2.clipPath(path);
                                    c0642f2 = m3539s;
                                } else {
                                    c0642f2 = m3539s;
                                    canvas2.clipRect(f7 + cVar4.f6178f, 0.0f, c1245b3.getWidth(), c1245b3.getHeight());
                                }
                                if (C0143v.m413K(interfaceC0053c.mo159b())) {
                                    Path path2 = new Path();
                                    float m3472O2 = (c1245b3.m3472O(cVar4.f6173a) - (c1245b3.getLineSpacingPixels() / 2)) - c1245b3.getOffsetY();
                                    path2.moveTo(f7 + cVar4.f6179g, m3472O2);
                                    path2.lineTo((f7 + cVar4.f6179g) - (m3472O2 * (-0.2f)), 0.0f);
                                    path2.lineTo(0.0f, 0.0f);
                                    path2.lineTo(0.0f, c1245b3.getHeight());
                                    path2.close();
                                    canvas2.clipPath(path2);
                                } else {
                                    canvas2.clipRect(0.0f, 0.0f, f7 + cVar4.f6179g, c1245b3.getHeight());
                                }
                                int i44 = cVar4.f6173a;
                                long mo163f = interfaceC0053c.mo163f();
                                if (i25 != 0) {
                                    RectF rectF = this.f6143e;
                                    c1245b3.getProps().getClass();
                                    rectF.top = c1245b3.m3473P(i44) - c1245b3.getOffsetY();
                                    rectF.bottom = m3541u(i44) - c1245b3.getOffsetY();
                                    rectF.left = 0.0f;
                                    rectF.right = c1245b3.getWidth();
                                    c1836d6.setColor(i25);
                                    if (c1245b3.getProps().f6099I1) {
                                        cVar = cVar4;
                                        canvas2.drawRoundRect(rectF, c1245b3.getRowHeight() * c1245b3.getProps().f6101K1, c1245b3.getRowHeight() * c1245b3.getProps().f6101K1, c1836d6);
                                    } else {
                                        cVar = cVar4;
                                        canvas2.drawRect(rectF, c1836d6);
                                    }
                                } else {
                                    cVar = cVar4;
                                }
                                if (i24 != 0) {
                                    C1836d c1836d8 = c1836d7;
                                    c1836d8.setTextSkewX(C0143v.m413K(mo163f) ? -0.2f : 0.0f);
                                    c1836d8.setStrikeThruText((mo163f & 1099511627776L) != 0);
                                    int i45 = min - max;
                                    i16 = i34;
                                    i22 = min;
                                    i20 = i42;
                                    i23 = i44;
                                    i18 = i14;
                                    i17 = max;
                                    i19 = i41;
                                    i13 = i37;
                                    c0642f = c0642f2;
                                    c1836d4 = c1836d6;
                                    c1245b2 = c1245b3;
                                    aVar2 = cVar3;
                                    c1836d2 = c1836d8;
                                    m3534n(canvas, m3539s(i34), max, i45, max, i45, false, f8, c1245b3.m3471N(i44) - c1245b3.getOffsetY(), i16);
                                } else {
                                    i16 = i34;
                                    i22 = min;
                                    i23 = i44;
                                    i17 = max;
                                    c1836d4 = c1836d6;
                                    c1245b2 = c1245b3;
                                    aVar2 = cVar3;
                                    c1836d2 = c1836d7;
                                    i18 = i14;
                                    i19 = i41;
                                    i20 = i42;
                                    c0642f = c0642f2;
                                    i13 = i37;
                                }
                                c1836d3 = c1836d4;
                                if (i11 != 0) {
                                    c1836d3.setColor(i11);
                                    c1245b = c1245b2;
                                    float m3472O3 = ((c1245b.m3472O(i23) - (c1245b.getLineSpacingPixels() / 2)) - c1245b.getOffsetY()) - (c1245b.getRowHeightOfText() * 0.05f);
                                    canvas.drawLine(0.0f, m3472O3, c1245b.getWidth(), m3472O3, this.f6141c);
                                } else {
                                    c1245b = c1245b2;
                                }
                                i21 = i22;
                            } else {
                                i16 = i34;
                                cVar = cVar4;
                                i17 = max;
                                c0642f = m3539s;
                                c1836d3 = c1836d6;
                                c1245b = c1245b3;
                                aVar2 = cVar3;
                                c1836d2 = c1836d7;
                                i18 = i14;
                                i19 = i41;
                                i20 = i42;
                                i13 = i37;
                                i21 = min;
                            }
                            if (i21 >= i36) {
                                c1250g = this;
                                break;
                            } else {
                                i34 = i16;
                                f8 = m3544x(c0642f, i34, i17, i21 - i17) + f8;
                                c1250g = this;
                            }
                        }
                        canvas2 = canvas;
                        c1245b3 = c1245b;
                        cVar3 = aVar2;
                        i38 = i20;
                        i37 = i13;
                        i39 = i18;
                        cVar4 = cVar;
                        interfaceC0053c = mo156b;
                        mo157c = i19;
                        i35 = i15;
                        c1836d7 = c1836d2;
                        i25 = i10;
                        c1836d6 = c1836d3;
                        m3539s = c0642f;
                        i24 = i9;
                    }
                    canvas.restore();
                } catch (Exception e7) {
                    aVar = cVar3;
                    c1836d = c1836d7;
                    Log.e("EditorRenderer", "patchTextRegions: Unable to get spans", e7);
                }
            }
            canvas2 = canvas;
            i24 = i9;
            c1245b3 = c1245b;
            cVar3 = aVar2;
            lastVisibleRow = i12;
            i25 = i10;
            c1836d6 = c1836d3;
            firstVisibleRow = i13;
            c1836d7 = c1836d2;
        }
        aVar = cVar3;
        c1836d = c1836d7;
        try {
            aVar.mo155a(-1);
        } catch (Exception e8) {
            Log.w("EditorRenderer", "Failed to release SpanReader", e8);
        }
        C1836d c1836d9 = c1836d;
        c1836d9.setStyle(Paint.Style.FILL);
        c1836d9.setFakeBoldText(false);
        c1836d9.setTextSkewX(0.0f);
        c1836d9.setStrikeThruText(false);
    }
}
