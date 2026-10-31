package p147s3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;
import p131q3.C1753i;
import p131q3.C1769y;

/* renamed from: s3.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1883e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c */
    public final /* synthetic */ NavigationView f8428c;

    public ViewTreeObserverOnGlobalLayoutListenerC1883e(NavigationView navigationView) {
        this.f8428c = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f8428c;
        navigationView.getLocationOnScreen(navigationView.f4337C1);
        int[] iArr = navigationView.f4337C1;
        boolean z6 = true;
        boolean z7 = iArr[1] == 0;
        C1753i c1753i = navigationView.f4335A1;
        if (c1753i.f8054M1 != z7) {
            c1753i.f8054M1 = z7;
            c1753i.m4226a();
        }
        navigationView.setDrawTopInsetForeground(z7 && navigationView.f4340F1);
        int i7 = iArr[0];
        navigationView.setDrawLeftInsetForeground(i7 == 0 || navigationView.getWidth() + i7 == 0);
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Rect m4242a = C1769y.m4242a(activity);
            navigationView.setDrawBottomInsetForeground((m4242a.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f4341G1);
            if (m4242a.width() != iArr[0] && m4242a.width() - navigationView.getWidth() != iArr[0]) {
                z6 = false;
            }
            navigationView.setDrawRightInsetForeground(z6);
        }
    }
}
