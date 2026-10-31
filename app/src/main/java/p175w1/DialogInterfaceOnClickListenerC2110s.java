package p175w1;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: w1.s */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2110s implements DialogInterface.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C2113v f9572c;

    /* renamed from: e */
    public final /* synthetic */ EditText f9573e;

    /* renamed from: m */
    public final /* synthetic */ ViewOnClickListenerC2109r f9574m;

    public DialogInterfaceOnClickListenerC2110s(ViewOnClickListenerC2109r viewOnClickListenerC2109r, C2113v c2113v, EditText editText) {
        this.f9574m = viewOnClickListenerC2109r;
        this.f9572c = c2113v;
        this.f9573e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9574m.m5160b(this.f9572c, this.f9573e.getText().toString(), true);
    }
}
