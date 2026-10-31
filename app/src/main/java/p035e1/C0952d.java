package p035e1;

import java.util.ArrayList;
import java.util.List;
import p051g1.C1204m;

/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C0952d {

    /* renamed from: a */
    public final List<C1204m> f4913a;

    /* renamed from: b */
    public final char f4914b;

    /* renamed from: c */
    public final double f4915c;

    /* renamed from: d */
    public final String f4916d;

    /* renamed from: e */
    public final String f4917e;

    public C0952d(ArrayList arrayList, char c7, double d7, String str, String str2) {
        this.f4913a = arrayList;
        this.f4914b = c7;
        this.f4915c = d7;
        this.f4916d = str;
        this.f4917e = str2;
    }

    public final int hashCode() {
        return this.f4916d.hashCode() + ((this.f4917e.hashCode() + ((this.f4914b + 0) * 31)) * 31);
    }
}
