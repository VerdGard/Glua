package p176w2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.ext.Tools;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public final class C2119b {

    /* renamed from: a */
    public final Context f9586a;

    public C2119b(Context context) {
        this.f9586a = context;
    }

    /* renamed from: b */
    public static InterfaceC2118a m5166b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof InterfaceC2118a) {
                    return (InterfaceC2118a) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e9);
        }
    }

    /* renamed from: a */
    public final ArrayList m5167a() {
        Context context = this.f9586a;
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), Tools.Semaphore.f159S7);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(m5166b(str));
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e7);
        }
    }
}
