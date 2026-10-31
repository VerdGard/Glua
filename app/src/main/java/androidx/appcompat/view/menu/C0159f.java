package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p034e0.C0913c0;
import p166v.C2009a;
import p197z.InterfaceMenuC2270a;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0159f implements InterfaceMenuC2270a {

    /* renamed from: y */
    public static final int[] f471y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f472a;

    /* renamed from: b */
    public final Resources f473b;

    /* renamed from: c */
    public boolean f474c;

    /* renamed from: d */
    public boolean f475d;

    /* renamed from: e */
    public a f476e;

    /* renamed from: f */
    public final ArrayList<C0161h> f477f;

    /* renamed from: g */
    public final ArrayList<C0161h> f478g;

    /* renamed from: h */
    public boolean f479h;

    /* renamed from: i */
    public final ArrayList<C0161h> f480i;

    /* renamed from: j */
    public final ArrayList<C0161h> f481j;

    /* renamed from: k */
    public boolean f482k;

    /* renamed from: m */
    public CharSequence f484m;

    /* renamed from: n */
    public Drawable f485n;

    /* renamed from: o */
    public View f486o;

    /* renamed from: v */
    public C0161h f493v;

    /* renamed from: x */
    public boolean f495x;

    /* renamed from: l */
    public int f483l = 0;

    /* renamed from: p */
    public boolean f487p = false;

    /* renamed from: q */
    public boolean f488q = false;

    /* renamed from: r */
    public boolean f489r = false;

    /* renamed from: s */
    public boolean f490s = false;

    /* renamed from: t */
    public final ArrayList<C0161h> f491t = new ArrayList<>();

    /* renamed from: u */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> f492u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f494w = false;

    /* renamed from: androidx.appcompat.view.menu.f$a */
    public interface a {
        /* renamed from: a */
        boolean mo548a(C0159f c0159f, MenuItem menuItem);

        /* renamed from: b */
        void mo549b(C0159f c0159f);
    }

    /* renamed from: androidx.appcompat.view.menu.f$b */
    public interface b {
        /* renamed from: a */
        boolean mo495a(C0161h c0161h);
    }

    public C0159f(Context context) {
        boolean z6;
        boolean z7 = false;
        this.f472a = context;
        Resources resources = context.getResources();
        this.f473b = resources;
        this.f477f = new ArrayList<>();
        this.f478g = new ArrayList<>();
        this.f479h = true;
        this.f480i = new ArrayList<>();
        this.f481j = new ArrayList<>();
        this.f482k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C0913c0.f4791a;
            if (Build.VERSION.SDK_INT >= 28) {
                z6 = C0913c0.b.m2673b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z6 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z6) {
                z7 = true;
            }
        }
        this.f475d = z7;
    }

    /* renamed from: a */
    public final C0161h m525a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f471y[i11] << 16) | (65535 & i9);
        C0161h c0161h = new C0161h(this, i7, i8, i9, i12, charSequence, this.f483l);
        ArrayList<C0161h> arrayList = this.f477f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (arrayList.get(size).f505d <= i12) {
                i10 = size + 1;
                break;
            }
        }
        arrayList.add(i10, c0161h);
        mo540p(true);
        return c0161h;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return m525a(0, 0, 0, this.f473b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return m525a(i7, i8, i9, this.f473b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return m525a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m525a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f472a.getPackageManager();
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
            C0161h m525a = m525a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            m525a.setIcon(resolveInfo.loadIcon(packageManager));
            m525a.f508g = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = m525a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f473b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f473b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        C0161h m525a = m525a(i7, i8, i9, charSequence);
        SubMenuC0166m subMenuC0166m = new SubMenuC0166m(this.f472a, this, m525a);
        m525a.f516o = subMenuC0166m;
        subMenuC0166m.setHeaderTitle(m525a.f506e);
        return subMenuC0166m;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m526b(InterfaceC0163j interfaceC0163j, Context context) {
        this.f492u.add(new WeakReference<>(interfaceC0163j));
        interfaceC0163j.mo520e(context, this);
        this.f482k = true;
    }

    /* renamed from: c */
    public final void m527c(boolean z6) {
        if (this.f490s) {
            return;
        }
        this.f490s = true;
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
        Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0163j> next = it.next();
            InterfaceC0163j interfaceC0163j = next.get();
            if (interfaceC0163j == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                interfaceC0163j.mo501b(this, z6);
            }
        }
        this.f490s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0161h c0161h = this.f493v;
        if (c0161h != null) {
            mo528d(c0161h);
        }
        this.f477f.clear();
        mo540p(true);
    }

    public final void clearHeader() {
        this.f485n = null;
        this.f484m = null;
        this.f486o = null;
        mo540p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m527c(true);
    }

    /* renamed from: d */
    public boolean mo528d(C0161h c0161h) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
        boolean z6 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f493v == c0161h) {
            m547w();
            Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0163j> next = it.next();
                InterfaceC0163j interfaceC0163j = next.get();
                if (interfaceC0163j == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z6 = interfaceC0163j.mo497d(c0161h);
                    if (z6) {
                        break;
                    }
                }
            }
            m546v();
            if (z6) {
                this.f493v = null;
            }
        }
        return z6;
    }

    /* renamed from: e */
    public boolean mo529e(C0159f c0159f, MenuItem menuItem) {
        a aVar = this.f476e;
        return aVar != null && aVar.mo548a(c0159f, menuItem);
    }

    /* renamed from: f */
    public boolean mo530f(C0161h c0161h) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
        boolean z6 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m547w();
        Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0163j> next = it.next();
            InterfaceC0163j interfaceC0163j = next.get();
            if (interfaceC0163j == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z6 = interfaceC0163j.mo499m(c0161h);
                if (z6) {
                    break;
                }
            }
        }
        m546v();
        if (z6) {
            this.f493v = c0161h;
        }
        return z6;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            C0161h c0161h = this.f477f.get(i8);
            if (c0161h.f502a == i7) {
                return c0161h;
            }
            if (c0161h.hasSubMenu() && (findItem = c0161h.f516o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0161h m531g(int i7, KeyEvent keyEvent) {
        ArrayList<C0161h> arrayList = this.f491t;
        arrayList.clear();
        m532h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo538n = mo538n();
        for (int i8 = 0; i8 < size; i8++) {
            C0161h c0161h = arrayList.get(i8);
            char c7 = mo538n ? c0161h.f511j : c0161h.f509h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (mo538n && c7 == '\b' && i7 == 67))) {
                return c0161h;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return this.f477f.get(i7);
    }

    /* renamed from: h */
    public final void m532h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        int i8;
        boolean mo538n = mo538n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList<C0161h> arrayList2 = this.f477f;
            int size = arrayList2.size();
            while (i8 < size) {
                C0161h c0161h = arrayList2.get(i8);
                if (c0161h.hasSubMenu()) {
                    c0161h.f516o.m532h(arrayList, i7, keyEvent);
                }
                char c7 = mo538n ? c0161h.f511j : c0161h.f509h;
                if (((modifiers & 69647) == ((mo538n ? c0161h.f512k : c0161h.f510i) & 69647)) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if (c7 != cArr[0] && c7 != cArr[2]) {
                        if (mo538n && c7 == '\b') {
                            i8 = i7 != 67 ? i8 + 1 : 0;
                        }
                    }
                    if (c0161h.isEnabled()) {
                        arrayList.add(c0161h);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f495x) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f477f.get(i7).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m533i() {
        ArrayList<C0161h> m536l = m536l();
        if (this.f482k) {
            CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
            Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0163j> next = it.next();
                InterfaceC0163j interfaceC0163j = next.get();
                if (interfaceC0163j == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z6 |= interfaceC0163j.mo507j();
                }
            }
            ArrayList<C0161h> arrayList = this.f480i;
            ArrayList<C0161h> arrayList2 = this.f481j;
            arrayList.clear();
            arrayList2.clear();
            if (z6) {
                int size = m536l.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0161h c0161h = m536l.get(i7);
                    if ((c0161h.f525x & 32) == 32) {
                        arrayList.add(c0161h);
                    } else {
                        arrayList2.add(c0161h);
                    }
                }
            } else {
                arrayList2.addAll(m536l());
            }
            this.f482k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return m531g(i7, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo534j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0159f mo535k() {
        return this;
    }

    /* renamed from: l */
    public final ArrayList<C0161h> m536l() {
        boolean z6 = this.f479h;
        ArrayList<C0161h> arrayList = this.f478g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<C0161h> arrayList2 = this.f477f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0161h c0161h = arrayList2.get(i7);
            if (c0161h.isVisible()) {
                arrayList.add(c0161h);
            }
        }
        this.f479h = false;
        this.f482k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo537m() {
        return this.f494w;
    }

    /* renamed from: n */
    public boolean mo538n() {
        return this.f474c;
    }

    /* renamed from: o */
    public boolean mo539o() {
        return this.f475d;
    }

    /* renamed from: p */
    public void mo540p(boolean z6) {
        if (this.f487p) {
            this.f488q = true;
            if (z6) {
                this.f489r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f479h = true;
            this.f482k = true;
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m547w();
        Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0163j> next = it.next();
            InterfaceC0163j interfaceC0163j = next.get();
            if (interfaceC0163j == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                interfaceC0163j.mo504g();
            }
        }
        m546v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return m541q(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        C0161h m531g = m531g(i7, keyEvent);
        boolean m541q = m531g != null ? m541q(m531g, null, i8) : false;
        if ((i8 & 2) != 0) {
            m527c(true);
        }
        return m541q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r1 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        m527c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if ((r9 & 1) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m541q(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0163j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.C0161h) r7
            r0 = 0
            if (r7 == 0) goto Lc5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc5
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f517p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3e
        L19:
            androidx.appcompat.view.menu.f r1 = r7.f515n
            boolean r3 = r1.mo529e(r1, r7)
            if (r3 == 0) goto L22
            goto L3e
        L22:
            android.content.Intent r3 = r7.f508g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f472a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L3e
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            e0.b r1 = r7.f499A
            if (r1 == 0) goto L40
            boolean r1 = r1.mo2647e()
            if (r1 == 0) goto L40
        L3e:
            r1 = 1
            goto L41
        L40:
            r1 = 0
        L41:
            e0.b r3 = r7.f499A
            if (r3 == 0) goto L4d
            boolean r4 = r3.mo2643a()
            if (r4 == 0) goto L4d
            r4 = 1
            goto L4e
        L4d:
            r4 = 0
        L4e:
            boolean r5 = r7.m556e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc4
            goto Lc1
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6a
            if (r4 == 0) goto L65
            goto L6a
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lc4
            goto Lc1
        L6a:
            r9 = r9 & 4
            if (r9 != 0) goto L71
            r6.m527c(r0)
        L71:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L85
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f472a
            r9.<init>(r5, r6, r7)
            r7.f516o = r9
            java.lang.CharSequence r5 = r7.f506e
            r9.setHeaderTitle(r5)
        L85:
            androidx.appcompat.view.menu.m r7 = r7.f516o
            if (r4 == 0) goto L8c
            r3.mo2648f(r7)
        L8c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f492u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L95
            goto Lbe
        L95:
            if (r8 == 0) goto L9b
            boolean r0 = r8.mo506i(r7)
        L9b:
            java.util.Iterator r8 = r9.iterator()
        L9f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lbe
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.InterfaceC0163j) r4
            if (r4 != 0) goto Lb7
            r9.remove(r3)
            goto L9f
        Lb7:
            if (r0 != 0) goto L9f
            boolean r0 = r4.mo506i(r7)
            goto L9f
        Lbe:
            r1 = r1 | r0
            if (r1 != 0) goto Lc4
        Lc1:
            r6.m527c(r2)
        Lc4:
            return r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0159f.m541q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    /* renamed from: r */
    public final void m542r(InterfaceC0163j interfaceC0163j) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0163j>> copyOnWriteArrayList = this.f492u;
        Iterator<WeakReference<InterfaceC0163j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0163j> next = it.next();
            InterfaceC0163j interfaceC0163j2 = next.get();
            if (interfaceC0163j2 == null || interfaceC0163j2 == interfaceC0163j) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList<C0161h> arrayList;
        int size = size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            arrayList = this.f477f;
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (arrayList.get(i9).f503b == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || arrayList.get(i9).f503b != i7) {
                    break;
                }
                if (i9 >= 0 && i9 < arrayList.size()) {
                    arrayList.remove(i9);
                }
                i8 = i10;
            }
            mo540p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList<C0161h> arrayList;
        int size = size();
        int i8 = 0;
        while (true) {
            arrayList = this.f477f;
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (arrayList.get(i8).f502a == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0 || i8 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i8);
        mo540p(true);
    }

    /* renamed from: s */
    public final void m543s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo534j());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0166m) item.getSubMenu()).m543s(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (findItem = findItem(i8)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z6, boolean z7) {
        ArrayList<C0161h> arrayList = this.f477f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0161h c0161h = arrayList.get(i8);
            if (c0161h.f503b == i7) {
                c0161h.m558g(z7);
                c0161h.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f494w = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z6) {
        ArrayList<C0161h> arrayList = this.f477f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0161h c0161h = arrayList.get(i8);
            if (c0161h.f503b == i7) {
                c0161h.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z6) {
        ArrayList<C0161h> arrayList = this.f477f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            C0161h c0161h = arrayList.get(i8);
            if (c0161h.f503b == i7) {
                int i9 = c0161h.f525x;
                int i10 = (i9 & (-9)) | (z6 ? 0 : 8);
                c0161h.f525x = i10;
                if (i9 != i10) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            mo540p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f474c = z6;
        mo540p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f477f.size();
    }

    /* renamed from: t */
    public final void m544t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0166m) item.getSubMenu()).m544t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo534j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m545u(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f486o = view;
            this.f484m = null;
            this.f485n = null;
        } else {
            if (i7 > 0) {
                this.f484m = this.f473b.getText(i7);
            } else if (charSequence != null) {
                this.f484m = charSequence;
            }
            if (i8 > 0) {
                Object obj = C2009a.f9156a;
                this.f485n = C2009a.c.m4903b(this.f472a, i8);
            } else if (drawable != null) {
                this.f485n = drawable;
            }
            this.f486o = null;
        }
        mo540p(false);
    }

    /* renamed from: v */
    public final void m546v() {
        this.f487p = false;
        if (this.f488q) {
            this.f488q = false;
            mo540p(this.f489r);
        }
    }

    /* renamed from: w */
    public final void m547w() {
        if (this.f487p) {
            return;
        }
        this.f487p = true;
        this.f488q = false;
        this.f489r = false;
    }
}
