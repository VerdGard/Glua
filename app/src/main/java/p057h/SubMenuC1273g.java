package p057h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p197z.InterfaceSubMenuC2272c;

/* renamed from: h.g */
/* loaded from: classes.dex */
public final class SubMenuC1273g extends MenuC1271e implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC2272c f6348e;

    public SubMenuC1273g(Context context, InterfaceSubMenuC2272c interfaceSubMenuC2272c) {
        super(context, interfaceSubMenuC2272c);
        this.f6348e = interfaceSubMenuC2272c;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f6348e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m3580g(this.f6348e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        this.f6348e.setHeaderIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f6348e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        this.f6348e.setHeaderTitle(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f6348e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f6348e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f6348e.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f6348e.setIcon(drawable);
        return this;
    }
}
