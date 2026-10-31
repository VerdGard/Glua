package p051g1;

import android.ext.C0091c;
import android.util.Log;
import p002a1.C0020g;
import p010b1.C0522k;
import p010b1.InterfaceC0513b;
import p059h1.AbstractC1284b;

/* renamed from: g1.g */
/* loaded from: classes.dex */
public final class C1198g implements InterfaceC1193b {

    /* renamed from: a */
    public final int f5879a;

    public C1198g(String str, int i7) {
        this.f5879a = i7;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        if (c0020g.f50x1) {
            return new C0522k(this);
        }
        Log.w("LOTTIE", "Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + C0091c.m233k(this.f5879a) + '}';
    }
}
