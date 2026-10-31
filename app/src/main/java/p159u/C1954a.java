package p159u;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.ext.C0090b;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p001a0.C0002a;
import p166v.C2009a;

/* renamed from: u.a */
/* loaded from: classes.dex */
public final class C1954a extends C2009a {

    /* renamed from: b */
    public static final /* synthetic */ int f8792b = 0;

    /* renamed from: u.a$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String[] f8793c;

        /* renamed from: e */
        public final /* synthetic */ Activity f8794e;

        /* renamed from: m */
        public final /* synthetic */ int f8795m;

        public a(Activity activity, String[] strArr, int i7) {
            this.f8793c = strArr;
            this.f8794e = activity;
            this.f8795m = i7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            String[] strArr = this.f8793c;
            int[] iArr = new int[strArr.length];
            Activity activity = this.f8794e;
            PackageManager packageManager = activity.getPackageManager();
            String packageName = activity.getPackageName();
            int length = strArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = packageManager.checkPermission(strArr[i7], packageName);
            }
            ((d) activity).onRequestPermissionsResult(this.f8795m, strArr, iArr);
        }
    }

    /* renamed from: u.a$b */
    public static class b {
        /* renamed from: a */
        public static void m4560a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m4561b(Activity activity, Intent intent, int i7, Bundle bundle) {
            activity.startActivityForResult(intent, i7, bundle);
        }

        /* renamed from: c */
        public static void m4562c(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
        }
    }

    /* renamed from: u.a$c */
    public static class c {
        /* renamed from: a */
        public static void m4563a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m4564b(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }

        /* renamed from: c */
        public static boolean m4565c(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    /* renamed from: u.a$d */
    public interface d {
        void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr);
    }

    /* renamed from: u.a$e */
    public interface e {
        /* renamed from: g */
        void mo1249g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m4559d(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException(C0090b.m220f(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (!C0002a.m1a() && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof e) {
                ((e) activity).mo1249g();
            }
            c.m4564b(activity, strArr, i7);
        } else if (activity instanceof d) {
            new Handler(Looper.getMainLooper()).post(new a(activity, strArr2, i7));
        }
    }
}
