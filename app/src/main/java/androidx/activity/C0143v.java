package androidx.activity;

import android.content.Context;
import android.ext.C0090b;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.InterfaceC0260q1;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C0391d0;
import com.airbnb.lottie.C0680a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeSet;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p002a1.C0017d;
import p006a5.C0051a;
import p006a5.C0054d;
import p006a5.InterfaceC0053c;
import p014b5.C0540a;
import p016c.C0572z;
import p018c1.C0587h;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0651o;
import p028d2.C0879a;
import p031d5.C0892c;
import p032d6.C0898f;
import p032d6.InterfaceC0894b;
import p035e1.C0955g;
import p036e2.C0961a4;
import p036e2.C1109v5;
import p036e2.C1123x5;
import p036e2.EnumC1011h5;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1159d;
import p043f1.InterfaceC1162g;
import p055g5.C1245b;
import p060h2.InterfaceC1293b;
import p060h2.InterfaceC1295d;
import p064h6.InterfaceC1303a;
import p067i1.C1321c;
import p067i1.C1322d;
import p067i1.C1323e;
import p067i1.C1324f;
import p067i1.C1325g;
import p067i1.InterfaceC1328j;
import p070i4.InterfaceC1349o;
import p075j1.C1403d;
import p079j5.AbstractC1432a;
import p079j5.C1440i;
import p081k.C1444b;
import p081k.C1445c;
import p081k.InterfaceC1443a;
import p083k1.C1447a;
import p084k2.InterfaceC1451a;
import p089l.C1468b;
import p095l5.C1510a;
import p111n5.InterfaceC1647c;
import p133q5.AbstractC1802e;
import p133q5.C1798a;
import p133q5.C1800c;
import p140r4.C1835c;
import p141r5.AbstractC1840b;
import p141r5.C1839a;
import p149s5.C1887a;
import p149s5.C1888b;
import p149s5.C1889c;
import p149s5.C1890d;
import p149s5.C1891e;
import p149s5.C1892f;
import p149s5.C1893g;
import p149s5.C1894h;
import p149s5.C1895i;
import p149s5.C1896j;
import p149s5.C1899m;
import p149s5.C1901o;
import p149s5.C1902p;
import p149s5.C1903q;
import p149s5.C1904r;
import p163u3.C1971b;
import p164u5.C1976a;
import p164u5.C1977b;
import p164u5.EnumC1978c;
import p166v.C2009a;
import p181x.C2152a;

/* renamed from: androidx.activity.v */
/* loaded from: classes.dex */
public class C0143v implements InterfaceC1328j, InterfaceC1349o, InterfaceC1451a, InterfaceC1293b, InterfaceC1647c, InterfaceC1295d {

    /* renamed from: d */
    public static C0143v f265d;

    /* renamed from: f */
    public static StringBuilder f267f;

    /* renamed from: a */
    public static final C0143v f262a = new C0143v();

    /* renamed from: b */
    public static final Object[] f263b = new Object[0];

    /* renamed from: c */
    public static final C0143v f264c = new C0143v();

    /* renamed from: e */
    public static final C0143v f266e = new C0143v();

    /* renamed from: g */
    public static final C0143v f268g = new C0143v();

    public /* synthetic */ C0143v() {
    }

    /* renamed from: A */
    public static int m398A(Context context, int i7, int i8) {
        TypedValue m4582a = C1971b.m4582a(i7, context);
        if (m4582a == null) {
            return i8;
        }
        int i9 = m4582a.resourceId;
        return i9 != 0 ? C2009a.m4895b(context, i9) : m4582a.data;
    }

