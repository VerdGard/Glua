package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.RunnableC0119d;
import androidx.emoji2.text.C0323g;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009b0.C0501e;
import p009b0.C0502f;
import p009b0.C0508l;
import p009b0.C0509m;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C0329m extends C0323g.c {

    /* renamed from: d */
    public static final a f1598d = new a();

    /* renamed from: androidx.emoji2.text.m$a */
    public static class a {
    }

    /* renamed from: androidx.emoji2.text.m$b */
    public static class b implements C0323g.g {

        /* renamed from: a */
        public final Context f1599a;

        /* renamed from: b */
        public final C0502f f1600b;

        /* renamed from: c */
        public final a f1601c;

        /* renamed from: d */
        public final Object f1602d;

        /* renamed from: e */
        public Handler f1603e;

        /* renamed from: f */
        public Executor f1604f;

        /* renamed from: g */
        public ThreadPoolExecutor f1605g;

        /* renamed from: h */
        public C0323g.h f1606h;

        public b(Context context, C0502f c0502f) {
            a aVar = C0329m.f1598d;
            this.f1602d = new Object();
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.f1599a = context.getApplicationContext();
            this.f1600b = c0502f;
            this.f1601c = aVar;
        }

        @Override // androidx.emoji2.text.C0323g.g
        /* renamed from: a */
        public final void mo1080a(C0323g.h hVar) {
            synchronized (this.f1602d) {
                this.f1606h = hVar;
            }
            m1119c();
        }

        /* renamed from: b */
        public final void m1118b() {
            synchronized (this.f1602d) {
                this.f1606h = null;
                Handler handler = this.f1603e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1603e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1605g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1604f = null;
                this.f1605g = null;
            }
        }

        /* renamed from: c */
        public final void m1119c() {
            synchronized (this.f1602d) {
                if (this.f1606h == null) {
                    return;
                }
                if (this.f1604f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0317a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1605g = threadPoolExecutor;
                    this.f1604f = threadPoolExecutor;
                }
                this.f1604f.execute(new RunnableC0119d(4, this));
            }
        }

        /* renamed from: d */
        public final C0509m m1120d() {
            try {
                a aVar = this.f1601c;
                Context context = this.f1599a;
                C0502f c0502f = this.f1600b;
                aVar.getClass();
                C0508l m1823a = C0501e.m1823a(context, c0502f);
                int i7 = m1823a.f2537a;
                if (i7 != 0) {
                    throw new RuntimeException("fetchFonts failed (" + i7 + ")");
                }
                C0509m[] c0509mArr = m1823a.f2538b;
                if (c0509mArr == null || c0509mArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c0509mArr[0];
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("provider not found", e7);
            }
        }
    }

    public C0329m(Context context, C0502f c0502f) {
        super(new b(context, c0502f));
    }
}
