package p131q3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.SubMenuC0166m;
import androidx.recyclerview.widget.C0490x;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p066i0.C1315i;

/* renamed from: q3.i */
/* loaded from: classes.dex */
public final class C1753i implements InterfaceC0163j {

    /* renamed from: A1 */
    public ColorStateList f8042A1;

    /* renamed from: B1 */
    public Drawable f8043B1;

    /* renamed from: C1 */
    public RippleDrawable f8044C1;

    /* renamed from: D1 */
    public int f8045D1;

    /* renamed from: E1 */
    public int f8046E1;

    /* renamed from: F1 */
    public int f8047F1;

    /* renamed from: G1 */
    public int f8048G1;

    /* renamed from: H1 */
    public int f8049H1;

    /* renamed from: I1 */
    public int f8050I1;

    /* renamed from: J1 */
    public int f8051J1;

    /* renamed from: K1 */
    public int f8052K1;

    /* renamed from: L1 */
    public boolean f8053L1;

    /* renamed from: N1 */
    public int f8055N1;

    /* renamed from: O1 */
    public int f8056O1;

    /* renamed from: P1 */
    public int f8057P1;

    /* renamed from: X */
    public c f8060X;

    /* renamed from: Y */
    public LayoutInflater f8061Y;

    /* renamed from: c */
    public NavigationMenuView f8063c;

    /* renamed from: e */
    public LinearLayout f8064e;

    /* renamed from: m */
    public C0159f f8065m;

    /* renamed from: s */
    public int f8066s;

    /* renamed from: w1 */
    public ColorStateList f8067w1;

    /* renamed from: z1 */
    public ColorStateList f8070z1;

    /* renamed from: Z */
    public int f8062Z = 0;

    /* renamed from: x1 */
    public int f8068x1 = 0;

    /* renamed from: y1 */
    public boolean f8069y1 = true;

    /* renamed from: M1 */
    public boolean f8054M1 = true;

    /* renamed from: Q1 */
    public int f8058Q1 = -1;

    /* renamed from: R1 */
    public final a f8059R1 = new a();

    /* renamed from: q3.i$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C1753i c1753i = C1753i.this;
            c cVar = c1753i.f8060X;
            boolean z6 = true;
            if (cVar != null) {
                cVar.f8074e = true;
            }
            C0161h itemData = navigationMenuItemView.getItemData();
            boolean m541q = c1753i.f8065m.m541q(itemData, c1753i, 0);
            if (itemData != null && itemData.isCheckable() && m541q) {
                c1753i.f8060X.m4228i(itemData);
            } else {
                z6 = false;
            }
            c cVar2 = c1753i.f8060X;
            if (cVar2 != null) {
                cVar2.f8074e = false;
            }
            if (z6) {
                c1753i.mo504g();
            }
        }
    }

    /* renamed from: q3.i$b */
    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* renamed from: q3.i$c */
    public class c extends RecyclerView.AbstractC0436e<l> {

        /* renamed from: c */
        public final ArrayList<e> f8072c = new ArrayList<>();

        /* renamed from: d */
        public C0161h f8073d;

        /* renamed from: e */
        public boolean f8074e;

