package p002a1;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.C0143v;
import androidx.lifecycle.C0391d0;
import androidx.lifecycle.InterfaceC0400k;
import com.airbnb.lottie.C0680a;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p010b1.InterfaceC0521j;
import p016c.C0572z;
import p022c5.C0642f;
import p031d5.C0892c;
import p032d6.C0898f;
import p034e0.C0923h0;
import p034e0.C0946x;
import p034e0.InterfaceC0925i0;
import p035e1.C0950b;
import p035e1.C0953e;
import p043f1.C1157b;
import p043f1.C1158c;
import p043f1.C1159d;
import p043f1.C1161f;
import p043f1.InterfaceC1162g;
import p047f5.C1177h;
import p047f5.C1179j;
import p060h2.InterfaceC1295d;
import p060h2.InterfaceC1296e;
import p067i1.C1322d;
import p067i1.C1323e;
import p067i1.C1326h;
import p067i1.InterfaceC1328j;
import p070i4.InterfaceC1349o;
import p083k1.C1447a;
import p083k1.C1449c;
import p083k1.C1450d;
import p109n3.C1643a;
import p111n5.InterfaceC1647c;
import p118o5.InterfaceC1672c;
import p141r5.AbstractC1840b;
import p149s5.C1892f;
import p149s5.C1895i;
import p149s5.C1897k;
import p149s5.C1898l;
import p149s5.C1899m;
import p149s5.C1900n;
import p149s5.C1904r;
import p162u2.C1969a;
import p164u5.C1976a;
import p164u5.C1977b;
import p164u5.EnumC1978c;
import p165u6.C1981b;
import p165u6.C2008z;
import p193y3.C2235d;
import p193y3.C2237f;
import p193y3.C2239h;

/* renamed from: a1.d */
/* loaded from: classes.dex */
public class C0017d implements InterfaceC0925i0, InterfaceC1328j, InterfaceC1349o, InterfaceC1647c, InterfaceC1672c, InterfaceC1296e, InterfaceC1295d {

    /* renamed from: a */
    public static int f13a = 0;

    /* renamed from: b */
    public static final /* synthetic */ int f14b = 0;

    /* renamed from: j */
    public static String f22j = "M";

    /* renamed from: r */
    public static Method f30r;

    /* renamed from: s */
    public static boolean f31s;

    /* renamed from: t */
    public static Field f32t;

    /* renamed from: u */
    public static boolean f33u;

    /* renamed from: c */
    public static final String[] f15c = {"NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL", "BS", "HT", "LF", "VT", "FF", "CR", "SO", "SI", "DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB", "CAN", "EM", "SUB", "ESC", "FS", "GS", "RS", "US", "SP"};

    /* renamed from: d */
    public static final byte[] f16d = {34, 60, 59, -95, -15, -17, -46, -67, -61, -54, 110, 95, -4, -38, 9, 45, 102, -33, -108, -58, -101, 46, 120, 49, 68, 73, -1, -83, 120, -3, -47, 114, 86, -20, -105, 30, -33, -29, 24, -18, -19, -21, 115, 3, -99, -48, 77, -54, -80, 58, -113, 52, 47, -93, 93, -115, 48, -6, -65, 22, 98, -120, 109, -6, -88, 75, -92, 10, 65, 101, -55, -87, 113, -109, -40, -81, -125, -40, -98, 35, -3, -97, 75, -65, 62, 100, 25, -19, -57, 125, -89, -86, -120, -79, -104, 26, Byte.MIN_VALUE, 4, -82, 81, -109, 91, -7, -118, -76, -58, -105, -61, -85, 87, 85, Byte.MIN_VALUE, -36, -75, 49, -10, Byte.MIN_VALUE, -78, -42, 85, -116, 106, -69, 108, -65, 115, -113, -118, 97, 5, 65, -24, 19, 92, 22, -7, 11, 14, 91, -10, 125, 24, -41, 55, 39, 62, -28, 50, -46, 61, 94, 113, -59, -120, -124, 13, -38, 95, -60, -43, 115, 71, -2, 41, 8, -22, -107, -78, 62, -75, 83, 17, -50, 97, -39, 10, 126, 77, -113, -87, -116, 92, -14, 23, -41, 75, 125, -110, -18, -103, 9, 99, -73, 54, -75, 91, -19, 3, 58, 81, -31, 60, -37, 48, 11, -18, 41, -66, 78, 68, -57, -115, 110, 61, -2, -26, -55, 111, 91, 43, 41, -112, -19, -25, 13, -101, 0, 93, -60, 120, -18, 12, -76, -116, 70, -70, -99, 16, 5, -76, 67, -44, 50, -121, 13, 119, 105, -99, -7, -119, 61, 30, 32, 43, 55, -51};

