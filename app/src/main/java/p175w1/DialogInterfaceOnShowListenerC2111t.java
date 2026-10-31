package p175w1;

import android.content.DialogInterface;
import android.ext.Tools;
import android.widget.EditText;

/* renamed from: w1.t */
/* loaded from: classes.dex */
public final class DialogInterfaceOnShowListenerC2111t implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9575a;

    public DialogInterfaceOnShowListenerC2111t(EditText editText) {
        this.f9575a = editText;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.f9575a;
        Tools.selectAll(editText);
        editText.requestFocus();
    }
}
