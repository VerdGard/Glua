package androidx.activity;

import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.C0408s;
import p021c4.C0627o;
import p022c5.C0638b;
import p032d6.C0898f;
import p055g5.C1245b;
import p071i5.C1359b0;
import p071i5.C1366f;
import p071i5.C1374k;
import p071i5.ViewOnClickListenerC1367f0;
import p139r3.C1826d;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0125j implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f233c;

    /* renamed from: e */
    public final /* synthetic */ Object f234e;

    public /* synthetic */ RunnableC0125j(int i7, Object obj) {
        this.f233c = i7;
        this.f234e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f234e;
        switch (this.f233c) {
            case 1:
                C0408s c0408s = (C0408s) obj;
                C0408s c0408s2 = C0408s.f2002x1;
                C0898f.m2606e(c0408s, "this$0");
                int i7 = c0408s.f2007e;
                C0401l c0401l = c0408s.f2004Y;
                if (i7 == 0) {
                    c0408s.f2008m = true;
                    c0401l.m1379e(AbstractC0394f.a.ON_PAUSE);
                }
                if (c0408s.f2006c == 0 && c0408s.f2008m) {
                    c0401l.m1379e(AbstractC0394f.a.ON_STOP);
                    c0408s.f2009s = true;
                    break;
                }
                break;
            case 2:
                C1826d c1826d = (C1826d) obj;
                C1826d.a aVar = c1826d.f8263a;
                if (aVar != null) {
                    aVar.m4303b(c1826d.f8264b, c1826d.f8265c, true);
                    break;
                }
                break;
            case 3:
                C0627o c0627o = (C0627o) obj;
                boolean isPopupShowing = c0627o.f3060h.isPopupShowing();
                c0627o.m2072t(isPopupShowing);
                c0627o.f3065m = isPopupShowing;
                break;
            case 4:
                ((C1245b) obj).m3493g0();
                break;
            case 5:
                C1374k c1374k = (C1374k) obj;
                if (c1374k.f6687Q1) {
                    ((C1366f) c1374k.f6681K1).f6635b.setVisibility(0);
                    break;
                }
                break;
            case 6:
                C1359b0 c1359b0 = (C1359b0) obj;
                C0898f.m2606e(c1359b0, "this$0");
                C0638b c0638b = c1359b0.f6620Q1;
                if (c1359b0.f6464c.isShowing()) {
                    if (c1359b0.f6623T1 || c1359b0.f6622S1 || c0638b == null) {
                    }
                } else if (c0638b == null) {
                }
                c1359b0.m3720g(c0638b);
                break;
            default:
                ((ViewOnClickListenerC1367f0) obj).m3724e();
                break;
        }
    }
}
