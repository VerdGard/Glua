package p181x;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p009b0.C0509m;
import p173w.C2042d;

/* renamed from: x.h */
/* loaded from: classes.dex */
public class C2159h extends C2157f {

    /* renamed from: f */
    public final Class<?> f9783f;

    /* renamed from: g */
    public final Constructor<?> f9784g;

    /* renamed from: h */
    public final Method f9785h;

    /* renamed from: i */
    public final Method f9786i;

    /* renamed from: j */
    public final Method f9787j;

    /* renamed from: k */
    public final Method f9788k;

    /* renamed from: l */
    public final Method f9789l;

    public C2159h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m5287m(cls);
            method3 = m5288n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = mo5294o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f9783f = cls;
        this.f9784g = constructor;
        this.f9785h = method2;
        this.f9786i = method3;
        this.f9787j = method4;
        this.f9788k = method;
        this.f9789l = method5;
    }

    /* renamed from: m */
    public static Method m5287m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: n */
    public static Method m5288n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // p181x.C2157f, p181x.C2163l
    /* renamed from: a */
    public final Typeface mo5284a(Context context, C2042d.c cVar, Resources resources, int i7) {
        Object obj;
        FontVariationAxis[] fromFontVariationSettings;
        if (!m5293l()) {
            return super.mo5284a(context, cVar, resources, i7);
        }
        try {
            obj = this.f9784g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C2042d.d dVar : cVar.f9312a) {
            String str = dVar.f9313a;
            int i8 = dVar.f9317e;
            int i9 = dVar.f9314b;
            boolean z6 = dVar.f9315c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.f9316d);
            if (!m5290i(context, obj, str, i8, i9, z6 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f9788k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (m5292k(obj)) {
            return mo5291j(obj);
        }
        return null;
    }

    @Override // p181x.C2157f, p181x.C2163l
    /* renamed from: b */
    public final Typeface mo5285b(Context context, C0509m[] c0509mArr, int i7) {
        Object obj;
        Typeface mo5291j;
        boolean z6;
        if (c0509mArr.length < 1) {
            return null;
        }
        if (m5293l()) {
            HashMap hashMap = new HashMap();
            for (C0509m c0509m : c0509mArr) {
                if (c0509m.f2543e == 0) {
                    Uri uri = c0509m.f2539a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C2164m.m5306e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f9784g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = c0509mArr.length;
            int i8 = 0;
            boolean z7 = false;
            while (true) {
                Method method = this.f9788k;
                if (i8 >= length) {
                    if (!z7) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            return null;
                        }
                    }
                    if (m5292k(obj) && (mo5291j = mo5291j(obj)) != null) {
                        return Typeface.create(mo5291j, i7);
                    }
                    return null;
                }
                C0509m c0509m2 = c0509mArr[i8];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0509m2.f2539a);
                if (byteBuffer != null) {
                    try {
                        z6 = ((Boolean) this.f9786i.invoke(obj, byteBuffer, Integer.valueOf(c0509m2.f2540b), null, Integer.valueOf(c0509m2.f2541c), Integer.valueOf(c0509m2.f2542d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z6 = false;
                    }
                    if (!z6) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z7 = true;
                }
                i8++;
            }
        } else {
            C0509m mo5298f = mo5298f(i7, c0509mArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo5298f.f2539a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo5298f.f2541c).setItalic(mo5298f.f2542d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused5) {
                return null;
            }
        }
    }

    @Override // p181x.C2163l
    /* renamed from: d */
    public final Typeface mo5289d(Context context, Resources resources, int i7, String str, int i8) {
        Object obj;
        if (!m5293l()) {
            return super.mo5289d(context, resources, i7, str, i8);
        }
        try {
            obj = this.f9784g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!m5290i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f9788k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (m5292k(obj)) {
            return mo5291j(obj);
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m5290i(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9785h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo5291j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9783f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9789l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean m5292k(Object obj) {
        try {
            return ((Boolean) this.f9787j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m5293l() {
        Method method = this.f9785h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: o */
    public Method mo5294o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
