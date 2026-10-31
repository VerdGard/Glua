package androidx.lifecycle;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.ext.C0090b;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.so.revelation.lua.R;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0020g;
import p036e2.C1016i3;
import p036e2.C1109v5;
import p036e2.EnumC1032k5;
import p067i1.InterfaceC1328j;
import p070i4.InterfaceC1349o;
import p111n5.InterfaceC1647c;
import p141r5.AbstractC1840b;
import p149s5.C1887a;
import p149s5.C1891e;
import p149s5.C1894h;
import p164u5.EnumC1978c;
import p168v1.AbstractApplicationC2012b;
import p179w5.C2130b;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public class C0391d0 implements InterfaceC1328j, InterfaceC1349o, InterfaceC1647c {

    /* renamed from: b */
    public static Toast f1966b;

    /* renamed from: a */
    public static final C0391d0 f1965a = new C0391d0();

    /* renamed from: c */
    public static final byte[] f1967c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: d */
    public static final C0391d0 f1968d = new C0391d0();

    /* renamed from: e */
    public static final byte[] f1969e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: f */
    public static final byte[] f1970f = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: g */
    public static final byte[] f1971g = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: h */
    public static final C0391d0 f1972h = new C0391d0();

    /* renamed from: i */
    public static final String[] f1973i = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: j */
    public static final boolean[] f1974j = new boolean[3];

    /* renamed from: k */
    public static final float[][] f1975k = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: l */
    public static final float[][] f1976l = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: m */
    public static final float[] f1977m = {95.047f, 100.0f, 108.883f};

    /* renamed from: n */
    public static final float[][] f1978n = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: o */
    public static final String[] f1979o = new String[0];

    /* renamed from: p */
    public static final Object[] f1980p = new Object[0];

    public /* synthetic */ C0391d0() {
    }

    public /* synthetic */ C0391d0(int i7) {
    }

    public /* synthetic */ C0391d0(String str) {
    }

    /* renamed from: a */
    public static String m1357a(int i7, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(C0090b.m219e("Cannot have length offset: ", i7));
        }
        if (i7 + 0 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i7), Integer.valueOf(bArr.length)));
        }
        int i8 = ((i7 / 3) * 4) + (i7 % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i8];
        int i9 = i7 - 2;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            m1358b(bArr, i10 + 0, 3, bArr2, i11, 0);
            i10 += 3;
            i11 += 4;
        }
        if (i10 < i7) {
            m1358b(bArr, i10 + 0, i7 - i10, bArr2, i11, 0);
            i11 += 4;
        }
        if (i11 <= i8 - 1) {
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr2, 0, bArr3, 0, i11);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    /* renamed from: b */
    public static void m1358b(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10) {
        byte[] bArr3 = (i10 & 16) == 16 ? f1970f : (i10 & 32) == 32 ? f1971g : f1969e;
        int i11 = (i8 > 1 ? (bArr[i7 + 1] << 24) >>> 16 : 0) | (i8 > 0 ? (bArr[i7] << 24) >>> 8 : 0) | (i8 > 2 ? (bArr[i7 + 2] << 24) >>> 24 : 0);
        if (i8 == 1) {
            bArr2[i9] = bArr3[i11 >>> 18];
            bArr2[i9 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
            return;
        }
        if (i8 == 2) {
            bArr2[i9] = bArr3[i11 >>> 18];
            bArr2[i9 + 1] = bArr3[(i11 >>> 12) & 63];
            bArr2[i9 + 2] = bArr3[(i11 >>> 6) & 63];
            bArr2[i9 + 3] = 61;
            return;
        }
        if (i8 != 3) {
            return;
        }
        bArr2[i9] = bArr3[i11 >>> 18];
        bArr2[i9 + 1] = bArr3[(i11 >>> 12) & 63];
        bArr2[i9 + 2] = bArr3[(i11 >>> 6) & 63];
        bArr2[i9 + 3] = bArr3[i11 & 63];
    }

    /* renamed from: f */
    public static byte[] m1359f(byte[] bArr) {
        byte b7;
        int i7;
        int length = bArr.length;
        int i8 = (length / 4) * 3;
        if (i8 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        while (true) {
            int i10 = length - 1;
            byte b8 = bArr[i10];
            b7 = 10;
            if (b8 != 10 && b8 != 13 && b8 != 32 && b8 != 9) {
                if (b8 != 61) {
                    break;
                }
                i9++;
            }
            length = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            byte b9 = bArr[i11];
            if (b9 != b7 && b9 != 13 && b9 != 32 && b9 != 9) {
                if (b9 >= 65 && b9 <= 90) {
                    i7 = b9 - 65;
                } else if (b9 >= 97 && b9 <= 122) {
                    i7 = b9 - 71;
                } else if (b9 >= 48 && b9 <= 57) {
                    i7 = b9 + 4;
                } else if (b9 == 43) {
                    i7 = 62;
                } else {
                    if (b9 != 47) {
                        return null;
                    }
                    i7 = 63;
                }
                i12 = (i12 << 6) | ((byte) i7);
                if (i14 % 4 == 3) {
                    int i15 = i13 + 1;
                    bArr2[i13] = (byte) ((16711680 & i12) >> 16);
                    int i16 = i15 + 1;
                    bArr2[i15] = (byte) ((65280 & i12) >> 8);
                    bArr2[i16] = (byte) (i12 & 255);
                    i13 = i16 + 1;
                }
                i14++;
            }
            i11++;
            b7 = 10;
        }
        if (i9 > 0) {
            int i17 = i12 << (i9 * 6);
            int i18 = i13 + 1;
            bArr2[i13] = (byte) ((i17 & 16711680) >> 16);
            if (i9 == 1) {
                i13 = i18 + 1;
                bArr2[i18] = (byte) ((i17 & 65280) >> 8);
            } else {
                i13 = i18;
            }
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    /* renamed from: g */
    public static final String m1360g(CharSequence charSequence) {
        return charSequence == null ? " " : charSequence instanceof String ? (String) charSequence : charSequence.toString();
    }

    /* renamed from: h */
    public static String m1361h(byte[] bArr) {
        byte[] bArr2;
        int length = (bArr.length * 4) / 3;
        byte[] bArr3 = new byte[(length / 76) + 3 + length];
        int length2 = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            bArr2 = f1967c;
            if (i7 >= length2) {
                break;
            }
            int i10 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[i7] & 255) >> 2];
            int i11 = i10 + 1;
            int i12 = i7 + 1;
            bArr3[i10] = bArr2[((bArr[i7] & 3) << 4) | ((bArr[i12] & 255) >> 4)];
            int i13 = i11 + 1;
            int i14 = i7 + 2;
            bArr3[i11] = bArr2[((bArr[i12] & 15) << 2) | ((bArr[i14] & 255) >> 6)];
            i8 = i13 + 1;
            bArr3[i13] = bArr2[bArr[i14] & 63];
            if ((i8 - i9) % 76 == 0 && i8 != 0) {
                i9++;
            }
            i7 += 3;
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            int i15 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[length2] & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[(bArr[length2] & 3) << 4];
            int i17 = i16 + 1;
            bArr3[i16] = 61;
            i8 = i17 + 1;
            bArr3[i17] = 61;
        } else if (length3 == 2) {
            int i18 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[length2] & 255) >> 2];
            int i19 = i18 + 1;
            int i20 = (bArr[length2] & 3) << 4;
            int i21 = length2 + 1;
            bArr3[i18] = bArr2[((bArr[i21] & 255) >> 4) | i20];
            int i22 = i19 + 1;
            bArr3[i19] = bArr2[(bArr[i21] & 15) << 2];
            i8 = i22 + 1;
            bArr3[i22] = 61;
        }
        return new String(bArr3, 0, i8, "utf-8");
    }

    /* renamed from: i */
    public static void m1362i(Context context, boolean z6) {
        String str;
        long j7;
        long j8;
        C1016i3 c1016i3 = C1016i3.f5129e;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        int i7 = 1;
        List<PackageInfo> arrayList = new ArrayList<>(1);
        try {
            arrayList = packageManager.getInstalledPackages(0);
        } catch (Exception e7) {
            c1016i3.m386n(e7);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<PackageInfo> it = arrayList.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            PackageInfo next = it.next();
            ApplicationInfo applicationInfo = next.applicationInfo;
            if (applicationInfo != null) {
                boolean z7 = (applicationInfo.flags & i7) != 0;
                String str2 = applicationInfo.sourceDir;
                if (z6 == z7 && (!z6 || !next.packageName.startsWith("com.android."))) {
                    long j9 = 0;
                    try {
                        j7 = next.firstInstallTime;
                    } catch (Throwable th) {
                        c1016i3.m386n(th);
                        j7 = 0;
                    }
                    try {
                        j8 = next.lastUpdateTime;
                    } catch (Throwable th2) {
                        c1016i3.m386n(th2);
                        j8 = 0;
                    }
                    if (str2 != null) {
                        File file = new File(str2);
                        if (file.exists()) {
                            j9 = file.lastModified();
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("n", next.packageName);
                        jSONObject.put("a", "");
                        jSONObject.put("v", String.valueOf(next.versionName));
                        jSONObject.put("f", j7);
                        jSONObject.put("l", j8);
                        jSONObject.put("m", j9);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e8) {
                        c1016i3.m386n(e8);
                    }
                }
                i7 = 1;
            }
        }
        if (jSONArray.length() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() + "|");
        sb.append(z6 ? 1 : 0);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_list", jSONArray);
            jSONObject2.put("meta-data", sb.toString());
            str = C1109v5.m3246j(jSONObject2.toString().getBytes());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        EnumC1032k5.f5217m.m3099e(System.currentTimeMillis(), context, str);
    }

    /* renamed from: j */
    public static Double m1363j(AbstractC1840b abstractC1840b) {
        double mo4253z;
        if (abstractC1840b instanceof C1894h) {
            mo4253z = ((C1894h) abstractC1840b).f8451f.f8175s;
        } else {
            if (!(abstractC1840b instanceof C1891e)) {
                return null;
            }
            mo4253z = ((C1891e) abstractC1840b).f8440f.mo4253z();
        }
        return Double.valueOf(mo4253z);
    }

    /* renamed from: k */
    public static Integer m1364k(AbstractC1840b abstractC1840b) {
        if (abstractC1840b instanceof C1894h) {
            return Integer.valueOf(((C1894h) abstractC1840b).f8451f.f8175s);
        }
        if (abstractC1840b instanceof C1891e) {
            double mo4253z = ((C1891e) abstractC1840b).f8440f.mo4253z();
            int i7 = (int) mo4253z;
            if (mo4253z == ((double) i7)) {
                return Integer.valueOf(i7);
            }
        }
        return null;
    }

    /* renamed from: l */
    public static float m1365l(int i7) {
        float f7 = i7 / 255.0f;
        return (f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: m */
    public static AbstractC1840b m1366m(C1887a c1887a) {
        Double m1363j;
        int i7;
        AbstractC1840b abstractC1840b = c1887a.f8435g;
        boolean z6 = abstractC1840b instanceof C1894h;
        EnumC1978c enumC1978c = c1887a.f8434f;
        if (z6) {
            AbstractC1840b abstractC1840b2 = c1887a.f8436h;
            if (abstractC1840b2 instanceof C1894h) {
                C1894h c1894h = (C1894h) abstractC1840b;
                C1894h c1894h2 = (C1894h) abstractC1840b2;
                int ordinal = enumC1978c.ordinal();
                if (ordinal == 16) {
                    return new C1894h(c1887a.f8314a, c1894h.f8451f.f8175s + c1894h2.f8451f.f8175s);
                }
                if (ordinal == 17) {
                    return new C1894h(c1887a.f8314a, c1894h.f8451f.f8175s * c1894h2.f8451f.f8175s);
                }
                if (ordinal == 19) {
                    int i8 = c1894h2.f8451f.f8175s;
                    if (i8 != 0) {
                        int i9 = c1887a.f8314a;
                        int i10 = c1894h.f8451f.f8175s;
                        int i11 = i10 / i8;
                        if (i10 - (i8 * i11) != 0 && (((i10 ^ i8) >> 31) | 1) < 0) {
                            i11--;
                        }
                        return new C1894h(i9, i11);
                    }
                } else if (ordinal == 21) {
                    int i12 = c1894h2.f8451f.f8175s;
                    if (i12 != 0) {
                        int i13 = c1887a.f8314a;
                        int i14 = c1894h.f8451f.f8175s;
                        int i15 = i14 % i12;
                        if (i15 == 0) {
                            i7 = 0;
                        } else {
                            if ((((i14 ^ i12) >> 31) | 1) <= 0) {
                                i15 += i12;
                            }
                            i7 = i15;
                        }
                        return new C1894h(i13, i7);
                    }
                } else if (ordinal == 61) {
                    return new C1894h(c1887a.f8314a, c1894h.f8451f.f8175s - c1894h2.f8451f.f8175s);
                }
            }
        }
        Double m1363j2 = m1363j(c1887a.f8435g);
        if (m1363j2 != null && (m1363j = m1363j(c1887a.f8436h)) != null) {
            int ordinal2 = enumC1978c.ordinal();
            if (ordinal2 == 16) {
                return new C1891e(c1887a.f8314a, Double.valueOf(m1363j.doubleValue() + m1363j2.doubleValue()));
            }
            if (ordinal2 == 17) {
                return new C1891e(c1887a.f8314a, Double.valueOf(m1363j.doubleValue() * m1363j2.doubleValue()));
            }
            if (ordinal2 == 20) {
                return new C1891e(c1887a.f8314a, Double.valueOf(Math.pow(m1363j2.doubleValue(), m1363j.doubleValue())));
            }
            if (ordinal2 == 61) {
                return new C1891e(c1887a.f8314a, Double.valueOf(m1363j2.doubleValue() - m1363j.doubleValue()));
            }
            if (m1363j.doubleValue() != 0.0d) {
                int ordinal3 = enumC1978c.ordinal();
                if (ordinal3 == 18) {
                    return new C1891e(c1887a.f8314a, Double.valueOf(m1363j2.doubleValue() / m1363j.doubleValue()));
                }
                if (ordinal3 == 19) {
                    int i16 = c1887a.f8314a;
                    double doubleValue = m1363j2.doubleValue();
                    double doubleValue2 = m1363j.doubleValue();
                    int i17 = C2130b.f9603s;
                    return new C1891e(i16, Double.valueOf(Math.floor(doubleValue / doubleValue2)));
                }
                if (ordinal3 == 21) {
                    int i18 = c1887a.f8314a;
                    double doubleValue3 = m1363j2.doubleValue();
                    double doubleValue4 = m1363j.doubleValue();
                    int i19 = C2130b.f9603s;
                    if ((doubleValue3 <= 0.0d || doubleValue4 != Double.POSITIVE_INFINITY) && (doubleValue3 >= 0.0d || doubleValue4 != Double.NEGATIVE_INFINITY)) {
                        doubleValue3 = ((doubleValue3 <= 0.0d || doubleValue4 != Double.NEGATIVE_INFINITY) && (doubleValue3 >= 0.0d || doubleValue4 != Double.POSITIVE_INFINITY)) ? doubleValue3 - (Math.floor(doubleValue3 / doubleValue4) * doubleValue4) : doubleValue4;
                    }
                    return new C1891e(i18, Double.valueOf(doubleValue3));
                }
            }
        }
        return c1887a;
    }

    /* renamed from: n */
    public static AbstractC1840b m1367n(C1887a c1887a) {
        Integer m1364k;
        Integer m1364k2 = m1364k(c1887a.f8435g);
        if (m1364k2 != null && (m1364k = m1364k(c1887a.f8436h)) != null) {
            int ordinal = c1887a.f8434f.ordinal();
            if (ordinal == 63) {
                return new C1894h(c1887a.f8314a, m1364k2.intValue() ^ m1364k.intValue());
            }
            switch (ordinal) {
                case 22:
                    return new C1894h(c1887a.f8314a, m1364k2.intValue() & m1364k.intValue());
                case 23:
                    return new C1894h(c1887a.f8314a, m1364k2.intValue() | m1364k.intValue());
                case 24:
                    int i7 = c1887a.f8314a;
                    long intValue = m1364k2.intValue();
                    long intValue2 = m1364k.intValue();
                    int i8 = C2130b.f9603s;
                    return new C1894h(i7, (int) (intValue2 >= 0 ? intValue >>> ((int) intValue2) : intValue << ((int) (-intValue2))));
                case 25:
                    int i9 = c1887a.f8314a;
                    long intValue3 = m1364k2.intValue();
                    long intValue4 = m1364k.intValue();
                    int i10 = C2130b.f9603s;
                    return new C1894h(i9, (int) (intValue4 >= 0 ? intValue3 << ((int) intValue4) : intValue3 >>> ((int) (-intValue4))));
            }
        }
        return c1887a;
    }

    /* renamed from: o */
    public static AbstractC1840b m1368o(AbstractC1840b abstractC1840b) {
        if (!(abstractC1840b instanceof C1887a)) {
            return abstractC1840b;
        }
        C1887a c1887a = (C1887a) abstractC1840b;
        if (c1887a.f8434f == EnumC1978c.f8883J1) {
            c1887a.f8436h = m1368o(c1887a.f8436h);
        }
        return m1366m(c1887a);
    }

    /* renamed from: p */
    public static void m1369p(String str, boolean z6) {
        AbstractApplicationC2012b abstractApplicationC2012b = AbstractApplicationC2012b.f9161c;
        View inflate = LayoutInflater.from(abstractApplicationC2012b).inflate(R.layout.toast_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.toastlayoutTextView1);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.animation_view);
        lottieAnimationView.setAnimation(z6 ? "lottie/toast/blink/day/data.json" : "lottie/toast/frown/day/data.json");
        C0020g c0020g = lottieAnimationView.f3233w1;
        c0020g.f47m.setRepeatCount(-1);
        c0020g.m112c();
        lottieAnimationView.m2182d();
        textView.setText(str);
        Toast toast = f1966b;
        if (toast == null) {
            Toast toast2 = new Toast(abstractApplicationC2012b);
            f1966b = toast2;
            toast2.setGravity(1, 0, 70);
            f1966b.setDuration(0);
            f1966b.setView(inflate);
        } else {
            toast.setText(str);
            f1966b.setDuration(0);
        }
        f1966b.show();
    }

    /* renamed from: q */
    public static void m1370q(String str, boolean z6) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Toast toast = f1966b;
            if (toast != null) {
                toast.cancel();
                f1966b = null;
            }
            m1369p(str, z6);
        } catch (Exception e7) {
            System.out.println(e7.getMessage());
        }
    }

    /* renamed from: r */
    public static float m1371r() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        boolean z6 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z6) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z6) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }

    @Override // p111n5.InterfaceC1647c
    /* renamed from: d */
    public String[] mo106d() {
        return new String[]{"RANDOM", "RANDOM_HEX", "UUID"};
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new LinkedHashSet();
    }
}
