package p201z3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public final class C2281b extends AbstractC2283d {

    /* renamed from: a */
    public final SideSheetBehavior<? extends View> f10447a;

    public C2281b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f10447a = sideSheetBehavior;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: a */
    public final int mo5526a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: b */
    public final float mo5527b(int i7) {
        float f7 = this.f10447a.f4368B1;
        return (f7 - i7) / (f7 - mo5529d());
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: c */
    public final int mo5528c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: d */
    public final int mo5529d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f10447a;
        return Math.max(0, (sideSheetBehavior.f4368B1 - sideSheetBehavior.f4367A1) - sideSheetBehavior.f4370D1);
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: e */
    public final int mo5530e() {
        return this.f10447a.f4368B1;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: f */
    public final int mo5531f() {
        return this.f10447a.f4368B1;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: g */
    public final int mo5532g() {
        return mo5529d();
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: h */
    public final <V extends View> int mo5533h(V v5) {
        return v5.getLeft() - this.f10447a.f4370D1;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: i */
    public final int mo5534i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: j */
    public final int mo5535j() {
        return 0;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: k */
    public final boolean mo5536k(float f7) {
        return f7 < 0.0f;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: l */
    public final boolean mo5537l(View view) {
        return view.getLeft() > (mo5529d() + this.f10447a.f4368B1) / 2;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: m */
    public final boolean mo5538m(float f7, float f8) {
        if (Math.abs(f7) > Math.abs(f8)) {
            float abs = Math.abs(f7);
            this.f10447a.getClass();
            if (abs > 500) {
                return true;
            }
        }
        return false;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: n */
    public final boolean mo5539n(View view, float f7) {
        return Math.abs((f7 * this.f10447a.f4389z1) + ((float) view.getRight())) > 0.5f;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: o */
    public final void mo5540o(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.rightMargin = i7;
    }

    @Override // p201z3.AbstractC2283d
    /* renamed from: p */
    public final void mo5541p(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8) {
        int i9 = this.f10447a.f4368B1;
        if (i7 <= i9) {
            marginLayoutParams.rightMargin = i9 - i7;
        }
    }
}
