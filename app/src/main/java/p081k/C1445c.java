package p081k;

import android.graphics.drawable.Drawable;

/* renamed from: k.c */
/* loaded from: classes.dex */
public final class C1445c extends Drawable {

    /* renamed from: a */
    public static final double f6943a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f6944b = 0;

    /* renamed from: a */
    public static float m3829a(float f7, float f8, boolean z6) {
        float f9 = f7 * 1.5f;
        if (!z6) {
            return f9;
        }
        return (float) (((1.0d - f6943a) * f8) + f9);
    }
}
