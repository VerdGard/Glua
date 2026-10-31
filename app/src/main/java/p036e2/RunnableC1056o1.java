package p036e2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: e2.o1 */
/* loaded from: classes.dex */
public final class RunnableC1056o1 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ View f5272c;

    /* renamed from: e */
    public final /* synthetic */ Activity f5273e;

    /* renamed from: m */
    public final /* synthetic */ TextView f5274m;

    public RunnableC1056o1(ViewGroup viewGroup, Activity activity, C1049n1 c1049n1) {
        this.f5272c = viewGroup;
        this.f5273e = activity;
        this.f5274m = c1049n1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f5272c;
        int width = view.getWidth();
        int height = view.getHeight();
        Activity activity = this.f5273e;
        int i7 = activity == null ? 0 : (int) ((55.0f * activity.getResources().getDisplayMetrics().density) + 0.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i7);
        layoutParams.leftMargin = (width - i7) / 6;
        layoutParams.topMargin = ((height - i7) * 5) / 6;
        this.f5274m.setLayoutParams(layoutParams);
    }
}
