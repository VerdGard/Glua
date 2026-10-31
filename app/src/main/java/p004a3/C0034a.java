package p004a3;

import android.ext.C0091c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p121p0.C1689a;
import p121p0.C1690b;
import p121p0.C1691c;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public final class C0034a {

    /* renamed from: a */
    public static final LinearInterpolator f108a = new LinearInterpolator();

    /* renamed from: b */
    public static final C1690b f109b = new C1690b();

    /* renamed from: c */
    public static final C1689a f110c = new C1689a();

    /* renamed from: d */
    public static final C1691c f111d = new C1691c();

    /* renamed from: e */
    public static final DecelerateInterpolator f112e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m126a(float f7, float f8, float f9, float f10, float f11) {
        return f11 <= f9 ? f7 : f11 >= f10 ? f8 : C0091c.m227e(f8, f7, (f11 - f9) / (f10 - f9), f7);
    }

    /* renamed from: b */
    public static int m127b(float f7, int i7, int i8) {
        return Math.round(f7 * (i8 - i7)) + i7;
    }
}
