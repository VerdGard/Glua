package p016c;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p033e.C0906d;

/* renamed from: c.c */
/* loaded from: classes.dex */
public class C0546c implements DrawerLayout.InterfaceC0308d {

    /* renamed from: a */
    public final a f2723a;

    /* renamed from: b */
    public final DrawerLayout f2724b;

    /* renamed from: c */
    public final C0906d f2725c;

    /* renamed from: f */
    public final int f2728f;

    /* renamed from: g */
    public final int f2729g;

    /* renamed from: d */
    public final boolean f2726d = true;

    /* renamed from: e */
    public final boolean f2727e = true;

    /* renamed from: h */
    public boolean f2730h = false;

    /* renamed from: c.c$a */
    public interface a {
        /* renamed from: a */
        boolean mo1877a();

        /* renamed from: b */
        Drawable mo1878b();

        /* renamed from: c */
        void mo1879c(int i7);

        /* renamed from: d */
        void mo1880d(C0906d c0906d, int i7);

        /* renamed from: e */
        Context mo1881e();
    }

    /* renamed from: c.c$b */
    public interface b {
        /* renamed from: e */
        a mo1882e();
    }

    /* renamed from: c.c$c */
    public static class c implements a {

        /* renamed from: a */
        public final Activity f2731a;

        /* renamed from: c.c$c$a */
        public static class a {
            /* renamed from: a */
            public static void m1883a(ActionBar actionBar, int i7) {
                actionBar.setHomeActionContentDescription(i7);
            }

            /* renamed from: b */
            public static void m1884b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public c(Activity activity) {
            this.f2731a = activity;
        }

        @Override // p016c.C0546c.a
        /* renamed from: a */
        public final boolean mo1877a() {
            ActionBar actionBar = this.f2731a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // p016c.C0546c.a
        /* renamed from: b */
        public final Drawable mo1878b() {
            TypedArray obtainStyledAttributes = mo1881e().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // p016c.C0546c.a
        /* renamed from: c */
        public final void mo1879c(int i7) {
            ActionBar actionBar = this.f2731a.getActionBar();
            if (actionBar != null) {
                a.m1883a(actionBar, i7);
            }
        }

        @Override // p016c.C0546c.a
        /* renamed from: d */
        public final void mo1880d(C0906d c0906d, int i7) {
            ActionBar actionBar = this.f2731a.getActionBar();
            if (actionBar != null) {
                a.m1884b(actionBar, c0906d);
                a.m1883a(actionBar, i7);
            }
        }

        @Override // p016c.C0546c.a
        /* renamed from: e */
        public final Context mo1881e() {
            Activity activity = this.f2731a;
            ActionBar actionBar = activity.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : activity;
        }
    }

    /* renamed from: c.c$d */
    public static class d implements a {

        /* renamed from: a */
        public final Toolbar f2732a;

        /* renamed from: b */
        public final Drawable f2733b;

        /* renamed from: c */
        public final CharSequence f2734c;

        public d(Toolbar toolbar) {
            this.f2732a = toolbar;
            this.f2733b = toolbar.getNavigationIcon();
            this.f2734c = toolbar.getNavigationContentDescription();
        }

        @Override // p016c.C0546c.a
        /* renamed from: a */
        public final boolean mo1877a() {
            return true;
        }

        @Override // p016c.C0546c.a
        /* renamed from: b */
        public final Drawable mo1878b() {
            return this.f2733b;
        }

        @Override // p016c.C0546c.a
        /* renamed from: c */
        public final void mo1879c(int i7) {
            Toolbar toolbar = this.f2732a;
            if (i7 == 0) {
                toolbar.setNavigationContentDescription(this.f2734c);
            } else {
                toolbar.setNavigationContentDescription(i7);
            }
        }

        @Override // p016c.C0546c.a
        /* renamed from: d */
        public final void mo1880d(C0906d c0906d, int i7) {
            this.f2732a.setNavigationIcon(c0906d);
            mo1879c(i7);
        }

        @Override // p016c.C0546c.a
        /* renamed from: e */
        public final Context mo1881e() {
            return this.f2732a.getContext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0546c(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f2723a = new d(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0544b(this));
        } else if (activity instanceof b) {
            this.f2723a = ((b) activity).mo1882e();
        } else {
            this.f2723a = new c(activity);
        }
        this.f2724b = drawerLayout;
        this.f2728f = com.so.revelation.lua.R.string.app_name;
        this.f2729g = com.so.revelation.lua.R.string.app_name;
        this.f2725c = new C0906d(this.f2723a.mo1881e());
        this.f2723a.mo1878b();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
    /* renamed from: a */
    public final void mo1056a() {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
    /* renamed from: b */
    public final void mo1057b(float f7) {
        if (this.f2726d) {
            m1876e(Math.min(1.0f, Math.max(0.0f, f7)));
        } else {
            m1876e(0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1876e(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            e.d r1 = r2.f2725c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto L10
        La:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 0
        L10:
            r1.m2625a(r0)
        L13:
            float r0 = r1.f4767j
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L1e
            r1.f4767j = r3
            r1.invalidateSelf()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c.C0546c.m1876e(float):void");
    }
}
