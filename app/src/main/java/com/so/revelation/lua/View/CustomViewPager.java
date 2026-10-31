package com.so.revelation.lua.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p198z0.C2274b;

/* loaded from: classes.dex */
public class CustomViewPager extends C2274b {

    /* renamed from: q2 */
    public boolean f3488q2;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3488q2 = false;
    }

    @Override // p198z0.C2274b, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3488q2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p198z0.C2274b, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3488q2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        super.scrollTo(i7, i8);
    }

    @Override // p198z0.C2274b
    public void setCurrentItem(int i7) {
        super.setCurrentItem(i7);
    }

    public void setIsScanScroll(boolean z6) {
        this.f3488q2 = z6;
    }

    @Override // p198z0.C2274b
    /* renamed from: u */
    public final void mo2210u(int i7) {
        super.mo2210u(i7);
    }
}
