package p036e2;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e2.p1 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1063p1 implements View.OnTouchListener {

    /* renamed from: X */
    public final /* synthetic */ View f5311X;

    /* renamed from: Y */
    public final /* synthetic */ Activity f5312Y;

    /* renamed from: c */
    public int f5313c = 0;

    /* renamed from: e */
    public int f5314e = 0;

    /* renamed from: m */
    public int f5315m = 0;

    /* renamed from: s */
    public int f5316s = 0;

    public ViewOnTouchListenerC1063p1(Activity activity, View view) {
        this.f5311X = view;
        this.f5312Y = activity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5313c = rawX;
            this.f5314e = rawY;
            this.f5315m = rawX - view.getLeft();
            this.f5316s = rawY - view.getTop();
        } else if (action == 1) {
            if (Math.abs(((float) this.f5313c) - ((float) ((int) motionEvent.getRawX()))) <= 5.0f && Math.abs(((float) this.f5314e) - ((float) ((int) motionEvent.getRawY()))) <= 5.0f) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f5312Y);
                builder.setMessage("是否确认退出连接?");
                builder.setPositiveButton("确定", new DialogInterfaceOnClickListenerC1070q1());
                builder.setNegativeButton("取消", new DialogInterfaceOnClickListenerC1077r1());
                builder.create().show();
            }
        } else if (action == 2) {
            int i7 = rawX - this.f5315m;
            int i8 = rawY - this.f5316s;
            Rect rect = new Rect();
            this.f5311X.getLocalVisibleRect(rect);
            if (rect.contains(new Rect(i7, i8, view.getWidth() + i7, view.getHeight() + i8))) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.leftMargin = i7;
                marginLayoutParams.topMargin = i8;
                view.setLayoutParams(marginLayoutParams);
            }
        }
        return true;
    }
}
