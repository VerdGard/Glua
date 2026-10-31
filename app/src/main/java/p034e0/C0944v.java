package p034e0;

import android.text.TextUtils;
import android.view.View;
import p034e0.C0946x;

/* renamed from: e0.v */
/* loaded from: classes.dex */
public final class C0944v extends C0946x.b<CharSequence> {
    public C0944v(int i7) {
        super(i7, CharSequence.class, 8, 28);
    }

    @Override // p034e0.C0946x.b
    /* renamed from: b */
    public final CharSequence mo2797b(View view) {
        return C0946x.l.m2914b(view);
    }

    @Override // p034e0.C0946x.b
    /* renamed from: c */
    public final void mo2798c(View view, CharSequence charSequence) {
        C0946x.l.m2920h(view, charSequence);
    }

    @Override // p034e0.C0946x.b
    /* renamed from: f */
    public final boolean mo2799f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
