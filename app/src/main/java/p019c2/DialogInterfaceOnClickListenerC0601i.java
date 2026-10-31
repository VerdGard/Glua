package p019c2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.DialogInterfaceC0151d;

/* renamed from: c2.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0601i implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ String f2998c;

    /* renamed from: e */
    public final /* synthetic */ Activity f2999e;

    /* renamed from: m */
    public final /* synthetic */ C0602j f3000m;

    public DialogInterfaceOnClickListenerC0601i(C0602j c0602j, String str, Activity activity) {
        this.f3000m = c0602j;
        this.f2998c = str;
        this.f2999e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C0602j c0602j = this.f3000m;
        DialogInterfaceC0151d dialogInterfaceC0151d = c0602j.f3003b;
        if (dialogInterfaceC0151d != null) {
            dialogInterfaceC0151d.cancel();
            c0602j.f3003b = null;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.f2998c));
        Activity activity = this.f2999e;
        activity.startActivity(intent);
        activity.finish();
    }
}
