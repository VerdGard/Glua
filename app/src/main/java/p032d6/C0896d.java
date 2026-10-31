package p032d6;

import android.ext.C0091c;
import androidx.activity.OnBackPressedDispatcher;
import p064h6.InterfaceC1304b;

/* renamed from: d6.d */
/* loaded from: classes.dex */
public class C0896d extends AbstractC0893a implements InterfaceC1304b {

    /* renamed from: Z */
    public final int f4687Z;

    /* renamed from: w1 */
    public final int f4688w1;

    public C0896d(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(onBackPressedDispatcher, false);
        this.f4687Z = 0;
        this.f4688w1 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0896d) {
            C0896d c0896d = (C0896d) obj;
            return this.f4684s.equals(c0896d.f4684s) && this.f4679X.equals(c0896d.f4679X) && this.f4688w1 == c0896d.f4688w1 && this.f4687Z == c0896d.f4687Z && C0898f.m2602a(this.f4682e, c0896d.f4682e) && C0898f.m2602a(m2600b(), c0896d.m2600b());
        }
        if (!(obj instanceof InterfaceC1304b)) {
            return false;
        }
        C0896d c0896d2 = this.f4681c;
        if (c0896d2 == null) {
            C0901i.f4692a.getClass();
            this.f4681c = this;
            c0896d2 = this;
        }
        return obj.equals(c0896d2);
    }

    public final int hashCode() {
        return this.f4679X.hashCode() + ((this.f4684s.hashCode() + (m2600b() == null ? 0 : m2600b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        C0896d c0896d = this.f4681c;
        if (c0896d == null) {
            C0901i.f4692a.getClass();
            this.f4681c = this;
            c0896d = this;
        }
        if (c0896d != this) {
            return c0896d.toString();
        }
        String str = this.f4684s;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : C0091c.m228f("function ", str, " (Kotlin reflection is not available)");
    }
}
