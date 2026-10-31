package p193y3;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: y3.p */
/* loaded from: classes.dex */
public final class C2247p extends AbstractC2245n {

    /* renamed from: f */
    public boolean f10254f = false;

    /* renamed from: g */
    public float f10255g = 0.0f;

    /* renamed from: y3.p$a */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            C2247p c2247p = C2247p.this;
            if (c2247p.f10251c == null || c2247p.f10252d.isEmpty()) {
                return;
            }
            RectF rectF = c2247p.f10252d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c2247p.f10255g);
        }
    }

    public C2247p(View view) {
        m5454c(view);
    }

    /* renamed from: c */
    private void m5454c(View view) {
        view.setOutlineProvider(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
    
        if (r0 == false) goto L70;
     */
    @Override // p193y3.AbstractC2245n
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5452a(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p193y3.C2247p.mo5452a(android.view.View):void");
    }

    @Override // p193y3.AbstractC2245n
    /* renamed from: b */
    public final boolean mo5453b() {
        return !this.f10254f || this.f10249a;
    }
}
