package p174w0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import java.util.ArrayList;
import p174w0.AbstractC2057h;

/* renamed from: w0.x */
/* loaded from: classes.dex */
public final class C2073x extends C2060k {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f9443a;

    /* renamed from: b */
    public final /* synthetic */ View f9444b;

    /* renamed from: c */
    public final /* synthetic */ View f9445c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC2074y f9446d;

    public C2073x(AbstractC2074y abstractC2074y, ViewGroup viewGroup, View view, View view2) {
        this.f9446d = abstractC2074y;
        this.f9443a = viewGroup;
        this.f9444b = view;
        this.f9445c = view2;
    }

    @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
    /* renamed from: b */
    public final void mo5086b() {
        this.f9443a.getOverlay().remove(this.f9444b);
    }

    @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
    /* renamed from: c */
    public final void mo5087c() {
        View view = this.f9444b;
        if (view.getParent() == null) {
            this.f9443a.getOverlay().add(view);
            return;
        }
        AbstractC2074y abstractC2074y = this.f9446d;
        ArrayList<Animator> arrayList = abstractC2074y.f9384B1;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<AbstractC2057h.d> arrayList2 = abstractC2074y.f9388F1;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) abstractC2074y.f9388F1.clone();
        int size2 = arrayList3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((AbstractC2057h.d) arrayList3.get(i7)).mo5088d();
        }
    }

    @Override // p174w0.AbstractC2057h.d
    /* renamed from: e */
    public final void mo5089e(AbstractC2057h abstractC2057h) {
        this.f9445c.setTag(R$id.save_overlay_view, null);
        this.f9443a.getOverlay().remove(this.f9444b);
        abstractC2057h.mo5117v(this);
    }
}
