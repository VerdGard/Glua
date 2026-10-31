package p174w0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0136c;
import java.util.ArrayList;
import java.util.Iterator;
import p174w0.AbstractC2057h;

/* renamed from: w0.m */
/* loaded from: classes.dex */
public class C2062m extends AbstractC2057h {

    /* renamed from: O1 */
    public int f9420O1;

    /* renamed from: M1 */
    public ArrayList<AbstractC2057h> f9418M1 = new ArrayList<>();

    /* renamed from: N1 */
    public boolean f9419N1 = true;

    /* renamed from: P1 */
    public boolean f9421P1 = false;

    /* renamed from: Q1 */
    public int f9422Q1 = 0;

    /* renamed from: w0.m$a */
    public class a extends C2060k {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2057h f9423a;

        public a(AbstractC2057h abstractC2057h) {
            this.f9423a = abstractC2057h;
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            this.f9423a.mo5120y();
            abstractC2057h.mo5117v(this);
        }
    }

    /* renamed from: w0.m$b */
    public static class b extends C2060k {

        /* renamed from: a */
        public final C2062m f9424a;

        public b(C2062m c2062m) {
            this.f9424a = c2062m;
        }

        @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
        /* renamed from: a */
        public final void mo5092a() {
            C2062m c2062m = this.f9424a;
            if (c2062m.f9421P1) {
                return;
            }
            c2062m.m5101F();
            c2062m.f9421P1 = true;
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            C2062m c2062m = this.f9424a;
            int i7 = c2062m.f9420O1 - 1;
            c2062m.f9420O1 = i7;
            if (i7 == 0) {
                c2062m.f9421P1 = false;
                c2062m.m5111m();
            }
            abstractC2057h.mo5117v(this);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: A */
    public final void mo5096A(AbstractC2057h.c cVar) {
        this.f9390H1 = cVar;
        this.f9422Q1 |= 8;
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5096A(cVar);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: B */
    public final void mo5097B(TimeInterpolator timeInterpolator) {
        this.f9422Q1 |= 1;
        ArrayList<AbstractC2057h> arrayList = this.f9418M1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f9418M1.get(i7).mo5097B(timeInterpolator);
            }
        }
        this.f9398s = timeInterpolator;
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: C */
    public final void mo5098C(AbstractC0136c abstractC0136c) {
        super.mo5098C(abstractC0136c);
        this.f9422Q1 |= 4;
        if (this.f9418M1 != null) {
            for (int i7 = 0; i7 < this.f9418M1.size(); i7++) {
                this.f9418M1.get(i7).mo5098C(abstractC0136c);
            }
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: D */
    public final void mo5099D() {
        this.f9422Q1 |= 2;
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5099D();
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: E */
    public final void mo5100E(long j7) {
        this.f9396e = j7;
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: G */
    public final String mo5102G(String str) {
        String mo5102G = super.mo5102G(str);
        for (int i7 = 0; i7 < this.f9418M1.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo5102G);
            sb.append("\n");
            sb.append(this.f9418M1.get(i7).mo5102G(str + "  "));
            mo5102G = sb.toString();
        }
        return mo5102G;
    }

    /* renamed from: H */
    public final void m5124H(AbstractC2057h abstractC2057h) {
        this.f9418M1.add(abstractC2057h);
        abstractC2057h.f9400x1 = this;
        long j7 = this.f9397m;
        if (j7 >= 0) {
            abstractC2057h.mo5121z(j7);
        }
        if ((this.f9422Q1 & 1) != 0) {
            abstractC2057h.mo5097B(this.f9398s);
        }
        if ((this.f9422Q1 & 2) != 0) {
            abstractC2057h.mo5099D();
        }
        if ((this.f9422Q1 & 4) != 0) {
            abstractC2057h.mo5098C(this.f9391I1);
        }
        if ((this.f9422Q1 & 8) != 0) {
            abstractC2057h.mo5096A(this.f9390H1);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: a */
    public final void mo5103a(AbstractC2057h.d dVar) {
        super.mo5103a(dVar);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: b */
    public final void mo5104b(View view) {
        for (int i7 = 0; i7 < this.f9418M1.size(); i7++) {
            this.f9418M1.get(i7).mo5104b(view);
        }
        this.f9393Y.add(view);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: d */
    public final void mo5082d(C2064o c2064o) {
        View view = c2064o.f9429b;
        if (m5115s(view)) {
            Iterator<AbstractC2057h> it = this.f9418M1.iterator();
            while (it.hasNext()) {
                AbstractC2057h next = it.next();
                if (next.m5115s(view)) {
                    next.mo5082d(c2064o);
                    c2064o.f9430c.add(next);
                }
            }
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: f */
    public final void mo5106f(C2064o c2064o) {
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5106f(c2064o);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: g */
    public final void mo5083g(C2064o c2064o) {
        View view = c2064o.f9429b;
        if (m5115s(view)) {
            Iterator<AbstractC2057h> it = this.f9418M1.iterator();
            while (it.hasNext()) {
                AbstractC2057h next = it.next();
                if (next.m5115s(view)) {
                    next.mo5083g(c2064o);
                    c2064o.f9430c.add(next);
                }
            }
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: j */
    public final AbstractC2057h clone() {
        C2062m c2062m = (C2062m) super.clone();
        c2062m.f9418M1 = new ArrayList<>();
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2057h clone = this.f9418M1.get(i7).clone();
            c2062m.f9418M1.add(clone);
            clone.f9400x1 = c2062m;
        }
        return c2062m;
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: l */
    public final void mo5110l(ViewGroup viewGroup, C2065p c2065p, C2065p c2065p2, ArrayList<C2064o> arrayList, ArrayList<C2064o> arrayList2) {
        long j7 = this.f9396e;
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2057h abstractC2057h = this.f9418M1.get(i7);
            if (j7 > 0 && (this.f9419N1 || i7 == 0)) {
                long j8 = abstractC2057h.f9396e;
                if (j8 > 0) {
                    abstractC2057h.mo5100E(j8 + j7);
                } else {
                    abstractC2057h.mo5100E(j7);
                }
            }
            abstractC2057h.mo5110l(viewGroup, c2065p, c2065p2, arrayList, arrayList2);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: u */
    public final void mo5116u(View view) {
        super.mo5116u(view);
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5116u(view);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: v */
    public final void mo5117v(AbstractC2057h.d dVar) {
        super.mo5117v(dVar);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: w */
    public final void mo5118w(View view) {
        for (int i7 = 0; i7 < this.f9418M1.size(); i7++) {
            this.f9418M1.get(i7).mo5118w(view);
        }
        this.f9393Y.remove(view);
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: x */
    public final void mo5119x(ViewGroup viewGroup) {
        super.mo5119x(viewGroup);
        int size = this.f9418M1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5119x(viewGroup);
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: y */
    public final void mo5120y() {
        if (this.f9418M1.isEmpty()) {
            m5101F();
            m5111m();
            return;
        }
        b bVar = new b(this);
        Iterator<AbstractC2057h> it = this.f9418M1.iterator();
        while (it.hasNext()) {
            it.next().mo5103a(bVar);
        }
        this.f9420O1 = this.f9418M1.size();
        if (this.f9419N1) {
            Iterator<AbstractC2057h> it2 = this.f9418M1.iterator();
            while (it2.hasNext()) {
                it2.next().mo5120y();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f9418M1.size(); i7++) {
            this.f9418M1.get(i7 - 1).mo5103a(new a(this.f9418M1.get(i7)));
        }
        AbstractC2057h abstractC2057h = this.f9418M1.get(0);
        if (abstractC2057h != null) {
            abstractC2057h.mo5120y();
        }
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: z */
    public final void mo5121z(long j7) {
        ArrayList<AbstractC2057h> arrayList;
        this.f9397m = j7;
        if (j7 < 0 || (arrayList = this.f9418M1) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9418M1.get(i7).mo5121z(j7);
        }
    }
}
