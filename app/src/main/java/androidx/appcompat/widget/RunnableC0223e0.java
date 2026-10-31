package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public final class RunnableC0223e0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ TextView f882c;

    /* renamed from: e */
    public final /* synthetic */ Typeface f883e;

    /* renamed from: m */
    public final /* synthetic */ int f884m;

    public RunnableC0223e0(TextView textView, Typeface typeface, int i7) {
        this.f882c = textView;
        this.f883e = typeface;
        this.f884m = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f882c.setTypeface(this.f883e, this.f884m);
    }
}
