package p051g1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p035e1.C0949a;

/* renamed from: g1.k */
/* loaded from: classes.dex */
public final class C1202k {

    /* renamed from: a */
    public final ArrayList f5897a;

    /* renamed from: b */
    public PointF f5898b;

    /* renamed from: c */
    public boolean f5899c;

    public C1202k() {
        this.f5897a = new ArrayList();
    }

    public C1202k(PointF pointF, boolean z6, List<C0949a> list) {
        ArrayList arrayList = new ArrayList();
        this.f5897a = arrayList;
        this.f5898b = pointF;
        this.f5899c = z6;
        arrayList.addAll(list);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f5897a.size() + "closed=" + this.f5899c + '}';
    }
}
