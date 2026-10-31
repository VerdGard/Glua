package p099m1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;
import p057h.C1267a;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public class MenuC1543a implements Menu {

    /* renamed from: a */
    public final Context f7204a;

    /* renamed from: b */
    public boolean f7205b;

    /* renamed from: c */
    public final ArrayList<C1267a> f7206c = new ArrayList<>();

    /* renamed from: d */
    public final Resources f7207d;

    public MenuC1543a(Context context) {
        this.f7204a = context;
        this.f7207d = context.getResources();
    }

    /* renamed from: a */
    private int m3944a(int i7) {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (arrayList.get(i8).f6313a == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return add(0, 0, 0, i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return add(i7, i8, i9, this.f7207d.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        C1267a c1267a = new C1267a(this.f7204a, i7, i8, i9, charSequence);
        this.f7206c.add(i9, c1267a);
        return c1267a;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return add(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f7204a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1267a c1267a = (C1267a) add(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            c1267a.f6323k = resolveInfo.loadIcon(packageManager);
            c1267a.m3577a();
            c1267a.f6318f = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = c1267a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f7207d.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f7207d.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return new SubMenuC1544b(this.f7204a, (C1267a) add(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final C1267a m3945b(int i7) {
        boolean z6 = this.f7205b;
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1267a c1267a = arrayList.get(i8);
            if (i7 == (z6 ? c1267a.f6321i : c1267a.f6319g)) {
                return c1267a;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
        ArrayList<C1267a> arrayList = this.f7206c;
        arrayList.clear();
        arrayList.trimToSize();
    }

    @Override // android.view.Menu
    public final void close() {
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        int m3944a = m3944a(i7);
        if (m3944a < 0) {
            return null;
        }
        return this.f7206c.get(m3944a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return this.f7206c.get(i7);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (arrayList.get(i7).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return m3945b(i7) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        int m3944a = m3944a(i7);
        if (m3944a < 0) {
            return false;
        }
        return this.f7206c.get(m3944a).m3578d();
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        C1267a m3945b = m3945b(i7);
        if (m3945b == null) {
            return false;
        }
        return m3945b.m3578d();
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            if (arrayList.get(i8).f6314b == i7) {
                arrayList.remove(i8);
                size--;
            } else {
                i8++;
            }
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        this.f7206c.remove(m3944a(i7));
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z6, boolean z7) {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1267a c1267a = arrayList.get(i8);
            if (c1267a.f6314b == i7) {
                c1267a.setCheckable(z6);
                c1267a.f6332t = (c1267a.f6332t & (-5)) | (z7 ? 4 : 0);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z6) {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1267a c1267a = arrayList.get(i8);
            if (c1267a.f6314b == i7) {
                c1267a.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z6) {
        ArrayList<C1267a> arrayList = this.f7206c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1267a c1267a = arrayList.get(i8);
            if (c1267a.f6314b == i7) {
                c1267a.setVisible(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f7205b = z6;
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7206c.size();
    }
}