    /* renamed from: e */
    public static final byte[] f17e = {0, -95, 74, 123, 19, 115, 61, 35, -89, 25, -82, 82, -76, -19, 10, -101, -51, 58, -96, -54, 11, 44, -84, -1, 93, 63, -66, -34, -48, -15, 57, -28, -112, -49, -41, 27, 24, -84, -95, -33, -17, -16, 91, -22, -15, -21, 8, -57, 69, 57, -13, 35, 23, 96, -25, 46, -58, 61, -94, 87, -122, 47, -72, -22, 71, -9, 4, 36, 19, 55, 91, -16, 24, -53, -12, 76, 48, 35, Byte.MAX_VALUE, -115, 6, 126, 24, -76, -6, 103, -3, -59, -15, 73, -64, 38, -92, -66, -114, 8, 97, -53, 49, -114, -31, -37, -119, -44, -115, 96, -115, 63, -123, 6, -41, 86, -2, 16, 84, 34, 39, 83, -127, -23, -83, 9, 75, -45, -127, -81, -90, 120, -17};

    /* renamed from: f */
    public static final byte[] f18f = {34, 120, 93, 28, 86, 125, 58, -72, 104, -79, 40, 125, 82, -26, -85, 124, -100, -25, 25, 17, 88, -127, -116, -8, 0, 33, 70, -4, -1, -110, -69, -85, 5, 81, -70, -27, -98, -7, 42, 124, -74, 47, -120, 124, 20, -14, 74, -107, -69, 116, -101, -8, -89, -71, 99, -124, 9, 55, 107, -18, -114, 5, -79, 58, 64, -110, -51, 78, -29, 69, -51, 63, -77, -73, 106, 43, 10, -95, -98, -112, -50, -87, -98, -91, -61, -39, 57, -75, -31, -85, 80, 89, 42, -25, 45, -119, -18, -90, -56, -101, -23, 59, -91, -52, 124, 83, 61, -20, 119, -105, -74, 102, -27, 86, 17, -15, -110, 75, -59, 123, -24, 42, 117, 48, 11, 11, -127, 9, 12, -57, 93, -92, -30, -47, -4, 109, -67, 101, 38, -91, -73, -75, -25, 66, -41, -43, -28, -84, -50, 33, -65, 10, -94, 5, -49, -36, 64, -101, 87, -12, 78, 35, -44, 94, -53, -28, 115, 107, 117, -81, -6, 51, 86, 40, -108, -80, 110, -71, -30, -9, 49, -49, 100, 50, -41, 20, -97, 32, -34, -14, 60, -25, 53, -97, 35, -37, -122, -122, -80, 41, 54, 0, -9, -111, 55, 90, 17, 41, 82, -49, -73, 51, 9, 56, 92, 97, -126, 85, 4, -114, -48, 109, -57, 96, -31, -102, -71, -87, -76, -77, -52, 58, 107, 66, -103, 35, 5, 47, -112, 39, -58, 101, 77, -21, 4, -59, 41, -3, 35, -36, 44, 109, 40, -111, 115, 23};

