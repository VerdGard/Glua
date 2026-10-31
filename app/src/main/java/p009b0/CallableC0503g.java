package p009b0;

import android.content.Context;
import java.util.concurrent.Callable;
import p009b0.C0507k;

/* renamed from: b0.g */
/* loaded from: classes.dex */
public final class CallableC0503g implements Callable<C0507k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f2521a;

    /* renamed from: b */
    public final /* synthetic */ Context f2522b;

    /* renamed from: c */
    public final /* synthetic */ C0502f f2523c;

    /* renamed from: d */
    public final /* synthetic */ int f2524d;

    public CallableC0503g(String str, Context context, C0502f c0502f, int i7) {
        this.f2521a = str;
        this.f2522b = context;
        this.f2523c = c0502f;
        this.f2524d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final C0507k.a call() {
        return C0507k.m1825a(this.f2521a, this.f2522b, this.f2523c, this.f2524d);
    }
}
