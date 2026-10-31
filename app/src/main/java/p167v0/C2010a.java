package p167v0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C2010a {

    /* renamed from: a */
    public static long f9158a;

    /* renamed from: b */
    public static Method f9159b;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m4908a() {
        boolean isEnabled;
        try {
            if (f9159b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f9159b == null) {
                f9158a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9159b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9159b.invoke(null, Long.valueOf(f9158a))).booleanValue();
        } catch (Exception e7) {
            if (!(e7 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
                return false;
            }
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
