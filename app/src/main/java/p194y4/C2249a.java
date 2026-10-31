package p194y4;

import java.util.ArrayList;
import java.util.List;
import p032d6.C0898f;

/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C2249a {

    /* renamed from: a */
    public final CharSequence f10258a = "语法错误";

    /* renamed from: b */
    public final CharSequence f10259b;

    /* renamed from: c */
    public final List<C2252d> f10260c;

    /* renamed from: d */
    public final Object f10261d;

    public C2249a(String str, ArrayList arrayList, List list) {
        this.f10259b = str;
        this.f10260c = arrayList;
        this.f10261d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249a)) {
            return false;
        }
        C2249a c2249a = (C2249a) obj;
        return C0898f.m2602a(this.f10258a, c2249a.f10258a) && C0898f.m2602a(this.f10259b, c2249a.f10259b) && C0898f.m2602a(this.f10260c, c2249a.f10260c) && C0898f.m2602a(this.f10261d, c2249a.f10261d);
    }

    public final int hashCode() {
        int hashCode = this.f10258a.hashCode() * 31;
        CharSequence charSequence = this.f10259b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List<C2252d> list = this.f10260c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f10261d;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticDetail(briefMessage=" + ((Object) this.f10258a) + ", detailedMessage=" + ((Object) this.f10259b) + ", quickfixes=" + this.f10260c + ", extraData=" + this.f10261d + ")";
    }
}
