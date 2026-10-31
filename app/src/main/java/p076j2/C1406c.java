package p076j2;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: j2.c */
/* loaded from: classes.dex */
public final class C1406c implements InterfaceC1404a {

    /* renamed from: j2.c$a */
    public static class a {
    }

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    public C1406c(int i7) {
        new C1407d();
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        Collections.unmodifiableSet(hashSet);
        new a();
    }

    @Override // p076j2.InterfaceC1404a
    /* renamed from: a */
    public final void mo3758a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        synchronized (this) {
        }
    }
}
