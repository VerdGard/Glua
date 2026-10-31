package p150s6;

import java.util.Arrays;
import p140r4.C1834b;
import p150s6.AbstractC1912h;

/* renamed from: s6.i */
/* loaded from: classes.dex */
public final class C1913i {

    /* renamed from: r */
    public static final char[] f8578r;

    /* renamed from: s */
    public static final int[] f8579s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a */
    public final C1905a f8580a;

    /* renamed from: b */
    public final C1908d f8581b;

    /* renamed from: d */
    public AbstractC1912h f8583d;

    /* renamed from: i */
    public AbstractC1912h.h f8588i;

    /* renamed from: o */
    public String f8594o;

    /* renamed from: c */
    public EnumC1914j f8582c = EnumC1914j.f8638c;

    /* renamed from: e */
    public boolean f8584e = false;

    /* renamed from: f */
    public String f8585f = null;

    /* renamed from: g */
    public final StringBuilder f8586g = new StringBuilder(1024);

    /* renamed from: h */
    public final StringBuilder f8587h = new StringBuilder(1024);

    /* renamed from: j */
    public final AbstractC1912h.g f8589j = new AbstractC1912h.g();

    /* renamed from: k */
    public final AbstractC1912h.f f8590k = new AbstractC1912h.f();

    /* renamed from: l */
    public final AbstractC1912h.b f8591l = new AbstractC1912h.b();

    /* renamed from: m */
    public final AbstractC1912h.d f8592m = new AbstractC1912h.d();

    /* renamed from: n */
    public final AbstractC1912h.c f8593n = new AbstractC1912h.c();

    /* renamed from: p */
    public final int[] f8595p = new int[1];

    /* renamed from: q */
    public final int[] f8596q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8578r = cArr;
        Arrays.sort(cArr);
    }

    public C1913i(C1905a c1905a, C1908d c1908d) {
        this.f8580a = c1905a;
        this.f8581b = c1908d;
    }

    /* renamed from: a */
    public final void m4508a(EnumC1914j enumC1914j) {
        this.f8580a.m4433a();
        this.f8582c = enumC1914j;
    }

    /* renamed from: b */
    public final void m4509b(String str) {
        C1908d c1908d = this.f8581b;
        if (c1908d.m4489a()) {
            C1905a c1905a = this.f8580a;
            c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c2, code lost:
    
        if (r1.m4445n('=', '-', '_') == false) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] m4510c(java.lang.Character r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1913i.m4510c(java.lang.Character, boolean):int[]");
    }

    /* renamed from: d */
    public final AbstractC1912h.h m4511d(boolean z6) {
        AbstractC1912h.h hVar;
        if (z6) {
            hVar = this.f8589j;
            hVar.mo4498f();
        } else {
            hVar = this.f8590k;
            hVar.mo4498f();
        }
        this.f8588i = hVar;
        return hVar;
    }

    /* renamed from: e */
    public final void m4512e() {
        AbstractC1912h.m4492g(this.f8587h);
    }

    /* renamed from: f */
    public final void m4513f(char c7) {
        m4514g(String.valueOf(c7));
    }

    /* renamed from: g */
    public final void m4514g(String str) {
        if (this.f8585f == null) {
            this.f8585f = str;
            return;
        }
        StringBuilder sb = this.f8586g;
        if (sb.length() == 0) {
            sb.append(this.f8585f);
        }
        sb.append(str);
    }

    /* renamed from: h */
    public final void m4515h(AbstractC1912h abstractC1912h) {
        if (this.f8584e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f8583d = abstractC1912h;
        this.f8584e = true;
        int i7 = abstractC1912h.f8560a;
        if (i7 == 2) {
            this.f8594o = ((AbstractC1912h.g) abstractC1912h).f8569b;
            return;
        }
        if (i7 != 3 || ((AbstractC1912h.f) abstractC1912h).f8577j == null) {
            return;
        }
        C1908d c1908d = this.f8581b;
        if (c1908d.m4489a()) {
            C1905a c1905a = this.f8580a;
            c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Attributes incorrectly present on end tag"));
        }
    }

    /* renamed from: i */
    public final void m4516i() {
        m4515h(this.f8593n);
    }

    /* renamed from: j */
    public final void m4517j() {
        m4515h(this.f8592m);
    }

    /* renamed from: k */
    public final void m4518k() {
        AbstractC1912h.h hVar = this.f8588i;
        if (hVar.f8571d != null) {
            hVar.m4507o();
        }
        m4515h(this.f8588i);
    }

    /* renamed from: l */
    public final void m4519l(EnumC1914j enumC1914j) {
        C1908d c1908d = this.f8581b;
        if (c1908d.m4489a()) {
            C1905a c1905a = this.f8580a;
            c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{enumC1914j}));
        }
    }

    /* renamed from: m */
    public final void m4520m(EnumC1914j enumC1914j) {
        C1908d c1908d = this.f8581b;
        if (c1908d.m4489a()) {
            C1905a c1905a = this.f8580a;
            c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c1905a.m4440i()), enumC1914j}));
        }
    }

    /* renamed from: n */
    public final boolean m4521n() {
        return this.f8594o != null && this.f8588i.m4505m().equalsIgnoreCase(this.f8594o);
    }
}
