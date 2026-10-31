package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.widget.C0247m0;
import androidx.appcompat.widget.C0261r;
import androidx.appcompat.widget.C0266t0;
import p057h.AbstractC1270d;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0165l extends AbstractC1270d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: K1 */
    public static final int f542K1 = R$layout.abc_popup_menu_item_layout;

    /* renamed from: A1 */
    public PopupWindow.OnDismissListener f543A1;

    /* renamed from: B1 */
    public View f544B1;

    /* renamed from: C1 */
    public View f545C1;

    /* renamed from: D1 */
    public InterfaceC0163j.a f546D1;

    /* renamed from: E1 */
    public ViewTreeObserver f547E1;

    /* renamed from: F1 */
    public boolean f548F1;

    /* renamed from: G1 */
    public boolean f549G1;

    /* renamed from: H1 */
    public int f550H1;

    /* renamed from: J1 */
    public boolean f552J1;

    /* renamed from: X */
    public final boolean f553X;

    /* renamed from: Y */
    public final int f554Y;

    /* renamed from: Z */
    public final int f555Z;

    /* renamed from: e */
    public final Context f556e;

    /* renamed from: m */
    public final C0159f f557m;

    /* renamed from: s */
    public final C0158e f558s;

    /* renamed from: w1 */
    public final int f559w1;

    /* renamed from: x1 */
    public final C0266t0 f560x1;

    /* renamed from: y1 */
    public final a f561y1 = new a();

    /* renamed from: z1 */
    public final b f562z1 = new b();

    /* renamed from: I1 */
    public int f551I1 = 0;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC0165l viewOnKeyListenerC0165l = ViewOnKeyListenerC0165l.this;
            if (!viewOnKeyListenerC0165l.mo502c() || viewOnKeyListenerC0165l.f560x1.f1070N1) {
                return;
            }
            View view = viewOnKeyListenerC0165l.f545C1;
            if (view == null || !view.isShown()) {
                viewOnKeyListenerC0165l.dismiss();
            } else {
                viewOnKeyListenerC0165l.f560x1.mo500a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC0165l viewOnKeyListenerC0165l = ViewOnKeyListenerC0165l.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0165l.f547E1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0165l.f547E1 = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0165l.f547E1.removeGlobalOnLayoutListener(viewOnKeyListenerC0165l.f561y1);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0165l(int i7, int i8, Context context, View view, C0159f c0159f, boolean z6) {
        this.f556e = context;
        this.f557m = c0159f;
        this.f553X = z6;
        this.f558s = new C0158e(c0159f, LayoutInflater.from(context), z6, f542K1);
        this.f555Z = i7;
        this.f559w1 = i8;
        Resources resources = context.getResources();
        this.f554Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f544B1 = view;
        this.f560x1 = new C0266t0(context, i7, i8);
        c0159f.m526b(this, context);
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: a */
    public final void mo500a() {
        View view;
        boolean z6 = true;
        if (!mo502c()) {
            if (this.f548F1 || (view = this.f544B1) == null) {
                z6 = false;
            } else {
                this.f545C1 = view;
                C0266t0 c0266t0 = this.f560x1;
                c0266t0.f1071O1.setOnDismissListener(this);
                c0266t0.f1061E1 = this;
                c0266t0.f1070N1 = true;
                C0261r c0261r = c0266t0.f1071O1;
                c0261r.setFocusable(true);
                View view2 = this.f545C1;
                boolean z7 = this.f547E1 == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f547E1 = viewTreeObserver;
                if (z7) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f561y1);
                }
                view2.addOnAttachStateChangeListener(this.f562z1);
                c0266t0.f1060D1 = view2;
                c0266t0.f1057A1 = this.f551I1;
                boolean z8 = this.f549G1;
                Context context = this.f556e;
                C0158e c0158e = this.f558s;
                if (!z8) {
                    this.f550H1 = AbstractC1270d.m3582o(c0158e, context, this.f554Y);
                    this.f549G1 = true;
                }
                c0266t0.m882r(this.f550H1);
                c0261r.setInputMethodMode(2);
                Rect rect = this.f6346c;
                c0266t0.f1069M1 = rect != null ? new Rect(rect) : null;
                c0266t0.mo500a();
                C0247m0 c0247m0 = c0266t0.f1077m;
                c0247m0.setOnKeyListener(this);
                if (this.f552J1) {
                    C0159f c0159f = this.f557m;
                    if (c0159f.f484m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) c0247m0, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(c0159f.f484m);
                        }
                        frameLayout.setEnabled(false);
                        c0247m0.addHeaderView(frameLayout, null, false);
                    }
                }
                c0266t0.mo880p(c0158e);
                c0266t0.mo500a();
            }
        }
        if (!z6) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: b */
    public final void mo501b(C0159f c0159f, boolean z6) {
        if (c0159f != this.f557m) {
            return;
        }
        dismiss();
        InterfaceC0163j.a aVar = this.f546D1;
        if (aVar != null) {
            aVar.mo550b(c0159f, z6);
        }
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: c */
    public final boolean mo502c() {
        return !this.f548F1 && this.f560x1.mo502c();
    }

    @Override // p057h.InterfaceC1272f
    public final void dismiss() {
        if (mo502c()) {
            this.f560x1.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: f */
    public final void mo503f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: g */
    public final void mo504g() {
        this.f549G1 = false;
        C0158e c0158e = this.f558s;
        if (c0158e != null) {
            c0158e.notifyDataSetChanged();
        }
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: h */
    public final C0247m0 mo505h() {
        return this.f560x1.f1077m;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo506i(androidx.appcompat.view.menu.SubMenuC0166m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f556e
            android.view.View r6 = r9.f545C1
            boolean r8 = r9.f553X
            int r3 = r9.f555Z
            int r4 = r9.f559w1
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f546D1
            r0.f537i = r2
            h.d r3 = r0.f538j
            if (r3 == 0) goto L23
            r3.mo498l(r2)
        L23:
            boolean r2 = p057h.AbstractC1270d.m3583w(r10)
            r0.f536h = r2
            h.d r3 = r0.f538j
            if (r3 == 0) goto L30
            r3.mo511q(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f543A1
            r0.f539k = r2
            r2 = 0
            r9.f543A1 = r2
            androidx.appcompat.view.menu.f r2 = r9.f557m
            r2.m527c(r1)
            androidx.appcompat.widget.t0 r2 = r9.f560x1
            int r3 = r2.f1073Y
            int r2 = r2.m879n()
            int r4 = r9.f551I1
            android.view.View r5 = r9.f544B1
            java.util.WeakHashMap<android.view.View, e0.h0> r6 = p034e0.C0946x.f4876a
            int r5 = p034e0.C0946x.e.m2847d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f544B1
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.m561b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f534f
            if (r4 != 0) goto L6c
            r0 = 0
            goto L70
        L6c:
            r0.m563d(r3, r2, r5, r5)
        L6f:
            r0 = 1
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.j$a r0 = r9.f546D1
            if (r0 == 0) goto L79
            r0.mo551c(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ViewOnKeyListenerC0165l.mo506i(androidx.appcompat.view.menu.m):boolean");
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
        this.f546D1 = aVar;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: n */
    public final void mo509n(C0159f c0159f) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f548F1 = true;
        this.f557m.m527c(true);
        ViewTreeObserver viewTreeObserver = this.f547E1;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f547E1 = this.f545C1.getViewTreeObserver();
            }
            this.f547E1.removeGlobalOnLayoutListener(this.f561y1);
            this.f547E1 = null;
        }
        this.f545C1.removeOnAttachStateChangeListener(this.f562z1);
        PopupWindow.OnDismissListener onDismissListener = this.f543A1;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f544B1 = view;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: q */
    public final void mo511q(boolean z6) {
        this.f558s.f469m = z6;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: r */
    public final void mo512r(int i7) {
        this.f551I1 = i7;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: s */
    public final void mo513s(int i7) {
        this.f560x1.f1073Y = i7;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: t */
    public final void mo514t(PopupWindow.OnDismissListener onDismissListener) {
        this.f543A1 = onDismissListener;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: u */
    public final void mo515u(boolean z6) {
        this.f552J1 = z6;
    }

    @Override // p057h.AbstractC1270d
    /* renamed from: v */
    public final void mo516v(int i7) {
        this.f560x1.m877j(i7);
    }
}
