package p034e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p034e0.C0908a;
import p034e0.C0912c;
import p034e0.C0935n0;
import p034e0.C0946x;
import p042f0.C1151g;
import p042f0.InterfaceC1155k;
import p089l.C1481o;
import p181x.C2153b;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: e0.x */
/* loaded from: classes.dex */
public final class C0946x {

    /* renamed from: a */
    public static WeakHashMap<View, C0923h0> f4876a;

    /* renamed from: b */
    public static Field f4877b;

    /* renamed from: c */
    public static boolean f4878c;

    /* renamed from: d */
    public static ThreadLocal<Rect> f4879d;

    /* renamed from: e */
    public static final int[] f4880e;

    /* renamed from: f */
    public static final C0942t f4881f;

    /* renamed from: g */
    public static final a f4882g;

    /* renamed from: e0.x$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final WeakHashMap<View, Boolean> f4883c = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f4883c;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z6 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z6) {
                        C0946x.m2809j(key, z6 ? 16 : 32);
                        weakHashMap.put(key, Boolean.valueOf(z6));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: e0.x$b */
    public static abstract class b<T> {

        /* renamed from: a */
        public final int f4884a;

        /* renamed from: b */
        public final Class<T> f4885b;

        /* renamed from: c */
        public final int f4886c;

        /* renamed from: d */
        public final int f4887d;

        public b(int i7, Class<T> cls, int i8, int i9) {
            this.f4884a = i7;
            this.f4885b = cls;
            this.f4887d = i8;
            this.f4886c = i9;
        }

        /* renamed from: a */
        public static boolean m2821a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo2797b(View view);

        /* renamed from: c */
        public abstract void mo2798c(View view, T t7);

        /* renamed from: d */
        public final T m2822d(View view) {
            if (Build.VERSION.SDK_INT >= this.f4886c) {
                return mo2797b(view);
            }
            T t7 = (T) view.getTag(this.f4884a);
            if (this.f4885b.isInstance(t7)) {
                return t7;
            }
            return null;
        }

        /* renamed from: e */
        public final void m2823e(View view, T t7) {
            if (Build.VERSION.SDK_INT >= this.f4886c) {
                mo2798c(view, t7);
                return;
            }
            if (mo2799f(m2822d(view), t7)) {
                View.AccessibilityDelegate m2803d = C0946x.m2803d(view);
                C0908a c0908a = m2803d == null ? null : m2803d instanceof C0908a.a ? ((C0908a.a) m2803d).f4776a : new C0908a(m2803d);
                if (c0908a == null) {
                    c0908a = new C0908a();
                }
                C0946x.m2817r(view, c0908a);
                view.setTag(this.f4884a, t7);
                C0946x.m2809j(view, this.f4887d);
            }
        }

        /* renamed from: f */
        public abstract boolean mo2799f(T t7, T t8);
    }

    /* renamed from: e0.x$c */
    public static class c {
        /* renamed from: a */
        public static boolean m2824a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: e0.x$d */
    public static class d {
        /* renamed from: a */
        public static AccessibilityNodeProvider m2825a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m2826b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m2827c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m2828d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m2829e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m2830f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m2831g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m2832h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m2833i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m2834j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        /* renamed from: k */
        public static void m2835k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m2836l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        /* renamed from: m */
        public static void m2837m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m2838n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        /* renamed from: o */
        public static void m2839o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m2840p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m2841q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m2842r(View view, boolean z6) {
            view.setHasTransientState(z6);
        }

        /* renamed from: s */
        public static void m2843s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    /* renamed from: e0.x$e */
    public static class e {
        /* renamed from: a */
        public static int m2844a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m2845b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m2846c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m2847d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m2848e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m2849f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m2850g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m2851h(View view, int i7) {
            view.setLabelFor(i7);
        }

        /* renamed from: i */
        public static void m2852i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m2853j(View view, int i7) {
            view.setLayoutDirection(i7);
        }

        /* renamed from: k */
        public static void m2854k(View view, int i7, int i8, int i9, int i10) {
            view.setPaddingRelative(i7, i8, i9, i10);
        }
    }

    /* renamed from: e0.x$f */
    public static class f {
        /* renamed from: a */
        public static Rect m2855a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m2856b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m2857c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: e0.x$g */
    public static class g {
        /* renamed from: a */
        public static int m2858a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m2859b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m2860c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m2861d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m2862e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        /* renamed from: f */
        public static void m2863f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        /* renamed from: g */
        public static void m2864g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    /* renamed from: e0.x$h */
    public static class h {
        /* renamed from: a */
        public static WindowInsets m2865a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m2866b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m2867c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: e0.x$i */
    public static class i {

