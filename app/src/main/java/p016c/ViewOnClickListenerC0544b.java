package p016c;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: c.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0544b implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0546c f2708c;

    public ViewOnClickListenerC0544b(C0546c c0546c) {
        this.f2708c = c0546c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0546c c0546c = this.f2708c;
        if (c0546c.f2727e) {
            DrawerLayout drawerLayout = c0546c.f2724b;
            int m1042i = drawerLayout.m1042i(8388611);
            View m1039f = drawerLayout.m1039f(8388611);
            if ((m1039f != null ? DrawerLayout.m1033q(m1039f) : false) && m1042i != 2) {
                drawerLayout.m1037d();
            } else if (m1042i != 1) {
                drawerLayout.m1047t();
            }
        }
    }
}
