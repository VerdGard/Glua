package p006a5;

import android.util.Log;
import p022c5.C0638b;
import p156t4.AbstractC1927b;
import p156t4.AbstractC1927b.b.c;

/* renamed from: a5.g */
/* loaded from: classes.dex */
public final class C0057g {
    /* renamed from: a */
    public static boolean m168a(C0056f c0056f, C0638b c0638b) {
        InterfaceC0053c m169b = m169b(c0056f, c0638b, 0);
        if (m169b != null) {
            if (!((m169b.mo163f() & 2199023255552L) != 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static InterfaceC0053c m169b(C0056f c0056f, C0638b c0638b, int i7) {
        InterfaceC0055e interfaceC0055e;
        int i8 = c0638b.f3141b;
        int i9 = c0638b.f3142c;
        if (c0056f != null && (interfaceC0055e = c0056f.f144a) != null) {
            AbstractC1927b.b.c cVar = ((AbstractC1927b.b) interfaceC0055e).new c();
            try {
                cVar.mo155a(i8);
                int mo157c = cVar.mo157c() - 1;
                if (mo157c == -1) {
                    try {
                        cVar.mo155a(-1);
                    } catch (Exception e7) {
                        Log.e("StylesUtils", "failed to close " + cVar, e7);
                    }
                    return null;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= cVar.mo157c()) {
                        break;
                    }
                    if (cVar.mo156b(i10).mo166i() > i9) {
                        mo157c = i10 - 1;
                        break;
                    }
                    i10++;
                }
                int i11 = mo157c + i7;
                if (i11 >= 0 && i11 < cVar.mo157c()) {
                    InterfaceC0053c mo156b = cVar.mo156b(i11);
                    try {
                        cVar.mo155a(-1);
                    } catch (Exception e8) {
                        Log.e("StylesUtils", "failed to close " + cVar, e8);
                    }
                    return mo156b;
                }
                try {
                    cVar.mo155a(-1);
                } catch (Exception e9) {
                    Log.e("StylesUtils", "failed to close " + cVar, e9);
                }
                return null;
            } catch (Exception e10) {
                try {
                    cVar.mo155a(-1);
                } catch (Exception e11) {
                    e10.addSuppressed(e11);
                }
                Log.e("StylesUtils", "failed to get spans from " + cVar + " at " + c0638b, e10);
            } catch (Throwable th) {
                try {
                    cVar.mo155a(-1);
                } catch (Exception e12) {
                    Log.e("StylesUtils", "failed to close " + cVar, e12);
                }
                throw th;
            }
        }
        return null;
    }
}