        /* renamed from: e0.x$i$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C0935n0 f4888a = null;

            /* renamed from: b */
            public final /* synthetic */ View f4889b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC0938p f4890c;

            public a(View view, InterfaceC0938p interfaceC0938p) {
                this.f4889b = view;
                this.f4890c = interfaceC0938p;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0935n0 m2749i = C0935n0.m2749i(view, windowInsets);
                int i7 = Build.VERSION.SDK_INT;
                InterfaceC0938p interfaceC0938p = this.f4890c;
                if (i7 < 30) {
                    i.m2868a(windowInsets, this.f4889b);
                    if (m2749i.equals(this.f4888a)) {
                        return interfaceC0938p.mo133a(view, m2749i).m2756h();
                    }
                }
                this.f4888a = m2749i;
                C0935n0 mo133a = interfaceC0938p.mo133a(view, m2749i);
                if (i7 >= 30) {
                    return mo133a.m2756h();
                }
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                h.m2867c(view);
                return mo133a.m2756h();
            }
        }

        /* renamed from: a */
        public static void m2868a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C0935n0 m2869b(View view, C0935n0 c0935n0, Rect rect) {
            WindowInsets m2756h = c0935n0.m2756h();
            if (m2756h != null) {
                return C0935n0.m2749i(view, view.computeSystemWindowInsets(m2756h, rect));
            }
            rect.setEmpty();
            return c0935n0;
        }

        /* renamed from: c */
        public static boolean m2870c(View view, float f7, float f8, boolean z6) {
            return view.dispatchNestedFling(f7, f8, z6);
        }

        /* renamed from: d */
        public static boolean m2871d(View view, float f7, float f8) {
            return view.dispatchNestedPreFling(f7, f8);
        }

        /* renamed from: e */
        public static boolean m2872e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m2873f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m2874g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m2875h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m2876i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0935n0 m2877j(View view) {
            if (C0935n0.a.f4839d && view.isAttachedToWindow()) {
                try {
                    Object obj = C0935n0.a.f4836a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) C0935n0.a.f4837b.get(obj);
                        Rect rect2 = (Rect) C0935n0.a.f4838c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            C0935n0.e dVar = i7 >= 30 ? new C0935n0.d() : i7 >= 29 ? new C0935n0.c() : new C0935n0.b();
                            dVar.mo2759e(C2153b.m5268b(rect.left, rect.top, rect.right, rect.bottom));
                            dVar.mo2760g(C2153b.m5268b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            C0935n0 mo2758b = dVar.mo2758b();
                            mo2758b.f4835a.mo2776p(mo2758b);
                            mo2758b.f4835a.mo2770d(view.getRootView());
                            return mo2758b;
                        }
                    }
                } catch (IllegalAccessException e7) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        /* renamed from: k */
        public static String m2878k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m2879l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m2880m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m2881n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m2882o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m2883p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m2884q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m2885r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m2886s(View view, float f7) {
            view.setElevation(f7);
        }

        /* renamed from: t */
        public static void m2887t(View view, boolean z6) {
            view.setNestedScrollingEnabled(z6);
        }

        /* renamed from: u */
        public static void m2888u(View view, InterfaceC0938p interfaceC0938p) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R$id.tag_on_apply_window_listener, interfaceC0938p);
            }
            if (interfaceC0938p == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0938p));
            }
        }

        /* renamed from: v */
        public static void m2889v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m2890w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        /* renamed from: x */
        public static void m2891x(View view, float f7) {
            view.setZ(f7);
        }

        /* renamed from: y */
        public static boolean m2892y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        /* renamed from: z */
        public static void m2893z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: e0.x$j */
    public static class j {
        /* renamed from: a */
        public static C0935n0 m2894a(View view) {
            WindowInsets rootWindowInsets;
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0935n0 m2749i = C0935n0.m2749i(null, rootWindowInsets);
            C0935n0.k kVar = m2749i.f4835a;
            kVar.mo2776p(m2749i);
            kVar.mo2770d(view.getRootView());
            return m2749i;
        }

        /* renamed from: b */
        public static int m2895b(View view) {
            int scrollIndicators;
            scrollIndicators = view.getScrollIndicators();
            return scrollIndicators;
        }

        /* renamed from: c */
        public static void m2896c(View view, int i7) {
            view.setScrollIndicators(i7);
        }

