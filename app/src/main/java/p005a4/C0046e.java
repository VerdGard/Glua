package p005a4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p034e0.C0908a;
import p042f0.C1151g;

/* renamed from: a4.e */
/* loaded from: classes.dex */
public final class C0046e extends C0908a {

    /* renamed from: d */
    public final /* synthetic */ BaseTransientBottomBar f131d;

    public C0046e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f131d = baseTransientBottomBar;
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        c1151g.m3336a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    @Override // p034e0.C0908a
    /* renamed from: g */
    public final boolean mo135g(View view, int i7, Bundle bundle) {
        if (i7 != 1048576) {
            return super.mo135g(view, i7, bundle);
        }
        this.f131d.mo2489a();
        return true;
    }
}
