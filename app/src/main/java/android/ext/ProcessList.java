package android.ext;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.lifecycle.C0391d0;
import com.so.revelation.lua.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p175w1.C2101m0;

@SuppressLint({"LongLogTag"})
/* loaded from: classes.dex */
public class ProcessList {
    private static final int BUGGED_UID = -1;
    private static final int WEIGHT_STEP = 1000;
    private static final Map<String, AppInfo> appCache = new HashMap();
    private static final SparseIntArray buggedUids = new SparseIntArray();
    private static ProcessList lastInstance;
    static PackageManager mPackageManager;
    static HashMap<String, Integer> realUids;
    static final SparseIntArray tracers;
    private ActivityManager mActivityManager;

    public static class AppInfo {
        public String name;
        public String pkg;
        public int pkgUid;
        public int uid;
        public String libsPath = "";
        public boolean isSystem = false;
        public boolean isGame = false;
        public boolean isStub = false;

        public AppInfo(int i7, String str) {
            this.uid = i7;
            this.pkg = str;
            this.name = str;
            this.pkgUid = i7;
        }

        public String toString() {
            return "AppInfo [uid=" + this.uid + ", pkg=" + this.pkg + ", name=" + this.name + ", isSystem=" + this.isSystem + ", isGame=" + this.isGame + ']';
        }
    }

    public static class ProcessInfo implements Comparable<ProcessInfo> {
        public String cmdline;
        public volatile Drawable icon;
        private volatile boolean iconLoaded;
        public boolean isGame;
        public boolean isSystem;
        public String libsPath;
        public boolean main;
        public String name;
        public int order;
        public String packageName;
        public int pid;
        public int pkgUid;
        public int rss;
        public int uid;
        public long weight;
        public boolean x64;
        private WeakReference<Drawable> EMPTY = null;
        public final int colorPid = Tools.getColor(2131361821, -5570561);
        public final int colorName = Tools.getColor(2131361822, ProcessList.BUGGED_UID);
        public final int colorSize = Tools.getColor(2131361823, -5570646);

        public ProcessInfo(AppInfo appInfo, int i7, int i8, String str, int i9, boolean z6, int i10) {
            this.iconLoaded = false;
            this.cmdline = str;
            this.name = appInfo.name;
            this.packageName = appInfo.pkg;
            String str2 = appInfo.libsPath;
            this.libsPath = str2 == null ? "" : str2;
            this.icon = null;
            this.pid = i7;
            this.uid = i8;
            this.pkgUid = appInfo.isStub ? i8 : appInfo.pkgUid;
            this.main = str.equals(appInfo.pkg);
            this.isSystem = appInfo.isSystem;
            this.isGame = appInfo.isGame;
            this.order = i9;
            this.x64 = z6;
            this.rss = i10;
            if (appInfo.isStub) {
                this.iconLoaded = true;
            }
        }

