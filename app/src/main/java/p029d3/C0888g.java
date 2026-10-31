package p029d3;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p004a3.C0034a;
import p034e0.C0933m0;
import p034e0.C0935n0;

/* renamed from: d3.g */
/* loaded from: classes.dex */
public final class C0888g extends C0933m0.b {

    /* renamed from: c */
    public final View f4668c;

    /* renamed from: d */
    public int f4669d;

    /* renamed from: e */
    public int f4670e;

    /* renamed from: f */
    public final int[] f4671f = new int[2];

    public C0888g(View view) {
        this.f4668c = view;
    }

    @Override // p034e0.C0933m0.b
    /* renamed from: a */
    public final C0935n0 mo2593a(C0935n0 c0935n0, List<C0933m0> list) {
        Iterator<C0933m0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f4807a.mo2745c() & 8) != 0) {
                this.f4668c.setTranslationY(C0034a.m127b(r0.f4807a.mo2744b(), this.f4670e, 0));
                break;
            }
        }
        return c0935n0;
    }
}
