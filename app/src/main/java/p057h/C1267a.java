package p057h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p034e0.AbstractC0910b;
import p166v.C2009a;
import p189y.C2213a;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: h.a */
/* loaded from: classes.dex */
public final class C1267a implements InterfaceMenuItemC2271b {

    /* renamed from: a */
    public final int f6313a;

    /* renamed from: b */
    public final int f6314b;

    /* renamed from: c */
    public final int f6315c;

    /* renamed from: d */
    public CharSequence f6316d;

    /* renamed from: e */
    public CharSequence f6317e;

    /* renamed from: f */
    public Intent f6318f;

    /* renamed from: g */
    public char f6319g;

    /* renamed from: i */
    public char f6321i;

    /* renamed from: k */
    public Drawable f6323k;

    /* renamed from: l */
    public final Context f6324l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f6325m;

    /* renamed from: n */
    public CharSequence f6326n;

    /* renamed from: o */
    public CharSequence f6327o;

    /* renamed from: h */
    public int f6320h = 4096;

    /* renamed from: j */
    public int f6322j = 4096;

    /* renamed from: p */
    public ColorStateList f6328p = null;

    /* renamed from: q */
    public PorterDuff.Mode f6329q = null;

    /* renamed from: r */
    public boolean f6330r = false;

    /* renamed from: s */
    public boolean f6331s = false;

    /* renamed from: t */
    public int f6332t = 16;

    public C1267a(Context context, int i7, int i8, int i9, CharSequence charSequence) {
        this.f6324l = context;
        this.f6313a = i8;
        this.f6314b = i7;
        this.f6315c = i9;
        this.f6316d = charSequence;
    }

    /* renamed from: a */
    public final void m3577a() {
        Drawable drawable = this.f6323k;
        if (drawable != null) {
            if (this.f6330r || this.f6331s) {
                Drawable m5359g = C2213a.m5359g(drawable);
                this.f6323k = m5359g;
                Drawable mutate = m5359g.mutate();
                this.f6323k = mutate;
                if (this.f6330r) {
                    C2213a.b.m5372h(mutate, this.f6328p);
                }
                if (this.f6331s) {
                    C2213a.b.m5373i(this.f6323k, this.f6329q);
                }
            }
        }
    }

    @Override // p197z.InterfaceMenuItemC2271b
    /* renamed from: b */
    public final InterfaceMenuItemC2271b mo553b(AbstractC0910b abstractC0910b) {
        throw new UnsupportedOperationException();
    }

    @Override // p197z.InterfaceMenuItemC2271b
    /* renamed from: c */
    public final AbstractC0910b mo554c() {
        return null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public final boolean m3578d() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f6325m;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f6318f;
        if (intent == null) {
            return false;
        }
        this.f6324l.startActivity(intent);
        return true;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6322j;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6321i;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6326n;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6314b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6323k;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6328p;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6329q;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6318f;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6313a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6320h;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6319g;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6315c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6316d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6317e;
        return charSequence != null ? charSequence : this.f6316d;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6327o;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6332t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6332t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6332t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6332t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f6321i = Character.toLowerCase(c7);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f6321i = Character.toLowerCase(c7);
        this.f6322j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f6332t = (z6 ? 1 : 0) | (this.f6332t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f6332t = (z6 ? 2 : 0) | (this.f6332t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6326n = charSequence;
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final InterfaceMenuItemC2271b setContentDescription(CharSequence charSequence) {
        this.f6326n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f6332t = (z6 ? 16 : 0) | (this.f6332t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        Object obj = C2009a.f9156a;
        this.f6323k = C2009a.c.m4903b(this.f6324l, i7);
        m3577a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6323k = drawable;
        m3577a();
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6328p = colorStateList;
        this.f6330r = true;
        m3577a();
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6329q = mode;
        this.f6331s = true;
        m3577a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6318f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f6319g = c7;
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        this.f6319g = c7;
        this.f6320h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6325m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f6319g = c7;
        this.f6321i = Character.toLowerCase(c8);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f6319g = c7;
        this.f6320h = KeyEvent.normalizeMetaState(i7);
        this.f6321i = Character.toLowerCase(c8);
        this.f6322j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f6316d = this.f6324l.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6316d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6317e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6327o = charSequence;
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final InterfaceMenuItemC2271b setTooltipText(CharSequence charSequence) {
        this.f6327o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f6332t = (this.f6332t & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // p197z.InterfaceMenuItemC2271b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
