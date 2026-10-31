package p104m6;

import java.io.Serializable;
import java.util.HashMap;
import p096l6.AbstractC1517d;
import p096l6.C1520f;
import p096l6.C1522h;
import p096l6.C1527m;
import p096l6.C1528n;
import p096l6.C1529o;
import p096l6.C1531q;

/* renamed from: m6.s */
/* loaded from: classes.dex */
public final class C1610s implements Serializable {

    /* renamed from: c */
    public int f7408c = 1024;

    /* renamed from: e */
    public AbstractC1517d[] f7409e = new AbstractC1517d[1024];

    /* renamed from: m */
    public int f7410m = 1;

    /* renamed from: s */
    public final HashMap f7411s = new HashMap();

    /* renamed from: X */
    public final HashMap f7405X = new HashMap();

    /* renamed from: Y */
    public final HashMap f7406Y = new HashMap();

    /* renamed from: Z */
    public final HashMap f7407Z = new HashMap();

    /* renamed from: w1 */
    public final HashMap f7412w1 = new HashMap();

    /* renamed from: m6.s$a */
    public static class a implements Serializable {

        /* renamed from: c */
        public final int f7413c;

        public a(int i7) {
            this.f7413c = i7;
        }
    }

    /* renamed from: a */
    public final int m3985a(String str) {
        String replace = str.replace('.', '/');
        HashMap hashMap = this.f7405X;
        a aVar = (a) hashMap.get(replace.replace('.', '/'));
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 != -1) {
            return i7;
        }
        m3990f();
        C1520f c1520f = new C1520f(m3989e(replace));
        int i8 = this.f7410m;
        AbstractC1517d[] abstractC1517dArr = this.f7409e;
        this.f7410m = i8 + 1;
        abstractC1517dArr[i8] = c1520f;
        if (!hashMap.containsKey(replace)) {
            hashMap.put(replace, new a(i8));
        }
        return i8;
    }

    /* renamed from: b */
    public final int m3986b(String str, String str2, String str3) {
        HashMap hashMap = this.f7412w1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("&");
        stringBuffer.append(str2);
        stringBuffer.append("&");
        stringBuffer.append(str3);
        a aVar = (a) hashMap.get(stringBuffer.toString());
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 != -1) {
            return i7;
        }
        m3990f();
        int m3985a = m3985a(str);
        int m3988d = m3988d(str2, str3);
        int i8 = this.f7410m;
        AbstractC1517d[] abstractC1517dArr = this.f7409e;
        this.f7410m = i8 + 1;
        abstractC1517dArr[i8] = new C1522h(m3985a, m3988d);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append("&");
        stringBuffer2.append(str2);
        stringBuffer2.append("&");
        stringBuffer2.append(str3);
        String stringBuffer3 = stringBuffer2.toString();
        if (!hashMap.containsKey(stringBuffer3)) {
            hashMap.put(stringBuffer3, new a(i8));
        }
        return i8;
    }

    /* renamed from: c */
    public final int m3987c(String str, String str2, String str3) {
        HashMap hashMap = this.f7412w1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        a aVar = (a) hashMap.get(stringBuffer.toString());
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 != -1) {
            return i7;
        }
        m3990f();
        int m3988d = m3988d(str2, str3);
        int m3985a = m3985a(str);
        int i8 = this.f7410m;
        AbstractC1517d[] abstractC1517dArr = this.f7409e;
        this.f7410m = i8 + 1;
        abstractC1517dArr[i8] = new C1527m(m3985a, m3988d);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append(":");
        stringBuffer2.append(str2);
        stringBuffer2.append(":");
        stringBuffer2.append(str3);
        String stringBuffer3 = stringBuffer2.toString();
        if (!hashMap.containsKey(stringBuffer3)) {
            hashMap.put(stringBuffer3, new a(i8));
        }
        return i8;
    }

    /* renamed from: d */
    public final int m3988d(String str, String str2) {
        HashMap hashMap = this.f7407Z;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("%");
        stringBuffer.append(str2);
        a aVar = (a) hashMap.get(stringBuffer.toString());
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 != -1) {
            return i7;
        }
        m3990f();
        int m3989e = m3989e(str);
        int m3989e2 = m3989e(str2);
        int i8 = this.f7410m;
        AbstractC1517d[] abstractC1517dArr = this.f7409e;
        this.f7410m = i8 + 1;
        abstractC1517dArr[i8] = new C1528n(m3989e, m3989e2);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append("%");
        stringBuffer2.append(str2);
        String stringBuffer3 = stringBuffer2.toString();
        if (!hashMap.containsKey(stringBuffer3)) {
            hashMap.put(stringBuffer3, new a(i8));
        }
        return i8;
    }

    /* renamed from: e */
    public final int m3989e(String str) {
        HashMap hashMap = this.f7406Y;
        a aVar = (a) hashMap.get(str);
        int i7 = aVar != null ? aVar.f7413c : -1;
        if (i7 != -1) {
            return i7;
        }
        m3990f();
        int i8 = this.f7410m;
        AbstractC1517d[] abstractC1517dArr = this.f7409e;
        this.f7410m = i8 + 1;
        abstractC1517dArr[i8] = new C1531q(str);
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new a(i8));
        }
        return i8;
    }

    /* renamed from: f */
    public final void m3990f() {
        int i7 = this.f7410m;
        int i8 = i7 + 3;
        int i9 = this.f7408c;
        if (i8 >= i9) {
            AbstractC1517d[] abstractC1517dArr = this.f7409e;
            int i10 = i9 * 2;
            this.f7408c = i10;
            AbstractC1517d[] abstractC1517dArr2 = new AbstractC1517d[i10];
            this.f7409e = abstractC1517dArr2;
            System.arraycopy(abstractC1517dArr, 0, abstractC1517dArr2, 0, i7);
        }
    }

    /* renamed from: g */
    public final C1529o m3991g() {
        return new C1529o(this.f7409e);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 1; i7 < this.f7410m; i7++) {
            stringBuffer.append(i7);
            stringBuffer.append(")");
            stringBuffer.append(this.f7409e[i7]);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
