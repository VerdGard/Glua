package android.ext;

import android.view.MotionEvent;
import p006a5.InterfaceC0053c;
import p014b5.C0540a;
import p022c5.C0638b;
import p022c5.C0651o;
import p023c6.InterfaceC0666l;
import p023c6.InterfaceC0670p;
import p023c6.InterfaceC0673s;
import p055g5.C1245b;
import p132q4.C1776e;
import p132q4.C1781j;

/* renamed from: android.ext.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0091c implements InterfaceC0670p, InterfaceC0673s, InterfaceC0666l {
    /* renamed from: d */
    public static /* synthetic */ boolean m226d(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        if (i7 == 5) {
            return true;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            return false;
        }
        throw null;
    }

    /* renamed from: e */
    public static float m227e(float f7, float f8, float f9, float f10) {
        return ((f7 - f8) * f9) + f10;
    }

    /* renamed from: f */
    public static String m228f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: g */
    public static /* synthetic */ void m229g(int i7, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m230h(Object obj, int i7, int i8, int i9) {
        throw null;
    }

    /* renamed from: i */
    public static /* synthetic */ String m231i(int i7) {
        if (i7 == 1) {
            return "GET";
        }
        if (i7 == 2) {
            return "POST";
        }
        if (i7 == 3) {
            return "PUT";
        }
        if (i7 == 4) {
            return "DELETE";
        }
        if (i7 == 5) {
            return "PATCH";
        }
        if (i7 == 6) {
            return "HEAD";
        }
        if (i7 == 7) {
            return "OPTIONS";
        }
        if (i7 == 8) {
            return "TRACE";
        }
        throw null;
    }

    /* renamed from: j */
    public static /* synthetic */ String m232j(int i7) {
        return i7 == 1 ? "NONE" : i7 == 2 ? "ADDING" : i7 == 3 ? "REMOVING" : "null";
    }

    /* renamed from: k */
    public static /* synthetic */ String m233k(int i7) {
        return i7 == 1 ? "Merge" : i7 == 2 ? "Add" : i7 == 3 ? "Subtract" : i7 == 4 ? "Intersect" : i7 == 5 ? "ExcludeIntersections" : "null";
    }

    /* renamed from: l */
    public static /* synthetic */ String m234l(int i7) {
        return i7 == 1 ? "PreComp" : i7 == 2 ? "Solid" : i7 == 3 ? "Image" : i7 == 4 ? "Null" : i7 == 5 ? "Shape" : i7 == 6 ? "Text" : i7 == 7 ? "Unknown" : "null";
    }

    /* renamed from: m */
    public static /* synthetic */ String m235m(int i7) {
        return i7 == 1 ? "GET" : i7 == 2 ? "POST" : i7 == 3 ? "PUT" : i7 == 4 ? "DELETE" : i7 == 5 ? "PATCH" : i7 == 6 ? "HEAD" : i7 == 7 ? "OPTIONS" : i7 == 8 ? "TRACE" : "null";
    }

    /* renamed from: n */
    public static /* synthetic */ int m236n(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("POST")) {
            return 2;
        }
        if (str.equals("PUT")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("PATCH")) {
            return 5;
        }
        if (str.equals("HEAD")) {
            return 6;
        }
        if (str.equals("OPTIONS")) {
            return 7;
        }
        if (str.equals("TRACE")) {
            return 8;
        }
        throw new IllegalArgumentException("No enum constant org.jsoup.Connection.Method.".concat(str));
    }

    @Override // p023c6.InterfaceC0673s
    /* renamed from: a */
    public Object mo215a(C1245b c1245b, C0638b c0638b, Object obj, InterfaceC0053c interfaceC0053c, C0651o c0651o) {
        return new C1776e(c1245b, c0638b, (MotionEvent) obj, interfaceC0053c);
    }

    @Override // p023c6.InterfaceC0670p
    /* renamed from: b */
    public Object mo237b(Object obj, Object obj2) {
        return new C0540a(((Long) obj2).longValue(), ((Integer) obj).intValue());
    }

    @Override // p023c6.InterfaceC0666l
    /* renamed from: c */
    public Object mo216c(Object obj) {
        ((C1781j) obj).getClass();
        return Boolean.FALSE;
    }
}
