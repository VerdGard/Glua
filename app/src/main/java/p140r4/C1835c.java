package p140r4;

import android.util.Log;
import androidx.activity.C0143v;
import java.util.List;
import p002a1.C0017d;
import p006a5.InterfaceC0053c;
import p022c5.C0641e;
import p022c5.C0642f;
import p031d5.C0892c;
import p047f5.C1178i;
import p087k5.C1461a;
import p087k5.C1464d;

/* renamed from: r4.c */
/* loaded from: classes.dex */
public final class C1835c {

    /* renamed from: n */
    public static final C1835c[] f8282n = new C1835c[5];

    /* renamed from: a */
    public C1836d f8283a;

    /* renamed from: b */
    public C0642f f8284b;

    /* renamed from: c */
    public C1464d f8285c;

    /* renamed from: d */
    public C0892c f8286d;

    /* renamed from: e */
    public int f8287e;

    /* renamed from: f */
    public int f8288f;

    /* renamed from: g */
    public int f8289g;

    /* renamed from: h */
    public int f8290h;

    /* renamed from: i */
    public List<InterfaceC0053c> f8291i;

    /* renamed from: k */
    public List<Integer> f8293k;

    /* renamed from: l */
    public boolean f8294l;

    /* renamed from: j */
    public boolean f8292j = true;

    /* renamed from: m */
    public final C0892c f8295m = new C0892c(new long[]{C0017d.m68G(0, 0)}, 0);

    /* renamed from: d */
    public static C1835c m4315d(boolean z6) {
        C1835c[] c1835cArr;
        C1835c c1835c;
        synchronized (f8282n) {
            int i7 = 5;
            do {
                i7--;
                if (i7 < 0) {
                    C1835c c1835c2 = new C1835c();
                    c1835c2.f8294l = z6;
                    return c1835c2;
                }
                c1835cArr = f8282n;
                c1835c = c1835cArr[i7];
            } while (c1835c == null);
            c1835cArr[i7] = null;
            c1835c.f8294l = z6;
            return c1835c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b8, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m4316a(int r33, float r34) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p140r4.C1835c.m4316a(int, float):long");
    }

    /* renamed from: b */
    public final float m4317b(int i7, int i8) {
        C1461a m3844b;
        float[] fArr;
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("negative start position");
        }
        if (i7 < i8) {
            return (!this.f8292j || (m3844b = this.f8285c.f6985a.m3844b(this.f8287e)) == null || (fArr = m3844b.f6977b) == null || i8 >= fArr.length) ? m4318c(i7, i8, null) : fArr[i8] - fArr[i7];
        }
        if (i7 == i8) {
            return 0.0f;
        }
        Log.w("GraphicTextRow", "start > end. if this is caused by editor, please provide feedback", new Throwable());
        return 0.0f;
    }

