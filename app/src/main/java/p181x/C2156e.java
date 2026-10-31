package p181x;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.C0391d0;
import java.lang.reflect.Method;
import p089l.C1475i;
import p173w.C2044f;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class C2156e {

    /* renamed from: a */
    public static final C2163l f9771a;

    /* renamed from: b */
    public static final C1475i<String, Typeface> f9772b;

    /* renamed from: x.e$a */
    public static class a extends C0391d0 {

        /* renamed from: q */
        public final C2044f.e f9773q;

        public a(C2044f.e eVar) {
            this.f9773q = eVar;
        }
    }

    static {
        C2163l c2157f;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            c2157f = new C2161j();
        } else if (i7 >= 28) {
            c2157f = new C2160i();
        } else if (i7 >= 26) {
            c2157f = new C2159h();
        } else {
            if (i7 >= 24) {
                Method method = C2158g.f9781c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    c2157f = new C2158g();
                }
            }
            c2157f = new C2157f();
        }
        f9771a = c2157f;
        f9772b = new C1475i<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0.equals(r4) == false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m5280a(android.content.Context r7, p173w.C2042d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, p173w.C2044f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p181x.C2156e.m5280a(android.content.Context, w.d$b, android.content.res.Resources, int, java.lang.String, int, int, w.f$e, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m5281b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
