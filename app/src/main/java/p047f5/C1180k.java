package p047f5;

/* renamed from: f5.k */
/* loaded from: classes.dex */
public final class C1180k {

    /* renamed from: a */
    public static final a f5771a = new a();

    /* renamed from: f5.k$a */
    public static class a {

        /* renamed from: a */
        public float[] f5772a = null;
    }

    /* renamed from: a */
    public static void m3392a(float[] fArr) {
        a aVar = f5771a;
        if (fArr.length > 1000) {
            return;
        }
        synchronized (aVar) {
            aVar.f5772a = fArr;
        }
    }
}
