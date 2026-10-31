package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0357l;
import p001a0.C0005d;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0347g implements C0005d.a {

    /* renamed from: a */
    public final /* synthetic */ View f1709a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1710b;

    /* renamed from: c */
    public final /* synthetic */ C0357l.a f1711c;

    public C0347g(View view, ViewGroup viewGroup, C0357l.a aVar) {
        this.f1709a = view;
        this.f1710b = viewGroup;
        this.f1711c = aVar;
    }

    @Override // p001a0.C0005d.a
    public final void onCancel() {
        View view = this.f1709a;
        view.clearAnimation();
        this.f1710b.endViewTransition(view);
        this.f1711c.m1199a();
    }
}
