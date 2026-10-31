package p059h1;

import com.airbnb.lottie.C0680a;
import java.util.List;
import java.util.Locale;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1160e;
import p043f1.C1161f;
import p051g1.C1197f;
import p051g1.InterfaceC1193b;
import p083k1.C1447a;
import p120p.C1686g;

/* renamed from: h1.e */
/* loaded from: classes.dex */
public final class C1287e {

    /* renamed from: a */
    public final List<InterfaceC1193b> f6390a;

    /* renamed from: b */
    public final C0680a f6391b;

    /* renamed from: c */
    public final String f6392c;

    /* renamed from: d */
    public final long f6393d;

    /* renamed from: e */
    public final int f6394e;

    /* renamed from: f */
    public final long f6395f;

    /* renamed from: g */
    public final String f6396g;

    /* renamed from: h */
    public final List<C1197f> f6397h;

    /* renamed from: i */
    public final C1161f f6398i;

    /* renamed from: j */
    public final int f6399j;

    /* renamed from: k */
    public final int f6400k;

    /* renamed from: l */
    public final int f6401l;

    /* renamed from: m */
    public final float f6402m;

    /* renamed from: n */
    public final float f6403n;

    /* renamed from: o */
    public final int f6404o;

    /* renamed from: p */
    public final int f6405p;

    /* renamed from: q */
    public final C1156a f6406q;

    /* renamed from: r */
    public final C1160e f6407r;

    /* renamed from: s */
    public final C1157b f6408s;

    /* renamed from: t */
    public final List<C1447a<Float>> f6409t;

    /* renamed from: u */
    public final int f6410u;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lg1/b;>;Lcom/airbnb/lottie/a;Ljava/lang/String;JLjava/lang/Object;JLjava/lang/String;Ljava/util/List<Lg1/f;>;Lf1/f;IIIFFIILf1/a;Lf1/e;Ljava/util/List<Lk1/a<Ljava/lang/Float;>;>;Ljava/lang/Object;Lf1/b;)V */
    public C1287e(List list, C0680a c0680a, String str, long j7, int i7, long j8, String str2, List list2, C1161f c1161f, int i8, int i9, int i10, float f7, float f8, int i11, int i12, C1156a c1156a, C1160e c1160e, List list3, int i13, C1157b c1157b) {
        this.f6390a = list;
        this.f6391b = c0680a;
        this.f6392c = str;
        this.f6393d = j7;
        this.f6394e = i7;
        this.f6395f = j8;
        this.f6396g = str2;
        this.f6397h = list2;
        this.f6398i = c1161f;
        this.f6399j = i8;
        this.f6400k = i9;
        this.f6401l = i10;
        this.f6402m = f7;
        this.f6403n = f8;
        this.f6404o = i11;
        this.f6405p = i12;
        this.f6406q = c1156a;
        this.f6407r = c1160e;
        this.f6409t = list3;
        this.f6410u = i13;
        this.f6408s = c1157b;
    }

    /* renamed from: a */
    public final String m3606a(String str) {
        int i7;
        StringBuilder m4107b = C1686g.m4107b(str);
        m4107b.append(this.f6392c);
        m4107b.append("\n");
        long j7 = this.f6395f;
        C0680a c0680a = this.f6391b;
        C1287e m2185c = c0680a.m2185c(j7);
        if (m2185c != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                m4107b.append(str2);
                m4107b.append(m2185c.f6392c);
                m2185c = c0680a.m2185c(m2185c.f6395f);
                if (m2185c == null) {
                    break;
                }
                str2 = "->";
            }
            m4107b.append(str);
            m4107b.append("\n");
        }
        List<C1197f> list = this.f6397h;
        if (!list.isEmpty()) {
            m4107b.append(str);
            m4107b.append("\tMasks: ");
            m4107b.append(list.size());
            m4107b.append("\n");
        }
        int i8 = this.f6399j;
        if (i8 != 0 && (i7 = this.f6400k) != 0) {
            m4107b.append(str);
            m4107b.append("\tBackground: ");
            m4107b.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(this.f6401l)));
        }
        List<InterfaceC1193b> list2 = this.f6390a;
        if (!list2.isEmpty()) {
            m4107b.append(str);
            m4107b.append("\tShapes:\n");
            for (InterfaceC1193b interfaceC1193b : list2) {
                m4107b.append(str);
                m4107b.append("\t\t");
                m4107b.append(interfaceC1193b);
                m4107b.append("\n");
            }
        }
        return m4107b.toString();
    }

    public final String toString() {
        return m3606a("");
    }
}
