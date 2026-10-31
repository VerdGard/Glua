package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.RunnableC0123h;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.SubMenuC0166m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p016c.AbstractC0542a;
import p016c.C0565s;
import p025d.C0872a;
import p034e0.C0920g;
import p034e0.C0922h;
import p034e0.C0923h0;
import p034e0.C0946x;
import p034e0.InterfaceC0926j;
import p049g.C1188f;
import p049g.InterfaceC1184b;
import p082k0.AbstractC1446a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A1 */
    public View f730A1;

    /* renamed from: B1 */
    public Context f731B1;

    /* renamed from: C1 */
    public int f732C1;

    /* renamed from: D1 */
    public int f733D1;

    /* renamed from: E1 */
    public int f734E1;

    /* renamed from: F1 */
    public final int f735F1;

    /* renamed from: G1 */
    public final int f736G1;

    /* renamed from: H1 */
    public int f737H1;

    /* renamed from: I1 */
    public int f738I1;

    /* renamed from: J1 */
    public int f739J1;

    /* renamed from: K1 */
    public int f740K1;

    /* renamed from: L1 */
    public C0278z0 f741L1;

    /* renamed from: M1 */
    public int f742M1;

    /* renamed from: N1 */
    public int f743N1;

    /* renamed from: O1 */
    public final int f744O1;

    /* renamed from: P1 */
    public CharSequence f745P1;

    /* renamed from: Q1 */
    public CharSequence f746Q1;

    /* renamed from: R1 */
    public ColorStateList f747R1;

    /* renamed from: S1 */
    public ColorStateList f748S1;

    /* renamed from: T1 */
    public boolean f749T1;

    /* renamed from: U1 */
    public boolean f750U1;

    /* renamed from: V1 */
    public final ArrayList<View> f751V1;

    /* renamed from: W1 */
    public final ArrayList<View> f752W1;

    /* renamed from: X1 */
    public final int[] f753X1;

    /* renamed from: Y1 */
    public final C0922h f754Y1;

    /* renamed from: Z1 */
    public ArrayList<MenuItem> f755Z1;

    /* renamed from: a2 */
    public InterfaceC0207h f756a2;

    /* renamed from: b2 */
    public final C0200a f757b2;

    /* renamed from: c */
    public ActionMenuView f758c;

    /* renamed from: c2 */
    public C0242k1 f759c2;

    /* renamed from: d2 */
    public C0216c f760d2;

    /* renamed from: e */
    public AppCompatTextView f761e;

    /* renamed from: e2 */
    public C0205f f762e2;

    /* renamed from: f2 */
    public InterfaceC0163j.a f763f2;

    /* renamed from: g2 */
    public C0159f.a f764g2;

    /* renamed from: h2 */
    public boolean f765h2;

    /* renamed from: i2 */
    public OnBackInvokedCallback f766i2;

    /* renamed from: j2 */
    public OnBackInvokedDispatcher f767j2;

    /* renamed from: k2 */
    public boolean f768k2;

    /* renamed from: l2 */
    public final RunnableC0201b f769l2;

    /* renamed from: m */
    public AppCompatTextView f770m;

    /* renamed from: s */
    public C0252o f771s;

    /* renamed from: w1 */
    public AppCompatImageView f772w1;

    /* renamed from: x1 */
    public final Drawable f773x1;

    /* renamed from: y1 */
    public final CharSequence f774y1;

    /* renamed from: z1 */
    public C0252o f775z1;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0200a implements ActionMenuView.InterfaceC0177e {
        public C0200a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0201b implements Runnable {
        public RunnableC0201b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0216c c0216c;
            ActionMenuView actionMenuView = Toolbar.this.f758c;
            if (actionMenuView == null || (c0216c = actionMenuView.f625L1) == null) {
                return;
            }
            c0216c.m699n();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0202c implements C0159f.a {
        public C0202c() {
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: a */
        public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
            C0159f.a aVar = Toolbar.this.f764g2;
            return aVar != null && aVar.mo548a(c0159f, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0159f.a
        /* renamed from: b */
        public final void mo549b(C0159f c0159f) {
            Toolbar toolbar = Toolbar.this;
            C0216c c0216c = toolbar.f758c.f625L1;
            if (!(c0216c != null && c0216c.m698h())) {
                Iterator<InterfaceC0926j> it = toolbar.f754Y1.f4800a.iterator();
                while (it.hasNext()) {
                    it.next().m2725d();
                }
            }
            C0159f.a aVar = toolbar.f764g2;
            if (aVar != null) {
                aVar.mo549b(c0159f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class ViewOnClickListenerC0203d implements View.OnClickListener {
        public ViewOnClickListenerC0203d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0205f c0205f = Toolbar.this.f762e2;
            C0161h c0161h = c0205f == null ? null : c0205f.f781e;
            if (c0161h != null) {
                c0161h.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0204e {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m641a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m642b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0565s(1, runnable);
        }

        /* renamed from: c */
        public static void m643c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: d */
        public static void m644d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C0205f implements InterfaceC0163j {

        /* renamed from: c */
        public C0159f f780c;

        /* renamed from: e */
        public C0161h f781e;

        public C0205f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: b */
        public final void mo501b(C0159f c0159f, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: d */
        public final boolean mo497d(C0161h c0161h) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f730A1;
            if (callback instanceof InterfaceC1184b) {
                ((InterfaceC1184b) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f730A1);
            toolbar.removeView(toolbar.f775z1);
            toolbar.f730A1 = null;
            ArrayList<View> arrayList = toolbar.f752W1;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    arrayList.clear();
                    this.f781e = null;
                    toolbar.requestLayout();
                    c0161h.f501C = false;
                    c0161h.f515n.mo540p(false);
                    toolbar.m640s();
                    return true;
                }
                toolbar.addView(arrayList.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: e */
        public final void mo520e(Context context, C0159f c0159f) {
            C0161h c0161h;
            C0159f c0159f2 = this.f780c;
            if (c0159f2 != null && (c0161h = this.f781e) != null) {
                c0159f2.mo528d(c0161h);
            }
            this.f780c = c0159f;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: f */
        public final void mo503f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: g */
        public final void mo504g() {
            if (this.f781e != null) {
                C0159f c0159f = this.f780c;
                boolean z6 = false;
                if (c0159f != null) {
                    int size = c0159f.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        if (this.f780c.getItem(i7) == this.f781e) {
                            z6 = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (z6) {
                    return;
                }
                mo497d(this.f781e);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        public final int getId() {
            return 0;
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
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j
        /* renamed from: m */
        public final boolean mo499m(C0161h c0161h) {
            Toolbar toolbar = Toolbar.this;
            toolbar.m627c();
            ViewParent parent = toolbar.f775z1.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f775z1);
                }
                toolbar.addView(toolbar.f775z1);
            }
            View actionView = c0161h.getActionView();
            toolbar.f730A1 = actionView;
            this.f781e = c0161h;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f730A1);
                }
                C0206g c0206g = new C0206g();
                c0206g.f2699a = (toolbar.f735F1 & 112) | 8388611;
                c0206g.f783b = 2;
                toolbar.f730A1.setLayoutParams(c0206g);
                toolbar.addView(toolbar.f730A1);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((C0206g) childAt.getLayoutParams()).f783b != 2 && childAt != toolbar.f758c) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f752W1.add(childAt);
                }
            }
            toolbar.requestLayout();
            c0161h.f501C = true;
            c0161h.f515n.mo540p(false);
            KeyEvent.Callback callback = toolbar.f730A1;
            if (callback instanceof InterfaceC1184b) {
                ((InterfaceC1184b) callback).onActionViewExpanded();
            }
            toolbar.m640s();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0206g extends AbstractC0542a.a {

        /* renamed from: b */
        public int f783b;

        public C0206g() {
            this.f783b = 0;
            this.f2699a = 8388627;
        }

        public C0206g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f783b = 0;
        }

        public C0206g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f783b = 0;
        }

        public C0206g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f783b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0206g(C0206g c0206g) {
            super((AbstractC0542a.a) c0206g);
            this.f783b = 0;
            this.f783b = c0206g.f783b;
        }

        public C0206g(AbstractC0542a.a aVar) {
            super(aVar);
            this.f783b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC0207h {
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$i */
    public static class C0208i extends AbstractC1446a {
        public static final Parcelable.Creator<C0208i> CREATOR = new a();

        /* renamed from: m */
        public int f784m;

        /* renamed from: s */
        public boolean f785s;

        /* renamed from: androidx.appcompat.widget.Toolbar$i$a */
        public class a implements Parcelable.ClassLoaderCreator<C0208i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0208i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0208i[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0208i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0208i(parcel, classLoader);
            }
        }

        public C0208i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f784m = parcel.readInt();
            this.f785s = parcel.readInt() != 0;
        }

        public C0208i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f784m);
            parcel.writeInt(this.f785s ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f744O1 = 8388627;
        this.f751V1 = new ArrayList<>();
        this.f752W1 = new ArrayList<>();
        this.f753X1 = new int[2];
        this.f754Y1 = new C0922h();
        this.f755Z1 = new ArrayList<>();
        this.f757b2 = new C0200a();
        this.f769l2 = new RunnableC0201b();
        Context context2 = getContext();
        int[] iArr = R$styleable.f297y;
        C0233h1 m790m = C0233h1.m790m(context2, attributeSet, iArr, i7);
        C0946x.m2816q(this, context, iArr, attributeSet, m790m.f915b, i7);
        this.f733D1 = m790m.m799i(R$styleable.Toolbar_titleTextAppearance, 0);
        this.f734E1 = m790m.m799i(R$styleable.Toolbar_subtitleTextAppearance, 0);
        int i8 = R$styleable.Toolbar_android_gravity;
        TypedArray typedArray = m790m.f915b;
        this.f744O1 = typedArray.getInteger(i8, 8388627);
        this.f735F1 = typedArray.getInteger(R$styleable.Toolbar_buttonGravity, 48);
        int m793c = m790m.m793c(R$styleable.Toolbar_titleMargin, 0);
        int i9 = R$styleable.Toolbar_titleMargins;
        m793c = m790m.m802l(i9) ? m790m.m793c(i9, m793c) : m793c;
        this.f740K1 = m793c;
        this.f739J1 = m793c;
        this.f738I1 = m793c;
        this.f737H1 = m793c;
        int m793c2 = m790m.m793c(R$styleable.Toolbar_titleMarginStart, -1);
        if (m793c2 >= 0) {
            this.f737H1 = m793c2;
        }
        int m793c3 = m790m.m793c(R$styleable.Toolbar_titleMarginEnd, -1);
        if (m793c3 >= 0) {
            this.f738I1 = m793c3;
        }
        int m793c4 = m790m.m793c(R$styleable.Toolbar_titleMarginTop, -1);
        if (m793c4 >= 0) {
            this.f739J1 = m793c4;
        }
        int m793c5 = m790m.m793c(R$styleable.Toolbar_titleMarginBottom, -1);
        if (m793c5 >= 0) {
            this.f740K1 = m793c5;
        }
        this.f736G1 = m790m.m794d(R$styleable.Toolbar_maxButtonHeight, -1);
        int m793c6 = m790m.m793c(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m793c7 = m790m.m793c(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m794d = m790m.m794d(R$styleable.Toolbar_contentInsetLeft, 0);
        int m794d2 = m790m.m794d(R$styleable.Toolbar_contentInsetRight, 0);
        if (this.f741L1 == null) {
            this.f741L1 = new C0278z0();
        }
        C0278z0 c0278z0 = this.f741L1;
        c0278z0.f1158h = false;
        if (m794d != Integer.MIN_VALUE) {
            c0278z0.f1155e = m794d;
            c0278z0.f1151a = m794d;
        }
        if (m794d2 != Integer.MIN_VALUE) {
            c0278z0.f1156f = m794d2;
            c0278z0.f1152b = m794d2;
        }
        if (m793c6 != Integer.MIN_VALUE || m793c7 != Integer.MIN_VALUE) {
            c0278z0.m929a(m793c6, m793c7);
        }
        this.f742M1 = m790m.m793c(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f743N1 = m790m.m793c(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f773x1 = m790m.m795e(R$styleable.Toolbar_collapseIcon);
        this.f774y1 = m790m.m801k(R$styleable.Toolbar_collapseContentDescription);
        CharSequence m801k = m790m.m801k(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(m801k)) {
            setTitle(m801k);
        }
        CharSequence m801k2 = m790m.m801k(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m801k2)) {
            setSubtitle(m801k2);
        }
        this.f731B1 = getContext();
        setPopupTheme(m790m.m799i(R$styleable.Toolbar_popupTheme, 0));
        Drawable m795e = m790m.m795e(R$styleable.Toolbar_navigationIcon);
        if (m795e != null) {
            setNavigationIcon(m795e);
        }
        CharSequence m801k3 = m790m.m801k(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m801k3)) {
            setNavigationContentDescription(m801k3);
        }
        Drawable m795e2 = m790m.m795e(R$styleable.Toolbar_logo);
        if (m795e2 != null) {
            setLogo(m795e2);
        }
        CharSequence m801k4 = m790m.m801k(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m801k4)) {
            setLogoDescription(m801k4);
        }
        int i10 = R$styleable.Toolbar_titleTextColor;
        if (m790m.m802l(i10)) {
            setTitleTextColor(m790m.m792b(i10));
        }
        int i11 = R$styleable.Toolbar_subtitleTextColor;
        if (m790m.m802l(i11)) {
            setSubtitleTextColor(m790m.m792b(i11));
        }
        int i12 = R$styleable.Toolbar_menu;
        if (m790m.m802l(i12)) {
            mo632k(m790m.m799i(i12, 0));
        }
        m790m.m803n();
    }

    /* renamed from: g */
    public static C0206g m622g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0206g ? new C0206g((C0206g) layoutParams) : layoutParams instanceof AbstractC0542a.a ? new C0206g((AbstractC0542a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0206g((ViewGroup.MarginLayoutParams) layoutParams) : new C0206g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1188f(getContext());
    }

    /* renamed from: i */
    public static int m623i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0920g.m2696b(marginLayoutParams) + C0920g.m2697c(marginLayoutParams);
    }

    /* renamed from: j */
    public static int m624j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m625a(int i7, ArrayList arrayList) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z6 = C0946x.e.m2847d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(this));
        arrayList.clear();
        if (!z6) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                C0206g c0206g = (C0206g) childAt.getLayoutParams();
                if (c0206g.f783b == 0 && m639r(childAt)) {
                    int i9 = c0206g.f2699a;
                    WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                    int m2847d = C0946x.e.m2847d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, m2847d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = m2847d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            C0206g c0206g2 = (C0206g) childAt2.getLayoutParams();
            if (c0206g2.f783b == 0 && m639r(childAt2)) {
                int i11 = c0206g2.f2699a;
                WeakHashMap<View, C0923h0> weakHashMap3 = C0946x.f4876a;
                int m2847d2 = C0946x.e.m2847d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, m2847d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = m2847d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m626b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0206g c0206g = layoutParams == null ? new C0206g() : !checkLayoutParams(layoutParams) ? m622g(layoutParams) : (C0206g) layoutParams;
        c0206g.f783b = 1;
        if (!z6 || this.f730A1 == null) {
            addView(view, c0206g);
        } else {
            view.setLayoutParams(c0206g);
            this.f752W1.add(view);
        }
    }

    /* renamed from: c */
    public final void m627c() {
        if (this.f775z1 == null) {
            C0252o c0252o = new C0252o(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            this.f775z1 = c0252o;
            c0252o.setImageDrawable(this.f773x1);
            this.f775z1.setContentDescription(this.f774y1);
            C0206g c0206g = new C0206g();
            c0206g.f2699a = (this.f735F1 & 112) | 8388611;
            c0206g.f783b = 2;
            this.f775z1.setLayoutParams(c0206g);
            this.f775z1.setOnClickListener(new ViewOnClickListenerC0203d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0206g);
    }

    /* renamed from: d */
    public final void m628d() {
        m629e();
        ActionMenuView actionMenuView = this.f758c;
        if (actionMenuView.f621H1 == null) {
            C0159f c0159f = (C0159f) actionMenuView.getMenu();
            if (this.f762e2 == null) {
                this.f762e2 = new C0205f();
            }
            this.f758c.setExpandedActionViewsExclusive(true);
            c0159f.m526b(this.f762e2, this.f731B1);
            m640s();
        }
    }

    /* renamed from: e */
    public final void m629e() {
        if (this.f758c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f758c = actionMenuView;
            actionMenuView.setPopupTheme(this.f732C1);
            this.f758c.setOnMenuItemClickListener(this.f757b2);
            ActionMenuView actionMenuView2 = this.f758c;
            InterfaceC0163j.a aVar = this.f763f2;
            C0202c c0202c = new C0202c();
            actionMenuView2.f626M1 = aVar;
            actionMenuView2.f627N1 = c0202c;
            C0206g c0206g = new C0206g();
            c0206g.f2699a = (this.f735F1 & 112) | 8388613;
            this.f758c.setLayoutParams(c0206g);
            m626b(this.f758c, false);
        }
    }

    /* renamed from: f */
    public final void m630f() {
        if (this.f771s == null) {
            this.f771s = new C0252o(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            C0206g c0206g = new C0206g();
            c0206g.f2699a = (this.f735F1 & 112) | 8388611;
            this.f771s.setLayoutParams(c0206g);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0206g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0206g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m622g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0252o c0252o = this.f775z1;
        if (c0252o != null) {
            return c0252o.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0252o c0252o = this.f775z1;
        if (c0252o != null) {
            return c0252o.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0278z0 c0278z0 = this.f741L1;
        if (c0278z0 != null) {
            return c0278z0.f1157g ? c0278z0.f1151a : c0278z0.f1152b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f743N1;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0278z0 c0278z0 = this.f741L1;
        if (c0278z0 != null) {
            return c0278z0.f1151a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0278z0 c0278z0 = this.f741L1;
        if (c0278z0 != null) {
            return c0278z0.f1152b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0278z0 c0278z0 = this.f741L1;
        if (c0278z0 != null) {
            return c0278z0.f1157g ? c0278z0.f1152b : c0278z0.f1151a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f742M1;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0159f c0159f;
        ActionMenuView actionMenuView = this.f758c;
        return actionMenuView != null && (c0159f = actionMenuView.f621H1) != null && c0159f.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f743N1, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2847d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2847d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f742M1, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f772w1;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f772w1;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m628d();
        return this.f758c.getMenu();
    }

    public View getNavButtonView() {
        return this.f771s;
    }

    public CharSequence getNavigationContentDescription() {
        C0252o c0252o = this.f771s;
        if (c0252o != null) {
            return c0252o.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0252o c0252o = this.f771s;
        if (c0252o != null) {
            return c0252o.getDrawable();
        }
        return null;
    }

    public C0216c getOuterActionMenuPresenter() {
        return this.f760d2;
    }

    public Drawable getOverflowIcon() {
        m628d();
        return this.f758c.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f731B1;
    }

    public int getPopupTheme() {
        return this.f732C1;
    }

    public CharSequence getSubtitle() {
        return this.f746Q1;
    }

    public final TextView getSubtitleTextView() {
        return this.f770m;
    }

    public CharSequence getTitle() {
        return this.f745P1;
    }

    public int getTitleMarginBottom() {
        return this.f740K1;
    }

    public int getTitleMarginEnd() {
        return this.f738I1;
    }

    public int getTitleMarginStart() {
        return this.f737H1;
    }

    public int getTitleMarginTop() {
        return this.f739J1;
    }

    public final TextView getTitleTextView() {
        return this.f761e;
    }

    public InterfaceC0241k0 getWrapper() {
        if (this.f759c2 == null) {
            this.f759c2 = new C0242k1(this, true);
        }
        return this.f759c2;
    }

    /* renamed from: h */
    public final int m631h(View view, int i7) {
        C0206g c0206g = (C0206g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i9 = c0206g.f2699a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f744O1 & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0206g).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) c0206g).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) c0206g).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    /* renamed from: k */
    public void mo632k(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    /* renamed from: l */
    public final void m633l() {
        Iterator<MenuItem> it = this.f755Z1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator<InterfaceC0926j> it2 = this.f754Y1.f4800a.iterator();
        while (it2.hasNext()) {
            it2.next().m2723b();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f755Z1 = currentMenuItems2;
    }

    /* renamed from: m */
    public final boolean m634m(View view) {
        return view.getParent() == this || this.f752W1.contains(view);
    }

    /* renamed from: n */
    public final int m635n(View view, int i7, int i8, int[] iArr) {
        C0206g c0206g = (C0206g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c0206g).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int m631h = m631h(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m631h, max + measuredWidth, view.getMeasuredHeight() + m631h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0206g).rightMargin + max;
    }

    /* renamed from: o */
    public final int m636o(View view, int i7, int i8, int[] iArr) {
        C0206g c0206g = (C0206g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c0206g).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int m631h = m631h(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m631h, max, view.getMeasuredHeight() + m631h);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0206g).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m640s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f769l2);
        m640s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f750U1 = false;
        }
        if (!this.f750U1) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f750U1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f750U1 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0288 A[LOOP:0: B:45:0x0286->B:46:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a4 A[LOOP:1: B:49:0x02a2->B:50:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c3 A[LOOP:2: B:53:0x02c1->B:54:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0311 A[LOOP:3: B:62:0x030f->B:63:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0208i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0208i c0208i = (C0208i) parcelable;
        super.onRestoreInstanceState(c0208i.f6946c);
        ActionMenuView actionMenuView = this.f758c;
        C0159f c0159f = actionMenuView != null ? actionMenuView.f621H1 : null;
        int i7 = c0208i.f784m;
        if (i7 != 0 && this.f762e2 != null && c0159f != null && (findItem = c0159f.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (c0208i.f785s) {
            RunnableC0201b runnableC0201b = this.f769l2;
            removeCallbacks(runnableC0201b);
            post(runnableC0201b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.z0 r0 = r2.f741L1
            if (r0 != 0) goto Le
            androidx.appcompat.widget.z0 r0 = new androidx.appcompat.widget.z0
            r0.<init>()
            r2.f741L1 = r0
        Le:
            androidx.appcompat.widget.z0 r0 = r2.f741L1
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f1157g
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f1157g = r1
            boolean r3 = r0.f1158h
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f1154d
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f1155e
        L2b:
            r0.f1151a = r1
            int r1 = r0.f1153c
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f1153c
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f1155e
        L39:
            r0.f1151a = r1
            int r1 = r0.f1154d
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f1155e
            r0.f1151a = r3
        L44:
            int r1 = r0.f1156f
        L46:
            r0.f1152b = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0161h c0161h;
        C0208i c0208i = new C0208i(super.onSaveInstanceState());
        C0205f c0205f = this.f762e2;
        if (c0205f != null && (c0161h = c0205f.f781e) != null) {
            c0208i.f784m = c0161h.f502a;
        }
        ActionMenuView actionMenuView = this.f758c;
        boolean z6 = false;
        if (actionMenuView != null) {
            C0216c c0216c = actionMenuView.f625L1;
            if (c0216c != null && c0216c.m698h()) {
                z6 = true;
            }
        }
        c0208i.f785s = z6;
        return c0208i;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f749T1 = false;
        }
        if (!this.f749T1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f749T1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f749T1 = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m637p(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: q */
    public final void m638q(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: r */
    public final boolean m639r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: s */
    final void m640s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m641a = C0204e.m641a(this);
            C0205f c0205f = this.f762e2;
            boolean z6 = false;
            if (((c0205f == null || c0205f.f781e == null) ? false : true) && m641a != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (C0946x.g.m2859b(this) && this.f768k2) {
                    z6 = true;
                }
            }
            if (z6 && this.f767j2 == null) {
                if (this.f766i2 == null) {
                    this.f766i2 = C0204e.m642b(new RunnableC0123h(1, this));
                }
                C0204e.m643c(m641a, this.f766i2);
            } else {
                if (z6 || (onBackInvokedDispatcher = this.f767j2) == null) {
                    return;
                }
                C0204e.m644d(onBackInvokedDispatcher, this.f766i2);
                m641a = null;
            }
            this.f767j2 = m641a;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f768k2 != z6) {
            this.f768k2 = z6;
            m640s();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m627c();
        }
        C0252o c0252o = this.f775z1;
        if (c0252o != null) {
            c0252o.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(C0872a.m2561a(getContext(), i7));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m627c();
            this.f775z1.setImageDrawable(drawable);
        } else {
            C0252o c0252o = this.f775z1;
            if (c0252o != null) {
                c0252o.setImageDrawable(this.f773x1);
            }
        }
    }

    public void setCollapsible(boolean z6) {
        this.f765h2 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f743N1) {
            this.f743N1 = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f742M1) {
            this.f742M1 = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(C0872a.m2561a(getContext(), i7));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f772w1 == null) {
                this.f772w1 = new AppCompatImageView(getContext(), null);
            }
            if (!m634m(this.f772w1)) {
                m626b(this.f772w1, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f772w1;
            if (appCompatImageView != null && m634m(appCompatImageView)) {
                removeView(this.f772w1);
                this.f752W1.remove(this.f772w1);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f772w1;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f772w1 == null) {
            this.f772w1 = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f772w1;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m630f();
        }
        C0252o c0252o = this.f771s;
        if (c0252o != null) {
            c0252o.setContentDescription(charSequence);
            C0245l1.m845a(this.f771s, charSequence);
        }
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(C0872a.m2561a(getContext(), i7));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m630f();
            if (!m634m(this.f771s)) {
                m626b(this.f771s, true);
            }
        } else {
            C0252o c0252o = this.f771s;
            if (c0252o != null && m634m(c0252o)) {
                removeView(this.f771s);
                this.f752W1.remove(this.f771s);
            }
        }
        C0252o c0252o2 = this.f771s;
        if (c0252o2 != null) {
            c0252o2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m630f();
        this.f771s.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0207h interfaceC0207h) {
        this.f756a2 = interfaceC0207h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m628d();
        this.f758c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f732C1 != i7) {
            this.f732C1 = i7;
            if (i7 == 0) {
                this.f731B1 = getContext();
            } else {
                this.f731B1 = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f770m;
            if (appCompatTextView != null && m634m(appCompatTextView)) {
                removeView(this.f770m);
                this.f752W1.remove(this.f770m);
            }
        } else {
            if (this.f770m == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f770m = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f770m.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f734E1;
                if (i7 != 0) {
                    this.f770m.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f748S1;
                if (colorStateList != null) {
                    this.f770m.setTextColor(colorStateList);
                }
            }
            if (!m634m(this.f770m)) {
                m626b(this.f770m, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f770m;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f746Q1 = charSequence;
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f748S1 = colorStateList;
        AppCompatTextView appCompatTextView = this.f770m;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f761e;
            if (appCompatTextView != null && m634m(appCompatTextView)) {
                removeView(this.f761e);
                this.f752W1.remove(this.f761e);
            }
        } else {
            if (this.f761e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f761e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f761e.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f733D1;
                if (i7 != 0) {
                    this.f761e.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f747R1;
                if (colorStateList != null) {
                    this.f761e.setTextColor(colorStateList);
                }
            }
            if (!m634m(this.f761e)) {
                m626b(this.f761e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f761e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f745P1 = charSequence;
    }

    public void setTitleMarginBottom(int i7) {
        this.f740K1 = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f738I1 = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f737H1 = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f739J1 = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f747R1 = colorStateList;
        AppCompatTextView appCompatTextView = this.f761e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
