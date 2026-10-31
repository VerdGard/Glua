package com.so.revelation.lua.View;

import android.content.Context;
import android.content.res.Configuration;
import android.ext.Tools;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.so.revelation.lua.R;
import com.so.revelation.lua.p024gg.InternalKeyboard;

/* loaded from: classes.dex */
public class KeyboardLayout extends LinearLayout {

    /* renamed from: c */
    public FrameLayout f3492c;

    /* renamed from: e */
    public InternalKeyboard f3493e;

    /* renamed from: m */
    public ScrollView f3494m;

    /* renamed from: s */
    public int f3495s;

    public KeyboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m2211a() {
        int i7 = Tools.getContext().getResources().getConfiguration().orientation;
        if (i7 != this.f3495s) {
            this.f3495s = i7;
            if (this.f3494m == null) {
                this.f3495s = 0;
                this.f3494m = (ScrollView) findViewById(R.id.kbd_scroll);
                this.f3492c = (FrameLayout) findViewById(R.id.kbd_frame);
                this.f3493e = (InternalKeyboard) findViewById(R.id.keyboard);
            }
            int[] iArr = {0, -1, -2};
            setOrientation(iArr[0]);
            ScrollView scrollView = this.f3494m;
            if (scrollView != null) {
                View view = scrollView.getVisibility() == 0 ? this.f3494m : this.f3492c;
                int i8 = iArr[1];
                int i9 = iArr[2];
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i8;
                layoutParams.height = i9;
                view.setLayoutParams(layoutParams);
            }
            InternalKeyboard internalKeyboard = this.f3493e;
            internalKeyboard.m2252f();
            internalKeyboard.m2250c();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m2211a();
    }
}
