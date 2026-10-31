package p036e2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.ext.C0090b;
import android.ext.C0091c;
import android.ext.RootDetector;
import android.ext.Tools;
import android.graphics.Path;
import android.util.JsonReader;
import android.util.Log;
import androidx.activity.C0143v;
import androidx.lifecycle.C0391d0;
import com.airbnb.lottie.C0680a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p002a1.C0017d;
import p016c.C0572z;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1158c;
import p043f1.C1159d;
import p043f1.C1161f;
import p043f1.InterfaceC1162g;
import p051g1.C1192a;
import p051g1.C1195d;
import p051g1.C1196e;
import p051g1.C1198g;
import p051g1.C1199h;
import p051g1.C1200i;
import p051g1.C1201j;
import p051g1.C1203l;
import p051g1.C1204m;
import p051g1.C1205n;
import p051g1.C1206o;
import p051g1.C1207p;
import p051g1.InterfaceC1193b;
import p067i1.C1320b;
import p067i1.C1327i;
import p075j1.C1403d;
import p120p.C1686g;
import p142r6.AbstractC1856m;
import p158t6.InterfaceC1950e;

/* renamed from: e2.v5 */
/* loaded from: classes.dex */
public final class C1109v5 {

    /* renamed from: a */
    public static byte[] f5489a = null;

    /* renamed from: b */
    public static byte[] f5490b = null;

    /* renamed from: c */
    public static final C1109v5 f5491c = new C1109v5();

    /* renamed from: d */
    public static final String[] f5492d = {"h9YLQoINGWyOBYYk", "30212102dicudiab", "dm1VEmW651QTz4MD"};

    /* renamed from: e */
    public static String f5493e = "";

