package p057h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p089l.C1481o;
import p197z.InterfaceMenuC2270a;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: h.e */
/* loaded from: classes.dex */
public class MenuC1271e extends AbstractC1268b implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC2270a f6347d;

    public MenuC1271e(Context context, InterfaceMenuC2270a interfaceMenuC2270a) {
        super(context);
        if (interfaceMenuC2270a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f6347d = interfaceMenuC2270a;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return m3580g(this.f6347d.add(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return m3580g(this.f6347d.add(i7, i8, i9, i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return m3580g(this.f6347d.add(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3580g(this.f6347d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f6347d.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = m3580g(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return m3581h(this.f6347d.addSubMenu(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return m3581h(this.f6347d.addSubMenu(i7, i8, i9, i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return m3581h(this.f6347d.addSubMenu(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m3581h(this.f6347d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C1481o c1481o = (C1481o) this.f6334b;
        if (c1481o != null) {
            c1481o.clear();
        }
        C1481o c1481o2 = (C1481o) this.f6335c;
        if (c1481o2 != null) {
            c1481o2.clear();
        }
        this.f6347d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f6347d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return m3580g(this.f6347d.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return m3580g(this.f6347d.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f6347d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f6347d.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return this.f6347d.performIdentifierAction(i7, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f6347d.performShortcut(i7, keyEvent, i8);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((C1481o) this.f6334b) != null) {
            int i8 = 0;
            while (true) {
                C1481o c1481o = (C1481o) this.f6334b;
                if (i8 >= c1481o.f7047m) {
                    break;
                }
                if (((InterfaceMenuItemC2271b) c1481o.m3874f(i8)).getGroupId() == i7) {
                    ((C1481o) this.f6334b).m3875g(i8);
                    i8--;
                }
                i8++;
            }
        }
        this.f6347d.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((C1481o) this.f6334b) != null) {
            int i8 = 0;
            while (true) {
                C1481o c1481o = (C1481o) this.f6334b;
                if (i8 >= c1481o.f7047m) {
                    break;
                }
                if (((InterfaceMenuItemC2271b) c1481o.m3874f(i8)).getItemId() == i7) {
                    ((C1481o) this.f6334b).m3875g(i8);
                    break;
                }
                i8++;
            }
        }
        this.f6347d.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z6, boolean z7) {
        this.f6347d.setGroupCheckable(i7, z6, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z6) {
        this.f6347d.setGroupEnabled(i7, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z6) {
        this.f6347d.setGroupVisible(i7, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f6347d.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6347d.size();
    }
}
