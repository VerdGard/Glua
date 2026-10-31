package p016c;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.ext.Tools;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0157d;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.InterfaceC0163j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0240k;
import androidx.appcompat.widget.C0257p1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0238j0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p001a0.C0002a;
import p001a0.C0006e;
import p001a0.InterfaceC0010i;
import p002a1.C0017d;
import p016c.C0545b0;
import p016c.C0546c;
import p016c.C0549d0;
import p025d.C0872a;
import p026d0.C0874b;
import p033e.C0906d;
import p034e0.C0918f;
import p034e0.C0923h0;
import p034e0.C0946x;
import p049g.AbstractC1183a;
import p049g.C1185c;
import p049g.C1187e;
import p049g.C1188f;
import p049g.WindowCallbackC1190h;
import p089l.C1481o;
import p159u.C1962i;
import p173w.C2044f;

/* renamed from: c.n */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0560n extends AbstractC0559m implements C0159f.a, LayoutInflater.Factory2 {

    /* renamed from: A1 */
    public Window f2808A1;

    /* renamed from: B1 */
    public j f2809B1;

    /* renamed from: C1 */
    public final InterfaceC0557k f2810C1;

    /* renamed from: D1 */
    public AbstractC0542a f2811D1;

    /* renamed from: E1 */
    public C1188f f2812E1;

    /* renamed from: F1 */
    public CharSequence f2813F1;

    /* renamed from: G1 */
    public InterfaceC0238j0 f2814G1;

    /* renamed from: H1 */
    public d f2815H1;

    /* renamed from: I1 */
    public p f2816I1;

    /* renamed from: J1 */
    public AbstractC1183a f2817J1;

    /* renamed from: K1 */
    public ActionBarContextView f2818K1;

    /* renamed from: L1 */
    public PopupWindow f2819L1;

    /* renamed from: M1 */
    public RunnableC0563q f2820M1;

    /* renamed from: P1 */
    public boolean f2823P1;

    /* renamed from: Q1 */
    public ViewGroup f2824Q1;

    /* renamed from: R1 */
    public TextView f2825R1;

    /* renamed from: S1 */
    public View f2826S1;

    /* renamed from: T1 */
    public boolean f2827T1;

    /* renamed from: U1 */
    public boolean f2828U1;

    /* renamed from: V1 */
    public boolean f2829V1;

    /* renamed from: W1 */
    public boolean f2830W1;

    /* renamed from: X1 */
    public boolean f2831X1;

    /* renamed from: Y1 */
    public boolean f2832Y1;

    /* renamed from: Z1 */
    public boolean f2833Z1;

    /* renamed from: a2 */
    public boolean f2834a2;

    /* renamed from: b2 */
    public o[] f2835b2;

    /* renamed from: c2 */
    public o f2836c2;

    /* renamed from: d2 */
    public boolean f2837d2;

    /* renamed from: e2 */
    public boolean f2838e2;

    /* renamed from: f2 */
    public boolean f2839f2;

    /* renamed from: g2 */
    public boolean f2840g2;

    /* renamed from: h2 */
    public Configuration f2841h2;

    /* renamed from: i2 */
    public final int f2842i2;

    /* renamed from: j2 */
    public int f2843j2;

    /* renamed from: k2 */
    public int f2844k2;

    /* renamed from: l2 */
    public boolean f2845l2;

    /* renamed from: m2 */
    public m f2846m2;

    /* renamed from: n2 */
    public k f2847n2;

    /* renamed from: o2 */
    public boolean f2848o2;

    /* renamed from: p2 */
    public int f2849p2;

    /* renamed from: r2 */
    public boolean f2851r2;

    /* renamed from: s2 */
    public Rect f2852s2;

    /* renamed from: t2 */
    public Rect f2853t2;

    /* renamed from: u2 */
    public C0568v f2854u2;

    /* renamed from: v2 */
    public OnBackInvokedDispatcher f2855v2;

    /* renamed from: w2 */
    public OnBackInvokedCallback f2856w2;

    /* renamed from: y1 */
    public final Object f2857y1;

    /* renamed from: z1 */
    public final Context f2858z1;

    /* renamed from: x2 */
    public static final C1481o<String, Integer> f2805x2 = new C1481o<>();

    /* renamed from: y2 */
    public static final int[] f2806y2 = {R.attr.windowBackground};

    /* renamed from: z2 */
    public static final boolean f2807z2 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A2 */
    public static final boolean f2804A2 = true;

    /* renamed from: N1 */
    public C0923h0 f2821N1 = null;

    /* renamed from: O1 */
    public final boolean f2822O1 = true;

    /* renamed from: q2 */
    public final a f2850q2 = new a();

    /* renamed from: c.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if ((layoutInflaterFactory2C0560n.f2849p2 & 1) != 0) {
                layoutInflaterFactory2C0560n.m1946J(0);
            }
            if ((layoutInflaterFactory2C0560n.f2849p2 & 4096) != 0) {
                layoutInflaterFactory2C0560n.m1946J(108);
            }
            layoutInflaterFactory2C0560n.f2848o2 = false;
            layoutInflaterFactory2C0560n.f2849p2 = 0;
        }
    }

    /* renamed from: c.n$b */
    public class b implements C0546c.a {
        public b() {
        }

        @Override // p016c.C0546c.a
        /* renamed from: a */
        public final boolean mo1877a() {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            layoutInflaterFactory2C0560n.m1953R();
            AbstractC0542a abstractC0542a = layoutInflaterFactory2C0560n.f2811D1;
            return (abstractC0542a == null || (abstractC0542a.mo1857d() & 4) == 0) ? false : true;
        }

        @Override // p016c.C0546c.a
        /* renamed from: b */
        public final Drawable mo1878b() {
            int resourceId;
            Context mo1881e = mo1881e();
            TypedArray obtainStyledAttributes = mo1881e.obtainStyledAttributes((AttributeSet) null, new int[]{R$attr.homeAsUpIndicator});
            Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C0872a.m2561a(mo1881e, resourceId);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // p016c.C0546c.a
        /* renamed from: c */
        public final void mo1879c(int i7) {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            layoutInflaterFactory2C0560n.m1953R();
            AbstractC0542a abstractC0542a = layoutInflaterFactory2C0560n.f2811D1;
            if (abstractC0542a != null) {
                abstractC0542a.mo1867n(i7);
            }
        }

        @Override // p016c.C0546c.a
        /* renamed from: d */
        public final void mo1880d(C0906d c0906d, int i7) {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            layoutInflaterFactory2C0560n.m1953R();
            AbstractC0542a abstractC0542a = layoutInflaterFactory2C0560n.f2811D1;
            if (abstractC0542a != null) {
                abstractC0542a.mo1868o(c0906d);
                abstractC0542a.mo1867n(i7);
            }
        }

        @Override // p016c.C0546c.a
        /* renamed from: e */
        public final Context mo1881e() {
            return LayoutInflaterFactory2C0560n.this.m1949M();
        }
    }

    /* renamed from: c.n$c */
    public interface c {
    }

    /* renamed from: c.n$d */
    public final class d implements InterfaceC0163j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: b */
        public final void mo550b(C0159f c0159f, boolean z6) {
            LayoutInflaterFactory2C0560n.this.m1943F(c0159f);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: c */
        public final boolean mo551c(C0159f c0159f) {
            Window.Callback m1952Q = LayoutInflaterFactory2C0560n.this.m1952Q();
            if (m1952Q == null) {
                return true;
            }
            m1952Q.onMenuOpened(108, c0159f);
            return true;
        }
    }

    /* renamed from: c.n$e */
    public class e implements AbstractC1183a.a {

        /* renamed from: a */
        public final AbstractC1183a.a f2862a;

        /* renamed from: c.n$e$a */
        public class a extends C0017d {
            public a() {
            }

            @Override // p034e0.InterfaceC0925i0
            /* renamed from: a */
            public final void mo651a() {
                e eVar = e.this;
                LayoutInflaterFactory2C0560n.this.f2818K1.setVisibility(8);
                LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0560n.f2819L1;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0560n.f2818K1.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0560n.f2818K1.getParent();
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    C0946x.h.m2867c(view);
                }
                layoutInflaterFactory2C0560n.f2818K1.m568h();
                layoutInflaterFactory2C0560n.f2821N1.m2706d(null);
                layoutInflaterFactory2C0560n.f2821N1 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0560n.f2824Q1;
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                C0946x.h.m2867c(viewGroup);
            }
        }

        public e(AbstractC1183a.a aVar) {
            this.f2862a = aVar;
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: a */
        public final boolean mo1961a(AbstractC1183a abstractC1183a, C0159f c0159f) {
            return this.f2862a.mo1961a(abstractC1183a, c0159f);
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: b */
        public final boolean mo1962b(AbstractC1183a abstractC1183a, MenuItem menuItem) {
            return this.f2862a.mo1962b(abstractC1183a, menuItem);
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: c */
        public final boolean mo1963c(AbstractC1183a abstractC1183a, C0159f c0159f) {
            ViewGroup viewGroup = LayoutInflaterFactory2C0560n.this.f2824Q1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(viewGroup);
            return this.f2862a.mo1963c(abstractC1183a, c0159f);
        }

        @Override // p049g.AbstractC1183a.a
        /* renamed from: d */
        public final void mo1964d(AbstractC1183a abstractC1183a) {
            this.f2862a.mo1964d(abstractC1183a);
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (layoutInflaterFactory2C0560n.f2819L1 != null) {
                layoutInflaterFactory2C0560n.f2808A1.getDecorView().removeCallbacks(layoutInflaterFactory2C0560n.f2820M1);
            }
            if (layoutInflaterFactory2C0560n.f2818K1 != null) {
                C0923h0 c0923h0 = layoutInflaterFactory2C0560n.f2821N1;
                if (c0923h0 != null) {
                    c0923h0.m2704b();
                }
                C0923h0 m2800a = C0946x.m2800a(layoutInflaterFactory2C0560n.f2818K1);
                m2800a.m2703a(0.0f);
                layoutInflaterFactory2C0560n.f2821N1 = m2800a;
                m2800a.m2706d(new a());
            }
            InterfaceC0557k interfaceC0557k = layoutInflaterFactory2C0560n.f2810C1;
            if (interfaceC0557k != null) {
                interfaceC0557k.mo1904f();
            }
            layoutInflaterFactory2C0560n.f2817J1 = null;
            ViewGroup viewGroup = layoutInflaterFactory2C0560n.f2824Q1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(viewGroup);
            layoutInflaterFactory2C0560n.m1960Y();
        }
    }

    /* renamed from: c.n$f */
    public static class f {
        /* renamed from: a */
        public static void m1965a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: b */
        public static void m1966b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: c.n$g */
    public static class g {
        /* renamed from: a */
        public static String m1967a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: c.n$h */
    public static class h {
        /* renamed from: a */
        public static void m1968a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* renamed from: b */
        public static C0006e m1969b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return C0006e.m8b(languageTags);
        }

        /* renamed from: c */
        public static void m1970c(C0006e c0006e) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(c0006e.f6a.mo44a());
            LocaleList.setDefault(forLanguageTags);
        }

        /* renamed from: d */
        public static void m1971d(Configuration configuration, C0006e c0006e) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(c0006e.f6a.mo44a());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* renamed from: c.n$i */
    public static class i {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m1972a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m1973b(Object obj, LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n) {
            Objects.requireNonNull(layoutInflaterFactory2C0560n);
            C0565s c0565s = new C0565s(0, layoutInflaterFactory2C0560n);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, c0565s);
            return c0565s;
        }

        /* renamed from: c */
        public static void m1974c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: c.n$k */
    public class k extends l {

        /* renamed from: c */
        public final PowerManager f2870c;

        public k(Context context) {
            super();
            this.f2870c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: b */
        public final IntentFilter mo1976b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: c */
        public final int mo1977c() {
            return this.f2870c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: d */
        public final void mo1978d() {
            LayoutInflaterFactory2C0560n.this.m1940B(true, true);
        }
    }

    /* renamed from: c.n$l */
    public abstract class l {

        /* renamed from: a */
        public a f2872a;

        /* renamed from: c.n$l$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                l.this.mo1978d();
            }
        }

        public l() {
        }

        /* renamed from: a */
        public final void m1979a() {
            a aVar = this.f2872a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C0560n.this.f2858z1.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f2872a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo1976b();

        /* renamed from: c */
        public abstract int mo1977c();

        /* renamed from: d */
        public abstract void mo1978d();

        /* renamed from: e */
        public final void m1980e() {
            m1979a();
            IntentFilter mo1976b = mo1976b();
            if (mo1976b == null || mo1976b.countActions() == 0) {
                return;
            }
            if (this.f2872a == null) {
                this.f2872a = new a();
            }
            LayoutInflaterFactory2C0560n.this.f2858z1.registerReceiver(this.f2872a, mo1976b);
        }
    }

    /* renamed from: c.n$m */
    public class m extends l {

        /* renamed from: c */
        public final C0549d0 f2875c;

        public m(C0549d0 c0549d0) {
            super();
            this.f2875c = c0549d0;
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: b */
        public final IntentFilter mo1976b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: c */
        public final int mo1977c() {
            Location location;
            boolean z6;
            long j7;
            Location location2;
            C0549d0 c0549d0 = this.f2875c;
            C0549d0.a aVar = c0549d0.f2744c;
            if (aVar.f2746b > System.currentTimeMillis()) {
                z6 = aVar.f2745a;
            } else {
                Context context = c0549d0.f2742a;
                int m88m = C0017d.m88m(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = c0549d0.f2743b;
                if (m88m == 0) {
                    try {
                    } catch (Exception e7) {
                        Log.d("TwilightManager", "Failed to get last known location", e7);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (C0017d.m88m(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e8) {
                        Log.d("TwilightManager", "Failed to get last known location", e8);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C0547c0.f2735d == null) {
                        C0547c0.f2735d = new C0547c0();
                    }
                    C0547c0 c0547c0 = C0547c0.f2735d;
                    c0547c0.m1885a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    c0547c0.m1885a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                    r7 = c0547c0.f2738c == 1;
                    long j8 = c0547c0.f2737b;
                    long j9 = c0547c0.f2736a;
                    c0547c0.m1885a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                    long j10 = c0547c0.f2737b;
                    if (j8 == -1 || j9 == -1) {
                        j7 = 43200000 + currentTimeMillis;
                    } else {
                        j7 = (currentTimeMillis > j9 ? j10 + 0 : currentTimeMillis > j8 ? j9 + 0 : j8 + 0) + 60000;
                    }
                    aVar.f2745a = r7;
                    aVar.f2746b = j7;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i7 = Calendar.getInstance().get(11);
                    if (i7 < 6 || i7 >= 22) {
                        r7 = true;
                    }
                }
                z6 = r7;
            }
            return z6 ? 2 : 1;
        }

        @Override // p016c.LayoutInflaterFactory2C0560n.l
        /* renamed from: d */
        public final void mo1978d() {
            LayoutInflaterFactory2C0560n.this.m1940B(true, true);
        }
    }

    /* renamed from: c.n$n */
    public class n extends ContentFrameLayout {
        public n(C1185c c1185c) {
            super(c1185c, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0560n.this.m1945I(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x7 = (int) motionEvent.getX();
                int y7 = (int) motionEvent.getY();
                if (x7 < -5 || y7 < -5 || x7 > getWidth() + 5 || y7 > getHeight() + 5) {
                    LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
                    layoutInflaterFactory2C0560n.m1944G(layoutInflaterFactory2C0560n.m1951P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i7) {
            setBackgroundDrawable(C0872a.m2561a(getContext(), i7));
        }
    }

    /* renamed from: c.n$o */
    public static final class o {

        /* renamed from: a */
        public final int f2878a;

        /* renamed from: b */
        public int f2879b;

        /* renamed from: c */
        public int f2880c;

        /* renamed from: d */
        public int f2881d;

        /* renamed from: e */
        public n f2882e;

        /* renamed from: f */
        public View f2883f;

        /* renamed from: g */
        public View f2884g;

        /* renamed from: h */
        public C0159f f2885h;

        /* renamed from: i */
        public C0157d f2886i;

        /* renamed from: j */
        public C1185c f2887j;

        /* renamed from: k */
        public boolean f2888k;

        /* renamed from: l */
        public boolean f2889l;

        /* renamed from: m */
        public boolean f2890m;

        /* renamed from: n */
        public boolean f2891n = false;

        /* renamed from: o */
        public boolean f2892o;

        /* renamed from: p */
        public Bundle f2893p;

        public o(int i7) {
            this.f2878a = i7;
        }
    }

    /* renamed from: c.n$p */
    public final class p implements InterfaceC0163j.a {
        public p() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: b */
        public final void mo550b(C0159f c0159f, boolean z6) {
            o oVar;
            C0159f mo535k = c0159f.mo535k();
            int i7 = 0;
            boolean z7 = mo535k != c0159f;
            if (z7) {
                c0159f = mo535k;
            }
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            o[] oVarArr = layoutInflaterFactory2C0560n.f2835b2;
            int length = oVarArr != null ? oVarArr.length : 0;
            while (true) {
                if (i7 < length) {
                    oVar = oVarArr[i7];
                    if (oVar != null && oVar.f2885h == c0159f) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                if (!z7) {
                    layoutInflaterFactory2C0560n.m1944G(oVar, z6);
                } else {
                    layoutInflaterFactory2C0560n.m1942E(oVar.f2878a, oVar, mo535k);
                    layoutInflaterFactory2C0560n.m1944G(oVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0163j.a
        /* renamed from: c */
        public final boolean mo551c(C0159f c0159f) {
            Window.Callback m1952Q;
            if (c0159f != c0159f.mo535k()) {
                return true;
            }
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (!layoutInflaterFactory2C0560n.f2829V1 || (m1952Q = layoutInflaterFactory2C0560n.m1952Q()) == null || layoutInflaterFactory2C0560n.f2840g2) {
                return true;
            }
            m1952Q.onMenuOpened(108, c0159f);
            return true;
        }
    }

    public LayoutInflaterFactory2C0560n(Context context, Window window, InterfaceC0557k interfaceC0557k, Object obj) {
        C1481o<String, Integer> c1481o;
        Integer num;
        ActivityC0556j activityC0556j = null;
        this.f2842i2 = -100;
        this.f2858z1 = context;
        this.f2810C1 = interfaceC0557k;
        this.f2857y1 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ActivityC0556j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activityC0556j = (ActivityC0556j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (activityC0556j != null) {
                this.f2842i2 = activityC0556j.m1907s().mo1916g();
            }
        }
        if (this.f2842i2 == -100 && (num = (c1481o = f2805x2).get(this.f2857y1.getClass().getName())) != null) {
            this.f2842i2 = num.intValue();
            c1481o.remove(this.f2857y1.getClass().getName());
        }
        if (window != null) {
            m1941C(window);
        }
        C0240k.m809d();
    }

    /* renamed from: D */
    public static C0006e m1937D(Context context) {
        C0006e c0006e;
        C0006e m8b;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || (c0006e = AbstractC0559m.f2800m) == null) {
            return null;
        }
        C0006e m1939O = m1939O(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0010i interfaceC0010i = c0006e.f6a;
        int i8 = 0;
        if (i7 < 24) {
            m8b = interfaceC0010i.isEmpty() ? C0006e.f5b : C0006e.m8b(c0006e.m9c(0).toString());
        } else if (interfaceC0010i.isEmpty()) {
            m8b = C0006e.f5b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i8 < m1939O.f6a.size() + interfaceC0010i.size()) {
                Locale m9c = i8 < interfaceC0010i.size() ? c0006e.m9c(i8) : m1939O.m9c(i8 - interfaceC0010i.size());
                if (m9c != null) {
                    linkedHashSet.add(m9c);
                }
                i8++;
            }
            m8b = C0006e.m7a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return m8b.f6a.isEmpty() ? m1939O : m8b;
    }

    /* renamed from: H */
    public static Configuration m1938H(Context context, int i7, C0006e c0006e, Configuration configuration, boolean z6) {
        int i8 = i7 != 1 ? i7 != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (c0006e != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                h.m1971d(configuration2, c0006e);
            } else {
                f.m1966b(configuration2, c0006e.m9c(0));
                f.m1965a(configuration2, c0006e.m9c(0));
            }
        }
        return configuration2;
    }

    /* renamed from: O */
    public static C0006e m1939O(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? h.m1969b(configuration) : C0006e.m8b(g.m1967a(configuration.locale));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (p034e0.C0946x.g.m2860c(r9) != false) goto L49;
     */
    @Override // p016c.AbstractC0559m
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p049g.AbstractC1183a mo1911A(p049g.AbstractC1183a.a r9) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.mo1911A(g.a$a):g.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0242, code lost:
    
        if ((((androidx.lifecycle.InterfaceC0400k) r0).mo354m().f1992c.compareTo(androidx.lifecycle.AbstractC0394f.b.f1987m) >= 0) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x024d, code lost:
    
        r0.onConfigurationChanged(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x024b, code lost:
    
        if (r17.f2840g2 == false) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1940B(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.m1940B(boolean, boolean):boolean");
    }

    /* renamed from: C */
    public final void m1941C(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2808A1 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.f2809B1 = jVar;
        window.setCallback(jVar);
        Context context = this.f2858z1;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f2806y2);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0240k m807a = C0240k.m807a();
            synchronized (m807a) {
                drawable = m807a.f939a.m903f(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2808A1 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2855v2) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2856w2) != null) {
            i.m1974c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2856w2 = null;
        }
        Object obj = this.f2857y1;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                onBackInvokedDispatcher2 = i.m1972a(activity);
            }
        }
        this.f2855v2 = onBackInvokedDispatcher2;
        m1960Y();
    }

    /* renamed from: E */
    public final void m1942E(int i7, o oVar, C0159f c0159f) {
        if (c0159f == null) {
            if (oVar == null && i7 >= 0) {
                o[] oVarArr = this.f2835b2;
                if (i7 < oVarArr.length) {
                    oVar = oVarArr[i7];
                }
            }
            if (oVar != null) {
                c0159f = oVar.f2885h;
            }
        }
        if ((oVar == null || oVar.f2890m) && !this.f2840g2) {
            j jVar = this.f2809B1;
            Window.Callback callback = this.f2808A1.getCallback();
            jVar.getClass();
            try {
                jVar.f2865X = true;
                callback.onPanelClosed(i7, c0159f);
            } finally {
                jVar.f2865X = false;
            }
        }
    }

    /* renamed from: F */
    public final void m1943F(C0159f c0159f) {
        if (this.f2834a2) {
            return;
        }
        this.f2834a2 = true;
        this.f2814G1.mo581l();
        Window.Callback m1952Q = m1952Q();
        if (m1952Q != null && !this.f2840g2) {
            m1952Q.onPanelClosed(108, c0159f);
        }
        this.f2834a2 = false;
    }

    /* renamed from: G */
    public final void m1944G(o oVar, boolean z6) {
        n nVar;
        InterfaceC0238j0 interfaceC0238j0;
        if (z6 && oVar.f2878a == 0 && (interfaceC0238j0 = this.f2814G1) != null && interfaceC0238j0.mo571b()) {
            m1943F(oVar.f2885h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2858z1.getSystemService("window");
        if (windowManager != null && oVar.f2890m && (nVar = oVar.f2882e) != null) {
            windowManager.removeView(nVar);
            if (z6) {
                m1942E(oVar.f2878a, oVar, null);
            }
        }
        oVar.f2888k = false;
        oVar.f2889l = false;
        oVar.f2890m = false;
        oVar.f2883f = null;
        oVar.f2891n = true;
        if (this.f2836c2 == oVar) {
            this.f2836c2 = null;
        }
        if (oVar.f2878a == 0) {
            m1960Y();
        }
    }

    /* renamed from: I */
    public final boolean m1945I(KeyEvent keyEvent) {
        View decorView;
        boolean z6;
        boolean z7;
        Object obj = this.f2857y1;
        if (((obj instanceof C0918f.a) || (obj instanceof DialogC0567u)) && (decorView = this.f2808A1.getDecorView()) != null && C0918f.m2693a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            j jVar = this.f2809B1;
            Window.Callback callback = this.f2808A1.getCallback();
            jVar.getClass();
            try {
                jVar.f2869s = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                jVar.f2869s = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2837d2 = (keyEvent.getFlags() & Tools.Semaphore.f159S7) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                o m1951P = m1951P(0);
                if (m1951P.f2890m) {
                    return true;
                }
                m1958W(m1951P, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2817J1 != null) {
                    return true;
                }
                o m1951P2 = m1951P(0);
                InterfaceC0238j0 interfaceC0238j0 = this.f2814G1;
                Context context = this.f2858z1;
                if (interfaceC0238j0 == null || !interfaceC0238j0.mo576g() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z8 = m1951P2.f2890m;
                    if (z8 || m1951P2.f2889l) {
                        m1944G(m1951P2, true);
                        z6 = z8;
                    } else {
                        if (m1951P2.f2888k) {
                            if (m1951P2.f2892o) {
                                m1951P2.f2888k = false;
                                z7 = m1958W(m1951P2, keyEvent);
                            } else {
                                z7 = true;
                            }
                            if (z7) {
                                m1956U(m1951P2, keyEvent);
                                z6 = true;
                            }
                        }
                        z6 = false;
                    }
                } else if (this.f2814G1.mo571b()) {
                    z6 = this.f2814G1.mo574e();
                } else {
                    if (!this.f2840g2 && m1958W(m1951P2, keyEvent)) {
                        z6 = this.f2814G1.mo575f();
                    }
                    z6 = false;
                }
                if (!z6) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (m1955T()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m1946J(int i7) {
        o m1951P = m1951P(i7);
        if (m1951P.f2885h != null) {
            Bundle bundle = new Bundle();
            m1951P.f2885h.m544t(bundle);
            if (bundle.size() > 0) {
                m1951P.f2893p = bundle;
            }
            m1951P.f2885h.m547w();
            m1951P.f2885h.clear();
        }
        m1951P.f2892o = true;
        m1951P.f2891n = true;
        if ((i7 == 108 || i7 == 0) && this.f2814G1 != null) {
            o m1951P2 = m1951P(0);
            m1951P2.f2888k = false;
            m1958W(m1951P2, null);
        }
    }

    /* renamed from: K */
    public final void m1947K() {
        ViewGroup viewGroup;
        if (this.f2823P1) {
            return;
        }
        int[] iArr = R$styleable.f282j;
        Context context = this.f2858z1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i7 = R$styleable.AppCompatTheme_windowActionBar;
        if (!obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
            mo1927t(1);
        } else if (obtainStyledAttributes.getBoolean(i7, false)) {
            mo1927t(108);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo1927t(109);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo1927t(10);
        }
        this.f2832Y1 = obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        m1948L();
        this.f2808A1.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2833Z1) {
            viewGroup = (ViewGroup) from.inflate(this.f2831X1 ? R$layout.abc_screen_simple_overlay_action_mode : R$layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2832Y1) {
            viewGroup = (ViewGroup) from.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2830W1 = false;
            this.f2829V1 = false;
        } else if (this.f2829V1) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1185c(typedValue.resourceId, context) : context).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0238j0 interfaceC0238j0 = (InterfaceC0238j0) viewGroup.findViewById(R$id.decor_content_parent);
            this.f2814G1 = interfaceC0238j0;
            interfaceC0238j0.setWindowCallback(m1952Q());
            if (this.f2830W1) {
                this.f2814G1.mo580k(109);
            }
            if (this.f2827T1) {
                this.f2814G1.mo580k(2);
            }
            if (this.f2828U1) {
                this.f2814G1.mo580k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2829V1 + ", windowActionBarOverlay: " + this.f2830W1 + ", android:windowIsFloating: " + this.f2832Y1 + ", windowActionModeOverlay: " + this.f2831X1 + ", windowNoTitle: " + this.f2833Z1 + " }");
        }
        C0561o c0561o = new C0561o(this);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.i.m2888u(viewGroup, c0561o);
        if (this.f2814G1 == null) {
            this.f2825R1 = (TextView) viewGroup.findViewById(R$id.title);
        }
        Method method = C0257p1.f1047a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            e = e8;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2808A1.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2808A1.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0562p(this));
        this.f2824Q1 = viewGroup;
        Object obj = this.f2857y1;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2813F1;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0238j0 interfaceC0238j02 = this.f2814G1;
            if (interfaceC0238j02 != null) {
                interfaceC0238j02.setWindowTitle(title);
            } else {
                AbstractC0542a abstractC0542a = this.f2811D1;
                if (abstractC0542a != null) {
                    abstractC0542a.mo1870q(title);
                } else {
                    TextView textView = this.f2825R1;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2824Q1.findViewById(android.R.id.content);
        View decorView = this.f2808A1.getDecorView();
        contentFrameLayout2.f662y1.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
        if (C0946x.g.m2860c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        int i8 = R$styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes2.hasValue(i8)) {
            obtainStyledAttributes2.getValue(i8, contentFrameLayout2.getFixedWidthMajor());
        }
        int i9 = R$styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes2.hasValue(i9)) {
            obtainStyledAttributes2.getValue(i9, contentFrameLayout2.getFixedWidthMinor());
        }
        int i10 = R$styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes2.hasValue(i10)) {
            obtainStyledAttributes2.getValue(i10, contentFrameLayout2.getFixedHeightMajor());
        }
        int i11 = R$styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes2.hasValue(i11)) {
            obtainStyledAttributes2.getValue(i11, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f2823P1 = true;
        o m1951P = m1951P(0);
        if (this.f2840g2 || m1951P.f2885h != null) {
            return;
        }
        this.f2849p2 |= 4096;
        if (this.f2848o2) {
            return;
        }
        C0946x.d.m2837m(this.f2808A1.getDecorView(), this.f2850q2);
        this.f2848o2 = true;
    }

    /* renamed from: L */
    public final void m1948L() {
        if (this.f2808A1 == null) {
            Object obj = this.f2857y1;
            if (obj instanceof Activity) {
                m1941C(((Activity) obj).getWindow());
            }
        }
        if (this.f2808A1 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: M */
    public final Context m1949M() {
        m1953R();
        AbstractC0542a abstractC0542a = this.f2811D1;
        Context mo1858e = abstractC0542a != null ? abstractC0542a.mo1858e() : null;
        return mo1858e == null ? this.f2858z1 : mo1858e;
    }

    /* renamed from: N */
    public final l m1950N(Context context) {
        if (this.f2846m2 == null) {
            if (C0549d0.f2741d == null) {
                Context applicationContext = context.getApplicationContext();
                C0549d0.f2741d = new C0549d0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2846m2 = new m(C0549d0.f2741d);
        }
        return this.f2846m2;
    }

    /* renamed from: P */
    public final o m1951P(int i7) {
        o[] oVarArr = this.f2835b2;
        if (oVarArr == null || oVarArr.length <= i7) {
            o[] oVarArr2 = new o[i7 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f2835b2 = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i7];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i7);
        oVarArr[i7] = oVar2;
        return oVar2;
    }

    /* renamed from: Q */
    public final Window.Callback m1952Q() {
        return this.f2808A1.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1953R() {
        /*
            r3 = this;
            r3.m1947K()
            boolean r0 = r3.f2829V1
            if (r0 == 0) goto L33
            c.a r0 = r3.f2811D1
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.f2857y1
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            c.e0 r1 = new c.e0
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f2830W1
            r1.<init>(r0, r2)
        L1b:
            r3.f2811D1 = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            c.e0 r1 = new c.e0
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            c.a r0 = r3.f2811D1
            if (r0 == 0) goto L33
            boolean r1 = r3.f2851r2
            r0.mo1865l(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.m1953R():void");
    }

    /* renamed from: S */
    public final int m1954S(int i7, Context context) {
        l m1950N;
        if (i7 == -100) {
            return -1;
        }
        if (i7 == -1) {
            return i7;
        }
        if (i7 != 0) {
            if (i7 == 1 || i7 == 2) {
                return i7;
            }
            if (i7 != 3) {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
            if (this.f2847n2 == null) {
                this.f2847n2 = new k(context);
            }
            m1950N = this.f2847n2;
        } else {
            if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            m1950N = m1950N(context);
        }
        return m1950N.mo1977c();
    }

    /* renamed from: T */
    public final boolean m1955T() {
        boolean z6 = this.f2837d2;
        this.f2837d2 = false;
        o m1951P = m1951P(0);
        if (m1951P.f2890m) {
            if (!z6) {
                m1944G(m1951P, true);
            }
            return true;
        }
        AbstractC1183a abstractC1183a = this.f2817J1;
        if (abstractC1183a != null) {
            abstractC1183a.mo1890c();
            return true;
        }
        m1953R();
        AbstractC0542a abstractC0542a = this.f2811D1;
        return abstractC0542a != null && abstractC0542a.mo1855b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        if (r15.f458Z.getCount() > 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0140, code lost:
    
        if (r15 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1956U(p016c.LayoutInflaterFactory2C0560n.o r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.m1956U(c.n$o, android.view.KeyEvent):void");
    }

    /* renamed from: V */
    public final boolean m1957V(o oVar, int i7, KeyEvent keyEvent) {
        C0159f c0159f;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f2888k || m1958W(oVar, keyEvent)) && (c0159f = oVar.f2885h) != null) {
            return c0159f.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m1958W(o oVar, KeyEvent keyEvent) {
        InterfaceC0238j0 interfaceC0238j0;
        InterfaceC0238j0 interfaceC0238j02;
        Resources.Theme theme;
        InterfaceC0238j0 interfaceC0238j03;
        InterfaceC0238j0 interfaceC0238j04;
        if (this.f2840g2) {
            return false;
        }
        if (oVar.f2888k) {
            return true;
        }
        o oVar2 = this.f2836c2;
        if (oVar2 != null && oVar2 != oVar) {
            m1944G(oVar2, false);
        }
        Window.Callback m1952Q = m1952Q();
        int i7 = oVar.f2878a;
        if (m1952Q != null) {
            oVar.f2884g = m1952Q.onCreatePanelView(i7);
        }
        boolean z6 = i7 == 0 || i7 == 108;
        if (z6 && (interfaceC0238j04 = this.f2814G1) != null) {
            interfaceC0238j04.mo572c();
        }
        if (oVar.f2884g == null && (!z6 || !(this.f2811D1 instanceof C0545b0))) {
            C0159f c0159f = oVar.f2885h;
            if (c0159f == null || oVar.f2892o) {
                if (c0159f == null) {
                    Context context = this.f2858z1;
                    if ((i7 == 0 || i7 == 108) && this.f2814G1 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1185c c1185c = new C1185c(0, context);
                            c1185c.getTheme().setTo(theme);
                            context = c1185c;
                        }
                    }
                    C0159f c0159f2 = new C0159f(context);
                    c0159f2.f476e = this;
                    C0159f c0159f3 = oVar.f2885h;
                    if (c0159f2 != c0159f3) {
                        if (c0159f3 != null) {
                            c0159f3.m542r(oVar.f2886i);
                        }
                        oVar.f2885h = c0159f2;
                        C0157d c0157d = oVar.f2886i;
                        if (c0157d != null) {
                            c0159f2.m526b(c0157d, c0159f2.f472a);
                        }
                    }
                    if (oVar.f2885h == null) {
                        return false;
                    }
                }
                if (z6 && (interfaceC0238j02 = this.f2814G1) != null) {
                    if (this.f2815H1 == null) {
                        this.f2815H1 = new d();
                    }
                    interfaceC0238j02.mo570a(oVar.f2885h, this.f2815H1);
                }
                oVar.f2885h.m547w();
                if (!m1952Q.onCreatePanelMenu(i7, oVar.f2885h)) {
                    C0159f c0159f4 = oVar.f2885h;
                    if (c0159f4 != null) {
                        if (c0159f4 != null) {
                            c0159f4.m542r(oVar.f2886i);
                        }
                        oVar.f2885h = null;
                    }
                    if (z6 && (interfaceC0238j0 = this.f2814G1) != null) {
                        interfaceC0238j0.mo570a(null, this.f2815H1);
                    }
                    return false;
                }
                oVar.f2892o = false;
            }
            oVar.f2885h.m547w();
            Bundle bundle = oVar.f2893p;
            if (bundle != null) {
                oVar.f2885h.m543s(bundle);
                oVar.f2893p = null;
            }
            if (!m1952Q.onPreparePanel(0, oVar.f2884g, oVar.f2885h)) {
                if (z6 && (interfaceC0238j03 = this.f2814G1) != null) {
                    interfaceC0238j03.mo570a(null, this.f2815H1);
                }
                oVar.f2885h.m546v();
                return false;
            }
            oVar.f2885h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            oVar.f2885h.m546v();
        }
        oVar.f2888k = true;
        oVar.f2889l = false;
        this.f2836c2 = oVar;
        return true;
    }

    /* renamed from: X */
    public final void m1959X() {
        if (this.f2823P1) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: Y */
    public final void m1960Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f2855v2 != null && (m1951P(0).f2890m || this.f2817J1 != null)) {
                z6 = true;
            }
            if (z6 && this.f2856w2 == null) {
                this.f2856w2 = i.m1973b(this.f2855v2, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f2856w2) == null) {
                    return;
                }
                i.m1974c(this.f2855v2, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C0159f.a
    /* renamed from: a */
    public final boolean mo548a(C0159f c0159f, MenuItem menuItem) {
        o oVar;
        Window.Callback m1952Q = m1952Q();
        if (m1952Q != null && !this.f2840g2) {
            C0159f mo535k = c0159f.mo535k();
            o[] oVarArr = this.f2835b2;
            int length = oVarArr != null ? oVarArr.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    oVar = oVarArr[i7];
                    if (oVar != null && oVar.f2885h == mo535k) {
                        break;
                    }
                    i7++;
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                return m1952Q.onMenuItemSelected(oVar.f2878a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C0159f.a
    /* renamed from: b */
    public final void mo549b(C0159f c0159f) {
        InterfaceC0238j0 interfaceC0238j0 = this.f2814G1;
        if (interfaceC0238j0 == null || !interfaceC0238j0.mo576g() || (ViewConfiguration.get(this.f2858z1).hasPermanentMenuKey() && !this.f2814G1.mo573d())) {
            o m1951P = m1951P(0);
            m1951P.f2891n = true;
            m1944G(m1951P, false);
            m1956U(m1951P, null);
            return;
        }
        Window.Callback m1952Q = m1952Q();
        if (this.f2814G1.mo571b()) {
            this.f2814G1.mo574e();
            if (this.f2840g2) {
                return;
            }
            m1952Q.onPanelClosed(108, m1951P(0).f2885h);
            return;
        }
        if (m1952Q == null || this.f2840g2) {
            return;
        }
        if (this.f2848o2 && (1 & this.f2849p2) != 0) {
            View decorView = this.f2808A1.getDecorView();
            a aVar = this.f2850q2;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        o m1951P2 = m1951P(0);
        C0159f c0159f2 = m1951P2.f2885h;
        if (c0159f2 == null || m1951P2.f2892o || !m1952Q.onPreparePanel(0, m1951P2.f2884g, c0159f2)) {
            return;
        }
        m1952Q.onMenuOpened(108, m1951P2.f2885h);
        this.f2814G1.mo575f();
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: c */
    public final void mo1912c(View view, ViewGroup.LayoutParams layoutParams) {
        m1947K();
        ((ViewGroup) this.f2824Q1.findViewById(android.R.id.content)).addView(view, layoutParams);
        this.f2809B1.m1975a(this.f2808A1.getCallback());
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: d */
    public final Context mo1913d(Context context) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f2838e2 = true;
        int i15 = this.f2842i2;
        if (i15 == -100) {
            i15 = AbstractC0559m.f2799e;
        }
        int m1954S = m1954S(i15, context);
        int i16 = 0;
        if (AbstractC0559m.m1909l(context) && AbstractC0559m.m1909l(context)) {
            if (!C0002a.m1a()) {
                synchronized (AbstractC0559m.f2803x1) {
                    C0006e c0006e = AbstractC0559m.f2800m;
                    if (c0006e == null) {
                        if (AbstractC0559m.f2801s == null) {
                            AbstractC0559m.f2801s = C0006e.m8b(C0571y.m1992b(context));
                        }
                        if (!AbstractC0559m.f2801s.f6a.isEmpty()) {
                            AbstractC0559m.f2800m = AbstractC0559m.f2801s;
                        }
                    } else if (!c0006e.equals(AbstractC0559m.f2801s)) {
                        C0006e c0006e2 = AbstractC0559m.f2800m;
                        AbstractC0559m.f2801s = c0006e2;
                        C0571y.m1991a(context, c0006e2.f6a.mo44a());
                    }
                }
            } else if (!AbstractC0559m.f2796Y) {
                AbstractC0559m.f2798c.execute(new RunnableC0558l(i16, context));
            }
        }
        C0006e m1937D = m1937D(context);
        Configuration configuration = null;
        if (f2804A2 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m1938H(context, m1954S, m1937D, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C1185c) {
            try {
                ((C1185c) context).m3394a(m1938H(context, m1954S, m1937D, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2807z2) {
            return context;
        }
        int i17 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f7 = configuration3.fontScale;
                float f8 = configuration4.fontScale;
                if (f7 != f8) {
                    configuration.fontScale = f8;
                }
                int i18 = configuration3.mcc;
                int i19 = configuration4.mcc;
                if (i18 != i19) {
                    configuration.mcc = i19;
                }
                int i20 = configuration3.mnc;
                int i21 = configuration4.mnc;
                if (i20 != i21) {
                    configuration.mnc = i21;
                }
                if (i17 >= 24) {
                    h.m1968a(configuration3, configuration4, configuration);
                } else if (!C0874b.m2562a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i22 = configuration3.touchscreen;
                int i23 = configuration4.touchscreen;
                if (i22 != i23) {
                    configuration.touchscreen = i23;
                }
                int i24 = configuration3.keyboard;
                int i25 = configuration4.keyboard;
                if (i24 != i25) {
                    configuration.keyboard = i25;
                }
                int i26 = configuration3.keyboardHidden;
                int i27 = configuration4.keyboardHidden;
                if (i26 != i27) {
                    configuration.keyboardHidden = i27;
                }
                int i28 = configuration3.navigation;
                int i29 = configuration4.navigation;
                if (i28 != i29) {
                    configuration.navigation = i29;
                }
                int i30 = configuration3.navigationHidden;
                int i31 = configuration4.navigationHidden;
                if (i30 != i31) {
                    configuration.navigationHidden = i31;
                }
                int i32 = configuration3.orientation;
                int i33 = configuration4.orientation;
                if (i32 != i33) {
                    configuration.orientation = i33;
                }
                int i34 = configuration3.screenLayout & 15;
                int i35 = configuration4.screenLayout & 15;
                if (i34 != i35) {
                    configuration.screenLayout |= i35;
                }
                int i36 = configuration3.screenLayout & 192;
                int i37 = configuration4.screenLayout & 192;
                if (i36 != i37) {
                    configuration.screenLayout |= i37;
                }
                int i38 = configuration3.screenLayout & 48;
                int i39 = configuration4.screenLayout & 48;
                if (i38 != i39) {
                    configuration.screenLayout |= i39;
                }
                int i40 = configuration3.screenLayout & 768;
                int i41 = configuration4.screenLayout & 768;
                if (i40 != i41) {
                    configuration.screenLayout |= i41;
                }
                if (i17 >= 26) {
                    i7 = configuration3.colorMode;
                    int i42 = i7 & 3;
                    i8 = configuration4.colorMode;
                    if (i42 != (i8 & 3)) {
                        i13 = configuration.colorMode;
                        i14 = configuration4.colorMode;
                        configuration.colorMode = i13 | (i14 & 3);
                    }
                    i9 = configuration3.colorMode;
                    int i43 = i9 & 12;
                    i10 = configuration4.colorMode;
                    if (i43 != (i10 & 12)) {
                        i11 = configuration.colorMode;
                        i12 = configuration4.colorMode;
                        configuration.colorMode = i11 | (i12 & 12);
                    }
                }
                int i44 = configuration3.uiMode & 15;
                int i45 = configuration4.uiMode & 15;
                if (i44 != i45) {
                    configuration.uiMode |= i45;
                }
                int i46 = configuration3.uiMode & 48;
                int i47 = configuration4.uiMode & 48;
                if (i46 != i47) {
                    configuration.uiMode |= i47;
                }
                int i48 = configuration3.screenWidthDp;
                int i49 = configuration4.screenWidthDp;
                if (i48 != i49) {
                    configuration.screenWidthDp = i49;
                }
                int i50 = configuration3.screenHeightDp;
                int i51 = configuration4.screenHeightDp;
                if (i50 != i51) {
                    configuration.screenHeightDp = i51;
                }
                int i52 = configuration3.smallestScreenWidthDp;
                int i53 = configuration4.smallestScreenWidthDp;
                if (i52 != i53) {
                    configuration.smallestScreenWidthDp = i53;
                }
                int i54 = configuration3.densityDpi;
                int i55 = configuration4.densityDpi;
                if (i54 != i55) {
                    configuration.densityDpi = i55;
                }
            }
        }
        Configuration m1938H = m1938H(context, m1954S, m1937D, configuration, true);
        C1185c c1185c = new C1185c(R$style.Theme_AppCompat_Empty, context);
        c1185c.m3394a(m1938H);
        try {
            i16 = context.getTheme() == null ? 0 : 1;
        } catch (NullPointerException unused3) {
        }
        if (i16 != 0) {
            C2044f.f.m5073a(c1185c.getTheme());
        }
        return c1185c;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: e */
    public final <T extends View> T mo1914e(int i7) {
        m1947K();
        return (T) this.f2808A1.findViewById(i7);
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: f */
    public final Context mo1915f() {
        return this.f2858z1;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: g */
    public final int mo1916g() {
        return this.f2842i2;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: h */
    public final MenuInflater mo1917h() {
        if (this.f2812E1 == null) {
            m1953R();
            AbstractC0542a abstractC0542a = this.f2811D1;
            this.f2812E1 = new C1188f(abstractC0542a != null ? abstractC0542a.mo1858e() : this.f2858z1);
        }
        return this.f2812E1;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: i */
    public final AbstractC0542a mo1918i() {
        m1953R();
        return this.f2811D1;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: j */
    public final void mo1919j() {
        LayoutInflater from = LayoutInflater.from(this.f2858z1);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0560n) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: k */
    public final void mo1920k() {
        if (this.f2811D1 != null) {
            m1953R();
            if (this.f2811D1.mo1859f()) {
                return;
            }
            this.f2849p2 |= 1;
            if (this.f2848o2) {
                return;
            }
            View decorView = this.f2808A1.getDecorView();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2837m(decorView, this.f2850q2);
            this.f2848o2 = true;
        }
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: m */
    public final void mo1921m(Configuration configuration) {
        if (this.f2829V1 && this.f2823P1) {
            m1953R();
            AbstractC0542a abstractC0542a = this.f2811D1;
            if (abstractC0542a != null) {
                abstractC0542a.mo1860g();
            }
        }
        C0240k m807a = C0240k.m807a();
        Context context = this.f2858z1;
        synchronized (m807a) {
            m807a.f939a.m906k(context);
        }
        this.f2841h2 = new Configuration(this.f2858z1.getResources().getConfiguration());
        m1940B(false, false);
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: n */
    public final void mo1922n() {
        String str;
        this.f2838e2 = true;
        m1940B(false, true);
        m1948L();
        Object obj = this.f2857y1;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C1962i.m4574b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0542a abstractC0542a = this.f2811D1;
                if (abstractC0542a == null) {
                    this.f2851r2 = true;
                } else {
                    abstractC0542a.mo1865l(true);
                }
            }
            synchronized (AbstractC0559m.f2802w1) {
                AbstractC0559m.m1910s(this);
                AbstractC0559m.f2797Z.add(new WeakReference<>(this));
            }
        }
        this.f2841h2 = new Configuration(this.f2858z1.getResources().getConfiguration());
        this.f2839f2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // p016c.AbstractC0559m
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1923o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2857y1
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p016c.AbstractC0559m.f2802w1
            monitor-enter(r0)
            p016c.AbstractC0559m.m1910s(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f2848o2
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f2808A1
            android.view.View r0 = r0.getDecorView()
            c.n$a r1 = r3.f2850q2
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f2840g2 = r0
            int r0 = r3.f2842i2
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f2857y1
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            l.o<java.lang.String, java.lang.Integer> r0 = p016c.LayoutInflaterFactory2C0560n.f2805x2
            java.lang.Object r1 = r3.f2857y1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2842i2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            l.o<java.lang.String, java.lang.Integer> r0 = p016c.LayoutInflaterFactory2C0560n.f2805x2
            java.lang.Object r1 = r3.f2857y1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            c.a r0 = r3.f2811D1
            if (r0 == 0) goto L63
            r0.mo1861h()
        L63:
            c.n$m r0 = r3.f2846m2
            if (r0 == 0) goto L6a
            r0.m1979a()
        L6a:
            c.n$k r0 = r3.f2847n2
            if (r0 == 0) goto L71
            r0.m1979a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.mo1923o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff A[Catch: all -> 0x0209, Exception -> 0x020f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020f, all -> 0x0209, blocks: (B:36:0x01d8, B:39:0x01e5, B:41:0x01e9, B:49:0x01ff), top: B:35:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018c  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: p */
    public final void mo1924p() {
        m1953R();
        AbstractC0542a abstractC0542a = this.f2811D1;
        if (abstractC0542a != null) {
            abstractC0542a.mo1869p(true);
        }
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: q */
    public final void mo1925q() {
        m1940B(true, false);
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: r */
    public final void mo1926r() {
        m1953R();
        AbstractC0542a abstractC0542a = this.f2811D1;
        if (abstractC0542a != null) {
            abstractC0542a.mo1869p(false);
        }
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: t */
    public final boolean mo1927t(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.f2833Z1 && i7 == 108) {
            return false;
        }
        if (this.f2829V1 && i7 == 1) {
            this.f2829V1 = false;
        }
        if (i7 == 1) {
            m1959X();
            this.f2833Z1 = true;
            return true;
        }
        if (i7 == 2) {
            m1959X();
            this.f2827T1 = true;
            return true;
        }
        if (i7 == 5) {
            m1959X();
            this.f2828U1 = true;
            return true;
        }
        if (i7 == 10) {
            m1959X();
            this.f2831X1 = true;
            return true;
        }
        if (i7 == 108) {
            m1959X();
            this.f2829V1 = true;
            return true;
        }
        if (i7 != 109) {
            return this.f2808A1.requestFeature(i7);
        }
        m1959X();
        this.f2830W1 = true;
        return true;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: u */
    public final void mo1928u(int i7) {
        m1947K();
        ViewGroup viewGroup = (ViewGroup) this.f2824Q1.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2858z1).inflate(i7, viewGroup);
        this.f2809B1.m1975a(this.f2808A1.getCallback());
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: v */
    public final void mo1929v(View view) {
        m1947K();
        ViewGroup viewGroup = (ViewGroup) this.f2824Q1.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2809B1.m1975a(this.f2808A1.getCallback());
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: w */
    public final void mo1930w(View view, ViewGroup.LayoutParams layoutParams) {
        m1947K();
        ViewGroup viewGroup = (ViewGroup) this.f2824Q1.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2809B1.m1975a(this.f2808A1.getCallback());
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: x */
    public final void mo1931x(Toolbar toolbar) {
        Object obj = this.f2857y1;
        if (obj instanceof Activity) {
            m1953R();
            AbstractC0542a abstractC0542a = this.f2811D1;
            if (abstractC0542a instanceof C0551e0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2812E1 = null;
            if (abstractC0542a != null) {
                abstractC0542a.mo1861h();
            }
            this.f2811D1 = null;
            if (toolbar != null) {
                C0545b0 c0545b0 = new C0545b0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2813F1, this.f2809B1);
                this.f2811D1 = c0545b0;
                this.f2809B1.f2867e = c0545b0.f2711c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f2809B1.f2867e = null;
            }
            mo1920k();
        }
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: y */
    public final void mo1932y(int i7) {
        this.f2843j2 = i7;
    }

    @Override // p016c.AbstractC0559m
    /* renamed from: z */
    public final void mo1933z(CharSequence charSequence) {
        this.f2813F1 = charSequence;
        InterfaceC0238j0 interfaceC0238j0 = this.f2814G1;
        if (interfaceC0238j0 != null) {
            interfaceC0238j0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0542a abstractC0542a = this.f2811D1;
        if (abstractC0542a != null) {
            abstractC0542a.mo1870q(charSequence);
            return;
        }
        TextView textView = this.f2825R1;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c.n$j */
    public class j extends WindowCallbackC1190h {

        /* renamed from: X */
        public boolean f2865X;

        /* renamed from: e */
        public c f2867e;

        /* renamed from: m */
        public boolean f2868m;

        /* renamed from: s */
        public boolean f2869s;

        public j(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public final void m1975a(Window.Callback callback) {
            try {
                this.f2868m = true;
                callback.onContentChanged();
            } finally {
                this.f2868m = false;
            }
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f2869s ? this.f5851c.dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0560n.this.m1945I(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r6 != false) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[ORIG_RETURN, RETURN] */
        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4f
                int r0 = r6.getKeyCode()
                c.n r2 = p016c.LayoutInflaterFactory2C0560n.this
                r2.m1953R()
                c.a r3 = r2.f2811D1
                r4 = 0
                if (r3 == 0) goto L1c
                boolean r0 = r3.mo1862i(r0, r6)
                if (r0 == 0) goto L1c
                goto L48
            L1c:
                c.n$o r0 = r2.f2836c2
                if (r0 == 0) goto L31
                int r3 = r6.getKeyCode()
                boolean r0 = r2.m1957V(r0, r3, r6)
                if (r0 == 0) goto L31
                c.n$o r6 = r2.f2836c2
                if (r6 == 0) goto L48
                r6.f2889l = r1
                goto L48
            L31:
                c.n$o r0 = r2.f2836c2
                if (r0 != 0) goto L4a
                c.n$o r0 = r2.m1951P(r4)
                r2.m1958W(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.m1957V(r0, r3, r6)
                r0.f2888k = r4
                if (r6 == 0) goto L4a
            L48:
                r6 = 1
                goto L4b
            L4a:
                r6 = 0
            L4b:
                if (r6 == 0) goto L4e
                goto L4f
            L4e:
                r1 = 0
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p016c.LayoutInflaterFactory2C0560n.j.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f2868m) {
                this.f5851c.onContentChanged();
            }
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof C0159f)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final View onCreatePanelView(int i7) {
            c cVar = this.f2867e;
            if (cVar != null) {
                View view = i7 == 0 ? new View(C0545b0.this.f2709a.mo827l()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i7);
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (i7 == 108) {
                layoutInflaterFactory2C0560n.m1953R();
                AbstractC0542a abstractC0542a = layoutInflaterFactory2C0560n.f2811D1;
                if (abstractC0542a != null) {
                    abstractC0542a.mo1856c(true);
                }
            } else {
                layoutInflaterFactory2C0560n.getClass();
            }
            return true;
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final void onPanelClosed(int i7, Menu menu) {
            if (this.f2865X) {
                this.f5851c.onPanelClosed(i7, menu);
                return;
            }
            super.onPanelClosed(i7, menu);
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (i7 == 108) {
                layoutInflaterFactory2C0560n.m1953R();
                AbstractC0542a abstractC0542a = layoutInflaterFactory2C0560n.f2811D1;
                if (abstractC0542a != null) {
                    abstractC0542a.mo1856c(false);
                    return;
                }
                return;
            }
            if (i7 != 0) {
                layoutInflaterFactory2C0560n.getClass();
                return;
            }
            o m1951P = layoutInflaterFactory2C0560n.m1951P(i7);
            if (m1951P.f2890m) {
                layoutInflaterFactory2C0560n.m1944G(m1951P, false);
            }
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final boolean onPreparePanel(int i7, View view, Menu menu) {
            C0159f c0159f = menu instanceof C0159f ? (C0159f) menu : null;
            if (i7 == 0 && c0159f == null) {
                return false;
            }
            if (c0159f != null) {
                c0159f.f495x = true;
            }
            c cVar = this.f2867e;
            if (cVar != null) {
                C0545b0.e eVar = (C0545b0.e) cVar;
                if (i7 == 0) {
                    C0545b0 c0545b0 = C0545b0.this;
                    if (!c0545b0.f2712d) {
                        c0545b0.f2709a.f958m = true;
                        c0545b0.f2712d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i7, view, menu);
            if (c0159f != null) {
                c0159f.f495x = false;
            }
            return onPreparePanel;
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            C0159f c0159f = LayoutInflaterFactory2C0560n.this.m1951P(0).f2885h;
            if (c0159f != null) {
                super.onProvideKeyboardShortcuts(list, c0159f, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            }
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (!layoutInflaterFactory2C0560n.f2822O1) {
                return super.onWindowStartingActionMode(callback);
            }
            C1187e.a aVar = new C1187e.a(layoutInflaterFactory2C0560n.f2858z1, callback);
            AbstractC1183a mo1911A = layoutInflaterFactory2C0560n.mo1911A(aVar);
            if (mo1911A != null) {
                return aVar.m3397e(mo1911A);
            }
            return null;
        }

        @Override // p049g.WindowCallbackC1190h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = LayoutInflaterFactory2C0560n.this;
            if (layoutInflaterFactory2C0560n.f2822O1 && i7 == 0) {
                C1187e.a aVar = new C1187e.a(layoutInflaterFactory2C0560n.f2858z1, callback);
                AbstractC1183a mo1911A = layoutInflaterFactory2C0560n.mo1911A(aVar);
                if (mo1911A != null) {
                    return aVar.m3397e(mo1911A);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i7);
        }
    }
}
