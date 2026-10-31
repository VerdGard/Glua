package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import p025d.C0872a;
import p066i0.C1313g;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
public final class C0261r extends PopupWindow {
    public C0261r(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f292t, i7, i8);
        int i9 = R$styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i9)) {
            C1313g.m3645a(this, obtainStyledAttributes.getBoolean(i9, false));
        }
        int i10 = R$styleable.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(i10) || (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) == 0) ? obtainStyledAttributes.getDrawable(i10) : C0872a.m2561a(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i7, int i8) {
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i7, int i8, int i9) {
        super.showAsDropDown(view, i7, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i7, int i8, int i9, int i10) {
        super.update(view, i7, i8, i9, i10);
    }
}