    /* renamed from: g */
    public static final byte[] f19g = {0, -70, 42, -20, -46, -12, -1, -114, 74, -47, 126, -90, 23, -7, -79, -117, -90, 82, 94, 22, -56, 34, -71, -22, 52, 103, -86, -90, -58, -3, 60, -16, 92, 55, 73, -24, 47, -125, 16, 17, -96, -42, 96, 93, 61, -90, 43, -72, -47, 68, 59, -106, -59, 67, 103, 34, 69, -88, -92, -19, -15, -112, 58, 17, 94, 38, -48, 35, -62, 23, -56, -65, -2, 43, 65, -119, -50, -59, -90, -119, 17, -66, -99, 90, -71, -111, -64, 10, -30, -64, 70, 52, 97, 33, 114, -15, 63, 71, -54, -54, -76, -6, 79, -53, 24, 79, -81, 24, -48, 1, 23, -63, 89, -86, -83, -121, -1, 42, Byte.MAX_VALUE, -46, 93, 3, 77, -39, -81, 123, 114, 20, 89};

    /* renamed from: h */
    public static final byte[] f20h = {0, -113, 121, 53, -39, -71, -86, -23, -65, -85, -19, -120, 122, -49, 73, 81, -74, -13, 46, -59, -98, 59, -81, 55, 24, -24, -22, -60, -106, 31, 62, -3, 54, 6, -25, 67, 81, -87, -60, 24, 51, 57, -72, 9, -25, -62, -82, 28, 83, -101, -89, 71, 91, -123, -48, 17, -83, -72, -76, 121, -121, 117, 73, -124, 105, 92, -84, 14, -113, 20, -77, 54, 8, 40, -94, 47, -6, 39, 17, 10, 61, 98, -87, -109, 69, 52, 9, -96, -2, 105, 108, 70, 88, -8, 75, -35, 32, -127, -100, 55, 9, -96, 16, 87, -79, -107, -83, -51, 0, 35, 61, -70, 84, -124, -74, 41, 31, -99, 100, -114, -8, -125, 68, -122, 119, -105, -100, -20, 4, -76, 52, -90, -84, 46, 117, -23, -104, 93, -30, 61, -80, 41, 47, -63, 17, -116, -97, -6, -99, -127, -127, -25, 51, -115, -73, -110, -73, 48, -41, -71, -29, 73, 89, 47, 104, 9, -104, 114, 21, 57, 21, -22, 61, 107, -117, 70, 83, -58, 51, 69, -113, Byte.MIN_VALUE, 59, 50, -92, -62, -32, -14, 114, -112, 37, 110, 78, 63, -118, 59, 8, 56, -95, -60, 80, -28, -31, -116, 26, 41, -93, 125, -33, 94, -95, 67, -34, 75, 102, -1, 4, -112, 62, -43, -49, 22, 35, -31, 88, -44, -121, -58, 8, -23, Byte.MAX_VALUE, 33, 28, -40, 29, -54, 35, -53, 110, 56, 7, 101, -8, 34, -29, 66, -66, 72, 76, 5, 118, 57, 57, 96, 28, -42, 103};

