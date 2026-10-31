package p104m6;

/* renamed from: m6.p1 */
/* loaded from: classes.dex */
public final class C1603p1 extends AbstractC1612s1 {

    /* renamed from: E1 */
    public final String f7390E1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1603p1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r1 = 46
            r2 = 47
            java.lang.String r3 = r5.replace(r1, r2)
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 14
            r4.<init>(r3, r0)
            java.lang.String r5 = r5.replace(r2, r1)
            r4.f7390E1 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p104m6.C1603p1.<init>(java.lang.String):void");
    }

    @Override // p104m6.AbstractC1624w1
    public final boolean equals(Object obj) {
        if (obj instanceof C1603p1) {
            return ((C1603p1) obj).f7390E1.equals(this.f7390E1);
        }
        return false;
    }

    @Override // p104m6.AbstractC1624w1
    public final int hashCode() {
        return this.f7390E1.hashCode();
    }
}
