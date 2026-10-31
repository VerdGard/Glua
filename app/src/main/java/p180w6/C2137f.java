package p180w6;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1991i;
import p165u6.C1998p;
import p165u6.C1999q;

/* renamed from: w6.f */
/* loaded from: classes.dex */
public final class C2137f extends AbstractC2150s {

    /* renamed from: l2 */
    public static final String[] f9677l2 = {"address", "value", "flags", "name", "freeze", "freezeType", "freezeFrom", "freezeTo"};

    /* renamed from: g2 */
    public final Integer f9678g2 = 0;

    /* renamed from: h2 */
    public final C1981b f9679h2;

    /* renamed from: i2 */
    public ArrayList f9680i2;

    /* renamed from: j2 */
    public BufferedWriter f9681j2;

    /* renamed from: k2 */
    public HashMap f9682k2;

    public C2137f(C1981b c1981b) {
        this.f9679h2 = c1981b;
    }

    /* renamed from: L2 */
    public static void m5198L2(Writer writer, String[] strArr, Map map, AbstractC2003u abstractC2003u) {
        if (abstractC2003u instanceof C1999q) {
            writer.write("v[");
            writer.write(Integer.toString(((Integer) map.get(abstractC2003u)).intValue()));
            writer.write(93);
        } else {
            if (!(abstractC2003u instanceof C1998p)) {
                writer.write(abstractC2003u.mo4645M());
                return;
            }
            String mo4645M = abstractC2003u.mo4645M();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (mo4645M.equals(strArr[i7])) {
                    writer.write(i7 + 97);
                    return;
                }
            }
            m5199M2(writer, mo4645M);
        }
    }

    /* renamed from: M2 */
    public static void m5199M2(Appendable appendable, String str) {
        appendable.append('\'');
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '\'' || charAt == '\\') {
                appendable.append('\\');
            } else {
                switch (charAt) {
                }
            }
            appendable.append(charAt);
        }
        appendable.append('\'');
    }

    /* renamed from: I2 */
    public final void m5200I2(C1999q c1999q) {
        if (this.f9682k2.put(c1999q, this.f9678g2) == null && (c1999q instanceof C1999q)) {
            c1999q.getClass();
            C1999q.d dVar = c1999q.new d(c1999q);
            while (dVar.m4845b()) {
                int i7 = 0;
                while (i7 < 2) {
                    AbstractC2003u m4844a = i7 == 0 ? dVar.m4844a() : dVar.m4846c();
                    if (m4844a instanceof C1999q) {
                        m5200I2((C1999q) m4844a);
                    }
                    i7++;
                }
            }
        }
    }

    /* renamed from: J2 */
    public final void m5201J2() {
        AbstractC2003u m4844a;
        String[] strArr = f9677l2;
        BufferedWriter bufferedWriter = this.f9681j2;
        ArrayList arrayList = this.f9680i2;
        HashMap hashMap = this.f9682k2;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            C1999q c1999q = (C1999q) it.next();
            i7++;
            c1999q.getClass();
            C1999q.d dVar = c1999q.new d(c1999q);
            boolean z6 = true;
            while (dVar.m4845b()) {
                int i8 = dVar.f9058a == null ? dVar.f9059b + 1 : 0;
                AbstractC2003u m4846c = dVar.m4846c();
                if (m4846c instanceof C1999q) {
                    m4844a = i8 != 0 ? null : dVar.m4844a();
                } else if (i8 == 0) {
                    m4844a = dVar.m4844a();
                    if (!(m4844a instanceof C1999q)) {
                    }
                }
                if (z6) {
                    bufferedWriter.write("\nt=v[");
                    bufferedWriter.write(Integer.toString(i7));
                    bufferedWriter.write(93);
                    z6 = false;
                }
                bufferedWriter.write("\nt[");
                if (m4844a == null) {
                    bufferedWriter.write(Integer.toString(i8));
                } else {
                    m5198L2(bufferedWriter, strArr, hashMap, m4844a);
                }
                bufferedWriter.write("]=");
                m5198L2(bufferedWriter, strArr, hashMap, m4846c);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* renamed from: K2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5202K2() {
        /*
            r12 = this;
            java.lang.String[] r0 = p180w6.C2137f.f9677l2
            java.io.BufferedWriter r1 = r12.f9681j2
            java.lang.String r2 = "local "
            r1.write(r2)
            r1 = 0
            r2 = 0
        Lb:
            r3 = 8
            if (r2 >= r3) goto L21
            java.io.BufferedWriter r3 = r12.f9681j2
            int r4 = r2 + 97
            char r4 = (char) r4
            r3.write(r4)
            java.io.BufferedWriter r3 = r12.f9681j2
            r4 = 44
            r3.write(r4)
            int r2 = r2 + 1
            goto Lb
        L21:
            java.io.BufferedWriter r2 = r12.f9681j2
            java.lang.String r4 = "v,t="
            r2.write(r4)
            r2 = 0
        L29:
            if (r2 >= r3) goto L43
            java.io.BufferedWriter r4 = r12.f9681j2
            r5 = 39
            r4.write(r5)
            java.io.BufferedWriter r4 = r12.f9681j2
            r5 = r0[r2]
            r4.write(r5)
            java.io.BufferedWriter r4 = r12.f9681j2
            java.lang.String r5 = "',"
            r4.write(r5)
            int r2 = r2 + 1
            goto L29
        L43:
            java.io.BufferedWriter r2 = r12.f9681j2
            java.lang.String r3 = "nil\nv={"
            r2.write(r3)
            java.io.BufferedWriter r2 = r12.f9681j2
            java.util.HashMap r3 = r12.f9682k2
            java.util.ArrayList r4 = r12.f9680i2
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L55:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lcc
            java.lang.Object r6 = r4.next()
            u6.q r6 = (p165u6.C1999q) r6
            r7 = 1
            int r5 = r5 + r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r8)
            java.lang.String r8 = "{"
            r2.write(r8)
            r6.getClass()
            u6.q$C1999q.d r8 = new u6.q$C1999q.d
            r8.<init>(r6)
            r6 = 1
        L78:
            boolean r9 = r8.m4845b()
            if (r9 == 0) goto Lc6
            u6.q$i r9 = r8.f9058a
            if (r9 != 0) goto L86
            int r9 = r8.f9059b
            int r9 = r9 + r7
            goto L87
        L86:
            r9 = 0
        L87:
            java.lang.String r10 = "["
            if (r9 != 0) goto L9b
            u6.u r9 = r8.m4844a()
            boolean r11 = r9 instanceof p165u6.C1999q
            if (r11 == 0) goto L94
            goto L78
        L94:
            r2.write(r10)
            m5198L2(r2, r0, r3, r9)
            goto La7
        L9b:
            if (r9 == r6) goto Lad
            r2.write(r10)
            java.lang.String r9 = java.lang.Integer.toString(r9)
            r2.write(r9)
        La7:
            java.lang.String r9 = "]="
            r2.write(r9)
            goto Laf
        Lad:
            int r6 = r6 + 1
        Laf:
            u6.u r9 = r8.m4846c()
            boolean r10 = r9 instanceof p165u6.C1999q
            if (r10 == 0) goto Lbd
            java.lang.String r9 = "nil"
            r2.write(r9)
            goto Lc0
        Lbd:
            m5198L2(r2, r0, r3, r9)
        Lc0:
            java.lang.String r9 = ";"
            r2.write(r9)
            goto L78
        Lc6:
            java.lang.String r6 = "};"
            r2.write(r6)
            goto L55
        Lcc:
            java.lang.String r0 = "}"
            r2.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180w6.C2137f.m5202K2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N2 */
    public final void m5203N2(String str, AbstractC2003u abstractC2003u) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new C2136e(this, str)));
            this.f9681j2 = bufferedWriter;
            if (abstractC2003u instanceof C1999q) {
                this.f9682k2 = new HashMap();
                m5200I2((C1999q) abstractC2003u);
                this.f9680i2 = new ArrayList(this.f9682k2.keySet());
                m5202K2();
                m5201J2();
                bufferedWriter.write("\nreturn v[" + this.f9682k2.get(abstractC2003u) + "]\n");
                this.f9682k2 = null;
            } else {
                if (abstractC2003u instanceof C1998p) {
                    bufferedWriter.write("return ");
                    m5199M2(bufferedWriter, abstractC2003u.mo4645M());
                } else {
                    bufferedWriter.write("return ");
                    bufferedWriter.write(abstractC2003u.mo4645M());
                }
                bufferedWriter.write(10);
            }
            bufferedWriter.close();
        } finally {
            this.f9681j2 = null;
            this.f9682k2 = null;
            this.f9680i2 = null;
        }
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        AbstractC2003u mo4623t = abstractC1984c0.mo4623t(1);
        String m4649x = abstractC1984c0.m4649x(2);
        C1981b c1981b = this.f9679h2;
        try {
            if (m4649x != null) {
                if (!m4649x.equals(c1981b.f8954u2)) {
                    c1981b.f8954u2 = m4649x;
                }
                m5203N2(m4649x, mo4623t);
                return AbstractC2003u.f9130m;
            }
            m5203N2(m4649x, mo4623t);
            return AbstractC2003u.f9130m;
        } catch (Throwable th) {
            return C1998p.m4815M2(th.toString());
        }
        int i7 = c1981b.f8955v2 + 1;
        c1981b.f8955v2 = i7;
        if (i7 >= 1024) {
            throw new C1991i("Too many open files: " + c1981b.f8955v2 + "; last: " + m4649x);
        }
    }
}
