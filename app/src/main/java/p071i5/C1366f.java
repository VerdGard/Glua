package p071i5;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

/* renamed from: i5.f */
/* loaded from: classes.dex */
public final class C1366f implements InterfaceC1356a {

    /* renamed from: a */
    public ListView f6634a;

    /* renamed from: b */
    public ProgressBar f6635b;

    /* renamed from: c */
    public LinearLayout f6636c;

    /* renamed from: d */
    public C1374k f6637d;

    /* renamed from: a */
    public final void m3723a(int i7) {
        ListView listView = this.f6634a;
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        listView.onTouchEvent(obtain);
        obtain.recycle();
        float f7 = i7;
        MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 2, 0.0f, f7, 0);
        listView.onTouchEvent(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, f7, 0);
        listView.onTouchEvent(obtain3);
        obtain3.recycle();
    }
}
