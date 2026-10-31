package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p057h.InterfaceC1272f;
import p066i0.C1313g;

/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: classes.dex */
public class C0262r0 implements InterfaceC1272f {

    /* renamed from: P1 */
    public static final Method f1054P1;

    /* renamed from: Q1 */
    public static final Method f1055Q1;

    /* renamed from: R1 */
    public static final Method f1056R1;

    /* renamed from: A1 */
    public int f1057A1;

    /* renamed from: B1 */
    public final int f1058B1;

    /* renamed from: C1 */
    public d f1059C1;

    /* renamed from: D1 */
    public View f1060D1;

    /* renamed from: E1 */
    public AdapterView.OnItemClickListener f1061E1;

    /* renamed from: F1 */
    public AdapterView.OnItemSelectedListener f1062F1;

    /* renamed from: G1 */
    public final g f1063G1;

    /* renamed from: H1 */
    public final f f1064H1;

    /* renamed from: I1 */
    public final e f1065I1;

    /* renamed from: J1 */
    public final c f1066J1;

    /* renamed from: K1 */
    public final Handler f1067K1;

    /* renamed from: L1 */
    public final Rect f1068L1;

    /* renamed from: M1 */
    public Rect f1069M1;

    /* renamed from: N1 */
    public boolean f1070N1;

    /* renamed from: O1 */
    public final C0261r f1071O1;

    /* renamed from: X */
    public int f1072X;

    /* renamed from: Y */
    public int f1073Y;

    /* renamed from: Z */
    public int f1074Z;

    /* renamed from: c */
    public final Context f1075c;

    /* renamed from: e */
    public ListAdapter f1076e;

    /* renamed from: m */
    public C0247m0 f1077m;

    /* renamed from: s */
    public int f1078s;

    /* renamed from: w1 */
    public final int f1079w1;

    /* renamed from: x1 */
    public boolean f1080x1;

    /* renamed from: y1 */
    public boolean f1081y1;

    /* renamed from: z1 */
    public boolean f1082z1;

