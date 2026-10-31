package android.ext;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.ext.ProcessList;
import androidx.lifecycle.C0391d0;
import java.util.Iterator;
import java.util.List;
import p175w1.C2101m0;

/* loaded from: classes.dex */
public class AppDetector {
    private ProcessList.ProcessInfo processInfo;
    volatile boolean appSelectByUser = false;
    volatile Runnable callback = null;
    private volatile boolean inDetectApp = false;
    private boolean force = false;
    private String prefferedPkg = null;

    public AppDetector(ActivityManager activityManager, PackageManager packageManager) {
        new ProcessList(activityManager, packageManager);
    }

    private static void staticPost() {
        C2101m0.f9540a[0].post(new Runnable() { // from class: android.ext.AppDetector.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public boolean checkAppSelect(boolean z6, Runnable runnable) {
        this.callback = null;
        if (this.appSelectByUser) {
            if (z6) {
                detectApp(false);
            }
            return true;
        }
        detectApp(true);
        this.callback = runnable;
        return false;
    }

    public void detectApp(boolean z6) {
        detectApp(z6, null);
    }

    public void detectApp(boolean z6, String str) {
        if (this.inDetectApp) {
            return;
        }
        this.inDetectApp = true;
        this.force = z6;
        this.prefferedPkg = str;
        if (z6) {
            C0391d0.m1370q("0", false);
        }
        staticPost();
    }

    public void detectAppResume(List<ProcessList.ProcessInfo> list) {
        boolean z6;
        byte b7;
        if (this.inDetectApp) {
            try {
                if (list.size() == 0) {
                    android.util.Log.w("", "listProcesses empty");
                    if (this.force || this.processInfo == null) {
                        C0391d0.m1370q("进程", true);
                    }
                } else {
                    if (this.processInfo != null) {
                        Iterator<ProcessList.ProcessInfo> it = list.iterator();
                        while (it.hasNext()) {
                            if (it.next().pid == this.processInfo.pid) {
                                z6 = true;
                                break;
                            }
                        }
                    }
                    z6 = false;
                    if (this.prefferedPkg != null) {
                        boolean z7 = false;
                        for (ProcessList.ProcessInfo processInfo : list) {
                            if (processInfo.packageName.equals(this.prefferedPkg)) {
                                setAppInfo(processInfo);
                                z6 = true;
                                z7 = true;
                            }
                        }
                        if (z7) {
                            this.force = false;
                        }
                    }
                    if (!z6) {
                        setAppInfo(list.get(0));
                    }
                    if (Config.vSpace && Config.vSpace64 == 0) {
                        if (list.get(0).x64 && Config.vSpacePkg.contains("64")) {
                            b7 = 1;
                            Config.vSpace64 = b7;
                        }
                        b7 = 2;
                        Config.vSpace64 = b7;
                    }
                    if (this.force) {
                        list.size();
                        ProcessList.AppInfo appInfo = new ProcessList.AppInfo(1, "stub");
                        appInfo.name = "名字";
                        appInfo.isStub = true;
                        ProcessList.ProcessInfo processInfo2 = new ProcessList.ProcessInfo(appInfo, 1, 1, "stub", 0, false, 0);
                        processInfo2.icon = Tools.getDrawable(2130837551);
                        list.add(processInfo2);
                    }
                }
            } finally {
                this.inDetectApp = false;
            }
        }
    }

    public boolean isAppSelectByUser() {
        return this.appSelectByUser;
    }

    public void setAppInfo(ProcessList.ProcessInfo processInfo) {
        processInfo.loadIcon();
        processInfo.resolveLibs();
        this.processInfo = processInfo;
        android.util.Log.i("used: ", processInfo.dump());
    }

    public void setAppSelectByAuto() {
        this.appSelectByUser = false;
    }
}