    /* renamed from: A0 */
    public static final Object[] m399A0(Collection collection) {
        C0898f.m2606e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f263b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                C0898f.m2605d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                C0898f.m2605d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i7 = i8;
        }
    }

    /* renamed from: B */
    public static int m400B(View view, int i7) {
        Context context = view.getContext();
        TypedValue m4584c = C1971b.m4584c(i7, view.getContext(), view.getClass().getCanonicalName());
        int i8 = m4584c.resourceId;
        return i8 != 0 ? C2009a.m4895b(context, i8) : m4584c.data;
    }

    /* renamed from: B0 */
    public static final Object[] m401B0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        C0898f.m2606e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            C0898f.m2604c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                C0898f.m2605d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i8] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                C0898f.m2605d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i7 = i8;
        }
    }

    /* renamed from: C */
    public static final int m402C(InterfaceC0053c interfaceC0053c, C1510a c1510a) {
        C0898f.m2606e(c1510a, "colorScheme");
        interfaceC0053c.mo164g();
        return c1510a.m3927c(interfaceC0053c.mo165h());
    }

    /* renamed from: C0 */
    public static void m403C0(int i7, int i8, List list) {
        if (i8 == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0051a c0051a = (C0051a) it.next();
            int i9 = c0051a.f136a;
            if (i9 >= i7) {
                c0051a.f136a = i9 + i8;
            }
            int i10 = c0051a.f138c;
            if (i10 >= i7) {
                c0051a.f138c = i10 + i8;
            }
            if (c0051a.f136a >= c0051a.f138c) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: D */
    public static final Class m404D(InterfaceC1303a interfaceC1303a) {
        C0898f.m2606e(interfaceC1303a, "<this>");
        Class<?> mo2601a = ((InterfaceC0894b) interfaceC1303a).mo2601a();
        if (!mo2601a.isPrimitive()) {
            return mo2601a;
        }
        String name = mo2601a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return mo2601a;
    }

    /* renamed from: D0 */
    public static void m405D0(ByteArrayOutputStream byteArrayOutputStream, long j7, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: E */
    public static final int m406E(List list) {
        C0898f.m2606e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: E0 */
    public static void m407E0(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        m405D0(byteArrayOutputStream, i7, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p022c5.C0651o m408F(p022c5.C0641e r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = "text"
            p032d6.C0898f.m2606e(r5, r0)
            c5.f r0 = r5.m2146r(r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L2e
            if (r8 == 0) goto L2e
            android.icu.text.BreakIterator r8 = p001a0.C0007f.m18d()
            c5.c r1 = new c5.c
            r1.<init>(r0)
            p001a0.C0008g.m39j(r8, r1)
            int r1 = p001a0.C0011j.m46a(r8, r7)
            int r8 = p001a0.C0007f.m15a(r8)
            if (r7 < r8) goto L2e
            if (r7 > r1) goto L2e
            long r7 = p002a1.C0017d.m68G(r8, r1)
            goto L32
        L2e:
            long r7 = p022c5.C0646j.m2166a(r7, r0)
        L32:
            r1 = 32
            long r1 = r7 >> r1
            int r2 = (int) r1
            int r7 = p002a1.C0017d.m62A(r7)
            if (r2 != r7) goto L65
            int r8 = r0.f3160e
            if (r7 >= r8) goto L46
            int r5 = r7 + 1
            r8 = r5
            r5 = r6
            goto L67
        L46:
            if (r2 <= 0) goto L4c
            int r5 = r2 + (-1)
            r8 = r6
            goto L54
        L4c:
            if (r6 <= 0) goto L59
            int r8 = r6 + (-1)
            int r5 = r5.m2142n(r8)
        L54:
            r0 = r7
            r4 = r8
            r8 = r6
            r6 = r4
            goto L6a
        L59:
            int r5 = r5.m2147s()
            int r5 = r5 + (-1)
            if (r6 >= r5) goto L65
            int r5 = r6 + 1
            r8 = 0
            goto L67
        L65:
            r5 = r6
            r8 = r7
        L67:
            r0 = r8
            r8 = r5
            r5 = r2
        L6a:
            c5.o r1 = new c5.o
            c5.b r3 = new c5.b
            r3.<init>(r6, r5, r2)
            c5.b r5 = new c5.b
            r5.<init>(r8, r0, r7)
            r1.<init>(r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0143v.m408F(c5.e, int, int, boolean):c5.o");
    }

    /* renamed from: G */
    public static int m409G(C1245b c1245b, AbstractC1432a abstractC1432a, C0641e c0641e, int i7, int i8, int i9, float f7) {
        C0898f.m2606e(c1245b, "editor");
        C0898f.m2606e(abstractC1432a, "layout");
        C0898f.m2606e(c0641e, "text");
        C0892c m2148t = c0641e.m2148t(i7);
        C0898f.m2605d(m2148t, "text.getLineDirections(line)");
        C0642f m2146r = c0641e.m2146r(i7);
        C1835c m4315d = C1835c.m4315d(c1245b.f6051f3.f6137D);
        m4315d.m4320f(c0641e, i7, 0, m2146r.f3160e, abstractC1432a.f6872c.m3474Q(i7), c1245b.getTextPaint(), c1245b.getRenderContext());
        if (abstractC1432a instanceof C1440i) {
            m4315d.f8293k = ((C1440i) abstractC1432a).m3824i(i7);
        }
        long[] jArr = m2148t.f4677a;
        int length = jArr.length;
        float f8 = 0.0f;
        int i10 = 0;
        while (i10 < length) {
            int m91p = C0017d.m91p(m2148t.m2598b(i10), i8, i9);
            int m91p2 = C0017d.m91p(m2148t.m2597a(i10), i8, i9);
            if (m91p2 != i8) {
                if (m91p == i9) {
                    int i11 = i10 > 0 ? i10 - 1 : 0;
                    return C0017d.m91p(m2148t.m2599c(i11) ? m2148t.m2598b(i11) : m2148t.m2597a(i11), i8, i9);
                }
                float m4317b = m4315d.m4317b(m91p, m91p2) + f8;
                if (m4317b >= f7) {
                    int m4316a = (int) ((m2148t.m2599c(i10) ? m4315d.m4316a(m91p, m4317b - f7) : m4315d.m4316a(m91p, f7 - f8)) >> 32);
                    m4315d.m4319e();
                    return m4316a;
                }
                f8 = m4317b;
            }
            i10++;
        }
        m4315d.m4319e();
        int length2 = jArr.length - 1;
        return C0017d.m91p(m2148t.m2599c(length2) ? m2148t.m2598b(length2) : m2148t.m2597a(length2), i8, i9);
    }

    /* renamed from: H */
    public static float m410H(C1245b c1245b, AbstractC1432a abstractC1432a, C0641e c0641e, int i7, int i8, int i9, int i10) {
        C0898f.m2606e(c1245b, "editor");
        C0898f.m2606e(abstractC1432a, "layout");
        C0898f.m2606e(c0641e, "text");
        C0892c m2148t = c0641e.m2148t(i7);
        C0898f.m2605d(m2148t, "text.getLineDirections(line)");
        C0642f m2146r = c0641e.m2146r(i7);
        C1835c m4315d = C1835c.m4315d(c1245b.f6051f3.f6137D);
        m4315d.m4320f(c0641e, i7, 0, m2146r.f3160e, abstractC1432a.f6872c.m3474Q(i7), c1245b.getTextPaint(), c1245b.getRenderContext());
        if (abstractC1432a instanceof C1440i) {
            m4315d.f8293k = ((C1440i) abstractC1432a).m3824i(i7);
        }
        int m91p = C0017d.m91p(i10, i8, i9);
        int length = m2148t.f4677a.length;
        float f7 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            int m91p2 = C0017d.m91p(m2148t.m2598b(i11), i8, i9);
            int m91p3 = C0017d.m91p(m2148t.m2597a(i11), i8, i9);
            if (m91p2 > m91p || m91p2 > m91p3) {
                break;
            }
            f7 += m91p3 < m91p ? m4315d.m4317b(m91p2, m91p3) : m2148t.m2599c(i11) ? m4315d.m4317b(i10, m91p3) : m4315d.m4317b(m91p2, m91p);
        }
        m4315d.m4319e();
        return f7;
    }

    /* renamed from: I */
    public static final int m411I(C1468b c1468b, Object obj, int i7) {
        C0898f.m2606e(c1468b, "<this>");
        int i8 = c1468b.f7018m;
        if (i8 == 0) {
            return -1;
        }
        try {
            int m85j = C0017d.m85j(c1468b.f7018m, i7, c1468b.f7016c);
            if (m85j < 0) {
                return m85j;
            }
            if (C0898f.m2602a(obj, c1468b.f7017e[m85j])) {
                return m85j;
            }
            int i9 = m85j + 1;
            while (i9 < i8 && c1468b.f7016c[i9] == i7) {
                if (C0898f.m2602a(obj, c1468b.f7017e[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = m85j - 1; i10 >= 0 && c1468b.f7016c[i10] == i7; i10--) {
                if (C0898f.m2602a(obj, c1468b.f7017e[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: J */
    public static boolean m412J(long j7) {
        return (j7 & 274877906944L) != 0;
    }

    /* renamed from: K */
    public static boolean m413K(long j7) {
        return (j7 & 549755813888L) != 0;
    }

    /* renamed from: L */
    public static void m414L(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: M */
    public static boolean m415M(int i7) {
        return i7 >= 48 && i7 <= 57;
    }

    /* renamed from: N */
    public static boolean m416N(int i7) {
        return (i7 >= 48 && i7 <= 57) || (i7 >= 97 && i7 <= 102) || (i7 >= 65 && i7 <= 70);
    }

    /* renamed from: O */
    public static int m417O(float f7, int i7, int i8) {
        return C2152a.m5264c(C2152a.m5266e(i8, Math.round(Color.alpha(i8) * f7)), i7);
    }

    /* renamed from: P */
    public static String m418P(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: Q */
    public static long m419Q(int i7, boolean z6, boolean z7) {
        m458q(i7);
        m458q(0);
        return (z6 ? 274877906944L : 0L) | (i7 + (0 << 19)) | (z7 ? 549755813888L : 0L) | 0 | 0;
    }

    /* renamed from: R */
    public static String m420R(String str) {
        return m418P(str).trim();
    }

    /* renamed from: S */
    public static void m421S(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: T */
    public static void m422T(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: U */
    public static void m423U(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: V */
    public static void m424V(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: W */
    public static C0540a m425W(long j7, int i7) {
        C0054d<C0540a> c0054d = C0540a.f2695c;
        C0540a poll = c0054d.f143b.poll();
        if (poll != null) {
            poll.mo162e(i7);
            poll.mo158a(j7);
        } else {
            poll = c0054d.f142a.mo237b(Integer.valueOf(i7), Long.valueOf(j7));
        }
        return poll;
    }

    /* renamed from: X */
    public static void m426X(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC0260q1) {
                editorInfo.hintText = ((InterfaceC0260q1) parent).m873a();
                return;
            }
        }
    }

    /* renamed from: Y */
    public static C0572z m427Y(JsonReader jsonReader, C0680a c0680a) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new C0587h(c0680a, C1323e.m3686a(jsonReader, c0680a, C1403d.m3756c(), C1324f.f6523a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            C0017d.m76O(arrayList);
        } else {
            arrayList.add(new C1447a(C1322d.m3683b(jsonReader, C1403d.m3756c())));
        }
        return new C0572z(3, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x017f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0228  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p059h1.C1287e m428Z(android.util.JsonReader r41, com.airbnb.lottie.C0680a r42) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0143v.m428Z(android.util.JsonReader, com.airbnb.lottie.a):h1.e");
    }

    /* renamed from: a */
    public static String m429a(Context context) {
        String str;
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c) {
            return "";
        }
        try {
            str = C0879a.m2567a(context);
        } catch (Throwable unused) {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: a0 */
    public static C1156a m430a0(JsonReader jsonReader, C0680a c0680a) {
        return new C1156a(0, C0017d.m70I(1.0f, jsonReader, c0680a, C0391d0.f1972h));
    }

    /* renamed from: b */
    public static String m431b(boolean z6, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return m446k(z6, messageDigest.digest());
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: b0 */
    public static AbstractC1840b m432b0(C1976a c1976a) {
        AbstractC1840b m434d0 = m434d0(c1976a);
        while (c1976a.m4597a() == EnumC1978c.f8900Y1) {
            C1887a c1887a = new C1887a(c1976a.m4605i(), m434d0, m434d0(c1976a));
            m434d0 = c1887a.f8435g;
            if (!((m434d0 instanceof C1902p) || (m434d0 instanceof C1894h) || (m434d0 instanceof C1891e) || (m434d0 instanceof C1899m))) {
                if ((m434d0 instanceof C1890d) || (m434d0 instanceof C1896j)) {
                    m434d0 = c1887a.f8436h;
                    if (!((m434d0 instanceof C1904r) || (m434d0 instanceof C1892f))) {
                    }
                }
                m434d0 = c1887a;
            }
        }
        return m434d0;
    }

    /* renamed from: c0 */
    public static AbstractC1840b m433c0(C1976a c1976a) {
        AbstractC1840b m449l0 = m449l0(c1976a);
        while (true) {
            switch (c1976a.m4597a().ordinal()) {
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    m449l0 = new C1887a(c1976a.m4605i(), m449l0, m449l0(c1976a));
                default:
                    return m449l0;
            }
        }
    }

    /* renamed from: d0 */
    public static AbstractC1840b m434d0(C1976a c1976a) {
        AbstractC1840b m433c0 = m433c0(c1976a);
        while (c1976a.m4597a() == EnumC1978c.f8898X1) {
            C1887a c1887a = new C1887a(c1976a.m4605i(), m433c0, m433c0(c1976a));
            m433c0 = c1887a.f8435g;
            if (!((m433c0 instanceof C1890d) || (m433c0 instanceof C1896j))) {
                if ((m433c0 instanceof C1902p) || (m433c0 instanceof C1894h) || (m433c0 instanceof C1891e) || (m433c0 instanceof C1899m)) {
                    m433c0 = c1887a.f8436h;
                    if (!((m433c0 instanceof C1904r) || (m433c0 instanceof C1892f))) {
                    }
                }
                m433c0 = c1887a;
            }
        }
        return m433c0;
    }

    /* renamed from: e0 */
    public static AbstractC1840b m435e0(C1976a c1976a) {
        AbstractC1840b c1902p;
        AbstractC1802e c1798a;
        AbstractC1840b c1904r;
        AbstractC1840b c1888b;
        int ordinal = c1976a.m4597a().ordinal();
        if (ordinal != 14 && ordinal != 15 && ordinal != 33 && ordinal != 36) {
            int ordinal2 = c1976a.m4597a().ordinal();
            if (ordinal2 == 1) {
                c1904r = new C1904r(c1976a.m4605i().f8862a);
            } else if (ordinal2 == 11) {
                c1904r = m463s0(c1976a);
            } else if (ordinal2 == 43) {
                c1904r = new C1890d(c1976a.m4605i().f8862a);
            } else if (ordinal2 == 45) {
                c1976a.m4605i();
                c1904r = m455o0(c1976a);
            } else if (ordinal2 == 50) {
                c1904r = new C1896j(c1976a.m4605i().f8862a);
            } else if (ordinal2 != 54) {
                if (ordinal2 == 64) {
                    c1888b = new C1888b(c1976a.m4605i().m4613a());
                } else if (ordinal2 == 58) {
                    C1977b m4605i = c1976a.m4605i();
                    try {
                        m4605i.f8865d = EnumC1978c.f8928v2;
                        c1888b = new C1899m(m4605i, m4605i.m4613a());
                    } catch (Exception unused) {
                        throw new RuntimeException("not a number: " + m4605i);
                    }
                } else if (ordinal2 != 59) {
                    c1904r = C0017d.m72K(c1976a);
                } else {
                    c1888b = new C1899m(c1976a.m4605i());
                }
                c1904r = c1888b;
            } else {
                c1904r = new C1902p(c1976a.m4605i().f8862a);
            }
            if (c1976a.m4597a() == EnumC1978c.f8883J1) {
                c1904r = new C1887a(c1976a.m4605i(), c1904r, m435e0(c1976a));
            }
            return C0391d0.m1368o(c1904r);
        }
        C1903q c1903q = new C1903q(c1976a.m4605i(), m435e0(c1976a));
        int ordinal3 = c1903q.f8462f.ordinal();
        AbstractC1840b abstractC1840b = c1903q.f8463g;
        if (ordinal3 == 36) {
            if ((abstractC1840b instanceof C1896j) || (abstractC1840b instanceof C1890d)) {
                c1902p = new C1902p(c1903q.f8314a);
            } else {
                if (!(abstractC1840b instanceof C1902p) && !(abstractC1840b instanceof C1894h) && !(abstractC1840b instanceof C1891e) && !(abstractC1840b instanceof C1899m)) {
                    return c1903q;
                }
                c1902p = new C1890d(c1903q.f8314a);
            }
            return c1902p;
        }
        if (ordinal3 != 60) {
            if (ordinal3 != 62) {
                return c1903q;
            }
            if (abstractC1840b instanceof C1894h) {
                C1894h c1894h = (C1894h) abstractC1840b;
                c1894h.f8451f = C1800c.m4254B(~c1894h.f8451f.f8175s);
                return c1894h;
            }
            if (!(abstractC1840b instanceof C1891e)) {
                return c1903q;
            }
            C1891e c1891e = (C1891e) abstractC1840b;
            double mo4253z = c1891e.f8440f.mo4253z();
            int i7 = (int) mo4253z;
            return mo4253z == ((double) i7) ? new C1894h(c1891e.f8314a, ~i7) : c1903q;
        }
        if (abstractC1840b instanceof C1894h) {
            C1894h c1894h2 = (C1894h) abstractC1840b;
            c1894h2.f8451f = C1800c.m4254B(-c1894h2.f8451f.f8175s);
            return c1894h2;
        }
        if (!(abstractC1840b instanceof C1891e)) {
            return c1903q;
        }
        C1891e c1891e2 = (C1891e) abstractC1840b;
        double d7 = -c1891e2.f8440f.mo4253z();
        int i8 = (int) d7;
        if (d7 == i8) {
            int i9 = C1798a.f8169X;
            c1798a = C1800c.m4254B(i8);
        } else {
            c1798a = new C1798a(d7);
        }
        c1891e2.f8440f = c1798a;
        return c1891e2;
    }

    /* renamed from: f */
    public static void m436f(int i7, byte[] bArr, byte[] bArr2) {
        if (i7 < 0) {
            throw new IllegalArgumentException("start should be more than zero!");
        }
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("dst array should not be null or empty");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("src array should not be null or empty");
        }
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("dst array length should be longer than:" + bArr2.length);
        }
        if (bArr.length >= bArr2.length + i7) {
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
        } else {
            throw new IllegalArgumentException("start should be less than:" + (bArr.length - bArr2.length));
        }
    }

    /* renamed from: f0 */
    public static AbstractC1840b m437f0(C1976a c1976a) {
        AbstractC1840b m435e0 = m435e0(c1976a);
        while (true) {
            switch (c1976a.m4597a().ordinal()) {
                case 17:
                case 18:
                case 19:
                case 21:
                    m435e0 = C0391d0.m1366m(new C1887a(c1976a.m4605i(), m435e0, m435e0(c1976a)));
                case 20:
                default:
                    return m435e0;
            }
        }
    }

    /* renamed from: g */
    public static void m438g(Context context, boolean z6) {
        C0961a4.m2954a().getClass();
        if (C0961a4.f4940c) {
            synchronized (C0391d0.f1968d) {
                C0391d0.m1362i(context, z6);
            }
            C1123x5.m3292b(context).m3295c(z6 ? EnumC1011h5.f5116s : EnumC1011h5.f5115m, System.currentTimeMillis());
        }
    }

    /* renamed from: g0 */
    public static AbstractC1840b m439g0(C1976a c1976a) {
        AbstractC1840b m437f0 = m437f0(c1976a);
        while (true) {
            int ordinal = c1976a.m4597a().ordinal();
            if (ordinal != 14 && ordinal != 16) {
                return m437f0;
            }
            m437f0 = C0391d0.m1366m(new C1887a(c1976a.m4605i(), m437f0, m437f0(c1976a)));
        }
    }

    /* renamed from: h */
    public static void m440h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: h0 */
    public static AbstractC1840b m441h0(C1976a c1976a) {
        AbstractC1840b m439g0 = m439g0(c1976a);
        EnumC1978c m4597a = c1976a.m4597a();
        EnumC1978c enumC1978c = EnumC1978c.f8889P1;
        if (m4597a != enumC1978c) {
            return m439g0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m439g0);
        int i7 = 0;
        while (c1976a.m4597a() == enumC1978c) {
            i7 = c1976a.m4605i().f8862a;
            arrayList.add(m439g0(c1976a));
        }
        return new C1889c(i7, arrayList);
    }

    /* renamed from: i */
    public static void m442i(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (i7 < 0 || byteBuffer2.remaining() < i7 || byteBuffer3.remaining() < i7 || byteBuffer.remaining() < i7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: i0 */
    public static AbstractC1840b m443i0(C1976a c1976a) {
        AbstractC1840b m441h0 = m441h0(c1976a);
        while (true) {
            int ordinal = c1976a.m4597a().ordinal();
            if (ordinal != 24 && ordinal != 25) {
                return m441h0;
            }
            m441h0 = C0391d0.m1367n(new C1887a(c1976a.m4605i(), m441h0, m441h0(c1976a)));
        }
    }

    /* renamed from: j */
    public static boolean m444j(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[4048];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                } catch (IOException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: j0 */
    public static AbstractC1840b m445j0(C1976a c1976a) {
        AbstractC1840b m443i0 = m443i0(c1976a);
        while (c1976a.m4597a() == EnumC1978c.f8885L1) {
            m443i0 = C0391d0.m1367n(new C1887a(c1976a.m4605i(), m443i0, m443i0(c1976a)));
        }
        return m443i0;
    }

    /* renamed from: k */
    public static String m446k(boolean z6, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7 & 255);
            if (z6) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append("");
        }
        return sb.toString();
    }

    /* renamed from: k0 */
    public static AbstractC1840b m447k0(C1976a c1976a) {
        AbstractC1840b m445j0 = m445j0(c1976a);
        while (c1976a.m4597a() == EnumC1978c.f8878E1) {
            m445j0 = C0391d0.m1367n(new C1887a(c1976a.m4605i(), m445j0, m445j0(c1976a)));
        }
        return m445j0;
    }

    /* renamed from: l */
    public static boolean m448l(RectF rectF, float f7, float f8, float f9) {
        return f7 >= rectF.left - f9 && f7 <= rectF.right + f9 && f8 >= rectF.top - f9 && f8 <= rectF.bottom + f9;
    }

    /* renamed from: l0 */
    public static AbstractC1840b m449l0(C1976a c1976a) {
        AbstractC1840b m447k0 = m447k0(c1976a);
        while (c1976a.m4597a() == EnumC1978c.f8886M1) {
            m447k0 = C0391d0.m1367n(new C1887a(c1976a.m4605i(), m447k0, m447k0(c1976a)));
        }
        return m447k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0251, code lost:
    
        if (r2.f7735b == r8) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r4.f7735b == r12) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06fa A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7 A[SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m450m(p127q.C1714e r37, p120p.C1683d r38, int r39) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0143v.m450m(q.e, p.d, int):void");
    }

    /* renamed from: m0 */
    public static ArrayList m451m0(C1976a c1976a) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(m432b0(c1976a));
            if (c1976a.m4597a() != EnumC1978c.f8924s) {
                return arrayList;
            }
            c1976a.m4605i();
        }
    }

    /* renamed from: n */
    public static byte[] m452n(int i7, byte[] bArr) {
        int i8 = i7 - 1;
        if (i8 < 0 || 3 <= i8) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(C1109v5.f5492d[i8].getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    /* renamed from: n0 */
    public static C1157b m453n0(JsonReader jsonReader, C0680a c0680a, boolean z6) {
        return new C1157b(C0017d.m70I(z6 ? C1403d.m3756c() : 1.0f, jsonReader, c0680a, f264c));
    }

    /* renamed from: o */
    public static String m454o(int i7, byte[] bArr) {
        byte[] bArr2;
        int i8 = i7 - 1;
        try {
            if (i8 < 0 || 3 <= i8) {
                bArr2 = new byte[0];
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(C1109v5.f5492d[i8].getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(1, secretKeySpec);
                bArr2 = cipher.doFinal(bArr);
            }
            return C0391d0.m1361h(bArr2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: o0 */
    public static C1893g m455o0(C1976a c1976a) {
        int m4602f = c1976a.m4602f();
        c1976a.m4606j(EnumC1978c.f8929w1);
        ArrayList arrayList = new ArrayList();
        int ordinal = c1976a.m4597a().ordinal();
        if (ordinal != 1) {
            if (ordinal != 8) {
                do {
                    arrayList.add(c1976a.m4604h().m4613a());
                    if (c1976a.m4597a() != EnumC1978c.f8924s) {
                        break;
                    }
                    c1976a.m4605i();
                } while (c1976a.m4597a() == EnumC1978c.f8927u2);
                c1976a.m4606j(EnumC1978c.f8908e);
            }
            c1976a.m4606j(EnumC1978c.f8931x1);
            C1839a m71J = C0017d.m71J(c1976a);
            c1976a.m4606j(EnumC1978c.f8910f2);
            int m4602f2 = c1976a.m4602f();
            C1893g c1893g = new C1893g();
            c1893g.f8314a = m4602f;
            c1893g.f8315b = m4602f2;
            c1893g.f8445g = arrayList.remove("...");
            c1893g.f8444f = arrayList;
            c1893g.f8446h = m71J;
            return c1893g;
        }
        c1976a.m4605i();
        arrayList.add("...");
        c1976a.m4606j(EnumC1978c.f8931x1);
        C1839a m71J2 = C0017d.m71J(c1976a);
        c1976a.m4606j(EnumC1978c.f8910f2);
        int m4602f22 = c1976a.m4602f();
        C1893g c1893g2 = new C1893g();
        c1893g2.f8314a = m4602f;
        c1893g2.f8315b = m4602f22;
        c1893g2.f8445g = arrayList.remove("...");
        c1893g2.f8444f = arrayList;
        c1893g2.f8446h = m71J2;
        return c1893g2;
    }

    /* renamed from: p */
    public static void m456p(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: p0 */
    public static C1159d m457p0(JsonReader jsonReader, C0680a c0680a) {
        return new C1159d(0, C0017d.m70I(1.0f, jsonReader, c0680a, C1321c.f6519a));
    }

    /* renamed from: q */
    public static void m458q(int i7) {
        if (i7 > 524287 || i7 < 0) {
            throw new IllegalArgumentException("color id must be positive and bit count is less than 19");
        }
    }

    /* renamed from: q0 */
    public static C1156a m459q0(JsonReader jsonReader, C0680a c0680a) {
        return new C1156a(1, C0017d.m70I(C1403d.m3756c(), jsonReader, c0680a, C1325g.f6524a));
    }

    /* renamed from: r */
    public static int m460r(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
    }

    /* renamed from: r0 */
    public static InterfaceC1162g m461r0(JsonReader jsonReader, C0680a c0680a) {
        jsonReader.beginObject();
        C0572z c0572z = null;
        C1157b c1157b = null;
        C1157b c1157b2 = null;
        boolean z6 = false;
        while (true) {
            int i7 = 1;
            if (jsonReader.peek() == JsonToken.END_OBJECT) {
                jsonReader.endObject();
                if (z6) {
                    c0680a.m2183a("Lottie doesn't support expressions.");
                }
                return c0572z != null ? c0572z : new C0955g(c1157b, i7, c1157b2);
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "k":
                    c0572z = m427Y(jsonReader, c0680a);
                    continue;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c1157b = m453n0(jsonReader, c0680a, true);
                        break;
                    } else {
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c1157b2 = m453n0(jsonReader, c0680a, true);
                        break;
                    } else {
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.skipValue();
            z6 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097 A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m462s(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0143v.m462s(java.lang.String, java.lang.String):int");
    }

    /* renamed from: s0 */
    public static C1901o m463s0(C1976a c1976a) {
        C1901o c1901o = new C1901o();
        c1901o.f8314a = c1976a.m4602f();
        c1976a.m4606j(EnumC1978c.f8870A1);
        EnumC1978c m4597a = c1976a.m4597a();
        EnumC1978c enumC1978c = EnumC1978c.f8872B1;
        if (m4597a != enumC1978c) {
            while (true) {
                EnumC1978c m4597a2 = c1976a.m4597a();
                EnumC1978c enumC1978c2 = EnumC1978c.f8933y1;
                EnumC1978c enumC1978c3 = EnumC1978c.f8874C1;
                ArrayList arrayList = c1901o.f8461g;
                ArrayList arrayList2 = c1901o.f8460f;
                if (m4597a2 == enumC1978c2) {
                    c1976a.m4605i();
                    arrayList2.add(m432b0(c1976a));
                    c1976a.m4606j(EnumC1978c.f8935z1);
                    c1976a.m4606j(enumC1978c3);
                    arrayList.add(m432b0(c1976a));
                } else {
                    AbstractC1840b m432b0 = m432b0(c1976a);
                    if ((m432b0 instanceof C1895i) && c1976a.m4597a() == enumC1978c3) {
                        arrayList2.add(new C1899m(m432b0.f8314a, ((C1895i) m432b0).f8452f));
                        c1976a.m4605i();
                        m432b0 = m432b0(c1976a);
                    } else {
                        arrayList2.add(null);
                    }
                    arrayList.add(m432b0);
                }
                EnumC1978c m4597a3 = c1976a.m4597a();
                if (!(m4597a3 == EnumC1978c.f8924s || m4597a3 == EnumC1978c.f8917m)) {
                    break;
                }
                c1976a.m4605i();
                if (c1976a.m4597a() == enumC1978c) {
                    break;
                }
                C1977b c1977b = c1976a.f8857j;
                if (c1977b != null && c1977b.f8866e) {
                    c1901o.f8311e = c1977b.f8867f;
                }
            }
        }
        c1976a.m4606j(enumC1978c);
        c1901o.f8315b = c1976a.m4602f();
        return c1901o;
    }

    /* renamed from: t */
    public static byte[] m464t(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: t0 */
    public static byte[] m465t0(int i7, InputStream inputStream) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read < 0) {
                throw new IllegalStateException(C0090b.m219e("Not enough bytes to read: ", i7));
            }
            i8 += read;
        }
        return bArr;
    }

    /* renamed from: u */
    public static long m466u(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            char charAt = charSequence.charAt(i9);
            if (!(charAt == '\t' || charAt == ' ')) {
                break;
            }
            if (charAt == '\t') {
                i8++;
            } else {
                i7++;
            }
        }
        return C0017d.m68G(i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m467u0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C0143v.m467u0(java.io.FileInputStream, int, int):byte[]");
    }

    /* renamed from: v */
    public static String m468v(int i7, int i8, boolean z6) {
        int i9;
        int max = Math.max(0, i7);
        if (z6) {
            i9 = max / i8;
            max %= i8;
        } else {
            i9 = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append('\t');
        }
        for (int i11 = 0; i11 < max; i11++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: v0 */
    public static long m469v0(int i7, InputStream inputStream) {
        byte[] m465t0 = m465t0(i7, inputStream);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (m465t0[i8] & 255) << (i8 * 8);
        }
        return j7;
    }

    /* renamed from: w */
    public static long m470w(C0642f c0642f) {
        char[] cArr = c0642f.f3159c;
        int i7 = c0642f.f3160e;
        int i8 = 0;
        while (i8 < i7) {
            char c7 = cArr[i8];
            if (!(c7 == '\t' || c7 == ' ')) {
                break;
            }
            i8++;
        }
        if (i8 != i7) {
            while (i7 > 0) {
                int i9 = i7 - 1;
                char c8 = cArr[i9];
                if (!(c8 == '\t' || c8 == ' ')) {
                    break;
                }
                i7 = i9;
            }
        }
        return C0017d.m68G(i8, i7);
    }

    /* renamed from: w0 */
    public static int m471w0(InputStream inputStream) {
        return (int) m469v0(2, inputStream);
    }

    /* renamed from: x */
    public static final C0651o m472x(C0638b c0638b, C0641e c0641e, boolean z6) {
        C0898f.m2606e(c0638b, "position");
        if (z6) {
            c0638b.f3142c--;
        }
        if (c0638b.f3142c <= 0 && z6) {
            int i7 = c0638b.f3141b;
            if (i7 <= 0) {
                C0638b c0638b2 = new C0638b(0, 0, -1);
                return new C0651o(c0638b2, c0638b2);
            }
            int i8 = i7 - 1;
            C0638b c0638b3 = new C0638b(i8, c0641e.m2146r(i8).f3160e, -1);
            return new C0651o(c0638b3, c0638b3);
        }
        if (c0641e.m2142n(c0638b.f3141b) == c0638b.f3142c && c0638b.f3141b < c0641e.m2147s() - 1 && !z6) {
            C0638b c0638b4 = new C0638b(c0638b.f3141b + 1, 0, -1);
            return new C0651o(c0638b4, c0638b4);
        }
        C0642f m2146r = c0641e.m2146r(c0638b.f3141b);
        C0898f.m2605d(m2146r, "text.getLine(position.line)");
        int i9 = c0638b.f3142c;
        while (true) {
            if ((z6 && i9 < 0) || (!z6 && i9 == m2146r.f3160e)) {
                break;
            }
            char charAt = m2146r.charAt(i9);
            if (!(Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) || (i9 == 0 && z6)) {
                break;
            }
            i9 += z6 ? -1 : 1;
        }
        return m408F(c0641e, c0638b.f3141b, i9, false);
    }

    /* renamed from: y */
    public static ArrayList m473y(C1976a c1976a, String str) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(str);
            if (c1976a.m4597a() != EnumC1978c.f8924s) {
                return arrayList;
            }
            c1976a.m4605i();
            str = c1976a.m4604h().m4613a();
        }
    }

    /* renamed from: y0 */
    public static boolean m474y0(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        if (charSequence.length() < charSequence2.length()) {
            return false;
        }
        int length = charSequence2.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            char charAt2 = charSequence2.charAt(i7);
            if (charAt != charAt2 && (!z6 || Character.toLowerCase(charAt) != Character.toLowerCase(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    public static final int m475z(InterfaceC0053c interfaceC0053c, C1510a c1510a) {
        C0898f.m2606e(c1510a, "colorScheme");
        interfaceC0053c.mo164g();
        return c1510a.m3927c(interfaceC0053c.mo160c());
    }

    /* renamed from: z0 */
    public static final void m476z0(String str) {
        C0898f.m2606e(str, "message");
        throw new IllegalArgumentException(str);
    }

    @Override // p067i1.InterfaceC1328j
    /* renamed from: c */
    public Object mo105c(JsonReader jsonReader, float f7) {
        return Float.valueOf(C1322d.m3685d(jsonReader) * f7);
    }

    @Override // p084k2.InterfaceC1451a
    public void clear() {
    }

    @Override // p111n5.InterfaceC1647c
    /* renamed from: d */
    public String[] mo106d() {
        return new String[]{"TM_CURRENT_LINE", "TM_LINE_INDEX", "TM_LINE_NUMBER", "CURSOR_INDEX", "CURSOR_NUMBER", "TM_CURRENT_WORD", "SELECTION", "TM_SELECTED_TEXT"};
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public Object mo107e() {
        return new TreeSet();
    }

    /* renamed from: x0 */
    public void m477x0(InterfaceC1443a interfaceC1443a, float f7) {
        float f8;
        CardView.C0279a c0279a = (CardView.C0279a) interfaceC1443a;
        C1444b c1444b = (C1444b) c0279a.f1167a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f7 != c1444b.f6936e || c1444b.f6937f != useCompatPadding || c1444b.f6938g != preventCornerOverlap) {
            c1444b.f6936e = f7;
            c1444b.f6937f = useCompatPadding;
            c1444b.f6938g = preventCornerOverlap;
            c1444b.m3828c(null);
            c1444b.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0279a.m931a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c0279a.f1167a;
        float f9 = ((C1444b) drawable).f6936e;
        float f10 = ((C1444b) drawable).f6932a;
        if (cardView.getPreventCornerOverlap()) {
            f8 = (float) (((1.0d - C1445c.f6943a) * f10) + f9);
        } else {
            int i7 = C1445c.f6944b;
            f8 = f9;
        }
        int ceil = (int) Math.ceil(f8);
        int ceil2 = (int) Math.ceil(C1445c.m3829a(f9, f10, cardView.getPreventCornerOverlap()));
        c0279a.m931a(ceil, ceil2, ceil, ceil2);
    }

    public /* synthetic */ C0143v(int i7) {
    }
}
