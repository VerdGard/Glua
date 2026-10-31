package p175w1;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: w1.p */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2106p implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ ViewOnClickListenerC2109r f9548c;

    /* renamed from: e */
    public final /* synthetic */ EditText f9549e;

    public DialogInterfaceOnClickListenerC2106p(ViewOnClickListenerC2109r viewOnClickListenerC2109r, EditText editText) {
        this.f9548c = viewOnClickListenerC2109r;
        this.f9549e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        String obj = this.f9548c.getItem(i7).toString();
        EditText editText = this.f9549e;
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        editText.getText().replace(Math.min(max, max2), Math.max(max, max2), obj, 0, obj.length());
        editText.setSelection(Math.max(editText.getSelectionStart(), editText.getSelectionEnd()));
    }
}