        public c() {
            m4227h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: a */
        public final int mo1583a() {
            return this.f8072c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: b */
        public final long mo1584b(int i7) {
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: c */
        public final int mo1585c(int i7) {
            e eVar = this.f8072c.get(i7);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f8078a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: d */
        public final void mo1586d(l lVar, int i7) {
            C1754j c1754j;
            NavigationMenuItemView navigationMenuItemView;
            int mo1585c = mo1585c(i7);
            ArrayList<e> arrayList = this.f8072c;
            View view = lVar.f2177a;
            C1753i c1753i = C1753i.this;
            if (mo1585c == 0) {
                NavigationMenuItemView navigationMenuItemView2 = (NavigationMenuItemView) view;
                navigationMenuItemView2.setIconTintList(c1753i.f8042A1);
                navigationMenuItemView2.setTextAppearance(c1753i.f8068x1);
                ColorStateList colorStateList = c1753i.f8070z1;
                if (colorStateList != null) {
                    navigationMenuItemView2.setTextColor(colorStateList);
                }
                Drawable drawable = c1753i.f8043B1;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2841q(navigationMenuItemView2, newDrawable);
                RippleDrawable rippleDrawable = c1753i.f8044C1;
                if (rippleDrawable != null) {
                    navigationMenuItemView2.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) arrayList.get(i7);
                navigationMenuItemView2.setNeedsEmptyIcon(gVar.f8079b);
                int i8 = c1753i.f8045D1;
                int i9 = c1753i.f8046E1;
                navigationMenuItemView2.setPadding(i8, i9, i8, i9);
                navigationMenuItemView2.setIconPadding(c1753i.f8047F1);
                if (c1753i.f8053L1) {
                    navigationMenuItemView2.setIconSize(c1753i.f8048G1);
                }
                navigationMenuItemView2.setMaxLines(c1753i.f8055N1);
                navigationMenuItemView2.f4322Q1 = c1753i.f8069y1;
                navigationMenuItemView2.mo489c(gVar.f8078a);
                c1754j = new C1754j(this, i7, false);
                navigationMenuItemView = navigationMenuItemView2;
            } else {
                if (mo1585c != 1) {
                    if (mo1585c != 2) {
                        return;
                    }
                    f fVar = (f) arrayList.get(i7);
                    view.setPadding(c1753i.f8049H1, fVar.f8076a, c1753i.f8050I1, fVar.f8077b);
                    return;
                }
                TextView textView = (TextView) view;
                textView.setText(((g) arrayList.get(i7)).f8078a.f506e);
                C1315i.m3656e(textView, c1753i.f8062Z);
                textView.setPadding(c1753i.f8051J1, textView.getPaddingTop(), c1753i.f8052K1, textView.getPaddingBottom());
                ColorStateList colorStateList2 = c1753i.f8067w1;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                c1754j = new C1754j(this, i7, true);
                navigationMenuItemView = textView;
            }
            C0946x.m2817r(navigationMenuItemView, c1754j);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: f */
        public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
            RecyclerView.AbstractC0432a0 iVar;
            C1753i c1753i = C1753i.this;
            if (i7 == 0) {
                iVar = new i(c1753i.f8061Y, recyclerView, c1753i.f8059R1);
            } else if (i7 == 1) {
                iVar = new k(c1753i.f8061Y, recyclerView);
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return new b(c1753i.f8064e);
                }
                iVar = new j(c1753i.f8061Y, recyclerView);
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
        /* renamed from: g */
        public final void mo1589g(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.f2177a;
                FrameLayout frameLayout = navigationMenuItemView.f4324S1;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f4323R1.setCompoundDrawables(null, null, null, null);
            }
        }

        /* renamed from: h */
        public final void m4227h() {
            if (this.f8074e) {
                return;
            }
            this.f8074e = true;
            ArrayList<e> arrayList = this.f8072c;
            arrayList.clear();
            arrayList.add(new d());
            C1753i c1753i = C1753i.this;
            int size = c1753i.f8065m.m536l().size();
            boolean z6 = false;
            int i7 = -1;
            int i8 = 0;
            boolean z7 = false;
            int i9 = 0;
            while (i8 < size) {
                C0161h c0161h = c1753i.f8065m.m536l().get(i8);
                if (c0161h.isChecked()) {
                    m4228i(c0161h);
                }
                if (c0161h.isCheckable()) {
                    c0161h.m558g(z6);
                }
                if (c0161h.hasSubMenu()) {
                    SubMenuC0166m subMenuC0166m = c0161h.f516o;
                    if (subMenuC0166m.hasVisibleItems()) {
                        if (i8 != 0) {
                            arrayList.add(new f(c1753i.f8057P1, z6 ? 1 : 0));
                        }
                        arrayList.add(new g(c0161h));
                        int size2 = subMenuC0166m.size();
                        int i10 = 0;
                        boolean z8 = false;
                        while (i10 < size2) {
                            C0161h c0161h2 = (C0161h) subMenuC0166m.getItem(i10);
                            if (c0161h2.isVisible()) {
                                if (!z8 && c0161h2.getIcon() != null) {
                                    z8 = true;
                                }
                                if (c0161h2.isCheckable()) {
                                    c0161h2.m558g(z6);
                                }
                                if (c0161h.isChecked()) {
                                    m4228i(c0161h);
                                }
                                arrayList.add(new g(c0161h2));
                            }
                            i10++;
                            z6 = false;
                        }
                        if (z8) {
                            int size3 = arrayList.size();
                            for (int size4 = arrayList.size(); size4 < size3; size4++) {
                                ((g) arrayList.get(size4)).f8079b = true;
                            }
                        }
                    }
                } else {
                    int i11 = c0161h.f503b;
                    if (i11 != i7) {
                        i9 = arrayList.size();
                        z7 = c0161h.getIcon() != null;
                        if (i8 != 0) {
                            i9++;
                            int i12 = c1753i.f8057P1;
                            arrayList.add(new f(i12, i12));
                        }
                    } else if (!z7 && c0161h.getIcon() != null) {
                        int size5 = arrayList.size();
                        for (int i13 = i9; i13 < size5; i13++) {
                            ((g) arrayList.get(i13)).f8079b = true;
                        }
                        z7 = true;
                        g gVar = new g(c0161h);
                        gVar.f8079b = z7;
                        arrayList.add(gVar);
                        i7 = i11;
                    }
                    g gVar2 = new g(c0161h);
                    gVar2.f8079b = z7;
                    arrayList.add(gVar2);
                    i7 = i11;
                }
                i8++;
                z6 = false;
            }
            this.f8074e = false;
        }

        /* renamed from: i */
        public final void m4228i(C0161h c0161h) {
            if (this.f8073d == c0161h || !c0161h.isCheckable()) {
                return;
            }
            C0161h c0161h2 = this.f8073d;
            if (c0161h2 != null) {
                c0161h2.setChecked(false);
            }
            this.f8073d = c0161h;
            c0161h.setChecked(true);
        }
    }

    /* renamed from: q3.i$d */
    public static class d implements e {
    }

    /* renamed from: q3.i$e */
    public interface e {
    }

    /* renamed from: q3.i$f */
    public static class f implements e {

        /* renamed from: a */
        public final int f8076a;

        /* renamed from: b */
        public final int f8077b;

        public f(int i7, int i8) {
            this.f8076a = i7;
            this.f8077b = i8;
        }
    }

    /* renamed from: q3.i$g */
    public static class g implements e {

        /* renamed from: a */
        public final C0161h f8078a;

        /* renamed from: b */
        public boolean f8079b;

        public g(C0161h c0161h) {
            this.f8078a = c0161h;
        }
    }

    /* renamed from: q3.i$h */
    public class h extends C0490x {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.C0490x, p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            super.mo134d(view, c1151g);
            c cVar = C1753i.this.f8060X;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                C1753i c1753i = C1753i.this;
                if (i7 >= c1753i.f8060X.mo1583a()) {
                    c1151g.f5685a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i8, 1, false));
                    return;
                } else {
                    int mo1585c = c1753i.f8060X.mo1585c(i7);
                    if (mo1585c == 0 || mo1585c == 1) {
                        i8++;
                    }
                    i7++;
                }
            }
        }
    }

