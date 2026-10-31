package p016c;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0242k1;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p016c.AbstractC0542a;
import p016c.LayoutInflaterFactory2C0560n;
import p033e.C0906d;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: c.b0 */
/* loaded from: classes.dex */
public final class C0545b0 extends AbstractC0542a {

    /* renamed from: a */
    public final C0242k1 f2709a;

    /* renamed from: b */
    public final Window.Callback f2710b;

    /* renamed from: c */
    public final e f2711c;

    /* renamed from: d */
    public boolean f2712d;

    /* renamed from: e */
    public boolean f2713e;

    /* renamed from: f */
    public boolean f2714f;

    /* renamed from: g */
    public final ArrayList<AbstractC0542a.b> f2715g = new ArrayList<>();

    /* renamed from: h */
    public final a f2716h = new a();

    /* renamed from: c.b0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0545b0 c0545b0 = C0545b0.this;
            Window.Callback callback = c0545b0.f2710b;
            Menu m1875s = c0545b0.m1875s();
            C0159f c0159f = m1875s instanceof C0159f ? (C0159f) m1875s : null;
            if (c0159f != null) {
                c0159f.m547w();
            }
            try {
                m1875s.clear();
                if (!callback.onCreatePanelMenu(0, m1875s) || !callback.onPreparePanel(0, null, m1875s)) {
                    m1875s.clear();
                }
            } finally {
                if (c0159f != null) {
                    c0159f.m546v();
                }
            }
        }
    }

    /* renamed from: c.b0$b */
    public class b implements Toolbar.InterfaceC0207h {
        public b() {
        }
    }

    /* renamed from: c.b0$c */
    public final class c implements InterfaceC0163j.a {

        /* renamed from: c */
        public boolean f2719c;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: b */
        public final void mo550b(C0159f c0159f, boolean z6) {
            if (this.f2719c) {
                return;
            }
            this.f2719c = true;
            C0545b0 c0545b0 = C0545b0.this;
            c0545b0.f2709a.mo823h();
            c0545b0.f2710b.onPanelClosed(108, c0159f);
            this.f2719c = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: c */
        public final boolean mo551c(C0159f c0159f) {
            C0545b0.this.f2710b.onMenuOpened(108, c0159f);
            return true;
        }
    }

    /* renamed from: c.b0$d */
    public final class d implements C0159f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: a */
        public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: b */
        public final void mo549b(C0159f c0159f) {
            C0545b0 c0545b0 = C0545b0.this;
            boolean mo817b = c0545b0.f2709a.mo817b();
            Window.Callback callback = c0545b0.f2710b;
            if (mo817b) {
                callback.onPanelClosed(108, c0159f);
            } else if (callback.onPreparePanel(0, null, c0159f)) {
                callback.onMenuOpened(108, c0159f);
            }
        }
    }

    /* renamed from: c.b0$e */
    public class e implements LayoutInflaterFactory2C0560n.c {
        public e() {
        }
    }

    public C0545b0(Toolbar toolbar, CharSequence charSequence, LayoutInflaterFactory2C0560n.j jVar) {
        b bVar = new b();
        toolbar.getClass();
        C0242k1 c0242k1 = new C0242k1(toolbar, false);
        this.f2709a = c0242k1;
        jVar.getClass();
        this.f2710b = jVar;
        c0242k1.f957l = jVar;
        toolbar.setOnMenuItemClickListener(bVar);
        c0242k1.setWindowTitle(charSequence);
        this.f2711c = new e();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: a */
    public final boolean mo1854a() {
        return this.f2709a.mo820e();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: b */
    public final boolean mo1855b() {
        C0242k1 c0242k1 = this.f2709a;
        if (!c0242k1.mo828m()) {
            return false;
        }
        c0242k1.collapseActionView();
        return true;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: c */
    public final void mo1856c(boolean z6) {
        if (z6 == this.f2714f) {
            return;
        }
        this.f2714f = z6;
        ArrayList<AbstractC0542a.b> arrayList = this.f2715g;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).m1872a();
        }
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: d */
    public final int mo1857d() {
        return this.f2709a.f947b;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: e */
    public final Context mo1858e() {
        return this.f2709a.mo827l();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: f */
    public final boolean mo1859f() {
        C0242k1 c0242k1 = this.f2709a;
        Toolbar toolbar = c0242k1.f946a;
        a aVar = this.f2716h;
        toolbar.removeCallbacks(aVar);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2837m(c0242k1.f946a, aVar);
        return true;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: g */
    public final void mo1860g() {
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: h */
    public final void mo1861h() {
        this.f2709a.f946a.removeCallbacks(this.f2716h);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: i */
    public final boolean mo1862i(int i7, KeyEvent keyEvent) {
        Menu m1875s = m1875s();
        if (m1875s == null) {
            return false;
        }
        m1875s.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m1875s.performShortcut(i7, keyEvent, 0);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: j */
    public final boolean mo1863j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1864k();
        }
        return true;
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: k */
    public final boolean mo1864k() {
        return this.f2709a.mo821f();
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: l */
    public final void mo1865l(boolean z6) {
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: m */
    public final void mo1866m() {
        C0242k1 c0242k1 = this.f2709a;
        c0242k1.mo829n((c0242k1.f947b & (-9)) | 0);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: n */
    public final void mo1867n(int i7) {
        this.f2709a.mo833r(i7);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: o */
    public final void mo1868o(C0906d c0906d) {
        this.f2709a.mo837v(c0906d);
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: p */
    public final void mo1869p(boolean z6) {
    }

    @Override // p016c.AbstractC0542a
    /* renamed from: q */
    public final void mo1870q(CharSequence charSequence) {
        this.f2709a.setWindowTitle(charSequence);
    }

    /* renamed from: s */
    public final Menu m1875s() {
        boolean z6 = this.f2713e;
        C0242k1 c0242k1 = this.f2709a;
        if (!z6) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = c0242k1.f946a;
            toolbar.f763f2 = cVar;
            toolbar.f764g2 = dVar;
            ActionMenuView actionMenuView = toolbar.f758c;
            if (actionMenuView != null) {
                actionMenuView.f626M1 = cVar;
                actionMenuView.f627N1 = dVar;
            }
            this.f2713e = true;
        }
        return c0242k1.f946a.getMenu();
    }
}
