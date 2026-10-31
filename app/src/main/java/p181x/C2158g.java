package p181x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p009b0.C0509m;
import p089l.C1481o;
import p173w.C2042d;

/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C2158g extends C2163l {

    /* renamed from: a */
    public static final Class<?> f9779a;

    /* renamed from: b */
    public static final Constructor<?> f9780b;

    /* renamed from: c */
    public static final Method f9781c;

    /* renamed from: d */
    public static final Method f9782d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f9780b = constructor;
        f9779a = cls;
        f9781c = method2;
        f9782d = method;
    }

    /* renamed from: g */
    public static boolean m5286g(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z6) {
        try {
            return ((Boolean) f9781c.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p181x.C2163l
    /* renamed from: a */
    public final Typeface mo5284a(Context context, C2042d.c cVar, Resources resources, int i7) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f9780b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C2042d.d dVar : cVar.f9312a) {
            int i8 = dVar.f9318f;
            File m5305d = C2164m.m5305d(context);
            if (m5305d != null) {
                try {
                    if (C2164m.m5303b(m5305d, resources, i8)) {
                        try {
                            fileInputStream = new FileInputStream(m5305d);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !m5286g(obj, mappedByteBuffer, dVar.f9317e, dVar.f9314b, dVar.f9315c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    m5305d.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f9779a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9782d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // p181x.C2163l
    /* renamed from: b */
    public final Typeface mo5285b(Context context, C0509m[] c0509mArr, int i7) {
        Object obj;
        Typeface typeface;
        try {
            obj = f9780b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1481o c1481o = new C1481o();
        for (C0509m c0509m : c0509mArr) {
            Uri uri = c0509m.f2539a;
            ByteBuffer byteBuffer = (ByteBuffer) c1481o.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C2164m.m5306e(context, uri);
                c1481o.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m5286g(obj, byteBuffer, c0509m.f2540b, c0509m.f2541c, c0509m.f2542d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f9779a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f9782d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i7);
    }
}