    /* renamed from: a */
    public static float m3238a(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m3239b(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (float) ((Math.pow(f7, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m3240c(Context context, float f7) {
        if (context == null) {
            return 0;
        }
        return (int) ((f7 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    public static synchronized C0572z m3241d(Context context) {
        C0572z c0572z;
        synchronized (C1109v5.class) {
            c0572z = new C0572z(6);
            C1116w5.m3271a(context, c0572z);
        }
        return c0572z;
    }

    /* renamed from: f */
    public static RSAKey m3242f(byte[] bArr) {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* renamed from: g */
    public static byte[] m3243g() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(Tools.Semaphore.f159S7, new SecureRandom());
        return keyGenerator.generateKey().getEncoded();
    }

    /* renamed from: h */
    public static byte[] m3244h(int i7, Key key, int i8, byte[] bArr) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(i7, key);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i9 = 0;
        while (i9 < bArr.length) {
            int length = bArr.length - i9;
            if (length > i8) {
                length = i8;
            }
            byteArrayOutputStream.write(cipher.doFinal(bArr, i9, length));
            i9 += i8;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: i */
    public static byte[] m3245i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr3);
    }

    /* renamed from: j */
    public static String m3246j(byte[] bArr) {
        try {
            byte[] m3243g = m3243g();
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            return m3249m(m3243g, bArr2, bArr);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: k */
    public static byte[] m3247k() {
        return new byte[]{48, -127, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -79, 21, -34, -73, 37, -48, -29, 119, 8, -81, -27, -81, -127, -98, -68, -45, -22, Byte.MAX_VALUE, -82, 126, -122, 87, 8, 122, -21, 108, 69, -10, 70, -1, 123, 11, 90, -11, -5, -4, -53, 90, 78, 94, -62, 45, 28, -121, -10, 34, -31, -95, 54, -76, -88, 20, 30, -4, 47, -68, 60, 18, -102, 111, 86, -109, -49, -114, -41, 27, -72, 83, 59, -26, -89, -114, -12, -78, 86, 84, -111, -23, 118, 122, 72, 68, 124, 3, -122, -24, -14, 75, -73, -20, -21, -122, 49, -101, 53, -109, -61, 8, 10, 82, 0, -100, -94, -62, -83, 35, -93, 117, 40, 66, -80, Byte.MAX_VALUE, -25, -39, -64, -7, 34, -76, 119, 108, -33, -26, -29, -15, 117, 69, -89, 91, 2, 3, 1, 0, 1};
    }

    /* renamed from: l */
    public static String m3248l(byte[] bArr) {
        try {
            return C0391d0.m1361h(m3244h(1, (Key) m3242f(m3247k()), ((r0.getModulus().bitLength() + 1) / 8) - 11, bArr));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public static String m3249m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] byteArray;
        if (bArr3 == null) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArr3);
                    gZIPOutputStream.close();
                } catch (IOException unused) {
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Exception unused2) {
                return "";
            }
        }
        return C0391d0.m1361h(m3245i(bArr, bArr2, byteArray)) + "|" + m3248l(bArr) + "|" + m3248l(bArr2);
    }

    /* renamed from: n */
    public static byte[] m3250n() {
        byte[] bArr = f5490b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(C0017d.f18f).modPow(new BigInteger(C0017d.f19g), new BigInteger(C0017d.f20h)).toByteArray();
        f5490b = byteArray;
        return byteArray;
    }

    /* renamed from: o */
    public static void m3251o(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: p */
    public static void m3252p(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: q */
    public static void m3253q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: r */
    public static int m3254r(float f7, int i7, int i8) {
        float f8 = ((i7 >> 24) & 255) / 255.0f;
        float f9 = ((i8 >> 24) & 255) / 255.0f;
        float m3238a = m3238a(((i7 >> 16) & 255) / 255.0f);
        float m3238a2 = m3238a(((i7 >> 8) & 255) / 255.0f);
        float m3238a3 = m3238a((i7 & 255) / 255.0f);
        float m3238a4 = m3238a(((i8 >> 16) & 255) / 255.0f);
        float m3238a5 = m3238a(((i8 >> 8) & 255) / 255.0f);
        float m3238a6 = m3238a((i8 & 255) / 255.0f);
        float m227e = C0091c.m227e(f9, f8, f7, f8);
        float m227e2 = C0091c.m227e(m3238a4, m3238a, f7, m3238a);
        float m227e3 = C0091c.m227e(m3238a5, m3238a2, f7, m3238a2);
        float m227e4 = C0091c.m227e(m3238a6, m3238a3, f7, m3238a3);
        float m3239b = m3239b(m227e2) * 255.0f;
        float m3239b2 = m3239b(m227e3) * 255.0f;
        return Math.round(m3239b(m227e4) * 255.0f) | (Math.round(m3239b) << 16) | (Math.round(m227e * 255.0f) << 24) | (Math.round(m3239b2) << 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: s */
    public static InterfaceC1193b m3255s(JsonReader jsonReader, C0680a c0680a) {
        String str;
        char c7;
        InterfaceC1193b c1192a;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        jsonReader.beginObject();
        while (true) {
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            if (jsonReader.nextName().equals("ty")) {
                str = jsonReader.nextString();
                break;
            }
            jsonReader.skipValue();
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 3669:
                if (str.equals(RootDetector.SH_KEY)) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                String str2 = null;
                InterfaceC1162g interfaceC1162g = null;
                C1156a c1156a = null;
                while (true) {
                    boolean z6 = false;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        int hashCode = nextName.hashCode();
                        if (hashCode == 100) {
                            if (nextName.equals("d")) {
                                c8 = 0;
                            }
                            c8 = 65535;
                        } else if (hashCode == 112) {
                            if (nextName.equals("p")) {
                                c8 = 1;
                            }
                            c8 = 65535;
                        } else if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c8 = 3;
                            }
                            c8 = 65535;
                        } else {
                            if (nextName.equals("s")) {
                                c8 = 2;
                            }
                            c8 = 65535;
                        }
                        if (c8 != 0) {
                            if (c8 == 1) {
                                interfaceC1162g = C0143v.m461r0(jsonReader, c0680a);
                            } else if (c8 == 2) {
                                c1156a = C0143v.m459q0(jsonReader, c0680a);
                            } else if (c8 != 3) {
                                jsonReader.skipValue();
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        } else if (jsonReader.nextInt() == 3) {
                            z6 = true;
                        }
                    }
                    c1192a = new C1192a(str2, interfaceC1162g, c1156a, z6);
                    break;
                }
            case 1:
                int i7 = 1;
                C1156a c1156a2 = null;
                C1159d c1159d = null;
                String str3 = null;
                boolean z7 = false;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    int hashCode2 = nextName2.hashCode();
                    if (hashCode2 == -396065730) {
                        if (nextName2.equals("fillEnabled")) {
                            c9 = 0;
                        }
                        c9 = 65535;
                    } else if (hashCode2 == 99) {
                        if (nextName2.equals("c")) {
                            c9 = 1;
                        }
                        c9 = 65535;
                    } else if (hashCode2 == 111) {
                        if (nextName2.equals("o")) {
                            c9 = 2;
                        }
                        c9 = 65535;
                    } else if (hashCode2 != 114) {
                        if (hashCode2 == 3519 && nextName2.equals("nm")) {
                            c9 = 4;
                        }
                        c9 = 65535;
                    } else {
                        if (nextName2.equals("r")) {
                            c9 = 3;
                        }
                        c9 = 65535;
                    }
                    if (c9 == 0) {
                        z7 = jsonReader.nextBoolean();
                    } else if (c9 == 1) {
                        c1156a2 = C0143v.m430a0(jsonReader, c0680a);
                    } else if (c9 == 2) {
                        c1159d = C0143v.m457p0(jsonReader, c0680a);
                    } else if (c9 == 3) {
                        i7 = jsonReader.nextInt();
                    } else if (c9 != 4) {
                        jsonReader.skipValue();
                    } else {
                        str3 = jsonReader.nextString();
                    }
                }
                c1192a = new C1203l(str3, z7, i7 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c1156a2, c1159d);
                break;
            case 2:
                String str4 = null;
                Path.FillType fillType = null;
                C1158c c1158c = null;
                C1156a c1156a3 = null;
                C1156a c1156a4 = null;
                C1159d c1159d2 = null;
                int i8 = 0;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    int hashCode3 = nextName3.hashCode();
                    if (hashCode3 == 101) {
                        if (nextName3.equals("e")) {
                            c10 = 0;
                        }
                        c10 = 65535;
                    } else if (hashCode3 == 103) {
                        if (nextName3.equals("g")) {
                            c10 = 1;
                        }
                        c10 = 65535;
                    } else if (hashCode3 == 111) {
                        if (nextName3.equals("o")) {
                            c10 = 2;
                        }
                        c10 = 65535;
                    } else if (hashCode3 != 3519) {
                        switch (hashCode3) {
                            case 114:
                                if (nextName3.equals("r")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 115:
                                if (nextName3.equals("s")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 116:
                                if (nextName3.equals("t")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                    } else {
                        if (nextName3.equals("nm")) {
                            c10 = 6;
                        }
                        c10 = 65535;
                    }
                    switch (c10) {
                        case 0:
                            c1156a4 = C0143v.m459q0(jsonReader, c0680a);
                            break;
                        case 1:
                            jsonReader.beginObject();
                            int i9 = -1;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (nextName4.equals("k")) {
                                    c1158c = new C1158c(0, C0017d.m70I(1.0f, jsonReader, c0680a, new C1320b(i9)));
                                } else if (nextName4.equals("p")) {
                                    i9 = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        case 2:
                            c1159d2 = C0143v.m457p0(jsonReader, c0680a);
                            break;
                        case 3:
                            fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 4:
                            c1156a3 = C0143v.m459q0(jsonReader, c0680a);
                            break;
                        case 5:
                            if (jsonReader.nextInt() == 1) {
                                i8 = 1;
                                break;
                            } else {
                                i8 = 2;
                                break;
                            }
                        case 6:
                            str4 = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                c1192a = new C1195d(str4, i8, fillType, c1158c, c1159d2, c1156a3, c1156a4);
                break;
            case 3:
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    if (nextName5.equals("it")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            InterfaceC1193b m3255s = m3255s(jsonReader, c0680a);
                            if (m3255s != null) {
                                arrayList.add(m3255s);
                            }
                        }
                        jsonReader.endArray();
                    } else if (nextName5.equals("nm")) {
                        str5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                c1192a = new C1204m(str5, arrayList);
                break;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                String str6 = null;
                C1158c c1158c2 = null;
                C1159d c1159d3 = null;
                C1156a c1156a5 = null;
                C1156a c1156a6 = null;
                C1157b c1157b = null;
                int i10 = 0;
                int i11 = 0;
                C1157b c1157b2 = null;
                int i12 = 0;
                while (jsonReader.hasNext()) {
                    C1156a c1156a7 = c1156a5;
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    C1159d c1159d4 = c1159d3;
                    int hashCode4 = nextName6.hashCode();
                    C1158c c1158c3 = c1158c2;
                    if (hashCode4 == 100) {
                        if (nextName6.equals("d")) {
                            c11 = 0;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 101) {
                        if (nextName6.equals("e")) {
                            c11 = 1;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 103) {
                        if (nextName6.equals("g")) {
                            c11 = 2;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 111) {
                        if (nextName6.equals("o")) {
                            c11 = 3;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 119) {
                        if (nextName6.equals("w")) {
                            c11 = 6;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 3447) {
                        if (nextName6.equals("lc")) {
                            c11 = 7;
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 3454) {
                        if (nextName6.equals("lj")) {
                            c11 = '\b';
                        }
                        c11 = 65535;
                    } else if (hashCode4 == 3519) {
                        if (nextName6.equals("nm")) {
                            c11 = '\t';
                        }
                        c11 = 65535;
                    } else if (hashCode4 != 115) {
                        if (hashCode4 == 116 && nextName6.equals("t")) {
                            c11 = 5;
                        }
                        c11 = 65535;
                    } else {
                        if (nextName6.equals("s")) {
                            c11 = 4;
                        }
                        c11 = 65535;
                    }
                    switch (c11) {
                        case 0:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str7 = null;
                                C1157b c1157b3 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.getClass();
                                    if (nextName7.equals("n")) {
                                        str7 = jsonReader.nextString();
                                    } else if (nextName7.equals("v")) {
                                        c1157b3 = C0143v.m453n0(jsonReader, c0680a, true);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str7.equals("o")) {
                                    c1157b2 = c1157b3;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    arrayList2.add(c1157b3);
                                }
                            }
                            jsonReader.endArray();
                            if (arrayList2.size() == 1) {
                                arrayList2.add(arrayList2.get(0));
                            }
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case 1:
                            c1156a6 = C0143v.m459q0(jsonReader, c0680a);
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case 2:
                            jsonReader.beginObject();
                            int i13 = -1;
                            c1158c2 = c1158c3;
                            while (jsonReader.hasNext()) {
                                String nextName8 = jsonReader.nextName();
                                nextName8.getClass();
                                if (nextName8.equals("k")) {
                                    c1158c2 = new C1158c(0, C0017d.m70I(1.0f, jsonReader, c0680a, new C1320b(i13)));
                                } else if (nextName8.equals("p")) {
                                    i13 = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            break;
                        case 3:
                            c1159d3 = C0143v.m457p0(jsonReader, c0680a);
                            c1156a5 = c1156a7;
                            c1158c2 = c1158c3;
                            break;
                        case 4:
                            c1156a5 = C0143v.m459q0(jsonReader, c0680a);
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case 5:
                            i12 = jsonReader.nextInt() == 1 ? 1 : 2;
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case 6:
                            c1157b = C0143v.m453n0(jsonReader, c0680a, true);
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case 7:
                            i10 = C1686g.m4109d(3)[jsonReader.nextInt() - 1];
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case '\b':
                            i11 = C1686g.m4109d(3)[jsonReader.nextInt() - 1];
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        case '\t':
                            str6 = jsonReader.nextString();
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                        default:
                            jsonReader.skipValue();
                            c1156a5 = c1156a7;
                            c1159d3 = c1159d4;
                            c1158c2 = c1158c3;
                            break;
                    }
                }
                c1192a = new C1196e(str6, i12, c1158c2, c1159d3, c1156a5, c1156a6, c1157b, i10, i11, arrayList2, c1157b2);
                break;
            case 5:
                String str8 = null;
                int i14 = 0;
                while (jsonReader.hasNext()) {
                    String nextName9 = jsonReader.nextName();
                    nextName9.getClass();
                    if (nextName9.equals("mm")) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt != 1) {
                            if (nextInt == 2) {
                                i14 = 2;
                            } else if (nextInt == 3) {
                                i14 = 3;
                            } else if (nextInt == 4) {
                                i14 = 4;
                            } else if (nextInt == 5) {
                                i14 = 5;
                            }
                        }
                        i14 = 1;
                    } else if (nextName9.equals("nm")) {
                        str8 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                c1192a = new C1198g(str8, i14);
                break;
            case 6:
                InterfaceC1162g interfaceC1162g2 = null;
                String str9 = null;
                C1156a c1156a8 = null;
                C1157b c1157b4 = null;
                while (jsonReader.hasNext()) {
                    String nextName10 = jsonReader.nextName();
                    nextName10.getClass();
                    int hashCode5 = nextName10.hashCode();
                    if (hashCode5 == 112) {
                        if (nextName10.equals("p")) {
                            c12 = 0;
                        }
                        c12 = 65535;
                    } else if (hashCode5 == 3519) {
                        if (nextName10.equals("nm")) {
                            c12 = 3;
                        }
                        c12 = 65535;
                    } else if (hashCode5 != 114) {
                        if (hashCode5 == 115 && nextName10.equals("s")) {
                            c12 = 2;
                        }
                        c12 = 65535;
                    } else {
                        if (nextName10.equals("r")) {
                            c12 = 1;
                        }
                        c12 = 65535;
                    }
                    if (c12 == 0) {
                        interfaceC1162g2 = C0143v.m461r0(jsonReader, c0680a);
                    } else if (c12 == 1) {
                        c1157b4 = C0143v.m453n0(jsonReader, c0680a, true);
                    } else if (c12 == 2) {
                        c1156a8 = C0143v.m459q0(jsonReader, c0680a);
                    } else if (c12 != 3) {
                        jsonReader.skipValue();
                    } else {
                        str9 = jsonReader.nextString();
                    }
                }
                c1192a = new C1200i(str9, interfaceC1162g2, c1156a8, c1157b4);
                break;
            case 7:
                C1157b c1157b5 = null;
                String str10 = null;
                C1157b c1157b6 = null;
                C1161f c1161f = null;
                while (jsonReader.hasNext()) {
                    String nextName11 = jsonReader.nextName();
                    nextName11.getClass();
                    int hashCode6 = nextName11.hashCode();
                    if (hashCode6 == 99) {
                        if (nextName11.equals("c")) {
                            c13 = 0;
                        }
                        c13 = 65535;
                    } else if (hashCode6 == 111) {
                        if (nextName11.equals("o")) {
                            c13 = 1;
                        }
                        c13 = 65535;
                    } else if (hashCode6 != 3519) {
                        if (hashCode6 == 3710 && nextName11.equals("tr")) {
                            c13 = 3;
                        }
                        c13 = 65535;
                    } else {
                        if (nextName11.equals("nm")) {
                            c13 = 2;
                        }
                        c13 = 65535;
                    }
                    if (c13 == 0) {
                        c1157b5 = C0143v.m453n0(jsonReader, c0680a, false);
                    } else if (c13 == 1) {
                        c1157b6 = C0143v.m453n0(jsonReader, c0680a, false);
                    } else if (c13 == 2) {
                        str10 = jsonReader.nextString();
                    } else if (c13 != 3) {
                        jsonReader.skipValue();
                    } else {
                        c1161f = C0017d.m69H(jsonReader, c0680a);
                    }
                }
                c1192a = new C1201j(str10, c1157b5, c1157b6, c1161f);
                break;
            case '\b':
                C1159d c1159d5 = null;
                String str11 = null;
                int i15 = 0;
                while (jsonReader.hasNext()) {
                    String nextName12 = jsonReader.nextName();
                    nextName12.getClass();
                    int hashCode7 = nextName12.hashCode();
                    if (hashCode7 == 3432) {
                        if (nextName12.equals("ks")) {
                            c14 = 0;
                        }
                        c14 = 65535;
                    } else if (hashCode7 != 3519) {
                        if (hashCode7 == 104415 && nextName12.equals("ind")) {
                            c14 = 2;
                        }
                        c14 = 65535;
                    } else {
                        if (nextName12.equals("nm")) {
                            c14 = 1;
                        }
                        c14 = 65535;
                    }
                    if (c14 == 0) {
                        c1159d5 = new C1159d(1, C0017d.m70I(C1403d.m3756c(), jsonReader, c0680a, C1327i.f6526a));
                    } else if (c14 == 1) {
                        str11 = jsonReader.nextString();
                    } else if (c14 != 2) {
                        jsonReader.skipValue();
                    } else {
                        i15 = jsonReader.nextInt();
                    }
                }
                c1192a = new C1205n(str11, i15, c1159d5);
                break;
            case '\t':
                C1157b c1157b7 = null;
                C1157b c1157b8 = null;
                C1157b c1157b9 = null;
                InterfaceC1162g interfaceC1162g3 = null;
                C1157b c1157b10 = null;
                C1157b c1157b11 = null;
                C1157b c1157b12 = null;
                String str12 = null;
                while (true) {
                    int i16 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName13 = jsonReader.nextName();
                        nextName13.getClass();
                        int hashCode8 = nextName13.hashCode();
                        if (hashCode8 == 112) {
                            if (nextName13.equals("p")) {
                                c15 = 0;
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 114) {
                            if (nextName13.equals("r")) {
                                c15 = 1;
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 3519) {
                            if (nextName13.equals("nm")) {
                                c15 = 4;
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 3588) {
                            if (nextName13.equals("pt")) {
                                c15 = 7;
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 3686) {
                            if (nextName13.equals("sy")) {
                                c15 = '\b';
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 3369) {
                            if (nextName13.equals("ir")) {
                                c15 = 2;
                            }
                            c15 = 65535;
                        } else if (hashCode8 == 3370) {
                            if (nextName13.equals("is")) {
                                c15 = 3;
                            }
                            c15 = 65535;
                        } else if (hashCode8 != 3555) {
                            if (hashCode8 == 3556 && nextName13.equals("os")) {
                                c15 = 6;
                            }
                            c15 = 65535;
                        } else {
                            if (nextName13.equals("or")) {
                                c15 = 5;
                            }
                            c15 = 65535;
                        }
                        switch (c15) {
                            case 0:
                                interfaceC1162g3 = C0143v.m461r0(jsonReader, c0680a);
                                break;
                            case 1:
                                c1157b10 = C0143v.m453n0(jsonReader, c0680a, false);
                                break;
                            case 2:
                                c1157b11 = C0143v.m453n0(jsonReader, c0680a, true);
                                break;
                            case 3:
                                c1157b8 = C0143v.m453n0(jsonReader, c0680a, false);
                                break;
                            case 4:
                                str12 = jsonReader.nextString();
                                break;
                            case 5:
                                c1157b12 = C0143v.m453n0(jsonReader, c0680a, true);
                                break;
                            case 6:
                                c1157b9 = C0143v.m453n0(jsonReader, c0680a, false);
                                break;
                            case 7:
                                c1157b7 = C0143v.m453n0(jsonReader, c0680a, false);
                                break;
                            case '\b':
                                int nextInt2 = jsonReader.nextInt();
                                int[] m4109d = C1686g.m4109d(2);
                                int length = m4109d.length;
                                for (int i17 = 0; i17 < length; i17++) {
                                    i16 = m4109d[i17];
                                    if (C0090b.m218d(i16) == nextInt2) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    c1192a = new C1199h(str12, i16, c1157b7, interfaceC1162g3, c1157b10, c1157b11, c1157b12, c1157b8, c1157b9);
                    break;
                }
            case '\n':
                ArrayList arrayList3 = new ArrayList();
                C1159d c1159d6 = null;
                C1157b c1157b13 = null;
                C1156a c1156a9 = null;
                String str13 = null;
                C1157b c1157b14 = null;
                int i18 = 111;
                int i19 = 0;
                int i20 = 0;
                while (jsonReader.hasNext()) {
                    int i21 = i20;
                    String nextName14 = jsonReader.nextName();
                    nextName14.getClass();
                    int i22 = i19;
                    int hashCode9 = nextName14.hashCode();
                    C1157b c1157b15 = c1157b14;
                    if (hashCode9 == 99) {
                        if (nextName14.equals("c")) {
                            c16 = 0;
                        }
                        c16 = 65535;
                    } else if (hashCode9 == 100) {
                        if (nextName14.equals("d")) {
                            c16 = 1;
                        }
                        c16 = 65535;
                    } else if (hashCode9 == i18) {
                        if (nextName14.equals("o")) {
                            c16 = 2;
                        }
                        c16 = 65535;
                    } else if (hashCode9 == 119) {
                        if (nextName14.equals("w")) {
                            c16 = 3;
                        }
                        c16 = 65535;
                    } else if (hashCode9 == 3447) {
                        if (nextName14.equals("lc")) {
                            c16 = 4;
                        }
                        c16 = 65535;
                    } else if (hashCode9 != 3454) {
                        if (hashCode9 == 3519 && nextName14.equals("nm")) {
                            c16 = 6;
                        }
                        c16 = 65535;
                    } else {
                        if (nextName14.equals("lj")) {
                            c16 = 5;
                        }
                        c16 = 65535;
                    }
                    switch (c16) {
                        case 0:
                            c1156a9 = C0143v.m430a0(jsonReader, c0680a);
                            i18 = 111;
                            i20 = i21;
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                        case 1:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str14 = null;
                                C1157b c1157b16 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName15 = jsonReader.nextName();
                                    nextName15.getClass();
                                    if (nextName15.equals("n")) {
                                        str14 = jsonReader.nextString();
                                    } else if (nextName15.equals("v")) {
                                        c1157b16 = C0143v.m453n0(jsonReader, c0680a, true);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                str14.getClass();
                                int hashCode10 = str14.hashCode();
                                if (hashCode10 == 100) {
                                    if (str14.equals("d")) {
                                        c17 = 0;
                                    }
                                    c17 = 65535;
                                } else if (hashCode10 != 103) {
                                    if (hashCode10 == 111 && str14.equals("o")) {
                                        c17 = 2;
                                    }
                                    c17 = 65535;
                                } else {
                                    if (str14.equals("g")) {
                                        c17 = 1;
                                    }
                                    c17 = 65535;
                                }
                                if (c17 == 0 || c17 == 1) {
                                    arrayList3.add(c1157b16);
                                } else if (c17 == 2) {
                                    c1157b13 = c1157b16;
                                }
                            }
                            jsonReader.endArray();
                            if (arrayList3.size() == 1) {
                                arrayList3.add(arrayList3.get(0));
                            }
                            i18 = 111;
                            i20 = i21;
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                        case 2:
                            c1159d6 = C0143v.m457p0(jsonReader, c0680a);
                            i18 = 111;
                            i20 = i21;
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                        case 3:
                            c1157b14 = C0143v.m453n0(jsonReader, c0680a, true);
                            i20 = i21;
                            i19 = i22;
                            break;
                        case 4:
                            i19 = C1686g.m4109d(3)[jsonReader.nextInt() - 1];
                            i20 = i21;
                            c1157b14 = c1157b15;
                            break;
                        case 5:
                            i20 = C1686g.m4109d(3)[jsonReader.nextInt() - 1];
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                        case 6:
                            str13 = jsonReader.nextString();
                            i18 = 111;
                            i20 = i21;
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                        default:
                            jsonReader.skipValue();
                            i18 = 111;
                            i20 = i21;
                            i19 = i22;
                            c1157b14 = c1157b15;
                            break;
                    }
                }
                c1192a = new C1206o(str13, c1157b13, arrayList3, c1156a9, c1159d6, c1157b14, i19, i20);
                break;
            case 11:
                C1157b c1157b17 = null;
                C1157b c1157b18 = null;
                C1157b c1157b19 = null;
                String str15 = null;
                int i23 = 0;
                while (jsonReader.hasNext()) {
                    String nextName16 = jsonReader.nextName();
                    nextName16.getClass();
                    int hashCode11 = nextName16.hashCode();
                    if (hashCode11 == 101) {
                        if (nextName16.equals("e")) {
                            c18 = 0;
                        }
                        c18 = 65535;
                    } else if (hashCode11 == 109) {
                        if (nextName16.equals("m")) {
                            c18 = 1;
                        }
                        c18 = 65535;
                    } else if (hashCode11 == 111) {
                        if (nextName16.equals("o")) {
                            c18 = 2;
                        }
                        c18 = 65535;
                    } else if (hashCode11 != 115) {
                        if (hashCode11 == 3519 && nextName16.equals("nm")) {
                            c18 = 4;
                        }
                        c18 = 65535;
                    } else {
                        if (nextName16.equals("s")) {
                            c18 = 3;
                        }
                        c18 = 65535;
                    }
                    if (c18 == 0) {
                        c1157b18 = C0143v.m453n0(jsonReader, c0680a, false);
                    } else if (c18 == 1) {
                        int nextInt3 = jsonReader.nextInt();
                        if (nextInt3 == 1) {
                            i23 = 1;
                        } else {
                            if (nextInt3 != 2) {
                                throw new IllegalArgumentException(C0090b.m219e("Unknown trim path type ", nextInt3));
                            }
                            i23 = 2;
                        }
                    } else if (c18 == 2) {
                        c1157b19 = C0143v.m453n0(jsonReader, c0680a, false);
                    } else if (c18 == 3) {
                        c1157b17 = C0143v.m453n0(jsonReader, c0680a, false);
                    } else if (c18 != 4) {
                        jsonReader.skipValue();
                    } else {
                        str15 = jsonReader.nextString();
                    }
                }
                c1192a = new C1207p(str15, i23, c1157b17, c1157b18, c1157b19);
                break;
            case '\f':
                c1192a = C0017d.m69H(jsonReader, c0680a);
                break;
            default:
                Log.w("LOTTIE", "Unknown shape type ".concat(str));
                c1192a = null;
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return c1192a;
    }

    /* renamed from: t */
    public static void m3256t(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) arrayList.get(i7);
            j7 = Math.max(j7, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j7);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: u */
    public static void m3257u(InterfaceC1950e interfaceC1950e, AbstractC1856m abstractC1856m) {
        AbstractC1856m abstractC1856m2 = abstractC1856m;
        int i7 = 0;
        while (abstractC1856m2 != null) {
            interfaceC1950e.mo4375a(abstractC1856m2, i7);
            if (abstractC1856m2.mo4367g() > 0) {
                abstractC1856m2 = abstractC1856m2.mo4370k().get(0);
                i7++;
            } else {
                while (abstractC1856m2.m4388o() == null && i7 > 0) {
                    interfaceC1950e.mo4376b(abstractC1856m2, i7);
                    abstractC1856m2 = abstractC1856m2.f8357c;
                    i7--;
                }
                interfaceC1950e.mo4376b(abstractC1856m2, i7);
                if (abstractC1856m2 == abstractC1856m) {
                    return;
                } else {
                    abstractC1856m2 = abstractC1856m2.m4388o();
                }
            }
        }
    }

    /* renamed from: e */
    public String m3258e(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i7 = 0; i7 < (bArr.length + 4) / 5; i7++) {
            short[] sArr = new short[5];
            int[] iArr = new int[8];
            int i8 = 5;
            for (int i9 = 0; i9 < 5; i9++) {
                int i10 = (i7 * 5) + i9;
                if (i10 < bArr.length) {
                    sArr[i9] = (short) (bArr[i10] & 255);
                } else {
                    sArr[i9] = 0;
                    i8--;
                }
            }
            int i11 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? -1 : 0 : 1 : 3 : 4 : 6;
            short s7 = sArr[0];
            iArr[0] = (byte) ((s7 >> 3) & 31);
            short s8 = sArr[1];
            iArr[1] = (byte) (((s7 & 7) << 2) | ((s8 >> 6) & 3));
            iArr[2] = (byte) ((s8 >> 1) & 31);
            short s9 = sArr[2];
            iArr[3] = (byte) (((s8 & 1) << 4) | ((s9 >> 4) & 15));
            short s10 = sArr[3];
            iArr[4] = (byte) (((s9 & 15) << 1) | ((s10 >> 7) & 1));
            iArr[5] = (byte) ((s10 >> 2) & 31);
            short s11 = sArr[4];
            iArr[6] = (byte) (((s11 >> 5) & 7) | ((s10 & 3) << 3));
            iArr[7] = (byte) (s11 & 31);
            for (int i12 = 0; i12 < 8 - i11; i12++) {
                byteArrayOutputStream.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=".charAt(iArr[i12]));
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}
