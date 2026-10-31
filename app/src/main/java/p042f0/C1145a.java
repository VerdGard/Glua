package p042f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C1145a extends ClickableSpan {

    /* renamed from: c */
    public final int f5680c;

    /* renamed from: e */
    public final C1151g f5681e;

    /* renamed from: m */
    public final int f5682m;

    public C1145a(int i7, C1151g c1151g, int i8) {
        this.f5680c = i7;
        this.f5681e = c1151g;
        this.f5682m = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5680c);
        this.f5681e.f5685a.performAction(this.f5682m, bundle);
    }
}
