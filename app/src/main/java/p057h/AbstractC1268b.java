package p057h;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.SubMenu;
import p022c5.C0644h;
import p089l.C1481o;
import p156t4.InterfaceC1926a;
import p197z.InterfaceMenuItemC2271b;
import p197z.InterfaceSubMenuC2272c;

/* renamed from: h.b */
/* loaded from: classes.dex */
public abstract class AbstractC1268b implements InterfaceC1926a {

    /* renamed from: a */
    public Object f6333a;

    /* renamed from: b */
    public Object f6334b;

    /* renamed from: c */
    public Object f6335c;

    public /* synthetic */ AbstractC1268b() {
    }

    @Override // p156t4.InterfaceC1926a
    /* renamed from: a */
    public void mo3579a(C0644h c0644h, Bundle bundle) {
        this.f6335c = bundle;
        this.f6334b = c0644h;
        mo4426d();
    }

    @Override // p156t4.InterfaceC1926a
    public void destroy() {
        this.f6333a = null;
        this.f6334b = null;
        this.f6335c = null;
    }

    /* renamed from: g */
    public final MenuItem m3580g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2271b)) {
            return menuItem;
        }
        InterfaceMenuItemC2271b interfaceMenuItemC2271b = (InterfaceMenuItemC2271b) menuItem;
        if (((C1481o) this.f6334b) == null) {
            this.f6334b = new C1481o();
        }
        MenuItem menuItem2 = (MenuItem) ((C1481o) this.f6334b).get(interfaceMenuItemC2271b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1269c menuItemC1269c = new MenuItemC1269c((Context) this.f6333a, interfaceMenuItemC2271b);
        ((C1481o) this.f6334b).put(interfaceMenuItemC2271b, menuItemC1269c);
        return menuItemC1269c;
    }

    /* renamed from: h */
    public final SubMenu m3581h(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC2272c)) {
            return subMenu;
        }
        InterfaceSubMenuC2272c interfaceSubMenuC2272c = (InterfaceSubMenuC2272c) subMenu;
        if (((C1481o) this.f6335c) == null) {
            this.f6335c = new C1481o();
        }
        SubMenu subMenu2 = (SubMenu) ((C1481o) this.f6335c).get(interfaceSubMenuC2272c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC1273g subMenuC1273g = new SubMenuC1273g((Context) this.f6333a, interfaceSubMenuC2272c);
        ((C1481o) this.f6335c).put(interfaceSubMenuC2272c, subMenuC1273g);
        return subMenuC1273g;
    }
}
