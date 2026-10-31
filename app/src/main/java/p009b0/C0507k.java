package p009b0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p026d0.InterfaceC0873a;
import p089l.C1475i;
import p089l.C1481o;
import p181x.C2156e;

/* renamed from: b0.k */
/* loaded from: classes.dex */
public final class C0507k {

    /* renamed from: a */
    public static final C1475i<String, Typeface> f2531a = new C1475i<>(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f2532b;

    /* renamed from: c */
    public static final Object f2533c;

    /* renamed from: d */
    public static final C1481o<String, ArrayList<InterfaceC0873a<a>>> f2534d;

    /* renamed from: b0.k$a */
    public static final class a {

        /* renamed from: a */
        public final Typeface f2535a;

        /* renamed from: b */
        public final int f2536b;

        public a(int i7) {
            this.f2535a = null;
            this.f2536b = i7;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f2535a = typeface;
            this.f2536b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0510n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2532b = threadPoolExecutor;
        f2533c = new Object();
        f2534d = new C1481o<>();
    }

    /* renamed from: a */
    public static a m1825a(String str, Context context, C0502f c0502f, int i7) {
        int i8;
        C1475i<String, Typeface> c1475i = f2531a;
        Typeface m3862a = c1475i.m3862a(str);
        if (m3862a != null) {
            return new a(m3862a);
        }
        try {
            C0508l m1823a = C0501e.m1823a(context, c0502f);
            int i9 = 1;
            C0509m[] c0509mArr = m1823a.f2538b;
            int i10 = m1823a.f2537a;
            if (i10 != 0) {
                if (i10 == 1) {
                    i8 = -2;
                }
                i8 = -3;
            } else {
                if (c0509mArr != null && c0509mArr.length != 0) {
                    i9 = 0;
                    for (C0509m c0509m : c0509mArr) {
                        int i11 = c0509m.f2543e;
                        if (i11 != 0) {
                            if (i11 >= 0) {
                                i8 = i11;
                            }
                            i8 = -3;
                        }
                    }
                }
                i8 = i9;
            }
            if (i8 != 0) {
                return new a(i8);
            }
            Typeface mo5285b = C2156e.f9771a.mo5285b(context, c0509mArr, i7);
            if (mo5285b == null) {
                return new a(-3);
            }
            c1475i.m3863b(str, mo5285b);
            return new a(mo5285b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
