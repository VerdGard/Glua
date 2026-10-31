package p004a3;

import android.animation.TypeEvaluator;
import android.ext.C0091c;

/* renamed from: a3.b */
/* loaded from: classes.dex */
public final class C0035b implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C0035b f113a = new C0035b();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f7, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f8 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f9 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float m227e = C0091c.m227e(f9, f8, f7, f8);
        float m227e2 = C0091c.m227e(pow4, pow, f7, pow);
        float m227e3 = C0091c.m227e(pow5, pow2, f7, pow2);
        float m227e4 = C0091c.m227e(pow6, pow3, f7, pow3);
        float pow7 = ((float) Math.pow(m227e2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(m227e3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(m227e4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(m227e * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