        /* renamed from: d */
        public static void m2897d(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    /* renamed from: e0.x$k */
    public static class k {
        /* renamed from: a */
        public static void m2898a(View view, Collection<View> collection, int i7) {
            view.addKeyboardNavigationClusters(collection, i7);
        }

        /* renamed from: b */
        public static int m2899b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        /* renamed from: c */
        public static int m2900c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        /* renamed from: d */
        public static boolean m2901d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        /* renamed from: e */
        public static boolean m2902e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        /* renamed from: f */
        public static boolean m2903f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        /* renamed from: g */
        public static boolean m2904g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        /* renamed from: h */
        public static View m2905h(View view, View view2, int i7) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i7);
            return keyboardNavigationClusterSearch;
        }

        /* renamed from: i */
        public static boolean m2906i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        /* renamed from: j */
        public static void m2907j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m2908k(View view, boolean z6) {
            view.setFocusedByDefault(z6);
        }

        /* renamed from: l */
        public static void m2909l(View view, int i7) {
            view.setImportantForAutofill(i7);
        }

        /* renamed from: m */
        public static void m2910m(View view, boolean z6) {
            view.setKeyboardNavigationCluster(z6);
        }

        /* renamed from: n */
        public static void m2911n(View view, int i7) {
            view.setNextClusterForwardId(i7);
        }

        /* renamed from: o */
        public static void m2912o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: e0.x$l */
    public static class l {
        /* JADX WARN: Type inference failed for: r0v1, types: [e0.y, java.lang.Object] */
        /* renamed from: a */
        public static void m2913a(View view, final q qVar) {
            int i7 = R$id.tag_unhandled_key_listeners;
            C1481o c1481o = (C1481o) view.getTag(i7);
            if (c1481o == null) {
                c1481o = new C1481o();
                view.setTag(i7, c1481o);
            }
            Objects.requireNonNull(qVar);
            ?? r02 = new View.OnUnhandledKeyEventListener() { // from class: e0.y
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C0946x.q.this.m2932a();
                }
            };
            c1481o.put(qVar, r02);
            view.addOnUnhandledKeyEventListener(r02);
        }

        /* renamed from: b */
        public static CharSequence m2914b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        /* renamed from: c */
        public static boolean m2915c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        /* renamed from: d */
        public static boolean m2916d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        /* renamed from: e */
        public static void m2917e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C1481o c1481o = (C1481o) view.getTag(R$id.tag_unhandled_key_listeners);
            if (c1481o == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1481o.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        public static <T> T m2918f(View view, int i7) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i7);
            return (T) requireViewById;
        }

