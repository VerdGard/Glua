package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.R$id;
import p034e0.C0908a;
import p042f0.C1151g;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class C0860b extends C0908a {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f4610d;

    public C0860b(ClockFaceView clockFaceView) {
        this.f4610d = clockFaceView;
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
        if (intValue > 0) {
            TextView textView = this.f4610d.f4582P1.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(textView);
            }
        }
        c1151g.m3343h(C1151g.b.m3349a(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1151g.m3337b(C1151g.a.f5690g);
    }

    @Override // p034e0.C0908a
    /* renamed from: g */
    public final boolean mo135g(View view, int i7, Bundle bundle) {
        if (i7 != 16) {
            return super.mo135g(view, i7, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f4610d;
        view.getHitRect(clockFaceView.f4579M1);
        float centerX = clockFaceView.f4579M1.centerX();
        float centerY = clockFaceView.f4579M1.centerY();
        clockFaceView.f4578L1.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f4578L1.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
