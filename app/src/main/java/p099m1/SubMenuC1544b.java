package p099m1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p057h.C1267a;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class SubMenuC1544b extends MenuC1543a implements SubMenu {

    /* renamed from: e */
    public final MenuItem f7208e;

    public SubMenuC1544b(Context context, C1267a c1267a) {
        super(context);
        this.f7208e = c1267a;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7208e;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        this.f7207d.getDrawable(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        this.f7207d.getString(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f7207d.getDrawable(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        return this;
    }
}
