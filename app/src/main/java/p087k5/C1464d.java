package p087k5;

import android.os.Build;
import java.util.Iterator;
import p032d6.C0898f;
import p055g5.C1245b;
import p087k5.C1465e;

/* renamed from: k5.d */
/* loaded from: classes.dex */
public final class C1464d {

    /* renamed from: a */
    public final C1463c f6985a;

    /* renamed from: b */
    public final C1465e f6986b;

    /* renamed from: c */
    public final int f6987c;

    public C1464d(C1245b c1245b) {
        C0898f.m2606e(c1245b, "editor");
        this.f6985a = new C1463c();
        this.f6986b = Build.VERSION.SDK_INT >= 29 ? new C1465e(c1245b) : null;
        this.f6987c = 4;
    }

    /* renamed from: a */
    public final void m3845a() {
        C1465e c1465e;
        if (Build.VERSION.SDK_INT < 29 || (c1465e = this.f6986b) == null) {
            return;
        }
        Iterator<C1465e.a> it = c1465e.f6989b.iterator();
        while (it.hasNext()) {
            it.next().f6993c = true;
        }
    }
}
