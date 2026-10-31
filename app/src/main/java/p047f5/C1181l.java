package p047f5;

import p191y1.EnumC2229h;

/* renamed from: f5.l */
/* loaded from: classes.dex */
public final class C1181l<T> {

    /* renamed from: a */
    public final c<T> f5773a = new c<>();

    /* renamed from: b */
    public int f5774b = 0;

    /* renamed from: f5.l$a */
    public static class a<V> {

        /* renamed from: a */
        public final b<V>[] f5775a = new b[64];

        /* renamed from: b */
        public final b<V>[] f5776b = new b[64];
    }

    /* renamed from: f5.l$b */
    public static class b<V> {

        /* renamed from: a */
        public b<V> f5777a;

        /* renamed from: b */
        public char f5778b;

        /* renamed from: c */
        public V f5779c;
    }

    /* renamed from: f5.l$c */
    public static class c<T> {

        /* renamed from: a */
        public final a<c<T>> f5780a = new a<>();

        /* renamed from: b */
        public T f5781b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [V, f5.l$c] */
    /* renamed from: a */
    public static void m3393a(c cVar, String str, int i7, int i8, EnumC2229h enumC2229h) {
        b bVar;
        Object obj;
        char charAt = str.charAt(i7);
        a<c<T>> aVar = cVar.f5780a;
        aVar.getClass();
        int i9 = charAt << 6;
        int i10 = charAt & 1;
        b bVar2 = aVar.f5775a[Math.abs(((i10 != 0 ? 3 : 1) * i9) ^ charAt) % 64];
        while (true) {
            bVar = null;
            if (bVar2 == null) {
                obj = null;
                break;
            } else {
                if (bVar2.f5778b == charAt) {
                    obj = bVar2.f5779c;
                    break;
                }
                bVar2 = bVar2.f5777a;
            }
        }
        c cVar2 = (c) obj;
        c cVar3 = cVar2;
        if (cVar2 == null) {
            ?? cVar4 = new c();
            a<c<T>> aVar2 = cVar.f5780a;
            aVar2.getClass();
            int abs = Math.abs((i9 * (i10 == 0 ? 1 : 3)) ^ charAt) % 64;
            b[] bVarArr = aVar2.f5776b;
            b bVar3 = bVarArr[abs];
            b[] bVarArr2 = aVar2.f5775a;
            if (bVar3 == null) {
                b bVar4 = new b();
                bVarArr[abs] = bVar4;
                bVarArr2[abs] = bVar4;
                b bVar5 = bVarArr[abs];
                bVar5.f5778b = charAt;
                bVar5.f5779c = cVar4;
                cVar3 = cVar4;
            } else {
                b bVar6 = bVarArr2[abs];
                while (true) {
                    if (bVar6 == null) {
                        break;
                    }
                    if (bVar6.f5778b == charAt) {
                        bVar = bVar6;
                        break;
                    }
                    bVar6 = bVar6.f5777a;
                }
                if (bVar == null) {
                    b bVar7 = bVarArr[abs];
                    bVar = new b();
                    bVar7.f5777a = bVar;
                    bVarArr[abs] = bVar;
                }
                bVar.f5778b = charAt;
                bVar.f5779c = cVar4;
                cVar3 = cVar4;
            }
        }
        if (i8 == 1) {
            cVar3.f5781b = enumC2229h;
        } else {
            m3393a(cVar3, str, i7 + 1, i8 - 1, enumC2229h);
        }
    }
}
