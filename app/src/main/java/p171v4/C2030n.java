package p171v4;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: v4.n */
/* loaded from: classes.dex */
public final class C2030n {

    /* renamed from: a */
    public String[] f9212a;

    /* renamed from: b */
    public boolean f9213b = true;

    /* renamed from: c */
    public HashMap f9214c;

    /* renamed from: v4.n$a */
    public static class a {

        /* renamed from: a */
        public final ReentrantLock f9215a = new ReentrantLock(true);

        /* renamed from: b */
        public final HashMap f9216b = new HashMap();
    }

    public C2030n(String[] strArr) {
        this.f9212a = strArr;
        HashMap hashMap = new HashMap();
        if (strArr != null) {
            for (String str : strArr) {
                hashMap.put(str, Boolean.TRUE);
            }
        }
        this.f9214c = hashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:66|(2:68|(3:70|(5:72|(1:74)(1:84)|75|(2:82|83)(2:79|80)|81)|85)(11:86|(5:88|(1:90)(1:100)|91|(2:98|99)(2:95|96)|97)|101|102|103|104|(5:121|122|(8:125|(1:127)(1:147)|128|(2:144|141)|134|(2:139|140)(1:142)|141|123)|148|149)|106|(4:109|(2:114|115)(1:117)|116|107)|119|120))|156|102|103|104|(0)|106|(1:107)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0101, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4923a(p022c5.C0644h r20, p022c5.C0638b r21, java.lang.String r22, p171v4.C2024h r23, p171v4.C2030n.a r24) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p171v4.C2030n.m4923a(c5.h, c5.b, java.lang.String, v4.h, v4.n$a):void");
    }
}
