package p042f0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p021c4.C0623k;
import p021c4.C0627o;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1149e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final InterfaceC1148d f5683a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1149e(InterfaceC1148d interfaceC1148d) {
        this.f5683a = interfaceC1148d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1149e) {
            return this.f5683a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1149e) obj).f5683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5683a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        C0627o c0627o = (C0627o) ((C0623k) this.f5683a).f3053e;
        AutoCompleteTextView autoCompleteTextView = c0627o.f3060h;
        if (autoCompleteTextView != null) {
            if (autoCompleteTextView.getInputType() != 0) {
                return;
            }
            int i7 = z6 ? 2 : 1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2843s(c0627o.f3074d, i7);
        }
    }
}
