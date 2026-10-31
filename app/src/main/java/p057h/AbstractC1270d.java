package p057h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0158e;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.C0161h;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.view.menu.ViewOnKeyListenerC0155b;

/* renamed from: h.d */
/* loaded from: classes.dex */
public abstract class AbstractC1270d implements InterfaceC1272f, InterfaceC0163j, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public Rect f6346c;

    /* renamed from: o */
    public static int m3582o(C0158e c0158e, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0158e.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = c0158e.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0158e.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    /* renamed from: w */
    public static boolean m3583w(C0159f c0159f) {
        int size = c0159f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = c0159f.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: d */
    public final boolean mo497d(C0161h c0161h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: e */
    public final void mo520e(Context context, C0159f c0159f) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0163j
    /* renamed from: m */
    public final boolean mo499m(C0161h c0161h) {
        return false;
    }

    /* renamed from: n */
    public abstract void mo509n(C0159f c0159f);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0158e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0158e) listAdapter).f467c.m541q((MenuItem) listAdapter.getItem(i7), this, (this instanceof ViewOnKeyListenerC0155b) ^ true ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo510p(View view);

    /* renamed from: q */
    public abstract void mo511q(boolean z6);

    /* renamed from: r */
    public abstract void mo512r(int i7);

    /* renamed from: s */
    public abstract void mo513s(int i7);

    /* renamed from: t */
    public abstract void mo514t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo515u(boolean z6);

    /* renamed from: v */
    public abstract void mo516v(int i7);
}
