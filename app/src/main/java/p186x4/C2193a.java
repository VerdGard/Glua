package p186x4;

import androidx.activity.C0143v;
import java.util.ArrayList;
import p032d6.C0898f;
import p178w4.C2121a;
import p178w4.C2125e;
import p178w4.C2128h;

/* renamed from: x4.a */
/* loaded from: classes.dex */
public final class C2193a {

    /* renamed from: a */
    public final String f9938a;

    /* renamed from: b */
    public final C2121a f9939b;

    /* renamed from: c */
    public final C2194b f9940c;

    /* renamed from: d */
    public C2195c f9941d;

    public C2193a(String str, ArrayList arrayList) {
        this.f9938a = str;
        this.f9939b = new C2121a(arrayList);
        this.f9940c = new C2194b(str);
    }

    /* renamed from: e */
    public static void m5324e(ArrayList<Object> arrayList, String str) {
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof C2125e)) {
            arrayList.add(new C2125e(str));
            return;
        }
        C2125e c2125e = (C2125e) arrayList.get(arrayList.size() - 1);
        String str2 = c2125e.f9597a + str;
        C0898f.m2606e(str2, "<set-?>");
        c2125e.f9597a = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020e A[EDGE_INSN: B:158:0x020e->B:155:0x020e BREAK  A[LOOP:3: B:109:0x014b->B:157:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5325h(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p186x4.C2193a.m5325h(java.lang.String):void");
    }

    /* renamed from: a */
    public final String m5326a(EnumC2196d enumC2196d) {
        C2195c c2195c = this.f9941d;
        if (c2195c.f9948c != enumC2196d) {
            return null;
        }
        int i7 = c2195c.f9947b;
        int i8 = c2195c.f9946a;
        String substring = this.f9938a.substring(i8, i7 + i8);
        m5331g();
        return substring;
    }

    /* renamed from: b */
    public final String m5327b(EnumC2196d... enumC2196dArr) {
        int i7;
        int i8;
        int length = enumC2196dArr.length;
        String str = this.f9938a;
        if (length != 0) {
            for (EnumC2196d enumC2196d : enumC2196dArr) {
                C2195c c2195c = this.f9941d;
                if (c2195c.f9948c == enumC2196d) {
                    i7 = c2195c.f9947b;
                    i8 = c2195c.f9946a;
                }
            }
            return null;
        }
        C2195c c2195c2 = this.f9941d;
        i8 = c2195c2.f9946a;
        i7 = c2195c2.f9947b;
        String substring = str.substring(i8, i7 + i8);
        m5331g();
        return substring;
    }

    /* renamed from: c */
    public final C2128h m5328c() {
        String m5326a;
        C2195c c2195c = this.f9941d;
        EnumC2196d enumC2196d = EnumC2196d.Dollar;
        if (!m5329d(enumC2196d) || !m5329d(EnumC2196d.CurlyOpen) || (m5326a = m5326a(EnumC2196d.VariableName)) == null) {
            m5330f(c2195c);
            return null;
        }
        boolean m5329d = m5329d(EnumC2196d.Colon);
        EnumC2196d enumC2196d2 = EnumC2196d.CurlyClose;
        if (!m5329d) {
            if (m5329d(EnumC2196d.Forwardslash)) {
                if (m5332i(new C0143v())) {
                    return new C2128h(-1, m5326a, null);
                }
                m5330f(c2195c);
                return null;
            }
            if (m5329d(enumC2196d2)) {
                return new C2128h(-1, m5326a, "");
            }
            m5330f(c2195c);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (!m5329d(enumC2196d2)) {
            EnumC2196d enumC2196d3 = EnumC2196d.Backslash;
            if (m5329d(enumC2196d3)) {
                String m5327b = m5327b(enumC2196d3, enumC2196d, enumC2196d2);
                if (m5327b != null) {
                    sb.append(m5327b);
                } else {
                    sb.append('\\');
                }
            } else {
                C2195c c2195c2 = this.f9941d;
                if (c2195c2.f9948c == EnumC2196d.EOF) {
                    m5330f(c2195c);
                    return null;
                }
                int i7 = c2195c2.f9947b;
                int i8 = c2195c2.f9946a;
                sb.append((CharSequence) this.f9938a, i8, i7 + i8);
                m5331g();
            }
        }
        return new C2128h(-1, m5326a, sb.toString());
    }

    /* renamed from: d */
    public final boolean m5329d(EnumC2196d enumC2196d) {
        if (this.f9941d.f9948c != enumC2196d) {
            return false;
        }
        m5331g();
        return true;
    }

    /* renamed from: f */
    public final void m5330f(C2195c c2195c) {
        int i7 = c2195c.f9946a + c2195c.f9947b;
        C2194b c2194b = this.f9940c;
        c2194b.f9943a = i7;
        c2194b.f9944b = 0;
        this.f9941d = c2195c;
    }

    /* renamed from: g */
    public final void m5331g() {
        if (this.f9941d.f9948c == EnumC2196d.EOF) {
            return;
        }
        this.f9941d = this.f9940c.m5335b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (m5329d(r8) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (m5333j(r8) != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        m5329d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (m5333j(r8) != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0105, code lost:
    
        if (r10 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (m5333j(r8) != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003f A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5332i(androidx.activity.C0143v r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p186x4.C2193a.m5332i(androidx.activity.v):boolean");
    }

    /* renamed from: j */
    public final String m5333j(EnumC2196d enumC2196d) {
        String m5327b;
        C2195c c2195c = this.f9941d;
        StringBuilder sb = new StringBuilder();
        while (true) {
            EnumC2196d enumC2196d2 = this.f9941d.f9948c;
            if (enumC2196d2 == enumC2196d) {
                return sb.toString();
            }
            if (enumC2196d2 == EnumC2196d.EOF) {
                m5330f(c2195c);
                return null;
            }
            EnumC2196d enumC2196d3 = EnumC2196d.Backslash;
            if (m5329d(enumC2196d3)) {
                m5327b = m5327b(enumC2196d3, EnumC2196d.Dollar, EnumC2196d.CurlyClose);
                if (m5327b == null) {
                    m5330f(c2195c);
                    return null;
                }
            } else {
                m5327b = m5327b(new EnumC2196d[0]);
            }
            sb.append(m5327b);
        }
    }
}
