package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.widget.C0247m0;
import androidx.appcompat.widget.C0261r;
import androidx.appcompat.widget.C0266t0;
import androidx.appcompat.widget.InterfaceC0264s0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p057h.AbstractC1270d;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0155b extends AbstractC1270d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: Q1 */
    public static final int f419Q1 = R$layout.abc_cascading_menu_item_layout;

    /* renamed from: D1 */
    public View f423D1;

    /* renamed from: E1 */
    public View f424E1;

    /* renamed from: F1 */
    public int f425F1;

    /* renamed from: G1 */
    public boolean f426G1;

    /* renamed from: H1 */
    public boolean f427H1;

    /* renamed from: I1 */
    public int f428I1;

    /* renamed from: J1 */
    public int f429J1;

    /* renamed from: L1 */
    public boolean f431L1;

    /* renamed from: M1 */
    public InterfaceC0163j.a f432M1;

    /* renamed from: N1 */
    public ViewTreeObserver f433N1;

    /* renamed from: O1 */
    public PopupWindow.OnDismissListener f434O1;

    /* renamed from: P1 */
    public boolean f435P1;

    /* renamed from: X */
    public final int f436X;

    /* renamed from: Y */
    public final boolean f437Y;

    /* renamed from: Z */
    public final Handler f438Z;

    /* renamed from: e */
    public final Context f439e;

    /* renamed from: m */
    public final int f440m;

    /* renamed from: s */
    public final int f441s;

    /* renamed from: w1 */
    public final ArrayList f442w1 = new ArrayList();

    /* renamed from: x1 */
    public final ArrayList f443x1 = new ArrayList();

    /* renamed from: y1 */
    public final a f444y1 = new a();

    /* renamed from: z1 */
    public final b f445z1 = new b();

    /* renamed from: A1 */
    public final c f420A1 = new c();

    /* renamed from: B1 */
    public int f421B1 = 0;

    /* renamed from: C1 */
    public int f422C1 = 0;

    /* renamed from: K1 */
    public boolean f430K1 = false;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC0155b viewOnKeyListenerC0155b = ViewOnKeyListenerC0155b.this;
            if (viewOnKeyListenerC0155b.mo502c()) {
                ArrayList arrayList = viewOnKeyListenerC0155b.f443x1;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f449a.f1070N1) {
                    return;
                }
                View view = viewOnKeyListenerC0155b.f424E1;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC0155b.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f449a.mo500a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC0155b viewOnKeyListenerC0155b = ViewOnKeyListenerC0155b.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0155b.f433N1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0155b.f433N1 = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0155b.f433N1.removeGlobalOnLayoutListener(viewOnKeyListenerC0155b.f444y1);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements InterfaceC0264s0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0264s0
        /* renamed from: b */
        public final void mo518b(C0159f c0159f, MenuItem menuItem) {
            ViewOnKeyListenerC0155b.this.f438Z.removeCallbacksAndMessages(c0159f);
        }

        @Override // androidx.appcompat.widget.InterfaceC0264s0
        /* renamed from: e */
        public final void mo519e(C0159f c0159f, C0161h c0161h) {
            ViewOnKeyListenerC0155b viewOnKeyListenerC0155b = ViewOnKeyListenerC0155b.this;
            viewOnKeyListenerC0155b.f438Z.removeCallbacksAndMessages(null);
            ArrayList arrayList = viewOnKeyListenerC0155b.f443x1;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (c0159f == ((d) arrayList.get(i7)).f450b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            viewOnKeyListenerC0155b.f438Z.postAtTime(new RunnableC0156c(this, i8 < arrayList.size() ? (d) arrayList.get(i8) : null, c0161h, c0159f), c0159f, SystemClock.uptimeMillis() + 200);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* renamed from: a */
        public final C0266t0 f449a;

        /* renamed from: b */
        public final C0159f f450b;

        /* renamed from: c */
        public final int f451c;

        public d(C0266t0 c0266t0, C0159f c0159f, int i7) {
            this.f449a = c0266t0;
            this.f450b = c0159f;
            this.f451c = i7;
        }
    }

    public ViewOnKeyListenerC0155b(Context context, View view, int i7, int i8, boolean z6) {
        this.f439e = context;
        this.f423D1 = view;
        this.f441s = i7;
        this.f436X = i8;
        this.f437Y = z6;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        this.f425F1 = C0946x.e.m2847d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f440m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f438Z = new Handler();
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: a */
    public final void mo500a() {
        if (mo502c()) {
            return;
        }
        ArrayList arrayList = this.f442w1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m517x((C0159f) it.next());
        }
        arrayList.clear();
        View view = this.f423D1;
        this.f424E1 = view;
        if (view != null) {
            boolean z6 = this.f433N1 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f433N1 = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f444y1);
            }
            this.f424E1.addOnAttachStateChangeListener(this.f445z1);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: b */
    public final void mo501b(C0159f c0159f, boolean z6) {
        int i7;
        ArrayList arrayList = this.f443x1;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (c0159f == ((d) arrayList.get(i8)).f450b) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0) {
            return;
        }
        int i9 = i8 + 1;
        if (i9 < arrayList.size()) {
            ((d) arrayList.get(i9)).f450b.m527c(false);
        }
        d dVar = (d) arrayList.remove(i8);
        dVar.f450b.m542r(this);
        boolean z7 = this.f435P1;
        C0266t0 c0266t0 = dVar.f449a;
        if (z7) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0266t0.a.m889b(c0266t0.f1071O1, null);
            } else {
                c0266t0.getClass();
            }
            c0266t0.f1071O1.setAnimationStyle(0);
        }
        c0266t0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i7 = ((d) arrayList.get(size2 - 1)).f451c;
        } else {
            View view = this.f423D1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            i7 = C0946x.e.m2847d(view) == 1 ? 0 : 1;
        }
        this.f425F1 = i7;
        if (size2 != 0) {
            if (z6) {
                ((d) arrayList.get(0)).f450b.m527c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0163j.a aVar = this.f432M1;
        if (aVar != null) {
            aVar.mo550b(c0159f, true);
        }
        ViewTreeObserver viewTreeObserver = this.f433N1;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f433N1.removeGlobalOnLayoutListener(this.f444y1);
            }
            this.f433N1 = null;
        }
        this.f424E1.removeOnAttachStateChangeListener(this.f445z1);
        this.f434O1.onDismiss();
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: c */
    public final boolean mo502c() {
        ArrayList arrayList = this.f443x1;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f449a.mo502c();
    }

    @Override // p057h.InterfaceC1272f
    public final void dismiss() {
        ArrayList arrayList = this.f443x1;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f449a.mo502c()) {
                dVar.f449a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: f */
    public final void mo503f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: g */
    public final void mo504g() {
        Iterator it = this.f443x1.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f449a.f1077m.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0158e) adapter).notifyDataSetChanged();
        }
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: h */
    public final C0247m0 mo505h() {
        ArrayList arrayList = this.f443x1;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f449a.f1077m;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: i */
    public final boolean mo506i(SubMenuC0166m subMenuC0166m) {
        Iterator it = this.f443x1.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (subMenuC0166m == dVar.f450b) {
                dVar.f449a.f1077m.requestFocus();
                return true;
            }
        }
        if (!subMenuC0166m.hasVisibleItems()) {
            return false;
        }
        mo509n(subMenuC0166m);
        InterfaceC0163j.a aVar = this.f432M1;
        if (aVar != null) {
            aVar.mo551c(subMenuC0166m);
        }
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
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: l */
    public final void mo498l(InterfaceC0163j.a aVar) {
        this.f432M1 = aVar;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: n */
    public final void mo509n(C0159f c0159f) {
        c0159f.m526b(this, this.f439e);
        if (mo502c()) {
            m517x(c0159f);
        } else {
            this.f442w1.add(c0159f);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f443x1;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i7);
            if (!dVar.f449a.mo502c()) {
                break;
            } else {
                i7++;
            }
        }
        if (dVar != null) {
            dVar.f450b.m527c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: p */
    public final void mo510p(View view) {
        if (this.f423D1 != view) {
            this.f423D1 = view;
            int i7 = this.f421B1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            this.f422C1 = Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(view));
        }
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: q */
    public final void mo511q(boolean z6) {
        this.f430K1 = z6;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: r */
    public final void mo512r(int i7) {
        if (this.f421B1 != i7) {
            this.f421B1 = i7;
            View view = this.f423D1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            this.f422C1 = Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(view));
        }
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: s */
    public final void mo513s(int i7) {
        this.f426G1 = true;
        this.f428I1 = i7;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: t */
    public final void mo514t(PopupWindow.OnDismissListener onDismissListener) {
        this.f434O1 = onDismissListener;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: u */
    public final void mo515u(boolean z6) {
        this.f431L1 = z6;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: v */
    public final void mo516v(int i7) {
        this.f427H1 = true;
        this.f429J1 = i7;
    }

    /* renamed from: x */
    public final void m517x(C0159f c0159f) {
        View view;
        d dVar;
        char c7;
        int i7;
        int i8;
        int width;
        MenuItem menuItem;
        C0158e c0158e;
        int i9;
        int firstVisiblePosition;
        Context context = this.f439e;
        LayoutInflater from = LayoutInflater.from(context);
        C0158e c0158e2 = new C0158e(c0159f, from, this.f437Y, f419Q1);
        if (!mo502c() && this.f430K1) {
            c0158e2.f469m = true;
        } else if (mo502c()) {
            c0158e2.f469m = AbstractC1270d.m3583w(c0159f);
        }
        int m3582o = AbstractC1270d.m3582o(c0158e2, context, this.f440m);
        C0266t0 c0266t0 = new C0266t0(context, this.f441s, this.f436X);
        c0266t0.f1096S1 = this.f420A1;
        c0266t0.f1061E1 = this;
        C0261r c0261r = c0266t0.f1071O1;
        c0261r.setOnDismissListener(this);
        c0266t0.f1060D1 = this.f423D1;
        c0266t0.f1057A1 = this.f422C1;
        c0266t0.f1070N1 = true;
        c0261r.setFocusable(true);
        c0261r.setInputMethodMode(2);
        c0266t0.mo880p(c0158e2);
        c0266t0.m882r(m3582o);
        c0266t0.f1057A1 = this.f422C1;
        ArrayList arrayList = this.f443x1;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            C0159f c0159f2 = dVar.f450b;
            int size = c0159f2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = c0159f2.getItem(i10);
                if (menuItem.hasSubMenu() && c0159f == menuItem.getSubMenu()) {
                    break;
                } else {
                    i10++;
                }
            }
            if (menuItem != null) {
                C0247m0 c0247m0 = dVar.f449a.f1077m;
                ListAdapter adapter = c0247m0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i9 = headerViewListAdapter.getHeadersCount();
                    c0158e = (C0158e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0158e = (C0158e) adapter;
                    i9 = 0;
                }
                int count = c0158e.getCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= count) {
                        i11 = -1;
                        break;
                    } else if (menuItem == c0158e.getItem(i11)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1 && (firstVisiblePosition = (i11 + i9) - c0247m0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0247m0.getChildCount()) {
                    view = c0247m0.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            dVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0266t0.f1095T1;
                if (method != null) {
                    try {
                        method.invoke(c0261r, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                C0266t0.b.m890a(c0261r, false);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23) {
                C0266t0.a.m888a(c0261r, null);
            }
            C0247m0 c0247m02 = ((d) arrayList.get(arrayList.size() - 1)).f449a.f1077m;
            int[] iArr = new int[2];
            c0247m02.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f424E1.getWindowVisibleDisplayFrame(rect);
            int i13 = (this.f425F1 != 1 ? iArr[0] - m3582o >= 0 : (c0247m02.getWidth() + iArr[0]) + m3582o > rect.right) ? 0 : 1;
            boolean z6 = i13 == 1;
            this.f425F1 = i13;
            if (i12 >= 26) {
                c0266t0.f1060D1 = view;
                i8 = 0;
                i7 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f423D1.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f422C1 & 7) == 5) {
                    c7 = 0;
                    iArr2[0] = this.f423D1.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c7 = 0;
                }
                i7 = iArr3[c7] - iArr2[c7];
                i8 = iArr3[1] - iArr2[1];
            }
            if ((this.f422C1 & 5) != 5) {
                if (z6) {
                    width = i7 + view.getWidth();
                    c0266t0.f1073Y = width;
                    c0266t0.f1082z1 = true;
                    c0266t0.f1081y1 = true;
                    c0266t0.m877j(i8);
                }
                width = i7 - m3582o;
                c0266t0.f1073Y = width;
                c0266t0.f1082z1 = true;
                c0266t0.f1081y1 = true;
                c0266t0.m877j(i8);
            } else if (z6) {
                width = i7 + m3582o;
                c0266t0.f1073Y = width;
                c0266t0.f1082z1 = true;
                c0266t0.f1081y1 = true;
                c0266t0.m877j(i8);
            } else {
                m3582o = view.getWidth();
                width = i7 - m3582o;
                c0266t0.f1073Y = width;
                c0266t0.f1082z1 = true;
                c0266t0.f1081y1 = true;
                c0266t0.m877j(i8);
            }
        } else {
            if (this.f426G1) {
                c0266t0.f1073Y = this.f428I1;
            }
            if (this.f427H1) {
                c0266t0.m877j(this.f429J1);
            }
            Rect rect2 = this.f6346c;
            c0266t0.f1069M1 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(c0266t0, c0159f, this.f425F1));
        c0266t0.mo500a();
        C0247m0 c0247m03 = c0266t0.f1077m;
        c0247m03.setOnKeyListener(this);
        if (dVar == null && this.f431L1 && c0159f.f484m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) c0247m03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0159f.f484m);
            c0247m03.addHeaderView(frameLayout, null, false);
            c0266t0.mo500a();
        }
    }
}
