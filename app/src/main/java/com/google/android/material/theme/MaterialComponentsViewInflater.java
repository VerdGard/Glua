package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0219d;
import androidx.appcompat.widget.C0225f;
import androidx.appcompat.widget.C0228g;
import androidx.appcompat.widget.C0265t;
import com.google.android.material.button.MaterialButton;
import p016c.C0568v;
import p021c4.C0633u;
import p030d4.C0889a;
import p061h3.C1297a;
import p155t3.C1925a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0568v {
    @Override // p016c.C0568v
    /* renamed from: a */
    public final C0219d mo1984a(Context context, AttributeSet attributeSet) {
        return new C0633u(context, attributeSet);
    }

    @Override // p016c.C0568v
    /* renamed from: b */
    public final C0225f mo1985b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p016c.C0568v
    /* renamed from: c */
    public final C0228g mo1986c(Context context, AttributeSet attributeSet) {
        return new C1297a(context, attributeSet);
    }

    @Override // p016c.C0568v
    /* renamed from: d */
    public final C0265t mo1987d(Context context, AttributeSet attributeSet) {
        return new C1925a(context, attributeSet);
    }

    @Override // p016c.C0568v
    /* renamed from: e */
    public final AppCompatTextView mo1988e(Context context, AttributeSet attributeSet) {
        return new C0889a(context, attributeSet);
    }
}
