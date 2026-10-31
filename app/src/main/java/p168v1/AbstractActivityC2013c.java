package p168v1;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.so.revelation.lua.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.Method;

/* renamed from: v1.c */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2013c extends AbstractActivityC2011a {

    /* renamed from: N1 */
    public MaterialToolbar f9162N1;

    /* renamed from: O1 */
    public AppBarLayout f9163O1;

    @Override // p168v1.AbstractActivityC2011a
    public abstract /* synthetic */ void initData(View view);

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            Method declaredMethod = Class.forName("android.support.v7.view.menu.MenuBuilder").getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(menu, Boolean.TRUE);
        } catch (Exception e7) {
            Log.d("OverflowIconVisible", e7.getMessage());
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // p168v1.AbstractActivityC2011a
    /* renamed from: u */
    public final void mo4909u() {
        super.mo4909u();
        this.f9162N1 = (MaterialToolbar) findViewById(R.id.toolbar);
        this.f9163O1 = (AppBarLayout) findViewById(R.id.editoractivity_mainandroid_support_design_widget_AppBarLayout);
        m1907s().mo1931x(this.f9162N1);
        AppBarLayout appBarLayout = this.f9163O1;
        if (appBarLayout == null) {
            return;
        }
        appBarLayout.setElevation(0.0f);
    }
}