    /* renamed from: c */
    public final float m4318c(int i7, int i8, float[] fArr) {
        boolean z6;
        float f7;
        boolean z7;
        long j7;
        int i9;
        C1838f c1838f;
        int i10;
        float measureText;
        int i11;
        int i12;
        C0892c c0892c;
        int i13;
        int i14;
        boolean z8;
        float f8;
        int i15;
        C1838f c1838f2;
        int i16;
        int i17;
        C0892c c0892c2;
        int i18;
        boolean isFakeBoldText = this.f8283a.isFakeBoldText();
        float textSkewX = this.f8283a.getTextSkewX();
        int max = Math.max(i7, this.f8288f);
        int min = Math.min(i8, this.f8289g);
        C1838f c1838f3 = new C1838f(min, this.f8291i, this.f8293k);
        long j8 = 0;
        boolean z9 = true;
        float f9 = 0.0f;
        while (true) {
            int i19 = c1838f3.f5769f;
            int i20 = c1838f3.f5764a;
            if (!(i19 < i20)) {
                break;
            }
            if (z9) {
                c1838f3.m4329c(max);
                z7 = false;
            } else {
                c1838f3.m3388b();
                z7 = z9;
            }
            int i21 = c1838f3.f5768e;
            int min2 = Math.min(min, Math.min(c1838f3.f5769f, i20));
            if (i21 > min2 || (i21 == min2 && min2 >= min)) {
                break;
            }
            int m3387a = c1838f3.m3387a() - 1;
            long mo159b = (m3387a < 0 ? C0143v.m425W(5L, 0) : c1838f3.f8306g.get(m3387a)).mo159b();
            if (mo159b != j8) {
                if (C0143v.m412J(mo159b) != C0143v.m412J(j8)) {
                    this.f8283a.setFakeBoldText(C0143v.m412J(mo159b));
                }
                if (C0143v.m413K(mo159b) != C0143v.m413K(j8)) {
                    this.f8283a.setTextSkewX(C0143v.m413K(mo159b) ? -0.2f : 0.0f);
                }
                j7 = mo159b;
            } else {
                j7 = j8;
            }
            int m3387a2 = c1838f3.m3387a() - 1;
            C1178i.a[] aVarArr = c1838f3.f5765b;
            C1178i.a aVar = aVarArr[0];
            int min3 = Math.min(i21, m3387a2 < 0 ? 0 : m3387a2 >= aVar.mo3390b() ? i20 : Math.min(aVar.mo3389a(m3387a2), i20));
            int m3387a3 = c1838f3.m3387a();
            C1178i.a aVar2 = aVarArr[0];
            if (m3387a3 < 0) {
                i20 = 0;
            } else if (m3387a3 < aVar2.mo3390b()) {
                i20 = Math.min(aVar2.mo3389a(m3387a3), i20);
            }
            int min4 = Math.min(this.f8289g, Math.max(min2, i20));
            if (i21 >= min2) {
                z6 = isFakeBoldText;
                f7 = textSkewX;
                i9 = max;
                c1838f = c1838f3;
                measureText = 0.0f;
                i10 = min2;
            } else {
                C0892c c0892c3 = this.f8286d;
                if (c0892c3 == null) {
                    c0892c3 = this.f8284b.mo2157a() ? C0017d.m98w(this.f8284b) : this.f8295m;
                }
                C0892c c0892c4 = c0892c3;
                float f10 = this.f8283a.f8296a * this.f8290h;
                float f11 = 0.0f;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (i23 >= c0892c4.f4677a.length) {
                        z6 = isFakeBoldText;
                        f7 = textSkewX;
                        i9 = max;
                        c1838f = c1838f3;
                        i10 = min2;
                        break;
                    }
                    int max2 = Math.max(i21, c0892c4.m2598b(i23));
                    int min5 = Math.min(min2, c0892c4.m2597a(i23));
                    if (min5 > max2) {
                        float f12 = f11;
                        int i24 = i22;
                        int i25 = max2;
                        while (i25 < min5) {
                            if (this.f8284b.charAt(i25) == '\t') {
                                i24++;
                                if (fArr != null) {
                                    fArr[i25] = f10;
                                }
                                if (max2 < i25) {
                                    i13 = i25;
                                    i15 = max;
                                    i16 = min5;
                                    c1838f2 = c1838f3;
                                    i17 = i23;
                                    f8 = textSkewX;
                                    c0892c2 = c0892c4;
                                    z8 = isFakeBoldText;
                                    i18 = min2;
                                    i14 = i21;
                                    f12 += this.f8283a.m4323c(this.f8284b.f3159c, max2, i25 - max2, min3, min4 - min3, c0892c4.m2599c(i23), fArr, fArr == null ? 0 : max2, this.f8294l);
                                } else {
                                    i13 = i25;
                                    i14 = i21;
                                    z8 = isFakeBoldText;
                                    f8 = textSkewX;
                                    i15 = max;
                                    c1838f2 = c1838f3;
                                    i16 = min5;
                                    i17 = i23;
                                    c0892c2 = c0892c4;
                                    i18 = min2;
                                }
                                max2 = i13 + 1;
                            } else {
                                i13 = i25;
                                i14 = i21;
                                z8 = isFakeBoldText;
                                f8 = textSkewX;
                                i15 = max;
                                c1838f2 = c1838f3;
                                i16 = min5;
                                i17 = i23;
                                c0892c2 = c0892c4;
                                i18 = min2;
                            }
                            i25 = i13 + 1;
                            min2 = i18;
                            c0892c4 = c0892c2;
                            min5 = i16;
                            i23 = i17;
                            max = i15;
                            textSkewX = f8;
                            isFakeBoldText = z8;
                            i21 = i14;
                            c1838f3 = c1838f2;
                        }
                        i11 = i21;
                        z6 = isFakeBoldText;
                        f7 = textSkewX;
                        i9 = max;
                        c1838f = c1838f3;
                        int i26 = min5;
                        i12 = i23;
                        c0892c = c0892c4;
                        i10 = min2;
                        if (max2 < i26) {
                            f12 += this.f8283a.m4323c(this.f8284b.f3159c, max2, i26 - max2, min3, min4 - min3, c0892c.m2599c(i12), fArr, fArr == null ? 0 : max2, this.f8294l);
                        }
                        f11 = f12;
                        i22 = i24;
                    } else {
                        i11 = i21;
                        z6 = isFakeBoldText;
                        f7 = textSkewX;
                        i9 = max;
                        c1838f = c1838f3;
                        i12 = i23;
                        c0892c = c0892c4;
                        i10 = min2;
                    }
                    if (c0892c.m2598b(i12) >= i10) {
                        break;
                    }
                    i23 = i12 + 1;
                    c1838f3 = c1838f;
                    min2 = i10;
                    c0892c4 = c0892c;
                    max = i9;
                    textSkewX = f7;
                    isFakeBoldText = z6;
                    i21 = i11;
                }
                measureText = ((i22 == 0 ? 0.0f : f10 - this.f8283a.measureText("\t")) * i22) + f11;
            }
            f9 += measureText;
            if (i10 >= min) {
                break;
            }
            c1838f3 = c1838f;
            z9 = z7;
            j8 = j7;
            max = i9;
            textSkewX = f7;
            isFakeBoldText = z6;
        }
        z6 = isFakeBoldText;
        f7 = textSkewX;
        this.f8283a.setFakeBoldText(z6);
        this.f8283a.setTextSkewX(f7);
        return f9;
    }

    /* renamed from: e */
    public final void m4319e() {
        this.f8284b = null;
        this.f8291i = null;
        this.f8283a = null;
        int i7 = 0;
        this.f8287e = 0;
        this.f8290h = 0;
        this.f8289g = 0;
        this.f8288f = 0;
        this.f8292j = true;
        this.f8293k = null;
        this.f8286d = null;
        this.f8285c = null;
        synchronized (f8282n) {
            while (true) {
                C1835c[] c1835cArr = f8282n;
                if (i7 >= 5) {
                    break;
                }
                if (c1835cArr[i7] == null) {
                    c1835cArr[i7] = this;
                    break;
                }
                i7++;
            }
        }
    }

    /* renamed from: f */
    public final void m4320f(C0641e c0641e, int i7, int i8, int i9, List<InterfaceC0053c> list, C1836d c1836d, C1464d c1464d) {
        this.f8283a = c1836d;
        C0642f m2146r = c0641e.m2146r(i7);
        this.f8284b = m2146r;
        this.f8286d = m2146r.mo2157a() ? c0641e.m2148t(i7) : null;
        this.f8288f = i8;
        this.f8289g = i9;
        this.f8291i = list;
        this.f8290h = c1464d.f6987c;
        this.f8285c = c1464d;
        this.f8287e = i7;
        this.f8295m.f4678b = this.f8284b.f3160e;
    }
}
