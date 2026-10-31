package androidx.appcompat.view.menu;

import android.content.Context;
import android.ext.C0090b;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC0166m extends C0159f implements SubMenu {

    /* renamed from: A */
    public final C0161h f565A;

    /* renamed from: z */
    public final C0159f f566z;

    public SubMenuC0166m(Context context, C0159f c0159f, C0161h c0161h) {
        super(context);
        this.f566z = c0159f;
        this.f565A = c0161h;
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: d */
    public final boolean mo528d(C0161h c0161h) {
        return this.f566z.mo528d(c0161h);
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: e */
    public final boolean mo529e(C0159f c0159f, MenuItem menuItem) {
        return super.mo529e(c0159f, menuItem) || this.f566z.mo529e(c0159f, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: f */
    public final boolean mo530f(C0161h c0161h) {
        return this.f566z.mo530f(c0161h);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f565A;
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: j */
    public final String mo534j() {
        C0161h c0161h = this.f565A;
        int i7 = c0161h != null ? c0161h.f502a : 0;
        if (i7 == 0) {
            return null;
        }
        return C0090b.m219e("android:menu:actionviewstates:", i7);
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: k */
    public final C0159f mo535k() {
        return this.f566z.mo535k();
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: m */
    public final boolean mo537m() {
        return this.f566z.mo537m();
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: n */
    public final boolean mo538n() {
        return this.f566z.mo538n();
    }

    @Override // androidx.appcompat.view.menu.C0159f
    /* renamed from: o */
    public final boolean mo539o() {
        return this.f566z.mo539o();
    }

    @Override // androidx.appcompat.view.menu.C0159f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f566z.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        m545u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        m545u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m545u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f565A.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f565A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0159f, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f566z.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m545u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m545u(0, charSequence, 0, null, null);
        return this;
    }
}
