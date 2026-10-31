package p163u3;

import android.graphics.Typeface;
import androidx.activity.result.AbstractC0136c;
import p131q3.C1746b;
import p131q3.C1747c;

/* renamed from: u3.a */
/* loaded from: classes.dex */
public final class C1970a extends AbstractC0136c {

    /* renamed from: e */
    public final Typeface f8825e;

    /* renamed from: m */
    public final a f8826m;

    /* renamed from: s */
    public boolean f8827s;

    /* renamed from: u3.a$a */
    public interface a {
    }

    public C1970a(C1746b c1746b, Typeface typeface) {
        this.f8825e = typeface;
        this.f8826m = c1746b;
    }

    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: u */
    public final void mo392u(int i7) {
        if (this.f8827s) {
            return;
        }
        C1747c c1747c = ((C1746b) this.f8826m).f7971a;
        if (c1747c.m4220j(this.f8825e)) {
            c1747c.m4218h(false);
        }
    }

    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: v */
    public final void mo393v(Typeface typeface, boolean z6) {
        if (this.f8827s) {
            return;
        }
        C1747c c1747c = ((C1746b) this.f8826m).f7971a;
        if (c1747c.m4220j(typeface)) {
            c1747c.m4218h(false);
        }
    }
}
