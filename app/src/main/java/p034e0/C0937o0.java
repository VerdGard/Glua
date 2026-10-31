package p034e0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.RunnableC0123h;
import p089l.C1481o;

/* renamed from: e0.o0 */
/* loaded from: classes.dex */
public final class C0937o0 {

    /* renamed from: a */
    public final e f4868a;

    /* renamed from: e0.o0$a */
    public static class a extends e {

        /* renamed from: a */
        public final Window f4869a;

        /* renamed from: b */
        public final View f4870b;

        public a(Window window, View view) {
            this.f4869a = window;
            this.f4870b = view;
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: c */
        public final void mo2791c() {
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((8 & i7) != 0) {
                    Window window = this.f4869a;
                    int i8 = 4;
                    if (i7 == 1) {
                        m2792d(4);
                        window.clearFlags(1024);
                    } else if (i7 == 2) {
                        m2792d(2);
                    } else if (i7 == 8) {
                        View view = this.f4870b;
                        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                            view.requestFocus();
                        } else {
                            view = window.getCurrentFocus();
                        }
                        if (view == null) {
                            view = window.findViewById(android.R.id.content);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new RunnableC0123h(i8, view));
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public final void m2792d(int i7) {
            View decorView = this.f4869a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: e0.o0$b */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: b */
        public final void mo2793b(boolean z6) {
            if (!z6) {
                m2792d(8192);
                return;
            }
            Window window = this.f4869a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: e0.o0$c */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: a */
        public final void mo2794a(boolean z6) {
            if (!z6) {
                m2792d(16);
                return;
            }
            Window window = this.f4869a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: e0.o0$d */
    public static class d extends e {

        /* renamed from: a */
        public final WindowInsetsController f4871a;

        /* renamed from: b */
        public final Window f4872b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.view.Window r2) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = p034e0.C0948z.m2940f(r2)
                r1.<init>(r0)
                r1.f4872b = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p034e0.C0937o0.d.<init>(android.view.Window):void");
        }

        public d(WindowInsetsController windowInsetsController) {
            new C1481o();
            this.f4871a = windowInsetsController;
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: a */
        public final void mo2794a(boolean z6) {
            WindowInsetsController windowInsetsController = this.f4871a;
            Window window = this.f4872b;
            if (z6) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: b */
        public final void mo2793b(boolean z6) {
            WindowInsetsController windowInsetsController = this.f4871a;
            Window window = this.f4872b;
            if (z6) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // p034e0.C0937o0.e
        /* renamed from: c */
        public final void mo2791c() {
            Window window = this.f4872b;
            if (window != null && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f4871a.show(8);
        }
    }

    /* renamed from: e0.o0$e */
    public static class e {
        /* renamed from: a */
        public void mo2794a(boolean z6) {
        }

        /* renamed from: b */
        public void mo2793b(boolean z6) {
        }

        /* renamed from: c */
        public void mo2791c() {
            throw null;
        }
    }

    public C0937o0(Window window, View view) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f4868a = new d(window);
        } else {
            this.f4868a = i7 >= 26 ? new c(window, view) : i7 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    @Deprecated
    public C0937o0(WindowInsetsController windowInsetsController) {
        this.f4868a = new d(windowInsetsController);
    }
}
