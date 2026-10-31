package p016c;

import p002a1.C0017d;

/* renamed from: c.q */
/* loaded from: classes.dex */
public final class RunnableC0563q implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ LayoutInflaterFactory2C0560n f2897c;

    /* renamed from: c.q$a */
    public class a extends C0017d {
        public a() {
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: a */
        public final void mo651a() {
            RunnableC0563q runnableC0563q = RunnableC0563q.this;
            runnableC0563q.f2897c.f2818K1.setAlpha(1.0f);
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = runnableC0563q.f2897c;
            layoutInflaterFactory2C0560n.f2821N1.m2706d(null);
            layoutInflaterFactory2C0560n.f2821N1 = null;
        }

        @Override // p002a1.C0017d, p034e0.InterfaceC0925i0
        /* renamed from: f */
        public final void mo108f() {
            RunnableC0563q.this.f2897c.f2818K1.setVisibility(0);
        }
    }

    public RunnableC0563q(LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n) {
        this.f2897c = layoutInflaterFactory2C0560n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            c.n r0 = r5.f2897c
            android.widget.PopupWindow r1 = r0.f2819L1
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f2818K1
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            e0.h0 r1 = r0.f2821N1
            if (r1 == 0) goto L13
            r1.m2704b()
        L13:
            boolean r1 = r0.f2823P1
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.f2824Q1
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, e0.h0> r2 = p034e0.C0946x.f4876a
            boolean r1 = p034e0.C0946x.g.m2860c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2818K1
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2818K1
            e0.h0 r1 = p034e0.C0946x.m2800a(r1)
            r1.m2703a(r2)
            r0.f2821N1 = r1
            c.q$a r0 = new c.q$a
            r0.<init>()
            r1.m2706d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2818K1
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f2818K1
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.RunnableC0563q.run():void");
    }
}
