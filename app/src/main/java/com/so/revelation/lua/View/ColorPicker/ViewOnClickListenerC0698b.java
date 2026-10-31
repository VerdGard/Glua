package com.so.revelation.lua.View.ColorPicker;

import android.view.View;
import com.so.revelation.lua.MainActivity;
import com.so.revelation.lua.View.ColorPicker.C0697a;

/* renamed from: com.so.revelation.lua.View.ColorPicker.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0698b implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ int f3454c;

    /* renamed from: e */
    public final /* synthetic */ C0697a.b f3455e;

    public ViewOnClickListenerC0698b(C0697a.b bVar, int i7) {
        this.f3455e = bVar;
        this.f3454c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0697a.b bVar = this.f3455e;
        C0697a c0697a = C0697a.this;
        int i7 = c0697a.f3447m;
        int i8 = this.f3454c;
        if (i7 != i8) {
            c0697a.f3447m = i8;
            c0697a.notifyDataSetChanged();
        }
        C0697a c0697a2 = C0697a.this;
        C0697a.a aVar = c0697a2.f3445c;
        int i9 = c0697a2.f3446e[i8];
        C0700d c0700d = C0700d.this;
        int i10 = c0700d.f3476z2;
        if (i10 == i9) {
            ((MainActivity.C0694d) C0700d.f3458Q2).m2198a(i10);
            c0700d.m1210O(false, false);
        } else {
            c0700d.f3476z2 = i9;
            if (c0700d.f3460B2) {
                c0700d.m2205R(i9);
            }
        }
    }
}
