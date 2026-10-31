package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.f */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0864f implements View.OnTouchListener {

    /* renamed from: c */
    public final /* synthetic */ GestureDetector f4616c;

    public ViewOnTouchListenerC0864f(GestureDetector gestureDetector) {
        this.f4616c = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f4616c.onTouchEvent(motionEvent);
        }
        return false;
    }
}
