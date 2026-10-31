package p034e0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.SubMenuC0166m;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0910b {

    /* renamed from: a */
    public a f4777a;

    /* renamed from: e0.b$a */
    public interface a {
    }

    /* renamed from: a */
    public boolean mo2643a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2644b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo2645c();

    /* renamed from: d */
    public View mo2646d(MenuItem menuItem) {
        return mo2645c();
    }

    /* renamed from: e */
    public boolean mo2647e() {
        return false;
    }

    /* renamed from: f */
    public void mo2648f(SubMenuC0166m subMenuC0166m) {
    }

    /* renamed from: g */
    public boolean mo2649g() {
        return false;
    }

    /* renamed from: h */
    public void mo2650h(C0161h.a aVar) {
        if (this.f4777a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4777a = aVar;
    }
}
