package p144s0;

import android.ext.C0090b;
import androidx.activity.C0143v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p120p.C1686g;

/* renamed from: s0.g */
/* loaded from: classes.dex */
public final class C1871g {

    /* renamed from: a */
    public static final byte[] f8400a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f8401b = {112, 114, 109, 0};

    /* renamed from: a */
    public static byte[] m4395a(C1866b[] c1866bArr, byte[] bArr) {
        int i7 = 0;
        int i8 = 0;
        for (C1866b c1866b : c1866bArr) {
            i8 += (((((c1866b.f8389g * 2) + 8) - 1) & (-8)) / 8) + (c1866b.f8387e * 2) + m4396b(c1866b.f8383a, c1866b.f8384b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1866b.f8388f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, C1872h.f8404c)) {
            int length = c1866bArr.length;
            while (i7 < length) {
                C1866b c1866b2 = c1866bArr[i7];
                m4406l(byteArrayOutputStream, c1866b2, m4396b(c1866b2.f8383a, c1866b2.f8384b, bArr));
                m4408n(byteArrayOutputStream, c1866b2);
                m4405k(byteArrayOutputStream, c1866b2);
                m4407m(byteArrayOutputStream, c1866b2);
                i7++;
            }
        } else {
            for (C1866b c1866b3 : c1866bArr) {
                m4406l(byteArrayOutputStream, c1866b3, m4396b(c1866b3.f8383a, c1866b3.f8384b, bArr));
            }
            int length2 = c1866bArr.length;
            while (i7 < length2) {
                C1866b c1866b4 = c1866bArr[i7];
                m4408n(byteArrayOutputStream, c1866b4);
                m4405k(byteArrayOutputStream, c1866b4);
                m4407m(byteArrayOutputStream, c1866b4);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    /* renamed from: b */
    public static String m4396b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C1872h.f8406e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C1872h.f8405d;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return C0090b.m220f(C1686g.m4107b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
        }
        if ("!".equals(str3)) {
            return str2.replace(":", "!");
        }
        if (":".equals(str3)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    /* renamed from: c */
    public static int m4397c(int i7, int i8, int i9) {
        if (i7 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i7 == 2) {
            return i8;
        }
        if (i7 == 4) {
            return i8 + i9;
        }
        throw new IllegalStateException(C0090b.m219e("Unexpected flag: ", i7));
    }

    /* renamed from: d */
    public static int[] m4398d(int i7, ByteArrayInputStream byteArrayInputStream) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += C0143v.m471w0(byteArrayInputStream);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* renamed from: e */
    public static C1866b[] m4399e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1866b[] c1866bArr) {
        byte[] bArr3 = C1872h.f8407f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C1872h.f8408g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m471w0 = C0143v.m471w0(fileInputStream);
            byte[] m467u0 = C0143v.m467u0(fileInputStream, (int) C0143v.m469v0(4, fileInputStream), (int) C0143v.m469v0(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m467u0);
            try {
                C1866b[] m4401g = m4401g(byteArrayInputStream, bArr2, m471w0, c1866bArr);
                byteArrayInputStream.close();
                return m4401g;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C1872h.f8402a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m469v0 = (int) C0143v.m469v0(1, fileInputStream);
        byte[] m467u02 = C0143v.m467u0(fileInputStream, (int) C0143v.m469v0(4, fileInputStream), (int) C0143v.m469v0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m467u02);
        try {
            C1866b[] m4400f = m4400f(byteArrayInputStream2, m469v0, c1866bArr);
            byteArrayInputStream2.close();
            return m4400f;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: f */
    public static C1866b[] m4400f(ByteArrayInputStream byteArrayInputStream, int i7, C1866b[] c1866bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1866b[0];
        }
        if (i7 != c1866bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m471w0 = C0143v.m471w0(byteArrayInputStream);
            iArr[i8] = C0143v.m471w0(byteArrayInputStream);
            strArr[i8] = new String(C0143v.m465t0(m471w0, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C1866b c1866b = c1866bArr[i9];
            if (!c1866b.f8384b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            c1866b.f8387e = i10;
            c1866b.f8390h = m4398d(i10, byteArrayInputStream);
        }
        return c1866bArr;
    }

    /* renamed from: g */
    public static C1866b[] m4401g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, C1866b[] c1866bArr) {
        C1866b c1866b;
        if (byteArrayInputStream.available() == 0) {
            return new C1866b[0];
        }
        if (i7 != c1866bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            C0143v.m471w0(byteArrayInputStream);
            String str = new String(C0143v.m465t0(C0143v.m471w0(byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long m469v0 = C0143v.m469v0(4, byteArrayInputStream);
            int m471w0 = C0143v.m471w0(byteArrayInputStream);
            if (c1866bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i9 = 0; i9 < c1866bArr.length; i9++) {
                    if (c1866bArr[i9].f8384b.equals(substring)) {
                        c1866b = c1866bArr[i9];
                        break;
                    }
                }
            }
            c1866b = null;
            if (c1866b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1866b.f8386d = m469v0;
            int[] m4398d = m4398d(m471w0, byteArrayInputStream);
            if (Arrays.equals(bArr, C1872h.f8406e)) {
                c1866b.f8387e = m471w0;
                c1866b.f8390h = m4398d;
            }
        }
        return c1866bArr;
    }

    /* renamed from: h */
    public static C1866b[] m4402h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, C1872h.f8403b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m469v0 = (int) C0143v.m469v0(1, fileInputStream);
        byte[] m467u0 = C0143v.m467u0(fileInputStream, (int) C0143v.m469v0(4, fileInputStream), (int) C0143v.m469v0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m467u0);
        try {
            C1866b[] m4403i = m4403i(byteArrayInputStream, str, m469v0);
            byteArrayInputStream.close();
            return m4403i;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public static C1866b[] m4403i(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1866b[0];
        }
        C1866b[] c1866bArr = new C1866b[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m471w0 = C0143v.m471w0(byteArrayInputStream);
            int m471w02 = C0143v.m471w0(byteArrayInputStream);
            c1866bArr[i8] = new C1866b(str, new String(C0143v.m465t0(m471w0, byteArrayInputStream), StandardCharsets.UTF_8), C0143v.m469v0(4, byteArrayInputStream), m471w02, (int) C0143v.m469v0(4, byteArrayInputStream), (int) C0143v.m469v0(4, byteArrayInputStream), new int[m471w02], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C1866b c1866b = c1866bArr[i9];
            int available = byteArrayInputStream.available() - c1866b.f8388f;
            int i10 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1866b.f8391i;
                if (available2 <= available) {
                    break;
                }
                i10 += C0143v.m471w0(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i10), 1);
                for (int m471w03 = C0143v.m471w0(byteArrayInputStream); m471w03 > 0; m471w03--) {
                    C0143v.m471w0(byteArrayInputStream);
                    int m469v0 = (int) C0143v.m469v0(1, byteArrayInputStream);
                    if (m469v0 != 6 && m469v0 != 7) {
                        while (m469v0 > 0) {
                            C0143v.m469v0(1, byteArrayInputStream);
                            for (int m469v02 = (int) C0143v.m469v0(1, byteArrayInputStream); m469v02 > 0; m469v02--) {
                                C0143v.m471w0(byteArrayInputStream);
                            }
                            m469v0--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1866b.f8390h = m4398d(c1866b.f8387e, byteArrayInputStream);
            int i11 = c1866b.f8389g;
            BitSet valueOf = BitSet.valueOf(C0143v.m465t0(((((i11 * 2) + 8) - 1) & (-8)) / 8, byteArrayInputStream));
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = valueOf.get(m4397c(2, i12, i11)) ? 2 : 0;
                if (valueOf.get(m4397c(4, i12, i11))) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i12));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | num.intValue()));
                }
            }
        }
        return c1866bArr;
    }

    /* renamed from: j */
    public static boolean m4404j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1866b[] c1866bArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C1872h.f8402a;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C1872h.f8403b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] m4395a = m4395a(c1866bArr, bArr3);
                C0143v.m405D0(byteArrayOutputStream, c1866bArr.length, 1);
                C0143v.m405D0(byteArrayOutputStream, m4395a.length, 4);
                byte[] m464t = C0143v.m464t(m4395a);
                C0143v.m405D0(byteArrayOutputStream, m464t.length, 4);
                byteArrayOutputStream.write(m464t);
                return true;
            }
            byte[] bArr4 = C1872h.f8405d;
            if (Arrays.equals(bArr, bArr4)) {
                C0143v.m405D0(byteArrayOutputStream, c1866bArr.length, 1);
                for (C1866b c1866b : c1866bArr) {
                    int size = c1866b.f8391i.size() * 4;
                    String m4396b = m4396b(c1866b.f8383a, c1866b.f8384b, bArr4);
                    C0143v.m407E0(byteArrayOutputStream, m4396b.getBytes(StandardCharsets.UTF_8).length);
                    C0143v.m407E0(byteArrayOutputStream, c1866b.f8390h.length);
                    C0143v.m405D0(byteArrayOutputStream, size, 4);
                    C0143v.m405D0(byteArrayOutputStream, c1866b.f8385c, 4);
                    byteArrayOutputStream.write(m4396b.getBytes(StandardCharsets.UTF_8));
                    Iterator<Integer> it = c1866b.f8391i.keySet().iterator();
                    while (it.hasNext()) {
                        C0143v.m407E0(byteArrayOutputStream, it.next().intValue());
                        C0143v.m407E0(byteArrayOutputStream, 0);
                    }
                    for (int i7 : c1866b.f8390h) {
                        C0143v.m407E0(byteArrayOutputStream, i7);
                    }
                }
                return true;
            }
            byte[] bArr5 = C1872h.f8404c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] m4395a2 = m4395a(c1866bArr, bArr5);
                C0143v.m405D0(byteArrayOutputStream, c1866bArr.length, 1);
                C0143v.m405D0(byteArrayOutputStream, m4395a2.length, 4);
                byte[] m464t2 = C0143v.m464t(m4395a2);
                C0143v.m405D0(byteArrayOutputStream, m464t2.length, 4);
                byteArrayOutputStream.write(m464t2);
                return true;
            }
            byte[] bArr6 = C1872h.f8406e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C0143v.m407E0(byteArrayOutputStream, c1866bArr.length);
            for (C1866b c1866b2 : c1866bArr) {
                String m4396b2 = m4396b(c1866b2.f8383a, c1866b2.f8384b, bArr6);
                C0143v.m407E0(byteArrayOutputStream, m4396b2.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = c1866b2.f8391i;
                C0143v.m407E0(byteArrayOutputStream, treeMap.size());
                C0143v.m407E0(byteArrayOutputStream, c1866b2.f8390h.length);
                C0143v.m405D0(byteArrayOutputStream, c1866b2.f8385c, 4);
                byteArrayOutputStream.write(m4396b2.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C0143v.m407E0(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i8 : c1866b2.f8390h) {
                    C0143v.m407E0(byteArrayOutputStream, i8);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C0143v.m407E0(byteArrayOutputStream2, c1866bArr.length);
            int i9 = 2;
            int i10 = 2;
            for (C1866b c1866b3 : c1866bArr) {
                C0143v.m405D0(byteArrayOutputStream2, c1866b3.f8385c, 4);
                C0143v.m405D0(byteArrayOutputStream2, c1866b3.f8386d, 4);
                C0143v.m405D0(byteArrayOutputStream2, c1866b3.f8389g, 4);
                String m4396b3 = m4396b(c1866b3.f8383a, c1866b3.f8384b, bArr2);
                int length2 = m4396b3.getBytes(StandardCharsets.UTF_8).length;
                C0143v.m407E0(byteArrayOutputStream2, length2);
                i10 = i10 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream2.write(m4396b3.getBytes(StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i10 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            }
            C1873i c1873i = new C1873i(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c1873i);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            for (int i12 = 0; i12 < c1866bArr.length; i12++) {
                try {
                    C1866b c1866b4 = c1866bArr[i12];
                    C0143v.m407E0(byteArrayOutputStream3, i12);
                    C0143v.m407E0(byteArrayOutputStream3, c1866b4.f8387e);
                    i11 = i11 + 2 + 2 + (c1866b4.f8387e * 2);
                    m4405k(byteArrayOutputStream3, c1866b4);
                } finally {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            C1873i c1873i2 = new C1873i(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1873i2);
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c1866bArr.length) {
                try {
                    C1866b c1866b5 = c1866bArr[i13];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c1866b5.f8391i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m4407m(byteArrayOutputStream4, c1866b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m4408n(byteArrayOutputStream4, c1866b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            C0143v.m407E0(byteArrayOutputStream2, i13);
                            int length3 = byteArray3.length + i9 + byteArray4.length;
                            int i16 = i14 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            C0143v.m405D0(byteArrayOutputStream2, length3, 4);
                            C0143v.m407E0(byteArrayOutputStream2, i15);
                            byteArrayOutputStream2.write(byteArray3);
                            byteArrayOutputStream2.write(byteArray4);
                            i14 = i16 + length3;
                            i13++;
                            arrayList3 = arrayList4;
                            i9 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            C1873i c1873i3 = new C1873i(4, byteArray5, true);
            byteArrayOutputStream2.close();
            arrayList2.add(c1873i3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + (arrayList2.size() * 16);
            C0143v.m405D0(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                C1873i c1873i4 = (C1873i) arrayList2.get(i17);
                C0143v.m405D0(byteArrayOutputStream, C0090b.m217b(c1873i4.f8409a), 4);
                C0143v.m405D0(byteArrayOutputStream, size2, 4);
                boolean z6 = c1873i4.f8411c;
                byte[] bArr7 = c1873i4.f8410b;
                if (z6) {
                    long length4 = bArr7.length;
                    byte[] m464t3 = C0143v.m464t(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(m464t3);
                    C0143v.m405D0(byteArrayOutputStream, m464t3.length, 4);
                    C0143v.m405D0(byteArrayOutputStream, length4, 4);
                    length = m464t3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    C0143v.m405D0(byteArrayOutputStream, bArr7.length, 4);
                    C0143v.m405D0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } finally {
            try {
                byteArrayOutputStream2.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    /* renamed from: k */
    public static void m4405k(ByteArrayOutputStream byteArrayOutputStream, C1866b c1866b) {
        int i7 = 0;
        for (int i8 : c1866b.f8390h) {
            Integer valueOf = Integer.valueOf(i8);
            C0143v.m407E0(byteArrayOutputStream, valueOf.intValue() - i7);
            i7 = valueOf.intValue();
        }
    }

    /* renamed from: l */
    public static void m4406l(ByteArrayOutputStream byteArrayOutputStream, C1866b c1866b, String str) {
        C0143v.m407E0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C0143v.m407E0(byteArrayOutputStream, c1866b.f8387e);
        C0143v.m405D0(byteArrayOutputStream, c1866b.f8388f, 4);
        C0143v.m405D0(byteArrayOutputStream, c1866b.f8385c, 4);
        C0143v.m405D0(byteArrayOutputStream, c1866b.f8389g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: m */
    public static void m4407m(ByteArrayOutputStream byteArrayOutputStream, C1866b c1866b) {
        byte[] bArr = new byte[((((c1866b.f8389g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c1866b.f8391i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i7 = intValue2 & 2;
            int i8 = c1866b.f8389g;
            if (i7 != 0) {
                int m4397c = m4397c(2, intValue, i8);
                int i9 = m4397c / 8;
                bArr[i9] = (byte) ((1 << (m4397c % 8)) | bArr[i9]);
            }
            if ((intValue2 & 4) != 0) {
                int m4397c2 = m4397c(4, intValue, i8);
                int i10 = m4397c2 / 8;
                bArr[i10] = (byte) ((1 << (m4397c2 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: n */
    public static void m4408n(ByteArrayOutputStream byteArrayOutputStream, C1866b c1866b) {
        int i7 = 0;
        for (Map.Entry<Integer, Integer> entry : c1866b.f8391i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C0143v.m407E0(byteArrayOutputStream, intValue - i7);
                C0143v.m407E0(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }
}
