package p193y3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185x3.C2191a;
import p193y3.C2243l;

/* renamed from: y3.k */
/* loaded from: classes.dex */
public final class C2242k extends C2243l.f {

    /* renamed from: c */
    public final /* synthetic */ List f10223c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f10224d;

    public C2242k(ArrayList arrayList, Matrix matrix) {
        this.f10223c = arrayList;
        this.f10224d = matrix;
    }

    @Override // p193y3.C2243l.f
    /* renamed from: a */
    public final void mo5444a(Matrix matrix, C2191a c2191a, int i7, Canvas canvas) {
        Iterator it = this.f10223c.iterator();
        while (it.hasNext()) {
            ((C2243l.f) it.next()).mo5444a(this.f10224d, c2191a, i7, canvas);
        }
    }
}
