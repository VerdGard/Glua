package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.Log;
import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002a1.C0024k;
import p002a1.C0027n;
import p035e1.C0951c;
import p035e1.C0952d;
import p036e2.C1109v5;
import p051g1.C1204m;
import p059h1.C1287e;
import p075j1.C1403d;
import p089l.C1473g;
import p089l.C1482p;

/* renamed from: com.airbnb.lottie.a */
/* loaded from: classes.dex */
public final class C0680a {

    /* renamed from: a */
    public final C0027n f3247a = new C0027n();

    /* renamed from: b */
    public final HashSet<String> f3248b = new HashSet<>();

    /* renamed from: c */
    public Map<String, List<C1287e>> f3249c;

    /* renamed from: d */
    public Map<String, C0024k> f3250d;

    /* renamed from: e */
    public Map<String, C0951c> f3251e;

    /* renamed from: f */
    public C1482p<C0952d> f3252f;

    /* renamed from: g */
    public C1473g<C1287e> f3253g;

    /* renamed from: h */
    public List<C1287e> f3254h;

    /* renamed from: i */
    public Rect f3255i;

    /* renamed from: j */
    public float f3256j;

    /* renamed from: k */
    public float f3257k;

    /* renamed from: l */
    public float f3258l;

    /* renamed from: com.airbnb.lottie.a$a */
    public static class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static C0680a m2186a(JsonReader jsonReader) {
            float f7;
            char c7;
            int i7;
            C1473g<C1287e> c1473g;
            ArrayList arrayList;
            HashMap hashMap;
            C1482p<C0952d> c1482p;
            C0680a c0680a;
            char c8;
            C0680a c0680a2;
            char c9;
            char c10;
            float m3756c = C1403d.m3756c();
            C1473g<C1287e> c1473g2 = new C1473g<>();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            C1482p<C0952d> c1482p2 = new C1482p<>();
            C0680a c0680a3 = new C0680a();
            jsonReader.beginObject();
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            int i8 = 0;
            int i9 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                float f11 = f10;
                float f12 = f9;
                switch (nextName.hashCode()) {
                    case -1408207997:
                        f7 = f8;
                        if (nextName.equals("assets")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1109732030:
                        f7 = f8;
                        if (nextName.equals("layers")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 104:
                        f7 = f8;
                        if (nextName.equals("h")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 118:
                        f7 = f8;
                        if (nextName.equals("v")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 119:
                        f7 = f8;
                        if (nextName.equals("w")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3276:
                        f7 = f8;
                        if (nextName.equals("fr")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3367:
                        f7 = f8;
                        if (nextName.equals("ip")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3553:
                        f7 = f8;
                        if (nextName.equals("op")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 94623709:
                        f7 = f8;
                        if (nextName.equals("chars")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 97615364:
                        f7 = f8;
                        if (nextName.equals("fonts")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        f7 = f8;
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        i7 = i9;
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ArrayList arrayList3 = new ArrayList();
                            C1473g c1473g3 = new C1473g();
                            jsonReader.beginObject();
                            HashMap hashMap5 = hashMap4;
                            String str = null;
                            String str2 = null;
                            while (jsonReader.hasNext()) {
                                C1482p<C0952d> c1482p3 = c1482p2;
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                C1473g<C1287e> c1473g4 = c1473g2;
                                int hashCode = nextName2.hashCode();
                                ArrayList arrayList4 = arrayList2;
                                if (hashCode == -1109732030) {
                                    if (nextName2.equals("layers")) {
                                        c8 = 0;
                                    }
                                    c8 = 65535;
                                } else if (hashCode == 104) {
                                    if (nextName2.equals("h")) {
                                        c8 = 1;
                                    }
                                    c8 = 65535;
                                } else if (hashCode == 112) {
                                    if (nextName2.equals("p")) {
                                        c8 = 2;
                                    }
                                    c8 = 65535;
                                } else if (hashCode == 117) {
                                    if (nextName2.equals("u")) {
                                        c8 = 3;
                                    }
                                    c8 = 65535;
                                } else if (hashCode != 119) {
                                    if (hashCode == 3355 && nextName2.equals("id")) {
                                        c8 = 5;
                                    }
                                    c8 = 65535;
                                } else {
                                    if (nextName2.equals("w")) {
                                        c8 = 4;
                                    }
                                    c8 = 65535;
                                }
                                if (c8 != 0) {
                                    if (c8 != 1) {
                                        if (c8 == 2) {
                                            str2 = jsonReader.nextString();
                                        } else if (c8 == 3) {
                                            jsonReader.nextString();
                                        } else if (c8 != 4) {
                                            if (c8 != 5) {
                                                jsonReader.skipValue();
                                            } else {
                                                str = jsonReader.nextString();
                                            }
                                        }
                                        c0680a2 = c0680a3;
                                    }
                                    jsonReader.nextInt();
                                    c0680a2 = c0680a3;
                                } else {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        C1287e m428Z = C0143v.m428Z(jsonReader, c0680a3);
                                        c1473g3.m3859g(m428Z.f6393d, m428Z);
                                        arrayList3.add(m428Z);
                                        c0680a3 = c0680a3;
                                    }
                                    c0680a2 = c0680a3;
                                    jsonReader.endArray();
                                }
                                c0680a3 = c0680a2;
                                c1482p2 = c1482p3;
                                c1473g2 = c1473g4;
                                arrayList2 = arrayList4;
                            }
                            C1473g<C1287e> c1473g5 = c1473g2;
                            ArrayList arrayList5 = arrayList2;
                            C1482p<C0952d> c1482p4 = c1482p2;
                            C0680a c0680a4 = c0680a3;
                            jsonReader.endObject();
                            if (str2 != null) {
                                hashMap3.put(str, new C0024k(str, str2));
                            } else {
                                hashMap2.put(str, arrayList3);
                            }
                            c0680a3 = c0680a4;
                            hashMap4 = hashMap5;
                            c1482p2 = c1482p4;
                            c1473g2 = c1473g5;
                            arrayList2 = arrayList5;
                        }
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        jsonReader.endArray();
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                    case 1:
                        i7 = i9;
                        jsonReader.beginArray();
                        int i10 = 0;
                        while (jsonReader.hasNext()) {
                            C1287e m428Z2 = C0143v.m428Z(jsonReader, c0680a3);
                            if (m428Z2.f6394e == 3) {
                                i10++;
                            }
                            arrayList2.add(m428Z2);
                            c1473g2.m3859g(m428Z2.f6393d, m428Z2);
                            if (i10 > 4) {
                                Log.w("LOTTIE", "You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            }
                        }
                        jsonReader.endArray();
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                    case 2:
                        i9 = jsonReader.nextInt();
                        f10 = f11;
                        f9 = f12;
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        break;
                    case 3:
                        i7 = i9;
                        String[] split = jsonReader.nextString().split("\\.");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 5 && (parseInt2 > 5 || Integer.parseInt(split[2]) >= 0))))) {
                            c0680a3.m2183a("Lottie only supports bodymovin >= 4.5.0");
                        }
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                    case 4:
                        i8 = jsonReader.nextInt();
                        f10 = f11;
                        f9 = f12;
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        break;
                    case 5:
                        f10 = (float) jsonReader.nextDouble();
                        f9 = f12;
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        break;
                    case 6:
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = (float) jsonReader.nextDouble();
                        f10 = f11;
                        f9 = f12;
                        break;
                    case 7:
                        f9 = (float) jsonReader.nextDouble();
                        f10 = f11;
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        break;
                    case '\b':
                        i7 = i9;
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ArrayList arrayList6 = new ArrayList();
                            jsonReader.beginObject();
                            String str3 = null;
                            String str4 = null;
                            double d7 = 0.0d;
                            char c11 = 0;
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                nextName3.getClass();
                                switch (nextName3.hashCode()) {
                                    case -1866931350:
                                        if (nextName3.equals("fFamily")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 119:
                                        if (nextName3.equals("w")) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3173:
                                        if (nextName3.equals("ch")) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3076010:
                                        if (nextName3.equals("data")) {
                                            c9 = 3;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3530753:
                                        if (nextName3.equals("size")) {
                                            c9 = 4;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 109780401:
                                        if (nextName3.equals("style")) {
                                            c9 = 5;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                if (c9 == 0) {
                                    str4 = jsonReader.nextString();
                                } else if (c9 == 1) {
                                    d7 = jsonReader.nextDouble();
                                } else if (c9 == 2) {
                                    c11 = jsonReader.nextString().charAt(0);
                                } else if (c9 == 3) {
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        if ("shapes".equals(jsonReader.nextName())) {
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                arrayList6.add((C1204m) C1109v5.m3255s(jsonReader, c0680a3));
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    jsonReader.endObject();
                                } else if (c9 == 4) {
                                    jsonReader.nextInt();
                                } else if (c9 != 5) {
                                    jsonReader.skipValue();
                                } else {
                                    str3 = jsonReader.nextString();
                                }
                            }
                            jsonReader.endObject();
                            C0952d c0952d = new C0952d(arrayList6, c11, d7, str3, str4);
                            c1482p2.m3881d(c0952d.hashCode(), c0952d);
                        }
                        jsonReader.endArray();
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                    case '\t':
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
                            if (nextName4.equals("list")) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    jsonReader.beginObject();
                                    String str5 = null;
                                    String str6 = null;
                                    String str7 = null;
                                    while (jsonReader.hasNext()) {
                                        String nextName5 = jsonReader.nextName();
                                        nextName5.getClass();
                                        int i11 = i9;
                                        switch (nextName5.hashCode()) {
                                            case -1866931350:
                                                if (nextName5.equals("fFamily")) {
                                                    c10 = 0;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case -1408684838:
                                                if (nextName5.equals("ascent")) {
                                                    c10 = 1;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case -1294566165:
                                                if (nextName5.equals("fStyle")) {
                                                    c10 = 2;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 96619537:
                                                if (nextName5.equals("fName")) {
                                                    c10 = 3;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            default:
                                                c10 = 65535;
                                                break;
                                        }
                                        if (c10 == 0) {
                                            str5 = jsonReader.nextString();
                                        } else if (c10 == 1) {
                                            jsonReader.nextDouble();
                                        } else if (c10 == 2) {
                                            str7 = jsonReader.nextString();
                                        } else if (c10 != 3) {
                                            jsonReader.skipValue();
                                        } else {
                                            str6 = jsonReader.nextString();
                                        }
                                        i9 = i11;
                                    }
                                    jsonReader.endObject();
                                    hashMap4.put(str6, new C0951c(str5, str6, str7));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        i7 = i9;
                        jsonReader.endObject();
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                    default:
                        c1473g = c1473g2;
                        arrayList = arrayList2;
                        hashMap = hashMap4;
                        c1482p = c1482p2;
                        c0680a = c0680a3;
                        i7 = i9;
                        jsonReader.skipValue();
                        f8 = f7;
                        f10 = f11;
                        f9 = f12;
                        i9 = i7;
                        break;
                }
                c0680a3 = c0680a;
                hashMap4 = hashMap;
                c1482p2 = c1482p;
                c1473g2 = c1473g;
                arrayList2 = arrayList;
            }
            C0680a c0680a5 = c0680a3;
            jsonReader.endObject();
            c0680a5.f3255i = new Rect(0, 0, (int) (i8 * m3756c), (int) (i9 * m3756c));
            c0680a5.f3256j = f8;
            c0680a5.f3257k = f9;
            c0680a5.f3258l = f10;
            c0680a5.f3254h = arrayList2;
            c0680a5.f3253g = c1473g2;
            c0680a5.f3249c = hashMap2;
            c0680a5.f3250d = hashMap3;
            c0680a5.f3252f = c1482p2;
            c0680a5.f3251e = hashMap4;
            return c0680a5;
        }
    }

    /* renamed from: a */
    public final void m2183a(String str) {
        Log.w("LOTTIE", str);
        this.f3248b.add(str);
    }

    /* renamed from: b */
    public final float m2184b() {
        return (long) (((this.f3257k - this.f3256j) / this.f3258l) * 1000.0f);
    }

    /* renamed from: c */
    public final C1287e m2185c(long j7) {
        return this.f3253g.m3856d(j7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C1287e> it = this.f3254h.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m3606a("\t"));
        }
        return sb.toString();
    }
}
