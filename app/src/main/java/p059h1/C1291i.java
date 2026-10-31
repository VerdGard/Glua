package p059h1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C0680a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p010b1.C0514c;
import p018c1.AbstractC0580a;
import p018c1.AbstractC0585f;
import p018c1.C0582c;
import p027d1.C0877a;
import p035e1.C0950b;
import p035e1.C0951c;
import p035e1.C0952d;
import p035e1.C0955g;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1160e;
import p051g1.C1204m;
import p075j1.C1403d;
import p083k1.C1449c;

/* renamed from: h1.i */
/* loaded from: classes.dex */
public final class C1291i extends AbstractC1284b {

    /* renamed from: A */
    public final HashMap f6418A;

    /* renamed from: B */
    public final C0582c f6419B;

    /* renamed from: C */
    public final C0020g f6420C;

    /* renamed from: D */
    public final C0680a f6421D;

    /* renamed from: E */
    public final AbstractC0585f f6422E;

    /* renamed from: F */
    public final AbstractC0585f f6423F;

    /* renamed from: G */
    public final C0582c f6424G;

    /* renamed from: H */
    public final C0582c f6425H;

    /* renamed from: v */
    public final char[] f6426v;

    /* renamed from: w */
    public final RectF f6427w;

    /* renamed from: x */
    public final Matrix f6428x;

    /* renamed from: y */
    public final a f6429y;

    /* renamed from: z */
    public final b f6430z;

    /* renamed from: h1.i$a */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: h1.i$b */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public C1291i(C0020g c0020g, C1287e c1287e) {
        super(c0020g, c1287e);
        C1157b c1157b;
        C1157b c1157b2;
        C1156a c1156a;
        C1156a c1156a2;
        this.f6426v = new char[1];
        this.f6427w = new RectF();
        this.f6428x = new Matrix();
        this.f6429y = new a();
        this.f6430z = new b();
        this.f6418A = new HashMap();
        this.f6420C = c0020g;
        this.f6421D = c1287e.f6391b;
        C0582c c0582c = new C0582c(1, (List) c1287e.f6406q.f5720b);
        this.f6419B = c0582c;
        c0582c.m2026a(this);
        m3597d(c0582c);
        C1160e c1160e = c1287e.f6407r;
        if (c1160e != null && (c1156a2 = (C1156a) c1160e.f5708a) != null) {
            AbstractC0580a<?, ?> mo1994a = c1156a2.mo1994a();
            this.f6422E = (AbstractC0585f) mo1994a;
            mo1994a.m2026a(this);
            m3597d(mo1994a);
        }
        if (c1160e != null && (c1156a = (C1156a) c1160e.f5709b) != null) {
            AbstractC0580a<?, ?> mo1994a2 = c1156a.mo1994a();
            this.f6423F = (AbstractC0585f) mo1994a2;
            mo1994a2.m2026a(this);
            m3597d(mo1994a2);
        }
        if (c1160e != null && (c1157b2 = (C1157b) c1160e.f5710c) != null) {
            AbstractC0580a<?, ?> mo1994a3 = c1157b2.mo1994a();
            this.f6424G = (C0582c) mo1994a3;
            mo1994a3.m2026a(this);
            m3597d(mo1994a3);
        }
        if (c1160e == null || (c1157b = (C1157b) c1160e.f5711d) == null) {
            return;
        }
        AbstractC0580a<?, ?> mo1994a4 = c1157b.mo1994a();
        this.f6425H = (C0582c) mo1994a4;
        mo1994a4.m2026a(this);
        m3597d(mo1994a4);
    }

