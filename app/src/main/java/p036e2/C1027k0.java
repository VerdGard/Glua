package p036e2;

import android.content.ContentResolver;
import android.content.Context;
import android.ext.C0089a;
import android.ext.C0090b;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p036e2.C0964b0;

/* renamed from: e2.k0 */
/* loaded from: classes.dex */
public final class C1027k0 extends AbstractC1006h0 {

    /* renamed from: f */
    public Context f5190f;

    /* renamed from: g */
    public final e f5191g;

    /* renamed from: e2.k0$a */
    public static final class a implements Comparable<a> {

        /* renamed from: e */
        public static final String[] f5192e = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};

        /* renamed from: c */
        public final int f5193c;

        public a(int i7) {
            this.f5193c = i7;
        }

        /* renamed from: a */
        public static a m3088a(byte b7, boolean z6) {
            int i7 = b7 & 255;
            return m3089b(z6 ? i7 >> 4 : i7 & 15);
        }

        /* renamed from: b */
        public static a m3089b(int i7) {
            if (i7 < 0 || i7 >= 16) {
                throw new IllegalArgumentException(C0090b.m219e("invalid idx ", i7));
            }
            return new a(i7);
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return this.f5193c - aVar.f5193c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.f5193c == ((a) obj).f5193c;
        }