    /* renamed from: i */
    public static final byte[] f21i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: k */
    public static final char[] f23k = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};

    /* renamed from: l */
    public static final char[] f24l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: m */
    public static final C0017d f25m = new C0017d();

    /* renamed from: n */
    public static final int[] f26n = new int[0];

    /* renamed from: o */
    public static final long[] f27o = new long[0];

    /* renamed from: p */
    public static final Object[] f28p = new Object[0];

    /* renamed from: q */
    public static final C0017d f29q = new C0017d();

    /* renamed from: v */
    public static final char[] f34v = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: A */
    public static int m62A(long j7) {
        return (int) (j7 & 4294967295L);
    }

    /* renamed from: B */
    public static void m63B(Hashtable hashtable, C1449c c1449c) {
        hashtable.put((String) c1449c.f6959a, (byte[]) c1449c.f6960b);
        C1449c[] c1449cArr = (C1449c[]) c1449c.f6961c;
        int length = c1449cArr != null ? c1449cArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            m63B(hashtable, c1449cArr[i7]);
        }
    }

    /* renamed from: C */
    public static boolean m64C(int i7) {
        int[] iArr = C1177h.f5762a;
        if (!(i7 == 65038 || i7 == 65039)) {
            if (!(i7 >= 127995 && i7 <= 127999)) {
                if (!(i7 == 8205)) {
                    if (!(i7 == 8204)) {
                        if (!(i7 >= 126976 && i7 <= 129791) && (Character.charCount(i7) != 1 || !Character.isSurrogate((char) i7))) {
                            if (!(i7 == 46 || i7 == 47 || i7 == 33 || i7 == 61 || i7 == 60 || i7 == 62 || i7 == 45)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m65D(char c7) {
        if (c7 != '\t') {
            return c7 < ' ' || c7 == 127;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m66E(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }

    /* renamed from: F */
    public static final int m67F(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: G */
    public static long m68G(int i7, int i8) {
        return (i8 & 4294967295L) | ((i7 & 4294967295L) << 32);
    }

    /* renamed from: H */
    public static C1161f m69H(JsonReader jsonReader, C0680a c0680a) {
        char c7;
        int i7 = 1;
        boolean z6 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z6) {
            jsonReader.beginObject();
        }
        C0572z c0572z = null;
        C1158c c1158c = null;
        C1159d c1159d = null;
        InterfaceC1162g interfaceC1162g = null;
        C1157b c1157b = null;
        C1157b c1157b2 = null;
        C1157b c1157b3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int hashCode = nextName.hashCode();
            if (hashCode == 97) {
                if (nextName.equals("a")) {
                    c7 = 0;
                }
                c7 = 65535;
            } else if (hashCode == 3242) {
                if (nextName.equals("eo")) {
                    c7 = 5;
                }
                c7 = 65535;
            } else if (hashCode == 3656) {
                if (nextName.equals("rz")) {
                    c7 = 6;
                }
                c7 = 65535;
            } else if (hashCode == 3676) {
                if (nextName.equals("so")) {
                    c7 = 7;
                }
                c7 = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c7 = 1;
                }
                c7 = 65535;
            } else if (hashCode == 112) {
                if (nextName.equals("p")) {
                    c7 = 2;
                }
                c7 = 65535;
            } else if (hashCode != 114) {
                if (hashCode == 115 && nextName.equals("s")) {
                    c7 = 4;
                }
                c7 = 65535;
            } else {
                if (nextName.equals("r")) {
                    c7 = 3;
                }
                c7 = 65535;
            }
            switch (c7) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            c0572z = C0143v.m427Y(jsonReader, c0680a);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    c1159d = C0143v.m457p0(jsonReader, c0680a);
                    continue;
                case 2:
                    interfaceC1162g = C0143v.m461r0(jsonReader, c0680a);
                    continue;
                case 3:
                    break;
                case 4:
                    c1158c = new C1158c(i7, m70I(1.0f, jsonReader, c0680a, C1326h.f6525a));
                    continue;
                case 5:
                    c1157b3 = C0143v.m453n0(jsonReader, c0680a, false);
                    continue;
                case 6:
                    c0680a.m2183a("Lottie doesn't support 3D layers.");
                    break;
                case 7:
                    c1157b2 = C0143v.m453n0(jsonReader, c0680a, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            c1157b = C0143v.m453n0(jsonReader, c0680a, false);
        }
        if (z6) {
            jsonReader.endObject();
        }
        if (c0572z == null) {
            Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            c0572z = new C0572z(3);
        }
        if (c1158c == null) {
            c1158c = new C1158c(new C1450d(1.0f, 1.0f));
        }
        C1158c c1158c2 = c1158c;
        if (c1159d == null) {
            c1159d = new C1159d();
        }
        return new C1161f(c0572z, interfaceC1162g, c1158c2, c1157b, c1159d, c1157b2, c1157b3);
    }

    /* renamed from: I */
    public static ArrayList m70I(float f7, JsonReader jsonReader, C0680a c0680a, InterfaceC1328j interfaceC1328j) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c0680a.m2183a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C1323e.m3686a(jsonReader, c0680a, f7, interfaceC1328j, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C1323e.m3686a(jsonReader, c0680a, f7, interfaceC1328j, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C1323e.m3686a(jsonReader, c0680a, f7, interfaceC1328j, false));
            }
        }
        jsonReader.endObject();
        m76O(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14, types: [t5.c] */
    /* JADX WARN: Type inference failed for: r4v15, types: [t5.b] */
    /* JADX WARN: Type inference failed for: r4v16, types: [t5.d] */
    /* JADX WARN: Type inference failed for: r4v17, types: [t5.e] */
    /* JADX WARN: Type inference failed for: r4v18, types: [t5.g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [t5.f] */
    /* JADX WARN: Type inference failed for: r4v26, types: [t5.j] */
    /* JADX WARN: Type inference failed for: r4v29, types: [t5.k] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [t5.i] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p141r5.C1839a m71J(p164u5.C1976a r17) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0017d.m71J(u5.a):r5.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [s5.l] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [s5.i] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [r5.b] */
    /* renamed from: K */
    public static AbstractC1840b m72K(C1976a c1976a) {
        ?? c1898l;
        C1899m c1899m;
        List<AbstractC1840b> list;
        EnumC1978c m4597a = c1976a.m4597a();
        EnumC1978c enumC1978c = EnumC1978c.f8927u2;
        EnumC1978c enumC1978c2 = EnumC1978c.f8931x1;
        if (m4597a == enumC1978c) {
            C1977b m4604h = c1976a.m4604h();
            c1898l = new C1895i(m4604h.f8862a, m4604h.m4613a());
        } else {
            c1976a.m4606j(EnumC1978c.f8929w1);
            c1898l = new C1898l(C0143v.m432b0(c1976a));
            c1976a.m4606j(enumC1978c2);
            if ((c1898l instanceof C1904r) || (c1898l instanceof C1892f) || (c1898l instanceof C1895i) || (c1898l instanceof C1900n)) {
                c1898l = new C1897k(c1898l);
            }
        }
        while (true) {
            EnumC1978c m4597a2 = c1976a.m4597a();
            C1977b c1977b = c1976a.f8857j;
            if (c1977b != null && c1977b.f8866e) {
                c1898l.f8311e = c1977b.f8867f;
            }
            int ordinal = m4597a2.ordinal();
            if (ordinal != 4) {
                if (ordinal != 5 && ordinal != 7) {
                    if (ordinal == 9) {
                        c1976a.m4605i();
                        AbstractC1840b m432b0 = C0143v.m432b0(c1976a);
                        c1976a.m4606j(EnumC1978c.f8935z1);
                        c1898l = new C1900n(c1976a.m4602f(), (AbstractC1840b) c1898l, m432b0);
                    } else if (ordinal != 11 && ordinal != 59) {
                        return c1898l;
                    }
                }
                C1892f c1892f = new C1892f();
                c1892f.f8441f = c1898l;
                EnumC1978c m4597a3 = c1976a.m4597a();
                EnumC1978c enumC1978c3 = EnumC1978c.f8899Y;
                if (m4597a3 == enumC1978c3) {
                    c1976a.m4605i();
                    C1977b m4604h2 = c1976a.m4604h();
                    m4604h2.f8865d = enumC1978c3;
                    c1899m = new C1899m(m4604h2);
                } else {
                    c1899m = null;
                }
                c1892f.f8442g = c1899m;
                c1892f.f8314a = c1976a.m4602f();
                int ordinal2 = c1976a.m4597a().ordinal();
                if (ordinal2 != 7) {
                    list = ordinal2 != 11 ? Collections.singletonList(new C1899m(c1976a.m4606j(EnumC1978c.f8930w2))) : Collections.singletonList(C0143v.m463s0(c1976a));
                } else {
                    c1976a.m4605i();
                    ArrayList m451m0 = c1976a.m4597a() != enumC1978c2 ? C0143v.m451m0(c1976a) : null;
                    c1976a.m4606j(enumC1978c2);
                    list = m451m0;
                }
                c1892f.f8443h = list;
                c1892f.f8315b = c1976a.m4602f();
                c1898l = c1892f;
            } else {
                c1976a.m4605i();
                C1977b m4604h3 = c1976a.m4604h();
                m4604h3.f8865d = EnumC1978c.f8897X;
                c1898l = new C1900n(m4604h3.f8862a, (AbstractC1840b) c1898l, new C1899m(m4604h3));
            }
        }
    }

    /* renamed from: L */
    public static String m73L(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return new String(bArr, "UTF-8");
        } catch (Exception e7) {
            e7.printStackTrace();
            C0391d0.m1370q(e7.getMessage(), true);
            return "";
        }
    }

    /* renamed from: M */
    public static void m74M(C0953e c0953e, int i7, ArrayList arrayList, C0953e c0953e2, InterfaceC0521j interfaceC0521j) {
        if (c0953e.m2946a(i7, interfaceC0521j.getName())) {
            String name = interfaceC0521j.getName();
            c0953e2.getClass();
            C0953e c0953e3 = new C0953e(c0953e2);
            c0953e3.f4918a.add(name);
            C0953e c0953e4 = new C0953e(c0953e3);
            c0953e4.f4919b = interfaceC0521j;
            arrayList.add(c0953e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        if ((0.0f <= r1 && r1 <= ((float) r10.getWidth())) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m75N(p055g5.C1245b r10, android.view.MotionEvent r11, int r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0017d.m75N(g5.b, android.view.MotionEvent, int):long");
    }

    /* renamed from: O */
    public static void m76O(ArrayList arrayList) {
        int i7;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            i7 = size - 1;
            if (i8 >= i7) {
                break;
            }
            C1447a c1447a = (C1447a) arrayList.get(i8);
            i8++;
            c1447a.f6952f = Float.valueOf(((C1447a) arrayList.get(i8)).f6951e);
        }
        C1447a c1447a2 = (C1447a) arrayList.get(i7);
        if (c1447a2.f6948b == 0) {
            arrayList.remove(c1447a2);
        }
    }

    /* renamed from: Q */
    public static void m77Q(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2237f) {
            m78R(view, (C2237f) background);
        }
    }

    /* renamed from: R */
    public static void m78R(View view, C2237f c2237f) {
        C1643a c1643a = c2237f.f10154c.f10164b;
        if (c1643a != null && c1643a.f7474a) {
            float f7 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                f7 += C0946x.i.m2876i((View) parent);
            }
            C2237f.b bVar = c2237f.f10154c;
            if (bVar.f10175m != f7) {
                bVar.f10175m = f7;
                c2237f.m5431n();
            }
        }
    }

    /* renamed from: T */
    public static final Map m79T(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C0898f.m2605d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: U */
    public static String m80U(String str) {
        if (str.endsWith(".lua")) {
            str = str.substring(0, str.length() - 4);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if ((i7 != 0 || !Character.isJavaIdentifierStart(charAt)) && (i7 <= 0 || !Character.isJavaIdentifierPart(charAt))) {
                charAt = '_';
            }
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* renamed from: V */
    public static String m81V(String str) {
        if (str.endsWith(".lua")) {
            str = str.substring(0, str.length() - 4);
        }
        String str2 = str.replace('.', '/') + ".lua";
        return str2.startsWith("@") ? str2.substring(1) : str2;
    }

    /* renamed from: g */
    public static String m82g(byte[] bArr) {
        byte[] bArr2;
        int length = (bArr.length * 4) / 3;
        byte[] bArr3 = new byte[(length / 76) + 3 + length];
        int length2 = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            bArr2 = f21i;
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
                bArr3[i8] = 10;
                i9++;
                i8++;
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

    /* renamed from: h */
    public static byte[] m83h(byte[] bArr) {
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

    /* renamed from: i */
    public static PointF m84i(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: j */
    public static final int m85j(int i7, int i8, int[] iArr) {
        C0898f.m2606e(iArr, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    /* renamed from: k */
    public static final int m86k(long[] jArr, int i7, long j7) {
        C0898f.m2606e(jArr, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j8 = jArr[i10];
            if (j8 < j7) {
                i9 = i10 + 1;
            } else {
                if (j8 <= j7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* renamed from: l */
    public static void m87l(InterfaceC0400k interfaceC0400k, StringBuilder sb) {
        String hexString;
        int lastIndexOf;
        if (interfaceC0400k == null) {
            hexString = "null";
        } else {
            String simpleName = interfaceC0400k.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0400k.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(interfaceC0400k));
        }
        sb.append(hexString);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[ORIG_RETURN, RETURN] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m88m(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = -1
            if (r0 != r3) goto L15
            goto L8a
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L20
            java.lang.String r9 = p159u.C1959f.m4569d(r9)
            goto L21
        L20:
            r9 = 0
        L21:
            r5 = 0
            if (r9 != 0) goto L25
            goto L87
        L25:
            if (r2 != 0) goto L37
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L8a
            int r6 = r2.length
            if (r6 > 0) goto L35
            goto L8a
        L35:
            r2 = r2[r5]
        L37:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            r7 = 1
            if (r3 != r1) goto L4a
            boolean r3 = p026d0.C0874b.m2562a(r6, r2)
            if (r3 == 0) goto L4a
            r3 = 1
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Class<android.app.AppOpsManager> r6 = android.app.AppOpsManager.class
            if (r3 == 0) goto L78
            r3 = 29
            if (r0 < r3) goto L6b
            android.app.AppOpsManager r0 = p159u.C1960g.m4572c(r8)
            int r3 = android.os.Binder.getCallingUid()
            int r2 = p159u.C1960g.m4570a(r0, r9, r3, r2)
            if (r2 == 0) goto L62
            goto L85
        L62:
            java.lang.String r8 = p159u.C1960g.m4571b(r8)
            int r2 = p159u.C1960g.m4570a(r0, r9, r1, r8)
            goto L85
        L6b:
            if (r0 < r4) goto L84
            java.lang.Object r8 = p159u.C1959f.m4566a(r8, r6)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = p159u.C1959f.m4568c(r8, r9, r2)
            goto L84
        L78:
            if (r0 < r4) goto L84
            java.lang.Object r8 = p159u.C1959f.m4566a(r8, r6)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = p159u.C1959f.m4568c(r8, r9, r2)
        L84:
            r2 = r7
        L85:
            if (r2 != 0) goto L89
        L87:
            r3 = 0
            goto L8a
        L89:
            r3 = -2
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0017d.m88m(android.content.Context, java.lang.String):int");
    }

    /* renamed from: n */
    public static float m89n(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f9, f7));
    }

    /* renamed from: o */
    public static int m90o(int i7, int i8) {
        return Math.max(0, Math.min(i8, i7));
    }

    /* renamed from: p */
    public static final int m91p(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    /* renamed from: q */
    public static Hashtable m92q(FileInputStream fileInputStream, String str, String str2, C1981b c1981b) {
        String m80U = m80U(str);
        C2008z m4627b3 = c1981b.m4627b3(fileInputStream, m80U, "bt");
        String m81V = m81V(str2);
        Hashtable hashtable = new Hashtable();
        m63B(hashtable, new C1449c(m4627b3, m80U, m81V));
        return hashtable;
    }

    /* renamed from: r */
    public static boolean m93r(char c7) {
        return (1424 <= c7 && c7 <= 2303) || c7 == 8206 || c7 == 8207 || (8234 <= c7 && c7 <= 8238) || ((8294 <= c7 && c7 <= 8297) || ((55296 <= c7 && c7 <= 57343) || ((64285 <= c7 && c7 <= 65023) || (65136 <= c7 && c7 <= 65278))));
    }

    /* renamed from: s */
    public static C1969a m94s(int i7) {
        return i7 != 0 ? i7 != 1 ? new C2239h() : new C2235d() : new C2239h();
    }

    /* renamed from: t */
    public static int m95t(Context context, float f7) {
        float applyDimension = TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics());
        int i7 = (int) (applyDimension + 0.5d);
        if (i7 != 0 || applyDimension <= 0.0f) {
            return i7;
        }
        return 1;
    }

    /* renamed from: u */
    public static void m96u() {
        int i7 = f13a;
        if (i7 > 0) {
            f13a = i7 - 1;
        }
    }

    /* renamed from: v */
    public static int m97v(float f7, float f8) {
        int i7 = (int) f7;
        int i8 = (int) f8;
        int i9 = i7 / i8;
        if ((i7 ^ i8) < 0 && i8 * i9 != i7) {
            i9--;
        }
        return i7 - (i9 * i8);
    }

    /* renamed from: w */
    public static C0892c m98w(C0642f c0642f) {
        char[] cArr;
        int i7 = c0642f.f3160e;
        if (!c0642f.mo2157a()) {
            return new C0892c(new long[]{m68G(0, 0)}, i7);
        }
        synchronized (C1179j.class) {
            cArr = C1179j.f5770a;
            C1179j.f5770a = null;
        }
        if (cArr == null || cArr.length < i7) {
            cArr = new char[i7];
        }
        TextUtils.getChars(c0642f, 0, i7, cArr, 0);
        Bidi bidi = new Bidi(cArr, 0, null, 0, c0642f.f3160e, 0);
        int runCount = bidi.getRunCount();
        long[] jArr = new long[runCount];
        for (int i8 = 0; i8 < runCount; i8++) {
            jArr[i8] = m68G(bidi.getRunStart(i8), bidi.getRunLevel(i8));
        }
        C1179j.m3391a(cArr);
        return new C0892c(jArr, i7);
    }

    /* renamed from: x */
    public static long m99x(File file) {
        if (file.exists()) {
            return new FileInputStream(file).available();
        }
        file.createNewFile();
        Log.e("d", "获取文件大小不存在!");
        return 0L;
    }

    /* renamed from: y */
    public static long m100y(File file) {
        File[] listFiles = file.listFiles();
        long j7 = 0;
        for (int i7 = 0; i7 < listFiles.length; i7++) {
            j7 = (listFiles[i7].isDirectory() ? m100y(listFiles[i7]) : m99x(listFiles[i7])) + j7;
        }
        return j7;
    }

    /* renamed from: z */
    public static String m101z(char c7) {
        return c7 < ' ' ? f15c[c7] : c7 == 127 ? "DEL" : "UNK";
    }

    /* renamed from: P */
    public void mo102P(View view, int i7, int i8, int i9, int i10) {
        if (!f31s) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f30r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e7);
            }
            f31s = true;
        }
        Method method = f30r;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8.getCause());
            }
        }
    }

    /* renamed from: S */
    public void mo103S(View view, int i7) {
        if (!f33u) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f32t = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f33u = true;
        }
        Field field = f32t;
        if (field != null) {
            try {
                f32t.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // p034e0.InterfaceC0925i0
    /* renamed from: b */
    public void mo104b(View view) {
    }

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d7 = 0.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "f":
                    str2 = jsonReader.nextString();
                    break;
                case "j":
                    i7 = jsonReader.nextInt();
                    break;
                case "s":
                    d7 = jsonReader.nextDouble();
                    break;
                case "t":
                    str = jsonReader.nextString();
                    break;
                case "fc":
                    i9 = C1322d.m3682a(jsonReader);
                    break;
                case "lh":
                    d8 = jsonReader.nextDouble();
                    break;
                case "ls":
                    d9 = jsonReader.nextDouble();
                    break;
                case "of":
                    z6 = jsonReader.nextBoolean();
                    break;
                case "sc":
                    i10 = C1322d.m3682a(jsonReader);
                    break;
                case "sw":
                    i11 = jsonReader.nextInt();
                    break;
                case "tr":
                    i8 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C0950b(str, str2, d7, i7, i8, d8, d9, i9, i10, i11, z6);
    }

    @Override // p111n5.InterfaceC1647c
    /* renamed from: d */
    public String[] mo106d() {
        return new String[]{"LINE_COMMENT", "BLOCK_COMMENT_START", "BLOCK_COMMENT_END"};
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new ArrayDeque();
    }

    @Override // p034e0.InterfaceC0925i0
    /* renamed from: f */
    public void mo108f() {
    }
}
