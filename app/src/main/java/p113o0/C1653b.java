package p113o0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0332p;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public final class C1653b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f7491a = new Object();

    /* renamed from: b */
    public static volatile C1653b f7492b;

    /* renamed from: c */
    public static Class<?> f7493c;

    @SuppressLint({"PrivateApi"})
    public C1653b() {
        try {
            f7493c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1653b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f7493c;
        return cls != null ? new C0332p(cls, charSequence) : super.newEditable(charSequence);
    }
}
