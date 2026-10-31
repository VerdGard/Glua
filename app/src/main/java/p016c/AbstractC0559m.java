package p016c;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.ext.Tools;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import p001a0.C0006e;
import p016c.C0571y;
import p016c.ServiceC0569w;
import p049g.AbstractC1183a;
import p089l.C1468b;

/* renamed from: c.m */
/* loaded from: classes.dex */
public abstract class AbstractC0559m {

    /* renamed from: c */
    public static final C0571y.a f2798c = new C0571y.a(new C0571y.b());

    /* renamed from: e */
    public static final int f2799e = -100;

    /* renamed from: m */
    public static C0006e f2800m = null;

    /* renamed from: s */
    public static C0006e f2801s = null;

    /* renamed from: X */
    public static Boolean f2795X = null;

    /* renamed from: Y */
    public static boolean f2796Y = false;

    /* renamed from: Z */
    public static final C1468b<WeakReference<AbstractC0559m>> f2797Z = new C1468b<>();

    /* renamed from: w1 */
    public static final Object f2802w1 = new Object();

    /* renamed from: x1 */
    public static final Object f2803x1 = new Object();

    /* renamed from: c.m$a */
    public static class a {
        /* renamed from: a */
        public static LocaleList m1934a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    /* renamed from: c.m$b */
    public static class b {
        /* renamed from: a */
        public static LocaleList m1935a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        public static void m1936b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: l */
    public static boolean m1909l(Context context) {
        if (f2795X == null) {
            try {
                int i7 = ServiceC0569w.f2917c;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0569w.class), Build.VERSION.SDK_INT >= 24 ? ServiceC0569w.a.m1990a() | Tools.Semaphore.f159S7 : 640).metaData;
                if (bundle != null) {
                    f2795X = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2795X = Boolean.FALSE;
            }
        }
        return f2795X.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static void m1910s(AbstractC0559m abstractC0559m) {
        synchronized (f2802w1) {
            C1468b<WeakReference<AbstractC0559m>> c1468b = f2797Z;
            c1468b.getClass();
            C1468b.a aVar = new C1468b.a();
            while (aVar.hasNext()) {
                AbstractC0559m abstractC0559m2 = (AbstractC0559m) ((WeakReference) aVar.next()).get();
                if (abstractC0559m2 == abstractC0559m || abstractC0559m2 == null) {
                    aVar.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract AbstractC1183a mo1911A(AbstractC1183a.a aVar);

    /* renamed from: c */
    public abstract void mo1912c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public Context mo1913d(Context context) {
        return context;
    }

    /* renamed from: e */
    public abstract <T extends View> T mo1914e(int i7);

    /* renamed from: f */
    public Context mo1915f() {
        return null;
    }

    /* renamed from: g */
    public int mo1916g() {
        return -100;
    }

    /* renamed from: h */
    public abstract MenuInflater mo1917h();

    /* renamed from: i */
    public abstract AbstractC0542a mo1918i();

    /* renamed from: j */
    public abstract void mo1919j();

    /* renamed from: k */
    public abstract void mo1920k();

    /* renamed from: m */
    public abstract void mo1921m(Configuration configuration);

    /* renamed from: n */
    public abstract void mo1922n();

    /* renamed from: o */
    public abstract void mo1923o();

    /* renamed from: p */
    public abstract void mo1924p();

    /* renamed from: q */
    public abstract void mo1925q();

    /* renamed from: r */
    public abstract void mo1926r();

    /* renamed from: t */
    public abstract boolean mo1927t(int i7);

    /* renamed from: u */
    public abstract void mo1928u(int i7);

    /* renamed from: v */
    public abstract void mo1929v(View view);

    /* renamed from: w */
    public abstract void mo1930w(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: x */
    public abstract void mo1931x(Toolbar toolbar);

    /* renamed from: y */
    public void mo1932y(int i7) {
    }

    /* renamed from: z */
    public abstract void mo1933z(CharSequence charSequence);
}
