package p175w1;

import android.ext.ExceptionHandler;
import android.os.HandlerThread;

/* renamed from: w1.o */
/* loaded from: classes.dex */
public final class HandlerThreadC2104o extends HandlerThread {
    public HandlerThreadC2104o(String str) {
        super(str);
        ExceptionHandler.install(this);
    }
}
