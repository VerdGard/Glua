package p093l3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: l3.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1508a implements View.OnTouchListener {

    /* renamed from: c */
    public final Dialog f7124c;

    /* renamed from: e */
    public final int f7125e;

    /* renamed from: m */
    public final int f7126m;

    /* renamed from: s */
    public final int f7127s;

    public ViewOnTouchListenerC1508a(Dialog dialog, Rect rect) {
        this.f7124c = dialog;
        this.f7125e = rect.left;
        this.f7126m = rect.top;
        this.f7127s = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(android.R.id.content);
        int left = findViewById.getLeft() + this.f7125e;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f7126m, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i7 = this.f7127s;
            obtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f7124c.onTouchEvent(obtain);
    }
}
