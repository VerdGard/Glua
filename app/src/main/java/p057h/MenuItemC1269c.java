package p057h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.SubMenuC0166m;
import java.lang.reflect.Method;
import p034e0.AbstractC0910b;
import p049g.InterfaceC1184b;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: h.c */
/* loaded from: classes.dex */
public final class MenuItemC1269c extends AbstractC1268b implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC2271b f6336d;

    /* renamed from: e */
    public Method f6337e;

    /* renamed from: h.c$a */
    public class a extends AbstractC0910b {

        /* renamed from: b */
        public final ActionProvider f6338b;

        public a(ActionProvider actionProvider) {
            this.f6338b = actionProvider;
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: a */
        public final boolean mo2643a() {
            return this.f6338b.hasSubMenu();
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: c */
        public final View mo2645c() {
            return this.f6338b.onCreateActionView();
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: e */
        public final boolean mo2647e() {
            return this.f6338b.onPerformDefaultAction();
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: f */
        public final void mo2648f(SubMenuC0166m subMenuC0166m) {
            this.f6338b.onPrepareSubMenu(MenuItemC1269c.this.m3581h(subMenuC0166m));
        }
    }

    /* renamed from: h.c$b */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public AbstractC0910b.a f6340d;

        public b(MenuItemC1269c menuItemC1269c, ActionProvider actionProvider) {
            super(actionProvider);
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: b */
        public final boolean mo2644b() {
            return this.f6338b.isVisible();
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: d */
        public final View mo2646d(MenuItem menuItem) {
            return this.f6338b.onCreateActionView(menuItem);
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: g */
        public final boolean mo2649g() {
            return this.f6338b.overridesItemVisibility();
        }

        @Override // p034e0.AbstractC0910b
        /* renamed from: h */
        public final void mo2650h(C0161h.a aVar) {
            this.f6340d = aVar;
            this.f6338b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z6) {
            AbstractC0910b.a aVar = this.f6340d;
            if (aVar != null) {
                C0159f c0159f = C0161h.this.f515n;
                c0159f.f479h = true;
                c0159f.mo540p(true);
            }
        }
    }

    /* renamed from: h.c$c */
    public static class c extends FrameLayout implements InterfaceC1184b {

        /* renamed from: c */
        public final CollapsibleActionView f6341c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f6341c = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p049g.InterfaceC1184b
        public final void onActionViewCollapsed() {
            this.f6341c.onActionViewCollapsed();
        }

        @Override // p049g.InterfaceC1184b
        public final void onActionViewExpanded() {
            this.f6341c.onActionViewExpanded();
        }
    }

    /* renamed from: h.c$d */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f6342a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f6342a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f6342a.onMenuItemActionCollapse(MenuItemC1269c.this.m3580g(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f6342a.onMenuItemActionExpand(MenuItemC1269c.this.m3580g(menuItem));
        }
    }

    /* renamed from: h.c$e */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f6344a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f6344a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f6344a.onMenuItemClick(MenuItemC1269c.this.m3580g(menuItem));
        }
    }

    public MenuItemC1269c(Context context, InterfaceMenuItemC2271b interfaceMenuItemC2271b) {
        super(context);
        if (interfaceMenuItemC2271b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f6336d = interfaceMenuItemC2271b;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f6336d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f6336d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC0910b mo554c = this.f6336d.mo554c();
        if (mo554c instanceof a) {
            return ((a) mo554c).f6338b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f6336d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f6341c : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6336d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6336d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6336d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6336d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6336d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6336d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6336d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6336d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6336d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f6336d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6336d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6336d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6336d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m3581h(this.f6336d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6336d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f6336d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6336d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6336d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6336d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f6336d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f6336d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f6336d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f6336d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.f6336d.mo553b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        InterfaceMenuItemC2271b interfaceMenuItemC2271b = this.f6336d;
        interfaceMenuItemC2271b.setActionView(i7);
        View actionView = interfaceMenuItemC2271b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC2271b.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f6336d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f6336d.setAlphabeticShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f6336d.setAlphabeticShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f6336d.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f6336d.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6336d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f6336d.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f6336d.setIcon(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6336d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6336d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6336d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6336d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f6336d.setNumericShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        this.f6336d.setNumericShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6336d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6336d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f6336d.setShortcut(c7, c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f6336d.setShortcut(c7, c8, i7, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        this.f6336d.setShowAsAction(i7);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        this.f6336d.setShowAsActionFlags(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f6336d.setTitle(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6336d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6336d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6336d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        return this.f6336d.setVisible(z6);
    }
}
