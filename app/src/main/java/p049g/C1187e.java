package p049g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0159f;
import java.util.ArrayList;
import p049g.AbstractC1183a;
import p057h.MenuC1271e;
import p057h.MenuItemC1269c;
import p089l.C1481o;
import p197z.InterfaceMenuItemC2271b;

/* renamed from: g.e */
/* loaded from: classes.dex */
public final class C1187e extends ActionMode {

    /* renamed from: a */
    public final Context f5796a;

    /* renamed from: b */
    public final AbstractC1183a f5797b;

    /* renamed from: g.e$a */
    public static class a implements AbstractC1183a.a {

        /* renamed from: a */
        public final ActionMode.Callback f5798a;

        /* renamed from: b */
        public final Context f5799b;

        /* renamed from: c */
        public final ArrayList<C1187e> f5800c = new ArrayList<>();

        /* renamed from: d */
        public final C1481o<Menu, Menu> f5801d = new C1481o<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f5799b = context;
            this.f5798a = callback;
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: a */
        public final boolean mo1961a(AbstractC1183a abstractC1183a, C0159f c0159f) {
            C1187e m3397e = m3397e(abstractC1183a);
            C1481o<Menu, Menu> c1481o = this.f5801d;
            Menu menu = c1481o.get(c0159f);
            if (menu == null) {
                menu = new MenuC1271e(this.f5799b, c0159f);
                c1481o.put(c0159f, menu);
            }
            return this.f5798a.onCreateActionMode(m3397e, menu);
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: b */
        public final boolean mo1962b(AbstractC1183a abstractC1183a, MenuItem menuItem) {
            return this.f5798a.onActionItemClicked(m3397e(abstractC1183a), new MenuItemC1269c(this.f5799b, (InterfaceMenuItemC2271b) menuItem));
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: c */
        public final boolean mo1963c(AbstractC1183a abstractC1183a, C0159f c0159f) {
            C1187e m3397e = m3397e(abstractC1183a);
            C1481o<Menu, Menu> c1481o = this.f5801d;
            Menu menu = c1481o.get(c0159f);
            if (menu == null) {
                menu = new MenuC1271e(this.f5799b, c0159f);
                c1481o.put(c0159f, menu);
            }
            return this.f5798a.onPrepareActionMode(m3397e, menu);
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: d */
        public final void mo1964d(AbstractC1183a abstractC1183a) {
            this.f5798a.onDestroyActionMode(m3397e(abstractC1183a));
        }

        /* renamed from: e */
        public final C1187e m3397e(AbstractC1183a abstractC1183a) {
            ArrayList<C1187e> arrayList = this.f5800c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1187e c1187e = arrayList.get(i7);
                if (c1187e != null && c1187e.f5797b == abstractC1183a) {
                    return c1187e;
                }
            }
            C1187e c1187e2 = new C1187e(this.f5799b, abstractC1183a);
            arrayList.add(c1187e2);
            return c1187e2;
        }
    }

    public C1187e(Context context, AbstractC1183a abstractC1183a) {
        this.f5796a = context;
        this.f5797b = abstractC1183a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5797b.mo1890c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5797b.mo1891d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1271e(this.f5796a, this.f5797b.mo1892e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5797b.mo1893f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5797b.mo1894g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5797b.f5782c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5797b.mo1895h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5797b.f5783e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5797b.mo1896i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5797b.mo1897j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5797b.mo1898k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f5797b.mo1899l(i7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5797b.mo1900m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5797b.f5782c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f5797b.mo1901n(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5797b.mo1902o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f5797b.mo1903p(z6);
    }
}
