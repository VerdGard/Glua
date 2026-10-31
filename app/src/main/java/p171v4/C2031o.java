package p171v4;

import android.text.SpannableString;
import p022c5.C0641e;
import p032d6.C0898f;
import p055g5.C1245b;
import p055g5.EnumC1262s;

/* renamed from: v4.o */
/* loaded from: classes.dex */
public final class C2031o extends AbstractC2020d {

    /* renamed from: g */
    public final String f9217g;

    /* renamed from: h */
    public boolean f9218h;

    public C2031o(SpannableString spannableString, String str, int i7, String str2) {
        super(spannableString, str);
        this.f9218h = true;
        this.f9217g = str2;
        this.f9178e = i7;
    }

    @Override // p171v4.AbstractC2020d
    /* renamed from: a */
    public final void mo4914a(C1245b c1245b, C0641e c0641e, int i7, int i8) {
        String str = this.f9217g;
        if (str == null) {
            return;
        }
        int i9 = this.f9178e;
        if (i9 == 0) {
            c0641e.m2151w(i7, i8, str);
            return;
        }
        c0641e.m2119C(i7, i8 - i9, str, i7, i8);
        if (this.f9218h) {
            return;
        }
        c1245b.m3483Z(EnumC1262s.LEFT);
    }

    /* renamed from: b */
    public final void m4924b(EnumC2021e enumC2021e) {
        this.f9177d = enumC2021e;
        if (this.f9174a == null) {
            C0898f.m2606e(enumC2021e, "kind");
            this.f9174a = new C2017a(enumC2021e, true);
        }
    }
}
