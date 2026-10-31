package p078j4;

import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.InterfaceC1229k;
import p054g4.InterfaceC1236r;
import p054g4.InterfaceC1243y;
import p110n4.C1644a;

/* renamed from: j4.n */
/* loaded from: classes.dex */
public final class C1425n<T> extends AbstractC1424m<T> {

    /* renamed from: a */
    public final InterfaceC1236r<T> f6819a;

    /* renamed from: b */
    public final InterfaceC1229k<T> f6820b;

    /* renamed from: c */
    public final C1226h f6821c;

    /* renamed from: d */
    public final C1644a<T> f6822d;

    /* renamed from: e */
    public final InterfaceC1243y f6823e;

    /* renamed from: f */
    public final boolean f6824f;

    /* renamed from: g */
    public volatile AbstractC1242x<T> f6825g;

    /* renamed from: j4.n$a */
    public final class a {
    }

    public C1425n(InterfaceC1236r interfaceC1236r, InterfaceC1229k interfaceC1229k, C1226h c1226h, C1644a c1644a, boolean z6) {
        new a();
        this.f6819a = interfaceC1236r;
        this.f6820b = interfaceC1229k;
        this.f6821c = c1226h;
        this.f6822d = c1644a;
        this.f6823e = null;
        this.f6824f = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T mo3442a(p117o4.C1667a r3) {
        /*
            r2 = this;
            g4.k<T> r0 = r2.f6820b
            if (r0 != 0) goto Ld
            g4.x r0 = r2.m3796b()
            java.lang.Object r3 = r0.mo3442a(r3)
            return r3
        Ld:
            r3.mo3785x()     // Catch: java.lang.NumberFormatException -> L1c java.io.IOException -> L23 p117o4.C1669c -> L2a java.io.EOFException -> L31
            j4.p$t r1 = p078j4.C1427p.f6854z     // Catch: java.io.EOFException -> L19 java.lang.NumberFormatException -> L1c java.io.IOException -> L23 p117o4.C1669c -> L2a
            java.lang.Object r3 = r1.mo3442a(r3)     // Catch: java.io.EOFException -> L19 java.lang.NumberFormatException -> L1c java.io.IOException -> L23 p117o4.C1669c -> L2a
            g4.l r3 = (p054g4.AbstractC1230l) r3     // Catch: java.io.EOFException -> L19 java.lang.NumberFormatException -> L1c java.io.IOException -> L23 p117o4.C1669c -> L2a
            goto L37
        L19:
            r3 = move-exception
            r1 = 0
            goto L33
        L1c:
            r3 = move-exception
            g4.s r0 = new g4.s
            r0.<init>(r3)
            throw r0
        L23:
            r3 = move-exception
            g4.m r0 = new g4.m
            r0.<init>(r3)
            throw r0
        L2a:
            r3 = move-exception
            g4.s r0 = new g4.s
            r0.<init>(r3)
            throw r0
        L31:
            r3 = move-exception
            r1 = 1
        L33:
            if (r1 == 0) goto L4d
            g4.n r3 = p054g4.C1232n.f5977c
        L37:
            boolean r1 = r2.f6824f
            if (r1 == 0) goto L44
            r3.getClass()
            boolean r3 = r3 instanceof p054g4.C1232n
            if (r3 == 0) goto L44
            r3 = 0
            return r3
        L44:
            n4.a<T> r3 = r2.f6822d
            java.lang.reflect.Type r3 = r3.f7480b
            java.lang.Object r3 = r0.m3449a()
            return r3
        L4d:
            g4.s r0 = new g4.s
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p078j4.C1425n.mo3442a(o4.a):java.lang.Object");
    }

    /* renamed from: b */
    public final AbstractC1242x<T> m3796b() {
        AbstractC1242x<T> abstractC1242x = this.f6825g;
        if (abstractC1242x != null) {
            return abstractC1242x;
        }
        AbstractC1242x<T> m3445c = this.f6821c.m3445c(this.f6823e, this.f6822d);
        this.f6825g = m3445c;
        return m3445c;
    }
}
