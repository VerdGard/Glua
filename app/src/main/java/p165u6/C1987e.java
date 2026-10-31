package p165u6;

import android.ext.Tools;

/* renamed from: u6.e */
/* loaded from: classes.dex */
public class C1987e {

    /* renamed from: a */
    public static final int[] f9002a = {96, 113, 65, 84, 80, 80, 92, 108, 60, 16, 60, 84, 108, 124, 124, 124, 124, 124, 124, 96, 96, 96, 104, 34, 188, 188, 188, 132, 228, 84, 84, 16, 98, 98, 4, 226, 20, 81, 80, 124, 124, 124, 124, 124, 124, 96, 113, 49, 81, 113, 49, 80, 4, 84, 113, 113, 113, 113, 23};

    /* renamed from: a */
    public static int m4677a(int i7) {
        return (i7 >> 14) & 262143;
    }

    /* renamed from: b */
    public static int m4678b(int i7) {
        return ((i7 >> 14) & 262143) - 131071;
    }

    /* renamed from: c */
    public static boolean m4679c(int i7) {
        return (i7 & Tools.Semaphore.f160S8) != 0;
    }
}
