package p018c1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p036e2.C1086s3;
import p051g1.C1197f;

/* renamed from: c1.g */
/* loaded from: classes.dex */
public final class C0586g {

    /* renamed from: a */
    public Serializable f2961a;

    /* renamed from: b */
    public Serializable f2962b;

    /* renamed from: c */
    public Object f2963c;

    public /* synthetic */ C0586g() {
    }

    public C0586g(List list) {
        this.f2963c = list;
        this.f2961a = new ArrayList(list.size());
        this.f2962b = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((List) this.f2961a).add(((C1197f) list.get(i7)).f5877b.mo1994a());
            ((List) this.f2962b).add(((C1197f) list.get(i7)).f5878c.mo1994a());
        }
    }

    /* renamed from: a */
    public final int m2035a(Context context) {
        boolean z6;
        PackageManager packageManager;
        List<ResolveInfo> list;
        if (!TextUtils.isEmpty((String) this.f2961a)) {
            return 2;
        }
        String packageName = context != null ? context.getPackageName() : "";
        if (!TextUtils.isEmpty((String) this.f2963c) && !((String) this.f2963c).equals(packageName)) {
            String m3192c = C1086s3.m3192c(context);
            if (TextUtils.isEmpty(m3192c)) {
                String str = (String) this.f2963c;
                if (context != null && !TextUtils.isEmpty(str) && (packageManager = context.getPackageManager()) != null) {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    try {
                        list = packageManager.queryIntentActivities(intent, 65536);
                    } catch (Exception unused) {
                        list = null;
                    }
                    if (list != null) {
                        Iterator<ResolveInfo> it = list.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            if (activityInfo != null && str.equals(activityInfo.packageName)) {
                                z6 = true;
                                break;
                            }
                        }
                    }
                }
                z6 = false;
                if (!z6) {
                    return 1;
                }
            } else if (!((String) this.f2963c).equals(m3192c)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final String m2036b() {
        return !TextUtils.isEmpty((String) this.f2963c) ? (String) this.f2963c : "";
    }
}
