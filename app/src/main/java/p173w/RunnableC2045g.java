package p173w;

import android.content.Context;
import android.ext.DaemonManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import p047f5.C1175f;
import p055g5.C1245b;
import p055g5.C1256m;
import p132q4.C1783l;
import p144s0.RunnableC1869e;
import p173w.C2044f;

/* renamed from: w.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2045g implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f9336c;

    /* renamed from: e */
    public final /* synthetic */ Object f9337e;

    /* renamed from: m */
    public final /* synthetic */ Object f9338m;

    public /* synthetic */ RunnableC2045g(Object obj, int i7, Object obj2) {
        this.f9336c = i7;
        this.f9337e = obj;
        this.f9338m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f9336c;
        Object obj = this.f9338m;
        Object obj2 = this.f9337e;
        switch (i7) {
            case 0:
                ((C2044f.e) obj2).mo721d((Typeface) obj);
                break;
            case 1:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.C0418b.m1415a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1869e(0, context), new Random().nextInt(Math.max(DaemonManager.TIME_JUMP_MUL_INT, 1)) + 5000);
                break;
            case 2:
                int i8 = C1245b.f5985n3;
                ((C1245b) obj2).getClass();
                ((Runnable) obj).run();
                break;
            default:
                C1256m.b bVar = (C1256m.b) obj2;
                C1175f c1175f = (C1175f) obj;
                C1256m c1256m = bVar.f6203X;
                if (c1256m.f6200d == bVar.f6207s) {
                    c1256m.f6201e = c1175f;
                    C1245b c1245b = c1256m.f6197a;
                    c1245b.invalidate();
                    c1245b.f5988B1.m4244a(new C1783l(c1245b));
                    c1256m.f6200d = null;
                    break;
                }
                break;
        }
    }
}
