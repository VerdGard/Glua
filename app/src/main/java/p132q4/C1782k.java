package p132q4;

import android.view.KeyEvent;
import p055g5.C1245b;

/* renamed from: q4.k */
/* loaded from: classes.dex */
public class C1782k extends AbstractC1794w<Boolean> {

    /* renamed from: d */
    public final KeyEvent f8138d;

    /* renamed from: e */
    public final int f8139e;

    /* renamed from: f */
    public final boolean f8140f;

    /* renamed from: g */
    public final boolean f8141g;

    public C1782k(C1245b c1245b, KeyEvent keyEvent, int i7) {
        super(c1245b);
        this.f8138d = keyEvent;
        this.f8139e = i7;
        this.f8140f = this.f8145a.getKeyMetaStates().m3324b();
        this.f8141g = this.f8145a.getKeyMetaStates().m3323a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean m4243a(boolean z6) {
        T t7 = this.f8157c;
        boolean booleanValue = t7 != 0 ? ((Boolean) t7).booleanValue() : false;
        return this.f8146b != 0 ? booleanValue : booleanValue || z6;
    }
}
