package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.C0277z;
import p057h.InterfaceC1272f;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public final class C0275y extends AbstractViewOnTouchListenerC0253o0 {

    /* renamed from: y1 */
    public final /* synthetic */ C0277z.g f1123y1;

    /* renamed from: z1 */
    public final /* synthetic */ C0277z f1124z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275y(C0277z c0277z, View view, C0277z.g gVar) {
        super(view);
        this.f1124z1 = c0277z;
        this.f1123y1 = gVar;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
    /* renamed from: b */
    public final InterfaceC1272f mo493b() {
        return this.f1123y1;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0253o0
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public final boolean mo494c() {
        C0277z c0277z = this.f1124z1;
        if (c0277z.getInternalPopup().mo917c()) {
            return true;
        }
        c0277z.f1131x1.mo925m(C0277z.c.m913b(c0277z), C0277z.c.m912a(c0277z));
        return true;
    }
}
