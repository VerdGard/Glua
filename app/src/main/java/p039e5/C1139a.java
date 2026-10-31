package p039e5;

import android.text.Editable;
import android.text.method.MetaKeyKeyListener;
import p055g5.C1245b;

/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C1139a extends MetaKeyKeyListener {

    /* renamed from: a */
    public final C1245b f5674a;

    /* renamed from: b */
    public final Editable f5675b = Editable.Factory.getInstance().newEditable("");

    /* renamed from: c */
    public boolean f5676c = false;

    public C1139a(C1245b c1245b) {
        this.f5674a = c1245b;
    }

    /* renamed from: a */
    public final boolean m3323a() {
        return MetaKeyKeyListener.getMetaState(this.f5675b, 2) != 0;
    }

    /* renamed from: b */
    public final boolean m3324b() {
        return MetaKeyKeyListener.getMetaState(this.f5675b, 1) != 0;
    }
}
