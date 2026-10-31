package p159u;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: u.i */
/* loaded from: classes.dex */
public final class C1962i {

    /* renamed from: u.i$a */
    public static class a {
        /* renamed from: a */
        public static Intent m4575a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        public static boolean m4576b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        public static boolean m4577c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m4573a(Activity activity) {
        Intent m4575a = a.m4575a(activity);
        if (m4575a != null) {
            return m4575a;
        }
        try {
            String m4574b = m4574b(activity, activity.getComponentName());
            if (m4574b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m4574b);
            try {
                return m4574b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m4574b + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: b */
    public static String m4574b(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i7 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i7 >= 29 ? 269222528 : i7 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