        /* renamed from: g */
        public static void m2919g(View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        /* renamed from: h */
        public static void m2920h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m2921i(View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    /* renamed from: e0.x$m */
    public static class m {
        /* renamed from: a */
        public static View.AccessibilityDelegate m2922a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        /* renamed from: b */
        public static List<Rect> m2923b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        /* renamed from: c */
        public static void m2924c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }

        /* renamed from: d */
        public static void m2925d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: e0.x$n */
    public static class n {
        /* renamed from: a */
        public static CharSequence m2926a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        /* renamed from: b */
        public static C0937o0 m2927b(View view) {
            WindowInsetsController windowInsetsController;
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new C0937o0(windowInsetsController);
            }
            return null;
        }

        /* renamed from: c */
        public static void m2928c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: e0.x$o */
    public static final class o {
        /* renamed from: a */
        public static String[] m2929a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        /* renamed from: b */
        public static C0912c m2930b(View view, C0912c c0912c) {
            ContentInfo performReceiveContent;
            ContentInfo mo2667c = c0912c.f4778a.mo2667c();
            Objects.requireNonNull(mo2667c);
            performReceiveContent = view.performReceiveContent(mo2667c);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == mo2667c ? c0912c : new C0912c(new C0912c.d(performReceiveContent));
        }

        /* renamed from: c */
        public static void m2931c(View view, String[] strArr, InterfaceC0939q interfaceC0939q) {
            if (interfaceC0939q == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(interfaceC0939q));
            }
        }
    }

    /* renamed from: e0.x$p */
    public static final class p implements OnReceiveContentListener {

        /* renamed from: a */
        public final InterfaceC0939q f4891a;

        public p(InterfaceC0939q interfaceC0939q) {
            this.f4891a = interfaceC0939q;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0912c c0912c = new C0912c(new C0912c.d(contentInfo));
            C0912c mo2795a = this.f4891a.mo2795a(view, c0912c);
            if (mo2795a == null) {
                return null;
            }
            if (mo2795a == c0912c) {
                return contentInfo;
            }
            ContentInfo mo2667c = mo2795a.f4778a.mo2667c();
            Objects.requireNonNull(mo2667c);
            return mo2667c;
        }
    }

    /* renamed from: e0.x$q */
    public interface q {
        /* renamed from: a */
        boolean m2932a();
    }

    /* renamed from: e0.x$r */
    public static class r {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f4892d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f4893a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f4894b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f4895c = null;

        /* renamed from: b */
        public static boolean m2933b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).m2932a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final View m2934a(View view, KeyEvent keyEvent) {
            View m2934a;
            WeakHashMap<View, Boolean> weakHashMap = this.f4893a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        m2934a = m2934a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (m2934a == null);
                return m2934a;
            }
            if (m2933b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [e0.t] */
    static {
        new AtomicInteger(1);
        f4876a = null;
        f4878c = false;
        f4880e = new int[]{R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};
        f4881f = new InterfaceC0940r() { // from class: e0.t
            @Override // p034e0.InterfaceC0940r
            /* renamed from: a */
            public final C0912c mo841a(C0912c c0912c) {
                return c0912c;
            }
        };
        f4882g = new a();
    }

    /* renamed from: a */
    public static C0923h0 m2800a(View view) {
        if (f4876a == null) {
            f4876a = new WeakHashMap<>();
        }
        C0923h0 c0923h0 = f4876a.get(view);
        if (c0923h0 != null) {
            return c0923h0;
        }
        C0923h0 c0923h02 = new C0923h0(view);
        f4876a.put(view, c0923h02);
        return c0923h02;
    }

    /* renamed from: b */
    public static C0935n0 m2801b(View view, C0935n0 c0935n0) {
        WindowInsets m2756h = c0935n0.m2756h();
        if (m2756h != null) {
            WindowInsets m2865a = h.m2865a(view, m2756h);
            if (!m2865a.equals(m2756h)) {
                return C0935n0.m2749i(view, m2865a);
            }
        }
        return c0935n0;
    }

    /* renamed from: c */
    public static boolean m2802c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = r.f4892d;
        int i7 = R$id.tag_unhandled_key_event_manager;
        r rVar = (r) view.getTag(i7);
        if (rVar == null) {
            rVar = new r();
            view.setTag(i7, rVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = rVar.f4893a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = r.f4892d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rVar.f4893a == null) {
                        rVar.f4893a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = r.f4892d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rVar.f4893a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rVar.f4893a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m2934a = rVar.m2934a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m2934a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rVar.f4894b == null) {
                    rVar.f4894b = new SparseArray<>();
                }
                rVar.f4894b.put(keyCode, new WeakReference<>(m2934a));
            }
        }
        return m2934a != null;
    }

