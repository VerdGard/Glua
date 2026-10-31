package p047f5;

/* renamed from: f5.j */
/* loaded from: classes.dex */
public final class C1179j {

    /* renamed from: a */
    public static char[] f5770a;

    /* renamed from: a */
    public static void m3391a(char[] cArr) {
        if (cArr.length > 1000) {
            return;
        }
        synchronized (C1179j.class) {
            f5770a = cArr;
        }
    }
}
