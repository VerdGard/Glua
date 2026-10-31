package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.g */
/* loaded from: classes.dex */
public final class C0845g {

    /* renamed from: e */
    public static C0845g f4451e;

    /* renamed from: a */
    public final Object f4452a = new Object();

    /* renamed from: b */
    public final Handler f4453b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    public c f4454c;

    /* renamed from: d */
    public c f4455d;

    /* renamed from: com.google.android.material.snackbar.g$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0845g c0845g = C0845g.this;
            c cVar = (c) message.obj;
            synchronized (c0845g.f4452a) {
                if (c0845g.f4454c == cVar || c0845g.f4455d == cVar) {
                    c0845g.m2502a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.g$b */
    public interface b {
        /* renamed from: a */
        void mo2495a();

        /* renamed from: b */
        void mo2496b(int i7);
    }

    /* renamed from: com.google.android.material.snackbar.g$c */
    public static class c {

        /* renamed from: a */
        public final WeakReference<b> f4457a;

        /* renamed from: b */
        public int f4458b;

        /* renamed from: c */
        public boolean f4459c;

        public c(int i7, BaseTransientBottomBar.C0836c c0836c) {
            this.f4457a = new WeakReference<>(c0836c);
            this.f4458b = i7;
        }
    }

    /* renamed from: b */
    public static C0845g m2501b() {
        if (f4451e == null) {
            f4451e = new C0845g();
        }
        return f4451e;
    }

    /* renamed from: a */
    public final boolean m2502a(c cVar, int i7) {
        b bVar = cVar.f4457a.get();
        if (bVar == null) {
            return false;
        }
        this.f4453b.removeCallbacksAndMessages(cVar);
        bVar.mo2496b(i7);
        return true;
    }

    /* renamed from: c */
    public final boolean m2503c(BaseTransientBottomBar.C0836c c0836c) {
        c cVar = this.f4454c;
        if (cVar != null) {
            return c0836c != null && cVar.f4457a.get() == c0836c;
        }
        return false;
    }

    /* renamed from: d */
    public final void m2504d(BaseTransientBottomBar.C0836c c0836c) {
        synchronized (this.f4452a) {
            if (m2503c(c0836c)) {
                c cVar = this.f4454c;
                if (!cVar.f4459c) {
                    cVar.f4459c = true;
                    this.f4453b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m2505e(BaseTransientBottomBar.C0836c c0836c) {
        synchronized (this.f4452a) {
            if (m2503c(c0836c)) {
                c cVar = this.f4454c;
                if (cVar.f4459c) {
                    cVar.f4459c = false;
                    m2506f(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m2506f(c cVar) {
        int i7 = cVar.f4458b;
        if (i7 == -2) {
            return;
        }
        if (i7 <= 0) {
            i7 = i7 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f4453b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i7);
    }
}
