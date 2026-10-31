package p016c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0254o1;
import androidx.fragment.app.ActivityC0367q;
import androidx.lifecycle.runtime.R$id;
import java.util.ArrayList;
import p016c.C0546c;
import p016c.C0571y;
import p032d6.C0898f;
import p159u.C1954a;
import p159u.C1962i;
import p166v.C2009a;

/* renamed from: c.j */
/* loaded from: classes.dex */
public class ActivityC0556j extends ActivityC0367q implements InterfaceC0557k, C0546c.b {

    /* renamed from: L1 */
    public LayoutInflaterFactory2C0560n f2792L1;

    public ActivityC0556j() {
        this.f173X.f8684b.m1820b("androidx:appcompat", new C0554h(this));
        m355o(new C0555i(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1908t();
        m1907s().mo1912c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(m1907s().mo1913d(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC0542a mo1918i = m1907s().mo1918i();
        if (getWindow().hasFeature(0)) {
            if (mo1918i == null || !mo1918i.mo1854a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p159u.ActivityC1961h, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0542a mo1918i = m1907s().mo1918i();
        if (keyCode == 82 && mo1918i != null && mo1918i.mo1863j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p016c.C0546c.b
    /* renamed from: e */
    public final C0546c.a mo1882e() {
        LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = (LayoutInflaterFactory2C0560n) m1907s();
        layoutInflaterFactory2C0560n.getClass();
        return layoutInflaterFactory2C0560n.new b();
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: f */
    public final void mo1904f() {
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i7) {
        return (T) m1907s().mo1914e(i7);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m1907s().mo1917h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i7 = C0254o1.f1027a;
        return super.getResources();
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: i */
    public final void mo1905i() {
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m1907s().mo1920k();
    }

    @Override // p016c.InterfaceC0557k
    /* renamed from: l */
    public final void mo1906l() {
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1907s().mo1921m(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m1907s().mo1923o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        Intent m4573a;
        Intent makeMainActivity;
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC0542a mo1918i = m1907s().mo1918i();
        if (menuItem.getItemId() != 16908332 || mo1918i == null || (mo1918i.mo1857d() & 4) == 0 || (m4573a = C1962i.m4573a(this)) == null) {
            return false;
        }
        if (!C1962i.a.m4577c(this, m4573a)) {
            C1962i.a.m4576b(this, m4573a);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent m4573a2 = C1962i.m4573a(this);
        if (m4573a2 == null) {
            m4573a2 = C1962i.m4573a(this);
        }
        if (m4573a2 != null) {
            ComponentName component = m4573a2.getComponent();
            if (component == null) {
                component = m4573a2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            while (true) {
                try {
                    String m4574b = C1962i.m4574b(this, component);
                    if (m4574b == null) {
                        makeMainActivity = null;
                    } else {
                        ComponentName componentName = new ComponentName(component.getPackageName(), m4574b);
                        makeMainActivity = C1962i.m4574b(this, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                    }
                    if (makeMainActivity == null) {
                        break;
                    }
                    arrayList.add(size, makeMainActivity);
                    component = makeMainActivity.getComponent();
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e7);
                }
            }
            arrayList.add(m4573a2);
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = C2009a.f9156a;
        C2009a.a.m4897a(this, intentArr, null);
        try {
            int i8 = C1954a.f8792b;
            C1954a.b.m4560a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.fragment.app.ActivityC0367q, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0560n) m1907s()).m1947K();
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        m1907s().mo1924p();
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onStart() {
        super.onStart();
        m1907s().mo1925q();
    }

    @Override // androidx.fragment.app.ActivityC0367q, android.app.Activity
    public final void onStop() {
        super.onStop();
        m1907s().mo1926r();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        m1907s().mo1933z(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC0542a mo1918i = m1907s().mo1918i();
        if (getWindow().hasFeature(0)) {
            if (mo1918i == null || !mo1918i.mo1864k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0367q
    /* renamed from: r */
    public final void mo1250r() {
        m1907s().mo1920k();
    }

    /* renamed from: s */
    public final AbstractC0559m m1907s() {
        if (this.f2792L1 == null) {
            C0571y.a aVar = AbstractC0559m.f2798c;
            this.f2792L1 = new LayoutInflaterFactory2C0560n(this, null, this, this);
        }
        return this.f2792L1;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i7) {
        m1908t();
        m1907s().mo1928u(i7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m1908t();
        m1907s().mo1929v(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1908t();
        m1907s().mo1930w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        super.setTheme(i7);
        m1907s().mo1932y(i7);
    }

    /* renamed from: t */
    public final void m1908t() {
        View decorView = getWindow().getDecorView();
        C0898f.m2606e(decorView, "<this>");
        decorView.setTag(R$id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        C0898f.m2606e(decorView2, "<this>");
        decorView2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        C0898f.m2606e(decorView3, "<this>");
        decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        C0898f.m2606e(decorView4, "<this>");
        decorView4.setTag(androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner, this);
    }
}
