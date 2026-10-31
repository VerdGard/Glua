package p029d3;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p042f0.InterfaceC1155k;

/* renamed from: d3.f */
/* loaded from: classes.dex */
public final class C0887f implements InterfaceC1155k {

    /* renamed from: c */
    public final /* synthetic */ int f4666c;

    /* renamed from: e */
    public final /* synthetic */ BottomSheetBehavior f4667e;

    public C0887f(BottomSheetBehavior bottomSheetBehavior, int i7) {
        this.f4667e = bottomSheetBehavior;
        this.f4666c = i7;
    }

    @Override // p042f0.InterfaceC1155k
    /* renamed from: a */
    public final boolean mo1053a(View view) {
        this.f4667e.m2300I(this.f4666c);
        return true;
    }
}
