package p028d2;

import android.content.Context;
import android.ext.C0089a;
import android.ext.C0091c;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.C0143v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p036e2.AbstractC1006h0;
import p036e2.C0979d1;
import p036e2.C0986e1;
import p036e2.C0993f1;
import p036e2.C1007h1;
import p036e2.C1013i0;
import p036e2.C1014i1;
import p036e2.C1021j1;
import p036e2.C1055o0;

/* renamed from: d2.c */
/* loaded from: classes.dex */
public final class C0881c {

    /* renamed from: e */
    public static C1021j1.a f4657e;

    /* renamed from: f */
    public static volatile C0881c f4658f;

    /* renamed from: a */
    public final Context f4659a;

    /* renamed from: b */
    public final C1021j1 f4660b;

    /* renamed from: c */
    public final C1014i1 f4661c;

    /* renamed from: d */
    public final ThreadPoolExecutor f4662d = new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C0881c(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4659a = applicationContext;
        C0979d1 c0979d1 = new C0979d1();
        this.f4660b = new C1021j1(applicationContext, new C0986e1(applicationContext), c0979d1);
        this.f4661c = new C1014i1(applicationContext, c0979d1);
    }

    /* renamed from: a */
    public static C0881c m2568a(Context context) {
        C0881c c0881c;
        synchronized (C0993f1.class) {
            if (f4658f == null) {
                f4658f = new C0881c(context);
            }
            c0881c = f4658f;
        }
        return c0881c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00ff, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        if (r8 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        if (r10 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e6 A[LOOP:2: B:124:0x02e0->B:126:0x02e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2569d(p028d2.C0881c r16, p036e2.C1021j1.a r17) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d2.C0881c.m2569d(d2.c, e2.j1$a):void");
    }

    /* renamed from: b */
    public final C1021j1.a m2570b() {
        String string = Settings.Secure.getString(this.f4660b.f5150a.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        String m431b = C0143v.m431b(true, (Build.VERSION.SDK_INT < 23 ? C0091c.m228f("null", string, UUID.randomUUID().toString()) : C0089a.m208f("com.baidu", string)).getBytes());
        String m3053c = C1021j1.m3053c();
        C1021j1.a aVar = new C1021j1.a();
        aVar.f5160d = System.currentTimeMillis();
        aVar.f5166j = 1;
        aVar.f5157a = m431b;
        aVar.f5158b = "V";
        aVar.f5159c = C1021j1.m3054d(m431b);
        aVar.f5162f = true;
        aVar.f5163g = m3053c;
        aVar.f5161e = null;
        return aVar;
    }

    /* renamed from: c */
    public final C1021j1.a m2571c(String str) {
        C1021j1.a aVar;
        C1021j1.a aVar2;
        C1021j1 c1021j1 = this.f4660b;
        c1021j1.getClass();
        AbstractC1006h0.f fVar = new AbstractC1006h0.f();
        fVar.f5093a = true;
        C1013i0 c1013i0 = c1021j1.f5154e;
        c1013i0.getClass();
        ArrayList arrayList = new ArrayList(c1013i0.f5123a.values());
        Collections.sort(arrayList, AbstractC1006h0.f5083e);
        Iterator it = ((ArrayList) c1021j1.f5155f.m3005d(c1021j1.f5150a)).iterator();
        loop0: while (true) {
            aVar = null;
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            C1055o0 c1055o0 = (C1055o0) it.next();
            if (!c1055o0.f5271d && c1055o0.f5270c) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC1006h0.g mo3034b = ((AbstractC1006h0) it2.next()).mo3034b(c1055o0.f5268a.packageName, fVar);
                    if (mo3034b != null) {
                        boolean z6 = false;
                        if ((mo3034b.f5095b == 0) && (aVar2 = mo3034b.f5094a) != null && !TextUtils.equals(aVar2.f5157a, str)) {
                            if (aVar2.f5162f && !TextUtils.equals(C1021j1.m3053c(), aVar2.f5163g)) {
                                z6 = true;
                            }
                            if (!z6) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        C1014i1 c1014i1 = this.f4661c;
        C0979d1 c0979d1 = c1014i1.f5125b;
        Context context = c1014i1.f5124a;
        List<C1055o0> m3005d = c0979d1.m3005d(context);
        File filesDir = context.getFilesDir();
        String str2 = "files";
        if (!"files".equals(filesDir.getName())) {
            Log.e("CuidV266Manager", "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
            str2 = filesDir.getName();
        }
        Iterator it3 = ((ArrayList) m3005d).iterator();
        C0993f1 c0993f1 = null;
        while (it3.hasNext()) {
            C1055o0 c1055o02 = (C1055o0) it3.next();
            if (!c1055o02.f5271d) {
                File file = new File(new File(c1055o02.f5268a.dataDir, str2), "libcuid.so");
                if (file.exists() && (c0993f1 = C0993f1.m3022b(C1007h1.m3036a(file))) != null) {
                    break;
                }
            }
        }
        if (c0993f1 == null) {
            c0993f1 = C0993f1.m3022b(c1014i1.m3042d("com.baidu.deviceid.v2"));
        }
        boolean m3041c = c1014i1.m3041c("android.permission.READ_EXTERNAL_STORAGE");
        if (c0993f1 == null && m3041c) {
            File file2 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
            c0993f1 = file2.exists() ? C0993f1.m3022b(C1007h1.m3036a(file2)) : null;
        }
        if (c0993f1 == null) {
            c0993f1 = C0993f1.m3021a(c1014i1.m3042d("com.baidu.deviceid"), c1014i1.m3042d("bd_setting_i"));
        }
        if (c0993f1 == null && m3041c) {
            c0993f1 = C1014i1.m3038e();
        }
        if (c0993f1 != null) {
            c0993f1.m3025e();
        }
        if (c0993f1 != null && !TextUtils.equals(str, c0993f1.f5061a)) {
            aVar = C1021j1.m3051a(c0993f1);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r1 = m2571c(r0.f5157a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r1 = m2570b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r1.m3056a();
        r1.f5165i = r0.m3058c();
        m2573f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:18:0x004b, B:22:0x006e, B:24:0x0076, B:25:0x007a, B:29:0x0089, B:31:0x008f, B:32:0x0093, B:34:0x0052, B:36:0x0056, B:39:0x005f), top: B:17:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:18:0x004b, B:22:0x006e, B:24:0x0076, B:25:0x007a, B:29:0x0089, B:31:0x008f, B:32:0x0093, B:34:0x0052, B:36:0x0056, B:39:0x005f), top: B:17:0x004b }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p036e2.C1021j1.a m2572e() {
        /*
            r7 = this;
            e2.j1 r0 = r7.f4660b
            monitor-enter(r0)
            e2.e1$a r1 = r0.f5151b     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = ".lock"
            r1.getClass()     // Catch: java.lang.Throwable -> L9e
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9e
            java.io.File r1 = r1.f5029a     // Catch: java.lang.Throwable -> L9e
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L1f
            r3.createNewFile()     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L9e
            goto L1f
        L1b:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L9e
        L1f:
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L9e
            java.lang.String r5 = "rw"
            r4.<init>(r3, r5)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L9e
            r3 = 0
        L29:
            r5 = 100
            if (r3 >= r5) goto L4a
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Exception -> L43 java.lang.Throwable -> L9e
            java.nio.channels.FileLock r5 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Exception -> L43 java.lang.Throwable -> L9e
            r0.f5152c = r5     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Exception -> L43 java.lang.Throwable -> L9e
            r0.f5153d = r4     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Exception -> L43 java.lang.Throwable -> L9e
            goto L4a
        L3a:
            r5 = 100
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L9e
            int r3 = r3 + 1
            goto L29
        L42:
            r4 = r2
        L43:
            java.nio.channels.FileLock r3 = r0.f5152c     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto L4a
            p036e2.C1007h1.m3037b(r4)     // Catch: java.lang.Throwable -> L9e
        L4a:
            monitor-exit(r0)
            e2.j1$a r0 = r7.m2574g()     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L52
            goto L6c
        L52:
            boolean r3 = r0.f5162f     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L6c
            java.lang.String r3 = r0.f5163g     // Catch: java.lang.Throwable -> L97
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L5f
            goto L6c
        L5f:
            java.lang.String r3 = r0.f5163g     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = p036e2.C1021j1.m3053c()     // Catch: java.lang.Throwable -> L97
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch: java.lang.Throwable -> L97
            if (r3 != 0) goto L6c
            r1 = 1
        L6c:
            if (r1 == 0) goto L87
            java.lang.String r1 = r0.f5157a     // Catch: java.lang.Throwable -> L97
            e2.j1$a r1 = r7.m2571c(r1)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L7a
            e2.j1$a r1 = r7.m2570b()     // Catch: java.lang.Throwable -> L97
        L7a:
            r1.m3056a()     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r0.m3058c()     // Catch: java.lang.Throwable -> L97
            r1.f5165i = r0     // Catch: java.lang.Throwable -> L97
            r7.m2573f(r1)     // Catch: java.lang.Throwable -> L97
            return r1
        L87:
            if (r0 != 0) goto L8d
            e2.j1$a r0 = r7.m2571c(r2)     // Catch: java.lang.Throwable -> L97
        L8d:
            if (r0 != 0) goto L93
            e2.j1$a r0 = r7.m2570b()     // Catch: java.lang.Throwable -> L97
        L93:
            r7.m2573f(r0)     // Catch: java.lang.Throwable -> L97
            return r0
        L97:
            r0 = move-exception
            e2.j1 r1 = r7.f4660b
            r1.m3055e()
            throw r0
        L9e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d2.C0881c.m2572e():e2.j1$a");
    }

    /* renamed from: f */
    public final synchronized void m2573f(C1021j1.a aVar) {
        this.f4662d.execute(new RunnableC0880b(this, aVar));
    }

    /* renamed from: g */
    public final C1021j1.a m2574g() {
        C0993f1 m3022b;
        C1021j1 c1021j1 = this.f4660b;
        c1021j1.getClass();
        C0986e1.a aVar = c1021j1.f5151b;
        C1021j1.a aVar2 = null;
        C1021j1.a m3052b = !new File(aVar.m3010c(), "libbh.so").exists() ? null : C1021j1.m3052b(aVar.m3008a("libbh.so"));
        if (m3052b != null) {
            return m3052b;
        }
        File file = new File(this.f4659a.getFilesDir(), "libcuid.so");
        if (file.exists() && (m3022b = C0993f1.m3022b(C1007h1.m3036a(file))) != null) {
            aVar2 = C1021j1.m3051a(m3022b);
        }
        return aVar2;
    }
}
