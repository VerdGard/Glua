package p113o0;

import android.widget.EditText;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C1652a {

    /* renamed from: a */
    public final a f7488a;

    /* renamed from: o0.a$a */
    public static class a extends b {

        /* renamed from: a */
        public final EditText f7489a;

        /* renamed from: b */
        public final C1658g f7490b;

        public a(EditText editText) {
            this.f7489a = editText;
            C1658g c1658g = new C1658g(editText);
            this.f7490b = c1658g;
            editText.addTextChangedListener(c1658g);
            if (C1653b.f7492b == null) {
                synchronized (C1653b.f7491a) {
                    if (C1653b.f7492b == null) {
                        C1653b.f7492b = new C1653b();
                    }
                }
            }
            editText.setEditableFactory(C1653b.f7492b);
        }
    }

    /* renamed from: o0.a$b */
    public static class b {
    }

    public C1652a(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f7488a = new a(editText);
    }
}
