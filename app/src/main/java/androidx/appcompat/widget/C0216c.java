package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.AbstractC0154a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.C0162i;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.appcompat.view.menu.SubMenuC0166m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p034e0.AbstractC0910b;
import p057h.AbstractC1270d;
import p057h.InterfaceC1272f;
import p189y.C2213a;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public final class C0216c extends AbstractC0154a {

    /* renamed from: A1 */
    public boolean f821A1;

    /* renamed from: B1 */
    public boolean f822B1;

    /* renamed from: C1 */
    public boolean f823C1;

    /* renamed from: D1 */
    public int f824D1;

    /* renamed from: E1 */
    public int f825E1;

    /* renamed from: F1 */
    public int f826F1;

    /* renamed from: G1 */
    public boolean f827G1;

    /* renamed from: H1 */
    public final SparseBooleanArray f828H1;

    /* renamed from: I1 */
    public e f829I1;

    /* renamed from: J1 */
    public a f830J1;

    /* renamed from: K1 */
    public c f831K1;

    /* renamed from: L1 */
    public b f832L1;

    /* renamed from: M1 */
    public final f f833M1;

    /* renamed from: N1 */
    public int f834N1;

    /* renamed from: y1 */
    public d f835y1;

    /* renamed from: z1 */
    public Drawable f836z1;

    /* renamed from: androidx.appcompat.widget.c$a */
    public class a extends C0162i {
        public a(Context context, SubMenuC0166m subMenuC0166m, View view) {
            super(context, subMenuC0166m, view, false, R$attr.actionOverflowMenuStyle);
            if (!((subMenuC0166m.f565A.f525x & 32) == 32)) {
                View view2 = C0216c.this.f835y1;
                this.f534f = view2 == null ? (View) C0216c.this.f417w1 : view2;
            }
            f fVar = C0216c.this.f833M1;
            this.f537i = fVar;
            AbstractC1270d abstractC1270d = this.f538j;
            if (abstractC1270d != null) {
                abstractC1270d.mo498l(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0162i
        /* renamed from: c */
        public final void mo562c() {
            C0216c c0216c = C0216c.this;
            c0216c.f830J1 = null;
            c0216c.f834N1 = 0;
            super.mo562c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    public class b extends ActionMenuItemView.AbstractC0153b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    public class c implements Runnable {

        /* renamed from: c */
        public final e f839c;

        public c(e eVar) {
            this.f839c = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0159f.a aVar;
            C0216c c0216c = C0216c.this;
            C0159f c0159f = c0216c.f415m;
            if (c0159f != null && (aVar = c0159f.f476e) != null) {
                aVar.mo549b(c0159f);
            }
            View view = (View) c0216c.f417w1;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f839c;
                boolean z6 = true;
                if (!eVar.m561b()) {
                    if (eVar.f534f == null) {
                        z6 = false;
                    } else {
                        eVar.m563d(0, 0, false, false);
                    }
                }
                if (z6) {
                    c0216c.f829I1 = eVar;
                }
            }
            c0216c.f831K1 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public class d extends AppCompatImageView implements ActionMenuView.InterfaceC0173a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        public class a extends AbstractViewOnTouchListenerC0253o0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
            /* renamed from: b */
            public final InterfaceC1272f mo493b() {
                e eVar = C0216c.this.f829I1;
                if (eVar == null) {
                    return null;
                }
                return eVar.m560a();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
            /* renamed from: c */
            public final boolean mo494c() {
                C0216c.this.m699n();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
            /* renamed from: d */
            public final boolean mo700d() {
                C0216c c0216c = C0216c.this;
                if (c0216c.f831K1 != null) {
                    return false;
                }
                c0216c.m697c();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R$attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0245l1.m845a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0173a
        /* renamed from: a */
        public final boolean mo487a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0173a
        /* renamed from: b */
        public final boolean mo488b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0216c.this.m699n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2213a.b.m5370f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public class e extends C0162i {
        public e(Context context, C0159f c0159f, d dVar) {
            super(context, c0159f, dVar, true, R$attr.actionOverflowMenuStyle);
            this.f535g = 8388613;
            f fVar = C0216c.this.f833M1;
            this.f537i = fVar;
            AbstractC1270d abstractC1270d = this.f538j;
            if (abstractC1270d != null) {
                abstractC1270d.mo498l(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0162i
        /* renamed from: c */
        public final void mo562c() {
            C0216c c0216c = C0216c.this;
            C0159f c0159f = c0216c.f415m;
            if (c0159f != null) {
                c0159f.m527c(true);
            }
            c0216c.f829I1 = null;
            super.mo562c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    public class f implements InterfaceC0163j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: b */
        public final void mo550b(C0159f c0159f, boolean z6) {
            if (c0159f instanceof SubMenuC0166m) {
                c0159f.mo535k().m527c(false);
            }
            InterfaceC0163j.a aVar = C0216c.this.f410X;
            if (aVar != null) {
                aVar.mo550b(c0159f, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: c */
        public final boolean mo551c(C0159f c0159f) {
            C0216c c0216c = C0216c.this;
            if (c0159f == c0216c.f415m) {
                return false;
            }
            c0216c.f834N1 = ((SubMenuC0166m) c0159f).f565A.f502a;
            InterfaceC0163j.a aVar = c0216c.f410X;
            if (aVar != null) {
                return aVar.mo551c(c0159f);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c */
        public int f845c;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f845c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f845c);
        }
    }

    public C0216c(Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
        this.f828H1 = new SparseBooleanArray();
        this.f833M1 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: a */
    public final View m696a(C0161h c0161h, View view, ViewGroup viewGroup) {
        View actionView = c0161h.getActionView();
        if (actionView == null || c0161h.m556e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0164k.a ? (InterfaceC0164k.a) view : (InterfaceC0164k.a) this.f416s.inflate(this.f412Z, viewGroup, false);
            actionMenuItemView.mo489c(c0161h);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f417w1);
            if (this.f832L1 == null) {
                this.f832L1 = new b();
            }
            actionMenuItemView2.setPopupCallback(this.f832L1);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0161h.f501C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m588j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: b */
    public final void mo501b(C0159f c0159f, boolean z6) {
        m697c();
        a aVar = this.f830J1;
        if (aVar != null && aVar.m561b()) {
            aVar.f538j.dismiss();
        }
        InterfaceC0163j.a aVar2 = this.f410X;
        if (aVar2 != null) {
            aVar2.mo550b(c0159f, z6);
        }
    }

    /* renamed from: c */
    public final boolean m697c() {
        Object obj;
        c cVar = this.f831K1;
        if (cVar != null && (obj = this.f417w1) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f831K1 = null;
            return true;
        }
        e eVar = this.f829I1;
        if (eVar == null) {
            return false;
        }
        if (eVar.m561b()) {
            eVar.f538j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: e */
    public final void mo520e(Context context, C0159f c0159f) {
        this.f414e = context;
        LayoutInflater.from(context);
        this.f415m = c0159f;
        Resources resources = context.getResources();
        if (!this.f823C1) {
            this.f822B1 = true;
        }
        int i7 = 2;
        this.f824D1 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i7 = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i7 = 4;
        } else if (i8 >= 360) {
            i7 = 3;
        }
        this.f826F1 = i7;
        int i10 = this.f824D1;
        if (this.f822B1) {
            if (this.f835y1 == null) {
                d dVar = new d(this.f413c);
                this.f835y1 = dVar;
                if (this.f821A1) {
                    dVar.setImageDrawable(this.f836z1);
                    this.f836z1 = null;
                    this.f821A1 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f835y1.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f835y1.getMeasuredWidth();
        } else {
            this.f835y1 = null;
        }
        this.f825E1 = i10;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: f */
    public final void mo503f(Parcelable parcelable) {
        int i7;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i7 = ((g) parcelable).f845c) > 0 && (findItem = this.f415m.findItem(i7)) != null) {
            mo506i((SubMenuC0166m) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: g */
    public final void mo504g() {
        int i7;
        boolean z6;
        ViewGroup viewGroup = (ViewGroup) this.f417w1;
        ArrayList<C0161h> arrayList = null;
        boolean z7 = false;
        if (viewGroup != null) {
            C0159f c0159f = this.f415m;
            if (c0159f != null) {
                c0159f.m533i();
                ArrayList<C0161h> m536l = this.f415m.m536l();
                int size = m536l.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    C0161h c0161h = m536l.get(i8);
                    if ((c0161h.f525x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i7);
                        C0161h itemData = childAt instanceof InterfaceC0164k.a ? ((InterfaceC0164k.a) childAt).getItemData() : null;
                        View m696a = m696a(c0161h, childAt, viewGroup);
                        if (c0161h != itemData) {
                            m696a.setPressed(false);
                            m696a.jumpDrawablesToCurrentState();
                        }
                        if (m696a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m696a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m696a);
                            }
                            ((ViewGroup) this.f417w1).addView(m696a, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f835y1) {
                    z6 = false;
                } else {
                    viewGroup.removeViewAt(i7);
                    z6 = true;
                }
                if (!z6) {
                    i7++;
                }
            }
        }
        ((View) this.f417w1).requestLayout();
        C0159f c0159f2 = this.f415m;
        if (c0159f2 != null) {
            c0159f2.m533i();
            ArrayList<C0161h> arrayList2 = c0159f2.f480i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AbstractC0910b abstractC0910b = arrayList2.get(i9).f499A;
            }
        }
        C0159f c0159f3 = this.f415m;
        if (c0159f3 != null) {
            c0159f3.m533i();
            arrayList = c0159f3.f481j;
        }
        if (this.f822B1 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z7 = !arrayList.get(0).f501C;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        d dVar = this.f835y1;
        if (z7) {
            if (dVar == null) {
                this.f835y1 = new d(this.f413c);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f835y1.getParent();
            if (viewGroup3 != this.f417w1) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f835y1);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f417w1;
                d dVar2 = this.f835y1;
                actionMenuView.getClass();
                ActionMenuView.C0175c c0175c = new ActionMenuView.C0175c();
                ((LinearLayout.LayoutParams) c0175c).gravity = 16;
                c0175c.f633a = true;
                actionMenuView.addView(dVar2, c0175c);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f417w1;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f835y1);
            }
        }
        ((ActionMenuView) this.f417w1).setOverflowReserved(this.f822B1);
    }

    /* renamed from: h */
    public final boolean m698h() {
        e eVar = this.f829I1;
        return eVar != null && eVar.m561b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo506i(androidx.appcompat.view.menu.SubMenuC0166m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.f r2 = r0.f566z
            androidx.appcompat.view.menu.f r3 = r8.f415m
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.SubMenuC0166m) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.k r2 = r8.f417w1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = 0
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.InterfaceC0164k.a
            if (r6 == 0) goto L35
            r6 = r5
            androidx.appcompat.view.menu.k$a r6 = (androidx.appcompat.view.menu.InterfaceC0164k.a) r6
            androidx.appcompat.view.menu.h r6 = r6.getItemData()
            androidx.appcompat.view.menu.h r7 = r0.f565A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            androidx.appcompat.view.menu.h r0 = r9.f565A
            int r0 = r0.f502a
            r8.f834N1 = r0
            int r0 = r9.size()
            r2 = 0
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = 1
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = 0
        L60:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f414e
            r2.<init>(r4, r9, r5)
            r8.f830J1 = r2
            r2.f536h = r0
            h.d r2 = r2.f538j
            if (r2 == 0) goto L72
            r2.mo511q(r0)
        L72:
            androidx.appcompat.widget.c$a r0 = r8.f830J1
            boolean r2 = r0.m561b()
            if (r2 == 0) goto L7b
            goto L83
        L7b:
            android.view.View r2 = r0.f534f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.m563d(r1, r1, r1, r1)
        L83:
            r1 = 1
        L84:
            if (r1 == 0) goto L8e
            androidx.appcompat.view.menu.j$a r0 = r8.f410X
            if (r0 == 0) goto L8d
            r0.mo551c(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0216c.mo506i(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: j */
    public final boolean mo507j() {
        ArrayList<C0161h> arrayList;
        int i7;
        int i8;
        boolean z6;
        C0216c c0216c = this;
        C0159f c0159f = c0216c.f415m;
        if (c0159f != null) {
            arrayList = c0159f.m536l();
            i7 = arrayList.size();
        } else {
            arrayList = null;
            i7 = 0;
        }
        int i9 = c0216c.f826F1;
        int i10 = c0216c.f825E1;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0216c.f417w1;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z6 = true;
            if (i11 >= i7) {
                break;
            }
            C0161h c0161h = arrayList.get(i11);
            int i14 = c0161h.f526y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z7 = true;
            }
            if (c0216c.f827G1 && c0161h.f501C) {
                i9 = 0;
            }
            i11++;
        }
        if (c0216c.f822B1 && (z7 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c0216c.f828H1;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i7) {
            C0161h c0161h2 = arrayList.get(i16);
            int i18 = c0161h2.f526y;
            boolean z8 = (i18 & 2) == i8;
            int i19 = c0161h2.f503b;
            if (z8) {
                View m696a = c0216c.m696a(c0161h2, null, viewGroup);
                m696a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m696a.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z6);
                }
                c0161h2.m559h(z6);
            } else if ((i18 & 1) == z6) {
                boolean z9 = sparseBooleanArray.get(i19);
                boolean z10 = (i15 > 0 || z9) && i10 > 0;
                if (z10) {
                    View m696a2 = c0216c.m696a(c0161h2, null, viewGroup);
                    m696a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m696a2.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z10 &= i10 + i17 > 0;
                }
                if (z10 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z9) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        C0161h c0161h3 = arrayList.get(i20);
                        if (c0161h3.f503b == i19) {
                            if ((c0161h3.f525x & 32) == 32) {
                                i15++;
                            }
                            c0161h3.m559h(false);
                        }
                    }
                }
                if (z10) {
                    i15--;
                }
                c0161h2.m559h(z10);
            } else {
                c0161h2.m559h(false);
                i16++;
                i8 = 2;
                c0216c = this;
                z6 = true;
            }
            i16++;
            i8 = 2;
            c0216c = this;
            z6 = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: k */
    public final Parcelable mo508k() {
        g gVar = new g();
        gVar.f845c = this.f834N1;
        return gVar;
    }

    /* renamed from: n */
    public final boolean m699n() {
        C0159f c0159f;
        if (!this.f822B1 || m698h() || (c0159f = this.f415m) == null || this.f417w1 == null || this.f831K1 != null) {
            return false;
        }
        c0159f.m533i();
        if (c0159f.f481j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f414e, this.f415m, this.f835y1));
        this.f831K1 = cVar;
        ((View) this.f417w1).post(cVar);
        return true;
    }
}
