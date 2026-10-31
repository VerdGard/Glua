package p036e2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.activity.C0143v;
import androidx.lifecycle.C0391d0;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: e2.o */
/* loaded from: classes.dex */
public final class C1054o {

    /* renamed from: b */
    public static C1054o f5266b;

    /* renamed from: a */
    public final C1082s f5267a = new C1082s();

    /* renamed from: a */
    public static String m3124a(Context context) {
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c) {
            return "02:00:00:00:00:00";
        }
        String m2978l = C0968b4.m2978l(context);
        return !TextUtils.isEmpty(m2978l) ? m2978l.replaceAll(":", "") : "02:00:00:00:00:00";
    }

    /* renamed from: b */
    public static String m3125b(Context context) {
        String string = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getString("device_id_1", null);
        if (!TextUtils.isEmpty(string) && !string.equals("000000000000000")) {
            return string;
        }
        String str = "hol" + (new Date().getTime() + "").hashCode() + "mes";
        context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().putString("device_id_1", str).commit();
        return str;
    }

    /* renamed from: k */
    public static String m3126k() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /* renamed from: l */
    public static synchronized C1054o m3127l() {
        C1054o c1054o;
        synchronized (C1054o.class) {
            if (f5266b == null) {
                f5266b = new C1054o();
            }
            c1054o = f5266b;
        }
        return c1054o;
    }

    /* renamed from: m */
    public static void m3128m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().putString("last_custom_userid", str).commit();
    }

    /* renamed from: c */
    public final boolean m3129c(Context context, String str, boolean z6) {
        String m454o;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = "";
        String replace = str.replace(":", "");
        boolean equals = replace.equals("02:00:00:00:00:00".replace(":", ""));
        C1082s c1082s = this.f5267a;
        if (!equals) {
            m454o = C0143v.m454o(1, replace.getBytes());
        } else {
            if (!TextUtils.isEmpty(c1082s.f5381f)) {
                try {
                    str2 = new String(C0143v.m452n(1, C0391d0.m1359f(c1082s.f5381f.getBytes())));
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                if (TextUtils.isEmpty(str2)) {
                    c1082s.f5384i = C0143v.m454o(1, m3125b(context).getBytes());
                    z6 = true;
                } else {
                    c1082s.f5384i = C0143v.m454o(1, replace.getBytes());
                }
                return z6;
            }
            m454o = C0143v.m454o(1, m3125b(context).getBytes());
        }
        c1082s.f5384i = m454o;
        return true;
    }

    /* renamed from: d */
    public final String m3130d(Context context) {
        String str;
        C1082s c1082s = this.f5267a;
        try {
            String str2 = c1082s.f5387l;
            if (str2 == null || str2.equals("")) {
                boolean z6 = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getBoolean("setchannelwithcode", false);
                if (z6) {
                    c1082s.f5387l = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getString("setchannelwithcodevalue", null);
                }
                if (!z6 || (str = c1082s.f5387l) == null || str.equals("")) {
                    c1082s.f5387l = C0968b4.m2968b(context, "BaiduMobAd_CHANNEL");
                }
            }
        } catch (Exception unused) {
        }
        return c1082s.f5387l;
    }

    /* renamed from: e */
    public final String m3131e(Context context) {
        C1082s c1082s = this.f5267a;
        if (c1082s.f5380e == null) {
            c1082s.f5380e = C0968b4.m2968b(context, "BaiduMobAd_STAT_ID");
        }
        return c1082s.f5380e;
    }

    /* renamed from: f */
    public final int m3132f(Context context) {
        int i7;
        C1082s c1082s = this.f5267a;
        if (c1082s.f5382g == -1) {
            String str = C0968b4.f4970a;
            try {
                i7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Exception unused) {
                i7 = 1;
            }
            c1082s.f5382g = i7;
        }
        return c1082s.f5382g;
    }

    /* renamed from: g */
    public final String m3133g(Context context, boolean z6) {
        C1128y3 c1128y3 = C1128y3.f5622a;
        if (c1128y3.m3266b(context, "cuid", null) != null) {
            c1128y3.m3268d(context, "cuid");
        }
        c1128y3.mo3103a(context).edit().putString("cuidsec_1", "").commit();
        c1128y3.m3268d(context, "cuidsec_1");
        c1128y3.m3268d(context, "cuidsec_1");
        c1128y3.m3268d(context, "cuidsec_2");
        C1082s c1082s = this.f5267a;
        String str = c1082s.f5381f;
        if (str == null || "".equalsIgnoreCase(str)) {
            try {
                c1082s.f5381f = C0143v.m429a(context);
                String replaceAll = Pattern.compile("\\s*|\t|\r|\n").matcher(c1082s.f5381f).replaceAll("");
                c1082s.f5381f = replaceAll;
                c1082s.f5381f = C0143v.m454o(1, replaceAll.getBytes());
            } catch (Exception unused) {
            }
        }
        if (z6) {
            return c1082s.f5381f;
        }
        try {
            String str2 = c1082s.f5381f;
            if (!TextUtils.isEmpty(str2)) {
                return new String(C0143v.m452n(1, C0391d0.m1359f(str2.getBytes())));
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016a, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0182, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01ef, code lost:
    
        if (r6.length() > 30) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0225, code lost:
    
        if (r6.length() > 30) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m3134h(android.telephony.TelephonyManager r18, android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1054o.m3134h(android.telephony.TelephonyManager, android.content.Context):java.lang.String");
    }

    /* renamed from: i */
    public final String m3135i(Context context) {
        String str;
        NetworkInfo activeNetworkInfo;
        C1082s c1082s = this.f5267a;
        if (TextUtils.isEmpty(c1082s.f5393r)) {
            String str2 = C0968b4.f4970a;
            try {
                activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception unused) {
            }
            if (activeNetworkInfo != null) {
                str = activeNetworkInfo.getTypeName();
                try {
                    if (!str.equals("WIFI") && activeNetworkInfo.getSubtypeName() != null) {
                        str = activeNetworkInfo.getSubtypeName();
                    }
                } catch (Exception unused2) {
                }
                c1082s.f5393r = str;
            }
            str = "";
            c1082s.f5393r = str;
        }
        return c1082s.f5393r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        r5 = r11.getHardwareAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r5 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        r10 = new java.lang.StringBuilder();
        r11 = r5.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        if (r13 >= r11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        r10.append(java.lang.String.format("%02x:", java.lang.Byte.valueOf(r5[r13])));
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        if (r10.length() <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        r10.deleteCharAt(r10.length() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        r5 = r10.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m3136j(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1054o.m3136j(android.content.Context, boolean):java.lang.String");
    }
}
