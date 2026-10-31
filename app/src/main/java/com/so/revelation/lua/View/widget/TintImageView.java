package com.so.revelation.lua.View.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class TintImageView extends AppCompatImageView {

    /* renamed from: s */
    public ColorStateList f3588s;

    public TintImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor});
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            this.f3588s = colorStateList;
            if (colorStateList != null) {
                setColorFilter(colorStateList.getDefaultColor());
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void dispatchDrawableHotspotChanged(float f7, float f8) {
        super.dispatchDrawableHotspotChanged(f7, f8);
        clearColorFilter();
        setColorFilter(this.f3588s.getColorForState(getDrawableState(), this.f3588s.getDefaultColor()));
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
    }
}
