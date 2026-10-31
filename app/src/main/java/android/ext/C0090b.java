package android.ext;

import android.view.MotionEvent;
import com.google.android.material.textfield.TextInputLayout;
import p006a5.InterfaceC0053c;
import p022c5.C0638b;
import p022c5.C0651o;
import p023c6.InterfaceC0666l;
import p023c6.InterfaceC0673s;
import p055g5.C1245b;
import p120p.C1686g;
import p132q4.C1778g;
import p132q4.C1797z;

/* renamed from: android.ext.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0090b implements TextInputLayout.InterfaceC0851f, InterfaceC0673s, InterfaceC0666l {
    public static int[] _values() {
        return C1686g.m4109d(92);
    }

    /* renamed from: b */
    public static /* synthetic */ long m217b(int i7) {
        if (i7 == 1) {
            return 0L;
        }
        if (i7 == 2) {
            return 1L;
        }
        if (i7 == 3) {
            return 2L;
        }
        if (i7 == 4) {
            return 3L;
        }
        if (i7 == 5) {
            return 4L;
        }
        throw null;
    }

    /* renamed from: d */
    public static /* synthetic */ int m218d(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        throw null;
    }

    /* renamed from: e */
    public static String m219e(String str, int i7) {
        return str + i7;
    }

    /* renamed from: f */
    public static String m220f(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public static StringBuilder m221g(String str, int i7, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    /* renamed from: h */
    public static StringBuilder m222h(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ void m223i(Object obj) {
        throw null;
    }

    /* renamed from: j */
    public static /* synthetic */ String m224j(int i7) {
        return i7 == 1 ? "BEGIN_ARRAY" : i7 == 2 ? "END_ARRAY" : i7 == 3 ? "BEGIN_OBJECT" : i7 == 4 ? "END_OBJECT" : i7 == 5 ? "NAME" : i7 == 6 ? "STRING" : i7 == 7 ? "NUMBER" : i7 == 8 ? "BOOLEAN" : i7 == 9 ? "NULL" : i7 == 10 ? "END_DOCUMENT" : "null";
    }

    /* renamed from: k */
    public static /* synthetic */ String m225k(int i7) {
        return i7 == 1 ? "UNKNOWN" : i7 == 2 ? "HORIZONTAL_DIMENSION" : i7 == 3 ? "VERTICAL_DIMENSION" : i7 == 4 ? "LEFT" : i7 == 5 ? "RIGHT" : i7 == 6 ? "TOP" : i7 == 7 ? "BOTTOM" : i7 == 8 ? "BASELINE" : "null";
    }

    @Override // p023c6.InterfaceC0673s
    /* renamed from: a */
    public Object mo215a(C1245b c1245b, C0638b c0638b, Object obj, InterfaceC0053c interfaceC0053c, C0651o c0651o) {
        return new C1778g(c1245b, c0638b, (MotionEvent) obj, interfaceC0053c);
    }

    @Override // p023c6.InterfaceC0666l
    /* renamed from: c */
    public Object mo216c(Object obj) {
        return Boolean.valueOf(((C1797z) obj).f8168c == 2);
    }
}
