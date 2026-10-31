package p044f2;

import android.content.Context;
import p060h2.EnumC1292a;
import p068i2.C1329a;
import p076j2.C1406c;
import p084k2.C1455e;
import p084k2.C1456f;
import p084k2.C1458h;
import p092l2.C1506a;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C1165b {

    /* renamed from: a */
    public final Context f5726a;

    /* renamed from: b */
    public C1329a f5727b;

    /* renamed from: c */
    public C1406c f5728c;

    /* renamed from: d */
    public C1456f f5729d;

    /* renamed from: e */
    public C1506a f5730e;

    /* renamed from: f */
    public C1506a f5731f;

    /* renamed from: g */
    public EnumC1292a f5732g;

    /* renamed from: h */
    public C1455e f5733h;

    public C1165b(Context context) {
        this.f5726a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C1164a m3361a() {
        if (this.f5730e == null) {
            this.f5730e = new C1506a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f5731f == null) {
            this.f5731f = new C1506a(1);
        }
        Context context = this.f5726a;
        C1458h c1458h = new C1458h(context);
        if (this.f5728c == null) {
            this.f5728c = new C1406c(c1458h.f6973a);
        }
        if (this.f5729d == null) {
            this.f5729d = new C1456f(c1458h.f6974b);
        }
        if (this.f5733h == null) {
            this.f5733h = new C1455e(context);
        }
        if (this.f5727b == null) {
            this.f5727b = new C1329a(this.f5729d, this.f5733h);
        }
        if (this.f5732g == null) {
            this.f5732g = EnumC1292a.f6431c;
        }
        return new C1164a(this.f5727b, this.f5729d, this.f5728c, this.f5726a, this.f5732g);
    }
}
