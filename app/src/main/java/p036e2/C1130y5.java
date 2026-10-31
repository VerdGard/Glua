package p036e2;

import android.content.Context;

/* renamed from: e2.y5 */
/* loaded from: classes.dex */
public final class C1130y5 {

    /* renamed from: a */
    public static final C1130y5 f5623a = new C1130y5();

    /* renamed from: a */
    public static boolean m3309a(Context context) {
        if (!C0968b4.m2971e().booleanValue()) {
            return false;
        }
        C1123x5 m3292b = C1123x5.m3292b(context);
        return System.currentTimeMillis() - m3292b.m3294a(EnumC1011h5.f5117w1) > ((m3292b.f5597c * 60) * 60) * 1000;
    }

    /* renamed from: b */
    public static void m3310b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        C1123x5 m3292b = C1123x5.m3292b(context);
        EnumC1011h5 enumC1011h5 = EnumC1011h5.f5111X;
        long m3294a = m3292b.m3294a(enumC1011h5);
        long j7 = m3292b.f5604j * 60 * 60 * 1000;
        if (m3294a == 0 || currentTimeMillis - m3294a > j7) {
            C0961a4.m2954a().getClass();
            if (C0961a4.f4940c) {
                C0990e5 c0990e5 = C0990e5.f5041a;
                synchronized (c0990e5) {
                    c0990e5.m3013a(20, context);
                }
                C1123x5.m3292b(context).m3295c(enumC1011h5, System.currentTimeMillis());
            }
        }
    }

    /* renamed from: c */
    public static void m3311c(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        C1123x5 m3292b = C1123x5.m3292b(context);
        EnumC1011h5 enumC1011h5 = EnumC1011h5.f5112Y;
        long m3294a = m3292b.m3294a(enumC1011h5);
        long j7 = m3292b.f5603i * 24 * 60 * 60 * 1000;
        if (m3294a == 0 || currentTimeMillis - m3294a > j7) {
            C0961a4.m2954a().getClass();
            if (C0961a4.f4940c) {
                synchronized (C1037l3.f5225a) {
                    C1037l3.m3104a(context);
                }
                C1123x5.m3292b(context).m3295c(enumC1011h5, System.currentTimeMillis());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
    
        if (r8 != null) goto L35;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3312d(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1130y5.m3312d(android.content.Context):void");
    }
}
