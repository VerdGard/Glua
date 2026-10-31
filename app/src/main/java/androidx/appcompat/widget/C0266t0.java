package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0158e;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public final class C0266t0 extends C0262r0 implements InterfaceC0264s0 {

    /* renamed from: T1 */
    public static final Method f1095T1;

    /* renamed from: S1 */
    public InterfaceC0264s0 f1096S1;

    /* renamed from: androidx.appcompat.widget.t0$a */
    public static class a {
        /* renamed from: a */
        public static void m888a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m889b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    public static class b {
        /* renamed from: a */
        public static void m890a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setTouchModal(z6);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$c */
    public static class c extends C0247m0 {

        /* renamed from: E1 */
        public final int f1097E1;

        /* renamed from: F1 */
        public final int f1098F1;

        /* renamed from: G1 */
        public InterfaceC0264s0 f1099G1;

        /* renamed from: H1 */
        public C0161h f1100H1;

        /* renamed from: androidx.appcompat.widget.t0$c$a */
        public static class a {
            /* renamed from: a */
            public static int m891a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z6) {
            super(context, z6);
            if (1 == a.m891a(context.getResources().getConfiguration())) {
                this.f1097E1 = 21;
                this.f1098F1 = 22;
            } else {
                this.f1097E1 = 22;
                this.f1098F1 = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0247m0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            C0158e c0158e;
            int i7;
            int pointToPosition;
            int i8;
            if (this.f1099G1 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    c0158e = (C0158e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0158e = (C0158e) adapter;
                    i7 = 0;
                }
                C0161h item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= c0158e.getCount()) ? null : c0158e.getItem(i8);
                C0161h c0161h = this.f1100H1;
                if (c0161h != item) {
                    C0159f c0159f = c0158e.f467c;
                    if (c0161h != null) {
                        this.f1099G1.mo518b(c0159f, c0161h);
                    }
                    this.f1100H1 = item;
                    if (item != null) {
                        this.f1099G1.mo519e(c0159f, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f1097E1) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.f1098F1) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0158e) adapter).f467c.m527c(false);
            return true;
        }

        public void setHoverListener(InterfaceC0264s0 interfaceC0264s0) {
            this.f1099G1 = interfaceC0264s0;
        }

        @Override // androidx.appcompat.widget.C0247m0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1095T1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0266t0(Context context, int i7, int i8) {
        super(context, null, i7, i8);
    }

    @Override // androidx.appcompat.widget.InterfaceC0264s0
    /* renamed from: b */
    public final void mo518b(C0159f c0159f, MenuItem menuItem) {
        InterfaceC0264s0 interfaceC0264s0 = this.f1096S1;
        if (interfaceC0264s0 != null) {
            interfaceC0264s0.mo518b(c0159f, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0264s0
    /* renamed from: e */
    public final void mo519e(C0159f c0159f, C0161h c0161h) {
        InterfaceC0264s0 interfaceC0264s0 = this.f1096S1;
        if (interfaceC0264s0 != null) {
            interfaceC0264s0.mo519e(c0159f, c0161h);
        }
    }

    @Override // androidx.appcompat.widget.C0262r0
    /* renamed from: q */
    public final C0247m0 mo881q(Context context, boolean z6) {
        c cVar = new c(context, z6);
        cVar.setHoverListener(this);
        return cVar;
    }
}
