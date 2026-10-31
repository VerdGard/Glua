package p084k2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: k2.h */
/* loaded from: classes.dex */
public final class C1458h {

    /* renamed from: a */
    public final int f6973a;

    /* renamed from: b */
    public final int f6974b;

    public C1458h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        int i7 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int i8 = i7 * 4;
        int i9 = i7 * 2;
        int i10 = i9 + i8;
        if (i10 <= round) {
            this.f6974b = i9;
        } else {
            int round2 = Math.round(round / 6.0f);
            this.f6974b = round2 * 2;
            i8 = round2 * 4;
        }
        this.f6973a = i8;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f6974b));
            sb.append(" pool size: ");
            sb.append(Formatter.formatFileSize(context, i8));
            sb.append(" memory class limited? ");
            sb.append(i10 > round);
            sb.append(" max size: ");
            sb.append(Formatter.formatFileSize(context, round));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
