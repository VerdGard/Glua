package com.so.revelation.lua;

import android.content.DialogInterface;
import p129q1.AsyncTaskC1737m;
import p129q1.InterfaceC1738n;

/* renamed from: com.so.revelation.lua.a */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0720a implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ EditorActivity f3637c;

    /* renamed from: com.so.revelation.lua.a$a */
    public class a implements InterfaceC1738n {
        public a() {
        }
    }

    public DialogInterfaceOnClickListenerC0720a(EditorActivity editorActivity) {
        this.f3637c = editorActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        dialogInterface.cancel();
        if (i7 == -3) {
            dialogInterface.cancel();
            return;
        }
        EditorActivity editorActivity = this.f3637c;
        if (i7 == -2) {
            dialogInterface.cancel();
            editorActivity.finish();
        } else {
            if (i7 != -1) {
                return;
            }
            AsyncTaskC1737m asyncTaskC1737m = new AsyncTaskC1737m(editorActivity, new a());
            dialogInterface.dismiss();
            asyncTaskC1737m.execute(new Void[editorActivity.f3291Q1.m120e()]);
        }
    }
}
