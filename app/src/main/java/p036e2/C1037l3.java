package p036e2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.l3 */
/* loaded from: classes.dex */
public final class C1037l3 {

    /* renamed from: a */
    public static final C1037l3 f5225a = new C1037l3();

    /* renamed from: e2.l3$a */
    public static class a {

        /* renamed from: a */
        public final String f5226a;

        /* renamed from: b */
        public final String f5227b;

        /* renamed from: c */
        public final String f5228c;

        /* renamed from: d */
        public final String f5229d;

        public a(String str, String str2, String str3, String str4) {
            str = str == null ? "" : str;
            str2 = str2 == null ? "" : str2;
            str3 = str3 == null ? "" : str3;
            str4 = str4 == null ? "" : str4;
            this.f5226a = str;
            this.f5227b = str2;
            this.f5228c = str3;
            this.f5229d = str4;
        }

        /* renamed from: a */
        public final JSONObject m3105a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", this.f5226a);
                jSONObject.put("v", this.f5227b);
                jSONObject.put("c", this.f5228c);
                jSONObject.put("a", this.f5229d);
                return jSONObject;
            } catch (JSONException e7) {
                C1016i3.f5129e.m386n(e7);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static void m3104a(Context context) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        C1016i3 c1016i3 = C1016i3.f5129e;
        if (packageManager != null) {
            List<PackageInfo> arrayList3 = new ArrayList<>(1);
            try {
                arrayList3 = packageManager.getInstalledPackages(64);
            } catch (Exception e7) {
                c1016i3.m386n(e7);
            }
            for (PackageInfo packageInfo : arrayList3) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (applicationInfo.flags & 1) == 0) {
                    arrayList2.add(packageInfo);
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        JSONObject m3105a = ((a) it2.next()).m3105a();
                        if (m3105a != null) {
                            jSONArray.put(m3105a);
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_apk", jSONArray);
                    jSONObject.put("meta-data", sb.toString());
                    str2 = C1109v5.m3246j(jSONObject.toString().getBytes());
                } catch (Exception e8) {
                    c1016i3.m386n(e8);
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                EnumC1032k5.f5214Y.m3099e(System.currentTimeMillis(), context, str2);
                return;
            }
            PackageInfo packageInfo2 = (PackageInfo) it.next();
            ApplicationInfo applicationInfo2 = packageInfo2.applicationInfo;
            if (applicationInfo2 != null) {
                String str3 = packageInfo2.packageName;
                String str4 = packageInfo2.versionName;
                Signature[] signatureArr = packageInfo2.signatures;
                byte[] bytes = ((signatureArr == null || signatureArr.length == 0) ? "" : signatureArr[0].toChars().toString()).getBytes();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(bytes);
                    str = C1135z3.m3314a(messageDigest.digest());
                } catch (Exception unused) {
                    str = "";
                }
                String str5 = applicationInfo2.sourceDir;
                if (!TextUtils.isEmpty(str5)) {
                    File file = new File(str5);
                    try {
                        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                        if (file.isFile()) {
                            FileInputStream fileInputStream = null;
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                try {
                                    byte[] bArr = new byte[4048];
                                    while (true) {
                                        int read = fileInputStream2.read(bArr);
                                        if (read == -1) {
                                            try {
                                                break;
                                            } catch (Exception unused2) {
                                            }
                                        } else {
                                            messageDigest2.update(bArr, 0, read);
                                        }
                                    }
                                    fileInputStream2.close();
                                } catch (Exception unused3) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    str2 = C1135z3.m3314a(messageDigest2.digest());
                                    arrayList.add(new a(str3, str4, str, str2));
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            str2 = C1135z3.m3314a(messageDigest2.digest());
                        }
                    } catch (NoSuchAlgorithmException unused6) {
                    }
                }
                arrayList.add(new a(str3, str4, str, str2));
            }
        }
    }
}
