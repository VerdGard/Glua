package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0151d;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.InterfaceC0164k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public final class C0157d implements InterfaceC0163j, AdapterView.OnItemClickListener {

    /* renamed from: X */
    public final int f456X;

    /* renamed from: Y */
    public InterfaceC0163j.a f457Y;

    /* renamed from: Z */
    public a f458Z;

    /* renamed from: c */
    public Context f459c;

    /* renamed from: e */
    public LayoutInflater f460e;

    /* renamed from: m */
    public C0159f f461m;

    /* renamed from: s */
    public ExpandedMenuView f462s;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    public class a extends BaseAdapter {

        /* renamed from: c */
        public int f463c = -1;

        public a() {
            m521b();
        }

        /* renamed from: b */
        public final void m521b() {
            C0159f c0159f = C0157d.this.f461m;
            C0161h c0161h = c0159f.f493v;
            if (c0161h != null) {
                c0159f.m533i();
                ArrayList<C0161h> arrayList = c0159f.f481j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (arrayList.get(i7) == c0161h) {
                        this.f463c = i7;
                        return;
                    }
                }
            }
            this.f463c = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0161h getItem(int i7) {
            C0157d c0157d = C0157d.this;
            C0159f c0159f = c0157d.f461m;
            c0159f.m533i();
            ArrayList<C0161h> arrayList = c0159f.f481j;
            c0157d.getClass();
            int i8 = i7 + 0;
            int i9 = this.f463c;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return arrayList.get(i8);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            C0157d c0157d = C0157d.this;
            C0159f c0159f = c0157d.f461m;
            c0159f.m533i();
            int size = c0159f.f481j.size();
            c0157d.getClass();
            int i7 = size + 0;
            return this.f463c < 0 ? i7 : i7 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0157d c0157d = C0157d.this;
                view = c0157d.f460e.inflate(c0157d.f456X, viewGroup, false);
            }
            ((InterfaceC0164k.a) view).mo489c(getItem(i7));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            m521b();
            super.notifyDataSetChanged();
        }
    }

    public C0157d(int i7, Context context) {
        this.f456X = i7;
        this.f459c = context;
        this.f460e = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: b */
    public final void mo501b(C0159f c0159f, boolean z6) {
        InterfaceC0163j.a aVar = this.f457Y;
        if (aVar != null) {
            aVar.mo550b(c0159f, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: d */
    public final boolean mo497d(C0161h c0161h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: e */
    public final void mo520e(Context context, C0159f c0159f) {
        if (this.f459c != null) {
            this.f459c = context;
            if (this.f460e == null) {
                this.f460e = LayoutInflater.from(context);
            }
        }
        this.f461m = c0159f;
        a aVar = this.f458Z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: f */
    public final void mo503f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f462s.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: g */
    public final void mo504g() {
        a aVar = this.f458Z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: i */
    public final boolean mo506i(SubMenuC0166m subMenuC0166m) {
        if (!subMenuC0166m.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0160g dialogInterfaceOnKeyListenerC0160g = new DialogInterfaceOnKeyListenerC0160g(subMenuC0166m);
        Context context = subMenuC0166m.f472a;
        DialogInterfaceC0151d.a aVar = new DialogInterfaceC0151d.a(context);
        AlertController.C0145b c0145b = aVar.f374a;
        C0157d c0157d = new C0157d(R$layout.abc_list_menu_item_layout, c0145b.f341a);
        dialogInterfaceOnKeyListenerC0160g.f498m = c0157d;
        c0157d.f457Y = dialogInterfaceOnKeyListenerC0160g;
        subMenuC0166m.m526b(c0157d, context);
        C0157d c0157d2 = dialogInterfaceOnKeyListenerC0160g.f498m;
        if (c0157d2.f458Z == null) {
            c0157d2.f458Z = c0157d2.new a();
        }
        c0145b.f357q = c0157d2.f458Z;
        c0145b.f358r = dialogInterfaceOnKeyListenerC0160g;
        View view = subMenuC0166m.f486o;
        if (view != null) {
            c0145b.f346f = view;
        } else {
            c0145b.f344d = subMenuC0166m.f485n;
            c0145b.f345e = subMenuC0166m.f484m;
        }
        c0145b.f355o = dialogInterfaceOnKeyListenerC0160g;
        DialogInterfaceC0151d m484a = aVar.m484a();
        dialogInterfaceOnKeyListenerC0160g.f497e = m484a;
        m484a.setOnDismissListener(dialogInterfaceOnKeyListenerC0160g);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0160g.f497e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0160g.f497e.show();
        InterfaceC0163j.a aVar2 = this.f457Y;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo551c(subMenuC0166m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: j */
    public final boolean mo507j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: k */
    public final Parcelable mo508k() {
        if (this.f462s == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f462s;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: l */
    public final void mo498l(InterfaceC0163j.a aVar) {
        this.f457Y = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: m */
    public final boolean mo499m(C0161h c0161h) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        this.f461m.m541q(this.f458Z.getItem(i7), this, 0);
    }
}
