package com.so.revelation.lua.View.ColorPicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* loaded from: classes.dex */
public class NestedGridView extends GridView {
    public NestedGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