        private String getCmdline() {
            if (this.main) {
                return "";
            }
            return " (" + this.cmdline.replace(String.valueOf(this.packageName).concat(":"), "") + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(ProcessInfo processInfo) {
            return compareTo1(processInfo);
        }

        public int compareTo1(ProcessInfo processInfo) {
            int i7 = this.order;
            int i8 = processInfo.order;
            if (i7 != i8) {
                if (i7 > i8) {
                    return ProcessList.BUGGED_UID;
                }
                return 1;
            }
            boolean z6 = this.isGame;
            if (z6 != processInfo.isGame) {
                if (z6) {
                    return ProcessList.BUGGED_UID;
                }
                return 1;
            }
            boolean z7 = this.isSystem;
            if (z7 != processInfo.isSystem) {
                if (z7) {
                    return 1;
                }
                return ProcessList.BUGGED_UID;
            }
            long j7 = this.weight;
            long j8 = processInfo.weight;
            if (j7 != j8) {
                if (j7 > j8) {
                    return ProcessList.BUGGED_UID;
                }
                return 1;
            }
            boolean z8 = this.main;
            if (z8 != processInfo.main) {
                if (z8) {
                    return ProcessList.BUGGED_UID;
                }
                return 1;
            }
            if ((getTrace() > 0) != (processInfo.getTrace() > 0)) {
                if (getTrace() > 0) {
                    return 1;
                }
                return ProcessList.BUGGED_UID;
            }
            int i9 = this.pid;
            int i10 = processInfo.pid;
            if (i9 == i10) {
                return 0;
            }
            if (i9 > i10) {
                return ProcessList.BUGGED_UID;
            }
            return 1;
        }

        public String dump() {
            return "ProcessInfo [cmdline=" + this.cmdline + ", name=" + this.name + ", packageName=" + this.packageName + ", icon=" + this.icon + ", pid=" + this.pid + ", uid=" + this.uid + ", isSystem=" + this.isSystem + ", isGame=" + this.isGame + ", weight=" + this.weight + ", main=" + this.main + ", order=" + this.order + ", x64=" + this.x64 + ", rss=" + this.rss + ", getTracer()=" + getTracer() + ", getTrace()=" + getTrace() + ']';
        }

        public int getTrace() {
            SparseIntArray sparseIntArray = ProcessList.tracers;
            int indexOfValue = sparseIntArray.indexOfValue(this.pid);
            return indexOfValue >= 0 ? sparseIntArray.keyAt(indexOfValue) : indexOfValue;
        }

        public int getTracer() {
            return ProcessList.tracers.get(this.pid);
        }

        public void loadIcon() {
            if (this.iconLoaded) {
                return;
            }
            try {
                this.icon = Tools.tryCloneIcon(Tools.getResized(Tools.getApplicationIcon(Tools.getApplicationInfo(this.packageName)), Tools.dp2px48()));
            } catch (Throwable unused) {
                android.util.Log.w("Failed load icon for ", this.packageName);
            }
            this.iconLoaded = true;
        }

        public void loadIcon(final TextView textView) {
            if (textView != null) {
                boolean z6 = this.iconLoaded;
                Drawable drawable = this.icon;
                if (drawable == null) {
                    WeakReference<Drawable> weakReference = this.EMPTY;
                    if (weakReference != null) {
                        drawable = weakReference.get();
                    }
                    if (drawable == null) {
                        drawable = Tools.getDrawable(R.animator.m3_btn_state_list_anim);
                        this.EMPTY = new WeakReference<>(drawable);
                    }
                }
                Tools.addIconToTextView(textView, drawable, 48);
                if (z6) {
                    return;
                }
                C2101m0.m5155a(1, new Runnable() { // from class: android.ext.ProcessList.ProcessInfo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2101m0.m5155a(0, new Runnable() { // from class: android.ext.ProcessList.ProcessInfo.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C0391d0.m1370q(textView.getText().toString(), true);
                            }
                        });
                    }
                });
            }
        }

        public void resolveLibs() {
            ApplicationInfo applicationInfo;
            if (this.uid != this.pkgUid) {
                android.util.Log.w("vs app: ", this.pkgUid + " != " + this.uid);
                try {
                    String packagesForUid = ProcessList.getPackagesForUid(this.uid);
                    if (packagesForUid == null || (applicationInfo = Tools.getApplicationInfo(packagesForUid)) == null || applicationInfo.nativeLibraryDir == null) {
                        return;
                    }
                    android.util.Log.w("vs: ", this.libsPath + " => " + applicationInfo.nativeLibraryDir);
                    this.libsPath = applicationInfo.nativeLibraryDir;
                } catch (Throwable th) {
                    android.util.Log.w("Failed get vs info for " + this.uid, th);
                }
            }
        }

        public CharSequence toCharSequence() {
            CharSequenceBuilder charSequenceBuilder = new CharSequenceBuilder();
            StringBuilder sb = new StringBuilder();
            if (getTracer() > 0) {
                sb.append('#');
            }
            if (getTrace() > 0) {
                sb.append('!');
            }
            if (!Config.vSpace && this.uid != this.pkgUid) {
                sb.append('v');
            }
            if (this.pid > 1) {
                sb.append('[');
                sb.append(Integer.toString(this.pid));
                sb.append("] ");
            }
            charSequenceBuilder.append(Tools.colorize(sb.toString(), this.colorPid));
            charSequenceBuilder.append(Tools.colorize(String.valueOf(this.name) + getCmdline(), this.colorName));
            StringBuilder sb2 = new StringBuilder();
            if (this.x64) {
                sb2.append(" [x64]");
            }
            if (this.rss != 0) {
                sb2.append(" [");
                sb2.append(Tools.formatFileSize(Tools.getContext(), this.rss * 1024));
                sb2.append(']');
            }
            charSequenceBuilder.append(Tools.colorize(sb2.toString(), this.colorSize));
            return charSequenceBuilder.toCharSequence();
        }

        public String toString() {
            return toCharSequence().toString();
        }
    }

    static {
        CheckNativeCrash.loadLastCrash();
        addBuggedPackages();
        int length = CheckNativeCrash.getBuggedUids().length;
        for (int i7 = BUGGED_UID; i7 < length; i7++) {
        }
        tracers = new SparseIntArray();
        lastInstance = null;
        realUids = null;
    }

    public ProcessList(ActivityManager activityManager, PackageManager packageManager) {
        this.mActivityManager = activityManager;
        mPackageManager = packageManager;
        lastInstance = this;
    }

    private static void addBuggedPackages() {
        int length = CheckNativeCrash.getBuggedPackages().length;
        for (int i7 = BUGGED_UID; i7 < length; i7++) {
        }
    }

    public static void clearCache() {
        Map<String, AppInfo> map = appCache;
        int size = map.size();
        if (size != 0) {
            map.clear();
            addBuggedPackages();
            android.util.Log.d("PL: ", size + " -> " + map.size());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.ext.ProcessList.AppInfo getAppInfo(int r9, int r10, java.lang.String r11, java.util.List<android.app.ActivityManager.RunningAppProcessInfo> r12, android.util.SparseArray<java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.ProcessList.getAppInfo(int, int, java.lang.String, java.util.List, android.util.SparseArray):android.ext.ProcessList$AppInfo");
    }

    private AppInfo getAppInfo(String str) {
        String packageName = Tools.getPackageName();
        return str.equals(packageName) ? getBuggedPackage(packageName, "GG") : str.startsWith("com.bluestacks.") ? getBuggedPackage(str, str) : appCache.get(str);
    }

    private String getApplicationLabel(String str, ApplicationInfo applicationInfo) {
        String str2 = applicationInfo.packageName;
        try {
            String applicationLabel = Tools.getApplicationLabel(applicationInfo);
            return applicationLabel != null ? applicationLabel : str2;
        } catch (Throwable th) {
            android.util.Log.e("Failed load label for: ", applicationInfo.packageName + th.getMessage());
            return str2;
        }
    }

    private static AppInfo getBuggedPackage(String str, String str2) {
        AppInfo appInfo = new AppInfo(BUGGED_UID, str);
        if (str2 != null) {
            appInfo.name = str2;
        }
        appInfo.isStub = true;
        return appInfo;
    }

    public static String getPackagesForUid(int i7) {
        if (Config.vSpace) {
            return Config.vSpacePkg;
        }
        String str = null;
        if (Config.vSpaceReal) {
            HashMap<String, Integer> hashMap = realUids;
            if (hashMap == null) {
                return null;
            }
            Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                if (next != null && next.getValue().intValue() == i7) {
                    next.getKey();
                    break;
                }
            }
            return null;
        }
        if (buggedUids.get(i7) == 1) {
            return null;
        }
        try {
            PackageManager packageManager = mPackageManager;
            boolean enter = CheckNativeCrash.enter("uid:" + i7, "uid");
            String[] packagesForUid = packageManager.getPackagesForUid(i7);
            if (packagesForUid != null && packagesForUid.length > 0) {
                str = packagesForUid[BUGGED_UID];
            }
            CheckNativeCrash.exit(enter);
            return str;
        } catch (Throwable th) {
            android.util.Log.e("Failed getPackagesForUid", th.getMessage());
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: IOException -> 0x00dc, TryCatch #3 {IOException -> 0x00dc, blocks: (B:11:0x0048, B:12:0x0051, B:14:0x0059, B:17:0x006a, B:21:0x0082, B:28:0x008e, B:31:0x009d, B:34:0x00a9, B:37:0x00bc), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0 A[LOOP:1: B:49:0x00ea->B:51:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(android.ext.BufferReader r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.ProcessList.load(android.ext.BufferReader):void");
    }

    public static void loadData(BufferReader bufferReader) {
        lastInstance.load(bufferReader);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|19|20|(14:22|(1:24)(1:79)|25|(1:27)(1:78)|28|29|30|(1:34)|35|36|37|38|(2:40|41)|(3:43|(3:45|(3:47|(4:50|(2:59|60)(2:56|57)|58|48)|61)(1:63)|62)|64)(1:66))|80|36|37|38|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        android.util.Log.w(r1, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[Catch: NoClassDefFoundError -> 0x00af, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x00af, blocks: (B:38:0x00a3, B:40:0x00a7), top: B:37:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<android.ext.ProcessList.ProcessInfo> sort(java.util.List<android.ext.ProcessList.ProcessInfo> r21, java.util.List<android.app.ActivityManager.RunningAppProcessInfo> r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.ProcessList.sort(java.util.List, java.util.List):java.util.List");
    }
}
