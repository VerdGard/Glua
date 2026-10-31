package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p025d.C0872a;
import p034e0.AbstractC0910b;
import p189y.C2213a;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public final class C0161h implements InterfaceMenuItemC2271b {

    /* renamed from: A */
    public AbstractC0910b f499A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f500B;

    /* renamed from: a */
    public final int f502a;

    /* renamed from: b */
    public final int f503b;

    /* renamed from: c */
    public final int f504c;

    /* renamed from: d */
    public final int f505d;

    /* renamed from: e */
    public CharSequence f506e;

    /* renamed from: f */
    public CharSequence f507f;

    /* renamed from: g */
    public Intent f508g;

    /* renamed from: h */
    public char f509h;

    /* renamed from: j */
    public char f511j;

    /* renamed from: l */
    public Drawable f513l;

    /* renamed from: n */
    public final C0159f f515n;

    /* renamed from: o */
    public SubMenuC0166m f516o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f517p;

    /* renamed from: q */
    public CharSequence f518q;

    /* renamed from: r */
    public CharSequence f519r;

    /* renamed from: y */
    public int f526y;

    /* renamed from: z */
    public View f527z;

    /* renamed from: i */
    public int f510i = 4096;

    /* renamed from: k */
    public int f512k = 4096;

    /* renamed from: m */
    public int f514m = 0;

    /* renamed from: s */
    public ColorStateList f520s = null;

    /* renamed from: t */
    public PorterDuff.Mode f521t = null;

    /* renamed from: u */
    public boolean f522u = false;

    /* renamed from: v */
    public boolean f523v = false;

    /* renamed from: w */
    public boolean f524w = false;

    /* renamed from: x */
    public int f525x = 16;

    /* renamed from: C */
    public boolean f501C = false;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class a implements AbstractC0910b.a {
        public a() {
        }
    }

    public C0161h(C0159f c0159f, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f515n = c0159f;
        this.f502a = i8;
        this.f503b = i7;
        this.f504c = i9;
        this.f505d = i10;
        this.f506e = charSequence;
        this.f526y = i11;
    }

    /* renamed from: a */
    public static void m552a(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    @Override // p197z.InterfaceMenuItemC2271b
    /* renamed from: b */
    public final InterfaceMenuItemC2271b mo553b(AbstractC0910b abstractC0910b) {
        AbstractC0910b abstractC0910b2 = this.f499A;
        if (abstractC0910b2 != null) {
            abstractC0910b2.f4777a = null;
        }
        this.f527z = null;
        this.f499A = abstractC0910b;
        this.f515n.mo540p(true);
        AbstractC0910b abstractC0910b3 = this.f499A;
        if (abstractC0910b3 != null) {
            abstractC0910b3.mo2650h(new a());
        }
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b
    /* renamed from: c */
    public final AbstractC0910b mo554c() {
        return this.f499A;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f526y & 8) == 0) {
            return false;
        }
        if (this.f527z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f500B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f515n.mo528d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m555d(Drawable drawable) {
        if (drawable != null && this.f524w && (this.f522u || this.f523v)) {
            drawable = C2213a.m5359g(drawable).mutate();
            if (this.f522u) {
                C2213a.b.m5372h(drawable, this.f520s);
            }
            if (this.f523v) {
                C2213a.b.m5373i(drawable, this.f521t);
            }
            this.f524w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m556e() {
        AbstractC0910b abstractC0910b;
        if ((this.f526y & 8) == 0) {
            return false;
        }
        if (this.f527z == null && (abstractC0910b = this.f499A) != null) {
            this.f527z = abstractC0910b.mo2646d(this);
        }
        return this.f527z != null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!m556e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f500B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f515n.mo530f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceMenuItemC2271b m557f(View view) {
        int i7;
        this.f527z = view;
        this.f499A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f502a) > 0) {
            view.setId(i7);
        }
        C0159f c0159f = this.f515n;
        c0159f.f482k = true;
        c0159f.mo540p(true);
        return this;
    }

    /* renamed from: g */
    public final void m558g(boolean z6) {
        this.f525x = (z6 ? 4 : 0) | (this.f525x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f527z;
        if (view != null) {
            return view;
        }
        AbstractC0910b abstractC0910b = this.f499A;
        if (abstractC0910b == null) {
            return null;
        }
        View mo2646d = abstractC0910b.mo2646d(this);
        this.f527z = mo2646d;
        return mo2646d;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f512k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f511j;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f518q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f503b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f513l;
        if (drawable != null) {
            return m555d(drawable);
        }
        int i7 = this.f514m;
        if (i7 == 0) {
            return null;
        }
        Drawable m2561a = C0872a.m2561a(this.f515n.f472a, i7);
        this.f514m = 0;
        this.f513l = m2561a;
        return m555d(m2561a);
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f520s;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f521t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f508g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f502a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f510i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f509h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f504c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f516o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f506e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f507f;
        return charSequence != null ? charSequence : this.f506e;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f519r;
    }

    /* renamed from: h */
    public final void m559h(boolean z6) {
        this.f525x = z6 ? this.f525x | 32 : this.f525x & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f516o != null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f501C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f525x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f525x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f525x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0910b abstractC0910b = this.f499A;
        return (abstractC0910b == null || !abstractC0910b.mo2649g()) ? (this.f525x & 8) == 0 : (this.f525x & 8) == 0 && this.f499A.mo2644b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        C0159f c0159f = this.f515n;
        Context context = c0159f.f472a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f527z = inflate;
        this.f499A = null;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f502a) > 0) {
            inflate.setId(i8);
        }
        c0159f.f482k = true;
        c0159f.mo540p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.f511j == c7) {
            return this;
        }
        this.f511j = Character.toLowerCase(c7);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f511j == c7 && this.f512k == i7) {
            return this;
        }
        this.f511j = Character.toLowerCase(c7);
        this.f512k = KeyEvent.normalizeMetaState(i7);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i7 = this.f525x;
        int i8 = (z6 ? 1 : 0) | (i7 & (-2));
        this.f525x = i8;
        if (i7 != i8) {
            this.f515n.mo540p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i7 = this.f525x;
        int i8 = i7 & 4;
        C0159f c0159f = this.f515n;
        if (i8 != 0) {
            c0159f.getClass();
            ArrayList<C0161h> arrayList = c0159f.f477f;
            int size = arrayList.size();
            c0159f.m547w();
            for (int i9 = 0; i9 < size; i9++) {
                C0161h c0161h = arrayList.get(i9);
                if (c0161h.f503b == this.f503b) {
                    if (((c0161h.f525x & 4) != 0) && c0161h.isCheckable()) {
                        boolean z7 = c0161h == this;
                        int i10 = c0161h.f525x;
                        int i11 = (z7 ? 2 : 0) | (i10 & (-3));
                        c0161h.f525x = i11;
                        if (i10 != i11) {
                            c0161h.f515n.mo540p(false);
                        }
                    }
                }
            }
            c0159f.m546v();
        } else {
            int i12 = (z6 ? 2 : 0) | (i7 & (-3));
            this.f525x = i12;
            if (i7 != i12) {
                c0159f.mo540p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final InterfaceMenuItemC2271b setContentDescription(CharSequence charSequence) {
        this.f518q = charSequence;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f525x = z6 ? this.f525x | 16 : this.f525x & (-17);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f513l = null;
        this.f514m = i7;
        this.f524w = true;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f514m = 0;
        this.f513l = drawable;
        this.f524w = true;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f520s = colorStateList;
        this.f522u = true;
        this.f524w = true;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f521t = mode;
        this.f523v = true;
        this.f524w = true;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f508g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.f509h == c7) {
            return this;
        }
        this.f509h = c7;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f509h == c7 && this.f510i == i7) {
            return this;
        }
        this.f509h = c7;
        this.f510i = KeyEvent.normalizeMetaState(i7);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f500B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f517p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f509h = c7;
        this.f511j = Character.toLowerCase(c8);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f509h = c7;
        this.f510i = KeyEvent.normalizeMetaState(i7);
        this.f511j = Character.toLowerCase(c8);
        this.f512k = KeyEvent.normalizeMetaState(i8);
        this.f515n.mo540p(false);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f526y = i7;
        C0159f c0159f = this.f515n;
        c0159f.f482k = true;
        c0159f.mo540p(true);
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f515n.f472a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f506e = charSequence;
        this.f515n.mo540p(false);
        SubMenuC0166m subMenuC0166m = this.f516o;
        if (subMenuC0166m != null) {
            subMenuC0166m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f507f = charSequence;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final InterfaceMenuItemC2271b setTooltipText(CharSequence charSequence) {
        this.f519r = charSequence;
        this.f515n.mo540p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i7 = this.f525x;
        int i8 = (z6 ? 0 : 8) | (i7 & (-9));
        this.f525x = i8;
        if (i7 != i8) {
            C0159f c0159f = this.f515n;
            c0159f.f479h = true;
            c0159f.mo540p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f506e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f527z = view;
        this.f499A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f502a) > 0) {
            view.setId(i7);
        }
        C0159f c0159f = this.f515n;
        c0159f.f482k = true;
        c0159f.mo540p(true);
        return this;
    }
}
