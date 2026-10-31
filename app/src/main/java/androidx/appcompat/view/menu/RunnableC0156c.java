package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.ViewOnKeyListenerC0155b;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public final class RunnableC0156c implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ViewOnKeyListenerC0155b.d f452c;

    /* renamed from: e */
    public final /* synthetic */ MenuItem f453e;

    /* renamed from: m */
    public final /* synthetic */ C0159f f454m;

    /* renamed from: s */
    public final /* synthetic */ ViewOnKeyListenerC0155b.c f455s;

    public RunnableC0156c(ViewOnKeyListenerC0155b.c cVar, ViewOnKeyListenerC0155b.d dVar, C0161h c0161h, C0159f c0159f) {
        this.f455s = cVar;
        this.f452c = dVar;
        this.f453e = c0161h;
        this.f454m = c0159f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0155b.d dVar = this.f452c;
        if (dVar != null) {
            ViewOnKeyListenerC0155b.c cVar = this.f455s;
            ViewOnKeyListenerC0155b.this.f435P1 = true;
            dVar.f450b.m527c(false);
            ViewOnKeyListenerC0155b.this.f435P1 = false;
        }
        MenuItem menuItem = this.f453e;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f454m.m541q(menuItem, null, 4);
        }
    }
}
