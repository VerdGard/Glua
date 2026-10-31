package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.view.menu.InterfaceC0163j;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p057h.AbstractC1270d;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public class C0162i {

    /* renamed from: a */
    public final Context f529a;

    /* renamed from: b */
    public final C0159f f530b;

    /* renamed from: c */
    public final boolean f531c;

    /* renamed from: d */
    public final int f532d;

    /* renamed from: e */
    public final int f533e;

    /* renamed from: f */
    public View f534f;

    /* renamed from: g */
    public int f535g;

    /* renamed from: h */
    public boolean f536h;

    /* renamed from: i */
    public InterfaceC0163j.a f537i;

    /* renamed from: j */
    public AbstractC1270d f538j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f539k;

    /* renamed from: l */
    public final a f540l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C0162i.this.mo562c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$b */
    public static class b {
        /* renamed from: a */
        public static void m564a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0162i(int i7, int i8, Context context, View view, C0159f c0159f, boolean z6) {
        this.f535g = 8388611;
        this.f540l = new a();
        this.f529a = context;
        this.f530b = c0159f;
        this.f534f = view;
        this.f531c = z6;
        this.f532d = i7;
        this.f533e = i8;
    }

    public C0162i(Context context, C0159f c0159f, View view, boolean z6, int i7) {
        this(i7, 0, context, view, c0159f, z6);
    }

    /* renamed from: a */
    public final AbstractC1270d m560a() {
        AbstractC1270d viewOnKeyListenerC0165l;
        if (this.f538j == null) {
            Context context = this.f529a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.m564a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0165l = new ViewOnKeyListenerC0155b(this.f529a, this.f534f, this.f532d, this.f533e, this.f531c);
            } else {
                viewOnKeyListenerC0165l = new ViewOnKeyListenerC0165l(this.f532d, this.f533e, this.f529a, this.f534f, this.f530b, this.f531c);
            }
            viewOnKeyListenerC0165l.mo509n(this.f530b);
            viewOnKeyListenerC0165l.mo514t(this.f540l);
            viewOnKeyListenerC0165l.mo510p(this.f534f);
            viewOnKeyListenerC0165l.mo498l(this.f537i);
            viewOnKeyListenerC0165l.mo511q(this.f536h);
            viewOnKeyListenerC0165l.mo512r(this.f535g);
            this.f538j = viewOnKeyListenerC0165l;
        }
        return this.f538j;
    }

    /* renamed from: b */
    public final boolean m561b() {
        AbstractC1270d abstractC1270d = this.f538j;
        return abstractC1270d != null && abstractC1270d.mo502c();
    }

    /* renamed from: c */
    public void mo562c() {
        this.f538j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f539k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m563d(int i7, int i8, boolean z6, boolean z7) {
        AbstractC1270d m560a = m560a();
        m560a.mo515u(z7);
        if (z6) {
            int i9 = this.f535g;
            View view = this.f534f;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if ((Gravity.getAbsoluteGravity(i9, C0946x.e.m2847d(view)) & 7) == 5) {
                i7 -= this.f534f.getWidth();
            }
            m560a.mo513s(i7);
            m560a.mo516v(i8);
            int i10 = (int) ((this.f529a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m560a.f6346c = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        m560a.mo500a();
    }
}
