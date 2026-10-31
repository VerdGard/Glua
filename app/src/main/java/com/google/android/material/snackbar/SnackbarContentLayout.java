package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p005a4.InterfaceC0049h;
import p034e0.C0923h0;
import p034e0.C0946x;
import p139r3.C1832j;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC0049h {

    /* renamed from: c */
    public TextView f4441c;

    /* renamed from: e */
    public Button f4442e;

    /* renamed from: m */
    public final TimeInterpolator f4443m;

    /* renamed from: s */
    public int f4444s;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4443m = C1832j.m4313d(context, R$attr.motionEasingEmphasizedInterpolator, C0034a.f109b);
    }

    /* renamed from: a */
    public final boolean m2499a(int i7, int i8, int i9) {
        boolean z6;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f4441c.getPaddingTop() == i8 && this.f4441c.getPaddingBottom() == i9) {
            return z6;
        }
        TextView textView = this.f4441c;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.e.m2850g(textView)) {
            C0946x.e.m2854k(textView, C0946x.e.m2849f(textView), i8, C0946x.e.m2848e(textView), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i8, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f4442e;
    }

    public TextView getMessageView() {
        return this.f4441c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4441c = (TextView) findViewById(R$id.snackbar_text);
        this.f4442e = (Button) findViewById(R$id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (m2499a(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (m2499a(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R$dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.R$dimen.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f4441c
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.f4444s
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.f4442e
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f4444s
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.m2499a(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.m2499a(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f4444s = i7;
    }
}
