package p163u3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.AbstractC0136c;

/* renamed from: u3.e */
/* loaded from: classes.dex */
public final class C1974e extends AbstractC0136c {

    /* renamed from: X */
    public final /* synthetic */ C1973d f8844X;

    /* renamed from: e */
    public final /* synthetic */ Context f8845e;

    /* renamed from: m */
    public final /* synthetic */ TextPaint f8846m;

    /* renamed from: s */
    public final /* synthetic */ AbstractC0136c f8847s;

    public C1974e(C1973d c1973d, Context context, TextPaint textPaint, AbstractC0136c abstractC0136c) {
        this.f8844X = c1973d;
        this.f8845e = context;
        this.f8846m = textPaint;
        this.f8847s = abstractC0136c;
    }

    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: u */
    public final void mo392u(int i7) {
        this.f8847s.mo392u(i7);
    }

    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: v */
    public final void mo393v(Typeface typeface, boolean z6) {
        this.f8844X.m4595g(this.f8845e, this.f8846m, typeface);
        this.f8847s.mo393v(typeface, z6);
    }
}
