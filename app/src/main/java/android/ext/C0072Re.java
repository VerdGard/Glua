package android.ext;

/* renamed from: android.ext.Re */
/* loaded from: classes.dex */
public class C0072Re {
    /* renamed from: i */
    public static int m204i(String str, Class<?> cls) {
        try {
            Object obj = cls.getDeclaredField(str).get(null);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
