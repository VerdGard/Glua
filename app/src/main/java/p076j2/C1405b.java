package p076j2;

import java.util.HashMap;

/* renamed from: j2.b */
/* loaded from: classes.dex */
public final class C1405b<K, V> {

    /* renamed from: a */
    public final a<K, V> f6764a = new a<>();

    /* renamed from: j2.b$a */
    public static class a<K, V> {

        /* renamed from: a */
        public a<K, V> f6765a = this;
    }

    public C1405b() {
        new HashMap();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f6764a;
        a<K, V> aVar2 = aVar.f6765a;
        boolean z6 = false;
        while (!aVar2.equals(aVar)) {
            sb.append("{null:0}, ");
            aVar2 = aVar2.f6765a;
            z6 = true;
        }
        if (z6) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
