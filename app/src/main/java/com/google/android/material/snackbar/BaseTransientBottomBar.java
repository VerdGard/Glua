package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.activity.C0143v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C0845g;
import java.util.List;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p005a4.C0042a;
import p005a4.C0044c;
import p005a4.C0045d;
import p005a4.C0046e;
import p005a4.InterfaceC0049h;
import p034e0.C0923h0;
import p034e0.C0946x;
import p038e4.C1138a;
import p121p0.C1690b;
import p121p0.C1691c;
import p131q3.C1762r;
import p131q3.C1767w;
import p131q3.C1769y;
import p139r3.C1832j;
import p163u3.C1972c;
import p189y.C2213a;
import p193y3.C2237f;
import p193y3.C2240i;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public final int f4403a;

    /* renamed from: b */
    public final int f4404b;

    /* renamed from: c */
    public final int f4405c;

    /* renamed from: d */
    public final TimeInterpolator f4406d;

    /* renamed from: e */
    public final TimeInterpolator f4407e;

    /* renamed from: f */
    public final TimeInterpolator f4408f;

    /* renamed from: g */
    public final ViewGroup f4409g;

    /* renamed from: h */
    public final Context f4410h;

    /* renamed from: i */
    public final C0838e f4411i;

    /* renamed from: j */
    public final InterfaceC0049h f4412j;

    /* renamed from: k */
    public int f4413k;

    /* renamed from: m */
    public int f4415m;

    /* renamed from: n */
    public int f4416n;

    /* renamed from: o */
    public int f4417o;

    /* renamed from: p */
    public int f4418p;

    /* renamed from: q */
    public int f4419q;

    /* renamed from: r */
    public boolean f4420r;

    /* renamed from: s */
    public final AccessibilityManager f4421s;

    /* renamed from: u */
    public static final C1690b f4397u = C0034a.f109b;

    /* renamed from: v */
    public static final LinearInterpolator f4398v = C0034a.f108a;

    /* renamed from: w */
    public static final C1691c f4399w = C0034a.f111d;

    /* renamed from: y */
    public static final int[] f4401y = {R$attr.snackbarStyle};

    /* renamed from: z */
    public static final String f4402z = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: x */
    public static final Handler f4400x = new Handler(Looper.getMainLooper(), new C0834a());

    /* renamed from: l */
    public final RunnableC0835b f4414l = new RunnableC0835b();

    /* renamed from: t */
    public final C0836c f4422t = new C0836c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: y1 */
        public final C0837d f4423y1 = new C0837d(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: k */
        public final boolean mo984k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C0837d c0837d = this.f4423y1;
            c0837d.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C0845g.m2501b().m2505e(c0837d.f4426a);
                }
            } else if (coordinatorLayout.m970l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C0845g m2501b = C0845g.m2501b();
                C0836c c0836c = c0837d.f4426a;
                synchronized (m2501b.f4452a) {
                    if (m2501b.m2503c(c0836c)) {
                        C0845g.c cVar = m2501b.f4454c;
                        if (!cVar.f4459c) {
                            cVar.f4459c = true;
                            m2501b.f4453b.removeCallbacksAndMessages(cVar);
                        }
                    }
                }
            }
            return super.mo984k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: w */
        public final boolean mo2282w(View view) {
            this.f4423y1.getClass();
            return view instanceof C0838e;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C0834a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i7 = message.what;
            if (i7 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                C0838e c0838e = baseTransientBottomBar.f4411i;
                if (c0838e.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = c0838e.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0292f) {
                        CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) layoutParams;
                        Behavior behavior = new Behavior();
                        C0837d c0837d = behavior.f4423y1;
                        c0837d.getClass();
                        c0837d.f4426a = baseTransientBottomBar.f4422t;
                        behavior.f3828e = new C0843e(baseTransientBottomBar);
                        c0292f.m997b(behavior);
                        c0292f.f1425g = 80;
                    }
                    c0838e.f4430C1 = true;
                    baseTransientBottomBar.f4409g.addView(c0838e);
                    c0838e.f4430C1 = false;
                    baseTransientBottomBar.m2494f();
                    c0838e.setVisibility(4);
                }
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (C0946x.g.m2860c(c0838e)) {
                    baseTransientBottomBar.m2493e();
                } else {
                    baseTransientBottomBar.f4420r = true;
                }
                return true;
            }
            if (i7 != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i8 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f4421s;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                C0838e c0838e2 = baseTransientBottomBar2.f4411i;
                if (c0838e2.getVisibility() == 0) {
                    if (c0838e2.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(baseTransientBottomBar2.f4406d);
                        ofFloat.addUpdateListener(new C0839a(baseTransientBottomBar2));
                        ofFloat.setDuration(baseTransientBottomBar2.f4404b);
                        ofFloat.addListener(new C0042a(baseTransientBottomBar2, i8));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int[] iArr = new int[2];
                        iArr[0] = 0;
                        int height = c0838e2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = c0838e2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        iArr[1] = height;
                        valueAnimator.setIntValues(iArr);
                        valueAnimator.setInterpolator(baseTransientBottomBar2.f4407e);
                        valueAnimator.setDuration(baseTransientBottomBar2.f4405c);
                        valueAnimator.addListener(new C0044c(baseTransientBottomBar2, i8));
                        valueAnimator.addUpdateListener(new C0842d(baseTransientBottomBar2));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            baseTransientBottomBar2.m2491c();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class RunnableC0835b implements Runnable {
        public RunnableC0835b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f4411i == null || (context = baseTransientBottomBar.f4410h) == null) {
                return;
            }
            int height = C1769y.m4242a(context).height();
            int[] iArr = new int[2];
            C0838e c0838e = baseTransientBottomBar.f4411i;
            c0838e.getLocationOnScreen(iArr);
            int height2 = (height - (c0838e.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f4411i.getTranslationY());
            int i7 = baseTransientBottomBar.f4418p;
            if (height2 >= i7) {
                baseTransientBottomBar.f4419q = i7;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f4411i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f4402z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            int i8 = baseTransientBottomBar.f4418p;
            baseTransientBottomBar.f4419q = i8;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i8 - height2) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.f4411i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C0836c implements C0845g.b {
        public C0836c() {
        }

        @Override // com.google.android.material.snackbar.C0845g.b
        /* renamed from: a */
        public final void mo2495a() {
            Handler handler = BaseTransientBottomBar.f4400x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C0845g.b
        /* renamed from: b */
        public final void mo2496b(int i7) {
            Handler handler = BaseTransientBottomBar.f4400x;
            handler.sendMessage(handler.obtainMessage(1, i7, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static class C0837d {

        /* renamed from: a */
        public C0836c f4426a;

        public C0837d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f3826Z = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f3831w1 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f3824X = 0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public static class C0838e extends FrameLayout {

        /* renamed from: D1 */
        public static final a f4427D1 = new a();

        /* renamed from: A1 */
        public PorterDuff.Mode f4428A1;

        /* renamed from: B1 */
        public Rect f4429B1;

        /* renamed from: C1 */
        public boolean f4430C1;

        /* renamed from: c */
        public BaseTransientBottomBar<?> f4431c;

        /* renamed from: e */
        public final C2240i f4432e;

        /* renamed from: m */
        public int f4433m;

        /* renamed from: s */
        public final float f4434s;

        /* renamed from: w1 */
        public final float f4435w1;

        /* renamed from: x1 */
        public final int f4436x1;

        /* renamed from: y1 */
        public final int f4437y1;

        /* renamed from: z1 */
        public ColorStateList f4438z1;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e$a */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0838e(Context context, AttributeSet attributeSet) {
            super(C1138a.m3322a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Drawable m5359g;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.f3721B);
            int i7 = R$styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i7)) {
                float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i7, 0);
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.i.m2886s(this, dimensionPixelSize);
            }
            this.f4433m = obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f4432e = new C2240i(C2240i.m5433b(context2, attributeSet, 0, 0));
            }
            this.f4434s = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C1972c.m4585a(context2, obtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C1767w.m4240c(obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f4435w1 = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f4436x1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
            this.f4437y1 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f4427D1);
            setFocusable(true);
            if (getBackground() == null) {
                int m417O = C0143v.m417O(getBackgroundOverlayColorAlpha(), C0143v.m400B(this, R$attr.colorSurface), C0143v.m400B(this, R$attr.colorOnSurface));
                C2240i c2240i = this.f4432e;
                if (c2240i != null) {
                    C1690b c1690b = BaseTransientBottomBar.f4397u;
                    C2237f c2237f = new C2237f(c2240i);
                    c2237f.m5428k(ColorStateList.valueOf(m417O));
                    gradientDrawable = c2237f;
                } else {
                    Resources resources = getResources();
                    C1690b c1690b2 = BaseTransientBottomBar.f4397u;
                    float dimension = resources.getDimension(R$dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(m417O);
                    gradientDrawable = gradientDrawable2;
                }
                if (this.f4438z1 != null) {
                    m5359g = C2213a.m5359g(gradientDrawable);
                    C2213a.b.m5372h(m5359g, this.f4438z1);
                } else {
                    m5359g = C2213a.m5359g(gradientDrawable);
                }
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                C0946x.d.m2841q(this, m5359g);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f4431c = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f4435w1;
        }

        public int getAnimationMode() {
            return this.f4433m;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f4434s;
        }

        public int getMaxInlineActionWidth() {
            return this.f4437y1;
        }

        public int getMaxWidth() {
            return this.f4436x1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Insets mandatorySystemGestureInsets;
            int i7;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f4431c;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f4411i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                        i7 = mandatorySystemGestureInsets.bottom;
                        baseTransientBottomBar.f4418p = i7;
                        baseTransientBottomBar.m2494f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onDetachedFromWindow() {
            /*
                r6 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r6.f4431c
                if (r0 == 0) goto L44
                com.google.android.material.snackbar.g r1 = com.google.android.material.snackbar.C0845g.m2501b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r0.f4422t
                java.lang.Object r3 = r1.f4452a
                monitor-enter(r3)
                boolean r4 = r1.m2503c(r2)     // Catch: java.lang.Throwable -> L28
                r5 = 1
                if (r4 != 0) goto L34
                com.google.android.material.snackbar.g$c r1 = r1.f4455d     // Catch: java.lang.Throwable -> L28
                r4 = 0
                if (r1 == 0) goto L2f
                if (r2 == 0) goto L2a
                java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r1 = r1.f4457a     // Catch: java.lang.Throwable -> L28
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L28
                if (r1 != r2) goto L2a
                r1 = 1
                goto L2b
            L28:
                r0 = move-exception
                goto L42
            L2a:
                r1 = 0
            L2b:
                if (r1 == 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                if (r1 == 0) goto L33
                goto L34
            L33:
                r5 = 0
            L34:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L44
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f4400x
                a4.f r2 = new a4.f
                r2.<init>(r0)
                r1.post(r2)
                goto L44
            L42:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                throw r0
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.C0838e.onDetachedFromWindow():void");
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
            super.onLayout(z6, i7, i8, i9, i10);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f4431c;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f4420r) {
                return;
            }
            baseTransientBottomBar.m2493e();
            baseTransientBottomBar.f4420r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            int i9 = this.f4436x1;
            if (i9 <= 0 || getMeasuredWidth() <= i9) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
        }

        public void setAnimationMode(int i7) {
            this.f4433m = i7;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f4438z1 != null) {
                drawable = C2213a.m5359g(drawable.mutate());
                C2213a.b.m5372h(drawable, this.f4438z1);
                C2213a.b.m5373i(drawable, this.f4428A1);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f4438z1 = colorStateList;
            if (getBackground() != null) {
                Drawable m5359g = C2213a.m5359g(getBackground().mutate());
                C2213a.b.m5372h(m5359g, colorStateList);
                C2213a.b.m5373i(m5359g, this.f4428A1);
                if (m5359g != getBackground()) {
                    super.setBackgroundDrawable(m5359g);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f4428A1 = mode;
            if (getBackground() != null) {
                Drawable m5359g = C2213a.m5359g(getBackground().mutate());
                C2213a.b.m5373i(m5359g, mode);
                if (m5359g != getBackground()) {
                    super.setBackgroundDrawable(m5359g);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f4430C1 || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f4429B1 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f4431c;
            if (baseTransientBottomBar != null) {
                C1690b c1690b = BaseTransientBottomBar.f4397u;
                baseTransientBottomBar.m2494f();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f4427D1);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f4409g = viewGroup;
        this.f4412j = snackbarContentLayout2;
        this.f4410h = context;
        C1762r.m4234c(context, C1762r.f8119a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4401y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        C0838e c0838e = (C0838e) from.inflate(resourceId != -1 ? R$layout.mtrl_layout_snackbar : R$layout.design_layout_snackbar, viewGroup, false);
        this.f4411i = c0838e;
        c0838e.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = c0838e.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f4442e.setTextColor(C0143v.m417O(actionTextColorAlpha, C0143v.m400B(snackbarContentLayout, R$attr.colorSurface), snackbarContentLayout.f4442e.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(c0838e.getMaxInlineActionWidth());
        c0838e.addView(snackbarContentLayout);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.g.m2863f(c0838e, 1);
        C0946x.d.m2843s(c0838e, 1);
        c0838e.setFitsSystemWindows(true);
        C0946x.i.m2888u(c0838e, new C0045d(this));
        C0946x.m2817r(c0838e, new C0046e(this));
        this.f4421s = (AccessibilityManager) context.getSystemService("accessibility");
        int i7 = R$attr.motionDurationLong2;
        this.f4405c = C1832j.m4312c(context, i7, 250);
        this.f4403a = C1832j.m4312c(context, i7, 150);
        this.f4404b = C1832j.m4312c(context, R$attr.motionDurationMedium1, 75);
        int i8 = R$attr.motionEasingEmphasizedInterpolator;
        this.f4406d = C1832j.m4313d(context, i8, f4398v);
        this.f4408f = C1832j.m4313d(context, i8, f4399w);
        this.f4407e = C1832j.m4313d(context, i8, f4397u);
    }

    /* renamed from: a */
    public void mo2489a() {
        m2490b(3);
    }

    /* renamed from: b */
    public final void m2490b(int i7) {
        C0845g.c cVar;
        C0845g m2501b = C0845g.m2501b();
        C0836c c0836c = this.f4422t;
        synchronized (m2501b.f4452a) {
            if (m2501b.m2503c(c0836c)) {
                cVar = m2501b.f4454c;
            } else {
                C0845g.c cVar2 = m2501b.f4455d;
                boolean z6 = false;
                if (cVar2 != null) {
                    if (c0836c != null && cVar2.f4457a.get() == c0836c) {
                        z6 = true;
                    }
                }
                if (z6) {
                    cVar = m2501b.f4455d;
                }
            }
            m2501b.m2502a(cVar, i7);
        }
    }

    /* renamed from: c */
    public final void m2491c() {
        C0845g m2501b = C0845g.m2501b();
        C0836c c0836c = this.f4422t;
        synchronized (m2501b.f4452a) {
            try {
                if (m2501b.m2503c(c0836c)) {
                    m2501b.f4454c = null;
                    C0845g.c cVar = m2501b.f4455d;
                    if (cVar != null && cVar != null) {
                        m2501b.f4454c = cVar;
                        m2501b.f4455d = null;
                        C0845g.b bVar = cVar.f4457a.get();
                        if (bVar != null) {
                            bVar.mo2495a();
                        } else {
                            m2501b.f4454c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f4411i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f4411i);
        }
    }

    /* renamed from: d */
    public final void m2492d() {
        C0845g m2501b = C0845g.m2501b();
        C0836c c0836c = this.f4422t;
        synchronized (m2501b.f4452a) {
            if (m2501b.m2503c(c0836c)) {
                m2501b.m2506f(m2501b.f4454c);
            }
        }
    }

    /* renamed from: e */
    public final void m2493e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z6 = true;
        AccessibilityManager accessibilityManager = this.f4421s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z6 = false;
        }
        C0838e c0838e = this.f4411i;
        if (z6) {
            c0838e.post(new RunnableC0844f(this));
            return;
        }
        if (c0838e.getParent() != null) {
            c0838e.setVisibility(0);
        }
        m2492d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (((r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f) r1).f1419a instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L42;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2494f() {
        /*
            r9 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r9.f4411i
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto Ld
            java.lang.String r0 = "Unable to update margins because layout params are not MarginLayoutParams"
            goto L13
        Ld:
            android.graphics.Rect r2 = r0.f4429B1
            if (r2 != 0) goto L19
            java.lang.String r0 = "Unable to update margins because original view margins are not set"
        L13:
            java.lang.String r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f4402z
            android.util.Log.w(r1, r0)
            return
        L19:
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != 0) goto L20
            return
        L20:
            int r2 = r9.f4415m
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.graphics.Rect r3 = r0.f4429B1
            int r4 = r3.bottom
            int r4 = r4 + r2
            int r2 = r3.left
            int r5 = r9.f4416n
            int r2 = r2 + r5
            int r5 = r3.right
            int r6 = r9.f4417o
            int r5 = r5 + r6
            int r3 = r3.top
            int r6 = r1.bottomMargin
            r7 = 1
            r8 = 0
            if (r6 != r4) goto L4a
            int r6 = r1.leftMargin
            if (r6 != r2) goto L4a
            int r6 = r1.rightMargin
            if (r6 != r5) goto L4a
            int r6 = r1.topMargin
            if (r6 == r3) goto L48
            goto L4a
        L48:
            r6 = 0
            goto L4b
        L4a:
            r6 = 1
        L4b:
            if (r6 == 0) goto L58
            r1.bottomMargin = r4
            r1.leftMargin = r2
            r1.rightMargin = r5
            r1.topMargin = r3
            r0.requestLayout()
        L58:
            if (r6 != 0) goto L60
            int r1 = r9.f4419q
            int r2 = r9.f4418p
            if (r1 == r2) goto L8b
        L60:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L8b
            int r1 = r9.f4418p
            if (r1 <= 0) goto L80
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f
            if (r2 == 0) goto L7c
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1419a
            boolean r1 = r1 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r1 == 0) goto L7c
            r1 = 1
            goto L7d
        L7c:
            r1 = 0
        L7d:
            if (r1 == 0) goto L80
            goto L81
        L80:
            r7 = 0
        L81:
            if (r7 == 0) goto L8b
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r9.f4414l
            r0.removeCallbacks(r1)
            r0.post(r1)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m2494f():void");
    }
}
