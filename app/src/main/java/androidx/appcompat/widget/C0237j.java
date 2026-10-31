package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import p066i0.C1308b;
import p189y.C2213a;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0237j {

    /* renamed from: a */
    public final CompoundButton f928a;

    /* renamed from: b */
    public ColorStateList f929b = null;

    /* renamed from: c */
    public PorterDuff.Mode f930c = null;

    /* renamed from: d */
    public boolean f931d = false;

    /* renamed from: e */
    public boolean f932e = false;

    /* renamed from: f */
    public boolean f933f;

    public C0237j(CompoundButton compoundButton) {
        this.f928a = compoundButton;
    }

    /* renamed from: a */
    public final void m805a() {
        CompoundButton compoundButton = this.f928a;
        Drawable m3627a = C1308b.m3627a(compoundButton);
        if (m3627a != null) {
            if (this.f931d || this.f932e) {
                Drawable mutate = C2213a.m5359g(m3627a).mutate();
                if (this.f931d) {
                    C2213a.b.m5372h(mutate, this.f929b);
                }
                if (this.f932e) {
                    C2213a.b.m5373i(mutate, this.f930c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0018, B:5:0x0021, B:8:0x0027, B:11:0x0038, B:13:0x0040, B:15:0x0046, B:16:0x0051, B:18:0x0059, B:19:0x0060, B:21:0x0068), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0018, B:5:0x0021, B:8:0x0027, B:11:0x0038, B:13:0x0040, B:15:0x0046, B:16:0x0051, B:18:0x0059, B:19:0x0060, B:21:0x0068), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0018, B:5:0x0021, B:8:0x0027, B:11:0x0038, B:13:0x0040, B:15:0x0046, B:16:0x0051, B:18:0x0059, B:19:0x0060, B:21:0x0068), top: B:2:0x0018 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m806b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r6 = r8.f928a
            android.content.Context r0 = r6.getContext()
            int[] r2 = androidx.appcompat.R$styleable.f285m
            androidx.appcompat.widget.h1 r7 = androidx.appcompat.widget.C0233h1.m790m(r0, r9, r2, r10)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.f915b
            r0 = r6
            r3 = r9
            r5 = r10
            p034e0.C0946x.m2816q(r0, r1, r2, r3, r4, r5)
            int r9 = androidx.appcompat.R$styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L79
            boolean r10 = r7.m802l(r9)     // Catch: java.lang.Throwable -> L79
            r0 = 0
            if (r10 == 0) goto L35
            int r9 = r7.m799i(r9, r0)     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L35
            android.content.Context r10 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L79
            android.graphics.drawable.Drawable r9 = p025d.C0872a.m2561a(r10, r9)     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L79
            r6.setButtonDrawable(r9)     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L79
            r9 = 1
            goto L36
        L34:
        L35:
            r9 = 0
        L36:
            if (r9 != 0) goto L51
            int r9 = androidx.appcompat.R$styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L79
            boolean r10 = r7.m802l(r9)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L51
            int r9 = r7.m799i(r9, r0)     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L51
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L79
            android.graphics.drawable.Drawable r9 = p025d.C0872a.m2561a(r10, r9)     // Catch: java.lang.Throwable -> L79
            r6.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L79
        L51:
            int r9 = androidx.appcompat.R$styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L79
            boolean r10 = r7.m802l(r9)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L60
            android.content.res.ColorStateList r9 = r7.m792b(r9)     // Catch: java.lang.Throwable -> L79
            p066i0.C1308b.a.m3630c(r6, r9)     // Catch: java.lang.Throwable -> L79
        L60:
            int r9 = androidx.appcompat.R$styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L79
            boolean r10 = r7.m802l(r9)     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L75
            r10 = -1
            int r9 = r7.m798h(r9, r10)     // Catch: java.lang.Throwable -> L79
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0244l0.m844c(r9, r10)     // Catch: java.lang.Throwable -> L79
            p066i0.C1308b.a.m3631d(r6, r9)     // Catch: java.lang.Throwable -> L79
        L75:
            r7.m803n()
            return
        L79:
            r9 = move-exception
            r7.m803n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0237j.m806b(android.util.AttributeSet, int):void");
    }
}
