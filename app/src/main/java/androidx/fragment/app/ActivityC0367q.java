package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0142u;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0138e;
import androidx.activity.result.InterfaceC0139f;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0393e0;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0395f0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p136r0.C1820a;
import p159u.C1954a;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public class ActivityC0367q extends ComponentActivity implements C1954a.d, C1954a.e {

    /* renamed from: I1 */
    public boolean f1841I1;

    /* renamed from: J1 */
    public boolean f1842J1;

    /* renamed from: G1 */
    public final C0371s f1839G1 = new C0371s(new a());

    /* renamed from: H1 */
    public final C0401l f1840H1 = new C0401l(this);

    /* renamed from: K1 */
    public boolean f1843K1 = true;

    /* renamed from: androidx.fragment.app.q$a */
    public class a extends AbstractC0375u<ActivityC0367q> implements InterfaceC0395f0, InterfaceC0142u, InterfaceC0139f, InterfaceC0338b0 {
        public a() {
            super(ActivityC0367q.this);
        }

        @Override // androidx.fragment.app.AbstractC0375u
        /* renamed from: A */
        public final LayoutInflater mo1251A() {
            ActivityC0367q activityC0367q = ActivityC0367q.this;
            return activityC0367q.getLayoutInflater().cloneInContext(activityC0367q);
        }

        @Override // androidx.fragment.app.AbstractC0375u
        /* renamed from: B */
        public final void mo1252B() {
            ActivityC0367q.this.mo1250r();
        }

        @Override // androidx.activity.InterfaceC0142u
        /* renamed from: a */
        public final OnBackPressedDispatcher mo349a() {
            return ActivityC0367q.this.mo349a();
        }

        @Override // androidx.fragment.app.InterfaceC0338b0
        /* renamed from: d */
        public final void mo1145d() {
            ActivityC0367q.this.getClass();
        }

        @Override // androidx.activity.result.InterfaceC0139f
        /* renamed from: j */
        public final AbstractC0138e mo352j() {
            return ActivityC0367q.this.f181y1;
        }

        @Override // androidx.lifecycle.InterfaceC0395f0
        /* renamed from: k */
        public final C0393e0 mo353k() {
            return ActivityC0367q.this.mo353k();
        }

        @Override // androidx.lifecycle.InterfaceC0400k
        /* renamed from: m */
        public final C0401l mo354m() {
            return ActivityC0367q.this.f1840H1;
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: s */
        public final View mo390s(int i7) {
            return ActivityC0367q.this.findViewById(i7);
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: w */
        public final boolean mo394w() {
            Window window = ActivityC0367q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC0375u
        /* renamed from: y */
        public final void mo1253y(PrintWriter printWriter, String[] strArr) {
            ActivityC0367q.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0375u
        /* renamed from: z */
        public final ActivityC0367q mo1254z() {
            return ActivityC0367q.this;
        }
    }

    public ActivityC0367q() {
        this.f173X.f8684b.m1820b("android:support:fragments", new C0363o(this));
        m355o(new C0365p(this));
    }

    /* renamed from: q */
    public static boolean m1248q(AbstractC0378x abstractC0378x) {
        boolean z6 = false;
        for (ComponentCallbacksC0361n componentCallbacksC0361n : abstractC0378x.f1886c.m1171h()) {
            if (componentCallbacksC0361n != null) {
                AbstractC0375u<?> abstractC0375u = componentCallbacksC0361n.f1781I1;
                if ((abstractC0375u == null ? null : abstractC0375u.mo1254z()) != null) {
                    z6 |= m1248q(componentCallbacksC0361n.m1236g());
                }
                C0360m0 c0360m0 = componentCallbacksC0361n.f1805c2;
                AbstractC0394f.b bVar = AbstractC0394f.b.f1988s;
                if (c0360m0 != null) {
                    c0360m0.m1222e();
                    if (c0360m0.f1770e.f1992c.compareTo(bVar) >= 0) {
                        componentCallbacksC0361n.f1805c2.f1770e.m1381g();
                        z6 = true;
                    }
                }
                if (componentCallbacksC0361n.f1803b2.f1992c.compareTo(bVar) >= 0) {
                    componentCallbacksC0361n.f1803b2.m1381g();
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1841I1);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1842J1);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1843K1);
        if (getApplication() != null) {
            new C1820a(this, mo353k()).m4298y(str2, printWriter);
        }
        this.f1839G1.f1866a.f1868X.m1334u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p159u.C1954a.e
    @Deprecated
    /* renamed from: g */
    public final void mo1249g() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.f1839G1.m1267a();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C0371s c0371s = this.f1839G1;
        c0371s.m1267a();
        super.onConfigurationChanged(configuration);
        c0371s.f1866a.f1868X.m1322i(configuration);
    }

    @Override // androidx.activity.ComponentActivity, p159u.ActivityC1961h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1840H1.m1379e(AbstractC0394f.a.ON_CREATE);
        C0379y c0379y = this.f1839G1.f1866a.f1868X;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        super.onCreatePanelMenu(i7, menu);
        if (i7 != 0) {
            return true;
        }
        getMenuInflater();
        return this.f1839G1.f1866a.f1868X.m1324k() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1839G1.f1866a.f1868X.f1889f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1839G1.f1866a.f1868X.m1325l();
        this.f1840H1.m1379e(AbstractC0394f.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.f1839G1.f1866a.f1868X.m1326m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        C0371s c0371s = this.f1839G1;
        if (i7 == 0) {
            return c0371s.f1866a.f1868X.m1328o();
        }
        if (i7 != 6) {
            return false;
        }
        return c0371s.f1866a.f1868X.m1323j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        this.f1839G1.f1866a.f1868X.m1327n(z6);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f1839G1.m1267a();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        if (i7 == 0) {
            this.f1839G1.f1866a.f1868X.m1329p();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f1842J1 = false;
        this.f1839G1.f1866a.f1868X.m1333t(5);
        this.f1840H1.m1379e(AbstractC0394f.a.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        this.f1839G1.f1866a.f1868X.m1331r(z6);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1840H1.m1379e(AbstractC0394f.a.ON_RESUME);
        C0379y c0379y = this.f1839G1.f1866a.f1868X;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 == 0) {
            super.onPreparePanel(0, view, menu);
            return this.f1839G1.f1866a.f1868X.m1332s() | true;
        }
        super.onPreparePanel(i7, view, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f1839G1.m1267a();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0371s c0371s = this.f1839G1;
        c0371s.m1267a();
        super.onResume();
        this.f1842J1 = true;
        c0371s.f1866a.f1868X.m1337x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0371s c0371s = this.f1839G1;
        c0371s.m1267a();
        super.onStart();
        this.f1843K1 = false;
        boolean z6 = this.f1841I1;
        AbstractC0375u<?> abstractC0375u = c0371s.f1866a;
        if (!z6) {
            this.f1841I1 = true;
            C0379y c0379y = abstractC0375u.f1868X;
            c0379y.f1908y = false;
            c0379y.f1909z = false;
            c0379y.f1882F.f1636h = false;
            c0379y.m1333t(4);
        }
        abstractC0375u.f1868X.m1337x(true);
        this.f1840H1.m1379e(AbstractC0394f.a.ON_START);
        C0379y c0379y2 = abstractC0375u.f1868X;
        c0379y2.f1908y = false;
        c0379y2.f1909z = false;
        c0379y2.f1882F.f1636h = false;
        c0379y2.m1333t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1839G1.m1267a();
    }

    @Override // android.app.Activity
    public void onStop() {
        C0371s c0371s;
        super.onStop();
        this.f1843K1 = true;
        do {
            c0371s = this.f1839G1;
        } while (m1248q(c0371s.f1866a.f1868X));
        C0379y c0379y = c0371s.f1866a.f1868X;
        c0379y.f1909z = true;
        c0379y.f1882F.f1636h = true;
        c0379y.m1333t(4);
        this.f1840H1.m1379e(AbstractC0394f.a.ON_STOP);
    }

    @Deprecated
    /* renamed from: r */
    public void mo1250r() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1839G1.f1866a.f1868X.f1889f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