    /* renamed from: p */
    public static void m3607p(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    /* renamed from: q */
    public static void m3608q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // p059h1.AbstractC1284b, p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        C0582c c0582c;
        AbstractC0580a abstractC0580a;
        super.mo1827b(t7, c1449c);
        if ((t7 == InterfaceC0025l.f68a && (abstractC0580a = this.f6422E) != null) || ((t7 == InterfaceC0025l.f69b && (abstractC0580a = this.f6423F) != null) || (t7 == InterfaceC0025l.f78k && (abstractC0580a = this.f6424G) != null))) {
            abstractC0580a.m2034i(c1449c);
        } else {
            if (t7 != InterfaceC0025l.f79l || (c0582c = this.f6425H) == null) {
                return;
            }
            c0582c.m2034i(c1449c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p059h1.AbstractC1284b
    /* renamed from: k */
    public final void mo3600k(Canvas canvas, Matrix matrix, int i7) {
        C0877a c0877a;
        float f7;
        C0680a c0680a;
        String str;
        String str2;
        int i8;
        List list;
        canvas.save();
        C0020g c0020g = this.f6420C;
        if (!(c0020g.f46e.f3252f.f7050m > 0)) {
            canvas.setMatrix(matrix);
        }
        C0950b c0950b = (C0950b) this.f6419B.mo2030e();
        C0680a c0680a2 = this.f6421D;
        C0951c c0951c = c0680a2.f3251e.get(c0950b.f4901b);
        if (c0951c == null) {
            canvas.restore();
            return;
        }
        AbstractC0585f abstractC0585f = this.f6422E;
        int intValue = abstractC0585f != null ? ((Integer) abstractC0585f.mo2030e()).intValue() : c0950b.f4907h;
        a aVar = this.f6429y;
        aVar.setColor(intValue);
        AbstractC0585f abstractC0585f2 = this.f6423F;
        int intValue2 = abstractC0585f2 != null ? ((Integer) abstractC0585f2.mo2030e()).intValue() : c0950b.f4908i;
        b bVar = this.f6430z;
        bVar.setColor(intValue2);
        int intValue3 = (this.f6380t.f2979f.mo2030e().intValue() * 255) / 100;
        aVar.setAlpha(intValue3);
        bVar.setAlpha(intValue3);
        C0582c c0582c = this.f6424G;
        if (c0582c != null) {
            bVar.setStrokeWidth(((Float) c0582c.mo2030e()).floatValue());
        } else {
            bVar.setStrokeWidth(C1403d.m3756c() * c0950b.f4909j * C1403d.m3757d(matrix));
        }
        boolean z6 = c0020g.f46e.f3252f.f7050m > 0;
        C0582c c0582c2 = this.f6425H;
        int i9 = c0950b.f4904e;
        boolean z7 = c0950b.f4910k;
        double d7 = c0950b.f4902c;
        String str3 = c0950b.f4900a;
        String str4 = c0951c.f4912b;
        String str5 = c0951c.f4911a;
        if (z6) {
            float f8 = ((float) d7) / 100.0f;
            float m3757d = C1403d.m3757d(matrix);
            int i10 = 0;
            while (i10 < str3.length()) {
                String str6 = str3;
                C0952d m3880c = c0680a2.f3252f.m3880c(str4.hashCode() + ((str5.hashCode() + ((str3.charAt(i10) + 0) * 31)) * 31));
                if (m3880c == null) {
                    str = str4;
                    c0680a = c0680a2;
                    str2 = str5;
                    i8 = i10;
                } else {
                    HashMap hashMap = this.f6418A;
                    if (hashMap.containsKey(m3880c)) {
                        list = (List) hashMap.get(m3880c);
                        str = str4;
                        c0680a = c0680a2;
                        str2 = str5;
                        i8 = i10;
                    } else {
                        c0680a = c0680a2;
                        List<C1204m> list2 = m3880c.f4913a;
                        str = str4;
                        int size = list2.size();
                        str2 = str5;
                        ArrayList arrayList = new ArrayList(size);
                        i8 = i10;
                        int i11 = 0;
                        while (i11 < size) {
                            arrayList.add(new C0514c(c0020g, this, list2.get(i11)));
                            i11++;
                            list2 = list2;
                            size = size;
                        }
                        hashMap.put(m3880c, arrayList);
                        list = arrayList;
                    }
                    int i12 = 0;
                    while (i12 < list.size()) {
                        Path mo1833f = ((C0514c) list.get(i12)).mo1833f();
                        mo1833f.computeBounds(this.f6427w, false);
                        Matrix matrix2 = this.f6428x;
                        matrix2.set(matrix);
                        List list3 = list;
                        matrix2.preTranslate(0.0f, C1403d.m3756c() * ((float) (-c0950b.f4906g)));
                        matrix2.preScale(f8, f8);
                        mo1833f.transform(matrix2);
                        if (z7) {
                            m3608q(mo1833f, aVar, canvas);
                            m3608q(mo1833f, bVar, canvas);
                        } else {
                            m3608q(mo1833f, bVar, canvas);
                            m3608q(mo1833f, aVar, canvas);
                        }
                        i12++;
                        list = list3;
                    }
                    float m3756c = C1403d.m3756c() * ((float) m3880c.f4915c) * f8 * m3757d;
                    float f9 = i9 / 10.0f;
                    if (c0582c2 != null) {
                        f9 += ((Float) c0582c2.mo2030e()).floatValue();
                    }
                    canvas.translate((f9 * m3757d) + m3756c, 0.0f);
                }
                i10 = i8 + 1;
                str3 = str6;
                c0680a2 = c0680a;
                str4 = str;
                str5 = str2;
            }
        } else {
            String str7 = str3;
            float m3757d2 = C1403d.m3757d(matrix);
            Typeface typeface = null;
            if (c0020g.getCallback() == null) {
                c0877a = null;
            } else {
                if (c0020g.f49w1 == null) {
                    c0020g.f49w1 = new C0877a(c0020g.getCallback());
                }
                c0877a = c0020g.f49w1;
            }
            if (c0877a != null) {
                C0955g c0955g = c0877a.f4646a;
                c0955g.f4921b = str5;
                c0955g.f4922c = str4;
                HashMap hashMap2 = c0877a.f4647b;
                Typeface typeface2 = (Typeface) hashMap2.get(c0955g);
                if (typeface2 != null) {
                    f7 = m3757d2;
                    typeface = typeface2;
                } else {
                    HashMap hashMap3 = c0877a.f4648c;
                    Typeface typeface3 = (Typeface) hashMap3.get(str5);
                    if (typeface3 != null) {
                        f7 = m3757d2;
                    } else {
                        f7 = m3757d2;
                        typeface3 = Typeface.createFromAsset(c0877a.f4649d, "fonts/" + str5 + c0877a.f4650e);
                        hashMap3.put(str5, typeface3);
                    }
                    boolean contains = str4.contains("Italic");
                    boolean contains2 = str4.contains("Bold");
                    int i13 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                    typeface = typeface3.getStyle() == i13 ? typeface3 : Typeface.create(typeface3, i13);
                    hashMap2.put(c0955g, typeface);
                }
            } else {
                f7 = m3757d2;
            }
            if (typeface != null) {
                aVar.setTypeface(typeface);
                aVar.setTextSize((float) (d7 * C1403d.m3756c()));
                bVar.setTypeface(aVar.getTypeface());
                bVar.setTextSize(aVar.getTextSize());
                int i14 = 0;
                while (i14 < str7.length()) {
                    String str8 = str7;
                    char charAt = str8.charAt(i14);
                    char[] cArr = this.f6426v;
                    cArr[0] = charAt;
                    if (z7) {
                        m3607p(cArr, aVar, canvas);
                        m3607p(cArr, bVar, canvas);
                    } else {
                        m3607p(cArr, bVar, canvas);
                        m3607p(cArr, aVar, canvas);
                    }
                    cArr[0] = charAt;
                    float measureText = aVar.measureText(cArr, 0, 1);
                    float f10 = i9 / 10.0f;
                    if (c0582c2 != null) {
                        f10 += ((Float) c0582c2.mo2030e()).floatValue();
                    }
                    canvas.translate((f10 * f7) + measureText, 0.0f);
                    i14++;
                    str7 = str8;
                }
            }
        }
        canvas.restore();
    }
}
