package p098m0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1542a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z6 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f1518P1 = windowInsets;
        drawerLayout.f1519Q1 = z6;
        drawerLayout.setWillNotDraw(!z6 && drawerLayout.getBackground() == null);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
