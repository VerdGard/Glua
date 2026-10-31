package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0138e;
import androidx.activity.result.InterfaceC0139f;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0391d0;
import androidx.lifecycle.C0393e0;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.C0413x;
import androidx.lifecycle.C0415z;
import androidx.lifecycle.FragmentC0410u;
import androidx.lifecycle.InterfaceC0392e;
import androidx.lifecycle.InterfaceC0395f0;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.savedstate.C0493a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.InterfaceC0001b;
import p023c6.InterfaceC0655a;
import p026d0.InterfaceC0873a;
import p032d6.C0898f;
import p034e0.C0922h;
import p034e0.InterfaceC0926j;
import p073j.C1396b;
import p128q0.AbstractC1721a;
import p128q0.C1723c;
import p152t0.C1919b;
import p152t0.InterfaceC1920c;
import p159u.ActivityC1961h;
import p167v0.C2010a;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC1961h implements InterfaceC0395f0, InterfaceC0392e, InterfaceC1920c, InterfaceC0142u, InterfaceC0139f {

    /* renamed from: A1 */
    public final CopyOnWriteArrayList<InterfaceC0873a<Integer>> f167A1;

    /* renamed from: B1 */
    public final CopyOnWriteArrayList<InterfaceC0873a<Intent>> f168B1;

    /* renamed from: C1 */
    public final CopyOnWriteArrayList<InterfaceC0873a<C0391d0>> f169C1;

    /* renamed from: D1 */
    public final CopyOnWriteArrayList<InterfaceC0873a<C0143v>> f170D1;

    /* renamed from: E1 */
    public boolean f171E1;

    /* renamed from: F1 */
    public boolean f172F1;

    /* renamed from: X */
    public final C1919b f173X;

    /* renamed from: Y */
    public C0393e0 f174Y;

    /* renamed from: Z */
    public OnBackPressedDispatcher f175Z;

    /* renamed from: e */
    public final C0000a f176e = new C0000a();

    /* renamed from: m */
    public final C0922h f177m = new C0922h();

    /* renamed from: s */
    public final C0401l f178s;

    /* renamed from: w1 */
    public final ExecutorC0112e f179w1;

    /* renamed from: x1 */
    public final C0126k f180x1;

    /* renamed from: y1 */
    public final C0108a f181y1;

    /* renamed from: z1 */
    public final CopyOnWriteArrayList<InterfaceC0873a<Configuration>> f182z1;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0108a extends AbstractC0138e {
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class RunnableC0109b implements Runnable {
        public RunnableC0109b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            } catch (NullPointerException e8) {
                if (!TextUtils.equals(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e8;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static class C0110c {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m358a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public static final class C0111d {

        /* renamed from: a */
        public C0393e0 f188a;
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    public class ExecutorC0112e implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: e */
        public Runnable f190e;

        /* renamed from: c */
        public final long f189c = SystemClock.uptimeMillis() + 10000;

        /* renamed from: m */
        public boolean f191m = false;

        public ExecutorC0112e() {
        }

        /* renamed from: a */
        public final void m359a(View view) {
            if (this.f191m) {
                return;
            }
            this.f191m = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f190e = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f191m) {
                decorView.postOnAnimation(new RunnableC0119d(1, this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z6;
            Runnable runnable = this.f190e;
            if (runnable != null) {
                runnable.run();
                this.f190e = null;
                C0126k c0126k = ComponentActivity.this.f180x1;
                synchronized (c0126k.f236b) {
                    z6 = c0126k.f237c;
                }
                if (!z6) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f189c) {
                return;
            }
            this.f191m = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.e] */
    public ComponentActivity() {
        C0401l c0401l = new C0401l(this);
        this.f178s = c0401l;
        C1919b c1919b = new C1919b(this);
        this.f173X = c1919b;
        C0493a.b bVar = null;
        this.f175Z = null;
        ExecutorC0112e executorC0112e = new ExecutorC0112e();
        this.f179w1 = executorC0112e;
        this.f180x1 = new C0126k(executorC0112e, new InterfaceC0655a() { // from class: androidx.activity.e
            @Override // p023c6.InterfaceC0655a
            /* renamed from: a */
            public final Object mo373a() {
                ComponentActivity.this.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f181y1 = new C0108a();
        this.f182z1 = new CopyOnWriteArrayList<>();
        this.f167A1 = new CopyOnWriteArrayList<>();
        this.f168B1 = new CopyOnWriteArrayList<>();
        this.f169C1 = new CopyOnWriteArrayList<>();
        this.f170D1 = new CopyOnWriteArrayList<>();
        this.f171E1 = false;
        this.f172F1 = false;
        c0401l.mo1373a(new InterfaceC0398i() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.InterfaceC0398i
            /* renamed from: d */
            public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                if (aVar == AbstractC0394f.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0401l.mo1373a(new InterfaceC0398i() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0398i
            /* renamed from: d */
            public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                if (aVar == AbstractC0394f.a.ON_DESTROY) {
                    ComponentActivity.this.f176e.f1b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo353k().m1372a();
                    }
                    ExecutorC0112e executorC0112e2 = ComponentActivity.this.f179w1;
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.getWindow().getDecorView().removeCallbacks(executorC0112e2);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0112e2);
                }
            }
        });
        c0401l.mo1373a(new InterfaceC0398i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0398i
            /* renamed from: d */
            public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f174Y == null) {
                    C0111d c0111d = (C0111d) componentActivity.getLastNonConfigurationInstance();
                    if (c0111d != null) {
                        componentActivity.f174Y = c0111d.f188a;
                    }
                    if (componentActivity.f174Y == null) {
                        componentActivity.f174Y = new C0393e0();
                    }
                }
                componentActivity.f178s.mo1374b(this);
            }
        });
        c1919b.m4532a();
        AbstractC0394f.b bVar2 = c0401l.f1992c;
        if (!(bVar2 == AbstractC0394f.b.f1986e || bVar2 == AbstractC0394f.b.f1987m)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C0493a c0493a = c1919b.f8684b;
        c0493a.getClass();
        Iterator<Map.Entry<String, C0493a.b>> it = c0493a.f2503a.iterator();
        while (true) {
            C1396b.e eVar = (C1396b.e) it;
            if (!eVar.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            C0898f.m2605d(entry, "components");
            String str = (String) entry.getKey();
            C0493a.b bVar3 = (C0493a.b) entry.getValue();
            if (C0898f.m2602a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                bVar = bVar3;
                break;
            }
        }
        if (bVar == null) {
            C0415z c0415z = new C0415z(this.f173X.f8684b, this);
            this.f173X.f8684b.m1820b("androidx.lifecycle.internal.SavedStateHandlesProvider", c0415z);
            this.f178s.mo1373a(new SavedStateHandleAttacher(c0415z));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            this.f178s.mo1373a(new ImmLeaksCleaner(this));
        }
        this.f173X.f8684b.m1820b("android:support:activity-result", new C0493a.b() { // from class: androidx.activity.f
            @Override // androidx.savedstate.C0493a.b
            /* renamed from: a */
            public final Bundle mo374a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.C0108a c0108a = componentActivity.f181y1;
                c0108a.getClass();
                HashMap hashMap = c0108a.f254b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0108a.f256d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0108a.f259g.clone());
                return bundle;
            }
        });
        m355o(new InterfaceC0001b() { // from class: androidx.activity.g
            @Override // p000a.InterfaceC0001b
            /* renamed from: a */
            public final void mo0a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                Bundle m1819a = componentActivity.f173X.f8684b.m1819a("android:support:activity-result");
                if (m1819a != null) {
                    ComponentActivity.C0108a c0108a = componentActivity.f181y1;
                    c0108a.getClass();
                    ArrayList<Integer> integerArrayList = m1819a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = m1819a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0108a.f256d = m1819a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = m1819a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0108a.f259g;
                    bundle2.putAll(bundle);
                    for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                        String str2 = stringArrayList.get(i7);
                        HashMap hashMap = c0108a.f254b;
                        boolean containsKey = hashMap.containsKey(str2);
                        HashMap hashMap2 = c0108a.f253a;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                hashMap2.remove(num);
                            }
                        }
                        int intValue = integerArrayList.get(i7).intValue();
                        String str3 = stringArrayList.get(i7);
                        hashMap2.put(Integer.valueOf(intValue), str3);
                        hashMap.put(str3, Integer.valueOf(intValue));
                    }
                }
            }
        });
    }

    @Override // androidx.activity.InterfaceC0142u
    /* renamed from: a */
    public final OnBackPressedDispatcher mo349a() {
        if (this.f175Z == null) {
            this.f175Z = new OnBackPressedDispatcher(new RunnableC0109b());
            this.f178s.mo1373a(new InterfaceC0398i() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.InterfaceC0398i
                /* renamed from: d */
                public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                    if (aVar != AbstractC0394f.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    OnBackPressedDispatcher onBackPressedDispatcher = ComponentActivity.this.f175Z;
                    OnBackInvokedDispatcher m358a = C0110c.m358a((ComponentActivity) interfaceC0400k);
                    onBackPressedDispatcher.getClass();
                    C0898f.m2606e(m358a, "invoker");
                    onBackPressedDispatcher.f203f = m358a;
                    onBackPressedDispatcher.m362c(onBackPressedDispatcher.f205h);
                }
            });
        }
        return this.f175Z;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m356p();
        this.f179w1.m359a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p152t0.InterfaceC1920c
    /* renamed from: b */
    public final C0493a mo350b() {
        return this.f173X.f8684b;
    }

    @Override // androidx.lifecycle.InterfaceC0392e
    /* renamed from: h */
    public final AbstractC1721a mo351h() {
        C1723c c1723c = new C1723c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c1723c.f7882a;
        if (application != null) {
            linkedHashMap.put(C0143v.f262a, getApplication());
        }
        linkedHashMap.put(C0413x.f2021a, this);
        linkedHashMap.put(C0413x.f2022b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(C0413x.f2023c, getIntent().getExtras());
        }
        return c1723c;
    }

    @Override // androidx.activity.result.InterfaceC0139f
    /* renamed from: j */
    public final AbstractC0138e mo352j() {
        return this.f181y1;
    }

    @Override // androidx.lifecycle.InterfaceC0395f0
    /* renamed from: k */
    public final C0393e0 mo353k() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f174Y == null) {
            C0111d c0111d = (C0111d) getLastNonConfigurationInstance();
            if (c0111d != null) {
                this.f174Y = c0111d.f188a;
            }
            if (this.f174Y == null) {
                this.f174Y = new C0393e0();
            }
        }
        return this.f174Y;
    }

    @Override // p159u.ActivityC1961h, androidx.lifecycle.InterfaceC0400k
    /* renamed from: m */
    public final C0401l mo354m() {
        return this.f178s;
    }

    /* renamed from: o */
    public final void m355o(InterfaceC0001b interfaceC0001b) {
        C0000a c0000a = this.f176e;
        c0000a.getClass();
        if (c0000a.f1b != null) {
            interfaceC0001b.mo0a();
        }
        c0000a.f0a.add(interfaceC0001b);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f181y1.m396a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void onBackPressed() {
        mo349a().m361b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0873a<Configuration>> it = this.f182z1.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // p159u.ActivityC1961h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f173X.m4533b(bundle);
        C0000a c0000a = this.f176e;
        c0000a.getClass();
        c0000a.f1b = this;
        Iterator it = c0000a.f0a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0001b) it.next()).mo0a();
        }
        super.onCreate(bundle);
        int i7 = FragmentC0410u.f2012e;
        FragmentC0410u.b.m1411b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator<InterfaceC0926j> it = this.f177m.f4800a.iterator();
        while (it.hasNext()) {
            it.next().m2723b();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator<InterfaceC0926j> it = this.f177m.f4800a.iterator();
        while (it.hasNext()) {
            if (it.next().m2724c()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.f171E1) {
            return;
        }
        Iterator<InterfaceC0873a<C0391d0>> it = this.f169C1.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0391d0());
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        this.f171E1 = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f171E1 = false;
            Iterator<InterfaceC0873a<C0391d0>> it = this.f169C1.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0391d0(0));
            }
        } catch (Throwable th) {
            this.f171E1 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC0873a<Intent>> it = this.f168B1.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        Iterator<InterfaceC0926j> it = this.f177m.f4800a.iterator();
        while (it.hasNext()) {
            it.next().m2722a();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.f172F1) {
            return;
        }
        Iterator<InterfaceC0873a<C0143v>> it = this.f170D1.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0143v());
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        this.f172F1 = true;
        int i7 = 0;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f172F1 = false;
            Iterator<InterfaceC0873a<C0143v>> it = this.f170D1.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0143v(i7));
            }
        } catch (Throwable th) {
            this.f172F1 = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator<InterfaceC0926j> it = this.f177m.f4800a.iterator();
        while (it.hasNext()) {
            it.next().m2725d();
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.f181y1.m396a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0111d c0111d;
        C0393e0 c0393e0 = this.f174Y;
        if (c0393e0 == null && (c0111d = (C0111d) getLastNonConfigurationInstance()) != null) {
            c0393e0 = c0111d.f188a;
        }
        if (c0393e0 == null) {
            return null;
        }
        C0111d c0111d2 = new C0111d();
        c0111d2.f188a = c0393e0;
        return c0111d2;
    }

    @Override // p159u.ActivityC1961h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0401l c0401l = this.f178s;
        if (c0401l instanceof C0401l) {
            c0401l.m1381g();
        }
        super.onSaveInstanceState(bundle);
        this.f173X.m4534c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<InterfaceC0873a<Integer>> it = this.f167A1.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    /* renamed from: p */
    public final void m356p() {
        View decorView = getWindow().getDecorView();
        C0898f.m2606e(decorView, "<this>");
        decorView.setTag(androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        C0898f.m2606e(decorView2, "<this>");
        decorView2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        C0898f.m2606e(decorView3, "<this>");
        decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        C0898f.m2606e(decorView4, "<this>");
        decorView4.setTag(R$id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        C0898f.m2606e(decorView5, "<this>");
        decorView5.setTag(R$id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C2010a.m4908a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f180x1.m376a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        m356p();
        this.f179w1.m359a(getWindow().getDecorView());
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m356p();
        this.f179w1.m359a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m356p();
        this.f179w1.m359a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
