package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.activity.result.AbstractC0136c;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public abstract class AbstractC0375u<E> extends AbstractC0136c {

    /* renamed from: X */
    public final C0379y f1868X;

    /* renamed from: e */
    public final Activity f1869e;

    /* renamed from: m */
    public final Context f1870m;

    /* renamed from: s */
    public final Handler f1871s;

    public AbstractC0375u(ActivityC0367q activityC0367q) {
        Handler handler = new Handler();
        this.f1868X = new C0379y();
        this.f1869e = activityC0367q;
        if (activityC0367q == null) {
            throw new NullPointerException("context == null");
        }
        this.f1870m = activityC0367q;
        this.f1871s = handler;
    }

    /* renamed from: A */
    public abstract LayoutInflater mo1251A();

    /* renamed from: B */
    public abstract void mo1252B();

    /* renamed from: y */
    public abstract void mo1253y(PrintWriter printWriter, String[] strArr);

    /* renamed from: z */
    public abstract ActivityC0367q mo1254z();
}
