package p049g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* renamed from: g.c */
/* loaded from: classes.dex */
public final class C1185c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f5784f;

    /* renamed from: a */
    public int f5785a;

    /* renamed from: b */
    public Resources.Theme f5786b;

    /* renamed from: c */
    public LayoutInflater f5787c;

    /* renamed from: d */
    public Configuration f5788d;

    /* renamed from: e */
    public Resources f5789e;

    /* renamed from: g.c$a */
    public static class a {
        /* renamed from: a */
        public static Context m3396a(C1185c c1185c, Configuration configuration) {
            return c1185c.createConfigurationContext(configuration);
        }
    }

    public C1185c() {
        super(null);
    }

    public C1185c(int i7, Context context) {
        super(context);
        this.f5785a = i7;
    }

    /* renamed from: a */
    public final void m3394a(Configuration configuration) {
        if (this.f5789e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5788d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5788d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m3395b() {
        if (this.f5786b == null) {
            this.f5786b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5786b.setTo(theme);
            }
        }
        this.f5786b.applyStyle(this.f5785a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(p049g.C1185c.f5784f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f5789e
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f5788d
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p049g.C1185c.f5784f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p049g.C1185c.f5784f = r1
        L1c:
            android.content.res.Configuration r1 = p049g.C1185c.f5784f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f5788d
            android.content.Context r0 = p049g.C1185c.a.m3396a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f5789e = r0
        L36:
            android.content.res.Resources r0 = r3.f5789e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049g.C1185c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5787c == null) {
            this.f5787c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5787c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f5786b;
        if (theme != null) {
            return theme;
        }
        if (this.f5785a == 0) {
            this.f5785a = R$style.Theme_AppCompat_Light;
        }
        m3395b();
        return this.f5786b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f5785a != i7) {
            this.f5785a = i7;
            m3395b();
        }
    }
}
