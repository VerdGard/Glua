package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0859a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: c */
    public final /* synthetic */ ClockFaceView f4609c;

    public ViewTreeObserverOnPreDrawListenerC0859a(ClockFaceView clockFaceView) {
        this.f4609c = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f4609c;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f4578L1.f4601s) - clockFaceView.f4586T1;
        if (height != clockFaceView.f4612J1) {
            clockFaceView.f4612J1 = height;
            clockFaceView.mo2548g();
            int i7 = clockFaceView.f4612J1;
            ClockHandView clockHandView = clockFaceView.f4578L1;
            clockHandView.f4596D1 = i7;
            clockHandView.invalidate();
        }
        return true;
    }
}
