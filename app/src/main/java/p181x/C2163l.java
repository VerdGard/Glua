package p181x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p009b0.C0509m;
import p173w.C2042d;

/* renamed from: x.l */
/* loaded from: classes.dex */
public class C2163l {

    /* renamed from: x.l$a */
    public interface a<T> {
        /* renamed from: a */
        int mo5299a(T t7);

        /* renamed from: b */
        boolean mo5300b(T t7);
    }

    public C2163l() {
        new ConcurrentHashMap();
    }

    /* renamed from: e */
    public static <T> T m5301e(T[] tArr, int i7, a<T> aVar) {
        int i8 = (i7 & 1) == 0 ? 400 : 700;
        boolean z6 = (i7 & 2) != 0;
        T t7 = null;
        int i9 = Integer.MAX_VALUE;
        for (T t8 : tArr) {
            int abs = (Math.abs(aVar.mo5299a(t8) - i8) * 2) + (aVar.mo5300b(t8) == z6 ? 0 : 1);
            if (t7 == null || i9 > abs) {
                t7 = t8;
                i9 = abs;
            }
        }
        return t7;
    }

    /* renamed from: a */
    public Typeface mo5284a(Context context, C2042d.c cVar, Resources resources, int i7) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo5285b(Context context, C0509m[] c0509mArr, int i7) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo5297c(Context context, InputStream inputStream) {
        File m5305d = C2164m.m5305d(context);
        if (m5305d == null) {
            return null;
        }
        try {
            if (C2164m.m5304c(m5305d, inputStream)) {
                return Typeface.createFromFile(m5305d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m5305d.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo5289d(Context context, Resources resources, int i7, String str, int i8) {
        File m5305d = C2164m.m5305d(context);
        if (m5305d == null) {
            return null;
        }
        try {
            if (C2164m.m5303b(m5305d, resources, i7)) {
                return Typeface.createFromFile(m5305d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m5305d.delete();
        }
    }

    /* renamed from: f */
    public C0509m mo5298f(int i7, C0509m[] c0509mArr) {
        return (C0509m) m5301e(c0509mArr, i7, new C2162k());
    }
}
