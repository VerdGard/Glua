package p149s5;

import p133q5.C1803f;
import p141r5.AbstractC1840b;
import p164u5.C1977b;

/* renamed from: s5.m */
/* loaded from: classes.dex */
public final class C1899m extends AbstractC1840b {

    /* renamed from: f */
    public final C1803f f8455f;

    /* renamed from: g */
    public final C1977b f8456g;

    public C1899m(int i7, String str) {
        C1803f m4255B = C1803f.m4255B(str);
        this.f8314a = i7;
        this.f8455f = m4255B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r0 == p164u5.EnumC1978c.f8897X) goto L22;
     */
    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4330b(java.io.PrintStream r6) {
        /*
            r5 = this;
            u5.c r0 = p164u5.EnumC1978c.f8927u2
            q5.f r1 = r5.f8455f
            u5.b r2 = r5.f8456g
            if (r2 == 0) goto L1c
            u5.c r3 = r2.f8865d
            if (r3 != 0) goto Ld
            r3 = r0
        Ld:
            u5.c r4 = p164u5.EnumC1978c.f8899Y
            if (r3 != r4) goto L1c
            java.lang.String r0 = r1.mo4251A()
            java.lang.String r1 = ":"
            java.lang.String r0 = r1.concat(r0)
            goto L79
        L1c:
            if (r2 == 0) goto L36
            u5.c r2 = r2.f8865d
            if (r2 != 0) goto L24
            r3 = r0
            goto L25
        L24:
            r3 = r2
        L25:
            u5.c r4 = p164u5.EnumC1978c.f8928v2
            if (r3 == r4) goto L31
            if (r2 != 0) goto L2c
            goto L2d
        L2c:
            r0 = r2
        L2d:
            u5.c r2 = p164u5.EnumC1978c.f8897X
            if (r0 != r2) goto L36
        L31:
            java.lang.String r0 = r1.mo4251A()
            goto L79
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\""
            r0.<init>(r2)
            java.lang.String r1 = r1.mo4251A()
            java.lang.String r3 = "\\"
            java.lang.String r4 = "\\\\"
            java.lang.String r1 = r1.replace(r3, r4)
            java.lang.String r3 = "\\\""
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r3 = "'"
            java.lang.String r4 = "\\'"
            java.lang.String r1 = r1.replace(r3, r4)
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\\n"
            java.lang.String r1 = r1.replace(r3, r4)
            java.lang.String r3 = "\r"
            java.lang.String r4 = "\\r"
            java.lang.String r1 = r1.replace(r3, r4)
            java.lang.String r3 = "\t"
            java.lang.String r4 = "\\t"
            java.lang.String r1 = r1.replace(r3, r4)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L79:
            r6.print(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149s5.C1899m.mo4330b(java.io.PrintStream):void");
    }

    public C1899m(C1977b c1977b) {
        this.f8314a = c1977b.f8862a;
        this.f8455f = c1977b.f8864c;
        this.f8456g = c1977b;
    }

    public C1899m(C1977b c1977b, String str) {
        this.f8314a = c1977b.f8862a;
        this.f8455f = C1803f.m4255B(str);
        this.f8456g = c1977b;
    }
}
