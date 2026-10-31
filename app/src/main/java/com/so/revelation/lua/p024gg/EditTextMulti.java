package com.so.revelation.lua.p024gg;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0243l;

/* loaded from: classes.dex */
public class EditTextMulti extends C0243l {
    public EditTextMulti(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setInputType(getInputType() | 262144);
        setHorizontallyScrolling(false);
        setMaxLines(Integer.MAX_VALUE);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z6) {
        super.setHorizontallyScrolling(false);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        super.setMaxLines(Integer.MAX_VALUE);
    }
}
