package p131q3;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import p034e0.C0908a;
import p042f0.C1151g;

/* renamed from: q3.a */
/* loaded from: classes.dex */
public final class C1745a extends C0908a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f7970d;

    public C1745a(CheckableImageButton checkableImageButton) {
        this.f7970d = checkableImageButton;
    }

    @Override // p034e0.C0908a
    /* renamed from: c */
    public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1026c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f7970d.isChecked());
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f7970d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f4315w1);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
