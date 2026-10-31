package p036e2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.ext.C0090b;
import android.ext.Tools;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.C0017d;
import p016c.C0572z;
import p120p.C1686g;

/* renamed from: e2.d1 */
/* loaded from: classes.dex */
public final class C0979d1 {

    /* renamed from: a */
    public C0958a1 f5002a = new C0958a1(new byte[]{0, -86, -91, -2, -41, Byte.MAX_VALUE, 37, -25, -33, 93, 51, -73, 32, -81, 61, 108, 37, 126, 14, -125, 125, -55, -29, 34, -60, 84, -67, -46, 125, -93, -67, -27, 97, 54, 35, 0, -6, 83, 67, -116, 43, -24, 26, 88, -5, 33, 27, -105, 49, 76, -70, -32, 105, -48, 67, 69, 102, -111, -81, 93, -103, -18, 17, 55, 81, -34, -80, -76, -13, -84, 6, 91, 10, 48, -56, -1, 45, 9, 23, 34, 6, 103, 35, -51, 29, 70, -19, -51, 20, -39, -43, -97, 75, 23, -124, -101, -71, -75, -107, -88, -13, -71, 80, 90, -76, -119, 51, -80, 118, Byte.MIN_VALUE, -12, -108, 98, -29, -27, 60, -119, -74, 110, 61, 51, -22, 53, 66, -99, -45, -25, 111, -121, 25, -72, Byte.MAX_VALUE, 3, 51, -100, 57, -90, 116, -59, -117, 74, -71, 121, 59, 19, -8, -109, 33, -14, 76, -105, -127, -23, 5, 99, -82, 22, -99, 51, 78, -26, 77, -52, -29, 121, 42, -76, 20, 2, 116, 111, -76, 2, -78, -90, -54, 81, 115, 82, 50, 124, -83, 96, 20, -40, -118, 105, 90, -70, 120, -33, -110, 12, -15, 38, 34, -125, -116, 69, -54, -103, -109, -124, 26, 94, -89, -98, -11, -66, 89, 48, -68, -51, 107, -60, 12, 114, -71, 119, 49, -31, -65, 113, -99, 3, -90, 79, -88, -38, -87, -25, -38, 41, 110, -25, 29, 49, 124, -76, -91, 77, -11, -90, 114, -63, 118, -22, -5, -124, 19, 22, -74, -75, 78, 28, 47, -69}, new byte[]{1, 0, 1});

    /* renamed from: b */
    public ArrayList f5003b;

    /* renamed from: b */
    public static byte[] m3002b(byte[] bArr, C0958a1 c0958a1) {
        C0572z c0572z = new C0572z(5);
        C1132z0 c1132z0 = new C1132z0();
        c0572z.f2925b = c1132z0;
        c1132z0.f5626b = "PKCS1Padding";
        try {
            c1132z0.m3313a(c0958a1, C1125y0.f5607a);
            return c0572z.m1996c(bArr);
        } catch (InvalidAlgorithmParameterException e7) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Wrong parameters");
            invalidKeyException.initCause(e7);
            throw invalidKeyException;
        }
    }

    /* renamed from: c */
    public static String[] m3003c(Signature[] signatureArr) {
        String str;
        StringBuilder sb;
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-1").digest(signatureArr[i7].toByteArray());
                if (digest == null) {
                    throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
                }
                String str2 = "";
                for (byte b7 : digest) {
                    String hexString = Integer.toHexString(b7 & 255);
                    if (hexString.length() == 1) {
                        sb = C1686g.m4107b(str2);
                        str = "0";
                    } else {
                        str = str2;
                        sb = new StringBuilder();
                    }
                    str2 = C0090b.m220f(sb, str, hexString);
                }
                strArr[i7] = str2.toLowerCase();
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(e7);
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public final ArrayList m3004a(Context context, Intent intent) {
        boolean equals;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(activityInfo2.packageName, activityInfo2.name), Tools.Semaphore.f159S7).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] m83h = C0017d.m83h(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(m83h));
                                C1055o0 c1055o0 = new C1055o0();
                                c1055o0.f5269b = jSONObject.getInt("priority");
                                c1055o0.f5268a = resolveInfo.activityInfo.applicationInfo;
                                if (context.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    c1055o0.f5271d = true;
                                }
                                String string2 = bundle.getString("galaxy_sf");
                                if (!TextUtils.isEmpty(string2)) {
                                    PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                    JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                    int length = jSONArray.length();
                                    String[] strArr = new String[length];
                                    for (int i7 = 0; i7 < length; i7++) {
                                        strArr[i7] = jSONArray.getString(i7);
                                    }
                                    String[] m3003c = m3003c(packageInfo.signatures);
                                    if (length != m3003c.length) {
                                        equals = false;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        for (int i8 = 0; i8 < length; i8++) {
                                            hashSet.add(strArr[i8]);
                                        }
                                        HashSet hashSet2 = new HashSet();
                                        for (String str : m3003c) {
                                            hashSet2.add(str);
                                        }
                                        equals = hashSet.equals(hashSet2);
                                    }
                                    if (equals) {
                                        byte[] m3002b = m3002b(C0017d.m83h(string2.getBytes()), this.f5002a);
                                        try {
                                            if (m3002b != null && Arrays.equals(m3002b, MessageDigest.getInstance("SHA-1").digest(m83h))) {
                                                c1055o0.f5270c = true;
                                            }
                                        } catch (NoSuchAlgorithmException e7) {
                                            throw new RuntimeException(e7);
                                        }
                                    }
                                }
                                arrayList.add(c1055o0);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new C0972c1());
        return arrayList;
    }

    /* renamed from: d */
    public final List<C1055o0> m3005d(Context context) {
        ArrayList arrayList = this.f5003b;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList m3004a = m3004a(context, new Intent("com.baidu.intent.action.GALAXY").setPackage(context.getPackageName()));
        int i7 = 0;
        if (m3004a.size() == 0) {
            while (i7 < 3) {
                Log.w("CuidBuddyInfoManager", "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
                i7++;
            }
        } else if (!((C1055o0) m3004a.get(0)).f5270c) {
            while (i7 < 3) {
                Log.w("CuidBuddyInfoManager", "galaxy config err, In the release version of the signature should be matched");
                i7++;
            }
        }
        ArrayList m3004a2 = m3004a(context, new Intent("com.baidu.intent.action.GALAXY"));
        this.f5003b = m3004a2;
        return m3004a2;
    }
}
