package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0159f;
import p025d.C0872a;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0159f.b, InterfaceC0164k, AdapterView.OnItemClickListener {

    /* renamed from: e */
    public static final int[] f391e = {android.R.attr.background, R.attr.divider};

    /* renamed from: c */
    public C0159f f392c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f391e, R.attr.listViewStyle, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C0872a.m2561a(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : C0872a.m2561a(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.C0159f.b
    /* renamed from: a */
    public final boolean mo495a(C0161h c0161h) {
        return this.f392c.m541q(c0161h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k
    /* renamed from: b */
    public final void mo496b(C0159f c0159f) {
        this.f392c = c0159f;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        mo495a((C0161h) getAdapter().getItem(i7));
    }
}
