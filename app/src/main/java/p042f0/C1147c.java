package p042f0;

import android.view.accessibility.AccessibilityManager;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class C1147c {
    /* renamed from: a */
    public static boolean m3333a(AccessibilityManager accessibilityManager, InterfaceC1148d interfaceC1148d) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1149e(interfaceC1148d));
    }

    /* renamed from: b */
    public static boolean m3334b(AccessibilityManager accessibilityManager, InterfaceC1148d interfaceC1148d) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1149e(interfaceC1148d));
    }
}
