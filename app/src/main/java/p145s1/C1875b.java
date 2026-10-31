package p145s1;

import java.util.ArrayList;
import p145s1.InterfaceC1874a;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class C1875b<T extends InterfaceC1874a> implements Cloneable {

    /* renamed from: c */
    public final T f8412c;

    /* renamed from: e */
    public final ArrayList f8413e = new ArrayList();

    /* renamed from: m */
    public boolean f8414m;

    /* renamed from: s */
    public int f8415s;

    public C1875b(T t7) {
        this.f8412c = t7;
    }

    /* renamed from: a */
    public final boolean m4410a() {
        ArrayList arrayList = this.f8413e;
        return arrayList == null || arrayList.isEmpty();
    }

    public final Object clone() {
        C1875b c1875b = new C1875b(this.f8412c);
        c1875b.f8414m = this.f8414m;
        return c1875b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreeNode{content=");
        sb.append(this.f8412c);
        sb.append(", parent=null, childList=");
        ArrayList arrayList = this.f8413e;
        sb.append(arrayList == null ? "null" : arrayList.toString());
        sb.append(", isExpand=");
        sb.append(this.f8414m);
        sb.append('}');
        return sb.toString();
    }
}
