package p036e2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.ext.Tools;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import androidx.activity.C0143v;
import java.util.regex.Pattern;

/* renamed from: e2.b4 */
/* loaded from: classes.dex */
public final class C0968b4 {

    /* renamed from: a */
    public static String f4970a;

    /* renamed from: b */
    public static String f4971b;

    /* renamed from: c */
    public static String f4972c;

    /* renamed from: d */
    public static final Pattern f4973d = Pattern.compile("\\s*|\t|\r|\n");

    /* renamed from: e2.b4$a */
    public static class a implements InterfaceC0989e4 {

        /* renamed from: a */
        public final /* synthetic */ Context f4974a;

        public a(Context context) {
            this.f4974a = context;
        }

        /* renamed from: a */
        public final void m2986a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f4974a.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().putString("api_oaid", str).commit();
        }
    }

    /* renamed from: a */
    public static String m2967a(Context context) {
        return f4973d.matcher(C0143v.m429a(context)).replaceAll("");
    }

    /* renamed from: b */
    public static String m2968b(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), Tools.Semaphore.f159S7);
            if (applicationInfo == null) {
                return "";
            }
            Bundle bundle = applicationInfo.metaData;
            Object obj = bundle != null ? bundle.get(str) : null;
            if (obj != null) {
                return obj.toString();
            }
            C1023j3.f5170m.m382g(3, "can't find information in AndroidManifest.xml for key ".concat(str));
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m2969c() {
        String str = f4972c;
        if (str != null) {
            return str;
        }
        String str2 = !TextUtils.isEmpty(m2970d("ro.miui.ui.version.name")) ? "miui" : !TextUtils.isEmpty(m2970d("ro.build.version.opporom")) ? "coloros" : !TextUtils.isEmpty(m2970d("ro.build.version.emui")) ? "emui" : !TextUtils.isEmpty(m2970d("ro.vivo.os.version")) ? "funtouch" : !TextUtils.isEmpty(m2970d("ro.smartisan.version")) ? "smartisan" : "";
        if (TextUtils.isEmpty(str2)) {
            String m2970d = m2970d("ro.build.display.id");
            if (!TextUtils.isEmpty(m2970d) && m2970d.contains("Flyme")) {
                str2 = "flyme";
            }
        }
        f4972c = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r5 == null) goto L30;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2970d(java.lang.String r5) {
        /*
            java.lang.String r0 = "getprop "
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L46
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L46
            java.lang.Process r5 = r2.exec(r5)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L46
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            java.io.InputStream r3 = r5.getInputStream()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r3 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2d
            r0.close()     // Catch: java.lang.Exception -> L52
            goto L52
        L27:
            r1 = move-exception
            r4 = r0
            r0 = r5
            r5 = r1
            r1 = r4
            goto L39
        L2d:
            goto L49
        L2f:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L39
        L34:
            r0 = r1
            goto L49
        L37:
            r5 = move-exception
            r0 = r1
        L39:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.lang.Exception -> L3f
            goto L40
        L3f:
        L40:
            if (r0 == 0) goto L45
            r0.destroy()
        L45:
            throw r5
        L46:
            r5 = r1
            r0 = r5
        L49:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Exception -> L4f
            goto L50
        L4f:
        L50:
            if (r5 == 0) goto L55
        L52:
            r5.destroy()
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0968b4.m2970d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static Boolean m2971e() {
        Boolean bool = Boolean.TRUE;
        try {
            Object invoke = Class.forName("com.baidu.disasterrecovery.MtjAdapter").getDeclaredMethod("shouldUploadOther", new Class[0]).invoke(null, new Object[0]);
            return (invoke == null || !(invoke instanceof Boolean)) ? bool : (Boolean) invoke;
        } catch (Exception unused) {
            return bool;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2972f(int r7, android.content.Context r8) {
        /*
            java.lang.String r0 = "__Baidu_Stat_SDK_SendRem"
            r1 = 0
            android.content.SharedPreferences r2 = r8.getSharedPreferences(r0, r1)
            java.lang.String r3 = "out_oaid"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L6a
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = "api_oaid"
            java.lang.String r2 = r0.getString(r2, r4)
            e2.b4$a r0 = new e2.b4$a
            r0.<init>(r8)
            java.lang.Object r3 = p036e2.C1010h4.f5109a
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.reflect.Method r5 = p036e2.C1010h4.f5110b
            if (r5 == 0) goto L42
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3a
            r6[r1] = r8     // Catch: java.lang.Exception -> L3a
            java.lang.Object r1 = r5.invoke(r3, r6)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L42
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3a
            goto L43
        L3a:
            r1 = move-exception
            java.lang.String r3 = "IdentifierManager"
            java.lang.String r5 = "invoke exception!"
            android.util.Log.e(r3, r5, r1)
        L42:
            r1 = 0
        L43:
            p036e2.C1109v5.f5493e = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L51
            java.lang.String r8 = p036e2.C1109v5.f5493e
            r0.m2986a(r8)
            goto L6a
        L51:
            e2.f4 r1 = new e2.f4
            r1.<init>(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r0.<init>(r3)
            java.lang.String r3 = "com.huawei.hwid"
            r0.setPackage(r3)
            e2.d4 r3 = new e2.d4
            r3.<init>(r1)
            r8.bindService(r0, r3, r4)
        L6a:
            byte[] r8 = r2.getBytes()
            java.lang.String r7 = androidx.activity.C0143v.m454o(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0968b4.m2972f(int, android.content.Context):java.lang.String");
    }

    /* renamed from: g */
    public static String m2973g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m2974h(int i7, Context context) {
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c) {
            return "";
        }
        String m2978l = m2978l(context);
        return TextUtils.isEmpty(m2978l) ? "" : C0143v.m454o(i7, m2978l.getBytes());
    }

    /* renamed from: i */
    public static String m2975i(Context context) {
        CellLocation cellLocation;
        String format = String.format("%s_%s_%s", 0, 0, 0);
        try {
            if ((!C1121x3.m3291d(context, "android.permission.ACCESS_FINE_LOCATION") && !C1121x3.m3291d(context, "android.permission.ACCESS_COARSE_LOCATION")) || (cellLocation = ((TelephonyManager) context.getSystemService("phone")).getCellLocation()) == null) {
                return format;
            }
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                return String.format("%s_%s_%s", String.format("%d", Integer.valueOf(gsmCellLocation.getCid())), String.format("%d", Integer.valueOf(gsmCellLocation.getLac())), 0);
            }
            String[] split = cellLocation.toString().replace("[", "").replace("]", "").split(",");
            return String.format("%s_%s_%s", split[0], split[3], split[4]);
        } catch (Exception unused) {
        }
        return format;
    }

    /* renamed from: j */
    public static String m2976j(Context context) {
        Location lastKnownLocation;
        try {
            return (!C1121x3.m3291d(context, "android.permission.ACCESS_FINE_LOCATION") || (lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("gps")) == null) ? "" : String.format("%s_%s_%s", Long.valueOf(lastKnownLocation.getTime()), Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5 != null) goto L22;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2977k(int r4, android.content.Context r5) {
        /*
            e2.a4 r0 = p036e2.C0961a4.m2954a()
            r0.getClass()
            boolean r0 = p036e2.C0961a4.f4940c
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
            return r1
        Le:
            e2.a4 r2 = p036e2.C0961a4.m2954a()
            r2.getClass()
            if (r0 != 0) goto L18
            goto L43
        L18:
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = "4.1.1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2d
            java.lang.String r2 = "TCT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2d
            goto L43
        L2d:
            java.lang.String r0 = "android.permission.BLUETOOTH"
            boolean r5 = p036e2.C1121x3.m3291d(r5, r0)     // Catch: java.lang.Exception -> L42
            if (r5 == 0) goto L43
            android.bluetooth.BluetoothAdapter r5 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch: java.lang.Exception -> L42
            if (r5 == 0) goto L43
            java.lang.String r5 = r5.getAddress()     // Catch: java.lang.Exception -> L42
            if (r5 == 0) goto L43
            goto L44
        L42:
        L43:
            r5 = r1
        L44:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L4b
            goto L53
        L4b:
            byte[] r5 = r5.getBytes()
            java.lang.String r1 = androidx.activity.C0143v.m454o(r4, r5)
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0968b4.m2977k(int, android.content.Context):java.lang.String");
    }

    /* renamed from: l */
    public static String m2978l(Context context) {
        WifiInfo connectionInfo;
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c) {
            return "";
        }
        try {
            if (C1121x3.m3291d(context, "android.permission.ACCESS_WIFI_STATE") && (connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo()) != null) {
                String macAddress = connectionInfo.getMacAddress();
                if (!TextUtils.isEmpty(macAddress)) {
                    return macAddress;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:8|(2:9|10)|(13:12|13|14|15|16|17|(1:21)|22|(9:29|30|(1:32)|33|(1:41)(1:37)|38|39|40|23)|45|(3:47|48|49)|52|(1:54)(2:55|56))|65|13|14|15|16|17|(2:19|21)|22|(12:25|27|29|30|(0)|33|(1:35)|41|38|39|40|23)|58|45|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0049, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:30:0x0070, B:32:0x0091, B:33:0x0095, B:35:0x00a5, B:38:0x00b4), top: B:29:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2979m(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0968b4.m2979m(android.content.Context):java.lang.String");
    }

    /* renamed from: n */
    public static boolean m2980n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m2981o(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!C1121x3.m3291d(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static String m2982p(Context context) {
        int i7;
        String str = f4971b;
        if (str == null) {
            String m2985s = m2985s(context);
            int lastIndexOf = m2985s.lastIndexOf(58);
            String str2 = null;
            String substring = (lastIndexOf <= 0 || (i7 = lastIndexOf + 1) >= m2985s.length()) ? null : m2985s.substring(i7);
            if (TextUtils.isEmpty(substring)) {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    String str3 = applicationInfo.processName;
                    if (str3 == null || str3.equals(m2985s)) {
                        m2985s = null;
                    }
                    str2 = m2985s;
                }
                substring = str2;
            }
            str = substring == null ? "" : substring;
            f4971b = str;
        }
        return str;
    }

    /* renamed from: q */
    public static String m2983q(Context context) {
        PackageInfo packageInfo;
        ServiceInfo[] serviceInfoArr;
        String str;
        String m2985s = m2985s(context);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (serviceInfoArr = packageInfo.services) == null) {
            return "";
        }
        int length = serviceInfoArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                str = "";
                break;
            }
            ServiceInfo serviceInfo = serviceInfoArr[i7];
            if (m2985s.equals(serviceInfo.processName)) {
                str = serviceInfo.name;
                break;
            }
            i7++;
        }
        return str == null ? "" : str;
    }

    /* renamed from: r */
    public static String m2984r(Context context) {
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c) {
            return "";
        }
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            return !TextUtils.isEmpty(deviceId) ? C0143v.m454o(1, deviceId.getBytes()) : deviceId;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = r2.processName;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2985s(android.content.Context r5) {
        /*
            java.lang.String r0 = p036e2.C0968b4.f4970a
            if (r0 != 0) goto L38
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L30
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L30
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Exception -> L30
            r1 = 0
        L11:
            if (r5 == 0) goto L31
            int r2 = r5.size()     // Catch: java.lang.Exception -> L30
            if (r1 >= r2) goto L31
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Exception -> L30
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L2d
            int r3 = r2.pid     // Catch: java.lang.Exception -> L30
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L30
            if (r3 != r4) goto L2d
            java.lang.String r5 = r2.processName     // Catch: java.lang.Exception -> L30
            r0 = r5
            goto L31
        L2d:
            int r1 = r1 + 1
            goto L11
        L30:
        L31:
            if (r0 != 0) goto L36
            java.lang.String r5 = ""
            r0 = r5
        L36:
            p036e2.C0968b4.f4970a = r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0968b4.m2985s(android.content.Context):java.lang.String");
    }
}
