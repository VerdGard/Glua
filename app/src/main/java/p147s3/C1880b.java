package p147s3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: s3.b */
/* loaded from: classes.dex */
public final class C1880b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ DrawerLayout f8423a;

    /* renamed from: b */
    public final /* synthetic */ View f8424b;

    public C1880b(DrawerLayout drawerLayout, View view) {
        this.f8423a = drawerLayout;
        this.f8424b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f8424b;
        DrawerLayout drawerLayout = this.f8423a;
        drawerLayout.m1036c(view, false);
        drawerLayout.setScrimColor(-1728053248);
    }
}
