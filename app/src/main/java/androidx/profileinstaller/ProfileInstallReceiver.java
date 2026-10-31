package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.C0422c;
import java.io.File;
import p144s0.ExecutorC1867c;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C0416a implements C0422c.c {
        public C0416a() {
        }

        @Override // androidx.profileinstaller.C0422c.c
        /* renamed from: a */
        public final void mo1412a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.C0422c.c
        /* renamed from: b */
        public final void mo1413b(int i7, Object obj) {
            C0422c.f2040b.mo1413b(i7, obj);
            ProfileInstallReceiver.this.setResultCode(i7);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        int i7;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C0422c.m1420b(context, new ExecutorC1867c(0), new C0416a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        C0416a c0416a = new C0416a();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        c0416a.mo1413b(11, null);
                        return;
                    }
                    return;
                }
                C0416a c0416a2 = new C0416a();
                try {
                    C0422c.m1419a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0416a2.mo1413b(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e7) {
                    c0416a2.mo1413b(7, e7);
                    return;
                }
            }
            return;
        }
        boolean equals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
        C0422c.b bVar = C0422c.f2040b;
        if (equals) {
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                i7 = 12;
            } else {
                i7 = 13;
            }
            bVar.mo1413b(i7, null);
            setResultCode(i7);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
            bVar.mo1413b(16, null);
            setResultCode(16);
            return;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        } else {
            codeCacheDir = i8 >= 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        int i9 = C0420a.m1416a(codeCacheDir) ? 14 : 15;
        bVar.mo1413b(i9, null);
        setResultCode(i9);
    }
}