        public final int hashCode() {
            return this.f5193c;
        }
    }

    /* renamed from: e2.k0$b */
    public class b {

        /* renamed from: a */
        public a[] f5194a;

        /* renamed from: b */
        public int f5195b;

        public b() {
            this.f5194a = new a[33];
        }

        public b(byte[] bArr) {
            this.f5194a = new a[33];
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            for (int i7 = 0; i7 < bArr.length; i7++) {
                a m3088a = a.m3088a(bArr[i7], false);
                a m3088a2 = a.m3088a(bArr[i7], true);
                m3091b(m3088a);
                m3091b(m3088a2);
            }
        }

        /* renamed from: a */
        public final a m3090a(int i7) {
            if (i7 < this.f5195b) {
                return this.f5194a[i7];
            }
            StringBuilder m221g = C0090b.m221g("idx ", i7, " size ");
            m221g.append(this.f5195b);
            throw new IndexOutOfBoundsException(m221g.toString());
        }

        /* renamed from: b */
        public final void m3091b(a aVar) {
            int i7 = this.f5195b + 1;
            a[] aVarArr = this.f5194a;
            if (i7 - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i8 = length + (length >> 1);
                if (i8 - i7 >= 0) {
                    i7 = i8;
                }
                this.f5194a = (a[]) Arrays.copyOf(aVarArr, i7);
            }
            a[] aVarArr2 = this.f5194a;
            int i9 = this.f5195b;
            this.f5195b = i9 + 1;
            aVarArr2[i9] = aVar;
        }

        /* renamed from: c */
        public final byte[] m3092c() {
            int i7;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i8 = 0;
            while (true) {
                i7 = this.f5195b;
                if (i8 >= i7 / 2) {
                    break;
                }
                int i9 = i8 * 2;
                byteArrayOutputStream.write((byte) (((((byte) m3090a(i9 + 1).f5193c) & 255) << 4) | (((byte) m3090a(i9).f5193c) & 255)));
                i8++;
            }
            if (i7 % 2 != 0) {
                byteArrayOutputStream.write((byte) (((byte) m3090a(i7 - 1).f5193c) & 255));
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: e2.k0$c */
    public static class c {

        /* renamed from: a */
        public final byte[] f5196a;

        /* renamed from: b */
        public final byte f5197b;

        /* renamed from: c */
        public final byte[] f5198c;

        public c(byte[] bArr, byte b7, byte[] bArr2, boolean z6, String str) {
            this.f5196a = bArr;
            this.f5197b = b7;
            this.f5198c = bArr2;
        }
    }

    /* renamed from: e2.k0$d */
    public static class d {
        public final String toString() {
            return "";
        }
    }

    /* renamed from: e2.k0$e */
    public static class e {

        /* renamed from: a */
        public Method f5199a;

        /* renamed from: b */
        public Method f5200b;

        /* renamed from: c */
        public Method f5201c;

        /* renamed from: d */
        public Method f5202d;

        /* renamed from: e */
        public Method f5203e;

        /* renamed from: a */
        public final int m3093a(Context context, Uri uri, int i7) {
            try {
                return ((Integer) this.f5199a.invoke(context, uri, 0, Integer.valueOf(i7), 1)).intValue();
            } catch (Exception e7) {
                throw new C0964b0.a(e7);
            }
        }
    }

    public C1027k0() {
        super("upc", 9000000L);
        e eVar = new e();
        this.f5191g = eVar;
        try {
            String m2962a = C0964b0.m2962a(new byte[]{121, -75, -64, -117, -32, 4, -8, -19, -11, 84, -123, -65, -29, -73, 23, Byte.MAX_VALUE, 52, -54, 124, 29, 10, -105, -19, 73, 56, 100, 42, 41, -13, 25, -76, -71});
            Class cls = Integer.TYPE;
            Method declaredMethod = Context.class.getDeclaredMethod(m2962a, Uri.class, cls, cls, cls);
            declaredMethod.setAccessible(true);
            eVar.f5199a = declaredMethod;
            Method declaredMethod2 = Context.class.getDeclaredMethod(C0964b0.m2962a(new byte[]{10, 28, -53, -126, 11, -111, 68, -11, -28, 101, 81, 41, 59, -1, 98, -58, -25, -60, -55, 70, 66, 51, -63, -79, -96, 37, 70, 7, 108, 59, -79, -65}), String.class, Uri.class, cls);
            declaredMethod2.setAccessible(true);
            eVar.f5200b = declaredMethod2;
            Method declaredMethod3 = ContentResolver.class.getDeclaredMethod(C0964b0.m2962a(new byte[]{-14, -21, -20, -77, 32, 107, -63, 36, -44, -86, 57, -31, 102, 90, 4, 13, 91, 22, 84, 30, -86, 4, -106, -62, 49, 108, 61, 48, -101, 90, -110, 88}), Uri.class, cls);
            declaredMethod3.setAccessible(true);
            eVar.f5201c = declaredMethod3;
            Method declaredMethod4 = Context.class.getDeclaredMethod(C0964b0.m2962a(new byte[]{-71, 92, 64, -96, 123, 89, 39, 119, -7, 115, 0, 56, 80, 20, 16, -64, -23, -79, -32, -55, 2, 124, -48, -16, 14, -95, -96, -96, -56, -88, -55, 63}), Uri.class, cls);
            declaredMethod4.setAccessible(true);
            eVar.f5202d = declaredMethod4;
            Method declaredMethod5 = ContentResolver.class.getDeclaredMethod(C0964b0.m2962a(new byte[]{-101, -5, -82, -122, -10, 77, -50, -88, 27, -103, -100, 67, 98, 89, -44, -92, -125, 65, -82, -74, 1, 92, -103, -116, 74, -60, 73, 78, 77, -42, 107, -109}), Uri.class, cls);
            declaredMethod5.setAccessible(true);
            eVar.f5203e = declaredMethod5;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static String m3078e(int i7, a aVar, String str) {
        return String.format("content://%s/dat/v1/i%d/%s", m3080m(str), Integer.valueOf(i7), a.f5192e[aVar.f5193c]);
    }

    /* renamed from: l */
    public static byte[] m3079l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            int digit = Character.digit(str.charAt(i8), 16);
            int digit2 = Character.digit(str.charAt(i8 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i7] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    /* renamed from: m */
    public static String m3080m(String str) {
        return C0089a.m210h(str, ".cesium");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
    
        if (m3087k(r18.f5190f.getPackageName(), android.os.Process.myUid(), r0) == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    @Override // p036e2.AbstractC1006h0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p036e2.AbstractC1006h0.e mo3033a(p036e2.AbstractC1006h0.d r19, p036e2.C1021j1.a r20) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1027k0.mo3033a(e2.h0$d, e2.j1$a):e2.h0$e");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:13|(4:16|(2:18|19)(2:21|22)|20|14)|23|24|(4:27|(1:29)|(3:32|33|34)(1:31)|25)|35|36|(1:(3:38|(2:40|(2:42|43)(1:101))(1:103)|102)(2:104|105))|44|(4:46|(3:48|(1:50)|(3:53|54|55)(1:52))|56|57)(1:100)|(4:59|(2:60|(3:62|(1:64)|(1:67)(1:66))(2:97|98))|68|(12:70|71|(3:73|(1:75)|76)(1:95)|77|78|79|(1:81)(1:93)|82|(4:87|88|89|90)|92|89|90))(1:99)|96|71|(0)(0)|77|78|79|(0)(0)|82|(5:84|87|88|89|90)|92|89|90) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221 A[Catch: Exception -> 0x0257, TryCatch #0 {Exception -> 0x0257, blocks: (B:79:0x0211, B:81:0x0221, B:82:0x022a, B:84:0x0230, B:87:0x0237), top: B:78:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    @Override // p036e2.AbstractC1006h0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p036e2.AbstractC1006h0.g mo3034b(java.lang.String r22, p036e2.AbstractC1006h0.f r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1027k0.mo3034b(java.lang.String, e2.h0$f):e2.h0$g");
    }

    @Override // p036e2.AbstractC1006h0
    /* renamed from: c */
    public final void mo3035c() {
        this.f5190f = this.f5084a.f5088a;
    }

    /* renamed from: d */
    public final a m3081d(String str, int i7, ArrayList arrayList, int i8, d dVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1048n0 c1048n0 = (C1048n0) it.next();
            if (m3086j(str, i7, c1048n0.f5259b, i8, dVar)) {
                c1048n0.f5258a++;
                return c1048n0.f5259b;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m3082f(Uri uri, int i7) {
        e eVar = this.f5191g;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Context context = this.f5190f;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            eVar.getClass();
            try {
                eVar.f5202d.invoke(context, uri, Integer.valueOf(i7));
                try {
                    eVar.f5203e.invoke(contentResolver, uri, Integer.valueOf(i7));
                } catch (Exception e7) {
                    throw new C0964b0.a(e7);
                }
            } catch (Exception e8) {
                throw new C0964b0.a(e8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final boolean m3083g(int i7, a aVar, String str) {
        int i8;
        Uri parse = Uri.parse(String.format("content://%s/dic/v1/%s", m3080m(str), a.f5192e[aVar.f5193c]));
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                i8 = -1;
                break;
            }
            try {
                i8 = this.f5191g.m3093a(this.f5190f, parse, i7);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i9++;
            }
        }
        return i8 == 0;
    }

    /* renamed from: h */
    public final boolean m3084h(int i7, String str) {
        int i8;
        Uri parse = Uri.parse(String.format("content://%s/clo/v1/%s", m3080m(str), "yes"));
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                i8 = -1;
                break;
            }
            try {
                i8 = this.f5191g.m3093a(this.f5190f, parse, i7);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i9++;
            }
        }
        return i8 == 0;
    }

    /* renamed from: i */
    public final boolean m3085i(Uri uri) {
        e eVar = this.f5191g;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Context context = this.f5190f;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            String packageName = context.getPackageName();
            eVar.getClass();
            try {
                eVar.f5200b.invoke(context, packageName, uri, 65);
                try {
                    eVar.f5201c.invoke(contentResolver, uri, 1);
                    return true;
                } catch (Exception e7) {
                    throw new C0964b0.a(e7);
                }
            } catch (Exception e8) {
                throw new C0964b0.a(e8);
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final boolean m3086j(String str, int i7, a aVar, int i8, d dVar) {
        int i9;
        Uri parse = Uri.parse(m3078e(i7, aVar, str));
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                i9 = -1;
                break;
            }
            try {
                i9 = this.f5191g.m3093a(this.f5190f, parse, i8);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i10++;
            }
        }
        return i9 == 0;
    }

    /* renamed from: k */
    public final boolean m3087k(String str, int i7, String str2) {
        int i8;
        Uri parse = Uri.parse(String.format("content://%s/clo/v1/%s", m3080m(str), str2));
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                i8 = -1;
                break;
            }
            try {
                i8 = this.f5191g.m3093a(this.f5190f, parse, i7);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i9++;
            }
        }
        return i8 == 0;
    }
}
