package p009b0;

import android.content.Context;
import java.util.concurrent.Callable;
import p009b0.C0507k;

/* renamed from: b0.i */
/* loaded from: classes.dex */
public final class CallableC0505i implements Callable<C0507k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f2526a;

    /* renamed from: b */
    public final /* synthetic */ Context f2527b;

    /* renamed from: c */
    public final /* synthetic */ C0502f f2528c;

    /* renamed from: d */
    public final /* synthetic */ int f2529d;

    public CallableC0505i(String str, Context context, C0502f c0502f, int i7) {
        this.f2526a = str;
        this.f2527b = context;
        this.f2528c = c0502f;
        this.f2529d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final C0507k.a call() {
        try {
            return C0507k.m1825a(this.f2526a, this.f2527b, this.f2528c, this.f2529d);
        } catch (Throwable unused) {
            return new C0507k.a(-3);
        }
    }
}
