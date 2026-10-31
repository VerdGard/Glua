package p181x;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x.i */
/* loaded from: classes.dex */
public final class C2160i extends C2159h {
    @Override // p181x.C2159h
    /* renamed from: j */
    public final Typeface mo5291j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9783f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9789l.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p181x.C2159h
    /* renamed from: o */
    public final Method mo5294o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
