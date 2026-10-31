package p123p3;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: p3.a */
/* loaded from: classes.dex */
public final class C1700a implements TypeEvaluator<Float> {

    /* renamed from: a */
    public final FloatEvaluator f7666a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f7, Float f8, Float f9) {
        float floatValue = this.f7666a.evaluate(f7, (Number) f8, (Number) f9).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
