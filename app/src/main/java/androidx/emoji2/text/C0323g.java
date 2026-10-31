package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p089l.C1468b;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public final class C0323g {

    /* renamed from: i */
    public static final Object f1556i = new Object();

    /* renamed from: j */
    public static volatile C0323g f1557j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f1558a;

    /* renamed from: b */
    public final C1468b f1559b;

    /* renamed from: c */
    public volatile int f1560c;

    /* renamed from: d */
    public final Handler f1561d;

    /* renamed from: e */
    public final a f1562e;

    /* renamed from: f */
    public final g f1563f;

    /* renamed from: g */
    public final int f1564g;

    /* renamed from: h */
    public final C0321e f1565h;

    /* renamed from: androidx.emoji2.text.g$a */
    public static final class a extends b {

        /* renamed from: b */
        public volatile C0327k f1566b;

        /* renamed from: c */
        public volatile C0331o f1567c;

        public a(C0323g c0323g) {
            super(c0323g);
        }
    }

    /* renamed from: androidx.emoji2.text.g$b */
    public static class b {

        /* renamed from: a */
        public final C0323g f1568a;

        public b(C0323g c0323g) {
            this.f1568a = c0323g;
        }
    }

    /* renamed from: androidx.emoji2.text.g$c */
    public static abstract class c {

        /* renamed from: a */
        public final g f1569a;

        /* renamed from: b */
        public int f1570b = 0;

        /* renamed from: c */
        public final C0321e f1571c = new C0321e();

        public c(g gVar) {
            this.f1569a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.g$d */
    public interface d {
    }

    /* renamed from: androidx.emoji2.text.g$e */
    public static abstract class e {
        /* renamed from: a */
        public void mo1109a() {
        }
    }

    /* renamed from: androidx.emoji2.text.g$f */
    public static class f implements Runnable {

        /* renamed from: c */
        public final ArrayList f1572c;

        /* renamed from: e */
        public final int f1573e;

        public f(List list, int i7, Throwable th) {
            if (list == null) {
                throw new NullPointerException("initCallbacks cannot be null");
            }
            this.f1572c = new ArrayList(list);
            this.f1573e = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f1572c;
            int size = arrayList.size();
            int i7 = 0;
            if (this.f1573e != 1) {
                while (i7 < size) {
                    ((e) arrayList.get(i7)).getClass();
                    i7++;
                }
            } else {
                while (i7 < size) {
                    ((e) arrayList.get(i7)).mo1109a();
                    i7++;
                }
            }
        }
    }

    /* renamed from: androidx.emoji2.text.g$g */
    public interface g {
        /* renamed from: a */
        void mo1080a(h hVar);
    }

    /* renamed from: androidx.emoji2.text.g$h */
    public static abstract class h {
        /* renamed from: a */
        public abstract void mo1100a(Throwable th);

        /* renamed from: b */
        public abstract void mo1101b(C0331o c0331o);
    }

    /* renamed from: androidx.emoji2.text.g$i */
    public static class i {
    }

    public C0323g(EmojiCompatInitializer.C0314a c0314a) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1558a = reentrantReadWriteLock;
        this.f1560c = 3;
        g gVar = c0314a.f1569a;
        this.f1563f = gVar;
        int i7 = c0314a.f1570b;
        this.f1564g = i7;
        this.f1565h = c0314a.f1571c;
        this.f1561d = new Handler(Looper.getMainLooper());
        this.f1559b = new C1468b();
        a aVar = new a(this);
        this.f1562e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f1560c = 0;
            } catch (Throwable th) {
                this.f1558a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1103b() == 0) {
            try {
                gVar.mo1080a(new C0322f(aVar));
            } catch (Throwable th2) {
                m1105d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0323g m1102a() {
        C0323g c0323g;
        synchronized (f1556i) {
            c0323g = f1557j;
            if (!(c0323g != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c0323g;
    }

    /* renamed from: b */
    public final int m1103b() {
        this.f1558a.readLock().lock();
        try {
            return this.f1560c;
        } finally {
            this.f1558a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m1104c() {
        if (!(this.f1564g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1103b() == 1) {
            return;
        }
        this.f1558a.writeLock().lock();
        try {
            if (this.f1560c == 0) {
                return;
            }
            this.f1560c = 0;
            this.f1558a.writeLock().unlock();
            a aVar = this.f1562e;
            C0323g c0323g = aVar.f1568a;
            try {
                c0323g.f1563f.mo1080a(new C0322f(aVar));
            } catch (Throwable th) {
                c0323g.m1105d(th);
            }
        } finally {
            this.f1558a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m1105d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1558a.writeLock().lock();
        try {
            this.f1560c = 2;
            arrayList.addAll(this.f1559b);
            this.f1559b.clear();
            this.f1558a.writeLock().unlock();
            this.f1561d.post(new f(arrayList, this.f1560c, th));
        } catch (Throwable th2) {
            this.f1558a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: e */
    public final void m1106e() {
        ArrayList arrayList = new ArrayList();
        this.f1558a.writeLock().lock();
        try {
            this.f1560c = 1;
            arrayList.addAll(this.f1559b);
            this.f1559b.clear();
            this.f1558a.writeLock().unlock();
            this.f1561d.post(new f(arrayList, this.f1560c, null));
        } catch (Throwable th) {
            this.f1558a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
    
        if (r3.m1114b(r15, r0, r13, r5.f1590d.f1613b) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
    
        if (r6 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
    
        r6 = new androidx.emoji2.text.C0334r((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f1, code lost:
    
        r10 = r5.f1590d.f1613b;
        r3.f1584a.getClass();
        r6.setSpan(new androidx.emoji2.text.C0333q(r10), r0, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0147 A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0082, B:31:0x008a, B:33:0x008d, B:35:0x0091, B:37:0x009d, B:39:0x00a0, B:43:0x00ad, B:46:0x00b5, B:52:0x00cf, B:69:0x00db, B:72:0x00e7, B:73:0x00f1, B:56:0x0106, B:59:0x010d, B:78:0x0112, B:81:0x011d, B:86:0x0122, B:88:0x0126, B:90:0x012c, B:92:0x0130, B:97:0x013b, B:100:0x0147, B:101:0x014d, B:103:0x0160, B:27:0x0078), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #0 {all -> 0x0177, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0082, B:31:0x008a, B:33:0x008d, B:35:0x0091, B:37:0x009d, B:39:0x00a0, B:43:0x00ad, B:46:0x00b5, B:52:0x00cf, B:69:0x00db, B:72:0x00e7, B:73:0x00f1, B:56:0x0106, B:59:0x010d, B:78:0x0112, B:81:0x011d, B:86:0x0122, B:88:0x0126, B:90:0x012c, B:92:0x0130, B:97:0x013b, B:100:0x0147, B:101:0x014d, B:103:0x0160, B:27:0x0078), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0082, B:31:0x008a, B:33:0x008d, B:35:0x0091, B:37:0x009d, B:39:0x00a0, B:43:0x00ad, B:46:0x00b5, B:52:0x00cf, B:69:0x00db, B:72:0x00e7, B:73:0x00f1, B:56:0x0106, B:59:0x010d, B:78:0x0112, B:81:0x011d, B:86:0x0122, B:88:0x0126, B:90:0x012c, B:92:0x0130, B:97:0x013b, B:100:0x0147, B:101:0x014d, B:103:0x0160, B:27:0x0078), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence m1107f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0323g.m1107f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* renamed from: g */
    public final void m1108g(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f1558a.writeLock().lock();
        try {
            if (this.f1560c != 1 && this.f1560c != 2) {
                this.f1559b.add(eVar);
            }
            this.f1561d.post(new f(Arrays.asList(eVar), this.f1560c, null));
        } finally {
            this.f1558a.writeLock().unlock();
        }
    }
}
