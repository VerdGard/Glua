package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.RunnableC0119d;
import androidx.activity.RunnableC0123h;
import androidx.appcompat.R$dimen;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p034e0.C0913c0;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC0248m1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: A1 */
    public static ViewOnLongClickListenerC0248m1 f992A1;

    /* renamed from: z1 */
    public static ViewOnLongClickListenerC0248m1 f993z1;

    /* renamed from: Y */
    public int f995Y;

    /* renamed from: Z */
    public int f996Z;

    /* renamed from: c */
    public final View f997c;

    /* renamed from: e */
    public final CharSequence f998e;

    /* renamed from: m */
    public final int f999m;

    /* renamed from: w1 */
    public C0251n1 f1001w1;

    /* renamed from: x1 */
    public boolean f1002x1;

    /* renamed from: y1 */
    public boolean f1003y1;

    /* renamed from: s */
    public final RunnableC0119d f1000s = new RunnableC0119d(3, this);

    /* renamed from: X */
    public final RunnableC0123h f994X = new RunnableC0123h(2, this);

    public ViewOnLongClickListenerC0248m1(View view, CharSequence charSequence) {
        this.f997c = view;
        this.f998e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C0913c0.f4791a;
        this.f999m = Build.VERSION.SDK_INT >= 28 ? C0913c0.b.m2672a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f1003y1 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m860b(ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m1) {
        ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m12 = f993z1;
        if (viewOnLongClickListenerC0248m12 != null) {
            viewOnLongClickListenerC0248m12.f997c.removeCallbacks(viewOnLongClickListenerC0248m12.f1000s);
        }
        f993z1 = viewOnLongClickListenerC0248m1;
        if (viewOnLongClickListenerC0248m1 != null) {
            viewOnLongClickListenerC0248m1.f997c.postDelayed(viewOnLongClickListenerC0248m1.f1000s, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m861a() {
        ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m1 = f992A1;
        View view = this.f997c;
        if (viewOnLongClickListenerC0248m1 == this) {
            f992A1 = null;
            C0251n1 c0251n1 = this.f1001w1;
            if (c0251n1 != null) {
                View view2 = c0251n1.f1007b;
                if (view2.getParent() != null) {
                    ((WindowManager) c0251n1.f1006a.getSystemService("window")).removeView(view2);
                }
                this.f1001w1 = null;
                this.f1003y1 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f993z1 == this) {
            m860b(null);
        }
        view.removeCallbacks(this.f994X);
    }

    /* renamed from: c */
    public final void m862c(boolean z6) {
        int height;
        int i7;
        String str;
        int i8;
        String str2;
        long longPressTimeout;
        long j7;
        long j8;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        View view = this.f997c;
        if (C0946x.g.m2859b(view)) {
            m860b(null);
            ViewOnLongClickListenerC0248m1 viewOnLongClickListenerC0248m1 = f992A1;
            if (viewOnLongClickListenerC0248m1 != null) {
                viewOnLongClickListenerC0248m1.m861a();
            }
            f992A1 = this;
            this.f1002x1 = z6;
            C0251n1 c0251n1 = new C0251n1(view.getContext());
            this.f1001w1 = c0251n1;
            int i9 = this.f995Y;
            int i10 = this.f996Z;
            boolean z7 = this.f1002x1;
            View view2 = c0251n1.f1007b;
            boolean z8 = view2.getParent() != null;
            Context context = c0251n1.f1006a;
            if (z8) {
                if (view2.getParent() != null) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            c0251n1.f1008c.setText(this.f998e);
            WindowManager.LayoutParams layoutParams = c0251n1.f1009d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i7 = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z7 ? R$dimen.tooltip_y_offset_touch : R$dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = c0251n1.f1010e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i8 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i8 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c0251n1.f1012g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c0251n1.f1011f;
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i8] - iArr[i8];
                iArr2[i8] = i11;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i11 + i9) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, i8);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[1];
                int i13 = ((i7 + i12) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + height + dimensionPixelOffset3;
                if (!z7 ? measuredHeight + i14 <= rect.height() : i13 < 0) {
                    layoutParams.y = i13;
                } else {
                    layoutParams.y = i14;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f1002x1) {
                j8 = 2500;
            } else {
                if ((C0946x.d.m2831g(view) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            RunnableC0123h runnableC0123h = this.f994X;
            view.removeCallbacks(runnableC0123h);
            view.postDelayed(runnableC0123h, j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.n1 r5 = r4.f1001w1
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f1002x1
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f997c
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f1003y1 = r3
            r4.m861a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.n1 r5 = r4.f1001w1
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f1003y1
            if (r1 != 0) goto L69
            int r1 = r4.f995Y
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f999m
            if (r1 > r2) goto L69
            int r1 = r4.f996Z
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = 0
            goto L6f
        L69:
            r4.f995Y = r5
            r4.f996Z = r6
            r4.f1003y1 = r0
        L6f:
            if (r3 == 0) goto L74
            m860b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ViewOnLongClickListenerC0248m1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f995Y = view.getWidth() / 2;
        this.f996Z = view.getHeight() / 2;
        m862c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m861a();
    }
}
