package p078j4;

import android.ext.C0090b;
import p054g4.AbstractC1242x;
import p054g4.C1237s;
import p054g4.EnumC1239u;
import p054g4.InterfaceC1240v;
import p117o4.C1667a;
import p120p.C1686g;

/* renamed from: j4.h */
/* loaded from: classes.dex */
public final class C1419h extends AbstractC1242x<Number> {

    /* renamed from: b */
    public static final C1418g f6795b = new C1418g(new C1419h());

    /* renamed from: a */
    public final InterfaceC1240v f6796a = EnumC1239u.f5981e;

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final Number mo3442a(C1667a c1667a) {
        int mo3785x = c1667a.mo3785x();
        int m4108c = C1686g.m4108c(mo3785x);
        if (m4108c == 5 || m4108c == 6) {
            return this.f6796a.mo3456a(c1667a);
        }
        if (m4108c == 8) {
            c1667a.mo3783t();
            return null;
        }
        throw new C1237s("Expecting number, got: " + C0090b.m224j(mo3785x) + "; at path " + c1667a.mo3775h());
    }
}