    /* renamed from: androidx.appcompat.widget.r0$a */
    public static class a {
        /* renamed from: a */
        public static int m883a(PopupWindow popupWindow, View view, int i7, boolean z6) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i7, z6);
            return maxAvailableHeight;
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$b */
    public static class b {
        /* renamed from: a */
        public static void m884a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m885b(PopupWindow popupWindow, boolean z6) {
            popupWindow.setIsClippedToScreen(z6);
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0247m0 c0247m0 = C0262r0.this.f1077m;
            if (c0247m0 != null) {
                c0247m0.setListSelectionHidden(true);
                c0247m0.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0262r0 c0262r0 = C0262r0.this;
            if (c0262r0.mo502c()) {
                c0262r0.mo500a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C0262r0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 == 1) {
                C0262r0 c0262r0 = C0262r0.this;
                if ((c0262r0.f1071O1.getInputMethodMode() == 2) || c0262r0.f1071O1.getContentView() == null) {
                    return;
                }
                Handler handler = c0262r0.f1067K1;
                g gVar = c0262r0.f1063G1;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0261r c0261r;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            C0262r0 c0262r0 = C0262r0.this;
            if (action == 0 && (c0261r = c0262r0.f1071O1) != null && c0261r.isShowing() && x7 >= 0) {
                C0261r c0261r2 = c0262r0.f1071O1;
                if (x7 < c0261r2.getWidth() && y7 >= 0 && y7 < c0261r2.getHeight()) {
                    c0262r0.f1067K1.postDelayed(c0262r0.f1063G1, 250L);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            c0262r0.f1067K1.removeCallbacks(c0262r0.f1063G1);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0262r0 c0262r0 = C0262r0.this;
            C0247m0 c0247m0 = c0262r0.f1077m;
            if (c0247m0 != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (!C0946x.g.m2859b(c0247m0) || c0262r0.f1077m.getCount() <= c0262r0.f1077m.getChildCount() || c0262r0.f1077m.getChildCount() > c0262r0.f1058B1) {
                    return;
                }
                c0262r0.f1071O1.setInputMethodMode(2);
                c0262r0.mo500a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1054P1 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1056R1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1055Q1 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0262r0(Context context) {
        this(context, null, R$attr.listPopupWindowStyle, 0);
    }

    public C0262r0(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f1078s = -2;
        this.f1072X = -2;
        this.f1079w1 = 1002;
        this.f1057A1 = 0;
        this.f1058B1 = Integer.MAX_VALUE;
        this.f1063G1 = new g();
        this.f1064H1 = new f();
        this.f1065I1 = new e();
        this.f1066J1 = new c();
        this.f1068L1 = new Rect();
        this.f1075c = context;
        this.f1067K1 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f288p, i7, i8);
        this.f1073Y = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1074Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1080x1 = true;
        }
        obtainStyledAttributes.recycle();
        C0261r c0261r = new C0261r(context, attributeSet, i7, i8);
        this.f1071O1 = c0261r;
        c0261r.setInputMethodMode(1);
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: a */
    public final void mo500a() {
        int i7;
        int m883a;
        int paddingBottom;
        C0247m0 c0247m0;
        C0247m0 c0247m02 = this.f1077m;
        C0261r c0261r = this.f1071O1;
        Context context = this.f1075c;
        if (c0247m02 == null) {
            C0247m0 mo881q = mo881q(context, !this.f1070N1);
            this.f1077m = mo881q;
            mo881q.setAdapter(this.f1076e);
            this.f1077m.setOnItemClickListener(this.f1061E1);
            this.f1077m.setFocusable(true);
            this.f1077m.setFocusableInTouchMode(true);
            this.f1077m.setOnItemSelectedListener(new C0259q0(this));
            this.f1077m.setOnScrollListener(this.f1065I1);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1062F1;
            if (onItemSelectedListener != null) {
                this.f1077m.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0261r.setContentView(this.f1077m);
        }
        Drawable background = c0261r.getBackground();
        Rect rect = this.f1068L1;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i7 = rect.bottom + i8;
            if (!this.f1080x1) {
                this.f1074Z = -i8;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        boolean z6 = c0261r.getInputMethodMode() == 2;
        View view = this.f1060D1;
        int i9 = this.f1074Z;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1055Q1;
            if (method != null) {
                try {
                    m883a = ((Integer) method.invoke(c0261r, view, Integer.valueOf(i9), Boolean.valueOf(z6))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            m883a = c0261r.getMaxAvailableHeight(view, i9);
        } else {
            m883a = a.m883a(c0261r, view, i9, z6);
        }
        if (this.f1078s == -1) {
            paddingBottom = m883a + i7;
        } else {
            int i10 = this.f1072X;
            int m855a = this.f1077m.m855a(i10 != -2 ? i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), m883a + 0);
            paddingBottom = m855a + (m855a > 0 ? this.f1077m.getPaddingBottom() + this.f1077m.getPaddingTop() + i7 + 0 : 0);
        }
        boolean z7 = c0261r.getInputMethodMode() == 2;
        C1313g.m3646b(c0261r, this.f1079w1);
        if (c0261r.isShowing()) {
            View view2 = this.f1060D1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.g.m2859b(view2)) {
                int i11 = this.f1072X;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f1060D1.getWidth();
                }
                int i12 = this.f1078s;
                if (i12 == -1) {
                    if (!z7) {
                        paddingBottom = -1;
                    }
                    if (z7) {
                        c0261r.setWidth(this.f1072X == -1 ? -1 : 0);
                        c0261r.setHeight(0);
                    } else {
                        c0261r.setWidth(this.f1072X == -1 ? -1 : 0);
                        c0261r.setHeight(-1);
                    }
                } else if (i12 != -2) {
                    paddingBottom = i12;
                }
                c0261r.setOutsideTouchable(true);
                View view3 = this.f1060D1;
                int i13 = this.f1073Y;
                int i14 = this.f1074Z;
                if (i11 < 0) {
                    i11 = -1;
                }
                c0261r.update(view3, i13, i14, i11, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i15 = this.f1072X;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.f1060D1.getWidth();
        }
        int i16 = this.f1078s;
        if (i16 == -1) {
            paddingBottom = -1;
        } else if (i16 != -2) {
            paddingBottom = i16;
        }
        c0261r.setWidth(i15);
        c0261r.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1054P1;
            if (method2 != null) {
                try {
                    method2.invoke(c0261r, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.m885b(c0261r, true);
        }
        c0261r.setOutsideTouchable(true);
        c0261r.setTouchInterceptor(this.f1064H1);
        if (this.f1082z1) {
            C1313g.m3645a(c0261r, this.f1081y1);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1056R1;
            if (method3 != null) {
                try {
                    method3.invoke(c0261r, this.f1069M1);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            b.m884a(c0261r, this.f1069M1);
        }
        C1313g.a.m3647a(c0261r, this.f1060D1, this.f1073Y, this.f1074Z, this.f1057A1);
        this.f1077m.setSelection(-1);
        if ((!this.f1070N1 || this.f1077m.isInTouchMode()) && (c0247m0 = this.f1077m) != null) {
            c0247m0.setListSelectionHidden(true);
            c0247m0.requestLayout();
        }
        if (this.f1070N1) {
            return;
        }
        this.f1067K1.post(this.f1066J1);
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: c */
    public final boolean mo502c() {
        return this.f1071O1.isShowing();
    }

    /* renamed from: d */
    public final int m874d() {
        return this.f1073Y;
    }

    @Override // p057h.InterfaceC1272f
    public final void dismiss() {
        C0261r c0261r = this.f1071O1;
        c0261r.dismiss();
        c0261r.setContentView(null);
        this.f1077m = null;
        this.f1067K1.removeCallbacks(this.f1063G1);
    }

    /* renamed from: f */
    public final Drawable m875f() {
        return this.f1071O1.getBackground();
    }

    @Override // p057h.InterfaceC1272f
    /* renamed from: h */
    public final C0247m0 mo505h() {
        return this.f1077m;
    }

    /* renamed from: i */
    public final void m876i(Drawable drawable) {
        this.f1071O1.setBackgroundDrawable(drawable);
    }

    /* renamed from: j */
    public final void m877j(int i7) {
        this.f1074Z = i7;
        this.f1080x1 = true;
    }

    /* renamed from: l */
    public final void m878l(int i7) {
        this.f1073Y = i7;
    }

    /* renamed from: n */
    public final int m879n() {
        if (this.f1080x1) {
            return this.f1074Z;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo880p(ListAdapter listAdapter) {
        d dVar = this.f1059C1;
        if (dVar == null) {
            this.f1059C1 = new d();
        } else {
            ListAdapter listAdapter2 = this.f1076e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1076e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1059C1);
        }
        C0247m0 c0247m0 = this.f1077m;
        if (c0247m0 != null) {
            c0247m0.setAdapter(this.f1076e);
        }
    }

    /* renamed from: q */
    public C0247m0 mo881q(Context context, boolean z6) {
        return new C0247m0(context, z6);
    }

    /* renamed from: r */
    public final void m882r(int i7) {
        Drawable background = this.f1071O1.getBackground();
        if (background == null) {
            this.f1072X = i7;
            return;
        }
        Rect rect = this.f1068L1;
        background.getPadding(rect);
        this.f1072X = rect.left + rect.right + i7;
    }
}
