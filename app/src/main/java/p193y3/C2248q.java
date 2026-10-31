package p193y3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: y3.q */
/* loaded from: classes.dex */
public final class C2248q extends AbstractC2245n {

    /* renamed from: y3.q$a */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            C2248q c2248q = C2248q.this;
            if (c2248q.f10253e.isEmpty()) {
                return;
            }
            outline.setPath(c2248q.f10253e);
        }
    }

    public C2248q(View view) {
        m5455c(view);
    }

    /* renamed from: c */
    private void m5455c(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // p193y3.AbstractC2245n
    /* renamed from: a */
    public final void mo5452a(View view) {
        view.setClipToOutline(!this.f10249a);
        if (this.f10249a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p193y3.AbstractC2245n
    /* renamed from: b */
    public final boolean mo5453b() {
        return this.f10249a;
    }
}
