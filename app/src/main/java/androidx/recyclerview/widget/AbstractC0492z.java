package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes.dex */
public abstract class AbstractC0492z extends RecyclerView.AbstractC0441j {

    /* renamed from: g */
    public final boolean f2501g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0441j
    /* renamed from: a */
    public final boolean mo1598a(RecyclerView.AbstractC0432a0 abstractC0432a0, RecyclerView.AbstractC0432a0 abstractC0432a02, RecyclerView.AbstractC0441j.c cVar, RecyclerView.AbstractC0441j.c cVar2) {
        int i7;
        int i8;
        int i9 = cVar.f2205a;
        int i10 = cVar.f2206b;
        if (abstractC0432a02.m1581o()) {
            int i11 = cVar.f2205a;
            i8 = cVar.f2206b;
            i7 = i11;
        } else {
            i7 = cVar2.f2205a;
            i8 = cVar2.f2206b;
        }
        C0477k c0477k = (C0477k) this;
        if (abstractC0432a0 == abstractC0432a02) {
            return c0477k.mo1767g(abstractC0432a0, i9, i10, i7, i8);
        }
        View view = abstractC0432a0.f2177a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        c0477k.m1771l(abstractC0432a0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        c0477k.m1771l(abstractC0432a02);
        float f7 = -((int) ((i7 - i9) - translationX));
        View view2 = abstractC0432a02.f2177a;
        view2.setTranslationX(f7);
        view2.setTranslationY(-((int) ((i8 - i10) - translationY)));
        view2.setAlpha(0.0f);
        c0477k.f2402k.add(new C0477k.a(abstractC0432a0, abstractC0432a02, i9, i10, i7, i8));
        return true;
    }

    /* renamed from: g */
    public abstract boolean mo1767g(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7, int i8, int i9, int i10);
}