    /* renamed from: d */
    public static View.AccessibilityDelegate m2803d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.m2922a(view);
        }
        if (f4878c) {
            return null;
        }
        if (f4877b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4877b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4878c = true;
                return null;
            }
        }
        Object obj = f4877b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: e */
    public static CharSequence m2804e(View view) {
        Object tag;
        int i7 = R$id.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = l.m2914b(view);
        } else {
            tag = view.getTag(i7);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m2805f(View view) {
        int i7 = R$id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i7);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i7, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static Rect m2806g() {
        if (f4879d == null) {
            f4879d = new ThreadLocal<>();
        }
        Rect rect = f4879d.get();
        if (rect == null) {
            rect = new Rect();
            f4879d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: h */
    public static String[] m2807h(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.m2929a(view) : (String[]) view.getTag(R$id.tag_on_receive_content_mime_types);
    }

    /* renamed from: i */
    public static C0935n0 m2808i(View view) {
        return Build.VERSION.SDK_INT >= 23 ? j.m2894a(view) : i.m2877j(view);
    }

    /* renamed from: j */
    public static void m2809j(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = m2804e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (g.m2858a(view) != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                g.m2864g(obtain, i7);
                if (z6) {
                    obtain.getText().add(m2804e(view));
                    if (d.m2827c(view) == 0) {
                        d.m2843s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (d.m2827c((View) parent) == 4) {
                            d.m2843s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        g.m2862e(view.getParent(), view, view, i7);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            g.m2864g(obtain2, i7);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(m2804e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* renamed from: k */
    public static void m2810k(View view, int i7) {
        boolean z6;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i7);
            return;
        }
        Rect m2806g = m2806g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2806g.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z6 = !m2806g.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z6 = false;
        }
        view.offsetLeftAndRight(i7);
        if (view.getVisibility() == 0) {
            m2820u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m2820u((View) parent2);
            }
        }
        if (z6 && m2806g.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2806g);
        }
    }

    /* renamed from: l */
    public static void m2811l(View view, int i7) {
        boolean z6;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i7);
            return;
        }
        Rect m2806g = m2806g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2806g.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z6 = !m2806g.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z6 = false;
        }
        view.offsetTopAndBottom(i7);
        if (view.getVisibility() == 0) {
            m2820u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m2820u((View) parent2);
            }
        }
        if (z6 && m2806g.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2806g);
        }
    }

    /* renamed from: m */
    public static C0935n0 m2812m(View view, C0935n0 c0935n0) {
        WindowInsets m2756h = c0935n0.m2756h();
        if (m2756h != null) {
            WindowInsets m2866b = h.m2866b(view, m2756h);
            if (!m2866b.equals(m2756h)) {
                return C0935n0.m2749i(view, m2866b);
            }
        }
        return c0935n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static C0912c m2813n(View view, C0912c c0912c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0912c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.m2930b(view, c0912c);
        }
        InterfaceC0939q interfaceC0939q = (InterfaceC0939q) view.getTag(R$id.tag_on_receive_content_listener);
        InterfaceC0940r interfaceC0940r = f4881f;
        if (interfaceC0939q == null) {
            if (view instanceof InterfaceC0940r) {
                interfaceC0940r = (InterfaceC0940r) view;
            }
            return interfaceC0940r.mo841a(c0912c);
        }
        C0912c mo2795a = interfaceC0939q.mo2795a(view, c0912c);
        if (mo2795a == null) {
            return null;
        }
        if (view instanceof InterfaceC0940r) {
            interfaceC0940r = (InterfaceC0940r) view;
        }
        return interfaceC0940r.mo841a(mo2795a);
    }

    /* renamed from: o */
    public static void m2814o(View view, int i7) {
        ArrayList m2805f = m2805f(view);
        for (int i8 = 0; i8 < m2805f.size(); i8++) {
            if (((C1151g.a) m2805f.get(i8)).m3347a() == i7) {
                m2805f.remove(i8);
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m2815p(View view, C1151g.a aVar, InterfaceC1155k interfaceC1155k) {
        if (interfaceC1155k == null) {
            m2814o(view, aVar.m3347a());
            m2809j(view, 0);
            return;
        }
        C1151g.a aVar2 = new C1151g.a(null, aVar.f5699b, null, interfaceC1155k, aVar.f5700c);
        View.AccessibilityDelegate m2803d = m2803d(view);
        C0908a c0908a = m2803d == null ? null : m2803d instanceof C0908a.a ? ((C0908a.a) m2803d).f4776a : new C0908a(m2803d);
        if (c0908a == null) {
            c0908a = new C0908a();
        }
        m2817r(view, c0908a);
        m2814o(view, aVar2.m3347a());
        m2805f(view).add(aVar2);
        m2809j(view, 0);
    }

    /* renamed from: q */
    public static void m2816q(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.m2924c(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    /* renamed from: r */
    public static void m2817r(View view, C0908a c0908a) {
        if (c0908a == null && (m2803d(view) instanceof C0908a.a)) {
            c0908a = new C0908a();
        }
        view.setAccessibilityDelegate(c0908a == null ? null : c0908a.f4775b);
    }

    /* renamed from: s */
    public static void m2818s(View view, CharSequence charSequence) {
        new C0944v(R$id.tag_accessibility_pane_title).m2823e(view, charSequence);
        a aVar = f4882g;
        if (charSequence == null) {
            aVar.f4883c.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            d.m2839o(view.getViewTreeObserver(), aVar);
        } else {
            aVar.f4883c.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.m2859b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    /* renamed from: t */
    public static void m2819t(View view, ColorStateList colorStateList) {
        int i7 = Build.VERSION.SDK_INT;
        i.m2884q(view, colorStateList);
        if (i7 == 21) {
            Drawable background = view.getBackground();
            boolean z6 = (i.m2874g(view) == null && i.m2875h(view) == null) ? false : true;
            if (background == null || !z6) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            d.m2841q(view, background);
        }
    }

    /* renamed from: u */
    public static void m2820u(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
