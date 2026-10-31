package p036e2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e2.k5 */
/* loaded from: classes.dex */
public abstract class EnumC1032k5 {

    /* renamed from: X */
    public static final d f5213X;

    /* renamed from: Y */
    public static final e f5214Y;

    /* renamed from: Z */
    public static final /* synthetic */ EnumC1032k5[] f5215Z;

    /* renamed from: e */
    public static final a f5216e;

    /* renamed from: m */
    public static final b f5217m;

    /* renamed from: s */
    public static final c f5218s;

    /* renamed from: c */
    public final int f5219c;

    /* renamed from: e2.k5$a */
    public enum a extends EnumC1032k5 {
        public a() {
            super("AP_LIST", 0, 0);
        }

        @Override // p036e2.EnumC1032k5
        /* renamed from: b */
        public final AbstractC1025j5 mo3096b(Context context) {
            return new C1046m5(0, context);
        }
    }

    /* renamed from: e2.k5$b */
    public enum b extends EnumC1032k5 {
        public b() {
            super("APP_LIST", 1, 1);
        }

        @Override // p036e2.EnumC1032k5
        /* renamed from: b */
        public final AbstractC1025j5 mo3096b(Context context) {
            return new C1067p5(context);
        }
    }

    /* renamed from: e2.k5$c */
    public enum c extends EnumC1032k5 {
        public c() {
            super("APP_TRACE", 2, 2);
        }

        @Override // p036e2.EnumC1032k5
        /* renamed from: b */
        public final AbstractC1025j5 mo3096b(Context context) {
            return new C1046m5(1, context);
        }
    }

    /* renamed from: e2.k5$d */
    public enum d extends EnumC1032k5 {
        public d() {
            super("APP_CHANGE", 3, 3);
        }

        @Override // p036e2.EnumC1032k5
        /* renamed from: b */
        public final AbstractC1025j5 mo3096b(Context context) {
            return new C1060o5(context);
        }
    }

    /* renamed from: e2.k5$e */
    public enum e extends EnumC1032k5 {
        public e() {
            super("APP_APK", 4, 4);
        }

        @Override // p036e2.EnumC1032k5
        /* renamed from: b */
        public final AbstractC1025j5 mo3096b(Context context) {
            return new C1053n5(context);
        }
    }

    static {
        a aVar = new a();
        f5216e = aVar;
        b bVar = new b();
        f5217m = bVar;
        c cVar = new c();
        f5218s = cVar;
        d dVar = new d();
        f5213X = dVar;
        e eVar = new e();
        f5214Y = eVar;
        f5215Z = new EnumC1032k5[]{aVar, bVar, cVar, dVar, eVar};
    }

    public EnumC1032k5(String str, int i7, int i8) {
        this.f5219c = i8;
    }

    public static EnumC1032k5 valueOf(String str) {
        return (EnumC1032k5) Enum.valueOf(EnumC1032k5.class, str);
    }

    public static EnumC1032k5[] values() {
        return (EnumC1032k5[]) f5215Z.clone();
    }

