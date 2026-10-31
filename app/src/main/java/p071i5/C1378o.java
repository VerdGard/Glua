package p071i5;

import android.content.Context;
import p032d6.C0898f;
import p055g5.C1245b;
import p132q4.C1777f;
import p132q4.C1787p;
import p147s3.C1882d;

/* renamed from: i5.o */
/* loaded from: classes.dex */
public final class C1378o implements InterfaceC1375l {

    /* renamed from: c */
    public final C1245b f6698c;

    /* renamed from: i5.o$a */
    public static class a {

        /* renamed from: a */
        public final Context f6699a;

        /* renamed from: b */
        public String f6700b;

        /* renamed from: c */
        public boolean f6701c;

        /* renamed from: d */
        public MenuItemOnMenuItemClickListenerC1377n f6702d;

        public a(Context context) {
            C0898f.m2606e(context, "context");
            this.f6699a = context;
            this.f6700b = "";
            this.f6701c = true;
        }

        /* renamed from: a */
        public final void m3739a(int i7) {
            String string = this.f6699a.getString(i7);
            C0898f.m2605d(string, "context.getString(value)");
            this.f6700b = string;
        }
    }

    public C1378o(C1245b c1245b) {
        C0898f.m2606e(c1245b, "editor");
        this.f6698c = c1245b;
        new C1787p(c1245b.f5988B1).m4248e(C1777f.class, new C1882d(4, this));
    }
}
