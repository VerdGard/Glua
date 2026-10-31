package p178w4;

import android.ext.C0091c;
import p032d6.C0898f;

/* renamed from: w4.e */
/* loaded from: classes.dex */
public final class C2125e {

    /* renamed from: a */
    public String f9597a;

    public C2125e(String str) {
        C0898f.m2606e(str, "text");
        this.f9597a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2125e) && C0898f.m2602a(this.f9597a, ((C2125e) obj).f9597a);
    }

    public final int hashCode() {
        return this.f9597a.hashCode();
    }

    public final String toString() {
        return C0091c.m228f("PlainPlaceholderElement(text=", this.f9597a, ")");
    }
}
