package p181x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p009b0.C0509m;
import p173w.C2042d;

/* renamed from: x.f */
/* loaded from: classes.dex */
public class C2157f extends C2163l {

    /* renamed from: a */
    public static Class<?> f9774a = null;

    /* renamed from: b */
    public static Constructor<?> f9775b = null;

    /* renamed from: c */
    public static Method f9776c = null;

    /* renamed from: d */
    public static Method f9777d = null;

    /* renamed from: e */
    public static boolean f9778e = false;

    /* renamed from: g */
    public static boolean m5282g(Object obj, String str, int i7, boolean z6) {
        m5283h();
        try {
            return ((Boolean) f9776c.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: h */
    public static void m5283h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f9778e) {
            return;
        }
        f9778e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f9775b = constructor;
        f9774a = cls;
        f9776c = method2;
        f9777d = method;
    }

    @Override // p181x.C2163l
    /* renamed from: a */
    public Typeface mo5284a(Context context, C2042d.c cVar, Resources resources, int i7) {
        m5283h();
        try {
            Object newInstance = f9775b.newInstance(new Object[0]);
            for (C2042d.d dVar : cVar.f9312a) {
                File m5305d = C2164m.m5305d(context);
                if (m5305d == null) {
                    return null;
                }
                try {
                    if (!C2164m.m5303b(m5305d, resources, dVar.f9318f)) {
                        return null;
                    }
                    if (!m5282g(newInstance, m5305d.getPath(), dVar.f9314b, dVar.f9315c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m5305d.delete();
                }
            }
            m5283h();
            try {
                Object newInstance2 = Array.newInstance(f9774a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f9777d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // p181x.C2163l
    /* renamed from: b */
    public Typeface mo5285b(Context context, C0509m[] c0509mArr, int i7) {
        File file;
        String readlink;
        if (c0509mArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo5298f(i7, c0509mArr).f2539a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface mo5297c = mo5297c(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return mo5297c;
                    }
                    Typeface mo5297c2 = mo5297c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo5297c2;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
