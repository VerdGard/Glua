package p001a0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

@Deprecated
/* renamed from: a0.l */
/* loaded from: classes.dex */
public final class C0013l {

    /* renamed from: a */
    public static final /* synthetic */ int f12a = 0;

    /* renamed from: a0.l$a */
    public static class a {
        /* renamed from: a */
        public static void m60a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m61b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e7);
            }
        }
    }
}
