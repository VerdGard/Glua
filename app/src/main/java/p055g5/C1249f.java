package p055g5;

import android.view.KeyEvent;
import java.util.Objects;
import p039e5.C1139a;

/* renamed from: g5.f */
/* loaded from: classes.dex */
public final class C1249f {

    /* renamed from: a */
    public final C1245b f6128a;

    /* renamed from: b */
    public final C1139a f6129b;

    public C1249f(C1245b c1245b) {
        Objects.requireNonNull(c1245b, "Cannot setup KeyEvent with null editor instance.");
        this.f6128a = c1245b;
        this.f6129b = new C1139a(c1245b);
    }

    /* renamed from: a */
    public final boolean m3519a(int i7, KeyEvent keyEvent) {
        C1139a c1139a = this.f6129b;
        if (c1139a.m3324b() || c1139a.m3323a() || keyEvent.isCtrlPressed()) {
            return (i7 >= 29 && i7 <= 54) || i7 == 66 || i7 == 19 || i7 == 20 || i7 == 21 || i7 == 22 || i7 == 122 || i7 == 123;
        }
        return false;
    }
}
