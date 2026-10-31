package p091l1;

import android.ext.C0090b;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.DemoActivity;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: l1.f */
/* loaded from: classes.dex */
public final class RunnableC1492f implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ DemoActivity f7101c;

    public RunnableC1492f(DemoActivity demoActivity) {
        this.f7101c = demoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DemoActivity demoActivity = this.f7101c;
        demoActivity.f3273V1.m2212a();
        String str = demoActivity.f3275X1;
        String m220f = C0090b.m220f(new StringBuilder(), demoActivity.f3276Y1, "");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getPath());
            fileOutputStream.write(m220f.getBytes());
            fileOutputStream.close();
        } catch (Exception e7) {
            e7.printStackTrace();
            C0391d0.m1370q(e7.getMessage(), true);
        }
    }
}