    /* renamed from: q3.i$i */
    public static class i extends l {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(android.view.LayoutInflater r3, androidx.recyclerview.widget.RecyclerView r4, p131q3.C1753i.a r5) {
            /*
                r2 = this;
                int r0 = com.google.android.material.R$layout.design_navigation_item
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p131q3.C1753i.i.<init>(android.view.LayoutInflater, androidx.recyclerview.widget.RecyclerView, q3.i$a):void");
        }
    }

    /* renamed from: q3.i$j */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_separator, (ViewGroup) recyclerView, false));
        }
    }

    /* renamed from: q3.i$k */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_subheader, (ViewGroup) recyclerView, false));
        }
    }

    /* renamed from: q3.i$l */
    public static abstract class l extends RecyclerView.AbstractC0432a0 {
        public l(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final void m4226a() {
        int i7 = ((this.f8064e.getChildCount() > 0) || !this.f8054M1) ? 0 : this.f8056O1;
        NavigationMenuView navigationMenuView = this.f8063c;
        navigationMenuView.setPadding(0, i7, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: b */
    public final void mo501b(C0159f c0159f, boolean z6) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: d */
    public final boolean mo497d(C0161h c0161h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: e */
    public final void mo520e(Context context, C0159f c0159f) {
        this.f8061Y = LayoutInflater.from(context);
        this.f8065m = c0159f;
        this.f8057P1 = context.getResources().getDimensionPixelOffset(R$dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: f */
    public final void mo503f(Parcelable parcelable) {
        C0161h c0161h;
        View actionView;
        C1756l c1756l;
        C0161h c0161h2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f8063c.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f8060X;
                cVar.getClass();
                int i7 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f8072c;
                if (i7 != 0) {
                    cVar.f8074e = true;
                    int size = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            break;
                        }
                        e eVar = arrayList.get(i8);
                        if ((eVar instanceof g) && (c0161h2 = ((g) eVar).f8078a) != null && c0161h2.f502a == i7) {
                            cVar.m4228i(c0161h2);
                            break;
                        }
                        i8++;
                    }
                    cVar.f8074e = false;
                    cVar.m4227h();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        e eVar2 = arrayList.get(i9);
                        if ((eVar2 instanceof g) && (c0161h = ((g) eVar2).f8078a) != null && (actionView = c0161h.getActionView()) != null && (c1756l = (C1756l) sparseParcelableArray2.get(c0161h.f502a)) != null) {
                            actionView.restoreHierarchyState(c1756l);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f8064e.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: g */
    public final void mo504g() {
        c cVar = this.f8060X;
        if (cVar != null) {
            cVar.m4227h();
            cVar.f2197a.m1591b();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    public final int getId() {
        return this.f8066s;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: i */
    public final boolean mo506i(SubMenuC0166m subMenuC0166m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: j */
    public final boolean mo507j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: k */
    public final Parcelable mo508k() {
        Bundle bundle = new Bundle();
        if (this.f8063c != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f8063c.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f8060X;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            C0161h c0161h = cVar.f8073d;
            if (c0161h != null) {
                bundle2.putInt("android:menu:checked", c0161h.f502a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<e> arrayList = cVar.f8072c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar = arrayList.get(i7);
                if (eVar instanceof g) {
                    C0161h c0161h2 = ((g) eVar).f8078a;
                    View actionView = c0161h2 != null ? c0161h2.getActionView() : null;
                    if (actionView != null) {
                        C1756l c1756l = new C1756l();
                        actionView.saveHierarchyState(c1756l);
                        sparseArray2.put(c0161h2.f502a, c1756l);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f8064e != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f8064e.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: m */
    public final boolean mo499m(C0161h c0161h) {
        return false;
    }
}
