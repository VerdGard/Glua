package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public final class C0222e {

    /* renamed from: a */
    public final View f876a;

    /* renamed from: d */
    public C0227f1 f879d;

    /* renamed from: e */
    public C0227f1 f880e;

    /* renamed from: f */
    public C0227f1 f881f;

    /* renamed from: c */
    public int f878c = -1;

    /* renamed from: b */
    public final C0240k f877b = C0240k.m807a();

    public C0222e(View view) {
        this.f876a = view;
    }

    /* renamed from: a */
    public final void m734a() {
        View view = this.f876a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i7 = Build.VERSION.SDK_INT;
            boolean z6 = true;
            if (i7 <= 21 ? i7 == 21 : this.f879d != null) {
                if (this.f881f == null) {
                    this.f881f = new C0227f1();
                }
                C0227f1 c0227f1 = this.f881f;
                c0227f1.f889a = null;
                c0227f1.f892d = false;
                c0227f1.f890b = null;
                c0227f1.f891c = false;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                ColorStateList m2874g = C0946x.i.m2874g(view);
                if (m2874g != null) {
                    c0227f1.f892d = true;
                    c0227f1.f889a = m2874g;
                }
                PorterDuff.Mode m2875h = C0946x.i.m2875h(view);
                if (m2875h != null) {
                    c0227f1.f891c = true;
                    c0227f1.f890b = m2875h;
                }
                if (c0227f1.f892d || c0227f1.f891c) {
                    C0240k.m810e(background, c0227f1, view.getDrawableState());
                } else {
                    z6 = false;
                }
                if (z6) {
                    return;
                }
            }
            C0227f1 c0227f12 = this.f880e;
            if (c0227f12 != null) {
                C0240k.m810e(background, c0227f12, view.getDrawableState());
                return;
            }
            C0227f1 c0227f13 = this.f879d;
            if (c0227f13 != null) {
                C0240k.m810e(background, c0227f13, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m735b() {
        C0227f1 c0227f1 = this.f880e;
        if (c0227f1 != null) {
            return c0227f1.f889a;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m736c() {
        C0227f1 c0227f1 = this.f880e;
        if (c0227f1 != null) {
            return c0227f1.f890b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0019, B:5:0x0022, B:6:0x0030, B:9:0x0037, B:11:0x003a, B:14:0x003f, B:15:0x0040, B:17:0x0041, B:19:0x0049, B:20:0x0050, B:22:0x0058, B:24:0x006a, B:26:0x0074, B:32:0x0082, B:34:0x0088, B:35:0x008f, B:8:0x0031), top: B:2:0x0019, inners: #1 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m737d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.f876a
            android.content.Context r1 = r0.getContext()
            int[] r4 = androidx.appcompat.R$styleable.f271A
            androidx.appcompat.widget.h1 r1 = androidx.appcompat.widget.C0233h1.m790m(r1, r9, r4, r10)
            android.view.View r2 = r8.f876a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.f915b
            r5 = r9
            r7 = r10
            p034e0.C0946x.m2816q(r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R$styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L96
            boolean r10 = r1.m802l(r9)     // Catch: java.lang.Throwable -> L96
            r2 = -1
            if (r10 == 0) goto L41
            int r9 = r1.m799i(r9, r2)     // Catch: java.lang.Throwable -> L96
            r8.f878c = r9     // Catch: java.lang.Throwable -> L96
            androidx.appcompat.widget.k r9 = r8.f877b     // Catch: java.lang.Throwable -> L96
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L96
            int r3 = r8.f878c     // Catch: java.lang.Throwable -> L96
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L96
            androidx.appcompat.widget.x0 r4 = r9.f939a     // Catch: java.lang.Throwable -> L3e
            android.content.res.ColorStateList r10 = r4.m905i(r3, r10)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L41
            r8.m740g(r10)     // Catch: java.lang.Throwable -> L96
            goto L41
        L3e:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L96
            throw r10     // Catch: java.lang.Throwable -> L96
        L41:
            int r9 = androidx.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L96
            boolean r10 = r1.m802l(r9)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L50
            android.content.res.ColorStateList r9 = r1.m792b(r9)     // Catch: java.lang.Throwable -> L96
            p034e0.C0946x.m2819t(r0, r9)     // Catch: java.lang.Throwable -> L96
        L50:
            int r9 = androidx.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L96
            boolean r10 = r1.m802l(r9)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L92
            int r9 = r1.m798h(r9, r2)     // Catch: java.lang.Throwable -> L96
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0244l0.m844c(r9, r10)     // Catch: java.lang.Throwable -> L96
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L96
            p034e0.C0946x.i.m2885r(r0, r9)     // Catch: java.lang.Throwable -> L96
            r9 = 21
            if (r10 != r9) goto L92
            android.graphics.drawable.Drawable r9 = r0.getBackground()     // Catch: java.lang.Throwable -> L96
            android.content.res.ColorStateList r10 = p034e0.C0946x.i.m2874g(r0)     // Catch: java.lang.Throwable -> L96
            if (r10 != 0) goto L7d
            android.graphics.PorterDuff$Mode r10 = p034e0.C0946x.i.m2875h(r0)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L7b
            goto L7d
        L7b:
            r10 = 0
            goto L7e
        L7d:
            r10 = 1
        L7e:
            if (r9 == 0) goto L92
            if (r10 == 0) goto L92
            boolean r10 = r9.isStateful()     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L8f
            int[] r10 = r0.getDrawableState()     // Catch: java.lang.Throwable -> L96
            r9.setState(r10)     // Catch: java.lang.Throwable -> L96
        L8f:
            p034e0.C0946x.d.m2841q(r0, r9)     // Catch: java.lang.Throwable -> L96
        L92:
            r1.m803n()
            return
        L96:
            r9 = move-exception
            r1.m803n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0222e.m737d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void m738e() {
        this.f878c = -1;
        m740g(null);
        m734a();
    }

    /* renamed from: f */
    public final void m739f(int i7) {
        ColorStateList colorStateList;
        this.f878c = i7;
        C0240k c0240k = this.f877b;
        if (c0240k != null) {
            Context context = this.f876a.getContext();
            synchronized (c0240k) {
                colorStateList = c0240k.f939a.m905i(i7, context);
            }
        } else {
            colorStateList = null;
        }
        m740g(colorStateList);
        m734a();
    }

    /* renamed from: g */
    public final void m740g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f879d == null) {
                this.f879d = new C0227f1();
            }
            C0227f1 c0227f1 = this.f879d;
            c0227f1.f889a = colorStateList;
            c0227f1.f892d = true;
        } else {
            this.f879d = null;
        }
        m734a();
    }

    /* renamed from: h */
    public final void m741h(ColorStateList colorStateList) {
        if (this.f880e == null) {
            this.f880e = new C0227f1();
        }
        C0227f1 c0227f1 = this.f880e;
        c0227f1.f889a = colorStateList;
        c0227f1.f892d = true;
        m734a();
    }

    /* renamed from: i */
    public final void m742i(PorterDuff.Mode mode) {
        if (this.f880e == null) {
            this.f880e = new C0227f1();
        }
        C0227f1 c0227f1 = this.f880e;
        c0227f1.f890b = mode;
        c0227f1.f891c = true;
        m734a();
    }
}
