package android.ext;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0378x;
import p006a5.InterfaceC0053c;
import p022c5.C0638b;
import p022c5.C0651o;
import p023c6.InterfaceC0666l;
import p023c6.InterfaceC0673s;
import p055g5.C1245b;
import p132q4.C1772b;
import p132q4.C1780i;

/* renamed from: android.ext.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0089a implements InterfaceC0666l, InterfaceC0673s {
    /* renamed from: b */
    public static final void m205b(int i7, View view) {
        int i8;
        if (i7 == 0) {
            throw null;
        }
        int i9 = i7 - 1;
        if (i9 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (AbstractC0378x.m1285I(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i9 == 1) {
            if (AbstractC0378x.m1285I(2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            i8 = 0;
        } else if (i9 == 2) {
            if (AbstractC0378x.m1285I(2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i8 = 8;
        } else {
            if (i9 != 3) {
                return;
            }
            if (AbstractC0378x.m1285I(2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i8 = 4;
        }
        view.setVisibility(i8);
    }

    /* renamed from: d */
    public static int m206d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 4) {
            return 4;
        }
        if (i7 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(C0090b.m219e("Unknown visibility ", i7));
    }

    /* renamed from: e */
    public static int m207e(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m206d(view.getVisibility());
    }

    /* renamed from: f */
    public static String m208f(String str, String str2) {
        return str + str2;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m209g(int i7, int i8, Class cls) {
        throw null;
    }

    /* renamed from: h */
    public static String m210h(String str, String str2) {
        return str + str2;
    }

    /* renamed from: i */
    public static /* synthetic */ String m211i(int i7) {
        if (i7 == 1) {
            return "CONTINUOUS";
        }
        if (i7 == 2) {
            return "TEXT";
        }
        if (i7 == 3) {
            return "BINARY";
        }
        if (i7 == 4) {
            return "PING";
        }
        if (i7 == 5) {
            return "PONG";
        }
        if (i7 == 6) {
            return "CLOSING";
        }
        throw null;
    }

    /* renamed from: j */
    public static /* synthetic */ String m212j(int i7) {
        return i7 == 1 ? "REMOVED" : i7 == 2 ? "VISIBLE" : i7 == 3 ? "GONE" : i7 == 4 ? "INVISIBLE" : "null";
    }

    /* renamed from: k */
    public static /* synthetic */ String m213k(int i7) {
        return i7 == 1 ? "CONTINUOUS" : i7 == 2 ? "TEXT" : i7 == 3 ? "BINARY" : i7 == 4 ? "PING" : i7 == 5 ? "PONG" : i7 == 6 ? "CLOSING" : "null";
    }

    /* renamed from: l */
    public static /* synthetic */ String m214l(int i7) {
        return i7 == 1 ? "Doctype" : i7 == 2 ? "StartTag" : i7 == 3 ? "EndTag" : i7 == 4 ? "Comment" : i7 == 5 ? "Character" : i7 == 6 ? "EOF" : "null";
    }

    @Override // p023c6.InterfaceC0673s
    /* renamed from: a */
    public Object mo215a(C1245b c1245b, C0638b c0638b, Object obj, InterfaceC0053c interfaceC0053c, C0651o c0651o) {
        return new C1772b(c1245b, c0638b, (MotionEvent) obj, interfaceC0053c);
    }

    @Override // p023c6.InterfaceC0666l
    /* renamed from: c */
    public Object mo216c(Object obj) {
        return Boolean.valueOf(!((C1780i) obj).f8137c);
    }
}
