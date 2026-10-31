package p032d6;

import java.util.Arrays;

/* renamed from: d6.f */
/* loaded from: classes.dex */
public final class C0898f {
    /* renamed from: a */
    public static boolean m2602a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m2603b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m2607f(C0898f.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m2604c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m2607f(C0898f.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m2605d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m2607f(C0898f.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m2606e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = C0898f.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m2607f(C0898f.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m2607f(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }
}
