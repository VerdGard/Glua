package p059h1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import p002a1.C0020g;
import p010b1.C0514c;
import p035e1.C0953e;
import p051g1.C1204m;

/* renamed from: h1.g */
/* loaded from: classes.dex */
public final class C1289g extends AbstractC1284b {

    /* renamed from: v */
    public final C0514c f6411v;

    public C1289g(C0020g c0020g, C1287e c1287e) {
        super(c0020g, c1287e);
        C0514c c0514c = new C0514c(c0020g, this, new C1204m("__container", c1287e.f6390a));
        this.f6411v = c0514c;
        c0514c.mo1828c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p059h1.AbstractC1284b, p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        super.mo1831h(rectF, matrix);
        this.f6411v.mo1831h(rectF, this.f6372l);
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: k */
    public final void mo3600k(Canvas canvas, Matrix matrix, int i7) {
        this.f6411v.mo1829e(canvas, matrix, i7);
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: n */
    public final void mo3603n(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2) {
        this.f6411v.mo1830g(c0953e, i7, arrayList, c0953e2);
    }
}
