package p036e2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: e2.t3 */
/* loaded from: classes.dex */
public abstract class AbstractC1093t3 {

    /* renamed from: a */
    public C1072q3 f5450a;

    @TargetApi(14)
    /* renamed from: e2.t3$a */
    public static class a extends AbstractC1093t3 {

        /* renamed from: b */
        public WeakReference<Activity> f5451b;

        /* renamed from: c */
        public final b f5452c;

        /* renamed from: d */
        public final WeakHashMap<View, C2297a> f5453d = new WeakHashMap<>();

        /* renamed from: e2.t3$a$a, reason: collision with other inner class name */
        public class C2297a extends View.AccessibilityDelegate {

            /* renamed from: a */
            public final View.AccessibilityDelegate f5454a;

            /* renamed from: b */
            public final View f5455b;

            /* renamed from: c */
            public volatile boolean f5456c;

            public C2297a(WeakReference weakReference, View view, View.AccessibilityDelegate accessibilityDelegate, boolean z6) {
                this.f5454a = accessibilityDelegate;
                a.this.f5451b = weakReference;
                this.f5455b = view;
                this.f5456c = z6;
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i7) {
                WeakReference<Activity> weakReference;
                Activity activity;
                try {
                    if (view == this.f5455b && i7 == 1 && (weakReference = a.this.f5451b) != null && (activity = weakReference.get()) != null) {
                        ((C1030k3) a.this.f5452c).m3094a(activity, view, this.f5456c);
                    }
                    View.AccessibilityDelegate accessibilityDelegate = this.f5454a;
                    if (accessibilityDelegate == null || (accessibilityDelegate instanceof C2297a) || accessibilityDelegate == this) {
                        super.sendAccessibilityEvent(view, i7);
                    } else {
                        accessibilityDelegate.sendAccessibilityEvent(view, i7);
                    }
                } catch (Throwable unused) {
                    a.this.mo3223a();
                    C1054o.m3127l().getClass();
                }
            }
        }

        public a(WeakReference weakReference, C1030k3 c1030k3) {
            this.f5451b = weakReference;
            this.f5452c = c1030k3;
        }

        @Override // p036e2.AbstractC1093t3
        /* renamed from: a */
        public final void mo3223a() {
            WeakHashMap<View, C2297a> weakHashMap = this.f5453d;
            if (weakHashMap == null) {
                return;
            }
            for (Map.Entry<View, C2297a> entry : weakHashMap.entrySet()) {
                entry.getKey().setAccessibilityDelegate(entry.getValue().f5454a);
            }
            weakHashMap.clear();
        }
    }

    /* renamed from: e2.t3$b */
    public interface b {
    }

    /* renamed from: a */
    public abstract void mo3223a();
}