    /* renamed from: a */
    public final synchronized int m3095a(Context context, ArrayList<Long> arrayList) {
        int i7 = 0;
        if (arrayList.size() == 0) {
            return 0;
        }
        AbstractC1025j5 abstractC1025j5 = null;
        try {
            try {
                abstractC1025j5 = mo3096b(context);
            } finally {
                if (0 != 0) {
                    abstractC1025j5.close();
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        if (!abstractC1025j5.m3074e()) {
            abstractC1025j5.close();
            return 0;
        }
        int size = arrayList.size();
        int i8 = 0;
        while (i7 < size) {
            try {
                if (!abstractC1025j5.mo3077h(arrayList.get(i7).longValue())) {
                    abstractC1025j5.close();
                    return i8;
                }
                i8++;
                i7++;
            } catch (Exception e8) {
                e = e8;
                i7 = i8;
                C1016i3.f5129e.m386n(e);
                i8 = i7;
                return i8;
            }
        }
        abstractC1025j5.close();
        return i8;
    }

    /* renamed from: b */
    public abstract AbstractC1025j5 mo3096b(Context context);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* renamed from: c */
    public final synchronized List m3097c(int i7, Context context) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        m3098d(context, arrayList2, arrayList3, arrayList4, i7);
        if (arrayList4.size() != 0 && arrayList2.size() == 0 && arrayList3.size() == 0) {
            C1018i5 c1018i5 = (C1018i5) arrayList4.get(0);
            long j7 = c1018i5.f5132a;
            String str = c1018i5.f5133b;
            arrayList3.add(Long.valueOf(j7));
            arrayList2.add(str);
        }
        int m3095a = m3095a(context, arrayList3);
        int size = arrayList2.size();
        arrayList = arrayList2;
        if (m3095a != size) {
            arrayList = arrayList2.subList(0, m3095a);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x002d, code lost:
    
        if (r6 == null) goto L20;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3098d(android.content.Context r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14, int r15) {
        /*
            r10 = this;
            int r0 = r10.m3102h(r11)
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            if (r0 <= 0) goto L78
            if (r0 >= r1) goto Le
            r1 = r0
        Le:
            monitor-enter(r10)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r5.<init>()     // Catch: java.lang.Throwable -> L75
            r6 = 0
            e2.j5 r6 = r10.mo3096b(r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            boolean r7 = r6.m3074e()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r7 != 0) goto L20
            goto L2f
        L20:
            java.util.ArrayList r5 = r6.mo3073d(r1, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            goto L2f
        L25:
            r11 = move-exception
            goto L6f
        L27:
            r7 = move-exception
            e2.i3 r8 = p036e2.C1016i3.f5129e     // Catch: java.lang.Throwable -> L25
            r8.m386n(r7)     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L32
        L2f:
            r6.close()     // Catch: java.lang.Throwable -> L75
        L32:
            monitor-exit(r10)
            if (r3 != 0) goto L44
            int r6 = r5.size()
            if (r6 == 0) goto L44
            java.lang.Object r6 = r5.get(r2)
            e2.i5 r6 = (p036e2.C1018i5) r6
            r14.add(r6)
        L44:
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r5.next()
            e2.i5 r6 = (p036e2.C1018i5) r6
            long r7 = r6.f5132a
            java.lang.String r6 = r6.f5133b
            int r9 = r6.length()
            int r9 = r9 + r4
            if (r9 <= r15) goto L60
            goto L6c
        L60:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r13.add(r4)
            r12.add(r6)
            r4 = r9
            goto L48
        L6c:
            int r0 = r0 - r1
            int r3 = r3 + r1
            goto L9
        L6f:
            if (r6 == 0) goto L74
            r6.close()     // Catch: java.lang.Throwable -> L75
        L74:
            throw r11     // Catch: java.lang.Throwable -> L75
        L75:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.EnumC1032k5.m3098d(android.content.Context, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r0 == null) goto L17;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m3099e(long r2, android.content.Context r4, java.lang.String r5) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            e2.j5 r0 = r1.mo3096b(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            boolean r4 = r0.m3074e()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 != 0) goto L11
            r0.close()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r1)
            return
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r0.mo3071b(r2, r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L23
        L19:
            r2 = move-exception
            goto L28
        L1b:
            r2 = move-exception
            e2.i3 r3 = p036e2.C1016i3.f5129e     // Catch: java.lang.Throwable -> L19
            r3.m386n(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L26
        L23:
            r0.close()     // Catch: java.lang.Throwable -> L2e
        L26:
            monitor-exit(r1)
            return
        L28:
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L2e
        L2d:
            throw r2     // Catch: java.lang.Throwable -> L2e
        L2e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.EnumC1032k5.m3099e(long, android.content.Context, java.lang.String):void");
    }

    /* renamed from: f */
    public final synchronized boolean m3100f(Context context) {
        return m3102h(context) == 0;
    }

    /* renamed from: g */
    public final synchronized boolean m3101g(Context context) {
        return m3102h(context) >= 10000;
    }

    /* renamed from: h */
    public final int m3102h(Context context) {
        AbstractC1025j5 abstractC1025j5 = null;
        try {
            try {
                abstractC1025j5 = mo3096b(context);
                if (abstractC1025j5.m3074e()) {
                    int m3076g = abstractC1025j5.m3076g();
                    abstractC1025j5.close();
                    return m3076g;
                }
            } catch (Exception e7) {
                C1016i3.f5129e.m386n(e7);
                if (abstractC1025j5 == null) {
                    return 0;
                }
            }
            abstractC1025j5.close();
            return 0;
        } catch (Throwable th) {
            if (abstractC1025j5 != null) {
                abstractC1025j5.close();
            }
            throw th;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f5219c);
    }
}
