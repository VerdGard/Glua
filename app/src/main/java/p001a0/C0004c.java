package p001a0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import p032d6.C0898f;

/* renamed from: a0.c */
/* loaded from: classes.dex */
public final class C0004c {
    /* renamed from: a */
    public static final void m3a(Bundle bundle, String str, Size size) {
        C0898f.m2606e(bundle, "bundle");
        C0898f.m2606e(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m4b(Bundle bundle, String str, SizeF sizeF) {
        C0898f.m2606e(bundle, "bundle");
        C0898f.m2606e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
