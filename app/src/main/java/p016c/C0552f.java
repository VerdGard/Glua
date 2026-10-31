package p016c;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* renamed from: c.f */
/* loaded from: classes.dex */
public final class C0552f implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f2785a;

    /* renamed from: b */
    public final /* synthetic */ View f2786b;

    public C0552f(View view, View view2) {
        this.f2785a = view;
        this.f2786b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        AlertController.m479b(absListView, this.f2785a, this.f2786b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
    }
}
