package p091l1;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p016c.C0546c;

/* renamed from: l1.j */
/* loaded from: classes.dex */
public final class C1496j extends C0546c {
    public C1496j(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        super(activity, drawerLayout, toolbar);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
    /* renamed from: c */
    public final void mo1058c(View view) {
        m1876e(1.0f);
        if (this.f2727e) {
            this.f2723a.mo1879c(this.f2729g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
    /* renamed from: d */
    public final void mo1059d(View view) {
        m1876e(0.0f);
        if (this.f2727e) {
            this.f2723a.mo1879c(this.f2728f);
        }
    }
}
