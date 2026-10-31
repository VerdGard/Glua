package p016c;

import android.content.Context;

/* renamed from: c.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0558l implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f2793c;

    /* renamed from: e */
    public final /* synthetic */ Context f2794e;

    public /* synthetic */ RunnableC0558l(int i7, Context context) {
        this.f2793c = i7;
        this.f2794e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f2793c
            android.content.Context r1 = r7.f2794e
            r2 = 1
            switch(r0) {
                case 0: goto La;
                default: goto L8;
            }
        L8:
            goto L8e
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r0 < r3) goto L8b
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L8b
            boolean r3 = p001a0.C0002a.m1a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L64
            l.b<java.lang.ref.WeakReference<c.m>> r3 = p016c.AbstractC0559m.f2797Z
            r3.getClass()
            l.b$a r5 = new l.b$a
            r5.<init>()
        L33:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r5.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            c.m r3 = (p016c.AbstractC0559m) r3
            if (r3 == 0) goto L33
            android.content.Context r3 = r3.mo1915f()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r3.getSystemService(r4)
            goto L53
        L52:
            r3 = 0
        L53:
            if (r3 == 0) goto L69
            android.os.LocaleList r3 = p016c.AbstractC0559m.b.m1935a(r3)
            a0.e r5 = new a0.e
            a0.k r6 = new a0.k
            r6.<init>(r3)
            r5.<init>(r6)
            goto L6b
        L64:
            a0.e r5 = p016c.AbstractC0559m.f2800m
            if (r5 == 0) goto L69
            goto L6b
        L69:
            a0.e r5 = p001a0.C0006e.f5b
        L6b:
            a0.i r3 = r5.f6a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L84
            java.lang.String r3 = p016c.C0571y.m1992b(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L84
            android.os.LocaleList r3 = p016c.AbstractC0559m.a.m1934a(r3)
            p016c.AbstractC0559m.b.m1936b(r4, r3)
        L84:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L8b:
            p016c.AbstractC0559m.f2796Y = r2
            return
        L8e:
            s0.c r0 = new s0.c
            r0.<init>(r2)
            androidx.profileinstaller.c$a r2 = androidx.profileinstaller.C0422c.f2039a
            r3 = 0
            androidx.profileinstaller.C0422c.m1420b(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.RunnableC0558l.run():void");
    }
}
