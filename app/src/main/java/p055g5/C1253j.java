package p055g5;

import android.view.View;
import androidx.profileinstaller.C0422c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p032d6.C0898f;
import p042f0.InterfaceC1155k;
import p055g5.C1245b;
import p071i5.ViewOnClickListenerC1367f0;
import p072i6.C1390a;
import p079j5.AbstractC1432a;
import p079j5.C1435d;
import p103m5.C1555a;
import p132q4.AbstractC1786o;
import p132q4.C1773b0;
import p132q4.C1787p;
import p132q4.C1793v;
import p132q4.C1796y;
import p132q4.InterfaceC1788q;

/* renamed from: g5.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C1253j implements InterfaceC1788q, C1787p.a, InterfaceC1155k, AbstractC1432a.b.a {

    /* renamed from: c */
    public final /* synthetic */ int f6187c;

    /* renamed from: e */
    public final /* synthetic */ Object f6188e;

    public /* synthetic */ C1253j(int i7, Object obj) {
        this.f6187c = i7;
        this.f6188e = obj;
    }

    @Override // p042f0.InterfaceC1155k
    /* renamed from: a */
    public boolean mo1053a(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6188e;
        int i7 = SideSheetBehavior.f4365M1;
        sideSheetBehavior.m2485x(this.f6187c);
        return true;
    }

    @Override // p079j5.AbstractC1432a.b.a
    /* renamed from: b */
    public void mo3553b(int i7, Object[] objArr) {
        final C1435d c1435d = (C1435d) this.f6188e;
        int i8 = C1435d.f6885Z;
        final C1245b c1245b = c1435d.f6872c;
        if (c1245b == null || i7 > 0) {
            return;
        }
        final int i9 = this.f6187c;
        c1245b.m3489e0(new Runnable() { // from class: s0.d

            /* renamed from: c */
            public final /* synthetic */ int f8393c = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = this.f8393c;
                Object obj = c1245b;
                int i11 = i9;
                Object obj2 = c1435d;
                switch (i10) {
                    case 0:
                        ((C0422c.c) obj2).mo1413b(i11, obj);
                        break;
                    default:
                        C1435d c1435d2 = (C1435d) obj2;
                        C1245b c1245b2 = (C1245b) obj;
                        int i12 = C1435d.f6885Z;
                        if (c1435d2.f6872c == c1245b2 && i11 == c1435d2.f6888s.get()) {
                            c1245b2.setLayoutBusy(false);
                            c1245b2.getEventHandler().m3568g(0.0f, 0.0f, false);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p132q4.C1787p.a
    /* renamed from: c */
    public void mo3554c(AbstractC1786o abstractC1786o) {
        ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = (ViewOnClickListenerC1367f0) this.f6188e;
        C1793v c1793v = (C1793v) abstractC1786o;
        C1245b c1245b = viewOnClickListenerC1367f0.f6638B1;
        if (c1245b.getCursor().m2163a() && viewOnClickListenerC1367f0.f6647K1 == 6) {
            int i7 = c1793v.f8142c.f3140a;
            if (i7 >= c1245b.getCursor().f3166c.f3140a && i7 <= c1245b.getCursor().f3167d.f3140a) {
                viewOnClickListenerC1367f0.f6647K1 = 0;
                viewOnClickListenerC1367f0.m3724e();
            }
            c1793v.f8146b = 2;
        }
    }

    @Override // p132q4.InterfaceC1788q
    /* renamed from: d */
    public void mo2065d(AbstractC1786o abstractC1786o, C1773b0 c1773b0) {
        int i7 = this.f6187c;
        Object obj = this.f6188e;
        switch (i7) {
            case 0:
                C1256m c1256m = (C1256m) obj;
                if (c1256m.f6198b != null) {
                    c1256m.m3555a();
                    break;
                }
                break;
            default:
                C1555a c1555a = (C1555a) obj;
                C1796y c1796y = (C1796y) abstractC1786o;
                C1390a c1390a = C1555a.f7225d;
                C0898f.m2606e(c1555a, "this$0");
                C0898f.m2606e(c1796y, "event");
                if (c1555a.m3950c()) {
                    if (!c1555a.m3948a(c1796y.f8165c.f3140a) || !c1555a.m3948a(c1796y.f8166d.f3140a)) {
                        c1555a.m3951d();
                        break;
                    }
                }
                break;
        }
    }
}
