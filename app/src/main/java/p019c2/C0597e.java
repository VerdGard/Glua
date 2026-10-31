package p019c2;

import android.os.Looper;
import androidx.lifecycle.C0391d0;

/* renamed from: c2.e */
/* loaded from: classes.dex */
public final class C0597e extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        C0391d0.m1370q("很抱歉,程序出现异常,即将返回.", false);
        Looper.loop();
    }
}
