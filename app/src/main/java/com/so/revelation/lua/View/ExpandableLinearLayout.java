package com.so.revelation.lua.View;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.so.revelation.lua.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import p121p0.C1690b;

/* loaded from: classes.dex */
public class ExpandableLinearLayout extends LinearLayout {

    /* renamed from: c */
    public ArrayList f3489c;

    /* renamed from: e */
    public boolean f3490e;

    /* renamed from: com.so.revelation.lua.View.ExpandableLinearLayout$a */
    public static class C0701a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public final boolean f3491a;

        public C0701a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3394e);
            this.f3491a = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.so.revelation.lua.View.ExpandableLinearLayout$b */
    public interface InterfaceC0702b {
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3490e = false;
        new C1690b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f3394e);
            obtainStyledAttributes.getInt(0, 300);
            this.f3490e = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
        this.f3489c = new ArrayList();
        setOrientation(1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (((C0701a) layoutParams).f3491a) {
            this.f3489c.add(view);
            view.setVisibility(this.f3490e ? 0 : 8);
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0701a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        this.f3490e = bundle.getBoolean("expanded");
        Parcelable parcelable2 = bundle.getParcelable("super_state");
        Iterator it = this.f3489c.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(this.f3490e ? 0 : 8);
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f3490e);
        bundle.putParcelable("super_state", onSaveInstanceState);
        return bundle;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (((C0701a) view.getLayoutParams()).f3491a) {
            this.f3489c.remove(view);
        }
        super.removeView(view);
    }

    public void setOnExpansionUpdateListener(InterfaceC0702b interfaceC0702b) {
    }
}
