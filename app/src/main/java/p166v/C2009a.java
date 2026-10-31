package p166v;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p001a0.C0002a;
import p159u.C1963j;
import p173w.C2040b;
import p173w.C2044f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: v.a */
/* loaded from: classes.dex */
public class C2009a {

    /* renamed from: a */
    public static final Object f9156a = new Object();

    /* renamed from: v.a$a */
    public static class a {
        /* renamed from: a */
        public static void m4897a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m4898b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: v.a$b */
    public static class b {
        /* renamed from: a */
        public static File[] m4899a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m4900b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m4901c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: v.a$c */
    public static class c {
        /* renamed from: a */
        public static File m4902a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m4903b(Context context, int i7) {
            return context.getDrawable(i7);
        }

        /* renamed from: c */
        public static File m4904c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: v.a$d */
    public static class d {
        /* renamed from: a */
        public static int m4905a(Context context, int i7) {
            int color;
            color = context.getColor(i7);
            return color;
        }

        /* renamed from: b */
        public static <T> T m4906b(Context context, Class<T> cls) {
            Object systemService;
            systemService = context.getSystemService(cls);
            return (T) systemService;
        }

        /* renamed from: c */
        public static String m4907c(Context context, Class<?> cls) {
            String systemServiceName;
            systemServiceName = context.getSystemServiceName(cls);
            return systemServiceName;
        }
    }

    /* renamed from: v.a$e */
    public static final class e {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f9157a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f9157a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static int m4894a(Context context, String str) {
        boolean z6;
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (C0002a.m1a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        C1963j c1963j = new C1963j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            z6 = c1963j.f8816a.areNotificationsEnabled();
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i7 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i7), packageName)).intValue() != 0) {
                    z6 = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
            z6 = true;
        }
        return z6 ? 0 : -1;
    }

    /* renamed from: b */
    public static int m4895b(Context context, int i7) {
        return Build.VERSION.SDK_INT >= 23 ? d.m4905a(context, i7) : context.getResources().getColor(i7);
    }

    /* renamed from: c */
    public static ColorStateList m4896c(int i7, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2044f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C2044f.d dVar = new C2044f.d(resources, theme);
        synchronized (C2044f.f9327c) {
            SparseArray<C2044f.c> sparseArray = C2044f.f9326b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i7)) != null) {
                if (!cVar.f9329b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f9330c == 0) && (theme == null || cVar.f9330c != theme.hashCode()))) {
                    sparseArray.remove(i7);
                } else {
                    colorStateList2 = cVar.f9328a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = C2044f.f9325a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i7, typedValue, true);
        int i8 = typedValue.type;
        if (!(i8 >= 28 && i8 <= 31)) {
            try {
                colorStateList = C2040b.m5056a(resources, resources.getXml(i7), theme);
            } catch (Exception e7) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? C2044f.b.m5070b(resources, i7, theme) : resources.getColorStateList(i7);
        }
        C2044f.m5064a(dVar, i7, colorStateList, theme);
        return colorStateList;
    }
}
