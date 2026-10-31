package p049g;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p002a1.C0017d;
import p034e0.C0923h0;
import p034e0.InterfaceC0925i0;

/* renamed from: g.g */
/* loaded from: classes.dex */
public final class C1189g {

    /* renamed from: c */
    public Interpolator f5844c;

    /* renamed from: d */
    public InterfaceC0925i0 f5845d;

    /* renamed from: e */
    public boolean f5846e;

    /* renamed from: b */
    public long f5843b = -1;

    /* renamed from: f */
    public final a f5847f = new a();

    /* renamed from: a */
    public final ArrayList<C0923h0> f5842a = new ArrayList<>();

    /* renamed from: g.g$a */
    public class a extends C0017d {

        /* renamed from: w */
        public boolean f5848w = false;

        /* renamed from: x */
        public int f5849x = 0;

        public a() {
        }

        @Override // p034e0.InterfaceC0925i0
        /* renamed from: a */
        public final void mo651a() {
            int i7 = this.f5849x + 1;
            this.f5849x = i7;
            C1189g c1189g = C1189g.this;
            if (i7 == c1189g.f5842a.size()) {
                InterfaceC0925i0 interfaceC0925i0 = c1189g.f5845d;
                if (interfaceC0925i0 != null) {
                    interfaceC0925i0.mo651a();
                }
                this.f5849x = 0;
                this.f5848w = false;
                c1189g.f5846e = false;
            }
        }

        @Override // p002a1.C0017d, p034e0.InterfaceC0925i0
        /* renamed from: f */
        public final void mo108f() {
            if (this.f5848w) {
                return;
            }
            this.f5848w = true;
            InterfaceC0925i0 interfaceC0925i0 = C1189g.this.f5845d;
            if (interfaceC0925i0 != null) {
                interfaceC0925i0.mo108f();
            }
        }
    }

    /* renamed from: a */
    public final void m3402a() {
        if (this.f5846e) {
            Iterator<C0923h0> it = this.f5842a.iterator();
            while (it.hasNext()) {
                it.next().m2704b();
            }
            this.f5846e = false;
        }
    }

    /* renamed from: b */
    public final void m3403b() {
        View view;
        if (this.f5846e) {
            return;
        }
        Iterator<C0923h0> it = this.f5842a.iterator();
        while (it.hasNext()) {
            C0923h0 next = it.next();
            long j7 = this.f5843b;
            if (j7 >= 0) {
                next.m2705c(j7);
            }
            Interpolator interpolator = this.f5844c;
            if (interpolator != null && (view = next.f4801a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5845d != null) {
                next.m2706d(this.f5847f);
            }
            View view2 = next.f4801a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5846e = true;
    }
}
