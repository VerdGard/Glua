package p042f0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: f0.h */
/* loaded from: classes.dex */
public class C1152h {

    /* renamed from: a */
    public final Object f5703a;

    /* renamed from: f0.h$a */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C1152h f5704a;

        public a(C1152h c1152h) {
            this.f5704a = c1152h;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
            C1151g mo3350a = this.f5704a.mo3350a(i7);
            if (mo3350a == null) {
                return null;
            }
            return mo3350a.f5685a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i7) {
            this.f5704a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i7, int i8, Bundle bundle) {
            return this.f5704a.mo3352c(i7, i8, bundle);
        }
    }

    /* renamed from: f0.h$b */
    public static class b extends a {
        public b(C1152h c1152h) {
            super(c1152h);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i7) {
            C1151g mo3351b = this.f5704a.mo3351b(i7);
            if (mo3351b == null) {
                return null;
            }
            return mo3351b.f5685a;
        }
    }

    /* renamed from: f0.h$c */
    public static class c extends b {
        public c(C1152h c1152h) {
            super(c1152h);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f5704a.getClass();
        }
    }

    public C1152h() {
        this.f5703a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public C1152h(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f5703a = accessibilityNodeProvider;
    }

    /* renamed from: a */
    public C1151g mo3350a(int i7) {
        return null;
    }

    /* renamed from: b */
    public C1151g mo3351b(int i7) {
        return null;
    }

    /* renamed from: c */
    public boolean mo3352c(int i7, int i8, Bundle bundle) {
        return false;
    }
}
